import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class308 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public int field4907 = -1;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public int field4915 = -1;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "Lta;")
    public static class300 field4913 = new class300(128);

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field4916 = 0;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Lwf;")
    public static class250 field4909;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "[I")
    public int[] field4911;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "[Llj;")
    public static class5[] field4917;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "[[I")
    public static int[][] field4912;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lqm;III)V", line = 6)
    private final void method2189(class227 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field4915 = arg0.method1765(true);
        } else if (arg2 == 2) {
            this.field4911 = new int[arg0.method1720((byte) -116)];
            for (int var5 = 0; var5 < this.field4911.length; var5++) {
                this.field4911[var5] = arg0.method1765(true);
            }
        } else if (arg2 == 3) {
            this.field4907 = arg0.method1720((byte) -84);
        }
        if (arg1 <= -44) {
            field4914++;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lth;I)V", line = 39)
    public static final void method2190(class57 arg0, int arg1) {
        field4908++;
        if (arg1 > -3) {
            field4909 = (class250) null;
        }
        class191.field3060 = arg0;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lqm;II)V", line = 60)
    public final void method2191(class227 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1720((byte) -78);
            if (var4 == 0) {
                if (arg1 > -69) {
                    return;
                }
                field4910++;
                return;
            }
            this.method2189(arg0, -110, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V", line = 79)
    public static void method2192(boolean arg0) {
        field4913 = null;
        field4917 = null;
        field4909 = null;
        if (!arg0) {
            field4912 = (int[][]) null;
        }
    }
}
