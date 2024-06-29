import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class327 {

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "[Llha;")
    private class623[] field4237;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
    private int field4248;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "Ldh;")
    public static class320 field4242 = new class320(40, -1);

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static volatile int field4245 = -1;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "Z")
    public static boolean field4247 = false;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "[I")
    public static int[] field4246 = new int[1];

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "J")
    private long field4249;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Lhu;")
    public static class131 field4243;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Llha;")
    private class623 field4239;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
    public static final void method1952(boolean arg0) {
        if (arg0) {
            method1954(67, -34, null, -27);
        }
        field4238++;
        int var1 = class585.field8256;
        int[] var2 = class399.field5459;
        for (int var3 = 0; var3 < var1; var3++) {
            class183 var9 = class75.field792[var2[var3]];
            if (var9 != null && var9.field7079 > 0) {
                var9.field7079--;
                if (var9.field7079 == 0) {
                    var9.field7125 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class302.field3784; var4++) {
            long var5 = (long) class272.field3359[var4];
            class151 var7 = (class151) class253.field3052.method1754(arg0, var5);
            if (var7 != null) {
                class197 var8 = var7.field1661;
                if (var8.field7079 > 0) {
                    var8.field7079--;
                    if (var8.field7079 == 0) {
                        var8.field7125 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Llha;")
    public final class623 method1953(int arg0) {
        field4244++;
        if (this.field4239 == null) {
            return null;
        }
        class623 var2 = this.field4237[(int) ((long) (this.field4248 - 1) & this.field4249)];
        if (arg0 != -29571) {
            field4247 = false;
        }
        while (this.field4239 != var2) {
            if (this.field4239.field8919 == this.field4249) {
                class623 var3 = this.field4239;
                this.field4239 = this.field4239.field8923;
                return var3;
            }
            this.field4239 = this.field4239.field8923;
        }
        this.field4239 = null;
        return null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II[BI)[B")
    public static final byte[] method1954(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != 802) {
            field4245 = 74;
        }
        field4240++;
        byte[] var4;
        if (arg0 > 0) {
            var4 = new byte[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                var4[var5] = arg2[arg0 + var5];
            }
        } else {
            var4 = arg2;
        }
        class229 var6 = new class229();
        var6.method1329(0);
        var6.method1327(0, (long) (arg1 * 8), var4);
        byte[] var7 = new byte[64];
        var6.method1328(0, (byte) -111, var7);
        return var7;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BJLlha;)V")
    public final void method1955(byte arg0, long arg1, class623 arg2) {
        if (arg2.field8927 != null) {
            arg2.method3562((byte) -48);
        }
        field4241++;
        class623 var5 = this.field4237[(int) (arg1 & (long) (this.field4248 - 1))];
        arg2.field8923 = var5;
        arg2.field8927 = var5.field8927;
        arg2.field8927.field8923 = arg2;
        arg2.field8919 = arg1;
        arg2.field8923.field8927 = arg2;
        if (arg0 < 83) {
            field4245 = 24;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)I")
    public static int method1956(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(Z)V")
    public static void method1957(boolean arg0) {
        field4242 = null;
        if (arg0) {
            field4246 = null;
            field4243 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IJ)Llha;")
    public final class623 method1958(int arg0, long arg1) {
        this.field4249 = arg1;
        field4236++;
        class623 var4 = this.field4237[(int) (arg1 & (long) (this.field4248 + arg0))];
        for (this.field4239 = var4.field8923; this.field4239 != var4; this.field4239 = this.field4239.field8923) {
            if (this.field4239.field8919 == arg1) {
                class623 var5 = this.field4239;
                this.field4239 = this.field4239.field8923;
                return var5;
            }
        }
        this.field4239 = null;
        return null;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
    public static final void method1959(int arg0) {
        for (int var1 = arg0; var1 < class486.field6971; var1++) {
            int var2 = class747.method4151(arg0 ^ 0xF91C26BF, class486.field6971, class515.field7347 + var1) * class712.field10031;
            for (int var3 = 0; var3 < class712.field10031; var3++) {
                int var4 = class747.method4151(-115595585, class712.field10031, class261.field3244 + var3) + var2;
                if (class11.field87[var4] == class660.field9427) {
                    class151.field1667[var4].method769(0, 0, class125.field1313, class541.field7787, class125.field1313 * var3, class541.field7787 * var1, true, true);
                }
            }
        }
        field4235++;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(I)V")
    public class327(int arg0) {
        this.field4237 = new class623[arg0];
        this.field4248 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class623 var3 = this.field4237[var2] = new class623();
            var3.field8923 = var3;
            var3.field8927 = var3;
        }
    }
}
