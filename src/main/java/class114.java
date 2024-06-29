import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class114 extends class30 {

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public static int field2057 = 0;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "J")
    public long field2055;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Llh;")
    public class114 field2054;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "Llh;")
    public class114 field2062;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "Ltg;")
    public static class189 field2059;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public final void method815(byte arg0) {
        field2063++;
        if (this.field2054 == null) {
            return;
        }
        this.field2054.field2062 = this.field2062;
        this.field2062.field2054 = this.field2054;
        this.field2054 = null;
        this.field2062 = null;
        int var2 = -21 % ((75 - arg0) / 45);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(IIIII)V")
    public static final void method816(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class23.method187(arg2, arg1, arg2 + arg3, arg0 + arg1);
        class23.method198(arg2, arg1, arg3, arg0, 0);
        field2056++;
        if (class35.field698 < 100) {
            return;
        }
        if (class21.field434 == null || class21.field434.field3193 != arg3 || class21.field434.field3204 != arg0) {
            class190 var5 = new class190(arg3, arg0);
            class23.method200(var5.field3263, arg3, arg0);
            class251.method1642(class252.field4337, 0, 0, arg0, (byte) 115, arg3, 0, 0, class181.field3149);
            class21.field434 = var5;
            class256.field4387.method827((byte) -124);
        }
        class21.field434.method477(arg2, arg1);
        int var6 = class89.field1711 * arg3 / class252.field4337 + arg2;
        int var7 = class184.field3202 * arg0 / class181.field3149 + arg1;
        int var8 = class174.field2978 * arg3 / class252.field4337;
        int var9 = class89.field1706 * arg0 / class181.field3149;
        if (arg4 < 71) {
            field2059 = null;
        }
        class23.method196(var6, var7, var8, var9, 16711680, 128);
        class23.method208(var6, var7, var8, var9, 16711680);
        if (class244.field4233 <= 0 || (class244.field4233 % 10) >= 5) {
            return;
        }
        for (class227 var10 = (class227) class241.field4185.method288(26111); var10 != null; var10 = (class227) class241.field4185.method277(1)) {
            if (class200.field3421 == var10.field3818) {
                int var11 = var10.field3814 * arg3 / class252.field4337 + arg2;
                int var12 = arg1 + (var10.field3815 * arg0 / class181.field3149);
                class23.method198(var11 - 2, var12 - 2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
    public static void method817(int arg0) {
        if (arg0 != -96241763) {
            method818(6, 0, 81, 59, 38, -92, -59, -62, -124);
        }
        field2059 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg5 > -74) {
            method816(91, -112, -68, -53, 119);
        }
        field2061++;
        if (class31.method258(arg1, 0)) {
            class8.field160 = null;
            class239.method1575(arg7, arg0, arg6, arg8, arg2, -1, arg3, class28.field539[arg1], arg4, 1338);
            if (class8.field160 != null) {
                class239.method1575(class32.field613, class129.field2310, arg6, arg8, arg2, -1412584499, arg3, class8.field160, arg4, 1338);
                class8.field160 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class137.field2456[var9] = true;
            }
        } else {
            class137.field2456[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)Z")
    public static final boolean method819(boolean arg0, int arg1) {
        if (arg0) {
            field2060++;
            return ((arg1 & 0x397344FA) >> 29) != 0;
        } else {
            return true;
        }
    }
}
