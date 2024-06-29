import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class233 implements class235 {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field4122 = 0;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4126 = new CRC32();

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Lsf;")
    public static class108 field4128 = class140.method973(255, ")1");

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Lsf;")
    public static class108 field4131 = class140.method973(255, "ul");

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Lik;")
    public static class262 field4123;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "[S")
    public static short[] field4124;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IJ[IZ)Lsf;", line = 8)
    public final class108 method1624(int arg0, long arg1, int[] arg2, boolean arg3) {
        field4127++;
        if (arg0 == 0) {
            class99 var7 = class16.method106(-100, arg2[0]);
            return var7.method688(-115, (int) arg1);
        } else if (arg0 == 1 || arg0 == 10) {
            class145 var6 = class144.method994(!arg3, (int) arg1);
            return var6.field2610;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class16.method106(-97, arg2[0]).method688(-44, (int) arg1);
        } else {
            if (arg3) {
                this.method1624(-37, -111L, (int[]) null, true);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 43)
    public static final void method1625(int arg0) {
        field4129++;
        int var1 = class42.field562 + class95.field1513.field4452;
        if (arg0 != -2430) {
            return;
        }
        int var2 = class209.field3732 + class95.field1513.field4457;
        if (class198.field3567 - var1 < -500 || (class198.field3567 - var1) > 500 || (class43.field570 - var2) < -500 || class43.field570 - var2 > 500) {
            class198.field3567 = var1;
            class43.field570 = var2;
        }
        if (class43.field570 != var2) {
            class43.field570 += (var2 - class43.field570) / 16;
        }
        if (class198.field3567 != var1) {
            class198.field3567 += (var1 - class198.field3567) / 16;
        }
        if (class282.field4939) {
            for (int var3 = 0; var3 < class137.field2429; var3++) {
                int var4 = class197.field3562[var3];
                if (var4 == 98) {
                    class176.field3207 = class176.field3207 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class176.field3207 = class176.field3207 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class186.field3423 = class186.field3423 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class186.field3423 = class186.field3423 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class144.field2529[98]) {
                class311.field5375 += (12 - class311.field5375) / 2;
            } else if (class144.field2529[99]) {
                class311.field5375 += (-class311.field5375 - 12) / 2;
            } else {
                class311.field5375 /= 2;
            }
            if (class144.field2529[96]) {
                class199.field3593 += (-class199.field3593 - 24) / 2;
            } else if (class144.field2529[97]) {
                class199.field3593 += (24 - class199.field3593) / 2;
            } else {
                class199.field3593 /= 2;
            }
            class176.field3207 += class311.field5375 / 2;
            class186.field3423 += class199.field3593 / 2;
        }
        class159.method1102((byte) 85);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 128)
    public static void method1626(int arg0) {
        field4124 = null;
        field4128 = null;
        if (arg0 > -1) {
            method1628(-120, 46, -44, 99, 64);
        }
        field4123 = null;
        field4131 = null;
        field4126 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIBI)V", line = 142)
    public static final void method1627(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field4121++;
        int var6 = arg1;
        class209.method1452(arg0 + arg5, class106.field1839[arg2], 7, arg0 - arg5, arg3);
        if (arg4 != -84) {
            method1626(-78);
        }
        int var7 = 0;
        int var8 = arg1 * arg1;
        int var9 = var8 << 1;
        int var10 = arg5 * arg5;
        int var11 = var10 << 1;
        int var12 = arg1 << 1;
        int var13 = var10 << 2;
        int var14 = var8 << 2;
        int var15 = var8 - (var12 - 1) * var11;
        int var16 = ((var7 << 1) + 3) * var9;
        int var17 = (1 - var12) * var10 + var9;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var7 + 1) * var14;
        int var20 = (arg1 - 1) * var13;
        while (var6 > 0) {
            if (var17 < 0) {
                while (var17 < 0) {
                    var15 += var19;
                    var17 += var16;
                    var7++;
                    var16 += var14;
                    var19 += var14;
                }
            }
            var6--;
            int var21 = arg2 - var6;
            int var22 = arg2 + var6;
            if (var15 < 0) {
                var17 += var16;
                var15 += var19;
                var19 += var14;
                var16 += var14;
                var7++;
            }
            var15 += -var18;
            var17 += -var20;
            var20 -= var13;
            var18 -= var13;
            int var23 = arg0 + var7;
            int var24 = arg0 - var7;
            class209.method1452(var23, class106.field1839[var21], 7, var24, arg3);
            class209.method1452(var23, class106.field1839[var22], 7, var24, arg3);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)V", line = 232)
    public static final void method1628(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4125++;
        for (class299 var5 = (class299) class273.field4794.method13(0); var5 != null; var5 = (class299) class273.field4794.method15((byte) 47)) {
            class121.method848(arg4, arg1, arg3, false, var5, arg2);
        }
        for (class299 var6 = (class299) class277.field4856.method13(0); var6 != null; var6 = (class299) class277.field4856.method15((byte) 47)) {
            byte var7 = 1;
            if (var6.field5194.field4472 == var6.field5194.field4455) {
                var7 = 0;
            } else if (var6.field5194.field4483 == var6.field5194.field4472) {
                var7 = 2;
            }
            if (var6.field5217 != var7) {
                int var8 = class277.method1995(var6.field5194, (byte) -122);
                if (var6.field5193 != var8) {
                    if (var6.field5220 != null) {
                        class213.field3789.method2186(var6.field5220);
                        var6.field5220 = null;
                    }
                    var6.field5193 = var8;
                }
                var6.field5217 = var7;
            }
            var6.field5212 = var6.field5194.field4452;
            var6.field5197 = var6.field5194.field4452 + (var6.field5194.method363((byte) -126) * 64);
            var6.field5208 = var6.field5194.field4457;
            var6.field5203 = var6.field5194.field4457 + var6.field5194.method363((byte) 80) * 64;
            class121.method848(arg4, arg1, arg3, false, var6, arg2);
        }
        int var9 = -70 % ((74 - arg0) / 33);
        for (class299 var10 = (class299) class36.field494.method1672(0); var10 != null; var10 = (class299) class36.field494.method1678(33)) {
            byte var11 = 1;
            if (var10.field5211.field4472 == var10.field5211.field4455) {
                var11 = 0;
            } else if (var10.field5211.field4483 == var10.field5211.field4472) {
                var11 = 2;
            }
            if (var10.field5217 != var11) {
                int var12 = class22.method153(var10.field5211, false);
                if (var10.field5193 != var12) {
                    if (var10.field5220 != null) {
                        class213.field3789.method2186(var10.field5220);
                        var10.field5220 = null;
                    }
                    var10.field5193 = var12;
                }
                var10.field5217 = var11;
            }
            var10.field5212 = var10.field5211.field4452;
            var10.field5197 = var10.field5211.field4452 + var10.field5211.method363((byte) 127) * 64;
            var10.field5208 = var10.field5211.field4457;
            var10.field5203 = var10.field5211.field4457 + var10.field5211.method363((byte) 125) * 64;
            class121.method848(arg4, arg1, arg3, false, var10, arg2);
        }
    }
}
