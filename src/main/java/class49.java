import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class49 {

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field721 = -1;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[Lrg;")
    public static class248[] field717;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)Lth;")
    public static final class119 method317(byte arg0) {
        field718++;
        int var1 = 27 % ((-arg0 - 22) / 41);
        if (class262.field4272 == null) {
            return null;
        } else {
            class229.field3593.method1889(class262.field4272, -19110);
            class119 var2 = (class119) class229.field3593.method1890(false);
            class125 var3 = class223.method1550((byte) 64, var2.field1877);
            return var3 != null && var3.field2014 && var3.method865(24525) ? var2 : class146.method998(-1);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method318(int arg0) {
        if (arg0 > -57) {
            field717 = null;
        }
        field717 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Lsg;")
    public static final class172 method319(int arg0, int arg1) {
        field720++;
        class172 var2 = (class172) class242.field3836.method1879(8887, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 0) {
            byte[] var3 = class278.field4533.method1156(class299.method2059(arg0, -14505), client.method1136((byte) 26, arg0), (byte) -16);
            class172 var4 = new class172();
            var4.field2843 = arg0;
            if (var3 != null) {
                var4.method1227(new class274(var3), (byte) 68);
            }
            var4.method1216(10);
            if (var4.field2867) {
                var4.field2828 = false;
                var4.field2861 = 0;
            }
            if (!class313.field5037 && var4.field2871) {
                var4.field2857 = null;
            }
            class242.field3836.method1883((long) arg0, 115, var4);
            return var4;
        } else {
            return null;
        }
    }
}
