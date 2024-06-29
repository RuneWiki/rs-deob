import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class592 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Z")
    public boolean field8751 = true;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    private int field8757 = -1;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "Lku;")
    private class317 field8765;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    private int field8756;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    private int field8753;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "Lte;")
    private class527 field8763;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    private int field8759;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "Lmj;")
    private class562 field8766;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Loe;")
    private class172 field8750;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Lea;")
    private class468 field8755;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "Lh;")
    public static class572 field8760 = new class572("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 3)
    public static void method3510(int arg0) {
        field8760 = null;
        if (arg0 < 28) {
            field8760 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 13)
    public final void method3511(int arg0) {
        field8761++;
        if (arg0 == -128) {
            this.method3515(this.field8766, (byte) -53, this.field8759);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([Ljava/lang/Object;[II)V", line = 28)
    public static final void method3512(Object[] arg0, int[] arg1, int arg2) {
        class199.method1335(arg0, arg1.length - 1, (byte) -92, arg2, arg1);
        field8752++;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZII[B)V", line = 44)
    public final void method3513(boolean arg0, int arg1, int arg2, byte[] arg3) {
        field8758++;
        this.field8750.method1220(arg1, this.field8763.method3165(arg1, 77) * arg2, arg3, -27252);
        this.method3515(this.field8750, (byte) -53, arg2);
        if (!arg0) {
            this.field8765 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lte;Lku;Lsb;IIIII)V", line = 204)
    public class592(class527 arg0, class317 arg1, class244 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field8765 = arg1;
        this.field8756 = arg6;
        this.field8753 = arg7;
        this.field8763 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field2697 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field3479[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field8759 = var10;
        if (var10 <= 0) {
            this.field8755 = null;
        } else {
            class148 var14 = new class148(var10 * 2);
            if (this.field8763.field7842) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field2697 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field3479[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1027(255, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field2697 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field3479[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1057(var18[var19] & 0xFFFF, (byte) 85);
                            }
                        }
                    }
                }
            }
            this.field8766 = this.field8763.method3138(var14.field2146, var14.field2177, (byte) -124, 5123, false);
            this.field8750 = new class172(this.field8763, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V", line = 61)
    private final void method3514(int arg0) {
        field8764++;
        if (!this.field8751) {
            return;
        }
        this.field8751 = false;
        byte[] var2 = this.field8765.field4363;
        byte[] var3 = this.field8763.field7891;
        int var4 = 0;
        int var5 = this.field8765.field4366;
        int var6 = this.field8756 + (this.field8765.field4366 * this.field8753);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field8755 != null && this.field8757 == var4) {
            this.field8751 = false;
            return;
        }
        this.field8757 = var4;
        int var8 = arg0;
        int var9 = this.field8753 * var5 + this.field8756;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field8765.field4366 - 128;
        }
        if (this.field8755 == null) {
            this.field8755 = new class468(this.field8763, 3553, 6406, 128, 128, false, this.field8763.field7891, 6406, false);
            this.field8755.method2824((byte) -110, false, false);
            this.field8755.method1460(true, -5286);
        } else {
            this.field8755.method2821(128, 128, 10242, 0, 0, false, 0, 0, this.field8763.field7891, 6406);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lmj;BI)V", line = 167)
    private final void method3515(class562 arg0, byte arg1, int arg2) {
        field8762++;
        if (arg2 == 0) {
            return;
        }
        this.method3514(0);
        this.field8763.method3152(-2, this.field8755);
        this.field8763.method3170(0, 93, 4, arg2, arg0);
        if (arg1 != -53) {
            field8760 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIILuj;Luj;)V", line = 196)
    public static final void method3516(int arg0, int arg1, int arg2, class323 arg3, class323 arg4) {
        class205 var5 = class441.method2562(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field3040 = arg3;
            var5.field3050 = arg4;
        }
    }
}
