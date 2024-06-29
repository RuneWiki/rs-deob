import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class229 extends class371 {

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field3413 = 0;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lri;")
    public static class73 field3417 = new class73(0, 8);

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Lki;")
    public static class498 field3425;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "Lri;")
    public static class73 field3427;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "Z")
    public static boolean field3428;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public int field3419;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Lme;")
    public class129 field3420;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sc", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field3429;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lea;IJIILvg;III)V")
    public static final void method1568(class381 arg0, int arg1, long arg2, int arg3, int arg4, class38 arg5, int arg6, int arg7, int arg8) {
        field3409++;
        int var10 = arg3 * arg3 + arg8 * arg8;
        if (((long) var10) > arg2) {
            return;
        }
        if (arg6 <= 33) {
            method1571(null, 86, null);
        }
        int var11 = Math.min(arg5.field553 / 2, arg5.field472 / 2);
        if (var10 <= var11 * var11) {
            class496.method2975((byte) -26, arg0, arg3, arg1, arg8, arg4, arg5, class392.field5903[arg7]);
            return;
        }
        var11 -= 10;
        int var12;
        if (class140.field2103 == 4) {
            var12 = (int) class382.field5792 & 0x3FFF;
        } else {
            var12 = (int) class382.field5792 + class289.field4132 & 0x3FFF;
        }
        int var13 = class457.field6760[var12];
        int var14 = class457.field6759[var12];
        if (class140.field2103 != 4) {
            var13 = var13 * 256 / (class410.field6171 + 256);
            var14 = var14 * 256 / (class410.field6171 + 256);
        }
        int var15 = arg3 * var14 + arg8 * var13 >> 15;
        int var16 = arg8 * var14 - (arg3 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class302.field4268[arg7].method3124((float) arg5.field553 / 2.0F + (float) arg4 + (float) var19, (float) arg5.field472 / 2.0F + (float) arg1 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3421++;
        if (class525.method3102(arg6, arg5)) {
            if (class231.field3450[arg6] == null) {
                class245.method1648(arg4, arg1, class185.field2754[arg6], arg7, arg8, (byte) -115, -1, arg3, arg2, arg0);
            } else {
                class245.method1648(arg4, arg1, class231.field3450[arg6], arg7, arg8, (byte) -69, -1, arg3, arg2, arg0);
            }
            if (arg5 != -1) {
                field3413 = 86;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class315.field4503[var9] = true;
            }
        } else {
            class315.field4503[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)I")
    public static final int method1570(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field3423++;
            return arg0 == 1 || arg0 == 3 ? class225.field3301[arg2 & 0x3] : class182.field2660[arg2 & 0x3];
        } else {
            return 82;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lkp;ILkp;)V")
    public static final void method1571(class337 arg0, int arg1, class337 arg2) {
        int var3 = -92 % ((-arg1 - 7) / 37);
        if (arg0.field4735 != null) {
            arg0.method2049(-88);
        }
        field3415++;
        arg0.field4737 = arg2;
        arg0.field4735 = arg2.field4735;
        arg0.field4735.field4737 = arg0;
        arg0.field4737.field4735 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)Z")
    public static final boolean method1572(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field3414++;
            return (class152.method991(arg1, arg2, 117) | (arg2 & 0x2000) != 0 | class186.method1278(arg1, arg2, -11872)) & class166.method1153(arg2, -21, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static void method1573(byte arg0) {
        field3425 = null;
        field3427 = null;
        int var1 = -82 / ((arg0 - 37) / 50);
        field3417 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3411++;
        if (arg4 >= 0 && arg3 >= 0 && (class30.field323 - 1) > arg4 && arg3 < (class182.field2661 - 1)) {
            if (class108.field1553 == null) {
                return;
            }
            if (arg0 == 0) {
                class351 var12 = (class351) class426.method2557(arg6, arg4, arg3);
                class351 var13 = (class351) class484.method2874(arg6, arg4, arg3);
                if (var12 != null && arg1 != 2) {
                    if (var12 instanceof class372) {
                        ((class372) var12).field5688.method1833(true, arg5);
                    } else {
                        class474.method2829(105, arg6, arg5, arg1, arg0, arg3, var12.method20(-30685), arg4, arg7);
                    }
                }
                if (var13 != null) {
                    if ((var13 instanceof class372)) {
                        ((class372) var13).field5688.method1833(true, arg5);
                    } else {
                        class474.method2829(112, arg6, arg5, arg1, arg0, arg3, var13.method20(-30685), arg4, arg7);
                    }
                }
            } else if (arg0 == 1) {
                class351 var8 = (class351) class444.method2670(arg6, arg4, arg3);
                if (var8 != null) {
                    if (var8 instanceof class170) {
                        ((class170) var8).field2516.method1833(true, arg5);
                    } else {
                        int var9 = var8.method20(-30685);
                        if (arg1 == 4 || arg1 == 5) {
                            class474.method2829(123, arg6, arg5, 4, arg0, arg3, var9, arg4, arg7);
                        } else if (arg1 == 6) {
                            class474.method2829(107, arg6, arg5, 4, arg0, arg3, var9, arg4, arg7 + 4);
                        } else if (arg1 == 7) {
                            class474.method2829(110, arg6, arg5, 4, arg0, arg3, var9, arg4, (arg7 + 2 & 0x3) + 4);
                        } else if (arg1 == 8) {
                            class474.method2829(101, arg6, arg5, 4, arg0, arg3, var9, arg4, arg7 + 4);
                            class474.method2829(119, arg6, arg5, 4, arg0, arg3, var9, arg4, (arg7 + 2 & 0x3) + 4);
                        }
                    }
                }
            } else if (arg0 == 2) {
                class351 var11 = (class351) class342.method2093(arg6, arg4, arg3, field3429 == null ? (field3429 = method1577("mq")) : field3429);
                if (var11 != null) {
                    if (arg1 == 11) {
                        arg1 = 10;
                    }
                    if (var11 instanceof class151) {
                        ((class151) var11).field2239.method1833(true, arg5);
                    } else {
                        class474.method2829(105, arg6, arg5, arg1, arg0, arg3, var11.method20(-30685), arg4, arg7);
                    }
                }
            } else if (arg0 == 3) {
                class351 var10 = (class351) class196.method1340(arg6, arg4, arg3);
                if (var10 != null) {
                    if ((var10 instanceof class458)) {
                        ((class458) var10).field6775.method1833(true, arg5);
                    } else {
                        class474.method2829(125, arg6, arg5, arg1, arg0, arg3, var10.method20(-30685), arg4, arg7);
                    }
                }
            }
        }
        if (arg2 >= -6) {
            method1575(98, 93, 124);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(III)Lvg;")
    public static final class38 method1575(int arg0, int arg1, int arg2) {
        field3424++;
        class38 var3 = class149.method979((byte) -126, arg2);
        if (~arg0 == arg1) {
            return var3;
        } else if (var3 == null || var3.field452 == null || arg0 >= var3.field452.length) {
            return null;
        } else {
            return var3.field452[arg0];
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Loq;I)V")
    public static final void method1576(class239 arg0, int arg1) {
        int var2 = -88 % ((arg1 - 17) / 59);
        field3412++;
        class404 var3 = (class404) class164.field2414.method2605(false, (long) arg0.field1942);
        if (var3 == null) {
            return;
        }
        if (var3.field6085 != null) {
            class366.field5591.method1794(var3.field6085);
            var3.field6085 = null;
        }
        var3.method2049(-75);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1577(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class475("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field3426 = 0;
        field3425 = new class498(14, -1);
        field3427 = new class73(89, 0);
        field3428 = false;
    }
}
