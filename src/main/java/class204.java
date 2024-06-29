import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class204 {

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "Lpm;")
    public static class349 field2882 = new class349("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "[S")
    public static short[] field2885 = new short[] { 20, 19, 5, 21, 4, 58, 3, 8 };

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field2887 = new String[100];

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "Ltj;")
    public static class108 field2878;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "Lup;")
    public static class150 field2886;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "[I")
    public static int[] field2881;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "[Lsk;")
    public static class371[] field2875;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILvq;[[ILuh;[[BILuh;[[BZI[[B[[BI)V", line = 5)
    public static final void method1420(int arg0, class269 arg1, int[][] arg2, class92 arg3, byte[][] arg4, int arg5, class92 arg6, byte[][] arg7, boolean arg8, int arg9, byte[][] arg10, byte[][] arg11, int arg12) {
        if (arg0 != -7011) {
            method1425(126);
        }
        field2883++;
        if (class110.field1418 == 0 && !class324.field4717) {
            class180.method1293(arg8, arg10, arg12, arg11, arg0 + 7014, arg2, arg7, arg5, arg6, arg9, arg1, arg3, arg4);
        } else {
            class72.method437(arg11, arg8, arg2, arg9, arg5, arg3, arg4, arg7, arg12, arg1, arg6, arg10, 0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V", line = 20)
    public static final void method1421(boolean arg0) {
        int var1 = 0;
        if (arg0) {
            method1430();
        }
        while (class221.field3176 > var1) {
            int var10002 = class32.field411[var1]--;
            if (class32.field411[var1] >= -10) {
                label89: {
                    class383 var3 = class259.field3830[var1];
                    if (var3 == null) {
                        var3 = class383.method2436(class119.field1609, class23.field293[var1], 0);
                        if (var3 == null) {
                            break label89;
                        }
                        class32.field411[var1] += var3.method2439();
                        class259.field3830[var1] = var3;
                    }
                    if (class32.field411[var1] < 0) {
                        label92: {
                            int var4;
                            if (class430.field6122[var1] == 0) {
                                var4 = class168.field2384[var1] * class266.field3910 >> 8;
                            } else {
                                int var5 = (class430.field6122[var1] & 0xFF) * 128;
                                int var6 = (class430.field6122[var1] & 0xFF20BB) >> 16;
                                int var7 = var6 * 128 + 64 - class181.field2555.field4463;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = (class430.field6122[var1] & 0xFFF6) >> 8;
                                int var9 = var8 * 128 + 64 - class181.field2555.field4466;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 128;
                                if (var10 > var5) {
                                    class32.field411[var1] = -100;
                                    break label92;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var4 = (var5 - var10) * class170.field2398 * class168.field2384[var1] / var5 >> 8;
                            }
                            if (var4 > 0) {
                                class272 var11 = var3.method2438().method1859(class168.field2381);
                                class244 var12 = class244.method1695(var11, 100, var4);
                                var12.method1693(class265.field3892[var1] - 1);
                                class378.field5380.method2291(var12);
                            }
                            class32.field411[var1] = -100;
                        }
                    }
                }
            } else {
                class221.field3176--;
                for (int var2 = var1; var2 < class221.field3176; var2++) {
                    class23.field293[var2] = class23.field293[var2 + 1];
                    class259.field3830[var2] = class259.field3830[var2 + 1];
                    class265.field3892[var2] = class265.field3892[var2 + 1];
                    class32.field411[var2] = class32.field411[var2 + 1];
                    class430.field6122[var2] = class430.field6122[var2 + 1];
                    class168.field2384[var2] = class168.field2384[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        field2876++;
        if (class96.field1223 && !class267.method1827(107)) {
            if (class131.field1914 != 0 && class30.field367 != -1) {
                class100.method582(2, class30.field367, 0, false, class72.field942, class131.field1914);
            }
            class96.field1223 = false;
        } else if (class131.field1914 != 0 && class30.field367 != -1 && !class267.method1827(102)) {
            class407.field5761.method2048(2040, 79);
            class56.field749++;
            class407.field5761.method849(class30.field367, (byte) -112);
            class30.field367 = -1;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)Lph;", line = 155)
    public static final class386 method1422(int arg0, int arg1) {
        field2872++;
        class386 var2 = (class386) class285.field4152.method99(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class431.field6171.method643(arg0, arg1, true);
        class386 var4 = new class386();
        if (var3 != null) {
            var4.method2450(new class130(var3), arg1, true);
        }
        class285.field4152.method90(var4, (long) arg1, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lsf;II)Lkq;", line = 178)
    public static final class353 method1423(class306 arg0, int arg1, int arg2) {
        field2879++;
        class353 var3;
        if (class162.field2319 == null) {
            var3 = new class353();
        } else {
            var3 = class162.field2319;
            class162.field2319 = class162.field2319.field5127;
            var3.field5127 = null;
            class70.field931--;
        }
        if (arg2 != 82) {
            field2878 = null;
        }
        var3.field5125 = arg0;
        var3.field5119 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)V", line = 203)
    public static final void method1424(byte arg0, int arg1) {
        field2877++;
        class15 var2 = class100.field1271;
        synchronized (class100.field1271) {
            class100.field1271.method91(4, arg1);
            if (arg0 >= -104) {
                method1423((class306) null, -57, -68);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 220)
    public static final void method1425(int arg0) {
        if (class5.field84 < 102) {
            class5.field84 += 6;
        }
        field2880++;
        if (arg0 != 0) {
            return;
        }
        if (class6.field90 != 0) {
            class282.field4033 -= class6.field90 * 5;
            if (class442.field6328 <= class282.field4033) {
                class282.field4033 = class442.field6328 - 1;
            }
            if (class282.field4033 < 0) {
                class282.field4033 = 0;
            }
            class6.field90 = 0;
        }
        for (int var1 = 0; var1 < class379.field5387; var1++) {
            int var2 = class332.field4830[var1].method668(3);
            char var3 = class332.field4830[var1].method665(100);
            if (var2 == 84) {
                class54.method346(true);
            } else if (class16.field247.method1758(-501, 82) && var2 == 66) {
                if (class402.field5642 != null) {
                    String var8 = "";
                    for (int var9 = class1.field4.length - 1; var9 >= 0; var9--) {
                        if (class1.field4[var9] != null && class1.field4[var9].length() > 0) {
                            var8 = var8 + class1.field4[var9] + '\n';
                        }
                    }
                    class402.field5642.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (class16.field247.method1758(arg0 - 501, 82) && var2 == 67) {
                if (class402.field5642 != null) {
                    Transferable var4 = class402.field5642.getContents((Object) null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class190.method1362(var5, '\n', (byte) -9);
                                if (var6.length <= 1) {
                                    class284.field4139 = class284.field4139 + var5;
                                } else {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class284.field4139 = var6[var7];
                                        class54.method346(true);
                                    }
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class198.field2836 > 0) {
                class284.field4139 = class284.field4139.substring(0, class198.field2836 - 1) + class284.field4139.substring(class198.field2836);
                class198.field2836--;
            } else if (var2 == 101 && class198.field2836 < class284.field4139.length()) {
                class284.field4139 = class284.field4139.substring(0, class198.field2836) + class284.field4139.substring(class198.field2836 + 1);
            } else if (var2 == 96 && class198.field2836 > 0) {
                class198.field2836--;
            } else if (var2 == 97 && class198.field2836 < class284.field4139.length()) {
                class198.field2836++;
            } else if (var2 == 102) {
                class198.field2836 = 0;
            } else if (var2 == 103) {
                class198.field2836 = class284.field4139.length();
            } else if (var2 == 104 && class1.field4.length > class137.field2111) {
                class137.field2111++;
                class331.method2170(128);
                class198.field2836 = class284.field4139.length();
            } else if (var2 == 105 && class137.field2111 > 0) {
                class137.field2111--;
                class331.method2170(128);
                class198.field2836 = class284.field4139.length();
            } else if (class186.method1334(97, var3) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+') {
                class284.field4139 = class284.field4139.substring(0, class198.field2836) + class332.field4830[var1].method665(100) + class284.field4139.substring(class198.field2836);
                class198.field2836++;
            }
        }
        class379.field5387 = 0;
        for (int var10 = 0; var10 < 100; var10++) {
            int var10002;
            if (class226.field3372[var10]) {
                var10002 = class126.field1744[var10]++;
                if (class126.field1744[var10] > 102) {
                    class226.field3372[var10] = false;
                }
            } else {
                var10002 = class126.field1744[var10]--;
                if (class126.field1744[var10] < 0) {
                    class409.field5817[var10] = (int) (Math.random() * (double) class24.field307);
                    field2881[var10] = (int) (Math.random() * 350.0D);
                    class126.field1744[var10] = 0;
                    class226.field3372[var10] = true;
                }
            }
        }
        class158.method1152(-115);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZ)Z", line = 413)
    public static final boolean method1426(int arg0, boolean arg1) {
        if (arg1) {
            method1431(true, (class108) null);
        }
        field2884++;
        if (arg0 == 51 || arg0 == 50 || arg0 == 17 || arg0 == 13 || arg0 == 1002) {
            return true;
        } else {
            return arg0 == 59 || arg0 == 1004;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)V", line = 431)
    public static void method1427(boolean arg0) {
        field2887 = null;
        field2886 = null;
        if (!arg0) {
            return;
        }
        field2878 = null;
        field2875 = null;
        field2882 = null;
        field2885 = null;
        field2881 = null;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)I", line = 447)
    public static final int method1428(int arg0, int arg1) {
        field2871++;
        if (arg1 < 73) {
            method1426(47, true);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 459)
    public static final void method1429(byte arg0) {
        class349.field5084 = 0;
        field2874++;
        class190.field2731 = 0;
        class40.method263((byte) -54);
        class220.method1554(116);
        class434.method2708(96);
        class94.method553((byte) -127);
        for (int var1 = 0; var1 < class190.field2731; var1++) {
            int var4 = class232.field3434[var1];
            if (class34.field434 != class243.field3596[var4].field4542) {
                if (class243.field3596[var4].field1800 > 0) {
                    class78.method463(class243.field3596[var4], true);
                }
                class243.field3596[var4] = null;
            }
        }
        if (class242.field3572 != class352.field5114.field1880) {
            throw new RuntimeException("gpp1 pos:" + class352.field5114.field1880 + " psize:" + class242.field3572);
        }
        int var2 = 59 / ((58 - arg0) / 46);
        for (int var3 = 0; var3 < class334.field4847; var3++) {
            if (class243.field3596[class26.field323[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class334.field4847);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()V", line = 515)
    public static final void method1430() {
        if (class401.field5633 != null) {
            for (int var0 = 0; var0 < class401.field5633.length; var0++) {
                for (int var1 = 0; var1 < class394.field5548; var1++) {
                    for (int var2 = 0; var2 < class407.field5751; var2++) {
                        if (class401.field5633[var0][var1][var2] != null) {
                            class401.field5633[var0][var1][var2].method447((byte) 53);
                        }
                        class401.field5633[var0][var1][var2] = null;
                    }
                }
            }
        }
        class401.field5633 = null;
        class126.field1734 = null;
        if (class24.field306 != null) {
            for (int var3 = 0; var3 < class24.field306.length; var3++) {
                for (int var4 = 0; var4 < class394.field5548; var4++) {
                    for (int var5 = 0; var5 < class407.field5751; var5++) {
                        if (class24.field306[var3][var4][var5] != null) {
                            class24.field306[var3][var4][var5].method447((byte) 67);
                        }
                        class24.field306[var3][var4][var5] = null;
                    }
                }
            }
        }
        class24.field306 = null;
        class241.field3567 = null;
        class385.field5449 = null;
        class439.field6280 = null;
        class10.field126 = 0;
        if (field2875 != null) {
            for (int var6 = 0; var6 < class10.field126; var6++) {
                field2875[var6] = null;
            }
        }
        if (class448.field6398 != null) {
            for (int var7 = 0; var7 < class91.field1179; var7++) {
                class448.field6398[var7] = null;
            }
            class91.field1179 = 0;
        }
        if (class282.field4039 != null) {
            for (int var8 = 0; var8 < class153.field2273; var8++) {
                class282.field4039[var8] = null;
            }
            for (int var9 = 0; var9 < class243.field3603; var9++) {
                for (int var10 = 0; var10 < class394.field5548; var10++) {
                    for (int var11 = 0; var11 < class407.field5751; var11++) {
                        class115.field1487[var9][var10][var11] = 0;
                    }
                }
            }
            class153.field2273 = 0;
        }
        class309.field4490 = null;
        class381.method2428((byte) 71);
        class147.field2188.method1083((byte) -73);
        class312.field4615 = null;
        class25.field314 = null;
        class16.field238 = null;
        class294.field4251 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLtj;)V", line = 663)
    public static final void method1431(boolean arg0, class108 arg1) {
        field2873++;
        if (arg0) {
            field2881 = null;
        }
        class285.field4145 = arg1;
        class327.field4738 = class285.field4145.method651(0, 19);
    }
}
