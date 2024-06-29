import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class368 {

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Lam;")
    public static class455 field5249 = new class455();

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[[[B")
    public static byte[][][] field5253;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Loi;I)I", line = 4)
    public static final int method2168(class53 arg0, int arg1) {
        if (arg1 > -64) {
            return -5;
        }
        field5247++;
        int var2 = 0;
        if (arg0.method424(0, class27.field326)) {
            var2++;
        }
        if (arg0.method424(0, class528.field7748)) {
            var2++;
        }
        if (arg0.method424(0, class309.field4511)) {
            var2++;
        }
        if (arg0.method424(0, class417.field5875)) {
            var2++;
        }
        if (arg0.method424(0, class461.field6448)) {
            var2++;
        }
        if (arg0.method424(0, class231.field3399)) {
            var2++;
        }
        if (arg0.method424(0, class514.field7589)) {
            var2++;
        }
        if (arg0.method424(0, class227.field3260)) {
            var2++;
        }
        if (arg0.method424(0, class532.field7808)) {
            var2++;
        }
        if (arg0.method424(0, class100.field1334)) {
            var2++;
        }
        if (arg0.method424(0, class63.field791)) {
            var2++;
        }
        if (arg0.method424(0, class430.field6067)) {
            var2++;
        }
        if (arg0.method424(0, class355.field5085)) {
            var2++;
        }
        if (arg0.method424(0, class327.field4769)) {
            var2++;
        }
        if (arg0.method424(0, class213.field3078)) {
            var2++;
        }
        if (arg0.method424(0, class494.field6987)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZZIBII)V", line = 79)
    public static final void method2169(int arg0, boolean arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != 76) {
            field5253 = null;
        }
        if (arg3 < arg5) {
            int var7 = (arg3 + arg5) / 2;
            int var8 = arg3;
            class135 var9 = class20.field239[var7];
            class20.field239[var7] = class20.field239[arg5];
            class20.field239[arg5] = var9;
            for (int var10 = arg3; var10 < arg5; var10++) {
                if (class364.method2154(arg0, var9, arg2, arg6, class20.field239[var10], (byte) 67, arg1) <= 0) {
                    class135 var11 = class20.field239[var10];
                    class20.field239[var10] = class20.field239[var8];
                    class20.field239[var8++] = var11;
                }
            }
            class20.field239[arg5] = class20.field239[var8];
            class20.field239[var8] = var9;
            method2169(arg0, arg1, arg2, arg3, (byte) 76, var8 - 1, arg6);
            method2169(arg0, arg1, arg2, var8 + 1, (byte) 76, arg5, arg6);
        }
        field5248++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 122)
    public static void method2170(int arg0) {
        field5253 = null;
        field5249 = null;
        if (arg0 != 29892) {
            method2168(null, 71);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)V", line = 137)
    public static final void method2171(byte arg0, int arg1) {
        field5254++;
        if (arg0 != -66) {
            return;
        }
        int var2 = class390.field5481 - class68.field864;
        if (var2 >= 100) {
            class504.field7461 = 1;
            return;
        }
        int var3 = (int) class327.field4768;
        if (class364.field5209 >> 8 > var3) {
            var3 = class364.field5209 >> 8;
        }
        if (class345.field5006[4] && var3 < (class262.field3862[4] + 128)) {
            var3 = class262.field3862[4] + 128;
        }
        int var4 = (int) class153.field2204 + class205.field2966 & 0x3FFF;
        class218.method1352(class220.field3175, class488.method2817(class246.field3587.field1896, true, class246.field3587.field1899, class320.field4627) - 50, 600 - -((var3 >> 3) * 3) << 0, class267.field3903, 65535, var3, arg1, var4);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class515.field7596 = (int) ((float) (class515.field7596 - class47.field546) * var5 + (float) class47.field546);
        class478.field6654 = (int) ((float) (class478.field6654 - class400.field5631) * var5 + (float) class400.field5631);
        class41.field450 = (int) ((float) (class41.field450 - class371.field5294) * var5 + (float) class371.field5294);
        class51.field619 = (int) ((float) (class51.field619 - class528.field7754) * var5 + (float) class528.field7754);
        int var6 = class8.field122 - class190.field2722;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class8.field122 = (int) ((float) var6 * var5 + (float) class190.field2722);
        class8.field122 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 186)
    public static final void method2172(byte arg0) {
        class86.method623(10, (byte) 99);
        field5252++;
        if (arg0 != 98) {
            field5253 = null;
        }
        class303.method1847(-121);
        System.gc();
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V", line = 201)
    public static final void method2173(int arg0) {
        field5250++;
        for (class300 var1 = (class300) class424.field5976.method2655(15152); var1 != null; var1 = (class300) class424.field5976.method2660((byte) 67)) {
            class196 var2 = var1.field4389;
            if (var2.field2780) {
                var1.method2891(-126);
                var2.method1239((byte) 123);
            } else if (var2.field2775 <= class390.field5481) {
                var2.method1233(false, class288.field4213);
                if (var2.field2780) {
                    var1.method2891(93);
                } else {
                    class120.method806(var2, true);
                }
            }
        }
        if (arg0 != 28199) {
            method2171((byte) 86, 65);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lef;B)Lef;")
    public abstract class342 method697(class342 arg0, byte arg1);
}
