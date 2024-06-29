import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class73 implements class160 {

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lga;")
    private class332 field871;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lga;")
    public class332 field872;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lmga;")
    public class689 field873;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "[I")
    public static int[] field874 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    private int field868;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "J")
    private long field865;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lla;")
    private class409 field864;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Ljava/awt/Font;")
    public static Font field863;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 5)
    public static void method399(int arg0) {
        if (arg0 != -22928) {
            method399(-70);
        }
        field863 = null;
        field874 = null;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)I", line = 16)
    public final int method400(int arg0) {
        field866++;
        int var2 = class540.field7407.method2869(false);
        if (arg0 != 2) {
            this.method401((byte) 54, false, -92, -41);
        }
        int var3 = var2 * 100;
        if (this.field868 == var2 && var2 != 0) {
            int var4 = class540.field7407.method2861(true);
            if (var4 > var2) {
                long var5 = this.field865 - class540.field7407.method2857((byte) 40);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class529.method2982((byte) -69) - this.field865) * 10000L;
                    if (var9 < var7) {
                        var3 = (int) ((long) (var4 - var2) * 100L * var9 / var7 + (long) (var2 * 100));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field868 = var2;
            this.field865 = class529.method2982((byte) -69);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 69)
    public void method402(int arg0) {
        field869++;
        class658 var2 = class77.method422(this.field871, this.field873.field9727, (byte) -111);
        if (arg0 <= 119) {
            this.method403(true, 20, (byte) -125, 88);
        }
        this.field864 = class146.field1963.method1130(var2, class92.method513(this.field872, this.field873.field9727), true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZB)V", line = 89)
    public final void method374(boolean arg0, byte arg1) {
        field870++;
        if (arg1 >= -85) {
            this.method403(false, -80, (byte) 40, 3);
        }
        int var3 = this.field873.field9726.method3139((byte) -98, this.field873.field9733, class666.field9479) + this.field873.field9731;
        int var4 = this.field873.field9729.method1697(100, this.field873.field9743, class399.field5293) + this.field873.field9736;
        this.method403(arg0, var3, (byte) 115, var4);
        this.method401((byte) 112, arg0, var4, var3);
        String var5 = class540.field7407.method2858(true);
        if (class529.method2982((byte) -69) - this.field865 > 10000L) {
            var5 = var5 + " (" + class540.field7407.method2862((byte) 60).method3928(false) + ")";
        }
        this.field864.method2323(24, -1, this.field873.field9733 / 2 + var3, this.field873.field9740, var5, this.field873.field9743 / 2 + this.field873.field9744 + var4 + 4);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)Z", line = 116)
    public boolean method404(boolean arg0) {
        field862++;
        boolean var2 = true;
        if (!this.field872.method1931(1, this.field873.field9727)) {
            var2 = false;
        }
        if (arg0) {
            this.field864 = null;
        }
        if (!this.field871.method1931(1, this.field873.field9727)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lga;Lga;Lmga;)V", line = 136)
    public class73(class332 arg0, class332 arg1, class689 arg2) {
        this.field871 = arg1;
        this.field872 = arg0;
        this.field873 = arg2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BZII)V")
    public abstract void method401(byte arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZIBI)V")
    public abstract void method403(boolean arg0, int arg1, byte arg2, int arg3);
}
