import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class174 {

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "[I")
    private int[] field3449;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "[B")
    private byte[] field3448;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "[I")
    private int[] field3440;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3446 = 0;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lkb;")
    public static class93 field3447 = class76.method390("<col=ffff00>", 0);

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lkb;")
    public static class93 field3442 = class76.method390(")4slr)3ws?order=LPWM", 0);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lnb;")
    public static class120 field3439 = new class120(20);

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lme;")
    public static class114 field3445;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "[I")
    public static int[] field3450;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1155(int arg0) {
        field3445 = null;
        field3439 = null;
        field3447 = null;
        if (arg0 == -1) {
            field3450 = null;
            field3442 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[B[BII)I")
    public final int method1156(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        if (arg1 != -24842) {
            method1157((byte) -109);
        }
        int var7 = arg0 + arg5;
        field3444++;
        int var8 = 0;
        int var9 = arg4 << 3;
        while (arg5 < var7) {
            int var10 = arg3[arg5] & 0xFF;
            int var11 = this.field3449[var10];
            byte var12 = this.field3448[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var9 >> 3;
            var9 += var12;
            int var15 = var8 & -var13 >> 31;
            int var16 = (var13 + var12 - 1 >> 3) + var14;
            int var17 = var13 + 24;
            arg2[var14] = (byte) (var8 = class112.method607(var15, var11 >>> var17));
            if (var16 > var14) {
                var13 = var17 - 8;
                var14++;
                arg2[var14] = (byte) (var8 = var11 >>> var13);
                if (var14 < var16) {
                    var14++;
                    var13 -= 8;
                    arg2[var14] = (byte) (var8 = var11 >>> var13);
                    if (var16 > var14) {
                        var13 -= 8;
                        var14++;
                        arg2[var14] = (byte) (var8 = var11 >>> var13);
                        if (var16 > var14) {
                            var13 -= 8;
                            var14++;
                            arg2[var14] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static final void method1157(byte arg0) {
        field3441++;
        if (class82.field1515 && class29.field474 != class114.field2145) {
            class104.method576(class106.field1940.field2064[0], class133.field2544, class106.field1940.field2038[0], class98.field1839, class114.field2145, 0);
        } else if (arg0 >= 92 && class25.field374 != class114.field2145) {
            class25.field374 = class114.field2145;
            class137.method860(true, class114.field2145);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII[B[B)I")
    public final int method1158(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field3443++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg1;
        int var8 = 0;
        if (arg2 > -121) {
            return 19;
        }
        int var9 = arg3;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var8 = this.field3440[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field3440[var8]) < 0) {
                arg4[arg1++] = (byte) ~var11;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3440[var8];
            }
            int var12;
            if ((var12 = this.field3440[var8]) < 0) {
                arg4[arg1++] = (byte) ~var12;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3440[var8];
            }
            int var13;
            if ((var13 = this.field3440[var8]) < 0) {
                arg4[arg1++] = (byte) ~var13;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3440[var8];
            }
            int var14;
            if ((var14 = this.field3440[var8]) < 0) {
                arg4[arg1++] = (byte) ~var14;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3440[var8];
            }
            int var15;
            if ((var15 = this.field3440[var8]) < 0) {
                arg4[arg1++] = (byte) ~var15;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3440[var8];
            }
            int var16;
            if ((var16 = this.field3440[var8]) < 0) {
                arg4[arg1++] = (byte) ~var16;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3440[var8];
            }
            int var17;
            if ((var17 = this.field3440[var8]) < 0) {
                arg4[arg1++] = (byte) ~var17;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3440[var8];
            }
            int var18;
            if ((var18 = this.field3440[var8]) < 0) {
                arg4[arg1++] = (byte) ~var18;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([B)V")
    public class174(byte[] arg0) {
        int var2 = arg0.length;
        this.field3449 = new int[var2];
        this.field3448 = arg0;
        this.field3440 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3449[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class112.method607(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field3440[var14] == 0) {
                            this.field3440[var14] = var4;
                        }
                        var14 = this.field3440[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field3440.length) {
                        int[] var18 = new int[this.field3440.length * 2];
                        for (int var19 = 0; var19 < this.field3440.length; var19++) {
                            var18[var19] = this.field3440[var19];
                        }
                        this.field3440 = var18;
                    }
                }
                this.field3440[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
