import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class8 extends class656 {

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "[[I")
    public static int[][] field155 = new int[128][128];

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "[F")
    public static float[] field156 = new float[4];

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Ldu;")
    public static class360 field160 = new class360(8);

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "[Lkf;")
    public static class256[] field162;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/lang/String;CLjava/lang/String;)Ljava/lang/String;")
    public static final String method93(int arg0, String arg1, char arg2, String arg3) {
        field159++;
        int var4 = arg1.length();
        int var5 = 74 / ((-arg0 - 64) / 40);
        int var6 = arg3.length();
        int var7 = var4;
        int var8 = var6 - 1;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                var9 = arg1.indexOf(arg2, var9);
                if (var9 < 0) {
                    break;
                }
                var9++;
                var7 += var8;
            }
        }
        StringBuffer var10 = new StringBuffer(var7);
        int var11 = 0;
        while (true) {
            int var12 = arg1.indexOf(arg2, var11);
            if (var12 < 0) {
                var10.append(arg1.substring(var11));
                return var10.toString();
            }
            var10.append(arg1.substring(var11, var12));
            var11 = var12 + 1;
            var10.append(arg3);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method94(int arg0) {
        field156 = null;
        field160 = null;
        if (arg0 < -116) {
            field162 = null;
            field155 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(Z)V")
    public static final void method95(boolean arg0) {
        field158++;
        class503.field6747 = null;
        if (class24.field412 && class343.method2050((byte) -112) != 1) {
            class132.method1027(0, class15.field215 == 3 || class15.field215 == 7, 0, -124, class668.method3685(arg0), class639.method3496(-2));
        }
        int var1 = 0;
        if (arg0) {
            return;
        }
        int var2 = 0;
        if (class24.field412) {
            var1 = class367.method2167(-2);
            var2 = class672.method3717((byte) -118);
        }
        class385.method2282(var1, class443.field6101, var2, 50, var2, class228.field3251 + var1, var1, -1, class199.field2993 + var2);
        if (class503.field6747 != null) {
            class476.method2684(var2 + class199.field2993, class9.field165, var2, class477.field6555, true, class503.field6747, 99, -1412584499, var1, class758.field10549.field9294, class228.field3251 + var1);
            class503.field6747 = null;
        }
    }
}
