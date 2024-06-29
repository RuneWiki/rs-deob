import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class74 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Ljf;")
    public static class229 field1397 = class212.method1457((byte) 75, "Connexion perdue)3");

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Ljf;")
    public static class229 field1398 = class212.method1457((byte) 81, "<)4col>");

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Z")
    public static boolean field1404 = false;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Ljf;")
    public static class229 field1399 = class212.method1457((byte) 91, "hint_mapedge");

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[Ljf;")
    public static class229[] field1403 = new class229[200];

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Ljf;")
    public static class229 field1402 = class212.method1457((byte) 125, " s(West d-Bconnect-B)3");

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "[[[Llf;")
    public static class125[][][] field1401;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V", line = 142)
    public static final void method538(int arg0, int arg1) {
        class323.field5437[0] = (float) class305.method2086(arg1 >> 16, 255) / 255.0F;
        class323.field5437[2] = (float) class305.method2086(255, arg1) / 255.0F;
        field1400++;
        class323.field5437[1] = (float) class305.method2086(255, arg1 >> 8) / 255.0F;
        if (arg0 == -13487) {
            class228.method1604(3, (byte) 54);
            class228.method1604(4, (byte) 3);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 200)
    public static void method539(int arg0) {
        field1399 = null;
        field1403 = null;
        field1401 = (class125[][][]) null;
        field1398 = null;
        if (arg0 != 1) {
            field1401 = (class125[][][]) ((class125[][][]) null);
        }
        field1397 = null;
        field1402 = null;
    }
}
