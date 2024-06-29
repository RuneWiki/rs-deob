import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class180 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field2895 = 0;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field2894 = 0;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2900 = " ";

    @OriginalMember(owner = "client!di", name = "g", descriptor = "[S")
    public static short[] field2899 = new short[] { 59, 42, 33, 47, 34, 9, 36, 35 };

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2904 = "Loading config - ";

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Lcc;")
    public static class216 field2902 = new class216(200);

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Z")
    public static boolean field2906 = false;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "Lva;")
    public static class35 field2907;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lbb;")
    public static class92 field2901;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method1340(int arg0) {
        field2900 = null;
        field2899 = null;
        if (arg0 < 11) {
            method1340(104);
        }
        field2904 = null;
        field2901 = null;
        field2902 = null;
        field2907 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lof;B)V")
    public static final void method1341(class274 arg0, byte arg1) {
        field2898++;
        long var2 = 0L;
        if (arg0.field4391 == 0) {
            var2 = class267.method1857(arg0.field4409, arg0.field4402, arg0.field4399);
        }
        if (arg1 != -72) {
            return;
        }
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field4391 == 1) {
            var2 = class149.method1057(arg0.field4409, arg0.field4402, arg0.field4399);
        }
        if (arg0.field4391 == 2) {
            var2 = class274.method1898(arg0.field4409, arg0.field4402, arg0.field4399);
        }
        if (arg0.field4391 == 3) {
            var2 = class250.method1787(arg0.field4409, arg0.field4402, arg0.field4399);
        }
        if (var2 != 0L) {
            var6 = ((int) var2 & 0x7C516) >> 14;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var5 = ((int) var2 & 0x311E7A) >> 20;
        }
        arg0.field4405 = var4;
        arg0.field4403 = var6;
        arg0.field4404 = var5;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBI)V")
    public static final void method1342(int arg0, byte arg1, int arg2) {
        if (arg1 > -86) {
            return;
        }
        for (int var3 = 0; var3 < class101.field1499; var3++) {
            class208 var4 = class270.method1875(0, var3);
            if (var4 != null) {
                int var5 = var4.field3335;
                if (var5 >= 0 && !class47.field689.method227(var5, -34)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field3339 >= 0) {
                    int var6 = var4.field3339;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class47.field680[class43.method328(124, var8, 96)];
                } else if (var5 >= 0) {
                    var9 = class47.field680[class43.method328(117, class47.field689.method237(var5, 65535), 96)];
                } else if (var4.field3345 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field3345;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 + arg0 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class47.field680[class43.method328(114, var12, 96)];
                }
                class121.field1767[var3 + 1] = var9;
            }
        }
        field2893++;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    public static final void method1343(int arg0) {
        field2896++;
        if (arg0 == -16020) {
            class78.field1127.method1556((byte) 114);
        }
    }
}
