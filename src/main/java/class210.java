import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class210 extends class84 {

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    private int field3358 = 4096;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    private int field3360 = 4096;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "[I")
    private int[] field3372 = new int[3];

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    private int field3365 = 4096;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
    private int field3374 = 409;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "Ljava/util/Random;")
    public static Random field3364 = new Random();

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "Ljava/lang/String;")
    public static String field3375 = "Loaded update list";

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field3373 = 0;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "Z")
    public static boolean field3369 = false;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field3377 = "Loaded title screen";

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "Lsi;")
    public static class204 field3368;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "Llc;")
    public static class86 field3367;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        ++field3362;
        if (arg1 <= 87) {
            this.field3358 = -38;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg0.method1128((byte) -114);
                            this.field3372[1] = class179.method1337(var5 >> 4, 4080);
                            this.field3372[0] = class179.method1337(var5 << 4, 267386880);
                            this.field3372[2] = class179.method1337(255, var5) >> 12;
                        }
                    } else {
                        this.field3360 = arg0.method1126(false);
                    }
                } else {
                    this.field3365 = arg0.method1126(false);
                }
            } else {
                this.field3358 = arg0.method1126(false);
            }
        } else {
            this.field3374 = arg0.method1126(false);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
    public static final int method1530(int arg0, int arg1) {
        ++field3366;
        if (arg1 == 16711935) {
            return -1;
        } else {
            int var2 = -1 / ((63 - arg0) / 46);
            return class161.method1204(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V")
    public static final void method1531(int arg0) {
        class120.method874(255);
        ++field3361;
        class268.method1864(29);
        class132.method959(112);
        class272.method1885(14);
        class113.method835(65536);
        class225.method1614(-127);
        class84.method607(14);
        class275.method1905(54);
        class101.method764(-4268);
        class202.method1484((byte) 72);
        class85.method613(104);
        class52.method395(0);
        int var1 = -93 / ((arg0 - 38) / 60);
        class239.method1678(-102);
        class21.method137((byte) 106);
        class12.method96(16777215);
        class242.method1690(1);
        class288.method1957((byte) -47);
        class113.method823(10630);
        if (~class56.field809 != -1) {
            for (int var2 = 0; class253.field4170.length > var2; ++var2) {
                class253.field4170[var2] = null;
            }
            class288.field4577 = 0;
        }
        class180.method1343(-16020);
        class200.method1470(-119);
        class168.field2703.method1556((byte) 67);
        ((class32) class47.field689).method230(26075);
        class149.field2433.method308((byte) -92);
        class193.field3110.method649(false);
        class281.field4478.method649(false);
        class143.field2325.method649(false);
        class257.field4235.method649(false);
        class159.field2599.method649(false);
        class81.field1173.method649(false);
        class114.field1646.method649(false);
        class90.field1337.method649(false);
        class125.field1841.method649(false);
        class276.field4428.method649(false);
        class245.field4033.method649(false);
        class161.field2635.method1556((byte) 112);
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "(I)I")
    public static final int method1532(int arg0) {
        ++field3371;
        if (arg0 != -11711) {
            field3367 = null;
        }
        return class171.field2761 && class285.field4512[81] && ~class243.field3890 < -3 ? class82.field1186[class243.field3890 - 2] : class82.field1186[class243.field3890 + -1];
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
    public static void method1533(byte arg0) {
        field3377 = null;
        field3367 = null;
        field3368 = null;
        field3375 = null;
        field3364 = null;
        if (arg0 != -113) {
            field3375 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BIIZIIIIII)V")
    public static final void method1534(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3359;
        int var10 = arg2 - arg6;
        int var11 = -arg8 + arg4;
        int var12 = (arg5 - arg9 << 16) / var11;
        if (arg0 < -106) {
            int var13 = (-arg7 + arg1 << 16) / var10;
            class253.method1797(arg2, arg9, arg6, (byte) 113, arg7, var13, arg4, 0, var12, 0, arg8, arg3);
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class210() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field3376;
        if (arg1 != -18) {
            this.field3360 = 109;
        }
        int[][] var3 = super.field1211.method193((byte) -124, arg0);
        if (super.field1211.field321) {
            int[][] var4 = this.method611(0, (byte) -28, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class20.field221; ++var11) {
                int var12 = var6[var11];
                int var13 = var12 - this.field3372[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field3374 < var13) {
                    var9[var11] = var12;
                    var8[var11] = var5[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = -this.field3372[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field3374 < var15) {
                        var9[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3372[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 > this.field3374) {
                            var9[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var9[var11] = this.field3360 * var12 >> 12;
                            var8[var11] = this.field3365 * var14 >> 12;
                            var10[var11] = this.field3358 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
