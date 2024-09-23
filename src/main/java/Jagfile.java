import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Jagfile {

    @OriginalMember(owner = "xb", name = "b", descriptor = "I")
    private int field863 = 4858;

    @OriginalMember(owner = "xb", name = "c", descriptor = "Z")
    private boolean field864 = false;

    @OriginalMember(owner = "xb", name = "d", descriptor = "I")
    private int field865;

    @OriginalMember(owner = "xb", name = "a", descriptor = "I")
    private int field862;

    @OriginalMember(owner = "xb", name = "f", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "xb", name = "k", descriptor = "Z")
    private boolean field872;

    @OriginalMember(owner = "xb", name = "e", descriptor = "[B")
    public byte[] field866;

    @OriginalMember(owner = "xb", name = "g", descriptor = "[I")
    public int[] field868;

    @OriginalMember(owner = "xb", name = "h", descriptor = "[I")
    public int[] field869;

    @OriginalMember(owner = "xb", name = "i", descriptor = "[I")
    public int[] field870;

    @OriginalMember(owner = "xb", name = "j", descriptor = "[I")
    public int[] field871;

    @OriginalMember(owner = "xb", name = "<init>", descriptor = "([BI)V")
    public Jagfile(byte[] arg0, int arg1) {
        if (arg1 != 44340) {
            this.field865 = -453;
        }
        this.method298(arg0, 0);
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "([BI)V")
    private void method298(byte[] arg0, int arg1) {
        Packet var3 = new Packet(arg0, this.field864);
        int var4 = var3.method233();
        int var5 = var3.method233();
        if (arg1 != 0) {
            this.field862 = 301;
        }
        if (var4 == var5) {
            this.field866 = arg0;
            this.field872 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method261(var6, var4, arg0, var5, 6);
            this.field866 = var6;
            var3 = new Packet(this.field866, this.field864);
            this.field872 = true;
        }
        this.field867 = var3.method231();
        this.field868 = new int[this.field867];
        this.field869 = new int[this.field867];
        this.field870 = new int[this.field867];
        this.field871 = new int[this.field867];
        int var7 = this.field867 * 10 + var3.field712;
        for (int var8 = 0; var8 < this.field867; var8++) {
            this.field868[var8] = var3.method234();
            this.field869[var8] = var3.method233();
            this.field870[var8] = var3.method233();
            this.field871[var8] = var7;
            var7 += this.field870[var8];
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method299(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field867; var6++) {
            if (this.field868[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field869[var6]];
                }
                if (this.field872) {
                    for (int var7 = 0; var7 < this.field869[var6]; var7++) {
                        arg1[var7] = this.field866[this.field871[var6] + var7];
                    }
                } else {
                    BZip2.method261(arg1, this.field869[var6], this.field866, this.field870[var6], this.field871[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
