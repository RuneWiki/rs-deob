import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class667 extends class384 {

    @OriginalMember(owner = "client!nw", name = "t", descriptor = "Lck;")
    private class221 field9130;

    @OriginalMember(owner = "client!nw", name = "u", descriptor = "Leb;")
    private class9 field9131;

    @OriginalMember(owner = "client!nw", name = "r", descriptor = "Lhg;")
    private class502 field9128;

    @OriginalMember(owner = "client!nw", name = "x", descriptor = "Z")
    public static boolean field9134 = false;

    @OriginalMember(owner = "client!nw", name = "n", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!nw", name = "o", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!nw", name = "p", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!nw", name = "q", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!nw", name = "s", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!nw", name = "v", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!nw", name = "w", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!nw", name = "y", descriptor = "I")
    public static int field9135;

    @OriginalMember(owner = "client!nw", name = "z", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!nw", name = "A", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!nw", name = "B", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "(B)Z", line = 3)
    public final boolean method1021(byte arg0) {
        ++field9126;
        if (arg0 < 78) {
            return true;
        } else {
            return this.field9128 != null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lck;Lkha;Leb;)V", line = 14)
    public class667(class221 arg0, class687 arg1, class9 arg2) {
        super(arg0);
        this.field9130 = arg0;
        this.field9131 = arg2;
        if (arg1 != null && this.field9131.method42((byte) 118) && this.field9130.field2904) {
            this.field9128 = class606.method3327(34336, arg1.method3813("gl", "transparent_water", -114), this.field9130, -12409);
        } else {
            this.field9128 = null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZB)V", line = 38)
    public final void method1020(boolean arg0, byte arg1) {
        ++field9125;
        if (arg1 > 23) {
            OpenGL.glBindProgramARB(34336, this.field9128.field7072);
            OpenGL.glEnable(34336);
            super.field5337.method3777(false, 0, class155.field1970);
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)V", line = 51)
    public final void method1019(byte arg0) {
        ++field9137;
        super.field5337.method3777(false, 0, class632.field8774);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        if (arg0 != -60) {
            this.field9131 = null;
        }
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lbia;BI)V", line = 67)
    public final void method1015(class329 arg0, byte arg1, int arg2) {
        if (arg1 != 80) {
            method3609(-10, 85, -55, -56, (byte[]) null, (byte) -103, 90);
        }
        ++field9133;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(Z)V", line = 80)
    public static final void method3608(boolean arg0) {
        ++field9138;
        if (!arg0) {
            field9134 = true;
        }
        class106.field1297.method3675(5194);
        class379.field5303 = null;
        class55.field799 = null;
        class244.field3142 = 1;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IBI)V", line = 96)
    public final void method1025(int arg0, byte arg1, int arg2) {
        if (!this.field9131.field99) {
            int var4 = super.field5337.field9610 % 4000 * 16 / 4000;
            super.field5337.method3711(false, this.field9131.field97[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field5337.field9610 % 4000) / 4000.0F;
            super.field5337.method3711(false, this.field9131.field100);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
        if (arg1 == 102) {
            ++field9132;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIII[BBI)V", line = 126)
    public static final void method3609(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5, int arg6) {
        ++field9136;
        if (~arg2 < -1 && !class487.method2850((byte) -84, arg2)) {
            throw new IllegalArgumentException("");
        } else if (~arg0 < -1 && !class487.method2850((byte) 118, arg0)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class447.method2638((byte) 18, arg6);
            int var8 = 0;
            int var9 = arg2 < arg0 ? arg2 : arg0;
            int var10 = arg2 >> 1;
            int var11 = arg0 >> 1;
            byte[] var12 = arg4;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg1, var8, arg3, arg2, arg0, 0, arg6, 5121, var12, 0);
                if (var9 <= 1) {
                    if (arg5 != -15) {
                        field9134 = false;
                        return;
                    }
                    return;
                }
                int var14 = arg2 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; ~var16 > ~var7; ++var16) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; ++var20) {
                        for (int var21 = 0; ~var10 < ~var21; ++var21) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg2 = var10;
                var12 = var15;
                arg0 = var11;
                var10 >>= 1;
                var11 >>= 1;
                var9 >>= 1;
                ++var8;
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "(B)V", line = 222)
    public static final void method3610(byte arg0) {
        if (class681.field9312.field3251 && ~class197.field2532.field2454 != 0) {
            class581.method3240(class197.field2532.field2454, 40000, class197.field2532.field2460);
        }
        ++field9129;
        int var1 = -70 / ((arg0 - 30) / 40);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZ)V", line = 239)
    public final void method1018(int arg0, boolean arg1) {
        super.field5337.method3708(117, class235.field3034, class409.field5765);
        if (arg0 != 4) {
            this.method1019((byte) 110);
        }
        ++field9135;
    }
}
