import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class395 extends class175 {

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    private int field5684 = 16;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    private int field5680 = 0;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    private int field5687 = 0;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    private int field5688 = 2000;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    private int field5682 = 4096;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field5683;
            int[] var3 = super.field2310.method91(0, arg1);
            if (super.field2310.field169) {
                int var4 = this.field5682 >> 1;
                int[][] var5 = super.field2310.method93(22563);
                Random var6 = new Random((long) this.field5687);
                for (int var7 = 0; ~this.field5688 < ~var7; ++var7) {
                    int var8 = ~this.field5682 < -1 ? this.field5680 - (-class594.method3335(this.field5682, false, var6) - -var4) : this.field5680;
                    int var9 = 255 & var8 >> 4;
                    int var10 = class594.method3335(class598.field8136, !arg0, var6);
                    int var11 = class594.method3335(class561.field7687, false, var6);
                    int var12 = (class10.field123[var9] * this.field5684 >> 12) + var10;
                    int var13 = (class344.field4821[var9] * this.field5684 >> 12) + var11;
                    int var14 = -var11 + var13;
                    int var15 = -var10 + var12;
                    if (~var15 != -1 || var14 != 0) {
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~var14 > -1) {
                            var14 = -var14;
                        }
                        boolean var16 = ~var15 > ~var14;
                        if (var16) {
                            int var17 = var10;
                            int var18 = var12;
                            var10 = var11;
                            var11 = var17;
                            var12 = var13;
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
                        int var23 = var13 - var11;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = -(class594.method3335(4096, false, var6) >> 2) + 1024;
                        if (var23 < 0) {
                            var23 = -var23;
                        }
                        int var27 = var11 >= var13 ? -1 : 1;
                        for (int var28 = var10; var28 < var12; ++var28) {
                            int var29 = (var28 - var10) * var25 + 1024 + var26;
                            int var30 = class412.field5896 & var28;
                            int var31 = class698.field9254 & var21;
                            if (!var16) {
                                var5[var30][var31] = var29;
                            } else {
                                var5[var31][var30] = var29;
                            }
                            var24 += var23;
                            if (var24 > 0) {
                                var24 -= var22;
                                var21 += var27;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZILha;Ld;II)V")
    public static final void method2424(int arg0, boolean arg1, int arg2, class66 arg3, class161 arg4, int arg5, int arg6) {
        if (class286.field4101 < 100) {
            class613.method3412(arg3, -57, arg4);
        }
        ++field5681;
        arg3.method453(arg6, arg2, arg5 + arg6, arg2 - -arg0);
        if (class286.field4101 < 100) {
            byte var7 = 20;
            int var8 = arg5 / 2 + arg6;
            arg3.method434(arg6, arg2, arg5, arg0, -16777216, 0);
            int var9 = -var7 + arg2 - -(arg0 / 2) + -18;
            arg3.method539(var8 - 152, var9, 304, 34, class113.field1538[class253.field3719].getRGB(), 0);
            arg3.method434(var8 - 150, var9 - -2, class286.field4101 * 3, 30, class325.field4619[class253.field3719].getRGB(), 0);
            class88.field1251.method561(class689.field9210[class253.field3719].getRGB(), class58.field715.method365(class55.field647, (byte) 94), -1, 120, var7 + var9, var8);
        } else {
            int var10 = -((int) ((float) arg5 / class752.field10166)) + class720.field9789;
            int var11 = (int) ((float) arg0 / class752.field10166) + class81.field1129;
            int var12 = class720.field9789 - -((int) ((float) arg5 / class752.field10166));
            class789.field10840 = (int) ((float) (arg0 * 2) / class752.field10166);
            int var13 = -((int) ((float) arg0 / class752.field10166)) + class81.field1129;
            class386.field5609 = (int) ((float) (arg5 * 2) / class752.field10166);
            class322.field4581 = -((int) ((float) arg5 / class752.field10166)) + class720.field9789;
            if (arg1) {
                class709.field9696 = -((int) ((float) arg0 / class752.field10166)) + class81.field1129;
                class752.method4126(class752.field10177 + var10, class752.field10178 + var11, class752.field10177 + var12, class752.field10178 + var13, arg6, arg2, arg5 + arg6, arg0 + arg2 + 1);
                class752.method4121(arg3);
                class84 var14 = class752.method4123(arg3);
                class419.method2513(arg3, 0, (byte) 112, 0, var14);
                if (class419.field6021 > 0) {
                    --class7.field54;
                    if (class7.field54 == 0) {
                        class7.field54 = 20;
                        --class419.field6021;
                    }
                }
                if (class275.field3992) {
                    int var15 = arg6 + -5 - -arg5;
                    int var16 = arg2 + -8 + arg0;
                    class166.field2202.method560(var16, var15, (byte) 125, -1, 16776960, "Fps:" + class697.field9248);
                    int var20 = var16 - 15;
                    Runtime var17 = Runtime.getRuntime();
                    int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
                    int var19 = 16776960;
                    if (var18 > 65536) {
                        var19 = 16711680;
                    }
                    class166.field2202.method560(var20, var15, (byte) 125, -1, var19, "Mem:" + var18 + "k");
                    var16 = var20 - 15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class395() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field5689;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.field5682 = arg1.method1728((byte) 14);
                        }
                    } else {
                        this.field5680 = arg1.method1728((byte) 7);
                    }
                } else {
                    this.field5684 = arg1.method1731((byte) 64);
                }
            } else {
                this.field5688 = arg1.method1728((byte) 39);
            }
        } else {
            this.field5687 = arg1.method1731((byte) 64);
        }
        if (arg2) {
            this.method44(-111, (class254) null, false);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        if (arg0 == -8) {
            class647.method3595((byte) -100);
            ++field5685;
        }
    }
}
