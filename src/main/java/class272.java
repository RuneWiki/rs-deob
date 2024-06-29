import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class272 extends class354 {

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    private int field3937 = 585;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public static int field3936 = -1;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field3938 = 0;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "Lhh;")
    public static class84 field3933;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V", line = 3)
    public static void method1742(int arg0) {
        field3933 = null;
        if (arg0 != 1) {
            method1742(12);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 13)
    public class272() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)[I", line = 17)
    public final int[] method253(int arg0, byte arg1) {
        ++field3934;
        int[] var3 = super.field5357.method861(true, arg0);
        if (arg1 != -95) {
            this.field3937 = -113;
        }
        if (super.field5357.field1869) {
            int var4 = class278.field4009[arg0];
            for (int var5 = 0; ~class404.field5952 < ~var5; ++var5) {
                int var6 = class154.field2358[var5];
                if (~var6 < ~this.field3937 && -this.field3937 + 4096 > var6 && -this.field3937 + 2048 < var4 && ~(this.field3937 + 2048) < ~var4) {
                    int var7 = 2048 - var6;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3937);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(2048 - this.field3937) && var6 < this.field3937 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field3937;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field3937);
                } else if (~this.field3937 >= ~var4 && ~var4 >= ~(-this.field3937 + 4096)) {
                    if (var6 >= this.field3937 && -this.field3937 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field3937);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field3937;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field3937 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V", line = 102)
    public static final void method1743(int arg0, int arg1) {
        class377 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class35 var4 = class145.field2135[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class254.field3675; ++var5) {
                    for (int var6 = 0; var6 < class246.field3560; ++var6) {
                        var2 = var4.method277(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class225.field3278;
                            int var8 = var5 << class225.field3278;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class35 var10 = class145.field2135[var9];
                                if (var10 != null) {
                                    int var11 = var4.method271(var6, var5) - var10.method271(var6, var5);
                                    int var12 = var4.method271(var6 + 1, var5) - var10.method271(var6 + 1, var5);
                                    int var13 = var4.method271(var6 + 1, var5 + 1) - var10.method271(var6 + 1, var5 + 1);
                                    int var14 = var4.method271(var6, var5 + 1) - var10.method271(var6, var5 + 1);
                                    var10.method276(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILti;I)V", line = 166)
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg0 == 15180) {
            if (arg2 == 0) {
                this.field3937 = arg1.method1868(arg0 ^ 15180);
            }
            ++field3935;
        }
    }
}
