import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class176 {

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "[Lfl;")
    public static class630[] field2521 = new class630[16];

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Lej;")
    public static class104 field2520 = new class104("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "J")
    public long field2524;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Lik;")
    public class176 field2516;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Lik;")
    public class176 field2519;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1116(String arg0, boolean arg1) {
        class56.method513("", (byte) -12, 0, 0, "", arg0);
        if (arg1) {
            field2515++;
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V")
    public final void method1117(int arg0) {
        field2522++;
        if (this.field2519 == null) {
            return;
        }
        this.field2519.field2516 = this.field2516;
        this.field2516.field2519 = this.field2519;
        this.field2516 = null;
        if (arg0 == 0) {
            this.field2519 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIII)V")
    public static final void method1118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2525++;
        if (class491.field6875.field3372 != 0 && arg3 != 0 && class202.field2830 < 50 && arg5 != -1) {
            class233.field3289[class202.field2830++] = new class640((byte) 1, arg5, arg3, arg4, arg2, arg0);
        }
        if (arg1 <= 37) {
            field2521 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
    public static final void method1119(int arg0) {
        field2517++;
        if (class465.field6552) {
            return;
        }
        class494.field6921 = true;
        class465.field6552 = true;
        if (class491.field6875.field3369) {
            class1.field13 = ((int) class1.field13 - 65 & 0xFFFFFF80);
        } else {
            class309.field4169 += (-24.0F - class309.field4169) / 2.0F;
        }
        if (arg0 <= 26) {
            field2521 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)Z")
    public final boolean method1120(int arg0) {
        field2526++;
        if (this.field2519 == null) {
            return false;
        } else {
            if (arg0 != 0) {
                this.method1120(-22);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Z")
    public static final boolean method1121(int arg0, int arg1, int arg2) {
        field2523++;
        if (arg0 == 458752) {
            return class391.method2353(92, arg1, arg2) | (arg1 & 0x70000) != 0 || class6.method39(-50, arg1, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)V")
    public static void method1122(int arg0) {
        field2520 = null;
        if (arg0 == 0) {
            field2521 = null;
        }
    }
}
