import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class85 extends class349 {

    @OriginalMember(owner = "client!pw", name = "K", descriptor = "I")
    private int field1048 = 0;

    @OriginalMember(owner = "client!pw", name = "H", descriptor = "I")
    private int field1045 = 0;

    @OriginalMember(owner = "client!pw", name = "P", descriptor = "I")
    private int field1053 = 20;

    @OriginalMember(owner = "client!pw", name = "O", descriptor = "I")
    private int field1052 = 1365;

    @OriginalMember(owner = "client!pw", name = "B", descriptor = "Z")
    public static boolean field1040 = false;

    @OriginalMember(owner = "client!pw", name = "I", descriptor = "I")
    public static int field1046 = 0;

    @OriginalMember(owner = "client!pw", name = "E", descriptor = "[[I")
    public static int[][] field1043 = new int[6][];

    @OriginalMember(owner = "client!pw", name = "G", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!pw", name = "J", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!pw", name = "L", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!pw", name = "N", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!pw", name = "M", descriptor = "Lek;")
    public static class540 field1050;

    @OriginalMember(owner = "client!pw", name = "C", descriptor = "Z")
    public static boolean field1041;

    @OriginalMember(owner = "client!pw", name = "D", descriptor = "[I")
    public static int[] field1042;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 7)
    public static final String method475(int arg0, long arg1) {
        ++field1051;
        class125.field1603.setTime(new Date(arg1));
        int var3 = class125.field1603.get(7);
        int var4 = class125.field1603.get(5);
        if (arg0 != 10) {
            method477(57, (float[]) null, 113);
        }
        int var5 = class125.field1603.get(2);
        int var6 = class125.field1603.get(1);
        int var7 = class125.field1603.get(11);
        int var8 = class125.field1603.get(12);
        int var9 = class125.field1603.get(13);
        return class199.field2624[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class652.field9245[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(BI)[I", line = 35)
    public final int[] method13(byte arg0, int arg1) {
        ++field1044;
        int var3 = 6 / ((arg0 - 56) / 41);
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            for (int var5 = 0; ~class39.field497 < ~var5; ++var5) {
                int var6 = (class29.field283[var5] << 12) / this.field1052 - -this.field1045;
                int var7 = (class54.field709[arg1] << 12) / this.field1052 + this.field1048;
                int var8 = var6;
                int var9 = var7;
                int var10 = var6;
                int var11 = var7;
                int var12 = var6 * var6 >> 12;
                int var13 = var7 * var7 >> 12;
                int var14 = 0;
                while (~(var12 - -var13) > -16385 && var14 < this.field1053) {
                    var11 = (var10 * var11 >> 12) * 2 + var9;
                    var10 = var12 - var13 + var8;
                    var12 = var10 * var10 >> 12;
                    ++var14;
                    var13 = var11 * var11 >> 12;
                }
                var4[var5] = this.field1053 + -1 <= var14 ? 0 : (var14 << 12) / this.field1053;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "(I)V", line = 92)
    public static void method476(int arg0) {
        field1043 = null;
        field1042 = null;
        field1050 = null;
        int var1 = -88 % ((-17 - arg0) / 56);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I[FI)[F", line = 104)
    public static final float[] method477(int arg0, float[] arg1, int arg2) {
        if (arg0 != -16385) {
            method475(55, 126L);
        }
        ++field1049;
        float[] var3 = new float[arg2];
        class657.method3635(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IILdga;)V", line = 118)
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field1048 = arg2.method922((byte) -122);
                    }
                } else {
                    this.field1045 = arg2.method922((byte) -125);
                }
            } else {
                this.field1053 = arg2.method922((byte) -124);
            }
        } else {
            this.field1052 = arg2.method922((byte) -119);
        }
        if (arg0 != 4095) {
            field1040 = false;
        }
        ++field1047;
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V", line = 186)
    public class85() {
        super(0, true);
    }
}
