import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class35 extends class200 {

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "Z")
    private boolean field503 = true;

    @OriginalMember(owner = "client!vk", name = "W", descriptor = "I")
    private int field509 = 4;

    @OriginalMember(owner = "client!vk", name = "Z", descriptor = "I")
    private int field512 = 0;

    @OriginalMember(owner = "client!vk", name = "cb", descriptor = "I")
    private int field515 = 4;

    @OriginalMember(owner = "client!vk", name = "Y", descriptor = "[B")
    private byte[] field511 = new byte[512];

    @OriginalMember(owner = "client!vk", name = "ob", descriptor = "I")
    private int field527 = 4;

    @OriginalMember(owner = "client!vk", name = "nb", descriptor = "I")
    private int field526 = 1638;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "Lid;")
    private static class149 field507 = class60.method382("Drop", (byte) 94);

    @OriginalMember(owner = "client!vk", name = "db", descriptor = "I")
    public static int field516 = -2;

    @OriginalMember(owner = "client!vk", name = "gb", descriptor = "I")
    public static int field519 = 0;

    @OriginalMember(owner = "client!vk", name = "bb", descriptor = "Lid;")
    public static class149 field514 = field507;

    @OriginalMember(owner = "client!vk", name = "qb", descriptor = "Lid;")
    private static class149 field529 = class60.method382("Loaded update list", (byte) 29);

    @OriginalMember(owner = "client!vk", name = "X", descriptor = "Lid;")
    public static class149 field510 = field529;

    @OriginalMember(owner = "client!vk", name = "kb", descriptor = "Z")
    public static boolean field523 = false;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "Lve;")
    public static class189 field505 = new class189(260);

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!vk", name = "ab", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!vk", name = "fb", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!vk", name = "hb", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!vk", name = "ib", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!vk", name = "jb", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!vk", name = "lb", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!vk", name = "mb", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!vk", name = "pb", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!vk", name = "rb", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!vk", name = "sb", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "[I")
    public static int[] field501;

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "[S")
    private short[] field508;

    @OriginalMember(owner = "client!vk", name = "eb", descriptor = "[S")
    private short[] field517;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V")
    public static final void method197(int arg0, int arg1, int arg2) {
        if (class137.field2515 != arg1) {
            class73.field1263 = new int[arg1];
            for (int var3 = 0; var3 < arg1; ++var3) {
                class73.field1263[var3] = (var3 << 12) / arg1;
            }
            class165.field3069 = arg1 == 64 ? 2048 : 4096;
            class137.field2515 = arg1;
            class261.field4667 = arg1 + -1;
        }
        if (~class276.field4934 != ~arg2) {
            if (~class137.field2515 != ~arg2) {
                class93.field1644 = new int[arg2];
                for (int var4 = 0; arg2 > var4; ++var4) {
                    class93.field1644[var4] = (var4 << 12) / arg2;
                }
            } else {
                class93.field1644 = class73.field1263;
            }
            class191.field3436 = arg2 + -1;
            class276.field4934 = arg2;
        }
        int var5 = 77 / ((arg0 - 35) / 59);
        ++field513;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIII)I")
    private final int method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field524;
        int var8 = arg6 - 4096;
        if (arg3 < 61) {
            method199((byte) 102, (class131) null);
        }
        int var9 = arg5 >> 12;
        int var10 = arg5 & 4095;
        int var11 = var9 - -1;
        if (~var11 <= ~arg1) {
            var11 = 0;
        }
        int var12 = var11 & 255;
        int var13 = var9 & 255;
        int var14 = 3 & this.field511[arg4 + var13];
        int var15 = var10 + -4096;
        int var16;
        if (~var14 < -2) {
            var16 = ~var14 != -3 ? -arg6 + -var10 : -arg6 + var10;
        } else {
            var16 = var14 != 0 ? -var10 + arg6 : arg6 + var10;
        }
        int var17 = this.field511[arg4 + var12] & 3;
        int var18;
        if (var17 > 1) {
            var18 = ~var17 == -3 ? -arg6 + var15 : -arg6 + -var15;
        } else {
            var18 = ~var17 == -1 ? arg6 + var15 : -var15 + arg6;
        }
        int var19 = this.field511[arg2 + var13] & 3;
        int var20 = class145.field2621[var10];
        int var21 = var16 - -((-var16 + var18) * var20 >> 12);
        int var22;
        if (var19 <= 1) {
            var22 = var19 != 0 ? var8 - var10 : var10 - -var8;
        } else {
            var22 = var19 != 2 ? -var8 + -var10 : var10 - var8;
        }
        int var23 = 3 & this.field511[var12 - -arg2];
        int var24;
        if (var23 > 1) {
            var24 = ~var23 == -3 ? -var8 + var15 : -var15 - var8;
        } else {
            var24 = var23 == 0 ? var8 + var15 : -var15 + var8;
        }
        int var25 = var22 - -((-var22 + var24) * var20 >> 12);
        return var21 - -((-var21 + var25) * arg0 >> 12);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public final void method150(int arg0) {
        this.field511 = class1.method4(this.field512, (byte) 108);
        this.method203((byte) -92);
        ++field504;
        int var2 = this.field509 - 1;
        int var3 = -42 % ((-60 - arg0) / 62);
        while (var2 >= 1) {
            short var4 = this.field508[var2];
            if (~var4 < -9 || ~var4 > 7) {
                return;
            }
            --this.field509;
            --var2;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLob;)V")
    public static final void method199(byte arg0, class131 arg1) {
        class264 var2 = arg1.method923((byte) -40);
        if (arg0 <= 7) {
            method206(-125, (class230) null, 60);
        }
        ++field506;
        arg1.field2334 = var2.field4718;
        if (~arg1.field2327 != -1) {
            if (~arg1.field2349 != 0 && arg1.field2406 == 0) {
                class164 var3 = class69.method436(arg1.field2349, -32);
                if (~arg1.field2341 < -1 && var3.field3043 == 0) {
                    ++arg1.field2401;
                    return;
                }
                if (~arg1.field2341 >= -1 && ~var3.field3039 == -1) {
                    ++arg1.field2401;
                    return;
                }
            }
            int var4 = arg1.field2340;
            int var5 = arg1.field2347;
            int var6 = arg1.field2333[arg1.field2327 + -1] * 128 - -(arg1.method885((byte) -105) * 64);
            int var7 = arg1.field2400[arg1.field2327 + -1] * 128 - -(64 * arg1.method885((byte) -70));
            if (-var5 + var6 > 256 || -var5 + var6 < -256 || ~(-var4 + var7) < -257 || ~(var7 - var4) > 255) {
                arg1.field2347 = var6;
                arg1.field2340 = var7;
                return;
            }
            if (~var6 < ~var5) {
                if (var7 <= var4) {
                    if (~var4 < ~var7) {
                        arg1.field2335 = 1792;
                    } else {
                        arg1.field2335 = 1536;
                    }
                } else {
                    arg1.field2335 = 1280;
                }
            } else if (var6 < var5) {
                if (var7 > var4) {
                    arg1.field2335 = 768;
                } else if (var7 >= var4) {
                    arg1.field2335 = 512;
                } else {
                    arg1.field2335 = 256;
                }
            } else if (~var4 > ~var7) {
                arg1.field2335 = 1024;
            } else if (~var4 < ~var7) {
                arg1.field2335 = 0;
            }
            int var8 = var2.field4698;
            int var9 = 4;
            boolean var10 = true;
            int var11 = -arg1.field2354 + arg1.field2335 & 2047;
            if (var11 > 1024) {
                var11 -= 2048;
            }
            if (var11 >= -256 && var11 <= 256) {
                var8 = var2.field4715;
            } else if (~var11 <= -257 && ~var11 > -769) {
                var8 = var2.field4702;
            } else if (~var11 <= 767 && var11 <= -256) {
                var8 = var2.field4700;
            }
            byte var12 = 1;
            if (~var8 == 0) {
                var8 = var2.field4715;
            }
            arg1.field2334 = var8;
            if (arg1 instanceof class20) {
                var10 = ((class20) arg1).field296.field1034;
            }
            if (var10) {
                if (~arg1.field2354 != ~arg1.field2335 && ~arg1.field2399 == 0 && arg1.field2305 != 0) {
                    var9 = 2;
                }
                if (~arg1.field2327 < -3) {
                    var9 = 6;
                }
                if (arg1.field2327 > 3) {
                    var9 = 8;
                }
                if (arg1.field2401 > 0 && arg1.field2327 > 1) {
                    --arg1.field2401;
                    var9 = 8;
                }
            } else {
                if (arg1.field2327 > 1) {
                    var9 = 6;
                }
                if (~arg1.field2327 < -3) {
                    var9 = 8;
                }
                if (~arg1.field2401 < -1 && arg1.field2327 > 1) {
                    var9 = 8;
                    --arg1.field2401;
                }
            }
            if (arg1.field2325[arg1.field2327 - 1] != 2) {
                if (~arg1.field2325[arg1.field2327 + -1] == -1) {
                    var12 = 0;
                    var9 >>= 1;
                }
            } else {
                var12 = 2;
                var9 <<= 1;
            }
            if (var9 >= 8 && var2.field4733 != -1) {
                if (~arg1.field2334 == ~var2.field4698 && var2.field4716 != -1) {
                    arg1.field2334 = var2.field4716;
                } else if (arg1.field2334 == var2.field4700 && var2.field4727 != -1) {
                    arg1.field2334 = var2.field4727;
                } else if (arg1.field2334 == var2.field4702 && var2.field4703 != -1) {
                    arg1.field2334 = var2.field4703;
                } else {
                    arg1.field2334 = var2.field4733;
                }
            } else if (var2.field4711 != -1 && var12 == 0) {
                if (arg1.field2334 == var2.field4698 && var2.field4714 != -1) {
                    arg1.field2334 = var2.field4714;
                } else if (~arg1.field2334 == ~var2.field4700 && ~var2.field4690 != 0) {
                    arg1.field2334 = var2.field4690;
                } else if (~arg1.field2334 == ~var2.field4702 && ~var2.field4710 != 0) {
                    arg1.field2334 = var2.field4710;
                } else {
                    arg1.field2334 = var2.field4711;
                }
            }
            if (var2.field4709 != -1) {
                int var13 = var9 << 7;
                if (~arg1.field2327 == -2) {
                    int var14 = (~arg1.field2340 < ~var7 ? -var7 + arg1.field2340 : -arg1.field2340 + var7) << 7;
                    int var15 = (arg1.field2347 > var6 ? -var6 + arg1.field2347 : -arg1.field2347 + var6) << 7;
                    int var16 = arg1.field2371 * arg1.field2371;
                    int var17 = ~var15 < ~var14 ? var15 : var14;
                    int var18 = var2.field4709 * 2 * var17;
                    if (var18 >= var16) {
                        if (~(var16 / 2) < ~var17) {
                            arg1.field2371 -= var2.field4709;
                            if (arg1.field2371 < 0) {
                                arg1.field2371 = 0;
                            }
                        } else if (~arg1.field2371 > ~var13) {
                            arg1.field2371 += var2.field4709;
                            if (~var13 > ~arg1.field2371) {
                                arg1.field2371 = var13;
                            }
                        }
                    } else {
                        arg1.field2371 /= 2;
                    }
                } else if (arg1.field2371 < var13) {
                    arg1.field2371 += var2.field4709;
                    if (arg1.field2371 > var13) {
                        arg1.field2371 = var13;
                    }
                } else if (~arg1.field2371 < -1) {
                    arg1.field2371 -= var2.field4709;
                    if (~arg1.field2371 > -1) {
                        arg1.field2371 = 0;
                    }
                }
                var9 = arg1.field2371 >> 7;
                if (~var9 > -2) {
                    var9 = 1;
                }
            }
            if (var7 > var4) {
                arg1.field2340 += var9;
                if (~var7 > ~arg1.field2340) {
                    arg1.field2340 = var7;
                }
            } else if (~var4 < ~var7) {
                arg1.field2340 -= var9;
                if (var7 > arg1.field2340) {
                    arg1.field2340 = var7;
                }
            }
            if (var5 >= var6) {
                if (~var6 > ~var5) {
                    arg1.field2347 -= var9;
                    if (~arg1.field2347 > ~var6) {
                        arg1.field2347 = var6;
                    }
                }
            } else {
                arg1.field2347 += var9;
                if (~arg1.field2347 < ~var6) {
                    arg1.field2347 = var6;
                }
            }
            if (~arg1.field2347 == ~var6 && ~arg1.field2340 == ~var7) {
                if (~arg1.field2341 < -1) {
                    --arg1.field2341;
                }
                --arg1.field2327;
                return;
            }
        } else {
            arg1.field2401 = 0;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method200(int arg0, Random arg1, int arg2) {
        ++field521;
        if (~arg2 >= -1) {
            throw new IllegalArgumentException();
        } else if (class65.method407(50, arg2)) {
            return (int) ((long) arg2 * (4294967295L & (long) arg1.nextInt()) >> 32);
        } else {
            int var3 = 37 % ((arg0 - 59) / 52);
            int var4 = -((int) (4294967296L % (long) arg2)) + Integer.MIN_VALUE;
            int var5;
            do {
                var5 = arg1.nextInt();
            } while (var4 <= var5);
            return class116.method806((byte) 108, var5, arg2);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lob;Z)V")
    public static final void method201(class131 arg0, boolean arg1) {
        int var2 = -class118.field2022 + arg0.field2328;
        ++field528;
        if (arg1) {
            int var3 = arg0.field2395 * 128 - -(arg0.method885((byte) -101) * 64);
            int var4 = arg0.field2380 * 128 + 64 * arg0.method885((byte) -88);
            arg0.field2401 = 0;
            arg0.field2340 += (var4 - arg0.field2340) / var2;
            arg0.field2347 += (-arg0.field2347 + var3) / var2;
            if (arg0.field2379 == 0) {
                arg0.field2335 = 1024;
            }
            if (arg0.field2379 == 1) {
                arg0.field2335 = 1536;
            }
            if (~arg0.field2379 == -3) {
                arg0.field2335 = 0;
            }
            if (arg0.field2379 == 3) {
                arg0.field2335 = 512;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLid;Z)V")
    public static final void method202(byte arg0, class149 arg1, boolean arg2) {
        ++field520;
        int var3 = 0;
        short[] var4 = new short[16];
        class149 var5 = arg1.method1018(arg0 ^ 8290);
        int var6 = !arg2 ? 0 : 32768;
        int var7 = var6 + (arg2 ? class159.field2920 : class253.field4440);
        for (int var8 = var6; var7 > var8; ++var8) {
            class244 var11 = class90.method662(var8, arg0 ^ -32845);
            if (var11.field4285 && ~var11.method1699(false).method1018(arg0 ^ 8290).method1036((byte) -128, var5) != 0) {
                if (~var3 <= -51) {
                    class151.field2753 = null;
                    class228.field3997 = -1;
                    return;
                }
                if (~var3 <= ~var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; ~var3 < ~var13; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var3++] = (short) var8;
            }
        }
        class228.field3997 = var3;
        if (arg0 == 76) {
            class151.field2753 = var4;
            class196.field3516 = 0;
            class149[] var9 = new class149[class228.field3997];
            for (int var10 = 0; var10 < class228.field3997; ++var10) {
                var9[var10] = class90.method662(var4[var10], -32769).method1699(false);
            }
            class97.method708(class151.field2753, -4097, var9);
        }
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(B)V")
    private final void method203(byte arg0) {
        if (~this.field526 < -1) {
            this.field517 = new short[this.field509];
            this.field508 = new short[this.field509];
            for (int var2 = 0; ~var2 > ~this.field509; ++var2) {
                this.field508[var2] = (short) ((int) (Math.pow((double) ((float) this.field526 / 4096.0F), (double) var2) * 4096.0D));
                this.field517[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field508 != null && this.field508.length == this.field509) {
            this.field517 = new short[this.field509];
            for (int var3 = 0; this.field509 > var3; ++var3) {
                this.field517[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field525;
        int var4 = 123 % ((-14 - arg0) / 53);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(Z)V")
    public static void method204(boolean arg0) {
        if (!arg0) {
            method205(55, true);
        }
        field510 = null;
        field529 = null;
        field507 = null;
        field505 = null;
        field514 = null;
        field501 = null;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class35() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)V")
    public static final void method205(int arg0, boolean arg1) {
        ++field518;
        --class60.field1092;
        if (class60.field1092 != arg0) {
            class209.method1422(class138.field2517, arg0 + 1, class138.field2517, arg0, -arg0 + class60.field1092);
            class209.method1422(class78.field1456, arg0 + 1, class78.field1456, arg0, -arg0 + class60.field1092);
            class209.method1424(class224.field3941, arg0 + 1, class224.field3941, arg0, -arg0 + class60.field1092);
            if (!arg1) {
                class209.method1426(class284.field5032, arg0 + 1, class284.field5032, arg0, class60.field1092 - arg0);
                class209.method1425(class260.field4584, arg0 + 1, class260.field4584, arg0, -arg0 + class60.field1092);
                class209.method1424(class152.field2767, arg0 + 1, class152.field2767, arg0, -arg0 + class60.field1092);
                class209.method1424(class287.field5097, arg0 - -1, class287.field5097, arg0, -arg0 + class60.field1092);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILal;I)Ltg;")
    public static final class181 method206(int arg0, class230 arg1, int arg2) {
        ++field531;
        byte[] var3 = arg1.method1547(arg0, 127);
        if (var3 == null) {
            return null;
        } else {
            if (arg2 != -3) {
                method205(41, false);
            }
            return new class181(var3);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field500;
        if (arg1 != 55) {
            this.field508 = null;
        }
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            this.method207(768, var3, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field527 = arg0.method489((byte) -126);
                                }
                            } else {
                                this.field515 = arg0.method489((byte) -27);
                            }
                        } else {
                            this.field512 = arg0.method489((byte) 86);
                        }
                    } else {
                        this.field515 = this.field527 = arg0.method489((byte) 105);
                    }
                } else {
                    this.field526 = arg0.method526((byte) 104);
                    if (this.field526 < 0) {
                        this.field508 = new short[this.field509];
                        for (int var5 = 0; this.field509 > var5; ++var5) {
                            this.field508[var5] = (short) arg0.method526((byte) 79);
                        }
                    }
                }
            } else {
                this.field509 = arg0.method489((byte) -61);
            }
        } else {
            this.field503 = ~arg0.method489((byte) -10) == -2;
        }
        ++field522;
        if (!arg1) {
            this.field512 = -35;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I[II)V")
    private final void method207(int arg0, int[] arg1, int arg2) {
        ++field502;
        int var4 = class93.field1644[arg2] * this.field527;
        if (arg0 == 768) {
            if (this.field509 != 1) {
                short var5 = this.field508[0];
                if (~var5 < -9 || ~var5 > 7) {
                    int var6 = this.field517[0] << 12;
                    int var7 = this.field515 * var6 >> 12;
                    int var8 = var4 * var6 >> 12;
                    int var9 = var8 >> 12;
                    int var10 = this.field527 * var6 >> 12;
                    int var11 = var8 & 4095;
                    int var12 = 255 & this.field511[var9 & 255];
                    int var13 = var9 - -1;
                    int var14 = class145.field2621[var11];
                    if (~var13 <= ~var10) {
                        var13 = 0;
                    }
                    int var15 = this.field511[var13 & 255] & 255;
                    for (int var16 = 0; class137.field2515 > var16; ++var16) {
                        int var36 = class73.field1263[var16] * this.field515;
                        int var37 = this.method198(var14, var7, var15, 78, var12, var6 * var36 >> 12, var11);
                        arg1[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~var17 > ~this.field509; ++var17) {
                    short var18 = this.field508[var17];
                    if (~var18 < -9 || var18 < -8) {
                        int var19 = this.field517[var17] << 12;
                        int var20 = this.field515 * var19 >> 12;
                        int var21 = var4 * var19 >> 12;
                        int var22 = this.field527 * var19 >> 12;
                        int var23 = var21 >> 12;
                        int var24 = var21 & 4095;
                        int var25 = this.field511[255 & var23] & 255;
                        int var26 = var23 + 1;
                        if (var26 >= var22) {
                            var26 = 0;
                        }
                        int var27 = class145.field2621[var24];
                        int var28 = this.field511[var26 & 255] & 255;
                        if (this.field503 && this.field509 - 1 == var17) {
                            for (int var29 = 0; var29 < class137.field2515; ++var29) {
                                int var30 = class73.field1263[var29] * this.field515;
                                int var31 = this.method198(var27, var20, var28, arg0 ^ 868, var25, var19 * var30 >> 12, var24);
                                int var32 = (var18 * var31 >> 12) + arg1[var29];
                                arg1[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; class137.field2515 > var33; ++var33) {
                                int var34 = class73.field1263[var33] * this.field515;
                                int var35 = this.method198(var27, var20, var28, 103, var25, var19 * var34 >> 12, var24);
                                arg1[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                short var38 = this.field508[0];
                int var39 = this.field517[0] << 12;
                int var40 = this.field527 * var39 >> 12;
                int var41 = this.field515 * var39 >> 12;
                int var42 = var4 * var39 >> 12;
                int var43 = var42 >> 12;
                int var44 = var43 + 1;
                int var45 = 255 & this.field511[var43 & 255];
                if (~var44 <= ~var40) {
                    var44 = 0;
                }
                int var46 = var42 & 4095;
                int var47 = class145.field2621[var46];
                int var48 = this.field511[255 & var44] & 255;
                if (!this.field503) {
                    for (int var49 = 0; class137.field2515 > var49; ++var49) {
                        int var50 = class73.field1263[var49] * this.field515;
                        int var51 = this.method198(var47, var41, var48, 83, var45, var39 * var50 >> 12, var46);
                        arg1[var49] = var38 * var51 >> 12;
                    }
                } else {
                    for (int var52 = 0; class137.field2515 > var52; ++var52) {
                        int var53 = class73.field1263[var52] * this.field515;
                        int var54 = this.method198(var47, var41, var48, 92, var45, var39 * var53 >> 12, var46);
                        int var55 = var38 * var54 >> 12;
                        arg1[var52] = (var55 >> 1) + 2048;
                    }
                }
            }
        }
    }
}
