import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class class118 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Lnga;")
    public static class510 field1855 = new class510(20);

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "F")
    public static float field1858;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lee;")
    public static class673 field1857;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Lkr;")
    public static class743 field1859;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIB[J[I)V")
    public static final void method952(int arg0, int arg1, byte arg2, long[] arg3, int[] arg4) {
        if (arg1 > arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg1; var11++) {
                if (((long) (var11 & var10) + var7) > arg3[var11]) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    int var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var9;
            method952(arg0, var6 - 1, (byte) -77, arg3, arg4);
            method952(var6 + 1, arg1, (byte) -120, arg3, arg4);
        }
        field1854++;
        if (arg2 >= -64) {
            method952(75, -106, (byte) 20, null, null);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method953(byte arg0) {
        if (arg0 != -60) {
            field1855 = null;
        }
        field1859 = null;
        field1857 = null;
        field1855 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIILqn;)V")
    public static final void method954(int arg0, int arg1, int arg2, int arg3, class63 arg4) {
        class416 var5 = class442.method2653(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field644 = (arg1 << class440.field6142) + class252.field3600;
        arg4.field651 = arg3;
        arg4.field648 = (arg2 << class440.field6142) + class252.field3600;
        var5.field5841 = arg4;
        int var6 = class4.field56 == class138.field2153 ? 1 : 0;
        if (arg4.method395((byte) 84)) {
            if (arg4.method399((byte) 38)) {
                class319.field4524[var6][class444.field6176[var6]++] = arg4;
                return;
            }
            class307.field4351[var6][class189.field2729[var6]++] = arg4;
            class70.field1267 = true;
            return;
        }
        class598.field8718[var6][class579.field8176[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lof;I)Lof;")
    public abstract class619 method955(class619 arg0, int arg1);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Z")
    public static final boolean method956(int arg0) throws IOException {
        field1856++;
        if (class555.field7776 == null) {
            return false;
        }
        if (class504.field7206 == null) {
            if (class500.field7152) {
                if (!class555.field7776.method66(1, 102)) {
                    return false;
                }
                class555.field7776.method68(0, 1, class644.field9146.field483, -1);
                class425.field5950 = 0;
                class317.field4504++;
                class500.field7152 = false;
            }
            class644.field9146.field469 = 0;
            if (class644.field9146.method2685((byte) -28)) {
                if (!class555.field7776.method66(1, 108)) {
                    return false;
                }
                class555.field7776.method68(1, 1, class644.field9146.field483, -1);
                class317.field4504++;
                class425.field5950 = 0;
            }
            class500.field7152 = true;
            class465[] var1 = class189.method1333(93);
            int var2 = class644.field9146.method2695(255);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class644.field9146.field469);
            }
            class504.field7206 = var1[var2];
            class374.field5243 = class504.field7206.field6723;
        }
        if (class374.field5243 == -1) {
            if (!class555.field7776.method66(1, 88)) {
                return false;
            }
            class555.field7776.method68(0, 1, class644.field9146.field483, -1);
            class425.field5950 = 0;
            class317.field4504++;
            class374.field5243 = class644.field9146.field483[0] & 0xFF;
        }
        if (class374.field5243 == -2) {
            if (!class555.field7776.method66(2, -57)) {
                return false;
            }
            class555.field7776.method68(0, 2, class644.field9146.field483, -1);
            class644.field9146.field469 = 0;
            class374.field5243 = class644.field9146.method253(-13900);
            class425.field5950 = 0;
            class317.field4504 += 2;
        }
        if (class374.field5243 > 0) {
            if (!class555.field7776.method66(class374.field5243, 91)) {
                return false;
            }
            class644.field9146.field469 = 0;
            class555.field7776.method68(0, class374.field5243, class644.field9146.field483, -1);
            class317.field4504 += class374.field5243;
            class425.field5950 = 0;
        }
        class386.field5398 = class689.field9709;
        class689.field9709 = class735.field10351;
        class735.field10351 = class504.field7206;
        if (class504.field7206 == class174.field2524) {
            class526.field7475 = class374.field5247;
            if (class374.field5243 == 0) {
                class63.field1146 = null;
                client.field4194 = null;
                class208.field2982 = 0;
                class504.field7206 = null;
                class20.field259 = null;
                return true;
            }
            class63.field1146 = class644.field9146.method272(2);
            boolean var3 = class644.field9146.method273(255) == 1;
            if (var3) {
                class644.field9146.method272(2);
            }
            long var4 = class644.field9146.method246(19271);
            client.field4194 = class198.method1389(var4, (byte) 82);
            class244.field3406 = class644.field9146.method277((byte) 82);
            int var6 = class644.field9146.method273(255);
            if (var6 == 255) {
                class504.field7206 = null;
                return true;
            }
            class208.field2982 = var6;
            class573[] var7 = new class573[100];
            for (int var8 = 0; var8 < class208.field2982; var8++) {
                var7[var8] = new class573();
                var7[var8].field8125 = class644.field9146.method272(2);
                boolean var14 = class644.field9146.method273(255) == 1;
                if (var14) {
                    var7[var8].field8123 = class644.field9146.method272(2);
                } else {
                    var7[var8].field8123 = var7[var8].field8125;
                }
                var7[var8].field8124 = class726.method4041(-1, var7[var8].field8123);
                var7[var8].field8127 = class644.field9146.method253(-13900);
                var7[var8].field8129 = class644.field9146.method277((byte) 99);
                var7[var8].field8128 = class644.field9146.method272(2);
                if (var7[var8].field8123.equals(class468.field6748.field4939)) {
                    class588.field8273 = var7[var8].field8129;
                }
            }
            boolean var9 = false;
            int var10 = class208.field2982;
            while (var10 > 0) {
                var10--;
                boolean var11 = true;
                for (int var12 = 0; var12 < var10; var12++) {
                    if (var7[var12].field8124.compareTo(var7[var12 + 1].field8124) > 0) {
                        class573 var13 = var7[var12];
                        var7[var12] = var7[var12 + 1];
                        var7[var12 + 1] = var13;
                        var11 = false;
                    }
                }
                if (var11) {
                    break;
                }
            }
            class20.field259 = var7;
            class504.field7206 = null;
            return true;
        } else if (class71.field1279 == class504.field7206) {
            int var15 = class644.field9146.method280((byte) -53);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var16 = class644.field9146.method262((byte) -57);
            int var17 = class644.field9146.method234((byte) -102);
            class643.method3666(true);
            class619.method3581(var16, var15, var17, 30178);
            class253 var18 = class558.field7942.method721(91, var15);
            class73.method737(var18.field3608, var17, var18.field3639, (byte) 21, var18.field3606);
            class663.method3728(var18.field3612, var18.field3684, var17, 10, var18.field3673);
            class504.field7206 = null;
            return true;
        } else if (class584.field8239 == class504.field7206) {
            class496.method2984(class193.field2780, (byte) -79);
            class504.field7206 = null;
            return true;
        } else if (class564.field7976 == class504.field7206) {
            class735.field10353 = class644.field9146.method225((byte) 87);
            class298.field4135 = class374.field5247;
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class301.field4222) {
            boolean var19 = class644.field9146.method273(255) == 1;
            String var20 = class644.field9146.method272(2);
            String var21 = var20;
            if (var19) {
                var21 = class644.field9146.method272(2);
            }
            int var22 = class644.field9146.method273(255);
            int var23 = class644.field9146.method253(-13900);
            boolean var24 = false;
            if (var22 <= 1 && class212.method1488(var21, (byte) 19)) {
                var24 = true;
            }
            if (!var24 && class612.field8865 == 0) {
                String var25 = class643.field9141.method3679(var23, 64).method2345(-33, class644.field9146);
                if (var22 == 2) {
                    class79.method783(null, var23, "<img=1>" + var20, "<img=1>" + var21, 25, -74, 0, var20, var25);
                } else if (var22 == 1) {
                    class79.method783(null, var23, "<img=0>" + var20, "<img=0>" + var21, 25, -110, 0, var20, var25);
                } else {
                    class79.method783(null, var23, var20, var21, 25, -86, 0, var20, var25);
                }
            }
            class504.field7206 = null;
            return true;
        } else if (class710.field9928 == class504.field7206) {
            int var26 = class644.field9146.method265(-4);
            int var27 = class644.field9146.method228((byte) 67);
            class643.method3666(true);
            class174.method1273(var26, 6, var27);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class231.field3292) {
            class496.method2984(class611.field8836, (byte) -88);
            class504.field7206 = null;
            return true;
        } else if (class603.field8760 == class504.field7206) {
            String var28 = class644.field9146.method272(2);
            String var29 = class57.method520(class580.method3352(124, class644.field9146), 125);
            class541.method3185(var28, var28, var29, 0, 6, 6642, var28);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class444.field6175) {
            int var30 = class644.field9146.method253(-13900);
            String var31 = class644.field9146.method272(2);
            class643.method3666(true);
            class584.method3375(var30, var31, -26769);
            class504.field7206 = null;
            return true;
        } else if (class646.field9157 == class504.field7206) {
            int var32 = class644.field9146.method253(-13900);
            class349 var33;
            if (class675.field9486 == var32) {
                var33 = class468.field6748;
            } else {
                var33 = class165.field2442[var32];
            }
            if (var33 == null) {
                class504.field7206 = null;
                return true;
            }
            int var34 = class644.field9146.method253(-13900);
            int var35 = class644.field9146.method273(255);
            boolean var36 = (var34 & 0x8000) != 0;
            if (var33.field4939 != null && var33.field4932 != null) {
                boolean var37 = false;
                if (var35 <= 1) {
                    if (!var36 && (class231.field3285 && !class29.field398 || class253.field3605)) {
                        var37 = true;
                    } else if (class212.method1488(var33.field4939, (byte) 19)) {
                        var37 = true;
                    }
                }
                if (!var37 && class612.field8865 == 0) {
                    int var38 = -1;
                    String var39;
                    if (var36) {
                        var34 &= 0x7FFF;
                        class123 var40 = class275.method1804(-108, class644.field9146);
                        var38 = var40.field1901;
                        var39 = var40.field1902.method2345(-68, class644.field9146);
                    } else {
                        var39 = class57.method520(class580.method3352(-68, class644.field9146), 126);
                    }
                    var33.field928 = var39.trim();
                    var33.field934 = 150;
                    var33.field884 = var34 & 0xFF;
                    var33.field965 = var34 >> 8;
                    int var41;
                    if (var35 == 1 || var35 == 2) {
                        var41 = var36 ? 17 : 1;
                    } else {
                        var41 = var36 ? 17 : 2;
                    }
                    if (var35 == 2) {
                        class79.method783(null, var38, "<img=1>" + var33.method2192(true, -32526), "<img=1>" + var33.method2196((byte) -122, false), var41, -124, 0, var33.field4897, var39);
                    } else if (var35 == 1) {
                        class79.method783(null, var38, "<img=0>" + var33.method2192(true, -32526), "<img=0>" + var33.method2196((byte) -89, false), var41, -92, 0, var33.field4897, var39);
                    } else {
                        class79.method783(null, var38, var33.method2192(true, -32526), var33.method2196((byte) -118, false), var41, -92, 0, var33.field4897, var39);
                    }
                }
            }
            class504.field7206 = null;
            return true;
        } else if (class562.field7971 == class504.field7206) {
            int var42 = class644.field9146.method234((byte) -101);
            class224.field3210 = class341.field4796.method2285(var42, (byte) -87);
            class504.field7206 = null;
            return true;
        } else if (class586.field8249 == class504.field7206) {
            int var43 = class644.field9146.method267(-78);
            int var44 = class644.field9146.method234((byte) -97);
            class643.method3666(true);
            class548 var45 = (class548) class310.field4383.method4203(true, (long) var43);
            class548 var46 = (class548) class310.field4383.method4203(true, (long) var44);
            if (var46 != null) {
                class740.method4119(var46, var45 == null || var45.field7723 != var46.field7723, false, 110);
            }
            if (var45 != null) {
                var45.method3617(1);
                class310.field4383.method4211(var45, (byte) 12, (long) var44);
            }
            class50 var47 = class545.method3220(65535, var43);
            if (var47 != null) {
                class262.method1776(0, var47);
            }
            class50 var48 = class545.method3220(65535, var44);
            if (var48 != null) {
                class262.method1776(0, var48);
                class756.method4196((byte) -70, true, var48);
            }
            if (class401.field5610 != -1) {
                class425.method2588(1, -2, class401.field5610);
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class278.field3919) {
            int var49 = class644.field9146.method236(116);
            int var50 = class644.field9146.method278(125);
            int var51 = class644.field9146.method280((byte) -28);
            if (var51 == 65535) {
                var51 = -1;
            }
            class431.method2615(var49, var51, (byte) -24, var50);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class189.field2726) {
            int var52 = class644.field9146.method239(-34);
            int var53 = class644.field9146.method278(87);
            int var54 = class644.field9146.method280((byte) -29);
            if (var54 == 65535) {
                var54 = -1;
            }
            class456.method2785(var54, var53, var52, (byte) -75);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class489.field6981) {
            int var55 = class644.field9146.method234((byte) -114);
            int var56 = class644.field9146.method253(-13900);
            class643.method3666(true);
            class540.method3181(var56, var55, (byte) 42);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class496.field7072) {
            class541.method3183(class644.field9146, class374.field5243, false);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class361.field5062) {
            int var57 = class644.field9146.method248((byte) -99);
            int var58 = class644.field9146.method288((byte) -127);
            int var59 = class644.field9146.method288((byte) -127);
            int var60 = class644.field9146.method236(123);
            int var61 = class644.field9146.method236(117);
            class643.method3666(true);
            class104.field1732[var60] = true;
            class557.field7936[var60] = var59;
            class539.field7589[var60] = var58;
            class510.field7282[var60] = var61;
            class587.field8265[var60] = var57;
            class504.field7206 = null;
            return true;
        } else if (class709.field9911 == class504.field7206) {
            boolean var62 = class644.field9146.method273(255) == 1;
            String var63 = class644.field9146.method272(2);
            String var64 = var63;
            if (var62) {
                var64 = class644.field9146.method272(2);
            }
            long var65 = class644.field9146.method246(19271);
            long var67 = (long) class644.field9146.method253(-13900);
            long var69 = (long) class644.field9146.method239(-88);
            int var71 = class644.field9146.method273(255);
            long var72 = (var67 << 32) + var69;
            boolean var74 = false;
            int var75 = 0;
            while (true) {
                if (var75 >= 100) {
                    if (var71 <= 1) {
                        if (!(!class231.field3285 || class29.field398) || class253.field3605) {
                            var74 = true;
                        } else if (class212.method1488(var64, (byte) 19)) {
                            var74 = true;
                        }
                    }
                    break;
                }
                if (class187.field2693[var75] == var72) {
                    var74 = true;
                    break;
                }
                var75++;
            }
            if (!var74 && class612.field8865 == 0) {
                class187.field2693[class392.field5501] = var72;
                class392.field5501 = (class392.field5501 + 1) % 100;
                String var76 = class57.method520(class580.method3352(127, class644.field9146), 126);
                if (var71 == 2 || var71 == 3) {
                    class79.method783(class612.method3525(var65, false), -1, "<img=1>" + var63, "<img=1>" + var64, 9, -120, 0, var63, var76);
                } else if (var71 == 1) {
                    class79.method783(class612.method3525(var65, false), -1, "<img=0>" + var63, "<img=0>" + var64, 9, -84, 0, var63, var76);
                } else {
                    class79.method783(class612.method3525(var65, false), -1, var63, var64, 9, -74, 0, var63, var76);
                }
            }
            class504.field7206 = null;
            return true;
        } else if (class631.field9050 == class504.field7206) {
            int var77 = class644.field9146.method267(-80);
            int var78 = class644.field9146.method248((byte) -107);
            class643.method3666(true);
            if (var78 == 65535) {
                var78 = -1;
            }
            class76.method760((byte) -39, var78, var77);
            class504.field7206 = null;
            return true;
        } else if (class89.field1590 == class504.field7206) {
            int var79 = class644.field9146.method248((byte) -101);
            int var80 = class644.field9146.method262((byte) -57);
            int var81 = class644.field9146.method280((byte) -39);
            class643.method3666(true);
            class18.method108((var79 << 16) + var81, var80, 8643);
            class504.field7206 = null;
            return true;
        } else if (class653.field9199 == class504.field7206) {
            int var82 = class644.field9146.method232((byte) -128);
            int var83 = class644.field9146.method234((byte) -113);
            int var84 = class644.field9146.method273(255);
            String var85 = "";
            String var86 = var85;
            if ((var84 & 0x1) != 0) {
                var85 = class644.field9146.method272(2);
                if ((var84 & 0x2) == 0) {
                    var86 = var85;
                } else {
                    var86 = class644.field9146.method272(2);
                }
            }
            String var87 = class644.field9146.method272(2);
            if (var82 == 99) {
                class569.method3326(var87, (byte) -42);
            } else if (var86.equals("") || !class212.method1488(var86, (byte) 19)) {
                class541.method3185(var85, var85, var87, var83, var82, 6642, var86);
            } else {
                class504.field7206 = null;
                return true;
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class311.field4391) {
            class742.field10408.method3177(128);
            class504.field7206 = null;
            class711.field9940 += 32;
            return true;
        } else if (class504.field7206 == class130.field1944) {
            boolean var88 = class644.field9146.method273(255) == 1;
            String var89 = class644.field9146.method272(2);
            String var90 = var89;
            if (var88) {
                var90 = class644.field9146.method272(2);
            }
            long var91 = class644.field9146.method246(19271);
            long var93 = (long) class644.field9146.method253(-13900);
            long var95 = (long) class644.field9146.method239(-26);
            int var97 = class644.field9146.method273(255);
            int var98 = class644.field9146.method253(-13900);
            long var99 = (var93 << 32) + var95;
            boolean var101 = false;
            int var102 = 0;
            while (true) {
                if (var102 >= 100) {
                    if (var97 <= 1 && class212.method1488(var90, (byte) 19)) {
                        var101 = true;
                    }
                    break;
                }
                if (class187.field2693[var102] == var99) {
                    var101 = true;
                    break;
                }
                var102++;
            }
            if (!var101 && class612.field8865 == 0) {
                class187.field2693[class392.field5501] = var99;
                class392.field5501 = (class392.field5501 + 1) % 100;
                String var103 = class643.field9141.method3679(var98, 64).method2345(93, class644.field9146);
                if (var97 == 2) {
                    class79.method783(class612.method3525(var91, false), var98, "<img=1>" + var89, "<img=1>" + var90, 20, -109, 0, var89, var103);
                } else if (var97 == 1) {
                    class79.method783(class612.method3525(var91, false), var98, "<img=0>" + var89, "<img=0>" + var90, 20, -93, 0, var89, var103);
                } else {
                    class79.method783(class612.method3525(var91, false), var98, var89, var90, 20, -93, 0, var89, var103);
                }
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class402.field5611) {
            class489.field6980 = class379.method2372(class644.field9146.method273(255), (byte) 124);
            class504.field7206 = null;
            return true;
        } else if (class517.field7350 == class504.field7206) {
            class496.method2984(class343.field4824, (byte) -39);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class49.field700) {
            String var104 = class644.field9146.method272(2);
            int var105 = class644.field9146.method280((byte) -51);
            class643.method3666(true);
            class584.method3375(var105, var104, -26769);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class146.field2241) {
            class583.method3373((byte) -92);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class474.field6797) {
            int var106 = class644.field9146.method265(-4);
            class643.method3666(true);
            class548 var107 = (class548) class310.field4383.method4203(true, (long) var106);
            if (var107 != null) {
                class740.method4119(var107, true, false, 111);
            }
            if (class508.field7243 != null) {
                class262.method1776(0, class508.field7243);
                class508.field7243 = null;
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class46.field682) {
            int var108 = class644.field9146.method278(112);
            int var109 = class644.field9146.method248((byte) -103);
            int var110 = class644.field9146.method267(-108);
            class643.method3666(true);
            class548 var111 = (class548) class310.field4383.method4203(true, (long) var110);
            if (var111 != null) {
                class740.method4119(var111, var111.field7723 != var109, false, 101);
            }
            class508.method3034(var108, var109, var110, (byte) 22, false);
            class504.field7206 = null;
            return true;
        } else if (class681.field9587 == class504.field7206) {
            class496.method2984(class531.field7524, (byte) -78);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class213.field3053) {
            int var112 = class644.field9146.method234((byte) -96);
            class643.method3666(true);
            class81.method790(var112, class675.field9486, 5, 4, 0);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class397.field5557) {
            class496.method2984(class368.field5150, (byte) -81);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class229.field3275) {
            class169.field2482 = class644.field9146.method273(255);
            class298.field4135 = class374.field5247;
            class504.field7206 = null;
            return true;
        } else if (class674.field9470 == class504.field7206) {
            if (class428.method2601(class611.field8839, (byte) -121)) {
                class586.field8248 = (int) ((float) class644.field9146.method253(-13900) * 2.5F);
            } else {
                class586.field8248 = class644.field9146.method253(-13900) * 30;
            }
            class298.field4135 = class374.field5247;
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class26.field375) {
            int var113 = class644.field9146.method273(255);
            int var114 = var113 >> 5;
            int var115 = var113 & 0x1F;
            if (var115 == 0) {
                class220.field3146[var114] = null;
                class504.field7206 = null;
                return true;
            }
            class340 var116 = new class340();
            var116.field4782 = var115;
            var116.field4788 = class644.field9146.method273(255);
            if (var116.field4788 >= 0 && class283.field4028.length > var116.field4788) {
                if (var116.field4782 == 1 || var116.field4782 == 10) {
                    var116.field4789 = class644.field9146.method253(-13900);
                    class644.field9146.field469 += 6;
                } else if (var116.field4782 >= 2 && var116.field4782 <= 6) {
                    if (var116.field4782 == 2) {
                        var116.field4785 = 256;
                        var116.field4783 = 256;
                    }
                    if (var116.field4782 == 3) {
                        var116.field4785 = 0;
                        var116.field4783 = 256;
                    }
                    if (var116.field4782 == 4) {
                        var116.field4785 = 512;
                        var116.field4783 = 256;
                    }
                    if (var116.field4782 == 5) {
                        var116.field4783 = 0;
                        var116.field4785 = 256;
                    }
                    if (var116.field4782 == 6) {
                        var116.field4783 = 512;
                        var116.field4785 = 256;
                    }
                    var116.field4782 = 2;
                    var116.field4790 = class644.field9146.method273(255);
                    var116.field4785 += class644.field9146.method253(-13900) - class115.field1845 << 9;
                    var116.field4783 += class644.field9146.method253(-13900) - class64.field1160 << 9;
                    var116.field4784 = class644.field9146.method273(255) << 2;
                    var116.field4786 = class644.field9146.method253(-13900);
                }
                var116.field4787 = class644.field9146.method253(-13900);
                if (var116.field4787 == 65535) {
                    var116.field4787 = -1;
                }
                class220.field3146[var114] = var116;
            }
            class504.field7206 = null;
            return true;
        } else if (class52.field946 == class504.field7206) {
            int var117 = class644.field9146.method267(-94);
            int var118 = class644.field9146.method278(120);
            int var119 = class644.field9146.method288((byte) -127);
            class68.field1230[var119] = var117;
            class183.field2623[var119] = var118;
            class310.field4384[var119] = 1;
            int var120 = class744.field10425[var119] - 1;
            for (int var121 = 0; var121 < var120; var121++) {
                if (class512.field7313[var121] <= var117) {
                    class310.field4384[var119] = var121 + 2;
                }
            }
            class164.field2418[class555.method3246(31, class150.field2272++)] = var119;
            class504.field7206 = null;
            return true;
        } else if (class545.field7691 == class504.field7206) {
            class643.method3666(true);
            class57.method521(true);
            class504.field7206 = null;
            return true;
        } else if (class586.field8247 == class504.field7206) {
            class144.method1123(class98.field1675, (byte) -38);
            class504.field7206 = null;
            return false;
        } else if (class504.field7206 == class281.field4006) {
            int var122 = class644.field9146.method236(120);
            int var123 = class644.field9146.method236(116);
            if (var123 == 255) {
                var123 = -1;
                var122 = -1;
            }
            class558.method3279(var122, var123, 15);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class339.field4775) {
            int var124 = class644.field9146.method280((byte) -116);
            int[] var125 = new int[4];
            for (int var126 = 0; var126 < 4; var126++) {
                var125[var126] = class644.field9146.method248((byte) -106);
            }
            int var127 = class644.field9146.method278(119);
            class272 var128 = (class272) class758.field10539.method4203(true, (long) var124);
            if (var128 != null) {
                class521.method3092(var125, var128.field3885, 8298, var127);
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class171.field2494) {
            class496.method2984(class63.field1143, (byte) -32);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class3.field34) {
            int var129 = class644.field9146.method273(255);
            int var130 = class644.field9146.method234((byte) -121);
            class643.method3666(true);
            class37.method306(var130, var129, true);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class309.field4372) {
            class496.method2984(class640.field9112, (byte) -86);
            class504.field7206 = null;
            return true;
        } else if (class66.field1185 == class504.field7206) {
            int var131 = class644.field9146.method273(255);
            byte var132 = class644.field9146.method286(128);
            class643.method3666(true);
            class192.method1348(32993, var132, var131);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class242.field3392) {
            String var133 = class644.field9146.method272(2);
            int var134 = class644.field9146.method253(-13900);
            String var135 = class643.field9141.method3679(var134, 64).method2345(75, class644.field9146);
            class79.method783(null, var134, var133, var133, 19, -116, 0, var133, var135);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class187.field2687) {
            int var136 = class644.field9146.method273(255);
            boolean var137 = (var136 & 0x1) == 1;
            String var138 = class644.field9146.method272(2);
            String var139 = class644.field9146.method272(2);
            if (var139.equals("")) {
                var139 = var138;
            }
            String var140 = class644.field9146.method272(2);
            String var141 = class644.field9146.method272(2);
            if (var141.equals("")) {
                var141 = var140;
            }
            if (var137) {
                for (int var142 = 0; var142 < class222.field3169; var142++) {
                    if (class349.field4928[var142].equals(var141)) {
                        class162.field2404[var142] = var138;
                        class349.field4928[var142] = var139;
                        class628.field9029[var142] = var140;
                        class186.field2673[var142] = var141;
                        break;
                    }
                }
            } else {
                class162.field2404[class222.field3169] = var138;
                class349.field4928[class222.field3169] = var139;
                class628.field9029[class222.field3169] = var140;
                class186.field2673[class222.field3169] = var141;
                class259.field3808[class222.field3169] = class555.method3246(2, var136) == 2;
                class222.field3169++;
            }
            class504.field7206 = null;
            class688.field9702 = class374.field5247;
            return true;
        } else if (class504.field7206 == class497.field7087) {
            int var143 = class644.field9146.method248((byte) -118);
            int var144 = class644.field9146.method248((byte) -109);
            class643.method3666(true);
            class434.method2626(var143, 0, 24811, var144);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class361.field5059) {
            class496.method2984(class18.field235, (byte) -74);
            class504.field7206 = null;
            return true;
        } else if (class65.field1179 == class504.field7206) {
            int var145 = class644.field9146.method253(-13900);
            if (var145 == 65535) {
                var145 = -1;
            }
            int var146 = class644.field9146.method278(98);
            String var147 = class644.field9146.method272(2);
            int var148 = class644.field9146.method236(121);
            if (var148 >= 1 && var148 <= 8) {
                if (var147.equalsIgnoreCase("null")) {
                    var147 = null;
                }
                class675.field9478[var148 - 1] = var147;
                class485.field6851[var148 - 1] = var145;
                class94.field1642[var148 - 1] = var146 == 0;
            }
            class504.field7206 = null;
            return true;
        } else if (class681.field9585 == class504.field7206) {
            boolean var149 = class644.field9146.method273(255) == 1;
            String var150 = class644.field9146.method272(2);
            String var151 = var150;
            if (var149) {
                var151 = class644.field9146.method272(2);
            }
            long var152 = (long) class644.field9146.method253(-13900);
            long var154 = (long) class644.field9146.method239(-11);
            int var156 = class644.field9146.method273(255);
            long var157 = (var152 << 32) + var154;
            boolean var159 = false;
            int var160 = 0;
            while (true) {
                if (var160 >= 100) {
                    if (var156 <= 1) {
                        if (!(!class231.field3285 || class29.field398) || class253.field3605) {
                            var159 = true;
                        } else if (class212.method1488(var151, (byte) 19)) {
                            var159 = true;
                        }
                    }
                    break;
                }
                if (class187.field2693[var160] == var157) {
                    var159 = true;
                    break;
                }
                var160++;
            }
            if (!var159 && class612.field8865 == 0) {
                class187.field2693[class392.field5501] = var157;
                class392.field5501 = (class392.field5501 + 1) % 100;
                String var161 = class57.method520(class580.method3352(126, class644.field9146), 127);
                if (var156 == 2) {
                    class79.method783(null, -1, "<img=1>" + var150, "<img=1>" + var151, 7, -98, 0, var150, var161);
                } else if (var156 == 1) {
                    class79.method783(null, -1, "<img=0>" + var150, "<img=0>" + var151, 7, -100, 0, var150, var161);
                } else {
                    class79.method783(null, -1, var150, var151, 3, -117, 0, var150, var161);
                }
            }
            class504.field7206 = null;
            return true;
        } else if (class93.field1620 == class504.field7206) {
            int var162 = class644.field9146.method253(-13900);
            int var163 = class644.field9146.method273(255);
            boolean var164 = (var163 & 0x1) == 1;
            while (class644.field9146.field469 < class374.field5243) {
                int var165 = class644.field9146.method232((byte) -128);
                int var166 = class644.field9146.method253(-13900);
                int var167 = 0;
                if (var166 != 0) {
                    var167 = class644.field9146.method273(255);
                    if (var167 == 255) {
                        var167 = class644.field9146.method234((byte) -94);
                    }
                }
                class620.method3588((byte) 109, var166 - 1, var162, var167, var164, var165);
            }
            class99.field1680[class555.method3246(31, class390.field5451++)] = var162;
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class314.field4433) {
            class681.field9591 = class374.field5243 <= 2 ? class281.field3967.method1839((byte) 45, class744.field10426) : class644.field9146.method272(2);
            class493.field7014 = class374.field5243 <= 0 ? -1 : class644.field9146.method253(-13900);
            class504.field7206 = null;
            if (class493.field7014 == 65535) {
                class493.field7014 = -1;
            }
            return true;
        } else if (class592.field8312 == class504.field7206) {
            class644.field9146.field469 += 28;
            if (class644.field9146.method241((byte) -108)) {
                client.method1955(class644.field9146, class644.field9146.field469 - 28, (byte) 77);
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class24.field308) {
            class144.method1123(false, (byte) -38);
            class504.field7206 = null;
            return false;
        } else if (class504.field7206 == class363.field5087) {
            if (class401.field5610 != -1) {
                class425.method2588(0, -2, class401.field5610);
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class327.field4629) {
            class228.method1568(120);
            class504.field7206 = null;
            return false;
        } else if (class504.field7206 == class150.field2271) {
            class496.method2984(class86.field1556, (byte) -26);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class423.field5925) {
            int var168 = class644.field9146.method228((byte) 67);
            int var169 = class644.field9146.method234((byte) -116);
            class742.field10408.method3169(var168, false, var169);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class125.field1913) {
            class261.field3816 = class644.field9146.method278(121);
            class474.field6793 = class644.field9146.method288((byte) -127);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class211.field3042) {
            boolean var170 = class644.field9146.method273(255) == 1;
            String var171 = class644.field9146.method272(2);
            String var172 = var171;
            if (var170) {
                var172 = class644.field9146.method272(2);
            }
            int var173 = class644.field9146.method273(255);
            boolean var174 = false;
            if (var173 <= 1) {
                if (!(!class231.field3285 || class29.field398) || class253.field3605) {
                    var174 = true;
                } else if (var173 <= 1 && class212.method1488(var172, (byte) 19)) {
                    var174 = true;
                }
            }
            if (!var174 && class612.field8865 == 0) {
                String var175 = class57.method520(class580.method3352(15, class644.field9146), 126);
                if (var173 == 2) {
                    class79.method783(null, -1, "<img=1>" + var171, "<img=1>" + var172, 24, -102, 0, var171, var175);
                } else if (var173 == 1) {
                    class79.method783(null, -1, "<img=0>" + var171, "<img=0>" + var172, 24, -114, 0, var171, var175);
                } else {
                    class79.method783(null, -1, var171, var172, 24, -85, 0, var171, var175);
                }
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class342.field4802) {
            int var176 = class644.field9146.method253(-13900);
            if (var176 == 65535) {
                var176 = -1;
            }
            int var177 = class644.field9146.method273(255);
            int var178 = class644.field9146.method253(-13900);
            int var179 = class644.field9146.method273(255);
            class335.method2140(101, 256, var176, var179, var177, true, var178);
            class504.field7206 = null;
            return true;
        } else if (class633.field9069 == class504.field7206) {
            int var180 = class644.field9146.method288((byte) -127);
            class643.method3666(true);
            class504.field7206 = null;
            class426.field5958 = var180;
            return true;
        } else if (class527.field7485 == class504.field7206) {
            int var181 = class644.field9146.method253(-13900);
            int var182 = class644.field9146.method273(255);
            boolean var183 = (var182 & 0x1) == 1;
            class35.method255(var181, -82, var183);
            int var184 = class644.field9146.method253(-13900);
            for (int var185 = 0; var185 < var184; var185++) {
                int var186 = class644.field9146.method253(-13900);
                int var187 = class644.field9146.method278(123);
                if (var187 == 255) {
                    var187 = class644.field9146.method267(-102);
                }
                class620.method3588((byte) 110, var186 - 1, var181, var187, var183, var185);
            }
            class99.field1680[class555.method3246(class390.field5451++, 31)] = var181;
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class115.field1840) {
            int var188 = class644.field9146.method262((byte) -57);
            int var189 = var188 >> 28 & 0x3;
            int var190 = (var188 & 0xFFFFC6C) >> 14;
            int var191 = var188 & 0x3FFF;
            int var192 = class644.field9146.method228((byte) 67);
            if (var192 == 65535) {
                var192 = -1;
            }
            int var193 = class644.field9146.method278(106);
            int var194 = var193 >> 2;
            int var195 = var193 & 0x3;
            int var196 = var190 - class115.field1845;
            int var197 = class443.field6164[var194];
            int var198 = var191 - class64.field1160;
            class625.method3610(1466, var192, var195, var196, var198, var194, var189, var197);
            class504.field7206 = null;
            return true;
        } else if (class540.field7596 == class504.field7206) {
            String var199 = class644.field9146.method272(2);
            Object[] var200 = new Object[var199.length() + 1];
            for (int var201 = var199.length() - 1; var201 >= 0; var201--) {
                if (var199.charAt(var201) == 's') {
                    var200[var201 + 1] = class644.field9146.method272(2);
                } else {
                    var200[var201 + 1] = Integer.valueOf(class644.field9146.method234((byte) -111));
                }
            }
            var200[0] = Integer.valueOf(class644.field9146.method234((byte) -126));
            class643.method3666(true);
            class604 var202 = new class604();
            var202.field8773 = var200;
            class357.method2223(var202);
            class504.field7206 = null;
            return true;
        } else if (class6.field105 == class504.field7206) {
            class496.method2984(class252.field3597, (byte) -91);
            class504.field7206 = null;
            return true;
        } else if (class541.field7603 == class504.field7206) {
            int var203 = class644.field9146.method248((byte) -126);
            class643.method3666(true);
            class272.method1799(-109, var203);
            class504.field7206 = null;
            return true;
        } else if (class647.field9165 == class504.field7206) {
            int var204 = class644.field9146.method273(255);
            if (class644.field9146.method273(255) == 0) {
                class64.field1155[var204] = new class496();
            } else {
                class644.field9146.field469--;
                class64.field1155[var204] = new class496(class644.field9146);
            }
            class345.field4861 = class374.field5247;
            class504.field7206 = null;
            return true;
        } else if (class667.field9358 == class504.field7206) {
            boolean var205 = class644.field9146.method273(255) == 1;
            String var206 = class644.field9146.method272(2);
            String var207 = var206;
            if (var205) {
                var207 = class644.field9146.method272(2);
            }
            long var208 = (long) class644.field9146.method253(-13900);
            long var210 = (long) class644.field9146.method239(-20);
            int var212 = class644.field9146.method273(255);
            int var213 = class644.field9146.method253(-13900);
            long var214 = (var208 << 32) + var210;
            boolean var216 = false;
            int var217 = 0;
            while (true) {
                if (var217 >= 100) {
                    if (var212 <= 1 && class212.method1488(var207, (byte) 19)) {
                        var216 = true;
                    }
                    break;
                }
                if (class187.field2693[var217] == var214) {
                    var216 = true;
                    break;
                }
                var217++;
            }
            if (!var216 && class612.field8865 == 0) {
                class187.field2693[class392.field5501] = var214;
                class392.field5501 = (class392.field5501 + 1) % 100;
                String var218 = class643.field9141.method3679(var213, 64).method2345(-31, class644.field9146);
                if (var212 == 2) {
                    class79.method783(null, var213, "<img=1>" + var206, "<img=1>" + var207, 18, -96, 0, var206, var218);
                } else if (var212 == 1) {
                    class79.method783(null, var213, "<img=0>" + var206, "<img=0>" + var207, 18, -126, 0, var206, var218);
                } else {
                    class79.method783(null, var213, var206, var207, 18, -92, 0, var206, var218);
                }
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class102.field1714) {
            while (class374.field5243 > class644.field9146.field469) {
                boolean var229 = class644.field9146.method273(255) == 1;
                String var230 = class644.field9146.method272(2);
                String var231 = class644.field9146.method272(2);
                int var232 = class644.field9146.method253(-13900);
                int var233 = class644.field9146.method273(255);
                String var234 = "";
                boolean var235 = false;
                if (var232 > 0) {
                    var234 = class644.field9146.method272(2);
                    var235 = class644.field9146.method273(255) == 1;
                }
                for (int var236 = 0; var236 < class425.field5945; var236++) {
                    if (var229) {
                        if (var231.equals(class583.field8236[var236])) {
                            class583.field8236[var236] = var230;
                            class111.field1800[var236] = var231;
                            var230 = null;
                            break;
                        }
                    } else if (var230.equals(class583.field8236[var236])) {
                        if (class170.field2486[var236] != var232) {
                            boolean var237 = true;
                            for (class426 var238 = (class426) class158.field2358.method4159(0); var238 != null; var238 = (class426) class158.field2358.method4151(7)) {
                                if (var238.field5961.equals(var230)) {
                                    if (var232 != 0 && var238.field5952 == 0) {
                                        var237 = false;
                                        var238.method909(83);
                                    } else if (var232 == 0 && var238.field5952 != 0) {
                                        var238.method909(-121);
                                        var237 = false;
                                    }
                                }
                            }
                            if (var237) {
                                class158.field2358.method4152(new class426(var230, var232), 0);
                            }
                            class170.field2486[var236] = var232;
                        }
                        class111.field1800[var236] = var231;
                        class301.field4237[var236] = var234;
                        class159.field2371[var236] = var233;
                        class425.field5947[var236] = var235;
                        var230 = null;
                        break;
                    }
                }
                if (var230 != null && class425.field5945 < 200) {
                    class583.field8236[class425.field5945] = var230;
                    class111.field1800[class425.field5945] = var231;
                    class170.field2486[class425.field5945] = var232;
                    class301.field4237[class425.field5945] = var234;
                    class159.field2371[class425.field5945] = var233;
                    class425.field5947[class425.field5945] = var235;
                    class425.field5945++;
                }
            }
            class488.field6905 = 2;
            class688.field9702 = class374.field5247;
            boolean var219 = false;
            int var220 = class425.field5945;
            while (var220 > 0) {
                boolean var221 = true;
                var220--;
                for (int var222 = 0; var222 < var220; var222++) {
                    if (class170.field2486[var222] != class67.field1223.field8324 && class170.field2486[var222 + 1] == class67.field1223.field8324 || class170.field2486[var222] == 0 && class170.field2486[var222 + 1] != 0) {
                        int var223 = class170.field2486[var222];
                        class170.field2486[var222] = class170.field2486[var222 + 1];
                        class170.field2486[var222 + 1] = var223;
                        String var224 = class301.field4237[var222];
                        class301.field4237[var222] = class301.field4237[var222 + 1];
                        class301.field4237[var222 + 1] = var224;
                        String var225 = class583.field8236[var222];
                        class583.field8236[var222] = class583.field8236[var222 + 1];
                        class583.field8236[var222 + 1] = var225;
                        String var226 = class111.field1800[var222];
                        class111.field1800[var222] = class111.field1800[var222 + 1];
                        class111.field1800[var222 + 1] = var226;
                        int var227 = class159.field2371[var222];
                        class159.field2371[var222] = class159.field2371[var222 + 1];
                        class159.field2371[var222 + 1] = var227;
                        boolean var228 = class425.field5947[var222];
                        class425.field5947[var222] = class425.field5947[var222 + 1];
                        class425.field5947[var222 + 1] = var228;
                        var221 = false;
                    }
                }
                if (var221) {
                    break;
                }
            }
            class504.field7206 = null;
            return true;
        } else if (class90.field1605 == class504.field7206) {
            int var239 = class644.field9146.method253(-13900);
            int var240 = class644.field9146.method273(255);
            class643.method3666(true);
            class351.method2208((byte) 107, true, var240, var239);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class188.field2713) {
            class591.method3396(-3, class374.field5243, class644.field9146, class341.field4796);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class385.field5379) {
            class488.field6905 = 1;
            class504.field7206 = null;
            class688.field9702 = class374.field5247;
            return true;
        } else if (class504.field7206 == class392.field5502) {
            int var241 = class644.field9146.method228((byte) 67);
            if (var241 == 65535) {
                var241 = -1;
            }
            int var242 = class644.field9146.method265(-4);
            int var243 = class644.field9146.method248((byte) -112);
            if (var243 == 65535) {
                var243 = -1;
            }
            int var244 = class644.field9146.method265(-4);
            class643.method3666(true);
            for (int var245 = var241; var245 <= var243; var245++) {
                long var246 = ((long) var244 << 32) + (long) var245;
                class331 var248 = (class331) class563.field7972.method4203(true, var246);
                class331 var249;
                if (var248 != null) {
                    var249 = new class331(var242, var248.field4675);
                    var248.method3617(1);
                } else if (var245 == -1) {
                    var249 = new class331(var242, class545.method3220(65535, var244).field871.field4675);
                } else {
                    var249 = new class331(var242, -1);
                }
                class563.field7972.method4211(var249, (byte) 85, var246);
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class1.field13) {
            int var250 = class644.field9146.method280((byte) -16);
            int var251 = class644.field9146.method228((byte) 67);
            int var252 = class644.field9146.method267(-105);
            int var253 = class644.field9146.method253(-13900);
            class643.method3666(true);
            class73.method737(var250, var252, var253, (byte) 21, var251);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class405.field5642) {
            class496.method2984(class697.field9801, (byte) -115);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class274.field3904) {
            String var254 = class644.field9146.method272(2);
            boolean var255 = class644.field9146.method273(255) == 1;
            String var256;
            if (var255) {
                var256 = class644.field9146.method272(2);
            } else {
                var256 = var254;
            }
            int var257 = class644.field9146.method253(-13900);
            byte var258 = class644.field9146.method277((byte) 107);
            boolean var259 = false;
            if (var258 == -128) {
                var259 = true;
            }
            if (var259) {
                if (class208.field2982 == 0) {
                    class504.field7206 = null;
                    return true;
                }
                boolean var260 = false;
                int var261;
                for (var261 = 0; class208.field2982 > var261 && (!class20.field259[var261].field8123.equals(var256) || class20.field259[var261].field8127 != var257); var261++) {
                }
                if (var261 < class208.field2982) {
                    while (class208.field2982 - 1 > var261) {
                        class20.field259[var261] = class20.field259[var261 + 1];
                        var261++;
                    }
                    class208.field2982--;
                    class20.field259[class208.field2982] = null;
                }
            } else {
                String var262 = class644.field9146.method272(2);
                class573 var263 = new class573();
                var263.field8125 = var254;
                var263.field8123 = var256;
                var263.field8124 = class726.method4041(-1, var263.field8123);
                var263.field8127 = var257;
                var263.field8129 = var258;
                var263.field8128 = var262;
                int var264;
                for (var264 = class208.field2982 - 1; var264 >= 0; var264--) {
                    int var265 = class20.field259[var264].field8124.compareTo(var263.field8124);
                    if (var265 == 0) {
                        class20.field259[var264].field8127 = var257;
                        class20.field259[var264].field8129 = var258;
                        class20.field259[var264].field8128 = var262;
                        if (var256.equals(class468.field6748.field4939)) {
                            class588.field8273 = var258;
                        }
                        class526.field7475 = class374.field5247;
                        class504.field7206 = null;
                        return true;
                    }
                    if (var265 < 0) {
                        break;
                    }
                }
                if (class208.field2982 >= class20.field259.length) {
                    class504.field7206 = null;
                    return true;
                }
                for (int var266 = class208.field2982 - 1; var266 > var264; var266--) {
                    class20.field259[var266 + 1] = class20.field259[var266];
                }
                if (class208.field2982 == 0) {
                    class20.field259 = new class573[100];
                }
                class20.field259[var264 + 1] = var263;
                class208.field2982++;
                if (var256.equals(class468.field6748.field4939)) {
                    class588.field8273 = var258;
                }
            }
            class526.field7475 = class374.field5247;
            class504.field7206 = null;
            return true;
        } else if (class99.field1682 == class504.field7206) {
            byte var267 = class644.field9146.method274(29471);
            int var268 = class644.field9146.method248((byte) -122);
            class643.method3666(true);
            class628.method3624(var268, (byte) -121, var267);
            class504.field7206 = null;
            return true;
        } else if (class656.field9231 == class504.field7206) {
            int var269 = class644.field9146.method262((byte) -57);
            int var270 = class644.field9146.method234((byte) -95);
            int var271 = class644.field9146.method280((byte) -29);
            class643.method3666(true);
            class81.method790(var269, var271, 5, 4, var270);
            class504.field7206 = null;
            return true;
        } else if (class590.field8287 == class504.field7206) {
            class504.field7206 = null;
            return false;
        } else if (class504.field7206 == class249.field3491) {
            int var272 = class644.field9146.method236(122);
            int var273 = class644.field9146.method228((byte) 67);
            class643.method3666(true);
            if (var272 == 2) {
                class139.method1103((byte) 45);
            }
            class401.field5610 = var273;
            class301.method1959(var273, 0);
            class319.method2050(0, false);
            class357.method2231(class401.field5610);
            for (int var274 = 0; var274 < 100; var274++) {
                class329.field4646[var274] = true;
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class453.field6371) {
            class255.field3697 = class644.field9146.method273(255);
            class504.field7206 = null;
            return true;
        } else if (class662.field9309 == class504.field7206) {
            int var275 = class644.field9146.method248((byte) -95);
            class643.method3666(true);
            class291.method1874(var275, (byte) -126);
            class504.field7206 = null;
            return true;
        } else if (class643.field9139 == class504.field7206) {
            int var276 = class644.field9146.method267(-117);
            int var277 = class644.field9146.method253(-13900);
            if (var277 == 65535) {
                var277 = -1;
            }
            int var278 = class644.field9146.method228((byte) 67);
            if (var278 == 65535) {
                var278 = -1;
            }
            int var279 = class644.field9146.method228((byte) 67);
            class643.method3666(true);
            for (int var280 = var278; var280 <= var277; var280++) {
                long var281 = ((long) var276 << 32) + (long) var280;
                class331 var283 = (class331) class563.field7972.method4203(true, var281);
                class331 var284;
                if (var283 != null) {
                    var284 = new class331(var283.field4679, var279);
                    var283.method3617(1);
                } else if (var280 == -1) {
                    var284 = new class331(class545.method3220(65535, var276).field871.field4679, var279);
                } else {
                    var284 = new class331(0, var279);
                }
                class563.field7972.method4211(var284, (byte) 51, var281);
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class158.field2367) {
            int var285 = class644.field9146.method234((byte) -95);
            int var286 = class644.field9146.method253(-13900);
            class643.method3666(true);
            class628.method3624(var286, (byte) -117, var285);
            class504.field7206 = null;
            return true;
        } else if (class521.field7388 == class504.field7206) {
            int var287 = class644.field9146.method249(3099);
            int var288 = class644.field9146.method267(-81);
            class643.method3666(true);
            class223.method1544(var287, var288, 5);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class349.field4908) {
            int var289 = class644.field9146.method265(-4);
            int var290 = class644.field9146.method228((byte) 67);
            class643.method3666(true);
            class205.method1429(var290, var289, -29861);
            class504.field7206 = null;
            return true;
        } else if (class82.field1518 == class504.field7206) {
            class643.method3666(true);
            class156.method1189((byte) -99);
            class504.field7206 = null;
            return true;
        } else if (class752.field10478 == class504.field7206) {
            if (class330.field4654 != null) {
                class492.method2959(class471.field6781.field6700.method2157(27669), false, -1, -1, (byte) 115);
            }
            byte[] var291 = new byte[class374.field5243];
            class644.field9146.method2691(var291, -57, class374.field5243, 0);
            String var292 = class268.method1791(0, var291, class374.field5243, 0);
            class548.method3229(23060, var292, class341.field4796, class471.field6781.field6684.method1843(27669) == 1, true);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class229.field3266) {
            class397.method2464(0, class644.field9146.method272(2));
            class504.field7206 = null;
            return true;
        } else if (class76.field1449 == class504.field7206) {
            int var293 = class644.field9146.method265(-4);
            int var294 = class644.field9146.method253(-13900);
            class742.field10408.method3171(var293, (byte) -120, var294);
            class504.field7206 = null;
            return true;
        } else if (class543.field7661 == class504.field7206) {
            int var295 = class644.field9146.method253(-13900);
            int var296 = class644.field9146.method265(-4);
            int var297 = class644.field9146.method228((byte) 67);
            int var298 = class644.field9146.method228((byte) 67);
            class643.method3666(true);
            class81.method790(var296, var297 | var298 << 16, 7, 4, var295);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class376.field5260) {
            int var299 = class644.field9146.method267(-72);
            int var300 = class644.field9146.method280((byte) -90);
            class643.method3666(true);
            class117.method950(var300, var299, true);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class260.field3809) {
            class60.method668(4798);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class162.field2407) {
            class104.method900((byte) -126);
            class504.field7206 = null;
            return false;
        } else if (class504.field7206 == class199.field2861) {
            int var301 = class644.field9146.method253(-13900);
            if (var301 == 65535) {
                var301 = -1;
            }
            int var302 = class644.field9146.method273(255);
            int var303 = class644.field9146.method253(-13900);
            int var304 = class644.field9146.method273(255);
            int var305 = class644.field9146.method253(-13900);
            class247.method1652(var305, var302, true, var304, var301, var303);
            class504.field7206 = null;
            return true;
        } else if (class60.field1113 == class504.field7206) {
            int var306 = class644.field9146.method253(-13900);
            if (var306 == 65535) {
                var306 = -1;
            }
            int var307 = class644.field9146.method265(-4);
            class643.method3666(true);
            class81.method790(var307, var306, 2, 4, -1);
            class504.field7206 = null;
            return true;
        } else if (class598.field8715 == class504.field7206) {
            for (int var308 = 0; var308 < class165.field2442.length; var308++) {
                if (class165.field2442[var308] != null) {
                    class165.field2442[var308].field885 = null;
                    class165.field2442[var308].field944 = -1;
                }
            }
            for (int var309 = 0; var309 < class130.field1948; var309++) {
                class379.field5284[var309].field3885.field885 = null;
                class379.field5284[var309].field3885.field944 = -1;
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class202.field2886) {
            int var310 = class644.field9146.method236(115);
            int var311 = class644.field9146.method253(-13900) << 2;
            int var312 = class644.field9146.method236(121);
            int var313 = class644.field9146.method236(116);
            int var314 = class644.field9146.method273(255);
            class643.method3666(true);
            class423.method2584(var311, var313, var314, var310, (byte) -101, var312);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class132.field1999) {
            int var315 = class644.field9146.method280((byte) -44);
            byte var316 = class644.field9146.method242(-2);
            class742.field10408.method3169(var315, false, var316);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class497.field7086) {
            int var317 = class644.field9146.method267(-89);
            class643.method3666(true);
            if (var317 == -1) {
                class411.field5689 = -1;
                class679.field9569 = -1;
            } else {
                int var318 = (var317 & 0xFFFD4A5) >> 14;
                int var319 = var317 & 0x3FFF;
                int var320 = var318 - class115.field1845;
                int var321 = var319 - class64.field1160;
                if (var320 < 0) {
                    var320 = 0;
                } else if (class174.field2540 <= var320) {
                    var320 = class174.field2540;
                }
                if (var321 < 0) {
                    var321 = 0;
                } else if (var321 >= class716.field9999) {
                    var321 = class716.field9999;
                }
                class679.field9569 = (var320 << 9) + 256;
                class411.field5689 = (var321 << 9) + 256;
            }
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class186.field2632) {
            int var322 = class644.field9146.method253(-13900);
            int var323 = class644.field9146.method253(-13900);
            int var324 = class644.field9146.method253(-13900);
            class643.method3666(true);
            if (class117.field1849[var322] != null) {
                for (int var325 = var323; var325 < var324; var325++) {
                    int var326 = class644.field9146.method239(-63);
                    if (class117.field1849[var322].length > var325 && class117.field1849[var322][var325] != null) {
                        class117.field1849[var322][var325].field744 = var326;
                    }
                }
            }
            class504.field7206 = null;
            return true;
        } else if (class539.field7581 == class504.field7206) {
            class24.field313 = class644.field9146.method273(255);
            class152.field2294 = class644.field9146.method274(29471) << 3;
            class456.field6590 = class644.field9146.method286(128) << 3;
            class504.field7206 = null;
            return true;
        } else if (class82.field1516 == class504.field7206) {
            int var327 = class644.field9146.method288((byte) -127);
            int var328 = class644.field9146.method280((byte) -51);
            boolean var329 = (var327 & 0x1) == 1;
            class452.method2690(var328, var329, 114);
            class99.field1680[class555.method3246(class390.field5451++, 31)] = var328;
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class125.field1914) {
            int var330 = class644.field9146.method248((byte) -118);
            int var331 = class644.field9146.method278(88);
            class742.field10408.method3171(var331, (byte) 120, var330);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class285.field4052) {
            class701.field9849 = class644.field9146.method244((byte) 110);
            class231.field3285 = class644.field9146.method273(255) == 1;
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class195.field2794) {
            class496.method2984(class686.field9676, (byte) -116);
            class504.field7206 = null;
            return true;
        } else if (class591.field8297 == class504.field7206) {
            int var332 = class644.field9146.method248((byte) -102);
            if (var332 == 65535) {
                var332 = -1;
            }
            int var333 = class644.field9146.method265(-4);
            class643.method3666(true);
            class81.method790(var333, var332, 1, 4, -1);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class392.field5504) {
            int var334 = class644.field9146.method253(-13900);
            if (var334 == 65535) {
                var334 = -1;
            }
            int var335 = class644.field9146.method273(255);
            int var336 = class644.field9146.method253(-13900);
            int var337 = class644.field9146.method273(255);
            int var338 = class644.field9146.method253(-13900);
            class335.method2140(95, var338, var334, var337, var335, false, var336);
            class504.field7206 = null;
            return true;
        } else if (class504.field7206 == class284.field4040) {
            boolean var339 = class644.field9146.method273(255) == 1;
            byte[] var340 = new byte[class374.field5243 - 1];
            class644.field9146.method260(var340, 106, class374.field5243 - 1, 0);
            class498.method2996(var339, 0, var340);
            class504.field7206 = null;
            return true;
        } else {
            int var341 = -13 % (-arg0 / 41);
            if (class640.field9108 == class504.field7206) {
                int var342 = class644.field9146.method234((byte) -123);
                int var343 = class644.field9146.method253(-13900);
                int var344 = class644.field9146.method253(-13900);
                int var345 = class644.field9146.method273(255);
                int var346 = class644.field9146.method248((byte) -97);
                boolean var347 = (var345 & 0x80) != 0;
                int var348 = var345 & 0x7;
                int var349 = var345 >> 3 & 0xF;
                if (var349 == 15) {
                    var349 = -1;
                }
                if (var342 >> 30 != 0) {
                    int var350 = (var342 & 0x3FCF8FFB) >> 28;
                    int var351 = (var342 >> 14 & 0x3FFF) - class115.field1845;
                    int var352 = (var342 & 0x3FFF) - class64.field1160;
                    if (var351 >= 0 && var352 >= 0 && var351 < class174.field2540 && class716.field9999 > var352) {
                        int var353 = var351 * 512 + 256;
                        int var354 = var352 * 512 + 256;
                        int var355 = var350;
                        if (var350 < 3 && class634.method3647(-63, var352, var351)) {
                            var355 = var350 + 1;
                        }
                        class53 var356 = new class53(var344, var346, class605.field8787, var350, var355, var353, class534.method3136(1, var350, var353, var354) - var343, var354, var351, var351, var352, var352, var348);
                        class567.field8051.method1526(new class679(var356), -39);
                    }
                } else if (var342 >> 29 != 0) {
                    int var372 = var342 & 0xFFFF;
                    class272 var373 = (class272) class758.field10539.method4203(true, (long) var372);
                    if (var373 != null) {
                        class84 var374 = var373.field3885;
                        if (var344 == 65535) {
                            var344 = -1;
                        }
                        boolean var375 = true;
                        int var376 = var347 ? var374.field908 : var374.field957;
                        if (var344 != -1 && var376 != -1) {
                            if (var344 == var376) {
                                class164 var381 = class638.field9104.method3753(116, var344);
                                if (var381.field2412 && var381.field2427 != -1) {
                                    class718 var382 = class698.field9806.method851(var381.field2427, -2);
                                    int var383 = var382.field10061;
                                    if (var383 == 0 || var383 == 2) {
                                        var375 = false;
                                    } else if (var383 == 1) {
                                        var375 = true;
                                    }
                                }
                            } else {
                                class164 var377 = class638.field9104.method3753(95, var344);
                                class164 var378 = class638.field9104.method3753(122, var376);
                                if (var377.field2427 != -1 && var378.field2427 != -1) {
                                    class718 var379 = class698.field9806.method851(var377.field2427, -2);
                                    class718 var380 = class698.field9806.method851(var378.field2427, -2);
                                    if (var379.field10064 < var380.field10064) {
                                        var375 = false;
                                    }
                                }
                            }
                        }
                        if (var375) {
                            if (var347) {
                                var374.field908 = var344;
                                var374.field925 = var343;
                                var374.field880 = 0;
                                var374.field882 = 0;
                                var374.field896 = var349;
                                var374.field932 = var348;
                                var374.field910 = 1;
                                var374.field899 = class605.field8787 + var346;
                                if (var374.field899 > class605.field8787) {
                                    var374.field880 = -1;
                                }
                                if (var374.field908 != -1 && class605.field8787 == var374.field899) {
                                    int var384 = class638.field9104.method3753(-59, var374.field908).field2427;
                                    if (var384 != -1) {
                                        class718 var385 = class698.field9806.method851(var384, -2);
                                        if (var385 != null && var385.field10053 != null && !var374.field892) {
                                            class749.method4165(0, (byte) 53, var385, var374);
                                        }
                                    }
                                }
                            } else {
                                var374.field955 = var343;
                                var374.field906 = 0;
                                var374.field909 = var348;
                                var374.field960 = class605.field8787 + var346;
                                var374.field890 = 0;
                                var374.field957 = var344;
                                var374.field940 = 1;
                                var374.field922 = var349;
                                if (var374.field960 > class605.field8787) {
                                    var374.field890 = -1;
                                }
                                if (var374.field957 != -1 && class605.field8787 == var374.field960) {
                                    int var386 = class638.field9104.method3753(-64, var374.field957).field2427;
                                    if (var386 != -1) {
                                        class718 var387 = class698.field9806.method851(var386, -2);
                                        if (var387 != null && var387.field10053 != null && !var374.field892) {
                                            class749.method4165(0, (byte) 58, var387, var374);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (var342 >> 28 != 0) {
                    int var357 = var342 & 0xFFFF;
                    class349 var358;
                    if (class675.field9486 == var357) {
                        var358 = class468.field6748;
                    } else {
                        var358 = class165.field2442[var357];
                    }
                    if (var358 != null) {
                        if (var344 == 65535) {
                            var344 = -1;
                        }
                        boolean var359 = true;
                        int var360 = var347 ? var358.field908 : var358.field957;
                        if (var344 != -1 && var360 != -1) {
                            if (var344 == var360) {
                                class164 var365 = class638.field9104.method3753(95, var344);
                                if (var365.field2412 && var365.field2427 != -1) {
                                    class718 var366 = class698.field9806.method851(var365.field2427, -2);
                                    int var367 = var366.field10061;
                                    if (var367 == 0 || var367 == 2) {
                                        var359 = false;
                                    } else if (var367 == 1) {
                                        var359 = true;
                                    }
                                }
                            } else {
                                class164 var361 = class638.field9104.method3753(-49, var344);
                                class164 var362 = class638.field9104.method3753(-115, var360);
                                if (var361.field2427 != -1 && var362.field2427 != -1) {
                                    class718 var363 = class698.field9806.method851(var361.field2427, -2);
                                    class718 var364 = class698.field9806.method851(var362.field2427, -2);
                                    if (var364.field10064 > var363.field10064) {
                                        var359 = false;
                                    }
                                }
                            }
                        }
                        if (var359) {
                            if (var347) {
                                var358.field882 = 0;
                                var358.field932 = var348;
                                var358.field896 = var349;
                                var358.field925 = var343;
                                var358.field908 = var344;
                                var358.field880 = 0;
                                var358.field910 = 1;
                                var358.field899 = class605.field8787 + var346;
                                if (var358.field899 > class605.field8787) {
                                    var358.field880 = -1;
                                }
                                if (var358.field908 == 65535) {
                                    var358.field908 = -1;
                                }
                                if (var358.field908 != -1 && class605.field8787 == var358.field899) {
                                    int var368 = class638.field9104.method3753(-109, var358.field908).field2427;
                                    if (var368 != -1) {
                                        class718 var369 = class698.field9806.method851(var368, -2);
                                        if (var369 != null && var369.field10053 != null && !var358.field892) {
                                            class749.method4165(0, (byte) 67, var369, var358);
                                        }
                                    }
                                }
                            } else {
                                var358.field940 = 1;
                                var358.field960 = class605.field8787 + var346;
                                var358.field906 = 0;
                                var358.field890 = 0;
                                var358.field922 = var349;
                                var358.field957 = var344;
                                var358.field909 = var348;
                                var358.field955 = var343;
                                if (class605.field8787 < var358.field960) {
                                    var358.field890 = -1;
                                }
                                if (var358.field957 == 65535) {
                                    var358.field957 = -1;
                                }
                                if (var358.field957 != -1 && class605.field8787 == var358.field960) {
                                    int var370 = class638.field9104.method3753(-98, var358.field957).field2427;
                                    if (var370 != -1) {
                                        class718 var371 = class698.field9806.method851(var370, -2);
                                        if (var371 != null && var371.field10053 != null && !var358.field892) {
                                            class749.method4165(0, (byte) 38, var371, var358);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class504.field7206 = null;
                return true;
            } else if (class604.field8781 == class504.field7206) {
                int var388 = class644.field9146.method236(125);
                int var389 = class644.field9146.method253(-13900) << 2;
                int var390 = class644.field9146.method288((byte) -127);
                int var391 = class644.field9146.method278(87);
                int var392 = class644.field9146.method278(123);
                class643.method3666(true);
                class607.method3513(var389, var391, var388, var390, 91, true, var392);
                class504.field7206 = null;
                return true;
            } else if (class504.field7206 == class396.field5539) {
                class152.field2294 = class644.field9146.method242(-2) << 3;
                class456.field6590 = class644.field9146.method274(29471) << 3;
                class24.field313 = class644.field9146.method273(255);
                for (class694 var393 = (class694) class136.field2123.method4209(false); var393 != null; var393 = (class694) class136.field2123.method4207(9356)) {
                    int var395 = (int) (var393.field8991 >> 28 & 0x3L);
                    int var396 = (int) (var393.field8991 & 0x3FFFL);
                    int var397 = var396 - class115.field1845;
                    int var398 = (int) (var393.field8991 >> 14 & 0x3FFFL);
                    int var399 = var398 - class64.field1160;
                    if (class24.field313 == var395 && var397 >= class152.field2294 && (class152.field2294 + 8) > var397 && class456.field6590 <= var399 && class456.field6590 + 8 > var399) {
                        var393.method3617(1);
                        if (var397 >= 0 && var399 >= 0 && var397 < class174.field2540 && var399 < class716.field9999) {
                            class152.method1168(class24.field313, 256, var397, var399);
                        }
                    }
                }
                for (class226 var394 = (class226) class476.field6811.method1522(true); var394 != null; var394 = (class226) class476.field6811.method1527((byte) 126)) {
                    if (class152.field2294 <= var394.field3237 && (class152.field2294 + 8) > var394.field3237 && class456.field6590 <= var394.field3225 && class456.field6590 + 8 > var394.field3225 && class24.field313 == var394.field3235) {
                        var394.field3234 = 0;
                    }
                }
                class504.field7206 = null;
                return true;
            } else if (class515.field7335 == class504.field7206) {
                int var400 = class644.field9146.method262((byte) -57);
                class643.method3666(true);
                class81.method790(var400, -1, 3, 4, -1);
                class504.field7206 = null;
                return true;
            } else if (class504.field7206 == class455.field6585) {
                boolean var401 = class644.field9146.method273(255) == 1;
                class643.method3666(true);
                class310.field4379 = var401;
                class504.field7206 = null;
                return true;
            } else if (class504.field7206 == class435.field6084) {
                class496.method2984(class742.field10407, (byte) -122);
                class504.field7206 = null;
                return true;
            } else if (class735.field10345 == class504.field7206) {
                String var402 = class644.field9146.method272(2);
                int var403 = class644.field9146.method267(-108);
                class643.method3666(true);
                class731.method4072(var403, var402, (byte) -110);
                class504.field7206 = null;
                return true;
            } else if (class504.field7206 == class342.field4814) {
                int var404 = class644.field9146.method265(-4);
                int var405 = class644.field9146.method225((byte) 125);
                int var406 = class644.field9146.method289(false);
                class643.method3666(true);
                class77.method771(var405, var406, var404, (byte) 87);
                class504.field7206 = null;
                return true;
            } else if (class504.field7206 == class186.field2679) {
                class222.field3169 = class644.field9146.method273(255);
                for (int var407 = 0; var407 < class222.field3169; var407++) {
                    class162.field2404[var407] = class644.field9146.method272(2);
                    class349.field4928[var407] = class644.field9146.method272(2);
                    if (class349.field4928[var407].equals("")) {
                        class349.field4928[var407] = class162.field2404[var407];
                    }
                    class628.field9029[var407] = class644.field9146.method272(2);
                    class186.field2673[var407] = class644.field9146.method272(2);
                    if (class186.field2673[var407].equals("")) {
                        class186.field2673[var407] = class628.field9029[var407];
                    }
                    class259.field3808[var407] = false;
                }
                class504.field7206 = null;
                class688.field9702 = class374.field5247;
                return true;
            } else if (class504.field7206 == class182.field2598) {
                class456.field6590 = class644.field9146.method277((byte) 40) << 3;
                class24.field313 = class644.field9146.method288((byte) -127);
                class152.field2294 = class644.field9146.method277((byte) -125) << 3;
                while (class644.field9146.field469 < class374.field5243) {
                    class559 var408 = class111.method937((byte) -61)[class644.field9146.method273(255)];
                    class496.method2984(var408, (byte) -41);
                }
                class504.field7206 = null;
                return true;
            } else if (class504.field7206 == class199.field2854) {
                class496.method2984(class532.field7533, (byte) -26);
                class504.field7206 = null;
                return true;
            } else {
                class621.method3591("T1 - " + (class504.field7206 == null ? -1 : class504.field7206.method2829(false)) + "," + (class689.field9709 == null ? -1 : class689.field9709.method2829(false)) + "," + (class386.field5398 == null ? -1 : class386.field5398.method2829(false)) + " - " + class374.field5243, null, (byte) -96);
                class144.method1123(false, (byte) -38);
                return true;
            }
        }
    }
}
