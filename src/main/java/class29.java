import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class29 extends class89 implements class149 {

    @OriginalMember(owner = "client!gs", name = "I", descriptor = "B")
    private byte field341;

    @OriginalMember(owner = "client!gs", name = "H", descriptor = "S")
    private short field340;

    @OriginalMember(owner = "client!gs", name = "w", descriptor = "B")
    private byte field329;

    @OriginalMember(owner = "client!gs", name = "O", descriptor = "Z")
    private boolean field347;

    @OriginalMember(owner = "client!gs", name = "W", descriptor = "Z")
    private boolean field355;

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "B")
    private byte field343;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "Z")
    private boolean field345;

    @OriginalMember(owner = "client!gs", name = "u", descriptor = "Z")
    private boolean field327;

    @OriginalMember(owner = "client!gs", name = "F", descriptor = "Las;")
    private class84 field338;

    @OriginalMember(owner = "client!gs", name = "S", descriptor = "Lid;")
    public class348 field351;

    @OriginalMember(owner = "client!gs", name = "J", descriptor = "Z")
    public static boolean field342 = false;

    @OriginalMember(owner = "client!gs", name = "v", descriptor = "[J")
    public static long[] field328 = new long[32];

    @OriginalMember(owner = "client!gs", name = "Y", descriptor = "[S")
    public static short[] field357 = new short[256];

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!gs", name = "x", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!gs", name = "A", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!gs", name = "E", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!gs", name = "P", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!gs", name = "Q", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!gs", name = "R", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!gs", name = "U", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!gs", name = "V", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!gs", name = "X", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!gs", name = "T", descriptor = "Lmo;")
    public static class447 field352;

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "Z")
    public static boolean field339;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)I")
    public final int method183(byte arg0) {
        int var2 = -116 / ((49 - arg0) / 47);
        ++field326;
        return this.field341;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILe;IIZLhm;I)V")
    public final void method184(int arg0, class312 arg1, int arg2, int arg3, boolean arg4, class120 arg5, int arg6) {
        ++field350;
        if (!(arg5 instanceof class29)) {
            if (arg5 instanceof class165) {
                class165 var8 = (class165) arg5;
                if (this.field351 != null && var8.field2583 != null) {
                    this.field351.method20(var8.field2583, arg6, arg2, arg0, arg4);
                }
            }
        } else {
            class29 var9 = (class29) arg5;
            if (this.field351 != null && var9.field351 != null) {
                this.field351.method20(var9.field351, arg6, arg2, arg0, arg4);
            }
        }
        if (arg3 != 0) {
            this.field327 = true;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(Le;IB)Lid;")
    private final class348 method185(class312 arg0, int arg1, byte arg2) {
        ++field353;
        if (arg2 != -14) {
            method187(41);
        }
        if (this.field351 != null && arg0.method579(this.field351.method44(), arg1) == 0) {
            return this.field351;
        } else {
            class230 var4 = this.method191(-2665, arg1, arg0, false);
            return var4 == null ? null : var4.field3831;
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)Z")
    public final boolean method186(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field346;
            return this.field355;
        }
    }

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)V")
    public static void method187(int arg0) {
        field328 = null;
        field352 = null;
        field357 = null;
        if (arg0 != 256) {
            field352 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIILe;)Z")
    public final boolean method188(int arg0, int arg1, int arg2, class312 arg3) {
        ++field330;
        class348 var5 = this.method185(arg3, arg1, (byte) -14);
        if (var5 != null) {
            class435 var6 = arg3.method713();
            var6.method1984(super.field1118, super.field1119, super.field1113);
            return var5.method39(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Le;Z)Lum;")
    public final class306 method189(class312 arg0, boolean arg1) {
        ++field334;
        if (!arg1) {
            return null;
        } else if (this.field351 == null) {
            return null;
        } else {
            class435 var3 = arg0.method713();
            var3.method1984(super.field1118, super.field1119, super.field1113);
            class306 var4 = null;
            if (this.field345) {
                var4 = class203.method1443(-127, 1);
            }
            this.field351.method26(var3, var4 != null ? var4.field4856[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)Z")
    public final boolean method190(byte arg0) {
        ++field348;
        return arg0 > -126 ? false : this.field327;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IILe;Z)Lns;")
    private final class230 method191(int arg0, int arg1, class312 arg2, boolean arg3) {
        ++field333;
        class127 var5 = class137.method1003(this.field340 & 65535, -30796);
        if (arg0 != -2665) {
            return null;
        } else {
            class129 var6;
            class129 var7;
            if (this.field347) {
                var6 = class364.field5542[this.field343];
                var7 = class181.field2961[0];
            } else {
                if (~this.field343 > -4) {
                    var7 = class181.field2961[this.field343 + 1];
                } else {
                    var7 = null;
                }
                var6 = class181.field2961[this.field343];
            }
            return var5.method949(var6, arg3, this.field341, arg2, var7, this.field329, 42, super.field1113, super.field1118, super.field1119, arg1);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)Lls;")
    public static final class73 method192(int arg0, int arg1) {
        ++field349;
        if (arg0 != -20792) {
            field328 = null;
        }
        class52 var2 = class329.field5155;
        class73 var3;
        synchronized (class329.field5155) {
            var3 = (class73) class329.field5155.method331((byte) 69, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class205.field3300.method2771(3, arg1, 3);
            class73 var5 = new class73();
            if (var4 != null) {
                var5.method470((byte) -67, new class186(var4));
            }
            class52 var6 = class329.field5155;
            synchronized (class329.field5155) {
                class329.field5155.method341(49, (long) arg1, var5);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)V")
    public final void method193(int arg0) {
        this.field355 = false;
        ++field332;
        if (arg0 == 0) {
            if (this.field351 != null) {
                this.field351.method9(-32769 & this.field351.method44());
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Le;Lfa;IIIIZIIZ)V")
    public class29(class312 arg0, class127 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class156.method1100(arg8, arg7, 5000));
        this.field341 = (byte) arg8;
        this.field340 = (short) arg1.field2016;
        this.field329 = (byte) arg7;
        this.field347 = arg6;
        super.field1118 = (short) arg3;
        this.field355 = arg9;
        this.field343 = (byte) arg2;
        super.field1113 = (short) arg5;
        this.field345 = arg1.field2021 != 0 && !arg6;
        this.field327 = arg0.method565() && arg1.field1991 && !this.field347 && class299.field4755 != 0;
        int var11 = 1024;
        if (this.field355) {
            var11 |= 32768;
        }
        class230 var12 = this.method191(-2665, var11, arg0, this.field327);
        if (var12 != null) {
            this.field338 = var12.field3834;
            this.field351 = var12.field3831;
            if (this.field355) {
                this.field351 = this.field351.method15((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Le;I)V")
    public final void method194(class312 arg0, int arg1) {
        ++field335;
        Object var3 = null;
        class84 var5;
        if (this.field338 == null && this.field327) {
            class230 var4 = this.method191(-2665, 131072, arg0, true);
            var5 = var4 != null ? var4.field3834 : null;
        } else {
            var5 = this.field338;
            this.field338 = null;
        }
        if (var5 != null) {
            class98.method740(var5, this.field343, super.field1118, super.field1113, (boolean[]) null);
        }
        int var6 = -73 / ((-19 - arg1) / 62);
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)I")
    public final int method195(int arg0) {
        if (arg0 != 3076) {
            this.method199((class312) null, (byte) -103);
        }
        ++field356;
        return this.field329;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(Le;B)V")
    public final void method196(class312 arg0, byte arg1) {
        ++field354;
        if (arg1 > -66) {
            this.field351 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)I")
    public final int method197(boolean arg0) {
        if (!arg0) {
            field352 = null;
        }
        ++field344;
        return 65535 & this.field340;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public final void method198(int arg0) {
        ++field336;
        if (this.field351 != null) {
            this.field351.method17();
        }
        if (arg0 != -32289) {
            this.field355 = false;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Le;B)V")
    public final void method199(class312 arg0, byte arg1) {
        ++field331;
        if (arg1 == -22) {
            Object var3 = null;
            class84 var5;
            if (this.field338 == null && this.field327) {
                class230 var4 = this.method191(arg1 + -2643, 131072, arg0, true);
                var5 = var4 == null ? null : var4.field3834;
            } else {
                var5 = this.field338;
                this.field338 = null;
            }
            if (var5 != null) {
                class120.method866(var5, this.field343, super.field1118, super.field1113, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Le;IB)Lid;")
    public final class348 method200(class312 arg0, int arg1, byte arg2) {
        ++field337;
        if (arg2 != -52) {
            field357 = null;
        }
        return this.method185(arg0, arg1, (byte) -14);
    }
}
