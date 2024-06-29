import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class215 {

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lld;")
    private class118 field3555 = new class118(256);

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Lld;")
    private class118 field3556 = new class118(256);

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Loh;")
    private class15 field3553;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Loh;")
    private class15 field3554;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lok;")
    private static class146 field3543 = class235.method1724(-12908, " more options");

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lok;")
    public static class146 field3550 = class235.method1724(-12908, "Clientscript error in: ");

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field3551 = 7759444;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field3542 = 0;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lok;")
    public static class146 field3548 = field3543;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Llc;")
    public static class160 field3547 = new class160();

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Lok;")
    public static class146 field3558 = class235.method1724(-12908, "<col=40ff00>");

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Lok;")
    public static class146 field3559 = class235.method1724(-12908, "Ablegen");

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Lcl;")
    public static class128 field3560;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Z")
    public static boolean field3549;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 31)
    public static void method1598(byte arg0) {
        field3559 = null;
        field3548 = null;
        if (arg0 <= 117) {
            field3560 = (class128) null;
        }
        field3547 = null;
        field3550 = null;
        field3558 = null;
        field3543 = null;
        field3560 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[I)Lid;", line = 64)
    public final class253 method1599(int arg0, int arg1, int[] arg2) {
        field3544++;
        if (this.field3554.method109(arg1 ^ 0xFFFFD487) == 1) {
            return this.method1600(arg0, 0, 1559144528, arg2);
        }
        if (arg1 != 0) {
            this.method1599(-41, 6, (int[]) null);
        }
        if (this.field3554.method95(arg1 + 64, arg0) != 1) {
            throw new RuntimeException();
        }
        return this.method1600(0, arg0, 1559144528, arg2);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III[I)Lid;", line = 91)
    private final class253 method1600(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg2 != 1559144528) {
            method1598((byte) -29);
        }
        int var5 = arg0 ^ ((arg1 & 0x20000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        field3546++;
        class253 var9 = (class253) this.field3556.method810((byte) -124, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class289 var10 = class289.method2083(this.field3554, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class253 var11 = var10.method2082();
            this.field3556.method805(var11, var7, 90);
            if (arg3 != null) {
                arg3[0] -= var11.field4232.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([IIII)Lid;", line = 128)
    private final class253 method1601(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 ^ (arg2 >>> 12 | (arg2 & 0x60000FFF) << 4);
        field3545++;
        int var6 = var5 | arg2 << 16;
        if (arg3 != 1559144528) {
            this.method1600(90, -14, -97, (int[]) null);
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class253 var9 = (class253) this.field3556.method810((byte) -116, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class29 var10 = (class29) this.field3555.method810((byte) -107, var7);
            if (var10 == null) {
                var10 = class29.method194(this.field3553, arg2, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field3555.method805(var10, var7, 78);
            }
            class253 var11 = var10.method187(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method1325(-2935);
                this.field3556.method805(var11, var7, 71);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Loh;Loh;)V", line = 178)
    public class215(class15 arg0, class15 arg1) {
        this.field3553 = arg1;
        this.field3554 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B[II)Lid;", line = 191)
    public final class253 method1602(byte arg0, int[] arg1, int arg2) {
        field3552++;
        if (this.field3553.method109(-11129) == 1) {
            return this.method1601(arg1, arg2, 0, 1559144528);
        } else if (this.field3553.method95(64, arg2) == 1) {
            return this.method1601(arg1, 0, arg2, 1559144528);
        } else if (arg0 <= 27) {
            return (class253) null;
        } else {
            throw new RuntimeException();
        }
    }
}
