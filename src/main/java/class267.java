import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class267 {

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "Lfn;")
    public static class52 field3714 = new class52(70, 12);

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Ltm;")
    public static class112 field3715 = new class112("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "[B")
    public static byte[] field3717 = new byte[520];

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "Lmq;")
    public static class104 field3716 = new class104(260);

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3718;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIII)V", line = 9)
    public static final void method1680(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3712++;
        int var5 = 0;
        int var6 = arg4;
        if (arg0 != -30415) {
            field3717 = null;
        }
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class229.method1443(class299.field4121, arg3 + arg4, class248.field3487, (byte) -68);
        int var10 = class229.method1443(class299.field4121, arg3 - arg4, class248.field3487, (byte) -68);
        class80.method554(class2.field16[arg1], 122, arg2, var9, var10);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (var12 >= class53.field874 && var11 <= class8.field174) {
                    int var13 = class229.method1443(class299.field4121, arg3 + var5, class248.field3487, (byte) -68);
                    int var14 = class229.method1443(class299.field4121, arg3 - var5, class248.field3487, (byte) -68);
                    if (var12 <= class8.field174) {
                        class80.method554(class2.field16[var12], 109, arg2, var13, var14);
                    }
                    if (var11 >= class53.field874) {
                        class80.method554(class2.field16[var11], 116, arg2, var13, var14);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (class53.field874 <= var16 && var15 <= class8.field174) {
                int var17 = class229.method1443(class299.field4121, arg3 + var6, class248.field3487, (byte) -68);
                int var18 = class229.method1443(class299.field4121, arg3 - var6, class248.field3487, (byte) -68);
                if (var16 <= class8.field174) {
                    class80.method554(class2.field16[var16], 95, arg2, var17, var18);
                }
                if (var15 >= class53.field874) {
                    class80.method554(class2.field16[var15], arg0 + 30527, arg2, var17, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V", line = 90)
    public static void method1681(int arg0) {
        field3717 = null;
        field3716 = null;
        field3714 = null;
        field3715 = null;
        field3718 = null;
        int var1 = 47 % ((arg0 + 71) / 40);
    }
}
