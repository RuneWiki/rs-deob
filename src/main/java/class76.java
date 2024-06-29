import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class76 {

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[Z")
    public static boolean[] field1369 = new boolean[100];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lek;")
    public static class206 field1370;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lek;")
    public static class206 field1373;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[I")
    public static int[] field1367;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method580(int arg0, byte arg1) {
        class177.field2933 = arg0;
        class6.field169 = 100;
        class199.field3349 = -1;
        class1.field37 = 3;
        field1374++;
        if (arg1 > -94) {
            field1367 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lek;III)Z", line = 25)
    public static final boolean method581(class206 arg0, int arg1, int arg2, int arg3) {
        field1372++;
        byte[] var4 = arg0.method1404(arg2, arg3, (byte) -74);
        if (var4 == null) {
            return false;
        }
        class129.method921(var4, 0);
        if (arg1 <= 30) {
            field1373 = (class206) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([BI)[B", line = 43)
    public static final byte[] method582(byte[] arg0, int arg1) {
        field1365++;
        if (arg1 != -1) {
            method583((byte) -45);
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class89.method689(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 59)
    public static void method583(byte arg0) {
        field1373 = null;
        field1369 = null;
        if (arg0 > -80) {
            field1370 = (class206) null;
        }
        field1370 = null;
        field1367 = null;
    }
}
