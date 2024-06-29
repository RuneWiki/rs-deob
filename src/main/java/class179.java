import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class179 extends class176 {

    @OriginalMember(owner = "client!k", name = "O", descriptor = "J")
    public static long field2808 = 0L;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "Laf;")
    public static class68 field2819 = new class68(30);

    @OriginalMember(owner = "client!k", name = "db", descriptor = "Z")
    public static boolean field2822 = true;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field2824 = "Created gameworld";

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "B")
    public byte field2817;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "I")
    public int field2816;

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "Log;")
    public class221 field2818;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([I[I[ILwe;I)V")
    public static final void method1215(int[] arg0, int[] arg1, int[] arg2, class15 arg3, int arg4) {
        ++field2814;
        for (int var5 = arg4; ~var5 > ~arg0.length; ++var5) {
            int var6 = arg0[var5];
            int var7 = arg1[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && ~arg3.field3363.length < ~var9; ++var9) {
                if ((1 & var7) != 0) {
                    if (var6 != -1) {
                        class181 var10 = class49.method384(var6, arg4 ^ 110);
                        int var11 = var10.field2847;
                        class47 var12 = arg3.field3363[var9];
                        if (var12 != null) {
                            if (var12.field842 != var6) {
                                if (var10.field2855 >= class49.method384(var12.field842, -98).field2855) {
                                    var12 = arg3.field3363[var9] = null;
                                }
                            } else if (var11 != 0) {
                                if (var11 == 1) {
                                    var12.field841 = 0;
                                    var12.field843 = 0;
                                    var12.field844 = 1;
                                    var12.field845 = 0;
                                    var12.field850 = var8;
                                    class132.method934((byte) 112, var10, arg3.field3389, arg3.field3341, 0, false);
                                } else if (~var11 == -3) {
                                    var12.field841 = 0;
                                }
                            } else {
                                var12 = arg3.field3363[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class47 var13 = arg3.field3363[var9] = new class47();
                            var13.field843 = 0;
                            var13.field845 = 0;
                            var13.field842 = var6;
                            var13.field844 = 1;
                            var13.field850 = var8;
                            var13.field841 = 0;
                            class132.method934((byte) 112, var10, arg3.field3389, arg3.field3341, 0, false);
                        }
                    } else {
                        arg3.field3363[var9] = null;
                    }
                }
                var7 >>>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZI)I")
    public static final int method1216(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg1 / arg0;
        int var5 = arg1 & arg0 + -1;
        ++field2820;
        int var6 = arg3 & arg0 + -1;
        int var7 = arg3 / arg0;
        int var8 = class30.method256(var7, 1, var4);
        int var9 = class30.method256(var7, 1, var4 + 1);
        int var10 = class30.method256(var7 + 1, 1, var4);
        if (arg2) {
            field2819 = null;
        }
        int var11 = class30.method256(var7 + 1, 1, var4 + 1);
        int var12 = class212.method1461(arg0, var9, var5, (byte) 105, var8);
        int var13 = class212.method1461(arg0, var11, var5, (byte) 93, var10);
        return class212.method1461(arg0, var13, var6, (byte) 120, var12);
    }

    @OriginalMember(owner = "client!k", name = "j", descriptor = "(I)V")
    public static final void method1217(int arg0) {
        if (arg0 != 0) {
            field2823 = 126;
        }
        ++field2815;
        class115.field1903.method481(false);
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)I")
    public static final int method1218(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILog;Lj;I)V")
    public static final void method1219(int arg0, class221 arg1, class165 arg2, int arg3) {
        ++field2812;
        class161 var4 = new class161();
        var4.field2564 = arg1.method1517((byte) -96);
        var4.field2573 = arg1.method1526(-16777216);
        var4.field2565 = new int[var4.field2564];
        var4.field2566 = new int[var4.field2564];
        var4.field2571 = new class163[var4.field2564];
        var4.field2567 = new class163[var4.field2564];
        var4.field2570 = new int[var4.field2564];
        var4.field2560 = new byte[var4.field2564][][];
        for (int var5 = 0; var4.field2564 > var5; ++var5) {
            try {
                int var6 = arg1.method1517((byte) -96);
                if (var6 != 0 && ~var6 != -2 && ~var6 != -3) {
                    if (var6 == 3 || ~var6 == -5) {
                        String var10 = arg1.method1539(-109);
                        String var11 = arg1.method1539(-119);
                        int var12 = arg1.method1517((byte) -96);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; var12 > var14; ++var14) {
                            var13[var14] = arg1.method1539(-99);
                        }
                        byte[][] var15 = new byte[var12][];
                        if (~var6 == -4) {
                            for (int var16 = 0; ~var16 > ~var12; ++var16) {
                                int var17 = arg1.method1526(arg0 + -16755045);
                                var15[var16] = new byte[var17];
                                arg1.method1555(18379, var17, 0, var15[var16]);
                            }
                        }
                        var4.field2565[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; ~var12 < ~var19; ++var19) {
                            var18[var19] = class134.method941(var13[var19], 255);
                        }
                        var4.field2567[var5] = arg2.method1134(var11, (byte) -128, class134.method941(var10, 255), var18);
                        var4.field2560[var5] = var15;
                    }
                } else {
                    String var7 = arg1.method1539(arg0 ^ 22253);
                    int var8 = 0;
                    String var9 = arg1.method1539(52);
                    if (var6 == 1) {
                        var8 = arg1.method1526(-16777216);
                    }
                    var4.field2565[var5] = var6;
                    var4.field2570[var5] = var8;
                    var4.field2571[var5] = arg2.method1138((byte) 71, var9, class134.method941(var7, 255));
                }
            } catch (ClassNotFoundException var20) {
                var4.field2566[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2566[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2566[var5] = -3;
            } catch (Exception var23) {
                var4.field2566[var5] = -4;
            } catch (Throwable var24) {
                var4.field2566[var5] = -5;
            }
        }
        if (arg0 != -22171) {
            method1216(77, -51, false, -119);
        }
        class39.field726.method855(false, var4);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Lah;")
    public static final class278 method1220(int arg0, int arg1, int arg2) {
        class134 var3 = class288.field4563[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2143;
    }

    @OriginalMember(owner = "client!k", name = "k", descriptor = "(I)V")
    public static void method1221(int arg0) {
        field2824 = null;
        field2819 = null;
        if (arg0 < 84) {
            field2822 = true;
        }
    }

    @OriginalMember(owner = "client!k", name = "l", descriptor = "(I)V")
    public static final void method1222(int arg0) {
        ++field2807;
        if (arg0 != 15444) {
            field2822 = true;
        }
        if (class253.field4036 != 2) {
            if (~class90.field1487 == ~class248.field3953 && class235.field3829 == class146.field2339) {
                class253.field4036 = 0;
                if (class183.field2869 && class73.field1193[81] && class205.field3291 > 2) {
                    class101.method747(class205.field3291 - 2, true);
                } else {
                    class101.method747(class205.field3291 - 1, true);
                }
            } else {
                class183.field2875 = class235.field3829;
                class253.field4036 = 2;
                class274.field4339 = class248.field3953;
            }
        } else if (~class90.field1487 == ~class274.field4339 && class183.field2875 == class146.field2339) {
            class253.field4036 = 0;
            if (class183.field2869 && class73.field1193[81] && class205.field3291 > 2) {
                class101.method747(class205.field3291 - 2, true);
            } else {
                class101.method747(class205.field3291 - 1, true);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)I")
    public final int method1203(byte arg0) {
        ++field2811;
        if (this.field2818 == null) {
            return 0;
        } else {
            return arg0 > -55 ? 94 : this.field2818.field3655 * 100 / (this.field2818.field3653.length - this.field2817);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)[B")
    public final byte[] method1201(byte arg0) {
        ++field2809;
        if (!super.field2781 && ~(this.field2818.field3653.length + -this.field2817) >= ~this.field2818.field3655) {
            if (arg0 != 8) {
                this.field2817 = 77;
            }
            return this.field2818.field3653;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(JB)V")
    public static final void method1223(long arg0, byte arg1) {
        ++field2810;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 <= 49) {
            method1215((int[]) null, (int[]) null, (int[]) null, (class15) null, 50);
        }
    }
}
