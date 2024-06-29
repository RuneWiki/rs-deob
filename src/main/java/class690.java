import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class690 {

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "Lvu;")
    private class680 field9612;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    private int field9598;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    private int field9609;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "Lbaa;")
    private class130 field9606;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field9603;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "I")
    public static int field9613;

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "[Loi;")
    public static class699[] field9610;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V", line = 4)
    public final void method3896(int arg0, int arg1) {
        if (class140.field1990 != null) {
            for (class521 var3 = (class521) this.field9612.method3828(111); var3 != null; var3 = (class521) this.field9612.method3829(-29202)) {
                if (var3.method3102(true)) {
                    if (var3.method3108((byte) 86) == null) {
                        var3.method549(6410);
                        var3.method21(112);
                        this.field9609 += var3.field7263;
                    }
                } else if ((++var3.field40) > ((long) arg1)) {
                    class521 var4 = class140.field1990.method937(691037090, var3);
                    this.field9606.method820(var3.field1079, (byte) -42, var4);
                    class175.method1108(var3, var4, 66);
                    var3.method549(6410);
                    var3.method21(118);
                }
            }
        }
        if (arg0 == 1) {
            field9614++;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BJ)V", line = 53)
    private final void method3897(byte arg0, long arg1) {
        field9600++;
        if (arg0 != -71) {
            this.field9598 = 36;
        }
        class521 var4 = (class521) this.field9606.method812(111, arg1);
        this.method3901((byte) -124, var4);
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(BJ)Ljava/lang/Object;", line = 66)
    public final Object method3898(byte arg0, long arg1) {
        field9607++;
        class521 var4 = (class521) this.field9606.method812(115, arg1);
        if (arg0 != -42) {
            this.method3907(-6);
        }
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method3108((byte) 115);
        if (var5 == null) {
            var4.method549(6410);
            var4.method21(arg0 + 168);
            this.field9609 += var4.field7263;
            return null;
        }
        if (var4.method3102(true)) {
            class761 var6 = new class761(var5, var4.field7263);
            this.field9606.method820(var4.field1079, (byte) -42, var6);
            this.field9612.method3827(107, var6);
            var6.field40 = 0L;
            var4.method549(6410);
            var4.method21(102);
        } else {
            this.field9612.method3827(arg0 ^ 0xFFFFFFAA, var4);
            var4.field40 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILjava/lang/Object;J)V", line = 109)
    public final void method3899(int arg0, Object arg1, long arg2) {
        this.method3909(arg1, (byte) 54, 1, arg2);
        int var5 = -39 % ((-arg0 - 5) / 34);
        field9599++;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 119)
    public final Object method3900(boolean arg0) {
        field9604++;
        class521 var2 = (class521) this.field9606.method818(93);
        while (var2 != null) {
            Object var3 = var2.method3108((byte) 88);
            if (var3 != null) {
                return var3;
            }
            class521 var4 = var2;
            var2 = (class521) this.field9606.method818(94);
            var4.method549(6410);
            var4.method21(119);
            this.field9609 += var4.field7263;
        }
        if (!arg0) {
            this.method3901((byte) 56, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BLpc;)V", line = 150)
    private final void method3901(byte arg0, class521 arg1) {
        if (arg1 != null) {
            arg1.method549(6410);
            arg1.method21(104);
            this.field9609 += arg1.field7263;
        }
        if (arg0 <= -78) {
            field9601++;
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(I)V", line = 168)
    public class690(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V", line = 175)
    public final void method3902(int arg0) {
        field9602++;
        if (arg0 != 0) {
            this.method3900(true);
        }
        for (class521 var2 = (class521) this.field9612.method3828(121); var2 != null; var2 = (class521) this.field9612.method3829(-29202)) {
            if (var2.method3102(true)) {
                var2.method549(6410);
                var2.method21(96);
                this.field9609 += var2.field7263;
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)I", line = 202)
    public final int method3903(int arg0) {
        field9603++;
        if (arg0 != -250) {
            this.method3903(18);
        }
        return this.field9609;
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 213)
    public final Object method3904(int arg0) {
        field9597++;
        class521 var2 = (class521) this.field9606.method821((byte) 115);
        while (var2 != null) {
            Object var3 = var2.method3108((byte) 118);
            if (var3 != null) {
                return var3;
            }
            class521 var4 = var2;
            var2 = (class521) this.field9606.method818(57);
            var4.method549(6410);
            var4.method21(127);
            this.field9609 += var4.field7263;
        }
        if (arg0 > -52) {
            this.field9612 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "(I)V", line = 245)
    public static void method3905(int arg0) {
        if (arg0 != -28352) {
            method3905(-24);
        }
        field9610 = null;
    }

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "(I)V", line = 260)
    public final void method3906(int arg0) {
        this.field9612.method3833(20975);
        field9613++;
        if (arg0 > -93) {
            this.method3902(-77);
        }
        this.field9606.method819(23738);
        this.field9609 = this.field9598;
    }

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "(I)I", line = 273)
    public final int method3907(int arg0) {
        field9608++;
        if (arg0 < 63) {
            this.method3906(-39);
        }
        return this.field9598;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)I", line = 284)
    public final int method3908(byte arg0) {
        if (arg0 != -4) {
            field9610 = null;
        }
        field9611++;
        int var2 = 0;
        for (class521 var3 = (class521) this.field9612.method3828(97); var3 != null; var3 = (class521) this.field9612.method3829(arg0 - 29198)) {
            if (!var3.method3102(true)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/lang/Object;BIJ)V", line = 309)
    public final void method3909(Object arg0, byte arg1, int arg2, long arg3) {
        if (arg1 != 54) {
            return;
        }
        field9605++;
        if (arg2 > this.field9598) {
            throw new IllegalStateException("s>cs");
        }
        this.method3897((byte) -71, arg3);
        this.field9609 -= arg2;
        while (this.field9609 < 0) {
            class521 var7 = (class521) this.field9612.method3834((byte) 116);
            this.method3901((byte) -110, var7);
        }
        class761 var6 = new class761(arg0, arg2);
        this.field9606.method820(arg3, (byte) -42, var6);
        this.field9612.method3827(91, var6);
        var6.field40 = 0L;
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(II)V", line = 346)
    public class690(int arg0, int arg1) {
        this.field9612 = new class680();
        this.field9598 = arg0;
        this.field9609 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && arg1 > var3; var3 += var3) {
        }
        this.field9606 = new class130(var3);
    }
}
