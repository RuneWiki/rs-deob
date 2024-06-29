import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class80 extends class120 {

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
    private int field1177 = -1;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "Lok;")
    private static class41 field1172 = class137.method956("white:", 45);

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "Lok;")
    public static class41 field1176 = field1172;

    @OriginalMember(owner = "client!cj", name = "eb", descriptor = "Lok;")
    public static class41 field1182 = field1172;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    private int field1171;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!cj", name = "db", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!cj", name = "fb", descriptor = "I")
    private int field1183;

    @OriginalMember(owner = "client!cj", name = "hb", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!cj", name = "gb", descriptor = "Lmh;")
    public static class65 field1184;

    @OriginalMember(owner = "client!cj", name = "ib", descriptor = "[I")
    private int[] field1186;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public static final void method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1174++;
        if (arg0 < 128 || arg6 < 128 || arg0 > 13056 || arg6 > 13056) {
            class123.field1835 = -1;
            class191.field3095 = -1;
            return;
        }
        int var8 = class140.method983((byte) 122, class55.field807, arg0, arg6) - arg3;
        int var9 = var8 - class13.field159;
        int var10 = arg0 - class235.field3779;
        int var11 = arg6 - class251.field3990;
        int var12 = class31.field450[class57.field823];
        int var13 = class31.field455[class57.field823];
        int var14 = class31.field450[class304.field5072];
        int var15 = class31.field455[class304.field5072];
        int var16 = var10 * var15 + var11 * var14 >> 16;
        int var17 = var11 * var15 - (var10 * var14) >> 16;
        if (arg4 != 25757) {
            method571(-46, 43, 11, -1, 50, -103, -67, 106);
        }
        int var19 = var9 * var13 - (var12 * var17) >> 16;
        int var20 = var9 * var12 + var13 * var17 >> 16;
        if (var20 < 50) {
            class191.field3095 = -1;
            class123.field1835 = -1;
        } else if (class166.field2625) {
            int var22 = arg2 * 512 >> 8;
            class191.field3095 = arg5 + (var16 * var22 / var20);
            int var23 = arg7 * 512 >> 8;
            class123.field1835 = var19 * var23 / var20 + arg1;
        } else {
            class191.field3095 = (var16 << 9) / var20 + arg5;
            class123.field1835 = (var19 << 9) / var20 + arg1;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IZ)[[I", line = 76)
    public final int[][] method168(int arg0, boolean arg1) {
        field1173++;
        if (!arg1) {
            method575(20, 15, (class65) null);
        }
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836 && this.method574(981750480)) {
            int var4 = this.field1171 * (class226.field3609 == this.field1183 ? arg0 : this.field1183 * arg0 / class226.field3609);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            if (class307.field5160 == this.field1171) {
                for (int var8 = 0; var8 < class307.field5160; var8++) {
                    int var9 = this.field1186[var4++];
                    var7[var8] = class217.method1563(var9, 255) << 4;
                    var5[var8] = class217.method1563(4080, var9 >> 4);
                    var6[var8] = class217.method1563(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class307.field5160; var10++) {
                    int var11 = this.field1171 * var10 / class307.field5160;
                    int var12 = this.field1186[var4 + var11];
                    var7[var10] = class217.method1563(var12 << 4, 4080);
                    var5[var10] = class217.method1563(var12, 65280) >> 4;
                    var6[var10] = class217.method1563(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)I", line = 143)
    public final int method572(int arg0) {
        int var2 = -49 / ((64 - arg0) / 61);
        field1185++;
        return this.field1177;
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(B)V", line = 153)
    public static void method573(byte arg0) {
        if (arg0 > 103) {
            field1182 = null;
            field1172 = null;
            field1184 = null;
            field1176 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)Z", line = 167)
    private final boolean method574(int arg0) {
        field1175++;
        if (this.field1186 != null) {
            return true;
        } else if (arg0 != 981750480) {
            return true;
        } else if (this.field1177 >= 0) {
            int var2 = class226.field3609;
            int var3 = class307.field5160;
            int var4 = class62.field901.method686(-123, this.field1177) ? 64 : 128;
            this.field1186 = class62.field901.method684((byte) 4, this.field1177);
            this.field1171 = var4;
            this.field1183 = var4;
            class306.method2112(-86, var3, var2);
            return this.field1186 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V", line = 197)
    public final void method435(boolean arg0) {
        field1181++;
        super.method435(arg0);
        if (!arg0) {
            this.method435(true);
        }
        this.field1186 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILmh;)Ltb;", line = 222)
    public static final class199 method575(int arg0, int arg1, class65 arg2) {
        field1180++;
        if (class226.method1628(arg1, (byte) -89, arg2)) {
            if (arg0 != 4080) {
                field1172 = (class41) null;
            }
            return class94.method672(-119);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 240)
    public class80() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Llb;II)V", line = 255)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field1177 = arg0.method759((byte) -103);
        }
        if (arg1 != -1) {
            this.method572(95);
        }
        field1178++;
    }
}
