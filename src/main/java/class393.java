import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class393 extends class14 {

    @OriginalMember(owner = "client!pu", name = "O", descriptor = "I")
    private int field5320 = 3216;

    @OriginalMember(owner = "client!pu", name = "Q", descriptor = "[I")
    private int[] field5322 = new int[3];

    @OriginalMember(owner = "client!pu", name = "K", descriptor = "I")
    private int field5316 = 4096;

    @OriginalMember(owner = "client!pu", name = "V", descriptor = "I")
    private int field5327 = 3216;

    @OriginalMember(owner = "client!pu", name = "L", descriptor = "Lcr;")
    public static class403 field5317 = null;

    @OriginalMember(owner = "client!pu", name = "M", descriptor = "Lmm;")
    public static class182 field5318 = new class182(8192);

    @OriginalMember(owner = "client!pu", name = "J", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!pu", name = "N", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!pu", name = "P", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!pu", name = "R", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!pu", name = "S", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!pu", name = "T", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!pu", name = "U", descriptor = "Lpc;")
    public static class473 field5326;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)V")
    private final void method2305(int arg0) {
        ++field5324;
        double var2 = Math.cos((double) ((float) this.field5320 / 4096.0F));
        this.field5322[0] = (int) (var2 * Math.sin((double) ((float) this.field5327 / 4096.0F)) * 4096.0D);
        this.field5322[1] = (int) (Math.cos((double) ((float) this.field5327 / 4096.0F)) * var2 * 4096.0D);
        this.field5322[2] = (int) (Math.sin((double) ((float) this.field5320 / 4096.0F)) * 4096.0D);
        int var4 = this.field5322[0] * this.field5322[0] >> 12;
        int var5 = this.field5322[1] * this.field5322[1] >> 12;
        int var6 = this.field5322[2] * this.field5322[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 - -var5 + var6 >> 12)));
        if (~var7 != -1) {
            this.field5322[1] = (this.field5322[1] << 12) / var7;
            this.field5322[0] = (this.field5322[0] << 12) / var7;
            this.field5322[2] = (this.field5322[2] << 12) / var7;
        }
        if (arg0 != -20888) {
            this.method142((byte) 113);
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
    public class393() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "(I)V")
    public static final void method2306(int arg0) {
        ++field5325;
        if (class426.field5820 < 1024.0F) {
            class426.field5820 = 1024.0F;
        }
        while (class184.field2621 >= 16384.0F) {
            class184.field2621 -= 16384.0F;
        }
        if (class426.field5820 > 3072.0F) {
            class426.field5820 = 3072.0F;
        }
        while (class184.field2621 < 0.0F) {
            class184.field2621 += 16384.0F;
        }
        int var1 = class150.field2135 >> 7;
        int var2 = class429.field5883 >> 7;
        int var3 = class210.method1330(class411.field5656, (byte) -42, class150.field2135, class429.field5883);
        int var4 = arg0;
        if (~var1 < -4 && ~var2 < -4 && class12.field251 - 4 > var1 && class289.field3782 + -4 > var2) {
            for (int var5 = var1 - 4; ~var5 >= ~(var1 + 4); ++var5) {
                for (int var6 = var2 + -4; var2 + 4 >= var6; ++var6) {
                    int var7 = class411.field5656;
                    if (var7 < 3 && class401.method2330(var6, var5, 2)) {
                        ++var7;
                    }
                    int var8 = 0;
                    if (class387.field5261.field3593 != null && class387.field5261.field3593[var7] != null) {
                        var8 = (class387.field5261.field3593[var7][var5][var6] & 255) * 8;
                    }
                    int var9 = var3 - -var8 - class141.field2049[var7].method272(var5, var6);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 <= class366.field4952) {
            if (var10 < class366.field4952) {
                class366.field4952 += (var10 - class366.field4952) / 80;
                return;
            }
        } else {
            class366.field4952 += (-class366.field4952 + var10) / 24;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lhq;IB)V")
    public static final void method2307(class108 arg0, int arg1, byte arg2) {
        class371.field4995 = 0;
        int var3 = 41 / ((-83 - arg2) / 35);
        ++field5323;
        class324.field4279 = false;
        class77.method491(-120, arg0);
        class442.method2551(64, arg0);
        if (class324.field4279) {
            System.out.println("---endgpp---");
        }
        if (~arg0.field5173 != ~arg1) {
            throw new RuntimeException("gpi1 pos:" + arg0.field5173 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        ++field5319;
        int var4 = 16 % ((-51 - arg1) / 37);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field5320 = arg2.method2212((byte) 83);
                }
            } else {
                this.field5327 = arg2.method2212((byte) 83);
            }
        } else {
            this.field5316 = arg2.method2212((byte) 83);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field5321;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 > -2) {
            method2306(-61);
        }
        if (super.field270.field5222) {
            int var4 = class147.field2078 * this.field5316 >> 12;
            int[] var5 = this.method145(arg0 + -1 & class511.field7361, 0, -18596);
            int[] var6 = this.method145(arg0, 0, -18596);
            int[] var7 = this.method145(class511.field7361 & arg0 + 1, 0, -18596);
            for (int var8 = 0; ~class115.field1637 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class305.field4023] + -var6[var8 + 1 & class305.field4023]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class465.field6424[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field5322[2] * var15 >> 12;
                int var18 = this.field5322[0] * var14 >> 12;
                int var19 = this.field5322[1] * var16 >> 12;
                var3[var8] = var19 - -var17 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "(I)V")
    public static void method2308(int arg0) {
        if (arg0 != 2004) {
            method2306(-14);
        }
        field5317 = null;
        field5318 = null;
        field5326 = null;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
    public final void method142(byte arg0) {
        ++field5315;
        this.method2305(-20888);
        int var2 = 82 % ((arg0 - 39) / 59);
    }
}
