import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class201 extends class317 {

    @OriginalMember(owner = "client!f", name = "K", descriptor = "Z")
    private boolean field2854 = true;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "Z")
    private boolean field2861 = true;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field2858 = 0;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public static int field2856 = 0;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field2863 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "[Lhn;")
    public static class271[] field2855 = new class271[29];

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "[I")
    public static int[] field2862;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "[Luj;")
    public static class209[] field2865;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(B)V", line = 6)
    public static void method1430(byte arg0) {
        if (arg0 >= -127) {
            field2855 = (class271[]) null;
        }
        field2865 = null;
        field2862 = null;
        field2855 = null;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)[I", line = 18)
    public final int[] method140(int arg0, int arg1) {
        field2864++;
        if (arg0 != 542) {
            field2855 = (class271[]) null;
        }
        int[] var3 = this.field4847.method1387(arg1, (byte) -52);
        if (this.field4847.field2751) {
            int[] var4 = this.method2225((byte) 66, 0, this.field2861 ? class202.field2889 - arg1 : arg1);
            if (this.field2854) {
                for (int var5 = 0; var5 < class326.field4933; var5++) {
                    var3[var5] = var4[class246.field3548 - var5];
                }
            } else {
                class281.method1940(var4, 0, var3, 0, class326.field4933);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V", line = 59)
    public static final void method1431(int arg0) {
        class13.field139.method724(0);
        if (arg0 < 80) {
            field2855 = (class271[]) null;
        }
        class106.field1430.method724(0);
        class333.field5014.method724(0);
        field2860++;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 73)
    public class201() {
        super(1, false);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lcg;II)V", line = 91)
    public final void method60(class316 arg0, int arg1, int arg2) {
        int var4 = 121 / ((arg1 + 17) / 40);
        if (arg2 == 0) {
            this.field2854 = arg0.method2219(16448) == 1;
        } else if (arg2 == 1) {
            this.field2861 = arg0.method2219(16448) == 1;
        } else if (arg2 == 2) {
            this.field4835 = arg0.method2219(16448) == 1;
        }
        field2859++;
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(B)I", line = 155)
    public static final int method1432(byte arg0) {
        field2853++;
        if (arg0 != -43) {
            field2862 = (int[]) null;
        }
        if (class337.field5072) {
            return 0;
        } else if (class154.method1113(-105)) {
            return class70.field953 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[[I", line = 178)
    public final int[][] method53(int arg0, int arg1) {
        field2857++;
        int[][] var3 = this.field4840.method1625(arg1, -13241);
        int var4 = -87 / ((arg0 + 31) / 37);
        if (this.field4840.field3352) {
            int[][] var5 = this.method2227(0, 51, this.field2861 ? class202.field2889 - arg1 : arg1);
            int[] var6 = var5[0];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[2];
            int[] var10 = var3[2];
            int[] var11 = var5[1];
            if (this.field2854) {
                for (int var12 = 0; var12 < class326.field4933; var12++) {
                    var7[var12] = var6[class246.field3548 - var12];
                    var8[var12] = var11[class246.field3548 - var12];
                    var10[var12] = var9[class246.field3548 - var12];
                }
            } else {
                for (int var13 = 0; var13 < class326.field4933; var13++) {
                    var7[var13] = var6[var13];
                    var8[var13] = var11[var13];
                    var10[var13] = var9[var13];
                }
            }
        }
        return var3;
    }
}
