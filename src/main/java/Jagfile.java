import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ub")
public class Jagfile {

    @OriginalMember(owner = "ub", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = false;

    @OriginalMember(owner = "ub", name = "b", descriptor = "B")
    private byte _flowObfuscator2 = 2;

    @OriginalMember(owner = "ub", name = "c", descriptor = "I")
    private int _flowObfuscator3 = 40267;

    @OriginalMember(owner = "ub", name = "d", descriptor = "Z")
    private boolean _flowObfuscator4 = false;

    @OriginalMember(owner = "ub", name = "f", descriptor = "I")
    public int fileCount;

    @OriginalMember(owner = "ub", name = "k", descriptor = "Z")
    private boolean unpacked;

    @OriginalMember(owner = "ub", name = "e", descriptor = "[B")
    public byte[] buffer;

    @OriginalMember(owner = "ub", name = "g", descriptor = "[I")
    public int[] fileHash;

    @OriginalMember(owner = "ub", name = "i", descriptor = "[I")
    public int[] filePackedSize;

    @OriginalMember(owner = "ub", name = "j", descriptor = "[I")
    public int[] filePos;

    @OriginalMember(owner = "ub", name = "h", descriptor = "[I")
    public int[] fileUnpackedSize;

    @OriginalMember(owner = "ub", name = "<init>", descriptor = "([BZ)V")
    public Jagfile(byte[] arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.load(true, arg0);
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Z[B)V")
    private void load(boolean arg0, byte[] arg1) {
        Packet var3 = new Packet(363, arg1);
        int var4 = var3.method220();
        int var5 = var3.method220();
        if (var4 == var5) {
            this.buffer = arg1;
            this.unpacked = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.read(var6, var4, arg1, var5, 6);
            this.buffer = var6;
            var3 = new Packet(363, this.buffer);
            this.unpacked = true;
        }
        this.fileCount = var3.method218();
        this.fileHash = new int[this.fileCount];
        this.fileUnpackedSize = new int[this.fileCount];
        this.filePackedSize = new int[this.fileCount];
        this.filePos = new int[this.fileCount];
        if (!arg0) {
            return;
        }
        int var7 = this.fileCount * 10 + var3.field622;
        for (int var8 = 0; var8 < this.fileCount; var8++) {
            this.fileHash[var8] = var3.method221();
            this.fileUnpackedSize[var8] = var3.method220();
            this.filePackedSize[var8] = var3.method220();
            this.filePos[var8] = var7;
            var7 += this.filePackedSize[var8];
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Ljava/lang/String;[BB)[B")
    public byte[] read(String arg0, byte[] arg1, byte arg2) {
        int var4 = 0;
        String var5 = arg0.toUpperCase();
        for (int var6 = 0; var6 < var5.length(); var6++) {
            var4 = var4 * 61 + var5.charAt(var6) - 32;
        }
        for (int var7 = 0; var7 < this.fileCount; var7++) {
            if (this.fileHash[var7] == var4) {
                if (arg1 == null) {
                    arg1 = new byte[this.fileUnpackedSize[var7]];
                }
                if (this.unpacked) {
                    for (int var8 = 0; var8 < this.fileUnpackedSize[var7]; var8++) {
                        arg1[var8] = this.buffer[this.filePos[var7] + var8];
                    }
                } else {
                    BZip2.read(arg1, this.fileUnpackedSize[var7], this.buffer, this.filePackedSize[var7], this.filePos[var7]);
                }
                return arg1;
            }
        }
        if (this._flowObfuscator2 != arg2) {
            throw new NullPointerException();
        }
        return null;
    }
}
