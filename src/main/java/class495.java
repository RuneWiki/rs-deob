import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class495 {

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "[S")
    public static short[] field7241 = new short[256];

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "Leo;")
    public static class423 field7238 = null;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "J")
    public static volatile long field7243 = 0L;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "Lep;")
    public static class308 field7242;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IB)I")
    public static final int method2959(int arg0, byte arg1) {
        int var2 = -39 % ((-arg1 - 2) / 61);
        field7240++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V")
    public static final void method2960(boolean arg0) {
        class362[] var1 = class89.field1243;
        synchronized (class89.field1243) {
            int var2 = 0;
            if (!arg0) {
                field7243 = -45L;
            }
            while (true) {
                if (class89.field1243.length <= var2) {
                    break;
                }
                class89.field1243[var2] = new class362();
                class18.field320[var2] = 0;
                var2++;
            }
        }
        field7239++;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)Z")
    public static final boolean method2961(int arg0, int arg1) {
        field7237++;
        if (class54.field737[arg0]) {
            return true;
        } else if (class47.field681.method1308(arg0, (byte) -25)) {
            int var2 = class47.field681.method1302(-127, arg0);
            if (arg1 <= 53) {
                return false;
            } else if (var2 == 0) {
                class54.field737[arg0] = true;
                return true;
            } else {
                if (class296.field3842[arg0] == null) {
                    class296.field3842[arg0] = new class423[var2];
                }
                for (int var3 = 0; var3 < var2; var3++) {
                    if (class296.field3842[arg0][var3] == null) {
                        byte[] var4 = class47.field681.method1313((byte) -124, arg0, var3);
                        if (var4 != null) {
                            class423 var5 = class296.field3842[arg0][var3] = new class423();
                            var5.field5734 = (arg0 << 16) + var3;
                            if (var4[0] != -1) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method2505(-12598, new class88(var4));
                        }
                    }
                }
                class54.field737[arg0] = true;
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
    public static void method2962(byte arg0) {
        field7238 = null;
        field7241 = null;
        if (arg0 != 45) {
            field7243 = 27L;
        }
        field7242 = null;
    }
}
