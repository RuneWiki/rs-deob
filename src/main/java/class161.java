import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class161 {

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Lqk;")
    public static class207 field2848 = class24.method212(255, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[I")
    public static int[] field2851 = new int[32];

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Lqk;")
    public static class207 field2852;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "[S")
    public static short[] field2855;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "[[[B")
    public static byte[][][] field2854;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZD)V")
    public static final void method1170(boolean arg0, double arg1) {
        field2850++;
        if (class153.field2664 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class192.field3392[var3] = var4 <= 255 ? var4 : 255;
            }
            class153.field2664 = arg1;
        }
        if (!arg0) {
            method1175(-2, -117, -98, (byte) 47, 89);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BJ)V")
    public static final void method1171(byte arg0, long arg1) {
        field2847++;
        if (arg1 == 0L) {
            return;
        }
        if (class54.field1013 >= 100) {
            class71.method511(23692, class100.field1800, 0, class172.field3040);
            return;
        }
        class207 var3 = class21.method125(77, arg1).method1423(121);
        for (int var4 = 0; var4 < class54.field1013; var4++) {
            if (class282.field4963[var4] == arg1) {
                class71.method511(23692, class100.field1800, 0, class105.method757(false, new class207[] { var3, class207.field3675 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class25.field534; var5++) {
            if (class150.field2640[var5] == arg1) {
                class71.method511(23692, class100.field1800, 0, class105.method757(false, new class207[] { class15.field239, var3, class73.field1341 }));
                return;
            }
        }
        if (arg0 > -47) {
            field2855 = null;
        }
        if (var3.method1436(class202.field3565.field209, (byte) 111)) {
            class71.method511(23692, class100.field1800, 0, class88.field1593);
            return;
        }
        class282.field4963[class54.field1013] = arg1;
        class144.field2481++;
        class234.field4335[class54.field1013++] = class21.method125(121, arg1);
        class177.field3201 = class193.field3395;
        class261.field4645.method767(106, (byte) 122);
        class261.field4645.method1048((byte) 114, arg1);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static final void method1172(int arg0) {
        field2846++;
        if (arg0 < 57) {
            method1175(-103, 2, -58, (byte) -75, -100);
        }
        for (class25 var1 = (class25) class43.field838.method922((byte) 81); var1 != null; var1 = (class25) class43.field838.method928(-78)) {
            class259 var2 = var1.field527;
            if (class93.field1645 != var2.field4620 || var2.field4624) {
                var1.method1346((byte) -16);
            } else if (class160.field2844 >= var2.field4619) {
                var2.method1804(0, class20.field325);
                if (var2.field4624) {
                    var1.method1346((byte) -16);
                } else {
                    class265.method1821(var2.field4620, var2.field4609, var2.field4612, var2.field4622, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)I")
    public static final int method1173(int arg0, int arg1) {
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        if (arg0 != 13691) {
            method1171((byte) -11, -116L);
        }
        field2853++;
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
    public static void method1174(int arg0) {
        field2848 = null;
        field2854 = null;
        if (arg0 <= 80) {
            method1175(112, -72, -27, (byte) -78, -103);
        }
        field2852 = null;
        field2855 = null;
        field2851 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIBI)V")
    public static final void method1175(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 0;
        field2845++;
        int var6 = -arg1;
        int var7 = arg1;
        int var8 = class21.method123(arg0 + arg1, -15466, class124.field2158, class88.field1599);
        int var9 = class21.method123(arg0 - arg1, arg3 + -15433, class124.field2158, class88.field1599);
        if (arg3 != -33) {
            field2855 = null;
        }
        class215.method1544(var9, var8, class15.field238[arg4], arg2, arg3 + 23);
        int var10 = -1;
        while (var5 < var7) {
            var10 += 2;
            var6 += var10;
            if (var6 > 0) {
                var7--;
                var6 -= var7 << 1;
                int var11 = arg4 - var7;
                int var12 = arg4 + var7;
                if (var12 >= class204.field3580 && var11 <= class204.field3602) {
                    int var13 = class21.method123(arg0 + var5, -15466, class124.field2158, class88.field1599);
                    int var14 = class21.method123(arg0 - var5, arg3 ^ 0x3C49, class124.field2158, class88.field1599);
                    if (class204.field3602 >= var12) {
                        class215.method1544(var14, var13, class15.field238[var12], arg2, 4);
                    }
                    if (var11 >= class204.field3580) {
                        class215.method1544(var14, var13, class15.field238[var11], arg2, -1);
                    }
                }
            }
            var5++;
            int var15 = arg4 + var5;
            int var16 = arg4 - var5;
            if (var15 >= class204.field3580 && var16 <= class204.field3602) {
                int var17 = class21.method123(arg0 + var7, -15466, class124.field2158, class88.field1599);
                int var18 = class21.method123(arg0 - var7, -15466, class124.field2158, class88.field1599);
                if (var15 <= class204.field3602) {
                    class215.method1544(var18, var17, class15.field238[var15], arg2, 116);
                }
                if (class204.field3580 <= var16) {
                    class215.method1544(var18, var17, class15.field238[var16], arg2, -18);
                }
            }
        }
    }
}
