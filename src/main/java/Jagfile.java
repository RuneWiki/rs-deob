import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class Jagfile {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Z")
    private boolean field733 = false;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "B")
    private byte field734 = 2;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    private int field735 = 40267;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Z")
    private boolean field736 = false;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Z")
    private boolean field743;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[B")
    public byte[] field737;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
    public int[] field739;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
    public int[] field740;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
    public int[] field741;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "[I")
    public int[] field742;

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([BZ)V")
    public Jagfile(byte[] arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.method256(true, arg0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z[B)V")
    private void method256(boolean arg0, byte[] arg1) {
        Packet var3 = new Packet(363, arg1);
        int var4 = var3.method220();
        int var5 = var3.method220();
        if (var4 == var5) {
            this.field737 = arg1;
            this.field743 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method245(var6, var4, arg1, var5, 6);
            this.field737 = var6;
            var3 = new Packet(363, this.field737);
            this.field743 = true;
        }
        this.field738 = var3.method218();
        this.field739 = new int[this.field738];
        this.field740 = new int[this.field738];
        this.field741 = new int[this.field738];
        this.field742 = new int[this.field738];
        if (!arg0) {
            return;
        }
        int var7 = this.field738 * 10 + var3.field622;
        for (int var8 = 0; var8 < this.field738; var8++) {
            this.field739[var8] = var3.method221();
            this.field740[var8] = var3.method220();
            this.field741[var8] = var3.method220();
            this.field742[var8] = var7;
            var7 += this.field741[var8];
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;[BB)[B")
    public byte[] method257(String arg0, byte[] arg1, byte arg2) {
        int var4 = 0;
        String var5 = arg0.toUpperCase();
        for (int var6 = 0; var6 < var5.length(); var6++) {
            var4 = var4 * 61 + var5.charAt(var6) - 32;
        }
        for (int var7 = 0; var7 < this.field738; var7++) {
            if (this.field739[var7] == var4) {
                if (arg1 == null) {
                    arg1 = new byte[this.field740[var7]];
                }
                if (this.field743) {
                    for (int var8 = 0; var8 < this.field740[var7]; var8++) {
                        arg1[var8] = this.field737[this.field742[var7] + var8];
                    }
                } else {
                    BZip2.method245(arg1, this.field740[var7], this.field737, this.field741[var7], this.field742[var7]);
                }
                return arg1;
            }
        }
        if (this.field734 != arg2) {
            throw new NullPointerException();
        }
        return null;
    }
}
