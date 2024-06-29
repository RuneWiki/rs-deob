import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class296 {

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Lsf;")
    public static class108 field5164 = class140.method973(255, " <col=ffff00>");

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Z")
    public static boolean field5161 = false;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "Lsf;")
    public static class108 field5166 = class140.method973(255, "<img=0>");

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Lvd;")
    public static class135 field5168;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Ltb;")
    public static class223 field5165;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Lca;")
    public static class98 field5162;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 15)
    public static void method2101(int arg0) {
        field5166 = null;
        field5164 = null;
        field5168 = null;
        field5162 = null;
        if (arg0 != 1) {
            method2102(28, 41, -44, -79);
        }
        field5165 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)Lll;", line = 47)
    public static final class158 method2102(int arg0, int arg1, int arg2, int arg3) {
        class158 var4 = new class158();
        var4.field2848 = arg1;
        field5160++;
        var4.field2845 = arg0;
        class191.field3456.method1681(1, var4, (long) arg3);
        class35.method247(0, arg0);
        class98 var5 = class168.method1173(arg3, -1456948048);
        if (var5 != null) {
            class195.method1388(-82, var5);
        }
        if (class175.field3197 != null) {
            class195.method1388(-82, class175.field3197);
            class175.field3197 = null;
        }
        int var6 = class311.field5374;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class9.method48((byte) -34, class305.field5299[var7])) {
                class320.method2216(var7, 31);
            }
        }
        if (class311.field5374 == 1) {
            class62.field989 = false;
            class101.method702(arg2 ^ 0xFFFFFFE9, class203.field3665, class167.field2998, field5167, class190.field3453);
        } else {
            class101.method702(arg2 - 23, class203.field3665, class167.field2998, field5167, class190.field3453);
            int var8 = class256.field4525.method543(class17.field209);
            for (int var9 = 0; var9 < class311.field5374; var9++) {
                int var10 = class256.field4525.method543(class210.method1453((byte) -117, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class167.field2998 = var8 + 8;
            class190.field3453 = class311.field5374 * 15 + 22;
        }
        if (var5 != null) {
            class146.method1020((byte) -120, var5, false);
        }
        if (arg2 != 22) {
            field5164 = (class108) null;
        }
        class266.method1920(arg0, (byte) -104);
        if (class322.field5511 != -1) {
            class302.method2121((byte) 95, class322.field5511, 1);
        }
        return var4;
    }
}
