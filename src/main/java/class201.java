import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class201 extends class283 {

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    private int field3121 = 4096;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field3119 = 0;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "Lna;")
    public static class26 field3125 = class69.method505("leuchten1:", (byte) -123);

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "[I")
    public static int[] field3127 = new int[8];

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field3122 = 50;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "[I")
    public static int[] field3120 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "Lna;")
    public static class26 field3130 = class69.method505(":assistreq:", (byte) -122);

    @OriginalMember(owner = "client!pg", name = "fb", descriptor = "I")
    public static int field3132 = 50;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "[I")
    public static int[] field3129 = new int[field3132];

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "[I")
    public static int[] field3117 = new int[field3132];

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "[Lna;")
    public static class26[] field3116 = new class26[field3132];

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "Lna;")
    public static class26 field3123 = class69.method505(" loggt sich ein)3", (byte) -120);

    @OriginalMember(owner = "client!pg", name = "ib", descriptor = "Lna;")
    private static class26 field3135 = class69.method505("wave2:", (byte) -122);

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "Lna;")
    public static class26 field3124 = field3135;

    @OriginalMember(owner = "client!pg", name = "hb", descriptor = "Lna;")
    public static class26 field3134 = field3135;

    @OriginalMember(owner = "client!pg", name = "kb", descriptor = "[I")
    public static int[] field3137 = new int[field3132];

    @OriginalMember(owner = "client!pg", name = "eb", descriptor = "[I")
    public static int[] field3131 = new int[field3132];

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "[I")
    public static int[] field3126 = new int[field3132];

    @OriginalMember(owner = "client!pg", name = "lb", descriptor = "[I")
    public static int[] field3138 = new int[field3132];

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "[I")
    public static int[] field3118 = new int[field3132];

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!pg", name = "gb", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!pg", name = "jb", descriptor = "[[B")
    public static byte[][] field3136;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(B)V", line = 7)
    public static void method1361(byte arg0) {
        field3126 = null;
        field3138 = null;
        field3125 = null;
        field3116 = null;
        field3135 = null;
        field3127 = null;
        field3130 = null;
        field3123 = null;
        field3118 = null;
        field3136 = (byte[][]) null;
        field3129 = null;
        field3134 = null;
        field3137 = null;
        int var1 = -62 % ((-arg0 - 59) / 47);
        field3120 = null;
        field3117 = null;
        field3131 = null;
        field3124 = null;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 60)
    public class201() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)[I", line = 73)
    public final int[] method8(int arg0, byte arg1) {
        field3128++;
        int var3 = 42 / ((30 - arg1) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int[] var5 = this.method1990(0, arg0 - 1 & class210.field3268, 32755);
            int[] var6 = this.method1990(0, arg0, 32755);
            int[] var7 = this.method1990(0, class210.field3268 & arg0 + 1, 32755);
            for (int var8 = 0; var8 < class101.field1632; var8++) {
                int var9 = (var7[var8] - var5[var8]) * this.field3121;
                int var10 = (var6[class236.field3783 & var8 + 1] - var6[var8 - 1 & class236.field3783]) * this.field3121;
                int var11 = var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var14 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var16 = var15 == 0 ? 0 : 16777216 / var15;
                var4[var8] = 4096 - var16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILwa;Z)V", line = 125)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (!arg2) {
            method1361((byte) -57);
        }
        field3133++;
        if (arg0 == 0) {
            this.field3121 = arg1.method576(1);
        }
    }
}
