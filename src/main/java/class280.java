import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class280 extends class21 {

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    private int field4306 = 409;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    private int field4311 = 4096;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    private int field4309 = 4096;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    private int field4313 = 4096;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "[I")
    private int[] field4318 = new int[3];

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field4310 = 50;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field4304 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    public static int field4312 = 0;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "I")
    public static int field4315 = -1;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
    public static int field4317 = 0;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "Lab;")
    public static class279 field4308 = new class279(64);

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V", line = 9)
    public static void method1886(int arg0) {
        int var1 = 17 / ((-arg0 - 1) / 54);
        field4304 = null;
        field4308 = null;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(ZI)Lkh;", line = 18)
    public static final class165 method1887(boolean arg0, int arg1) {
        field4307++;
        class165 var2 = (class165) class219.field3474.method2367((long) arg1, -12270);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class260.field4067.method2036(5, arg1, (byte) 28);
        class165 var4 = new class165();
        if (!arg0) {
            field4310 = 105;
        }
        if (var3 != null) {
            var4.method1057(new class202(var3), -103);
        }
        class219.field3474.method2369((long) arg1, -28759, var4);
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)[[I", line = 45)
    public final int[][] method175(int arg0, byte arg1) {
        if (arg1 < 16) {
            field4312 = -90;
        }
        int[][] var3 = this.field441.method220(arg0, 17433);
        field4316++;
        if (this.field441.field532) {
            int[][] var4 = this.method173(0, arg0, (byte) 95);
            int[] var5 = var4[2];
            int[] var6 = var3[1];
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class294.field4489; var11++) {
                int var12 = var7[var11];
                int var13 = var12 - this.field4318[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field4306 >= var13) {
                    int var14 = var8[var11];
                    int var15 = var14 - this.field4318[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field4306 < var15) {
                        var10[var11] = var12;
                        var6[var11] = var14;
                        var9[var11] = var5[var11];
                    } else {
                        int var16 = var5[var11];
                        int var17 = var16 - this.field4318[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 <= this.field4306) {
                            var10[var11] = this.field4309 * var12 >> 12;
                            var6[var11] = this.field4313 * var14 >> 12;
                            var9[var11] = this.field4311 * var16 >> 12;
                        } else {
                            var10[var11] = var12;
                            var6[var11] = var14;
                            var9[var11] = var16;
                        }
                    }
                } else {
                    var10[var11] = var12;
                    var6[var11] = var8[var11];
                    var9[var11] = var5[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIII)V", line = 137)
    public static final void method1888(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class241.method1598(arg5, -7, class155.field2522[arg2], arg1 + arg4, -arg1 + arg4);
        field4314++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg0 * arg0;
        int var9 = var8 << 1;
        int var10 = arg1 * arg1;
        int var11 = arg0 << 1;
        int var12 = (1 - var11) * var10 + var9;
        int var13 = var10 << 1;
        int var14 = var8 - (var11 - 1) * var13;
        int var15 = 95 % ((26 - arg3) / 63);
        int var16 = var10 << 2;
        int var17 = ((var6 << 1) + 3) * var9;
        int var18 = ((arg0 << 1) - 3) * var13;
        int var19 = var8 << 2;
        int var20 = (var6 + 1) * var19;
        int var21 = (arg0 - 1) * var16;
        while (var7 > 0) {
            var7--;
            if (var12 < 0) {
                while (var12 < 0) {
                    var12 += var17;
                    var6++;
                    var14 += var20;
                    var17 += var19;
                    var20 += var19;
                }
            }
            int var22 = arg2 - var7;
            if (var14 < 0) {
                var6++;
                var12 += var17;
                var17 += var19;
                var14 += var20;
                var20 += var19;
            }
            int var23 = arg2 + var7;
            var12 += -var21;
            var21 -= var16;
            int var24 = arg4 + var6;
            var14 += -var18;
            var18 -= var16;
            int var25 = arg4 - var6;
            class241.method1598(arg5, -7, class155.field2522[var22], var24, var25);
            class241.method1598(arg5, -7, class155.field2522[var23], var24, var25);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILag;)V", line = 220)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field4305++;
        if (arg0 != -318) {
            field4308 = (class279) null;
        }
        if (arg1 == 0) {
            this.field4306 = arg2.method1315(arg0 + 14607);
        } else if (arg1 == 1) {
            this.field4311 = arg2.method1315(14289);
        } else if (arg1 == 2) {
            this.field4313 = arg2.method1315(14289);
        } else if (arg1 == 3) {
            this.field4309 = arg2.method1315(14289);
        } else if (arg1 == 4) {
            int var5 = arg2.method1352((byte) 127);
            this.field4318[2] = class61.method475(var5 >> 12, 0);
            this.field4318[1] = class61.method475(var5 >> 4, 4080);
            this.field4318[0] = class61.method475(var5 << 4, 267386880);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 288)
    public class280() {
        super(1, false);
    }
}
