import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class245 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "[I")
    public static int[] field4355 = new int[50];

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static volatile int field4358 = 0;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "[Lqb;")
    public static class76[] field4357 = new class76[2048];

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lng;")
    public static class121 field4359;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "[I")
    public static int[] field4360;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IBI)V")
    public static final void method1710(int arg0, byte arg1, int arg2) {
        if (arg1 != 119) {
            field4355 = null;
        }
        for (int var3 = 0; var3 < class32.field442; var3++) {
            class20 var4 = class191.method1311(-2488, var3);
            if (var4 != null) {
                int var5 = var4.field277;
                if (var5 >= 0 && !class15.field199.method1361(0, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field278 >= 0) {
                    int var6 = var4.field278;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) - (-(var6 & 0x380) - var7);
                    var9 = class15.field196[class194.method1378(var8, 96, arg1 - 117)];
                } else if (var5 >= 0) {
                    var9 = class15.field196[class194.method1378(class15.field199.method1371(17045, var5), 96, 2)];
                } else if (var4.field284 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field284;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg0 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class15.field196[class194.method1378(var12, 96, 2)];
                }
                class137.field2296[var3 + 1] = var9;
            }
        }
        field4362++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static void method1711(boolean arg0) {
        if (arg0) {
            field4357 = null;
        }
        field4360 = null;
        field4357 = null;
        field4359 = null;
        field4355 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static final void method1712(int arg0) {
        class130.field2166 = class28.field402;
        field4361++;
        class29.method206((byte) -125, false);
        class235.method1658(18138);
        class209.method1441(class130.field2166, 4096);
        class175.field2946 = new class76();
        class175.field2946.field3003 = 3000;
        class175.field2946.field2972 = 3000;
        if (arg0 != -10697) {
            method1712(-9);
        }
        class8.method63((byte) -127, class215.field3792);
        class188.method1293(10, arg0 - 19514);
    }
}
