import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class154 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lcd;")
    private static class64 field2724 = class44.method335((byte) 71, "Loaded update list");

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lcd;")
    public static class64 field2732 = field2724;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field2723 = 0;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lcd;")
    public static class64 field2725 = class44.method335((byte) 71, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field2734 = 0;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
    public static int[] field2726 = new int[200];

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method1109(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class237.field3995 == 1) {
            class184.field3150[class238.field4051 / 100].method306(class277.field4778 - 8, class237.field4004 + -8);
        }
        if (class237.field3995 == arg1) {
            class184.field3150[(class238.field4051 / 100) + 4].method306(class277.field4778 - 8, class237.field4004 + -8);
        }
        field2727++;
        class274.method1903((byte) 74);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Lcd;", line = 24)
    public static final class64 method1110(int arg0, int arg1) {
        field2722++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        if (arg1 != 17186) {
            method1110(-109, -8);
        }
        class64 var2 = new class64();
        var2.field1252 = new byte[1];
        var2.field1274 = 1;
        var2.field1252[0] = (byte) arg0;
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V", line = 47)
    public static final void method1111(int arg0, int arg1) {
        if (arg1 == -1 && !class43.field696) {
            class196.method1375((byte) -122);
        } else if (arg1 != -1 && (class78.field1469 != arg1 || !class76.method606(0)) && class163.field2865 != 0 && !class43.field696) {
            class2.method7(59, class297.field5114, arg1, 0, false, class163.field2865, 2);
        }
        class78.field1469 = arg1;
        field2733++;
        if (arg0 > -120) {
            method1110(-75, 93);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILcd;)I", line = 72)
    public static final int method1112(int arg0, class64 arg1) {
        field2731++;
        for (int var2 = 0; var2 < class83.field1535.length; var2++) {
            if (class83.field1535[var2].method515(-64, arg1)) {
                return var2;
            }
        }
        int var3 = -117 % ((-arg0) / 56);
        return -1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 102)
    public static void method1113(int arg0) {
        field2725 = null;
        if (arg0 != 1) {
            method1113(-117);
        }
        field2726 = null;
        field2732 = null;
        field2724 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)J", line = 125)
    public static final synchronized long method1114(boolean arg0) {
        field2728++;
        if (!arg0) {
            method1115(11, (class64) null);
        }
        long var1 = System.currentTimeMillis();
        if (class268.field4611 > var1) {
            class155.field2743 += class268.field4611 - var1;
        }
        class268.field4611 = var1;
        return var1 + class155.field2743;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(ILcd;)V", line = 149)
    public static final void method1115(int arg0, class64 arg1) {
        field2730++;
        if (class118.field2153 == null) {
            return;
        }
        if (arg0 != -32456) {
            method1116(96, -48, 117, -19);
        }
        int var2 = 0;
        long var3 = arg1.method509(arg0 + 63948);
        if (var3 == 0L) {
            return;
        }
        while (class118.field2153.length > var2 && class118.field2153[var2].field417 != var3) {
            var2++;
        }
        if (var2 < class118.field2153.length && class118.field2153[var2] != null) {
            class17.field353.method1214(arg0 ^ 0x7EDA, 151);
            class17.field353.method161((byte) -67, class118.field2153[var2].field417);
            class53.field865++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)V", line = 204)
    public static final void method1116(int arg0, int arg1, int arg2, int arg3) {
        class295 var4 = class304.field5203[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class184 var5 = var4.field5079;
        if (var5 != null) {
            var5.field3147 = var5.field3147 * arg3 / 16;
            var5.field3142 = var5.field3142 * arg3 / 16;
        }
    }
}
