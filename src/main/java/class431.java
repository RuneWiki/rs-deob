import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class431 {

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    private int field6207 = -1;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "Z")
    public boolean field6209 = true;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    private int field6211;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Lps;")
    private class51 field6206;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    private int field6213;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "Lao;")
    private class157 field6216;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    private int field6212;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "Lrj;")
    private class354 field6210;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "Las;")
    private class84 field6214;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "Lef;")
    private class283 field6215;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "[B")
    private static byte[] field6208 = new byte[16384];

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lao;Lps;Lje;IIIII)V", line = 166)
    public class431(class157 arg0, class51 arg1, class228 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6211 = arg7;
        this.field6206 = arg1;
        this.field6213 = arg6;
        this.field6216 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field4635 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field3200[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field6212 = var10;
        if (var10 <= 0) {
            this.field6210 = null;
        } else {
            class236 var17 = new class236(var10 * 2);
            if (this.field6216.field1976) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field4635 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field3200[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method1605(var21[var22] & 0xFFFF, false);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field4635 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field3200[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method1609(var26[var27] & 0xFFFF, 5544);
                            }
                        }
                    }
                }
            }
            this.field6214 = this.field6216.method967(5123, var17.field3364, var17.field3320, false);
            this.field6215 = new class283(this.field6216, 5123, (byte[]) null, 1);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BII[B)V", line = 12)
    public final void method2706(byte arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 == 104) {
            this.field6215.method462(arg1, arg3, this.field6216.method953(arg1) * arg2);
            this.method2709(arg2, -128, this.field6215);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 30)
    public final void method2707(byte arg0) {
        this.method2709(this.field6212, -128, this.field6214);
        if (arg0 != -27) {
            this.method2706((byte) -95, -55, 12, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 42)
    private final void method2708(int arg0) {
        if (arg0 > -106 || !this.field6209) {
            return;
        }
        this.field6209 = false;
        byte[] var2 = this.field6206.field609;
        byte[] var3 = field6208;
        int var4 = 0;
        int var5 = this.field6206.field610;
        int var6 = this.field6206.field610 * this.field6211 + this.field6213;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field6210 != null && this.field6207 == var4) {
            this.field6209 = false;
            return;
        }
        this.field6207 = var4;
        int var9 = this.field6213 + (this.field6211 * var5);
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
            var9 += this.field6206.field610 - 128;
        }
        if (this.field6210 == null) {
            this.field6210 = new class354(this.field6216, 3553, 6406, 128, 128, false, field6208, 6406, false);
            this.field6210.method2254(false, false);
            this.field6210.method1476(true);
        } else {
            this.field6210.method2252(0, 0, 128, 128, field6208, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILas;)V", line = 150)
    private final void method2709(int arg0, int arg1, class84 arg2) {
        if (arg1 == -128 && arg0 != 0) {
            this.method2708(arg1 + 10);
            this.field6216.method1003(this.field6210);
            this.field6216.method968(arg2, 4, 0, arg0);
        }
    }
}
