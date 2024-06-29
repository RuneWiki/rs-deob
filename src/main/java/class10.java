import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends class601 {

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "Lpia;")
    public static class94 field71 = new class94(13, 16);

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "[I")
    public static int[] field78 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "Ljava/lang/String;")
    public static String field79 = null;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "Lfh;")
    public static class649 field74;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(B)I", line = 3)
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            field74 = null;
        }
        ++field77;
        return ~super.field8563.method3928((byte) -124).method971(-1) < -2 ? 4 : 2;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IZ)V", line = 17)
    public final void method40(int arg0, boolean arg1) {
        ++field68;
        if (arg1) {
            field71 = null;
        }
        super.field8565 = arg0;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)I", line = 29)
    public final int method42(int arg0) {
        int var2 = 29 / ((arg0 - -59) / 61);
        ++field72;
        return super.field8565;
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V", line = 42)
    public static void method43(int arg0) {
        if (arg0 != -1025) {
            method45((class504) null, false, -3);
        }
        field71 = null;
        field74 = null;
        field79 = null;
        field78 = null;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V", line = 56)
    public final void method35(byte arg0) {
        if (arg0 < -37) {
            ++field73;
            if (~super.field8565 > -1 && super.field8565 > 4) {
                super.field8565 = this.method39((byte) -17);
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILei;)V", line = 71)
    public static final void method44(int arg0, class177 arg1) {
        ++field76;
        arg1.method3562((byte) -47);
        if (arg0 != -429608343) {
            field74 = null;
        }
        boolean var2 = false;
        for (class177 var3 = (class177) class331.field4291.method2067(22462); var3 != null; var3 = (class177) class331.field4291.method2066(arg0 ^ -429608343)) {
            if (class398.method2438(var3.method1094(true), false, arg1.method1094(true))) {
                var2 = true;
                class181.method1124(arg1, var3, -43);
                break;
            }
        }
        if (!var2) {
            class331.field4291.method2068(-128, arg1);
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)I", line = 104)
    public final int method34(int arg0, int arg1) {
        if (arg1 != 15706) {
            field71 = null;
        }
        ++field69;
        return 1;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lbda;ZI)V", line = 116)
    public static final void method45(class504 arg0, boolean arg1, int arg2) {
        ++field70;
        class255 var3 = arg0.method2992(-1);
        if (arg0.field7184 == 0) {
            class66.field675 = 0;
            class165.field1849 = -1;
            arg0.field7185 = 0;
        } else {
            if (~arg0.field7145 != 0 && arg0.field7132 == 0) {
                class25 var4 = class637.field9158.method1905(94, arg0.field7145);
                if (~arg0.field7188 < -1 && var4.field270 == 0) {
                    ++arg0.field7185;
                    class66.field675 = 0;
                    class165.field1849 = -1;
                    return;
                }
                if (~arg0.field7188 >= -1 && ~var4.field261 == -1) {
                    class66.field675 = 0;
                    ++arg0.field7185;
                    class165.field1849 = -1;
                    return;
                }
            }
            if (arg0.field7084 != -1 && class392.field5398 >= arg0.field7139) {
                class342 var5 = class173.field2036.method1221(arg2 ^ 14472, arg0.field7084);
                if (var5.field4418 && ~var5.field4431 != 0) {
                    class25 var6 = class637.field9158.method1905(121, var5.field4431);
                    if (arg0.field7188 > 0 && var6.field270 == 0) {
                        ++arg0.field7185;
                        class66.field675 = 0;
                        class165.field1849 = -1;
                        return;
                    }
                    if (arg0.field7188 <= 0 && var6.field261 == 0) {
                        class165.field1849 = -1;
                        class66.field675 = 0;
                        ++arg0.field7185;
                        return;
                    }
                }
            }
            if (arg0.field7084 != -1 && ~class392.field5398 <= ~arg0.field7139) {
                class342 var7 = class173.field2036.method1221(15719, arg0.field7084);
                if (var7.field4418 && var7.field4431 != -1) {
                    class25 var8 = class637.field9158.method1905(49, var7.field4431);
                    if (~arg0.field7188 < -1 && ~var8.field270 == -1) {
                        class165.field1849 = -1;
                        class66.field675 = 0;
                        ++arg0.field7185;
                        return;
                    }
                    if (arg0.field7188 <= 0 && var8.field261 == 0) {
                        class165.field1849 = -1;
                        class66.field675 = 0;
                        ++arg0.field7185;
                        return;
                    }
                }
            }
            int var9 = arg0.field4635;
            int var10 = arg0.field4629;
            int var11 = arg0.field7187[arg0.field7184 + -1] * 512 - -(arg0.method1128(-1) * 256);
            int var12 = arg0.field7193[arg0.field7184 - 1] * 512 - -(arg0.method1128(-1) * 256);
            if (var11 > var9) {
                if (~var12 >= ~var10) {
                    if (~var12 > ~var10) {
                        arg0.method3003((byte) -34, 14336);
                    } else {
                        arg0.method3003((byte) 48, 12288);
                    }
                } else {
                    arg0.method3003((byte) 110, 10240);
                }
            } else if (var9 <= var11) {
                if (~var10 > ~var12) {
                    arg0.method3003((byte) -43, 8192);
                } else if (~var10 < ~var12) {
                    arg0.method3003((byte) 75, 0);
                }
            } else if (var12 > var10) {
                arg0.method3003((byte) 105, 6144);
            } else if (~var12 <= ~var10) {
                arg0.method3003((byte) -103, 4096);
            } else {
                arg0.method3003((byte) 91, 2048);
            }
            byte var13 = arg0.field7183[arg0.field7184 + -1];
            if (arg1 || ~(var11 - var9) >= -1025 && ~(-var9 + var11) <= 1023 && ~(-var10 + var12) >= -1025 && ~(var12 - var10) <= 1023) {
                if (arg2 != 1519) {
                    method45((class504) null, true, -80);
                }
                int var14 = 16;
                boolean var15 = true;
                if (arg0 instanceof class197) {
                    var15 = ((class197) arg0).field2293.field4189;
                }
                if (var15) {
                    int var16 = -arg0.field7166.field10401 + arg0.field7177;
                    if (var16 != 0 && ~arg0.field7148 == 0 && arg0.field7135 != 0) {
                        var14 = 8;
                    }
                    if (!arg1 && ~arg0.field7184 < -3) {
                        var14 = 24;
                    }
                    if (!arg1 && arg0.field7184 > 3) {
                        var14 = 32;
                    }
                } else {
                    if (!arg1 && arg0.field7184 > 1) {
                        var14 = 24;
                    }
                    if (!arg1 && ~arg0.field7184 < -3) {
                        var14 = 32;
                    }
                }
                if (arg0.field7185 > 0 && arg0.field7184 > 1) {
                    var14 = 32;
                    --arg0.field7185;
                }
                if (var13 == 2) {
                    var14 <<= 1;
                } else if (~var13 == -1) {
                    var14 >>= 1;
                }
                if (var3.field3086 != -1) {
                    int var17 = var14 << 9;
                    if (~arg0.field7184 != -2) {
                        if (~var17 < ~arg0.field7186) {
                            arg0.field7186 += var3.field3086;
                            if (~var17 > ~arg0.field7186) {
                                arg0.field7186 = var17;
                            }
                        } else if (~arg0.field7186 < -1) {
                            arg0.field7186 -= var3.field3086;
                            if (arg0.field7186 < 0) {
                                arg0.field7186 = 0;
                            }
                        }
                    } else {
                        int var18 = arg0.field7186 * arg0.field7186;
                        int var19 = (var11 >= arg0.field4635 ? -arg0.field4635 + var11 : -var11 + arg0.field4635) << 9;
                        int var20 = (~var12 > ~arg0.field4629 ? -var12 + arg0.field4629 : -arg0.field4629 + var12) << 9;
                        int var21 = var20 >= var19 ? var20 : var19;
                        int var22 = var3.field3086 * 2 * var21;
                        if (~var18 < ~var22) {
                            arg0.field7186 /= 2;
                        } else if (~var21 <= ~(var18 / 2)) {
                            if (~var17 < ~arg0.field7186) {
                                arg0.field7186 += var3.field3086;
                                if (~var17 > ~arg0.field7186) {
                                    arg0.field7186 = var17;
                                }
                            }
                        } else {
                            arg0.field7186 -= var3.field3086;
                            if (~arg0.field7186 > -1) {
                                arg0.field7186 = 0;
                            }
                        }
                    }
                    var14 = arg0.field7186 >> 9;
                    if (~var14 > -2) {
                        var14 = 1;
                    }
                }
                class66.field675 = 0;
                if (~var9 == ~var11 && var10 == var12) {
                    class165.field1849 = -1;
                } else {
                    if (var11 > var9) {
                        class66.field675 |= 4;
                        arg0.field4635 += var14;
                        if (var11 < arg0.field4635) {
                            arg0.field4635 = var11;
                        }
                    } else if (var9 > var11) {
                        class66.field675 |= 8;
                        arg0.field4635 -= var14;
                        if (~var11 < ~arg0.field4635) {
                            arg0.field4635 = var11;
                        }
                    }
                    if (var12 > var10) {
                        arg0.field4629 += var14;
                        class66.field675 |= 1;
                        if (~var12 > ~arg0.field4629) {
                            arg0.field4629 = var12;
                        }
                    } else if (var10 > var12) {
                        class66.field675 |= 2;
                        arg0.field4629 -= var14;
                        if (arg0.field4629 < var12) {
                            arg0.field4629 = var12;
                        }
                    }
                    if (var14 < 32) {
                        class165.field1849 = var13;
                    } else {
                        class165.field1849 = 2;
                    }
                }
                if (~arg0.field4635 == ~var11 && arg0.field4629 == var12) {
                    if (~arg0.field7188 < -1) {
                        --arg0.field7188;
                    }
                    --arg0.field7184;
                }
            } else {
                arg0.field4635 = var11;
                arg0.field4629 = var12;
                arg0.method2990(arg0.field7177, arg2 ^ 1427, false);
                class165.field1849 = -1;
                class66.field675 = 0;
                --arg0.field7184;
                if (~arg0.field7188 < -1) {
                    --arg0.field7188;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lgn;)V", line = 455)
    public class10(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(ILgn;)V", line = 458)
    public class10(int arg0, class699 arg1) {
        super(arg0, arg1);
    }
}
