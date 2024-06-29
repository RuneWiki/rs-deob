import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class735 extends class667 {

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    private int field10340 = 2048;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    private int field10338 = 10;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    private int field10347 = 0;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "Lqe;")
    public static class465 field10345 = new class465(32, -2);

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "Lnga;")
    public static class510 field10349 = new class510(4);

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    public static int field10353 = 0;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "F")
    public static float field10350;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field10341;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field10342;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field10344;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field10346;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field10348;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field10352;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "Lqe;")
    public static class465 field10351;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "[I")
    private int[] field10339;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "[I")
    private int[] field10343;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)[I", line = 5)
    public final int[] method117(byte arg0, int arg1) {
        ++field10341;
        if (arg0 >= -87) {
            this.field10338 = -105;
        }
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int var4 = class385.field5384[arg1];
            if (this.field10347 != 0) {
                for (int var5 = 0; class77.field1455 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class20.field261[var5];
                    int var9 = this.field10347;
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (var9 == 3) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (-4096 - -var4 + var8 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~var10 > ~this.field10338; ++var10) {
                        if (~var6 <= ~this.field10343[var10] && this.field10343[var10 - -1] > var6) {
                            if (var6 < this.field10339[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field10338 > var12; ++var12) {
                    if (~this.field10343[var12] >= ~var4 && var4 < this.field10343[var12 + 1]) {
                        if (~this.field10339[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class622.method3592(var3, 0, class77.field1455, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V", line = 119)
    public static void method4106(byte arg0) {
        field10345 = null;
        field10351 = null;
        field10349 = null;
        if (arg0 > -66) {
            field10350 = -0.9762084F;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 150)
    public class735() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V", line = 136)
    public static final void method4107(int arg0, int arg1) {
        ++field10344;
        class354 var2 = class501.method3012(arg1, 7, 2145997216);
        if (arg0 <= -31) {
            var2.method2216(0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(Z)V", line = 155)
    private final void method4108(boolean arg0) {
        ++field10346;
        this.field10343 = new int[this.field10338 + 1];
        this.field10339 = new int[this.field10338 - -1];
        if (!arg0) {
            this.method121(false);
        }
        int var2 = 0;
        int var3 = 4096 / this.field10338;
        int var4 = this.field10340 * var3 >> 12;
        for (int var5 = 0; ~this.field10338 < ~var5; ++var5) {
            this.field10343[var5] = var2;
            this.field10339[var5] = var2 + var4;
            var2 += var3;
        }
        this.field10343[this.field10338] = 4096;
        this.field10339[this.field10338] = this.field10339[0] + 4096;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lud;II)V", line = 192)
    public final void method116(class35 arg0, int arg1, int arg2) {
        ++field10348;
        if (arg1 == 3) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        this.field10347 = arg0.method273(255);
                    }
                } else {
                    this.field10340 = arg0.method253(-13900);
                }
            } else {
                this.field10338 = arg0.method273(255);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V", line = 237)
    public final void method121(boolean arg0) {
        this.method4108(true);
        if (arg0) {
            this.field10343 = null;
        }
        ++field10342;
    }
}
