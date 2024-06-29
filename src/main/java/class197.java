import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class197 extends class62 {

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    private int field2912 = 4096;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Z")
    private boolean field2913 = true;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "[[I")
    public static int[][] field2902 = new int[6][];

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field2907 = -1;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "Lsl;")
    public static class391 field2905 = new class391("", 10);

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)V")
    public static final void method1324(int arg0) {
        class487.field6920.method2800(arg0 ^ arg0);
        ++field2906;
    }

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "(I)V")
    public static void method1325(int arg0) {
        field2905 = null;
        if (arg0 != 4096) {
            field2905 = null;
        }
        field2902 = null;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class197() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lqa;III)V")
    public static final void method1326(class208 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 2) {
            field2907 = 118;
        }
        class491.field6998 = new class261[arg3][arg1];
        ++field2904;
        class58.field738 = arg0;
        if (class276.field3882 != null) {
            class26.field280 = class404.method2375(class276.field3882[2], class276.field3882[5], (byte) -126, class276.field3882[3], class276.field3882[0], class276.field3882[1], class276.field3882[4]);
        }
        class84.field1197 = new class261();
        class255.method1637(0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1327(String arg0, int arg1) {
        ++field2909;
        return arg1 > -39 ? 48 : class528.method3187(true, 10, arg0, (byte) -106);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)[[I")
    public final int[][] method409(int arg0, byte arg1) {
        if (arg1 > -20) {
            method1327((String) null, 52);
        }
        ++field2908;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (super.field772.field6899) {
            int[] var4 = this.method408(arg0 + -1 & class285.field3989, 0, (byte) -69);
            int[] var5 = this.method408(arg0, 0, (byte) -69);
            int[] var6 = this.method408(class285.field3989 & arg0 - -1, 0, (byte) -69);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class438.field5847; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2912;
                int var12 = (var5[class410.field5604 & var10 + 1] + -var5[var10 + -1 & class410.field5604]) * this.field2912;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)));
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
                if (this.field2913) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 14157) {
            field2905 = null;
        }
        if (class14.field136 <= -arg5 + arg2 && class130.field1801 >= arg2 - -arg5 && ~class3.field25 >= ~(-arg5 + arg4) && ~(arg4 + arg5) >= ~class100.field1452) {
            class624.method3647(arg6, arg4, arg0, arg5, 0, arg2, arg1);
        } else {
            class405.method2386(arg4, arg2, arg0, arg3 ^ -14135, arg6, arg1, arg5);
        }
        ++field2910;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            if (arg2 != 0) {
                if (arg2 == 1) {
                    this.field2913 = arg0.method1032((byte) -33) == 1;
                }
            } else {
                this.field2912 = arg0.method1045(true);
            }
            ++field2903;
        }
    }
}
