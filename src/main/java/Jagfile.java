import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Jagfile {

    @OriginalMember(owner = "xb", name = "a", descriptor = "I")
    private int field867 = 315;

    @OriginalMember(owner = "xb", name = "b", descriptor = "I")
    private int field868 = -50;

    @OriginalMember(owner = "xb", name = "c", descriptor = "Z")
    private boolean field869 = false;

    @OriginalMember(owner = "xb", name = "e", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "xb", name = "j", descriptor = "Z")
    private boolean field876;

    @OriginalMember(owner = "xb", name = "d", descriptor = "[B")
    public byte[] field870;

    @OriginalMember(owner = "xb", name = "f", descriptor = "[I")
    public int[] field872;

    @OriginalMember(owner = "xb", name = "g", descriptor = "[I")
    public int[] field873;

    @OriginalMember(owner = "xb", name = "h", descriptor = "[I")
    public int[] field874;

    @OriginalMember(owner = "xb", name = "i", descriptor = "[I")
    public int[] field875;

    @OriginalMember(owner = "xb", name = "<init>", descriptor = "([BZ)V")
    public Jagfile(byte[] arg0, boolean arg1) {
        if (arg1) {
            this.field869 = !this.field869;
        }
        this.method298(arg0, 0);
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "([BI)V")
    private void method298(byte[] arg0, int arg1) {
        Packet var3 = new Packet(false, arg0);
        int var4 = var3.method233();
        int var5 = var3.method233();
        if (var4 == var5) {
            this.field870 = arg0;
            this.field876 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method261(var6, var4, arg0, var5, 6);
            this.field870 = var6;
            var3 = new Packet(false, this.field870);
            this.field876 = true;
        }
        this.field871 = var3.method231();
        this.field872 = new int[this.field871];
        this.field873 = new int[this.field871];
        this.field874 = new int[this.field871];
        this.field875 = new int[this.field871];
        if (arg1 != 0) {
            return;
        }
        int var7 = this.field871 * 10 + var3.field716;
        for (int var8 = 0; var8 < this.field871; var8++) {
            this.field872[var8] = var3.method234();
            this.field873[var8] = var3.method233();
            this.field874[var8] = var3.method233();
            this.field875[var8] = var7;
            var7 += this.field874[var8];
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method299(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field871; var6++) {
            if (this.field872[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field873[var6]];
                }
                if (this.field876) {
                    for (int var7 = 0; var7 < this.field873[var6]; var7++) {
                        arg1[var7] = this.field870[this.field875[var6] + var7];
                    }
                } else {
                    BZip2.method261(arg1, this.field873[var6], this.field870, this.field874[var6], this.field875[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
