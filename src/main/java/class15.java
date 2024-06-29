import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class15 {

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "Z")
    public boolean field139 = true;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    private int field141 = -1;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Lsr;")
    private class134 field147;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "Lql;")
    private class346 field146;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "Lcl;")
    private class313 field138;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Ljo;")
    private class218 field142;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "[B")
    private static byte[] field140 = new byte[16384];

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 8)
    private final void method66(int arg0) {
        if (!this.field139) {
            return;
        }
        this.field139 = false;
        byte[] var2 = this.field147.field1722;
        byte[] var3 = field140;
        int var4 = 0;
        int var5 = this.field147.field1717;
        int var6 = this.field145 + (this.field147.field1717 * this.field144);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field142 != null && this.field141 == var4) {
            this.field139 = false;
            return;
        }
        this.field141 = var4;
        int var9 = this.field144 * var5 + this.field145;
        int var10 = 0;
        if (arg0 != 0) {
            this.method66(43);
        }
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
            var9 += this.field147.field1717 - 128;
        }
        if (this.field142 == null) {
            this.field142 = new class218(this.field146, 3553, 6406, 128, 128, false, field140, 6406, false);
            this.field142.method1171(false, false);
            this.field142.method242(true);
        } else {
            this.field142.method1172(0, 0, 128, 128, field140, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V", line = 119)
    public final void method67(int arg0) {
        this.method68((byte) 103, this.field143, this.field138);
        if (arg0 != 17) {
            this.method66(0);
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lql;Lsr;Lge;IIIII)V", line = 156)
    public class15(class346 arg0, class134 arg1, class103 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field147 = arg1;
        this.field144 = arg7;
        this.field146 = arg0;
        this.field145 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field556 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field1243[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field143 = var10;
        if (var10 > 0) {
            class250 var17 = new class250(var10 * 2);
            if (this.field146.field4736) {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field556 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field1243[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method1346(120, var26[var27]);
                            }
                        }
                    }
                }
            } else {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field556 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field1243[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method1370((byte) -36, var21[var22]);
                            }
                        }
                    }
                }
            }
            this.field138 = this.field146.method2076(5123, var17.field3406, var17.field3389, false);
        } else {
            this.field142 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BILcl;)V", line = 136)
    public final void method68(byte arg0, int arg1, class313 arg2) {
        if (arg1 == 0) {
            return;
        }
        this.method66(0);
        this.field146.method2032(this.field142);
        if (arg0 <= 61) {
            this.field141 = 107;
        }
        this.field146.method2041(arg2, 4, 0, arg1);
    }
}
