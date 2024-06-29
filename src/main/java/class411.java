import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class411 implements class160 {

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Lga;")
    private class332 field5410;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Ltba;")
    public class703 field5401;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "[I")
    public static int[] field5407 = new int[8];

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[[I")
    public static int[][] field5400 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Lga;")
    public static class332 field5404;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lf;")
    public static class532 field5409;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "Lf;")
    public class532 field5411;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V", line = 4)
    public static void method2335(boolean arg0) {
        if (arg0) {
            field5409 = null;
        }
        field5404 = null;
        field5407 = null;
        field5400 = null;
        field5409 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)Z", line = 18)
    public final boolean method404(boolean arg0) {
        field5408++;
        if (arg0) {
            field5404 = null;
        }
        return this.field5410.method1931(1, this.field5401.field9883);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILwv;I)V", line = 31)
    public static final void method2336(int arg0, int arg1, class423 arg2, int arg3) {
        if (arg0 != 0) {
            method2335(true);
        }
        class177.field2499 = arg3;
        class663.field9448 = arg2;
        field5403++;
        class595.field8211 = arg1;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIB)Z", line = 45)
    public static final boolean method2337(int arg0, int arg1, byte arg2) {
        field5412++;
        if (arg2 < 69) {
            field5409 = null;
        }
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZB)V", line = 56)
    public void method374(boolean arg0, byte arg1) {
        if (arg0) {
            int var3 = this.field5401.field9876.method3139((byte) -127, this.field5411.method523(), class666.field9479) + this.field5401.field9880;
            int var4 = this.field5401.field9882.method1697(-73, this.field5411.method532(), class399.field5293) + this.field5401.field9881;
            this.field5411.method2990(var3, var4);
        }
        field5402++;
        if (arg1 >= -85) {
            this.field5410 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 76)
    public final void method402(int arg0) {
        this.field5411 = class567.method3141(-7, this.field5410, this.field5401.field9883);
        field5406++;
        if (arg0 < 119) {
            field5409 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZLjava/lang/String;I)Z", line = 87)
    public static final boolean method2338(int arg0, boolean arg1, String arg2, int arg3) {
        field5405++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        if (arg0 != 48) {
            return false;
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg3) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lga;Ltba;)V", line = 176)
    public class411(class332 arg0, class703 arg1) {
        this.field5410 = arg0;
        this.field5401 = arg1;
    }
}
