import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class224 {

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    private int field3187 = 0;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "[Lsi;")
    public class332[] field3173;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field3184 = 0;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "B")
    public static byte field3164;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "J")
    private long field3167;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "Lfl;")
    public static class239 field3186;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lsi;")
    private class332 field3165;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Lsi;")
    private class332 field3181;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
    public static boolean field3177;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "[[[B")
    public static byte[][][] field3179;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 11)
    public final void method1533(int arg0) {
        int var2 = 0;
        if (arg0 != 9) {
            return;
        }
        while (var2 < this.field3169) {
            class332 var3 = this.field3173[var2];
            while (true) {
                class332 var4 = var3.field5073;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method2285(true);
            }
        }
        field3170++;
        this.field3165 = null;
        this.field3181 = null;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 41)
    public static final void method1534(int arg0) {
        class81.field1047 = arg0;
        for (int var1 = 0; var1 < class62.field788; var1++) {
            for (int var2 = 0; var2 < class326.field4993; var2++) {
                if (class158.field2184[arg0][var1][var2] == null) {
                    class158.field2184[arg0][var1][var2] = new class225(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)I", line = 67)
    public final int method1535(boolean arg0) {
        if (!arg0) {
            this.field3181 = (class332) null;
        }
        field3162++;
        return this.field3169;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([Lsi;I)I", line = 88)
    public final int method1536(class332[] arg0, int arg1) {
        field3172++;
        if (arg1 != 1) {
            field3184 = 76;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3169; var4++) {
            class332 var5 = this.field3173[var4];
            for (class332 var6 = var5.field5073; var6 != var5; var6 = var6.field5073) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(JI)Lsi;", line = 124)
    public final class332 method1537(long arg0, int arg1) {
        if (arg1 != -22708) {
            return (class332) null;
        }
        field3171++;
        this.field3167 = arg0;
        class332 var4 = this.field3173[(int) (arg0 & (long) (this.field3169 - 1))];
        for (this.field3165 = var4.field5073; this.field3165 != var4; this.field3165 = this.field3165.field5073) {
            if (this.field3165.field5065 == arg0) {
                class332 var5 = this.field3165;
                this.field3165 = this.field3165.field5073;
                return var5;
            }
        }
        this.field3165 = null;
        return null;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Lsi;", line = 155)
    public final class332 method1538(int arg0) {
        field3182++;
        if (this.field3165 == null) {
            return null;
        }
        class332 var2 = this.field3173[(int) (this.field3167 & (long) (this.field3169 + arg0))];
        while (this.field3165 != var2) {
            if (this.field3165.field5065 == this.field3167) {
                class332 var3 = this.field3165;
                this.field3165 = this.field3165.field5073;
                return var3;
            }
            this.field3165 = this.field3165.field5073;
        }
        this.field3165 = null;
        return null;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)I", line = 187)
    public final int method1539(int arg0) {
        int var2 = 117 / ((arg0 + 18) / 44);
        field3166++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3169; var4++) {
            class332 var5 = this.field3173[var4];
            for (class332 var6 = var5.field5073; var6 != var5; var6 = var6.field5073) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)Lsi;", line = 223)
    public final class332 method1540(int arg0) {
        int var2 = -116 % ((arg0 + 57) / 62);
        field3180++;
        this.field3187 = 0;
        return this.method1544(-105);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLsi;J)V", line = 233)
    public final void method1541(boolean arg0, class332 arg1, long arg2) {
        if (arg1.field5067 != null) {
            arg1.method2285(true);
        }
        field3175++;
        class332 var5 = this.field3173[(int) ((long) (this.field3169 - 1) & arg2)];
        arg1.field5067 = var5.field5067;
        if (arg0) {
            this.method1533(-60);
        }
        arg1.field5073 = var5;
        arg1.field5067.field5073 = arg1;
        arg1.field5073.field5067 = arg1;
        arg1.field5065 = arg2;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V", line = 255)
    public class224(int arg0) {
        this.field3169 = arg0;
        this.field3173 = new class332[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class332 var3 = this.field3173[var2] = new class332();
            var3.field5067 = var3;
            var3.field5073 = var3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V", line = 279)
    public static final void method1542(byte arg0, int arg1, int arg2) {
        int var3 = 55 % ((-arg0 - 14) / 39);
        field3185++;
        if (class10.field141 != arg2) {
            class334.field5157 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class334.field5157[var4] = (var4 << 12) / arg2;
            }
            class185.field2671 = arg2 * 32;
            class244.field3664 = arg2 - 1;
            class10.field141 = arg2;
        }
        if (class322.field4940 == arg1) {
            return;
        }
        if (class10.field141 == arg1) {
            class49.field600 = class334.field5157;
        } else {
            class49.field600 = new int[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                class49.field600[var5] = (var5 << 12) / arg1;
            }
        }
        class322.field4940 = arg1;
        class237.field3486 = arg1 - 1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIZIIIIII)V", line = 323)
    public static final void method1543(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3168++;
        int var12 = arg7 - arg3;
        int var13 = -1;
        int var14 = arg0 - arg11;
        if (arg4 < class313.field4842) {
            if (class312.field4830 > 10) {
                var13 = 50 + 50 - (class312.field4830 * 5);
            } else {
                var13 = class312.field4830 * 5;
            }
        }
        int var15 = 983040 / arg9;
        int var16 = 983040 / arg2;
        for (int var17 = -var15; var17 < var12 + var15; var17++) {
            int var18 = arg9 * var17 + arg8 >> 16;
            int var19 = (var17 + 1) * arg9 + arg8 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var21 = arg3 + var17 >> 6;
                int var22 = arg10 + var18;
                int var10000 = arg10 + var19;
                if (var21 >= 0 && (class157.field2167.length - 1) >= var21) {
                    int[][] var24 = class157.field2167[var21];
                    for (int var25 = -var16; var25 < (var14 + var16); var25++) {
                        int var26 = arg2 * var25 + arg1 >> 16;
                        int var27 = (var25 + 1) * arg2 + arg1 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            int var29 = arg6 + var26;
                            var10000 = arg6 + var27;
                            int var31 = var25 + arg11 >> 6;
                            if (var31 >= 0 && var31 <= (var24.length - 1) && var24[var31] != null) {
                                int var32 = ((var25 + arg11 & 0x3F) << 6) + (arg3 + var17 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class238 var34 = class142.method951(var33 - 1, arg4 + 26915);
                                    if (!class74.field960[var34.field3547]) {
                                        if (var13 != -1 && class276.field4301 == var34.field3547) {
                                            class316 var35 = new class316();
                                            var35.field4863 = var34.field3547;
                                            var35.field4869 = var22;
                                            var35.field4866 = var29;
                                            class343.field5330.method2325(var35, (byte) 34);
                                        } else {
                                            class63.field825[var34.field3547].method531(var22 - 7, var29 - 7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class316 var36 = (class316) class343.field5330.method2331((byte) 83); var36 != null; var36 = (class316) class343.field5330.method2332(arg4 ^ 0xFFFFFF9A)) {
            class144.method975(var36.field4869, var36.field4866, 15, 16776960, var13);
            class144.method975(var36.field4869, var36.field4866, 13, 16776960, var13);
            class144.method975(var36.field4869, var36.field4866, 11, 16776960, var13);
            class144.method975(var36.field4869, var36.field4866, 9, 16776960, var13);
            class63.field825[var36.field4863].method531(var36.field4869 - 7, var36.field4866 + -7);
        }
        class343.field5330.method2333(3393);
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)Lsi;", line = 446)
    public final class332 method1544(int arg0) {
        field3176++;
        if (this.field3187 > 0 && this.field3173[this.field3187 - 1] != this.field3181) {
            class332 var2 = this.field3181;
            this.field3181 = var2.field5073;
            return var2;
        }
        int var3 = -14 % ((arg0 - 89) / 37);
        class332 var4;
        do {
            if (this.field3169 <= this.field3187) {
                return null;
            }
            var4 = this.field3173[this.field3187++].field5073;
        } while (this.field3173[this.field3187 - 1] == var4);
        this.field3181 = var4.field5073;
        return var4;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 479)
    public static void method1545(byte arg0) {
        field3179 = (byte[][][]) null;
        field3186 = null;
        if (arg0 >= -77) {
            method1547((byte) -127, (class109) null);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)I", line = 491)
    public static final int method1546(byte arg0, int arg1) {
        if (arg0 != 42) {
            method1534(-68);
        }
        field3174++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLqb;)I", line = 512)
    public static final int method1547(byte arg0, class109 arg1) {
        field3163++;
        if (arg0 != 117) {
            return 93;
        }
        int var2 = arg1.field1515;
        class191 var3 = arg1.method1102((byte) -77);
        if (arg1.field2376 == var3.field2737) {
            var2 = arg1.field1508;
        } else if (arg1.field2376 == var3.field2728 || arg1.field2376 == var3.field2757 || arg1.field2376 == var3.field2721 || arg1.field2376 == var3.field2732) {
            var2 = arg1.field1509;
        } else if (arg1.field2376 == var3.field2739 || arg1.field2376 == var3.field2742 || arg1.field2376 == var3.field2722 || arg1.field2376 == var3.field2738) {
            var2 = arg1.field1487;
        }
        return var2;
    }
}
