import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class336 {

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "Lgu;")
    public class412 field4453 = new class412();

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "Z")
    public boolean field4455 = false;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "Ljc;")
    public static class305 field4450 = new class305("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field4451 = 0;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field4454 = 0;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public int field4456;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
    public int field4457;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    public static final void method1959(byte arg0) {
        field4449++;
        class184 var1 = class277.method1682(0, 15, -112);
        var1.method1075((byte) 107);
        if (arg0 > -7) {
            method1962(-85, -36);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V")
    public static void method1960(boolean arg0) {
        if (!arg0) {
            field4450 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljk;BII)V")
    public static final void method1961(class450 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 111) {
            return;
        }
        if (class323.field4302) {
            class87 var4 = class324.field4307 == -1 ? null : class104.field1405.method449((byte) -51, class324.field4307);
            if (client.method1253(arg0).method1400(-72) && (class41.field448 & 0x20) != 0 && (var4 == null || arg0.method2794(0, class324.field4307, var4.field1031) != var4.field1031)) {
                class144.method878(arg0.field6661, arg0.field6703, 9, class48.field531, class191.field2465 + " -> " + arg0.field6631, arg0.field6558, class207.field2724, 0L, true, false, (byte) -102);
                class351.field4662++;
            }
        } else {
            for (int var5 = 9; var5 >= 5; var5--) {
                String var9 = class257.method1585(0, var5, arg0);
                if (var9 != null) {
                    class340.field4497++;
                    class144.method878(arg0.field6661, arg0.field6703, 1012, var9, arg0.field6631, arg0.field6558, class495.method2986(arg0, (byte) 7, var5), (long) (var5 + 1), true, false, (byte) -72);
                }
            }
            String var6 = class360.method2125(arg0, (byte) -7);
            if (var6 != null) {
                class33.field334++;
                class144.method878(arg0.field6661, arg0.field6703, 18, var6, arg0.field6631, arg0.field6558, arg0.field6700, 0L, true, false, (byte) -66);
            }
            for (int var7 = 4; var7 >= 0; var7--) {
                String var8 = class257.method1585(0, var7, arg0);
                if (var8 != null) {
                    class340.field4497++;
                    class144.method878(arg0.field6661, arg0.field6703, 44, var8, arg0.field6631, arg0.field6558, class495.method2986(arg0, (byte) 7, var7), (long) (var7 + 1), true, false, (byte) -96);
                }
            }
            if (client.method1253(arg0).method1399(-100)) {
                if (arg0.field6547 == null) {
                    class144.method878(arg0.field6661, arg0.field6703, 16, class227.field3062.method1823(class374.field5072, (byte) -88), "", arg0.field6558, -1, 0L, true, false, (byte) -107);
                } else {
                    class144.method878(arg0.field6661, arg0.field6703, 16, arg0.field6547, "", arg0.field6558, -1, 0L, true, false, (byte) -112);
                }
                class190.field2452++;
            }
        }
        field4448++;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
    public static final void method1962(int arg0, int arg1) {
        field4452++;
        class184 var2 = class277.method1682(arg1, 8, -57);
        var2.method1075((byte) 122);
        if (arg0 != 0) {
            method1960(true);
        }
    }
}
