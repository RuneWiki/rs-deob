import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ub")
public class Jagfile {

    @OriginalMember(owner = "ub", name = "a", descriptor = "I")
    private int field732 = 17060;

    @OriginalMember(owner = "ub", name = "b", descriptor = "Z")
    private boolean field733 = false;

    @OriginalMember(owner = "ub", name = "c", descriptor = "Z")
    private boolean field734 = false;

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

    @OriginalMember(owner = "ub", name = "<init>", descriptor = "(I[B)V")
    public Jagfile(int arg0, byte[] arg1) {
        this.method256(arg1, -240);
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "([BI)V")
    private void method256(byte[] arg0, int arg1) {
        Packet var3 = new Packet((byte) 64, arg0);
        int var4 = var3.method220();
        int var5 = var3.method220();
        if (var4 == var5) {
            this.field735 = arg0;
            this.field741 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method245(var6, var4, arg0, var5, 6);
            this.field735 = var6;
            var3 = new Packet((byte) 64, this.field735);
            this.field741 = true;
        }
        this.field736 = var3.method218();
        if (arg1 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.field737 = new int[this.field736];
        this.field738 = new int[this.field736];
        this.field739 = new int[this.field736];
        this.field740 = new int[this.field736];
        int var8 = this.field736 * 10 + var3.field624;
        for (int var9 = 0; var9 < this.field736; var9++) {
            this.field737[var9] = var3.method221();
            this.field738[var9] = var3.method220();
            this.field739[var9] = var3.method220();
            this.field740[var9] = var8;
            var8 += this.field739[var9];
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "([BLjava/lang/String;I)[B")
    public byte[] method257(byte[] arg0, String arg1, int arg2) {
        int var4 = 0;
        String var5 = arg1.toUpperCase();
        if (arg2 != -31149) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < var5.length(); var7++) {
            var4 = var4 * 61 + var5.charAt(var7) - 32;
        }
        for (int var8 = 0; var8 < this.field736; var8++) {
            if (this.field737[var8] == var4) {
                if (arg0 == null) {
                    arg0 = new byte[this.field738[var8]];
                }
                if (this.field741) {
                    for (int var9 = 0; var9 < this.field738[var8]; var9++) {
                        arg0[var9] = this.field735[this.field740[var8] + var9];
                    }
                } else {
                    BZip2.method245(arg0, this.field738[var8], this.field735, this.field739[var8], this.field740[var8]);
                }
                return arg0;
            }
        }
        return null;
    }
}
