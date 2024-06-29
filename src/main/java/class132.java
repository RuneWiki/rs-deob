import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class132 extends class279 {

    @OriginalMember(owner = "client!le", name = "w", descriptor = "Lpk;")
    public class81 field1947;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field1949 = -1;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "[F")
    public static float[] field1951 = new float[4];

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Ltn;")
    public static class38 field1945;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V", line = 4)
    public static void method973(int arg0) {
        if (arg0 == 1) {
            field1945 = null;
            field1951 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V", line = 18)
    public static final void method974(int arg0, byte arg1) {
        field1952++;
        if (arg0 == 37) {
            class92.field1232 = 3.0F;
        } else if (arg0 == 50) {
            class92.field1232 = 4.0F;
        } else if (arg0 == 75) {
            class92.field1232 = 6.0F;
        } else if (arg0 == 100) {
            class92.field1232 = 8.0F;
        } else if (arg0 == 200) {
            class92.field1232 = 16.0F;
        }
        if (arg1 < 91) {
            method975((class303) null, -1);
        }
        class198.field3167 = -1;
        class198.field3167 = -1;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lpk;)V", line = 58)
    public class132(class81 arg0) {
        this.field1947 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lh;I)V", line = 68)
    public static final void method975(class303 arg0, int arg1) {
        field1946++;
        class107 var2 = arg0.method2100(2000117776);
        if (arg1 != 128) {
            method974(80, (byte) 94);
        }
        arg0.field4724 = var2.field1451;
        if (arg0.field4710 == 0) {
            arg0.field4728 = 0;
            return;
        }
        if (arg0.field4653 != -1 && arg0.field4739 == 0) {
            class281 var3 = class295.method2064(0, arg0.field4653);
            if (arg0.field4695 > 0 && var3.field4316 == 0) {
                arg0.field4728++;
                return;
            }
            if (arg0.field4695 <= 0 && var3.field4342 == 0) {
                arg0.field4728++;
                return;
            }
        }
        if (arg0.field4703 != -1 && arg0.field4732 <= class229.field3595) {
            class234 var4 = class9.method124(arg0.field4703, arg1 + 1431655637);
            if (var4.field3644 && var4.field3647 != -1) {
                class281 var5 = class295.method2064(arg1 - 128, var4.field3647);
                if (arg0.field4695 > 0 && var5.field4316 == 0) {
                    arg0.field4728++;
                    return;
                }
                if (arg0.field4695 <= 0 && var5.field4342 == 0) {
                    arg0.field4728++;
                    return;
                }
            }
        }
        int var6 = arg0.field4731;
        int var7 = arg0.field4698;
        int var8 = arg0.field4708[arg0.field4710 - 1] * 128 + arg0.method2099((byte) 123) * 64;
        int var9 = arg0.field4675[arg0.field4710 - 1] * 128 + arg0.method2099((byte) 123) * 64;
        if (var8 - var7 > 256 || var8 - var7 < -256 || (var9 - var6) > 256 || (var9 - var6) < -256) {
            arg0.field4698 = var8;
            arg0.field4731 = var9;
            return;
        }
        if (var7 < var8) {
            if (var6 < var9) {
                arg0.field4674 = 1280;
            } else if (var9 < var6) {
                arg0.field4674 = 1792;
            } else {
                arg0.field4674 = 1536;
            }
        } else if (var7 <= var8) {
            if (var9 > var6) {
                arg0.field4674 = 1024;
            } else if (var6 > var9) {
                arg0.field4674 = 0;
            }
        } else if (var9 > var6) {
            arg0.field4674 = 768;
        } else if (var6 <= var9) {
            arg0.field4674 = 512;
        } else {
            arg0.field4674 = 256;
        }
        int var10 = arg0.field4674 - arg0.field4715 & 0x7FF;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        boolean var11 = true;
        int var12 = var2.field1428;
        if (var10 >= -256 && var10 <= 256) {
            var12 = var2.field1414;
        } else if (var10 >= 256 && var10 < 768) {
            var12 = var2.field1443;
        } else if (var10 >= -768 && var10 <= -256) {
            var12 = var2.field1434;
        }
        int var13 = 4;
        byte var14 = 1;
        if (var12 == -1) {
            var12 = var2.field1414;
        }
        arg0.field4724 = var12;
        if (arg0 instanceof class212) {
            var11 = ((class212) arg0).field3346.field2592;
        }
        if (var11) {
            if (arg0.field4715 != arg0.field4674 && arg0.field4726 == -1 && arg0.field4690 != 0) {
                var13 = 2;
            }
            if (arg0.field4710 > 2) {
                var13 = 6;
            }
            if (arg0.field4710 > 3) {
                var13 = 8;
            }
            if (arg0.field4728 > 0 && arg0.field4710 > 1) {
                var13 = 8;
                arg0.field4728--;
            }
        } else {
            if (arg0.field4710 > 1) {
                var13 = 6;
            }
            if (arg0.field4710 > 2) {
                var13 = 8;
            }
            if (arg0.field4728 > 0 && arg0.field4710 > 1) {
                var13 = 8;
                arg0.field4728--;
            }
        }
        if (arg0.field4657[arg0.field4710 - 1] == 2) {
            var13 <<= 0x1;
            var14 = 2;
        } else if (arg0.field4657[arg0.field4710 - 1] == 0) {
            var14 = 0;
            var13 >>= 0x1;
        }
        if (var13 < 8 || var2.field1420 == -1) {
            if (var2.field1415 != -1 && var14 == 0) {
                if (arg0.field4724 == var2.field1428 && var2.field1427 != -1) {
                    arg0.field4724 = var2.field1427;
                } else if (arg0.field4724 == var2.field1434 && var2.field1409 != -1) {
                    arg0.field4724 = var2.field1409;
                } else if (arg0.field4724 == var2.field1443 && var2.field1435 != -1) {
                    arg0.field4724 = var2.field1435;
                } else {
                    arg0.field4724 = var2.field1415;
                }
            }
        } else if (arg0.field4724 == var2.field1428 && var2.field1431 != -1) {
            arg0.field4724 = var2.field1431;
        } else if (arg0.field4724 == var2.field1434 && var2.field1408 != -1) {
            arg0.field4724 = var2.field1408;
        } else if (arg0.field4724 == var2.field1443 && var2.field1446 != -1) {
            arg0.field4724 = var2.field1446;
        } else {
            arg0.field4724 = var2.field1420;
        }
        if (var2.field1438 != -1) {
            int var15 = var13 << 7;
            if (arg0.field4710 == 1) {
                int var16 = arg0.field4733 * arg0.field4733;
                int var17 = (var8 < arg0.field4698 ? arg0.field4698 - var8 : -arg0.field4698 + var8) << 7;
                int var18 = (var9 < arg0.field4731 ? arg0.field4731 - var9 : -arg0.field4731 + var9) << 7;
                int var19 = var18 >= var17 ? var18 : var17;
                int var20 = var2.field1438 * 2 * var19;
                if (var16 > var20) {
                    arg0.field4733 /= 2;
                } else if (var19 < (var16 / 2)) {
                    arg0.field4733 -= var2.field1438;
                    if (arg0.field4733 < 0) {
                        arg0.field4733 = 0;
                    }
                } else if (var15 > arg0.field4733) {
                    arg0.field4733 += var2.field1438;
                    if (arg0.field4733 > var15) {
                        arg0.field4733 = var15;
                    }
                }
            } else if (arg0.field4733 < var15) {
                arg0.field4733 += var2.field1438;
                if (arg0.field4733 > var15) {
                    arg0.field4733 = var15;
                }
            } else if (arg0.field4733 > 0) {
                arg0.field4733 -= var2.field1438;
                if (arg0.field4733 < 0) {
                    arg0.field4733 = 0;
                }
            }
            var13 = arg0.field4733 >> 7;
            if (var13 < 1) {
                var13 = 1;
            }
        }
        if (var7 < var8) {
            arg0.field4698 += var13;
            if (arg0.field4698 > var8) {
                arg0.field4698 = var8;
            }
        } else if (var8 < var7) {
            arg0.field4698 -= var13;
            if (var8 > arg0.field4698) {
                arg0.field4698 = var8;
            }
        }
        if (var9 > var6) {
            arg0.field4731 += var13;
            if (arg0.field4731 > var9) {
                arg0.field4731 = var9;
            }
        } else if (var6 > var9) {
            arg0.field4731 -= var13;
            if (arg0.field4731 < var9) {
                arg0.field4731 = var9;
            }
        }
        if (arg0.field4698 == var8 && arg0.field4731 == var9) {
            if (arg0.field4695 > 0) {
                arg0.field4695--;
            }
            arg0.field4710--;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILgh;Lgh;IIJ)V", line = 425)
    public static final void method976(int arg0, int arg1, int arg2, int arg3, class248 arg4, class248 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class102 var10 = new class102();
        var10.field1364 = arg8;
        var10.field1363 = arg1 * 128 + 64;
        var10.field1356 = arg2 * 128 + 64;
        var10.field1359 = arg3;
        var10.field1362 = arg4;
        var10.field1365 = arg5;
        var10.field1366 = arg6;
        var10.field1358 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class83.field1138[var11][arg1][arg2] == null) {
                class83.field1138[var11][arg1][arg2] = new class124(var11, arg1, arg2);
            }
        }
        class83.field1138[arg0][arg1][arg2].field1775 = var10;
    }
}
