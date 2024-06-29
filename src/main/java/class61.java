import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class61 {

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "Lke;")
    private class407 field1028 = new class407(256);

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "Lke;")
    private class407 field1035 = new class407(256);

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "Llt;")
    private class458 field1034;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "Llt;")
    private class458 field1029;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "Loe;")
    public static class127 field1027 = new class127(4, -2);

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "Lbg;")
    public static class310 field1030 = new class310(68, 4);

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "Loe;")
    public static class127 field1031 = new class127(96, -1);

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "[I")
    public static int[] field1032;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V", line = 3)
    public static void method424(int arg0) {
        field1030 = null;
        field1031 = null;
        field1027 = null;
        field1032 = null;
        if (arg0 != -2) {
            field1032 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIII)V", line = 27)
    public static final void method425(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -124 % ((1 - arg3) / 54);
        class146.field2369 = new byte[arg2][arg0][arg1];
        field1026++;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "([III)Lgu;", line = 37)
    public final class393 method426(int[] arg0, int arg1, int arg2) {
        field1024++;
        if (this.field1034.method2738((byte) 109) == 1) {
            return this.method428(arg2, 0, false, arg0);
        } else if (this.field1034.method2726((byte) 113, arg2) == 1) {
            return this.method428(0, arg2, false, arg0);
        } else {
            if (arg1 >= -86) {
                this.method428(-63, 123, true, null);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I[II)Lgu;", line = 67)
    public final class393 method427(int arg0, int[] arg1, int arg2) {
        field1025++;
        if (this.field1029.method2738((byte) 109) == 1) {
            return this.method429(arg2, 0, arg1, 0);
        } else if (this.field1029.method2726((byte) 113, arg2) == 1) {
            return this.method429(0, arg2, arg1, 0);
        } else {
            if (arg0 != -1854519324) {
                this.field1029 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIZ[I)Lgu;", line = 89)
    private final class393 method428(int arg0, int arg1, boolean arg2, int[] arg3) {
        field1023++;
        int var5 = ((arg1 & 0x10000FFF) << 4 | arg1 >>> 12) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class393 var9 = (class393) this.field1035.method2409(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class71 var10 = (class71) this.field1028.method2409(arg2, var7);
            if (var10 == null) {
                var10 = class71.method524(this.field1034, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field1028.method2413(var7, -1, var10);
            }
            class393 var11 = var10.method525(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method1121(false);
                this.field1035.method2413(var7, -1, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II[II)Lgu;", line = 136)
    private final class393 method429(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg3 != 0) {
            field1032 = null;
        }
        field1033++;
        int var5 = arg0 ^ (arg1 >>> 12 | (arg1 & 0x30000FFF) << 4);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class393 var9 = (class393) this.field1035.method2409(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class104 var10 = class104.method766(this.field1029, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class393 var11 = var10.method767();
            this.field1035.method2413(var7, arg3 - 1, var11);
            if (arg2 != null) {
                arg2[0] -= var11.field5741.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Llt;Llt;)V", line = 182)
    public class61(class458 arg0, class458 arg1) {
        this.field1034 = arg1;
        this.field1029 = arg0;
    }
}
