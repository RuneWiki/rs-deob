import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class282 {

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Liba;")
    public static class211 field3769 = new class211(41, 8);

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Lvg;")
    public static class622 field3770 = new class622(114, -2);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Lmv;")
    public static class295 field3772;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIBILps;)V")
    public static final void method1672(boolean arg0, int arg1, byte arg2, int arg3, class5 arg4) {
        field3767++;
        int var5 = arg4.field202;
        if (arg2 != 109) {
            return;
        }
        int var6 = arg4.field76;
        if (arg4.field126 == 0) {
            arg4.field202 = arg4.field178;
        } else if (arg4.field126 == 1) {
            arg4.field202 = arg3 - arg4.field178;
        } else if (arg4.field126 == 2) {
            arg4.field202 = arg4.field178 * arg3 >> 14;
        }
        if (arg4.field161 == 0) {
            arg4.field76 = arg4.field158;
        } else if (arg4.field161 == 1) {
            arg4.field76 = arg1 - arg4.field158;
        } else if (arg4.field161 == 2) {
            arg4.field76 = arg4.field158 * arg1 >> 14;
        }
        if (arg4.field126 == 4) {
            arg4.field202 = arg4.field76 * arg4.field58 / arg4.field64;
        }
        if (arg4.field161 == 4) {
            arg4.field76 = arg4.field64 * arg4.field202 / arg4.field58;
        }
        if (class1.field9 && (client.method564(arg4).field1275 != 0 || arg4.field172 == 0)) {
            if (arg4.field76 < 5 && arg4.field202 < 5) {
                arg4.field76 = 5;
                arg4.field202 = 5;
            } else {
                if (arg4.field202 <= 0) {
                    arg4.field202 = 5;
                }
                if (arg4.field76 <= 0) {
                    arg4.field76 = 5;
                }
            }
        }
        if (class188.field2535 == arg4.field96) {
            class94.field1453 = arg4;
        }
        if (arg0 && arg4.field97 != null && arg4.field202 != var5 || arg4.field76 != var6) {
            class303 var7 = new class303();
            var7.field4500 = arg4.field97;
            var7.field4499 = arg4;
            class625.field9038.method1909(var7, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method1673(int arg0) {
        if (arg0 < 41) {
            method1672(false, 40, (byte) -41, 14, null);
        }
        field3769 = null;
        field3770 = null;
        field3772 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZII)I")
    public static final int method1674(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1672(true, -69, (byte) 1, -10, null);
        }
        field3768++;
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
