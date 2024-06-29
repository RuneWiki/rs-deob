import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class67 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Lsd;")
    public static class74 field838 = new class74(34, 12);

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Ltl;")
    public static class106 field839 = new class106(0, 0);

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Lss;")
    public static class140 field840 = new class140(3, 14);

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "[I")
    public static int[] field841 = new int[99];

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lpn;")
    public static class72 field842;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "[I")
    public static int[] field843;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method344(int arg0) {
        field841 = null;
        field839 = null;
        field838 = null;
        field843 = null;
        field840 = null;
        if (arg0 != -13) {
            field842 = null;
        }
        field842 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V")
    public static final void method345(byte arg0, int arg1) {
        field836++;
        if (class276.field3945 == null) {
            class276.field3945 = new byte[4][class159.field1895][class289.field4316];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class159.field1895; var3++) {
                for (int var4 = 0; var4 < class289.field4316; var4++) {
                    class276.field3945[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 != 16604) {
            method346(true, (class280) null);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZLoj;)V")
    public static final void method346(boolean arg0, class280 arg1) {
        field837++;
        int var2 = class150.field1822;
        int var3 = class274.field3913;
        int var4 = class345.field4933;
        int var5 = class77.field925 - 3;
        byte var6 = 20;
        if (!arg0) {
            field839 = null;
        }
        if (class230.field3182 == null || class89.field1114 == null) {
            if (class171.field2022.method2758(class168.field1996, -1) && class171.field2022.method2758(class141.field1695, -1)) {
                class230.field3182 = arg1.method1426(class473.method2795(class171.field2022, class168.field1996, 0), true);
                class473 var7 = class473.method2795(class171.field2022, class141.field1695, 0);
                class89.field1114 = arg1.method1426(var7, true);
                var7.method2803();
                class349.field5000 = arg1.method1426(var7, true);
            } else {
                arg1.method1483(var2, var3, var4, var6, 255 - class227.field3162 << 24 | class464.field6531, 1);
            }
        }
        if (class230.field3182 != null && class89.field1114 != null) {
            int var8 = (var4 - (class89.field1114.method220() * 2)) / class230.field3182.method220();
            for (int var9 = 0; var9 < var8; var9++) {
                class230.field3182.method2363(class89.field1114.method220() + var2 + var9 * class230.field3182.method220(), var3);
            }
            class89.field1114.method2363(var2, var3);
            class349.field5000.method2363(var2 + var4 - class349.field5000.method220(), var3);
        }
        class101.field1230.method1132(-1, var3 + 14, var2 - -3, class93.field1151 | 0xFF000000, class440.field6302.method205((byte) 119, class68.field849), -28115);
        arg1.method1483(var2, var3 + var6, var4, var5 - var6, -class227.field3162 + 255 << 24 | class464.field6531, 1);
        int var10 = class278.field3966.method837(-1);
        int var11 = class278.field3966.method838(126);
        int var12 = 0;
        for (class158 var13 = (class158) class485.field6882.method802((byte) 101); var13 != null; var13 = (class158) class485.field6882.method806((byte) 104)) {
            int var30 = var6 + var3 + ((class223.field3099 + -1 + -var12) * 16) + 13;
            var12++;
            if (var2 < var10 && (var2 + var4) > var10 && var11 > (var30 - 13) && var11 < (var30 + 4) && var13.field1878) {
                arg1.method1483(var2, var30 - 12, var4, 16, class63.field784 | 255 - class236.field3265 << 24, 1);
            }
        }
        if ((client.field3922 == null || class190.field2597 == null || class361.field5207 == null) && class171.field2022.method2758(class147.field1784, -1) && class171.field2022.method2758(class381.field5410, -1) && class171.field2022.method2758(class348.field4957, -1)) {
            class473 var14 = class473.method2795(class171.field2022, class381.field5410, 0);
            class190.field2597 = arg1.method1426(var14, true);
            var14.method2803();
            class240.field3305 = arg1.method1426(var14, true);
            client.field3922 = arg1.method1426(class473.method2795(class171.field2022, class147.field1784, 0), true);
            class473 var15 = class473.method2795(class171.field2022, class348.field4957, 0);
            class361.field5207 = arg1.method1426(var15, true);
            var15.method2803();
            class307.field4514 = arg1.method1426(var15, true);
        }
        int var16 = 0;
        if (client.field3922 != null && class190.field2597 != null && class361.field5207 != null) {
            int var17 = (var4 - (class361.field5207.method220() * 2)) / client.field3922.method220();
            for (int var18 = 0; var18 < var17; var18++) {
                client.field3922.method2363(class361.field5207.method220() + var2 + (client.field3922.method220() * var18), var5 + (var3 - client.field3922.method223()));
            }
            int var19 = (var5 - var6 - class361.field5207.method223()) / class190.field2597.method223();
            for (int var20 = 0; var20 < var19; var20++) {
                class190.field2597.method2363(var2, var20 * class190.field2597.method223() + var3 + var6);
                class240.field3305.method2363(var2 + var4 - class240.field3305.method220(), var20 * class190.field2597.method223() + var3 - -var6);
            }
            class361.field5207.method2363(var2, var5 + var3 - class361.field5207.method223());
            class307.field4514.method2363(var2 + var4 - class361.field5207.method220(), var3 - (-var5 - -class361.field5207.method223()));
        }
        for (class158 var21 = (class158) class485.field6882.method802((byte) 116); var21 != null; var21 = (class158) class485.field6882.method806((byte) 104)) {
            int var22 = (class223.field3099 - var16 - 1) * 16 + (var3 + var6 + 13);
            int var23 = class93.field1151 | 0xFF000000;
            if (var2 < var10 && var10 < var2 + var4 && (var22 - 13) < var11 && var11 < var22 + 4 && var21.field1878) {
                var23 = class25.field342 | 0xFF000000;
            }
            int[] var24 = null;
            if (class419.method2493(var21.field1889, 22383)) {
                var24 = class422.field6096.method121((int) var21.field1883, -1).field5520;
            } else if (var21.field1887 != -1) {
                var24 = class422.field6096.method121(var21.field1887, -1).field5520;
            } else if (class45.method242(var21.field1889, (byte) -86)) {
                class137 var25 = class448.field6366[(int) var21.field1883];
                if (var25 != null) {
                    class476 var26 = var25.field1643;
                    if (var26.field6694 != null) {
                        var26 = var26.method2812(class75.field909, true);
                    }
                    if (var26 != null) {
                        var24 = var26.field6683;
                    }
                }
            } else if (class432.method2587(var21.field1889, (byte) -40)) {
                Object var27 = null;
                class415 var28;
                if (var21.field1889 == 1004) {
                    var28 = class173.field2084.method2297(50, (int) var21.field1883);
                } else {
                    var28 = class173.field2084.method2297(50, (int) (var21.field1883 >>> 32 & 0x7FFFFFFFL));
                }
                if (var28.field5951 != null) {
                    var28 = var28.method2473(-18648, class75.field909);
                }
                if (var28 != null) {
                    var24 = var28.field5922;
                }
            }
            String var29 = class125.method597(var21, -113);
            if (var24 != null) {
                var29 = var29 + class349.method2115(14160, var24);
            }
            class101.field1230.method1137(class430.field6222, var29, var23, var2 + 3, var22, class298.field4460, -2, 0);
            if (var21.field1879) {
                class408.field5780.method2363(class453.field6394.method2419(false, var29) + var2 + 5, var22 + -12);
            }
            var16++;
        }
        class470.method2762((byte) 75, class345.field4933, class274.field3913, class77.field925, class150.field1822);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field841[var1] = var0 / 4;
        }
        field842 = new class72(61, 2);
    }
}
