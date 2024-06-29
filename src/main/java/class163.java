import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class163 {

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "[I")
    private int[] field2543;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "[B")
    private byte[] field2541;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "[I")
    private int[] field2533;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Ldl;")
    public static class123 field2536;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)Lae;")
    public static final class170 method1117(byte arg0, int arg1) {
        field2542++;
        class170 var2 = (class170) class67.field931.method1428((long) arg1, (byte) -127);
        if (var2 != null) {
            return var2;
        }
        int var3 = -97 / ((arg0 - 30) / 37);
        byte[] var4 = class153.field2269.method807((byte) 104, class231.method1582(arg1, 117), class139.method934(76, arg1));
        class170 var5 = new class170();
        if (var4 != null) {
            var5.method1187(new class25(var4), 28718);
        }
        class67.field931.method1424((long) arg1, var5, -2003648287);
        return var5;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZIIII)V")
    public static final void method1118(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2540++;
        class13.field165.field349 = 0;
        class13.field165.method184(20, 110);
        class13.field165.method184(arg1, 117);
        class13.field165.method184(arg3, 98);
        class13.field165.method223(-1720191288, arg4);
        class13.field165.method223(-1720191288, arg2);
        class173.field2723 = -3;
        if (!arg0) {
            field2534 = 32;
        }
        class216.field3537 = 0;
        class44.field568 = 0;
        class181.field2806 = 1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[B[BIII)I")
    public final int method1119(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field2535++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg3 + arg5;
        int var8 = 0;
        int var9 = arg0;
        if (arg4 < 0) {
            this.field2533 = null;
        }
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field2543[var8];
            }
            int var11;
            if ((var11 = this.field2543[var8]) < 0) {
                arg1[arg3++] = (byte) (~var11);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2543[var8];
            }
            int var12;
            if ((var12 = this.field2543[var8]) < 0) {
                arg1[arg3++] = (byte) (~var12);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2543[var8];
            }
            int var13;
            if ((var13 = this.field2543[var8]) < 0) {
                arg1[arg3++] = (byte) (~var13);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2543[var8];
            }
            int var14;
            if ((var14 = this.field2543[var8]) < 0) {
                arg1[arg3++] = (byte) (~var14);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2543[var8];
            }
            int var15;
            if ((var15 = this.field2543[var8]) < 0) {
                arg1[arg3++] = (byte) (~var15);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2543[var8];
            }
            int var16;
            if ((var16 = this.field2543[var8]) < 0) {
                arg1[arg3++] = (byte) (~var16);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2543[var8];
            }
            int var17;
            if ((var17 = this.field2543[var8]) < 0) {
                arg1[arg3++] = (byte) (~var17);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2543[var8];
            }
            int var18;
            if ((var18 = this.field2543[var8]) < 0) {
                arg1[arg3++] = (byte) (~var18);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
    public static final void method1120(int arg0, int arg1) {
        field2537++;
        class23.field287.method1425(arg0, -126);
        int var2 = 96 / ((-arg1 - 54) / 36);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[BIII[B)I")
    public final int method1121(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        int var7 = arg3 + arg4;
        field2538++;
        int var8 = 0;
        int var9 = arg0 << 3;
        if (arg2 != 1) {
            field2534 = -44;
        }
        while (arg3 < var7) {
            int var10 = arg1[arg3] & 0xFF;
            int var11 = this.field2533[var10];
            byte var12 = this.field2541[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = (var14 + var12 - 1 >> 3) + var13;
            var9 += var12;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var8 = class120.method787(var16, var11 >>> var17));
            if (var15 > var13) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var14 -= 8;
                    var13++;
                    arg5[var13] = (byte) (var8 = var11 >>> var14);
                    if (var15 > var13) {
                        var13++;
                        var14 -= 8;
                        arg5[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var15) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method1122(byte arg0) {
        field2536 = null;
        if (arg0 >= -117) {
            method1122((byte) 37);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static final void method1123(byte arg0) {
        field2532++;
        if (!class45.field572) {
            return;
        }
        class214 var1 = class136.method918(class50.field668, -21154, class154.field2296);
        int var2 = -116 / ((23 - arg0) / 40);
        if (var1 != null && var1.field3333 != null) {
            class142 var3 = new class142();
            var3.field2079 = var1;
            var3.field2086 = var1.field3333;
            class202.method1390(var3, (byte) 101);
        }
        class191.field3019 = -1;
        class45.field572 = false;
        class55.method397(0, var1);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V")
    public static final void method1124(int arg0, int arg1) {
        field2539++;
        class287 var2 = class261.method1786(arg0, false, 10);
        if (arg1 >= 39) {
            var2.method1912((byte) -70);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([B)V")
    public class163(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = 0;
        int var4 = arg0.length;
        this.field2543 = new int[8];
        this.field2541 = arg0;
        this.field2533 = new int[var4];
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field2533[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class120.method787(var11, var12);
                    }
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2543[var14] == 0) {
                            this.field2543[var14] = var3;
                        }
                        var14 = this.field2543[var14];
                    }
                    if (this.field2543.length <= var14) {
                        int[] var17 = new int[this.field2543.length * 2];
                        for (int var18 = 0; var18 < this.field2543.length; var18++) {
                            var17[var18] = this.field2543[var18];
                        }
                        this.field2543 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field2543[var14] = ~var5;
            }
        }
    }
}
