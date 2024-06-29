import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 extends class17 {

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Lmb;")
    public static class84 field394 = class79.method672(true, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field395 = 0;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "Lmb;")
    private static class84 field399 = class79.method672(true, "Loading config )2 ");

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "Lmb;")
    public static class84 field403 = class79.method672(true, "T");

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lmb;")
    public static class84 field396 = class79.method672(true, "::noclip");

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "Lmb;")
    private static class84 field398 = class79.method672(true, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "Lmb;")
    public static class84 field406 = field399;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "Lmb;")
    public static class84 field400 = field398;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "Z")
    public static boolean field409 = false;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "[I")
    public static int[] field408 = new int[5];

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "Lsd;")
    public static class122 field404;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    public static void method124(int arg0) {
        field400 = null;
        if (arg0 != -23239) {
            method129(-84);
        }
        field404 = null;
        field408 = null;
        field398 = null;
        field396 = null;
        field399 = null;
        field403 = null;
        field394 = null;
        field406 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)Ldb;")
    public static final class24 method125(byte arg0, int arg1) {
        class24 var2 = (class24) class145.field3492.method970(-27059, (long) arg1);
        field392++;
        if (arg0 >= -1) {
            field408 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class17.field386.method986(arg1, 1, (byte) 67);
        class24 var4 = new class24();
        if (var3 != null) {
            var4.method167((byte) -110, arg1, new class51(var3));
        }
        var4.method165(-6467);
        class145.field3492.method965(var4, 208, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsd;IBZLsd;)Lqe;")
    public static final class111 method126(class122 arg0, int arg1, byte arg2, boolean arg3, class122 arg4) {
        field391++;
        int[] var5 = arg0.method1007(arg1, 0);
        boolean var6 = true;
        int var7 = 0;
        if (arg2 != -72) {
            return null;
        }
        while (var7 < var5.length) {
            byte[] var8 = arg0.method1000((byte) 78, var5[var7], arg1);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg3) {
                    var10 = arg4.method1000((byte) -126, var9, 0);
                } else {
                    var10 = arg4.method1000((byte) -117, 0, var9);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
            var7++;
        }
        if (!var6) {
            return null;
        }
        try {
            return new class111(arg0, arg4, arg1, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
    public static final void method127(int arg0) {
        field390++;
        if (arg0 != 1) {
            field398 = null;
        }
        while (true) {
            class16 var1 = class24.field580;
            class79 var2;
            synchronized (class24.field580) {
                var2 = (class79) class76.field1917.method103(arg0 ^ 0xFFFFFF8E);
            }
            if (var2 == null) {
                return;
            }
            var2.field1966.method344((byte) 60, (int) var2.field370, false, var2.field1965, var2.field1952);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(BI)I")
    public static final int method128(byte arg0, int arg1) {
        field397++;
        if (arg0 > -27) {
            method124(63);
        }
        return arg1 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)I")
    public static final int method129(int arg0) {
        field393++;
        return arg0 == 6 ? 6 : 53;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class19() {
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V")
    public class19(int arg0) {
        this.field405 = arg0;
    }
}
