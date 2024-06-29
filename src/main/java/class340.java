import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class340 extends class40 {

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "[I")
    private int[] field4914 = new int[3];

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    private int field4921 = 3216;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    private int field4913 = 3216;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    private int field4916 = 4096;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "[Z")
    public static boolean[] field4920 = new boolean[8];

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "Llm;")
    public static class291 field4919 = new class291(64);

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    public static int field4923 = -1;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field4924 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field4915;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field4921 = arg2.method798(false);
                }
            } else {
                this.field4913 = arg2.method798(false);
            }
        } else {
            this.field4916 = arg2.method798(false);
        }
        if (arg1 < 79) {
            this.method44((byte) 72, -117);
        }
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(B)V")
    public final void method39(byte arg0) {
        if (arg0 != -23) {
            field4924 = null;
        }
        ++field4917;
        this.method2235((byte) -67);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        ++field4918;
        if (arg0 >= -20) {
            this.method43(-3, 88, (class130) null);
        }
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            int var4 = class370.field5259 * this.field4916 >> 12;
            int[] var5 = this.method266((byte) -116, arg1 - 1 & class169.field2395, 0);
            int[] var6 = this.method266((byte) -116, arg1, 0);
            int[] var7 = this.method266((byte) -116, class169.field2395 & arg1 + 1, 0);
            for (int var8 = 0; var8 < class410.field5886; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class84.field1067 & var8 + -1] + -var6[var8 - -1 & class84.field1067]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class393.field5529[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field4914[1] * var16 >> 12;
                int var18 = this.field4914[2] * var14 >> 12;
                int var19 = this.field4914[0] * var15 >> 12;
                var3[var8] = var19 - -var18 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public static final void method2233(int arg0) {
        class180.field2546 = arg0;
        for (int var1 = 0; var1 < class394.field5548; ++var1) {
            for (int var2 = 0; var2 < class407.field5751; ++var2) {
                if (class385.field5449[arg0][var1][var2] == null) {
                    class385.field5449[arg0][var1][var2] = new class74(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
    public static void method2234(int arg0) {
        field4920 = null;
        if (arg0 != 0) {
            method2233(-105);
        }
        field4924 = null;
        field4919 = null;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class340() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "(B)V")
    private final void method2235(byte arg0) {
        ++field4912;
        double var2 = Math.cos((double) ((float) this.field4921 / 4096.0F));
        this.field4914[0] = (int) (var2 * Math.sin((double) ((float) this.field4913 / 4096.0F)) * 4096.0D);
        this.field4914[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field4913 / 4096.0F)));
        this.field4914[2] = (int) (Math.sin((double) ((float) this.field4921 / 4096.0F)) * 4096.0D);
        if (arg0 != -67) {
            this.field4914 = null;
        }
        int var4 = this.field4914[0] * this.field4914[0] >> 12;
        int var5 = this.field4914[1] * this.field4914[1] >> 12;
        int var6 = this.field4914[2] * this.field4914[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field4914[0] = (this.field4914[0] << 12) / var7;
            this.field4914[2] = (this.field4914[2] << 12) / var7;
            this.field4914[1] = (this.field4914[1] << 12) / var7;
        }
    }
}
