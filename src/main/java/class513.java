import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class513 {

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Lqk;")
    public static class148 field7160 = new class148(77, 4);

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "[I")
    public static int[] field7162 = new int[2048];

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "[Lnea;")
    public static class154[] field7163 = new class154[14];

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "[Z")
    public static boolean[] field7167 = new boolean[100];

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "J")
    public long field7166;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "Ltq;")
    public class513 field7164;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "Ltq;")
    public class513 field7165;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V", line = 5)
    public static final void method3063(int arg0) {
        field7158++;
        class651.field9207 = new class220(8);
        class502.field7021 = 0;
        for (class198 var1 = (class198) class335.field4303.method1945(false); var1 != null; var1 = (class198) class335.field4303.method1944(9408)) {
            var1.method1348();
        }
        if (arg0 <= 58) {
            method3063(-90);
        }
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)Z", line = 33)
    public final boolean method3064(int arg0) {
        if (arg0 == 10343) {
            field7159++;
            return this.field7164 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)V", line = 49)
    public final void method3065(int arg0) {
        field7161++;
        if (this.field7164 == null) {
            return;
        }
        this.field7164.field7165 = this.field7165;
        this.field7165.field7164 = this.field7164;
        if (arg0 != -17363) {
            method3063(58);
        }
        this.field7164 = null;
        this.field7165 = null;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)V", line = 72)
    public static void method3066(byte arg0) {
        field7163 = null;
        field7162 = null;
        if (arg0 <= -99) {
            field7160 = null;
            field7167 = null;
        }
    }
}
