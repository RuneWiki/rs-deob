import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class494 {

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Lsk;")
    public static class423 field7520 = new class423("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field7524 = 0;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V", line = 13)
    public static final void method2979(int arg0) {
        field7519++;
        int[] var1 = new int[class288.field4362.field7659];
        int var2 = 0;
        for (int var3 = 0; var3 < class288.field4362.field7659; var3++) {
            class182 var5 = class288.field4362.method3030((byte) 50, var3);
            if (var5.field2883 >= 0 || var5.field2872 >= 0) {
                var1[var2++] = var3;
            }
        }
        class34.field485 = new int[var2];
        if (arg0 <= 81) {
            method2981(null, null, 64);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class34.field485[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V", line = 50)
    public static void method2980(boolean arg0) {
        field7520 = null;
        if (arg0) {
            method2979(64);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([[BLq;I)V", line = 61)
    public static final void method2981(byte[][] arg0, class282 arg1, int arg2) {
        field7523++;
        int var3 = class311.field4685.length;
        int var4 = 0;
        if (arg2 != 64) {
            return;
        }
        while (var4 < var3) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class61.field1032[var4] >> 8) * 64 - class381.field5550;
                int var7 = (class61.field1032[var4] & 0xFF) * 64 - class320.field4827;
                class233.method1400(false);
                arg1.method1719((byte) 91, class345.field5116, var5, var7, var6, class91.field1641);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)I")
    public abstract int method1073(int arg0);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)C")
    public abstract char method1067(int arg0);

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)I")
    public abstract int method1071(int arg0);

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)J")
    public abstract long method1066(int arg0);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1068(boolean arg0);
}
