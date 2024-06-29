import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class225 {

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field2994 = 100;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Lwaa;")
    public static class705 field2991;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIB)I", line = 6)
    public static final int method1448(int arg0, int arg1, int arg2, byte arg3) {
        field2990++;
        if (class195.field2669 == null) {
            return 0;
        }
        int var4 = arg1 >> 9;
        if (arg3 != 28) {
            return -126;
        }
        int var5 = arg2 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > (class409.field5183 - 1) || var5 > class543.field7597 - 1) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class305.field4001[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        return class195.field2669[var6].method1676(arg1, true, arg2);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)Z", line = 34)
    public static final boolean method1449(int arg0) {
        field2993++;
        class254 var1 = (class254) class660.field9187.method3672(-1);
        if (var1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < var1.field3246; var2++) {
            if (var1.field3241[var2] != null && var1.field3241[var2].field2538 == 0) {
                return false;
            }
            if (var1.field3242[var2] != null && var1.field3242[var2].field2538 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 76)
    public static void method1450(byte arg0) {
        field2991 = null;
        if (arg0 != -80) {
            method1449(-75);
        }
    }
}
