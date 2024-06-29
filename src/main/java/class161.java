import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class161 extends class34 {

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    private int field2632 = -32768;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field2625 = 0;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Lkk;")
    public static class254 field2618 = new class254();

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "Lad;")
    public static class275 field2633 = new class275(50);

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "[J")
    public static long[] field2634 = new long[100];

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public int field2628;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILrg;IIZ)V")
    public static final void method1104(int arg0, class248 arg1, int arg2, int arg3, boolean arg4) {
        field2635++;
        int var5 = 67 / ((arg2 + 26) / 41);
        int var6 = arg1.field4057;
        int var7 = arg1.field4016;
        if (arg1.field3893 == 0) {
            arg1.field4057 = arg1.field4029;
        } else if (arg1.field3893 == 1) {
            arg1.field4057 = arg3 - arg1.field4029;
        } else if (arg1.field3893 == 2) {
            arg1.field4057 = arg1.field4029 * arg3 >> 14;
        } else if (arg1.field3893 == 3) {
            if (arg1.field4038 == 2) {
                arg1.field4057 = (arg1.field4029 - 1) * arg1.field4045 + arg1.field4029 * 32;
            } else if (arg1.field4038 == 7) {
                arg1.field4057 = arg1.field4029 * 12 + ((arg1.field4029 - 1) * arg1.field4045);
            }
        }
        if (arg1.field4040 == 0) {
            arg1.field4016 = arg1.field3911;
        } else if (arg1.field4040 == 1) {
            arg1.field4016 = arg0 - arg1.field3911;
        } else if (arg1.field4040 == 2) {
            arg1.field4016 = arg1.field3911 * arg0 >> 14;
        } else if (arg1.field4040 == 3) {
            if (arg1.field4038 == 2) {
                arg1.field4016 = (arg1.field3911 - 1) * arg1.field4030 + arg1.field3911 * 32;
            } else if (arg1.field4038 == 7) {
                arg1.field4016 = (arg1.field3911 - 1) * arg1.field4030 + arg1.field3911 * 115;
            }
        }
        if (arg1.field4040 == 4) {
            arg1.field4016 = arg1.field4057 * arg1.field4024 / arg1.field3959;
        }
        if (arg1.field3893 == 4) {
            arg1.field4057 = arg1.field4016 * arg1.field3959 / arg1.field4024;
        }
        if (class61.field881 && (client.method1126(arg1).field427 != 0 || arg1.field4038 == 0)) {
            if (arg1.field4057 < 5 && arg1.field4016 < 5) {
                arg1.field4057 = 5;
                arg1.field4016 = 5;
            } else {
                if (arg1.field4057 <= 0) {
                    arg1.field4057 = 5;
                }
                if (arg1.field4016 <= 0) {
                    arg1.field4016 = 5;
                }
            }
        }
        if (arg1.field3957 == 1337) {
            class170.field2790 = arg1;
        }
        if (arg4 && arg1.field3964 != null && arg1.field4016 != var7 || arg1.field4057 != var6) {
            class78 var8 = new class78();
            var8.field1251 = arg1;
            var8.field1265 = arg1.field3964;
            class184.field3050.method1554(5257, var8);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method1105(byte arg0, int arg1, String arg2) {
        field2627++;
        class291 var3 = class61.method389(arg1, 2, 0);
        if (arg0 == -33) {
            var3.method2009(-53);
            var3.field4774 = arg2;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V")
    public final void method102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2622++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method1106(int arg0) {
        if (arg0 != 128) {
            field2618 = null;
        }
        field2618 = null;
        field2634 = null;
        field2633 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lgi;I)V")
    public static final void method1107(class164 arg0, int arg1) {
        if (arg1 != 23651) {
            method1108(-121, 112);
        }
        class130.field2072 = arg0;
        field2621++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    public static final void method1108(int arg0, int arg1) {
        class254.field4199.method1880(-68, arg1);
        field2629++;
        if (arg0 > -72) {
            method1106(-4);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()I")
    public final int method22() {
        field2620++;
        return this.field2632;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/Object;Ltl;B)V")
    public static final void method1109(Object arg0, class69 arg1, byte arg2) {
        field2630++;
        if (arg1.field1096 == null || arg2 != 31) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field1096.peekEvent() != null; var3++) {
            class33.method250(1L, 256);
        }
        if (arg0 != null) {
            arg1.field1096.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class181 arg10) {
        field2619++;
        class32 var13 = class107.method754(-20563, this.field2628).method1083((class280) null, this.field2623, (class91) null, 0, -1, false, 0);
        if (var13 != null) {
            var13.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2632 = var13.method22();
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)Leb;")
    public static final class263 method1110(byte arg0) {
        field2624++;
        if (arg0 >= -55) {
            return null;
        }
        try {
            return (class263) Class.forName("ok").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(JLjava/lang/String;ZIBIILjava/lang/String;ZZI)V")
    public static final void method1111(long arg0, String arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6, String arg7, boolean arg8, boolean arg9, int arg10) {
        field2626++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class274 var14 = new class274(128);
        var14.method1865(10, 41);
        var14.method1824((arg2 ? 4 : 0) | (arg9 ? 2 : 0) | (arg8 ? 1 : 0), 28357);
        var14.method1840((byte) 47, arg0);
        var14.method1831(var12[0], 119690440);
        var14.method1859((byte) 58, arg1);
        var14.method1831(var12[1], 119690440);
        var14.method1824(class215.field3396, 28357);
        var14.method1865(arg3, -117);
        var14.method1865(arg6, -128);
        var14.method1831(var12[2], 119690440);
        var14.method1824(arg10, 28357);
        var14.method1824(arg5, 28357);
        var14.method1831(var12[3], 119690440);
        var14.method1818((byte) 62, class285.field4623, class292.field4789);
        class274 var15 = new class274(350);
        var15.method1859((byte) 58, arg7);
        int var16 = 8 - (class113.method784(arg7, (byte) -80) % 8);
        if (arg4 > -7) {
            return;
        }
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1865((int) (Math.random() * 255.0D), 45);
        }
        var15.method1835(var12, -53);
        class311.field5027.field4458 = 0;
        class311.field5027.method1865(22, -95);
        class311.field5027.method1824(var14.field4458 + var15.field4458 + 2, 28357);
        class311.field5027.method1824(549, 28357);
        class311.field5027.method1836(var14.field4441, 0, -106, var14.field4458);
        class311.field5027.method1836(var15.field4441, 0, -102, var15.field4458);
        class112.field1719 = 1;
        class31.field530 = 0;
        class72.field1150 = 0;
        class24.field444 = -3;
    }
}
