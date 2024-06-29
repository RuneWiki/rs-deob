import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public abstract class class304 {

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field4157 = 0;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "Ljf;")
    public static class347 field4160;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIZI)V", line = 8)
    public static final void method1843(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class306.field4192 = arg0;
        class175.field2578 = arg4;
        if (arg3) {
            field4159++;
            class251.field3522 = arg2;
            class196.field2797 = arg1;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V", line = 23)
    public static final void method1844(int arg0, int arg1) {
        class317.field4308 = arg1;
        field4158++;
        class104 var2 = class21.field367;
        synchronized (class21.field367) {
            class21.field367.method656(118);
        }
        class104 var3 = class267.field3716;
        synchronized (class267.field3716) {
            if (arg0 <= 15) {
                field4157 = 107;
            }
            class267.field3716.method656(125);
        }
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(B)V", line = 42)
    public static void method1845(byte arg0) {
        if (arg0 == 11) {
            field4160 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)I")
    public abstract int method985(byte arg0);

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)Z")
    public abstract boolean method986(byte arg0);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)C")
    public abstract char method987(int arg0);

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)I")
    public abstract int method990(int arg0);

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)J")
    public abstract long method991(int arg0);
}
