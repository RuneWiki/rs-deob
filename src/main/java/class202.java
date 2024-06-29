import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class202 extends class303 {

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    private int field3174 = 4096;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "Z")
    private boolean field3182 = true;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field3178 = -1;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3181 = "";

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "Lja;")
    public static class64 field3175;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "[I")
    public static int[] field3179;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZIIIZBI)V", line = 4)
    public static final void method1463(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        if (arg5 != 36) {
            method1463(false, 36, 71, 92, true, (byte) 21, -9);
        }
        if (arg6 > arg2) {
            int var7 = (arg2 + arg6) / 2;
            int var8 = arg2;
            class120 var9 = class13.field248[var7];
            class13.field248[var7] = class13.field248[arg6];
            class13.field248[arg6] = var9;
            for (int var10 = arg2; var10 < arg6; var10++) {
                if (class71.method548(arg0, class13.field248[var10], arg5 ^ 0xFFFFFFCA, arg1, arg3, var9, arg4) <= 0) {
                    class120 var11 = class13.field248[var10];
                    class13.field248[var10] = class13.field248[var8];
                    class13.field248[var8++] = var11;
                }
            }
            class13.field248[arg6] = class13.field248[var8];
            class13.field248[var8] = var9;
            method1463(arg0, arg1, arg2, arg3, arg4, (byte) 36, var8 - 1);
            method1463(arg0, arg1, var8 + 1, arg3, arg4, (byte) 36, arg6);
        }
        field3180++;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 68)
    public class202() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V", line = 55)
    public static void method1464(int arg0) {
        if (arg0 != -8446) {
            field3179 = (int[]) null;
        }
        field3175 = null;
        field3181 = null;
        field3179 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[[I", line = 83)
    public final int[][] method74(int arg0, int arg1) {
        field3177++;
        int[][] var3 = this.field4772.method1175(arg1 ^ 0xFFFFFFF7, arg0);
        if (this.field4772.field2488) {
            int[] var4 = this.method2107(class12.field240 & arg0 - 1, 0, 0);
            int[] var5 = this.method2107(arg0, 0, 0);
            int[] var6 = this.method2107(arg0 + 1 & class12.field240, 0, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; var10 < class70.field1108; var10++) {
                int var11 = (var5[var10 + 1 & class40.field724] - var5[class40.field724 & var10 - 1]) * this.field3174;
                int var12 = (var6[var10] - var4[var10]) * this.field3174;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = 16777216 / var17;
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                }
                if (this.field3182) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var18;
                var9[var10] = var19;
                var8[var10] = var20;
            }
        }
        if (arg1 != 82) {
            field3179 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILpe;I)V", line = 179)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3174 = arg1.method731(false);
        } else if (arg2 == 1) {
            this.field3182 = arg1.method741(111) == 1;
        }
        field3176++;
        if (arg0 != -4004) {
            field3175 = (class64) null;
        }
    }
}
