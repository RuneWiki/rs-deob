import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class284 {

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Z")
    public boolean field4099 = false;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Lvu;")
    public static class680 field4101 = new class680();

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field4103 = 0;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILro;I)V", line = 6)
    public final void method1884(int arg0, class526 arg1, int arg2) {
        field4097++;
        if (arg0 == -1) {
            return;
        }
        this.method1679();
        if (!this.method1656()) {
            this.method1667();
            return;
        }
        class317 var4 = arg1.field7300[arg0];
        class454 var5 = var4.field4390;
        for (int var6 = arg2; var6 < var4.field4401; var6++) {
            short var7 = var4.field4406[var6];
            if (var5.field6292[var7]) {
                if (var4.field4400[var6] != -1) {
                    this.method1684(0, 0, 0, 0);
                }
                this.method1684(var5.field6289[var7], var4.field4405[var6], var4.field4399[var6], var4.field4397[var6]);
            }
        }
        this.method1657();
        this.method1667();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lro;ILro;IIIZII)V", line = 58)
    public final void method1885(class526 arg0, int arg1, class526 arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (arg3 >= -101) {
            this.field4099 = true;
        }
        field4098++;
        if (arg4 == -1) {
            return;
        }
        this.method1679();
        if (!this.method1656()) {
            this.method1667();
            return;
        }
        class317 var10 = arg0.field7300[arg4];
        class454 var11 = var10.field4390;
        class317 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field7300[arg7];
            if (var12.field4390 != var11) {
                var12 = null;
            }
        }
        this.method1891((byte) -30, arg8, arg1, 65535, false, arg5, var11, arg6, null, null, var10, var12);
        this.method1657();
        this.method1667();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V", line = 99)
    public static void method1886(boolean arg0) {
        if (!arg0) {
            method1887(36, true);
        }
        field4101 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)I", line = 124)
    public static final int method1887(int arg0, boolean arg1) {
        field4092++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else if (arg1) {
            return -97;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldc;I)Lao;", line = 168)
    public static final class66 method1888(class63 arg0, int arg1) {
        field4102++;
        int var2 = -100 / ((38 - arg1) / 34);
        return new class66(arg0.method496(-50), arg0.method496(-53), arg0.method496(-25), arg0.method496(-60), arg0.method476((byte) 118), arg0.method505((byte) -119));
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILro;Lro;IZIIII[II)V", line = 183)
    public final void method1889(int arg0, class526 arg1, class526 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        field4095++;
        if (arg3 == -1) {
            return;
        }
        this.method1679();
        if (arg6 != -16957) {
            field4103 = -13;
        }
        if (!this.method1656()) {
            this.method1667();
            return;
        }
        class317 var12 = arg1.field7300[arg3];
        class454 var13 = var12.field4390;
        class317 var14 = null;
        if (arg2 != null) {
            var14 = arg2.field7300[arg5];
            if (var14.field4390 != var13) {
                var14 = null;
            }
        }
        this.method1891((byte) -30, arg7, arg10, arg0, false, arg8, var13, arg4, null, arg9, var12, var14);
        this.method1657();
        this.method1667();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[II[IIIIZ)V", line = 245)
    private final void method1890(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg6 == 1) {
            if (arg2 == 0 || arg2 == 1) {
                int var13 = -arg1;
                arg1 = arg4;
                arg4 = var13;
            } else if (arg2 == 3) {
                int var11 = arg1;
                arg1 = arg4;
                arg4 = var11;
            } else if (arg2 == 2) {
                int var12 = arg1;
                arg1 = -arg4 & 0x3FFF;
                arg4 = var12 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg2 == 0 || arg2 == 1) {
                arg1 = -arg1;
                arg4 = -arg4;
            } else if (arg2 == 2) {
                arg4 = -arg4 & 0x3FFF;
                arg1 = -arg1 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg2 == 0 || arg2 == 1) {
                int var16 = arg1;
                arg1 = -arg4;
                arg4 = var16;
            } else if (arg2 == 3) {
                int var15 = arg1;
                arg1 = arg4;
                arg4 = var15;
            } else if (arg2 == 2) {
                int var14 = arg1;
                arg1 = arg4 & 0x3FFF;
                arg4 = -var14 & 0x3FFF;
            }
        }
        field4094++;
        if (arg0 == 65535) {
            this.method1680(arg2, arg3, arg1, arg7, arg4, arg6, arg9);
        } else {
            this.method1696(arg2, arg3, arg1, arg7, arg4, arg9, arg0, arg5);
        }
        if (arg8 >= -100) {
            field4101 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIIIZILega;Z[Z[ILmp;Lmp;)V", line = 341)
    private final void method1891(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class454 arg6, boolean arg7, boolean[] arg8, int[] arg9, class317 arg10, class317 arg11) {
        field4093++;
        if (arg11 == null || arg1 == 0) {
            for (int var38 = 0; var38 < arg10.field4401; var38++) {
                short var39 = arg10.field4406[var38];
                if (arg8 == null || arg4 == arg8[var39] || arg6.field6289[var39] == 0) {
                    short var40 = arg10.field4400[var38];
                    if (var40 != -1) {
                        this.method1890(arg6.field6295[var40] & arg3, 0, 0, arg6.field6290[var40], 0, arg9, arg2, 0, -123, arg7);
                    }
                    this.method1890(arg3 & arg6.field6295[var39], arg10.field4405[var38], arg6.field6289[var39], arg6.field6290[var39], arg10.field4397[var38], arg9, arg2, arg10.field4399[var38], arg0 - 72, arg7);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (arg0 != -30) {
            return;
        }
        while (var15 < arg6.field6298) {
            boolean var16 = false;
            if (var13 < arg10.field4401 && arg10.field4406[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg11.field4401 && arg11.field4406[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg8 == null || arg8[var15] == arg4 || arg6.field6289[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg6.field6289[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    if (var16) {
                        var20 = arg10.field4397[var13];
                        var24 = arg10.field4405[var13];
                        var22 = arg10.field4400[var13];
                        var23 = arg10.field4404[var13];
                        var21 = arg10.field4399[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = var18;
                        var22 = -1;
                        var23 = 0;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var29 = arg11.field4400[var14];
                        var27 = arg11.field4397[var14];
                        var25 = arg11.field4405[var14];
                        var26 = arg11.field4399[var14];
                        var28 = arg11.field4404[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = var18;
                        var27 = var18;
                        var28 = 0;
                        var29 = -1;
                    }
                    if (var22 != -1) {
                        this.method1890(arg6.field6295[var22] & arg3, 0, 0, arg6.field6290[var22], 0, arg9, arg2, 0, -102, arg7);
                    } else if (var29 != -1) {
                        this.method1890(arg3 & arg6.field6295[var29], 0, 0, arg6.field6290[var29], 0, arg9, arg2, 0, -122, arg7);
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var23 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var32 = var20;
                        var31 = var24;
                        var33 = var21;
                    } else if (var19 == 2) {
                        int var35 = var25 - var24 & 0x3FFF;
                        int var36 = var26 - var21 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        int var37 = var27 - var20 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg1 * var36 / arg5 + var21 & 0x3FFF;
                        var31 = var24 + (arg1 * var35 / arg5) & 0x3FFF;
                        var32 = arg1 * var37 / arg5 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var25 - var24 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = arg1 * var30 / arg5 + var24 & 0x3FFF;
                        var32 = 0;
                        var33 = 0;
                    } else if (var19 == 7) {
                        int var34 = var25 - var24 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var31 = arg1 * var34 / arg5 + var24 & 0x3F;
                        var32 = var20 + ((var27 - var20) * arg1 / arg5);
                        var33 = (var26 - var21) * arg1 / arg5 + var21;
                    } else {
                        var31 = (var25 - var24) * arg1 / arg5 + var24;
                        var32 = var20 + ((var27 - var20) * arg1 / arg5);
                        var33 = (var26 - var21) * arg1 / arg5 + var21;
                    }
                    this.method1890(arg6.field6295[var15] & arg3, var31, var19, arg6.field6290[var15], var32, arg9, arg2, var33, -126, arg7);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
            var15++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIILs;III)V", line = 555)
    public final void method1892(int arg0, int arg1, int arg2, int arg3, int arg4, class341 arg5, int arg6, int arg7, int arg8) {
        field4096++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg6 / 2;
        int var14 = -arg0 / 2;
        int var15 = arg5.method2172(arg3 + var13, -1, arg2 - -var14);
        int var16 = arg6 / 2;
        int var17 = -arg0 / 2;
        int var18 = arg5.method2172(arg3 + var16, -1, arg2 + var17);
        int var19 = -arg6 / 2;
        int var20 = arg0 / 2;
        int var21 = arg5.method2172(arg3 + var19, -1, arg2 - -var20);
        int var22 = arg6 / 2;
        int var23 = arg0 / 2;
        int var24 = arg5.method2172(arg3 + var22, -1, arg2 + var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var18 >= var24 ? var24 : var18;
        if (arg0 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg1 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg1;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (arg1 < var28) {
                        var28 = arg1;
                    }
                }
                this.method1694(var28);
            }
        }
        int var30 = var21 > var15 ? var15 : var21;
        int var31 = var15 + var24;
        if (arg6 != 0) {
            int var32 = (int) (Math.atan2((double) (var30 - var27), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg7 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg7;
                        if (var33 > var32) {
                            var32 = var33;
                        }
                    } else if (arg7 < var32) {
                        var32 = arg7;
                    }
                }
                this.method1690(var32);
            }
        }
        if (var31 > (var18 + var21)) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg4;
        int var35 = 68 / ((-arg8 - 61) / 44);
        if (var34 != 0) {
            this.method1672(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lro;IIIIIIIILro;Lro;ZI[ZLro;)V", line = 668)
    public final void method1893(class526 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class526 arg9, class526 arg10, boolean arg11, int arg12, boolean[] arg13, class526 arg14) {
        field4100++;
        if (arg8 == -1) {
            return;
        }
        if (arg13 == null || arg7 == -1) {
            this.method1885(arg10, 0, arg14, -128, arg8, arg5, arg11, arg2, arg1);
            return;
        }
        this.method1679();
        if (!this.method1656()) {
            this.method1667();
            return;
        }
        int var16 = 48 / ((47 - arg12) / 38);
        class317 var17 = arg10.field7300[arg8];
        class454 var18 = var17.field4390;
        class317 var19 = null;
        if (arg14 != null) {
            var19 = arg14.field7300[arg2];
            if (var19.field4390 != var18) {
                var19 = null;
            }
        }
        this.method1891((byte) -30, arg1, 0, 65535, false, arg5, var18, arg11, arg13, null, var17, var19);
        class317 var20 = arg0.field7300[arg7];
        class317 var21 = null;
        if (arg9 != null) {
            var21 = arg9.field7300[arg6];
            if (var21.field4390 != var18) {
                var21 = null;
            }
        }
        this.method1680(0, new int[0], 0, 0, 0, 0, arg11);
        this.method1891((byte) -30, arg3, 0, 65535, true, arg4, var20.field4390, arg11, arg13, null, var20, var21);
        this.method1657();
        this.method1667();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method1654(class284 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method1684(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method1687(int arg0, int arg1, class341 arg2, class341 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public abstract void method1679();

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method1702(int arg0);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public abstract void method1705();

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method1657();

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method1691(int arg0);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method1663(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method1703();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lih;Lkia;II)V")
    public abstract void method1682(class744 arg0, class574 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method1673();

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method1677(int arg0);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method1674();

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method1678();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
    public abstract boolean method1664();

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method1670(int arg0);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method1667();

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method1655();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method1700(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method1668();

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method1697();

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()[Lmv;")
    public abstract class44[] method1662();

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method1666();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method1704(int arg0);

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class709 method1701(class709 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1680(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1696(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lih;)V")
    public abstract void method1661(class744 arg0);

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method1693();

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method1681();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lih;IZ)V")
    public abstract void method1699(class744 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lih;Lkia;I)V")
    public abstract void method1686(class744 arg0, class574 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method1685();

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method1660(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILih;ZII)Z")
    public abstract boolean method1653(int arg0, int arg1, class744 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method1694(int arg0);

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method1658();

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lnba;")
    public abstract class491[] method1688();

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method1690(int arg0);

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method1689();

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method1672(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILih;ZI)Z")
    public abstract boolean method1669(int arg0, int arg1, class744 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method1665(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class284 method1659(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method1683();

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method1656();
}
