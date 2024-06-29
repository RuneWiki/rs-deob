import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class47 extends class649 {

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Ltm;")
    public static class334 field785 = new class334(110, 28);

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I", line = 3)
    public final int method476(int arg0) {
        if (arg0 != 3) {
            field785 = null;
        }
        ++field789;
        return super.field9223;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I[III[Ljava/lang/Object;)V", line = 14)
    public static final void method477(int arg0, int[] arg1, int arg2, int arg3, Object[] arg4) {
        if (arg0 < arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            int var9 = ~var7 != Integer.MIN_VALUE ? 1 : 0;
            for (int var10 = arg0; arg3 > var10; ++var10) {
                if (arg1[var10] < (var10 & var9) + var7) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    Object var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method477(arg0, arg1, -4991, var6 - 1, arg4);
            method477(var6 - -1, arg1, -4991, arg3, arg4);
        }
        ++field786;
        if (arg2 != -4991) {
            method478(-61, -12, 123, -94);
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lhs;)V", line = 69)
    public class47(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I", line = 72)
    public final int method133(int arg0, int arg1) {
        ++field790;
        if (arg0 != 18648) {
            return 73;
        } else if (super.field9224.method2294((byte) -121)) {
            return 3;
        } else {
            return ~arg1 != -1 && super.field9224.field5427.method3956(3) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 94)
    public final void method134(int arg0) {
        if (arg0 != 1) {
            this.method479(37);
        }
        if (super.field9224.method2294((byte) -119)) {
            super.field9223 = 0;
        }
        ++field784;
        if (~super.field9223 > -1 && ~super.field9223 < -3) {
            super.field9223 = this.method135(-118);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)Lpe;", line = 110)
    public static final class109 method478(int arg0, int arg1, int arg2, int arg3) {
        ++field788;
        class114 var4 = class488.field7062[arg2][arg1][arg0];
        if (var4 == null) {
            return null;
        } else {
            class109 var5 = null;
            int var6 = -1;
            for (class291 var7 = var4.field1772; var7 != null; var7 = var7.field4479) {
                class559 var9 = var7.field4482;
                if (var9 instanceof class109) {
                    class109 var10 = (class109) var9;
                    int var11 = 252 + 256 * var10.method878(-5740) + -256;
                    int var12 = -var11 + var10.field9477 >> 9;
                    int var13 = -var11 + var10.field9475 >> 9;
                    int var14 = var10.field9477 - -var11 >> 9;
                    int var15 = var10.field9475 + var11 >> 9;
                    if (arg1 >= var12 && ~var13 >= ~arg0 && arg1 <= var14 && arg0 <= var15) {
                        int var16 = (-arg0 + 1 + var15) * (var14 + 1 + -arg1);
                        if (var16 > var6) {
                            var5 = var10;
                            var6 = var16;
                        }
                    }
                }
            }
            int var8 = -14 / ((arg3 - 32) / 58);
            return var5;
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Z", line = 171)
    public final boolean method479(int arg0) {
        ++field787;
        if (super.field9224.method2294((byte) -113)) {
            return false;
        } else {
            if (arg0 != -16181) {
                method478(48, -54, 60, -9);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)I", line = 187)
    public final int method135(int arg0) {
        ++field783;
        int var2 = -63 / ((-18 - arg0) / 50);
        return 1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V", line = 198)
    public static void method480(boolean arg0) {
        if (!arg0) {
            field785 = null;
        }
        field785 = null;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(ILhs;)V", line = 209)
    public class47(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)V", line = 213)
    public final void method129(int arg0, byte arg1) {
        super.field9223 = arg0;
        ++field782;
        if (arg1 >= -120) {
            method478(-85, -5, 46, 96);
        }
    }
}
