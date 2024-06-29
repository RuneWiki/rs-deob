import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class536 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "J")
    public static long field7413 = 0L;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field7419 = 100;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lin;")
    public static class91 field7417;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "[Lmi;")
    public static class496[] field7418;

    @OriginalMember(owner = "client!bf", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field7415++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIC)I", line = 17)
    public static final int method3088(int arg0, int arg1, char arg2) {
        if (arg1 != 30316) {
            return 27;
        }
        field7414++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var4 = Character.toLowerCase(arg2);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V", line = 40)
    public static void method3089(boolean arg0) {
        field7417 = null;
        field7418 = null;
        if (!arg0) {
            method3088(110, -57, (char) 65489);
        }
    }
}
