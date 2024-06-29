import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class141 extends class313 {

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "[I")
    private int[] field2582 = new int[3];

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    private int field2587 = 3216;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
    private int field2596 = 4096;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    private int field2588 = 3216;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "Lc;")
    public static class331 field2589 = new class331();

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2593 = "glow2:";

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "C")
    public static char field2583;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "(I)V", line = 7)
    private final void method1142(int arg0) {
        double var2 = Math.cos((double) ((float) this.field2588 / 4096.0F));
        this.field2582[0] = (int) (Math.sin((double) ((float) this.field2587 / 4096.0F)) * var2 * 4096.0D);
        this.field2582[1] = (int) (var2 * 4096.0D * Math.cos((double) ((float) this.field2587 / 4096.0F)));
        field2586++;
        this.field2582[2] = (int) (Math.sin((double) ((float) this.field2588 / 4096.0F)) * 4096.0D);
        int var4 = this.field2582[1] * this.field2582[1] >> 12;
        int var5 = this.field2582[0] * this.field2582[0] >> 12;
        int var6 = this.field2582[2] * this.field2582[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field2582[0] = (this.field2582[0] << 12) / var7;
            this.field2582[2] = (this.field2582[2] << 12) / var7;
            this.field2582[1] = (this.field2582[1] << 12) / var7;
        }
        if (arg0 != -1943) {
            method1143(89);
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)[I", line = 43)
    public final int[] method111(int arg0, int arg1) {
        field2594++;
        if (arg0 != 4) {
            this.field2588 = -75;
        }
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int var4 = class356.field5620 * this.field2596 >> 12;
            int[] var5 = this.method2156(0, true, arg1 - 1 & class132.field2262);
            int[] var6 = this.method2156(0, true, arg1);
            int[] var7 = this.method2156(0, true, arg1 + 1 & class132.field2262);
            for (int var8 = 0; var8 < class133.field2269; var8++) {
                int var9 = (var6[var8 - 1 & class297.field4731] - var6[var8 + 1 & class297.field4731]) * var4 >> 12;
                int var10 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class230.field3838[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = this.field2582[2] * var14 >> 12;
                int var16 = var10 * var13 >> 8;
                int var17 = var9 * var13 >> 8;
                int var18 = this.field2582[1] * var16 >> 12;
                int var19 = this.field2582[0] * var17 >> 12;
                var3[var8] = var18 + var19 + var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "(I)V", line = 115)
    public static void method1143(int arg0) {
        if (arg0 != -2) {
            method1143(25);
        }
        field2593 = null;
        field2589 = null;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V", line = 145)
    public class141() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II[II[I)V", line = 155)
    public static final void method1144(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        if (arg1 < arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg1;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            for (int var9 = arg1; var9 < arg3; var9++) {
                if (arg2[var9] > var7 + (var9 & 0x1)) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method1144(2, arg1, arg2, var6 - 1, arg4);
            method1144(arg0, var6 + 1, arg2, arg3, arg4);
        }
        field2585++;
        if (arg0 != 2) {
            method1143(-21);
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V", line = 214)
    public final void method182(int arg0) {
        if (arg0 != 25833) {
            this.method185(81, -90, (class336) null);
        }
        this.method1142(-1943);
        field2584++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILpi;)V", line = 238)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg0 == 0) {
            this.field2596 = arg2.method2339((byte) -46);
        } else if (arg0 == 1) {
            this.field2587 = arg2.method2339((byte) -46);
        } else if (arg0 == 2) {
            this.field2588 = arg2.method2339((byte) -46);
        }
        if (arg1 != -17848) {
            this.method1142(-54);
        }
        field2595++;
    }
}
