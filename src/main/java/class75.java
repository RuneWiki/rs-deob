import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class class75 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field1441 = 0;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Loc;")
    public static class151 field1443 = class137.method873(2, ":");

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static void method487(byte arg0) {
        if (arg0 != -118) {
            field1441 = 61;
        }
        field1443 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lwa;I)Lpc;")
    public static final class161 method488(class229 arg0, int arg1) {
        field1444++;
        if (arg1 == 22341) {
            class161 var2 = new class161();
            var2.field2901 = arg0.method1490((byte) 73);
            var2.field2916 = class15.method124(-1, var2.field2901);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([BI)V")
    public abstract void method397(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)[B")
    public abstract byte[] method398(int arg0);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILsd;I)Z")
    public static final boolean method489(int arg0, class192 arg1, int arg2) {
        int var3 = 50 / ((arg2 + 21) / 54);
        byte[] var4 = arg1.method1200((byte) 81, arg0);
        field1442++;
        if (var4 == null) {
            return false;
        } else {
            class133.method818(var4, (byte) 56);
            return true;
        }
    }
}
