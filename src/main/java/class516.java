import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class516 extends class596 {

    @OriginalMember(owner = "client!po", name = "l", descriptor = "Lck;")
    public class8 field7173;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field7175 = 0;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "S")
    public static short field7169 = 32767;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "Lgfa;")
    public static class150 field7172 = new class150();

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "Leu;")
    public static class692 field7170;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "Ljava/applet/Applet;")
    public static Applet field7178;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "Ljava/lang/String;")
    public static String field7171;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "[Z")
    public static boolean[] field7179;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2928(boolean arg0, int arg1) {
        if (arg1 != 0) {
            method2928(false, -26);
        }
        field7176++;
        boolean var2 = class146.field1963.method1098();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class146.field1963.method1114();
        } else if (!class146.field1963.method1117()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class602.field8408.field4335 = arg0;
            class602.field8408.method3557(class312.field4206, -2);
            return true;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)Z")
    public static final boolean method2929(byte arg0, int arg1) {
        field7177++;
        if (arg0 != -66) {
            method2929((byte) -59, 88);
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)Z")
    public static final boolean method2930(int arg0, byte arg1) {
        class79.field933 = true;
        if (arg1 == -106) {
            class460.field6025 = arg0 + 1 & 0xFFFF;
            field7168++;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lag;II[B)V")
    public class516(class469 arg0, int arg1, int arg2, byte[] arg3) {
        this.field7173 = class367.method2129(false, arg3, arg1, (byte) 111, arg2, 6406, arg0, 6406);
        this.field7173.method2495(false, false, (byte) -1);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
    public static void method2931(boolean arg0) {
        field7172 = null;
        field7171 = null;
        field7179 = null;
        field7170 = null;
        field7178 = null;
        if (!arg0) {
            field7172 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lhe;ZI)V")
    public static final void method2932(class231 arg0, boolean arg1, int arg2) {
        field7174++;
        class266 var3 = arg0.method1432(-1);
        if (arg0.field3095 == 0) {
            class694.field9790 = 0;
            class696.field9853 = -1;
            arg0.field3087 = 0;
            return;
        }
        if (arg0.field3048 != -1 && arg0.field3068 == 0) {
            class186 var4 = class423.field5620.method1707(arg0.field3048, -85);
            if (arg0.field3085 > 0 && var4.field2568 == 0) {
                arg0.field3087++;
                class696.field9853 = -1;
                class694.field9790 = 0;
                return;
            }
            if (arg0.field3085 <= 0 && var4.field2573 == 0) {
                class694.field9790 = 0;
                class696.field9853 = -1;
                arg0.field3087++;
                return;
            }
        }
        if (arg0.field3022 != -1 && arg0.field3049 <= class327.field4404) {
            class521 var5 = class24.field291.method2940(arg0.field3022, 17);
            if (var5.field7219 && var5.field7228 != -1) {
                class186 var6 = class423.field5620.method1707(var5.field7228, 108);
                if (arg0.field3085 > 0 && var6.field2568 == 0) {
                    arg0.field3087++;
                    class694.field9790 = 0;
                    class696.field9853 = -1;
                    return;
                }
                if (arg0.field3085 <= 0 && var6.field2573 == 0) {
                    arg0.field3087++;
                    class696.field9853 = -1;
                    class694.field9790 = 0;
                    return;
                }
            }
        }
        if (arg0.field3022 != -1 && arg0.field3049 <= class327.field4404) {
            class521 var7 = class24.field291.method2940(arg0.field3022, 17);
            if (var7.field7219 && var7.field7228 != -1) {
                class186 var8 = class423.field5620.method1707(var7.field7228, -103);
                if (arg0.field3085 > 0 && var8.field2568 == 0) {
                    class696.field9853 = -1;
                    class694.field9790 = 0;
                    arg0.field3087++;
                    return;
                }
                if (arg0.field3085 <= 0 && var8.field2573 == 0) {
                    class694.field9790 = 0;
                    arg0.field3087++;
                    class696.field9853 = -1;
                    return;
                }
            }
        }
        int var9 = arg0.field398;
        int var10 = arg0.field397;
        if (arg2 <= 69) {
            return;
        }
        int var11 = arg0.field3088[arg0.field3095 - 1] * 512 + arg0.method1435((byte) 107) * 256;
        int var12 = arg0.field3086[arg0.field3095 - 1] * 512 + (arg0.method1435((byte) 71) * 256);
        if (var9 >= var11) {
            if (var11 < var9) {
                if (var12 > var10) {
                    arg0.method1427(10973, 6144);
                } else if (var10 <= var12) {
                    arg0.method1427(10973, 4096);
                } else {
                    arg0.method1427(10973, 2048);
                }
            } else if (var12 > var10) {
                arg0.method1427(10973, 8192);
            } else if (var12 < var10) {
                arg0.method1427(10973, 0);
            }
        } else if (var12 > var10) {
            arg0.method1427(10973, 10240);
        } else if (var12 < var10) {
            arg0.method1427(10973, 14336);
        } else {
            arg0.method1427(10973, 12288);
        }
        byte var13 = arg0.field3093[arg0.field3095 - 1];
        if (!arg1 && (var11 - var9) > 1024 || var11 - var9 < -1024 || var12 - var10 > 1024 || (var12 - var10) < -1024) {
            arg0.field398 = var11;
            arg0.field397 = var12;
            arg0.method1439(false, 8, arg0.field3074);
            class694.field9790 = 0;
            class696.field9853 = -1;
            if (arg0.field3085 > 0) {
                arg0.field3085--;
            }
            arg0.field3095--;
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg0 instanceof class351) {
            var15 = ((class351) arg0).field4671.field5120;
        }
        if (var15) {
            int var16 = arg0.field3074 - arg0.field3027.field8961;
            if (var16 != 0 && arg0.field3045 == -1 && arg0.field3013 != 0) {
                var14 = 8;
            }
            if (!arg1 && arg0.field3095 > 2) {
                var14 = 24;
            }
            if (!arg1 && arg0.field3095 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg1 && arg0.field3095 > 1) {
                var14 = 24;
            }
            if (!arg1 && arg0.field3095 > 2) {
                var14 = 32;
            }
        }
        if (arg0.field3087 > 0 && arg0.field3095 > 1) {
            arg0.field3087--;
            var14 = 32;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field3450 != -1) {
            int var17 = var14 << 9;
            if (arg0.field3095 == 1) {
                int var18 = arg0.field3092 * arg0.field3092;
                int var19 = (arg0.field398 <= var11 ? var11 - arg0.field398 : arg0.field398 - var11) << 9;
                int var20 = (var12 >= arg0.field397 ? var12 - arg0.field397 : arg0.field397 - var12) << 9;
                int var21 = var19 > var20 ? var19 : var20;
                int var22 = var3.field3450 * 2 * var21;
                if (var22 < var18) {
                    arg0.field3092 /= 2;
                } else if (var18 / 2 > var21) {
                    arg0.field3092 -= var3.field3450;
                    if (arg0.field3092 < 0) {
                        arg0.field3092 = 0;
                    }
                } else if (var17 > arg0.field3092) {
                    arg0.field3092 += var3.field3450;
                    if (var17 < arg0.field3092) {
                        arg0.field3092 = var17;
                    }
                }
            } else if (var17 > arg0.field3092) {
                arg0.field3092 += var3.field3450;
                if (arg0.field3092 > var17) {
                    arg0.field3092 = var17;
                }
            } else if (arg0.field3092 > 0) {
                arg0.field3092 -= var3.field3450;
                if (arg0.field3092 < 0) {
                    arg0.field3092 = 0;
                }
            }
            var14 = arg0.field3092 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class694.field9790 = 0;
        if (var9 == var11 && var10 == var12) {
            class696.field9853 = -1;
        } else {
            if (var9 < var11) {
                class694.field9790 |= 0x4;
                arg0.field398 += var14;
                if (var11 < arg0.field398) {
                    arg0.field398 = var11;
                }
            } else if (var9 > var11) {
                arg0.field398 -= var14;
                class694.field9790 |= 0x8;
                if (var11 > arg0.field398) {
                    arg0.field398 = var11;
                }
            }
            if (var12 > var10) {
                class694.field9790 |= 0x1;
                arg0.field397 += var14;
                if (arg0.field397 > var12) {
                    arg0.field397 = var12;
                }
            } else if (var10 > var12) {
                class694.field9790 |= 0x2;
                arg0.field397 -= var14;
                if (arg0.field397 < var12) {
                    arg0.field397 = var12;
                }
            }
            if (var14 >= 32) {
                class696.field9853 = 2;
            } else {
                class696.field9853 = var13;
            }
        }
        if (arg0.field398 == var11 && arg0.field397 == var12) {
            if (arg0.field3085 > 0) {
                arg0.field3085--;
            }
            arg0.field3095--;
        }
    }
}
