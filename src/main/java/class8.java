import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class8 extends class179 {

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "I")
    public static int field129 = 0;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "J")
    public static long field124 = 0L;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "Lke;")
    public static class256 field122 = class316.method2202("null", 27626);

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "Lke;")
    public static class256 field125 = class316.method2202("Kampfstufe: ", 27626);

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "Lke;")
    public static class256 field130 = null;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    public static int field127 = 0;

    @OriginalMember(owner = "client!qk", name = "cb", descriptor = "Lke;")
    public static class256 field132 = class316.method2202("::mm", 27626);

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!qk", name = "bb", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!qk", name = "db", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "Lrd;")
    public static class135 field120;

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 7)
    public class8() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "(I)V", line = 12)
    public static void method53(int arg0) {
        field125 = null;
        field122 = null;
        field130 = null;
        field132 = null;
        if (arg0 == 0) {
            field120 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILra;I)V", line = 43)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg0 > 108) {
            if (arg2 == 0) {
                this.field3153 = arg1.method357(false) == 1;
            }
            field126++;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)[[I", line = 70)
    public final int[][] method55(int arg0, int arg1) {
        if (arg0 != 75) {
            return (int[][]) ((int[][]) null);
        }
        field131++;
        int[][] var3 = this.field3169.method463(arg1, 1);
        if (this.field3169.field1080) {
            int[][] var4 = this.method1314(arg1, 158, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class161.field2858; var11++) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lrj;Lqg;B)Lgf;", line = 117)
    public static final class113 method56(class254 arg0, class192 arg1, byte arg2) {
        if (arg2 < 94) {
            method53(-8);
        }
        field128++;
        long var3 = ((long) arg1.field3504 << 56) - (-((long) arg1.field3512 << 32) - (long) ((arg1.field3522 + 1 << 16) + arg1.field3513));
        class113 var5 = (class113) arg0.method1744((byte) 127, var3);
        if (var5 == null) {
            var5 = new class113(arg1.field3522, (float) arg1.field3513, true, false, arg1.field3512);
            arg0.method1749(true, var5, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILng;)I", line = 150)
    public static final int method57(int arg0, class138 arg1) {
        int var2 = 0;
        if (arg1.method1011(class91.field1660, -23605)) {
            var2++;
        }
        field121++;
        if (arg1.method1011(class194.field3539, -23605)) {
            var2++;
        }
        int var3 = 18 / ((arg0 + 59) / 36);
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I", line = 176)
    public final int[] method41(int arg0, int arg1) {
        field123++;
        if (arg1 != -31598) {
            field125 = (class256) null;
        }
        int[] var3 = this.field3157.method1258(arg1 ^ 0x7B30, arg0);
        if (this.field3157.field3081) {
            int[] var4 = this.method1312(0, arg0, (byte) -45);
            for (int var5 = 0; var5 < class161.field2858; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }
}
