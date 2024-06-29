import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class370 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field4878 = 0;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Lsw;")
    public static class641 field4880 = new class641(4);

    @OriginalMember(owner = "client!io", name = "f", descriptor = "F")
    public static float field4883;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "[Lsa;")
    public static class174[] field4884;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static final void method2073(int arg0) {
        field4879++;
        if (arg0 != 0 || class210.field2560 == null) {
            return;
        }
        class504.field6989.method1985(0);
        class611.method3514();
        class463.method2698((byte) -24);
        class292.method1635(true);
        class543.method3179(0);
        class642.method3697(7805);
        if (class259.field3340 != null) {
            class259.field3340.method3461(84);
        }
        class54.method307(16568);
        class116.method686(arg0 - 2);
        class531.method3030((byte) -17);
        class390.method2238((byte) -54, false);
        class144.method793(-1298951220);
        for (int var1 = 0; var1 < 2048; var1++) {
            class545 var5 = class459.field6329[var1];
            if (var5 != null) {
                var5.field6484 = null;
                for (int var6 = 0; var6 < var5.field6485.length; var6++) {
                    var5.field6485[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class98.field1215; var2++) {
            class459 var3 = class393.field5189[var2].field5390;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field6485.length; var4++) {
                    var3.field6485[var4] = null;
                }
            }
        }
        class138.field1681 = null;
        class272.field3527 = null;
        class210.field2560.method1103((byte) 94);
        class210.field2560 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public static void method2074(byte arg0) {
        field4884 = null;
        if (arg0 != 90) {
            method2073(60);
        }
        field4880 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIII)V")
    public static final void method2075(int arg0, int arg1, int arg2, int arg3) {
        field4881++;
        class310 var4 = class69.field666[arg3][arg2];
        class336.method1895(var4 == null ? class290.field3764 : var4, -123, arg1);
        if (arg0 != -8100) {
            method2073(64);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2076(String arg0, int arg1) {
        field4882++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class313.method1736(arg0.charAt(var4), (byte) -110) + (var3 << 5) - var3;
        }
        if (arg1 != -9063) {
            field4880 = null;
        }
        return var3;
    }
}
