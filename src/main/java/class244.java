import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class244 {

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field4228 = 500;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field4233 = 0;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Lia;")
    private static class257 field4222 = class28.method234(-20, "Allocating memory");

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Lia;")
    private static class257 field4230 = class28.method234(-73, "Connecting to update server");

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field4242 = 0;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "Lia;")
    public static class257 field4241 = field4222;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "Lia;")
    public static class257 field4248 = field4230;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "Lia;")
    public static class257 field4249 = class28.method234(-109, "Welt");

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    private int field4247;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "J")
    private long field4223;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "J")
    private long field4225;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Z")
    public boolean field4226;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
    private int[] field4227;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "[I")
    private int[] field4239;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "[Lte;")
    public static class184[] field4237;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "[[[I")
    public static int[][][] field4234;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "[[[Lea;")
    public static class177[][][] field4235;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)V")
    public final void method1598(boolean arg0, int arg1) {
        this.field4226 = arg0;
        if (arg1 == 0) {
            field4231++;
            this.method1608((byte) -48);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZ)Lia;")
    public static final class257 method1599(int arg0, int arg1, int arg2, boolean arg3) {
        field4245++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = arg1 / arg2;
        int var5 = 1;
        while (var4 != 0) {
            var5++;
            var4 /= arg2;
        }
        int var6 = var5;
        if (arg1 < 0 || arg3) {
            var6 = var5 + 1;
        }
        if (arg0 <= 48) {
            method1604((byte) 74);
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = arg1 % arg2;
            if (var10 < 0) {
                var10 = -var10;
            }
            arg1 /= arg2;
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class257 var9 = new class257();
        var9.field4447 = var6;
        var9.field4407 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lfc;IB)Lei;")
    public final class168 method1600(class31 arg0, int arg1, byte arg2) {
        field4240++;
        if (this.field4247 != -1) {
            return class92.method682(true, this.field4247).method1327(arg1, arg0, true);
        }
        if (arg2 < 70) {
            this.method1605(-13);
        }
        class168 var4 = (class168) class29.field547.method836(100, this.field4223);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field4227[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class197.method1318(var15 & 0x3FFFFFFF, 20440).method306(120)) {
                        var5 = true;
                    }
                } else if (!class156.method1090(var15 & 0x3FFFFFFF, 0).method154(this.field4226, (byte) -43)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var7 = 0;
            class67[] var8 = new class67[12];
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field4227[var9];
                if ((var12 & 0x40000000) != 0) {
                    class67 var14 = class156.method1090(var12 & 0x3FFFFFFF, 0).method143(-50, this.field4226);
                    if (var14 != null) {
                        var8[var7++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class67 var13 = class197.method1318(var12 & 0x3FFFFFFF, 20440).method310(90);
                    if (var13 != null) {
                        var8[var7++] = var13;
                    }
                }
            }
            class67 var10 = new class67(var8, var7);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field4239[var11] < class144.field2526[var11].length) {
                    var10.method489(class180.field3105[var11], class144.field2526[var11][this.field4239[var11]]);
                }
                if (class206.field3529[var11].length > this.field4239[var11]) {
                    var10.method489(class17.field361[var11], class206.field3529[var11][this.field4239[var11]]);
                }
            }
            var4 = var10.method506(64, 768, -50, -10, -50);
            class29.field547.method832(var4, this.field4223, 0);
        }
        if (arg0 != null) {
            var4 = arg0.method259(var4, 2, arg1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static final void method1601(int arg0) {
        field4221++;
        int var1 = 0;
        if (arg0 != 768) {
            field4235 = null;
        }
        while (var1 < 100) {
            class137.field2456[var1] = true;
            var1++;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILfc;IILfc;)Lei;")
    public final class168 method1602(int arg0, class31 arg1, int arg2, int arg3, class31 arg4) {
        field4229++;
        int var6 = 120 / ((-arg3 - 54) / 58);
        if (this.field4247 != -1) {
            return class92.method682(true, this.field4247).method1329(arg2, true, arg0, arg4, arg1);
        }
        int[] var7 = this.field4227;
        long var8 = this.field4223;
        if (arg4 != null && (arg4.field581 >= 0 || arg4.field602 >= 0)) {
            var7 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var7[var10] = this.field4227[var10];
            }
            if (arg4.field581 >= 0) {
                if (arg4.field581 == 65535) {
                    var7[5] = 0;
                    var8 ^= 0xFFFFFFFF00000000L;
                } else {
                    var7[5] = class198.method1332(arg4.field581, 1073741824);
                    var8 ^= (long) var7[5] << 32;
                }
            }
            if (arg4.field602 >= 0) {
                if (arg4.field602 == 65535) {
                    var8 ^= 0xFFFFFFFFL;
                    var7[3] = 0;
                } else {
                    var7[3] = class198.method1332(1073741824, arg4.field602);
                    var8 ^= (long) var7[3];
                }
            }
        }
        class168 var11 = (class168) class164.field2857.method836(60, var8);
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var31 = var7[var13];
                if ((var31 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var31) != 0 && !class197.method1318(var31 & 0x3FFFFFFF, 20440).method313(5)) {
                        var12 = true;
                    }
                } else if (!class156.method1090(var31 & 0x3FFFFFFF, 0).method142(this.field4226, 23)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field4225 != -1L) {
                    var11 = (class168) class164.field2857.method836(-116, this.field4225);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                class67[] var14 = new class67[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var28 = var7[var16];
                    if ((var28 & 0x40000000) != 0) {
                        class67 var29 = class156.method1090(var28 & 0x3FFFFFFF, 0).method145(-1, this.field4226);
                        if (var29 != null) {
                            var14[var15++] = var29;
                        }
                    } else if ((Integer.MIN_VALUE & var28) != 0) {
                        class67 var30 = class197.method1318(var28 & 0x3FFFFFFF, 20440).method312(-73);
                        if (var30 != null) {
                            var14[var15++] = var30;
                        }
                    }
                }
                int var17 = var7[0];
                if ((var17 & 0x40000000) != 0) {
                    class14 var18 = class156.method1090(var17 & 0x3FFFFFFF, 0);
                    if (var18.field327 != null) {
                        for (int var19 = 0; var19 < var18.field327.length; var19++) {
                            if (var18.field327[var19] != null && var14[var19 + 1] != null) {
                                int var20 = var18.field327[var19][0];
                                int var21 = var18.field327[var19][2];
                                int var22 = var18.field327[var19][1];
                                int var23 = var18.field327[var19][5];
                                int var24 = var18.field327[var19][4];
                                int var25 = var18.field327[var19][3];
                                var14[var19 + 1].method491(var20, var22, var21);
                                var14[var19 + 1].method508(var25, var24, var23);
                            }
                        }
                    }
                }
                class67 var26 = new class67(var14, var15);
                for (int var27 = 0; var27 < 5; var27++) {
                    if (this.field4239[var27] < class144.field2526[var27].length) {
                        var26.method489(class180.field3105[var27], class144.field2526[var27][this.field4239[var27]]);
                    }
                    if (class206.field3529[var27].length > this.field4239[var27]) {
                        var26.method489(class17.field361[var27], class206.field3529[var27][this.field4239[var27]]);
                    }
                }
                var11 = var26.method506(64, 850, -30, -50, -30);
                class164.field2857.method832(var11, var8, 0);
                this.field4225 = var8;
            }
        }
        if (arg4 == null && arg1 == null) {
            return var11;
        }
        class168 var32;
        if (arg4 != null && arg1 != null) {
            var32 = arg4.method260(arg2, arg0, arg1, var11, (byte) 121);
        } else if (arg4 == null) {
            var32 = arg1.method265(arg2, 82, var11);
        } else {
            var32 = arg4.method265(arg0, 97, var11);
        }
        return var32;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
    public final void method1603(int arg0, int arg1, int arg2) {
        this.field4239[arg0] = arg1;
        field4243++;
        if (arg2 == 6324) {
            this.method1608((byte) -53);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method1604(byte arg0) {
        field4222 = null;
        field4234 = null;
        field4248 = null;
        field4249 = null;
        field4237 = null;
        field4241 = null;
        field4230 = null;
        field4235 = null;
        int var1 = 18 % ((13 - arg0) / 50);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)I")
    public final int method1605(int arg0) {
        field4238++;
        if (arg0 != -18557) {
            field4232 = -77;
        }
        return this.field4247 == -1 ? (this.field4239[0] << 25) + (this.field4239[4] << 20) + (this.field4227[8] << 10) - (-(this.field4227[0] << 15) - (this.field4227[11] << 5) - this.field4227[1]) : class92.method682(true, this.field4247).field3347 + 305419896;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[II[IZ)V")
    public final void method1606(int arg0, int[] arg1, int arg2, int[] arg3, boolean arg4) {
        field4224++;
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class103.field1919; var7++) {
                    class38 var8 = class197.method1318(var7, 20440);
                    if (var8 != null && !var8.field755 && ((arg4 ? 7 : 0) + var6) == var8.field759) {
                        arg3[class85.field1666[var6]] = class198.method1332(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field4227 = arg3;
        this.field4247 = arg0;
        if (arg2 != 21764) {
            field4248 = null;
        }
        this.field4226 = arg4;
        this.field4239 = arg1;
        this.method1608((byte) -66);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
    public final void method1607(int arg0, int arg1, int arg2) {
        if (arg2 != -6453) {
            field4230 = null;
        }
        int var4 = class85.field1666[arg1];
        field4246++;
        if (this.field4227[var4] != 0 && class197.method1318(arg0, arg2 ^ 0xFFFFA913) != null) {
            this.field4227[var4] = class198.method1332(arg0, Integer.MIN_VALUE);
            this.method1608((byte) -48);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
    private final void method1608(byte arg0) {
        long[] var2 = class89.field1708;
        long var3 = this.field4223;
        field4244++;
        this.field4223 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4223 = var2[(int) (((long) (this.field4227[var5] >> 24) ^ this.field4223) & 0xFFL)] ^ this.field4223 >>> 8;
            this.field4223 = var2[(int) ((this.field4223 ^ (long) (this.field4227[var5] >> 16)) & 0xFFL)] ^ this.field4223 >>> 8;
            this.field4223 = this.field4223 >>> 8 ^ var2[(int) ((this.field4223 ^ (long) (this.field4227[var5] >> 8)) & 0xFFL)];
            this.field4223 = this.field4223 >>> 8 ^ var2[(int) (((long) this.field4227[var5] ^ this.field4223) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4223 = this.field4223 >>> 8 ^ var2[(int) (((long) this.field4239[var6] ^ this.field4223) & 0xFFL)];
        }
        this.field4223 = this.field4223 >>> 8 ^ var2[(int) (((long) (this.field4226 ? 1 : 0) ^ this.field4223) & 0xFFL)];
        if (arg0 <= -34 && var3 != 0L && this.field4223 != var3) {
            class164.field2857.method835(-33, var3);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBLfc;II)Lei;")
    public final class168 method1609(int arg0, byte arg1, class31 arg2, int arg3, int arg4) {
        field4236++;
        if (arg1 < 114) {
            return null;
        }
        long var6 = (long) arg4 | (long) (arg3 << 16) | (long) arg4 << 32;
        class168 var8 = (class168) class29.field547.method836(126, var6);
        if (var8 == null) {
            class67[] var9 = new class67[2];
            int var10 = 0;
            if (!class197.method1318(arg4, 20440).method306(-49) || !class197.method1318(arg3, 20440).method306(93)) {
                return null;
            }
            class67 var11 = class197.method1318(arg4, 20440).method310(75);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class67 var12 = class197.method1318(arg3, 20440).method310(112);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class67 var13 = new class67(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class144.field2526[var14].length > this.field4239[var14]) {
                    var13.method489(class180.field3105[var14], class144.field2526[var14][this.field4239[var14]]);
                }
                if (this.field4239[var14] < class206.field3529[var14].length) {
                    var13.method489(class17.field361[var14], class206.field3529[var14][this.field4239[var14]]);
                }
            }
            var8 = var13.method506(64, 768, -50, -10, -50);
            class29.field547.method832(var8, var6, 0);
        }
        if (arg2 != null) {
            var8 = arg2.method259(var8, 2, arg0);
        }
        return var8;
    }
}
