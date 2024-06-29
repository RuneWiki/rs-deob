import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class361 extends class151 {

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4657 = "";

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "Lcj;")
    public static class491 field4658 = new class491();

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
    public static int field4662 = 0;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2070(byte arg0) {
        field4660++;
        class97.method737(-107);
        if (arg0 != -57) {
            method2070((byte) 6);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)V", line = 14)
    public static final void method2071(int arg0, int arg1) {
        field4663++;
        class153 var2 = class75.method656(arg1, 255, arg0);
        var2.method997((byte) 93);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)Z", line = 24)
    public static final boolean method2072(int arg0, int arg1, int arg2) {
        field4655++;
        if (arg0 != 65536) {
            method2076(null, true);
        }
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILya;)V", line = 35)
    public static final void method2073(int arg0, class38 arg1) {
        field4659++;
        if (arg0 > -16) {
            return;
        }
        int var2 = class325.field4128;
        int var3 = class14.field229;
        int var4 = class117.field1580;
        int var5 = class337.field4242;
        int var6 = -10660793;
        arg1.method364(var4, var2, var5, var3, (byte) -48, var6);
        arg1.method364(var4 - 2, var2 - -1, 16, var3 + 1, (byte) -48, -16777216);
        arg1.method326(1, var2 + 1, var4 - 2, -16777216, var5 - 19, var3 + 18);
        class91.field1116.method1849(var2 + 3, var6, false, class128.field1699.method1936(-26539, class11.field177), -1, var3 + 14);
        int var7 = class204.field2664.method1333(7);
        int var8 = class204.field2664.method1337(69);
        int var9 = 0;
        for (class520 var10 = (class520) class201.field2616.method153(0); var10 != null; var10 = (class520) class201.field2616.method161(-45)) {
            int var11 = (class2.field24 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && (var2 + var4) > var7 && var8 > (var11 - 13) && var11 + 3 > var8 && var10.field7518) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class409.method2429(-124, var10.field7508)) {
                var13 = class376.field4949.method624((byte) -125, (int) var10.field7517).field104;
            } else if (var10.field7515 != -1) {
                var13 = class376.field4949.method624((byte) -126, var10.field7515).field104;
            } else if (class189.method1181(var10.field7508, 10916)) {
                class295 var16 = class187.field2446[(int) var10.field7517];
                if (var16 != null) {
                    class477 var17 = var16.field3773;
                    if (var17.field6922 != null) {
                        var17 = var17.method2903(-1, class491.field7160);
                    }
                    if (var17 != null) {
                        var13 = var17.field6923;
                    }
                }
            } else if (class490.method2973((byte) 0, var10.field7508)) {
                Object var14 = null;
                class102 var15;
                if (var10.field7508 == 1004) {
                    var15 = class315.field4017.method1958(-10091, (int) var10.field7517);
                } else {
                    var15 = class315.field4017.method1958(-10091, (int) (var10.field7517 >>> 32 & 0x7FFFFFFFL));
                }
                if (var15.field1291 != null) {
                    var15 = var15.method761(91, class491.field7160);
                }
                if (var15 != null) {
                    var13 = var15.field1271;
                }
            }
            String var18 = class216.method1331(var10, -104);
            if (var13 != null) {
                var18 = var18 + class219.method1344((byte) 63, var13);
            }
            class91.field1116.method1856(99, class347.field4459, 0, class101.field1219, var11, var2 + 3, var18, var12);
            if (var10.field7516) {
                class264.field3333.method130(var2 + class274.field3437.method1757((byte) -126, var18) + 5, var11 + -12);
            }
            var9++;
        }
        class410.method2435((byte) -78, class325.field4128, class117.field1580, class337.field4242, class14.field229);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IBZI)I", line = 143)
    public static final int method2074(int arg0, byte arg1, boolean arg2, int arg3) {
        if (arg1 != 9) {
            return -49;
        }
        field4661++;
        class529 var4 = class290.method1705(0, arg2, arg0);
        if (var4 == null) {
            return 0;
        } else if (arg3 >= 0 && var4.field7794.length > arg3) {
            return var4.field7794[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V", line = 171)
    public static void method2075(int arg0) {
        field4658 = null;
        if (arg0 < 39) {
            field4657 = null;
        }
        field4657 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lvn;Z)Z", line = 199)
    public static final boolean method2076(class205 arg0, boolean arg1) {
        boolean var2 = class520.field7520 == class140.field1808;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method1129(1);
        if (arg0.field2673 < 0 || arg0.field2671 < 0 || arg0.field2681 >= class470.field6825 || arg0.field2670 >= class105.field1336) {
            return false;
        }
        for (int var6 = arg0.field2673; var6 <= arg0.field2681; var6++) {
            for (int var9 = arg0.field2671; var9 <= arg0.field2670; var9++) {
                class490 var10 = class119.method862(arg0.field2676, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field2673) {
                        var11++;
                    }
                    if (var6 < arg0.field2681) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field2671) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field2670) {
                        var11 += 2;
                    }
                    class376 var12 = class446.method2625(var11, arg0, (byte) -79);
                    class376 var13 = var10.field7127;
                    if (var13 == null) {
                        var10.field7127 = var12;
                    } else {
                        while (var13.field4952 != null) {
                            var13 = var13.field4952;
                        }
                        var13.field4952 = var12;
                    }
                    var10.field7123 = (byte) (var10.field7123 | var11);
                    if (var2 && (class140.field1804[var6][var9] & 0xFF000000) != 0) {
                        var3 = class140.field1804[var6][var9];
                        var4 = class382.field5040[var6][var9];
                        var5 = class214.field2756[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field2673; var7 <= arg0.field2681; var7++) {
                for (int var8 = arg0.field2671; var8 <= arg0.field2670; var8++) {
                    if ((class140.field1804[var7][var8] & 0xFF000000) == 0) {
                        class140.field1804[var7][var8] = var3;
                        class382.field5040[var7][var8] = var4;
                        class214.field2756[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class250.field3208[class201.field2618++] = arg0;
        }
        return true;
    }
}
