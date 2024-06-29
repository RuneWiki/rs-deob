import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class724 extends class254 {

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "[Lbq;")
    public class290[] field10109;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field10105 = -1;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field10111 = 0;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "F")
    public static float field10112 = 0.0F;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field10104;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field10110;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "[[I")
    public static int[][] field10107;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method4084(boolean arg0) {
        field10104++;
        if (arg0 || !class95.field1355) {
            return;
        }
        while (true) {
            while (class193.field2932 < class124.field1669.length) {
                class218 var1 = class124.field1669[class193.field2932];
                if (var1 != null && var1.field3209 == -1) {
                    if (class60.field862 == null) {
                        class60.field862 = class720.field10102.method1276(var1.field3214, 256);
                    }
                    int var2 = class60.field862.field3689;
                    if (var2 == -1) {
                        return;
                    }
                    class60.field862 = null;
                    class193.field2932++;
                    var1.field3209 = var2;
                } else {
                    class193.field2932++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BII)Z", line = 44)
    public static final boolean method4085(byte arg0, int arg1, int arg2) {
        field10106++;
        if (arg0 < 23) {
            field10111 = 15;
        }
        return (arg2 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lns;I)V", line = 55)
    public static final void method4086(class405 arg0, int arg1) {
        field10108++;
        if (arg1 != 52) {
            return;
        }
        if (arg0 instanceof class282) {
            class282 var2 = (class282) arg0;
            if (var2.field4008 != null) {
                class454.method2779(var2, class130.field1749.field8429 != var2.field8429, (byte) 100);
                return;
            }
        } else if ((arg0 instanceof class689)) {
            class689 var3 = (class689) arg0;
            class184.method1302(class130.field1749.field8429 != var3.field8429, (byte) 37, var3);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "([Lbq;)V", line = 96)
    public class724(class290[] arg0) {
        this.field10109 = arg0;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V", line = 105)
    public static final void method4087(byte arg0) {
        field10110++;
        class106 var1 = class671.field9364;
        synchronized (class671.field9364) {
            class671.field9364.method800(96);
        }
        if (arg0 > -60) {
            method4084(true);
        }
        class106 var2 = class391.field5893;
        synchronized (class391.field5893) {
            class391.field5893.method800(118);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 121)
    public static void method4088(int arg0) {
        if (arg0 != 3617) {
            field10112 = 0.044756755F;
        }
        field10107 = null;
    }
}
