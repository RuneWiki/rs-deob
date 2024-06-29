import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class29 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[I")
    public static int[] field359 = new int[50];

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field363 = "Loading sprites - ";

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "D")
    public static double field367 = -1.0D;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "[J")
    public static long[] field364 = new long[32];

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 24)
    public static void method222(int arg0) {
        field363 = null;
        field364 = null;
        if (arg0 > -25) {
            field365 = 10;
        }
        field359 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Lan;", line = 41)
    public static final class319 method223(byte arg0, int arg1) {
        field360++;
        if (arg0 != -28) {
            field367 = 1.8787935342633821D;
        }
        class319 var2 = (class319) class91.field1386.method1294((long) arg1, 120);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class136.field2116.method2103(0, 4, arg1);
        class319 var4 = new class319();
        if (var3 != null) {
            var4.method2167(arg1, new class303(var3), (byte) 94);
        }
        class91.field1386.method1292((long) arg1, arg0 + 141, var4);
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)I", line = 70)
    public static final int method224(int arg0) {
        field362++;
        if (arg0 > -83) {
            field359 = (int[]) null;
        }
        return class163.field2515.method1290(-5739);
    }
}
