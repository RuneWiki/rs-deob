import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class351 {

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "Lnj;")
    public static class487 field5111;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "[I")
    public static int[] field5113;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public int field5106;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public int field5108;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public int field5112;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "Z")
    public boolean field5110;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BJ)V")
    public static final void method2147(byte arg0, long arg1) {
        if (class526.field7777 != null) {
            if (class287.field4232 == 1 || class287.field4232 == 5) {
                class567.method3313(arg0 ^ 0x3B, arg1);
            } else if (class287.field4232 == 4) {
                class53.method273(arg1, 114);
            }
        }
        field5107++;
        class248.method1580((long) class576.field8505, (byte) -111, class379.field5558);
        if (class540.field8007 != -1) {
            class611.method3566(class540.field8007, -1);
        }
        for (int var3 = 0; var3 < class395.field5741; var3++) {
            if (class587.field8718[var3]) {
                class644.field9344[var3] = true;
            }
            class359.field5215[var3] = class587.field8718[var3];
            class587.field8718[var3] = false;
        }
        class43.field529 = class576.field8505;
        if (class379.field5558.method976()) {
            class385.field5638 = true;
        }
        if (class540.field8007 != -1) {
            class395.field5741 = 0;
            class508.method3036((byte) 5);
        }
        class379.field5558.method985();
        class538.method3158(-98, class379.field5558);
        int var4 = class639.method3703((byte) -30);
        if (var4 == -1) {
            var4 = class362.field5233;
        }
        if (var4 == -1) {
            var4 = class591.field8746;
        }
        class235.method1523(false, var4);
        class223.method1464(class239.field3493.field3464, arg0 ^ 0x3A, class239.field3493.field3463, class239.field3493.field3457, class394.field5735);
        class394.field5735 = 0;
        if (arg0 != 59) {
            method2149(null, -99, -6, -38, -76, 74, 108);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public static void method2148(byte arg0) {
        field5113 = null;
        field5111 = null;
        int var1 = 102 % ((arg0 - 43) / 32);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lcd;IIIIII)V")
    public static final void method2149(class86 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5109++;
        if (arg5 <= -125) {
            class509.method3039(arg6, arg4, arg0.field3464, arg3, arg1, arg0.field3457, arg0.field3463, arg2, 0, true);
        }
    }

    static {
        new class487("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field5111 = new class487("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");
        field5113 = new int[120];
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field5113[var1] = var0 / 4;
        }
    }
}
