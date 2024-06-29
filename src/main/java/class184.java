import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class184 {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "[I")
    public static int[] field3315 = new int[99];

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lcc;")
    public static class209 field3318;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V")
    public static final void method1253(boolean arg0, int arg1) {
        field3316++;
        class75 var2 = (class75) class31.field554.method1755((long) arg1, (byte) -71);
        if (var2 != null && arg0) {
            for (int var3 = 0; var3 < var2.field1403.length; var3++) {
                var2.field1403[var3] = -1;
                var2.field1401[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public static void method1254(boolean arg0) {
        if (arg0) {
            field3319 = 119;
        }
        field3315 = null;
        field3318 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Z")
    public static final boolean method1255(int arg0, int arg1) {
        class6.field78 = true;
        if (arg1 >= -74) {
            method1254(true);
        }
        field3313++;
        class264.field4732 = arg0 + 1 & 0xFFFF;
        return true;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field3315[var1] = var0 / 4;
        }
        field3318 = null;
    }
}
