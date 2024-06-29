import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class58 {

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field811 = 0;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field815 = 0;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lsj;")
    public static class48 field814 = new class48();

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lmc;")
    public static class163 field809;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[Ljava/lang/Object;[II)V")
    public static final void method443(int arg0, int arg1, Object[] arg2, int[] arg3, int arg4) {
        field807++;
        if (arg1 > -88) {
            field809 = null;
        }
        if (arg0 <= arg4) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg4;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var7;
        Object var8 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var8;
        for (int var9 = arg4; var9 < arg0; var9++) {
            if (((var9 & 0x1) + var7) > arg3[var9]) {
                int var10 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6] = var10;
                Object var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg3[arg0] = arg3[var6];
        arg3[var6] = var7;
        arg2[arg0] = arg2[var6];
        arg2[var6] = var8;
        method443(var6 - 1, -93, arg2, arg3, arg4);
        method443(arg0, -98, arg2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static final void method444(int arg0) {
        class254.field4067.method1831(arg0 - 99);
        if (arg0 != -4) {
            method448((byte) 76, (String) null);
        }
        field808++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method445(byte arg0) {
        field814 = null;
        field809 = null;
        if (arg0 <= 85) {
            method445((byte) -10);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public static final void method446(int arg0) {
        field810++;
        if (arg0 != 19956) {
            field813 = -91;
        }
        int var1 = class220.method1463(0);
        if (var1 == 0) {
            class243.field3894 = null;
            class3.method17(0, (byte) -49);
        } else if (var1 == 1) {
            class51.method400((byte) 0, (byte) -49);
            class3.method17(512, (byte) -70);
            if (class134.field2251 != null) {
                class229.method1520((byte) -51);
            }
        } else {
            class51.method400((byte) (class23.field293 - 4 & 0xFF), (byte) -47);
            class3.method17(2, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[Lpi;II[BBZ)[I")
    public static final int[] method447(int arg0, int arg1, class281[] arg2, int arg3, int arg4, byte[] arg5, byte arg6, boolean arg7) {
        if (arg6 < 27) {
            return null;
        }
        field806++;
        if (!arg7) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg3 + var9) > 0 && arg3 + var9 < 103 && arg4 + var10 > 0 && arg4 + var10 < 103) {
                            arg2[var8].field4497[arg3 + var9][arg4 + var10] = class204.method1369(arg2[var8].field4497[arg3 + var9][arg4 + var10], -2097153);
                        }
                    }
                }
            }
        }
        class264 var11 = new class264(arg5);
        byte var12;
        if (arg7) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        int var13 = arg0 + arg3;
        int var14 = arg1 + arg4;
        for (int var15 = 0; var15 < var12; var15++) {
            for (int var39 = 0; var39 < 64; var39++) {
                for (int var40 = 0; var40 < 64; var40++) {
                    class25.method178(var39 + arg3, (byte) 123, var40 + arg4, var15, 0, arg7, var13 + var39, false, var14 + var40, var11, 0, 0);
                }
            }
        }
        boolean var16 = false;
        boolean var17 = false;
        while (var11.field4198.length > var11.field4195) {
            int var18 = var11.method1779(-82);
            if (var18 == 128) {
                var16 = true;
                class168.field2733[0] = var11.method1777(-108);
                class168.field2733[1] = var11.method1756(-94);
                class168.field2733[2] = var11.method1756(-103);
                class168.field2733[3] = var11.method1756(-118);
                class168.field2733[4] = var11.method1777(-80);
            } else {
                if (var18 != 129) {
                    var11.field4195--;
                    break;
                }
                var17 = true;
                for (int var24 = 0; var24 < 4; var24++) {
                    byte var25 = var11.method1767(16711680);
                    if (var25 == 0) {
                        int var35 = arg3;
                        if (arg3 < 0) {
                            var35 = 0;
                        } else if (arg3 >= 104) {
                            var35 = 104;
                        }
                        int var36 = arg3 + 64;
                        if (var36 < 0) {
                            var36 = 0;
                        } else if (var36 >= 104) {
                            var36 = 104;
                        }
                        int var37 = arg4;
                        if (arg4 < 0) {
                            var37 = 0;
                        } else if (arg4 >= 104) {
                            var37 = 104;
                        }
                        int var38 = arg4 + 64;
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 >= 104) {
                            var38 = 104;
                        }
                        while (var35 < var36) {
                            while (var37 < var38) {
                                class79.field1091[var24][var35][var37] = 0;
                                var37++;
                            }
                            var35++;
                        }
                    } else if (var25 == 1) {
                        for (int var26 = 0; var26 < 64; var26 += 4) {
                            for (int var27 = 0; var27 < 64; var27 += 4) {
                                byte var28 = var11.method1767(16711680);
                                for (int var29 = arg3 + var26; var29 < (arg3 + var26 + 4); var29++) {
                                    for (int var30 = var27 + arg4; var30 < (var27 + arg4 + 4); var30++) {
                                        if (var29 >= 0 && var29 < 104 && var30 >= 0 && var30 < 104) {
                                            class79.field1091[var24][var29][var30] = var28;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var25 == 2 && var24 > 0) {
                        int var31 = arg3;
                        if (arg3 < 0) {
                            var31 = 0;
                        } else if (arg3 >= 104) {
                            var31 = 104;
                        }
                        int var32 = arg4;
                        if (arg4 < 0) {
                            var32 = 0;
                        } else if (arg4 >= 104) {
                            var32 = 104;
                        }
                        int var33 = arg3 + 64;
                        if (var33 < 0) {
                            var33 = 0;
                        } else if (var33 >= 104) {
                            var33 = 104;
                        }
                        int var34 = arg4 + 64;
                        if (var34 < 0) {
                            var34 = 0;
                        } else if (var34 >= 104) {
                            var34 = 104;
                        }
                        while (var31 < var33) {
                            while (var32 < var34) {
                                class79.field1091[var24][var31][var32] = class79.field1091[var24 - 1][var31][var32];
                                var32++;
                            }
                            var31++;
                        }
                    }
                }
            }
        }
        if (!var17) {
            for (int var19 = 0; var19 < 4; var19++) {
                for (int var20 = 0; var20 < 16; var20++) {
                    for (int var21 = 0; var21 < 16; var21++) {
                        int var22 = (arg3 >> 2) + var20;
                        int var23 = (arg4 >> 2) + var21;
                        if (var22 >= 0 && var22 < 26 && var23 >= 0 && var23 < 26) {
                            class79.field1091[var19][var22][var23] = 0;
                        }
                    }
                }
            }
        }
        if (var16) {
            return class168.field2733;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method448(byte arg0, String arg1) {
        System.out.println("Error: " + class69.method547("%0a", true, arg1, "\n"));
        if (arg0 < 71) {
            field809 = null;
        }
        field812++;
    }
}
