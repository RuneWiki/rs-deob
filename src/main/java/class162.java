import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class162 extends class155 {

    @OriginalMember(owner = "client!df", name = "K", descriptor = "Lvj;")
    public class179 field2513;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field2510 = 0;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "[I")
    public static int[] field2518 = new int[2048];

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
    public static void method1171(int arg0) {
        field2518 = null;
        if (arg0 != -26229) {
            method1173((byte) -32);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)V")
    public static final void method1172(int arg0, byte arg1) {
        field2517++;
        class238 var2 = class199.field2924;
        synchronized (class199.field2924) {
            class181.field2723 = arg0;
        }
        int var3 = -58 / ((arg1 + 26) / 55);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public static final void method1173(byte arg0) {
        field2511++;
        for (int var1 = -1; var1 < class103.field1791; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = field2518[var1];
            }
            class207 var3 = class92.field1475[var2];
            if (var3 != null) {
                class261.method1791(128, var3.method1467(0), var3);
            }
        }
        if (arg0 >= -20) {
            method1173((byte) 77);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg7;
        field2512++;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg0 - arg2;
        int var12 = arg0 * arg0;
        int var13 = arg7 - arg2;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var13 * var13;
        int var17 = var14 << 1;
        int var18 = var12 << 1;
        int var19 = var16 << 1;
        int var20 = var13 << 1;
        int var21 = var15 << 1;
        int var22 = arg7 << 1;
        int var23 = (1 - var20) * var15 + var19;
        int var24 = var14 << 2;
        int var25 = var16 - ((var20 - 1) * var21);
        int var26 = 33 / ((57 - arg5) / 34);
        int var27 = (1 - var22) * var12 + var17;
        int var28 = var14 - (var22 - 1) * var18;
        int var29 = var12 << 2;
        int var30 = var15 << 2;
        int var31 = var16 << 2;
        int var32 = var17 * 3;
        int var33 = (var20 - 3) * var21;
        int var34 = (var22 - 3) * var18;
        int var35 = var19 * 3;
        int var36 = var24;
        int var37 = (arg7 - 1) * var29;
        int var38 = var31;
        if (class73.field1156 <= arg4 && arg4 <= class59.field859) {
            int[] var39 = class104.field1795[arg4];
            int var40 = class289.method1972(class264.field4230, (byte) 122, arg1 - arg0, class273.field4418);
            int var41 = class289.method1972(class264.field4230, (byte) 122, arg0 + arg1, class273.field4418);
            int var42 = class289.method1972(class264.field4230, (byte) 122, arg1 - var11, class273.field4418);
            int var43 = class289.method1972(class264.field4230, (byte) 122, arg1 + var11, class273.field4418);
            class89.method669(var39, arg3, var42, var40, (byte) -126);
            class89.method669(var39, arg6, var43, var42, (byte) -125);
            class89.method669(var39, arg3, var41, var43, (byte) -128);
        }
        int var44 = (var13 - 1) * var30;
        while (var8 > 0) {
            if (var27 < 0) {
                while (var27 < 0) {
                    var10++;
                    var28 += var36;
                    var36 += var24;
                    var27 += var32;
                    var32 += var24;
                }
            }
            boolean var45 = var13 >= var8;
            var8--;
            if (var45) {
                if (var23 < 0) {
                    while (var23 < 0) {
                        var23 += var35;
                        var35 += var31;
                        var25 += var38;
                        var38 += var31;
                        var9++;
                    }
                }
                if (var25 < 0) {
                    var25 += var38;
                    var23 += var35;
                    var35 += var31;
                    var38 += var31;
                    var9++;
                }
                var25 += -var33;
                var33 -= var30;
                var23 += -var44;
                var44 -= var30;
            }
            int var46 = arg4 - var8;
            if (var28 < 0) {
                var27 += var32;
                var10++;
                var28 += var36;
                var36 += var24;
                var32 += var24;
            }
            var28 += -var34;
            var27 += -var37;
            var37 -= var29;
            var34 -= var29;
            int var47 = arg4 + var8;
            if (var47 >= class73.field1156 && var46 <= class59.field859) {
                int var48 = class289.method1972(class264.field4230, (byte) 122, arg1 + var10, class273.field4418);
                int var49 = class289.method1972(class264.field4230, (byte) 122, arg1 - var10, class273.field4418);
                if (var45) {
                    int var50 = class289.method1972(class264.field4230, (byte) 122, arg1 + var9, class273.field4418);
                    int var51 = class289.method1972(class264.field4230, (byte) 122, arg1 - var9, class273.field4418);
                    if (var46 >= class73.field1156) {
                        int[] var52 = class104.field1795[var46];
                        class89.method669(var52, arg3, var51, var49, (byte) -126);
                        class89.method669(var52, arg6, var50, var51, (byte) -125);
                        class89.method669(var52, arg3, var48, var50, (byte) -127);
                    }
                    if (class59.field859 >= var47) {
                        int[] var53 = class104.field1795[var47];
                        class89.method669(var53, arg3, var51, var49, (byte) -128);
                        class89.method669(var53, arg6, var50, var51, (byte) -128);
                        class89.method669(var53, arg3, var48, var50, (byte) -126);
                    }
                } else {
                    if (var46 >= class73.field1156) {
                        class89.method669(class104.field1795[var46], arg3, var48, var49, (byte) -125);
                    }
                    if (class59.field859 >= var47) {
                        class89.method669(class104.field1795[var47], arg3, var48, var49, (byte) -128);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lvj;)V")
    public class162(class179 arg0) {
        this.field2513 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)I")
    public static final int method1175(byte arg0) {
        field2516++;
        try {
            if (class267.field4265 == 0) {
                if (class247.field3649 > (class3.method14(29853) - 5000L)) {
                    return 0;
                }
                class81.field1302 = class273.field4426.method936(38, class277.field4479, class160.field2483);
                class197.field2901 = class3.method14(29853);
                class267.field4265 = 1;
            }
            if (class3.method14(29853) > class197.field2901 + 30000L) {
                return class231.method1603(1000, (byte) -105);
            }
            if (class267.field4265 == 1) {
                if (class81.field1302.field936 == 2) {
                    return class231.method1603(1001, (byte) 99);
                }
                if (class81.field1302.field936 != 1) {
                    return -1;
                }
                class281.field4537 = new class203((Socket) class81.field1302.field932, class273.field4426);
                class81.field1302 = null;
                class144.field2338.field735 = 0;
                int var1 = 0;
                if (class243.field3576) {
                    var1 = class172.field2629;
                }
                class144.field2338.method360(23, 25759);
                class144.field2338.method385(var1, 455748840);
                class281.field4537.method1435(9, 0, class144.field2338.field758, class144.field2338.field735);
                if (class16.field170 != null) {
                    class16.field170.method2011(-1);
                }
                if (class113.field1879 != null) {
                    class113.field1879.method2011(-1);
                }
                int var2 = class281.field4537.method1441(3755);
                if (class16.field170 != null) {
                    class16.field170.method2011(-1);
                }
                if (class113.field1879 != null) {
                    class113.field1879.method2011(-1);
                }
                if (var2 != 0) {
                    return class231.method1603(var2, (byte) -119);
                }
                class267.field4265 = 2;
            }
            if (class267.field4265 == 2) {
                if (class281.field4537.method1434(0) < 2) {
                    return -1;
                }
                class209.field3089 = class281.field4537.method1441(3755);
                class209.field3089 <<= 0x8;
                class209.field3089 += class281.field4537.method1441(3755);
                class267.field4265 = 3;
                class235.field3440 = 0;
                class159.field2482 = new byte[class209.field3089];
            }
            if (arg0 < 70) {
                method1171(56);
            }
            if (class267.field4265 != 3) {
                return -1;
            }
            int var3 = class281.field4537.method1434(0);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class209.field3089 - class235.field3440) {
                var3 = class209.field3089 - class235.field3440;
            }
            class281.field4537.method1443(-123, class235.field3440, class159.field2482, var3);
            class235.field3440 += var3;
            if (class235.field3440 < class209.field3089) {
                return -1;
            } else if (class163.method1176(class159.field2482, (byte) -102)) {
                class290.field4625 = new class229[class224.field3291];
                int var4 = 0;
                for (int var5 = class51.field702; var5 <= class12.field142; var5++) {
                    class229 var6 = class22.method154(var5, false);
                    if (var6 != null) {
                        class290.field4625[var4++] = var6;
                    }
                }
                class281.field4537.method1440(-1);
                class223.field3267 = 0;
                class159.field2482 = null;
                class281.field4537 = null;
                class267.field4265 = 0;
                class247.field3649 = class3.method14(29853);
                return 0;
            } else {
                return class231.method1603(1002, (byte) -111);
            }
        } catch (IOException var7) {
            return class231.method1603(1003, (byte) -111);
        }
    }
}
