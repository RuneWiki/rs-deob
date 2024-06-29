import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class122 extends class313 {

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "Z")
    public static boolean field2125 = false;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "Lel;")
    public static class133 field2119 = class175.method1360(-13556);

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "Lcg;")
    public static class49 field2120;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "Lcg;")
    public static class49 field2129;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "Lcg;")
    public static class49 field2130;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "[[[B")
    public static byte[][][] field2116;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILpi;)V", line = 5)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field2131++;
        if (arg0 == 0) {
            this.field4968 = arg2.method2364(-9069) == 1;
        }
        if (arg1 != -17848) {
            field2116 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)V", line = 20)
    public static final void method1029(int arg0, int arg1) {
        field2123++;
        class30 var2 = class99.method857((byte) 127, arg0, 3);
        var2.method276(0);
        if (arg1 != 2) {
            field2130 = (class49) null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)[I", line = 41)
    public final int[] method111(int arg0, int arg1) {
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            for (int var4 = 0; var4 < class133.field2269; var4++) {
                this.method1031(arg0 ^ 0x804, arg1, var4);
                int[] var5 = this.method2156(0, true, class238.field3903);
                var3[var4] = var5[class313.field4971];
            }
        }
        if (arg0 == 4) {
            field2122++;
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V", line = 70)
    public static void method1030(int arg0) {
        field2130 = null;
        field2116 = (byte[][][]) null;
        field2120 = null;
        field2119 = null;
        if (arg0 != 1763) {
            method1032((byte) 45);
        }
        field2129 = null;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(III)V", line = 91)
    private final void method1031(int arg0, int arg1, int arg2) {
        int var4 = class1.field6[arg1];
        int var5 = class8.field104[arg2];
        float var6 = (float) Math.atan2((double) (var5 - 2048), (double) (var4 - arg0));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class313.field4971 = arg2;
            class238.field3903 = arg1;
        } else if (-1.5707963267948966D >= (double) var6 && (double) var6 >= -2.356194490192345D) {
            class238.field3903 = arg2;
            class313.field4971 = arg1;
        } else if (-0.7853981633974483D >= (double) var6 && (double) var6 >= -1.5707963267948966D) {
            class313.field4971 = class133.field2269 - arg1;
            class238.field3903 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class313.field4971 = arg2;
            class238.field3903 = class77.field1247 - arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class238.field3903 = class77.field1247 - arg1;
            class313.field4971 = class133.field2269 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class313.field4971 = class133.field2269 - arg1;
            class238.field3903 = class77.field1247 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class313.field4971 = arg1;
            class238.field3903 = class77.field1247 - arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class313.field4971 = class133.field2269 - arg2;
            class238.field3903 = arg1;
        }
        class313.field4971 &= class297.field4731;
        class238.field3903 &= class132.field2262;
        field2124++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[[I", line = 163)
    public final int[][] method299(int arg0, int arg1) {
        if (arg1 != 2) {
            method1030(39);
        }
        field2126++;
        int[][] var3 = this.field4958.method2404(arg0, (byte) 126);
        if (this.field4958.field5463) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class133.field2269; var7++) {
                this.method1031(2048, arg0, var7);
                int[][] var8 = this.method2161(0, arg1 + 2, class238.field3903);
                var4[var7] = var8[0][class313.field4971];
                var5[var7] = var8[1][class313.field4971];
                var6[var7] = var8[2][class313.field4971];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V", line = 206)
    public static final void method1032(byte arg0) {
        class171.field2962.method470(12);
        if (arg0 != 106) {
            method1030(59);
        }
        field2127++;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)[Lwm;", line = 218)
    public static final class168[] method1033(byte arg0) {
        int var1 = -84 % ((arg0 + 72) / 51);
        if (class317.field5036 == null) {
            class168[] var2 = class272.method1859((byte) 87, class85.field1369);
            class168[] var3 = new class168[var2.length];
            int var4 = 0;
            label53: for (int var5 = 0; var5 < var2.length; var5++) {
                class168 var6 = var2[var5];
                if ((var6.field2926 <= 0 || var6.field2926 >= 24) && var6.field2933 >= 800 && var6.field2934 >= 600) {
                    for (int var7 = 0; var7 < var4; var7++) {
                        class168 var8 = var3[var7];
                        if (var6.field2933 == var8.field2933 && var6.field2934 == var8.field2934) {
                            if (var6.field2926 > var8.field2926) {
                                var3[var7] = var6;
                            }
                            continue label53;
                        }
                    }
                    var3[var4] = var6;
                    var4++;
                }
            }
            class317.field5036 = new class168[var4];
            class345.method2420(var3, 0, class317.field5036, 0, var4);
            int[] var9 = new int[class317.field5036.length];
            for (int var10 = 0; var10 < class317.field5036.length; var10++) {
                class168 var11 = class317.field5036[var10];
                var9[var10] = var11.field2934 * var11.field2933;
            }
            class209.method1557(var9, class317.field5036, false);
        }
        field2118++;
        return class317.field5036;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 296)
    public class122() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)V", line = 300)
    public static final void method1034(int arg0) {
        if (arg0 >= -117) {
            field2128 = 13;
        }
        class292.field4672.method470(12);
        field2121++;
    }
}
