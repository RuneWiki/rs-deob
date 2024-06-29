import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class39 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Ljj;")
    public static class134 field474;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field476;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[[I")
    public static int[][] field473;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public static final void method305(boolean arg0) {
        class157.field2523 = -3;
        class203.field3268 = arg0;
        class7.field88 = 0;
        class114.field1957 = 0;
        field472++;
        class201.field3237 = 0;
        class200.field3229 = -1;
        class274.field4425 = 1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
    public static final void method306(int arg0, int arg1) {
        field475++;
        class246.field3947.method1832(arg1, (byte) 125);
        class57.field794.method1832(arg1, (byte) 84);
        class113.field1936.method1832(arg1, (byte) 108);
        if (arg0 != 0) {
            field473 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)V")
    public static void method307(boolean arg0) {
        field476 = null;
        if (arg0) {
            method307(true);
        }
        field473 = null;
        field474 = null;
    }
}
