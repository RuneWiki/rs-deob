import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class123 {

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZ)Z", line = 3)
    public static final boolean method727(int arg0, boolean arg1) {
        if (arg1) {
            field1644++;
            return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(BLel;[[B)V", line = 14)
    public static final void method728(byte arg0, class752 arg1, byte[][] arg2) {
        field1646++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg1.field7591; var4++) {
            class204.method1385(arg0 + 99);
            for (int var9 = 0; var9 < class240.field3280 >> 3; var9++) {
                for (int var10 = 0; var10 < (class276.field3602 >> 3); var10++) {
                    int var11 = class788.field10788[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = var11 >> 24 & 0x3;
                        if (!arg1.field7571 || var12 == 0) {
                            int var13 = (var11 & 0x7) >> 1;
                            int var14 = (var11 & 0xFFE143) >> 14;
                            int var15 = var11 >> 3 & 0x7FF;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class644.field8240.length; var17++) {
                                if (class644.field8240[var17] == var16 && arg2[var17] != null) {
                                    class234 var18 = new class234(arg2[var17]);
                                    arg1.method3221(var12, var15, var18, var13, -98, class179.field2391, var9 * 8, var14, var4, var10 * 8);
                                    arg1.method4077(var18, var12, class576.field7320, var3[0] == -1 ? var3 : null, var15, var13, var10 * 8, 113, var14, var9 * 8, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 13) {
            return;
        }
        for (int var5 = 0; var5 < arg1.field7591; var5++) {
            class204.method1385(95);
            for (int var6 = 0; var6 < (class240.field3280 >> 3); var6++) {
                for (int var7 = 0; var7 < (class276.field3602 >> 3); var7++) {
                    int var8 = class788.field10788[var5][var6][var7];
                    if (var8 == -1) {
                        arg1.method3227(8, var5, var6 * 8, var7 * 8, 3, 8);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class38.field430 = class55.field708.method3871((byte) -121, var3[3], var3[1], var3[2], var3[0], class526.field6688);
            class313.field3898 = var3[4];
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 131)
    public static final void method729(String arg0, boolean arg1, int arg2) {
        String var3 = arg0.toLowerCase();
        field1645++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class389.field4977.field6588 : class389.field4977.field6587);
        if (arg2 != -9589) {
            method728((byte) 93, null, null);
        }
        for (int var8 = var6; var8 < var7; var8++) {
            class104 var11 = class389.field4977.method2859((byte) -106, var8);
            if (var11.field1403 && var11.method610(-8275).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class33.field377 = null;
                    class609.field7700 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class609.field7700 = var5;
        class33.field377 = var4;
        class545.field6821 = 0;
        String[] var9 = new String[class609.field7700];
        for (int var10 = 0; var10 < class609.field7700; var10++) {
            var9[var10] = class389.field4977.method2859((byte) -115, var4[var10]).method610(arg2 + 1314);
        }
        class304.method1799(class33.field377, 0, var9);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZIILjava/lang/String;)V", line = 206)
    public static final void method730(boolean arg0, int arg1, int arg2, String arg3) {
        class573.method3087(arg1 - 19770);
        if (arg1 != 19892) {
            return;
        }
        field1647++;
        class719.method3858(-116);
        class515.method2853((byte) 112);
        class560.method3034(arg3, (byte) -123, arg0, arg2);
        class90.method545(-98);
        class419.method2415(class576.field7320, arg1 - 8175);
        class304.method1798((byte) -105, class576.field7320);
        class192.method1341(class172.field2270, class576.field7320, 0);
        class13.method56(arg1 - 19893);
        class742.method4035((byte) 96, class662.field8639);
        class135.method783(0);
        class723.method3873(false);
        if (class332.field4052 == 3) {
            class26.method113((byte) 95, 4);
        } else if (class332.field4052 == 7) {
            class26.method113((byte) 95, 8);
        } else if (class332.field4052 == 10) {
            class26.method113((byte) 95, 11);
        } else if (class332.field4052 == 1 || class332.field4052 == 2) {
            class516.method2854(0);
        }
    }
}
