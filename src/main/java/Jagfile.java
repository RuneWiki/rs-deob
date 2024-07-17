import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XTGLDHGX")
public class Jagfile {

    @OriginalMember(owner = "XTGLDHGX", name = "a", descriptor = "B")
    private byte _flowObfuscator1 = 0;

    @OriginalMember(owner = "XTGLDHGX", name = "b", descriptor = "I")
    private int _flowObfuscator2 = 9;

    @OriginalMember(owner = "XTGLDHGX", name = "c", descriptor = "I")
    private int _flowObfuscator3 = -29508;

    @OriginalMember(owner = "XTGLDHGX", name = "e", descriptor = "I")
    public int fileCount;

    @OriginalMember(owner = "XTGLDHGX", name = "j", descriptor = "Z")
    private boolean unpacked;

    @OriginalMember(owner = "XTGLDHGX", name = "d", descriptor = "[B")
    public byte[] data;

    @OriginalMember(owner = "XTGLDHGX", name = "f", descriptor = "[I")
    public int[] fileHash;

    @OriginalMember(owner = "XTGLDHGX", name = "i", descriptor = "[I")
    public int[] fileOffset;

    @OriginalMember(owner = "XTGLDHGX", name = "h", descriptor = "[I")
    public int[] filePackedSize;

    @OriginalMember(owner = "XTGLDHGX", name = "g", descriptor = "[I")
    public int[] fileUnpackedSize;

    @OriginalMember(owner = "XTGLDHGX", name = "<init>", descriptor = "(I[B)V")
    public Jagfile(int arg0, byte[] arg1) {
        if (arg0 != 44820) {
            throw new NullPointerException();
        }
        this.unpack(arg1, this._flowObfuscator1);
    }

    @OriginalMember(owner = "XTGLDHGX", name = "a", descriptor = "([BB)V")
    private void unpack(byte[] arg0, byte arg1) {
        Packet var3 = new Packet(arg0, 891);
        int var4 = var3.g3();
        int var5 = var3.g3();
        if (var4 == var5) {
            this.data = arg0;
            this.unpacked = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.read(var6, var4, arg0, var5, 6);
            this.data = var6;
            var3 = new Packet(this.data, 891);
            this.unpacked = true;
        }
        this.fileCount = var3.g2();
        if (arg1 != 0) {
            return;
        }
        this.fileHash = new int[this.fileCount];
        this.fileUnpackedSize = new int[this.fileCount];
        this.filePackedSize = new int[this.fileCount];
        this.fileOffset = new int[this.fileCount];
        int var7 = this.fileCount * 10 + var3.pos;
        for (int var8 = 0; var8 < this.fileCount; var8++) {
            this.fileHash[var8] = var3.g4();
            this.fileUnpackedSize[var8] = var3.g3();
            this.filePackedSize[var8] = var3.g3();
            this.fileOffset[var8] = var7;
            var7 += this.filePackedSize[var8];
        }
    }

    @OriginalMember(owner = "XTGLDHGX", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] read(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.fileCount; var6++) {
            if (this.fileHash[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.fileUnpackedSize[var6]];
                }
                if (this.unpacked) {
                    for (int var7 = 0; var7 < this.fileUnpackedSize[var6]; var7++) {
                        arg1[var7] = this.data[this.fileOffset[var6] + var7];
                    }
                } else {
                    BZip2.read(arg1, this.fileUnpackedSize[var6], this.data, this.filePackedSize[var6], this.fileOffset[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
