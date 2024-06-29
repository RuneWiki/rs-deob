import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class270 extends class219 {

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    private int field4509 = 4;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    private int field4507 = 4;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "Lbd;")
    public static class162 field4513 = class17.method142(0, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "Lqb;")
    public static class209 field4508 = new class209(64);

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "Z")
    public static boolean field4514 = true;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "[I")
    public static int[] field4518 = new int[50];

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "[I")
    public static int[] field4516 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "Lbd;")
    public static class162 field4519 = class17.method142(0, "Wordpack geladen)3");

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "[Ldj;")
    public static class39[] field4520 = new class39[2048];

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "[I")
    public static int[] field4521 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 4)
    public class270() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(III)I", line = 9)
    public static final int method1845(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field4518 = (int[]) null;
        }
        int var3 = arg1 >> 31 & arg2 - 1;
        field4512++;
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)[I", line = 23)
    public final int[] method41(boolean arg0, int arg1) {
        field4517++;
        if (!arg0) {
            method1846((class94) null, 21);
        }
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int var4 = class128.field2326 / this.field4509;
            int var5 = class47.field749 / this.field4507;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1585(0, class47.field749 * var6 / var5, -6606);
            } else {
                var7 = this.method1585(0, 0, -6606);
            }
            for (int var8 = 0; var8 < class128.field2326; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class128.field2326 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[[I", line = 79)
    public final int[][] method219(int arg0, byte arg1) {
        field4506++;
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int var4 = class47.field749 / this.field4507;
            int var5 = class128.field2326 / this.field4509;
            int[][] var6;
            if (var4 <= 0) {
                var6 = this.method1583(0, true, 0);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method1583(class47.field749 * var7 / var4, true, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[2];
            int[] var10 = var6[1];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class128.field2326; var14++) {
                int var16;
                if (var5 > 0) {
                    int var15 = var14 % var5;
                    var16 = class128.field2326 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var10[var16];
                var13[var14] = var9[var16];
            }
        }
        return arg1 == 83 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lb;I)Loi;", line = 147)
    public static final class62 method1846(class94 arg0, int arg1) {
        if (arg1 >= -117) {
            return (class62) null;
        } else {
            field4515++;
            return new class62(arg0.method750((byte) -24), arg0.method750((byte) -24), arg0.method750((byte) -24), arg0.method750((byte) -24), arg0.method750((byte) -24), arg0.method750((byte) -24), arg0.method750((byte) -24), arg0.method750((byte) -24), arg0.method732(-1), arg0.method756(915905888));
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V", line = 162)
    public static final void method1847(byte arg0) {
        class217.field3620 = -3;
        class297.field4973 = -1;
        class88.field1570 = 0;
        if (arg0 != -16) {
            field4518 = (int[]) null;
        }
        field4510++;
        class179.field3063 = 0;
        class163.field2890 = false;
        class49.field780 = 0;
        class131.field2364 = 1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILb;)V", line = 187)
    public final void method42(int arg0, int arg1, class94 arg2) {
        field4511++;
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 0) {
            this.field4509 = arg2.method756(arg1 ^ 0x36979D60);
        } else if (arg0 == 1) {
            this.field4507 = arg2.method756(915905888);
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V", line = 232)
    public static void method1848(int arg0) {
        if (arg0 > -10) {
            field4520 = (class39[]) null;
        }
        field4519 = null;
        field4520 = null;
        field4508 = null;
        field4521 = null;
        field4518 = null;
        field4516 = null;
        field4513 = null;
    }
}
