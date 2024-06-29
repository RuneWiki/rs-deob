import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class656 {

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Leda;")
    private class14 field9342 = new class14(64);

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Lla;")
    private class422 field9335;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public int field9337;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "[I")
    public static int[] field9345 = new int[1];

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Loj;")
    public static class208 field9338;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Z")
    public static boolean field9336;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Lgk;")
    public final class178 method3690(int arg0, int arg1) {
        field9341++;
        class14 var3 = this.field9342;
        class178 var4;
        synchronized (this.field9342) {
            var4 = (class178) this.field9342.method80((byte) -101, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field9335;
        byte[] var6;
        synchronized (this.field9335) {
            var6 = this.field9335.method2624(0, 16, arg1);
            int var7 = 12 % ((14 - arg0) / 36);
        }
        class178 var8 = new class178();
        if (var6 != null) {
            var8.method1386(new class301(var6), -30427);
        }
        class14 var9 = this.field9342;
        synchronized (this.field9342) {
            this.field9342.method67((long) arg1, var8, -6772);
            return var8;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method3691(byte arg0) {
        field9338 = null;
        int var1 = 123 / ((arg0 - 62) / 63);
        field9345 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
    public final void method3692(boolean arg0) {
        class14 var2 = this.field9342;
        synchronized (this.field9342) {
            this.field9342.method71((byte) 44);
        }
        field9334++;
        if (arg0) {
            field9338 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)Lcl;")
    public static final class746 method3693(int arg0, int arg1) {
        field9343++;
        if (arg0 != 1) {
            method3691((byte) 96);
        }
        if (arg1 == 0) {
            if ((double) class729.field10218 == 3.0D) {
                return class372.field5641;
            }
            if ((double) class729.field10218 == 4.0D) {
                return class494.field7153;
            }
            if ((double) class729.field10218 == 6.0D) {
                return class256.field4030;
            }
            if ((double) class729.field10218 >= 8.0D) {
                return class370.field5623;
            }
        } else if (arg1 == 1) {
            if ((double) class729.field10218 == 3.0D) {
                return class256.field4030;
            }
            if ((double) class729.field10218 == 4.0D) {
                return class370.field5623;
            }
            if ((double) class729.field10218 == 6.0D) {
                return class611.field8608;
            }
            if ((double) class729.field10218 >= 8.0D) {
                return class275.field4205;
            }
        } else if (arg1 == 2) {
            if ((double) class729.field10218 == 3.0D) {
                return class611.field8608;
            }
            if ((double) class729.field10218 == 4.0D) {
                return class275.field4205;
            }
            if ((double) class729.field10218 == 6.0D) {
                return class86.field1271;
            }
            if ((double) class729.field10218 >= 8.0D) {
                return class398.field5923;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIBLeu;I)V")
    public static final void method3694(int arg0, int arg1, int arg2, byte arg3, class447 arg4, int arg5) {
        field9344++;
        if (arg4.field6515 == -1 && arg4.field6505 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg4.field6522 * class654.field9289.field5435.method155(arg3 - 10) >> 8;
        if (arg4.field6503 < arg5) {
            var6 += arg5 - arg4.field6503;
        } else if (arg5 < arg4.field6511) {
            var6 += arg4.field6511 - arg5;
        }
        if (arg0 > arg4.field6504) {
            var6 += arg0 - arg4.field6504;
        } else if (arg0 < arg4.field6502) {
            var6 += arg4.field6502 - arg0;
        }
        if (arg4.field6510 == 0 || var6 - 256 > arg4.field6510 || class654.field9289.field5435.method155(3) == 0 || arg4.field6523 != arg1) {
            if (arg4.field6518 != null) {
                class324.field4793.method2223(arg4.field6518);
                arg4.field6521 = null;
                arg4.field6518 = null;
                arg4.field6508 = null;
            }
            if (arg4.field6509 != null) {
                class324.field4793.method2223(arg4.field6509);
                arg4.field6514 = null;
                arg4.field6506 = null;
                arg4.field6509 = null;
            }
            return;
        }
        var6 -= 256;
        if (arg3 != 13) {
            return;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg4.field6510 - var6) * var7 / arg4.field6510;
        class145.field2251.method878(-5740);
        int var9 = 8192;
        int var10 = (arg4.field6511 + arg4.field6503) / 2 - arg5;
        int var11 = (arg4.field6504 + arg4.field6502) / 2 - arg0;
        if (var10 != 0 || var11 != 0) {
            int var12 = -class608.field8587 - ((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) + 4096) & 0x3FFF;
            if (var12 > 8192) {
                var12 = 16384 - var12;
            }
            int var13;
            if (var6 <= 0) {
                var13 = 8192;
            } else if (var6 >= 4096) {
                var13 = 16384;
            } else {
                var13 = var6 * 8192 / 4096 + 8192;
            }
            var9 = (16384 - var13 >> 1) + var12 * var13 / 8192;
        }
        if (arg4.field6518 != null) {
            arg4.field6518.method537(var8);
            arg4.field6518.method555(var9);
        } else if (arg4.field6515 >= 0) {
            int var14 = arg4.field6501 == 256 && arg4.field6517 == 256 ? 256 : class131.method1061(arg4.field6517, 2, arg4.field6501);
            if (arg4.field6525) {
                if (arg4.field6521 == null) {
                    arg4.field6521 = class61.method609(class518.field7495, arg4.field6515);
                }
                if (arg4.field6521 != null) {
                    if (arg4.field6508 == null) {
                        arg4.field6508 = arg4.field6521.method599(new int[] { 22050 });
                    }
                    if (arg4.field6508 != null) {
                        class57 var15 = class57.method556(arg4.field6508, var14, var8 << 6, var9);
                        var15.method536(-1);
                        class324.field4793.method2226(var15);
                        arg4.field6518 = var15;
                    }
                }
            } else {
                class667 var16 = class667.method3738(class431.field6296, arg4.field6515, 0);
                if (var16 != null) {
                    class538 var17 = var16.method3737().method3159(class703.field9941);
                    class57 var18 = class57.method556(var17, var14, var8 << 6, var9);
                    var18.method536(-1);
                    class324.field4793.method2226(var18);
                    arg4.field6518 = var18;
                }
            }
        }
        if (arg4.field6509 != null) {
            arg4.field6509.method537(var8);
            arg4.field6509.method555(var9);
            if (!arg4.field6509.method637((byte) 115)) {
                arg4.field6509 = null;
                arg4.field6514 = null;
                arg4.field6506 = null;
            }
        } else if (arg4.field6505 != null && (arg4.field6512 -= arg2) <= 0) {
            int var19 = arg4.field6501 == 256 && arg4.field6517 == 256 ? 256 : (int) ((double) (arg4.field6501 - arg4.field6517) * Math.random()) + arg4.field6517;
            if (arg4.field6529) {
                if (arg4.field6506 == null) {
                    int var20 = (int) ((double) arg4.field6505.length * Math.random());
                    arg4.field6506 = class61.method609(class518.field7495, arg4.field6505[var20]);
                }
                if (arg4.field6506 != null) {
                    if (arg4.field6514 == null) {
                        arg4.field6514 = arg4.field6506.method599(new int[] { 22050 });
                    }
                    if (arg4.field6514 != null) {
                        class57 var21 = class57.method556(arg4.field6514, var19, var8 << 6, var9);
                        var21.method536(0);
                        class324.field4793.method2226(var21);
                        arg4.field6509 = var21;
                        arg4.field6512 = (int) (Math.random() * (double) (arg4.field6526 - arg4.field6528)) + arg4.field6528;
                        return;
                    }
                }
                return;
            }
            int var22 = (int) (Math.random() * (double) arg4.field6505.length);
            class667 var23 = class667.method3738(class431.field6296, arg4.field6505[var22], 0);
            if (var23 != null) {
                class538 var24 = var23.method3737().method3159(class703.field9941);
                class57 var25 = class57.method556(var24, var19, var8 << 6, var9);
                var25.method536(0);
                class324.field4793.method2226(var25);
                arg4.field6512 = (int) ((double) (arg4.field6526 - arg4.field6528) * Math.random()) + arg4.field6528;
                arg4.field6509 = var25;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)V")
    public final void method3695(byte arg0, int arg1) {
        if (arg0 <= 117) {
            return;
        }
        field9333++;
        class14 var3 = this.field9342;
        synchronized (this.field9342) {
            this.field9342.method68(-16878, arg1);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public final void method3696(int arg0) {
        if (arg0 != 0) {
            this.method3692(false);
        }
        field9340++;
        class14 var2 = this.field9342;
        synchronized (this.field9342) {
            this.field9342.method76(-98);
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lcr;ILla;)V")
    public class656(class292 arg0, int arg1, class422 arg2) {
        this.field9335 = arg2;
        if (this.field9335 == null) {
            this.field9337 = 0;
        } else {
            this.field9337 = this.field9335.method2615(0, 16);
        }
    }
}
