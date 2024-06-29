import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class280 extends class87 {

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    private int field4515 = 3216;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "[I")
    private int[] field4522 = new int[3];

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    private int field4513 = 3216;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    private int field4514 = 4096;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field4510 = 0;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "Ljava/lang/String;")
    public static String field4519 = "K";

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4508 = "Please remove ";

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "F")
    public static float field4521 = 0.0F;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "[[B")
    public static byte[][] field4506;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
    public static final void method1938(int arg0) {
        if (arg0 > -70) {
            method1941(false);
        }
        ++field4507;
        for (int var1 = 0; ~class284.field4574 < ~var1; ++var1) {
            int var2 = class48.field670[var1];
            class207 var3 = class92.field1475[var2];
            int var4 = class92.field1488.method366(-16505);
            if ((var4 & 128) != 0) {
                var4 += class92.field1488.method366(-16505) << 8;
            }
            class41.method258(var3, var4, (byte) -98, var2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class280() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)J")
    public static final long method1939(boolean arg0) {
        ++field4512;
        return !arg0 ? 119L : class248.field3656.method125(false);
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        ++field4518;
        if (arg0 != 0) {
            this.field4514 = 85;
        }
        this.method1940(1);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field4515 = arg0.method331(-49);
                }
            } else {
                this.field4513 = arg0.method331(-100);
            }
        } else {
            this.field4514 = arg0.method331(-9);
        }
        if (arg2 != 25645) {
            method1939(false);
        }
        ++field4511;
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
    private final void method1940(int arg0) {
        ++field4523;
        double var2 = Math.cos((double) ((float) this.field4515 / 4096.0F));
        this.field4522[0] = (int) (Math.sin((double) ((float) this.field4513 / 4096.0F)) * var2 * 4096.0D);
        this.field4522[arg0] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field4513 / 4096.0F)));
        this.field4522[2] = (int) (Math.sin((double) ((float) this.field4515 / 4096.0F)) * 4096.0D);
        int var4 = this.field4522[0] * this.field4522[0] >> 12;
        int var5 = this.field4522[1] * this.field4522[1] >> 12;
        int var6 = this.field4522[2] * this.field4522[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 - -var5 - -var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field4522[2] = (this.field4522[2] << 12) / var7;
            this.field4522[0] = (this.field4522[0] << 12) / var7;
            this.field4522[1] = (this.field4522[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field4516;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int var4 = class218.field3188 * this.field4514 >> 12;
            int[] var5 = this.method642(0, class32.field406 & arg0 + -1, true);
            int[] var6 = this.method642(0, arg0, true);
            int[] var7 = this.method642(0, arg0 + 1 & class32.field406, !arg1);
            for (int var8 = 0; ~class206.field3032 < ~var8; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class181.field2722 & var8 - 1] - var6[class181.field2722 & var8 + 1]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var10 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & client.field1968[var12 - -((var11 + 1) * var11 >> 1)];
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = this.field4522[1] * var15 >> 12;
                int var17 = this.field4522[0] * var14 >> 12;
                int var18 = var13 * 4096 >> 8;
                int var19 = this.field4522[2] * var18 >> 12;
                var3[var8] = var16 - -var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
    public static void method1941(boolean arg0) {
        field4519 = null;
        if (arg0) {
            method1941(true);
        }
        field4508 = null;
        field4506 = null;
    }
}
