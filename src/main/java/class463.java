import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class463 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Loe;")
    public static class127 field7111 = new class127(25, 6);

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field7114 = -1;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "S")
    public static short field7115 = 32767;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Ln;")
    public static class15 field7116;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
    public static final boolean method2760(int arg0, int arg1, int arg2) {
        if (arg2 == 2) {
            field7113++;
            return (arg1 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method2761(int arg0) {
        if (arg0 == 4907) {
            field7116 = null;
            field7111 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([III[JI)V")
    public static final void method2762(int[] arg0, int arg1, int arg2, long[] arg3, int arg4) {
        if (arg2 > arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg2; var11++) {
                if (arg3[var11] < ((long) (var11 & var10) + var7)) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    int var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var9;
            method2762(arg0, arg1, var6 - 1, arg3, arg4);
            method2762(arg0, 1, arg2, arg3, var6 + 1);
        }
        field7112++;
        if (arg1 != 1) {
            method2762(null, 65, 114, null, 80);
        }
    }

    static {
        new class423("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field7117 = 1;
    }
}
