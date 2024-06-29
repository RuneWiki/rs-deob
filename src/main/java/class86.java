import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class86 extends class326 {

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
    private int field1170 = 0;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
    private int field1160 = 0;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    private int field1169 = 0;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "[I")
    public static int[] field1161 = new int[50];

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1166 = " from your friend list first.";

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "Z")
    public static boolean field1164 = true;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    private int field1159;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    private int field1162;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
    private int field1163;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "I")
    private int field1171;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client!ik", name = "Z", descriptor = "Ldf;")
    public static class178 field1174;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)[[I", line = 17)
    public final int[][] method253(int arg0, byte arg1) {
        int[][] var3 = this.field5104.method2365((byte) 65, arg0);
        int var4 = 27 % ((arg1 - 60) / 51);
        if (this.field5104.field5325) {
            int[][] var5 = this.method2293(-15033, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            int[] var11 = var3[0];
            for (int var12 = 0; var12 < class166.field2731; var12++) {
                this.method620(var6[var12], var8[var12], 4096, var7[var12]);
                this.field1158 += this.field1160;
                this.field1163 += this.field1170;
                if (this.field1163 < 0) {
                    this.field1163 = 0;
                }
                while (this.field1158 < 0) {
                    this.field1158 += 4096;
                }
                while (this.field1158 > 4096) {
                    this.field1158 -= 4096;
                }
                if (this.field1163 > 4096) {
                    this.field1163 = 4096;
                }
                this.field1159 += this.field1169;
                if (this.field1159 < 0) {
                    this.field1159 = 0;
                }
                if (this.field1159 > 4096) {
                    this.field1159 = 4096;
                }
                this.method621(this.field1159, (byte) -71, this.field1158, this.field1163);
                var11[var12] = this.field1162;
                var9[var12] = this.field1173;
                var10[var12] = this.field1171;
            }
        }
        field1172++;
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)V", line = 88)
    private final void method620(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 4096) {
            this.field1158 = 7;
        }
        int var5 = arg1 <= arg0 ? arg1 : arg0;
        field1168++;
        int var6 = var5 > arg3 ? arg3 : var5;
        int var7 = arg1 < arg0 ? arg0 : arg1;
        int var8 = arg3 > var7 ? arg3 : var7;
        this.field1163 = (var6 + var8) / 2;
        int var9 = var8 - var6;
        if (var9 <= 0) {
            this.field1158 = 0;
        } else {
            int var10 = (var8 - arg0 << 12) / var9;
            int var11 = (var8 - arg1 << 12) / var9;
            int var12 = (var8 - arg3 << 12) / var9;
            if (arg0 == var8) {
                this.field1158 = arg1 == var6 ? var12 + 20480 : -var11 + 4096;
            } else if (arg1 == var8) {
                this.field1158 = arg3 == var6 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field1158 = arg0 == var6 ? var11 + 12288 : -var10 + 20480;
            }
            this.field1158 /= 6;
        }
        if (this.field1163 > 0 && this.field1163 < 4096) {
            this.field1159 = (var9 << 12) / (this.field1163 > 2048 ? 8192 - (this.field1163 * 2) : this.field1163 * 2);
        } else {
            this.field1159 = 0;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBII)V", line = 155)
    private final void method621(int arg0, byte arg1, int arg2, int arg3) {
        field1165++;
        if (arg1 != -71) {
            method622((byte) -127);
        }
        int var5 = arg3 > 2048 ? arg0 + arg3 - (arg0 * arg3 >> 12) : (4096 - -arg0) * arg3 >> 12;
        if (var5 <= 0) {
            this.field1162 = this.field1173 = this.field1171 = arg3;
            return;
        }
        int var6 = arg2 * 6;
        int var7 = arg3 + arg3 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var9 = var6 >> 12;
        int var10 = var6 - (var9 << 12);
        int var12 = var8 * var5 >> 12;
        int var13 = var10 * var12 >> 12;
        int var14 = var7 + var13;
        int var15 = var5 - var13;
        if (var9 == 0) {
            this.field1173 = var14;
            this.field1162 = var5;
            this.field1171 = var7;
        } else if (var9 == 1) {
            this.field1173 = var5;
            this.field1162 = var15;
            this.field1171 = var7;
        } else if (var9 == 2) {
            this.field1171 = var14;
            this.field1173 = var5;
            this.field1162 = var7;
        } else if (var9 == 3) {
            this.field1162 = var7;
            this.field1173 = var15;
            this.field1171 = var5;
        } else if (var9 == 4) {
            this.field1173 = var7;
            this.field1162 = var14;
            this.field1171 = var5;
        } else if (var9 == 5) {
            this.field1171 = var15;
            this.field1173 = var7;
            this.field1162 = var5;
        }
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(B)V", line = 265)
    public static void method622(byte arg0) {
        field1161 = null;
        field1174 = null;
        int var1 = -99 % ((19 - arg0) / 62);
        field1166 = null;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V", line = 329)
    public class86() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZLvl;)V", line = 297)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg0 == 0) {
            this.field1160 = arg2.method78((byte) -71);
        } else if (arg0 == 1) {
            this.field1169 = (arg2.method83((byte) -90) << 12) / 100;
        } else if (arg0 == 2) {
            this.field1170 = (arg2.method83((byte) -88) << 12) / 100;
        }
        if (arg1) {
            this.method620(124, -49, -116, 52);
        }
        field1167++;
    }
}
