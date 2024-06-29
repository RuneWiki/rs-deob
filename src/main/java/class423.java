import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class423 extends class42 {

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public volatile int field5985 = -1;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Ljava/lang/String;")
    public volatile String field5986;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "[S")
    public static short[] field5987 = new short[256];

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "Lvr;")
    public static class92 field5984 = new class92(8, 0, 4, 1);

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 3)
    public static void method2507(byte arg0) {
        field5987 = null;
        if (arg0 <= 66) {
            field5987 = null;
        }
        field5984 = null;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 130)
    public class423(String arg0) {
        this.field5986 = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([[BZLth;)V", line = 22)
    public static final void method2508(byte[][] arg0, boolean arg1, class431 arg2) {
        if (arg1) {
            return;
        }
        for (int var3 = 0; var3 < arg2.field6023; var3++) {
            class259.method1668(8101);
            for (int var4 = 0; var4 < (class69.field1139 >> 3); var4++) {
                for (int var5 = 0; var5 < (class255.field3763 >> 3); var5++) {
                    int var6 = class320.field4754[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg2.field6006 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = (var6 & 0xFFDC35) >> 14;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class475.field6929.length; var12++) {
                                if (class475.field6929[var12] == var11 && arg0[var12] != null) {
                                    arg2.method2558(class76.field1256, var7, var5 * 8, var8, (var9 & 0x7) * 8, arg0[var12], var4 * 8, class19.field213, (var10 & 0x7) * 8, var3, -1978681722);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field5989++;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lci;BLci;)I", line = 93)
    public static final int method2509(class320 arg0, byte arg1, class320 arg2) {
        field5988++;
        int var3 = 0;
        if (arg2.method2035(class102.field1585, (byte) -94)) {
            var3++;
        }
        if (arg2.method2035(class470.field6816, (byte) -94)) {
            var3++;
        }
        if (arg2.method2035(class17.field188, (byte) -94)) {
            var3++;
        }
        if (arg0.method2035(class102.field1585, (byte) -94)) {
            var3++;
        }
        if (arg1 != -59) {
            return -23;
        }
        if (arg0.method2035(class470.field6816, (byte) -94)) {
            var3++;
        }
        if (arg0.method2035(class17.field188, (byte) -94)) {
            var3++;
        }
        return var3;
    }
}
