import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class516 {

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lkh;")
    private class13 field7502 = new class13(64);

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lul;")
    private class406 field7507;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lpt;")
    public static class371 field7501;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lpc;")
    public static class477 field7505;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method3055(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 12068) {
            field7505 = null;
        }
        field7503++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg3 * arg3;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class359.method2255((byte) -93, class416.field6200[arg4], arg3 + arg5, -arg3 + arg5, arg0);
        int var20 = (arg2 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var21 = arg4 - var7;
            int var22 = arg4 + var7;
            int var23 = arg5 + var6;
            int var24 = arg5 - var6;
            class359.method2255((byte) -126, class416.field6200[var21], var23, var24, arg0);
            class359.method2255((byte) -110, class416.field6200[var22], var23, var24, arg0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 91)
    public static void method3056(int arg0) {
        field7505 = null;
        if (arg0 <= 95) {
            field7505 = null;
        }
        field7501 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Loj;", line = 104)
    public final class260 method3057(int arg0, byte arg1) {
        if (arg1 < 45) {
            method3060((byte) -44);
        }
        field7504++;
        class13 var3 = this.field7502;
        class260 var4;
        synchronized (this.field7502) {
            var4 = (class260) this.field7502.method87((long) arg0, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field7507;
        byte[] var6;
        synchronized (this.field7507) {
            var6 = this.field7507.method2536(11, 0, arg0);
        }
        class260 var7 = new class260();
        if (var6 != null) {
            var7.method1739(28239, new class217(var6));
        }
        class13 var8 = this.field7502;
        synchronized (this.field7502) {
            this.field7502.method84((long) arg0, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V", line = 138)
    public final void method3058(int arg0, int arg1) {
        class13 var3 = this.field7502;
        synchronized (this.field7502) {
            if (arg1 != -19910) {
                return;
            }
            this.field7502.method91(arg1 ^ 0xFFFFB20B, arg0);
        }
        field7510++;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 151)
    public final void method3059(int arg0) {
        class13 var2 = this.field7502;
        synchronized (this.field7502) {
            this.field7502.method88(118);
        }
        field7508++;
        if (arg0 >= -117) {
            field7505 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 168)
    public static final void method3060(byte arg0) {
        field7506++;
        if (arg0 <= 63) {
            method3056(86);
        }
        for (int var1 = 0; var1 < class39.field531.length; var1++) {
            for (int var2 = 0; var2 < class39.field531[var1].length; var2++) {
                class39.field531[var1][var2] = class289.field4359;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BZI)Ldu;", line = 197)
    public static final class240 method3061(byte arg0, boolean arg1, int arg2) {
        if (arg0 != -30) {
            field7501 = null;
        }
        field7500++;
        long var3 = (long) (arg2 | (arg1 ? Integer.MIN_VALUE : 0));
        return (class240) class371.field5530.method2585((byte) 114, var3);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V", line = 210)
    public final void method3062(byte arg0) {
        if (arg0 > -22) {
            field7505 = null;
        }
        class13 var2 = this.field7502;
        synchronized (this.field7502) {
            this.field7502.method93((byte) 103);
        }
        field7509++;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lee;ILul;)V", line = 227)
    public class516(class480 arg0, int arg1, class406 arg2) {
        this.field7507 = arg2;
        if (this.field7507 != null) {
            this.field7507.method2551(11, -26070);
        }
    }
}
