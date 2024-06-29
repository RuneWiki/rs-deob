import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class319 extends class30 {

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    private int field4366 = 0;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    private int field4374 = 4096;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    private int field4365 = 2000;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    private int field4369 = 0;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    private int field4376 = 16;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "Lem;")
    public static class206 field4371 = new class206(102, 7);

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field4375 = 0;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
    public static void method1921(int arg0) {
        field4371 = null;
        if (arg0 != -21632) {
            method1921(-120);
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    public class319() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public final void method29(byte arg0) {
        if (arg0 > -10) {
            this.field4376 = 51;
        }
        ++field4370;
        class118.method841(0);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            this.field4374 = arg2.method2845(-1);
                        }
                    } else {
                        this.field4366 = arg2.method2845(-1);
                    }
                } else {
                    this.field4376 = arg2.method2874((byte) -75);
                }
            } else {
                this.field4365 = arg2.method2845(-1);
            }
        } else {
            this.field4369 = arg2.method2874((byte) -75);
        }
        if (arg0 <= 100) {
            field4371 = null;
        }
        ++field4373;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V")
    public static final void method1922(int arg0, int arg1) {
        ++field4367;
        if (client.method1683(arg0, (byte) 103)) {
            class78[] var2 = class167.field2439[arg0];
            if (arg1 == -1) {
                for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                    class78 var4 = var2[var3];
                    if (var4 != null) {
                        var4.field1176 = 0;
                        var4.field1045 = 1;
                        var4.field1037 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field4368;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int var4 = this.field4374 >> 1;
            int[][] var5 = super.field374.method3663(0);
            Random var6 = new Random((long) this.field4369);
            for (int var7 = 0; ~this.field4365 < ~var7; ++var7) {
                int var8 = this.field4374 > 0 ? this.field4366 + -var4 + class351.method2023(this.field4374, -97, var6) : this.field4366;
                int var9 = var8 >> 4 & 255;
                int var10 = class351.method2023(class31.field399, -78, var6);
                int var11 = class351.method2023(class148.field2197, arg0 + -89, var6);
                int var12 = (class76.field995[var9] * this.field4376 >> 12) + var10;
                int var13 = (class256.field3495[var9] * this.field4376 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class351.method2023(4096, -42, var6) >> 2) + 1024;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = var26 + 1024 - -((-var10 + var28) * var25);
                        int var30 = class353.field4694 & var28;
                        int var31 = class649.field9002 & var21;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 -= -var27;
                        }
                    }
                }
            }
        }
        if (arg0 != 1) {
            this.method29((byte) 78);
        }
        return var3;
    }
}
