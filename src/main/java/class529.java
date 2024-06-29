import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class529 {

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "Liba;")
    public static class211 field7807 = new class211(5, 4);

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "Lvea;")
    public static class305 field7808 = new class305();

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "[I")
    public static int[] field7809 = new int[2];

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lps;III)V", line = 11)
    public static final void method3070(class5 arg0, int arg1, int arg2, int arg3) {
        field7805++;
        if (class188.field2561 != null || class683.field9638 || arg0 == null || class473.method2724(126, arg0) == null) {
            return;
        }
        class188.field2561 = arg0;
        class272.field3554 = class473.method2724(120, arg0);
        class230.field3048 = arg1;
        class581.field8459 = arg3;
        class684.field9657 = false;
        if (arg2 <= 24) {
            field7808 = null;
        }
        class323.field4703 = 0;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)V", line = 39)
    public static void method3071(byte arg0) {
        field7807 = null;
        int var1 = -3 % ((9 - arg0) / 39);
        field7809 = null;
        field7808 = null;
    }

    @OriginalMember(owner = "client!pca", name = "toString", descriptor = "()Ljava/lang/String;", line = 51)
    public final String toString() {
        field7806++;
        throw new IllegalStateException();
    }
}
