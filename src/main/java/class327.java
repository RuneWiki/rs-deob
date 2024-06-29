import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class327 {

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    private int field4204 = -1;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Z")
    public boolean field4203 = true;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    private int field4192;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lhv;")
    private class147 field4194;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lgk;")
    private class463 field4191;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    private int field4207;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    private int field4198;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lcm;")
    private class433 field4200;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lgi;")
    private class485 field4205;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lsr;")
    private class346 field4208;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "[I")
    public static int[] field4206 = new int[14];

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Loi;")
    public static class169 field4197 = new class169("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Z")
    public static boolean field4209 = false;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Lpi;")
    public static class340 field4210 = new class340(25, 4);

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILcm;B)V")
    private final void method1943(int arg0, class433 arg1, byte arg2) {
        field4202++;
        if (arg0 == 0) {
            return;
        }
        this.method1945(0);
        if (arg2 >= -28) {
            this.method1949(110);
        }
        this.field4191.method2771(this.field4208, -16785);
        this.field4191.method2769(0, arg1, 4, 0, arg0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
    public static final void method1944(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class474.field6928 = arg0;
        if (arg1 == 11617) {
            class388.field5088 = arg4;
            class452.field6320 = arg2;
            field4193++;
            class60.field788 = arg3;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    private final void method1945(int arg0) {
        field4199++;
        if (!this.field4203) {
            return;
        }
        this.field4203 = false;
        byte[] var2 = this.field4194.field1953;
        byte[] var3 = class296.field3847;
        int var4 = 0;
        int var5 = this.field4194.field1952;
        int var6 = this.field4192 + (this.field4194.field1952 * this.field4207);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4208 != null && this.field4204 == var4) {
            this.field4203 = false;
            return;
        }
        this.field4204 = var4;
        int var8 = arg0;
        int var9 = this.field4192 + (this.field4207 * var5);
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
                    if (var2[var9 + var5] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field4194.field1952 - 128;
        }
        if (this.field4208 == null) {
            this.field4208 = new class346(this.field4191, 3553, 6406, 128, 128, false, class296.field3847, 6406, false);
            this.field4208.method2040(false, (byte) 89, false);
            this.field4208.method210(true, (byte) -108);
        } else {
            this.field4208.method2037(128, 128, 6406, 0, class296.field3847, false, 0, arg0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[BBI)V")
    public final void method1946(int arg0, byte[] arg1, byte arg2, int arg3) {
        field4196++;
        this.field4205.method2062(arg1, (byte) 88, this.field4191.method2742(70, arg0) * arg3, arg0);
        if (arg2 == -60) {
            this.method1943(arg3, this.field4205, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static void method1947(int arg0) {
        field4197 = null;
        if (arg0 != 6) {
            field4209 = false;
        }
        field4206 = null;
        field4210 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)V")
    public static final void method1948(int arg0, int arg1, byte arg2) {
        field4195++;
        class436 var3 = class459.method2712(6, arg0, -1759243680);
        if (arg2 != 98) {
            method1944(-95, -49, -53, -35, 75);
        }
        var3.method2574((byte) 118);
        var3.field5980 = arg1;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lgk;Lhv;Leh;IIIII)V")
    public class327(class463 arg0, class147 arg1, class180 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4192 = arg6;
        this.field4194 = arg1;
        this.field4191 = arg0;
        this.field4207 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3197 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field2321[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field4198 = var10;
        if (var10 <= 0) {
            this.field4208 = null;
        } else {
            class88 var14 = new class88(var10 * 2);
            if (this.field4191.field6759) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3197 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field2321[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method609(var23[var24] & 0xFFFF, -122);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3197 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field2321[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method564(var18[var19] & 0xFFFF, 595249544);
                            }
                        }
                    }
                }
            }
            this.field4200 = this.field4191.method2752(var14.field1223, 1, 5123, false, var14.field1176);
            this.field4205 = new class485(this.field4191, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public final void method1949(int arg0) {
        this.method1943(this.field4198, this.field4200, (byte) -64);
        field4201++;
        int var2 = 2 % ((arg0 - 8) / 52);
    }
}
