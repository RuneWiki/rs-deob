import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ub")
public class Jagfile {

    @OriginalMember(owner = "ub", name = "a", descriptor = "I")
    private int field731 = 265;

    @OriginalMember(owner = "ub", name = "b", descriptor = "Z")
    private boolean field732 = true;

    @OriginalMember(owner = "ub", name = "c", descriptor = "I")
    private int field733 = 32137;

    @OriginalMember(owner = "ub", name = "d", descriptor = "Z")
    private boolean field734 = true;

    @OriginalMember(owner = "ub", name = "f", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "ub", name = "k", descriptor = "Z")
    private boolean field741;

    @OriginalMember(owner = "ub", name = "e", descriptor = "[B")
    public byte[] field735;

    @OriginalMember(owner = "ub", name = "g", descriptor = "[I")
    public int[] field737;

    @OriginalMember(owner = "ub", name = "h", descriptor = "[I")
    public int[] field738;

    @OriginalMember(owner = "ub", name = "i", descriptor = "[I")
    public int[] field739;

    @OriginalMember(owner = "ub", name = "j", descriptor = "[I")
    public int[] field740;

    @OriginalMember(owner = "ub", name = "<init>", descriptor = "([BI)V")
    public Jagfile(byte[] arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        this.method248(arg0, 422);
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "([BI)V")
    private void method248(byte[] arg0, int arg1) {
        Packet var3 = new Packet(arg0, this.field734);
        int var4 = var3.method212();
        int var5 = 78 / arg1;
        int var6 = var3.method212();
        if (var4 == var6) {
            this.field735 = arg0;
            this.field741 = false;
        } else {
            byte[] var7 = new byte[var4];
            BZip2.method237(var7, var4, arg0, var6, 6);
            this.field735 = var7;
            var3 = new Packet(this.field735, this.field734);
            this.field741 = true;
        }
        this.field736 = var3.method210();
        this.field737 = new int[this.field736];
        this.field738 = new int[this.field736];
        this.field739 = new int[this.field736];
        this.field740 = new int[this.field736];
        int var8 = this.field736 * 10 + var3.field622;
        for (int var9 = 0; var9 < this.field736; var9++) {
            this.field737[var9] = var3.method213();
            this.field738[var9] = var3.method212();
            this.field739[var9] = var3.method212();
            this.field740[var9] = var8;
            var8 += this.field739[var9];
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Ljava/lang/String;Z[B)[B")
    public byte[] method249(String arg0, boolean arg1, byte[] arg2) {
        int var4 = 0;
        String var5 = arg0.toUpperCase();
        for (int var6 = 0; var6 < var5.length(); var6++) {
            var4 = var4 * 61 + var5.charAt(var6) - 32;
        }
        if (!arg1) {
            throw new NullPointerException();
        }
        for (int var7 = 0; var7 < this.field736; var7++) {
            if (this.field737[var7] == var4) {
                if (arg2 == null) {
                    arg2 = new byte[this.field738[var7]];
                }
                if (this.field741) {
                    for (int var8 = 0; var8 < this.field738[var7]; var8++) {
                        arg2[var8] = this.field735[this.field740[var7] + var8];
                    }
                } else {
                    BZip2.method237(arg2, this.field738[var7], this.field735, this.field739[var7], this.field740[var7]);
                }
                return arg2;
            }
        }
        return null;
    }
}
