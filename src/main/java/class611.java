import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class611 extends class4 {

    @OriginalMember(owner = "client!qr", name = "I", descriptor = "I")
    private int field8781 = 0;

    @OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
    private int field8784 = 2048;

    @OriginalMember(owner = "client!qr", name = "S", descriptor = "I")
    private int field8790 = 10;

    @OriginalMember(owner = "client!qr", name = "F", descriptor = "Lvt;")
    public static class344 field8778 = new class344("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!qr", name = "E", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!qr", name = "G", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!qr", name = "K", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!qr", name = "L", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!qr", name = "N", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!qr", name = "O", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!qr", name = "P", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!qr", name = "Q", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!qr", name = "U", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!qr", name = "V", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!qr", name = "R", descriptor = "[I")
    private int[] field8789;

    @OriginalMember(owner = "client!qr", name = "T", descriptor = "[I")
    private int[] field8791;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Z")
    public static final boolean method3489(int arg0, int arg1) {
        ++field8779;
        if (arg0 != 65535) {
            return true;
        } else {
            return arg1 == 3 || arg1 == 7 || ~arg1 == -11;
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)Z")
    public static final boolean method3490(int arg0, int arg1) {
        if (arg0 >= -24) {
            field8778 = null;
        }
        ++field8786;
        return ~arg1 == -3 || ~arg1 == -5 || arg1 == 5;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILjava/lang/String;JZ)V")
    public static final void method3491(int arg0, String arg1, long arg2, boolean arg3) {
        ++field8785;
        if (arg3) {
            class154.method834(-125);
            if (class284.field3703.equals("")) {
                class192.field2503 = 39;
                return;
            }
        }
        if (arg0 >= 112) {
            class551 var5 = new class551(576);
            var5.method3060(10, -25098);
            var5.method3042((int) (65535.0D * Math.random()), -110);
            var5.method3049(false, arg2);
            var5.method3042(arg3 ? class58.field787 : class24.field428, -122);
            var5.method3071(-86, (int) (Math.random() * 9.9999999E7D));
            var5.method3040(false, arg1);
            var5.method3071(-59, (int) (Math.random() * 9.9999999E7D));
            if (!arg3) {
                var5.method3071(-127, (int) (9.9999999E7D * Math.random()));
                var5.method3071(-83, (int) (9.9999999E7D * Math.random()));
                var5.method3071(-100, (int) (Math.random() * 9.9999999E7D));
                var5.method3071(-70, (int) (9.9999999E7D * Math.random()));
            } else {
                var5.method3049(false, class30.method181(68, class284.field3703));
                try {
                    var5.method3049(false, Long.parseLong(class405.field5567));
                } catch (Exception var6) {
                    class192.field2503 = 39;
                    return;
                }
            }
            var5.method3071(-124, (int) (Math.random() * 9.9999999E7D));
            var5.method3056(class1.field2, class388.field5389, (byte) 120);
            class272.field3457.field7707 = 0;
            class272.field3457.method3060(!arg3 ? class17.field192.field3141 : class17.field195.field3141, -25098);
            class272.field3457.method3042(var5.field7707 + 28, 122);
            class272.field3457.method3042(610, 119);
            class272.field3457.method3060(class245.field3103, -25098);
            class272.field3457.method3060(class26.field453.field7138, -25098);
            class377.method2302(16353, class272.field3457);
            class272.field3457.method3063(var5.field7693, 957, 0, var5.field7707);
            class192.field2503 = -3;
            class250.field3136 = 0;
            class245.field3098 = 1;
            class552.field7731 = 0;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
    private final void method3492(boolean arg0) {
        ++field8793;
        if (!arg0) {
            this.method15((byte) -81, 43);
        }
        this.field8791 = new int[this.field8790 + 1];
        this.field8789 = new int[this.field8790 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field8790;
        int var4 = this.field8784 * var3 >> 12;
        for (int var5 = 0; this.field8790 > var5; ++var5) {
            this.field8791[var5] = var2;
            this.field8789[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field8791[this.field8790] = 4096;
        this.field8789[this.field8790] = this.field8789[0] + 4096;
    }

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "(I)V")
    public static void method3493(int arg0) {
        if (arg0 != 0) {
            field8778 = null;
        }
        field8778 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lkg;IIIII)V")
    public static final void method3494(class57 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field759 = 0;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (arg0.field756[var6] != null) {
                ++arg0.field759;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field759; ++var7) {
            long var8 = class238.field3050[arg1][arg2][arg3];
            while (var8 != 0L) {
                class597 var14 = class256.field3175[(int) ((var8 & 65535L) - 1L)];
                var8 >>>= 16;
                if (arg0.field756[var7] == var14.field8621) {
                    continue label50;
                }
            }
            long var10 = class238.field3050[arg1][arg4][arg5];
            while (var10 != 0L) {
                class597 var13 = class256.field3175[(int) ((var10 & 65535L) - 1L)];
                var10 >>>= 16;
                if (arg0.field756[var7] == var13.field8621) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field759 - 1; ++var12) {
                arg0.field756[var12] = arg0.field756[var12 + 1];
            }
            --arg0.field759;
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(III)Z")
    public static final boolean method3495(int arg0, int arg1, int arg2) {
        if (arg2 != 4090) {
            field8778 = null;
        }
        ++field8792;
        return (class310.method1870(arg2 + -4027, arg0, arg1) | class385.method2332(arg0, arg1, (byte) -115) | class629.method3642(arg1, -857, arg0)) & class63.method369(arg0, arg1, (byte) 119);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field8783;
        if (arg0 != 10) {
            return null;
        } else {
            int[] var3 = super.field31.method2252(arg1, arg0 + 1);
            if (super.field31.field5127) {
                int var4 = class130.field1606[arg1];
                if (~this.field8781 != -1) {
                    for (int var5 = 0; ~class132.field1627 < ~var5; ++var5) {
                        int var6 = 0;
                        short var7 = 0;
                        int var8 = class66.field881[var5];
                        int var9 = this.field8781;
                        if (var9 != 1) {
                            if (~var9 != -3) {
                                if (~var9 == -4) {
                                    var6 = (-var4 + var8 >> 1) + 2048;
                                }
                            } else {
                                var6 = (var8 + -4096 + var4 >> 1) + 2048;
                            }
                        } else {
                            var6 = var8;
                        }
                        for (int var10 = 0; ~var10 > ~this.field8790; ++var10) {
                            if (var6 >= this.field8791[var10] && ~var6 > ~this.field8791[var10 + 1]) {
                                if (this.field8789[var10] > var6) {
                                    var7 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var7;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; ~this.field8790 < ~var12; ++var12) {
                        if (~var4 <= ~this.field8791[var12] && ~this.field8791[var12 + 1] < ~var4) {
                            if (this.field8789[var12] > var4) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class205.method1315(var3, 0, class132.field1627, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
    public class611() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(IB)Lws;")
    public static final class532 method3496(int arg0, byte arg1) {
        ++field8782;
        class532 var2 = (class532) class356.field4983.method2995(791, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 > -46) {
            return null;
        } else {
            byte[] var3 = class29.field466.method2054(true, arg0, 0);
            if (var3 != null && var3.length > 1) {
                class532 var4 = class604.method3465(var3, 127);
                class356.field4983.method2993(0, var4, (long) arg0);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IJ)V")
    public static final void method3497(int arg0, long arg1) {
        if (class199.field2605 != null) {
            if (~class621.field8952 != -2 && ~class621.field8952 != -6) {
                if (class621.field8952 == 4) {
                    class186.method1132(arg1, (byte) -102);
                }
            } else {
                class536.method2982(arg1, 1);
            }
        }
        ++field8780;
        class29.method175(-23, class301.field3918, (long) class7.field61);
        if (class126.field1565 != -1) {
            class324.method2009((byte) 36, class126.field1565);
        }
        for (int var3 = 0; ~var3 > ~class161.field2051; ++var3) {
            if (class99.field1326[var3]) {
                class584.field8455[var3] = true;
            }
            class202.field2644[var3] = class99.field1326[var3];
            class99.field1326[var3] = false;
        }
        class592.field8557 = class7.field61;
        if (class301.field3918.method195()) {
            class60.field829 = true;
        }
        if (~class126.field1565 != 0) {
            class161.field2051 = 0;
            class207.method1321((byte) 2);
        }
        class301.field3918.method962();
        class115.method614(class301.field3918, -123);
        int var4 = class406.method2423(-10665);
        if (~var4 == 0) {
            var4 = class48.field659;
        }
        int var5 = -24 % ((15 - arg0) / 54);
        if (var4 == -1) {
            var4 = class646.field9349;
        }
        class211.method1344(48, var4);
        class407.method2431(class147.field1899.field6368, class153.field1999, class147.field1899.field6362, class147.field1899.field6358, 2);
        class153.field1999 = 0;
    }

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        ++field8787;
        if (arg0 == -9) {
            this.method3492(true);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field8777;
        if (arg0 > -89) {
            field8788 = 67;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field8781 = arg1.method3045(-126);
                }
            } else {
                this.field8784 = arg1.method3090(-73);
            }
        } else {
            this.field8790 = arg1.method3045(-127);
        }
    }
}
