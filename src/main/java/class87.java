import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class87 extends class95 {

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "Lub;")
    public class21 field1378;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "Lsf;")
    private static class108 field1375 = class140.method973(255, "Loaded fonts");

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "Lsf;")
    public static class108 field1377 = class140.method973(255, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field1379 = 0;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "Lsf;")
    private static class108 field1380 = class140.method973(255, " has logged in)3");

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "Lsf;")
    public static class108 field1373 = field1380;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "Lsf;")
    public static class108 field1374 = field1375;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field1382 = 0;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "Z")
    public static boolean field1381 = false;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 15)
    public static void method598(int arg0) {
        field1380 = null;
        field1377 = null;
        field1373 = null;
        field1375 = null;
        if (arg0 == 0) {
            field1374 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lub;)V", line = 28)
    public class87(class21 arg0) {
        this.field1378 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILsf;)I", line = 40)
    public static final int method599(int arg0, class108 arg1) {
        if (arg0 != 12904) {
            field1382 = 96;
        }
        field1376++;
        return arg1.method776(0) + 1;
    }
}
