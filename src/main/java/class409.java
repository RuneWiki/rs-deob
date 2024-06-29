import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class409 extends class270 {

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    private int field5958 = 0;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    private int field5965 = 2048;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    private int field5968 = 10;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
    public static int field5960 = 0;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "Lfg;")
    public static class18 field5959 = new class18(8);

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "I")
    public static int field5967 = 0;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    public static int field5966 = 1;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    public static int field5969 = -13423323;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "S")
    public static short field5963 = 256;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
    public static int field5970 = 0;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "Lbc;")
    public static class283 field5972;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "Ljava/lang/String;")
    public static String field5971;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "[I")
    private int[] field5962;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "[I")
    private int[] field5964;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(B)V")
    public static void method2581(byte arg0) {
        if (arg0 > 103) {
            field5971 = null;
            field5972 = null;
            field5959 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 != 108) {
            this.method81((byte) -90, 112);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field5958 = arg1.method271((byte) 120);
                }
            } else {
                this.field5965 = arg1.method320((byte) -87);
            }
        } else {
            this.field5968 = arg1.method271((byte) 113);
        }
        ++field5957;
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
    private final void method2582(int arg0) {
        ++field5961;
        this.field5962 = new int[this.field5968 + 1];
        int var2 = 0;
        this.field5964 = new int[this.field5968 + 1];
        int var3 = 4096 / this.field5968;
        int var4 = this.field5965 * var3 >> 12;
        for (int var5 = 0; var5 < this.field5968; ++var5) {
            this.field5962[var5] = var2;
            this.field5964[var5] = var2 + var4;
            var2 += var3;
        }
        this.field5962[this.field5968] = 4096;
        this.field5964[this.field5968] = this.field5964[arg0] + 4096;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)[I")
    public final int[] method81(byte arg0, int arg1) {
        ++field5956;
        int[] var3 = super.field4053.method396(arg1, 118);
        if (super.field4053.field815) {
            int var4 = class364.field5185[arg1];
            if (~this.field5958 != -1) {
                for (int var5 = 0; ~class161.field2445 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class136.field2168[var5];
                    int var9 = this.field5958;
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (var9 == 3) {
                                var6 = (var8 - var4 >> 1) + 2048;
                            }
                        } else {
                            var6 = 2048 - -(var8 - -var4 - 4096 >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; this.field5968 > var10; ++var10) {
                        if (this.field5962[var10] <= var6 && ~var6 > ~this.field5962[var10 + 1]) {
                            if (var6 < this.field5964[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field5968 > var12; ++var12) {
                    if (this.field5962[var12] <= var4 && this.field5962[var12 - -1] > var4) {
                        if (~this.field5964[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class82.method638(var3, 0, class161.field2445, var11);
            }
        }
        if (arg0 <= 26) {
            method2581((byte) -46);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        this.method2582(0);
        if (!arg0) {
            this.field5962 = null;
        }
        ++field5955;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class409() {
        super(0, true);
    }
}
