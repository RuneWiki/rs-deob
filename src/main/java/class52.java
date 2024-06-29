import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class52 extends class9 {

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "I")
    private int field1010 = -1;

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "Z")
    private volatile boolean field1009 = false;

    @OriginalMember(owner = "client!fd", name = "qb", descriptor = "Z")
    private boolean field1020 = false;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "client!fd", name = "tb", descriptor = "Lgg;")
    private class62 field1023;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "Lgg;")
    private class62 field1006;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "[Lmd;")
    public static class112[] field997 = new class112[50];

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "[I")
    public static int[] field1002 = new int[1000];

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    public static int field999 = 1;

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "Leh;")
    public static class47 field1011 = class195.method1282((byte) -4, "Angreifen");

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "Leh;")
    public static class47 field1005 = class195.method1282((byte) -4, "::gc");

    @OriginalMember(owner = "client!fd", name = "ob", descriptor = "Leh;")
    public static class47 field1018 = class195.method1282((byte) -4, " <col=00ff80>");

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "client!fd", name = "lb", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!fd", name = "mb", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!fd", name = "nb", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!fd", name = "pb", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!fd", name = "rb", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!fd", name = "sb", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!fd", name = "ub", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!fd", name = "vb", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "Lhd;")
    public static class68 field1008;

    @OriginalMember(owner = "client!fd", name = "kb", descriptor = "Ljh;")
    public static class89 field1014;

    @OriginalMember(owner = "client!fd", name = "jb", descriptor = "[Z")
    private volatile boolean[] field1013;

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lgg;Lgg;IZZZ)V")
    public class52(class62 arg0, class62 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1007 = arg2;
        this.field1020 = arg5;
        this.field1023 = arg0;
        this.field1006 = arg1;
        class69.method623(this, 26097, this.field1007);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BZZI)V")
    public final void method454(int arg0, byte[] arg1, boolean arg2, boolean arg3, int arg4) {
        ++field1017;
        if (arg2) {
            if (this.field1009) {
                throw new RuntimeException();
            }
            if (this.field1006 != null) {
                class182.method1217(arg1, this.field1006, -65536, this.field1007);
            }
            this.method63(-23627, arg1);
            this.method464(1860);
        } else {
            arg1[arg1.length + -2] = (byte) (super.field174[arg0] >> 8);
            arg1[arg1.length + -1] = (byte) super.field174[arg0];
            if (this.field1023 != null) {
                class182.method1217(arg1, this.field1023, -65536, arg0);
                this.field1013[arg0] = true;
            }
            if (arg3) {
                super.field183[arg0] = class56.method490(136, arg1, false);
            }
        }
        if (arg4 != 16624) {
            this.method459(111);
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(III)V")
    public final void method455(int arg0, int arg1, int arg2) {
        this.field1012 = arg0;
        this.field1001 = arg1;
        ++field1021;
        if (arg2 != 255) {
            this.method66((byte) -95, 72);
        }
        if (this.field1006 != null) {
            class90.method726(this.field1006, this.field1007, this, 0);
        } else {
            class73.method640(true, this.field1007, this.field1012, this, false, 255, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Leg;IIIIII)V")
    public static final void method456(class46 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0.field908.length;
        for (int var8 = 0; var8 < var7; ++var8) {
            int var21 = arg0.field908[var8] - class40.field790;
            int var22 = arg0.field905[var8] - class144.field2828;
            int var23 = arg0.field918[var8] - class87.field1866;
            int var24 = arg3 * var23 + arg4 * var21 >> 16;
            int var25 = arg4 * var23 - arg3 * var21 >> 16;
            int var27 = arg2 * var22 - arg1 * var25 >> 16;
            int var28 = arg1 * var22 + arg2 * var25 >> 16;
            if (var28 < 50) {
                return;
            }
            if (arg0.field915 != null) {
                class46.field906[var8] = var24;
                class46.field921[var8] = var27;
                class46.field920[var8] = var28;
            }
            class46.field910[var8] = (var24 << 9) / var28 + class17.field352;
            class46.field912[var8] = (var27 << 9) / var28 + class17.field336;
        }
        class17.field343 = 0;
        int var9 = arg0.field917.length;
        for (int var10 = 0; var10 < var9; ++var10) {
            int var11 = arg0.field917[var10];
            int var12 = arg0.field923[var10];
            int var13 = arg0.field919[var10];
            int var14 = class46.field910[var11];
            int var15 = class46.field910[var12];
            int var16 = class46.field910[var13];
            int var17 = class46.field912[var11];
            int var18 = class46.field912[var12];
            int var19 = class46.field912[var13];
            if ((var14 - var15) * (var19 - var18) - (var16 - var15) * (var17 - var18) > 0) {
                if (class188.field3644 && class70.method628(class206.field4051, class191.field3691, var17, var18, var19, var14, var15, var16)) {
                    class108.field2237 = arg5;
                    class21.field396 = arg6;
                }
                class17.field347 = false;
                if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > class17.field335 || var15 > class17.field335 || var16 > class17.field335) {
                    class17.field347 = true;
                }
                if (arg0.field915 != null && arg0.field915[var10] != -1) {
                    if (!class106.field2224) {
                        if (arg0.field911) {
                            class17.method178(var17, var18, var19, var14, var15, var16, arg0.field922[var10], arg0.field904[var10], arg0.field907[var10], class46.field906[0], class46.field906[1], class46.field906[3], class46.field921[0], class46.field921[1], class46.field921[3], class46.field920[0], class46.field920[1], class46.field920[3], arg0.field915[var10]);
                        } else {
                            class17.method178(var17, var18, var19, var14, var15, var16, arg0.field922[var10], arg0.field904[var10], arg0.field907[var10], class46.field906[var11], class46.field906[var12], class46.field906[var13], class46.field921[var11], class46.field921[var12], class46.field921[var13], class46.field920[var11], class46.field920[var12], class46.field920[var13], arg0.field915[var10]);
                        }
                    } else {
                        int var20 = class17.field354.method731(arg0.field915[var10], (byte) 60);
                        class17.method191(var17, var18, var19, var14, var15, var16, class8.method52(var20, arg0.field922[var10]), class8.method52(var20, arg0.field904[var10]), class8.method52(var20, arg0.field907[var10]));
                    }
                } else if (arg0.field922[var10] != 12345678) {
                    class17.method191(var17, var18, var19, var14, var15, var16, arg0.field922[var10], arg0.field904[var10], arg0.field907[var10]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lsh;Z)V")
    public static final void method457(class170 arg0, boolean arg1) {
        if (class18.field362 == arg0.field3339 || ~arg0.field3330 == 0 || arg0.field3329 != 0 || arg0.field3305 - -1 > class25.method236(false, arg0.field3330).field419[arg0.field3290]) {
            int var2 = arg0.field3339 - arg0.field3283;
            int var3 = -arg0.field3283 + class18.field362;
            int var4 = arg0.field3311 * 128 + arg0.field3276 * 64;
            int var5 = arg0.field3289 * 128 + arg0.field3276 * 64;
            int var6 = arg0.field3298 * 128 + arg0.field3276 * 64;
            arg0.field3291 = ((-var3 + var2) * var5 + var3 * var6) / var2;
            int var7 = arg0.field3331 * 128 - -(arg0.field3276 * 64);
            arg0.field3281 = ((-var3 + var2) * var4 - -(var3 * var7)) / var2;
        }
        arg0.field3273 = 0;
        if (arg0.field3313 == 0) {
            arg0.field3282 = 1024;
        }
        ++field1022;
        if (arg0.field3313 == 1) {
            arg0.field3282 = 1536;
        }
        if (arg1) {
            method460(102, 126);
        }
        if (~arg0.field3313 == -3) {
            arg0.field3282 = 0;
        }
        if (arg0.field3313 == 3) {
            arg0.field3282 = 512;
        }
        arg0.field3286 = arg0.field3282;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
    public static void method458(int arg0) {
        field997 = null;
        field1005 = null;
        field1014 = null;
        field1011 = null;
        if (arg0 != 3) {
            method458(101);
        }
        field1002 = null;
        field1018 = null;
        field1008 = null;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)I")
    public final int method459(int arg0) {
        ++field1025;
        if (this.field1009) {
            return 100;
        } else if (super.field183 != null) {
            return 99;
        } else {
            int var2 = class110.method887(this.field1007, 255, 99);
            if (var2 >= arg0) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(II)Z")
    public static final boolean method460(int arg0, int arg1) {
        int var2 = -41 / ((22 - arg0) / 60);
        ++field1003;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public static final void method461(byte arg0) {
        class159.field3090.method993(1);
        class161.field3137.method993(1);
        ++field1015;
        if (arg0 <= 71) {
            method457((class170) null, true);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILgg;BZ[B)V")
    public final void method462(int arg0, class62 arg1, byte arg2, boolean arg3, byte[] arg4) {
        if (arg2 >= 35) {
            ++field998;
            if (this.field1006 == arg1) {
                if (this.field1009) {
                    throw new RuntimeException();
                } else if (arg4 == null) {
                    class73.method640(true, this.field1007, this.field1012, this, false, 255, (byte) 0);
                } else {
                    class94.field1949.reset();
                    class94.field1949.update(arg4, 0, arg4.length);
                    int var6 = (int) class94.field1949.getValue();
                    class68 var7 = new class68(class137.method998(arg4, 118));
                    int var8 = var7.method604((byte) -124);
                    if (~var8 != -6 && var8 != 6) {
                        throw new RuntimeException("Incorrect JS5 protocol number: " + var8);
                    } else {
                        int var9 = 0;
                        if (~var8 <= -7) {
                            var9 = var7.method599((byte) 96);
                        }
                        if (this.field1012 == var6 && this.field1001 == var9) {
                            this.method63(-23627, arg4);
                            this.method464(1860);
                        } else {
                            class73.method640(true, this.field1007, this.field1012, this, false, 255, (byte) 0);
                        }
                    }
                }
            } else {
                if (!arg3 && ~this.field1010 == ~arg0) {
                    this.field1009 = true;
                }
                if (arg4 != null && arg4.length > 2) {
                    class94.field1949.reset();
                    class94.field1949.update(arg4, 0, arg4.length + -2);
                    int var10 = (int) class94.field1949.getValue();
                    int var11 = ((255 & arg4[arg4.length - 2]) << 8) + (arg4[arg4.length + -1] & 255);
                    if (super.field202[arg0] == var10 && ~super.field174[arg0] == ~var11) {
                        this.field1013[arg0] = true;
                        if (arg3) {
                            super.field183[arg0] = class56.method490(136, arg4, false);
                        }
                    } else {
                        this.field1013[arg0] = false;
                        if (this.field1020 || arg3) {
                            class73.method640(arg3, arg0, super.field202[arg0], this, false, this.field1007, (byte) 2);
                        }
                    }
                } else {
                    this.field1013[arg0] = false;
                    if (this.field1020 || arg3) {
                        class73.method640(arg3, arg0, super.field202[arg0], this, false, this.field1007, (byte) 2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)I")
    public final int method463(int arg0) {
        ++field1016;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; super.field183.length > var4; ++var4) {
            if (~super.field204[var4] < -1) {
                var3 += this.method465(16, var4);
                var2 += 100;
            }
        }
        if (arg0 != 13492) {
            return 73;
        } else if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
    private final void method464(int arg0) {
        ++field1004;
        this.field1013 = new boolean[super.field183.length];
        for (int var2 = 0; this.field1013.length > var2; ++var2) {
            this.field1013[var2] = false;
        }
        if (this.field1023 == null) {
            this.field1009 = true;
        } else {
            this.field1010 = -1;
            int var3 = 0;
            if (arg0 == 1860) {
                while (var3 < this.field1013.length) {
                    if (super.field204[var3] > 0) {
                        class195.method1281(this.field1023, var3, this, false);
                        this.field1010 = var3;
                    }
                    ++var3;
                }
                if (~this.field1010 == 0) {
                    this.field1009 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)V")
    public final void method66(byte arg0, int arg1) {
        if (arg0 == -28) {
            ++field1019;
            if (this.field1023 != null && this.field1013 != null && this.field1013[arg1]) {
                class90.method726(this.field1023, arg1, this, 0);
            } else {
                class73.method640(true, arg1, super.field202[arg1], this, false, this.field1007, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(II)I")
    private final int method465(int arg0, int arg1) {
        ++field1024;
        if (super.field183[arg1] != null) {
            return 100;
        } else if (this.field1013[arg1]) {
            return 100;
        } else {
            return arg0 != 16 ? -86 : class110.method887(arg1, this.field1007, 99);
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(III)Lee;")
    public static final class44 method466(int arg0, int arg1, int arg2) {
        class152 var3 = class173.field3351[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2991;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(BI)V")
    public final void method70(byte arg0, int arg1) {
        ++field1000;
        class180.method1201(arg1, false, this.field1007);
        if (arg0 != 125) {
            this.field1007 = -90;
        }
    }
}
