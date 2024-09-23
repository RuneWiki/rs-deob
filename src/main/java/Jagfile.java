import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Jagfile {

    @OriginalMember(owner = "xb", name = "a", descriptor = "I")
    private int field856 = 1000;

    @OriginalMember(owner = "xb", name = "c", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "xb", name = "h", descriptor = "Z")
    private boolean field863;

    @OriginalMember(owner = "xb", name = "b", descriptor = "[B")
    public byte[] field857;

    @OriginalMember(owner = "xb", name = "d", descriptor = "[I")
    public int[] field859;

    @OriginalMember(owner = "xb", name = "e", descriptor = "[I")
    public int[] field860;

    @OriginalMember(owner = "xb", name = "f", descriptor = "[I")
    public int[] field861;

    @OriginalMember(owner = "xb", name = "g", descriptor = "[I")
    public int[] field862;

    @OriginalMember(owner = "xb", name = "<init>", descriptor = "([BI)V")
    public Jagfile(byte[] arg0, int arg1) {
        if (arg1 != -41647) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.method298(arg0, (byte) 7);
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "([BB)V")
    private void method298(byte[] arg0, byte arg1) {
        Packet var3 = new Packet(this.field856, arg0);
        int var4 = var3.method233();
        int var5 = var3.method233();
        if (var4 == var5) {
            this.field857 = arg0;
            this.field863 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method261(var6, var4, arg0, var5, 6);
            this.field857 = var6;
            var3 = new Packet(this.field856, this.field857);
            this.field863 = true;
        }
        this.field858 = var3.method231();
        this.field859 = new int[this.field858];
        if (arg1 != 7) {
            return;
        }
        boolean var7 = false;
        this.field860 = new int[this.field858];
        this.field861 = new int[this.field858];
        this.field862 = new int[this.field858];
        int var8 = this.field858 * 10 + var3.field703;
        for (int var9 = 0; var9 < this.field858; var9++) {
            this.field859[var9] = var3.method234();
            this.field860[var9] = var3.method233();
            this.field861[var9] = var3.method233();
            this.field862[var9] = var8;
            var8 += this.field861[var9];
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method299(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field858; var6++) {
            if (this.field859[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field860[var6]];
                }
                if (this.field863) {
                    for (int var7 = 0; var7 < this.field860[var6]; var7++) {
                        arg1[var7] = this.field857[this.field862[var6] + var7];
                    }
                } else {
                    BZip2.method261(arg1, this.field860[var6], this.field857, this.field861[var6], this.field862[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
