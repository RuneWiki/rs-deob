import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class325 extends class96 {

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public int field4748;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "Lqa;")
    public class155 field4751;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "F")
    public static float field4745 = 1.0F;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field4746 = 0;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field4742 = -1;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "Liu;")
    public static class390 field4743 = new class390(47, 8);

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "[Li;")
    public static class30[] field4752 = new class30[5];

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "[Lau;")
    public static class497[] field4750;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I")
    public static final int method1946(int arg0, int arg1) {
        field4747++;
        int var2 = 20 % ((26 - arg1) / 40);
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method729(int arg0);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILae;)Lg;")
    public static final class102 method1947(int arg0, class156 arg1) {
        field4749++;
        if (arg0 != -1) {
            field4742 = 66;
        }
        return new class102(arg1.method936((byte) -96), arg1.method936((byte) -96), arg1.method936((byte) -96), arg1.method936((byte) -96), arg1.method943(1295851312), arg1.method943(arg0 + 1295851313), arg1.method941((byte) 124));
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V")
    public static void method1948(byte arg0) {
        field4743 = null;
        field4752 = null;
        field4750 = null;
        int var1 = 61 % ((arg0 - 14) / 60);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lqa;I)V")
    public class325(class155 arg0, int arg1) {
        this.field4748 = arg1;
        this.field4751 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)Z")
    public abstract boolean method728(int arg0);

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(Z)Ldh;")
    public static final class201 method1949(boolean arg0) {
        field4744++;
        if (arg0) {
            field4746 = -37;
        }
        try {
            return new class29();
        } catch (Throwable var2) {
            try {
                return (class201) Class.forName("at").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class433();
            }
        }
    }

    static {
        for (int var0 = 0; var0 < field4752.length; var0++) {
            field4752[var0] = new class30();
        }
    }
}
