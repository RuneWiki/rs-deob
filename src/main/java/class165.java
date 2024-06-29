import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class165 extends class57 implements class149 {

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "Z")
    private boolean field2589;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "S")
    private short field2579;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "B")
    private byte field2592;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "B")
    private byte field2578;

    @OriginalMember(owner = "client!ca", name = "fb", descriptor = "Z")
    private boolean field2607;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "Z")
    private boolean field2595;

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "B")
    private byte field2598;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "Z")
    private boolean field2586;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "Lid;")
    public class348 field2583;

    @OriginalMember(owner = "client!ca", name = "db", descriptor = "Las;")
    private class84 field2605;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ca", name = "Y", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ca", name = "Z", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ca", name = "ab", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!ca", name = "bb", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ca", name = "cb", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ca", name = "eb", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Le;Lfa;IIIIIZIIIIIIZ)V")
    public class165(class312 arg0, class127 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field1994 == 1, class305.method2056((byte) 74, arg13, arg12));
        this.field2589 = arg14;
        this.field2579 = (short) arg1.field2016;
        this.field2592 = (byte) arg12;
        this.field2578 = (byte) arg3;
        this.field2607 = ~arg1.field2021 != -1 && !arg7;
        this.field2595 = arg7;
        this.field2598 = (byte) arg13;
        this.field2586 = arg0.method565() && arg1.field1991 && !this.field2595 && ~class299.field4755 != -1;
        int var16 = 1024;
        if (this.field2589) {
            var16 |= 32768;
        }
        class230 var17 = this.method1162(this.field2586, arg0, false, var16);
        if (var17 != null) {
            this.field2583 = var17.field3831;
            this.field2605 = var17.field3834;
            if (this.field2589) {
                this.field2583 = this.field2583.method15((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)Z")
    public final boolean method190(byte arg0) {
        if (arg0 > -126) {
            this.method199((class312) null, (byte) -38);
        }
        ++field2603;
        return this.field2586;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Le;B)V")
    public final void method196(class312 arg0, byte arg1) {
        if (arg1 > -66) {
            this.field2583 = null;
        }
        ++field2587;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public final void method198(int arg0) {
        if (arg0 != -32289) {
            this.method1160(-20, (class312) null, (byte) -103);
        }
        if (this.field2583 != null) {
            this.field2583.method17();
        }
        ++field2596;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)V")
    public static final void method1159(boolean arg0) {
        ++field2593;
        class21.field274 = 0;
        class11.field155 = 0;
        class426.method2642(1);
        class427.method2648(!arg0);
        class43.method284((byte) 61);
        class185.method1258(0);
        for (int var1 = 0; var1 < class11.field155; ++var1) {
            int var3 = class134.field2112[var1];
            if (class183.field2987 != class216.field3517[var3].field1839) {
                if (~class216.field3517[var3].field3620 < -1) {
                    class340.method2233((byte) -26, class216.field3517[var3]);
                }
                class216.field3517[var3] = null;
            }
        }
        if (class345.field5331 != class158.field2514.field3044) {
            throw new RuntimeException("gpp1 pos:" + class158.field2514.field3044 + " psize:" + class345.field5331);
        } else {
            for (int var2 = 0; ~var2 > ~class107.field1500; ++var2) {
                if (class216.field3517[class132.field2063[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class107.field1500);
                }
            }
            if (!arg0) {
                method1163(-58, -94);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
    public final int method195(int arg0) {
        if (arg0 != 3076) {
            this.field2607 = false;
        }
        ++field2581;
        return this.field2592;
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)I")
    public final int method314(int arg0) {
        if (arg0 != 27647) {
            this.method196((class312) null, (byte) 99);
        }
        ++field2594;
        return this.field2583 == null ? 0 : this.field2583.method57();
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)Z")
    public final boolean method186(int arg0) {
        if (arg0 != 0) {
            this.field2579 = -95;
        }
        ++field2588;
        return this.field2589;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Le;Z)Lum;")
    public final class306 method189(class312 arg0, boolean arg1) {
        ++field2602;
        if (!arg1) {
            this.method314(-50);
        }
        if (this.field2583 == null) {
            return null;
        } else {
            class435 var3 = arg0.method713();
            var3.method1984(super.field724, super.field721, super.field722);
            class306 var4 = null;
            if (this.field2607) {
                var4 = class203.method1443(-49, 1);
            }
            this.field2583.method26(var3, var4 == null ? null : var4.field4856[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
    public final void method193(int arg0) {
        this.field2589 = false;
        if (arg0 == 0) {
            ++field2606;
            if (this.field2583 != null) {
                this.field2583.method9(-32769 & this.field2583.method44());
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILe;)Z")
    public final boolean method188(int arg0, int arg1, int arg2, class312 arg3) {
        ++field2590;
        class348 var5 = this.method1160(arg1, arg3, (byte) 63);
        if (var5 != null) {
            class435 var6 = arg3.method713();
            var6.method1984(super.field724, super.field721, super.field722);
            return var5.method39(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILe;B)Lid;")
    private final class348 method1160(int arg0, class312 arg1, byte arg2) {
        if (arg2 != 63) {
            this.field2598 = -4;
        }
        ++field2599;
        if (this.field2583 != null && ~arg1.method579(this.field2583.method44(), arg0) == -1) {
            return this.field2583;
        } else {
            class230 var4 = this.method1162(false, arg1, false, arg0);
            return var4 == null ? null : var4.field3831;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILe;IIZLhm;I)V")
    public final void method184(int arg0, class312 arg1, int arg2, int arg3, boolean arg4, class120 arg5, int arg6) {
        ++field2597;
        if (arg3 == 0) {
            if (!(arg5 instanceof class29)) {
                if (arg5 instanceof class165) {
                    class165 var8 = (class165) arg5;
                    if (this.field2583 != null && var8.field2583 != null) {
                        this.field2583.method20(var8.field2583, arg6, arg2, arg0, arg4);
                        return;
                    }
                }
            } else {
                class29 var9 = (class29) arg5;
                if (this.field2583 == null || var9.field351 == null) {
                    return;
                }
                this.field2583.method20(var9.field351, arg6, arg2, arg0, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Le;B)V")
    public final void method199(class312 arg0, byte arg1) {
        ++field2604;
        Object var3 = null;
        if (arg1 != -22) {
            this.field2605 = null;
        }
        class84 var5;
        if (this.field2605 == null && this.field2586) {
            class230 var4 = this.method1162(true, arg0, false, 131072);
            var5 = var4 != null ? var4.field3834 : null;
        } else {
            var5 = this.field2605;
            this.field2605 = null;
        }
        if (var5 != null) {
            class120.method866(var5, this.field2578, super.field724, super.field722, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(B)I")
    public final int method1161(byte arg0) {
        if (arg0 != -22) {
            this.method1161((byte) 0);
        }
        ++field2582;
        return this.field2583 == null ? 15 : this.field2583.method28() / 4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLe;ZI)Lns;")
    private final class230 method1162(boolean arg0, class312 arg1, boolean arg2, int arg3) {
        ++field2585;
        if (arg2) {
            this.field2598 = 73;
        }
        class127 var5 = class137.method1003(this.field2579 & 65535, -30796);
        class129 var6;
        class129 var7;
        if (!this.field2595) {
            var6 = class181.field2961[this.field2578];
            if (~this.field2578 > -4) {
                var7 = class181.field2961[this.field2578 + 1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class181.field2961[0];
            var6 = class364.field5542[this.field2578];
        }
        return var5.method949(var6, arg0, this.field2592 != 11 ? this.field2598 : this.field2598 + 4, arg1, var7, this.field2592 == 11 ? 10 : this.field2592, 42, super.field722, super.field724, super.field721, arg3);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)I")
    public final int method197(boolean arg0) {
        if (!arg0) {
            method1159(true);
        }
        ++field2580;
        return this.field2579 & 65535;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)Lvg;")
    public static final class33 method1163(int arg0, int arg1) {
        if (arg0 != 0) {
            method1163(123, 9);
        }
        ++field2601;
        return (class33) class126.field1937.method1770(-880, (long) arg1);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Le;I)V")
    public final void method194(class312 arg0, int arg1) {
        int var3 = 113 / ((arg1 - -19) / 62);
        ++field2584;
        Object var4 = null;
        class84 var6;
        if (this.field2605 == null && this.field2586) {
            class230 var5 = this.method1162(true, arg0, false, 131072);
            var6 = var5 == null ? null : var5.field3834;
        } else {
            var6 = this.field2605;
            this.field2605 = null;
        }
        if (var6 != null) {
            class98.method740(var6, this.field2578, super.field724, super.field722, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)I")
    public final int method183(byte arg0) {
        ++field2600;
        int var2 = 21 % ((arg0 - 49) / 47);
        return this.field2598;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Le;IB)Lid;")
    public final class348 method200(class312 arg0, int arg1, byte arg2) {
        if (arg2 != -52) {
            return null;
        } else {
            ++field2591;
            return this.method1160(arg1, arg0, (byte) 63);
        }
    }
}
