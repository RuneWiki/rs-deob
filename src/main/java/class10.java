import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 extends class68 {

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    private int field102 = 585;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field100 = 0;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field105 = "glow1:";

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "F")
    public static float field104;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "Lhc;")
    public static class235 field94;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)I")
    public static final int method63(byte arg0, int arg1) {
        if (arg0 < 83) {
            return -17;
        } else {
            ++field101;
            return 127 & arg1;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BII)V")
    public static final void method64(byte arg0, int arg1, int arg2) {
        ++field98;
        if (class52.method328(19031, arg2)) {
            class160.method1066(-120, class158.field2208[arg2], arg1);
            if (arg0 > -103) {
                method64((byte) -101, -80, -46);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V")
    public static void method65(int arg0) {
        field94 = null;
        field105 = null;
        int var1 = -65 % ((60 - arg0) / 52);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;III)Lml;")
    public static final class296 method66(Component arg0, int arg1, int arg2, int arg3) {
        int var4 = 59 % ((arg1 - 8) / 50);
        ++field97;
        try {
            Class var5 = Class.forName("kf");
            class296 var6 = (class296) var5.newInstance();
            var6.method661(arg2, arg3, arg0, -45301402);
            return var6;
        } catch (Throwable var8) {
            class101 var7 = new class101();
            var7.method661(arg2, arg3, arg0, -45301402);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(B)V")
    public static final void method67(byte arg0) {
        ++field103;
        int var1 = 116 % ((-19 - arg0) / 51);
        if (!class36.field556) {
            class20.field291 = true;
            class36.field556 = true;
            if (class297.field4681) {
                class68.field912 = (float) (-128 & (int) class68.field912 + 191);
            } else {
                class144.field1996 += (-class144.field1996 + 24.0F) / 2.0F;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class10() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (arg2) {
            if (~arg1 == -1) {
                this.field102 = arg0.method1445(false);
            }
            ++field95;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lrj;I)V")
    public static final void method68(class8 arg0, int arg1) {
        class119.field1673 = arg0;
        ++field99;
        if (arg1 != -1) {
            field105 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        ++field96;
        int[] var3 = super.field917.method1920(arg0, true);
        if (arg1 > -118) {
            field100 = 77;
        }
        if (super.field917.field4474) {
            int var4 = class127.field1794[arg0];
            for (int var5 = 0; ~class89.field1248 < ~var5; ++var5) {
                int var6 = class215.field3231[var5];
                if (~this.field102 > ~var6 && var6 < -this.field102 + 4096 && ~(-this.field102 + 2048) > ~var4 && ~(this.field102 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field102 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(2048 - this.field102) > ~var6 && this.field102 + 2048 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field102;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field102 + 2048);
                } else if (this.field102 <= var4 && ~var4 >= ~(-this.field102 + 4096)) {
                    if (this.field102 <= var6 && var6 <= -this.field102 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field102 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field102;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field102 + 2048);
                }
            }
        }
        return var3;
    }
}
