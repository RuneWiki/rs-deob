import java.awt.Container;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class58 extends RuntimeException {

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Ljava/lang/Throwable;")
    public Throwable field987;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Ljava/lang/String;")
    public String field983;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field979 = 64;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "[I")
    public static int[] field988 = new int[256];

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lmb;")
    public static class160 field990;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "J")
    private static long field993;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Lcf;")
    public static class93 field994;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "[I")
    public static int[] field995;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Z")
    public static boolean field991;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Lhg;")
    public static class177 field982;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lhg;")
    public static class177 field989;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "[Ldh;")
    public static class120[] field996;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZIZII)V")
    public static final void method332(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field981++;
        if (arg1 == 3) {
            method332(-1, class180.field3168, true, arg3, true, 0, -1);
            return;
        }
        Container var7;
        if (class126.field2236 != null) {
            var7 = class126.field2236;
        } else if (class246.field4432 == null) {
            var7 = class169.field2967.field5113;
        } else {
            var7 = class246.field4432;
        }
        class189.field3465 = var7.getSize().width;
        class47.field756 = var7.getSize().height;
        if (class246.field4432 == var7) {
            Insets var8 = class246.field4432.getInsets();
            class189.field3465 -= var8.right + var8.left;
            class47.field756 -= var8.top + var8.bottom;
        }
        if (arg1 < 2) {
            class150.field2629 = 765;
            class169.field2968 = 503;
            class34.field537 = 0;
            class112.field1920 = (class189.field3465 - 765) / 2;
        } else {
            class150.field2629 = class189.field3465;
            class169.field2968 = class47.field756;
            class34.field537 = 0;
            class112.field1920 = 0;
        }
        if (arg2) {
            class252.method1712(class190.field3481, (byte) -52);
            class155.method1103((byte) 109, class190.field3481);
            if (class260.field4670 != null) {
                class260.field4670.method480(false, class190.field3481);
            }
            class11.field157.method495(-13039);
            class1.method2(class190.field3481, false);
            class235.method1608(class190.field3481, (byte) -15);
            if (class260.field4670 != null) {
                class260.field4670.method481((byte) 121, class190.field3481);
            }
        } else {
            class190.field3481.setSize(class150.field2629, class169.field2968);
            if (class246.field4432 == var7) {
                Insets var9 = class246.field4432.getInsets();
                class190.field3481.setLocation(class112.field1920 + var9.left, class34.field537 + var9.top);
            } else {
                class190.field3481.setLocation(class112.field1920, class34.field537);
            }
        }
        if (arg1 > arg5) {
            method332(-1, 0, true, arg3, true, 0, -1);
            return;
        }
        class168.field2956 = !class13.method57(arg5 ^ 0x935);
        if (class69.field1262 != -1) {
            class171.method1229(true, arg5 + 58);
        }
        if (class92.field1625 != null && (class199.field3609 == 30 || class199.field3609 == 25)) {
            class135.method982((byte) 33);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class25.field314[var10] = true;
        }
        class282.field5062 = true;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)I")
    public static int method333(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lhg;Lhg;ILhg;)V")
    public static final void method334(class177 arg0, class177 arg1, int arg2, class177 arg3) {
        class38.field569 = arg1;
        if (arg2 != 0) {
            method334((class177) null, (class177) null, 56, (class177) null);
        }
        field985++;
        class60.field1018 = arg3;
        class14.field184 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static void method335(boolean arg0) {
        field990 = null;
        field982 = null;
        field995 = null;
        field994 = null;
        field996 = null;
        field988 = null;
        if (!arg0) {
            method334((class177) null, (class177) null, 90, (class177) null);
        }
        field989 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field980++;
        int var8 = arg2;
        if (arg6 != -9) {
            method335(false);
        }
        int var9 = 0;
        int var10 = arg5 - arg3;
        int var11 = arg2 - arg3;
        int var12 = 0;
        int var13 = arg2 * arg2;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var10 * var10;
        int var17 = var14 << 1;
        int var18 = var15 << 1;
        int var19 = var13 << 1;
        int var20 = var16 << 1;
        int var21 = arg2 << 1;
        int var22 = (1 - var21) * var14 + var19;
        int var23 = var11 << 1;
        int var24 = var13 - ((var21 - 1) * var17);
        int var25 = var15 - ((var23 - 1) * var20);
        int var26 = (1 - var23) * var16 + var18;
        int var27 = var16 << 2;
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var19 * 3;
        int var31 = var15 << 2;
        int var32 = (var21 - 3) * var17;
        int var33 = (var23 - 3) * var20;
        int var34 = var18 * 3;
        int var35 = (arg2 - 1) * var29;
        int var36 = var28;
        int var37 = var31;
        if (arg1 >= class26.field342 && class271.field4820 >= arg1) {
            int[] var38 = class76.field1406[arg1];
            int var39 = class141.method1027(class277.field4967, arg4 - arg5, false, class147.field2593);
            int var40 = class141.method1027(class277.field4967, arg4 + arg5, false, class147.field2593);
            int var41 = class141.method1027(class277.field4967, arg4 - var10, false, class147.field2593);
            int var42 = class141.method1027(class277.field4967, arg4 + var10, false, class147.field2593);
            method337(var39, var38, arg7, var41, false);
            method337(var41, var38, arg0, var42, false);
            method337(var42, var38, arg7, var40, false);
        }
        int var43 = (var11 - 1) * var27;
        while (var8 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var24 += var36;
                    var36 += var28;
                    var9++;
                    var22 += var30;
                    var30 += var28;
                }
            }
            if (var24 < 0) {
                var9++;
                var22 += var30;
                var24 += var36;
                var36 += var28;
                var30 += var28;
            }
            boolean var44 = var8 <= var11;
            var8--;
            if (var44) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var12++;
                        var26 += var34;
                        var25 += var37;
                        var37 += var31;
                        var34 += var31;
                    }
                }
                if (var25 < 0) {
                    var12++;
                    var26 += var34;
                    var34 += var31;
                    var25 += var37;
                    var37 += var31;
                }
                var26 += -var43;
                var25 += -var33;
                var33 -= var27;
                var43 -= var27;
            }
            var24 += -var32;
            int var45 = arg1 - var8;
            var22 += -var35;
            var35 -= var29;
            var32 -= var29;
            int var46 = arg1 + var8;
            if (class26.field342 <= var46 && class271.field4820 >= var45) {
                int var47 = class141.method1027(class277.field4967, arg4 + var9, false, class147.field2593);
                int var48 = class141.method1027(class277.field4967, arg4 - var9, false, class147.field2593);
                if (var44) {
                    int var49 = class141.method1027(class277.field4967, arg4 + var12, false, class147.field2593);
                    int var50 = class141.method1027(class277.field4967, arg4 - var12, false, class147.field2593);
                    if (class26.field342 <= var45) {
                        int[] var51 = class76.field1406[var45];
                        method337(var48, var51, arg7, var50, false);
                        method337(var50, var51, arg0, var49, false);
                        method337(var49, var51, arg7, var47, false);
                    }
                    if (class271.field4820 >= var46) {
                        int[] var52 = class76.field1406[var46];
                        method337(var48, var52, arg7, var50, false);
                        method337(var50, var52, arg0, var49, false);
                        method337(var49, var52, arg7, var47, false);
                    }
                } else {
                    if (class26.field342 <= var45) {
                        method337(var48, class76.field1406[var45], arg7, var47, false);
                    }
                    if (class271.field4820 >= var46) {
                        method337(var48, class76.field1406[var46], arg7, var47, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[IIIZ)V")
    public static final void method337(int arg0, int[] arg1, int arg2, int arg3, boolean arg4) {
        arg0--;
        field986++;
        if (arg4) {
            field988 = null;
        }
        int var13 = arg3 - 1;
        int var5 = var13 - 7;
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg1[var6] = arg2;
            int var7 = var6 + 1;
            arg1[var7] = arg2;
            int var8 = var7 + 1;
            arg1[var8] = arg2;
            int var9 = var8 + 1;
            arg1[var9] = arg2;
            int var10 = var9 + 1;
            arg1[var10] = arg2;
            int var11 = var10 + 1;
            arg1[var11] = arg2;
            int var12 = var11 + 1;
            arg1[var12] = arg2;
            arg0 = var12 + 1;
            arg1[arg0] = arg2;
        }
        while (var13 > arg0) {
            arg0++;
            arg1[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I")
    public static final int method338(byte arg0) {
        field978++;
        try {
            if (class188.field3455 == 0) {
                if (field993 > class28.method155((byte) 98) - 5000L) {
                    return 0;
                }
                class57.field957 = class169.field2967.method1959((byte) -20, class275.field4930, class174.field3024);
                class145.field2541 = class28.method155((byte) -117);
                class188.field3455 = 1;
            }
            if ((class145.field2541 + 30000L) < class28.method155((byte) -29)) {
                return class71.method478((byte) -82, 1000);
            }
            if (class188.field3455 == 1) {
                if (class57.field957.field290 == 2) {
                    return class71.method478((byte) -86, 1001);
                }
                if (class57.field957.field290 != 1) {
                    return -1;
                }
                class92.field1625 = new class130((Socket) class57.field957.field292, class169.field2967);
                class57.field957 = null;
                class285.field5105.field5027 = 0;
                int var1 = 0;
                if (class48.field775) {
                    var1 = class8.field113;
                }
                class285.field5105.method1916(75, 62);
                class285.field5105.method1886(var1, 2);
                class92.field1625.method945(class285.field5105.field5011, (byte) 127, 0, class285.field5105.field5027);
                if (class237.field4235 != null) {
                    class237.field4235.method1714((byte) 91);
                }
                if (class11.field155 != null) {
                    class11.field155.method1714((byte) 91);
                }
                int var2 = class92.field1625.method951(0);
                if (class237.field4235 != null) {
                    class237.field4235.method1714((byte) 91);
                }
                if (class11.field155 != null) {
                    class11.field155.method1714((byte) 91);
                }
                if (var2 != 0) {
                    return class71.method478((byte) -98, var2);
                }
                class188.field3455 = 2;
            }
            if (arg0 != -44) {
                field989 = null;
            }
            if (class188.field3455 == 2) {
                if (class92.field1625.method950(false) < 2) {
                    return -1;
                }
                class185.field3411 = class92.field1625.method951(0);
                class185.field3411 <<= 0x8;
                class185.field3411 += class92.field1625.method951(0);
                class188.field3455 = 3;
                class19.field263 = new byte[class185.field3411];
                class257.field4631 = 0;
            }
            if (class188.field3455 != 3) {
                return -1;
            }
            int var3 = class92.field1625.method950(false);
            if (var3 < 1) {
                return -1;
            }
            if ((class185.field3411 - class257.field4631) < var3) {
                var3 = class185.field3411 - class257.field4631;
            }
            class92.field1625.method946(class19.field263, var3, class257.field4631, 1);
            class257.field4631 += var3;
            if (class185.field3411 > class257.field4631) {
                return -1;
            } else if (class34.method199(class19.field263, 1)) {
                class86.field1559 = new class288[class117.field2090];
                int var4 = 0;
                for (int var5 = class152.field2676; var5 <= field997; var5++) {
                    class288 var6 = class130.method948(true, var5);
                    if (var6 != null) {
                        class86.field1559[var4++] = var6;
                    }
                }
                class92.field1625.method947((byte) 26);
                class188.field3455 = 0;
                class19.field263 = null;
                class87.field1566 = 0;
                class92.field1625 = null;
                field993 = class28.method155((byte) 100);
                return 0;
            } else {
                return class71.method478((byte) -97, 1002);
            }
        } catch (IOException var7) {
            return class71.method478((byte) -112, 1003);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class58(Throwable arg0, String arg1) {
        this.field987 = arg0;
        this.field983 = arg1;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field988[var0] = var1;
        }
        field990 = new class160();
        field992 = 0;
        field993 = 0L;
        field994 = class147.method1066("Musik)2Engine vorbereitet)3", -48);
        field995 = new int[32768];
        field991 = false;
    }
}
