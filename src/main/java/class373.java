import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class373 extends class424 {

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "Z")
    private boolean field5163 = true;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "Z")
    private boolean field5168 = true;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "Lhc;")
    public static class368 field5172 = new class368("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!kk", name = "ab", descriptor = "I")
    public static int field5176 = 0;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!kk", name = "Y", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!kk", name = "Z", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!kk", name = "bb", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 6)
    public class373() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(IB)[I", line = 10)
    public final int[] method43(int arg0, byte arg1) {
        ++field5167;
        int[] var3 = super.field5892.method783(arg0, (byte) 127);
        if (arg1 != -10) {
            method2336(92);
        }
        if (super.field5892.field1427) {
            int[] var4 = this.method2621(0, -120, this.field5168 ? -arg0 + class174.field2484 : arg0);
            if (this.field5163) {
                for (int var5 = 0; class303.field4135 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class65.field898];
                }
            } else {
                class79.method639(var4, 0, var3, 0, class303.field4135);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)I", line = 51)
    public static final int method2334(int arg0, int arg1) {
        if (arg0 != 255) {
            return 7;
        } else {
            ++field5165;
            return arg1 & 255;
        }
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V", line = 67)
    public static final void method2335(int arg0) {
        ++field5171;
        class337.field4556.method843(-1);
        class334.field4527.method151(71);
        class191.field2750.method151(112);
        if (arg0 < 11) {
            method2334(6, 116);
        }
    }

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "(I)V", line = 82)
    public static void method2336(int arg0) {
        field5172 = null;
        int var1 = -106 % ((arg0 - -48) / 44);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)[[I", line = 96)
    public final int[][] method21(int arg0, boolean arg1) {
        ++field5170;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int[][] var4 = this.method2624(arg1, 0, this.field5168 ? -arg0 + class174.field2484 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field5163) {
                for (int var11 = 0; class303.field4135 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class303.field4135 > var12; ++var12) {
                    var8[var12] = var5[class65.field898 - var12];
                    var9[var12] = var6[-var12 + class65.field898];
                    var10[var12] = var7[-var12 + class65.field898];
                }
            }
        }
        return !arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)V", line = 165)
    public static final void method2337(byte arg0) {
        if (arg0 > -31) {
            field5175 = 71;
        }
        ++field5166;
        if (~class446.field6258 == -6) {
            class446.field6258 = 6;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lrg;BI)V", line = 179)
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field5893 = arg0.method2306((byte) 74) == 1;
                }
            } else {
                this.field5168 = ~arg0.method2306((byte) 60) == -2;
            }
        } else {
            this.field5163 = arg0.method2306((byte) 122) == 1;
        }
        if (arg1 == -48) {
            ++field5162;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII)V", line = 224)
    public static final void method2338(int arg0, int arg1, int arg2, int arg3) {
        ++field5173;
        class19.field261 = arg3;
        class219.field3081 = arg1;
        class332.field4480 = arg0;
        if (arg2 != 11111) {
            field5172 = null;
        }
    }
}
