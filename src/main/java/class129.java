import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class129 extends class38 {

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "[I")
    public static int[] field1662 = new int[500];

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1664 = 0;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1666 = "purple:";

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Lja;")
    public static class89 field1665;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "[I")
    public static int[] field1660;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()V", line = 5)
    public static final void method693() {
        for (int var0 = 0; var0 < class10.field89; var0++) {
            class17 var1 = class420.field6141[var0];
            class386.method2397(var1);
            class420.field6141[var0] = null;
        }
        class10.field89 = 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B[S)[S", line = 26)
    public static final short[] method694(byte arg0, short[] arg1) {
        if (arg0 <= 67) {
            method696(-77, -44);
        }
        field1668++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class358.method2178(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V", line = 57)
    public static void method695(byte arg0) {
        if (arg0 != 8) {
            method695((byte) 57);
        }
        field1666 = null;
        field1660 = null;
        field1662 = null;
        field1665 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V", line = 71)
    public static final void method696(int arg0, int arg1) {
        field1661++;
        class40 var2 = class162.method872(arg0, (byte) 92, arg1);
        var2.method193(-106);
    }
}
