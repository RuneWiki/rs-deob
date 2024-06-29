import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class420 extends class66 {

    @OriginalMember(owner = "client!rca", name = "t", descriptor = "Ljava/lang/String;")
    public String field6425;

    @OriginalMember(owner = "client!rca", name = "r", descriptor = "Lhga;")
    public static class158 field6423 = new class158(64, 6);

    @OriginalMember(owner = "client!rca", name = "q", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!rca", name = "u", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!rca", name = "s", descriptor = "Lwba;")
    public static class46 field6424;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V", line = 5)
    public static void method2681(int arg0) {
        field6423 = null;
        field6424 = null;
        int var1 = -56 / ((63 - arg0) / 57);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)Lj;", line = 18)
    public static final class502 method2682(int arg0, int arg1) {
        field6422++;
        if (arg1 >= -69) {
            method2682(20, 16);
        }
        class502[] var2 = class173.method1412(-128);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class502 var4 = var2[var3];
            if (var4.field7350 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "()V", line = 45)
    public class420() {
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 50)
    public class420(String arg0) {
        this.field6425 = arg0;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lla;ILjava/lang/String;Lr;Lufa;Z)V", line = 58)
    public static final void method2683(class418 arg0, int arg1, String arg2, class167 arg3, class632 arg4, boolean arg5) {
        field6426++;
        boolean var6 = !class221.field3586 || class129.method1127((byte) 30);
        if (!var6) {
            return;
        }
        if (class221.field3586 && var6) {
            class632 var12 = class121.field1950;
            class418 var13 = arg3.method347(var12, class680.field9540, true);
            int var14 = var12.method3669(0, null, arg2, 250);
            int var15 = var12.method3670(arg2, null, var12.field8898, -1, 250);
            int var16 = class144.field2416.field4535;
            int var17 = var16 + 4;
            int var18 = var17 * 2 + var15;
            int var19 = var17 * 2 + var14;
            if (var19 < class315.field4947) {
                var19 = class315.field4947;
            }
            if (class303.field4736 > var18) {
                var18 = class303.field4736;
            }
            int var20 = class81.field1010.method1799(-114, var19, class585.field8333) + class272.field4393;
            int var21 = class155.field2633.method2550(var18, true, class95.field1487) + class246.field3925;
            arg3.method265(class582.field8280, false).method1087(class189.field3155.field4535 + var20, class189.field3155.field4537 + var21, var19 - (class189.field3155.field4535 * 2), -(class189.field3155.field4537 * 2) + var18, 1, 0, 0);
            arg3.method265(class189.field3155, true).method3960(var20, var21);
            class189.field3155.method2021();
            arg3.method265(class189.field3155, true).method3960(var19 + var20 - var16, var21);
            class189.field3155.method2020();
            arg3.method265(class189.field3155, true).method3960(var19 + var20 - var16, var18 + var21 + -var16);
            class189.field3155.method2021();
            arg3.method265(class189.field3155, true).method3960(var20, var21 + var18 - var16);
            class189.field3155.method2020();
            arg3.method265(class144.field2416, true).method3956(var20, class189.field3155.field4537 + var21, var16, var18 - (class189.field3155.field4537 * 2));
            class144.field2416.method2026();
            arg3.method265(class144.field2416, true).method3956(var20 + class189.field3155.field4535, var21, var19 - (class189.field3155.field4535 * 2), var16);
            class144.field2416.method2026();
            arg3.method265(class144.field2416, true).method3956(var20 + var19 - var16, class189.field3155.field4537 + var21, var16, var18 - (class189.field3155.field4537 * 2));
            class144.field2416.method2026();
            arg3.method265(class144.field2416, true).method3956(class189.field3155.field4535 + var20, var21 - (-var18 + var16), var19 - (class189.field3155.field4535 * 2), var16);
            class144.field2416.method2026();
            var13.method2658(var19 - var17 * 2, class489.field7159 | 0xFF000000, 1, 0, null, var21 + var17, arg2, 1, var17 + var20, 120, 0, 0, -1, null, null, var18 - (var17 * 2));
            class133.method1153(var20, var19, false, var18, var21);
        } else {
            int var7 = arg4.method3669(0, null, arg2, 250);
            int var8 = arg4.method3674(250, arg2, null, (byte) -118) * 13;
            byte var9 = 4;
            int var10 = var9 + 6;
            int var11 = var9 + 6;
            arg3.method335(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 + var9 + var9, -16777216, 0);
            arg3.method344(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 - -var9 - -var9, -1, 0);
            arg0.method2658(var7, -1, 1, 0, null, var11, arg2, 1, var10, 94, 0, 0, -1, null, null, var8);
            class133.method1153(var10 - var9, var7 + var9 + var9, false, var8 + var9 + var9, -var9 + var11);
        }
        if (arg5) {
            try {
                arg3.method122();
            } catch (class529 var22) {
            }
        }
        if (arg1 != -31593) {
            method2683(null, -58, null, null, null, false);
        }
    }
}
