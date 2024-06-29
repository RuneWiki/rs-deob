import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class423 {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Lnk;")
    public static class326 field6380;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "Lrr;")
    public static class280 field6384;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "Llo;")
    public static class306 field6385;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "[I")
    public static int[] field6383;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
    public static final void method2592(byte arg0) {
        class46.field741 = null;
        class115.field2054 = null;
        field6382++;
        class123.field2157 = null;
        class502.field7337 = null;
        class175.field2779 = null;
        class31.field489 = null;
        class144.field2351 = null;
        class202.field3201 = null;
        class510.field7480 = null;
        class359.field5589 = null;
        class439.field6564 = null;
        class387.field5966 = null;
        if (arg0 != -95) {
            return;
        }
        class327.field5154 = null;
        class127.field2188 = null;
        class175.field2776 = null;
        class496.field7257 = null;
        class151.field2423 = null;
        class531.field7796 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lpt;IIIII)V")
    public static final void method2593(class398 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field6083 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field6080[var6] != null) {
                arg0.field6083++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field6083; var7++) {
            long var8 = class355.field5541[arg1][arg2][arg3];
            while (var8 != 0L) {
                class429 var14 = class435.field6486[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field6080[var7] == var14.field6429) {
                    continue label50;
                }
            }
            long var10 = class355.field5541[arg1][arg4][arg5];
            while (var10 != 0L) {
                class429 var13 = class435.field6486[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field6080[var7] == var13.field6429) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field6083 - 1; var12++) {
                arg0.field6080[var12] = arg0.field6080[var12 + 1];
            }
            arg0.field6083--;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2594(int arg0, String arg1) {
        field6379++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var6 = arg1.charAt(var4);
            if (var6 <= '\u007F') {
                var3++;
            } else if (var6 > '߿') {
                var3 += 3;
            } else {
                var3 += 2;
            }
        }
        int var5 = 118 % ((arg0 - 1) / 63);
        return var3;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public static final void method2595(int arg0) {
        class480.field7080 = 0;
        if (arg0 > -43) {
            method2595(9);
        }
        field6381++;
        class108.field1934.method2543(7655);
        class108.field1934.method2541(0, class364.field5666);
        class480.field7080++;
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
    public static void method2596(int arg0) {
        field6384 = null;
        field6383 = null;
        if (arg0 > 17) {
            field6380 = null;
            field6385 = null;
        }
    }

    static {
        new class306("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field6380 = new class326(3, 3);
        field6384 = new class280(4, 1, 1, 1);
        field6385 = new class306("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");
    }
}
