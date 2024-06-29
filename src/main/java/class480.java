import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class480 extends class349 {

    @OriginalMember(owner = "client!kq", name = "B", descriptor = "I")
    private int field6455 = 2048;

    @OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
    private int field6460 = 12288;

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
    private int field6459 = 0;

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "I")
    private int field6464 = 4096;

    @OriginalMember(owner = "client!kq", name = "E", descriptor = "I")
    private int field6458 = 8192;

    @OriginalMember(owner = "client!kq", name = "M", descriptor = "I")
    private int field6466 = 0;

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
    private int field6463 = 2048;

    @OriginalMember(owner = "client!kq", name = "O", descriptor = "Lkca;")
    public static class537 field6468;

    @OriginalMember(owner = "client!kq", name = "Q", descriptor = "[I")
    public static int[] field6470;

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!kq", name = "D", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!kq", name = "N", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!kq", name = "P", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "[I")
    public static int[] field6461;

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
    public class480() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field6458 = arg2.method922((byte) -118);
                                }
                            } else {
                                this.field6464 = arg2.method922((byte) -121);
                            }
                        } else {
                            this.field6460 = arg2.method922((byte) -120);
                        }
                    } else {
                        this.field6455 = arg2.method922((byte) -121);
                    }
                } else {
                    this.field6459 = arg2.method922((byte) -116);
                }
            } else {
                this.field6466 = arg2.method922((byte) -128);
            }
        } else {
            this.field6463 = arg2.method922((byte) -117);
        }
        ++field6456;
        if (arg0 != 4095) {
            this.method2679(-60, true, -51);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BII)Z")
    private final boolean method2678(byte arg0, int arg1, int arg2) {
        if (arg0 != -101) {
            this.method5(-118, 116, (class138) null);
        }
        ++field6467;
        int var4 = (arg1 - arg2) * this.field6460 >> 12;
        int var5 = class15.field127[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field6460;
        int var7 = (var6 << 12) / this.field6458;
        int var8 = this.field6464 * var7 >> 12;
        return var8 > arg2 - -arg1 && -var8 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field6469;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        int var4 = 16 / ((56 - arg0) / 41);
        if (super.field5109.field7515) {
            int var5 = class54.field709[arg1] + -2048;
            for (int var6 = 0; ~class39.field497 < ~var6; ++var6) {
                int var7 = class29.field283[var6] + -2048;
                int var8 = this.field6463 + var7;
                int var9 = ~var8 > 2047 ? var8 - -4096 : var8;
                int var10 = var9 <= 2048 ? var9 : var9 + -4096;
                int var11 = var5 - -this.field6466;
                int var12 = ~var11 <= 2047 ? var11 : var11 + 4096;
                int var13 = ~var12 >= -2049 ? var12 : var12 - 4096;
                int var14 = this.field6459 + var7;
                int var15 = var14 < -2048 ? var14 - -4096 : var14;
                int var16 = ~var15 >= -2049 ? var15 : var15 + -4096;
                int var17 = this.field6455 + var5;
                int var18 = ~var17 > 2047 ? var17 + 4096 : var17;
                int var19 = var18 > 2048 ? var18 + -4096 : var18;
                var3[var6] = !this.method2678((byte) -101, var13, var10) && !this.method2679(var16, true, var19) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZI)Z")
    private final boolean method2679(int arg0, boolean arg1, int arg2) {
        ++field6465;
        int var4 = (arg2 - -arg0) * this.field6460 >> 12;
        if (!arg1) {
            this.method2679(-32, true, 8);
        }
        int var5 = class15.field127[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field6460;
        int var7 = (var6 << 12) / this.field6458;
        int var8 = this.field6464 * var7 >> 12;
        return -arg0 + arg2 < var8 && ~(-var8) > ~(-arg0 + arg2);
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(B)V")
    public final void method11(byte arg0) {
        class55.method350(0);
        ++field6457;
        if (arg0 > -51) {
            this.method2679(-89, true, -94);
        }
    }

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "(I)V")
    public static void method2680(int arg0) {
        if (arg0 != 2048) {
            method2680(-49);
        }
        field6461 = null;
        field6470 = null;
        field6468 = null;
    }

    static {
        new class229("", 73);
        field6468 = new class537();
        field6470 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };
    }
}
