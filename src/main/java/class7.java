import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class7 extends class172 {

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public static int field63 = 0;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "Ljava/lang/String;")
    public static String field69 = "purple:";

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "Ljava/lang/String;")
    public static String field67 = "Loading interfaces - ";

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "Ljava/lang/String;")
    public static String field72 = "wave:";

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "Ljl;")
    public static class332 field73 = new class332(64);

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "Lvl;")
    private class164 field66;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lia;IIIIIIZ)V", line = 5)
    public static final void method26(class15 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field172.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field172[var9] - class291.field4713;
            int var11 = arg0.field177[var9] - class66.field1175;
            int var12 = arg0.field174[var9] - class36.field550;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field176 != null) {
                class15.field170[var9] = var13;
                class15.field171[var9] = var16;
                class15.field162[var9] = var17;
            }
            class15.field169[var9] = (var13 << 9) / var17 + class153.field2436;
            class15.field167[var9] = (var16 << 9) / var17 + class153.field2441;
        }
        class153.field2434 = 0;
        int var19 = arg0.field159.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field159[var20];
            int var22 = arg0.field160[var20];
            int var23 = arg0.field168[var20];
            int var24 = class15.field169[var21];
            int var25 = class15.field169[var22];
            int var26 = class15.field169[var23];
            int var27 = class15.field167[var21];
            int var28 = class15.field167[var22];
            int var29 = class15.field167[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class253.field4274 && class20.method121(class296.field4759 + class153.field2436, class235.field3908 + class153.field2441, var27, var28, var29, var24, var25, var26)) {
                    class295.field4754 = arg5;
                    class74.field1266 = arg6;
                }
                if (!class42.field607 && !arg7) {
                    class153.field2433 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class153.field2442 || var25 > class153.field2442 || var26 > class153.field2442) {
                        class153.field2433 = true;
                    }
                    if (arg0.field176 == null || arg0.field176[var20] == -1) {
                        if (arg0.field163[var20] != 12345678) {
                            class153.method1194(var27, var28, var29, var24, var25, var26, arg0.field163[var20], arg0.field161[var20], arg0.field179[var20]);
                        }
                    } else if (!class75.field1272) {
                        int var30 = class153.field2439.method770(arg0.field176[var20], -70);
                        class153.method1194(var27, var28, var29, var24, var25, var26, class286.method2084(var30, arg0.field163[var20]), class286.method2084(var30, arg0.field161[var20]), class286.method2084(var30, arg0.field179[var20]));
                    } else if (arg0.field175) {
                        class153.method1182(var27, var28, var29, var24, var25, var26, arg0.field163[var20], arg0.field161[var20], arg0.field179[var20], class15.field170[0], class15.field170[1], class15.field170[3], class15.field171[0], class15.field171[1], class15.field171[3], class15.field162[0], class15.field162[1], class15.field162[3], arg0.field176[var20]);
                    } else {
                        class153.method1182(var27, var28, var29, var24, var25, var26, arg0.field163[var20], arg0.field161[var20], arg0.field179[var20], class15.field170[var21], class15.field170[var22], class15.field170[var23], class15.field171[var21], class15.field171[var22], class15.field171[var23], class15.field162[var21], class15.field162[var22], class15.field162[var23], arg0.field176[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILqm;)V", line = 117)
    private final void method27(int arg0, int arg1, class227 arg2) {
        if (arg1 == 249) {
            int var4 = arg2.method1720((byte) -50);
            if (this.field66 == null) {
                int var5 = class206.method1575(var4, (byte) 99);
                this.field66 = new class164(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1720((byte) -128) == 1;
                int var8 = arg2.method1736(255);
                class45 var9;
                if (var7) {
                    var9 = new class109(arg2.method1758((byte) 77));
                } else {
                    var9 = new class301(arg2.method1715((byte) -76));
                }
                this.field66.method1273(1, (long) var8, var9);
            }
        }
        if (arg0 == -20556) {
            field71++;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIZ)I", line = 165)
    public final int method28(int arg0, int arg1, boolean arg2) {
        field68++;
        if (this.field66 == null) {
            return arg1;
        }
        if (arg2) {
            this.method30((class227) null, (byte) -19);
        }
        class301 var4 = (class301) this.field66.method1268(-87, (long) arg0);
        return var4 == null ? arg1 : var4.field4846;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(CB)C", line = 184)
    public static final char method29(char arg0, byte arg1) {
        field62++;
        if (arg0 == 'µ' || arg0 == 'ƒ') {
            return arg0;
        } else {
            if (arg1 < 93) {
                method34(-12);
            }
            return Character.toTitleCase(arg0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lqm;B)V", line = 206)
    public final void method30(class227 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1720((byte) -127);
            if (var3 == 0) {
                if (arg1 >= -111) {
                    method34(-82);
                }
                field65++;
                return;
            }
            this.method27(-20556, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;", line = 224)
    public final String method31(String arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            field67 = (String) null;
        }
        field60++;
        if (this.field66 == null) {
            return arg0;
        } else {
            class109 var4 = (class109) this.field66.method1268(116, (long) arg1);
            return var4 == null ? arg0 : var4.field1803;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIZI)I", line = 248)
    public static final int method32(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (!arg5) {
            method26((class15) null, -19, 24, -124, -17, -40, -112, false);
        }
        field64++;
        if ((arg3 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg6;
            arg6 = var7;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 1 + 7 - arg2 - arg1;
        } else {
            return 8 - arg6 - arg0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IFIBZIII)[I", line = 288)
    public static final int[] method33(int arg0, float arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field61++;
        if (arg3 != -40) {
            return (int[]) null;
        }
        int[] var8 = new int[arg0];
        class193 var9 = new class193();
        var9.field3078 = (int) (arg1 * 4096.0F);
        var9.field3070 = arg5;
        var9.field3085 = arg4;
        var9.field3076 = arg2;
        var9.field3071 = arg6;
        var9.field3073 = arg7;
        var9.method553((byte) -123);
        class57.method464(0, arg0, 1);
        var9.method1502(var8, 0, (byte) 123);
        return var8;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V", line = 314)
    public static void method34(int arg0) {
        if (arg0 != 16) {
            field73 = (class332) null;
        }
        field67 = null;
        field69 = null;
        field73 = null;
        field72 = null;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)Lnc;", line = 327)
    public static final class104 method35(byte arg0) {
        field70++;
        if (arg0 >= -70) {
            field67 = (String) null;
        }
        return class174.field2777;
    }
}
