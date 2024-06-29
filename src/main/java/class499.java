import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class499 extends class573 {

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "[I")
    private int[] field7101 = new int[3];

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    private int field7104 = 3216;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    private int field7109 = 4096;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    private int field7108 = 3216;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "[[B")
    public static byte[][] field7103 = new byte[50][];

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "Lja;")
    public static class254 field7107 = new class254(15, 0, 1, 0);

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "Ldw;")
    public static class669 field7112;

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class499() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field7106;
        if (arg1 != 1) {
            field7113 = 73;
        }
        int[] var3 = super.field8321.method3164(arg0, arg1 + -119);
        if (super.field8321.field7825) {
            int var4 = class613.field8922 * this.field7109 >> 12;
            int[] var5 = this.method3292(0, 0, arg0 + -1 & class189.field3019);
            int[] var6 = this.method3292(0, 0, arg0);
            int[] var7 = this.method3292(0, arg1 + -1, class189.field3019 & arg0 + 1);
            for (int var8 = 0; ~class540.field7555 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class591.field8492 & var8 + -1] + -var6[class591.field8492 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class98.field1763[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field7101[0] * var15 >> 12;
                int var18 = this.field7101[1] * var16 >> 12;
                int var19 = this.field7101[2] * var14 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)V")
    public static void method2976(byte arg0) {
        field7112 = null;
        if (arg0 <= 24) {
            method2977(82, -40, 7, 72, (class82) null);
        }
        field7107 = null;
        field7103 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIILps;)V")
    public static final void method2977(int arg0, int arg1, int arg2, int arg3, class82 arg4) {
        class370 var5 = class43.method570(arg0, arg1, arg2);
        if (var5 != null) {
            arg4.field9806 = (arg1 << class30.field940) + class271.field4068;
            arg4.field9809 = arg3;
            arg4.field9815 = (arg2 << class30.field940) + class271.field4068;
            if (var5.field5494 != null) {
                arg4.field9809 -= var5.field5494.field3319;
            }
            var5.field5495 = arg4;
            int var6 = class697.field9813 == class485.field6947 ? 1 : 0;
            if (arg4.method522((byte) -36)) {
                if (arg4.method524(36)) {
                    class368.field5462[var6][class43.field1090[var6]++] = arg4;
                    return;
                }
                class148.field2552[var6][class338.field5048[var6]++] = arg4;
                return;
            }
            class7.field513[var6][class575.field8353[var6]++] = arg4;
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)I")
    public static final int method2978(byte arg0) {
        ++field7114;
        return arg0 != 49 ? 5 : 16;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        ++field7110;
        this.method2979(-81);
        if (arg0 != 4095) {
            this.field7101 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field7111;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field7108 = arg0.method723((byte) -25);
                }
            } else {
                this.field7104 = arg0.method723((byte) -25);
            }
        } else {
            this.field7109 = arg0.method723((byte) -25);
        }
        if (arg2 != 3) {
            method2977(-80, 12, 25, -12, (class82) null);
        }
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)V")
    private final void method2979(int arg0) {
        ++field7102;
        double var2 = Math.cos((double) ((float) this.field7108 / 4096.0F));
        this.field7101[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field7104 / 4096.0F)));
        this.field7101[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field7104 / 4096.0F)));
        this.field7101[2] = (int) (Math.sin((double) ((float) this.field7108 / 4096.0F)) * 4096.0D);
        int var4 = this.field7101[0] * this.field7101[0] >> 12;
        int var5 = this.field7101[1] * this.field7101[1] >> 12;
        int var6 = 12 / ((arg0 - 27) / 43);
        int var7 = this.field7101[2] * this.field7101[2] >> 12;
        int var8 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var7 >> 12)));
        if (var8 != 0) {
            this.field7101[2] = (this.field7101[2] << 12) / var8;
            this.field7101[1] = (this.field7101[1] << 12) / var8;
            this.field7101[0] = (this.field7101[0] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
    public static final void method2980(int arg0, byte arg1) {
        ++field7105;
        class19 var2 = class373.method2355(71, arg0, 6);
        var2.method438(806);
        int var3 = 59 % ((-48 - arg1) / 62);
    }
}
