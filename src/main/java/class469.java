import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class469 extends class278 {

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
    private int field6849 = 3216;

    @OriginalMember(owner = "client!sv", name = "R", descriptor = "I")
    private int field6857 = 4096;

    @OriginalMember(owner = "client!sv", name = "T", descriptor = "[I")
    private int[] field6859 = new int[3];

    @OriginalMember(owner = "client!sv", name = "S", descriptor = "I")
    private int field6858 = 3216;

    @OriginalMember(owner = "client!sv", name = "P", descriptor = "Ljm;")
    public static class485 field6855 = new class485(33, 2);

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!sv", name = "M", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!sv", name = "N", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!sv", name = "O", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!sv", name = "Q", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!sv", name = "U", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!sv", name = "V", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIB)V", line = 4)
    public static final void method2754(int arg0, int arg1, int arg2, byte arg3) {
        ++field6851;
        if (class385.field5410 != null) {
            long var4 = (long) (arg0 << 28 | arg2 << 14 | arg1);
            class152 var6 = (class152) class456.field6672.method979((byte) 28, var4);
            if (var6 == null) {
                class466.method2740(arg0, arg1, arg2);
            } else {
                class493 var7 = (class493) var6.field2134.method3072((byte) 88);
                if (var7 == null) {
                    class466.method2740(arg0, arg1, arg2);
                } else {
                    int var8 = 11 % ((73 - arg3) / 52);
                    class108 var9 = (class108) class466.method2740(arg0, arg1, arg2);
                    if (var9 != null) {
                        var9.field1477 = var9.field1470 = -1;
                    } else {
                        var9 = new class108();
                    }
                    var9.field1472 = var7.field7287;
                    var9.field1469 = var7.field7282;
                    label44: while (true) {
                        class493 var10 = (class493) var6.field2134.method3066(2);
                        if (var10 == null) {
                            break;
                        }
                        if (var9.field1472 != var10.field7287) {
                            var9.field1477 = var10.field7287;
                            var9.field1467 = var10.field7282;
                            while (true) {
                                class493 var11 = (class493) var6.field2134.method3066(2);
                                if (var11 == null) {
                                    break label44;
                                }
                                if (var9.field1472 != var11.field7287 && ~var9.field1477 != ~var11.field7287) {
                                    var9.field1471 = var11.field7282;
                                    var9.field1470 = var11.field7287;
                                }
                            }
                        }
                    }
                    int var12 = class186.method1118((arg1 << 7) + 64, (arg2 << 7) - -64, 12840, arg0);
                    class91.method621(arg0, arg1, arg2, var12, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(II)V", line = 81)
    public static final void method2755(int arg0, int arg1) {
        class432.field6289 = arg1;
        if (arg0 != 17707) {
            field6860 = 124;
        }
        ++field6852;
        class504.field7413.method67(arg0 + -17581);
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V", line = 96)
    public class469() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "(I)V", line = 101)
    public static void method2756(int arg0) {
        if (arg0 <= -105) {
            field6855 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)[I", line = 111)
    public final int[] method208(int arg0, int arg1) {
        ++field6861;
        if (arg0 != -9) {
            field6860 = -53;
        }
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            int var4 = class51.field687 * this.field6857 >> 12;
            int[] var5 = this.method1570(arg0 ^ -9, 0, arg1 + -1 & class40.field549);
            int[] var6 = this.method1570(0, 0, arg1);
            int[] var7 = this.method1570(arg0 ^ -9, 0, arg1 + 1 & class40.field549);
            for (int var8 = 0; class507.field7456 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class412.field6045] + -var6[var8 - -1 & class412.field6045]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class84.field1164[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field6859[1] * var14 >> 12;
                int var18 = this.field6859[2] * var16 >> 12;
                int var19 = this.field6859[0] * var15 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(B)V", line = 184)
    private final void method2757(byte arg0) {
        ++field6856;
        double var2 = Math.cos((double) ((float) this.field6858 / 4096.0F));
        this.field6859[0] = (int) (4096.0D * Math.sin((double) ((float) this.field6849 / 4096.0F)) * var2);
        this.field6859[1] = (int) (Math.cos((double) ((float) this.field6849 / 4096.0F)) * var2 * 4096.0D);
        this.field6859[2] = (int) (4096.0D * Math.sin((double) ((float) this.field6858 / 4096.0F)));
        int var4 = this.field6859[0] * this.field6859[0] >> 12;
        if (arg0 <= -53) {
            int var5 = this.field6859[1] * this.field6859[1] >> 12;
            int var6 = this.field6859[2] * this.field6859[2] >> 12;
            int var7 = (int) (Math.sqrt((double) (var4 - (-var5 + -var6) >> 12)) * 4096.0D);
            if (var7 != 0) {
                this.field6859[2] = (this.field6859[2] << 12) / var7;
                this.field6859[0] = (this.field6859[0] << 12) / var7;
                this.field6859[1] = (this.field6859[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIII)V", line = 215)
    public static final void method2758(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6853;
        for (int var5 = arg4; var5 < class196.field2829; ++var5) {
            Rectangle var6 = class113.field1527[var5];
            if (arg3 < var6.x + var6.width && arg0 + arg3 > var6.x && ~arg1 > ~(var6.y + var6.height) && ~(arg1 + arg2) < ~var6.y) {
                class451.field6504[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(I)V", line = 236)
    public final void method207(int arg0) {
        if (arg0 != 2) {
            this.method207(33);
        }
        ++field6850;
        this.method2757((byte) -111);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Llh;II)V", line = 250)
    public final void method210(class365 arg0, int arg1, int arg2) {
        ++field6854;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field6858 = arg0.method2062((byte) 14);
                }
            } else {
                this.field6849 = arg0.method2062((byte) 14);
            }
        } else {
            this.field6857 = arg0.method2062((byte) 14);
        }
        if (arg1 != -30446) {
            this.method2757((byte) 83);
        }
    }
}
