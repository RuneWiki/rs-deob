import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class480 {

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Lpn;")
    public static class72 field6791 = new class72(7, 5);

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field6795 = 0;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lid;")
    public static class260 field6796 = new class260(16);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lg;")
    public static class470 field6792;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
    public static final void method2836(int arg0, int arg1, int arg2) {
        if (class15.field198 == 1) {
            class115.method565(arg0, -58, class210.field2906, arg2);
        } else if (class15.field198 == 2) {
            class144.method680(arg0, -21571, arg2);
        }
        field6793++;
        class15.field198 = arg1;
        class210.field2906 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)Z")
    public static final boolean method2837(byte arg0, int arg1) {
        field6789++;
        if (class92.field1150[arg1]) {
            return true;
        } else if (class101.field1229.method2778(arg1, (byte) -111)) {
            int var2 = class101.field1229.method2755(-101, arg1);
            if (var2 == 0) {
                class92.field1150[arg1] = true;
                return true;
            }
            if (class284.field4130[arg1] == null) {
                class284.field4130[arg1] = new class256[var2];
            }
            int var3 = 54 / ((arg0 + 18) / 52);
            for (int var4 = 0; var4 < var2; var4++) {
                if (class284.field4130[arg1][var4] == null) {
                    byte[] var5 = class101.field1229.method2768(-20472, var4, arg1);
                    if (var5 != null) {
                        class256 var6 = class284.field4130[arg1][var4] = new class256();
                        var6.field3659 = (arg1 << 16) + var4;
                        if (var5[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var6.method1579((byte) -115, new class179(var5));
                    }
                }
            }
            class92.field1150[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method2838(int arg0) {
        field6796 = null;
        field6791 = null;
        field6792 = null;
        if (arg0 != -1) {
            field6796 = null;
        }
    }
}
