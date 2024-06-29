import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class98 extends class86 {

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Lpp;")
    public static class256 field1320 = new class256("", 10);

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public static int field1337 = -1;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Lpa;")
    public class238 field1318;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "Lrp;")
    public class287 field1329;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Lqj;")
    public static class336 field1327;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "Lar;")
    public class462 field1331;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Lhh;")
    public class80 field1315;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lts;I)V")
    public static final void method594(class356 arg0, int arg1) {
        field1316++;
        if (!class288.field4128) {
            return;
        }
        class415.field6143++;
        if (arg0.field5152 != null) {
            class356 var2 = class236.method1433(class71.field1052, class303.field4394, (byte) 58);
            if (var2 != null) {
                class99 var3 = new class99();
                var3.field1346 = arg0.field5152;
                var3.field1343 = arg0;
                var3.field1350 = var2;
                class396.method2358(var3);
            }
        }
        class386.method2321(true, class423.field6249);
        if (arg1 != -1) {
            field1327 = null;
        }
        class79.field1108.method969(arg1 ^ 0xFFFFB262, arg0.field5185);
        class79.field1108.method972(arg0.field5184, -128);
        class79.field1108.method944(true, class472.field6827);
        class79.field1108.method965(-1968576644, class303.field4394);
        class79.field1108.method944(true, class71.field1052);
        class79.field1108.method987(arg0.field5174, (byte) 6);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method595(int arg0) {
        field1327 = null;
        field1320 = null;
        if (arg0 != -1) {
            field1339 = 121;
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
    public final void method596(byte arg0) {
        if (arg0 >= -35) {
            return;
        }
        this.field1318 = null;
        this.field1315 = null;
        this.field1331 = null;
        this.field1329 = null;
        field1319++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method597(int arg0, String arg1) {
        field1328++;
        if (arg0 != 29315) {
            method594(null, 37);
        }
        class447.method2609(arg1, 0, "", -89, 0, "");
    }

    static {
        new class194("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }
}
