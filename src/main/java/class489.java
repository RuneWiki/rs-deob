import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class489 {

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "Lcb;")
    private class78 field6879 = new class78(256);

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "Lcb;")
    private class78 field6885 = new class78(256);

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "Lgp;")
    private class561 field6884;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "Lgp;")
    private class561 field6880;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "Liu;")
    public static class517 field6883 = new class517(19, 10);

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[II)Lar;")
    public final class4 method2792(int arg0, int[] arg1, int arg2) {
        field6877++;
        int var4 = 38 % ((-arg0 - 11) / 53);
        if (this.field6880.method3185(-59) == 1) {
            return this.method2796(arg2, 0, -1, arg1);
        } else if (this.field6880.method3164(arg2, true) == 1) {
            return this.method2796(0, arg2, -1, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[III)Lar;")
    private final class4 method2793(int arg0, int[] arg1, int arg2, int arg3) {
        field6878++;
        int var5 = (arg3 >>> 12 | arg3 << 4 & 0xFFF1) ^ arg0;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class4 var9 = (class4) this.field6885.method740(0, var7);
        if (var9 != null) {
            return var9;
        }
        if (arg2 != -24401) {
            field6883 = null;
        }
        if (arg1 != null && arg1[0] <= 0) {
            return null;
        }
        class532 var10 = (class532) this.field6879.method740(0, var7);
        if (var10 == null) {
            var10 = class532.method3008(this.field6884, arg3, arg0);
            if (var10 == null) {
                return null;
            }
            this.field6879.method737(var7, (byte) 92, var10);
        }
        class4 var11 = var10.method3000(arg1);
        if (var11 == null) {
            return null;
        } else {
            var10.method911(arg2 + 24349);
            this.field6885.method737(var7, (byte) 92, var11);
            return var11;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "([III)Lar;")
    public final class4 method2794(int[] arg0, int arg1, int arg2) {
        field6882++;
        if (this.field6884.method3185(-34) == 1) {
            return this.method2793(arg1, arg0, -24401, 0);
        }
        int var4 = -97 / (-arg2 / 62);
        if (this.field6884.method3164(arg1, true) != 1) {
            throw new RuntimeException();
        }
        return this.method2793(0, arg0, -24401, arg1);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public static void method2795(int arg0) {
        if (arg0 != -1) {
            field6883 = null;
        }
        field6883 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(III[I)Lar;")
    private final class4 method2796(int arg0, int arg1, int arg2, int[] arg3) {
        field6881++;
        int var5 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF4);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class4 var9 = (class4) this.field6885.method740(0, var7);
        if (arg2 != -1) {
            field6883 = null;
        }
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class60 var10 = class60.method483(this.field6880, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class4 var11 = var10.method481();
            this.field6885.method737(var7, (byte) 92, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field34.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lgp;Lgp;)V")
    public class489(class561 arg0, class561 arg1) {
        this.field6884 = arg1;
        this.field6880 = arg0;
    }
}
