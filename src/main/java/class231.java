import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class231 {

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "Lwa;")
    private class661 field2857 = new class661(256);

    @OriginalMember(owner = "client!jea", name = "n", descriptor = "Lwa;")
    private class661 field2861 = new class661(256);

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "Ltf;")
    private class701 field2856;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "Ltf;")
    private class701 field2850;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "Z")
    public static boolean field2854 = false;

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "[Lef;")
    public static class581[] field2858 = new class581[4];

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "([IIII)Lug;", line = 7)
    private final class450 method1382(int[] arg0, int arg1, int arg2, int arg3) {
        field2852++;
        int var5 = ((arg1 & 0xC0000FFF) << 4 | arg1 >>> 12) ^ arg3;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class450 var9 = (class450) this.field2861.method3669(var7, -1);
        if (arg2 >= -67) {
            this.method1385(58, null, (byte) 113, 114);
        }
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class253 var10 = (class253) this.field2857.method3669(var7, -1);
            if (var10 == null) {
                var10 = class253.method1483(this.field2850, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field2857.method3671(false, var10, var7);
            }
            class450 var11 = var10.method1485(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method1922(111);
                this.field2861.method3671(false, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V", line = 56)
    public static void method1383(int arg0) {
        if (arg0 == 0) {
            field2858 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I[II)Lug;", line = 69)
    public final class450 method1384(int arg0, int[] arg1, int arg2) {
        field2853++;
        int var4 = 22 / ((arg0 + 27) / 37);
        if (this.field2850.method3877(100) == 1) {
            return this.method1382(arg1, 0, -91, arg2);
        } else if (this.field2850.method3883(arg2, 0) == 1) {
            return this.method1382(arg1, arg2, -92, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I[IBI)Lug;", line = 88)
    private final class450 method1385(int arg0, int[] arg1, byte arg2, int arg3) {
        field2859++;
        int var5 = (arg0 << 4 & 0xFFF9 | arg0 >>> 12) ^ arg3;
        if (arg2 != 123) {
            field2858 = null;
        }
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class450 var9 = (class450) this.field2861.method3669(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class52 var10 = class52.method268(this.field2856, arg0, arg3);
            if (var10 == null) {
                return null;
            }
            class450 var11 = var10.method270();
            this.field2861.method3671(false, var11, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field6310.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)Z", line = 129)
    public static final boolean method1386(int arg0, int arg1, int arg2) {
        int var3 = -106 / ((arg1 - 54) / 52);
        field2855++;
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIBI)V", line = 139)
    public static final void method1387(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2851++;
        if (arg3 != 127) {
            return;
        }
        class76 var5 = class3.method28(10, (byte) 42, arg4);
        var5.method403((byte) 40);
        var5.field780 = arg1;
        var5.field789 = arg0;
        var5.field785 = arg2;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)Z", line = 157)
    public static final boolean method1388(int arg0, int arg1) {
        int var2 = -110 / ((-arg0 - 48) / 56);
        field2848++;
        if (arg1 == 20 || arg1 == 18 || arg1 == 48 || arg1 == 13 || arg1 == 6) {
            return true;
        } else {
            return arg1 == 16 || arg1 == 1006;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZ[I)Lug;", line = 181)
    public final class450 method1389(int arg0, boolean arg1, int[] arg2) {
        field2849++;
        if (this.field2856.method3877(100) == 1) {
            return this.method1385(0, arg2, (byte) 123, arg0);
        } else if (this.field2856.method3883(arg0, 0) == 1) {
            return this.method1385(arg0, arg2, (byte) 123, 0);
        } else if (arg1) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Ltf;Ltf;)V", line = 218)
    public class231(class701 arg0, class701 arg1) {
        this.field2856 = arg0;
        this.field2850 = arg1;
    }
}
