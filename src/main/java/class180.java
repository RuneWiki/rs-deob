import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class180 {

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Lki;")
    private class62 field3124 = null;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "Z")
    private boolean field3149;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "Ldf;")
    private class55 field3130;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Z")
    private boolean field3112;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "Lp;")
    public static class280 field3146 = class18.method140((byte) -121, "details");

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "Z")
    public static boolean field3141 = false;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "Lua;")
    public static class113 field3157 = null;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "[Ljava/lang/Object;")
    private Object[] field3151;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3120;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)I")
    public final int method1228(boolean arg0) {
        if (arg0) {
            field3153++;
            return this.method1230(-27) ? this.field3124.field1014.length : -1;
        } else {
            return 35;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Ll;")
    public static final class160 method1229(int arg0, int arg1, int arg2) {
        class162 var3 = class220.field3787[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2841; var4++) {
            class160 var5 = var3.field2845[var4];
            if ((var5.field2805 >> 29 & 0x3L) == 2L && var5.field2814 == arg1 && var5.field2796 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Z")
    private final boolean method1230(int arg0) {
        field3127++;
        if (arg0 != -27) {
            return false;
        }
        if (this.field3124 == null) {
            this.field3124 = this.field3130.method407(-102);
            if (this.field3124 == null) {
                return false;
            }
            this.field3151 = new Object[this.field3124.field1020];
            this.field3120 = new Object[this.field3124.field1020][];
        }
        return true;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lp;Lp;I)[B")
    public final byte[] method1231(class280 arg0, class280 arg1, int arg2) {
        field3118++;
        if (!this.method1230(-27)) {
            return null;
        }
        class280 var4 = arg0.method1854(-66);
        class280 var5 = arg1.method1854(-66);
        int var6 = this.field3124.field1003.method340((byte) -107, var4.method1856(464253445));
        if (!this.method1233(0, var6)) {
            return null;
        }
        if (arg2 < 13) {
            this.field3120 = null;
        }
        int var7 = this.field3124.field1007[var6].method340((byte) -67, var5.method1856(464253445));
        return this.method1258(var6, var7, (byte) 124);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static void method1232(int arg0) {
        int var1 = 39 % ((-arg0 - 9) / 61);
        field3157 = null;
        field3146 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Z")
    private final boolean method1233(int arg0, int arg1) {
        field3119++;
        if (!this.method1230(arg0 ^ 0xFFFFFFE5)) {
            return false;
        } else if (arg1 >= 0 && this.field3124.field1014.length > arg1 && this.field3124.field1014[arg1] != 0) {
            if (arg0 != 0) {
                this.field3130 = null;
            }
            return true;
        } else if (class254.field4443) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLp;)I")
    public final int method1234(byte arg0, class280 arg1) {
        field3142++;
        if (arg0 != -88) {
            return -82;
        } else if (this.method1230(-27)) {
            class280 var3 = arg1.method1854(-66);
            int var4 = this.field3124.field1003.method340((byte) -121, var3.method1856(arg0 + 464253533));
            return this.method1233(0, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
    public final void method1235(int arg0) {
        if (this.field3120 != null) {
            for (int var2 = 0; var2 < this.field3120.length; var2++) {
                this.field3120[var2] = null;
            }
        }
        if (arg0 == 26913) {
            field3126++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILp;)Z")
    public final boolean method1236(int arg0, class280 arg1) {
        field3117++;
        if (!this.method1230(-27)) {
            return false;
        }
        class280 var3 = arg1.method1854(-66);
        int var4 = this.field3124.field1003.method340((byte) -36, var3.method1856(464253445));
        if (arg0 != 0) {
            this.field3112 = true;
        }
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)[I")
    public final int[] method1237(int arg0, int arg1) {
        if (arg1 != -1) {
            return null;
        }
        field3139++;
        if (!this.method1233(0, arg0)) {
            return null;
        }
        int[] var3 = this.field3124.field1000[arg0];
        if (var3 == null) {
            var3 = new int[this.field3124.field1010[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)Lqa;")
    public static final class150 method1238(byte arg0, int arg1) {
        if (arg0 != -111) {
            return null;
        }
        class150 var2 = (class150) class248.field4344.method1699((long) arg1, 124);
        field3134++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class252.field4402.method1258(1, arg1, (byte) 113);
        } else {
            var3 = class192.field3356.method1258(1, arg1 & 0x7FFF, (byte) 93);
        }
        class150 var4 = new class150();
        if (var3 != null) {
            var4.method1037(new class25(var3), 0);
        }
        if (arg1 >= 32768) {
            var4.method1042((byte) -108);
        }
        class248.field4344.method1703(var4, (byte) 111, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)Z")
    public final boolean method1239(int arg0, int arg1) {
        field3137++;
        if (!this.method1233(0, arg0)) {
            return false;
        } else if (this.field3151[arg0] == null) {
            this.method1250(0, arg0);
            if (this.field3151[arg0] == null) {
                int var3 = 103 % ((-arg1 - 65) / 36);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(III)Z")
    private final boolean method1240(int arg0, int arg1, int arg2) {
        field3148++;
        if (!this.method1230(arg2 - 27)) {
            return false;
        } else if (arg1 >= arg2 && arg0 >= 0 && this.field3124.field1014.length > arg1 && arg0 < this.field3124.field1014[arg1]) {
            return true;
        } else if (class254.field4443) {
            throw new IllegalArgumentException(arg1 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(ILp;)V")
    public final void method1241(int arg0, class280 arg1) {
        if (arg0 != 0) {
            this.field3130 = null;
        }
        field3132++;
        if (this.method1230(-27)) {
            class280 var3 = arg1.method1854(arg0 ^ 0xFFFFFFBE);
            int var4 = this.field3124.field1003.method340((byte) -54, var3.method1856(464253445));
            this.method1255(-114, var4);
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(II)Lud;")
    public static final class2 method1242(int arg0, int arg1) {
        field3152++;
        if (class36.field655 && class248.field4348 <= arg0 && class51.field833 >= arg0) {
            return arg1 <= 62 ? null : class150.field2608[arg0 - class248.field4348];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(III)[B")
    public final byte[] method1243(int arg0, int arg1, int arg2) {
        field3145++;
        if (!this.method1240(arg0, arg1, 0)) {
            return null;
        }
        if (this.field3120[arg1] == null || this.field3120[arg1][arg0] == null) {
            boolean var4 = this.method1252(-110, arg1, (int[]) null);
            if (!var4) {
                this.method1250(0, arg1);
                boolean var5 = this.method1252(arg2 + 22175, arg1, (int[]) null);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class4.method55(false, this.field3120[arg1][arg0], 0);
        if (arg2 != -22272) {
            this.method1256(108);
        }
        return var6;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)Z")
    public final boolean method1244(int arg0) {
        field3115++;
        if (!this.method1230(-27)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 != -27341) {
            field3141 = true;
        }
        for (int var3 = 0; var3 < this.field3124.field1005.length; var3++) {
            int var4 = this.field3124.field1005[var3];
            if (this.field3151[var4] == null) {
                this.method1250(0, var4);
                if (this.field3151[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZ)I")
    public static final int method1245(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field3141 = true;
        }
        field3114++;
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([IIII)[B")
    public final byte[] method1246(int[] arg0, int arg1, int arg2, int arg3) {
        field3123++;
        if (!this.method1240(arg2, arg3, 0)) {
            return null;
        }
        if (this.field3120[arg3] == null || this.field3120[arg3][arg2] == null) {
            boolean var5 = this.method1252(-116, arg3, arg0);
            if (!var5) {
                this.method1250(arg1 + 2, arg3);
                boolean var6 = this.method1252(arg1 ^ 0x6B, arg3, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg1 != -2) {
            return null;
        }
        byte[] var7 = class4.method55(false, this.field3120[arg3][arg2], 0);
        if (this.field3112) {
            this.field3120[arg3][arg2] = null;
            if (this.field3124.field1014[arg3] == 1) {
                this.field3120[arg3] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I")
    public final int method1247(byte arg0) {
        field3125++;
        int var2 = 47 / ((arg0 - 13) / 46);
        if (!this.method1230(-27)) {
            throw new IllegalStateException("");
        }
        return this.field3124.field1002;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BII)Z")
    public final boolean method1248(byte arg0, int arg1, int arg2) {
        field3154++;
        int var4 = -9 / ((arg0 - 27) / 52);
        if (!this.method1240(arg1, arg2, 0)) {
            return false;
        } else if (this.field3120[arg2] != null && this.field3120[arg2][arg1] != null) {
            return true;
        } else if (this.field3151[arg2] == null) {
            this.method1250(0, arg2);
            return this.field3151[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(II)I")
    private final int method1249(int arg0, int arg1) {
        field3121++;
        if (this.method1233(arg1 + arg1, arg0)) {
            return this.field3151[arg0] == null ? this.field3130.method401((byte) 99, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(II)V")
    private final void method1250(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        if (this.field3149) {
            this.field3151[arg1] = this.field3130.method402(arg1, 58);
        } else {
            this.field3151[arg1] = class79.method584(this.field3130.method402(arg1, 40), false, 108);
        }
        field3155++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V")
    public final void method1251(int arg0, byte arg1) {
        if (arg1 != -95) {
            this.field3149 = true;
        }
        field3156++;
        if (this.method1233(arg1 + 95, arg0) && this.field3120 != null) {
            this.field3120[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[I)Z")
    private final boolean method1252(int arg0, int arg1, int[] arg2) {
        field3140++;
        if (!this.method1233(0, arg1)) {
            return false;
        } else if (this.field3151[arg1] == null) {
            return false;
        } else {
            int var4 = this.field3124.field1010[arg1];
            int[] var5 = this.field3124.field1000[arg1];
            if (this.field3120[arg1] == null) {
                this.field3120[arg1] = new Object[this.field3124.field1014[arg1]];
            }
            Object[] var6 = this.field3120[arg1];
            boolean var7 = true;
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var6[var9] == null) {
                    var7 = false;
                    break;
                }
            }
            if (arg0 > -55) {
                this.method1240(118, 61, -66);
            }
            if (var7) {
                return true;
            }
            byte[] var10;
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || arg2[2] != 0 || arg2[3] != 0)) {
                var10 = class4.method55(true, this.field3151[arg1], 0);
                class25 var11 = new class25(var10);
                var11.method205(var11.field475.length, arg2, 255, 5);
            } else {
                var10 = class4.method55(false, this.field3151[arg1], 0);
            }
            byte[] var12;
            try {
                var12 = class132.method914(var10, -2081);
            } catch (RuntimeException var31) {
                throw class232.method1563(var31, "T3 - " + (arg2 != null) + "," + arg1 + "," + var10.length + "," + class173.method1196(0, var10.length, var10) + "," + class173.method1196(0, var10.length - 2, var10) + "," + this.field3124.field1013[arg1] + "," + this.field3124.field1002);
            }
            if (this.field3149) {
                this.field3151[arg1] = null;
            }
            if (var4 <= 1) {
                int var14;
                if (var5 == null) {
                    var14 = 0;
                } else {
                    var14 = var5[0];
                }
                if (this.field3112) {
                    var6[var14] = var12;
                } else {
                    var6[var14] = class79.method584(var12, false, 91);
                }
            } else {
                int var15 = var12.length;
                int var32 = var15 - 1;
                int var16 = var12[var32] & 0xFF;
                int var17 = var32 - var4 * var16 * 4;
                int[] var18 = new int[var4];
                class25 var19 = new class25(var12);
                var19.field481 = var17;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        var21 += var19.method199((byte) -85);
                        var18[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var18[var24]];
                    var18[var24] = 0;
                }
                int var25 = 0;
                var19.field481 = var17;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var19.method199((byte) -85);
                        class143.method989(var12, var25, var23[var28], var18[var28], var27);
                        var25 += var27;
                        var18[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var5 == null) {
                        var30 = var29;
                    } else {
                        var30 = var5[var29];
                    }
                    if (this.field3112) {
                        var6[var30] = var23[var29];
                    } else {
                        var6[var30] = class79.method584(var23[var29], false, 102);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BZZ)V")
    public final void method1253(byte arg0, boolean arg1, boolean arg2) {
        field3136++;
        int var4 = -40 % ((arg0 - 6) / 55);
        if (!this.method1230(-27)) {
            return;
        }
        if (arg2) {
            this.field3124.field1009 = null;
            this.field3124.field1003 = null;
        }
        if (arg1) {
            this.field3124.field1016 = null;
            this.field3124.field1007 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)[B")
    public final byte[] method1254(boolean arg0, int arg1) {
        field3143++;
        if (!this.method1230(-27)) {
            return null;
        } else if (this.field3124.field1014.length == 1) {
            return this.method1258(0, arg1, (byte) 94);
        } else if (this.method1233(0, arg1)) {
            if (!arg0) {
                this.field3149 = true;
            }
            if (this.field3124.field1014[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method1258(arg1, 0, (byte) 94);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(II)V")
    private final void method1255(int arg0, int arg1) {
        this.field3130.method400(arg1, (byte) 10);
        field3150++;
        if (arg0 >= -15) {
            this.field3149 = false;
        }
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)I")
    public final int method1256(int arg0) {
        field3135++;
        if (!this.method1230(-27)) {
            return 0;
        } else if (arg0 == -13814) {
            int var2 = 0;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field3151.length; var4++) {
                if (this.field3124.field1010[var4] > 0) {
                    var2 += this.method1249(var4, 0);
                    var3 += 100;
                }
            }
            if (var3 == 0) {
                return 100;
            } else {
                return var2 * 100 / var3;
            }
        } else {
            return 58;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(BLp;)Z")
    public final boolean method1257(byte arg0, class280 arg1) {
        field3147++;
        if (arg0 != -90) {
            this.method1252(83, 110, (int[]) null);
        }
        if (this.method1230(-27)) {
            class280 var3 = arg1.method1854(-66);
            int var4 = this.field3124.field1003.method340((byte) -31, var3.method1856(464253445));
            return this.method1239(var4, 86);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIB)[B")
    public final byte[] method1258(int arg0, int arg1, byte arg2) {
        field3113++;
        if (arg2 <= 90) {
            this.method1250(-82, -51);
        }
        return this.method1246((int[]) null, -2, arg1, arg0);
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(II)I")
    public final int method1259(int arg0, int arg1) {
        if (arg1 < 30) {
            method1242(126, 105);
        }
        field3128++;
        return this.method1233(0, arg0) ? this.field3124.field1014[arg0] : 0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lp;I)I")
    public final int method1260(class280 arg0, int arg1) {
        field3129++;
        if (!this.method1230(-27)) {
            return 0;
        }
        if (arg1 <= 106) {
            field3157 = null;
        }
        class280 var3 = arg0.method1854(-66);
        int var4 = this.field3124.field1003.method340((byte) -101, var3.method1856(464253445));
        return this.method1249(var4, 0);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lp;ILp;)Z")
    public final boolean method1261(class280 arg0, int arg1, class280 arg2) {
        field3116++;
        if (!this.method1230(-27)) {
            return false;
        }
        class280 var4 = arg0.method1854(-66);
        class280 var5 = arg2.method1854(-66);
        int var6 = this.field3124.field1003.method340((byte) -122, var4.method1856(464253445));
        if (this.method1233(arg1, var6)) {
            int var7 = this.field3124.field1007[var6].method340((byte) -47, var5.method1856(464253445));
            return this.method1248((byte) 81, var7, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IB)Z")
    public final boolean method1262(int arg0, byte arg1) {
        field3133++;
        if (arg1 != 93) {
            this.method1250(-29, -65);
        }
        if (!this.method1230(-27)) {
            return false;
        } else if (this.field3124.field1014.length == 1) {
            return this.method1248((byte) -124, arg0, 0);
        } else if (!this.method1233(0, arg0)) {
            return false;
        } else if (this.field3124.field1014[arg0] == 1) {
            return this.method1248((byte) -41, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ldf;ZZ)V")
    public class180(class55 arg0, boolean arg1, boolean arg2) {
        this.field3149 = arg1;
        this.field3130 = arg0;
        this.field3112 = arg2;
    }
}
