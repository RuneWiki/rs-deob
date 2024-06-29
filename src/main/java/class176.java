import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class176 extends class244 implements class614 {

    @OriginalMember(owner = "client!ru", name = "A", descriptor = "S")
    private short field2484;

    @OriginalMember(owner = "client!ru", name = "J", descriptor = "B")
    private byte field2493;

    @OriginalMember(owner = "client!ru", name = "U", descriptor = "Z")
    private boolean field2504;

    @OriginalMember(owner = "client!ru", name = "B", descriptor = "Z")
    private boolean field2485;

    @OriginalMember(owner = "client!ru", name = "hb", descriptor = "Z")
    private boolean field2517;

    @OriginalMember(owner = "client!ru", name = "fb", descriptor = "B")
    private byte field2515;

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "Z")
    private boolean field2482;

    @OriginalMember(owner = "client!ru", name = "I", descriptor = "Lda;")
    public class55 field2492;

    @OriginalMember(owner = "client!ru", name = "L", descriptor = "Lha;")
    private class54 field2495;

    @OriginalMember(owner = "client!ru", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2489 = null;

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!ru", name = "C", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!ru", name = "E", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!ru", name = "G", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!ru", name = "H", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!ru", name = "K", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ru", name = "N", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ru", name = "O", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ru", name = "P", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ru", name = "Q", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ru", name = "R", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ru", name = "S", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ru", name = "T", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!ru", name = "V", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!ru", name = "W", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ru", name = "X", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ru", name = "Y", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ru", name = "Z", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ru", name = "ab", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ru", name = "bb", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ru", name = "cb", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ru", name = "db", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ru", name = "eb", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ru", name = "gb", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ru", name = "M", descriptor = "Lnu;")
    private class548 field2496;

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lr;Let;IIIIIZIIZ)V", line = 5)
    public class176(class166 arg0, class550 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class410.method2479(arg8, -1, arg9));
        this.field2484 = (short) arg1.field7783;
        this.field2493 = (byte) arg9;
        this.field2504 = arg7;
        this.field2485 = ~arg1.field7746 != -1 && !arg7;
        this.field2517 = arg10;
        super.field3029 = arg6;
        super.field3024 = arg4;
        this.field2515 = (byte) arg8;
        this.field2482 = arg0.method104() && arg1.field7759 && !this.field2504 && ~class287.field4270.method1625(-102, class328.field4859) != -1;
        int var12 = 2048;
        if (this.field2517) {
            var12 |= 65536;
        }
        class336 var13 = this.method1200((byte) 27, arg0, this.field2482, var12);
        if (var13 != null) {
            this.field2492 = var13.field4961;
            this.field2495 = var13.field4963;
            if (this.field2517) {
                this.field2492 = this.field2492.method532((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)I", line = 38)
    public final int method1171(byte arg0) {
        ++field2497;
        if (arg0 <= 39) {
            return -64;
        } else {
            return this.field2492 != null ? this.field2492.method525() : 0;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "([[IB)V", line = 49)
    public static final void method1195(int[][] arg0, byte arg1) {
        ++field2510;
        if (arg1 != 76) {
            field2489 = null;
        }
        class651.field9125 = arg0;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)I", line = 62)
    public final int method1186(int arg0) {
        ++field2490;
        if (arg0 != -9960) {
            method1197((byte) -29);
        }
        return this.field2515;
    }

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "(I)Z", line = 75)
    public final boolean method1184(int arg0) {
        ++field2511;
        int var2 = 88 % ((arg0 - -1) / 59);
        return this.field2492 != null ? this.field2492.method545() : false;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IILr;I)Z", line = 94)
    public final boolean method1185(int arg0, int arg1, class166 arg2, int arg3) {
        ++field2514;
        class55 var5 = this.method1198((byte) -76, 131072, arg2);
        if (arg0 != -26798) {
            this.field2515 = 82;
        }
        if (var5 != null) {
            class391 var6 = arg2.method130();
            var6.method252(super.field3024, super.field3018, super.field3029);
            return !class676.field9574 ? var5.method529(arg3, arg1, var6, false) : var5.method492(arg3, arg1, var6, false, class341.field5008);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(Z)V", line = 118)
    public static void method1196(boolean arg0) {
        if (arg0) {
            field2512 = -105;
        }
        field2489 = null;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)I", line = 129)
    public static final int method1197(byte arg0) {
        ++field2487;
        if (class623.field8731) {
            return 6;
        } else if (class305.field4531 == null) {
            return 0;
        } else {
            int var1 = class305.field4531.field4213;
            if (class576.method3265(var1, 68)) {
                return 1;
            } else if (class488.method2833(var1, (byte) 110)) {
                return 2;
            } else {
                if (arg0 < 113) {
                    field2512 = -16;
                }
                if (class15.method90((byte) -116, var1)) {
                    return 3;
                } else {
                    return class656.method3612(var1, (byte) -124) ? 4 : 5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lr;Z)V", line = 164)
    public final void method1176(class166 arg0, boolean arg1) {
        ++field2500;
        Object var3 = null;
        if (arg1) {
            method1196(false);
        }
        class54 var5;
        if (this.field2495 == null && this.field2482) {
            class336 var4 = this.method1200((byte) 27, arg0, true, 262144);
            var5 = var4 != null ? var4.field4963 : null;
        } else {
            var5 = this.field2495;
            this.field2495 = null;
        }
        if (var5 != null) {
            class409.method2472(var5, super.field3023, super.field3024, super.field3029, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "(I)Z", line = 193)
    public final boolean method951(int arg0) {
        ++field2491;
        if (arg0 > -26) {
            this.method947(35);
        }
        return this.field2517;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V", line = 209)
    public final void method1174(int arg0) {
        if (this.field2492 != null) {
            this.field2492.method530();
        }
        ++field2507;
        if (arg0 != -24082) {
            this.field2482 = true;
        }
    }

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "(I)Z", line = 228)
    public final boolean method1181(int arg0) {
        if (arg0 != -1) {
            this.method1179(true);
        }
        ++field2483;
        return true;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILr;)V", line = 240)
    public final void method1177(int arg0, class166 arg1) {
        ++field2516;
        if (arg0 != 0) {
            this.method1200((byte) -40, (class166) null, true, 48);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)I", line = 252)
    public final int method1179(boolean arg0) {
        ++field2509;
        return !arg0 ? 53 : 65535 & this.field2484;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)I", line = 264)
    public final int method1175(int arg0) {
        if (arg0 != 24563) {
            method1197((byte) 3);
        }
        ++field2513;
        return this.field2493;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lr;I)V", line = 276)
    public final void method1172(class166 arg0, int arg1) {
        if (arg1 <= 26) {
            this.method1174(124);
        }
        ++field2494;
        Object var3 = null;
        class54 var5;
        if (this.field2495 == null && this.field2482) {
            class336 var4 = this.method1200((byte) 27, arg0, true, 262144);
            var5 = var4 == null ? null : var4.field4963;
        } else {
            var5 = this.field2495;
            this.field2495 = null;
        }
        if (var5 != null) {
            class320.method2005(var5, super.field3023, super.field3024, super.field3029, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BILr;)Lda;", line = 304)
    private final class55 method1198(byte arg0, int arg1, class166 arg2) {
        if (arg0 > -20) {
            this.method1173((class166) null, true);
        }
        ++field2488;
        if (this.field2492 != null && arg2.method172(this.field2492.method517(), arg1) == 0) {
            return this.field2492;
        } else {
            class336 var4 = this.method1200((byte) 27, arg2, false, arg1);
            return var4 == null ? null : var4.field4961;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZI)V", line = 325)
    public static final void method1199(boolean arg0, int arg1) {
        ++field2508;
        ++class51.field1039;
        class135 var2 = class688.method3794(class490.field6946, class583.field8198, (byte) 38);
        class19.method223(var2, 0);
        int var3 = -63 / ((arg1 - 29) / 59);
        for (class320 var4 = (class320) class654.field9178.method1407(59); var4 != null; var4 = (class320) class654.field9178.method1413(true)) {
            if (!var4.method3675(true)) {
                var4 = (class320) class654.field9178.method1407(125);
                if (var4 == null) {
                    break;
                }
            }
            if (var4.field4704 == 0) {
                class224.method1484(arg0, true, true, var4);
            }
        }
        if (class37.field634 != null) {
            class563.method3215(true, class37.field634);
            class37.field634 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(ILr;)Lnu;", line = 366)
    public final class548 method1183(int arg0, class166 arg1) {
        if (this.field2496 == null) {
            this.field2496 = class149.method1060(super.field3029, super.field3024, this.method1198((byte) -50, 0, arg1), false, super.field3018);
        }
        if (arg0 != 6433) {
            this.method1185(-13, 112, (class166) null, 113);
        }
        ++field2503;
        return this.field2496;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BLr;ZI)Lpa;", line = 384)
    private final class336 method1200(byte arg0, class166 arg1, boolean arg2, int arg3) {
        ++field2498;
        if (arg0 != 27) {
            this.field2504 = true;
        }
        class550 var5 = class101.field1572.method2617((byte) -116, 65535 & this.field2484);
        class37 var6;
        class37 var7;
        if (this.field2504) {
            var6 = class499.field7071[super.field3023];
            var7 = class420.field6108[0];
        } else {
            if (super.field3023 < 3) {
                var7 = class420.field6108[super.field3023 + 1];
            } else {
                var7 = null;
            }
            var6 = class420.field6108[super.field3023];
        }
        return var5.method3111(var6, super.field3018, 3, this.field2515, arg1, arg2, super.field3024, arg3, this.field2493, var7, super.field3029);
    }

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "(I)I", line = 414)
    public final int method1182(int arg0) {
        ++field2499;
        if (arg0 != -32768) {
            this.method951(127);
        }
        return this.field2492 != null ? this.field2492.method488() : 0;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZLr;Lrga;IIZ)V", line = 425)
    public final void method953(int arg0, boolean arg1, class166 arg2, class215 arg3, int arg4, int arg5, boolean arg6) {
        if (!(arg3 instanceof class176)) {
            if (arg3 instanceof class622) {
                class622 var8 = (class622) arg3;
                if (this.field2492 != null && var8.field8667 != null) {
                    this.field2492.method539(var8.field8667, arg4, arg0, arg5, arg1);
                }
            }
        } else {
            class176 var9 = (class176) arg3;
            if (this.field2492 != null && var9.field2492 != null) {
                this.field2492.method539(var9.field2492, arg4, arg0, arg5, arg1);
            }
        }
        if (arg6) {
            ++field2506;
        }
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)Z", line = 454)
    public final boolean method1180(int arg0) {
        if (arg0 < 100) {
            field2489 = null;
        }
        ++field2501;
        return this.field2482;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(Lr;Z)Lkq;", line = 465)
    public final class549 method1173(class166 arg0, boolean arg1) {
        ++field2505;
        if (this.field2492 == null) {
            return null;
        } else {
            if (!arg1) {
                method1195((int[][]) null, (byte) -48);
            }
            class391 var3 = arg0.method130();
            var3.method252(super.field3024, super.field3018, super.field3029);
            class549 var4 = null;
            if (this.field2485) {
                var4 = class26.method321(1, 0);
            }
            if (class676.field9574) {
                this.field2492.method495(var3, var4 != null ? var4.field7711[0] : null, class341.field5008, 0);
            } else {
                this.field2492.method513(var3, var4 != null ? var4.field7711[0] : null, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "(I)V", line = 500)
    public final void method947(int arg0) {
        int var2 = -54 % ((arg0 - -44) / 42);
        this.field2517 = false;
        ++field2486;
        if (this.field2492 != null) {
            this.field2492.method536(-65537 & this.field2492.method517());
        }
    }
}
