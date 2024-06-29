import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class668 {

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Lca;")
    private class119 field9265;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    private int field9269;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    private int field9278;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lbc;")
    private class9 field9266;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Lra;")
    public static class361 field9275 = new class361(23, -2);

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field9276 = -1;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field9280 = -2;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Lra;")
    public static class361 field9277 = new class361(80, 11);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field9268;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field9270;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field9271;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field9272;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Lpe;")
    public static class615 field9279;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method3649(int arg0) {
        field9279 = null;
        field9275 = null;
        field9277 = null;
        int var1 = -46 % ((arg0 + 8) / 62);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(JILjava/lang/Object;)V")
    public final void method3650(long arg0, int arg1, Object arg2) {
        field9267++;
        if (arg1 <= -99) {
            this.method3657(1, 18778, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjda;)V")
    private final void method3651(boolean arg0, class77 arg1) {
        if (arg1 != null) {
            arg1.method2438((byte) 122);
            arg1.method237((byte) -93);
            this.field9269 += arg1.field1048;
        }
        field9263++;
        if (arg0) {
            this.method3651(true, null);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
    public final int method3652(int arg0) {
        field9274++;
        if (arg0 != 23) {
            this.method3659(-85, 91);
        }
        return this.field9269;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
    public final int method3653(int arg0) {
        field9268++;
        int var2 = 0;
        for (class77 var3 = (class77) this.field9265.method887(-99); var3 != null; var3 = (class77) this.field9265.method892(true)) {
            if (!var3.method621(-125)) {
                var2++;
            }
        }
        if (arg0 <= 105) {
            this.method3657(-124, -21, 104L, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method3654(int arg0) {
        if (arg0 != 80) {
            this.field9269 = 69;
        }
        field9272++;
        class77 var2 = (class77) this.field9266.method42((byte) 122);
        while (var2 != null) {
            Object var3 = var2.method622(24910);
            if (var3 != null) {
                return var3;
            }
            class77 var4 = var2;
            var2 = (class77) this.field9266.method40(false);
            var4.method2438((byte) 125);
            var4.method237((byte) -102);
            this.field9269 += var4.field1048;
        }
        return null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method3655(int arg0, long arg1) {
        field9264++;
        class77 var4 = (class77) this.field9266.method39(arg1, 31750);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method622(24910);
        if (var5 == null) {
            var4.method2438((byte) 124);
            var4.method237((byte) -105);
            this.field9269 += var4.field1048;
            return null;
        }
        int var6 = -51 % ((-arg0 - 72) / 36);
        if (var4.method621(-128)) {
            class481 var7 = new class481(var5, var4.field1048);
            this.field9266.method38(var7, 62, var4.field5499);
            this.field9265.method890((byte) -119, var7);
            var7.field437 = 0L;
            var4.method2438((byte) 112);
            var4.method237((byte) -116);
        } else {
            this.field9265.method890((byte) -16, var4);
            var4.field437 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public final void method3656(byte arg0) {
        field9270++;
        this.field9265.method896(arg0 ^ 0xD);
        this.field9266.method41(arg0 ^ 0x3E);
        this.field9269 = this.field9278;
        if (arg0 != 0) {
            this.method3661(true, 30L);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I)V")
    public class668(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIJLjava/lang/Object;)V")
    public final void method3657(int arg0, int arg1, long arg2, Object arg3) {
        field9262++;
        if (this.field9278 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method3661(true, arg2);
        this.field9269 -= arg0;
        while (this.field9269 < 0) {
            class77 var7 = (class77) this.field9265.method893((byte) 109);
            this.method3651(false, var7);
        }
        class481 var6 = new class481(arg3, arg0);
        this.field9266.method38(var6, -105, arg2);
        this.field9265.method890((byte) -80, var6);
        var6.field437 = 0L;
        if (arg1 != 18778) {
            field9276 = 33;
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public final void method3658(int arg0) {
        class77 var2 = (class77) this.field9265.method887(arg0 ^ 0xFFFFFF83);
        if (arg0 != 0) {
            field9277 = null;
        }
        while (var2 != null) {
            if (var2.method621(arg0 ^ 0xFFFFFF80)) {
                var2.method2438((byte) -124);
                var2.method237((byte) -102);
                this.field9269 += var2.field1048;
            }
            var2 = (class77) this.field9265.method892(true);
        }
        field9260++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
    public final void method3659(int arg0, int arg1) {
        field9259++;
        if (class576.field7830 != null) {
            for (class77 var3 = (class77) this.field9265.method887(-127); var3 != null; var3 = (class77) this.field9265.method892(true)) {
                if (var3.method621(-118)) {
                    if (var3.method622(24910) == null) {
                        var3.method2438((byte) 4);
                        var3.method237((byte) -91);
                        this.field9269++;
                    }
                } else if ((long) arg1 < ++var3.field437) {
                    class77 var4 = class576.field7830.method1042(0, var3);
                    this.field9266.method38(var4, 96, var3.field5499);
                    class17.method99(var4, (byte) 65, var3);
                    var3.method2438((byte) 120);
                    var3.method237((byte) -115);
                }
            }
        }
        if (arg0 > -96) {
            this.method3660(-54);
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)I")
    public final int method3660(int arg0) {
        field9261++;
        return arg0 == 1 ? this.field9278 : 126;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZJ)V")
    private final void method3661(boolean arg0, long arg1) {
        field9273++;
        class77 var4 = (class77) this.field9266.method39(arg1, 31750);
        this.method3651(!arg0, var4);
        if (!arg0) {
            field9279 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method3662(byte arg0) {
        field9271++;
        int var2 = 3 % ((87 - arg0) / 37);
        class77 var3 = (class77) this.field9266.method40(false);
        while (var3 != null) {
            Object var4 = var3.method622(24910);
            if (var4 != null) {
                return var4;
            }
            class77 var5 = var3;
            var3 = (class77) this.field9266.method40(false);
            var5.method2438((byte) -120);
            var5.method237((byte) -95);
            this.field9269 += var5.field1048;
        }
        return null;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(II)V")
    public class668(int arg0, int arg1) {
        this.field9265 = new class119();
        this.field9269 = arg0;
        this.field9278 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && arg1 > var3; var3 += var3) {
        }
        this.field9266 = new class9(var3);
    }
}
