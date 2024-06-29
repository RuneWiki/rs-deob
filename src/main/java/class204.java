import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class204 {

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    private int field3279 = 0;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "[Lel;")
    public class202[] field3270;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field3265 = 0;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "[I")
    public static int[] field3276 = new int[50];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "J")
    private long field3267;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lel;")
    private class202 field3260;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lel;")
    private class202 field3278;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public final void method1398(int arg0) {
        for (int var2 = arg0; var2 < this.field3277; var2++) {
            class202 var3 = this.field3270[var2];
            while (true) {
                class202 var4 = var3.field3245;
                if (var3 == var4) {
                    break;
                }
                var4.method1388(-124);
            }
        }
        this.field3278 = null;
        this.field3260 = null;
        field3274++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILel;J)V")
    public final void method1399(int arg0, class202 arg1, long arg2) {
        if (arg0 != 7292) {
            this.method1403(false);
        }
        if (arg1.field3248 != null) {
            arg1.method1388(47);
        }
        class202 var5 = this.field3270[(int) ((long) (this.field3277 - 1) & arg2)];
        arg1.field3247 = arg2;
        arg1.field3245 = var5;
        field3271++;
        arg1.field3248 = var5.field3248;
        arg1.field3248.field3245 = arg1;
        arg1.field3245.field3248 = arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(JZ)Lel;")
    public final class202 method1400(long arg0, boolean arg1) {
        this.field3267 = arg0;
        field3263++;
        class202 var4 = this.field3270[(int) ((long) (this.field3277 - 1) & arg0)];
        if (!arg1) {
            return null;
        }
        for (this.field3260 = var4.field3245; this.field3260 != var4; this.field3260 = this.field3260.field3245) {
            if (this.field3260.field3247 == arg0) {
                class202 var5 = this.field3260;
                this.field3260 = this.field3260.field3245;
                return var5;
            }
        }
        this.field3260 = null;
        return null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIB)I")
    public static final int method1401(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg2 & 0x3;
        field3272++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else {
            if (arg3 >= -3) {
                method1402((byte) 24, -30);
            }
            return var4 == 2 ? 7 - arg0 : -arg1 + 7;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Ltf;")
    public static final class107 method1402(byte arg0, int arg1) {
        field3275++;
        class107 var2 = (class107) class196.field3126.method480((long) arg1, 94);
        if (arg0 != 77) {
            field3276 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class212.field3454.method1357(class261.method1781(arg1, 117), class280.method1890(-21830, arg1), -1);
        class107 var4 = new class107();
        var4.field1724 = arg1;
        if (var3 != null) {
            var4.method784(new class221(var3), 3085);
        }
        var4.method778(-1494707921);
        class196.field3126.method474((long) arg1, (byte) 87, var4);
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)I")
    public final int method1403(boolean arg0) {
        field3266++;
        int var2 = 0;
        if (!arg0) {
            return 62;
        }
        for (int var3 = 0; var3 < this.field3277; var3++) {
            class202 var4 = this.field3270[var3];
            class202 var5 = var4.field3245;
            while (var4 != var5) {
                var5 = var5.field3245;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Lel;")
    public final class202 method1404(int arg0) {
        this.field3279 = 0;
        field3258++;
        int var2 = 38 / ((arg0 - 56) / 39);
        return this.method1412(-120);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)Lel;")
    public final class202 method1405(byte arg0) {
        field3259++;
        if (this.field3260 == null) {
            return null;
        }
        class202 var2 = this.field3270[(int) (this.field3267 & (long) (this.field3277 - 1))];
        while (this.field3260 != var2) {
            if (this.field3260.field3247 == this.field3267) {
                class202 var3 = this.field3260;
                this.field3260 = this.field3260.field3245;
                return var3;
            }
            this.field3260 = this.field3260.field3245;
        }
        if (arg0 < 4) {
            method1402((byte) -49, 5);
        }
        this.field3260 = null;
        return null;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public static final void method1406(int arg0) {
        class64.field1065.method472((byte) -63);
        if (arg0 != 0) {
            field3276 = null;
        }
        class133.field2122.method472((byte) -63);
        class39.field742.method472((byte) -63);
        field3264++;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)I")
    public final int method1407(byte arg0) {
        field3261++;
        return arg0 == 76 ? this.field3277 : -9;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
    public static void method1408(byte arg0) {
        if (arg0 == -108) {
            field3276 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Z")
    public static final boolean method1409(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class73.field1194; var3++) {
            class126 var4 = class175.field2756[var3];
            if (var4.field2027 == 1) {
                int var5 = var4.field2031 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2030 * var5 >> 8) + var4.field2043;
                    int var7 = (var4.field2023 * var5 >> 8) + var4.field2025;
                    int var8 = (var4.field2033 * var5 >> 8) + var4.field2042;
                    int var9 = (var4.field2036 * var5 >> 8) + var4.field2048;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2027 == 2) {
                int var10 = arg0 - var4.field2031;
                if (var10 > 0) {
                    int var11 = (var4.field2030 * var10 >> 8) + var4.field2043;
                    int var12 = (var4.field2023 * var10 >> 8) + var4.field2025;
                    int var13 = (var4.field2033 * var10 >> 8) + var4.field2042;
                    int var14 = (var4.field2036 * var10 >> 8) + var4.field2048;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2027 == 3) {
                int var15 = var4.field2043 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2047 * var15 >> 8) + var4.field2031;
                    int var17 = (var4.field2041 * var15 >> 8) + var4.field2035;
                    int var18 = (var4.field2033 * var15 >> 8) + var4.field2042;
                    int var19 = (var4.field2036 * var15 >> 8) + var4.field2048;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2027 == 4) {
                int var20 = arg2 - var4.field2043;
                if (var20 > 0) {
                    int var21 = (var4.field2047 * var20 >> 8) + var4.field2031;
                    int var22 = (var4.field2041 * var20 >> 8) + var4.field2035;
                    int var23 = (var4.field2033 * var20 >> 8) + var4.field2042;
                    int var24 = (var4.field2036 * var20 >> 8) + var4.field2048;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2027 == 5) {
                int var25 = arg1 - var4.field2042;
                if (var25 > 0) {
                    int var26 = (var4.field2047 * var25 >> 8) + var4.field2031;
                    int var27 = (var4.field2041 * var25 >> 8) + var4.field2035;
                    int var28 = (var4.field2030 * var25 >> 8) + var4.field2043;
                    int var29 = (var4.field2023 * var25 >> 8) + var4.field2025;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIII)V")
    public static final void method1410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 4) {
            method1402((byte) 89, 17);
        }
        for (int var6 = arg3; var6 <= arg0; var6++) {
            class56.method420(class29.field452[var6], arg4, -7, arg5, arg2);
        }
        field3262++;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(I)V")
    public class204(int arg0) {
        this.field3270 = new class202[arg0];
        this.field3277 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class202 var3 = this.field3270[var2] = new class202();
            var3.field3245 = var3;
            var3.field3248 = var3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    public static final void method1411(int arg0) {
        field3269++;
        int var1 = -3 % ((46 - arg0) / 43);
        class226.field3746 = null;
        class44.field811 = null;
        class126.field2022 = null;
        class131.field2096 = null;
        class245.field3928 = null;
        class143.field2305 = null;
        class92.field1521 = null;
        class25.field418 = null;
        class5.field60 = null;
        class52.field901 = null;
        class288.field4559 = null;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)Lel;")
    public final class202 method1412(int arg0) {
        field3268++;
        if (this.field3279 > 0 && this.field3270[this.field3279 - 1] != this.field3278) {
            class202 var2 = this.field3278;
            this.field3278 = var2.field3245;
            return var2;
        } else if (arg0 > -61) {
            return null;
        } else {
            while (this.field3279 < this.field3277) {
                class202 var3 = this.field3270[this.field3279++].field3245;
                if (this.field3270[this.field3279 - 1] != var3) {
                    this.field3278 = var3.field3245;
                    return var3;
                }
            }
            return null;
        }
    }
}
