import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ub")
public class Jagfile {

    @OriginalMember(owner = "ub", name = "a", descriptor = "B")
    private byte field732 = 0;

    @OriginalMember(owner = "ub", name = "b", descriptor = "I")
    private int field733 = -12745;

    @OriginalMember(owner = "ub", name = "c", descriptor = "Z")
    private boolean field734 = true;

    @OriginalMember(owner = "ub", name = "e", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "ub", name = "j", descriptor = "Z")
    private boolean field741;

    @OriginalMember(owner = "ub", name = "d", descriptor = "[B")
    public byte[] field735;

    @OriginalMember(owner = "ub", name = "f", descriptor = "[I")
    public int[] field737;

    @OriginalMember(owner = "ub", name = "g", descriptor = "[I")
    public int[] field738;

    @OriginalMember(owner = "ub", name = "h", descriptor = "[I")
    public int[] field739;

    @OriginalMember(owner = "ub", name = "i", descriptor = "[I")
    public int[] field740;

    @OriginalMember(owner = "ub", name = "<init>", descriptor = "(Z[B)V")
    public Jagfile(boolean arg0, byte[] arg1) {
        this.method249(927, arg1);
        if (!arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(I[B)V")
    private void method249(int arg0, byte[] arg1) {
        Packet var3 = new Packet(0, arg1);
        int var4 = 62 / arg0;
        int var5 = var3.method213();
        int var6 = var3.method213();
        if (var5 == var6) {
            this.field735 = arg1;
            this.field741 = false;
        } else {
            byte[] var7 = new byte[var5];
            BZip2.method238(var7, var5, arg1, var6, 6);
            this.field735 = var7;
            var3 = new Packet(0, this.field735);
            this.field741 = true;
        }
        this.field736 = var3.method211();
        this.field737 = new int[this.field736];
        this.field738 = new int[this.field736];
        this.field739 = new int[this.field736];
        this.field740 = new int[this.field736];
        int var8 = this.field736 * 10 + var3.field621;
        for (int var9 = 0; var9 < this.field736; var9++) {
            this.field737[var9] = var3.method214();
            this.field738[var9] = var3.method213();
            this.field739[var9] = var3.method213();
            this.field740[var9] = var8;
            var8 += this.field739[var9];
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Ljava/lang/String;[BI)[B")
    public byte[] method250(String arg0, byte[] arg1, int arg2) {
        int var4 = 0;
        String var5 = arg0.toUpperCase();
        for (int var6 = 0; var6 < var5.length(); var6++) {
            var4 = var4 * 61 + var5.charAt(var6) - 32;
        }
        for (int var7 = 0; var7 < this.field736; var7++) {
            if (this.field737[var7] == var4) {
                if (arg1 == null) {
                    arg1 = new byte[this.field738[var7]];
                }
                if (this.field741) {
                    for (int var8 = 0; var8 < this.field738[var7]; var8++) {
                        arg1[var8] = this.field735[this.field740[var7] + var8];
                    }
                } else {
                    BZip2.method238(arg1, this.field738[var7], this.field735, this.field739[var7], this.field740[var7]);
                }
                return arg1;
            }
        }
        if (arg2 != 8) {
            throw new NullPointerException();
        }
        return null;
    }
}
