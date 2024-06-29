import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class231 extends class709 {

    @OriginalMember(owner = "client!pfa", name = "B", descriptor = "[B")
    public byte[] field3134;

    @OriginalMember(owner = "client!pfa", name = "K", descriptor = "Lip;")
    public static class306 field3142 = new class306();

    @OriginalMember(owner = "client!pfa", name = "w", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!pfa", name = "x", descriptor = "I")
    public int field3130;

    @OriginalMember(owner = "client!pfa", name = "y", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!pfa", name = "z", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!pfa", name = "A", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!pfa", name = "C", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!pfa", name = "D", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!pfa", name = "E", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!pfa", name = "G", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!pfa", name = "H", descriptor = "I")
    public int field3139;

    @OriginalMember(owner = "client!pfa", name = "I", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!pfa", name = "J", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!pfa", name = "L", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!pfa", name = "M", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "(I)V", line = 5)
    public static final void method1373(int arg0) {
        field3141++;
        class193.field2626 = new class558(class155.field2122.method978(class120.field1576, (byte) -108), "", class222.field3007, 1006, -1, 0L, arg0, 0, true, false, 0L, true);
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(B)Lkaa;", line = 14)
    public static final class583 method1374(byte arg0) {
        field3131++;
        if (class489.field6850 == 0) {
            return new class583();
        } else if (arg0 == 10) {
            return class108.field1461[--class489.field6850];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILni;)V", line = 34)
    public static final void method1375(int arg0, class515 arg1) {
        field3133++;
        boolean var2 = false;
        if (class483.field6741 == arg1.field7173 || arg1.field7132 == -1 || arg1.field7170 != 0) {
            var2 = true;
        } else {
            class57 var3 = class607.field8188.method3001(-12575, arg1.field7132);
            if (var3.field808 || var3.field813[arg1.field7127] < arg1.field7131 + 1) {
                var2 = true;
            }
        }
        if (arg0 <= 11) {
            method1375(97, null);
        }
        if (var2) {
            int var4 = arg1.field7173 - arg1.field7107;
            int var5 = class483.field6741 - arg1.field7107;
            int var6 = arg1.field7129 * 512 + (arg1.method662((byte) 15) * 256);
            int var7 = arg1.field7140 * 512 + arg1.method662((byte) 15) * 256;
            int var8 = arg1.field7175 * 512 + (arg1.method662((byte) 15) * 256);
            int var9 = arg1.field7119 * 512 + arg1.method662((byte) 15) * 256;
            arg1.field4410 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
            arg1.field4418 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field7201 = 0;
        if (arg1.field7101 == 0) {
            arg1.method3073(true, false, 8192);
        }
        if (arg1.field7101 == 1) {
            arg1.method3073(true, false, 12288);
        }
        if (arg1.field7101 == 2) {
            arg1.method3073(true, false, 0);
        }
        if (arg1.field7101 == 3) {
            arg1.method3073(true, false, 4096);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "(I)V", line = 92)
    public static final void method1376(int arg0) {
        field3144++;
        if (arg0 == 0) {
            class593.field8040 = new class646();
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lha;Ljo;Lto;B)V", line = 104)
    public static final void method1377(class548 arg0, class21 arg1, class717 arg2, byte arg3) {
        field3140++;
        class298 var4 = arg1.method114(-109, arg0);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1955();
        if (var4.method1952() > var5) {
            var5 = var4.method1952();
        }
        byte var6 = 10;
        int var7 = arg2.field9987;
        int var8 = arg2.field9988;
        int var9 = 0;
        if (arg3 <= 2) {
            field3142 = null;
        }
        int var10 = 0;
        int var11 = 0;
        if (arg1.field210 != null) {
            var9 = class488.field6818.method1129((byte) 110, arg1.field210, class622.field8319, null, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class622.field8319[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class679.field9446.method1235(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class679.field9446.method1233() + class679.field9446.method1234() / 2;
        }
        int var15 = var5 / 2 + arg2.field9987;
        int var16 = arg2.field9988;
        if (var7 < (class461.field6416 + var5)) {
            var15 = class461.field6416 + (var5 / 2) + var10 / 2 + var6 + 5;
            var7 = class461.field6416;
        } else if (class461.field6410 - var5 < var7) {
            var15 = class461.field6410 - var6 - (var10 / 2) - (var5 / 2) - 5;
            var7 = class461.field6410 - var5;
        }
        if ((class461.field6417 + var5) > var8) {
            var8 = class461.field6417;
            var16 = var5 / 2 + class461.field6417 + var6;
        } else if (var8 > class461.field6399 - var5) {
            var16 = class461.field6399 - var6 - (var5 / 2) - var11;
            var8 = class461.field6399 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg2.field9987), (double) (var8 - arg2.field9988)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method1960((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg1.field210 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var20 = var18 + var10 + 10;
            var21 = var16 + var9 * class679.field9446.method1233() + 3;
            if (arg1.field226 != 0) {
                arg0.method3249(var18, 126, var21 - var16, -var18 + var20, arg1.field226, var16);
            }
            if (arg1.field216 != 0) {
                arg0.method3250(29600, var21 - var16, var18, var20 - var18, var16, arg1.field216);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class622.field8319[var22];
                if (var9 - 1 > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class679.field9446.method1231(arg0, var23, var15, var16, arg1.field236, true);
                var16 += class679.field9446.method1233();
            }
        }
        if (arg1.field244 == -1 && arg1.field210 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class726 var25 = new class726(arg2);
        var25.field10058 = var7 + var24;
        var25.field10067 = var8 - var24;
        var25.field10068 = var19;
        var25.field10071 = var21;
        var25.field10060 = var7 - var24;
        var25.field10063 = var20;
        var25.field10077 = var8 + var24;
        var25.field10066 = var18;
        class226.field3034.method3610(9289, var25);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIZ)Z", line = 254)
    public final boolean method1378(int arg0, int arg1, boolean arg2) {
        field3135++;
        if (!arg2) {
            method1377(null, null, null, (byte) 84);
        }
        return arg0 * arg1 <= this.field3134.length;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIIII)V", line = 266)
    public final void method1379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3137++;
        int var8 = 0;
        if (arg6 != 13258) {
            method1376(64);
        }
        if (arg2 != arg5) {
            var8 = (arg3 - arg4 << 16) / (arg5 - arg2);
        }
        int var9 = 0;
        if (arg0 != arg5) {
            var9 = (arg1 - arg3 << 16) / (arg0 - arg5);
        }
        int var10 = 0;
        if (arg0 != arg2) {
            var10 = (arg4 - arg1 << 16) / (arg2 - arg0);
        }
        if (arg5 >= arg2 && arg2 <= arg0) {
            if (arg5 >= arg0) {
                int var11;
                int var12 = var11 = arg4 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                int var13 = arg1 << 16;
                if (arg0 < 0) {
                    var13 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg2 && var8 > var10 || arg0 == arg2 && var8 < var9) {
                    int var14 = arg5 - arg0;
                    int var15 = arg0 - arg2;
                    int var16 = this.field3139 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class466.method2850((byte) 121, var13 >> 16, this.field3134, var11 >> 16, 0, var16);
                                var13 += var9;
                                var11 += var8;
                                var16 += this.field3139;
                            }
                        }
                        class466.method2850((byte) 124, var12 >> 16, this.field3134, var11 >> 16, 0, var16);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field3139;
                    }
                } else {
                    int var17 = arg5 - arg0;
                    int var18 = arg0 - arg2;
                    int var19 = this.field3139 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class466.method2850((byte) 126, var11 >> 16, this.field3134, var13 >> 16, 0, var19);
                                var13 += var9;
                                var19 += this.field3139;
                                var11 += var8;
                            }
                        }
                        class466.method2850((byte) 121, var11 >> 16, this.field3134, var12 >> 16, 0, var19);
                        var19 += this.field3139;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                int var22 = arg3 << 16;
                if (arg2 < 0) {
                    var21 -= arg2 * var10;
                    var20 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg2 != arg5 && var8 > var10 || arg2 == arg5 && var9 < var10) {
                    int var23 = arg0 - arg5;
                    int var24 = arg5 - arg2;
                    int var25 = this.field3139 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class466.method2850((byte) 122, var21 >> 16, this.field3134, var22 >> 16, 0, var25);
                                var21 += var10;
                                var22 += var9;
                                var25 += this.field3139;
                            }
                        }
                        class466.method2850((byte) 125, var21 >> 16, this.field3134, var20 >> 16, 0, var25);
                        var25 += this.field3139;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg0 - arg5;
                    int var27 = arg5 - arg2;
                    int var28 = this.field3139 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class466.method2850((byte) 123, var22 >> 16, this.field3134, var21 >> 16, 0, var28);
                                var22 += var9;
                                var28 += this.field3139;
                                var21 += var10;
                            }
                        }
                        class466.method2850((byte) 126, var20 >> 16, this.field3134, var21 >> 16, 0, var28);
                        var20 += var8;
                        var28 += this.field3139;
                        var21 += var10;
                    }
                }
            }
        } else if (arg0 >= arg5) {
            if (arg0 >= arg2) {
                int var29;
                int var30 = var29 = arg3 << 16;
                if (arg5 < 0) {
                    var30 -= arg5 * var8;
                    var29 -= arg5 * var9;
                    arg5 = 0;
                }
                int var31 = arg4 << 16;
                if (arg2 < 0) {
                    var31 -= arg2 * var10;
                    arg2 = 0;
                }
                if (var9 <= var8) {
                    int var32 = arg0 - arg2;
                    int var33 = arg2 - arg5;
                    int var34 = this.field3139 * arg5;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class466.method2850((byte) 125, var29 >> 16, this.field3134, var31 >> 16, 0, var34);
                                var29 += var9;
                                var34 += this.field3139;
                                var31 += var10;
                            }
                        }
                        class466.method2850((byte) 125, var29 >> 16, this.field3134, var30 >> 16, 0, var34);
                        var34 += this.field3139;
                        var30 += var8;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg0 - arg2;
                    int var36 = arg2 - arg5;
                    int var37 = this.field3139 * arg5;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class466.method2850((byte) 127, var31 >> 16, this.field3134, var29 >> 16, 0, var37);
                                var37 += this.field3139;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class466.method2850((byte) 122, var30 >> 16, this.field3134, var29 >> 16, 0, var37);
                        var37 += this.field3139;
                        var30 += var8;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg3 << 16;
                int var40 = arg1 << 16;
                if (arg5 < 0) {
                    var39 -= arg5 * var8;
                    var38 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg0 < 0) {
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg0 != arg5 && var9 > var8 || arg0 == arg5 && var8 > var10) {
                    int var41 = arg2 - arg0;
                    int var42 = arg0 - arg5;
                    int var43 = this.field3139 * arg5;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class466.method2850((byte) 123, var39 >> 16, this.field3134, var40 >> 16, 0, var43);
                                var40 += var10;
                                var43 += this.field3139;
                                var39 += var8;
                            }
                        }
                        class466.method2850((byte) 127, var39 >> 16, this.field3134, var38 >> 16, 0, var43);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field3139;
                    }
                } else {
                    int var44 = arg2 - arg0;
                    int var45 = arg0 - arg5;
                    int var46 = this.field3139 * arg5;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class466.method2850((byte) 123, var40 >> 16, this.field3134, var39 >> 16, 0, var46);
                                var46 += this.field3139;
                                var40 += var10;
                                var39 += var8;
                            }
                        }
                        class466.method2850((byte) 125, var38 >> 16, this.field3134, var39 >> 16, 0, var46);
                        var46 += this.field3139;
                        var39 += var8;
                        var38 += var9;
                    }
                }
            }
        } else if (arg5 > arg2) {
            int var47;
            int var48 = var47 = arg1 << 16;
            if (arg0 < 0) {
                var47 -= arg0 * var10;
                var48 -= arg0 * var9;
                arg0 = 0;
            }
            int var49 = arg4 << 16;
            if (arg2 < 0) {
                var49 -= arg2 * var8;
                arg2 = 0;
            }
            if (var10 <= var9) {
                int var50 = arg5 - arg2;
                int var51 = arg2 - arg0;
                int var52 = this.field3139 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class466.method2850((byte) 122, var49 >> 16, this.field3134, var48 >> 16, 0, var52);
                            var52 += this.field3139;
                            var49 += var8;
                            var48 += var9;
                        }
                    }
                    class466.method2850((byte) 124, var47 >> 16, this.field3134, var48 >> 16, 0, var52);
                    var52 += this.field3139;
                    var48 += var9;
                    var47 += var10;
                }
            } else {
                int var53 = arg5 - arg2;
                int var54 = arg2 - arg0;
                int var55 = this.field3139 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class466.method2850((byte) 123, var48 >> 16, this.field3134, var49 >> 16, 0, var55);
                            var49 += var8;
                            var55 += this.field3139;
                            var48 += var9;
                        }
                    }
                    class466.method2850((byte) 126, var48 >> 16, this.field3134, var47 >> 16, 0, var55);
                    var47 += var10;
                    var55 += this.field3139;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg1 << 16;
            int var58 = arg3 << 16;
            if (arg0 < 0) {
                var57 -= arg0 * var9;
                var56 -= arg0 * var10;
                arg0 = 0;
            }
            if (arg5 < 0) {
                var58 -= arg5 * var8;
                arg5 = 0;
            }
            if (var9 < var10) {
                int var59 = arg2 - arg5;
                int var60 = arg5 - arg0;
                int var61 = this.field3139 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class466.method2850((byte) 121, var58 >> 16, this.field3134, var56 >> 16, 0, var61);
                            var58 += var8;
                            var56 += var10;
                            var61 += this.field3139;
                        }
                    }
                    class466.method2850((byte) 124, var57 >> 16, this.field3134, var56 >> 16, 0, var61);
                    var57 += var9;
                    var56 += var10;
                    var61 += this.field3139;
                }
            } else {
                int var62 = arg2 - arg5;
                int var63 = arg5 - arg0;
                int var64 = this.field3139 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class466.method2850((byte) 127, var56 >> 16, this.field3134, var58 >> 16, 0, var64);
                            var56 += var10;
                            var58 += var8;
                            var64 += this.field3139;
                        }
                    }
                    class466.method2850((byte) 124, var56 >> 16, this.field3134, var57 >> 16, 0, var64);
                    var56 += var10;
                    var57 += var9;
                    var64 += this.field3139;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "(I)V", line = 708)
    public static void method1380(int arg0) {
        if (arg0 != 0) {
            method1377(null, null, null, (byte) 60);
        }
        field3142 = null;
    }

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "(I)V", line = 718)
    public final void method1381(int arg0) {
        field3138++;
        int var2 = -1;
        int var3 = this.field3134.length - 8;
        while (var3 > var2) {
            var2++;
            this.field3134[var2] = 0;
            var2++;
            this.field3134[var2] = 0;
            var2++;
            this.field3134[var2] = 0;
            var2++;
            this.field3134[var2] = 0;
            var2++;
            this.field3134[var2] = 0;
            var2++;
            this.field3134[var2] = 0;
            var2++;
            this.field3134[var2] = 0;
            var2++;
            this.field3134[var2] = 0;
        }
        if (arg0 >= 24) {
            while (var2 < (this.field3134.length - 1)) {
                var2++;
                this.field3134[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Ldw;II)V", line = 753)
    public class231(class664 arg0, int arg1, int arg2) {
        this.field3134 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)Ljava/lang/String;", line = 763)
    public static final String method1382(int arg0, int arg1) {
        field3143++;
        if (arg0 >= -49) {
            return null;
        }
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class155.field2152.method978(class120.field1576, (byte) -123) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class155.field2154.method978(class120.field1576, (byte) -109) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIII)V", line = 791)
    public final void method1383(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3139 = arg0 - arg2;
        this.field3129 = arg3;
        field3136++;
        if (arg4 != 0) {
            this.field3132 = 86;
        }
        this.field3130 = arg2;
        this.field3132 = arg1 - arg3;
    }
}
