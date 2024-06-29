import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class149 extends class41 {

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "Lsc;")
    public class181 field2492;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "Lsc;")
    private static class181 field2485 = method967(255, "Sep");

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field2484 = 0;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "Lsc;")
    private static class181 field2489 = method967(255, "Jan");

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "Lsc;")
    private static class181 field2493 = method967(255, "Aug");

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field2483 = 0;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "Lsc;")
    private static class181 field2488 = method967(255, "Mar");

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "[J")
    public static long[] field2491 = new long[32];

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "Lsc;")
    private static class181 field2487 = method967(255, "Jul");

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "Lsc;")
    private static class181 field2498 = method967(255, "Apr");

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "[J")
    public static long[] field2494 = new long[100];

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "Lsc;")
    private static class181 field2495 = method967(255, "Feb");

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "Lsc;")
    private static class181 field2500 = method967(255, "May");

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "Z")
    public static boolean field2499 = false;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "Lsc;")
    private static class181 field2504 = method967(255, "Oct");

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "Lsc;")
    private static class181 field2506 = method967(255, "Nov");

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "Lsc;")
    private static class181 field2505 = method967(255, "Jun");

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "Lsc;")
    private static class181 field2502 = method967(255, "Dec");

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "[Lsc;")
    public static class181[] field2486 = new class181[] { field2489, field2495, field2488, field2498, field2500, field2505, field2487, field2493, field2485, field2504, field2506, field2502 };

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "[[I")
    public static int[][] field2507;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/lang/String;)Lsc;")
    public static final class181 method967(int arg0, String arg1) {
        field2496++;
        byte[] var2 = arg1.getBytes();
        if (arg0 != 255) {
            return null;
        }
        int var3 = var2.length;
        int var4 = 0;
        class181 var5 = new class181();
        var5.field3166 = new byte[var3];
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field3166[var5.field3155++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field3166[var5.field3155++] = (byte) var6;
            }
        }
        var5.method1221(1);
        return var5.method1200(-116);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
    public static final void method968(byte arg0, int arg1) {
        field2501++;
        if (arg0 >= 58) {
            class69.field1103.method1796(20, arg1);
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    public static void method969(int arg0) {
        if (arg0 != -48) {
            field2486 = null;
        }
        field2485 = null;
        field2488 = null;
        field2487 = null;
        field2505 = null;
        field2495 = null;
        field2493 = null;
        field2494 = null;
        field2500 = null;
        field2489 = null;
        field2502 = null;
        field2507 = null;
        field2498 = null;
        field2504 = null;
        field2491 = null;
        field2506 = null;
        field2486 = null;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class149() {
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lsc;I)V")
    public class149(class181 arg0, int arg1) {
        this.field2492 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
    public static final void method970(int arg0, boolean arg1) {
        field2503++;
        class70.field1113.method1796(20, arg0);
        if (!arg1) {
            field2506 = null;
        }
        class73.field1164.method1796(20, arg0);
        class188.field3324.method1796(20, arg0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B[Lsc;)[Lsc;")
    public static final class181[] method971(byte arg0, class181[] arg1) {
        field2490++;
        if (arg0 > -102) {
            return null;
        }
        class181[] var2 = new class181[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class175.method1164(new class181[] { class169.method1119((byte) 42, var3), class96.field1541 }, (byte) 123);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class175.method1164(new class181[] { var2[var3], arg1[var3] }, (byte) 123);
            }
        }
        return var2;
    }
}
