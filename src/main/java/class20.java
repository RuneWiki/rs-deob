import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class20 extends class152 {

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
    private int field271 = 32768;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "Lce;")
    public static class126 field272 = class206.method1445(-7923, "::gc");

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    public static int field270 = 0;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public static int field269 = 0;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "Lce;")
    public static class126 field275 = class138.method1011(160, 1);

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "[Lce;")
    public static class126[] field273;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILbb;)V", line = 8)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 != 8) {
            method104((byte) -34);
        }
        if (arg1 == 0) {
            this.field271 = arg2.method942(true) << 4;
        } else if (arg1 == 1) {
            this.field2781 = arg2.method948(-127) == 1;
        }
        field268++;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(II)[[I", line = 46)
    public final int[][] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method2((byte) -68);
        }
        field266++;
        int[][] var3 = this.field2775.method319(70, arg1);
        if (this.field2775.field775) {
            int[] var4 = this.method1132(arg1, 84, 1);
            int[] var5 = this.method1132(arg1, arg0 - 89, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class244.field4133; var9++) {
                int var10 = (var4[var9] * 255 & 0xFFB39) >> 12;
                int var11 = var5[var9] * this.field271 >> 12;
                int var12 = class270.field4554[var10] * var11 >> 12;
                int var13 = (var12 >> 12) + var9 & class321.field5490;
                int var14 = class24.field344[var10] * var11 >> 12;
                int var15 = class314.field5378 & (var14 >> 12) + arg1;
                int[][] var16 = this.method1133(var15, 0, true);
                var6[var9] = var16[0][var13];
                var7[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 102)
    public class20() {
        super(3, false);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)[I", line = 111)
    public final int[] method6(boolean arg0, int arg1) {
        if (!arg0) {
            field269 = -5;
        }
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        field267++;
        if (this.field2776.field4516) {
            int[] var4 = this.method1132(arg1, -64, 1);
            int[] var5 = this.method1132(arg1, -120, 2);
            for (int var6 = 0; var6 < class244.field4133; var6++) {
                int var7 = (var4[var6] & 0xFF6) >> 4;
                int var8 = var5[var6] * this.field271 >> 12;
                int var9 = class270.field4554[var7] * var8 >> 12;
                int var10 = class24.field344[var7] * var8 >> 12;
                int var11 = class321.field5490 & (var9 >> 12) + var6;
                int var12 = class314.field5378 & (var10 >> 12) + arg1;
                int[] var13 = this.method1132(var12, -58, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V", line = 164)
    public static void method104(byte arg0) {
        field275 = null;
        field273 = null;
        field272 = null;
        if (arg0 != 48) {
            field272 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V", line = 188)
    public final void method2(byte arg0) {
        field274++;
        int var2 = 29 / ((2 - arg0) / 37);
        class158.method1159(-113);
    }
}
