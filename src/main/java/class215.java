import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class215 extends class240 {

    @OriginalMember(owner = "client!i", name = "C", descriptor = "Lik;")
    public static class259 field3431 = new class259(30);

    @OriginalMember(owner = "client!i", name = "E", descriptor = "Lj;")
    public static class285 field3433 = new class285(64);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public static int field3434 = 0;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[I")
    public int[] field3419;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "[I")
    public int[] field3428;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "[I")
    public int[] field3432;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[Lub;")
    public class21[] field3417;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "[Lub;")
    public class21[] field3424;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "[[B")
    public static byte[][] field3422;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "[[[B")
    public byte[][][] field3423;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(BI)Lob;", line = 8)
    public static final class292 method1555(byte arg0, int arg1) {
        int var2 = arg1 >> 16;
        field3429++;
        int var3 = arg1 & 0xFFFF;
        if (class207.field3269[var2] == null || class207.field3269[var2][var3] == null) {
            boolean var4 = class213.method1543(25641, var2);
            if (!var4) {
                return null;
            }
        }
        if (arg0 != -48) {
            method1555((byte) 27, 103);
        }
        return class207.field3269[var2][var3];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 33)
    public static final void method1556(boolean arg0) {
        field3430++;
        class211.field3367.method1832((byte) 40);
        class83.field1241.method1832((byte) -116);
        if (!arg0) {
            method1559(true, 95);
        }
        class285.field4371.method1832((byte) 50);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)I", line = 46)
    public static final int method1557(int arg0) {
        if (arg0 >= -18) {
            method1558(109);
        }
        field3426++;
        class169.field2629 = 0;
        return class292.method2057(15359);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V", line = 58)
    public static void method1558(int arg0) {
        if (arg0 <= 7) {
            method1556(true);
        }
        field3422 = (byte[][]) null;
        field3431 = null;
        field3433 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 94)
    public static final String method1559(boolean arg0, int arg1) {
        if (arg0) {
            method1555((byte) 114, -11);
        }
        field3427++;
        return class13.field246[arg1].length() > 0 ? class298.field4711[arg1] + class26.field433 + class13.field246[arg1] : class298.field4711[arg1];
    }
}
