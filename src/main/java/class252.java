import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class252 {

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public int field3718;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "Ljava/lang/String;")
    public String field3719;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "Luea;")
    public static class334 field3717;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V", line = 3)
    public static void method1655(byte arg0) {
        field3717 = null;
        int var1 = -56 % ((arg0 + 66) / 46);
    }

    @OriginalMember(owner = "client!dt", name = "toString", descriptor = "()Ljava/lang/String;", line = 20)
    public final String toString() {
        field3713++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 33)
    public class252(String arg0, String arg1, int arg2) {
        this.field3718 = arg2;
        this.field3719 = arg0;
    }
}
