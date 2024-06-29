import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class105 {

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field1559 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Lma;")
    public static class5 field1558 = class12.method119("<col=00ff00>", (byte) 106);

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Lma;")
    private static class5 field1560 = class12.method119("glow3:", (byte) 97);

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field1556 = 0;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "Lma;")
    public static class5 field1557 = field1560;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Lma;")
    public static class5 field1565 = field1560;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Lni;")
    public static class202 field1563;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "[[B")
    public static byte[][] field1562;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILeb;)Z", line = 17)
    public static final boolean method664(int arg0, class253 arg1) {
        field1564++;
        if (arg1.field4266 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field4266.length; var2++) {
            int var3 = class192.method1260(var2, -22729, arg1);
            int var4 = arg1.field4291[var2];
            if (arg1.field4266[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field4266[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field4266[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 != -4) {
            field1556 = -10;
        }
        return true;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 78)
    public static final void method665(int arg0) {
        field1566++;
        class9.field139.method1728((byte) 24);
        for (int var1 = arg0; var1 < 32; var1++) {
            class167.field2548[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class200.field3173[var2] = 0L;
        }
        class18.field319 = 0;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)V", line = 105)
    public static final void method666(boolean arg0, int arg1) {
        class59.field921 = arg1;
        class102.method646(3, 97);
        class102.method646(4, 75);
        if (!arg0) {
            field1561++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 121)
    public static void method667(int arg0) {
        field1565 = null;
        field1558 = null;
        if (arg0 != 0) {
            field1562 = (byte[][]) ((byte[][]) null);
        }
        field1562 = (byte[][]) null;
        field1557 = null;
        field1563 = null;
        field1560 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V", line = 140)
    public static final void method668(boolean arg0) {
        class101.field1509.method522(100);
        if (!arg0) {
            field1565 = (class5) null;
        }
        field1555++;
    }
}
