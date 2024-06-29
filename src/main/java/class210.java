import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class class210 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Z")
    public static boolean field3102 = false;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "[I")
    public static int[] field3105 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field3106 = -1;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field3109 = 0;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "[I")
    public static int[] field3108;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
    public static final int method1479(int arg0, int arg1) {
        field3107++;
        if (arg1 < 0) {
            return 0;
        }
        class101 var2 = (class101) class142.field2308.method1073(arg0 + 14719, (long) arg1);
        if (var2 == null) {
            return class129.method977(-8467, arg1).field2332;
        }
        int var3 = 0;
        if (arg0 != -14720) {
            return -64;
        }
        for (int var4 = 0; var4 < var2.field1717.length; var4++) {
            if (var2.field1717[var4] == -1) {
                var3++;
            }
        }
        return var3 + class129.method977(-8467, arg1).field2332 - var2.field1717.length;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([BZ)V")
    public abstract void method1181(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1182(int arg0);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public static void method1480(int arg0) {
        if (arg0 != 2) {
            method1482(-84, true, 85, -117, 3);
        }
        field3105 = null;
        field3108 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)J")
    public static final long method1481(int arg0, int arg1, int arg2) {
        class313 var3 = class223.field3286[arg0][arg1][arg2];
        return var3 == null || var3.field5023 == null ? 0L : var3.field5023.field4393;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZIII)V")
    public static final void method1482(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (!arg1) {
            field3106 = 50;
        }
        while (var5 < class64.field968) {
            if (arg2 < class59.field873[var5] + class267.field4276[var5] && (arg2 + arg4) > class59.field873[var5] && arg0 < (class76.field1188[var5] + class186.field2772[var5]) && class76.field1188[var5] < arg0 + arg3) {
                class91.field1452[var5] = true;
            }
            var5++;
        }
        field3104++;
    }
}
