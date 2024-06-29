import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class101 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILpg;[BI)V")
    public static final void method592(int arg0, class142 arg1, byte[] arg2, int arg3) {
        class45 var4 = new class45();
        var4.field847 = arg2;
        var4.field3543 = arg0;
        field1866++;
        var4.field835 = 0;
        var4.field836 = arg1;
        class22 var5 = class2.field28;
        synchronized (class2.field28) {
            class2.field28.method149(arg3 ^ arg3, var4);
        }
        class8.method46(600);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Ldf;")
    public static final class35 method593(int arg0, byte arg1) {
        int var2 = 39 % ((arg1 - 14) / 39);
        class35 var3 = (class35) class114.field2084.method1206((long) arg0, -24742);
        field1867++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class115.field2105.method552(arg0, 1, 0);
        class35 var5 = new class35();
        if (var4 != null) {
            var5.method237(true, new class127(var4), arg0);
        }
        var5.method238((byte) -60);
        class114.field2084.method1208((long) arg0, 107, var5);
        return var5;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lph;")
    public static final class143 method594(int arg0) {
        field1868++;
        if (arg0 != 0) {
            method594(-79);
        }
        try {
            return (class143) Class.forName("la").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class41();
        }
    }
}
