import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class58 extends class481 {

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field728 = 0;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
    public static int[] field729 = new int[50];

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field735 = -1;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLgn;I)V", line = 4)
    public static final void method299(byte arg0, class187 arg1, int arg2) {
        field732++;
        int var3 = -1;
        int var4 = 0;
        if (arg1.field2509 > class204.field2796) {
            class297.method1876(7462, arg1);
        } else if (arg1.field2508 >= class204.field2796) {
            class471.method2786(127, arg1);
        } else {
            class146.method693(arg1, false, -1);
            var3 = class451.field6375;
            var4 = class122.field1517;
        }
        if (arg1.field1008 < 128 || arg1.field1005 < 128 || arg1.field1008 >= (class159.field1895 - 1) * 128 || arg1.field1005 >= ((class289.field4316 - 1) * 128)) {
            arg1.field2485 = -1;
            arg1.field2508 = 0;
            var4 = 0;
            var3 = -1;
            arg1.field2509 = 0;
            arg1.field2449 = -1;
            arg1.field1008 = arg1.field2539[0] * 128 + (arg1.method1012(false) * 64);
            arg1.field1005 = arg1.field2536[0] * 128 + (arg1.method1012(false) * 64);
            arg1.method1014(-87);
        }
        if (class19.field258 == arg1 && (arg1.field1008 < 1536 || arg1.field1005 < 1536 || arg1.field1008 >= (class159.field1895 - 12) * 128 || (class289.field4316 - 12) * 128 <= arg1.field1005)) {
            var4 = 0;
            var3 = -1;
            arg1.field2508 = 0;
            arg1.field2485 = -1;
            arg1.field2509 = 0;
            arg1.field2449 = -1;
            arg1.field1008 = arg1.field2539[0] * 128 + (arg1.method1012(false) * 64);
            arg1.field1005 = arg1.field2536[0] * 128 + arg1.method1012(false) * 64;
            arg1.method1014(-52);
        }
        int var5 = 37 / ((-arg0 - 9) / 46);
        int var6 = class328.method1992((byte) 121, arg1);
        class39.method201(arg1, var4, 4735, var6, var3);
        class373.method2254(49, arg1);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 67)
    public static final void method300(int arg0) {
        field730++;
        class73.field890 = 0;
        if (arg0 > -80) {
            method301(104L, (byte) 3);
        }
        class158.field1886 = -1;
        class4.field52 = -1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(JB)V", line = 80)
    public static final void method301(long arg0, byte arg1) {
        field733++;
        class230.field3185.field2206 = 0;
        class230.field3185.method909(class214.field2953.field4563, -1);
        class230.field3185.method929((byte) 101, arg0);
        class233.field3243 = 0;
        class56.field714 = 1;
        int var3 = -97 % ((-arg1 - 19) / 37);
        class468.field6575 = -3;
        class75.field902 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V", line = 96)
    public static final void method302(int arg0, int arg1) {
        if (!class82.field992) {
            arg0 = -1;
        }
        field731++;
        if (class366.field5237 == arg0) {
            return;
        }
        if (arg1 != -15794) {
            method304(-125);
        }
        if (arg0 != -1) {
            class212 var2 = class319.field4642.method1832(arg0, true);
            class473 var3 = var2.method1183(0);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class42.field512.method2150(var3.method2801(), var3.method2791(), var3.method2796(), class126.field1542, (byte) -36, new Point(var2.field2928, var2.field2932));
                class366.field5237 = arg0;
            }
        }
        if (arg0 == -1 && class366.field5237 != -1) {
            class42.field512.method2150((int[]) null, -1, -1, class126.field1542, (byte) -36, new Point());
            class366.field5237 = -1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lab;B)V", line = 138)
    public static final void method303(class256 arg0, byte arg1) {
        if (arg1 != -89) {
            field729 = null;
        }
        field736++;
        class256 var2 = class4.method30((byte) 114, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class464.field6541;
            var4 = class110.field1336;
        } else {
            var3 = var2.field3707;
            var4 = var2.field3597;
        }
        class92.method458(false, arg0, -29507, var4, var3);
        class60.method311(arg0, var4, (byte) 119, var3);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 174)
    public static void method304(int arg0) {
        if (arg0 != 0) {
            field735 = -71;
        }
        field729 = null;
    }
}
