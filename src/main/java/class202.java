import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class202 extends class449 {

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "Lap;")
    public static class310 field2991;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "Lam;")
    public static class199 field2988;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "Lrn;")
    public class417 field2989;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "Lnl;")
    public static class435 field2992;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "Z")
    public boolean field2985;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
    public static void method1400(byte arg0) {
        field2991 = null;
        field2988 = null;
        field2992 = null;
        if (arg0 < 62) {
            method1400((byte) -100);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I[[BLpg;)V")
    public static final void method1401(int arg0, byte[][] arg1, class454 arg2) {
        field2987++;
        if (arg0 != -7801) {
            field2988 = null;
        }
        for (int var3 = 0; var3 < arg2.field4474; var3++) {
            class208.method1423((byte) -120);
            for (int var4 = 0; var4 < (class36.field388 >> 3); var4++) {
                for (int var5 = 0; var5 < class68.field998 >> 3; var5++) {
                    int var6 = class4.field32[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x37A1AA6) >> 24;
                        if (!arg2.field4478 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = (var6 & 0xFFC9BB) >> 14;
                            int var10 = (var6 & 0x3FFE) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class486.field6887.length; var12++) {
                                if (class486.field6887[var12] == var11 && arg1[var12] != null) {
                                    arg2.method2738(class374.field5152, var7, (var9 & 0x7) * 8, var8, -1, class300.field4249, var4 * 8, (var10 & 0x7) * 8, arg1[var12], var5 * 8, var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
    public static final void method1402(byte arg0) {
        field2984++;
        class323.method2041(4135);
        class394.field5437 = null;
        class9.field71 = null;
        if (arg0 <= 42) {
            field2992 = null;
        }
        class61.field888 = null;
        class31.field331 = null;
        class266.field3835 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1403(String arg0, int arg1) {
        field2986++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class472.method2799(arg1 + 36, arg0);
        if (var2 == null) {
            return;
        }
        if (arg1 != 1) {
            field2991 = null;
        }
        for (int var3 = 0; var3 < class349.field4807; var3++) {
            String var4 = class37.field446[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class472.method2799(arg1 ^ 0x41, var4);
            if (var5 != null && var5.equals(var2)) {
                class349.field4807--;
                for (int var6 = var3; var6 < class349.field4807; var6++) {
                    class37.field446[var6] = class37.field446[var6 + 1];
                    class8.field54[var6] = class8.field54[var6 + 1];
                    class264.field3801[var6] = class264.field3801[var6 + 1];
                    class243.field3532[var6] = class243.field3532[var6 + 1];
                    class191.field2861[var6] = class191.field2861[var6 + 1];
                    class270.field3940[var6] = class270.field3940[var6 + 1];
                }
                class199.field2946++;
                class33.field341 = class86.field1217;
                class336.method2111(class416.field5706, 90);
                class311.field4403.method1180((byte) -110, class345.method2147(arg0, (byte) 110));
                class311.field4403.method1184((byte) -118, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lae;II)Ljava/lang/String;")
    public static final String method1404(class172 arg0, int arg1, int arg2) {
        field2990++;
        if (!client.method547(arg0).method871((byte) -113, arg2) && arg0.field2610 == null) {
            return null;
        } else if (arg0.field2546 == null || arg0.field2546.length <= arg2 || arg0.field2546[arg2] == null || arg0.field2546[arg2].trim().length() == 0) {
            return class79.field1162 ? "Hidden-" + arg2 : null;
        } else {
            if (arg1 != -1) {
                field2988 = null;
            }
            return arg0.field2546[arg2];
        }
    }

    static {
        new class151("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field2991 = new class310(28, 6);
    }
}
