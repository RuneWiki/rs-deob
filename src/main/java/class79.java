import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class79 {

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[I")
    public static int[] field1316 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lmh;")
    public static class59 field1317 = new class59(0, 0);

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "S")
    public short field1311;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Z")
    public boolean field1312;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Z")
    public boolean field1314;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Z")
    public boolean field1315;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Z")
    public boolean field1318;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method640(byte arg0) {
        field1317 = null;
        if (arg0 != -85) {
            method641(true, (byte[]) null, -81);
        }
        field1316 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
    public static final Object method641(boolean arg0, byte[] arg1, int arg2) {
        field1313++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > arg2 && !class277.field4405) {
            try {
                class235 var3 = (class235) Class.forName("ch").getDeclaredConstructor().newInstance();
                var3.method705(arg1, true);
                return var3;
            } catch (Throwable var4) {
                class277.field4405 = true;
            }
        }
        return arg0 ? class164.method1183(arg1, -843) : arg1;
    }
}
