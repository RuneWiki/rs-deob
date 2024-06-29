import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class45 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field718 = -1;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "[I")
    public static int[] field721 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Lsc;")
    public static class256 field714 = new class256(64);

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field722 = -1;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III[Lng;[BIIZ)[I")
    public static final int[] method373(int arg0, int arg1, int arg2, class77[] arg3, byte[] arg4, int arg5, int arg6, boolean arg7) {
        field719++;
        byte var8;
        if (arg7) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg7) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg6 + var10 > 0 && (arg6 + var10) < 103 && arg0 + var11 > 0 && arg0 + var11 < 103) {
                            arg3[var9].field1286[arg6 + var10][arg0 + var11] = class3.method48(arg3[var9].field1286[arg6 + var10][arg0 + var11], -2097153);
                        }
                    }
                }
            }
        }
        class37 var12 = new class37(arg4);
        int var13 = arg1 + arg6;
        int var14 = arg2 + arg0;
        for (int var15 = 0; var15 < var8; var15++) {
            for (int var39 = 0; var39 < 64; var39++) {
                for (int var40 = 0; var40 < 64; var40++) {
                    class242.method1634(0, var39 + arg6, var13 + var39, 0, arg7, var12, false, arg0 + var40, var15, 0, false, var14 + var40);
                }
            }
        }
        if (arg5 != 24624) {
            field722 = -121;
        }
        boolean var16 = false;
        boolean var17 = false;
        while (var12.field588 < var12.field583.length) {
            int var18 = var12.method333((byte) -59);
            if (var18 == 128) {
                var17 = true;
                class109.field1728[0] = var12.method293(class76.method605(arg5, -24614));
                class109.field1728[1] = var12.method306(47);
                class109.field1728[2] = var12.method306(arg5 - 24516);
                class109.field1728[3] = var12.method306(103);
                class109.field1728[4] = var12.method293(108);
            } else {
                if (var18 != 129) {
                    var12.field588--;
                    break;
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    byte var25 = var12.method322((byte) 53);
                    if (var25 == 0) {
                        int var26 = arg6;
                        if (arg6 < 0) {
                            var26 = 0;
                        } else if (arg6 >= 104) {
                            var26 = 104;
                        }
                        int var27 = arg0;
                        if (arg0 < 0) {
                            var27 = 0;
                        } else if (arg0 >= 104) {
                            var27 = 104;
                        }
                        int var28 = arg0 + 64;
                        int var29 = arg6 + 64;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 >= 104) {
                            var28 = 104;
                        }
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        while (var29 > var26) {
                            while (var28 > var27) {
                                class217.field3379[var24][var26][var27] = 0;
                                var27++;
                            }
                            var26++;
                        }
                    } else if (var25 == 1) {
                        for (int var30 = 0; var30 < 64; var30 += 4) {
                            for (int var31 = 0; var31 < 64; var31 += 4) {
                                byte var32 = var12.method322((byte) 43);
                                for (int var33 = arg6 + var30; var33 < (arg6 + var30 + 4); var33++) {
                                    for (int var34 = arg0 + var31; var34 < (arg0 + var31 + 4); var34++) {
                                        if (var33 >= 0 && var33 < 104 && var34 >= 0 && var34 < 104) {
                                            class217.field3379[var24][var33][var34] = var32;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var25 == 2 && var24 > 0) {
                        int var35 = arg6;
                        if (arg6 < 0) {
                            var35 = 0;
                        } else if (arg6 >= 104) {
                            var35 = 104;
                        }
                        int var36 = arg6 + 64;
                        if (var36 < 0) {
                            var36 = 0;
                        } else if (var36 >= 104) {
                            var36 = 104;
                        }
                        int var37 = arg0;
                        int var38 = arg0 + 64;
                        if (arg0 < 0) {
                            var37 = 0;
                        } else if (arg0 >= 104) {
                            var37 = 104;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 >= 104) {
                            var38 = 104;
                        }
                        while (var35 < var36) {
                            while (var38 > var37) {
                                class217.field3379[var24][var35][var37] = class217.field3379[var24 - 1][var35][var37];
                                var37++;
                            }
                            var35++;
                        }
                    }
                }
                var16 = true;
            }
        }
        if (!var16) {
            for (int var19 = 0; var19 < 4; var19++) {
                for (int var20 = 0; var20 < 16; var20++) {
                    for (int var21 = 0; var21 < 16; var21++) {
                        int var22 = (arg6 >> 2) + var20;
                        int var23 = (arg0 >> 2) + var21;
                        if (var22 >= 0 && var22 < 26 && var23 >= 0 && var23 < 26) {
                            class217.field3379[var19][var22][var23] = 0;
                        }
                    }
                }
            }
        }
        if (var17) {
            return class109.field1728;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method374(boolean arg0) {
        field714 = null;
        if (!arg0) {
            field721 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZII)V")
    public static final void method375(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field722 = -44;
        }
        String var4 = "::tele " + arg0 + "," + (arg2 >> 6) + "," + (arg3 >> 6) + "," + (arg2 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        field715++;
        class142.method982(var4, !arg1);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static final void method376(byte arg0) {
        if (arg0 != -94) {
            method377(-14, -95, -73, -126, -85, -116, true, 23);
        }
        field716++;
        if (class226.field3537 == 0) {
            return;
        }
        try {
            if ((++class53.field828) > 1500) {
                if (class118.field1829 != null) {
                    class118.field1829.method1242((byte) 113);
                    class118.field1829 = null;
                }
                if (class176.field2642 >= 1) {
                    class226.field3537 = 0;
                    class35.field572 = -5;
                    return;
                }
                class226.field3537 = 1;
                class53.field828 = 0;
                if (class286.field4498 == class153.field2341) {
                    class153.field2341 = class174.field2582;
                } else {
                    class153.field2341 = class286.field4498;
                }
                class176.field2642++;
            }
            if (class226.field3537 == 1) {
                class272.field4302 = class22.field329.method480(class153.field2341, (byte) -100, class76.field1279);
                class226.field3537 = 2;
            }
            if (class226.field3537 == 2) {
                if (class272.field4302.field3828 == 2) {
                    throw new IOException();
                }
                if (class272.field4302.field3828 != 1) {
                    return;
                }
                class118.field1829 = new class184((Socket) class272.field4302.field3831, class22.field329);
                class272.field4302 = null;
                class118.field1829.method1243(0, class292.field4607.field583, class292.field4607.field588, (byte) -81);
                if (class33.field531 != null) {
                    class33.field531.method66((byte) 122);
                }
                if (class46.field737 != null) {
                    class46.field737.method66((byte) 122);
                }
                int var1 = class118.field1829.method1232(22221);
                if (class33.field531 != null) {
                    class33.field531.method66((byte) 122);
                }
                if (class46.field737 != null) {
                    class46.field737.method66((byte) 122);
                }
                if (var1 != 101) {
                    class226.field3537 = 0;
                    class35.field572 = var1;
                    class118.field1829.method1242((byte) 113);
                    class118.field1829 = null;
                    return;
                }
                class226.field3537 = 3;
            }
            if (class226.field3537 == 3 && class118.field1829.method1240((byte) 121) >= 2) {
                int var2 = class118.field1829.method1232(22221) << 8 | class118.field1829.method1232(22221);
                class93.method732(var2, 14405);
                if (class155.field2358 == -1) {
                    class35.field572 = 6;
                    class226.field3537 = 0;
                    class118.field1829.method1242((byte) 113);
                    class118.field1829 = null;
                } else {
                    class226.field3537 = 0;
                    class118.field1829.method1242((byte) 113);
                    class118.field1829 = null;
                    class259.method1719(false);
                }
            }
        } catch (IOException var3) {
            if (class118.field1829 != null) {
                class118.field1829.method1242((byte) 113);
                class118.field1829 = null;
            }
            if (class176.field2642 < 1) {
                class53.field828 = 0;
                class226.field3537 = 1;
                if (class286.field4498 == class153.field2341) {
                    class153.field2341 = class174.field2582;
                } else {
                    class153.field2341 = class286.field4498;
                }
                class176.field2642++;
            } else {
                class35.field572 = -4;
                class226.field3537 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIZI)Z")
    public static final boolean method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field720++;
        long var8 = class280.method1875(arg5, arg1 + arg7, arg3 + arg4);
        if (arg6) {
            field722 = 45;
        }
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x7F75F) >> 14;
            int var11 = ((int) var8 & 0x3CAA6C) >> 20;
            int var12 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            class73 var13 = class85.method690(2276, var12);
            if (var13.field1215 == -1) {
                int var14 = arg0;
                int[] var15 = class201.field3150;
                if (var8 > 0L) {
                    var14 = arg2;
                }
                int var16 = arg1 * 4 + ((103 - arg3) * 2048) + 24624;
                if (var10 == 0 || var10 == 2) {
                    if (var11 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var11 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var11 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var11 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
                if (var10 == 3) {
                    if (var11 == 0) {
                        var15[var16] = var14;
                    } else if (var11 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var11 == 2) {
                        var15[var16 + 1536 + 3] = var14;
                    } else if (var11 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var10 == 2) {
                    if (var11 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var11 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var11 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var11 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 2 + 1536] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
            } else if (!class119.method857(arg3, arg4, (byte) 102, arg7, var11, arg1, var13)) {
                return false;
            }
        }
        long var17 = class120.method859(arg5, arg1 + arg7, arg3 + arg4);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x38AE26) >> 20;
            int var20 = ((int) var17 & 0x7F490) >> 14;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class73 var22 = class85.method690(2276, var21);
            if (var22.field1215 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class201.field3150;
                    int var25 = arg1 * 4 + ((103 - arg3) * 2048) + 24624;
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1024 + 1] = var23;
                        var24[var25 + 512 + 2] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 512 + 1] = var23;
                        var24[var25 + 1026] = var23;
                        var24[var25 + 1539] = var23;
                    }
                }
            } else if (!class119.method857(arg3, arg4, (byte) 102, arg7, var19, arg1, var22)) {
                return false;
            }
        }
        long var26 = class209.method1404(arg5, arg1 + arg7, arg3 + arg4);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            class73 var30 = class85.method690(2276, var29);
            if (var30.field1215 != -1 && !class119.method857(arg3, arg4, (byte) 102, arg7, var28, arg1, var30)) {
                return false;
            }
        }
        return true;
    }
}
