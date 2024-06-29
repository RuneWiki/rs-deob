import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class363 {

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "Z")
    private boolean field5201 = false;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    public int field5215 = 0;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public int field5211 = 0;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "Z")
    public static boolean field5221 = false;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "Lrb;")
    public static class283 field5224;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public int field5202;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public int field5204;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public int field5205;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public int field5206;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public int field5207;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public int field5208;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public int field5209;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    private int field5212;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public int field5214;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public int field5220;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "J")
    public long field5222;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "Ljava/lang/Object;")
    public static Object field5223;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZB)V")
    public static final void method2167(boolean arg0, byte arg1) {
        if (arg1 >= -5) {
            return;
        }
        field5213++;
        for (class374 var2 = (class374) class398.field5713.method3137(0); var2 != null; var2 = (class374) class398.field5713.method3132(0)) {
            if (var2.field5367 != null) {
                class290.field3924.method298(var2.field5367);
                var2.field5367 = null;
            }
            if (var2.field5369 != null) {
                class290.field3924.method298(var2.field5369);
                var2.field5369 = null;
            }
            var2.method2791((byte) 112);
        }
        if (!arg0) {
            return;
        }
        for (class374 var3 = (class374) class265.field3566.method3137(0); var3 != null; var3 = (class374) class265.field3566.method3132(0)) {
            if (var3.field5367 != null) {
                class290.field3924.method298(var3.field5367);
                var3.field5367 = null;
            }
            var3.method2791((byte) 112);
        }
        for (class374 var4 = (class374) class481.field6955.method1588(84); var4 != null; var4 = (class374) class481.field6955.method1582(-104)) {
            if (var4.field5367 != null) {
                class290.field3924.method298(var4.field5367);
                var4.field5367 = null;
            }
            var4.method2791((byte) 112);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Lre;")
    public static final class482 method2168(int arg0) {
        if (arg0 != 100) {
            return null;
        }
        field5218++;
        try {
            return (class482) Class.forName("vn").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)I")
    public static final int method2169(int arg0, int arg1) {
        field5216++;
        return arg0 == 128 ? arg1 >>> 8 : -78;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILsv;)V")
    public final void method2170(int arg0, class319 arg1) {
        field5203++;
        while (true) {
            int var3 = arg1.method1869(-99);
            if (var3 == 0) {
                if (arg0 >= -123) {
                    this.field5207 = 53;
                    return;
                } else {
                    return;
                }
            }
            this.method2174(arg1, var3, 93);
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)V")
    public static final void method2171(int arg0, int arg1) {
        field5210++;
        int var2 = class28.field417 - class87.field1414;
        if (var2 >= 100) {
            class247.field3363 = 1;
            return;
        }
        int var3 = (int) class496.field7236;
        if (var3 < (class238.field3297 >> 8)) {
            var3 = class238.field3297 >> 8;
        }
        if (class309.field4206[4] && var3 < class449.field6583[4] + 128) {
            var3 = class449.field6583[4] + 128;
        }
        int var4 = (int) class191.field2797 + class93.field1525 & 0x3FFF;
        class172.method1173(class193.field2815, arg1, var4, class70.field1012, (var3 >> 3) * 3 + 600 << 0, -447, class123.method893(class81.field1158.field6287, class81.field1158.field6284, (byte) -13, class366.field5260) - 50, var3);
        if (arg0 != 16384) {
            field5224 = null;
        }
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class108.field1747 = (int) ((float) (class108.field1747 - class499.field7298) * var5 + (float) class499.field7298);
        class118.field1848 = (int) ((float) (class118.field1848 - class164.field2504) * var5 + (float) class164.field2504);
        class153.field2357 = (int) ((float) (class153.field2357 - class44.field637) * var5 + (float) class44.field637);
        class159.field2421 = (int) ((float) (class159.field2421 - class281.field3827) * var5 + (float) class281.field3827);
        int var6 = class49.field706 - class496.field7263;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class49.field706 = (int) ((float) var6 * var5 + (float) class496.field7263);
        class49.field706 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
    public static void method2172(int arg0) {
        field5224 = null;
        field5223 = null;
        if (arg0 != 9158) {
            field5221 = false;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public final void method2173(byte arg0) {
        field5219++;
        this.field5202 = class51.field731[this.field5212 << 3];
        this.field5204 = (int) Math.sqrt((double) (this.field5208 * this.field5208 + (this.field5206 * this.field5206 + (this.field5209 * this.field5209))));
        if (this.field5205 == 0) {
            this.field5205 = 1;
        }
        if (this.field5220 == 0) {
            this.field5222 = 2147483647L;
        } else if (this.field5220 == 1) {
            this.field5222 = (this.field5204 * 8 / this.field5205);
            this.field5222 *= this.field5222;
        } else if (this.field5220 == 2) {
            this.field5222 = (this.field5204 * 8 / this.field5205);
        }
        int var2 = -85 % ((-arg0 - 52) / 35);
        if (this.field5201) {
            this.field5204 *= -1;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lsv;II)V")
    private final void method2174(class319 arg0, int arg1, int arg2) {
        if (arg2 < 54) {
            return;
        }
        field5225++;
        if (arg1 == 1) {
            this.field5212 = arg0.method1844(-102);
        } else if (arg1 == 2) {
            arg0.method1869(-110);
        } else if (arg1 == 3) {
            this.field5206 = arg0.method1863(-1);
            this.field5209 = arg0.method1863(-1);
            this.field5208 = arg0.method1863(-1);
        } else if (arg1 == 4) {
            this.field5220 = arg0.method1869(-83);
            this.field5205 = arg0.method1863(-1);
        } else if (arg1 == 6) {
            this.field5207 = arg0.method1869(-112);
        } else if (arg1 == 8) {
            this.field5211 = 1;
        } else if (arg1 == 9) {
            this.field5215 = 1;
        } else if (arg1 == 10) {
            this.field5201 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Z")
    public static final boolean method2175(int arg0, int arg1, int arg2) {
        field5217++;
        if (arg0 != 10174) {
            field5221 = false;
        }
        return (class27.field379[1][arg1][arg2] & 0x2) != 0;
    }

    static {
        new class157("Use", "Benutzen", "Utiliser", "Usar");
        field5224 = new class283(37, 5);
    }
}
