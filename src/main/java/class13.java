import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 {

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "Z")
    public boolean field152 = true;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    private int field159 = -1;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Luf;")
    private class311 field151;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lfd;")
    private class365 field144;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "Lbk;")
    private class254 field157;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Leo;")
    private class194 field156;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Laf;")
    private class299 field149;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field155 = 0;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 5)
    private final void method84(int arg0) {
        field153++;
        if (!this.field152) {
            return;
        }
        this.field152 = false;
        byte[] var2 = this.field151.field4426;
        byte[] var3 = class11.field137;
        int var4 = 0;
        int var5 = this.field151.field4432;
        int var6 = this.field151.field4432 * this.field146 + this.field148;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field149 != null && this.field159 == var4) {
            this.field152 = false;
            return;
        }
        this.field159 = var4;
        int var8 = 0;
        int var9 = this.field146 * var5 + this.field148;
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
            var9 += this.field151.field4432 - 128;
        }
        if (this.field149 == null) {
            this.field149 = new class299(this.field144, 3553, 6406, 128, 128, false, class11.field137, 6406, false);
            this.field149.method1882(10497, false, false);
            this.field149.method2421(-21, true);
        } else {
            this.field149.method1877(128, 0, class11.field137, 128, 6406, 0, 0, 0, false, 54);
        }
        if (arg0 != -1) {
            this.method85(null, 108, true);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lbk;IZ)V", line = 113)
    private final void method85(class254 arg0, int arg1, boolean arg2) {
        field147++;
        if (arg2 && arg1 != 0) {
            this.method84(-1);
            this.field144.method2188((byte) 78, this.field149);
            this.field144.method2250(0, arg1, 4, arg0, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 135)
    public final void method86(byte arg0) {
        this.method85(this.field157, this.field145, true);
        field158++;
        if (arg0 != -33) {
            field155 = 62;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B[BII)V", line = 147)
    public final void method87(byte arg0, byte[] arg1, int arg2, int arg3) {
        field150++;
        this.field156.method1361(arg1, true, arg2, arg3 * this.field144.method2180(arg2, 127));
        this.method85(this.field156, arg3, true);
        if (arg0 < 41) {
            this.method86((byte) 56);
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lfd;Luf;Loq;IIIII)V", line = 173)
    public class13(class365 arg0, class311 arg1, class240 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field146 = arg7;
        this.field151 = arg1;
        this.field144 = arg0;
        this.field148 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field2007 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field3547[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field145 = var10;
        if (var10 <= 0) {
            this.field149 = null;
        } else {
            class65 var14 = new class65(var10 * 2);
            if (this.field144.field5443) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field2007 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field3547[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method611((byte) 67, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field2007 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field3547[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method628((byte) -100, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field157 = this.field144.method2238(103, var14.field827, false, var14.field783, 5123);
            this.field156 = new class194(this.field144, 5123, null, 1);
        }
    }
}
