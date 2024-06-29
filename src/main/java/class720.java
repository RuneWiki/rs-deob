import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class720 {

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    private int field10092 = -1;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Z")
    public boolean field10089 = true;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Lrs;")
    private class166 field10093;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Ltv;")
    private class76 field10088;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    private int field10091;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    private int field10087;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    private int field10097;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lsda;")
    private class749 field10084;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lmn;")
    private class510 field10094;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lwo;")
    private class692 field10086;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field10085;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field10090;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field10095;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field10096;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([BZII)V")
    public final void method3970(byte[] arg0, boolean arg1, int arg2, int arg3) {
        this.field10094.method1409(arg0, this.field10093.method1254(-1, arg3) * arg2, arg3, true);
        field10090++;
        this.method3972(arg2, this.field10094, arg1);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    private final void method3971(int arg0) {
        field10095++;
        if (!this.field10089) {
            return;
        }
        this.field10089 = false;
        byte[] var2 = this.field10088.field1115;
        byte[] var3 = this.field10093.field2907;
        int var4 = 0;
        int var5 = this.field10088.field1117;
        int var6 = this.field10088.field1117 * this.field10087 + this.field10091;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field10086 != null && this.field10092 == var4) {
            this.field10089 = false;
            return;
        }
        this.field10092 = var4;
        int var8 = this.field10087 * var5 + this.field10091;
        int var9 = arg0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field10088.field1117 - 128;
        }
        if (this.field10086 == null) {
            this.field10086 = new class692(this.field10093, 3553, 6406, 128, 128, false, this.field10093.field2907, 6406, false);
            this.field10086.method3862(false, false, arg0 ^ 0xFFFF8C42);
            this.field10086.method2967(true, true);
        } else {
            this.field10086.method3858((byte) 20, 0, 128, 0, 0, 128, 6406, false, this.field10093.field2907, 0);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILsda;Z)V")
    private final void method3972(int arg0, class749 arg1, boolean arg2) {
        if (arg2) {
            this.field10088 = null;
        }
        field10085++;
        if (arg0 != 0) {
            this.method3971(0);
            this.field10093.method1306(this.field10086, 65);
            this.field10093.method1315(0, !arg2, 4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public final void method3973(byte arg0) {
        field10096++;
        if (arg0 > -66) {
            this.method3971(87);
        }
        this.method3972(this.field10097, this.field10084, false);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lrs;Ltv;Lru;IIIII)V")
    public class720(class166 arg0, class76 arg1, class680 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field10093 = arg0;
        this.field10088 = arg1;
        this.field10091 = arg6;
        this.field10087 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field4956 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field9616[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field10097 = var10;
        if (var10 <= 0) {
            this.field10086 = null;
        } else {
            class301 var14 = new class301(var10 * 2);
            if (this.field10093.field2796) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field4956 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field9616[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1939(var23[var24] & 0xFFFF, 1134947720);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field4956 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field9616[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1969(var18[var19] & 0xFFFF, (byte) -100);
                            }
                        }
                    }
                }
            }
            this.field10084 = this.field10093.method1302(var14.field4543, (byte) -14, false, 5123, var14.field4534);
            this.field10094 = new class510(this.field10093, 5123, null, 1);
        }
    }
}
