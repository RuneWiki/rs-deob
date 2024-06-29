import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class60 {

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Ltt;")
    public static class338 field751 = new class338(16, 16);

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "F")
    public static float field753;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)I", line = 4)
    public static final int method339(int arg0, boolean arg1) {
        field749++;
        if (arg1) {
            field751 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 18)
    public static void method340(int arg0) {
        field751 = null;
        if (arg0 > -3) {
            field751 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Z", line = 33)
    public static final boolean method341(int arg0, int arg1) {
        field752++;
        if (class4.field29[arg0]) {
            return true;
        } else if (class419.field5508.method1960((byte) 121, arg0)) {
            int var2 = class419.field5508.method1939(arg1, arg0);
            if (var2 == 0) {
                class4.field29[arg0] = true;
                return true;
            }
            if (class124.field1729[arg0] == null) {
                class124.field1729[arg0] = new class423[var2];
            }
            for (int var3 = arg1; var3 < var2; var3++) {
                if (class124.field1729[arg0][var3] == null) {
                    byte[] var4 = class419.field5508.method1938(var3, arg0, arg1 - 17);
                    if (var4 != null) {
                        class423 var5 = class124.field1729[arg0][var3] = new class423();
                        var5.field5685 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2391(11, new class157(var4));
                    }
                }
            }
            class4.field29[arg0] = true;
            return true;
        } else {
            return false;
        }
    }
}
