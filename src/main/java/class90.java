import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class90 extends class719 {

    @OriginalMember(owner = "client!gv", name = "y", descriptor = "F")
    private float field1275 = 0.0F;

    @OriginalMember(owner = "client!gv", name = "v", descriptor = "Lgaa;")
    private class314 field1272;

    @OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
    public static int field1269 = -1;

    @OriginalMember(owner = "client!gv", name = "D", descriptor = "I")
    public static int field1280 = 0;

    @OriginalMember(owner = "client!gv", name = "A", descriptor = "Z")
    public static boolean field1277 = false;

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!gv", name = "u", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!gv", name = "B", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!gv", name = "E", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!gv", name = "C", descriptor = "Lhh;")
    public static class140 field1279;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "[I")
    public static int[] field1265;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V", line = 4)
    public final void method714(int arg0) {
        ++field1276;
        if (~super.field9776.method3848(105) == -1) {
            class532 var2 = super.field9776.method3855(-31606);
            super.field9776.method3886(25, 1);
            class532 var3 = super.field9776.method3877(3);
            var3.method816(var2);
            var3.method3079(0.125F, 0.125F, 0, 1.0F);
            var3.method3093(0.0F, this.field1275, 16383, 0.0F);
            super.field9776.method3883((byte) 92, class480.field6741);
            super.field9776.method3886(18, 0);
        }
        if (arg0 != -22274) {
            method716(-106, -92, 89, (class250) null, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)Z", line = 33)
    public final boolean method218(byte arg0) {
        if (arg0 < 16) {
            this.method219(126, 92, -9);
        }
        ++field1270;
        return this.field1272.method2011(false);
    }

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "(I)V", line = 45)
    public static void method715(int arg0) {
        field1279 = null;
        field1265 = null;
        if (arg0 != -1) {
            method717(21, -28, (byte) -74);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)V", line = 58)
    public final void method219(int arg0, int arg1, int arg2) {
        ++field1278;
        super.field9776.method3886(42, 1);
        if (~(arg2 & 128) != -1) {
            super.field9776.method3882(0, (class352) null);
        } else if ((arg0 & 1) != 1) {
            if (!this.field1272.field4433) {
                super.field9776.method3882(arg1, this.field1272.field4429[0]);
            } else {
                super.field9776.method3882(0, this.field1272.field4426);
            }
        } else if (this.field1272.field4433) {
            this.field1275 = (float) (super.field9776.field9602 % 4000) / 4000.0F;
            super.field9776.method3882(0, this.field1272.field4426);
        } else {
            int var4 = super.field9776.field9602 % 4000 * 16 / 4000;
            super.field9776.method3882(0, this.field1272.field4429[var4]);
        }
        super.field9776.method3886(69, arg1);
    }

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "(I)V", line = 99)
    public final void method220(int arg0) {
        super.field9776.method3886(111, 1);
        ++field1274;
        super.field9776.method3911(22228, class291.field4152, class291.field4152);
        super.field9776.method3859(arg0 ^ 23355, 0, class790.field10851);
        super.field9776.method3867((byte) 18, class790.field10851, 0);
        super.field9776.method2809(1, 3433);
        super.field9776.method3882(arg0 ^ arg0, (class352) null);
        super.field9776.method3886(64, 0);
        super.field9776.method3867((byte) 18, class790.field10851, 0);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZZ)V", line = 114)
    public final void method225(boolean arg0, boolean arg1) {
        super.field9776.method3911(22228, class117.field1574, class291.field4152);
        ++field1266;
        if (!arg0) {
            field1269 = 35;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZ)V", line = 127)
    public final void method222(int arg0, boolean arg1) {
        ++field1271;
        super.field9776.method3886(30, 1);
        super.field9776.method3911(22228, class117.field1574, class175.field2307);
        super.field9776.method2812(0, false, class790.field10851, true, 0);
        super.field9776.method3867((byte) 18, class417.field6010, 0);
        super.field9776.method2809(0, 3433);
        super.field9776.method3886(71, 0);
        super.field9776.method3838(-16777216, Integer.MAX_VALUE);
        super.field9776.method3867((byte) 18, class64.field840, 0);
        this.method714(-22274);
        if (arg0 >= -126) {
            field1280 = 119;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIILlf;[I[I)Laca;", line = 146)
    public static final class756 method716(int arg0, int arg1, int arg2, class250 arg3, int[] arg4, int[] arg5) {
        ++field1267;
        byte[] var6 = new byte[arg0 * arg2];
        for (int var7 = arg1; ~arg2 < ~var7; ++var7) {
            int var8 = arg0 * var7 + arg5[var7];
            for (int var9 = 0; arg4[var7] > var9; ++var9) {
                var6[var8++] = -1;
            }
        }
        return new class756(arg3, arg0, arg2, var6);
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lee;Lgaa;)V", line = 173)
    public class90(class703 arg0, class314 arg1) {
        super(arg0);
        this.field1272 = arg1;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(IIB)Lofa;", line = 188)
    public static final class347 method717(int arg0, int arg1, byte arg2) {
        ++field1273;
        if (arg2 != -42) {
            method715(45);
        }
        class347 var3 = class445.method2655(arg0, (byte) 108);
        if (~arg1 == 0) {
            return var3;
        } else {
            return var3 != null && var3.field4928 != null && ~arg1 > ~var3.field4928.length ? var3.field4928[arg1] : null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZLb;I)V", line = 212)
    public final void method221(boolean arg0, class352 arg1, int arg2) {
        ++field1268;
        super.field9776.method3882(0, arg1);
        if (!arg0) {
            this.method218((byte) -128);
        }
    }
}
