import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class155 {

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "Z")
    public static boolean field2315 = false;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "Lsca;")
    public static class41 field2316;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)V")
    public static final void method1123(int arg0, byte arg1) {
        class117 var2 = class236.field3411;
        synchronized (class236.field3411) {
            class236.field3411.method834(arg0, 0);
        }
        field2313++;
        class117 var3 = class120.field1690;
        synchronized (class120.field1690) {
            if (arg1 != 50) {
                method1125(62);
            }
            class120.field1690.method834(arg0, arg1 ^ 0x32);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILqa;)V")
    public static final void method1124(int arg0, class208 arg1) {
        field2314++;
        if (!(class103.field1484 >= 2 || class606.field9002) || class307.field4210 != null) {
            return;
        }
        String var2;
        if (class606.field9002 && class103.field1484 < 2) {
            var2 = class217.field3182 + class100.field1458.method3408(124, class63.field795) + class537.field8008 + " ->";
        } else if (class335.field4641 && class24.field237.method1788(16, 81) && class103.field1484 > 2) {
            var2 = class632.method3679((class583) class174.field2677.field179.field5648.field5648, (byte) -34);
        } else {
            class583 var3 = (class583) class174.field2677.field179.field5648;
            var2 = class632.method3679(var3, (byte) -34);
            int[] var4 = null;
            if (class397.method2359(var3.field8566, (byte) -113)) {
                var4 = class150.field2242.method3606((byte) -115, (int) var3.field8564).field8051;
            } else if (var3.field8558 != -1) {
                var4 = class150.field2242.method3606((byte) -103, var3.field8558).field8051;
            } else if (class555.method3354(127, var3.field8566)) {
                class505 var7 = (class505) class510.field7260.method2799((long) ((int) var3.field8564), true);
                if (var7 != null) {
                    class571 var8 = var7.field7148;
                    class87 var9 = var8.field8405;
                    if (var9.field1314 != null) {
                        var9 = var9.method655((byte) 108, class556.field8280);
                    }
                    if (var9 != null) {
                        var4 = var9.field1267;
                    }
                }
            } else if (class513.method3044(var3.field8566, 1012)) {
                Object var5 = null;
                class145 var6;
                if (var3.field8566 == 1012) {
                    var6 = class216.field3172.method1505(-24044, (int) var3.field8564);
                } else {
                    var6 = class216.field3172.method1505(-24044, (int) (var3.field8564 >>> 32 & 0x7FFFFFFFL));
                }
                if (var6.field2028 != null) {
                    var6 = var6.method991(class556.field8280, true);
                }
                if (var6 != null) {
                    var4 = var6.field2023;
                }
            }
            if (var4 != null) {
                var2 = var2 + class540.method3280((byte) -103, var4);
            }
        }
        if (class103.field1484 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class103.field1484 - 2) + class115.field1623.method3408(92, class63.field795);
        }
        if (class490.field6959 != null) {
            class92 var10 = class490.field6959.method1164(-103, arg1);
            if (var10 == null) {
                var10 = class114.field1608;
            }
            var10.method729(class490.field6959.field2542, class371.field5098, class490.field6959.field2530, var2, class490.field6959.field2495, class410.field5613, class384.field5287, class490.field6959.field2527, class352.field4793, class490.field6959.field2421, 30524, class440.field5879, class490.field6959.field2459, class428.field5750, class199.field2930);
            class118.method852(class384.field5287[0], class384.field5287[1], class384.field5287[3], class384.field5287[2], true);
        } else if (class270.field3826 != null && class348.field4768 == class210.field3104) {
            int var11 = class114.field1608.method718(class420.field5687 + 16, class199.field2930, class352.field4793, class104.field1507 + 4, 111, class371.field5098, var2, 0, 16777215, class440.field5879);
            class118.method852(class104.field1507 + 4, class420.field5687, 16, class470.field6636.method2126((byte) 76, var2) + var11, true);
        }
        if (arg0 != 2) {
            field2316 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public static void method1125(int arg0) {
        field2316 = null;
        if (arg0 != 0) {
            method1123(-35, (byte) -101);
        }
    }

    static {
        new class572("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }
}
