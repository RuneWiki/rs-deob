import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class185 extends class40 {

    @OriginalMember(owner = "client!on", name = "N", descriptor = "I")
    private int field2639 = 0;

    @OriginalMember(owner = "client!on", name = "O", descriptor = "I")
    private int field2640 = 0;

    @OriginalMember(owner = "client!on", name = "T", descriptor = "I")
    private int field2645 = 20;

    @OriginalMember(owner = "client!on", name = "V", descriptor = "I")
    private int field2647 = 1365;

    @OriginalMember(owner = "client!on", name = "W", descriptor = "I")
    public static int field2648 = 1;

    @OriginalMember(owner = "client!on", name = "S", descriptor = "Lpm;")
    public static class349 field2644 = new class349(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!on", name = "X", descriptor = "Lpm;")
    public static class349 field2649 = new class349("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!on", name = "K", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!on", name = "L", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!on", name = "M", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!on", name = "P", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!on", name = "Q", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!on", name = "R", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!on", name = "U", descriptor = "I")
    public static int field2646;

    // $FF: synthetic field
    @OriginalMember(owner = "client!on", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field2651;

    @OriginalMember(owner = "client!on", name = "Y", descriptor = "[I")
    public static int[] field2650;

    // $FF: synthetic method
    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1331(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BLpn;)I", line = 9)
    public static final int method1325(byte arg0, class446 arg1) {
        ++field2638;
        if (arg0 >= -63) {
            return 76;
        } else {
            class346 var2 = arg1.field6375;
            if (var2.field5023 != null) {
                var2 = var2.method2273(-1);
                if (var2 == null) {
                    return -1;
                }
            }
            int var3 = var2.field5004;
            class3 var4 = arg1.method2093(-1498200479);
            if (arg1.field4513) {
                var3 = var2.field5046;
            } else if (~arg1.field4537 != ~var4.field23 && arg1.field4537 != var4.field31 && ~arg1.field4537 != ~var4.field33 && ~arg1.field4537 != ~var4.field51) {
                if (~arg1.field4537 == ~var4.field59 || arg1.field4537 == var4.field44 || ~arg1.field4537 == ~var4.field18 || arg1.field4537 == var4.field66) {
                    var3 = var2.field5001;
                }
            } else {
                var3 = var2.field5012;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!on", name = "h", descriptor = "(B)V", line = 50)
    public static void method1326(byte arg0) {
        int var1 = 43 / ((-60 - arg0) / 59);
        field2649 = null;
        field2644 = null;
        field2650 = null;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V", line = 530)
    public class185() {
        super(0, true);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BI)[I", line = 67)
    public final int[] method44(byte arg0, int arg1) {
        ++field2646;
        if (arg0 > -20) {
            method1325((byte) 9, (class446) null);
        }
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            for (int var4 = 0; var4 < class410.field5886; ++var4) {
                int var5 = (class9.field124[var4] << 12) / this.field2647 + this.field2640;
                int var6 = (class86.field1123[arg1] << 12) / this.field2647 + this.field2639;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 - -var12 < 16384 && var13 < this.field2645) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var12 + var11 + var7;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~(this.field2645 - 1) < ~var13 ? (var13 << 12) / this.field2645 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!on", name = "i", descriptor = "(B)V", line = 124)
    public static final void method1327(byte arg0) {
        if (class199.field2847 != null) {
            class199.field2847.method1093(false);
            class199.field2847 = null;
        }
        ++field2641;
        class166.method1198(-22156);
        class204.method1430();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class85.field1090[var1].method277(true);
        }
        class431.method2693(false, -1);
        System.gc();
        class182.method1302(2, true);
        class96.field1223 = false;
        class30.field367 = -1;
        class331.method2173(-86, true);
        class171.field2415 = 0;
        class342.field4959 = 0;
        class306.field4459 = 0;
        class241.field3551 = false;
        class327.field4741 = 0;
        for (int var2 = 0; ~var2 > ~class209.field2990.length; ++var2) {
            class209.field2990[var2] = null;
        }
        class229.field3396 = 0;
        class334.field4847 = 0;
        if (arg0 != 64) {
            method1330((byte) -3, -2);
        }
        for (int var3 = 0; var3 < 2048; ++var3) {
            class243.field3596[var3] = null;
            class401.field5631[var3] = null;
        }
        for (int var4 = 0; ~var4 > -32769; ++var4) {
            class442.field6317[var4] = null;
        }
        class338.field4904.method1382((byte) 47);
        class119.method730(13888);
        class306.field4472 = 0;
        class30.method167(16726);
        class96.method573((byte) 57);
        class401.method2513(arg0 ^ -24036);
        class9.method49((byte) -125, true);
        try {
            class348.method2282((byte) -64, "loggedout", class401.field5628.field3154);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IILlf;)V", line = 206)
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field2643;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field2639 = arg2.method798(false);
                    }
                } else {
                    this.field2640 = arg2.method798(false);
                }
            } else {
                this.field2645 = arg2.method798(false);
            }
        } else {
            this.field2647 = arg2.method798(false);
        }
        if (arg1 <= 79) {
            this.field2647 = -128;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIBLvq;IIIII)V", line = 259)
    public static final void method1328(int arg0, int arg1, byte arg2, class269 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2637;
        class143 var9 = (class143) class431.method2683(arg8, arg6, arg5);
        if (var9 != null) {
            class282 var10 = class398.method2496(-111, var9.method599(-10450));
            int var11 = var9.method603((byte) -62) & 3;
            int var12 = var9.method602((byte) -128);
            if (var10.field4077 != -1) {
                class44.method296(arg4, arg0, arg3, var10, 1, var11);
            } else {
                int var13 = arg7;
                if (var10.field4036 > 0) {
                    var13 = arg1;
                }
                if (~var12 == -1 || ~var12 == -3) {
                    if (~var11 == -1) {
                        arg3.method1839(arg4, 4, var13, (byte) 71, arg0);
                    } else if (~var11 != -2) {
                        if (~var11 == -3) {
                            arg3.method1839(arg4 + 3, 4, var13, (byte) 104, arg0);
                        } else if (var11 == 3) {
                            arg3.method1841((byte) -20, arg4, var13, 4, arg0 - -3);
                        }
                    } else {
                        arg3.method1841((byte) -20, arg4, var13, 4, arg0);
                    }
                }
                if (var12 == 3) {
                    if (var11 != 0) {
                        if (var11 == 1) {
                            arg3.method1832(arg4 + 3, var13, 1, 1, arg0, 1);
                        } else if (~var11 == -3) {
                            arg3.method1832(arg4 - -3, var13, 1, 1, arg0 + 3, 1);
                        } else if (var11 == 3) {
                            arg3.method1832(arg4, var13, 1, 1, arg0 + 3, 1);
                        }
                    } else {
                        arg3.method1832(arg4, var13, 1, 1, arg0, 1);
                    }
                }
                if (var12 == 2) {
                    if (~var11 == -1) {
                        arg3.method1841((byte) -20, arg4, var13, 4, arg0);
                    } else if (~var11 != -2) {
                        if (var11 != 2) {
                            if (var11 == 3) {
                                arg3.method1839(arg4, 4, var13, (byte) 80, arg0);
                            }
                        } else {
                            arg3.method1841((byte) -20, arg4, var13, 4, arg0 + 3);
                        }
                    } else {
                        arg3.method1839(arg4 + 3, 4, var13, (byte) 94, arg0);
                    }
                }
            }
        }
        class143 var14 = (class143) class233.method1613(arg8, arg6, arg5, field2651 != null ? field2651 : (field2651 = method1331("mb")));
        if (var14 != null) {
            class282 var15 = class398.method2496(-111, var14.method599(-10450));
            int var16 = 3 & var14.method603((byte) -62);
            int var17 = var14.method602((byte) -123);
            if (~var15.field4077 != 0) {
                class44.method296(arg4, arg0, arg3, var15, 1, var16);
            } else if (~var17 == -10) {
                int var18 = -1118482;
                if (var15.field4036 > 0) {
                    var18 = -1179648;
                }
                if (~var16 != -1 && ~var16 != -3) {
                    arg3.method1835(arg4, arg4 + 3, var18, 1, arg0 + 3, arg0);
                } else {
                    arg3.method1835(arg4, arg4 - -3, var18, 1, arg0, arg0 - -3);
                }
            }
        }
        class143 var19 = (class143) class353.method2309(arg8, arg6, arg5);
        if (var19 != null) {
            class282 var20 = class398.method2496(-115, var19.method599(-10450));
            int var21 = var19.method603((byte) -62) & 3;
            if (~var20.field4077 != 0) {
                class44.method296(arg4, arg0, arg3, var20, 1, var21);
            }
        }
        if (arg2 < 74) {
            field2649 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "j", descriptor = "(B)I", line = 394)
    public static final int method1329(byte arg0) {
        ++field2636;
        if (arg0 < 60) {
            method1328(49, -39, (byte) 103, (class269) null, 22, -77, -79, -43, -77);
        }
        try {
            if (~class258.field3819 == -1) {
                if (~(class18.method107(-16145) + -5000L) > ~class26.field328) {
                    return 0;
                }
                class68.field915 = class401.field5628.method1536(class299.field4344, class396.field5571, 2099);
                class212.field3008 = class18.method107(-16145);
                class258.field3819 = 1;
            }
            if (class212.field3008 + 30000L < class18.method107(-16145)) {
                return class417.method2629(0, 1000);
            } else {
                if (class258.field3819 == 1) {
                    if (class68.field915.field2298 == 2) {
                        return class417.method2629(0, 1001);
                    }
                    if (~class68.field915.field2298 != -2) {
                        return -1;
                    }
                    class199.field2847 = new class148((Socket) class68.field915.field2295, class401.field5628);
                    class68.field915 = null;
                    int var1 = 0;
                    if (class320.field4689) {
                        var1 = class417.field5996;
                    }
                    class407.field5761.field1880 = 0;
                    class407.field5761.method831(23, (byte) 118);
                    class407.field5761.method849(var1, (byte) -98);
                    class199.field2847.method1091(false, class407.field5761.field1851, class407.field5761.field1880, 0);
                    if (class153.field2271 != null) {
                        class153.field2271.method1363(-122);
                    }
                    if (class439.field6276 != null) {
                        class439.field6276.method1363(-110);
                    }
                    int var2 = class199.field2847.method1098((byte) 22);
                    if (class153.field2271 != null) {
                        class153.field2271.method1363(-66);
                    }
                    if (class439.field6276 != null) {
                        class439.field6276.method1363(-98);
                    }
                    if (var2 != 0) {
                        return class417.method2629(0, var2);
                    }
                    class258.field3819 = 2;
                }
                if (class258.field3819 == 2) {
                    if (~class199.field2847.method1089((byte) 49) > -3) {
                        return -1;
                    }
                    class56.field753 = class199.field2847.method1098((byte) 22);
                    class56.field753 <<= 8;
                    class56.field753 += class199.field2847.method1098((byte) 22);
                    class258.field3819 = 3;
                    class2.field13 = new byte[class56.field753];
                    class154.field2281 = 0;
                }
                if (class258.field3819 == 3) {
                    int var3 = class199.field2847.method1089((byte) 126);
                    if (~var3 > -2) {
                        return -1;
                    } else {
                        if (~var3 < ~(class56.field753 - class154.field2281)) {
                            var3 = -class154.field2281 + class56.field753;
                        }
                        class199.field2847.method1096(var3, class2.field13, -1, class154.field2281);
                        class154.field2281 += var3;
                        if (class56.field753 > class154.field2281) {
                            return -1;
                        } else if (!class431.method2685((byte) -116, class2.field13)) {
                            return class417.method2629(0, 1002);
                        } else {
                            class241.field3561 = new class158[class173.field2450];
                            int var4 = 0;
                            for (int var5 = class19.field254; var5 <= class241.field3566; ++var5) {
                                class158 var6 = class145.method1073(var5, 100);
                                if (var6 != null) {
                                    class241.field3561[var4++] = var6;
                                }
                            }
                            class440.field6296 = null;
                            class409.field5870 = 0;
                            class199.field2847.method1093(false);
                            class258.field3819 = 0;
                            class2.field13 = null;
                            class199.field2847 = null;
                            class222.field3181 = 0;
                            class26.field328 = class18.method107(-16145);
                            return 0;
                        }
                    }
                } else {
                    return -1;
                }
            }
        } catch (IOException var7) {
            return class417.method2629(0, 1003);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(BI)V", line = 537)
    public static final void method1330(byte arg0, int arg1) {
        class135.field2093 = arg1;
        ++field2642;
        class15 var2 = class258.field3826;
        synchronized (class258.field3826) {
            if (arg0 != 66) {
                field2648 = 65;
            }
            class258.field3826.method102((byte) -72);
        }
        class15 var3 = class332.field4822;
        synchronized (class332.field4822) {
            class332.field4822.method102((byte) -120);
        }
    }
}
