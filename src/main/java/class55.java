import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class55 {

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Z")
    public boolean field1214 = false;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Z")
    public static boolean field1207 = false;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
    public abstract void method365(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lql;I)V")
    public abstract void method334(class396 arg0, class684 arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
    public abstract void method366(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method325(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public abstract int method352();

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public abstract int method330();

    @OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILi;Li;III)V")
    public abstract void method320(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
    public abstract void method340();

    @OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
    public abstract int method343();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()[Ltk;")
    public abstract class317[] method362();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
    public static final void method639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (client.field4115 >= arg5 && class309.field4556 <= arg0) {
            boolean var6;
            if (class704.field9911 > arg2) {
                arg2 = class704.field9911;
                var6 = false;
            } else if (class379.field5612 >= arg2) {
                var6 = true;
            } else {
                arg2 = class379.field5612;
                var6 = false;
            }
            boolean var7;
            if (arg4 < class704.field9911) {
                arg4 = class704.field9911;
                var7 = false;
            } else if (arg4 > class379.field5612) {
                var7 = false;
                arg4 = class379.field5612;
            } else {
                var7 = true;
            }
            if (arg5 >= class309.field4556) {
                class705.method3938(arg4, arg3, arg1 ^ 0xFFFF8794, arg2, class582.field8429[arg5++]);
            } else {
                arg5 = class309.field4556;
            }
            if (client.field4115 >= arg0) {
                class705.method3938(arg4, arg3, 30336, arg2, class582.field8429[arg0--]);
            } else {
                arg0 = client.field4115;
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg0; var8++) {
                    int[] var9 = class582.field8429[var8];
                    var9[arg2] = var9[arg4] = arg3;
                }
            } else if (var6) {
                for (int var10 = arg5; var10 <= arg0; var10++) {
                    class582.field8429[var10][arg2] = arg3;
                }
            } else if (var7) {
                for (int var11 = arg5; var11 <= arg0; var11++) {
                    class582.field8429[var11][arg4] = arg3;
                }
            }
        }
        if (arg1 != -3820) {
            field1207 = false;
        }
        field1216++;
    }

    @OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
    public abstract int method328();

    @OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
    public abstract int method329();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILlk;)V")
    public static final void method640(int arg0, int arg1, int arg2, class545 arg3) {
        field1217++;
        if (arg1 >= -55) {
            field1206 = -20;
        }
        if (arg3 == null) {
            return;
        }
        if (arg3.field7672 != null) {
            class476 var4 = new class476();
            var4.field6850 = arg3;
            var4.field6842 = arg3.field7672;
            class683.method3847(var4);
        }
        class139.field2461 = arg3.field7657;
        class200.field3105 = arg2;
        class489.field7001 = arg0;
        class437.field6303 = arg3.field7755;
        class273.field4094 = arg3.field7697;
        class65.field1435 = true;
        class153.field2604 = arg3.field7702;
        class97.field1726 = arg3.field7738;
        class531.method3088(arg3, (byte) 64);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static final void method641(int arg0) {
        field1208++;
        class70.field1483.method1913(true);
        if (arg0 != 0) {
            field1207 = true;
        }
    }

    @OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
    public abstract void method310(int arg0);

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
    public abstract void method349(int arg0);

    @OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
    public abstract int method327();

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
    public abstract boolean method341();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method358(int arg0, int arg1, class396 arg2, boolean arg3);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
    public abstract void method319();

    @OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
    public abstract int method354();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;ZI)Z")
    public abstract boolean method318(int arg0, int arg1, class396 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
    public abstract void method337(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILrc;I)V")
    public final void method642(int arg0, class501 arg1, int arg2) {
        field1218++;
        if (~arg2 == arg0) {
            return;
        }
        this.method319();
        if (!this.method341()) {
            this.method312();
            return;
        }
        class93 var4 = arg1.field7123[arg2];
        class314 var5 = var4.field1702;
        for (int var6 = 0; var6 < var4.field1688; var6++) {
            short var7 = var4.field1696[var6];
            if (var5.field4641[var7]) {
                if (var4.field1697[var6] != -1) {
                    this.method350(0, 0, 0, 0);
                }
                this.method350(var5.field4639[var7], var4.field1698[var6], var4.field1703[var6], var4.field1692[var6]);
            }
        }
        this.method336();
        this.method312();
    }

    @OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
    public abstract void method336();

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
    public abstract void method346(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIZI[ZLrc;IILrc;Lrc;ILrc;II)V")
    public final void method643(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean[] arg5, class501 arg6, int arg7, int arg8, class501 arg9, class501 arg10, int arg11, class501 arg12, int arg13, int arg14) {
        field1210++;
        if (arg13 == -1) {
            return;
        }
        if (arg5 == null || arg11 == -1) {
            this.method650(arg12, arg3, arg2, 89, 0, arg14, arg0, arg13, arg10);
            return;
        }
        this.method319();
        if (!this.method341()) {
            this.method312();
            return;
        }
        class93 var16 = arg10.field7123[arg13];
        class314 var17 = var16.field1702;
        if (arg7 != 21057) {
            this.method310(5);
        }
        class93 var18 = null;
        if (arg12 != null) {
            var18 = arg12.field7123[arg2];
            if (var18.field1702 != var17) {
                var18 = null;
            }
        }
        this.method646(65535, arg0, arg14, 0, 0, arg5, var16, var17, var18, null, false, arg3);
        class93 var19 = arg6.field7123[arg11];
        class93 var20 = null;
        if (arg9 != null) {
            var20 = arg9.field7123[arg4];
            if (var20.field1702 != var17) {
                var20 = null;
            }
        }
        this.method325(0, new int[0], 0, 0, 0, 0, arg3);
        this.method646(65535, arg8, arg1, 0, 0, arg5, var19, var19.field1702, var20, null, true, arg3);
        this.method336();
        this.method312();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILpl;)V")
    public static final void method644(int arg0, class604 arg1) {
        field1213++;
        int var2 = arg1.field8729 - class336.field5031;
        int var3 = arg1.field8751 * 512 + arg1.method3446(0) * 256;
        int var4 = arg1.field8750 * 512 + (arg1.method3446(0) * 256);
        arg1.field8778 = 0;
        arg1.field9806 += (var3 - arg1.field9806) / var2;
        arg1.field9815 += (var4 - arg1.field9815) / var2;
        if (arg1.field8712 == 0) {
            arg1.method3452(8192, false);
        }
        if (arg1.field8712 == 1) {
            arg1.method3452(12288, false);
        }
        if (~arg1.field8712 == arg0) {
            arg1.method3452(0, false);
        }
        if (arg1.field8712 == 3) {
            arg1.method3452(4096, false);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
    public abstract void method312();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILi;III)V")
    public final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, class37 arg5, int arg6, int arg7, int arg8) {
        field1220++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg4 / 2;
        int var14 = -arg3 / 2;
        int var15 = arg5.method552(1, arg8 + var13, arg6 + var14);
        int var16 = arg4 / 2;
        int var17 = -arg3 / 2;
        int var18 = arg5.method552(1, arg8 + var16, arg6 - -var17);
        int var19 = -arg4 / 2;
        int var20 = arg3 / 2;
        int var21 = arg5.method552(1, arg8 + var19, arg6 + var20);
        int var22 = arg4 / 2;
        int var23 = arg3 / 2;
        int var24 = arg5.method552(1, arg8 + var22, arg6 + var23);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var18 >= var24 ? var24 : var18;
        if (arg3 != arg7) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg1 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg1;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (var28 > arg1) {
                        var28 = arg1;
                    }
                }
                this.method356(var28);
            }
        }
        int var30 = var21 > var15 ? var15 : var21;
        if (arg4 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg2 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg2;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (var31 > arg2) {
                        var31 = arg2;
                    }
                }
                this.method366(var31);
            }
        }
        int var33 = var15 + var24;
        if (var18 + var21 < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg0;
        if (var34 != 0) {
            this.method337(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
    public abstract void method364(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
    public abstract int method315();

    @OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
    public abstract void method308(int arg0);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
    public abstract void method344(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII[ZLeg;Lcs;Leg;[IZZ)V")
    private final void method646(int arg0, int arg1, int arg2, int arg3, int arg4, boolean[] arg5, class93 arg6, class314 arg7, class93 arg8, int[] arg9, boolean arg10, boolean arg11) {
        field1205++;
        if (arg8 == null || arg1 == 0) {
            for (int var38 = 0; var38 < arg6.field1688; var38++) {
                short var39 = arg6.field1696[var38];
                if (arg5 == null || arg5[var39] == arg10 || arg7.field4639[var39] == 0) {
                    short var40 = arg6.field1697[var38];
                    if (var40 != -1) {
                        this.method648(arg7.field4640[var40], 0, 0, 0, arg0 & arg7.field4644[var40], 0, -30285, arg3, arg11, arg9);
                    }
                    this.method648(arg7.field4640[var39], arg6.field1703[var38], arg6.field1698[var38], arg7.field4639[var39], arg7.field4644[var39] & arg0, arg6.field1692[var38], -30285, arg3, arg11, arg9);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = arg4;
        for (int var15 = 0; var15 < arg7.field4646; var15++) {
            boolean var16 = false;
            if (arg6.field1688 > var13 && arg6.field1696[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg8.field1688 > var14 && arg8.field1696[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg5 == null || arg5[var15] == arg10 || arg7.field4639[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg7.field4639[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    byte var20;
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var21 = arg6.field1703[var13];
                        var23 = arg6.field1697[var13];
                        var24 = arg6.field1692[var13];
                        var22 = arg6.field1698[var13];
                        var20 = arg6.field1694[var13];
                        var13++;
                    } else {
                        var20 = 0;
                        var21 = var18;
                        var22 = var18;
                        var23 = -1;
                        var24 = var18;
                    }
                    short var25;
                    byte var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg8.field1698[var14];
                        var26 = arg8.field1694[var14];
                        var27 = arg8.field1697[var14];
                        var28 = arg8.field1692[var14];
                        var29 = arg8.field1703[var14];
                        var14++;
                    } else {
                        var29 = var18;
                        var26 = 0;
                        var28 = var18;
                        var27 = -1;
                        var25 = var18;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var20 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var34 = var22;
                        var33 = var21;
                        var35 = var24;
                    } else if (var19 == 2) {
                        int var30 = var25 - var22 & 0x3FFF;
                        int var31 = var29 - var21 & 0x3FFF;
                        int var32 = var28 - var24 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = arg1 * var31 / arg2 + var21 & 0x3FFF;
                        var34 = arg1 * var30 / arg2 + var22 & 0x3FFF;
                        var35 = arg1 * var32 / arg2 + var24 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var37 = var25 - var22 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var34 = arg1 * var37 / arg2 + var22 & 0x3FFF;
                        var35 = 0;
                        var33 = 0;
                    } else if (var19 == 7) {
                        int var36 = var25 - var22 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var33 = (var29 - var21) * arg1 / arg2 + var21;
                        var35 = (var28 - var24) * arg1 / arg2 + var24;
                        var34 = arg1 * var36 / arg2 + var22 & 0x3F;
                    } else {
                        var34 = (var25 - var22) * arg1 / arg2 + var22;
                        var35 = var24 + ((var28 - var24) * arg1 / arg2);
                        var33 = var21 + ((var29 - var21) * arg1 / arg2);
                    }
                    if (var23 != -1) {
                        this.method648(arg7.field4640[var23], 0, 0, 0, arg7.field4644[var23] & arg0, 0, -30285, arg3, arg11, arg9);
                    } else if (var27 != -1) {
                        this.method648(arg7.field4640[var27], 0, 0, 0, arg0 & arg7.field4644[var27], 0, -30285, arg3, arg11, arg9);
                    }
                    this.method648(arg7.field4640[var15], var33, var34, var19, arg7.field4644[var15] & arg0, var35, -30285, arg3, arg11, arg9);
                } else {
                    if (var16) {
                        var13++;
                    }
                    if (var17) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
    public abstract int method369();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()[Laq;")
    public abstract class146[] method348();

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
    public abstract void method314();

    @OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
    public abstract int method368();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIII)V")
    public static final void method647(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1219++;
        class275 var5 = class86.method858(0);
        var5.field4103.method693((byte) 106, class168.field2812.field1542);
        if (arg1 >= -78) {
            method640(-44, -128, 26, null);
        }
        var5.field4103.method693((byte) 106, arg3);
        var5.field4103.method693((byte) 106, arg0);
        var5.field4103.method745(arg4, 128);
        var5.field4103.method745(arg2, 128);
        class140.method1141(var5, 19321);
        class223.field3351 = 0;
        class160.field2715 = -3;
        class605.field8811 = 1;
        class119.field2120 = 0;
    }

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
    public abstract void method361(int arg0);

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
    public abstract boolean method363();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIIIIIIZ[I)V")
    private final void method648(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int[] arg9) {
        field1209++;
        if (arg7 == 1) {
            if (arg3 == 0 || arg3 == 1) {
                int var16 = -arg2;
                arg2 = arg5;
                arg5 = var16;
            } else if (arg3 == 3) {
                int var14 = arg2;
                arg2 = arg5;
                arg5 = var14;
            } else if (arg3 == 2) {
                int var15 = arg2;
                arg2 = -arg5 & 0x3FFF;
                arg5 = var15 & 0x3FFF;
            }
        } else if (arg7 == 2) {
            if (arg3 == 0 || arg3 == 1) {
                arg2 = -arg2;
                arg5 = -arg5;
            } else if (arg3 == 2) {
                arg5 = -arg5 & 0x3FFF;
                arg2 = -arg2 & 0x3FFF;
            }
        } else if (arg7 == 3) {
            if (arg3 == 0 || arg3 == 1) {
                int var13 = arg2;
                arg2 = -arg5;
                arg5 = var13;
            } else if (arg3 == 3) {
                int var12 = arg2;
                arg2 = arg5;
                arg5 = var12;
            } else if (arg3 == 2) {
                int var11 = arg2;
                arg2 = arg5 & 0x3FFF;
                arg5 = -var11 & 0x3FFF;
            }
        }
        if (arg6 != -30285) {
            return;
        }
        if (arg4 == 65535) {
            this.method325(arg3, arg0, arg2, arg1, arg5, arg7, arg8);
        } else {
            this.method316(arg3, arg0, arg2, arg1, arg5, arg8, arg4, arg9);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[IIIIILrc;IILrc;I)V")
    public final void method649(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, class501 arg6, int arg7, int arg8, class501 arg9, int arg10) {
        field1212++;
        if (arg3 == -1) {
            return;
        }
        this.method319();
        if (!this.method341()) {
            this.method312();
            return;
        }
        class93 var12 = arg6.field7123[arg3];
        class314 var13 = var12.field1702;
        if (arg10 <= 71) {
            return;
        }
        class93 var14 = null;
        if (arg9 != null) {
            var14 = arg9.field7123[arg8];
            if (var14.field1702 != var13) {
                var14 = null;
            }
        }
        this.method646(arg5, arg2, arg7, arg4, 0, null, var12, var13, var14, arg1, false, arg0);
        this.method336();
        this.method312();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lql;II)V")
    public abstract void method317(class396 arg0, class684 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lda;")
    public abstract class55 method357(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
    public abstract void method356(int arg0);

    @OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
    public abstract int method342();

    @OriginalMember(owner = "client!da", name = "S", descriptor = "(Lha;)Lha;")
    public abstract class54 method311(class54 arg0);

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
    public abstract void method350(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public abstract void method324(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;IIIZ)V")
    public abstract void method326(class55 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public abstract void method313(class396 arg0);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()Z")
    public abstract boolean method338();

    @OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
    public abstract void method316(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lrc;ZIIIIIILrc;)V")
    public final void method650(class501 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class501 arg8) {
        if (arg3 < 2) {
            field1207 = false;
        }
        field1215++;
        if (arg7 == -1) {
            return;
        }
        this.method319();
        if (!this.method341()) {
            this.method312();
            return;
        }
        class93 var10 = arg8.field7123[arg7];
        class314 var11 = var10.field1702;
        class93 var12 = null;
        if (arg0 != null) {
            var12 = arg0.field7123[arg2];
            if (var12.field1702 != var11) {
                var12 = null;
            }
        }
        this.method646(65535, arg6, arg5, arg4, 0, null, var10, var11, var12, null, false, arg1);
        this.method336();
        this.method312();
    }
}
