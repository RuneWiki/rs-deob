import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class126 extends class128 {

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field1984 = -1;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "[I")
    public static int[] field1995 = new int[50];

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "Z")
    public static boolean field1996 = true;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "Lag;")
    public class211 field1981;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "Lag;")
    public class211 field2000;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "Ldk;")
    public static class251 field1988;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "Ljava/lang/String;")
    public String field1986;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "Z")
    public boolean field1997;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "[I")
    public static int[] field1994;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "[Lhg;")
    public static class220[] field1985;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field1989;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILjava/lang/String;IBI)V")
    public static final void method874(int arg0, String arg1, int arg2, byte arg3, int arg4) {
        field1993++;
        class211 var5 = class32.method217(arg0, arg2, 126);
        if (var5 == null) {
            return;
        }
        if (var5.field3377 != null) {
            class126 var6 = new class126();
            var6.field1991 = arg4;
            var6.field2000 = var5;
            var6.field1986 = arg1;
            var6.field1989 = var5.field3377;
            class137.method960(200000, var6);
        }
        boolean var7 = true;
        if (var5.field3446 > 0) {
            var7 = class94.method650(var5, -16);
        }
        if (arg3 <= 1 || !var7 || !client.method2015(var5).method1527(true, arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class314.field5061.method828(118, 161);
            class4.field46++;
            class314.field5061.method1125(arg0, 255);
            class314.field5061.method1120(arg2, true);
        }
        if (arg4 == 2) {
            class314.field5061.method828(111, 5);
            class314.field5061.method1125(arg0, 255);
            class314.field5061.method1120(arg2, true);
            class238.field3815++;
        }
        if (arg4 == 3) {
            class237.field3801++;
            class314.field5061.method828(101, 199);
            class314.field5061.method1125(arg0, 255);
            class314.field5061.method1120(arg2, true);
        }
        if (arg4 == 4) {
            class314.field5061.method828(103, 174);
            class125.field1972++;
            class314.field5061.method1125(arg0, 255);
            class314.field5061.method1120(arg2, true);
        }
        if (arg4 == 5) {
            class314.field5061.method828(101, 151);
            class314.field5061.method1125(arg0, 255);
            class207.field3287++;
            class314.field5061.method1120(arg2, true);
        }
        if (arg4 == 6) {
            class314.field5061.method828(125, 85);
            class277.field4457++;
            class314.field5061.method1125(arg0, 255);
            class314.field5061.method1120(arg2, true);
        }
        if (arg4 == 7) {
            class314.field5061.method828(115, 58);
            class75.field1253++;
            class314.field5061.method1125(arg0, 255);
            class314.field5061.method1120(arg2, true);
        }
        if (arg4 == 8) {
            class314.field5061.method828(111, 50);
            class314.field5061.method1125(arg0, 255);
            class314.field5061.method1120(arg2, true);
            class270.field4346++;
        }
        if (arg4 == 9) {
            class190.field3074++;
            class314.field5061.method828(115, 132);
            class314.field5061.method1125(arg0, 255);
            class314.field5061.method1120(arg2, true);
        }
        if (arg4 == 10) {
            class296.field4736++;
            class314.field5061.method828(103, 228);
            class314.field5061.method1125(arg0, 255);
            class314.field5061.method1120(arg2, true);
        }
    }

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)V")
    public static void method875(int arg0) {
        field1985 = null;
        if (arg0 != 174) {
            method878(55, 41);
        }
        field1988 = null;
        field1995 = null;
        field1994 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2001++;
        class296 var10 = null;
        for (class296 var11 = (class296) class62.field1020.method1643((byte) -39); var11 != null; var11 = (class296) class62.field1020.method1642((byte) 83)) {
            if (var11.field4744 == arg6 && var11.field4730 == arg1 && var11.field4731 == arg3 && var11.field4740 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class296();
            var10.field4744 = arg6;
            var10.field4731 = arg3;
            var10.field4740 = arg4;
            var10.field4730 = arg1;
            class41.method273(var10, 0);
            class62.field1020.method1646(true, var10);
        }
        var10.field4732 = arg7;
        if (arg9 != 5) {
            field1988 = null;
        }
        var10.field4727 = arg8;
        var10.field4729 = arg2;
        var10.field4737 = arg0;
        var10.field4739 = arg5;
    }

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "(I)V")
    public static final void method877(int arg0) {
        field1998++;
        class314.field5061.method828(107, 64);
        class67.field1117++;
        class314.field5061.method1108(0, true);
        if (arg0 != 4) {
            field1985 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)I")
    public static final int method878(int arg0, int arg1) {
        field1990++;
        if (arg0 != 10953) {
            method878(-93, 76);
        }
        int var2 = (arg1 & 0x55555555) + (arg1 >>> 1 & 0xD5555555);
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIII)V")
    public static final void method879(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -58) {
            return;
        }
        if (class85.field1409 <= arg3 && class234.field3774 >= arg3) {
            int var5 = class123.method866(class82.field1374, arg2, (byte) 106, class259.field4188);
            int var6 = class123.method866(class82.field1374, arg1, (byte) -104, class259.field4188);
            class48.method342(var5, false, var6, arg3, arg4);
        }
        field1982++;
    }
}
