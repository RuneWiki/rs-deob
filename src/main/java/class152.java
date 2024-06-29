import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class152 {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field2056 = 0;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "Lvq;")
    public static class24 field2058 = new class24(21, 3);

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1040(int arg0) {
        if (arg0 == 0) {
            class388.field5677.method161(((float) class52.field652 * 0.1F + 0.7F) * class288.field4223);
            field2059++;
            class388.field5677.method133(class166.field2194, class42.field570, class157.field2121, (float) class31.field436, (float) class359.field5215, (float) class437.field6377);
            class388.field5677.method118(class432.field6296);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)Ljg;", line = 20)
    public static final class281 method1041(int arg0, int arg1) {
        field2055++;
        if (arg0 != 0) {
            return null;
        }
        class281 var2 = (class281) class256.field3747.method2310((byte) -127, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class4.field67.method715(arg1, (byte) 74, 1);
        class281 var4 = new class281();
        var4.field4121 = arg1;
        if (var3 != null) {
            var4.method1896(-1, new class256(var3));
        }
        var4.method1895(-19578);
        if (var4.field4120 == 2 && class271.field4014.method609((long) arg1, 71) == null) {
            class271.field4014.method606(arg0 + 1, new class13(class188.field2625), (long) arg1);
            class244.field3620[class188.field2625++] = var4;
        }
        class256.field3747.method2299(true, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V", line = 58)
    public static void method1042(int arg0) {
        if (arg0 != 2) {
            field2058 = null;
        }
        field2058 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)V", line = 70)
    public static final void method1043(byte arg0, int arg1) {
        field2054++;
        if (arg0 <= 44) {
            field2058 = null;
        }
        class440.field6409.method2300(arg1, true);
        class347.field5110.method2300(arg1, true);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIB)V", line = 84)
    public static final void method1044(int arg0, int arg1, byte arg2) {
        if (arg2 != 1) {
            method1044(-70, -101, (byte) -64);
        }
        field2057++;
        class125 var3 = class56.method428(arg0, 13, -3636);
        var3.method846(26848);
        var3.field1657 = arg1;
    }
}
