import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class190 extends class110 {

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    private int field2832 = 32768;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2822 = "Hidden";

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field2826 = -1;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "I")
    public static int field2829 = 0;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "Llm;")
    public static class210 field2830;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)[I", line = 7)
    public final int[] method46(int arg0, int arg1) {
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        field2831++;
        if (this.field1695.field875) {
            int[] var4 = this.method764(1, true, arg1);
            int[] var5 = this.method764(2, true, arg1);
            for (int var6 = 0; var6 < class124.field1936; var6++) {
                int var7 = (var4[var6] & 0xFF2) >> 4;
                int var8 = var5[var6] * this.field2832 >> 12;
                int var9 = class321.field4852[var7] * var8 >> 12;
                int var10 = class22.field285[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class196.field2949;
                int var12 = arg1 + (var10 >> 12) & class154.field2320;
                int[] var13 = this.method764(0, true, var12);
                var3[var6] = var13[var11];
            }
        }
        if (arg0 != 1) {
            field2830 = (class210) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILre;I)V", line = 62)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.field2832 = arg1.method1830((byte) -77) << 4;
        } else if (arg0 == 1) {
            this.field1705 = arg1.method1787(false) == 1;
        }
        field2825++;
        if (arg2 > -37) {
            this.field2832 = 101;
        }
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V", line = 93)
    public final void method47(int arg0) {
        class314.method2157(-124);
        if (arg0 != -9) {
            method1298(69, -53, 30, -106);
        }
        field2834++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V", line = 104)
    public static final void method1296(boolean arg0) {
        class258.field3920 = class192.method1324(2048, 35, arg0, 43, 0.4F, 4, 8, 8);
        field2823++;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V", line = 116)
    public static void method1297(byte arg0) {
        if (arg0 >= -72) {
            field2822 = (String) null;
        }
        field2830 = null;
        field2822 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIII)I", line = 127)
    public static final int method1298(int arg0, int arg1, int arg2, int arg3) {
        field2827++;
        if (arg0 == arg2) {
            return arg0;
        } else {
            int var4 = 128 - arg1;
            int var5 = ((arg0 & 0xFF00FF00) >>> 7) * var4 + ((arg3 & arg2) >>> 7) * arg1 & 0xFF00FF00;
            int var6 = (arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00;
            return (var6 >> 7) + var5;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 156)
    public class190() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)[[I", line = 165)
    public final int[][] method445(int arg0, boolean arg1) {
        field2833++;
        if (arg1) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field1701.method1477((byte) 107, arg0);
        if (this.field1701.field3255) {
            int[] var4 = this.method764(1, true, arg0);
            int[] var5 = this.method764(2, true, arg0);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class124.field1936; var9++) {
                int var10 = (var4[var9] * 255 & 0xFF059) >> 12;
                int var11 = var5[var9] * this.field2832 >> 12;
                int var12 = class321.field4852[var10] * var11 >> 12;
                int var13 = class196.field2949 & (var12 >> 12) + var9;
                int var14 = class22.field285[var10] * var11 >> 12;
                int var15 = arg0 + (var14 >> 12) & class154.field2320;
                int[][] var16 = this.method770(var15, (byte) 44, 0);
                var7[var9] = var16[0][var13];
                var6[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V", line = 218)
    public static final void method1299(byte arg0, int arg1) {
        field2824++;
        class223 var2 = (class223) class295.field4520.method1320((long) arg1, 13002);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field3398.length; var3++) {
            var2.field3398[var3] = -1;
            var2.field3395[var3] = 0;
        }
        if (arg0 < 89) {
            field2826 = 53;
        }
    }
}
