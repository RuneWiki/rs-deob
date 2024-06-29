import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class284 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "[I")
    public static int[] field4296 = new int[25];

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Lhb;")
    public static class318 field4295 = new class318(64);

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field4297 = 0;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field4299 = 0;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field4298 = 2;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Lfa;")
    public static class95 field4294;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)I", line = 6)
    public static final int method1978(int arg0, int arg1, int arg2) {
        if (arg1 <= 82) {
            return -51;
        } else {
            int var3 = arg0 - 1 & arg2 >> 31;
            field4293++;
            return ((arg2 >>> 31) + arg2) % arg0 + var3;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 22)
    public static final void method1979(int arg0) {
        field4292++;
        if (!class80.method540(19) && class54.field675 != class180.field2697) {
            class30.method196(class114.field1750.field1516[0], class302.field4613, class114.field1750.field1541[0], false, class66.field859, 0, class180.field2697);
            return;
        }
        if (class198.field2972 != class180.field2697 && class97.method690(true, class180.field2697)) {
            class198.field2972 = class180.field2697;
            class243.method1649(-4);
        }
        if (arg0 > -122) {
            method1978(108, 77, 67);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)Lna;", line = 55)
    public static final class22 method1980(int arg0, byte arg1) {
        field4291++;
        class22 var2 = (class22) class154.field2317.method2180((long) arg0, (byte) 31);
        if (var2 != null) {
            return var2;
        } else if (arg1 < 67) {
            return (class22) null;
        } else {
            byte[] var3 = class13.field150.method1441(class169.method1186(arg0, 0), (byte) -44, class80.method538(-125, arg0));
            class22 var4 = new class22();
            var4.field331 = arg0;
            if (var3 != null) {
                var4.method148(new class263(var3), -125);
            }
            var4.method153(true);
            if (var4.field333) {
                var4.field332 = 0;
                var4.field301 = false;
            }
            if (!class96.field1445 && var4.field334) {
                var4.field315 = null;
            }
            class154.field2317.method2175((long) arg0, var4, 52);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V", line = 100)
    public static void method1981(int arg0) {
        int var1 = 62 % ((arg0 + 10) / 43);
        field4294 = null;
        field4295 = null;
        field4296 = null;
    }
}
