import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class96 extends class196 {

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field1419 = 0;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field1422 = new String[5];

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "Lfa;")
    public static class273 field1420;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IJ)V")
    public static final void method614(int arg0, long arg1) {
        field1423++;
        if ((long) arg0 >= arg1) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class22.method131(arg1 - 1L, (byte) 124);
            class22.method131(1L, (byte) 124);
        } else {
            class22.method131(arg1, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static final void method615(byte arg0) {
        class31.field393.method145(arg0 - 73);
        class201.field3195.method145(arg0 - 76);
        if (arg0 == -9) {
            field1421++;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public static void method616(int arg0) {
        field1422 = null;
        field1420 = null;
        if (arg0 != 0) {
            method615((byte) 76);
        }
    }
}
