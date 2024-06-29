import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class109 {

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "[I")
    public static int[] field1423 = new int[3];

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1421 = 0;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
    public static final void method792(byte arg0) {
        if (arg0 > -10) {
            return;
        }
        class440.field6293.method2776(false);
        field1419++;
        class310.field4100.method2776(false);
        class151.field1869.method2776(false);
        class129.field1644.method2776(false);
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)Ldi;")
    public static final class110 method793(byte arg0) {
        field1420++;
        try {
            return (class110) Class.forName("mv").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            if (arg0 >= -99) {
                field1421 = 74;
            }
            return new class388();
        }
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(B)V")
    public static void method794(byte arg0) {
        field1423 = null;
        if (arg0 > -35) {
            method792((byte) -50);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIBIILjava/lang/String;I)V")
    public static final void method795(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, String arg6, int arg7) {
        field1422++;
        class479 var8 = new class479();
        var8.field6718 = arg4;
        var8.field6717 = class543.field7882 + arg5;
        var8.field6725 = arg0;
        var8.field6721 = arg7;
        var8.field6724 = arg2;
        var8.field6722 = arg1;
        var8.field6720 = arg6;
        class74.field1107.method2071((byte) 79, var8);
        if (arg3 != 47) {
            method794((byte) -74);
        }
    }
}
