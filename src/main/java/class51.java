import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class51 extends class86 {

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    private int field789 = 3216;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
    private int field793 = 4096;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "[I")
    private int[] field794 = new int[3];

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    private int field788 = 3216;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "[I")
    public static int[] field787 = new int[256];

    @OriginalMember(owner = "client!lm", name = "W", descriptor = "[I")
    public static int[] field799 = new int[128];

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!lm", name = "T", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!lm", name = "U", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!lm", name = "V", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)V", line = 7)
    public static void method484(int arg0) {
        if (arg0 != -28005) {
            field799 = (int[]) null;
        }
        field787 = null;
        field799 = null;
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(II)V", line = 18)
    public static final void method485(int arg0, int arg1) {
        if (arg1 == 7203) {
            class186.field2905.method649((byte) 75, arg0);
            field790++;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)[I", line = 30)
    public final int[] method158(int arg0, int arg1) {
        field791++;
        int[] var3 = this.field1225.method1914(arg0, -126);
        if (arg1 <= 7) {
            method484(28);
        }
        if (this.field1225.field3995) {
            int var4 = class212.field3338 * this.field793 >> 12;
            int[] var5 = this.method774(0, arg0 - 1 & class280.field4324, 0);
            int[] var6 = this.method774(0, arg0, 0);
            int[] var7 = this.method774(0, arg0 + 1 & class280.field4324, 0);
            for (int var8 = 0; var8 < class93.field1424; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class313.field4848] - var6[class313.field4848 & var8 + 1]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var10 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class343.field5445[((var11 + 1) * var11 >> 1) + var12] & 0xFF;
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = this.field794[0] * var14 >> 12;
                int var17 = this.field794[2] * var15 >> 12;
                int var18 = var9 * var13 >> 8;
                int var19 = this.field794[1] * var18 >> 12;
                var3[var8] = var16 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZLug;)V", line = 118)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg0 == 0) {
            this.field793 = arg2.method314((byte) 116);
        } else if (arg0 == 1) {
            this.field789 = arg2.method314((byte) 55);
        } else if (arg0 == 2) {
            this.field788 = arg2.method314((byte) 107);
        }
        if (arg1) {
            this.method158(70, -21);
        }
        field797++;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 160)
    private final void method486(byte arg0) {
        field796++;
        double var2 = Math.cos((double) ((float) this.field788 / 4096.0F));
        this.field794[0] = (int) (Math.sin((double) ((float) this.field789 / 4096.0F)) * var2 * 4096.0D);
        this.field794[1] = (int) (Math.cos((double) ((float) this.field789 / 4096.0F)) * 4096.0D * var2);
        this.field794[2] = (int) (Math.sin((double) ((float) this.field788 / 4096.0F)) * 4096.0D);
        int var4 = this.field794[0] * this.field794[0] >> 12;
        int var5 = this.field794[2] * this.field794[2] >> 12;
        int var6 = this.field794[1] * this.field794[1] >> 12;
        if (arg0 != 86) {
            this.method476(25);
        }
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field794[1] = (this.field794[1] << 12) / var7;
            this.field794[0] = (this.field794[0] << 12) / var7;
            this.field794[2] = (this.field794[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V", line = 203)
    public class51() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V", line = 207)
    public final void method476(int arg0) {
        field795++;
        this.method486((byte) 86);
        if (arg0 != 0) {
            method484(11);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lrn;B)V", line = 219)
    public static final void method487(class18 arg0, byte arg1) {
        field792++;
        if (arg1 > 20) {
            class29.field471 = arg0;
        }
    }
}
