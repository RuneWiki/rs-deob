import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class131 extends class76 {

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Z")
    public static boolean field1793 = true;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1797 = "";

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lvm;")
    public static class297 field1798;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 5)
    public static void method935(int arg0) {
        if (arg0 == 1) {
            field1798 = null;
            field1797 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZLkm;III)V", line = 21)
    public static final void method936(boolean arg0, boolean arg1, class133 arg2, int arg3, int arg4, int arg5) {
        class278.field4179 = 1;
        if (arg1) {
            field1794 = 76;
        }
        field1791++;
        class106.field1437 = arg5;
        class119.field1618 = 10000;
        class188.field2599 = arg0;
        class100.field1383 = arg2;
        class329.field4963 = arg3;
        class290.field4320 = arg4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)[Ltj;", line = 51)
    public static final class258[] method937(byte arg0) {
        field1795++;
        class258[] var1 = new class258[class342.field5121];
        for (int var2 = 0; var2 < class342.field5121; var2++) {
            var1[var2] = new class258(class154.field2136, class194.field2674, class209.field3002[var2], class274.field4115[var2], class323.field4903[var2], class288.field4281[var2], class209.field3012[var2], class235.field3331);
        }
        if (arg0 != -112) {
            method938(-101L, true);
        }
        class236.method1624(arg0 ^ 0xFFFFFFD0);
        return var1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(JZ)V", line = 78)
    public static final void method938(long arg0, boolean arg1) {
        if (arg1) {
            method937((byte) 26);
        }
        field1796++;
        if (arg0 != 0L) {
            class90.field1264.method2238(76, (byte) -128);
            class90.field1264.method2202(arg0, -102);
            class164.field2251++;
        }
    }
}
