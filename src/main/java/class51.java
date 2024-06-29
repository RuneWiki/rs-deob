import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class51 extends class157 {

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    private int field998 = 1024;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    private int field1001 = 81;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    private int field1003 = 8;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    private int field1005 = 0;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    private int field1010 = 4;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    private int field1015 = 204;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    private int field1006 = 409;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    private int field1000 = 1024;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "Z")
    public static boolean field1008 = false;

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "Lji;")
    public static class42 field1021 = null;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "I")
    private int field1019;

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "[I")
    private int[] field1018;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "[[I")
    private int[][] field1014;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "[[I")
    private int[][] field999;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)I")
    public static final int method386(int arg0, boolean arg1) {
        ++field1004;
        if (arg0 < 0) {
            return 0;
        } else {
            class75 var2 = (class75) class31.field554.method1755((long) arg0, (byte) -128);
            if (var2 == null) {
                return class134.method938(arg0, -103).field2602;
            } else {
                int var3 = 0;
                int var4 = 0;
                if (arg1) {
                    field1008 = true;
                }
                while (~var2.field1403.length < ~var4) {
                    if (var2.field1403[var4] == -1) {
                        ++var3;
                    }
                    ++var4;
                }
                return var3 + class134.method938(arg0, -92).field2602 + -var2.field1403.length;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIII)V")
    public static final void method387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class56.method441(false, arg5);
        ++field1020;
        if (arg2 >= 120) {
            int var7 = 0;
            int var8 = arg5 - arg0;
            if (~var8 > -1) {
                var8 = 0;
            }
            int var9 = arg5;
            int var10 = -arg5;
            int var11 = var8;
            int var12 = -1;
            int var13 = -var8;
            int var14 = -1;
            if (arg4 >= class102.field1957 && ~arg4 >= ~class155.field2847) {
                int[] var15 = class252.field4543[arg4];
                int var16 = class257.method1787(class262.field4723, -arg5 + arg3, 28, class230.field4184);
                int var17 = class257.method1787(class262.field4723, arg3 + arg5, 28, class230.field4184);
                int var18 = class257.method1787(class262.field4723, -var8 + arg3, 28, class230.field4184);
                int var19 = class257.method1787(class262.field4723, arg3 + var8, 28, class230.field4184);
                class176.method1215(var16, arg1, var15, var18, (byte) -64);
                class176.method1215(var18, arg6, var15, var19, (byte) 123);
                class176.method1215(var19, arg1, var15, var17, (byte) 6);
            }
            while (var7 < var9) {
                var12 += 2;
                var10 += var12;
                var14 += 2;
                var13 += var14;
                if (~var13 <= -1 && ~var11 <= -2) {
                    --var11;
                    class122.field2408[var11] = var7;
                    var13 -= var11 << 1;
                }
                ++var7;
                if (var10 >= 0) {
                    --var9;
                    var10 -= var9 << 1;
                    int var20 = -var9 + arg4;
                    int var21 = arg4 - -var9;
                    if (~class102.field1957 >= ~var21 && class155.field2847 >= var20) {
                        if (var8 <= var9) {
                            int var22 = class257.method1787(class262.field4723, arg3 + var7, 28, class230.field4184);
                            int var23 = class257.method1787(class262.field4723, -var7 + arg3, 28, class230.field4184);
                            if (~class155.field2847 <= ~var21) {
                                class176.method1215(var23, arg1, class252.field4543[var21], var22, (byte) -122);
                            }
                            if (~class102.field1957 >= ~var20) {
                                class176.method1215(var23, arg1, class252.field4543[var20], var22, (byte) -45);
                            }
                        } else {
                            int var24 = class122.field2408[var9];
                            int var25 = class257.method1787(class262.field4723, arg3 + var7, 28, class230.field4184);
                            int var26 = class257.method1787(class262.field4723, -var7 + arg3, 28, class230.field4184);
                            int var27 = class257.method1787(class262.field4723, arg3 + var24, 28, class230.field4184);
                            int var28 = class257.method1787(class262.field4723, -var24 + arg3, 28, class230.field4184);
                            if (~var21 >= ~class155.field2847) {
                                int[] var29 = class252.field4543[var21];
                                class176.method1215(var26, arg1, var29, var28, (byte) 121);
                                class176.method1215(var28, arg6, var29, var27, (byte) -80);
                                class176.method1215(var27, arg1, var29, var25, (byte) 0);
                            }
                            if (class102.field1957 <= var20) {
                                int[] var30 = class252.field4543[var20];
                                class176.method1215(var26, arg1, var30, var28, (byte) 115);
                                class176.method1215(var28, arg6, var30, var27, (byte) -87);
                                class176.method1215(var27, arg1, var30, var25, (byte) -78);
                            }
                        }
                    }
                }
                int var31 = arg4 + var7;
                int var32 = -var7 + arg4;
                if (~var31 <= ~class102.field1957 && ~var32 >= ~class155.field2847) {
                    int var33 = arg3 + var9;
                    int var34 = -var9 + arg3;
                    if (~class262.field4723 >= ~var33 && ~class230.field4184 <= ~var34) {
                        int var35 = class257.method1787(class262.field4723, var33, 28, class230.field4184);
                        int var36 = class257.method1787(class262.field4723, var34, 28, class230.field4184);
                        if (~var7 <= ~var8) {
                            if (~class155.field2847 <= ~var31) {
                                class176.method1215(var36, arg1, class252.field4543[var31], var35, (byte) -119);
                            }
                            if (class102.field1957 <= var32) {
                                class176.method1215(var36, arg1, class252.field4543[var32], var35, (byte) -83);
                            }
                        } else {
                            int var37 = var11 >= var7 ? var11 : class122.field2408[var7];
                            int var38 = class257.method1787(class262.field4723, arg3 + var37, 28, class230.field4184);
                            int var39 = class257.method1787(class262.field4723, -var37 + arg3, 28, class230.field4184);
                            if (var31 <= class155.field2847) {
                                int[] var40 = class252.field4543[var31];
                                class176.method1215(var36, arg1, var40, var39, (byte) -69);
                                class176.method1215(var39, arg6, var40, var38, (byte) -113);
                                class176.method1215(var38, arg1, var40, var35, (byte) 119);
                            }
                            if (~class102.field1957 >= ~var32) {
                                int[] var41 = class252.field4543[var32];
                                class176.method1215(var36, arg1, var41, var39, (byte) 125);
                                class176.method1215(var39, arg6, var41, var38, (byte) -40);
                                class176.method1215(var38, arg1, var41, var35, (byte) 125);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static void method388(byte arg0) {
        int var1 = 20 / ((arg0 - -64) / 53);
        field1021 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIIII)V")
    public static final void method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class49.field976 = arg2;
        if (arg5 <= -86) {
            class192.field3483 = arg3;
            class106.field2053 = arg1;
            class190.field3444 = arg0;
            class178.field3249 = arg4;
            if (class192.field3483 >= 100) {
                int var6 = class49.field976 * 128 + 64;
                int var7 = class106.field2053 * 128 + 64;
                int var8 = class94.method661(var7, 19452, class99.field1937, var6) + -class190.field3444;
                int var9 = -class60.field1213 + var6;
                int var10 = -class103.field1990 + var7;
                int var11 = -class183.field3312 + var8;
                int var12 = (int) Math.sqrt((double) (var9 * var9 - -(var10 * var10)));
                class182.field3304 = 2047 & (int) (Math.atan2((double) var11, (double) var12) * 325.949D);
                class179.field3256 = (int) (Math.atan2((double) var9, (double) var10) * -325.949D) & 2047;
                if (class182.field3304 < 128) {
                    class182.field3304 = 128;
                }
                if (~class182.field3304 < -384) {
                    class182.field3304 = 383;
                }
            }
            ++field1017;
            class16.field334 = 2;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class51() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 > -29) {
            method391((class49) null, true, -3, 73, false, 7);
        }
        ++field1011;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 == 7) {
                                        this.field998 = arg2.method736(121);
                                    }
                                } else {
                                    this.field1001 = arg2.method736(126);
                                }
                            } else {
                                this.field1005 = arg2.method736(125);
                            }
                        } else {
                            this.field1000 = arg2.method736(127);
                        }
                    } else {
                        this.field1015 = arg2.method736(127);
                    }
                } else {
                    this.field1006 = arg2.method736(126);
                }
            } else {
                this.field1003 = arg2.method774((byte) 102);
            }
        } else {
            this.field1010 = arg2.method774((byte) 111);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        if (arg0 != -98) {
            return null;
        } else {
            int[] var3 = super.field2879.method1269(arg1, 17885);
            ++field1009;
            if (super.field2879.field3363) {
                int var4;
                for (var4 = class129.field2479[arg1] + this.field1005; ~var4 > -1; var4 += 4096) {
                }
                while (~var4 < -4097) {
                    var4 -= 4096;
                }
                int var5;
                for (var5 = 0; var5 < this.field1003 && ~var4 <= ~this.field1018[var5]; ++var5) {
                }
                boolean var6 = ~(var5 & 1) == -1;
                int var7 = var5 + -1;
                int var8 = this.field1018[var5];
                int var9 = this.field1018[var5 + -1];
                if (var9 - -this.field1019 < var4 && ~(var8 - this.field1019) < ~var4) {
                    for (int var10 = 0; var10 < class226.field4124; ++var10) {
                        int var11 = 0;
                        int var12 = var6 ? this.field1000 : -this.field1000;
                        int var13;
                        for (var13 = (this.field1016 * var12 >> 12) + class50.field987[var10]; ~var13 > -1; var13 += 4096) {
                        }
                        while (~var13 < -4097) {
                            var13 -= 4096;
                        }
                        while (~var11 > ~this.field1010 && ~this.field999[var7][var11] >= ~var13) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field999[var7][var11];
                        int var16 = this.field999[var7][var14];
                        if (this.field1019 + var16 < var13 && ~var13 > ~(-this.field1019 + var15)) {
                            var3[var10] = this.field1014[var7][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class270.method1844(var3, 0, class226.field4124, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "(I)V")
    private final void method390(int arg0) {
        ++field1013;
        Random var2 = new Random((long) this.field1003);
        this.field1019 = this.field1001 / 2;
        this.field1014 = new int[this.field1003][this.field1010];
        this.field1016 = 4096 / this.field1010;
        this.field999 = new int[this.field1003][this.field1010 - -1];
        this.field1007 = 4096 / this.field1003;
        this.field1018 = new int[this.field1003 + 1];
        this.field1018[0] = 0;
        int var3 = this.field1016 / 2;
        int var4 = this.field1007 / 2;
        for (int var5 = 0; var5 < this.field1003; ++var5) {
            if (var5 > 0) {
                int var7 = this.field1007;
                int var8 = (class39.method295(-61, var2, 4096) + -2048) * this.field1015 >> 12;
                int var9 = (var4 * var8 >> 12) + var7;
                this.field1018[var5] = this.field1018[var5 + -1] + var9;
            }
            this.field999[var5][0] = 0;
            for (int var10 = 0; this.field1010 > var10; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field1016;
                    int var12 = (class39.method295(-61, var2, 4096) + -2048) * this.field1006 >> 12;
                    int var13 = (var3 * var12 >> 12) + var11;
                    this.field999[var5][var10] = this.field999[var5][var10 + -1] - -var13;
                }
                this.field1014[var5][var10] = ~this.field998 >= -1 ? 4096 : -class39.method295(-61, var2, this.field998) + 4096;
            }
            this.field999[var5][this.field1010] = 4096;
        }
        int var6 = -45 % ((-4 - arg0) / 38);
        this.field1018[this.field1003] = 4096;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        ++field1002;
        this.method390(41);
        int var2 = -68 / ((-51 - arg0) / 52);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lsj;ZIIZI)V")
    public static final void method391(class49 arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class131.field2513 = arg1;
        class61.field1220 = 10000;
        ++field1012;
        class54.field1067 = arg5;
        class244.field4428 = 1;
        class262.field4724 = arg3;
        class99.field1930 = arg2;
        class65.field1264 = arg0;
        if (!arg4) {
            method388((byte) 53);
        }
    }
}
