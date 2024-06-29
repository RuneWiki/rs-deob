import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class448 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public int field6345;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lug;")
    public class305 field6343;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Ljc;")
    public class448 field6340;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lqs;")
    public static class45 field6339;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[Ldp;")
    public static class319[] field6346;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V", line = 4)
    public static final void method2646(int arg0, int arg1) {
        class400 var2 = class269.field3975;
        synchronized (class269.field3975) {
            class269.field3975.method2389(false, arg1);
        }
        int var3 = 103 % ((arg0 - 9) / 32);
        field6341++;
        class400 var4 = class452.field6417;
        synchronized (class452.field6417) {
            class452.field6417.method2389(false, arg1);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 23)
    public final void method2647(boolean arg0) {
        if (arg0) {
            return;
        }
        field6344++;
        if (class271.field4081 >= 500) {
            return;
        }
        this.field6340 = class115.field1608;
        this.field6345 = 0;
        this.field6343 = null;
        class115.field1608 = this;
        class271.field4081++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V", line = 45)
    public static final void method2648(int arg0, int arg1, int arg2, int arg3) {
        field6342++;
        class186 var4 = class275.method1789(arg1, (byte) 123, arg0);
        var4.method1285(0);
        var4.field2829 = arg2;
        var4.field2819 = arg3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 59)
    public static void method2649(int arg0) {
        field6339 = null;
        field6346 = null;
        if (arg0 <= 87) {
            method2648(-17, -75, 33, 72);
        }
    }
}
