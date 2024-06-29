import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class298 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lvp;")
    public static class123 field4252 = new class123(39, -1);

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lcr;")
    public static class403 field4256 = null;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lgf;")
    public static class180 field4255 = new class180("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4258 = null;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "[I")
    public static int[] field4259 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[[Z")
    public static boolean[][] field4257;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
    public static final void method1837(int arg0, int arg1) {
        field4254++;
        class410.field6034 = arg0;
        class421.field6199 = 100;
        class25.field441 = -1;
        class36.field540 = arg1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method1838(byte arg0) {
        field4258 = null;
        int var1 = -108 % ((23 - arg0) / 45);
        field4257 = null;
        field4259 = null;
        field4255 = null;
        field4252 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZI)I")
    public static final int method1839(int arg0, boolean arg1, int arg2) {
        field4253++;
        int var3 = 0;
        if (arg1) {
            method1839(30, false, -61);
        }
        while (arg2 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg2--;
        }
        return var3;
    }
}
