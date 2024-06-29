import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class120 {

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "[Lwf;")
    private class1[] field1813;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Z")
    public static boolean field1808 = false;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1816 = 0;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Lte;")
    public static class79 field1812 = new class79();

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "F")
    public static float field1811;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lrf;")
    public static class289 field1814;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "Llh;")
    public static class295 field1817;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "[Lmc;")
    public static class201[] field1809;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Lia;")
    public static final class231 method760(int arg0, int arg1, int arg2) {
        class270 var3 = class33.field487[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class231 var4 = var3.field4068;
            var3.field4068 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public static void method761(boolean arg0) {
        field1814 = null;
        if (arg0) {
            method761(true);
        }
        field1812 = null;
        field1809 = null;
        field1817 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BII)Lje;")
    public static final class187 method762(byte arg0, int arg1, int arg2) {
        class187 var3 = (class187) class59.field936.method1666((long) arg2 | (long) arg1 << 32, (byte) 111);
        field1810++;
        if (var3 == null) {
            var3 = new class187(arg1, arg2);
            class59.field936.method1663(var3.field1321, var3, -114);
        }
        int var4 = -66 / ((-arg0 - 34) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I)V")
    public class120(int arg0) {
        this.field1813 = new class1[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class1 var3 = this.field1813[var2] = new class1();
            var3.field5 = var3;
            var3.field7 = var3;
        }
    }
}
