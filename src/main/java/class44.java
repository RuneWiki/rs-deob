import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class44 {

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "[I")
    private int[] field697;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "[B")
    private byte[] field700;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "[I")
    private int[] field694;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Lok;")
    public static class41 field692 = class137.method956("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 45);

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "[I")
    public static int[] field695 = new int[128];

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "[[S")
    public static short[][] field691 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Lmh;")
    public static class65 field693;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)I", line = 6)
    public static final int method322(int arg0, int arg1, int arg2) {
        field699++;
        if (arg2 > -95) {
            return 12;
        }
        int var3 = class210.method1471(1, arg1 + 91923, arg0 + 45365, 4) + (class210.method1471(1, arg1 + 37821, arg0 + 10294, 2) - 128 >> 1) + (class210.method1471(1, arg1, arg0, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 46)
    public static void method323(int arg0) {
        field692 = null;
        if (arg0 == -19963) {
            field695 = null;
            field693 = null;
            field691 = (short[][]) null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([BIIII[B)I", line = 59)
    public final int method324(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field688++;
        if (arg2 == 0) {
            return 0;
        }
        if (arg4 != 1) {
            method322(-24, -128, 68);
        }
        int var7 = arg1 + arg2;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field694[var8];
            }
            int var11;
            if ((var11 = this.field694[var8]) < 0) {
                arg0[arg1++] = (byte) (~var11);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field694[var8];
            }
            int var12;
            if ((var12 = this.field694[var8]) < 0) {
                arg0[arg1++] = (byte) (~var12);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field694[var8];
            }
            int var13;
            if ((var13 = this.field694[var8]) < 0) {
                arg0[arg1++] = (byte) (~var13);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field694[var8];
            }
            int var14;
            if ((var14 = this.field694[var8]) < 0) {
                arg0[arg1++] = (byte) (~var14);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field694[var8];
            }
            int var15;
            if ((var15 = this.field694[var8]) < 0) {
                arg0[arg1++] = (byte) (~var15);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field694[var8];
            }
            int var16;
            if ((var16 = this.field694[var8]) < 0) {
                arg0[arg1++] = (byte) (~var16);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field694[var8];
            }
            int var17;
            if ((var17 = this.field694[var8]) < 0) {
                arg0[arg1++] = (byte) (~var17);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field694[var8];
            }
            int var18;
            if ((var18 = this.field694[var8]) < 0) {
                arg0[arg1++] = (byte) (~var18);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 214)
    public static final void method325(int arg0) {
        field690++;
        Container var1;
        if (class55.field803 != null) {
            var1 = class55.field803;
        } else if (class238.field3817 == null) {
            var1 = class138.field2065.field3390;
        } else {
            var1 = class238.field3817;
        }
        if (arg0 != 0) {
            field695 = (int[]) null;
        }
        class3.field39 = var1.getSize().width;
        class98.field1434 = var1.getSize().height;
        if (class238.field3817 == var1) {
            Insets var2 = class238.field3817.getInsets();
            class98.field1434 -= var2.top + var2.bottom;
            class3.field39 -= var2.right + var2.left;
        }
        if (class33.method228((byte) 112) >= 2) {
            class188.field3055 = class3.field39;
            class60.field871 = 0;
            class144.field2195 = 0;
            class14.field182 = class98.field1434;
        } else {
            class188.field3055 = 765;
            class60.field871 = 0;
            class144.field2195 = (class3.field39 - 765) / 2;
            class14.field182 = 503;
        }
        if (class166.field2625) {
            class166.method1159(class188.field3055, class14.field182);
        }
        class283.field4602.setSize(class188.field3055, class14.field182);
        if (class238.field3817 == var1) {
            Insets var3 = class238.field3817.getInsets();
            class283.field4602.setLocation(class144.field2195 + var3.left, var3.top - -class60.field871);
        } else {
            class283.field4602.setLocation(class144.field2195, class60.field871);
        }
        if (class136.field2015 != -1) {
            class16.method75(false, true);
        }
        class266.method1884(17153);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[BII[BI)I", line = 279)
    public final int method326(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg0 + arg3;
        field701++;
        int var8 = arg5 << 3;
        int var9 = 0;
        int var10 = 71 % ((16 - arg2) / 51);
        while (arg3 < var7) {
            int var11 = arg4[arg3] & 0xFF;
            int var12 = this.field697[var11];
            byte var13 = this.field700[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var8 >> 3;
            int var15 = var8 & 0x7;
            var8 += var13;
            int var16 = (var13 + var15 - 1 >> 3) + var14;
            int var17 = var9 & -var15 >> 31;
            int var18 = var15 + 24;
            arg1[var14] = (byte) (var9 = class255.method1813(var17, var12 >>> var18));
            if (var14 < var16) {
                var15 = var18 - 8;
                var14++;
                arg1[var14] = (byte) (var9 = var12 >>> var15);
                if (var16 > var14) {
                    var14++;
                    var15 -= 8;
                    arg1[var14] = (byte) (var9 = var12 >>> var15);
                    if (var14 < var16) {
                        var14++;
                        var15 -= 8;
                        arg1[var14] = (byte) (var9 = var12 >>> var15);
                        if (var14 < var16) {
                            var15 -= 8;
                            var14++;
                            arg1[var14] = (byte) (var9 = var12 << -var15);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V", line = 350)
    public static final void method327(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class46 var5 = class195.method1396(10, arg1, false);
        field696++;
        var5.method337(0);
        var5.field716 = arg2;
        var5.field721 = arg4;
        if (arg0 == -25077) {
            var5.field719 = arg3;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "([B)V", line = 370)
    public class44(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = 0;
        this.field697 = new int[var2];
        int[] var4 = new int[33];
        this.field700 = arg0;
        this.field694 = new int[8];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field697[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var4[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var4[var9] = var4[var9 - 1];
                            break;
                        }
                        var4[var9] = class255.method1813(var10, var11);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var4[var6 - 1];
                }
                var4[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field694[var14] == 0) {
                            this.field694[var14] = var3;
                        }
                        var14 = this.field694[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field694.length <= var14) {
                        int[] var18 = new int[this.field694.length * 2];
                        for (int var19 = 0; var19 < this.field694.length; var19++) {
                            var18[var19] = this.field694[var19];
                        }
                        this.field694 = var18;
                    }
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field694[var14] = ~var5;
            }
        }
    }
}
