import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class238 {

    @OriginalMember(owner = "client!bja", name = "d", descriptor = "F")
    public static float field3075;

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!bja", name = "c", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!bja", name = "e", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!bja", name = "f", descriptor = "Ljava/lang/Thread;")
    public static Thread field3077;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "[[Lgaa;")
    public static class460[][] field3072;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(B)V")
    public static void method1489(byte arg0) {
        field3077 = null;
        if (arg0 > -39) {
            method1490(52);
        }
        field3072 = null;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V")
    public static final void method1490(int arg0) {
        field3076++;
        class323.field4125 = new class460[class456.field6390.method3816(-125)][];
        if (arg0 != 7) {
            field3077 = null;
        }
        field3072 = new class460[class456.field6390.method3816(-126)][];
        class499.field7058 = new boolean[class456.field6390.method3816(arg0 ^ 0xFFFFFF85)];
    }

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "(B)V")
    public static final void method1491(byte arg0) {
        if (arg0 < 86) {
            method1490(2);
        }
        field3074++;
        if (class668.field9150 == 7) {
            class650.method3509(false, (byte) -74);
        } else {
            class696.field9858 = class426.field6057;
            class426.field6057 = null;
            class614.method3369(13, (byte) -62);
        }
    }
}
