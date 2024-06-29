import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class341 extends class404 {

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    private int field5081 = 0;

    @OriginalMember(owner = "client!cn", name = "I", descriptor = "I")
    private int field5086 = 4096;

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
    private int field5079 = 2048;

    @OriginalMember(owner = "client!cn", name = "L", descriptor = "I")
    private int field5088 = 12288;

    @OriginalMember(owner = "client!cn", name = "M", descriptor = "I")
    private int field5089 = 0;

    @OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
    private int field5083 = 2048;

    @OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
    private int field5090 = 8192;

    @OriginalMember(owner = "client!cn", name = "O", descriptor = "Lnd;")
    public static class366 field5091 = new class366(0, 5);

    @OriginalMember(owner = "client!cn", name = "T", descriptor = "[I")
    public static int[] field5096 = new int[1000];

    @OriginalMember(owner = "client!cn", name = "V", descriptor = "[I")
    public static int[] field5098 = new int[2048];

    @OriginalMember(owner = "client!cn", name = "R", descriptor = "I")
    public static int field5094 = 0;

    @OriginalMember(owner = "client!cn", name = "S", descriptor = "I")
    public static int field5095 = 0;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!cn", name = "G", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!cn", name = "H", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!cn", name = "J", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!cn", name = "P", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!cn", name = "Q", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!cn", name = "U", descriptor = "Lig;")
    public static class154 field5097;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILha;I)V", line = 5)
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field5080;
        if (arg0 != 0) {
            this.method211(-23);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field5090 = arg1.method254((byte) -32);
                                }
                            } else {
                                this.field5086 = arg1.method254((byte) -102);
                            }
                        } else {
                            this.field5088 = arg1.method254((byte) -32);
                        }
                    } else {
                        this.field5083 = arg1.method254((byte) -59);
                    }
                } else {
                    this.field5081 = arg1.method254((byte) -65);
                }
            } else {
                this.field5089 = arg1.method254((byte) -70);
            }
        } else {
            this.field5079 = arg1.method254((byte) -102);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)[I", line = 86)
    public final int[] method90(int arg0, int arg1) {
        ++field5087;
        if (arg0 > -47) {
            method2106(118);
        }
        int[] var3 = super.field5870.method372(arg1, (byte) 28);
        if (super.field5870.field810) {
            int var4 = class289.field4381[arg1] + -2048;
            for (int var5 = 0; ~class431.field6348 < ~var5; ++var5) {
                int var6 = class167.field2594[var5] + -2048;
                int var7 = var6 - -this.field5079;
                int var8 = ~var7 <= 2047 ? var7 : var7 - -4096;
                int var9 = ~var8 < -2049 ? var8 - 4096 : var8;
                int var10 = var4 - -this.field5089;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = this.field5081 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = var4 - -this.field5083;
                int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method2104(var9, var12, -7878) && !this.method2108(-26663, var15, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZI)V", line = 144)
    public static final void method2103(boolean arg0, int arg1) {
        ++field5078;
        class264.field3989 = arg1;
        class226.field3471 = -1;
        class226.field3471 = -1;
        if (!arg0) {
            method2107((byte) 33);
        }
        class419.method2454((byte) 127);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(III)Z", line = 158)
    private final boolean method2104(int arg0, int arg1, int arg2) {
        ++field5092;
        int var4 = (arg1 - arg0) * this.field5088 >> 12;
        int var5 = class251.field3841[(1047992 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field5088;
        int var7 = (var6 << 12) / this.field5090;
        if (arg2 != -7878) {
            return true;
        } else {
            int var8 = this.field5086 * var7 >> 12;
            return ~var8 < ~(arg0 + arg1) && ~(-var8) > ~(arg0 + arg1);
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(III)I", line = 176)
    public static final int method2105(int arg0, int arg1, int arg2) {
        ++field5077;
        if (arg2 < 119) {
            method2106(57);
        }
        return ~arg1 != -5 && ~arg1 != -6 ? 256 : class50.field764[arg0 & 3];
    }

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "(I)V", line = 190)
    public static void method2106(int arg0) {
        field5097 = null;
        if (arg0 != 4096) {
            method2103(false, 109);
        }
        field5098 = null;
        field5096 = null;
        field5091 = null;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V", line = 280)
    public class341() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V", line = 223)
    public final void method211(int arg0) {
        ++field5084;
        class331.method2053(false);
        if (arg0 != -3) {
            field5091 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 235)
    public static final void method2107(byte arg0) {
        ++field5085;
        try {
            int var1 = -47 / ((-23 - arg0) / 62);
            if (class322.field4842 == 1) {
                int var2 = class194.field3056.method634((byte) 37);
                if (var2 > 0 && class194.field3056.method651((byte) -107)) {
                    int var3 = var2 - class91.field1639;
                    if (~var3 > -1) {
                        var3 = 0;
                    }
                    class194.field3056.method621(var3, 47);
                } else {
                    class194.field3056.method660((byte) 56);
                    class194.field3056.method646((byte) 125);
                    if (class107.field1871 == null) {
                        class322.field4842 = 0;
                    } else {
                        class322.field4842 = 2;
                    }
                    class490.field7455 = null;
                    class466.field7143 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class194.field3056.method660((byte) 66);
            class107.field1871 = null;
            class490.field7455 = null;
            class322.field4842 = 0;
            class466.field7143 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(III)Z", line = 292)
    private final boolean method2108(int arg0, int arg1, int arg2) {
        ++field5082;
        int var4 = (arg1 + arg2) * this.field5088 >> 12;
        int var5 = class251.field3841[(1047781 & var4 * 255) >> 12];
        if (arg0 != -26663) {
            field5095 = 87;
        }
        int var6 = (var5 << 12) / this.field5088;
        int var7 = (var6 << 12) / this.field5090;
        int var8 = this.field5086 * var7 >> 12;
        return -arg1 + arg2 < var8 && -var8 < -arg1 + arg2;
    }
}
