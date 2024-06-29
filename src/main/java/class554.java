import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class554 {

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "Ltca;")
    public static class174 field7660 = new class174();

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "[[[I")
    public static int[][][] field7662;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)[Lec;")
    public static final class236[] method3187(int arg0) {
        if (arg0 != 20000) {
            field7662 = null;
        }
        field7658++;
        return new class236[] { class453.field6388, class581.field7964, class469.field6577 };
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)V")
    public static void method3188(byte arg0) {
        field7660 = null;
        field7662 = null;
        int var1 = -116 / ((6 - arg0) / 60);
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(I)V")
    public static final void method3189(int arg0) {
        field7657++;
        if (arg0 != 9013) {
            method3188((byte) 86);
        }
        for (class7 var1 = (class7) class581.field7954.method1469(0); var1 != null; var1 = (class7) class581.field7954.method1467(0)) {
            if (var1.field51) {
                var1.field51 = false;
            } else {
                class624.method3561((byte) -94, var1.field52);
            }
        }
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)J")
    public static final synchronized long method3190(int arg0) {
        if (arg0 > -52) {
            return -121L;
        }
        field7659++;
        long var1 = System.currentTimeMillis();
        if (var1 < class515.field7157) {
            class177.field2727 += class515.field7157 - var1;
        }
        class515.field7157 = var1;
        return class177.field2727 + var1;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BII)I")
    public static final int method3191(byte arg0, int arg1, int arg2) {
        field7661++;
        byte var3;
        if (arg2 > 20000) {
            class405.method2525(120);
            var3 = 4;
        } else if (arg2 > 10000) {
            var3 = 3;
            class439.method2649((byte) -59);
        } else if (arg2 <= 5000) {
            class76.method709(0, true);
            var3 = 1;
        } else {
            var3 = 2;
            class670.method3765(true);
        }
        if (class693.field9368.field4468.method1099(-32350) != arg1) {
            class693.field9368.method2065((byte) 74, class693.field9368.field4448, arg1);
            class171.method1284(false, (byte) 122, arg1);
        }
        if (arg0 >= -20) {
            field7660 = null;
        }
        class310.method2019(37);
        return var3;
    }
}
