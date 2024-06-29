import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class35 {

    @OriginalMember(owner = "client!on", name = "g", descriptor = "[I")
    private int[] field474;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "[B")
    private byte[] field470;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "[I")
    private int[] field473;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "Lhc;")
    public static class368 field477 = new class368("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!on", name = "k", descriptor = "[[S")
    public static short[][] field478 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!on", name = "l", descriptor = "Z")
    public static boolean field479 = false;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[B[BIII)I", line = 6)
    public final int method313(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field476++;
        if (arg0 == arg4) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg3;
        int var9 = arg5;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field473[var7];
            }
            int var11;
            if ((var11 = this.field473[var7]) < 0) {
                arg2[arg3++] = (byte) (~var11);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field473[var7];
            }
            int var12;
            if ((var12 = this.field473[var7]) < 0) {
                arg2[arg3++] = (byte) (~var12);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field473[var7];
            }
            int var13;
            if ((var13 = this.field473[var7]) < 0) {
                arg2[arg3++] = (byte) (~var13);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field473[var7];
            }
            int var14;
            if ((var14 = this.field473[var7]) < 0) {
                arg2[arg3++] = (byte) (~var14);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field473[var7];
            }
            int var15;
            if ((var15 = this.field473[var7]) < 0) {
                arg2[arg3++] = (byte) (~var15);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field473[var7];
            }
            int var16;
            if ((var16 = this.field473[var7]) < 0) {
                arg2[arg3++] = (byte) (~var16);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field473[var7];
            }
            int var17;
            if ((var17 = this.field473[var7]) < 0) {
                arg2[arg3++] = (byte) (~var17);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field473[var7];
            }
            int var18;
            if ((var18 = this.field473[var7]) < 0) {
                arg2[arg3++] = (byte) (~var18);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 - (arg5 - 1);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lof;B)V", line = 150)
    public static final void method314(class423 arg0, byte arg1) {
        field469++;
        if (arg1 >= -89) {
            return;
        }
        class328 var2 = (class328) class156.field2220.method837((byte) -72, (long) arg0.field2622);
        if (var2 == null) {
            class48.method392((class447) null, -6024, 0, arg0.field2659[0], arg0, (class419) null, arg0.field2662[0], class343.field4623);
        } else {
            var2.method2000(false);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V", line = 173)
    public static void method315(byte arg0) {
        field477 = null;
        if (arg0 != -127) {
            method315((byte) 39);
        }
        field478 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZLof;)V", line = 184)
    public static final void method316(boolean arg0, class423 arg1) {
        if (arg0) {
            return;
        }
        field468++;
        class328 var2 = (class328) class156.field2220.method837((byte) -72, (long) arg1.field2622);
        if (var2 == null) {
            return;
        }
        if (var2.field4452 != null) {
            class48.field616.method1128(var2.field4452);
            var2.field4452 = null;
        }
        var2.method1884(false);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[BI[BII)I", line = 211)
    public final int method317(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field471++;
        int var7 = 0;
        int var8 = arg4 << 3;
        int var9 = arg2 + arg5;
        while (var9 > arg2) {
            int var10 = arg3[arg2] & 0xFF;
            int var11 = this.field474[var10];
            byte var12 = this.field470[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            var8 += var12;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class431.method2655(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        if (arg0 != 1) {
            method314((class423) null, (byte) 121);
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lvi;Lvi;Z)V", line = 283)
    public static final void method318(class311 arg0, class311 arg1, boolean arg2) {
        if (arg1.field4225 != null) {
            arg1.method1884(!arg2);
        }
        field475++;
        arg1.field4223 = arg0;
        if (arg2) {
            arg1.field4225 = arg0.field4225;
            arg1.field4225.field4223 = arg1;
            arg1.field4223.field4225 = arg1;
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "([B)V", line = 305)
    public class35(byte[] arg0) {
        int var2 = arg0.length;
        this.field474 = new int[var2];
        this.field470 = arg0;
        this.field473 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field474[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class431.method2655(var10, var11);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field473[var14] == 0) {
                            this.field473[var14] = var4;
                        }
                        var14 = this.field473[var14];
                    }
                    if (var14 >= this.field473.length) {
                        int[] var17 = new int[this.field473.length * 2];
                        for (int var18 = 0; var18 < this.field473.length; var18++) {
                            var17[var18] = this.field473[var18];
                        }
                        this.field473 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field473[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
