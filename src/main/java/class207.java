import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class207 {

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    private int field2909 = -1;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "Z")
    public boolean field2916 = true;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "Llo;")
    private class421 field2908;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "Lmm;")
    private class357 field2913;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    private int field2907;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    private int field2910;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    private int field2912;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "Lhn;")
    private class257 field2911;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "Ldc;")
    private class377 field2906;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "Laq;")
    private class234 field2915;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "[B")
    private static byte[] field2914 = new byte[16384];

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BILdc;)V", line = 5)
    private final void method1398(byte arg0, int arg1, class377 arg2) {
        int var4 = -111 / ((arg0 + 36) / 59);
        if (arg1 != 0) {
            this.method1401(-10654);
            this.field2913.method2180(this.field2911);
            this.field2913.method2176(arg2, 4, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II[BI)V", line = 27)
    public final void method1399(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 == 0) {
            this.field2915.method1531(arg3, arg2, arg1 * this.field2913.method2190(arg3));
            this.method1398((byte) 43, arg1, this.field2915);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V", line = 38)
    public final void method1400(byte arg0) {
        if (arg0 == -38) {
            this.method1398((byte) -127, this.field2912, this.field2906);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 54)
    private final void method1401(int arg0) {
        if (!this.field2916) {
            return;
        }
        this.field2916 = false;
        byte[] var2 = this.field2908.field5830;
        byte[] var3 = field2914;
        int var4 = 0;
        int var5 = this.field2908.field5832;
        int var6 = this.field2908.field5832 * this.field2907 + this.field2910;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field2911 != null && this.field2909 == var4) {
            this.field2916 = false;
            return;
        }
        this.field2909 = var4;
        if (arg0 != -10654) {
            this.method1401(-103);
        }
        int var9 = 0;
        int var10 = this.field2907 * var5 + this.field2910;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var10] == 0) {
                    int var13 = 0;
                    if (var2[var10 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 - var5] != 0) {
                        var13++;
                    }
                    if (var2[var5 + var10] != 0) {
                        var13++;
                    }
                    var3[var9++] = (byte) (var13 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var10++;
            }
            var10 += this.field2908.field5832 - 128;
        }
        if (this.field2911 == null) {
            this.field2911 = new class257(this.field2913, 3553, 6406, 128, 128, false, field2914, 6406, false);
            this.field2911.method1659(false, false);
            this.field2911.method1954(true);
        } else {
            this.field2911.method1657(0, 0, 128, 128, field2914, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lmm;Llo;Leb;IIIII)V", line = 166)
    public class207(class357 arg0, class421 arg1, class384 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2908 = arg1;
        this.field2913 = arg0;
        this.field2907 = arg7;
        this.field2910 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field4384 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field5281[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field2912 = var10;
        if (var10 <= 0) {
            this.field2911 = null;
        } else {
            class366 var17 = new class366(var10 * 2);
            if (this.field2913.field4829) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field4384 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field5281[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method2275(5, var21[var22] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field4384 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field5281[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method2271(-101, var26[var27] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field2906 = this.field2913.method2207(5123, var17.field5076, var17.field5048, false);
            this.field2915 = new class234(this.field2913, 5123, (byte[]) null, 1);
        }
    }
}
