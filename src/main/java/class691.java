import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class class691 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field9552 = 999999;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Z")
    public static boolean field9553 = false;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Z")
    public static boolean field9556 = false;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field9555;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field9557;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 3)
    public static void method3926(int arg0) {
        if (arg0 != 0) {
            field9553 = false;
        }
        field9557 = null;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 32)
    public static final void method3927(int arg0) throws IOException {
        field9554++;
        if (arg0 != 1635) {
            field9552 = -9;
        }
        if (class533.field7668 == null || class440.field6511 <= 0) {
            return;
        }
        class132.field1768.field9084 = 0;
        while (true) {
            class468 var1 = (class468) class393.field5917.method1195(arg0 - 1635);
            if (var1 == null || var1.field6840 > (class132.field1768.field9068.length - class132.field1768.field9084)) {
                class533.field7668.method849(0, class132.field1768.field9068, class132.field1768.field9084, -6197);
                class77.field1072 = 0;
                class649.field9151 += class132.field1768.field9084;
                return;
            }
            class132.field1768.method3703(0, var1.field6839.field9068, var1.field6840, 128);
            class440.field6511 -= var1.field6840;
            var1.method1304((byte) 7);
            var1.field6839.method3715(255);
            var1.method2839(122);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILte;)Lte;")
    public abstract class616 method3836(int arg0, class616 arg1);
}
