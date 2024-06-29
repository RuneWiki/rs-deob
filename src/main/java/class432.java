import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class432 extends class191 implements class149 {

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "B")
    private byte field6370;

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "Z")
    private boolean field6379;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "Z")
    private boolean field6358;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "S")
    private short field6377;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "B")
    private byte field6357;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "Z")
    private boolean field6380;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "Z")
    private boolean field6361;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "Las;")
    private class84 field6365;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "Lid;")
    private class348 field6366;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!cm", name = "U", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!cm", name = "V", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!cm", name = "W", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "Lvd;")
    public static class26 field6376;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "[Ltd;")
    public static class262[] field6364;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIILe;)Z", line = 3)
    public final boolean method188(int arg0, int arg1, int arg2, class312 arg3) {
        ++field6374;
        class348 var5 = this.method2672((byte) 119, arg1, arg3);
        if (var5 != null) {
            class435 var6 = arg3.method713();
            var6.method1984(super.field3112, super.field3113, super.field3118);
            return var5.method39(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Le;Lfa;IIIIZIZ)V", line = 23)
    public class432(class312 arg0, class127 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field1956, arg1.field1942);
        super.field3118 = (short) arg5;
        this.field6370 = (byte) arg7;
        this.field6379 = arg8;
        this.field6358 = arg1.field2021 != 0 && !arg6;
        super.field3112 = (short) arg3;
        this.field6377 = (short) arg1.field2016;
        this.field6357 = (byte) arg2;
        this.field6380 = arg6;
        this.field6361 = arg0.method565() && arg1.field1991 && !this.field6380 && ~class299.field4755 != -1;
        int var10 = 1024;
        if (this.field6379) {
            var10 |= 32768;
        }
        class230 var11 = this.method2674(var10, this.field6361, (byte) 116, arg0);
        if (var11 != null) {
            this.field6365 = var11.field3834;
            this.field6366 = var11.field3831;
            if (this.field6379) {
                this.field6366 = this.field6366.method15((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Le;I)V", line = 58)
    public final void method194(class312 arg0, int arg1) {
        int var3 = 3 / ((arg1 - -19) / 62);
        ++field6368;
        Object var4 = null;
        class84 var6;
        if (this.field6365 == null && this.field6361) {
            class230 var5 = this.method2674(131072, true, (byte) 118, arg0);
            var6 = var5 == null ? null : var5.field3834;
        } else {
            var6 = this.field6365;
            this.field6365 = null;
        }
        if (var6 != null) {
            class98.method740(var6, this.field6357, super.field3112, super.field3118, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)Z", line = 84)
    public final boolean method186(int arg0) {
        ++field6373;
        return arg0 != 0 ? true : this.field6379;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Le;Z)Lum;", line = 97)
    public final class306 method189(class312 arg0, boolean arg1) {
        ++field6369;
        if (this.field6366 == null) {
            return null;
        } else {
            class435 var3 = arg0.method713();
            var3.method1984(super.field3112, super.field3113, super.field3118);
            if (!arg1) {
                this.method2674(97, true, (byte) -112, (class312) null);
            }
            class306 var4 = null;
            if (this.field6358) {
                var4 = class203.method1443(-107, 1);
            }
            this.field6366.method26(var3, var4 != null ? var4.field4856[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)I", line = 123)
    public final int method197(boolean arg0) {
        ++field6371;
        return !arg0 ? -95 : 65535 & this.field6377;
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V", line = 137)
    public static void method2671(int arg0) {
        if (arg0 != -4348) {
            method2675(61, -66, (long[]) null, (Object[]) null, 108);
        }
        field6364 = null;
        field6376 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Le;B)V", line = 151)
    public final void method199(class312 arg0, byte arg1) {
        if (arg1 != -22) {
            method2675(-38, -76, (long[]) null, (Object[]) null, 123);
        }
        ++field6383;
        Object var3 = null;
        class84 var5;
        if (this.field6365 == null && this.field6361) {
            class230 var4 = this.method2674(131072, true, (byte) 120, arg0);
            var5 = var4 != null ? var4.field3834 : null;
        } else {
            var5 = this.field6365;
            this.field6365 = null;
        }
        if (var5 != null) {
            class120.method866(var5, this.field6357, super.field3112, super.field3118, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BILe;)Lid;", line = 178)
    private final class348 method2672(byte arg0, int arg1, class312 arg2) {
        ++field6360;
        if (arg0 < 98) {
            return null;
        } else if (this.field6366 != null && arg2.method579(this.field6366.method44(), arg1) == 0) {
            return this.field6366;
        } else {
            class230 var4 = this.method2674(arg1, false, (byte) 101, arg2);
            return var4 == null ? null : var4.field3831;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Z", line = 202)
    public final boolean method190(byte arg0) {
        if (arg0 >= -126) {
            this.method194((class312) null, 74);
        }
        ++field6372;
        return this.field6361;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)I", line = 213)
    public final int method183(byte arg0) {
        int var2 = -96 / ((49 - arg0) / 47);
        ++field6384;
        return this.field6370;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Le;B)V", line = 223)
    public final void method196(class312 arg0, byte arg1) {
        if (arg1 >= -66) {
            this.method2674(5, true, (byte) 31, (class312) null);
        }
        ++field6378;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I", line = 234)
    public final int method195(int arg0) {
        ++field6381;
        if (arg0 != 3076) {
            this.method196((class312) null, (byte) -111);
        }
        return 22;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I", line = 249)
    public static final int method2673(int arg0, int arg1) {
        ++field6356;
        if (arg1 < 0) {
            return 0;
        } else if (arg0 <= 28) {
            return -56;
        } else {
            class33 var2 = (class33) class126.field1937.method1770(-880, (long) arg1);
            if (var2 == null) {
                return class323.method2142(arg1, 126).field3004;
            } else {
                int var3 = 0;
                for (int var4 = 0; ~var2.field417.length < ~var4; ++var4) {
                    if (~var2.field417[var4] == 0) {
                        ++var3;
                    }
                }
                return var3 + (class323.method2142(arg1, 122).field3004 - var2.field417.length);
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILe;IIZLhm;I)V", line = 283)
    public final void method184(int arg0, class312 arg1, int arg2, int arg3, boolean arg4, class120 arg5, int arg6) {
        ++field6367;
        if (arg3 == 0) {
            if (arg5 instanceof class432) {
                class432 var8 = (class432) arg5;
                if (this.field6366 != null && var8.field6366 != null) {
                    this.field6366.method20(var8.field6366, arg6, arg2, arg0, arg4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZBLe;)Lns;", line = 308)
    private final class230 method2674(int arg0, boolean arg1, byte arg2, class312 arg3) {
        ++field6363;
        if (arg2 < 78) {
            this.field6358 = true;
        }
        class127 var5 = class137.method1003(65535 & this.field6377, -30796);
        class129 var6;
        class129 var7;
        if (this.field6380) {
            var6 = class364.field5542[this.field6357];
            var7 = class181.field2961[0];
        } else {
            var6 = class181.field2961[this.field6357];
            if (~this.field6357 > -4) {
                var7 = class181.field2961[this.field6357 + 1];
            } else {
                var7 = null;
            }
        }
        return var5.method949(var6, arg1, this.field6370, arg3, var7, 22, 42, super.field3118, super.field3112, super.field3113, arg0);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 340)
    public final void method198(int arg0) {
        ++field6375;
        if (arg0 == -32289) {
            if (this.field6366 != null) {
                this.field6366.method17();
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V", line = 355)
    public final void method193(int arg0) {
        if (arg0 == 0) {
            this.field6379 = false;
            ++field6382;
            if (this.field6366 != null) {
                this.field6366.method9(-32769 & this.field6366.method44());
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II[J[Ljava/lang/Object;I)V", line = 369)
    public static final void method2675(int arg0, int arg1, long[] arg2, Object[] arg3, int arg4) {
        if (arg4 < arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var9;
            for (int var10 = arg4; var10 < arg1; ++var10) {
                if (~arg2[var10] > ~((long) (1 & var10) + var7)) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var13 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var13;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var9;
            method2675(-24528, var6 + -1, arg2, arg3, arg4);
            method2675(arg0, arg1, arg2, arg3, var6 + 1);
        }
        ++field6385;
        if (arg0 != -24528) {
            method2671(-107);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Le;IB)Lid;", line = 427)
    public final class348 method200(class312 arg0, int arg1, byte arg2) {
        ++field6359;
        if (arg2 != -52) {
            this.method184(-121, (class312) null, -55, 112, false, (class120) null, 60);
        }
        return this.method2672((byte) 99, arg1, arg0);
    }
}
