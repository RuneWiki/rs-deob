import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class229 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3156 = "Loaded input handler";

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field3162 = -1;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lam;")
    public static class286 field3161;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)Lrd;", line = 14)
    public static final class417 method1245(boolean arg0, int arg1) {
        field3160++;
        class417 var2 = (class417) class282.field3858.method222((long) arg1, -8407);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class350.field4881.method1687(arg1, 5, 255);
        class417 var4 = new class417();
        if (arg0) {
            field3162 = -13;
        }
        if (var3 != null) {
            var4.method2588(new class250(var3), (byte) -125);
        }
        class282.field3858.method218((long) arg1, (byte) -128, var4);
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 39)
    public static void method1246(int arg0) {
        if (arg0 != -1) {
            method1246(-58);
        }
        field3161 = null;
        field3156 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lja;IZ)V", line = 53)
    public static final void method1247(class89 arg0, int arg1, boolean arg2) {
        field3157++;
        if (!arg2) {
            return;
        }
        if (class179.field2247) {
            arg1 = 0;
            class179.field2247 = false;
        }
        if (class376.field5275 != null && class376.field5275.method490(true, arg0)) {
            return;
        }
        class376.field5275 = arg0;
        class232.field3203 = class442.method2730(25207);
        class219.field2937 = arg1;
        class84.field937 = arg1;
        if (class84.field937 != 0) {
            class92.field1057 = class5.field40;
            class187.field2357 = class44.field455;
            class153.field1933 = class385.field5486;
            class68.field702 = class151.field1916;
            class41.field434 = class366.field5125;
            class247.field3336 = class101.field1188;
            class435.field6360 = class279.field3788;
            class246.field3328 = class379.field5352;
            class260.field3534 = class12.field115;
            class14.field129 = class281.field3851;
            return;
        }
        class142.method774((byte) -81);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLlh;)[Ltn;", line = 94)
    public static final class108[] method1248(byte arg0, class450 arg1) {
        field3158++;
        if (!arg1.method2796(false)) {
            return new class108[0];
        }
        class304 var2 = arg1.method2782(5);
        while (var2.field4123 == 0) {
            class370.method2235(10L, 10);
        }
        if (var2.field4123 == 2) {
            return new class108[0];
        } else if (arg0 <= 36) {
            return null;
        } else {
            int[] var3 = (int[]) var2.field4126;
            class108[] var4 = new class108[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class108 var6 = new class108();
                var4[var5] = var6;
                var6.field1320 = var3[var5 << 2];
                var6.field1326 = var3[(var5 << 2) + 1];
                var6.field1327 = var3[(var5 << 2) + 2];
                var6.field1323 = var3[(var5 << 2) + 3];
            }
            return var4;
        }
    }
}
