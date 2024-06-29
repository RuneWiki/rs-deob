import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class216 {

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field3440 = 0;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
    public static int[] field3446 = new int[2];

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3448 = "Started 3d Library";

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lll;")
    public static class222 field3439;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "[[[B")
    public static byte[][][] field3442;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static final void method1508(int arg0) {
        field3443++;
        if (class284.field4754) {
            return;
        }
        class87.field1355 = true;
        class284.field4754 = true;
        if (arg0 > -117) {
            return;
        }
        if (class74.field1123) {
            class202.field3253 = (float) ((int) class202.field3253 - 65 & 0xFFFFFF80);
        } else {
            class292.field4822 += (-class292.field4822 - 24.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static final void method1509(byte arg0) {
        class220.field3525 = false;
        class263.field4337 = -1;
        if (arg0 != -52) {
            method1512((byte) -40);
        }
        class50.field680 = -1;
        class18.field251 = 0;
        class310.field5016 = 0;
        class20.field272 = 0;
        class313.field5040 = -1;
        field3447++;
        class296.field4871 = 0;
        class276.field4572.field3272 = 0;
        class223.field3548 = -1;
        class192.field3042.field3272 = 0;
        class82.method553((byte) 0);
        for (int var1 = 0; var1 < class300.field4925.length; var1++) {
            if (class300.field4925[var1] != null) {
                class300.field4925[var1].field814 = -1;
            }
        }
        for (int var2 = 0; var2 < class76.field1188.length; var2++) {
            if (class76.field1188[var2] != null) {
                class76.field1188[var2].field814 = -1;
            }
        }
        class288.method2021((byte) 88);
        class92.field1402 = 1;
        class229.method1614(30, arg0 + 80);
        for (int var3 = 0; var3 < 100; var3++) {
            class283.field4731[var3] = true;
        }
        class208.method1481(arg0 ^ 0xFFFFFF3F);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Ltd;")
    public static final class74 method1510(int arg0, int arg1) {
        field3445++;
        class74 var2 = (class74) class66.field974.method149((byte) -67, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class162.field2555.method1877(class236.method1640(arg0 ^ 0x53, arg1), class74.method471(arg1, true), (byte) 97);
        if (arg0 != 0) {
            return null;
        }
        class74 var4 = new class74();
        var4.field1166 = arg1;
        if (var3 != null) {
            var4.method472((byte) 95, new class202(var3));
        }
        var4.method480(-121);
        if (!class248.field3946 && var4.field1103) {
            var4.field1168 = null;
        }
        if (var4.field1097) {
            var4.field1125 = 0;
            var4.field1092 = false;
        }
        class66.field974.method152(var4, (long) arg1, true);
        return var4;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIBIIZZ)V")
    public static final void method1511(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field3437++;
        if (!arg6 && class113.field1711 == arg4 && class266.field4370 == arg5 && class102.field1537 == arg1 || class165.method1108(0)) {
            return;
        }
        class266.field4370 = arg5;
        class113.field1711 = arg4;
        class102.field1537 = arg1;
        if (class165.method1108(0)) {
            class102.field1537 = 0;
        }
        if (arg7) {
            class229.method1614(28, 28);
        } else {
            class229.method1614(25, 28);
        }
        class152.method1007(true, class250.field3982, (byte) -121);
        int var8 = class254.field4063;
        int var9 = class101.field1517;
        class254.field4063 = (arg5 - 6) * 8;
        class101.field1517 = (arg4 - 6) * 8;
        class189.field2921 = class13.method77(class113.field1711 * 8, class266.field4370 * 8);
        int var10 = class254.field4063 - var8;
        int var11 = class254.field4063;
        class212.field3389 = null;
        int var12 = class101.field1517 - var9;
        int var13 = class101.field1517;
        if (arg7) {
            class14.field195 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class35 var34 = class76.field1188[var17];
                if (var34 != null) {
                    var34.field836 -= var12 * 128;
                    var34.field850 -= var10 * 128;
                    if (var34.field836 >= 0 && var34.field836 <= 13184 && var34.field850 >= 0 && var34.field850 <= 13184) {
                        for (int var35 = 0; var35 < 10; var35++) {
                            var34.field849[var35] -= var12;
                            var34.field804[var35] -= var10;
                        }
                        class76.field1189[class14.field195++] = var17;
                    } else {
                        class76.field1188[var17].method214((class106) null, (byte) -39);
                        class76.field1188[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class35 var15 = class76.field1188[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field849[var16] -= var12;
                        var15.field804[var16] -= var10;
                    }
                    var15.field850 -= var10 * 128;
                    var15.field836 -= var12 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class208 var32 = class300.field4925[var18];
            if (var32 != null) {
                for (int var33 = 0; var33 < 10; var33++) {
                    var32.field849[var33] -= var12;
                    var32.field804[var33] -= var10;
                }
                var32.field836 -= var12 * 128;
                var32.field850 -= var10 * 128;
            }
        }
        class165.field2600 = arg1;
        class309.field5006.method1480(arg0, false, false, arg2);
        int var19 = 59 % ((26 - arg3) / 61);
        byte var20 = 0;
        byte var21 = 104;
        byte var22 = 1;
        if (var12 < 0) {
            var22 = -1;
            var21 = -1;
            var20 = 103;
        }
        byte var23 = 0;
        byte var24 = 1;
        byte var25 = 104;
        if (var10 < 0) {
            var23 = 103;
            var24 = -1;
            var25 = -1;
        }
        for (int var26 = var20; var26 != var21; var26 += var22) {
            for (int var28 = var23; var28 != var25; var28 += var24) {
                int var29 = var10 + var28;
                int var30 = var26 + var12;
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var30 >= 0 && var29 >= 0 && var30 < 104 && var29 < 104) {
                        class239.field3780[var31][var26][var28] = class239.field3780[var31][var30][var29];
                    } else {
                        class239.field3780[var31][var26][var28] = null;
                    }
                }
            }
        }
        for (class210 var27 = (class210) class147.field2309.method1959(205); var27 != null; var27 = (class210) class147.field2309.method1956(74)) {
            var27.field3368 -= var10;
            var27.field3378 -= var12;
            if (var27.field3378 < 0 || var27.field3368 < 0 || var27.field3378 >= 104 || var27.field3368 >= 104) {
                var27.method900(87);
            }
        }
        if (arg7) {
            class53.field715 -= var12 * 128;
            class174.field2724 -= var10 * 128;
            class114.field1716 -= var10;
            class165.field2603 -= var12;
            class139.field2146 -= var12;
            class178.field2767 -= var10;
        } else if (class92.field1402 == 4) {
            class274.field4531 -= var12 * 128;
            class49.field677 -= var10 * 128;
            class302.field4946 -= var12 * 128;
            class118.field1804 -= var10 * 128;
        } else {
            class92.field1402 = 1;
        }
        if (class281.field4649 != 0) {
            class271.field4443 -= var10;
            class281.field4649 -= var12;
        }
        class195.field3109 = 0;
        class124.method826(-1);
        class258.field4233.method1954((byte) 127);
        class10.field125.method1954((byte) 127);
        class77.method515();
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
    public static void method1512(byte arg0) {
        field3442 = null;
        if (arg0 == -40) {
            field3446 = null;
            field3448 = null;
            field3439 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1513(int arg0, Throwable arg1) throws IOException {
        if (arg0 != 0) {
            return null;
        }
        field3444++;
        String var2;
        if ((arg1 instanceof class165)) {
            class165 var3 = (class165) arg1;
            var2 = var3.field2598 + " | ";
            arg1 = var3.field2599;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }
}
