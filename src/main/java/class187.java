import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class187 extends class4 {

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
    private int field2406 = 1024;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
    private int field2411 = 2048;

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "I")
    private int field2414 = 3072;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    public static int field2410 = -1;

    @OriginalMember(owner = "client!ut", name = "N", descriptor = "Z")
    public static boolean field2415 = false;

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ut", name = "O", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field2412;
        if (arg0 > -89) {
            method1150(-6, 40, (String) null);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field44 = arg1.method3045(-125) == 1;
                }
            } else {
                this.field2414 = arg1.method3090(-77);
            }
        } else {
            this.field2406 = arg1.method3090(-75);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 >= -83) {
            this.field2414 = 76;
        }
        ++field2409;
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (super.field38.field7618) {
            int[][] var4 = this.method22(arg0, (byte) -119, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class132.field1627 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field2411 >> 12) + this.field2406;
                var9[var11] = this.field2406 - -(var6[var11] * this.field2411 >> 12);
                var10[var11] = (var7[var11] * this.field2411 >> 12) + this.field2406;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 == -9) {
            ++field2416;
            this.field2411 = -this.field2406 + this.field2414;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field2408;
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            int[] var4 = this.method20(0, -21986, arg1);
            for (int var5 = 0; ~var5 > ~class132.field1627; ++var5) {
                var3[var5] = this.field2406 - -(var4[var5] * this.field2411 >> 12);
            }
        }
        if (arg0 != 10) {
            this.field2411 = -83;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1150(int arg0, int arg1, String arg2) {
        int var3 = -45 % ((-62 - arg1) / 55);
        ++field2413;
        int var4 = class512.field7133;
        int[] var5 = class514.field7144;
        boolean var6 = false;
        for (int var7 = 0; ~var4 < ~var7; ++var7) {
            class20 var8 = class364.field5092[var5[var7]];
            if (var8 != null && class147.field1899 != var8 && var8.field257 != null && var8.field257.equalsIgnoreCase(arg2)) {
                var6 = true;
                if (arg0 == 1) {
                    ++class110.field1423;
                    class118.method650(true, class30.field477);
                    class272.field3457.method3060(0, -25098);
                    class272.field3457.method3082(var5[var7], 128);
                } else if (arg0 != 4) {
                    if (arg0 == 5) {
                        class118.method650(true, class254.field3156);
                        ++class33.field494;
                        class272.field3457.method3082(var5[var7], 128);
                        class272.field3457.method3080(-93, 0);
                    } else if (arg0 != 6) {
                        if (arg0 == 7) {
                            ++class118.field1490;
                            class118.method650(true, class640.field9276);
                            class272.field3457.method3061(5327, 0);
                            class272.field3457.method3044(74, var5[var7]);
                        }
                    } else {
                        ++class18.field201;
                        class118.method650(true, class15.field157);
                        class272.field3457.method3082(var5[var7], 128);
                        class272.field3457.method3061(5327, 0);
                    }
                } else {
                    ++class201.field2633;
                    class118.method650(true, class634.field9220);
                    class272.field3457.method3082(var5[var7], 128);
                    class272.field3457.method3080(-77, 0);
                }
                break;
            }
        }
        if (!var6) {
            class534.method2970(class238.field3048.method2157(class245.field3103, 4074) + arg2, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
    public class187() {
        super(1, false);
    }
}
