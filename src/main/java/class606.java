import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class606 {

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public int field8319 = 128;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public int field8318 = 128;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public int field8320;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public int field8309;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public int field8316;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public int field8315;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "[C")
    public static char[] field8314 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "S")
    public static short field8313 = 32767;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public static int field8321 = -1;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "[I")
    public static int[] field8322 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
    public static void method3445(byte arg0) {
        field8314 = null;
        field8322 = null;
        int var1 = -50 % ((37 - arg0) / 40);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZIZ)V")
    public static final void method3446(String arg0, String arg1, boolean arg2, int arg3, boolean arg4) {
        field8311++;
        class564 var5 = class209.method1438(true);
        var5.field7778.method1526(arg2, class250.field3616.field7212);
        var5.field7778.method1485((byte) 107, 0);
        int var6 = var5.field7778.field3109;
        var5.field7778.method1485((byte) 107, 634);
        int[] var7 = class216.method1549(var5, false);
        int var8 = var5.field7778.field3109;
        var5.field7778.method1481((byte) -5, arg1);
        var5.field7778.method1485((byte) 107, class601.field8259);
        var5.field7778.method1481((byte) -5, arg0);
        var5.field7778.method1540(class638.field8767, (byte) 104);
        var5.field7778.method1526(arg2, class607.field8336);
        var5.field7778.method1526(arg2, class582.field7970.field6488);
        class704.method3928(var5.field7778, (byte) 55);
        String var9 = class114.field1952;
        var5.field7778.method1526(false, var9 == null ? 0 : 1);
        if (var9 != null) {
            var5.field7778.method1481((byte) -5, var9);
        }
        var5.field7778.method1526(false, arg3);
        var5.field7778.method1526(false, arg4 ? 1 : 0);
        var5.field7778.field3109 += 7;
        var5.field7778.method1498(var8, true, var7, var5.field7778.field3109);
        var5.field7778.method1531(1809639944, var5.field7778.field3109 - var6);
        class167.method1260(2, var5);
        class547.field7542 = -3;
        class189.field2825 = 1;
        class166.field2604 = 0;
        class232.field3355 = 0;
        if (arg3 < 13) {
            class413.field6004 = true;
            class365.method2325(60);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method3447(int arg0, String arg1, int arg2) {
        if (arg0 == -20188) {
            field8312++;
            return class85.method818(-123, arg2, true, arg1);
        } else {
            return 88;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Liq;B)V")
    public final void method3448(class606 arg0, byte arg1) {
        this.field8319 = arg0.field8319;
        this.field8320 = arg0.field8320;
        this.field8318 = arg0.field8318;
        this.field8316 = arg0.field8316;
        field8317++;
        this.field8309 = arg0.field8309;
        this.field8315 = arg0.field8315;
        if (arg1 != -110) {
            method3445((byte) -93);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)Liq;")
    public final class606 method3449(boolean arg0) {
        field8310++;
        if (!arg0) {
            method3445((byte) -81);
        }
        return new class606(this.field8320, this.field8318, this.field8319, this.field8316, this.field8309, this.field8315);
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(I)V")
    public class606(int arg0) {
        this.field8320 = arg0;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IIIIII)V")
    private class606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8309 = arg4;
        this.field8316 = arg3;
        this.field8315 = arg5;
        this.field8320 = arg0;
        this.field8318 = arg1;
        this.field8319 = arg2;
    }
}
