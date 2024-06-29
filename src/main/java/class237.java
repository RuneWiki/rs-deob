import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class237 {

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "Z")
    public boolean field3138;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "Lwr;")
    public class697 field3137;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "Lwr;")
    public class697 field3139;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "Z")
    public boolean field3132;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "Z")
    public static boolean field3133;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "[Lf;")
    public static class532[] field3134;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)Z", line = 8)
    public final boolean method1464(boolean arg0) {
        if (!arg0) {
            this.field3132 = true;
        }
        field3136++;
        return this.field3132 && !this.field3138;
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(Z)V", line = 20)
    public final void method1465(boolean arg0) {
        if (this.field3137 != null) {
            this.field3137.method1758((byte) 110);
        }
        field3135++;
        this.field3132 = arg0;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V", line = 32)
    public static final void method1466(int arg0) {
        if (arg0 != 2048) {
            method1468(-12, true, -51);
        }
        class306.field4086 = null;
        class374.field4965 = null;
        class411.field5409 = null;
        field3140++;
        class637.field8801 = null;
        class392.field5243 = null;
        class196.field2683 = null;
        class421.field5522 = null;
        class226.field2942 = null;
        class450.field5946 = null;
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)V", line = 51)
    public static void method1467(int arg0) {
        field3134 = null;
        if (arg0 != 2048) {
            field3133 = true;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZI)Z", line = 66)
    public static final boolean method1468(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1466(-16);
        }
        field3131++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Z)V", line = 76)
    public class237(boolean arg0) {
        this.field3138 = arg0;
    }
}
