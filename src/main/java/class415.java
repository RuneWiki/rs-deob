import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class415 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    private int field5970 = -1;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Z")
    public boolean field5978 = true;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lpo;")
    private class332 field5976;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    private int field5975;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Llo;")
    private class449 field5977;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    private int field5973;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    private int field5972;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lfc;")
    private class141 field5974;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Leo;")
    private class163 field5969;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "[B")
    private static byte[] field5971 = new byte[16384];

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public final void method2592(int arg0) {
        if (arg0 == 24632) {
            this.method2593(this.field5972, 124, this.field5969);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILeo;)V")
    public final void method2593(int arg0, int arg1, class163 arg2) {
        if (arg1 <= 85) {
            this.method2592(25);
        }
        if (arg0 != 0) {
            this.method2594(17);
            this.field5976.method2085(this.field5974);
            this.field5976.method2107(arg2, 4, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    private final void method2594(int arg0) {
        if (!this.field5978) {
            return;
        }
        this.field5978 = false;
        byte[] var2 = this.field5977.field6550;
        byte[] var3 = field5971;
        int var4 = 0;
        int var5 = this.field5977.field6547;
        int var6 = this.field5977.field6547 * this.field5975 + this.field5973;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field5974 != null && this.field5970 == var4) {
            this.field5978 = false;
            return;
        }
        if (arg0 != 17) {
            this.method2592(82);
        }
        this.field5970 = var4;
        int var9 = 0;
        int var10 = this.field5973 + (this.field5975 * var5);
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
            var10 += this.field5977.field6547 - 128;
        }
        if (this.field5974 == null) {
            this.field5974 = new class141(this.field5976, 3553, 6406, 128, 128, false, field5971, 6406, false);
            this.field5974.method837(false, false);
            this.field5974.method2725(true);
        } else {
            this.field5974.method838(0, 0, 128, 128, field5971, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lpo;Llo;Lwa;IIIII)V")
    public class415(class332 arg0, class449 arg1, class365 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field5976 = arg0;
        this.field5975 = arg7;
        this.field5977 = arg1;
        this.field5973 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field4530 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field5299[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field5972 = var10;
        if (var10 <= 0) {
            this.field5974 = null;
        } else {
            class211 var17 = new class211(var10 * 2);
            if (this.field5976.field4779) {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field4530 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field5299[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method1380(var26[var27], (byte) -8);
                            }
                        }
                    }
                }
            } else {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field4530 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field5299[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method1339((byte) 3, var21[var22]);
                            }
                        }
                    }
                }
            }
            this.field5969 = this.field5976.method2101(5123, var17.field2867, var17.field2888, false);
        }
    }
}
