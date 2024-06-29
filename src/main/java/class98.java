import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class98 {

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field1915 = 0;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lr;")
    public static class66 field1913 = class93.method641(43, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "[I")
    public static int[] field1919 = new int[25];

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field1917 = 0;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lc;")
    public static class125 field1912 = new class125();

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lr;")
    public static class66 field1922 = class93.method641(43, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field1923 = 0;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lwh;")
    public static class167 field1921 = new class167();

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Z")
    public static boolean field1924 = false;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Luf;")
    public static class240 field1911;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method673(int arg0) {
        field1922 = null;
        field1913 = null;
        field1919 = null;
        field1912 = null;
        field1921 = null;
        if (arg0 != 0) {
            field1920 = 122;
        }
        field1911 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method674(byte arg0) {
        field1916++;
        if (arg0 == 113) {
            class206.field3575++;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILha;)V")
    public static final void method675(int arg0, class63 arg1) {
        field1918++;
        if (arg0 > -124) {
            method674((byte) -9);
        }
        class63 var2 = class77.method546((byte) 126, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class12.field143;
            var4 = class19.field257;
        } else {
            var3 = var2.field1196;
            var4 = var2.field1215;
        }
        class184.method1225(false, 123, var3, var4, arg1);
        class156.method1059(var3, arg1, var4, -1198502738);
    }
}
