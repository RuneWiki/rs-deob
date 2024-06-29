import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class128 {

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "[I")
    public int[] field1995;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "[I")
    public int[] field1993;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "Z")
    public static boolean field2000 = true;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "Lge;")
    public static class511 field1997 = new class511(8);

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public static int field2002 = 0;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "Lqt;")
    public static class459 field2001 = new class459(8, -1);

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field2003 = 1;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "F")
    public static float field2004;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static void method943(int arg0) {
        field2001 = null;
        if (arg0 != -1) {
            field2003 = -13;
        }
        field1997 = null;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLnj;)V")
    public static final void method944(boolean arg0, class166 arg1) {
        arg1.field2501 = null;
        field1999++;
        int var2 = arg1.field2497.length;
        int var3 = 0;
        if (arg0) {
            field2004 = 0.092065535F;
        }
        while (var2 > var3) {
            arg1.field2497[var3].field904 = false;
            var3++;
        }
        class122[] var4 = class522.field7633;
        synchronized (class522.field7633) {
            if (var2 < class522.field7633.length && class71.field1158[var2] < 200) {
                class522.field7633[var2].method905(arg1, 0);
                int var10002 = class71.field1158[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "([BI)[B")
    public static final byte[] method945(byte[] arg0, int arg1) {
        field1998++;
        if (arg1 != -27375) {
            field1997 = null;
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class282.method1818(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I)V")
    public class128(int arg0) {
        this.field1994 = arg0;
        this.field1995 = new int[this.field1994];
        this.field1993 = new int[this.field1994];
    }
}
