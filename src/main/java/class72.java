import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class72 extends class573 {

    @OriginalMember(owner = "client!haa", name = "W", descriptor = "I")
    private int field1505 = -1;

    @OriginalMember(owner = "client!haa", name = "K", descriptor = "Llk;")
    public static class545 field1494 = null;

    @OriginalMember(owner = "client!haa", name = "T", descriptor = "[S")
    public static short[] field1502 = new short[256];

    @OriginalMember(owner = "client!haa", name = "M", descriptor = "Lju;")
    public static class111 field1495 = new class111("WTWIP", 3);

    @OriginalMember(owner = "client!haa", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field1506 = new String[100];

    @OriginalMember(owner = "client!haa", name = "I", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!haa", name = "J", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!haa", name = "O", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client!haa", name = "P", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!haa", name = "Q", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!haa", name = "R", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!haa", name = "S", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!haa", name = "U", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client!haa", name = "V", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!haa", name = "N", descriptor = "[I")
    private int[] field1496;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        if (arg0 >= -116) {
            this.method442(59, -128);
        }
        ++field1492;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (super.field8320.field3295) {
            int var4 = (class419.field6037 == this.field1497 ? arg1 : this.field1497 * arg1 / class419.field6037) * this.field1503;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class540.field7555 == this.field1503) {
                for (int var8 = 0; var8 < class540.field7555; ++var8) {
                    int var9 = this.field1496[var4++];
                    var7[var8] = class481.method2919(var9 << 4, 4080);
                    var6[var8] = class481.method2919(var9 >> 4, 4080);
                    var5[var8] = class481.method2919(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class540.field7555; ++var10) {
                    int var11 = this.field1503 * var10 / class540.field7555;
                    int var12 = this.field1496[var4 + var11];
                    var7[var10] = class481.method2919(var12 << 4, 4080);
                    var6[var10] = class481.method2919(var12 >> 4, 4080);
                    var5[var10] = class481.method2919(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V")
    public class72() {
        super(0, false);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IBI)V")
    public final void method790(int arg0, byte arg1, int arg2) {
        int var4 = -75 / ((69 - arg1) / 40);
        ++field1504;
        super.method790(arg0, (byte) -47, arg2);
        if (this.field1505 >= 0 && class350.field5256 != null) {
            int var5 = !class350.field5256.method1500(this.field1505, -43).field9836 ? 128 : 64;
            this.field1496 = class350.field5256.method1495(this.field1505, false, 1.0F, var5, var5, 32682);
            this.field1503 = var5;
            this.field1497 = var5;
        }
    }

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "(I)V")
    public final void method671(int arg0) {
        super.method671(arg0);
        ++field1500;
        this.field1496 = null;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 != -393) {
            method792(-104, 95, 72, true, 57, -24);
        }
        if (arg3 == arg4 && arg2 == arg9 && ~arg0 == ~arg6 && arg5 == arg7) {
            class316.method2042(arg3, arg7, arg1, arg9, arg0, -1);
        } else {
            int var10 = arg3;
            int var11 = arg9;
            int var12 = arg3 * 3;
            int var13 = arg9 * 3;
            int var14 = arg4 * 3;
            int var15 = arg2 * 3;
            int var16 = arg6 * 3;
            int var17 = arg5 * 3;
            int var18 = -var16 + var14 + arg0 + -arg3;
            int var19 = arg7 - var17 - (-var15 + arg9);
            int var20 = var16 - -var12 + -var14 + -var14;
            int var21 = var13 + var17 - (var15 - -var15);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg3;
                int var34 = (var28 + var30 - -var32 >> 12) + arg9;
                class316.method2042(var10, var34, arg1, var11, var33, -1);
                var10 = var33;
                var11 = var34;
            }
        }
        ++field1499;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field1505 = arg0.method723((byte) -25);
        }
        if (arg2 != 3) {
            method794(47);
        }
        ++field1493;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIZII)V")
    public static final void method792(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (class413.field5977 != null && (arg2 != 3 || class527.field7429.field2661 != arg1 || ~class527.field7429.field2670 != ~arg0)) {
            class291.method1945(class604.field8775, (byte) -65, class413.field5977);
            class413.field5977 = null;
        }
        ++field1498;
        if (arg2 == 3 && class413.field5977 == null) {
            class413.field5977 = class272.method1777(0, class604.field8775, 0, arg0, arg1, (byte) -126);
            if (class413.field5977 != null) {
                class527.field7429.field2670 = arg0;
                class527.field7429.field2661 = arg1;
                class527.field7429.method2809(class604.field8775, (byte) 125);
            }
        }
        if (~arg2 == -4 && class413.field5977 == null) {
            method792(-1, -1, class527.field7429.field2653, true, arg4, arg5);
        } else {
            Container var6;
            if (class413.field5977 == null) {
                if (class112.field2017 == null) {
                    if (class416.field6017 != null) {
                        var6 = class416.field6017;
                    } else {
                        var6 = class369.field5463;
                    }
                    class513.field7237 = var6.getSize().width;
                    class193.field3033 = var6.getSize().height;
                } else {
                    Insets var7 = class112.field2017.getInsets();
                    class513.field7237 = class112.field2017.getSize().width + -var7.right + -var7.left;
                    int var10001 = -var7.top;
                    class193.field3033 = class112.field2017.getSize().height + var10001 + -var7.bottom;
                    var6 = class112.field2017;
                }
            } else {
                class513.field7237 = arg1;
                class193.field3033 = arg0;
                var6 = class413.field5977;
            }
            if (arg2 != 1) {
                class130.method1100((byte) 92);
            } else {
                class594.field8553 = (-class575.field8355 + class513.field7237) / 2;
                class506.field7173 = class575.field8355;
                class310.field4626 = class693.field9762;
                class139.field2459 = 0;
            }
            if (class625.field9027 != class36.field1029) {
                boolean var10000;
                if (~class506.field7173 > -1025 && ~class310.field4626 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (arg3) {
                class444.method2673(arg4);
            } else {
                class699.field9853.setSize(class506.field7173, class310.field4626);
                class623.field9017.method44(class699.field9853);
                if (class112.field2017 == var6) {
                    Insets var8 = class112.field2017.getInsets();
                    class699.field9853.setLocation(var8.left - -class594.field8553, class139.field2459 + var8.top);
                } else {
                    class699.field9853.setLocation(class594.field8553, class139.field2459);
                }
            }
            if (~arg2 <= -3) {
                class203.field3129 = true;
            } else {
                class203.field3129 = false;
            }
            if (~class361.field5368 != 0) {
                class268.method1751(true, false);
            }
            if (class165.field2755 != null && class156.method1205(-11, class199.field3098)) {
                class37.method546(arg4 ^ 12655);
            }
            for (int var9 = arg4; ~var9 > -101; ++var9) {
                class248.field3731[var9] = true;
            }
            class153.field2605 = true;
        }
    }

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "(I)I")
    public final int method793(int arg0) {
        if (arg0 != 967) {
            return 112;
        } else {
            ++field1501;
            return this.field1505;
        }
    }

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "(I)V")
    public static void method794(int arg0) {
        field1494 = null;
        field1506 = null;
        field1495 = null;
        if (arg0 != 128) {
            method791(-114, 9, -73, -30, 12, 9, -71, -76, 3, -27);
        }
        field1502 = null;
    }
}
