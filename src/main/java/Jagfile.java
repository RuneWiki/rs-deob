import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Jagfile {

    @OriginalMember(owner = "xb", name = "a", descriptor = "Z")
    private boolean field872 = false;

    @OriginalMember(owner = "xb", name = "b", descriptor = "Z")
    private boolean field873 = true;

    @OriginalMember(owner = "xb", name = "d", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "xb", name = "i", descriptor = "Z")
    private boolean field880;

    @OriginalMember(owner = "xb", name = "c", descriptor = "[B")
    public byte[] field874;

    @OriginalMember(owner = "xb", name = "e", descriptor = "[I")
    public int[] field876;

    @OriginalMember(owner = "xb", name = "f", descriptor = "[I")
    public int[] field877;

    @OriginalMember(owner = "xb", name = "g", descriptor = "[I")
    public int[] field878;

    @OriginalMember(owner = "xb", name = "h", descriptor = "[I")
    public int[] field879;

    @OriginalMember(owner = "xb", name = "<init>", descriptor = "(I[B)V")
    public Jagfile(int arg0, byte[] arg1) {
        if (arg0 != 20025) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.method298(arg1, -40537);
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "([BI)V")
    private void method298(byte[] arg0, int arg1) {
        Packet var3 = new Packet(arg0, -26728);
        int var4 = var3.method233();
        int var5 = var3.method233();
        if (var4 == var5) {
            this.field874 = arg0;
            this.field880 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method261(var6, var4, arg0, var5, 6);
            this.field874 = var6;
            var3 = new Packet(this.field874, -26728);
            this.field880 = true;
        }
        this.field875 = var3.method231();
        if (arg1 != -40537) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.field876 = new int[this.field875];
        this.field877 = new int[this.field875];
        this.field878 = new int[this.field875];
        this.field879 = new int[this.field875];
        int var8 = this.field875 * 10 + var3.field717;
        for (int var9 = 0; var9 < this.field875; var9++) {
            this.field876[var9] = var3.method234();
            this.field877[var9] = var3.method233();
            this.field878[var9] = var3.method233();
            this.field879[var9] = var8;
            var8 += this.field878[var9];
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method299(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field875; var6++) {
            if (this.field876[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field877[var6]];
                }
                if (this.field880) {
                    for (int var7 = 0; var7 < this.field877[var6]; var7++) {
                        arg1[var7] = this.field874[this.field879[var6] + var7];
                    }
                } else {
                    BZip2.method261(arg1, this.field877[var6], this.field874, this.field878[var6], this.field879[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
