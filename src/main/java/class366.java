import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public abstract class class366 {

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "Ler;")
    public class92 field5742;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "Lui;")
    public static class210 field5744 = new class210(11, 0, 1, 2);

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field5745 = new String[5];

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "F")
    public static float field5746;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "[I")
    public static int[] field5747;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2424(byte arg0) {
        int var1 = -3 % ((arg0 + 31) / 57);
        field5743++;
        class246.field3927 = true;
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Ler;)V", line = 17)
    public class366(class92 arg0) {
        this.field5742 = arg0;
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V", line = 30)
    public static void method2425(int arg0) {
        field5747 = null;
        field5745 = null;
        int var1 = 30 % ((arg0 - 48) / 55);
        field5744 = null;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZI)V")
    public abstract void method1133(boolean arg0, int arg1);

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
    public abstract void method1132(int arg0);

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZZ)V")
    public abstract void method1131(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1137(boolean arg0);

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILep;I)V")
    public abstract void method1130(int arg0, class386 arg1, int arg2);

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)V")
    public abstract void method1136(int arg0, int arg1, int arg2);
}
