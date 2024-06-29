import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class281 {

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "[J")
    public static long[] field4245 = new long[32];

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "Lct;")
    public static class285 field4242 = new class285(51, 6);

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field4249 = 0;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field4252 = 999999;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field4253 = 50;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "[I")
    public static int[] field4254 = new int[field4253];

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "[I")
    public static int[] field4246 = new int[field4253];

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field4251 = new String[field4253];

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "[I")
    public static int[] field4247 = new int[field4253];

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "[I")
    public static int[] field4255 = new int[field4253];

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "[I")
    public static int[] field4250 = new int[field4253];

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "[I")
    public static int[] field4248 = new int[field4253];

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILvg;)V")
    public static final void method1805(int arg0, class51 arg1) {
        field4238++;
        int var2 = 0;
        arg1.method378((byte) 100);
        for (int var3 = 0; var3 < class299.field4466; var3++) {
            int var15 = class161.field2218[var3];
            if ((class52.field748[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class52.field748[var15] = (byte) class347.method2139(class52.field748[var15], 2);
                } else {
                    int var16 = arg1.method369((byte) 126, 1);
                    if (var16 == 0) {
                        var2 = class12.method117((byte) 53, arg1);
                        class52.field748[var15] = (byte) class347.method2139(class52.field748[var15], 2);
                    } else {
                        class301.method1875(var15, -30827, arg1);
                    }
                }
            }
        }
        arg1.method371(true);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method378((byte) 111);
        for (int var4 = 0; var4 < class299.field4466; var4++) {
            int var13 = class161.field2218[var4];
            if ((class52.field748[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class52.field748[var13] = (byte) class347.method2139(class52.field748[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method369((byte) 126, 1);
                    if (var14 == 0) {
                        var2 = class12.method117((byte) 67, arg1);
                        class52.field748[var13] = (byte) class347.method2139(class52.field748[var13], 2);
                    } else {
                        class301.method1875(var13, -30827, arg1);
                    }
                }
            }
        }
        arg1.method371(true);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method378((byte) 124);
        for (int var5 = 0; var5 < class371.field5585; var5++) {
            int var11 = class83.field1169[var5];
            if ((class52.field748[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class52.field748[var11] = (byte) class347.method2139(class52.field748[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method369((byte) 126, 1);
                    if (var12 == 0) {
                        var2 = class12.method117((byte) 45, arg1);
                        class52.field748[var11] = (byte) class347.method2139(class52.field748[var11], 2);
                    } else if (class335.method2054(5, var11, arg1)) {
                        class52.field748[var11] = (byte) class347.method2139(class52.field748[var11], 2);
                    }
                }
            }
        }
        arg1.method371(true);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method378((byte) 106);
        int var6 = 0;
        if (arg0 >= -13) {
            return;
        }
        while (var6 < class371.field5585) {
            int var9 = class83.field1169[var6];
            if ((class52.field748[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class52.field748[var9] = (byte) class347.method2139(class52.field748[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method369((byte) 126, 1);
                    if (var10 == 0) {
                        var2 = class12.method117((byte) 92, arg1);
                        class52.field748[var9] = (byte) class347.method2139(class52.field748[var9], 2);
                    } else if (class335.method2054(5, var9, arg1)) {
                        class52.field748[var9] = (byte) class347.method2139(class52.field748[var9], 2);
                    }
                }
            }
            var6++;
        }
        arg1.method371(true);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class299.field4466 = 0;
        class371.field5585 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class52.field748[var7] = (byte) (class52.field748[var7] >> 1);
            class257 var8 = class40.field565[var7];
            if (var8 == null) {
                class83.field1169[class371.field5585++] = var7;
            } else {
                class161.field2218[class299.field4466++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)V")
    public static final void method1806(boolean arg0, byte arg1) {
        field4244++;
        if (arg0 && class189.field2880 != null) {
            class385.field5695 = class189.field2880.field166;
        } else {
            class385.field5695 = -1;
        }
        class189.field2880 = null;
        class314.field4720 = null;
        class286.field4374 = 0;
        class330.field4954 = null;
        class189.method1314();
        class189.field2885.method2459(300);
        if (arg1 >= -18) {
            field4253 = -28;
        }
        class294.field4429 = -1;
        class350.field5345 = null;
        class71.field959 = null;
        class303.field4512 = -1;
        class301.field4487 = null;
        class128.field1785 = null;
        class99.field1406 = null;
        class189.field2887 = null;
        class5.field88 = null;
        class95.field1362 = null;
        class441.field6231 = null;
        class337.field5042 = null;
        class189.field2877.method1114((byte) 79);
        class189.field2878.method2244(64, 64, 64);
        class189.field2877.method1112(128, 128, 64);
        class189.field2884.method339(-119, 64);
        class180.field2687.method1512(16711680, 64);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4240++;
        int var7 = class352.method2172(arg2, class296.field4443, class176.field2503, 0);
        int var8 = class352.method2172(arg3, class296.field4443, class176.field2503, arg1 + 30468);
        int var9 = class352.method2172(arg6, class119.field1643, class293.field4420, 0);
        int var10 = class352.method2172(arg4, class119.field1643, class293.field4420, arg1 + 30468);
        int var11 = class352.method2172(arg0 + arg2, class296.field4443, class176.field2503, arg1 ^ arg1);
        int var12 = class352.method2172(arg3 - arg0, class296.field4443, class176.field2503, arg1 ^ 0xFFFF88FC);
        for (int var13 = var7; var13 < var11; var13++) {
            class345.method2125(false, class49.field723[var13], var9, var10, arg5);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class345.method2125(false, class49.field723[var14], var9, var10, arg5);
        }
        int var15 = class352.method2172(arg0 + arg6, class119.field1643, class293.field4420, 0);
        int var16 = class352.method2172(arg4 - arg0, class119.field1643, class293.field4420, arg1 + 30468);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class49.field723[var17];
            class345.method2125(false, var18, var9, var15, arg5);
            class345.method2125(false, var18, var16, var10, arg5);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI)I")
    public static final int method1808(byte arg0, int arg1) {
        field4239++;
        if (arg0 != -127) {
            field4253 = 46;
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
    public static final void method1809(boolean arg0) {
        class186.field2817 = 0;
        field4241++;
        class451.field6377.method2459(300);
        if (!arg0) {
            method1806(false, (byte) -89);
        }
        class451.field6377.method2453((byte) -110, class87.field1237);
        class186.field2817++;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public static void method1810(int arg0) {
        field4242 = null;
        if (arg0 >= -83) {
            field4253 = 13;
        }
        field4248 = null;
        field4254 = null;
        field4245 = null;
        field4250 = null;
        field4246 = null;
        field4247 = null;
        field4251 = null;
        field4255 = null;
    }
}
