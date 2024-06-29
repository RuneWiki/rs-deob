import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class288 {

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4359 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Ls;")
    public static class196 field4360 = new class196(8);

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Z")
    public static boolean field4363 = false;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Lg;")
    public static class67 field4362 = new class67(64);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lad;")
    private class342 field4356;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lv;")
    private class77 field4358;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 4)
    public static void method2078(int arg0) {
        field4359 = null;
        if (arg0 != 10111) {
            method2081(12);
        }
        field4362 = null;
        field4360 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Lv;", line = 24)
    public final class77 method2079(boolean arg0) {
        field4354++;
        class77 var2 = this.field4358;
        if (!arg0) {
            this.method2079(false);
        }
        if (this.field4356.field5295 == var2) {
            this.field4358 = null;
            return null;
        } else {
            this.field4358 = var2.field1127;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lad;B)V", line = 45)
    public final void method2080(class342 arg0, byte arg1) {
        if (arg1 <= 52) {
            method2081(72);
        }
        this.field4356 = arg0;
        field4357++;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 67)
    public static final void method2081(int arg0) {
        class320.field4814.method458((byte) -77);
        if (arg0 > 64) {
            class148.field2130.method458((byte) -118);
            field4355++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Lv;", line = 85)
    public final class77 method2082(int arg0) {
        field4361++;
        if (arg0 != 64) {
            method2078(-43);
        }
        class77 var2 = this.field4356.field5295.field1127;
        if (this.field4356.field5295 == var2) {
            this.field4358 = null;
            return null;
        } else {
            this.field4358 = var2.field1127;
            return var2;
        }
    }
}
