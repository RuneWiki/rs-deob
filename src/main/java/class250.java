import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class250 {

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "[B")
    private byte[] field3698;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "[I")
    private int[] field3695;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "[I")
    private int[] field3694;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
    public static int field3689 = -1;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public static int field3688 = 0;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "Ljo;")
    public static class353 field3692 = new class353(64);

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
    public static int field3696 = 0;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V")
    public static void method1645(byte arg0) {
        field3692 = null;
        if (arg0 < 32) {
            field3692 = null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IJ)V")
    public static final void method1646(int arg0, long arg1) {
        field3691++;
        int var3 = class574.field8093;
        if (class310.field4429 != var3) {
            int var4 = var3 - class310.field4429;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var5 < var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var5 > var4) {
                var5 = var4;
            }
            class310.field4429 += var5;
        }
        int var6 = class207.field3211;
        class758.field10460 += (float) arg1 * class571.field8063 / 40.0F * 8.0F;
        class642.field8990 += (float) arg1 * class174.field2697 / 40.0F * 8.0F;
        if (class198.field3037 != var6) {
            int var7 = var6 - class198.field3037;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class198.field3037 += var8;
        }
        class588.method3427((byte) 83);
        if (arg0 < 102) {
            field3692 = null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "([BZIII[B)I")
    public final int method1647(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg1) {
            method1645((byte) 65);
        }
        field3693++;
        int var7 = 0;
        int var8 = arg2 + arg4;
        int var9 = arg3 << 3;
        while (arg4 < var8) {
            int var10 = arg5[arg4] & 0xFF;
            int var11 = this.field3695[var10];
            byte var12 = this.field3698[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var7 = class746.method4158(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg0[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg0[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg0[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
    public static final void method1648(int arg0) {
        if (class242.field3617 == null) {
            class242.field3617 = class53.method366((byte) -125);
            class433.field5869 = class242.field3617[0];
            class605.field8463 = class459.method2731(104);
        }
        field3697++;
        if (class590.field8323 == null) {
            class403.method2479(true);
        }
        class53 var1 = class433.field5869;
        int var2 = class694.method3913(true);
        if (arg0 != 636002721) {
            method1645((byte) -80);
        }
        if (class433.field5869 == var1) {
            class47.field596 = class433.field5869.field644.method3580(class140.field2081, 12);
            if (class433.field5869.field639) {
                class663.field9223 = (class433.field5869.field635 - class433.field5869.field637) * var2 / 100 + class433.field5869.field637;
            }
            if (class433.field5869.field642) {
                class47.field596 = class47.field596 + class663.field9223 + "%";
            }
        } else if (class53.field667 == class433.field5869) {
            class590.field8323 = null;
            class225.method1539(false, 3);
        } else {
            class47.field596 = var1.field641.method3580(class140.field2081, 12);
            class663.field9223 = var1.field635;
            if (class433.field5869.field642) {
                class47.field596 = class47.field596 + var1.field635 + "%";
            }
            if (class433.field5869.field639 || var1.field639) {
                class605.field8463 = class459.method2731(117);
            }
        }
        if (class590.field8323 == null) {
            return;
        }
        class590.field8323.method3142(class47.field596, class605.field8463, class663.field9223, 32480, class433.field5869);
        if (class391.field5388 == null) {
            return;
        }
        for (int var3 = class236.field3548 + 1; var3 < class391.field5388.length; var3++) {
            if (class391.field5388[var3].method970(true) >= 100 && (var3 - 1) == class236.field3548 && class266.field3873 >= 1 && class590.field8323.method3135((byte) -92)) {
                try {
                    class391.field5388[var3].method969((byte) 67);
                } catch (Exception var4) {
                    class391.field5388 = null;
                    return;
                }
                class590.field8323.method3133(class391.field5388[var3], true);
                class236.field3548++;
                if (class236.field3548 >= (class391.field5388.length - 1) && class391.field5388.length > 1) {
                    class236.field3548 = class46.field574.method1705((byte) 14) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)V")
    public static final void method1649(int arg0, int arg1) {
        field3701++;
        if (class217.method1490(arg1, -1) && arg0 > 116) {
            class81.method622(-1, class787.field10812[arg1], -1);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/lang/String;BZI)I")
    public static final int method1650(String arg0, byte arg1, boolean arg2, int arg3) {
        field3690++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        if (arg1 != 31) {
            method1646(-88, 24L);
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg3 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II[BII[B)I")
    public final int method1651(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field3699++;
        if (arg0 <= 85) {
            this.method1647(null, true, 115, -89, 106, null);
        }
        if (arg3 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg1 + arg3;
        int var9 = arg4;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var7 = this.field3694[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field3694[var7]) < 0) {
                arg5[arg1++] = (byte) (~var11);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field3694[var7];
            }
            int var12;
            if ((var12 = this.field3694[var7]) < 0) {
                arg5[arg1++] = (byte) (~var12);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field3694[var7];
            }
            int var13;
            if ((var13 = this.field3694[var7]) < 0) {
                arg5[arg1++] = (byte) (~var13);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field3694[var7];
            }
            int var14;
            if ((var14 = this.field3694[var7]) < 0) {
                arg5[arg1++] = (byte) (~var14);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field3694[var7];
            }
            int var15;
            if ((var15 = this.field3694[var7]) < 0) {
                arg5[arg1++] = (byte) (~var15);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field3694[var7];
            }
            int var16;
            if ((var16 = this.field3694[var7]) < 0) {
                arg5[arg1++] = (byte) (~var16);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field3694[var7];
            }
            int var17;
            if ((var17 = this.field3694[var7]) < 0) {
                arg5[arg1++] = (byte) (~var17);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field3694[var7];
            }
            int var18;
            if ((var18 = this.field3694[var7]) < 0) {
                arg5[arg1++] = (byte) (~var18);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 - (arg4 - 1);
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "([B)V")
    public class250(byte[] arg0) {
        int var2 = arg0.length;
        this.field3698 = arg0;
        this.field3695 = new int[var2];
        this.field3694 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3695[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class746.method4158(var12, var11);
                    }
                    var9 = var7 | var8;
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
                        if (this.field3694[var14] == 0) {
                            this.field3694[var14] = var4;
                        }
                        var14 = this.field3694[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field3694.length) {
                        int[] var18 = new int[this.field3694.length * 2];
                        for (int var19 = 0; var19 < this.field3694.length; var19++) {
                            var18[var19] = this.field3694[var19];
                        }
                        this.field3694 = var18;
                    }
                }
                this.field3694[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
