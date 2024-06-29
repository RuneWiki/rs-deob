import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class426 {

    @OriginalMember(owner = "client!go", name = "f", descriptor = "Z")
    public boolean field6114 = true;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    private int field6124 = -1;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    private int field6118;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Lfv;")
    private class73 field6109;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    private int field6112;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "Lbl;")
    private class442 field6121;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    private int field6111;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "Lsg;")
    private class262 field6115;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "Lph;")
    private class438 field6119;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "Loi;")
    private class49 field6117;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field6120 = 0;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public static int field6123;

    static {
        new class423(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II[BI)V", line = 3)
    public final void method2499(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != 0) {
            field6120 = 107;
        }
        this.field6117.method353(arg1, arg2, this.field6121.method2649(-3767, arg1) * arg0, (byte) -27);
        field6122++;
        this.method2503(this.field6117, 28935, arg0);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V", line = 19)
    public final void method2500(byte arg0) {
        this.method2503(this.field6119, 28935, this.field6111);
        if (arg0 > -121) {
            this.field6124 = 11;
        }
        field6113++;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 34)
    private final void method2501(int arg0) {
        field6110++;
        if (!this.field6114) {
            return;
        }
        this.field6114 = false;
        byte[] var2 = this.field6109.field1290;
        byte[] var3 = class495.field7527;
        int var4 = 0;
        if (arg0 > -11) {
            return;
        }
        int var5 = this.field6109.field1303;
        int var6 = this.field6109.field1303 * this.field6118 + this.field6112;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field6115 != null && this.field6124 == var4) {
            this.field6114 = false;
            return;
        }
        this.field6124 = var4;
        int var8 = this.field6118 * var5 + this.field6112;
        int var9 = 0;
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
            var8 += this.field6109.field1303 - 128;
        }
        if (this.field6115 == null) {
            this.field6115 = new class262(this.field6121, 3553, 6406, 128, 128, false, class495.field7527, 6406, false);
            this.field6115.method1593(false, false, 0);
            this.field6115.method1208(true, false);
        } else {
            this.field6115.method1591(0, 0, true, 0, 6406, class495.field7527, 128, 128, false, 0);
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lbl;Lfv;Ltn;IIIII)V", line = 193)
    public class426(class442 arg0, class73 arg1, class55 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6118 = arg7;
        this.field6109 = arg1;
        this.field6112 = arg6;
        this.field6121 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field5108 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field835[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field6111 = var10;
        if (var10 <= 0) {
            this.field6115 = null;
        } else {
            class40 var14 = new class40(var10 * 2);
            if (this.field6121.field6745) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field5108 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field835[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method246((byte) -96, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field5108 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field835[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method260(var18[var19] & 0xFFFF, -2916);
                            }
                        }
                    }
                }
            }
            this.field6119 = this.field6121.method2601(false, var14.field585, 5123, (byte) 54, var14.field536);
            this.field6117 = new class49(this.field6121, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIB)Z", line = 148)
    public static final boolean method2502(int arg0, int arg1, byte arg2) {
        int var3 = 46 % ((17 - arg2) / 52);
        field6123++;
        return (class146.field2369[1][arg0][arg1] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lph;II)V", line = 163)
    private final void method2503(class438 arg0, int arg1, int arg2) {
        field6116++;
        if (arg2 == 0) {
            return;
        }
        this.method2501(-92);
        this.field6121.method2586(this.field6115, false);
        this.field6121.method2593(4, true, 0, arg2, arg0);
        if (arg1 != 28935) {
            this.field6112 = -79;
        }
    }
}
