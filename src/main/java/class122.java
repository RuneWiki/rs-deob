import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class122 extends class694 {

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
    private int field1680 = 3216;

    @OriginalMember(owner = "client!vr", name = "O", descriptor = "I")
    private int field1687 = 3216;

    @OriginalMember(owner = "client!vr", name = "M", descriptor = "I")
    private int field1685 = 4096;

    @OriginalMember(owner = "client!vr", name = "Q", descriptor = "[I")
    private int[] field1689 = new int[3];

    @OriginalMember(owner = "client!vr", name = "K", descriptor = "I")
    public static int field1683 = 0;

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!vr", name = "I", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!vr", name = "L", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!vr", name = "N", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!vr", name = "P", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjr;B)V", line = 3)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field1684;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field1687 = arg1.method743((byte) -71);
                }
            } else {
                this.field1680 = arg1.method743((byte) -55);
            }
        } else {
            this.field1685 = arg1.method743((byte) -122);
        }
        int var5 = -115 / ((58 - arg2) / 63);
    }

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)V", line = 44)
    public final void method40(int arg0) {
        this.method868(1);
        ++field1681;
        if (arg0 <= 5) {
            this.field1687 = -44;
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V", line = 57)
    public class122() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(JI)V", line = 66)
    public static final void method866(long arg0, int arg1) {
        ++field1679;
        int var3 = class264.field3734;
        if (~class581.field8108 != ~var3) {
            int var4 = var3 - class581.field8108;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (var4 > 0) {
                if (~var5 != -1) {
                    if (~var5 < ~var4) {
                        var5 = var4;
                    }
                } else {
                    var5 = 1;
                }
            } else if (~var5 == -1) {
                var5 = -1;
            } else if (~var5 > ~var4) {
                var5 = var4;
            }
            class581.field8108 += var5;
        }
        int var6 = class30.field363;
        if (arg1 < 114) {
            field1683 = -11;
        }
        if (!class274.field3872.field874) {
            class646.field9167 += (float) arg0 * class149.field2221 / 40.0F * 8.0F;
            class249.field3516 += (float) arg0 * class509.field6981 / 40.0F * 8.0F;
        }
        if (~class652.field9218 != ~var6) {
            int var7 = -class652.field9218 + var6;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (~var7 < -1) {
                if (var8 != 0) {
                    if (var8 > var7) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
            } else if (~var8 == -1) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class652.field9218 += var8;
        }
        class407.method2320(29199);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Len;B)V", line = 151)
    public static final void method867(class289 arg0, byte arg1) {
        if (class383.field5369 == null) {
            class249 var2 = new class249();
            byte[] var3 = var2.method1540(128, 128, (byte) -46, 16);
            class383.field5369 = class534.method2952(false, var3, 100);
        }
        ++field1682;
        if (class344.field4975 == null) {
            class144 var4 = new class144();
            byte[] var5 = var4.method1012((byte) -53, 128, 16, 128);
            class344.field4975 = class534.method2952(false, var5, 120);
        }
        class220 var6 = arg0.field4220;
        if (arg1 != -71) {
            method866(-127L, 29);
        }
        if (var6.method1418(arg1 + 184) && class627.field8740 == null) {
            byte[] var7 = class150.method1054(16, (byte) 103, new class208(419684), 0.5F, 8, 0.6F, 4.0F, 128, 16.0F, 4.0F, 128);
            class627.field8740 = class534.method2952(false, var7, arg1 ^ -43);
        }
    }

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "(I)V", line = 192)
    private final void method868(int arg0) {
        ++field1686;
        double var2 = Math.cos((double) ((float) this.field1687 / 4096.0F));
        this.field1689[0] = (int) (var2 * Math.sin((double) ((float) this.field1680 / 4096.0F)) * 4096.0D);
        this.field1689[arg0] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field1680 / 4096.0F)));
        this.field1689[2] = (int) (Math.sin((double) ((float) this.field1687 / 4096.0F)) * 4096.0D);
        int var4 = this.field1689[0] * this.field1689[0] >> 12;
        int var5 = this.field1689[1] * this.field1689[1] >> 12;
        int var6 = this.field1689[2] * this.field1689[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1689[0] = (this.field1689[0] << 12) / var7;
            this.field1689[1] = (this.field1689[1] << 12) / var7;
            this.field1689[2] = (this.field1689[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)[I", line = 225)
    public final int[] method39(int arg0, int arg1) {
        ++field1688;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            int var4 = class385.field5387 * this.field1685 >> 12;
            int[] var5 = this.method3809(0, arg1 + -1 & class384.field5383, (byte) 35);
            int[] var6 = this.method3809(0, arg1, (byte) 35);
            int[] var7 = this.method3809(0, arg1 - -1 & class384.field5383, (byte) 35);
            for (int var8 = 0; ~class465.field6544 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class168.field2537] + -var6[class168.field2537 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class586.field8199[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field1689[1] * var15 >> 12;
                int var18 = this.field1689[0] * var14 >> 12;
                int var19 = this.field1689[2] * var16 >> 12;
                var3[var8] = var18 - -var17 + var19;
            }
        }
        if (arg0 < 112) {
            this.field1685 = -42;
        }
        return var3;
    }
}
