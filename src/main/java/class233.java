import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class233 extends class306 {

    @OriginalMember(owner = "client!eo", name = "L", descriptor = "I")
    private int field3521 = 4096;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "Z")
    private boolean field3520 = true;

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3523 = "Loaded defaults";

    @OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
    public static int field3522 = 0;

    @OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!eo", name = "O", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!eo", name = "P", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!eo", name = "Q", descriptor = "Lgj;")
    public static class257 field3526;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIILcf;ILhi;I)V", line = 4)
    public static final void method1608(int arg0, int arg1, int arg2, class149 arg3, int arg4, class323 arg5, int arg6) {
        field3518++;
        if (arg3 == null) {
            return;
        }
        int var7 = (int) class190.field2855 + class132.field1912 & 0x7FF;
        if (arg1 != -1) {
            return;
        }
        int var8 = Math.max(arg5.field5169 / 2, arg5.field5174 / 2) + 10;
        int var9 = arg4 * arg4 + (arg0 * arg0);
        if ((var8 * var8) < var9) {
            return;
        }
        int var10 = class104.field1426[var7];
        int var11 = var10 * 256 / (class67.field831 + 256);
        int var12 = class104.field1435[var7];
        int var13 = var12 * 256 / (class67.field831 + 256);
        int var14 = arg0 * var13 - (arg4 * var11) >> 16;
        int var15 = arg0 * var11 + arg4 * var13 >> 16;
        if (class272.field4317) {
            ((class217) arg3).method1511(arg5.field5169 / 2 + arg2 + var15 - (arg3.field2369 / 2), arg5.field5174 / 2 + -var14 + arg6 - arg3.field2360 / 2, (class200) arg5.method2249(100, false));
        } else {
            ((class270) arg3).method1910(arg5.field5169 / 2 + var15 + arg2 - (arg3.field2369 / 2), arg5.field5174 / 2 + -var14 + -(arg3.field2360 / 2) + arg6, arg5.field5175, arg5.field5093);
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V", line = 41)
    public class233() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "(B)V", line = 49)
    public static void method1609(byte arg0) {
        field3523 = null;
        int var1 = 103 % ((49 - arg0) / 59);
        field3526 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILlf;I)V", line = 60)
    public final void method45(int arg0, class143 arg1, int arg2) {
        field3524++;
        if (arg2 == 0) {
            this.field3521 = arg1.method1051(1);
        } else if (arg2 == 1) {
            this.field3520 = arg1.method1043(true) == 1;
        }
        if (arg0 != -15334) {
            field3526 = (class257) null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IB)[[I", line = 105)
    public final int[][] method681(int arg0, byte arg1) {
        field3517++;
        if (arg1 != -119) {
            method1608(49, 49, 94, (class149) null, -107, (class323) null, 5);
        }
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (this.field4752.field4179) {
            int[] var4 = this.method2161(class56.field663 & arg0 - 1, (byte) 116, 0);
            int[] var5 = this.method2161(arg0, (byte) 127, 0);
            int[] var6 = this.method2161(arg0 + 1 & class56.field663, (byte) 116, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; var10 < class31.field367; var10++) {
                int var11 = (var5[class311.field4878 & var10 + 1] - var5[var10 - 1 & class311.field4878]) * this.field3521;
                int var12 = var11 >> 12;
                int var13 = (var6[var10] - var4[var10]) * this.field3521;
                int var14 = var12 * var12 >> 12;
                int var15 = var13 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var14 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var19 = 0;
                    var18 = 0;
                    var20 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                    var20 = var13 / var17;
                }
                if (this.field3520) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var19;
                var9[var10] = var20;
                var8[var10] = var18;
            }
        }
        return var3;
    }
}
