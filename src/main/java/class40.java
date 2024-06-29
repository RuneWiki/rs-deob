import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public abstract class class40 extends class90 {

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "Lvk;")
    public class308 field558;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "[I")
    public static int[] field562 = new int[4096];

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "Lo;")
    public static class332 field560 = new class332("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "Lsh;")
    public static class472 field563 = new class472(44, -1);

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "Lsh;")
    public static class472 field564 = new class472(46, 12);

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "[Lbg;")
    public static class257[] field565 = new class257[2048];

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)Z")
    public abstract boolean method302(byte arg0);

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILui;)I")
    public static final int method303(int arg0, class451 arg1) {
        if (arg0 != 0) {
            return 93;
        }
        field561++;
        int var2 = 0;
        if (arg1.method2672(class384.field5691, 23775)) {
            var2++;
        }
        if (arg1.method2672(class380.field5649, 23775)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(JI)V")
    public static final void method304(long arg0, int arg1) {
        field557++;
        if (class170.field2427 != null) {
            if (class469.field6596 == 1 || class469.field6596 == 5) {
                class14.method137(499, arg0);
            } else if (class469.field6596 == 4) {
                class187.method1286(arg0, (byte) 102);
            }
        }
        class124.method868(class138.field1976, false, (long) class452.field6418);
        if (class279.field4220 != -1) {
            class424.method2500(1, class279.field4220);
        }
        for (int var3 = 0; var3 < class267.field3959; var3++) {
            if (class103.field1442[var3]) {
                class225.field3270[var3] = true;
            }
            class100.field1424[var3] = class103.field1442[var3];
            class103.field1442[var3] = false;
        }
        int var4 = 10 % ((arg1 + 35) / 52);
        class483.field6780 = class452.field6418;
        if (class138.field1976.method556()) {
            class2.field41 = true;
        }
        if (class279.field4220 != -1) {
            class267.field3959 = 0;
            class342.method2096(0);
        }
        class138.field1976.method493();
        class310.method1928((byte) 38, class138.field1976);
        int var5 = client.method2779(69);
        if (var5 == -1) {
            var5 = class268.field3970;
        }
        class36.method289(false, var5);
        class275.method1790(class472.field6622.field4538, class269.field3987, class472.field6622.field4543, class472.field6622.field4545, -44);
        class269.field3987 = 0;
    }

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "(I)V")
    public static void method305(int arg0) {
        field563 = null;
        if (arg0 != -1) {
            field564 = null;
        }
        field565 = null;
        field564 = null;
        field562 = null;
        field560 = null;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lvk;I)V")
    public class40(class308 arg0, int arg1) {
        this.field558 = arg0;
        this.field559 = arg1;
    }

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method306(int arg0);
}
