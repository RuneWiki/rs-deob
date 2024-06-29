import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class17 extends class307 {

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "Lqd;")
    public static class40 field262 = class147.method1106("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) -50);

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "Lgi;")
    public static class208 field263;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "Lce;")
    public static class239 field258;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 4)
    public static void method95(byte arg0) {
        field262 = null;
        field258 = null;
        if (arg0 >= -56) {
            method98(68, -39, 18);
        }
        field263 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIIILm;II)V", line = 18)
    public static final void method96(byte arg0, int arg1, int arg2, int arg3, class44 arg4, int arg5, int arg6) {
        if (arg0 != 48) {
            field258 = (class239) null;
        }
        long var7 = 0L;
        field255++;
        boolean var9 = true;
        if (arg3 == 0) {
            var7 = class56.method478(arg1, arg5, arg6);
        } else if (arg3 == 1) {
            var7 = class65.method522(arg1, arg5, arg6);
        } else if (arg3 == 2) {
            var7 = class14.method84(arg1, arg5, arg6);
        } else if (arg3 == 3) {
            var7 = class310.method2122(arg1, arg5, arg6);
        }
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var11 = false;
        int var12 = ((int) var7 & 0x7C3CC) >> 14;
        boolean var13 = false;
        class27 var14 = class72.method540(0, var10);
        int var15 = ((int) var7 & 0x3847A8) >> 20;
        if (var14.method262(arg0 - 124)) {
            class177.method1300(var14, (byte) -107, arg6, arg1, arg5);
        }
        if (var7 == 0L) {
            return;
        }
        class196 var16 = null;
        class196 var17 = null;
        if (arg3 == 0) {
            class302 var18 = class275.method1914(arg1, arg5, arg6);
            if (var18 != null) {
                var16 = var18.field5059;
                var17 = var18.field5066;
            }
            if (var14.field588 != 0) {
                arg4.method414(var14.field570, arg5, arg6, var12, (byte) 22, var15);
            }
        } else if (arg3 == 1) {
            class20 var21 = class122.method922(arg1, arg5, arg6);
            if (var21 != null) {
                var17 = var21.field335;
                var16 = var21.field343;
            }
        } else if (arg3 == 2) {
            class193 var20 = class275.method1913(arg1, arg5, arg6);
            if (var20 != null) {
                var16 = var20.field3106;
            }
            if (var14.field588 != 0 && var14.field519 + arg5 < 104 && var14.field519 + arg6 < 104 && (var14.field568 + arg5) < 104 && var14.field568 + arg6 < 104) {
                arg4.method404(arg0 - 48, var14.field519, var14.field570, var15, arg5, arg6, var14.field568);
            }
        } else if (arg3 == 3) {
            class102 var19 = class151.method1131(arg1, arg5, arg6);
            if (var19 != null) {
                var16 = var19.field1790;
            }
            if (var14.field588 == 1) {
                arg4.method397(arg0 ^ 0xFFFFFFB4, arg6, arg5);
            }
        }
        if (!class21.field350 || !var14.field583) {
            return;
        }
        if (var12 == 2) {
            if ((var16 instanceof class280)) {
                ((class280) var16).method1961((byte) 38);
            } else {
                class80.method603(var14, var12, arg2, arg6, var15 + 4, arg5, -161, 0, 0);
            }
            if ((var17 instanceof class280)) {
                ((class280) var17).method1961((byte) 103);
            } else {
                class80.method603(var14, var12, arg2, arg6, var15 + 1 & 0x3, arg5, -161, 0, 0);
            }
        } else if (var12 == 5) {
            if (var16 instanceof class280) {
                ((class280) var16).method1961((byte) 95);
            } else {
                class80.method603(var14, 4, arg2, arg6, var15, arg5, -161, class250.field4150[var15] * 8, class297.field4964[var15] * 8);
            }
        } else if (var12 == 6) {
            if (var16 instanceof class280) {
                ((class280) var16).method1961((byte) 55);
            } else {
                class80.method603(var14, 4, arg2, arg6, var15 + 4, arg5, -161, class78.field1320[var15] * 8, class45.field882[var15] * 8);
            }
        } else if (var12 == 7) {
            if ((var16 instanceof class280)) {
                ((class280) var16).method1961((byte) 34);
            } else {
                class80.method603(var14, 4, arg2, arg6, (var15 + 2 & 0x3) + 4, arg5, -161, 0, 0);
            }
        } else if (var12 == 8) {
            if (var16 instanceof class280) {
                ((class280) var16).method1961((byte) 83);
            } else {
                class80.method603(var14, 4, arg2, arg6, var15 + 4, arg5, -161, class78.field1320[var15] * 8, class45.field882[var15] * 8);
            }
            if ((var17 instanceof class280)) {
                ((class280) var17).method1961((byte) 117);
            } else {
                class80.method603(var14, 4, arg2, arg6, (var15 + 2 & 0x3) + 4, arg5, -161, class78.field1320[var15] * 8, class45.field882[var15] * 8);
            }
        } else if (var12 == 11) {
            if (var16 instanceof class280) {
                ((class280) var16).method1961((byte) 87);
            } else {
                class80.method603(var14, 10, arg2, arg6, var15 + 4, arg5, -161, 0, 0);
            }
        } else if ((var16 instanceof class280)) {
            ((class280) var16).method1961((byte) 57);
        } else {
            class80.method603(var14, var12, arg2, arg6, var15, arg5, -161, 0, 0);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V", line = 208)
    public static final void method97(int arg0, int arg1) {
        class177.field2920.method1348(arg0 ^ arg0, arg1);
        field256++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Lub;", line = 225)
    public static final class20 method98(int arg0, int arg1, int arg2) {
        class14 var3 = class93.field1690[arg0][arg1][arg2];
        return var3 == null ? null : var3.field225;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIB)Z", line = 253)
    public static final boolean method99(int arg0, int arg1, byte arg2) {
        class27 var3 = class72.method540(0, arg0);
        field254++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg2 >= -59) {
            field262 = (class40) null;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method263(arg1, 92);
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(II)V", line = 285)
    public class17(int arg0, int arg1) {
        this.field261 = arg0;
        this.field260 = arg1;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V", line = 295)
    public static final void method100(byte arg0) {
        if (arg0 < -109) {
            field259++;
            class177.field2920.method1349(true);
        }
    }
}
