import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class65 extends class264 {

    @OriginalMember(owner = "client!gg", name = "fb", descriptor = "Z")
    private boolean field1014 = true;

    @OriginalMember(owner = "client!gg", name = "ib", descriptor = "I")
    private int field1017 = 4096;

    @OriginalMember(owner = "client!gg", name = "kb", descriptor = "Lnb;")
    public static class117 field1019 = new class117();

    @OriginalMember(owner = "client!gg", name = "lb", descriptor = "I")
    public static int field1020 = 0;

    @OriginalMember(owner = "client!gg", name = "mb", descriptor = "[I")
    public static int[] field1021 = new int[4096];

    @OriginalMember(owner = "client!gg", name = "nb", descriptor = "Lma;")
    public static class5 field1022 = class12.method119("null", (byte) 60);

    @OriginalMember(owner = "client!gg", name = "ob", descriptor = "I")
    public static int field1023 = -1;

    @OriginalMember(owner = "client!gg", name = "pb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1024 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!gg", name = "qb", descriptor = "I")
    public static int field1025 = 0;

    @OriginalMember(owner = "client!gg", name = "gb", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!gg", name = "hb", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!gg", name = "jb", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!gg", name = "rb", descriptor = "Lrj;")
    public static class237 field1026;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(BI)[[I", line = 8)
    public final int[][] method138(byte arg0, int arg1) {
        int[][] var3 = this.field4524.method1462(-15077, arg1);
        field1015++;
        if (this.field4524.field3506) {
            int[] var4 = this.method1815(0, arg1 - 1 & class68.field1082, 115);
            int[] var5 = this.method1815(0, arg1, -107);
            int[] var6 = this.method1815(0, arg1 + 1 & class68.field1082, -93);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class226.field3716; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field1017;
                int var12 = (var5[class256.field4370 & var10 + 1] - var5[class256.field4370 & var10 - 1]) * this.field1017;
                int var13 = var12 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var11 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + var14 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var20 = 0;
                    var19 = 0;
                    var18 = 0;
                } else {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                }
                if (this.field1014) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var10] = var18;
                var7[var10] = var19;
                var9[var10] = var20;
            }
        }
        int var21 = 42 % ((arg0 + 43) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILii;)V", line = 96)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg0 == 0) {
            this.field1017 = arg2.method1524((byte) 75);
        } else if (arg0 == 1) {
            this.field1014 = arg2.method1509(true) == 1;
        }
        if (arg1 >= -27) {
            this.method138((byte) -69, -97);
        }
        field1016++;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)V", line = 125)
    public static void method467(byte arg0) {
        field1026 = null;
        field1021 = null;
        field1019 = null;
        field1022 = null;
        if (arg0 != 38) {
            method468(true, (class221) null);
        }
        field1024 = null;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 145)
    public class65() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLii;)Lcg;", line = 153)
    public static final class52 method468(boolean arg0, class221 arg1) {
        if (!arg0) {
            method467((byte) 79);
        }
        field1018++;
        return new class52(arg1.method1505(-125), arg1.method1505(0), arg1.method1505(91), arg1.method1505(-57), arg1.method1497(3610), arg1.method1509(true));
    }
}
