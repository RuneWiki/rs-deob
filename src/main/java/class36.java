import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class class36 {

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lli;")
    public static class185 field559 = class245.method1649("::fps ", 127);

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field561 = 0;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Lli;")
    public static class185 field562 = class245.method1649("::errortest", 125);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lhi;")
    public static class250 field560;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "[I")
    public static int[] field565;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
    public static final void method222(int arg0, int arg1) {
        if (arg0 >= -109) {
            method222(-42, -98);
        }
        class174 var2 = class249.method1671(6, arg1, (byte) 99);
        field563++;
        var2.method1234((byte) -91);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIILp;B)V")
    public static final void method223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class82 arg6, byte arg7) {
        if (class179.field3286) {
            class148.field2800 = 32;
        } else {
            class148.field2800 = 0;
        }
        field556++;
        class179.field3286 = false;
        if (arg7 <= 117) {
            return;
        }
        if (class144.field2747 != 0) {
            if (arg5 >= arg0 && arg0 + 16 > arg5 && arg4 >= arg3 && arg4 < (arg3 + 16)) {
                arg6.field1590 -= 4;
                class229.method1581(arg6, false);
            } else if (arg5 >= arg0 && arg0 + 16 > arg5 && (arg2 + arg3 - 16) <= arg4 && arg2 + arg3 > arg4) {
                arg6.field1590 += 4;
                class229.method1581(arg6, false);
            } else if (arg5 >= (arg0 - class148.field2800) && (arg0 + class148.field2800 + 16) > arg5 && arg4 >= (arg3 + 16) && arg4 < (arg3 + arg2 - 16)) {
                int var8 = (arg2 - 32) * arg2 / arg1;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - (var8 / 2) - arg3 - 16;
                int var10 = arg2 - var8 - 32;
                arg6.field1590 = (arg1 - arg2) * var9 / var10;
                class229.method1581(arg6, false);
                class179.field3286 = true;
            }
        }
        if (class9.field184 == 0) {
            return;
        }
        int var11 = arg6.field1505;
        if ((arg0 - var11) <= arg5 && arg4 >= arg3 && arg0 + 16 > arg5 && (arg3 + arg2) >= arg4) {
            arg6.field1590 += class9.field184 * 45;
            class229.method1581(arg6, false);
            return;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIII)V")
    public static final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field557++;
        int var6 = arg2 - arg4;
        int var7 = arg0 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class171.method1220(arg5, arg2, arg4, (byte) 126, arg1);
            }
        } else if (var6 == 0) {
            class1.method12(arg5, arg0, arg4, arg1, true);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (arg3 > var7) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg5;
                arg5 = arg4;
                arg4 = var9;
                int var10 = arg0;
                arg0 = arg2;
                arg2 = var10;
            }
            if (arg5 > arg0) {
                int var11 = arg4;
                int var12 = arg5;
                arg4 = arg2;
                arg2 = var11;
                arg5 = arg0;
                arg0 = var12;
            }
            int var13 = arg0 - arg5;
            int var14 = arg2 - arg4;
            int var15 = arg4;
            int var16 = -(var13 >> 1);
            if (var14 < 0) {
                var14 = -var14;
            }
            int var17 = arg2 <= arg4 ? -1 : 1;
            if (var8) {
                for (int var19 = arg5; var19 <= arg0; var19++) {
                    var16 += var14;
                    class145.field2757[var19][var15] = arg1;
                    if (var16 > 0) {
                        var15 += var17;
                        var16 -= var13;
                    }
                }
            } else {
                for (int var18 = arg5; var18 <= arg0; var18++) {
                    class145.field2757[var15][var18] = arg1;
                    var16 += var14;
                    if (var16 > 0) {
                        var16 -= var13;
                        var15 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method225(int arg0) {
        field560 = null;
        int var1 = -54 / ((arg0 - 2) / 50);
        field565 = null;
        field562 = null;
        field559 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static final void method226(byte arg0) {
        field558++;
        class280.field4961 = 0;
        class148.field2789 = 0;
        class99.method648(89);
        class196.method1408(-66);
        class37.method239(true);
        class40.method250((byte) 126);
        for (int var1 = 0; var1 < class280.field4961; var1++) {
            int var3 = class158.field3003[var1];
            if (class211.field3851 != class93.field1774[var3].field2710) {
                if (class93.field1774[var3].field3508 > 0) {
                    class220.method1523(class93.field1774[var3], false);
                }
                class93.field1774[var3] = null;
            }
        }
        if (arg0 != -122) {
            method230(false);
        }
        if (class217.field3976 != class142.field2669.field2155) {
            throw new RuntimeException("gpp1 pos:" + class142.field2669.field2155 + " psize:" + class217.field3976);
        }
        for (int var2 = 0; var2 < class17.field281; var2++) {
            if (class93.field1774[class174.field3187[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class17.field281);
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIBI)V")
    public static final void method227(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field564++;
        long var6 = class255.method1724(arg2, arg1, arg5);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x7CF45) >> 14;
            int var9 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class135 var10 = class184.method1294(var9, -28916);
            int var11 = ((int) var6 & 0x37BF38) >> 20;
            if (var10.field2510 == -1) {
                int var12 = arg0;
                if (var6 > 0L) {
                    var12 = arg3;
                }
                int[] var13 = class159.field3015;
                int var14 = (103 - arg5) * 512 * 4 + arg1 * 4 + 24624;
                if (var8 == 0 || var8 == 2) {
                    if (var11 == 0) {
                        var13[var14] = var12;
                        var13[var14 + 512] = var12;
                        var13[var14 + 1024] = var12;
                        var13[var14 + 1536] = var12;
                    } else if (var11 == 1) {
                        var13[var14] = var12;
                        var13[var14 + 1] = var12;
                        var13[var14 + 2] = var12;
                        var13[var14 + 3] = var12;
                    } else if (var11 == 2) {
                        var13[var14 + 3] = var12;
                        var13[var14 + 512 + 3] = var12;
                        var13[var14 + 1024 + 3] = var12;
                        var13[var14 + 1536 + 3] = var12;
                    } else if (var11 == 3) {
                        var13[var14 + 1536] = var12;
                        var13[var14 + 1 + 1536] = var12;
                        var13[var14 + 2 + 1536] = var12;
                        var13[var14 + 1536 + 3] = var12;
                    }
                }
                if (var8 == 3) {
                    if (var11 == 0) {
                        var13[var14] = var12;
                    } else if (var11 == 1) {
                        var13[var14 + 3] = var12;
                    } else if (var11 == 2) {
                        var13[var14 + 1536 + 3] = var12;
                    } else if (var11 == 3) {
                        var13[var14 + 1536] = var12;
                    }
                }
                if (var8 == 2) {
                    if (var11 == 3) {
                        var13[var14] = var12;
                        var13[var14 + 512] = var12;
                        var13[var14 + 1024] = var12;
                        var13[var14 + 1536] = var12;
                    } else if (var11 == 0) {
                        var13[var14] = var12;
                        var13[var14 + 1] = var12;
                        var13[var14 + 2] = var12;
                        var13[var14 + 3] = var12;
                    } else if (var11 == 1) {
                        var13[var14 + 3] = var12;
                        var13[var14 + 3 + 512] = var12;
                        var13[var14 + 3 + 1024] = var12;
                        var13[var14 + 3 + 1536] = var12;
                    } else if (var11 == 2) {
                        var13[var14 + 1536] = var12;
                        var13[var14 + 1537] = var12;
                        var13[var14 + 1536 + 2] = var12;
                        var13[var14 + 3 + 1536] = var12;
                    }
                }
            } else {
                class34 var15 = null;
                int var16 = var10.field2500;
                if (!var10.field2479) {
                    var15 = class254.field4512[var10.field2510];
                } else if (var11 == 0) {
                    var15 = class254.field4512[var10.field2510];
                } else if (var11 == 1) {
                    var15 = class195.field3586[var10.field2510];
                    var16 = var10.field2536;
                } else if (var11 == 2) {
                    var15 = class108.field1956[var10.field2510];
                } else if (var11 == 3) {
                    var15 = class121.field2211[var10.field2510];
                    var16 = var10.field2536;
                }
                if (var15 != null) {
                    var15.method96(arg1 * 4 + 48, (-arg5 + 104 - var16) * 4 + 48);
                }
            }
        }
        long var17 = class228.method1579(arg2, arg1, arg5);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x3D9663) >> 20;
            int var20 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var21 = (int) var17 >> 14 & 0x1F;
            class135 var22 = class184.method1294(var20, -28916);
            if (var22.field2510 != -1) {
                class34 var23 = null;
                int var24 = var22.field2500;
                if (!var22.field2479) {
                    var23 = class254.field4512[var22.field2510];
                } else if (var19 == 0) {
                    var23 = class254.field4512[var22.field2510];
                } else if (var19 == 1) {
                    var23 = class195.field3586[var22.field2510];
                    var24 = var22.field2536;
                } else if (var19 == 2) {
                    var23 = class108.field1956[var22.field2510];
                } else if (var19 == 3) {
                    var24 = var22.field2536;
                    var23 = class121.field2211[var22.field2510];
                }
                if (var23 != null) {
                    var23.method96(arg1 * 4 + 48, 48 - -((-var24 + 104 + -arg5) * 4));
                }
            } else if (var21 == 9) {
                int var25 = 15658734;
                int[] var26 = class159.field3015;
                if (var17 > 0L) {
                    var25 = 15597568;
                }
                int var27 = (103 - arg5) * 2048 + arg1 * 4 + 24624;
                if (var19 == 0 || var19 == 2) {
                    var26[var27 + 1536] = var25;
                    var26[var27 + 1024 + 1] = var25;
                    var26[var27 + 512 + 2] = var25;
                    var26[var27 + 3] = var25;
                } else {
                    var26[var27] = var25;
                    var26[var27 + 1 + 512] = var25;
                    var26[var27 + 1024 + 2] = var25;
                    var26[var27 + 1536 + 3] = var25;
                }
            }
        }
        long var28 = class32.method201(arg2, arg1, arg5);
        if (var28 != 0L) {
            int var30 = Integer.MAX_VALUE & (int) (var28 >>> 32);
            int var31 = (int) var28 >> 20 & 0x3;
            class135 var32 = class184.method1294(var30, -28916);
            if (var32.field2510 != -1) {
                class34 var33 = null;
                int var34 = var32.field2500;
                if (!var32.field2479) {
                    var33 = class254.field4512[var32.field2510];
                } else if (var31 == 0) {
                    var33 = class254.field4512[var32.field2510];
                } else if (var31 == 1) {
                    var33 = class195.field3586[var32.field2510];
                    var34 = var32.field2536;
                } else if (var31 == 2) {
                    var33 = class108.field1956[var32.field2510];
                } else if (var31 == 3) {
                    var33 = class121.field2211[var32.field2510];
                    var34 = var32.field2536;
                }
                if (var33 != null) {
                    var33.method96((arg1 * 4) + 48, (-arg5 + 104 + -var34) * 4 + 48);
                }
            }
        }
        if (arg4 != 11) {
            field560 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lrc;B)Lrc;")
    public abstract class281 method228(class281 arg0, byte arg1);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)I")
    public static final int method229(int arg0, int arg1, int arg2) {
        field555++;
        if (arg0 != 9016) {
            field565 = null;
        }
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg2--;
            arg1 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public static final void method230(boolean arg0) {
        class80.field1395.method80(-14113);
        if (!arg0) {
            field559 = null;
        }
        field554++;
        class63.field1103.method80(-14113);
        class198.field3619.method80(-14113);
    }
}
