import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class102 {

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field1460 = -1;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "[B")
    public static byte[] field1464;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B[[I)V")
    public static final void method687(byte arg0, int[][] arg1) {
        class591.field8480 = arg1;
        field1457++;
        if (arg0 != -55) {
            field1464 = null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static void method688(int arg0) {
        int var1 = -125 % ((-arg0 - 26) / 36);
        field1464 = null;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)I")
    public final int method689(int arg0) {
        if (arg0 == 100) {
            field1458++;
            return this.field1455;
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method690(int arg0, String arg1) {
        field1462++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class228.method1474(arg1.charAt(var4), true) + (var3 << 5) - var3;
        }
        if (arg0 <= 40) {
            field1460 = -45;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ju", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1463++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(II)V")
    public class102(int arg0, int arg1) {
        this.field1455 = arg0;
        this.field1461 = arg1;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)I")
    public static final int method691(byte arg0) {
        field1456++;
        if (arg0 != 106) {
            method690(-86, null);
        }
        int var1 = class666.field9389.method2807((byte) 84);
        if (class97.field1410.length - 1 > var1) {
            class666.field9389 = class97.field1410[var1 + 1];
        }
        return 100;
    }
}
