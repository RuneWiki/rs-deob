import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class78 {

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    private int field1153 = -1;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "Z")
    public boolean field1158 = true;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    private int field1157;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Lfu;")
    private class42 field1149;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Lcr;")
    private class109 field1154;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Ljj;")
    private class159 field1152;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Lbr;")
    private class351 field1159;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Luo;")
    private class429 field1150;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[B")
    private static byte[] field1151 = new byte[16384];

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 4)
    public final void method684(byte arg0) {
        if (arg0 <= -125) {
            this.method685(this.field1155, this.field1152, 4);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjj;I)V", line = 16)
    private final void method685(int arg0, class159 arg1, int arg2) {
        if (arg0 != 0) {
            this.method686(0);
            this.field1149.method303(this.field1150);
            this.field1149.method312(arg1, arg2, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 29)
    private final void method686(int arg0) {
        if (!this.field1158) {
            return;
        }
        this.field1158 = false;
        byte[] var2 = this.field1154.field1524;
        byte[] var3 = field1151;
        int var4 = arg0;
        int var5 = this.field1154.field1527;
        int var6 = this.field1154.field1527 * this.field1157 + this.field1156;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field1150 != null && this.field1153 == var4) {
            this.field1158 = false;
            return;
        }
        this.field1153 = var4;
        int var9 = 0;
        int var10 = this.field1157 * var5 + this.field1156;
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
            var10 += this.field1154.field1527 - 128;
        }
        if (this.field1150 == null) {
            this.field1150 = new class429(this.field1149, 3553, 6406, 128, 128, false, field1151, 6406, false);
            this.field1150.method2564(false, false);
            this.field1150.method2297(true);
        } else {
            this.field1150.method2561(0, 0, 128, 128, field1151, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lfu;Lcr;Lka;IIIII)V", line = 160)
    public class78(class42 arg0, class109 arg1, class140 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1157 = arg7;
        this.field1149 = arg0;
        this.field1154 = arg1;
        this.field1156 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field3518 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field1948[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field1155 = var10;
        if (var10 > 0) {
            class161 var17 = new class161(var10 * 2);
            if (this.field1149.field622) {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field3518 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field1948[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method1173(var26[var27] & 0xFFFF, (byte) 121);
                            }
                        }
                    }
                }
            } else {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field3518 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field1948[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method1196(var21[var22] & 0xFFFF, (byte) -83);
                            }
                        }
                    }
                }
            }
            this.field1152 = this.field1149.method380(5123, var17.field2262, var17.field2298, false);
            this.field1159 = new class351(this.field1149, 5123, (byte[]) null, 1);
        } else {
            this.field1150 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[BI)V", line = 150)
    public final void method687(int arg0, int arg1, byte[] arg2, int arg3) {
        this.field1159.method1034(arg3, arg2, this.field1149.method311(arg3) * arg0);
        if (arg1 == -1) {
            this.method685(arg0, this.field1159, 4);
        }
    }
}
