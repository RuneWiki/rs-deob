import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class309 {

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    private int field4515 = -1;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Z")
    public boolean field4519 = true;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Lge;")
    private class104 field4512;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    private int field4513;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Lek;")
    private class266 field4511;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    private int field4516;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    private int field4514;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Llb;")
    private class208 field4517;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lgp;")
    private class259 field4510;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "[B")
    private static byte[] field4518 = new byte[16384];

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public final void method2112(byte arg0) {
        if (arg0 != 68) {
            this.field4514 = -21;
        }
        this.method2113(this.field4510, arg0 - 68, this.field4514);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lgp;II)V")
    public final void method2113(class259 arg0, int arg1, int arg2) {
        if (arg1 != arg2) {
            this.method2114(arg1 - 1);
            this.field4512.method929(this.field4517);
            this.field4512.method878(arg0, 4, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    private final void method2114(int arg0) {
        if (!this.field4519) {
            return;
        }
        this.field4519 = false;
        byte[] var2 = this.field4511.field3989;
        byte[] var3 = field4518;
        int var4 = 0;
        int var5 = this.field4511.field3991;
        if (arg0 != -1) {
            this.method2113((class259) null, 11, 60);
        }
        int var6 = this.field4511.field3991 * this.field4513 + this.field4516;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4517 != null && this.field4515 == var4) {
            this.field4519 = false;
            return;
        }
        this.field4515 = var4;
        int var9 = 0;
        int var10 = this.field4513 * var5 + this.field4516;
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
            var10 += this.field4511.field3991 - 128;
        }
        if (this.field4517 == null) {
            this.field4517 = new class208(this.field4512, 3553, 6406, 128, 128, false, field4518, 6406, false);
            this.field4517.method1574(false, false);
            this.field4517.method1499(true);
        } else {
            this.field4517.method1571(0, 0, 128, 128, field4518, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lge;Lek;Lwh;IIIII)V")
    public class309(class104 arg0, class266 arg1, class312 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4512 = arg0;
        this.field4513 = arg7;
        this.field4511 = arg1;
        this.field4516 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field2037 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field4557[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field4514 = var10;
        if (var10 <= 0) {
            this.field4517 = null;
        } else {
            class37 var17 = new class37(var10 * 2);
            if (this.field4512.field1727) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field2037 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field4557[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method324(var21[var22], -39);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field2037 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field4557[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method301((byte) -85, var26[var27]);
                            }
                        }
                    }
                }
            }
            this.field4510 = this.field4512.method875(5123, var17.field578, var17.field565, false);
        }
    }
}
