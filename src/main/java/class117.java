import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class117 extends class157 {

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "[I")
    private int[] field2340 = new int[3];

    @OriginalMember(owner = "client!hh", name = "ib", descriptor = "I")
    private int field2356 = 4096;

    @OriginalMember(owner = "client!hh", name = "fb", descriptor = "I")
    private int field2353 = 3216;

    @OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
    private int field2351 = 3216;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field2339 = 0;

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "Z")
    public static boolean field2343 = false;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!hh", name = "eb", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!hh", name = "gb", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!hh", name = "hb", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!hh", name = "jb", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!hh", name = "kb", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2344;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "[I")
    public static int[] field2341;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        ++field2338;
        int var2 = 27 % ((arg0 - -51) / 52);
        this.method828(12890);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field2352;
        int[] var3 = super.field2879.method1269(arg1, 17885);
        if (arg0 != -98) {
            method830(62, -35, 68, 58, -22, (class126) null, 81, -23L, false);
        }
        if (super.field2879.field3363) {
            int var4 = class68.field1293 * this.field2356 >> 12;
            int[] var5 = this.method1097((byte) 75, 0, class42.field859 & arg1 + -1);
            int[] var6 = this.method1097((byte) 75, 0, arg1);
            int[] var7 = this.method1097((byte) 75, 0, class42.field859 & arg1 + 1);
            for (int var8 = 0; ~class226.field4124 < ~var8; ++var8) {
                int var9 = (var6[var8 + -1 & class249.field4490] + -var6[class249.field4490 & var8 + 1]) * var4 >> 12;
                int var10 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var13 = 255 & class87.field1736[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = this.field2340[0] * var15 >> 12;
                int var17 = var10 * var13 >> 8;
                int var18 = this.field2340[2] * var14 >> 12;
                int var19 = this.field2340[1] * var17 >> 12;
                var3[var8] = var16 + var19 - -var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)V")
    private final void method828(int arg0) {
        double var2 = Math.cos((double) ((float) this.field2353 / 4096.0F));
        this.field2340[0] = (int) (4096.0D * Math.sin((double) ((float) this.field2351 / 4096.0F)) * var2);
        if (arg0 != 12890) {
            field2337 = -107;
        }
        ++field2342;
        this.field2340[1] = (int) (var2 * Math.cos((double) ((float) this.field2351 / 4096.0F)) * 4096.0D);
        this.field2340[2] = (int) (Math.sin((double) ((float) this.field2353 / 4096.0F)) * 4096.0D);
        int var4 = this.field2340[2] * this.field2340[2] >> 12;
        int var5 = this.field2340[0] * this.field2340[0] >> 12;
        int var6 = this.field2340[1] * this.field2340[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field2340[0] = (this.field2340[0] << 12) / var7;
            this.field2340[2] = (this.field2340[2] << 12) / var7;
            this.field2340[1] = (this.field2340[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class117() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Lmb;")
    public static final class159 method829(int arg0, int arg1) {
        int var2 = 106 / ((29 - arg1) / 34);
        ++field2347;
        return class80.field1494 && arg0 >= class163.field2951 && ~arg0 >= ~class262.field4725 ? class62.field1232[arg0 - class163.field2951] : null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIILpb;IJZ)Z")
    public static final boolean method830(int arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class23.method193(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "(I)V")
    public static final void method831(int arg0) {
        ++field2346;
        if (class227.field4148 != null) {
            class227.field4148.method54((byte) 94);
        }
        if (class95.field1876 != null) {
            class95.field1876.method54((byte) 29);
        }
        if (arg0 != -413981948) {
            method829(112, 44);
        }
    }

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "(I)V")
    public static final void method832(int arg0) {
        class154.field2805.method665(1);
        if (arg0 != 32527) {
            field2349 = 119;
        }
        class261.field4699.method665(1);
        ++field2355;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILsj;II)Z")
    public static final boolean method833(int arg0, class49 arg1, int arg2, int arg3) {
        ++field2354;
        byte[] var4 = arg1.method353(arg3, -62, arg0);
        if (var4 == null) {
            return false;
        } else {
            class273.method1861((byte) 109, var4);
            return arg2 != 896 ? true : true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 > -29) {
            method830(93, 49, 31, -85, 70, (class126) null, 41, -77L, false);
        }
        ++field2336;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field2353 = arg2.method736(123);
                }
            } else {
                this.field2351 = arg2.method736(122);
            }
        } else {
            this.field2356 = arg2.method736(126);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public static void method834(boolean arg0) {
        field2344 = null;
        field2341 = null;
        if (!arg0) {
            field2358 = -93;
        }
    }
}
