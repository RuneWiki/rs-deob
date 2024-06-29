import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public abstract class class185 extends class693 {

    @OriginalMember(owner = "client!aba", name = "y", descriptor = "S")
    public short field2940;

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "B")
    public byte field2937;

    @OriginalMember(owner = "client!aba", name = "D", descriptor = "S")
    public short field2939;

    @OriginalMember(owner = "client!aba", name = "E", descriptor = "S")
    public short field2945;

    @OriginalMember(owner = "client!aba", name = "K", descriptor = "Z")
    public boolean field2938;

    @OriginalMember(owner = "client!aba", name = "C", descriptor = "S")
    public short field2946;

    @OriginalMember(owner = "client!aba", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field2951 = new String[] { method1742(method1741("6dTr")), method1742(method1741("#?\u00160S")), method1742(method1741("9sY0a\u00199")), method1742(method1741("9sY0kp")), method1742(method1741("9sY0|\u00199")), method1742(method1741("9sY0\u007f\u00199")), method1742(method1741("9sY0jp")), method1742(method1741("9sY0lp")), method1742(method1741("9sY0\u00121\u007fQj\u0010p")), method1742(method1741("9sY0~\u00199")) };

    @OriginalMember(owner = "client!aba", name = "I", descriptor = "Lwea;")
    public static class164 field2943 = new class164();

    @OriginalMember(owner = "client!aba", name = "G", descriptor = "Lwea;")
    public static class164 field2948 = new class164();

    @OriginalMember(owner = "client!aba", name = "L", descriptor = "[S")
    public static short[] field2950 = new short[256];

    @OriginalMember(owner = "client!aba", name = "F", descriptor = "[Lwea;")
    public static class164[] field2949 = new class164[] { field2948, field2943 };

    @OriginalMember(owner = "client!aba", name = "A", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!aba", name = "B", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!aba", name = "M", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!aba", name = "H", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!aba", name = "N", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!aba", name = "J", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILmk;)V")
    public static final void method1735(int arg0, class59 arg1) {
        try {
            ++field2947;
            if (arg1 != null) {
                class439.field6858.method3220(arg1, arg0 ^ arg0);
                ++class320.field5213;
                Object var2 = null;
                class603 var5;
                if (!arg1.field768 && !"".equals(arg1.field760)) {
                    long var3 = arg1.field767;
                    for (var5 = (class603) class324.field5256.method737((byte) -39, var3); var5 != null && !var5.field8710.equals(arg1.field760); var5 = (class603) class324.field5256.method739(true)) {
                    }
                    if (var5 == null) {
                        var5 = (class603) class381.field6128.method302(-79, var3);
                        if (var5 != null && !var5.field8710.equals(arg1.field760)) {
                            var5 = null;
                        }
                        if (var5 == null) {
                            var5 = new class603(arg1.field760);
                        }
                        class324.field5256.method738(var5, var3, -12002);
                        ++class681.field9707;
                    }
                } else {
                    var5 = new class603(arg1.field760);
                    ++class681.field9707;
                }
                if (var5.method4415(false, arg1)) {
                    class83.method851(arg0 ^ -10242, var5);
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2951[2] + arg0 + ',' + (arg1 != null ? field2951[1] : field2951[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BC)Z")
    public static final boolean method1736(byte arg0, char arg1) {
        try {
            if (arg0 != -50) {
                field2948 = null;
            }
            ++field2936;
            return arg1 >= '0' && ~arg1 >= -58;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2951[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(I)Z")
    public final boolean method1737(int arg0) {
        try {
            ++field2935;
            if (arg0 >= -19) {
                this.field2937 = -10;
            }
            for (int var2 = this.field2945; ~var2 >= ~this.field2940; ++var2) {
                for (int var3 = this.field2946; ~var3 >= ~this.field2939; ++var3) {
                    int var4 = -class54.field689 + class297.field4835 + var2;
                    if (~var4 <= -1 && ~class441.field6890.length < ~var4) {
                        int var5 = -class316.field5137 + var3 + class297.field4835;
                        if (~var5 <= -1 && var5 < class441.field6890.length && class441.field6890[var4][var5]) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2951[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(ILha;)Z")
    public final boolean method1738(int arg0, class63 arg1) {
        try {
            ++field2941;
            if (arg0 != 1) {
                field2950 = null;
            }
            return class276.method2369(super.field9974, this.field2946, this.method47(arg1, (byte) -118), this.field2945, (byte) 60, this.field2940, this.field2939);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2951[3] + arg0 + ',' + (arg1 != null ? field2951[1] : field2951[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "([Lih;Z)I")
    public final int method1739(class731[] arg0, boolean arg1) {
        try {
            ++field2944;
            int var3 = 0;
            label139: for (int var4 = this.field2945; ~var4 >= ~this.field2940; ++var4) {
                label137: for (int var5 = this.field2946; ~var5 >= ~this.field2939; ++var5) {
                    long var6 = class328.field5375[super.field9975][var4][var5];
                    long var8 = 0L;
                    while (true) {
                        label132: while (true) {
                            if (var8 > 48L) {
                                continue label137;
                            }
                            int var10 = (int) (var6 >>> (int) var8 & 65535L);
                            if (~var10 >= -1) {
                                continue label137;
                            }
                            class610 var11 = class782.field11417[var10 + -1];
                            for (int var12 = 0; var3 > var12; ++var12) {
                                if (arg0[var12] == var11.field8782) {
                                    var8 += 16L;
                                    continue label132;
                                }
                            }
                            arg0[var3++] = var11.field8782;
                            if (var3 == 4) {
                                break label139;
                            }
                            var8 += 16L;
                        }
                    }
                }
            }
            if (arg1) {
                this.method1737(109);
            }
            for (int var13 = var3; ~var13 > -5; ++var13) {
                arg0[var13] = null;
            }
            if (this.field2937 != 0) {
                int var14 = this.field2945 - class54.field689;
                int var15 = -class316.field5137 + this.field2946;
                short var16;
                int var17;
                int var18;
                short var19;
                if (~this.field2937 != -2) {
                    if (-var14 < var15) {
                        var16 = this.field2946;
                        var17 = this.field2946 - 1;
                        var18 = this.field2945 + -1;
                        var19 = this.field2945;
                    } else {
                        var17 = this.field2946 + 1;
                        var19 = this.field2945;
                        var18 = this.field2945 + 1;
                        var16 = this.field2946;
                    }
                } else if (var15 <= var14) {
                    var18 = this.field2945 + -1;
                    var17 = this.field2946 + 1;
                    var19 = this.field2945;
                    var16 = this.field2946;
                } else {
                    var16 = this.field2946;
                    var17 = this.field2946 - 1;
                    var19 = this.field2945;
                    var18 = this.field2945 - -1;
                }
                label103: for (int var20 = 0; var3 > var20; ++var20) {
                    long var21 = class328.field5375[super.field9975][var19][var17];
                    while (~var21 != -1L) {
                        class610 var23 = class782.field11417[(int) ((var21 & 65535L) - 1L)];
                        var21 >>>= 16;
                        if (arg0[var20] == var23.field8782) {
                            continue label103;
                        }
                    }
                    long var24 = class328.field5375[super.field9975][var18][var16];
                    while (var24 != 0L) {
                        class610 var26 = class782.field11417[(int) ((var24 & 65535L) + -1L)];
                        var24 >>>= 16;
                        if (arg0[var20] == var26.field8782) {
                            continue label103;
                        }
                    }
                    for (int var27 = var20; var27 < var3 + -1; ++var27) {
                        arg0[var27] = arg0[var27 - -1];
                    }
                    --var3;
                }
            }
            return var3;
        } catch (RuntimeException var29) {
            throw class590.method4333(var29, field2951[6] + (arg0 != null ? field2951[1] : field2951[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "(I)V")
    public void method811(int arg0) {
        try {
            if (arg0 != -19900) {
                this.field2940 = -112;
            }
            ++field2942;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2951[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        try {
            super.field9972 = arg3;
            this.field2940 = (short) arg6;
            super.field9975 = (byte) arg0;
            this.field2937 = arg10;
            super.field9974 = (byte) arg1;
            this.field2939 = (short) arg8;
            super.field9985 = arg2;
            super.field9983 = arg4;
            this.field2945 = (short) arg5;
            this.field2938 = arg9;
            this.field2946 = (short) arg7;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field2951[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "(I)V")
    public static void method1740(int arg0) {
        try {
            field2950 = null;
            field2948 = null;
            field2943 = null;
            if (arg0 == 12774) {
                field2949 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2951[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1741(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1742(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 88;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 30;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
