import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class87 extends class288 {

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    private int field1182 = 0;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
    private int field1183 = 4096;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    private int field1189 = 2048;

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "I")
    private int field1181 = 8192;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "I")
    private int field1194 = 12288;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    private int field1193 = 2048;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    private int field1196 = 0;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "Ljava/lang/String;")
    public static String field1184 = "Please remove ";

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "[I")
    public static int[] field1180 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public static int field1186 = 0;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1185 = "glow2:";

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "Leg;")
    public static class272 field1187 = new class272(64);

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "I")
    public static int field1199 = 0;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "Ljava/awt/Frame;")
    public static Frame field1188;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)V")
    public static void method614(int arg0) {
        field1187 = null;
        if (arg0 != 64) {
            method614(87);
        }
        field1185 = null;
        field1188 = null;
        field1184 = null;
        field1180 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Lid;")
    public static final class233 method615(int arg0, int arg1, int arg2) {
        class99 var3 = class273.field4415[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1502;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
    public class87() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILhk;)V")
    public static final void method616(int arg0, class275 arg1) {
        ++field1197;
        for (class54 var2 = (class54) class128.field2141.method365(3); var2 != null; var2 = (class54) class128.field2141.method372((byte) 7)) {
            if (var2.field750 == arg1) {
                if (var2.field749 != null) {
                    class215.field3464.method454(var2.field749);
                    var2.field749 = null;
                }
                var2.method544(96);
                return;
            }
        }
        if (arg0 != 4096) {
            method614(-63);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)Z")
    private final boolean method617(int arg0, byte arg1, int arg2) {
        ++field1190;
        if (arg1 != 118) {
            field1199 = 120;
        }
        int var4 = (arg0 + arg2) * this.field1194 >> 12;
        int var5 = class272.field4388[(1046915 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field1194;
        int var7 = (var6 << 12) / this.field1181;
        int var8 = this.field1183 * var7 >> 12;
        return var8 > arg2 - arg0 && ~(-arg0 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field1191;
        if (arg0 != 0) {
            this.method617(-93, (byte) 91, 53);
        }
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int var4 = class1.field15[arg1] - 2048;
            for (int var5 = 0; ~var5 > ~class186.field2986; ++var5) {
                int var6 = class246.field3958[var5] + -2048;
                int var7 = this.field1196 + var6;
                int var8 = this.field1182 + var4;
                int var9 = var7 >= -2048 ? var7 : var7 + 4096;
                int var10 = ~var8 > 2047 ? var8 + 4096 : var8;
                int var11 = ~var9 >= -2049 ? var9 : var9 + -4096;
                int var12 = this.field1189 + var4;
                int var13 = var12 < -2048 ? var12 + 4096 : var12;
                int var14 = var13 <= 2048 ? var13 : var13 + -4096;
                int var15 = var10 <= 2048 ? var10 : var10 - 4096;
                int var16 = this.field1193 + var6;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = ~var17 < -2049 ? var17 - 4096 : var17;
                var3[var5] = !this.method618(class223.method1477(arg0, -10436), var18, var15) && !this.method617(var11, (byte) 118, var14) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(III)Z")
    private final boolean method618(int arg0, int arg1, int arg2) {
        ++field1198;
        int var4 = (-arg1 + arg2) * this.field1194 >> 12;
        if (arg0 != -10436) {
            field1188 = null;
        }
        int var5 = class272.field4388[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field1194;
        int var7 = (var6 << 12) / this.field1181;
        int var8 = this.field1183 * var7 >> 12;
        return arg1 - -arg2 < var8 && -var8 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        if (arg0 != -125) {
            this.method618(116, 71, 25);
        }
        class206.method1389(4096);
        ++field1192;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field1181 = arg0.method1777(-43);
                                }
                            } else {
                                this.field1183 = arg0.method1777(arg1 ^ 47);
                            }
                        } else {
                            this.field1194 = arg0.method1777(-103);
                        }
                    } else {
                        this.field1189 = arg0.method1777(-80);
                    }
                } else {
                    this.field1196 = arg0.method1777(-115);
                }
            } else {
                this.field1182 = arg0.method1777(arg1 + -66);
            }
        } else {
            this.field1193 = arg0.method1777(-78);
        }
        if (arg1 != -19) {
            this.field1183 = -21;
        }
        ++field1195;
    }
}
