import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class311 {

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    private int field4210 = -1;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Z")
    public boolean field4212 = true;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    private int field4207;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Lh;")
    private class327 field4205;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Lln;")
    private class63 field4213;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    private int field4206;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    private int field4209;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Lks;")
    private class19 field4215;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "Lid;")
    private class155 field4214;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "Lbj;")
    private class313 field4208;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "[B")
    private static byte[] field4211 = new byte[16384];

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[BI)V", line = 8)
    public final void method1968(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 == -13592) {
            this.field4214.method116(arg1, arg2, this.field4205.method2093(arg1) * arg3);
            this.method1969(arg3, this.field4214, 69);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILks;I)V", line = 21)
    private final void method1969(int arg0, class19 arg1, int arg2) {
        if (arg0 != 0) {
            this.method1970((byte) 110);
            int var4 = -17 % ((36 - arg2) / 32);
            this.field4205.method2088(this.field4208);
            this.field4205.method2053(arg1, 4, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lh;Lln;Lef;IIIII)V", line = 168)
    public class311(class327 arg0, class63 arg1, class377 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4207 = arg7;
        this.field4205 = arg0;
        this.field4213 = arg1;
        this.field4206 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field3612 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field5109[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field4209 = var10;
        if (var10 > 0) {
            class242 var17 = new class242(var10 * 2);
            if (this.field4205.field4448) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field3612 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field5109[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method1573(-6266, var21[var22] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field3612 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field5109[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method1540(true, var26[var27] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field4215 = this.field4205.method2102(5123, var17.field3188, var17.field3211, false);
            this.field4214 = new class155(this.field4205, 5123, (byte[]) null, 1);
        } else {
            this.field4208 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 49)
    private final void method1970(byte arg0) {
        if (!this.field4212) {
            return;
        }
        this.field4212 = false;
        byte[] var2 = this.field4213.field773;
        byte[] var3 = field4211;
        if (arg0 <= 103) {
            this.field4205 = (class327) null;
        }
        int var4 = 0;
        int var5 = this.field4213.field776;
        int var6 = this.field4213.field776 * this.field4207 + this.field4206;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4208 != null && this.field4210 == var4) {
            this.field4212 = false;
            return;
        }
        this.field4210 = var4;
        int var9 = 0;
        int var10 = this.field4206 + (this.field4207 * var5);
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
            var10 += this.field4213.field776 - 128;
        }
        if (this.field4208 == null) {
            this.field4208 = new class313(this.field4205, 3553, 6406, 128, 128, false, field4211, 6406, false);
            this.field4208.method1975(false, false);
            this.field4208.method1507(true);
        } else {
            this.field4208.method1973(0, 0, 128, 128, field4211, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V", line = 159)
    public final void method1971(byte arg0) {
        if (arg0 == -121) {
            this.method1969(this.field4209, this.field4215, 127);
        }
    }
}
