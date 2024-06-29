import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class393 extends class40 {

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    private int field5524 = 1024;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    private int field5525 = 2048;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
    private int field5521 = 3072;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    public static int field5523 = 0;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "[B")
    public static byte[] field5529 = new byte[32896];

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "Ltj;")
    public static class108 field5532;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "[[I")
    public static int[][] field5531;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field550 = arg2.method837(true) == 1;
                }
            } else {
                this.field5521 = arg2.method798(false);
            }
        } else {
            this.field5524 = arg2.method798(false);
        }
        if (arg1 >= 79) {
            ++field5522;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZZBII)V")
    public static final void method2473(boolean arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        if (arg2 <= 26) {
            method2475(-46, (class269) null, (class108) null);
        }
        ++field5526;
        class228.method1592(arg4, 37, arg1, class241.field3561.length + -1, 0, arg0, arg3);
        class440.field6296 = null;
        class409.field5870 = 0;
    }

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "(B)V")
    public static void method2474(byte arg0) {
        field5532 = null;
        if (arg0 > -101) {
            method2475(-101, (class269) null, (class108) null);
        }
        field5531 = null;
        field5529 = null;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class393() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILvq;Ltj;)V")
    public static final void method2475(int arg0, class269 arg1, class108 arg2) {
        ++field5527;
        if (!class341.field4938) {
            arg1.method886(0);
            class25.field317 = arg1.method870(class337.method2217(arg2, class409.field5873), true);
            class25.field317.method1772((class24.field307 + -class25.field317.method83()) / 2, (class316.field4643 + -class25.field317.method75()) / 2);
            int var3 = -99 / ((-26 - arg0) / 33);
            class231.field3418 = arg1.method870(class337.method2217(arg2, class186.field2659), true);
            class231.field3418.method1772((class24.field307 - class231.field3418.method83()) / 2, 18);
            class341.field4938 = true;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        ++field5519;
        int[] var3 = super.field551.method185(65280, arg1);
        if (arg0 >= -20) {
            return null;
        } else {
            if (super.field551.field441) {
                int[] var4 = this.method266((byte) -116, arg1, 0);
                for (int var5 = 0; class410.field5886 > var5; ++var5) {
                    var3[var5] = (var4[var5] * this.field5525 >> 12) + this.field5524;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)[[I")
    public final int[][] method112(int arg0, int arg1) {
        ++field5520;
        int[][] var3 = super.field555.method2070(0, arg1);
        if (super.field555.field4489) {
            int[][] var4 = this.method261(0, 28552, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class410.field5886 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field5525 >> 12) + this.field5524;
                var9[var11] = (var6[var11] * this.field5525 >> 12) + this.field5524;
                var10[var11] = (var7[var11] * this.field5525 >> 12) + this.field5524;
            }
        }
        if (arg0 != 1) {
            this.field5524 = 7;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "(B)V")
    public final void method39(byte arg0) {
        ++field5528;
        this.field5525 = -this.field5524 + this.field5521;
        if (arg0 != -23) {
            field5523 = -2;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var2 >= ~var1; ++var2) {
                field5529[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field5533 = -1;
    }
}
