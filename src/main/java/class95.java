import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class95 {

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field1346 = 0;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lvd;")
    public static class4 field1343 = new class4(16);

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field1349 = 0;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[[[I")
    public static int[][][] field1341;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lhc;Z)V")
    public static final void method635(class235 arg0, boolean arg1) {
        class275.field4258 = arg0;
        if (arg1) {
            field1348 = 82;
        }
        field1347++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method636(int arg0) {
        if (arg0 == 16) {
            field1341 = null;
            field1343 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lb;")
    public static final class85 method637(int arg0, int arg1) {
        class85 var2 = (class85) class6.field48.method540((byte) -114, (long) arg0);
        field1345++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class69.field938.method1576(-46, 33, arg0);
        class85 var4 = new class85();
        if (arg1 != 16) {
            method636(-25);
        }
        if (var3 != null) {
            var4.method532(true, arg0, new class224(var3));
        }
        class6.field48.method543(var4, (long) arg0, 858993459);
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class95() {
        new class242();
    }
}
