import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class404 {

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[Lbs;")
    public static class482[] field5978;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Lgk;")
    public static class331 field5980;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[IILfd;[IB)Lwk;")
    public static final class95 method2475(int arg0, int[] arg1, int arg2, class365 arg3, int[] arg4, byte arg5) {
        field5979++;
        byte[] var6 = new byte[arg0 * arg2];
        for (int var7 = 0; var7 < arg0; var7++) {
            int var9 = arg2 * var7 + arg1[var7];
            for (int var10 = 0; var10 < arg4[var7]; var10++) {
                var6[var9++] = -1;
            }
        }
        int var8 = 32 / ((arg5 - 8) / 34);
        return new class95(arg3, arg2, arg0, var6);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
    public static void method2476(byte arg0) {
        field5978 = null;
        if (arg0 != -10) {
            field5978 = null;
        }
        field5980 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILfs;IIBZI)V")
    public static final void method2477(int arg0, class387 arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        field5981++;
        class479.field7048 = arg5;
        class127.field1852 = arg1;
        class445.field6586 = arg6;
        class498.field7403 = arg0;
        class470.field6941 = arg3;
        if (arg4 < -48) {
            class206.field2999 = arg2;
            class372.field5534 = 1;
        }
    }

    static {
        new class331("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field5978 = new class482[6];
        field5980 = new class331("flash2:", "blinken2:", "clignotant2:", "flash2:");
    }
}
