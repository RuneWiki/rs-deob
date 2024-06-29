import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class90 {

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    private int field1166 = -1;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "Z")
    public boolean field1165 = true;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    private int field1170;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    private int field1172;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "Lwd;")
    private class149 field1169;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "Lig;")
    private class132 field1164;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    private int field1171;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "Lhf;")
    private class225 field1162;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "Lis;")
    private class292 field1167;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "Lpg;")
    private class437 field1163;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "[B")
    private static byte[] field1168 = new byte[16384];

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V", line = 5)
    public final void method529(int arg0) {
        this.method531(19388, this.field1167, this.field1171);
        if (arg0 >= -13) {
            this.field1162 = (class225) null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V", line = 17)
    private final void method530(byte arg0) {
        if (!this.field1165) {
            return;
        }
        this.field1165 = false;
        byte[] var2 = this.field1169.field2229;
        byte[] var3 = field1168;
        int var4 = 0;
        int var5 = this.field1169.field2233;
        int var6 = this.field1169.field2233 * this.field1172 + this.field1170;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (arg0 != -116) {
            this.field1171 = 0;
        }
        if (this.field1162 != null && this.field1166 == var4) {
            this.field1165 = false;
            return;
        }
        this.field1166 = var4;
        int var9 = this.field1170 + (this.field1172 * var5);
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
                    if (var2[var9 + var5] != 0) {
                        var13++;
                    }
                    var3[var10++] = (byte) (var13 * 17);
                } else {
                    var3[var10++] = 68;
                }
                var9++;
            }
            var9 += this.field1169.field2233 - 128;
        }
        if (this.field1162 == null) {
            this.field1162 = new class225(this.field1164, 3553, 6406, 128, 128, false, field1168, 6406, false);
            this.field1162.method1580(false, false);
            this.field1162.method2524(true);
        } else {
            this.field1162.method1577(0, 0, 128, 128, field1168, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILis;I)V", line = 127)
    private final void method531(int arg0, class292 arg1, int arg2) {
        if (arg2 == 0) {
            return;
        }
        this.method530((byte) -116);
        this.field1164.method888(this.field1162);
        if (arg0 == 19388) {
            this.field1164.method982(arg1, 4, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lig;Lwd;Ler;IIIII)V", line = 165)
    public class90(class132 arg0, class149 arg1, class55 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1170 = arg6;
        this.field1172 = arg7;
        this.field1169 = arg1;
        this.field1164 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field1187 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field717[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field1171 = var10;
        if (var10 <= 0) {
            this.field1162 = null;
        } else {
            class130 var17 = new class130(var10 * 2);
            if (this.field1164.field1998) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field1187 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field717[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method799(var21[var22] & 0xFFFF, -118);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field1187 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field717[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method827(var26[var27] & 0xFFFF, -37);
                            }
                        }
                    }
                }
            }
            this.field1167 = this.field1164.method986(5123, var17.field1851, var17.field1880, false);
            this.field1163 = new class437(this.field1164, 5123, (byte[]) null, 1);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II[BI)V", line = 149)
    public final void method532(int arg0, int arg1, byte[] arg2, int arg3) {
        this.field1163.method1980(arg1, arg2, this.field1164.method1015(arg1) * arg0);
        this.method531(19388, this.field1163, arg0);
        int var5 = 110 % ((arg3 + 82) / 43);
    }
}
