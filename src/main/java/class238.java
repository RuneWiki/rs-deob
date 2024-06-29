import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class238 extends class335 {

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    private int field3788 = 4096;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3787 = " has logged out.";

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "[I")
    public static int[] field3791 = new int[14];

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "Z")
    public static boolean field3786 = false;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3782;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)[I", line = 7)
    public final int[] method149(int arg0, int arg1) {
        field3793++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (arg1 != 621) {
            method1662(23, -14);
        }
        if (this.field5233.field2467) {
            int[] var4 = this.method2330(class227.field3597 & arg0 - 1, true, 0);
            int[] var5 = this.method2330(arg0, true, 0);
            int[] var6 = this.method2330(arg0 + 1 & class227.field3597, true, 0);
            for (int var7 = 0; var7 < class105.field1630; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field3788;
                int var9 = (var5[var7 + 1 & class244.field3906] - var5[class244.field3906 & var7 - 1]) * this.field3788;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 60)
    public class238() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)I", line = 71)
    public static final int method1660(byte arg0) {
        field3792++;
        try {
            if (class12.field190 == 0) {
                if (class102.method743((byte) 111) - 5000L < class29.field425) {
                    return 0;
                }
                class341.field5324 = class32.field471.method1286(class106.field1648, class315.field4910, arg0 - 169);
                class44.field695 = class102.method743((byte) 124);
                class12.field190 = 1;
            }
            if (arg0 != 58) {
                return 13;
            } else if (class102.method743((byte) 84) <= class44.field695 + 30000L) {
                if (class12.field190 == 1) {
                    if (class341.field5324.field2956 == 2) {
                        return class46.method407(1001, -1);
                    }
                    if (class341.field5324.field2956 != 1) {
                        return -1;
                    }
                    class295.field4568 = new class43((Socket) class341.field5324.field2959, class32.field471);
                    class106.field1642.field2532 = 0;
                    int var1 = 0;
                    class341.field5324 = null;
                    if (class47.field774) {
                        var1 = class208.field3186;
                    }
                    class106.field1642.method1132((byte) 29, 23);
                    class106.field1642.method1174((byte) -32, var1);
                    class295.field4568.method370(1, class106.field1642.field2500, 0, class106.field1642.field2532);
                    if (class315.field4917 != null) {
                        class315.field4917.method220(1);
                    }
                    if (class17.field243 != null) {
                        class17.field243.method220(1);
                    }
                    int var2 = class295.field4568.method373(-82);
                    if (class315.field4917 != null) {
                        class315.field4917.method220(arg0 ^ 0x3B);
                    }
                    if (class17.field243 != null) {
                        class17.field243.method220(1);
                    }
                    if (var2 != 0) {
                        return class46.method407(var2, -1);
                    }
                    class12.field190 = 2;
                }
                if (class12.field190 == 2) {
                    if (class295.field4568.method366(88) < 2) {
                        return -1;
                    }
                    class96.field1534 = class295.field4568.method373(-70);
                    class96.field1534 <<= 0x8;
                    class96.field1534 += class295.field4568.method373(-80);
                    class12.field190 = 3;
                    class129.field2031 = 0;
                    class52.field875 = new byte[class96.field1534];
                }
                if (class12.field190 != 3) {
                    return -1;
                }
                int var3 = class295.field4568.method366(arg0 + 16);
                if (var3 < 1) {
                    return -1;
                }
                if (var3 > class96.field1534 - class129.field2031) {
                    var3 = class96.field1534 - class129.field2031;
                }
                class295.field4568.method367((byte) 114, var3, class129.field2031, class52.field875);
                class129.field2031 += var3;
                if (class96.field1534 > class129.field2031) {
                    return -1;
                } else if (class242.method1677(class52.field875, -3)) {
                    class119.field1825 = new class341[class95.field1525];
                    int var4 = 0;
                    for (int var5 = class323.field5043; var5 <= class327.field5090; var5++) {
                        class341 var6 = class179.method1271(-110, var5);
                        if (var6 != null) {
                            class119.field1825[var4++] = var6;
                        }
                    }
                    class295.field4568.method365(1);
                    class12.field190 = 0;
                    class52.field875 = null;
                    class295.field4568 = null;
                    class214.field3261 = 0;
                    class29.field425 = class102.method743((byte) 103);
                    return 0;
                } else {
                    return class46.method407(1002, arg0 - 59);
                }
            } else {
                return class46.method407(1000, -1);
            }
        } catch (IOException var8) {
            return class46.method407(1003, arg0 - 59);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lsm;Lsm;I)V", line = 211)
    public static final void method1661(class46 arg0, class46 arg1, int arg2) {
        if (arg1.field756 != null) {
            arg1.method403(1);
        }
        arg1.field756 = arg0.field756;
        arg1.field754 = arg0;
        arg1.field756.field754 = arg1;
        field3785++;
        if (arg2 > 40) {
            arg1.field754.field756 = arg1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILkh;I)V", line = 232)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg2 >= 51) {
            field3783++;
            if (arg0 == 0) {
                this.field3788 = arg1.method1151(-103);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)I", line = 250)
    public static final int method1662(int arg0, int arg1) {
        if (arg1 != -17999) {
            field3782 = (Canvas) null;
        }
        field3784++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V", line = 263)
    public static void method1663(int arg0) {
        field3782 = null;
        field3791 = null;
        if (arg0 < 44) {
            field3781 = -55;
        }
        field3787 = null;
    }
}
