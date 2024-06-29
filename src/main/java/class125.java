import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class class125 extends class379 {

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "[Lth;")
    public static class420[] field1922 = new class420[128];

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "Ld;")
    public static class102 field1924 = new class102(0, -1);

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "Lgf;")
    public static class180 field1925 = new class180("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Loa;")
    public static class488 field1923;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public static final void method931(int arg0) {
        for (class301 var1 = (class301) class308.field4409.method1644((byte) -51); var1 != null; var1 = (class301) class308.field4409.method1644((byte) -82)) {
            class305.method1927(var1, false);
        }
        field1921++;
        if (arg0 <= 83) {
            return;
        }
        int var2;
        int var3;
        if (class397.field5830.method1292(class399.field5865, -2)) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class334.field5132;
            var3 = class334.field5132;
        }
        client.method1355();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1338();
            client.method1352(var4);
            client.method1341(var4);
        }
        client.method1345();
        client.method1346();
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)V")
    public static void method932(boolean arg0) {
        field1922 = null;
        field1925 = null;
        field1924 = null;
        if (arg0) {
            field1922 = null;
        }
        field1923 = null;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(Z)Lnm;")
    public abstract class329 method933(boolean arg0);
}
