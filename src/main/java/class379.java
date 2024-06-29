import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class379 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public int field5019;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)I", line = 7)
    public final int method2164(byte arg0) {
        if (arg0 >= -59) {
            this.field5019 = 78;
        }
        field5015++;
        return this.field5019;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILr;)V", line = 18)
    public static final void method2165(int arg0, class562 arg1) {
        field5018++;
        int var2 = class114.field1464;
        int var3 = class102.field1224;
        int var4 = class172.field2446;
        int var5 = class464.field6078 - 3;
        byte var6 = 20;
        if (class392.field5243 == null || class374.field4965 == null) {
            if (class390.field5228.method1931(arg0 + 23300, class156.field2190) && class390.field5228.method1931(1, class623.field8636)) {
                class392.field5243 = arg1.method1139(class92.method506(class390.field5228, class156.field2190, 0), true);
                class92 var7 = class92.method506(class390.field5228, class623.field8636, 0);
                class374.field4965 = arg1.method1139(var7, true);
                var7.method515();
                class411.field5409 = arg1.method1139(var7, true);
            } else {
                arg1.method1113(var2, var3, var4, var6, 255 - class121.field1587 << 24 | class234.field3108, 1);
            }
        }
        if (class392.field5243 != null && class374.field4965 != null) {
            int var8 = (var4 - (class374.field4965.method530() * 2)) / class392.field5243.method530();
            for (int var9 = 0; var9 < var8; var9++) {
                class392.field5243.method2990(var2 + (class374.field4965.method530() + (class392.field5243.method530() * var9)), var3);
            }
            class374.field4965.method2990(var2, var3);
            class411.field5409.method2990(var2 + var4 - class411.field5409.method530(), var3);
        }
        if (arg0 != -23299) {
            return;
        }
        class622.field8625.method2316(var2 + 3, class442.field5863 | 0xFF000000, var3 + 14, class371.field4903.method2141(class422.field5539, true), -1, arg0 + 23299);
        arg1.method1113(var2, var3 + var6, var4, var5 - var6, class234.field3108 | 255 - class121.field1587 << 24, 1);
        int var10 = class409.field5387.method1890(arg0 + 16800514);
        int var11 = class409.field5387.method1893((byte) 91);
        int var12 = 0;
        for (class354 var13 = (class354) class101.field1211.method2506(68); var13 != null; var13 = (class354) class101.field1211.method2505(-119)) {
            int var31 = (class137.field1873 - var12 - 1) * 16 + var6 + var3 + 13;
            var12++;
            if (var2 < var10 && var10 < var2 + var4 && (var31 - 13) < var11 && var31 + 4 > var11 && var13.field4721) {
                arg1.method1113(var2, var31 - 12, var4, 16, class317.field4240 | 255 - class156.field2192 << 24, 1);
            }
        }
        if ((class421.field5522 == null || class637.field8801 == null || class306.field4086 == null) && class390.field5228.method1931(1, class624.field8642) && class390.field5228.method1931(1, class401.field5321) && class390.field5228.method1931(1, class288.field3799)) {
            class92 var14 = class92.method506(class390.field5228, class401.field5321, 0);
            class637.field8801 = arg1.method1139(var14, true);
            var14.method515();
            class226.field2942 = arg1.method1139(var14, true);
            class421.field5522 = arg1.method1139(class92.method506(class390.field5228, class624.field8642, 0), true);
            class92 var15 = class92.method506(class390.field5228, class288.field3799, 0);
            class306.field4086 = arg1.method1139(var15, true);
            var15.method515();
            class450.field5946 = arg1.method1139(var15, true);
        }
        int var16 = 0;
        if (class421.field5522 != null && class637.field8801 != null && class306.field4086 != null) {
            int var17 = (var4 - (class306.field4086.method530() * 2)) / class421.field5522.method530();
            for (int var18 = 0; var18 < var17; var18++) {
                class421.field5522.method2990(class306.field4086.method530() + var2 + class421.field5522.method530() * var18, var3 - (-var5 - -class421.field5522.method529()));
            }
            int var19 = (var5 - var6 - class306.field4086.method529()) / class637.field8801.method529();
            for (int var20 = 0; var20 < var19; var20++) {
                class637.field8801.method2990(var2, var3 + var6 + var20 * class637.field8801.method529());
                class226.field2942.method2990(var2 + var4 - class226.field2942.method530(), class637.field8801.method529() * var20 + var3 + var6);
            }
            class306.field4086.method2990(var2, var3 + var5 - class306.field4086.method529());
            class450.field5946.method2990(var2 + var4 - class306.field4086.method530(), var5 + (var3 - class306.field4086.method529()));
        }
        for (class354 var21 = (class354) class101.field1211.method2506(68); var21 != null; var21 = (class354) class101.field1211.method2505(-121)) {
            int var22 = (class137.field1873 - var16 - 1) * 16 + var6 + var3 + 13;
            int var23 = class442.field5863 | 0xFF000000;
            if (var10 > var2 && (var2 + var4) > var10 && var11 > var22 - 13 && var22 + 4 > var11 && var21.field4721) {
                var23 = class124.field1732 | 0xFF000000;
            }
            int[] var24 = null;
            if (class198.method1280(var21.field4729, arg0 ^ 0x58EC)) {
                var24 = class87.field1058.method1394(arg0 ^ 0x5B62, (int) var21.field4723).field8058;
            } else if (var21.field4719 != -1) {
                var24 = class87.field1058.method1394(-77, var21.field4719).field8058;
            } else if (class258.method1561(var21.field4729, -108)) {
                class407 var25 = (class407) class296.field3921.method3057(1, (long) ((int) var21.field4723));
                if (var25 != null) {
                    class351 var26 = var25.field5354;
                    class384 var27 = var26.field4671;
                    if (var27.field5121 != null) {
                        var27 = var27.method2203(3, class564.field7696);
                    }
                    if (var27 != null) {
                        var24 = var27.field5091;
                    }
                }
            } else if (class125.method744(var21.field4729, 45)) {
                Object var28 = null;
                class600 var29;
                if (var21.field4729 == 1011) {
                    var29 = class118.field1510.method3921((int) var21.field4723, arg0 ^ 0x5B7A);
                } else {
                    var29 = class118.field1510.method3921((int) (var21.field4723 >>> 32 & 0x7FFFFFFFL), -110);
                }
                if (var29.field8257 != null) {
                    var29 = var29.method3324((byte) 112, class564.field7696);
                }
                if (var29 != null) {
                    var24 = var29.field8333;
                }
            }
            String var30 = class509.method2886(-29, var21);
            if (var24 != null) {
                var30 = var30 + class557.method3098(var24, 584);
            }
            class622.field8625.method2317(var22, (byte) 67, var2 + 3, 0, class466.field6127, class196.field2683, var23, var30);
            if (var21.field4726) {
                class121.field1581.method2990(class254.field3332.method3765(var30, (byte) 6) + var2 + 5, var22 + -12);
            }
            var16++;
        }
        class61.method342(class102.field1224, class172.field2446, class114.field1464, -128, class464.field6078);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZC)Z", line = 226)
    public static final boolean method2166(boolean arg0, char arg1) {
        field5017++;
        if (!arg0) {
            method2166(true, (char) 65477);
        }
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!rb", name = "toString", descriptor = "()Ljava/lang/String;", line = 247)
    public final String toString() {
        field5016++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IFBFLhc;IIFFFI)[B", line = 260)
    public static final byte[] method2167(int arg0, float arg1, byte arg2, float arg3, class427 arg4, int arg5, int arg6, float arg7, float arg8, float arg9, int arg10) {
        field5014++;
        byte[] var11 = new byte[arg5 * arg10 * arg0];
        if (arg2 != 107) {
            method2165(41, null);
        }
        class315.method1844(arg1, arg7, (byte) 111, arg6, arg5, arg0, arg9, arg3, arg10, var11, arg4, 0, arg8);
        return var11;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 273)
    public class379(String arg0, int arg1) {
        this.field5019 = arg1;
    }
}
