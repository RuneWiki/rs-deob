import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class75 extends class283 {

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "[J")
    public static long[] field1402 = new long[100];

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lmh;")
    public static class128 field1403 = class22.method156(124, "<br>(X");

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field1404 = 0;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "[I")
    public static int[] field1408;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Llb;", line = 5)
    public static final class201 method493(int arg0, int arg1) {
        field1407++;
        class201 var2 = (class201) class47.field937.method1836((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class291.field4975.method2155(arg0, arg1, (byte) 70);
        class201 var4 = new class201();
        if (var3 != null) {
            var4.method1405(new class194(var3), arg0, (byte) 38);
        }
        class47.field937.method1835((byte) -81, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 26)
    public static void method494(byte arg0) {
        field1403 = null;
        field1402 = null;
        field1408 = null;
        int var1 = 73 / ((arg0 + 22) / 34);
    }
}
