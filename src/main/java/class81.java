import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class81 extends class145 {

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    private int field1197 = 4096;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    private int field1199 = 3216;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "[I")
    private int[] field1198 = new int[3];

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    private int field1205 = 3216;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "Lik;")
    public static class410 field1207 = new class410(10);

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        ++field1204;
        if (arg0 == 77) {
            this.method742(1);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field1202;
        int var3 = 45 % ((arg1 - 16) / 49);
        int[] var4 = super.field2218.method1614(80, arg0);
        if (super.field2218.field3396) {
            int var5 = class190.field2733 * this.field1197 >> 12;
            int[] var6 = this.method1119(0, 0, arg0 + -1 & class402.field5610);
            int[] var7 = this.method1119(0, 0, arg0);
            int[] var8 = this.method1119(0, 0, class402.field5610 & arg0 - -1);
            for (int var9 = 0; var9 < class156.field2364; ++var9) {
                int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                int var11 = (var7[var9 + -1 & class40.field606] + -var7[var9 - -1 & class40.field606]) * var5 >> 12;
                int var12 = var11 >> 4;
                int var13 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                if (~var13 < -256) {
                    var13 = 255;
                }
                int var14 = 255 & class401.field5602[((var13 - -1) * var13 >> 1) + var12];
                int var15 = var10 * var14 >> 8;
                int var16 = var11 * var14 >> 8;
                int var17 = var14 * 4096 >> 8;
                int var18 = this.field1198[0] * var16 >> 12;
                int var19 = this.field1198[1] * var15 >> 12;
                int var20 = this.field1198[2] * var17 >> 12;
                var4[var9] = var18 + var20 + var19;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
    public static void method741(int arg0) {
        field1207 = null;
        if (arg0 != -1) {
            field1200 = 65;
        }
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
    private final void method742(int arg0) {
        ++field1206;
        double var2 = Math.cos((double) ((float) this.field1199 / 4096.0F));
        this.field1198[0] = (int) (4096.0D * Math.sin((double) ((float) this.field1205 / 4096.0F)) * var2);
        this.field1198[arg0] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field1205 / 4096.0F)));
        this.field1198[2] = (int) (Math.sin((double) ((float) this.field1199 / 4096.0F)) * 4096.0D);
        int var4 = this.field1198[0] * this.field1198[0] >> 12;
        int var5 = this.field1198[1] * this.field1198[1] >> 12;
        int var6 = this.field1198[2] * this.field1198[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field1198[0] = (this.field1198[0] << 12) / var7;
            this.field1198[1] = (this.field1198[1] << 12) / var7;
            this.field1198[2] = (this.field1198[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BZIII)V")
    public static final void method743(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class30.field504 = 0L;
        ++field1203;
        int var5 = class76.method651(-120);
        if (arg0 <= -97) {
            if (~arg3 == -4 || var5 == 3) {
                arg1 = true;
            }
            if (!class249.field3415.method99()) {
                arg1 = true;
            }
            class336.method2124((byte) -23, arg3, var5, arg2, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class81() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZIIII)V")
    public static final void method744(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 == -21270) {
            if (arg0 < 1) {
                arg0 = 1;
            }
            if (arg3 < 1) {
                arg3 = 1;
            }
            ++field1201;
            int var6 = arg0 + -334;
            if (var6 >= 0) {
                if (~var6 < -101) {
                    var6 = 100;
                }
            } else {
                var6 = 0;
            }
            int var7 = (class316.field4292 - class15.field136) * var6 / 100 + class15.field136;
            if (var7 < class102.field1510) {
                var7 = class102.field1510;
            } else if (~class38.field581 > ~var7) {
                var7 = class38.field581;
            }
            int var8 = arg0 * 512 * var7 / (arg3 * 334);
            if (var8 >= class401.field5603) {
                if (var8 > class415.field5813) {
                    short var9 = class415.field5813;
                    var7 = arg3 * 334 * var9 / (arg0 * 512);
                    if (~class102.field1510 < ~var7) {
                        var7 = class102.field1510;
                        int var10 = arg3 * var9 * 334 / (var7 * 512);
                        int var11 = (-var10 + arg0) / 2;
                        if (arg1) {
                            class249.field3415.method122();
                            class249.field3415.method2414(arg5, arg2, var11, true, arg3, -16777216);
                            class249.field3415.method2414(-var11 + arg0 + arg5, arg2, var11, true, arg3, -16777216);
                        }
                        arg5 += var11;
                        arg0 -= var11 * 2;
                    }
                }
            } else {
                short var12 = class401.field5603;
                var7 = arg3 * var12 * 334 / (arg0 * 512);
                if (~class38.field581 > ~var7) {
                    var7 = class38.field581;
                    int var13 = arg0 * 512 * var7 / (var12 * 334);
                    int var14 = (-var13 + arg3) / 2;
                    if (arg1) {
                        class249.field3415.method122();
                        class249.field3415.method2414(arg5, arg2, arg0, true, var14, -16777216);
                        class249.field3415.method2414(arg5, -var14 + arg3 + arg2, arg0, true, var14, -16777216);
                    }
                    arg3 -= var14 * 2;
                    arg2 += var14;
                }
            }
            class131.field1860 = arg5;
            class128.field1813 = (short) arg3;
            class163.field2411 = arg0 * var7 / 334;
            class285.field3814 = (short) arg0;
            class394.field5511 = arg2;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1199 = arg0.method1853(123);
                }
            } else {
                this.field1205 = arg0.method1853(-127);
            }
        } else {
            this.field1197 = arg0.method1853(88);
        }
        int var5 = 71 / ((11 - arg1) / 52);
        ++field1208;
    }
}
