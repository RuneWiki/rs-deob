import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class256 {

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    public int field3695;

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "I")
    public static int field3691 = 1;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "[I")
    public static int[] field3688 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
    public static int field3693 = 0;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "Leda;")
    public static class116 field3697;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "Lbj;")
    public static class404 field3696;

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "[[I")
    public static int[][] field3692;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1626(boolean arg0) {
        field3697 = null;
        field3692 = null;
        if (!arg0) {
            field3696 = null;
            field3688 = null;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(III)V", line = 22)
    public static final void method1627(int arg0, int arg1, int arg2) {
        field3694++;
        class449 var3 = class611.method3463(arg2, (byte) -122, 6);
        var3.method2615((byte) -111);
        var3.field6472 = arg0;
        int var4 = -98 / ((73 - arg1) / 33);
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 48)
    public class256(String arg0, int arg1) {
        this.field3695 = arg1;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V", line = 62)
    public static final void method1628(int arg0) {
        field3690++;
        int var1 = class643.field9134;
        int[] var2 = class98.field1458;
        for (int var3 = 0; var3 < var1; var3++) {
            class270 var4 = class76.field1186[var2[var3]];
            if (var4 != null) {
                class631.method3561(var4.method1108(119), var4, 0);
            }
        }
        if (arg0 != 6) {
            method1626(true);
        }
    }

    @OriginalMember(owner = "client!uea", name = "toString", descriptor = "()Ljava/lang/String;", line = 92)
    public final String toString() {
        field3689++;
        throw new IllegalStateException();
    }
}
