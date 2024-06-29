import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class375 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field5197 = 0;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Z")
    public static boolean field5199 = false;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lht;")
    public static class582 field5198 = new class582(6, 2);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[Ljava/lang/String;)V")
    public static final void method2191(int arg0, String[] arg1) {
        field5195++;
        if (arg0 < 108) {
            return;
        }
        if (arg1.length <= 1) {
            class490.field6655 = class490.field6655 + arg1[0];
            class88.field1078 += arg1[0].length();
            return;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2].startsWith("pause")) {
                int var3 = 5;
                try {
                    var3 = Integer.parseInt(arg1[var2].substring(6));
                } catch (Exception var4) {
                }
                class710.method3991("Pausing for " + var3 + " seconds...", (byte) 125);
                class239.field3375 = arg1;
                class586.field7668 = var2 + 1;
                class178.field2684 = (long) (var3 * 1000) + method2193(116);
                return;
            }
            class490.field6655 = arg1[var2];
            class752.method4213(1354797057, false);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method2192(int arg0) {
        field5198 = null;
        if (arg0 != 20079) {
            field5199 = true;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)J")
    public static final synchronized long method2193(int arg0) {
        field5196++;
        if (arg0 != 116) {
            method2192(109);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class684.field9554) {
            class311.field4463 += class684.field9554 - var1;
        }
        class684.field9554 = var1;
        return class311.field4463 + var1;
    }
}
