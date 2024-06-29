import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class418 extends class359 {

    @OriginalMember(owner = "client!no", name = "u", descriptor = "Lae;")
    public static class135 field6008 = new class135(5000);

    @OriginalMember(owner = "client!no", name = "A", descriptor = "Ljava/lang/String;")
    public static String field6014 = " has logged out.";

    @OriginalMember(owner = "client!no", name = "z", descriptor = "I")
    public static int field6013 = 1;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "I")
    public static int field6011 = 0;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "Ldc;")
    public static class3 field6010 = new class3(0, -1);

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public int field5996;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public int field5997;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public int field5998;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public int field5999;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public int field6000;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public int field6001;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public int field6002;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public int field6003;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public int field6004;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public int field6005;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "I")
    public int field6007;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "I")
    public int field6012;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "Ljq;")
    public static class299 field6006;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V", line = 4)
    public static final void method2599(byte arg0) {
        field6009++;
        if (arg0 != 118) {
            method2600(40);
        }
        class19.field204 = -1;
        class196.field2672 = null;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V", line = 29)
    public static void method2600(int arg0) {
        field6008 = null;
        field6014 = null;
        if (arg0 != 9985) {
            field6011 = 122;
        }
        field6006 = null;
        field6010 = null;
    }
}
