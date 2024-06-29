import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class586 extends class362 {

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    private int field8280 = 3216;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "[I")
    private int[] field8284 = new int[3];

    @OriginalMember(owner = "client!si", name = "J", descriptor = "I")
    private int field8290 = 3216;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    private int field8289 = 4096;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public static int field8285 = -1;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "Lvl;")
    public static class15 field8279 = new class15(5, 1);

    @OriginalMember(owner = "client!si", name = "K", descriptor = "Lvl;")
    public static class15 field8291 = new class15(32, 16);

    @OriginalMember(owner = "client!si", name = "L", descriptor = "Lfja;")
    public static class783 field8292 = new class783(126, 8);

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field8293 = 0;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
    public static void method3368(int arg0) {
        field8279 = null;
        if (arg0 == 611008332) {
            field8292 = null;
            field8291 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "(I)I")
    public static final int method3369(int arg0) {
        if (arg0 != 2) {
            return 96;
        } else {
            ++field8288;
            if (class703.field9674 != null) {
                return 3;
            } else {
                return class760.field10465 ? 2 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field8282;
        if (arg2 != -1) {
            field8292 = null;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field8290 = arg0.method763(109);
                }
            } else {
                this.field8280 = arg0.method763(119);
            }
        } else {
            this.field8289 = arg0.method763(-53);
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class586() {
        super(1, true);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public final void method160(int arg0) {
        ++field8281;
        if (arg0 == -996226836) {
            this.method3371(31193);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3370(int arg0, int arg1, byte arg2) {
        ++field8286;
        int var3 = 57 / ((arg2 - 22) / 40);
        return ~(540800 & arg0) != -1;
    }

    @OriginalMember(owner = "client!si", name = "g", descriptor = "(I)V")
    private final void method3371(int arg0) {
        ++field8283;
        if (arg0 != 31193) {
            method3370(-43, 4, (byte) 85);
        }
        double var2 = Math.cos((double) ((float) this.field8290 / 4096.0F));
        this.field8284[0] = (int) (var2 * Math.sin((double) ((float) this.field8280 / 4096.0F)) * 4096.0D);
        this.field8284[1] = (int) (4096.0D * Math.cos((double) ((float) this.field8280 / 4096.0F)) * var2);
        this.field8284[2] = (int) (4096.0D * Math.sin((double) ((float) this.field8290 / 4096.0F)));
        int var4 = this.field8284[0] * this.field8284[0] >> 12;
        int var5 = this.field8284[1] * this.field8284[1] >> 12;
        int var6 = this.field8284[2] * this.field8284[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (~var7 != -1) {
            this.field8284[1] = (this.field8284[1] << 12) / var7;
            this.field8284[0] = (this.field8284[0] << 12) / var7;
            this.field8284[2] = (this.field8284[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field8287;
        if (arg0 != -2026769311) {
            this.method154((class93) null, -122, -17);
        }
        int[] var3 = super.field4927.method808(-125, arg1);
        if (super.field4927.field1471) {
            int var4 = class549.field7457 * this.field8289 >> 12;
            int[] var5 = this.method2221(0, arg1 + -1 & class606.field8463, -98);
            int[] var6 = this.method2221(0, arg1, -4);
            int[] var7 = this.method2221(0, arg1 + 1 & class606.field8463, 100);
            for (int var8 = 0; class769.field10597 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class522.field7083 & var8 - 1] + -var6[class522.field7083 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class305.field4187[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field8284[2] * var15 >> 12;
                int var18 = this.field8284[1] * var16 >> 12;
                int var19 = this.field8284[0] * var14 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        return var3;
    }
}
