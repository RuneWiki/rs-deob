import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class class135 {

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "J")
    public static long field1972 = 0L;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public abstract void method838(int arg0);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)J")
    public abstract long method839(boolean arg0);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z")
    public static final boolean method882(int arg0, int arg1, int arg2) {
        field1970++;
        if (arg2 != 5595) {
            return true;
        } else if (class177.field2518) {
            int var3 = arg1 >> 16;
            int var4 = arg1 & 0xFFFF;
            if (class123.field1767[var3] == null || class123.field1767[var3][var4] == null) {
                return false;
            }
            class82 var5 = class123.field1767[var3][var4];
            if (arg0 == -1 && var5.field1026 == 0) {
                for (int var6 = 0; var6 < class112.field1496; var6++) {
                    if (class190.field2749[var6] == 60 || class190.field2749[var6] == 1001 || class190.field2749[var6] == 35 || class190.field2749[var6] == 31 || class190.field2749[var6] == 17) {
                        for (class82 var7 = class182.method1187((byte) -41, class271.field3978[var6]); var7 != null; var7 = class42.method263(-95, var7)) {
                            if (var5.field1025 == var7.field1025) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (int var8 = 0; var8 < class112.field1496; var8++) {
                    if (class240.field3485[var8] == arg0 && class271.field3978[var8] == var5.field1025 && (class190.field2749[var8] == 60 || class190.field2749[var8] == 1001 || class190.field2749[var8] == 35 || class190.field2749[var8] == 31 || class190.field2749[var8] == 17)) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(III)I")
    public abstract int method840(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static final void method883(byte arg0) {
        int var1 = 69 % ((-arg0 - 7) / 57);
        field1973++;
        class198.field2817.method67((byte) 24);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(III)I")
    public static final int method884(int arg0, int arg1, int arg2) {
        field1968++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == arg2) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }
}
