import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class378 extends class42 {

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field5112 = new String[100];

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lcu;")
    public static class145 field5109 = new class145(13, 8);

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Lpc;")
    public static class473 field5113;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "[Lf;")
    public static class529[] field5111;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLql;)I")
    public static final int method2182(byte arg0, class515 arg1) {
        if (arg0 != -59) {
            return -62;
        }
        field5110++;
        int var2 = arg1.field7628;
        class20 var3 = arg1.method2600(57);
        if (arg1.field6217) {
            var2 = arg1.field7604;
        } else if (arg1.field6172 == var3.field337 || arg1.field6172 == var3.field333 || arg1.field6172 == var3.field340 || arg1.field6172 == var3.field370) {
            var2 = arg1.field7617;
        } else if (arg1.field6172 == var3.field339 || arg1.field6172 == var3.field373 || arg1.field6172 == var3.field357 || arg1.field6172 == var3.field324) {
            var2 = arg1.field7626;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)J")
    public abstract long method260(int arg0);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)I")
    public abstract int method263(byte arg0);

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)I")
    public abstract int method255(int arg0);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
    public static void method2183(boolean arg0) {
        field5109 = null;
        field5112 = null;
        if (!arg0) {
            method2182((byte) 119, null);
        }
        field5111 = null;
        field5113 = null;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)I")
    public abstract int method256(byte arg0);
}
