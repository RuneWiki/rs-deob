import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class629 extends class314 {

    @OriginalMember(owner = "client!wca", name = "M", descriptor = "I")
    private int field8868 = 204;

    @OriginalMember(owner = "client!wca", name = "P", descriptor = "I")
    private int field8871 = 1;

    @OriginalMember(owner = "client!wca", name = "S", descriptor = "I")
    private int field8874 = 1;

    @OriginalMember(owner = "client!wca", name = "N", descriptor = "I")
    public static int field8869 = -2;

    @OriginalMember(owner = "client!wca", name = "T", descriptor = "Lj;")
    public static class502 field8875 = new class502("WIP", 2);

    @OriginalMember(owner = "client!wca", name = "V", descriptor = "[I")
    public static int[] field8877 = new int[4096];

    @OriginalMember(owner = "client!wca", name = "L", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!wca", name = "O", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!wca", name = "Q", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!wca", name = "R", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!wca", name = "U", descriptor = "Z")
    public static boolean field8876;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "([BB)[B", line = 3)
    public static final byte[] method3665(byte[] arg0, byte arg1) {
        ++field8872;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class398.method2566(arg0, 0, var2, 0, arg0.length);
            return arg1 != 50 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BLie;I)V", line = 21)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg0 >= -1) {
            this.method5((byte) -7, (class6) null, -61);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field8868 = arg1.method67(12021);
                }
            } else {
                this.field8871 = arg1.method70(-9059);
            }
        } else {
            this.field8874 = arg1.method70(-9059);
        }
        ++field8873;
    }

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "(I)V", line = 65)
    public static void method3666(int arg0) {
        if (arg0 == 22439) {
            field8877 = null;
            field8875 = null;
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)V", line = 77)
    public static final void method3667(byte arg0) {
        ++field8867;
        if (~class34.field502 <= -1) {
            long var1 = class112.method1033(-11752);
            class34.field502 = (int) ((long) class34.field502 - (-class185.field3112 + var1));
            if (~class34.field502 < -1) {
                int var3 = (class34.field502 << 8) / class645.field9071;
                int var4 = -var3 + 255;
                float var5 = (float) var3 / 255.0F;
                class661.field9223 = (-16711936 & (16711935 & class260.field4211) * var3 + (class529.field7718.field7191 & 16711935) * var4) - -(16711680 & (class260.field4211 & 65280) * var3 + (65280 & class529.field7718.field7191) * var4) >>> 8;
                float var6 = 1.0F - var5;
                class641.field8990 = (-class91.field1116 + class529.field7718.field7200) * var6 + class91.field1116;
                class39.field529 = (class529.field7718.field7199 - class327.field5079) * var6 + class327.field5079;
                class81.field1008 = (class529.field7718.field7186 - class529.field7717) * var6 + class529.field7717;
                class209.field3499 = (class529.field7718.field7195 - class583.field8294) * var6 + class583.field8294;
                class466.field6946 = (class529.field7718.field7197 - class112.field1782) * var6 + class112.field1782;
                class528.field7707 = (16711680 & (class62.field805 & 65280) * var3 + (class529.field7718.field7202 & 65280) * var4) + (-16711936 & (16711935 & class62.field805) * var3 + (16711935 & class529.field7718.field7202) * var4) >>> 8;
                class127.field2071 = class226.field3633 * var3 + class529.field7718.field7189 * var4 >> 8;
                class493.field7209 = (-class9.field161 + class529.field7718.field7192) * var6 + class9.field161;
                if (class200.field3265 != class529.field7718.field7190) {
                    class579.field8250 = class529.field7721.method119(class200.field3265, class529.field7718.field7190, var6, class579.field8250);
                }
            } else {
                class39.field529 = class529.field7718.field7199;
                class579.field8250 = class529.field7718.field7190;
                class81.field1008 = class529.field7718.field7186;
                class34.field502 = -1;
                class127.field2071 = class529.field7718.field7189;
                class493.field7209 = class529.field7718.field7192;
                class641.field8990 = class529.field7718.field7200;
                class209.field3499 = class529.field7718.field7195;
                class528.field7707 = class529.field7718.field7202;
                class661.field9223 = class529.field7718.field7191;
                class466.field6946 = class529.field7718.field7197;
            }
            class185.field3112 = var1;
        }
        if (arg0 > -21) {
            field8876 = false;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)[I", line = 135)
    public final int[] method6(int arg0, int arg1) {
        ++field8870;
        int[] var3 = super.field4928.method534((byte) -51, arg0);
        if (arg1 <= 109) {
            return null;
        } else {
            if (super.field4928.field618) {
                for (int var4 = 0; class81.field1009 > var4; ++var4) {
                    int var5 = class328.field5091[var4];
                    int var6 = class657.field9166[arg0];
                    int var7 = this.field8874 * var5 >> 12;
                    int var8 = this.field8871 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field8874) * this.field8874;
                    int var10 = var6 % (4096 / this.field8871) * this.field8871;
                    if (~var10 > ~this.field8868) {
                        for (var7 -= var8; ~var7 > -1; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (this.field8868 > var9) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (var9 < this.field8868) {
                        int var11;
                        for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V", line = 227)
    public class629() {
        super(0, true);
    }
}
