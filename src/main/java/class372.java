import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class372 {

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "Z")
    public static boolean field5312 = false;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public int field5307;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public int field5309;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public int field5314;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)I")
    public static final int method2246(int arg0) {
        int var1 = -27 / ((80 - arg0) / 44);
        field5308++;
        return class27.field400.method3385((byte) 0);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILvg;)Ljava/lang/String;")
    public static final String method2247(int arg0, class49 arg1) {
        field5310++;
        if (client.method1767(arg1).method974(-2090995594) == 0) {
            return null;
        } else if (arg1.field1012 == null || arg1.field1012.trim().length() == 0) {
            return class681.field9611 ? "Hidden-use" : null;
        } else {
            if (arg0 >= -75) {
                method2248(-33, null);
            }
            return arg1.field1012;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2248(int arg0, byte[] arg1) {
        field5313++;
        if (arg0 != 1) {
            method2249(0, null, (byte) -42, null);
        }
        class695 var2 = new class695(arg1);
        int var3 = var2.method3826(false);
        int var4 = var2.method3880(arg0 + 7);
        if (var4 < 0 || !(class188.field2711 == 0 || class188.field2711 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method3876((byte) 127, var5, 0, var4);
            return var5;
        } else {
            int var6 = var2.method3880(8);
            if (var6 < 0 || class188.field2711 != 0 && class188.field2711 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class13.method68(var7, var6, arg1, var4, 9);
            } else {
                class66 var8 = class424.field6161;
                synchronized (class424.field6161) {
                    class424.field6161.method670(var7, var2, (byte) 120);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)V")
    public static final void method2249(int arg0, String arg1, byte arg2, String arg3) {
        class460.field6579 = 2;
        int var4 = 60 % ((arg2 - 33) / 49);
        class689.field9707 = arg0;
        field5311++;
        class296.method1912(false, arg3, arg1, false);
    }
}
