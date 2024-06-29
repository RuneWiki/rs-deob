import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class321 {

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Lvq;")
    public static class22 field4640 = new class22();

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field4641 = 255;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field4642 = -1;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)Lqf;", line = 5)
    public static final class389 method2140(int arg0, byte arg1) {
        field4639++;
        class18 var2 = class83.field1360;
        class389 var4;
        synchronized (class83.field1360) {
            int var3 = -13 % ((-arg1 - 53) / 54);
            var4 = (class389) class83.field1360.method103(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = class308.field4493.method1355(class447.method2798(0, arg0), -12607, class176.method1363(arg0, (byte) -128));
        class389 var6 = new class389();
        var6.field5589 = arg0;
        if (var5 != null) {
            var6.method2462(0, new class37(var5));
        }
        class18 var7 = class83.field1360;
        synchronized (class83.field1360) {
            class83.field1360.method113(var6, 0, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 34)
    public static void method2141(byte arg0) {
        if (arg0 != -82) {
            method2141((byte) -60);
        }
        field4640 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)I", line = 44)
    public static final int method2142(int arg0, int arg1) {
        field4638++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        if (arg0 != -997880092) {
            method2143(-84, -79, 16);
        }
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)Ljs;", line = 64)
    public static final class148 method2143(int arg0, int arg1, int arg2) {
        class168 var3 = class443.field6447[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2510;
    }
}
