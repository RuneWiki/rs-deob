import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class50 extends class573 {

    @OriginalMember(owner = "client!gda", name = "N", descriptor = "I")
    private int field1177 = 10;

    @OriginalMember(owner = "client!gda", name = "Q", descriptor = "I")
    private int field1180 = 2048;

    @OriginalMember(owner = "client!gda", name = "R", descriptor = "I")
    private int field1181 = 0;

    @OriginalMember(owner = "client!gda", name = "K", descriptor = "Lqfa;")
    public static class85 field1174 = new class85(47, 5);

    @OriginalMember(owner = "client!gda", name = "W", descriptor = "I")
    public static int field1186 = -1;

    @OriginalMember(owner = "client!gda", name = "V", descriptor = "Z")
    public static boolean field1185 = false;

    @OriginalMember(owner = "client!gda", name = "I", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!gda", name = "J", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!gda", name = "O", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!gda", name = "P", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!gda", name = "S", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!gda", name = "T", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!gda", name = "U", descriptor = "Lak;")
    public static class322 field1184;

    @OriginalMember(owner = "client!gda", name = "L", descriptor = "[I")
    private int[] field1175;

    @OriginalMember(owner = "client!gda", name = "M", descriptor = "[I")
    private int[] field1176;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        if (arg0 != 4095) {
            this.field1180 = 90;
        }
        ++field1172;
        this.method621((byte) 87);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field1183;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field1181 = arg0.method732(-559537960);
                }
            } else {
                this.field1180 = arg0.method723((byte) -25);
            }
        } else {
            this.field1177 = arg0.method732(-559537960);
        }
        if (arg2 != 3) {
            this.field1175 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(FIFF)I")
    public static final int method618(float arg0, int arg1, float arg2, float arg3) {
        ++field1178;
        float var4 = !(arg3 < 0.0F) ? arg3 : -arg3;
        float var5 = !(arg0 < 0.0F) ? arg0 : -arg0;
        if (arg1 != 2) {
            method618(0.09464409F, -89, -0.9156585F, -0.6862102F);
        }
        float var6 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 < var5 && var6 < var5) {
            return !(arg0 > 0.0F) ? 1 : 0;
        } else if (var4 < var6 && var6 > var5) {
            return arg2 > 0.0F ? 2 : 3;
        } else {
            return arg3 > 0.0F ? 4 : 5;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field1179;
        if (arg1 != 1) {
            this.field1180 = -47;
        }
        int[] var3 = super.field8321.method3164(arg0, -117);
        if (super.field8321.field7825) {
            int var4 = class230.field3460[arg0];
            if (this.field1181 == 0) {
                short var5 = 0;
                for (int var6 = 0; ~var6 > ~this.field1177; ++var6) {
                    if (~this.field1176[var6] >= ~var4 && ~var4 > ~this.field1176[var6 + 1]) {
                        if (~var4 > ~this.field1175[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class692.method3878(var3, 0, class540.field7555, var5);
            } else {
                for (int var7 = 0; var7 < class540.field7555; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class51.field1194[var7];
                    int var11 = this.field1181;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var10 + -4096 + var4 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; var12 < this.field1177; ++var12) {
                        if (var8 >= this.field1176[var12] && ~var8 > ~this.field1176[var12 - -1]) {
                            if (this.field1175[var12] > var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "()V")
    public class50() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "(I)V")
    public static void method620(int arg0) {
        field1184 = null;
        int var1 = -78 % ((arg0 - 31) / 62);
        field1174 = null;
    }

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(B)V")
    private final void method621(byte arg0) {
        ++field1173;
        this.field1175 = new int[this.field1177 + 1];
        this.field1176 = new int[this.field1177 + 1];
        int var2 = 0;
        if (arg0 <= 86) {
            field1182 = 49;
        }
        int var3 = 4096 / this.field1177;
        int var4 = this.field1180 * var3 >> 12;
        for (int var5 = 0; ~this.field1177 < ~var5; ++var5) {
            this.field1176[var5] = var2;
            this.field1175[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1176[this.field1177] = 4096;
        this.field1175[this.field1177] = this.field1175[0] + 4096;
    }
}
