import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class164 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    private int field1966 = -1;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Z")
    public boolean field1975 = true;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    private int field1970;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Lic;")
    private class246 field1973;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Lvb;")
    private class98 field1968;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    private int field1971;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    private int field1967;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Lhs;")
    private class455 field1976;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Llh;")
    private class489 field1969;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Ltr;")
    private class151 field1974;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "[B")
    private static byte[] field1972 = new byte[16384];

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([BIIB)V", line = 5)
    public final void method797(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= -101) {
            this.field1969.method748(arg1, arg0, this.field1973.method1457(arg1) * arg2);
            this.method799(1, this.field1969, arg2);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 17)
    public final void method798(int arg0) {
        this.method799(arg0 ^ 0xFFFFFF81, this.field1976, this.field1967);
        if (arg0 != -128) {
            this.field1976 = (class455) null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lic;Lvb;Lto;IIIII)V", line = 165)
    public class164(class246 arg0, class98 arg1, class296 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1970 = arg6;
        this.field1973 = arg0;
        this.field1968 = arg1;
        this.field1971 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field6326 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field4369[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field1967 = var10;
        if (var10 > 0) {
            class179 var17 = new class179(var10 * 2);
            if (this.field1973.field3370) {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field6326 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field4369[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method884(var26[var27] & 0xFFFF, true);
                            }
                        }
                    }
                }
            } else {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field6326 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field4369[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method880(true, var21[var22] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field1976 = this.field1973.method1435(5123, var17.field2159, var17.field2206, false);
            this.field1969 = new class489(this.field1973, 5123, (byte[]) null, 1);
        } else {
            this.field1974 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILhs;I)V", line = 31)
    private final void method799(int arg0, class455 arg1, int arg2) {
        if (arg2 == 0) {
            return;
        }
        this.method800(12304);
        this.field1973.method1379(this.field1974);
        if (arg0 != 1) {
            this.method800(39);
        }
        this.field1973.method1399(arg1, 4, 0, arg2);
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 48)
    private final void method800(int arg0) {
        if (!this.field1975) {
            return;
        }
        this.field1975 = false;
        byte[] var2 = this.field1968.field1198;
        byte[] var3 = field1972;
        int var4 = 0;
        int var5 = this.field1968.field1203;
        int var6 = this.field1970 + (this.field1968.field1203 * this.field1971);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field1974 != null && this.field1966 == var4) {
            this.field1975 = false;
            return;
        }
        this.field1966 = var4;
        int var9 = 0;
        int var10 = this.field1971 * var5 + this.field1970;
        if (arg0 != 12304) {
            this.method799(-95, (class455) null, 89);
        }
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
            var10 += this.field1968.field1203 - 128;
        }
        if (this.field1974 == null) {
            this.field1974 = new class151(this.field1973, 3553, 6406, 128, 128, false, field1972, 6406, false);
            this.field1974.method733(false, false);
            this.field1974.method46(true);
        } else {
            this.field1974.method732(0, 0, 128, 128, field1972, 6406, 0, 0, false);
        }
    }
}
