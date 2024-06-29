import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class502 extends class149 {

    @OriginalMember(owner = "client!od", name = "M", descriptor = "Lcm;")
    public static class449 field7493 = new class449(9, -1);

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I[BILjava/lang/String;II)I", line = 3)
    public static final int method3001(int arg0, byte[] arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg0 != -8231) {
            return -5;
        } else {
            ++field7489;
            int var6 = -arg2 + arg4;
            for (int var7 = 0; ~var6 < ~var7; ++var7) {
                char var8 = arg3.charAt(arg2 + var7);
                if (var8 > 0 && ~var8 > -129 || var8 >= 160 && var8 <= 255) {
                    arg1[arg5 + var7] = (byte) var8;
                } else if (var8 != 8364) {
                    if (~var8 != -8219) {
                        if (var8 == 402) {
                            arg1[arg5 + var7] = -125;
                        } else if (var8 != 8222) {
                            if (~var8 != -8231) {
                                if (~var8 == -8225) {
                                    arg1[arg5 - -var7] = -122;
                                } else if (~var8 == -8226) {
                                    arg1[arg5 + var7] = -121;
                                } else if (var8 == 710) {
                                    arg1[arg5 - -var7] = -120;
                                } else if (var8 != 8240) {
                                    if (var8 == 352) {
                                        arg1[arg5 - -var7] = -118;
                                    } else if (~var8 != -8250) {
                                        if (~var8 == -339) {
                                            arg1[arg5 - -var7] = -116;
                                        } else if (var8 == 381) {
                                            arg1[arg5 + var7] = -114;
                                        } else if (~var8 == -8217) {
                                            arg1[arg5 + var7] = -111;
                                        } else if (var8 != 8217) {
                                            if (var8 != 8220) {
                                                if (~var8 == -8222) {
                                                    arg1[arg5 + var7] = -108;
                                                } else if (~var8 == -8227) {
                                                    arg1[arg5 + var7] = -107;
                                                } else if (var8 != 8211) {
                                                    if (~var8 == -8213) {
                                                        arg1[arg5 + var7] = -105;
                                                    } else if (~var8 != -733) {
                                                        if (~var8 == -8483) {
                                                            arg1[arg5 + var7] = -103;
                                                        } else if (var8 == 353) {
                                                            arg1[arg5 + var7] = -102;
                                                        } else if (var8 != 8250) {
                                                            if (var8 != 339) {
                                                                if (~var8 != -383) {
                                                                    if (var8 == 376) {
                                                                        arg1[arg5 - -var7] = -97;
                                                                    } else {
                                                                        arg1[arg5 - -var7] = 63;
                                                                    }
                                                                } else {
                                                                    arg1[arg5 + var7] = -98;
                                                                }
                                                            } else {
                                                                arg1[arg5 + var7] = -100;
                                                            }
                                                        } else {
                                                            arg1[arg5 + var7] = -101;
                                                        }
                                                    } else {
                                                        arg1[arg5 - -var7] = -104;
                                                    }
                                                } else {
                                                    arg1[arg5 + var7] = -106;
                                                }
                                            } else {
                                                arg1[arg5 - -var7] = -109;
                                            }
                                        } else {
                                            arg1[arg5 - -var7] = -110;
                                        }
                                    } else {
                                        arg1[arg5 + var7] = -117;
                                    }
                                } else {
                                    arg1[arg5 - -var7] = -119;
                                }
                            } else {
                                arg1[arg5 - -var7] = -123;
                            }
                        } else {
                            arg1[arg5 + var7] = -124;
                        }
                    } else {
                        arg1[arg5 + var7] = -126;
                    }
                } else {
                    arg1[arg5 + var7] = -128;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBLtl;)V", line = 139)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg1 != 35) {
            field7493 = null;
        }
        ++field7491;
        if (arg0 == 0) {
            super.field2148 = arg2.method618((byte) 100) == 1;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)[[I", line = 153)
    public final int[][] method139(byte arg0, int arg1) {
        ++field7490;
        if (arg0 > -45) {
            return null;
        } else {
            int[][] var3 = super.field2147.method2726(arg1, 0);
            if (super.field2147.field6664) {
                int[][] var4 = this.method984((byte) 94, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class316.field4838 < ~var11; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 201)
    public class502() {
        super(1, false);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V", line = 204)
    public static void method3002(int arg0) {
        field7493 = null;
        if (arg0 != 0) {
            method3001(-97, (byte[]) null, 123, (String) null, -113, 97);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIBI)V", line = 222)
    public static final void method3003(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field7492;
        class517.method3074(arg0, 22320);
        int var7 = -80 / ((arg5 - 13) / 40);
        int var8 = 0;
        int var9 = -arg2 + arg0;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg0;
        int var11 = -arg0;
        int var12 = var9;
        int var13 = -var9;
        int var14 = -1;
        if (arg1 >= class410.field6176 && ~arg1 >= ~class158.field2302) {
            int[] var15 = class23.field356[arg1];
            int var16 = class278.method1758(class443.field6591, class396.field6021, -arg0 + arg4, -105);
            int var17 = class278.method1758(class443.field6591, class396.field6021, arg0 + arg4, 74);
            int var18 = class278.method1758(class443.field6591, class396.field6021, -var9 + arg4, -77);
            int var19 = class278.method1758(class443.field6591, class396.field6021, arg4 + var9, -120);
            class271.method1736(var18, arg6, var16, -11, var15);
            class271.method1736(var19, arg3, var18, -11, var15);
            class271.method1736(var17, arg6, var19, -11, var15);
        }
        int var20 = -1;
        while (~var8 > ~var10) {
            var20 += 2;
            var14 += 2;
            var11 += var14;
            var13 += var20;
            if (~var13 <= -1 && var12 >= 1) {
                --var12;
                var13 -= var12 << 1;
                class5.field74[var12] = var8;
            }
            ++var8;
            if (var11 >= 0) {
                --var10;
                var11 -= var10 << 1;
                int var21 = -var10 + arg1;
                int var22 = arg1 + var10;
                if (var22 >= class410.field6176 && class158.field2302 >= var21) {
                    if (~var10 <= ~var9) {
                        int var23 = class278.method1758(class443.field6591, class396.field6021, arg4 - -var8, 83);
                        int var24 = class278.method1758(class443.field6591, class396.field6021, -var8 + arg4, -95);
                        if (var22 <= class158.field2302) {
                            class271.method1736(var23, arg6, var24, -11, class23.field356[var22]);
                        }
                        if (var21 >= class410.field6176) {
                            class271.method1736(var23, arg6, var24, -11, class23.field356[var21]);
                        }
                    } else {
                        int var25 = class5.field74[var10];
                        int var26 = class278.method1758(class443.field6591, class396.field6021, arg4 - -var8, 94);
                        int var27 = class278.method1758(class443.field6591, class396.field6021, -var8 + arg4, -72);
                        int var28 = class278.method1758(class443.field6591, class396.field6021, arg4 - -var25, -85);
                        int var29 = class278.method1758(class443.field6591, class396.field6021, -var25 + arg4, -71);
                        if (~var22 >= ~class158.field2302) {
                            int[] var30 = class23.field356[var22];
                            class271.method1736(var29, arg6, var27, -11, var30);
                            class271.method1736(var28, arg3, var29, -11, var30);
                            class271.method1736(var26, arg6, var28, -11, var30);
                        }
                        if (~var21 <= ~class410.field6176) {
                            int[] var31 = class23.field356[var21];
                            class271.method1736(var29, arg6, var27, -11, var31);
                            class271.method1736(var28, arg3, var29, -11, var31);
                            class271.method1736(var26, arg6, var28, -11, var31);
                        }
                    }
                }
            }
            int var32 = -var8 + arg1;
            int var33 = arg1 + var8;
            if (~var33 <= ~class410.field6176 && class158.field2302 >= var32) {
                int var34 = arg4 - -var10;
                int var35 = -var10 + arg4;
                if (~class396.field6021 >= ~var34 && ~class443.field6591 <= ~var35) {
                    int var36 = class278.method1758(class443.field6591, class396.field6021, var34, 118);
                    int var37 = class278.method1758(class443.field6591, class396.field6021, var35, -80);
                    if (~var8 <= ~var9) {
                        if (class158.field2302 >= var33) {
                            class271.method1736(var36, arg6, var37, -11, class23.field356[var33]);
                        }
                        if (var32 >= class410.field6176) {
                            class271.method1736(var36, arg6, var37, -11, class23.field356[var32]);
                        }
                    } else {
                        int var38 = ~var12 <= ~var8 ? var12 : class5.field74[var8];
                        int var39 = class278.method1758(class443.field6591, class396.field6021, arg4 + var38, -113);
                        int var40 = class278.method1758(class443.field6591, class396.field6021, arg4 - var38, 69);
                        if (~var33 >= ~class158.field2302) {
                            int[] var41 = class23.field356[var33];
                            class271.method1736(var40, arg6, var37, -11, var41);
                            class271.method1736(var39, arg3, var40, -11, var41);
                            class271.method1736(var36, arg6, var39, -11, var41);
                        }
                        if (var32 >= class410.field6176) {
                            int[] var42 = class23.field356[var32];
                            class271.method1736(var40, arg6, var37, -11, var42);
                            class271.method1736(var39, arg3, var40, -11, var42);
                            class271.method1736(var36, arg6, var39, -11, var42);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I", line = 407)
    public final int[] method92(int arg0, int arg1) {
        ++field7494;
        if (arg0 != -10835) {
            field7493 = null;
        }
        int[] var3 = super.field2152.method2891(arg1, (byte) 78);
        if (super.field2152.field7051) {
            int[] var4 = this.method983(0, arg0 + 35659, arg1);
            for (int var5 = 0; class316.field4838 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }
}
