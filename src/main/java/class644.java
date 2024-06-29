import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class644 {

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    private int field9125 = -1;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "Z")
    public boolean field9133 = true;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "Lep;")
    private class371 field9128;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "Lem;")
    private class628 field9123;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    private int field9126;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    private int field9134;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    private int field9124;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "Lfq;")
    private class204 field9139;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "Lvi;")
    private class368 field9137;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "Liia;")
    private class319 field9130;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "Ldm;")
    public static class98 field9138 = new class98();

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "[I")
    public static int[] field9143 = new int[4];

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "Lqk;")
    public static class148 field9141 = new class148(61, 2);

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "F")
    public static float field9131;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field9135;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZ)Z", line = 3)
    public static final boolean method3732(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method3735(50);
        }
        field9132++;
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lep;Lem;Ldn;IIIII)V", line = 207)
    public class644(class371 arg0, class628 arg1, class375 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field9128 = arg0;
        this.field9123 = arg1;
        this.field9126 = arg7;
        this.field9134 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field4344 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field5179[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field9124 = var10;
        if (var10 <= 0) {
            this.field9139 = null;
        } else {
            class26 var14 = new class26(var10 * 2);
            if (this.field9128.field4992) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field4344 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field5179[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method147((byte) 53, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field4344 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field5179[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method139(var18[var19] & 0xFFFF, 82);
                            }
                        }
                    }
                }
            }
            this.field9137 = this.field9128.method2209(var14.field330, -114, var14.field279, 5123, false);
            this.field9130 = new class319(this.field9128, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BILvi;)V", line = 34)
    private final void method3733(byte arg0, int arg1, class368 arg2) {
        field9135++;
        if (arg1 == 0) {
            return;
        }
        this.method3734((byte) 124);
        this.field9128.method2154(this.field9139, arg0 ^ 0x9);
        if (arg0 == -9) {
            this.field9128.method2229(4, 32, arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V", line = 51)
    private final void method3734(byte arg0) {
        field9127++;
        if (!this.field9133) {
            return;
        }
        this.field9133 = false;
        byte[] var2 = this.field9123.field8959;
        byte[] var3 = this.field9128.field5096;
        int var4 = 0;
        int var5 = this.field9123.field8965;
        int var6 = -116 % ((arg0 - 6) / 35);
        int var7 = this.field9134 + (this.field9123.field8965 * this.field9126);
        for (int var8 = -128; var8 < 0; var8++) {
            var4 = (var4 << 8) - var4;
            for (int var14 = -128; var14 < 0; var14++) {
                if (var2[var7++] != 0) {
                    var4++;
                }
            }
            var7 += var5 - 128;
        }
        if (this.field9139 != null && this.field9125 == var4) {
            this.field9133 = false;
            return;
        }
        this.field9125 = var4;
        int var9 = this.field9126 * var5 + this.field9134;
        int var10 = 0;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var9] == 0) {
                    int var13 = 0;
                    if (var2[var9 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var13++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var13++;
                    }
                    var3[var10++] = (byte) (var13 * 17);
                } else {
                    var3[var10++] = 68;
                }
                var9++;
            }
            var9 += this.field9123.field8965 - 128;
        }
        if (this.field9139 == null) {
            this.field9139 = new class204(this.field9128, 3553, 6406, 128, 128, false, this.field9128.field5096, 6406, false);
            this.field9139.method1364(false, false, 10242);
            this.field9139.method2419(true, true);
        } else {
            this.field9139.method1366(0, (byte) 20, 0, 0, false, this.field9128.field5096, 128, 128, 0, 6406);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 156)
    public static void method3735(int arg0) {
        if (arg0 != 34) {
            method3732(-112, 8, false);
        }
        field9143 = null;
        field9138 = null;
        field9141 = null;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V", line = 175)
    public final void method3736(int arg0) {
        if (arg0 <= 20) {
            this.method3733((byte) 123, 70, null);
        }
        field9136++;
        this.method3733((byte) -9, this.field9124, this.field9137);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[BII)V", line = 189)
    public final void method3737(int arg0, byte[] arg1, int arg2, int arg3) {
        field9140++;
        if (arg0 == -17881) {
            this.field9130.method1857(arg1, -13491, arg2 * this.field9128.method2228((byte) -97, arg3), arg3);
            this.method3733((byte) -9, arg2, this.field9130);
        }
    }
}
