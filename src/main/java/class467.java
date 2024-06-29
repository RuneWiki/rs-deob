import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class467 {

    @OriginalMember(owner = "client!so", name = "b", descriptor = "Ljh;")
    private class158 field6735;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "Lnga;")
    public static class510 field6734 = new class510(50);

    @OriginalMember(owner = "client!so", name = "i", descriptor = "Lqaa;")
    public static class27 field6742 = new class27(31, 7);

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field6743 = -1;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "Ljda;")
    private class224 field6736;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "[Laf;")
    public static class433[] field6737;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)Ljda;")
    public final class224 method2834(int arg0) {
        field6741++;
        class224 var2 = this.field6735.field2357.field3201;
        if (this.field6735.field2357 == var2) {
            this.field6736 = null;
            return null;
        }
        if (arg0 >= -28) {
            field6743 = 116;
        }
        this.field6736 = var2.field3201;
        return var2;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
    public class467() {
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Ljda;")
    public final class224 method2835(byte arg0) {
        field6740++;
        if (arg0 != -96) {
            method2837((byte) 18);
        }
        class224 var2 = this.field6736;
        if (this.field6735.field2357 == var2) {
            this.field6736 = null;
            return null;
        } else {
            this.field6736 = var2.field3201;
            return var2;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III)V")
    public static final void method2836(int arg0, int arg1, int arg2) {
        boolean var3 = class390.field5454[0][arg1][arg2] != null && class390.field5454[0][arg1][arg2].field5834 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class390.field5454[var4][arg1][arg2] == null) {
                class416 var5 = class390.field5454[var4][arg1][arg2] = new class416(var4);
                if (var3) {
                    var5.field5835++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Ljh;)V")
    public class467(class158 arg0) {
        this.field6735 = arg0;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(B)V")
    public static void method2837(byte arg0) {
        field6742 = null;
        if (arg0 != 17) {
            method2836(30, -104, -11);
        }
        field6734 = null;
        field6737 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Laf;II)Z")
    public static final boolean method2838(class433 arg0, int arg1, int arg2) {
        field6738++;
        class486.field6883.method155(arg0.field6047[arg2], arg0.field6053[arg2], arg0.field6045[arg2], class4.field67);
        int var3 = class4.field67[2];
        if (var3 < 50) {
            return false;
        } else {
            arg0.field6052[arg2] = (short) (class4.field67[arg1] * class93.field1629 / var3 + class556.field7797);
            arg0.field6043[arg2] = (short) (class4.field67[1] * class391.field5464 / var3 + class471.field6779);
            arg0.field6042[arg2] = (short) var3;
            return true;
        }
    }
}
