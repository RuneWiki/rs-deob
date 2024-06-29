import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class761 {

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "Lus;")
    public static class328 field10598 = new class328(37, 8);

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field10599;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field10600;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "J")
    public static long field10597;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "Lvm;")
    public static class208 field10601;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Lof;")
    public static final class456 method4234(int arg0, int arg1, int arg2) {
        class73 var3 = class495.field7002[arg0][arg1][arg2];
        return var3 == null ? null : var3.field969;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZII)I")
    public final int method4235(boolean arg0, int arg1, int arg2) {
        field10599++;
        int var4 = class599.field8320 <= arg1 ? arg1 : class599.field8320;
        if (arg0) {
            method4234(36, -40, -75);
        }
        if (class528.field7446 == this) {
            return 0;
        } else if (class494.field6997 == this) {
            return var4 - arg2;
        } else if (class471.field6761 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
    public static void method4236(int arg0) {
        field10601 = null;
        field10598 = null;
        if (arg0 <= 13) {
            method4236(-98);
        }
    }

    @OriginalMember(owner = "client!gq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10600++;
        throw new IllegalStateException();
    }
}
