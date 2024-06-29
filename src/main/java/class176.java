import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class176 extends class281 {

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "Lib;")
    public static class56 field2797;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V")
    public static void method1219(byte arg0) {
        field2797 = null;
        if (arg0 <= 107) {
            method1219((byte) 102);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)Lge;")
    public static final class285 method1220(int arg0, int arg1) {
        class285 var2 = (class285) class156.field2511.method1469(arg0 + 7776, (long) arg1);
        field2795++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class163.field2596.method928(class132.method896(-94, arg1), (byte) 113, class206.method1453((byte) -53, arg1));
        class285 var4 = new class285();
        if (arg0 != 512) {
            return null;
        }
        if (var3 != null) {
            var4.method1916(new class96(var3), -79);
        }
        class156.field2511.method1467((byte) -119, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)V")
    private static final void method1221(byte arg0) {
        if (arg0 <= 37) {
            field2797 = null;
        }
        int var1 = 0;
        field2794++;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class278.method1853(true, var3, class46.field585, var2, var1, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)V")
    public static final void method1222(boolean arg0) {
        int var1 = class147.method1014(113);
        if (var1 == 0) {
            class18.field218 = null;
            class202.method1408((byte) -61, 0);
        } else if (var1 == 1) {
            class93.method523((byte) 0, -119);
            class202.method1408((byte) -61, 512);
            method1221((byte) 56);
        } else {
            class93.method523((byte) (class130.field2085 - 4 & 0xFF), -126);
            class202.method1408((byte) -61, 2);
        }
        if (arg0) {
            method1220(1, 56);
        }
        field2798++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIII)V")
    public static final void method1223(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2796++;
        for (int var5 = 0; var5 < class221.field3561; var5++) {
            if (arg2 < class233.field3858[var5] + class180.field2869[var5] && arg2 + arg3 > class233.field3858[var5] && (class256.field4160[var5] + class148.field2328[var5]) > arg1 && (arg0 + arg1) > class148.field2328[var5]) {
                class103.field1386[var5] = true;
            }
        }
        if (arg4 != 26597) {
            method1221((byte) 49);
        }
    }
}
