import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class396 {

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method2386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5629++;
        if (arg1 != -1) {
            return;
        }
        int var8 = class252.method1631(class333.field4936, class424.field5996, arg6, arg1 ^ 0x59);
        int var9 = class252.method1631(class333.field4936, class424.field5996, arg0, -86);
        int var10 = class252.method1631(class176.field2630, class465.field6763, arg4, -41);
        int var11 = class252.method1631(class176.field2630, class465.field6763, arg5, -29);
        int var12 = class252.method1631(class333.field4936, class424.field5996, arg6 + arg7, -62);
        int var13 = class252.method1631(class333.field4936, class424.field5996, arg0 - arg7, arg1 + -62);
        for (int var14 = var8; var14 < var12; var14++) {
            class479.method2839(var11, var10, class271.field4078[var14], 106, arg2);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class479.method2839(var11, var10, class271.field4078[var15], 110, arg2);
        }
        int var16 = class252.method1631(class176.field2630, class465.field6763, arg4 + arg7, -58);
        int var17 = class252.method1631(class176.field2630, class465.field6763, arg5 - arg7, -34);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class271.field4078[var18];
            class479.method2839(var16, var10, var19, arg1 ^ 0xFFFFFF98, arg2);
            class479.method2839(var17, var16, var19, 109, arg3);
            class479.method2839(var11, var17, var19, arg1 + 109, arg2);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIZZ)V", line = 62)
    public static final void method2387(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        class176.method1228(arg1, arg4, arg0, arg3, 0, class111.field1639.length + arg2, (byte) -95);
        field5627++;
        class206.field3141 = null;
        class389.field5526 = 0;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIZII)V", line = 72)
    public static final void method2388(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field5628++;
        if (class74.field1211 == 0) {
            class275.method1776(-30196, false);
        } else {
            class544.field7985 = class74.field1211;
            class322.method2063(0, 10);
        }
        if (arg4 < 101) {
            method2388(-96, 38, true, -71, 27);
        }
        class226.field3413 = arg3;
        class544.field7984 = arg1;
        class215.field3234 = arg2;
        class382.method2317(arg0);
    }
}
