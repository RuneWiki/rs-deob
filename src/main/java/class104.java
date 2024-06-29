import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class104 {

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[I")
    private int[] field1400;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "[I")
    private int[] field1398;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[B")
    private byte[] field1399;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lte;")
    public static class244 field1395 = new class244(64);

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "[Lpk;")
    public static class70[] field1405 = new class70[6];

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lte;")
    public static class244 field1401 = new class244(4);

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field1406 = 0;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[BII[BI)I")
    public final int method628(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = 0;
        int var8 = arg2 + arg3;
        if (arg5 != 8) {
            this.method628(97, (byte[]) null, -17, 46, (byte[]) null, 22);
        }
        int var9 = arg0 << 3;
        field1403++;
        while (arg3 < var8) {
            int var10 = arg4[arg3] & 0xFF;
            int var11 = this.field1400[var10];
            byte var12 = this.field1399[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            var9 += var12;
            int var16 = (var14 - (1 - var12) >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class154.method1048(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[BI[BII)I")
    public final int method629(byte arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field1402++;
        if (arg0 < 59) {
            this.method628(-14, (byte[]) null, 6, -82, (byte[]) null, -89);
        }
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg2 + arg5;
        int var8 = 0;
        int var9 = arg4;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1398[var8];
            }
            int var11;
            if ((var11 = this.field1398[var8]) < 0) {
                arg3[arg2++] = (byte) (~var11);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1398[var8];
            }
            int var12;
            if ((var12 = this.field1398[var8]) < 0) {
                arg3[arg2++] = (byte) (~var12);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1398[var8];
            }
            int var13;
            if ((var13 = this.field1398[var8]) < 0) {
                arg3[arg2++] = (byte) (~var13);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1398[var8];
            }
            int var14;
            if ((var14 = this.field1398[var8]) < 0) {
                arg3[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1398[var8];
            }
            int var15;
            if ((var15 = this.field1398[var8]) < 0) {
                arg3[arg2++] = (byte) (~var15);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1398[var8];
            }
            int var16;
            if ((var16 = this.field1398[var8]) < 0) {
                arg3[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1398[var8];
            }
            int var17;
            if ((var17 = this.field1398[var8]) < 0) {
                arg3[arg2++] = (byte) (~var17);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1398[var8];
            }
            int var18;
            if ((var18 = this.field1398[var8]) < 0) {
                arg3[arg2++] = (byte) (~var18);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static final void method630(byte arg0) {
        class126.field2027 = 0;
        field1404++;
        class234.field3876 = 0;
        class206.method1454((byte) 37);
        class255.method1747((byte) 111);
        class108.method659(true);
        class123.method812(false);
        if (arg0 != 13) {
            return;
        }
        for (int var1 = 0; var1 < class234.field3876; var1++) {
            int var3 = class265.field4274[var1];
            if (class73.field924 != class89.field1113[var3].field3797) {
                if (class89.field1113[var3].field4194 > 0) {
                    class171.method1170(class89.field1113[var3], arg0 ^ 0xFFFFFFF2);
                }
                class89.field1113[var3] = null;
            }
        }
        if (class219.field3508 != class96.field1283.field1228) {
            throw new RuntimeException("gpp1 pos:" + class96.field1283.field1228 + " psize:" + class219.field3508);
        }
        for (int var2 = 0; var2 < class77.field970; var2++) {
            if (class89.field1113[class27.field385[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class77.field970);
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static final void method631(int arg0) {
        class276.field4408 = arg0;
        for (int var1 = 0; var1 < class88.field1076; var1++) {
            for (int var2 = 0; var2 < class59.field752; var2++) {
                if (class46.field585[arg0][var1][var2] == null) {
                    class46.field585[arg0][var1][var2] = new class246(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
    public static final int method632(int arg0, int arg1, int arg2) {
        field1396++;
        class54 var3 = (class54) class39.field483.method708((long) arg1, -28);
        if (var3 == null) {
            return 0;
        }
        int var4 = -65 / ((59 - arg2) / 58);
        if (arg0 == -1) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var3.field694.length; var6++) {
            if (var3.field689[var6] == arg0) {
                var5 += var3.field694[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZIIIIIIIII)V")
    public static final void method633(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1397++;
        class220 var10 = (class220) class24.field339.method1802(43);
        class220 var11 = null;
        while (var10 != null) {
            if (var10.field3527 == arg4 && var10.field3517 == arg1 && var10.field3523 == arg5 && var10.field3519 == arg7) {
                var11 = var10;
                break;
            }
            var10 = (class220) class24.field339.method1815(0);
        }
        if (var11 == null) {
            var11 = new class220();
            var11.field3519 = arg7;
            var11.field3527 = arg4;
            var11.field3523 = arg5;
            var11.field3517 = arg1;
            class36.method191(var11, (byte) -89);
            class24.field339.method1803(var11, -1);
        }
        var11.field3530 = arg2;
        var11.field3522 = arg3;
        var11.field3516 = arg8;
        var11.field3520 = arg9;
        if (arg0) {
            var11.field3515 = arg6;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public static void method634(byte arg0) {
        field1401 = null;
        if (arg0 >= -49) {
            method634((byte) 85);
        }
        field1395 = null;
        field1405 = null;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
    public class104(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field1400 = new int[var3];
        this.field1398 = new int[8];
        this.field1399 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field1400[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var2[var10] = class154.method1048(var11, var12);
                    }
                    var9 = var7 | var8;
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
                        if (this.field1398[var14] == 0) {
                            this.field1398[var14] = var4;
                        }
                        var14 = this.field1398[var14];
                    }
                    if (var14 >= this.field1398.length) {
                        int[] var17 = new int[this.field1398.length * 2];
                        for (int var18 = 0; var18 < this.field1398.length; var18++) {
                            var17[var18] = this.field1398[var18];
                        }
                        this.field1398 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field1398[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
