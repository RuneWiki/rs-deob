import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class318 {

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[Ldc;")
    public static class245[] field4683 = new class245[8];

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Z")
    public static boolean field4685 = false;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lcc;")
    public static class327 field4684 = new class327(32);

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field4689 = 0;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field4688 = 0;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field4690 = 0;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lfh;")
    public static class140 field4691;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZJB)V", line = 8)
    public static final void method2196(boolean arg0, long arg1, byte arg2) {
        field4686++;
        if (arg1 == 0L) {
            return;
        }
        if (class116.field1511 >= 100) {
            class88.method641("", 0, false, class138.field1887);
            return;
        }
        String var4 = class193.method1398(false, arg1);
        for (int var5 = 0; var5 < class116.field1511; var5++) {
            if (class234.field3356[var5] == arg1) {
                class88.method641("", 0, false, var4 + class173.field2389);
                return;
            }
        }
        for (int var6 = 0; var6 < class45.field559; var6++) {
            if (class158.field2251[var6] == arg1) {
                class88.method641("", 0, false, class194.field2688 + var4 + class221.field3182);
                return;
            }
        }
        if (var4.equals(class359.field5616.field3475)) {
            class88.method641("", 0, false, class288.field4177);
            return;
        }
        class234.field3356[class116.field1511] = arg1;
        class109.field1422[class116.field1511] = class222.method1619(117, arg1);
        class226.field3255[class116.field1511++] = arg0;
        class180.field2464 = class64.field801;
        class251.field3681.method1309(23, 197);
        class251.field3681.method2049(-19780, arg1);
        if (arg2 > 33) {
            class29.field326++;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZZIII)V", line = 77)
    public static final void method2197(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        field4687++;
        if (class47.field623) {
            int var6 = arg3 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class255.field3737 - class35.field433) * var6 / 100 + class35.field433;
            if (class237.field3425 > var7) {
                var7 = class237.field3425;
            } else if (var7 > class254.field3710) {
                var7 = class254.field3710;
            }
            int var8 = arg3 * var7 * 512 / (arg5 * 334);
            if (var8 < class101.field1320) {
                short var9 = class101.field1320;
                var7 = arg5 * var9 * 334 / (arg3 * 512);
                if (var7 > class254.field3710) {
                    var7 = class254.field3710;
                    int var10 = var7 * 512 * arg3 / (var9 * 334);
                    int var11 = (arg5 - var10) / 2;
                    if (arg1) {
                        class129.method994();
                        class129.method997(arg4, arg0, var11, arg3, 0);
                        class129.method997(arg4 + arg5 - var11, arg0, var11, arg3, 0);
                    }
                    arg5 -= var11 * 2;
                    arg4 += var11;
                }
            } else if (var8 > class286.field4079) {
                short var12 = class286.field4079;
                var7 = arg5 * var12 * 334 / (arg3 * 512);
                if (var7 < class237.field3425) {
                    var7 = class237.field3425;
                    int var13 = arg5 * 334 * var12 / (var7 * 512);
                    int var14 = (arg3 - var13) / 2;
                    if (arg1) {
                        class129.method994();
                        class129.method997(arg4, arg0, arg5, var14, 0);
                        class129.method997(arg4, arg0 + arg3 - var14, arg5, var14, 0);
                    }
                    arg3 -= var14 * 2;
                    arg0 += var14;
                }
            }
            class277.field3968 = arg3 * var7 / 334;
        }
        class242.field3501 = arg0;
        class223.field3208 = arg4;
        class30.field340 = (short) arg5;
        if (!arg2) {
            class339.field5302 = (short) arg3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 185)
    public static void method2198(int arg0) {
        if (arg0 != -2322) {
            field4688 = -110;
        }
        field4691 = null;
        field4684 = null;
        field4683 = null;
    }
}
