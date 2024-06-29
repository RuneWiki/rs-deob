import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class67 implements Runnable {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Z")
    public boolean field1294 = true;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field1299 = new Object();

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "[I")
    public int[] field1315 = new int[500];

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public int field1317 = 0;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "[I")
    public int[] field1318 = new int[500];

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Lob;")
    private static class141 field1296 = class175.method1195(40, "Dec");

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lob;")
    private static class141 field1298 = class175.method1195(40, "Nov");

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Lob;")
    private static class141 field1300 = class175.method1195(40, "Apr");

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Lna;")
    public static class130 field1304 = null;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Lob;")
    private static class141 field1301 = class175.method1195(40, "Sep");

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "Lob;")
    private static class141 field1307 = class175.method1195(40, "Jul");

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "Lob;")
    private static class141 field1309 = class175.method1195(40, "Feb");

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lob;")
    private static class141 field1305 = class175.method1195(40, "Jan");

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "Lob;")
    private static class141 field1311 = class175.method1195(40, "Jun");

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Lob;")
    private static class141 field1313 = class175.method1195(40, "Oct");

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "Lob;")
    private static class141 field1310 = class175.method1195(40, "Mar");

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Lob;")
    private static class141 field1312 = class175.method1195(40, "May");

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field1316 = 0;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Lob;")
    private static class141 field1297 = class175.method1195(40, "Aug");

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "[Lob;")
    public static class141[] field1302 = new class141[] { field1305, field1309, field1310, field1300, field1312, field1311, field1307, field1297, field1301, field1313, field1298, field1296 };

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "[Lob;")
    public static class141[] field1308 = new class141[8];

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lpe;")
    public static class154 field1295;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "[Lkc;")
    public static class102[] field1314;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lhf;IIIIIII)V")
    public static final void method445(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8;
        int var9 = var8 = (arg6 << 7) - class18.field316;
        int var10;
        int var11 = var10 = (arg7 << 7) - class35.field710;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14;
        int var15 = var14 = var11 + 128;
        int var16 = class110.field2119[arg1][arg6][arg7] - class162.field3145;
        int var17 = class110.field2119[arg1][arg6 + 1][arg7] - class162.field3145;
        int var18 = class110.field2119[arg1][arg6 + 1][arg7 + 1] - class162.field3145;
        int var19 = class110.field2119[arg1][arg6][arg7 + 1] - class162.field3145;
        int var20 = arg4 * var11 + arg5 * var9 >> 16;
        int var21 = arg5 * var11 - arg4 * var9 >> 16;
        int var23 = arg3 * var16 - arg2 * var21 >> 16;
        int var24 = arg2 * var16 + arg3 * var21 >> 16;
        if (var24 < 50) {
            return;
        }
        int var26 = arg4 * var10 + arg5 * var13 >> 16;
        int var27 = arg5 * var10 - arg4 * var13 >> 16;
        int var29 = arg3 * var17 - arg2 * var27 >> 16;
        int var30 = arg2 * var17 + arg3 * var27 >> 16;
        if (var30 < 50) {
            return;
        }
        int var32 = arg4 * var15 + arg5 * var12 >> 16;
        int var33 = arg5 * var15 - arg4 * var12 >> 16;
        int var35 = arg3 * var18 - arg2 * var33 >> 16;
        int var36 = arg2 * var18 + arg3 * var33 >> 16;
        if (var36 < 50) {
            return;
        }
        int var38 = arg4 * var14 + arg5 * var8 >> 16;
        int var39 = arg5 * var14 - arg4 * var8 >> 16;
        int var41 = arg3 * var19 - arg2 * var39 >> 16;
        int var42 = arg2 * var19 + arg3 * var39 >> 16;
        if (var42 < 50) {
            return;
        }
        int var44 = (var20 << 9) / var24 + class44.field847;
        int var45 = (var23 << 9) / var24 + class44.field844;
        int var46 = (var26 << 9) / var30 + class44.field847;
        int var47 = (var29 << 9) / var30 + class44.field844;
        int var48 = (var32 << 9) / var36 + class44.field847;
        int var49 = (var35 << 9) / var36 + class44.field844;
        int var50 = (var38 << 9) / var42 + class44.field847;
        int var51 = (var41 << 9) / var42 + class44.field844;
        class44.field845 = 0;
        if ((var47 - var51) * (var48 - var50) - (var46 - var50) * (var49 - var51) > 0) {
            if (class27.field515 && class179.method1215(class32.field671, client.field605, var49, var51, var47, var48, var50, var46)) {
                class202.field3823 = arg6;
                class27.field508 = arg7;
            }
            class44.field842 = false;
            if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > class44.field849 || var50 > class44.field849 || var46 > class44.field849) {
                class44.field842 = true;
            }
            if (arg0.field1539 == -1) {
                if (arg0.field1553 != 12345678) {
                    class44.method292(var49, var51, var47, var48, var50, var46, arg0.field1553, arg0.field1543, arg0.field1540);
                }
            } else if (class29.field565) {
                int var52 = class44.field857.method959(arg0.field1539, -30480);
                class44.method292(var49, var51, var47, var48, var50, var46, class26.method182(var52, arg0.field1553), class26.method182(var52, arg0.field1543), class26.method182(var52, arg0.field1540));
            } else if (arg0.field1547) {
                class44.method287(var49, var51, var47, var48, var50, var46, arg0.field1553, arg0.field1543, arg0.field1540, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field1539);
            } else {
                class44.method287(var49, var51, var47, var48, var50, var46, arg0.field1553, arg0.field1543, arg0.field1540, var32, var38, var26, var35, var41, var29, var36, var42, var30, arg0.field1539);
            }
        }
        if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
            return;
        }
        if (class27.field515 && class179.method1215(class32.field671, client.field605, var45, var47, var51, var44, var46, var50)) {
            class202.field3823 = arg6;
            class27.field508 = arg7;
        }
        class44.field842 = false;
        if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > class44.field849 || var46 > class44.field849 || var50 > class44.field849) {
            class44.field842 = true;
        }
        if (arg0.field1539 != -1) {
            if (!class29.field565) {
                class44.method287(var45, var47, var51, var44, var46, var50, arg0.field1534, arg0.field1540, arg0.field1543, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field1539);
                return;
            }
            int var53 = class44.field857.method959(arg0.field1539, -30480);
            class44.method292(var45, var47, var51, var44, var46, var50, class26.method182(var53, arg0.field1534), class26.method182(var53, arg0.field1540), class26.method182(var53, arg0.field1543));
        } else if (arg0.field1534 != 12345678) {
            class44.method292(var45, var47, var51, var44, var46, var50, arg0.field1534, arg0.field1540, arg0.field1543);
            return;
        }
    }

    @OriginalMember(owner = "client!gg", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1294) {
            Object var1 = this.field1299;
            synchronized (this.field1299) {
                if (this.field1317 < 500) {
                    this.field1318[this.field1317] = class146.field2794;
                    this.field1315[this.field1317] = class174.field3452;
                    this.field1317++;
                }
            }
            class93.method638(50L, (byte) -8);
        }
        field1306++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZZ)V")
    public static final void method446(boolean arg0, boolean arg1) {
        if (class114.field2176.field3889 >> 7 == class224.field4233 && class114.field2176.field3854 >> 7 == class221.field4194) {
            class224.field4233 = 0;
        }
        if (arg1) {
            method446(true, false);
        }
        int var2 = class184.field3587;
        field1319++;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class38 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class114.field2176;
            } else {
                var6 = class116.field2231[class188.field3647[var3]];
                var4 = (long) class188.field3647[var3] << 32;
            }
            if (var6 != null && var6.method251((byte) 90)) {
                int var7 = var6.field3889 >> 7;
                var6.field759 = false;
                if ((class8.field128 && class184.field3587 > 50 || class184.field3587 > 200) && !arg0 && var6.field3874 == var6.field3828) {
                    var6.field759 = true;
                }
                int var8 = var6.field3854 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field756 == null || var6.field753 > class20.field344 || var6.field746 <= class20.field344) {
                        if ((var6.field3889 & 0x7F) == 64 && (var6.field3854 & 0x7F) == 64) {
                            if (class218.field4135[var7][var8] == class45.field866) {
                                continue;
                            }
                            class218.field4135[var7][var8] = class45.field866;
                        }
                        var6.field3864 = class206.method1360(class66.field1287, var6.field3889, (byte) 40, var6.field3854);
                        class108.method715(class66.field1287, var6.field3889, var6.field3854, var6.field3864, 60, var6, var6.field3845, var4, var6.field3876);
                    } else {
                        var6.field759 = false;
                        var6.field3864 = class206.method1360(class66.field1287, var6.field3889, (byte) 40, var6.field3854);
                        class21.method129(class66.field1287, var6.field3889, var6.field3854, var6.field3864, var6, var6.field3845, var4, var6.field774, var6.field771, var6.field757, var6.field763);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static void method447(boolean arg0) {
        field1307 = null;
        field1308 = null;
        field1311 = null;
        field1300 = null;
        field1309 = null;
        field1297 = null;
        if (!arg0) {
            return;
        }
        field1296 = null;
        field1298 = null;
        field1312 = null;
        field1302 = null;
        field1313 = null;
        field1314 = null;
        field1310 = null;
        field1295 = null;
        field1301 = null;
        field1305 = null;
    }
}
