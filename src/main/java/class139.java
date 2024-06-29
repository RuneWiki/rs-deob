import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class139 {

    @OriginalMember(owner = "client!h", name = "c", descriptor = "J")
    public long field2426 = 0L;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Z")
    public static boolean field2428 = false;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lda;")
    private static class275 field2427 = class255.method1672(107, "Attack");

    @OriginalMember(owner = "client!h", name = "q", descriptor = "[J")
    public static long[] field2440 = new long[100];

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lda;")
    public static class275 field2429 = class255.method1672(102, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Lda;")
    public static class275 field2442 = class255.method1672(94, "<img=0>");

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lda;")
    public static class275 field2435 = field2427;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public int field2434;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public int field2436;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public int field2439;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public int field2445;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lak;")
    public class234 field2444;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Lak;")
    public class234 field2446;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "[Ltj;")
    public static class270[] field2425;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method999(byte arg0) {
        field2429 = null;
        field2425 = null;
        field2435 = null;
        field2427 = null;
        field2442 = null;
        field2440 = null;
        if (arg0 <= 7) {
            method1001((byte) -31);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
    public static final void method1000(int arg0, int arg1) {
        field2443++;
        if (arg1 == -1 || !class52.field867[arg1]) {
            return;
        }
        class96.field1638.method757((byte) 5, arg1);
        if (class173.field3005[arg1] == null) {
            return;
        }
        boolean var2 = true;
        if (arg0 <= 86) {
            method1002(38, 46, (class99) null);
        }
        for (int var3 = 0; var3 < class173.field3005[arg1].length; var3++) {
            if (class173.field3005[arg1][var3] != null) {
                if (class173.field3005[arg1][var3].field3858 == 2) {
                    var2 = false;
                } else {
                    class173.field3005[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class173.field3005[arg1] = null;
        }
        class52.field867[arg1] = false;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)[Lwb;")
    public static final class179[] method1001(byte arg0) {
        field2433++;
        class179[] var1 = new class179[class151.field2633];
        for (int var2 = 0; var2 < class151.field2633; var2++) {
            int var3 = class32.field480[var2] * class152.field2662[var2];
            byte[] var4 = class67.field1101[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class270.field4695[class19.method98(255, var4[var6])];
            }
            var1[var2] = new class259(class267.field4646, class250.field4419, class114.field2010[var2], class246.field4357[var2], class152.field2662[var2], class32.field480[var2], var5);
        }
        if (arg0 != -2) {
            field2428 = false;
        }
        class134.method978(82);
        return var1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILqd;)V")
    public static final void method1002(int arg0, int arg1, class99 arg2) {
        Object[] var3 = arg2.field1678;
        field2432++;
        int var4 = (Integer) var3[0];
        class19 var5 = class168.method1156(var4, -22);
        if (var5 == null) {
            return;
        }
        class35.field580 = 0;
        int var6 = 0;
        int var7 = 0;
        if (arg0 != -11704) {
            return;
        }
        int var8 = -1;
        int[] var9 = var5.field270;
        int[] var10 = var5.field272;
        byte var11 = -1;
        try {
            class36.field590 = new class275[var5.field269];
            class77.field1260 = new int[var5.field274];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg2.field1674;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg2.field1663;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg2.field1677 == null ? -1 : arg2.field1677.field3879;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg2.field1664;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg2.field1677 == null ? -1 : arg2.field1677.field3943;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg2.field1671 == null ? -1 : arg2.field1671.field3879;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg2.field1671 == null ? -1 : arg2.field1671.field3943;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg2.field1672;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg2.field1675;
                    }
                    class77.field1260[var12++] = var15;
                } else if (var3[var14] instanceof class275) {
                    class275 var16 = (class275) var3[var14];
                    if (var16.method1828(true, class277.field4832)) {
                        var16 = arg2.field1676;
                    }
                    class36.field590[var13++] = var16;
                }
            }
            int var17 = 0;
            label3586: while (true) {
                var17++;
                if (var17 > arg1) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var472 = var9[var8];
                if (var472 < 100) {
                    if (var472 == 0) {
                        class185.field3176[var6++] = var10[var8];
                        continue;
                    }
                    if (var472 == 1) {
                        int var18 = var10[var8];
                        class185.field3176[var6++] = class218.field3698[var18];
                        continue;
                    }
                    if (var472 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class42.method253((byte) 24, var19, class185.field3176[var6]);
                        continue;
                    }
                    if (var472 == 3) {
                        class224.field3797[var7++] = var5.field265[var8];
                        continue;
                    }
                    if (var472 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var472 == 7) {
                        var6 -= 2;
                        if (class185.field3176[var6 + 1] != class185.field3176[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var472 == 8) {
                        var6 -= 2;
                        if (class185.field3176[var6 + 1] == class185.field3176[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var472 == 9) {
                        var6 -= 2;
                        if (class185.field3176[var6] < class185.field3176[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var472 == 10) {
                        var6 -= 2;
                        if (class185.field3176[var6 + 1] < class185.field3176[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var472 == 21) {
                        if (class35.field580 == 0) {
                            return;
                        }
                        class55 var20 = class195.field3339[--class35.field580];
                        var8 = var20.field937;
                        var5 = var20.field929;
                        class36.field590 = var20.field933;
                        class77.field1260 = var20.field935;
                        var10 = var5.field272;
                        var9 = var5.field270;
                        continue;
                    }
                    if (var472 == 25) {
                        int var21 = var10[var8];
                        class185.field3176[var6++] = class214.method1377(var21, 1830);
                        continue;
                    }
                    if (var472 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class240.method1581(var22, class185.field3176[var6], (byte) -124);
                        continue;
                    }
                    if (var472 == 31) {
                        var6 -= 2;
                        if (class185.field3176[var6 + 1] >= class185.field3176[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var472 == 32) {
                        var6 -= 2;
                        if (class185.field3176[var6 + 1] <= class185.field3176[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var472 == 33) {
                        class185.field3176[var6++] = class77.field1260[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var472 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class77.field1260[var10001] = class185.field3176[var6];
                        continue;
                    }
                    if (var472 == 35) {
                        class224.field3797[var7++] = class36.field590[var10[var8]];
                        continue;
                    }
                    if (var472 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class36.field590[var10001] = class224.field3797[var7];
                        continue;
                    }
                    if (var472 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        class275 var24 = class153.method1081(class224.field3797, var23, var7, -29817);
                        class224.field3797[var7++] = var24;
                        continue;
                    }
                    if (var472 == 38) {
                        var6--;
                        continue;
                    }
                    if (var472 == 39) {
                        var7--;
                        continue;
                    }
                    if (var472 == 40) {
                        int var25 = var10[var8];
                        class19 var26 = class168.method1156(var25, -22);
                        class275[] var27 = new class275[var26.field269];
                        int[] var28 = new int[var26.field274];
                        for (int var29 = 0; var29 < var26.field267; var29++) {
                            var28[var29] = class185.field3176[var6 + var29 - var26.field267];
                        }
                        for (int var30 = 0; var30 < var26.field268; var30++) {
                            var27[var30] = class224.field3797[var7 + var30 - var26.field268];
                        }
                        var7 -= var26.field268;
                        var6 -= var26.field267;
                        class55 var31 = new class55();
                        var31.field929 = var5;
                        var31.field937 = var8;
                        var31.field935 = class77.field1260;
                        var31.field933 = class36.field590;
                        if (class195.field3339.length <= class35.field580) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        class195.field3339[class35.field580++] = var31;
                        var10 = var26.field272;
                        var8 = -1;
                        var9 = var26.field270;
                        class77.field1260 = var28;
                        class36.field590 = var27;
                        continue;
                    }
                    if (var472 == 42) {
                        class185.field3176[var6++] = class65.field1067[var10[var8]];
                        continue;
                    }
                    if (var472 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class65.field1067[var32] = class185.field3176[var6];
                        class177.method1194(29614, var32);
                        continue;
                    }
                    if (var472 == 44) {
                        int var33 = var10[var8] >> 16;
                        var6--;
                        int var34 = class185.field3176[var6];
                        int var35 = var10[var8] & 0xFFFF;
                        if (var34 >= 0 && var34 <= 5000) {
                            class265.field4614[var33] = var34;
                            byte var36 = -1;
                            if (var35 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var34) {
                                    continue label3586;
                                }
                                class129.field2277[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var472 == 45) {
                        int var38 = var10[var8];
                        var6--;
                        int var39 = class185.field3176[var6];
                        if (var39 >= 0 && class265.field4614[var38] > var39) {
                            class185.field3176[var6++] = class129.field2277[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var472 == 46) {
                        var6 -= 2;
                        int var40 = var10[var8];
                        int var41 = class185.field3176[var6];
                        if (var41 >= 0 && var41 < class265.field4614[var40]) {
                            class129.field2277[var40][var41] = class185.field3176[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var472 == 47) {
                        class275 var42 = class115.field2049[var10[var8]];
                        if (var42 == null) {
                            var42 = class79.field1297;
                        }
                        class224.field3797[var7++] = var42;
                        continue;
                    }
                    if (var472 == 48) {
                        int var43 = var10[var8];
                        var7--;
                        class115.field2049[var43] = class224.field3797[var7];
                        class270.method1780((byte) 52, var43);
                        continue;
                    }
                    if (var472 == 51) {
                        class276 var44 = var5.field279[var10[var8]];
                        var6--;
                        class216 var45 = (class216) var44.method1871(0, (long) class185.field3176[var6]);
                        if (var45 != null) {
                            var8 += var45.field3692;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var472 < 300) {
                    if (var472 == 100) {
                        var6 -= 3;
                        int var47 = class185.field3176[var6];
                        int var48 = class185.field3176[var6 + 2];
                        int var49 = class185.field3176[var6 + 1];
                        if (var49 == 0) {
                            throw new RuntimeException();
                        }
                        class229 var50 = class261.method1709(var47, -96);
                        if (var50.field3942 == null) {
                            var50.field3942 = new class229[var48 + 1];
                        }
                        if (var48 >= var50.field3942.length) {
                            class229[] var51 = new class229[var48 + 1];
                            for (int var52 = 0; var52 < var50.field3942.length; var52++) {
                                var51[var52] = var50.field3942[var52];
                            }
                            var50.field3942 = var51;
                        }
                        if (var48 > 0 && var50.field3942[var48 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var48 - 1));
                        }
                        class229 var53 = new class229();
                        var53.field3884 = true;
                        var53.field3943 = var48;
                        var53.field3992 = var53.field3879 = var50.field3879;
                        var53.field3858 = var49;
                        var50.field3942[var48] = var53;
                        if (var46) {
                            class80.field1319 = var53;
                        } else {
                            class138.field2417 = var53;
                        }
                        class40.method231(var50, arg0 ^ 0xFFFFD248);
                        continue;
                    }
                    if (var472 == 101) {
                        class229 var54 = var46 ? class80.field1319 : class138.field2417;
                        if (var54.field3943 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class229 var55 = class261.method1709(var54.field3879, arg0 + 11577);
                        var55.field3942[var54.field3943] = null;
                        class40.method231(var55, 0);
                        continue;
                    }
                    if (var472 == 102) {
                        var6--;
                        class229 var56 = class261.method1709(class185.field3176[var6], -112);
                        var56.field3942 = null;
                        class40.method231(var56, 0);
                        continue;
                    }
                    if (var472 == 200) {
                        var6 -= 2;
                        int var57 = class185.field3176[var6];
                        int var58 = class185.field3176[var6 + 1];
                        class229 var59 = class182.method1219((byte) 114, var57, var58);
                        if (var59 != null && var58 != -1) {
                            class185.field3176[var6++] = 1;
                            if (var46) {
                                class80.field1319 = var59;
                            } else {
                                class138.field2417 = var59;
                            }
                            continue;
                        }
                        class185.field3176[var6++] = 0;
                        continue;
                    }
                    if (var472 == 201) {
                        var6--;
                        int var60 = class185.field3176[var6];
                        class229 var61 = class261.method1709(var60, -126);
                        if (var61 == null) {
                            class185.field3176[var6++] = 0;
                        } else {
                            class185.field3176[var6++] = 1;
                            if (var46) {
                                class80.field1319 = var61;
                            } else {
                                class138.field2417 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var472 < 500) {
                    if (var472 == 403) {
                        var6 -= 2;
                        int var461 = class185.field3176[var6];
                        int var462 = class185.field3176[var6 + 1];
                        if (var461 >= 7) {
                            var461 -= 7;
                        }
                        class66.field1094.field1907.method1507(var462, var461, (byte) -107);
                        continue;
                    }
                    if (var472 == 404) {
                        var6 -= 2;
                        int var463 = class185.field3176[var6];
                        int var464 = class185.field3176[var6 + 1];
                        class66.field1094.field1907.method1505(var463, var464, 0);
                        continue;
                    }
                    if (var472 == 410) {
                        var6--;
                        boolean var465 = class185.field3176[var6] != 0;
                        class66.field1094.field1907.method1514(var465, arg0 + 11619);
                        continue;
                    }
                } else if (!(var472 < 1000 || var472 >= 1100) || !(var472 < 2000 || var472 >= 2100)) {
                    class229 var62;
                    if (var472 < 2000) {
                        var62 = var46 ? class80.field1319 : class138.field2417;
                    } else {
                        var472 -= 1000;
                        var6--;
                        var62 = class261.method1709(class185.field3176[var6], arg0 + 11599);
                    }
                    if (var472 == 1000) {
                        var6 -= 4;
                        var62.field3939 = class185.field3176[var6];
                        var62.field3875 = class185.field3176[var6 + 1];
                        int var63 = class185.field3176[var6 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 5) {
                            var63 = 5;
                        }
                        int var64 = class185.field3176[var6 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 5) {
                            var64 = 5;
                        }
                        var62.field4011 = (byte) var63;
                        var62.field3898 = (byte) var64;
                        class40.method231(var62, 0);
                        class187.method1238(var62, 0);
                        if (var62.field3943 == -1) {
                            class81.method529(20508, var62.field3879);
                        }
                        continue;
                    }
                    if (var472 == 1001) {
                        var6 -= 4;
                        var62.field3986 = class185.field3176[var6];
                        var62.field3951 = class185.field3176[var6 + 1];
                        var62.field3976 = 0;
                        var62.field3899 = 0;
                        int var65 = class185.field3176[var6 + 3];
                        if (var65 < 0) {
                            var65 = 0;
                        } else if (var65 > 4) {
                            var65 = 4;
                        }
                        int var66 = class185.field3176[var6 + 2];
                        if (var66 < 0) {
                            var66 = 0;
                        } else if (var66 > 4) {
                            var66 = 4;
                        }
                        var62.field3880 = (byte) var66;
                        var62.field3945 = (byte) var65;
                        class40.method231(var62, 0);
                        class187.method1238(var62, arg0 ^ 0xFFFFD248);
                        if (var62.field3858 == 0) {
                            class92.method666(var62, false, -1811);
                        }
                        continue;
                    }
                    if (var472 == 1003) {
                        var6--;
                        boolean var67 = class185.field3176[var6] == 1;
                        if (var62.field3872 != var67) {
                            var62.field3872 = var67;
                            class40.method231(var62, 0);
                        }
                        if (var62.field3943 == -1) {
                            class162.method1128(var62.field3879, (byte) -124);
                        }
                        continue;
                    }
                    if (var472 == 1004) {
                        var6 -= 2;
                        var62.field3991 = class185.field3176[var6];
                        var62.field3962 = class185.field3176[var6 + 1];
                        class40.method231(var62, 0);
                        class187.method1238(var62, 0);
                        if (var62.field3858 == 0) {
                            class92.method666(var62, false, arg0 + 9893);
                        }
                        continue;
                    }
                } else if (var472 >= 1100 && var472 < 1200 || var472 >= 2100 && var472 < 2200) {
                    class229 var68;
                    if (var472 >= 2000) {
                        var472 -= 1000;
                        var6--;
                        var68 = class261.method1709(class185.field3176[var6], -104);
                    } else {
                        var68 = var46 ? class80.field1319 : class138.field2417;
                    }
                    if (var472 == 1100) {
                        var6 -= 2;
                        var68.field3996 = class185.field3176[var6];
                        if (var68.field3883 - var68.field3885 < var68.field3996) {
                            var68.field3996 = var68.field3883 - var68.field3885;
                        }
                        if (var68.field3996 < 0) {
                            var68.field3996 = 0;
                        }
                        var68.field4016 = class185.field3176[var6 + 1];
                        if ((var68.field4019 - var68.field3980) < var68.field4016) {
                            var68.field4016 = var68.field4019 - var68.field3980;
                        }
                        if (var68.field4016 < 0) {
                            var68.field4016 = 0;
                        }
                        class40.method231(var68, 0);
                        if (var68.field3943 == -1) {
                            class25.method160(var68.field3879, false);
                        }
                        continue;
                    }
                    if (var472 == 1101) {
                        var6--;
                        var68.field3862 = class185.field3176[var6];
                        class40.method231(var68, 0);
                        if (var68.field3943 == -1) {
                            class23.method145(arg0 ^ 0x2DD5, var68.field3879);
                        }
                        continue;
                    }
                    if (var472 == 1102) {
                        var6--;
                        var68.field3997 = class185.field3176[var6] == 1;
                        class40.method231(var68, 0);
                        continue;
                    }
                    if (var472 == 1103) {
                        var6--;
                        var68.field3921 = class185.field3176[var6];
                        class40.method231(var68, arg0 ^ 0xFFFFD248);
                        continue;
                    }
                    if (var472 == 1104) {
                        var6--;
                        var68.field3905 = class185.field3176[var6];
                        class40.method231(var68, arg0 ^ 0xFFFFD248);
                        continue;
                    }
                    if (var472 == 1105) {
                        var6--;
                        var68.field3969 = class185.field3176[var6];
                        class40.method231(var68, arg0 + 11704);
                        continue;
                    }
                    if (var472 == 1106) {
                        var6--;
                        var68.field3954 = class185.field3176[var6];
                        class40.method231(var68, 0);
                        continue;
                    }
                    if (var472 == 1107) {
                        var6--;
                        var68.field3910 = class185.field3176[var6] == 1;
                        class40.method231(var68, arg0 ^ 0xFFFFD248);
                        continue;
                    }
                    if (var472 == 1108) {
                        var68.field3902 = 1;
                        var6--;
                        var68.field4023 = class185.field3176[var6];
                        class40.method231(var68, 0);
                        if (var68.field3943 == -1) {
                            class107.method791(-61, var68.field3879);
                        }
                        continue;
                    }
                    if (var472 == 1109) {
                        var6 -= 6;
                        var68.field3929 = class185.field3176[var6];
                        var68.field3900 = class185.field3176[var6 + 1];
                        var68.field3940 = class185.field3176[var6 + 2];
                        var68.field3932 = class185.field3176[var6 + 3];
                        var68.field3960 = class185.field3176[var6 + 4];
                        var68.field3985 = class185.field3176[var6 + 5];
                        class40.method231(var68, 0);
                        if (var68.field3943 == -1) {
                            class156.method1102(var68.field3879, 114);
                            class35.method211(arg0 + 11748, var68.field3879);
                        }
                        continue;
                    }
                    if (var472 == 1110) {
                        var6--;
                        int var69 = class185.field3176[var6];
                        if (var68.field3867 != var69) {
                            var68.field3912 = 0;
                            var68.field3863 = 0;
                            var68.field3867 = var69;
                            class40.method231(var68, 0);
                        }
                        if (var68.field3943 == -1) {
                            class268.method1758(arg0 + 11709, var68.field3879);
                        }
                        continue;
                    }
                    if (var472 == 1111) {
                        var6--;
                        var68.field3892 = class185.field3176[var6] == 1;
                        class40.method231(var68, 0);
                        continue;
                    }
                    if (var472 == 1112) {
                        var7--;
                        class275 var70 = class224.field3797[var7];
                        if (!var70.method1828(true, var68.field3947)) {
                            var68.field3947 = var70;
                            class40.method231(var68, 0);
                        }
                        if (var68.field3943 == -1) {
                            class147.method1047(var68.field3879, (byte) 127);
                        }
                        continue;
                    }
                    if (var472 == 1113) {
                        var6--;
                        var68.field3878 = class185.field3176[var6];
                        class40.method231(var68, 0);
                        continue;
                    }
                    if (var472 == 1114) {
                        var6 -= 3;
                        var68.field3950 = class185.field3176[var6];
                        var68.field3964 = class185.field3176[var6 + 1];
                        var68.field3919 = class185.field3176[var6 + 2];
                        class40.method231(var68, 0);
                        continue;
                    }
                    if (var472 == 1115) {
                        var6--;
                        var68.field4015 = class185.field3176[var6] == 1;
                        class40.method231(var68, arg0 ^ 0xFFFFD248);
                        continue;
                    }
                    if (var472 == 1116) {
                        var6--;
                        var68.field3956 = class185.field3176[var6];
                        class40.method231(var68, 0);
                        continue;
                    }
                    if (var472 == 1117) {
                        var6--;
                        var68.field3931 = class185.field3176[var6];
                        class40.method231(var68, arg0 ^ 0xFFFFD248);
                        continue;
                    }
                    if (var472 == 1118) {
                        var6--;
                        var68.field3995 = class185.field3176[var6] == 1;
                        class40.method231(var68, 0);
                        continue;
                    }
                    if (var472 == 1119) {
                        var6--;
                        var68.field3949 = class185.field3176[var6] == 1;
                        class40.method231(var68, 0);
                        continue;
                    }
                    if (var472 == 1120) {
                        var6 -= 2;
                        var68.field3883 = class185.field3176[var6];
                        var68.field4019 = class185.field3176[var6 + 1];
                        class40.method231(var68, 0);
                        if (var68.field3858 == 0) {
                            class92.method666(var68, false, -1811);
                        }
                        continue;
                    }
                    if (var472 == 1121) {
                        class40.method231(var68, 0);
                        var6 -= 2;
                        continue;
                    }
                    if (var472 == 1122) {
                        var6--;
                        var68.field3922 = class185.field3176[var6] == 1;
                        class40.method231(var68, 0);
                        continue;
                    }
                } else if (!(var472 < 1200 || var472 >= 1300) || !(var472 < 2200 || var472 >= 2300)) {
                    class229 var71;
                    if (var472 < 2000) {
                        var71 = var46 ? class80.field1319 : class138.field2417;
                    } else {
                        var6--;
                        var71 = class261.method1709(class185.field3176[var6], -120);
                        var472 -= 1000;
                    }
                    class40.method231(var71, 0);
                    if (var472 == 1200 || var472 == 1205) {
                        var6 -= 2;
                        int var72 = class185.field3176[var6];
                        int var73 = class185.field3176[var6 + 1];
                        if (var71.field3943 == -1) {
                            class32.method189(var71.field3879, -28803);
                            class156.method1102(var71.field3879, arg0 ^ 0xFFFFD21D);
                            class35.method211(108, var71.field3879);
                        }
                        if (var72 == -1) {
                            var71.field4023 = -1;
                            var71.field4006 = -1;
                            var71.field3902 = 1;
                        } else {
                            var71.field4006 = var72;
                            var71.field3882 = var73;
                            class245 var74 = class210.method1352(71, var72);
                            var71.field3900 = var74.field4308;
                            var71.field3985 = var74.field4271;
                            var71.field3929 = var74.field4294;
                            if (var71.field3976 > 0) {
                                var71.field3985 = var71.field3985 * 32 / var71.field3976;
                            } else if (var71.field3986 > 0) {
                                var71.field3985 = var71.field3985 * 32 / var71.field3986;
                            }
                            if (var472 == 1205) {
                                var71.field3959 = false;
                            } else {
                                var71.field3959 = true;
                            }
                            var71.field3932 = var74.field4274;
                            var71.field3960 = var74.field4276;
                            var71.field3940 = var74.field4304;
                        }
                        continue;
                    }
                    if (var472 == 1201) {
                        var71.field3902 = 2;
                        var6--;
                        var71.field4023 = class185.field3176[var6];
                        if (var71.field3943 == -1) {
                            class107.method791(-51, var71.field3879);
                        }
                        continue;
                    }
                    if (var472 == 1202) {
                        var71.field3902 = 3;
                        var71.field4023 = class66.field1094.field1907.method1503((byte) -124);
                        if (var71.field3943 == -1) {
                            class107.method791(-52, var71.field3879);
                        }
                        continue;
                    }
                    if (var472 == 1203) {
                        var71.field3902 = 6;
                        var6--;
                        var71.field4023 = class185.field3176[var6];
                        if (var71.field3943 == -1) {
                            class107.method791(-103, var71.field3879);
                        }
                        continue;
                    }
                    if (var472 == 1204) {
                        var71.field3902 = 5;
                        var6--;
                        var71.field4023 = class185.field3176[var6];
                        if (var71.field3943 == -1) {
                            class107.method791(-87, var71.field3879);
                        }
                        continue;
                    }
                } else if (var472 >= 1300 && var472 < 1400 || var472 >= 2300 && var472 < 2400) {
                    class229 var457;
                    if (var472 < 2000) {
                        var457 = var46 ? class80.field1319 : class138.field2417;
                    } else {
                        var472 -= 1000;
                        var6--;
                        var457 = class261.method1709(class185.field3176[var6], -118);
                    }
                    if (var472 == 1300) {
                        var6--;
                        int var458 = class185.field3176[var6] - 1;
                        if (var458 >= 0 && var458 <= 9) {
                            var7--;
                            var457.method1481(var458, (byte) 126, class224.field3797[var7]);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var472 == 1301) {
                        var6 -= 2;
                        int var459 = class185.field3176[var6];
                        int var460 = class185.field3176[var6 + 1];
                        var457.field3935 = class182.method1219((byte) 114, var459, var460);
                        continue;
                    }
                    if (var472 == 1302) {
                        var6--;
                        var457.field3965 = class185.field3176[var6] == 1;
                        continue;
                    }
                    if (var472 == 1303) {
                        var6--;
                        var457.field4003 = class185.field3176[var6];
                        continue;
                    }
                    if (var472 == 1304) {
                        var6--;
                        var457.field4004 = class185.field3176[var6];
                        continue;
                    }
                    if (var472 == 1305) {
                        var7--;
                        var457.field4005 = class224.field3797[var7];
                        continue;
                    }
                    if (var472 == 1306) {
                        var7--;
                        var457.field3957 = class224.field3797[var7];
                        continue;
                    }
                    if (var472 == 1307) {
                        var457.field4024 = null;
                        continue;
                    }
                } else {
                    if (var472 >= 1400 && var472 < 1500 || var472 >= 2400 && var472 < 2500) {
                        class229 var75;
                        if (var472 >= 2000) {
                            var6--;
                            var75 = class261.method1709(class185.field3176[var6], -110);
                            var472 -= 1000;
                        } else {
                            var75 = var46 ? class80.field1319 : class138.field2417;
                        }
                        int[] var76 = null;
                        var7--;
                        class275 var77 = class224.field3797[var7];
                        if (var77.method1838(arg0 ^ 0xFFFFD24B) > 0 && var77.method1852(124, var77.method1838(3) - 1) == 89) {
                            var6--;
                            int var78 = class185.field3176[var6];
                            if (var78 > 0) {
                                var76 = new int[var78];
                                while (var78-- > 0) {
                                    var6--;
                                    var76[var78] = class185.field3176[var6];
                                }
                            }
                            var77 = var77.method1815(0, var77.method1838(3) - 1, 0);
                        }
                        Object[] var79 = new Object[var77.method1838(arg0 + 11707) + 1];
                        for (int var80 = var79.length - 1; var80 >= 1; var80--) {
                            if (var77.method1852(arg0 ^ 0xFFFFD22E, var80 - 1) == 115) {
                                var7--;
                                var79[var80] = class224.field3797[var7];
                            } else {
                                var6--;
                                var79[var80] = Integer.valueOf(class185.field3176[var6]);
                            }
                        }
                        var6--;
                        int var81 = class185.field3176[var6];
                        if (var81 == -1) {
                            var79 = null;
                        } else {
                            var79[0] = Integer.valueOf(var81);
                        }
                        var75.field3989 = true;
                        if (var472 == 1400) {
                            var75.field3870 = var79;
                        } else if (var472 == 1401) {
                            var75.field3990 = var79;
                        } else if (var472 == 1402) {
                            var75.field3993 = var79;
                        } else if (var472 == 1403) {
                            var75.field3881 = var79;
                        } else if (var472 == 1404) {
                            var75.field4025 = var79;
                        } else if (var472 == 1405) {
                            var75.field3866 = var79;
                        } else if (var472 == 1406) {
                            var75.field3936 = var79;
                        } else if (var472 == 1407) {
                            var75.field3909 = var76;
                            var75.field3897 = var79;
                        } else if (var472 == 1408) {
                            var75.field4009 = var79;
                        } else if (var472 == 1409) {
                            var75.field3914 = var79;
                        } else if (var472 == 1410) {
                            var75.field3906 = var79;
                        } else if (var472 == 1411) {
                            var75.field3999 = var79;
                        } else if (var472 == 1412) {
                            var75.field3876 = var79;
                        } else if (var472 == 1414) {
                            var75.field3987 = var76;
                            var75.field3968 = var79;
                        } else if (var472 == 1415) {
                            var75.field3907 = var76;
                            var75.field3896 = var79;
                        } else if (var472 == 1416) {
                            var75.field3895 = var79;
                        } else if (var472 == 1417) {
                            var75.field3952 = var79;
                        } else if (var472 == 1418) {
                            var75.field3925 = var79;
                        } else if (var472 == 1419) {
                            var75.field3861 = var79;
                        } else if (var472 == 1420) {
                            var75.field3888 = var79;
                        } else if (var472 == 1421) {
                            var75.field3915 = var79;
                        } else if (var472 == 1422) {
                            var75.field4021 = var79;
                        } else if (var472 == 1423) {
                            var75.field3975 = var79;
                        } else if (var472 == 1424) {
                            var75.field4013 = var79;
                        } else if (var472 == 1425) {
                            var75.field4008 = var79;
                        } else if (var472 == 1426) {
                            var75.field3877 = var79;
                        } else if (var472 == 1427) {
                            var75.field3944 = var79;
                        } else if (var472 == 1428) {
                            var75.field3873 = var79;
                            var75.field3913 = var76;
                        } else if (var472 == 1429) {
                            var75.field3953 = var76;
                            var75.field3871 = var79;
                        }
                        continue;
                    }
                    if (var472 < 1600) {
                        class229 var82 = var46 ? class80.field1319 : class138.field2417;
                        if (var472 == 1500) {
                            class185.field3176[var6++] = var82.field3889;
                            continue;
                        }
                        if (var472 == 1501) {
                            class185.field3176[var6++] = var82.field4012;
                            continue;
                        }
                        if (var472 == 1502) {
                            class185.field3176[var6++] = var82.field3885;
                            continue;
                        }
                        if (var472 == 1503) {
                            class185.field3176[var6++] = var82.field3980;
                            continue;
                        }
                        if (var472 == 1504) {
                            class185.field3176[var6++] = var82.field3872 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 1505) {
                            class185.field3176[var6++] = var82.field3992;
                            continue;
                        }
                    } else if (var472 < 1700) {
                        class229 var456 = var46 ? class80.field1319 : class138.field2417;
                        if (var472 == 1600) {
                            class185.field3176[var6++] = var456.field3996;
                            continue;
                        }
                        if (var472 == 1601) {
                            class185.field3176[var6++] = var456.field4016;
                            continue;
                        }
                        if (var472 == 1602) {
                            class224.field3797[var7++] = var456.field3947;
                            continue;
                        }
                        if (var472 == 1603) {
                            class185.field3176[var6++] = var456.field3883;
                            continue;
                        }
                        if (var472 == 1604) {
                            class185.field3176[var6++] = var456.field4019;
                            continue;
                        }
                        if (var472 == 1605) {
                            class185.field3176[var6++] = var456.field3985;
                            continue;
                        }
                        if (var472 == 1606) {
                            class185.field3176[var6++] = var456.field3940;
                            continue;
                        }
                        if (var472 == 1607) {
                            class185.field3176[var6++] = var456.field3960;
                            continue;
                        }
                        if (var472 == 1608) {
                            class185.field3176[var6++] = var456.field3932;
                            continue;
                        }
                        if (var472 == 1609) {
                            class185.field3176[var6++] = var456.field3921;
                            continue;
                        }
                    } else if (var472 < 1800) {
                        class229 var83 = var46 ? class80.field1319 : class138.field2417;
                        if (var472 == 1700) {
                            class185.field3176[var6++] = var83.field4006;
                            continue;
                        }
                        if (var472 == 1701) {
                            if (var83.field4006 == -1) {
                                class185.field3176[var6++] = 0;
                            } else {
                                class185.field3176[var6++] = var83.field3882;
                            }
                            continue;
                        }
                        if (var472 == 1702) {
                            class185.field3176[var6++] = var83.field3943;
                            continue;
                        }
                    } else if (var472 < 1900) {
                        class229 var454 = var46 ? class80.field1319 : class138.field2417;
                        if (var472 == 1800) {
                            class185.field3176[var6++] = class73.method483((byte) 60, client.method635(var454));
                            continue;
                        }
                        if (var472 == 1801) {
                            var6--;
                            int var455 = class185.field3176[var6];
                            int var474 = var455 - 1;
                            if (var454.field4024 != null && var454.field4024.length > var474 && var454.field4024[var474] != null) {
                                class224.field3797[var7++] = var454.field4024[var474];
                                continue;
                            }
                            class224.field3797[var7++] = class67.field1097;
                            continue;
                        }
                        if (var472 == 1802) {
                            if (var454.field4005 == null) {
                                class224.field3797[var7++] = class67.field1097;
                            } else {
                                class224.field3797[var7++] = var454.field4005;
                            }
                            continue;
                        }
                    } else if (var472 < 2600) {
                        var6--;
                        class229 var453 = class261.method1709(class185.field3176[var6], -92);
                        if (var472 == 2500) {
                            class185.field3176[var6++] = var453.field3889;
                            continue;
                        }
                        if (var472 == 2501) {
                            class185.field3176[var6++] = var453.field4012;
                            continue;
                        }
                        if (var472 == 2502) {
                            class185.field3176[var6++] = var453.field3885;
                            continue;
                        }
                        if (var472 == 2503) {
                            class185.field3176[var6++] = var453.field3980;
                            continue;
                        }
                        if (var472 == 2504) {
                            class185.field3176[var6++] = var453.field3872 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 2505) {
                            class185.field3176[var6++] = var453.field3992;
                            continue;
                        }
                    } else if (var472 < 2700) {
                        var6--;
                        class229 var452 = class261.method1709(class185.field3176[var6], -91);
                        if (var472 == 2600) {
                            class185.field3176[var6++] = var452.field3996;
                            continue;
                        }
                        if (var472 == 2601) {
                            class185.field3176[var6++] = var452.field4016;
                            continue;
                        }
                        if (var472 == 2602) {
                            class224.field3797[var7++] = var452.field3947;
                            continue;
                        }
                        if (var472 == 2603) {
                            class185.field3176[var6++] = var452.field3883;
                            continue;
                        }
                        if (var472 == 2604) {
                            class185.field3176[var6++] = var452.field4019;
                            continue;
                        }
                        if (var472 == 2605) {
                            class185.field3176[var6++] = var452.field3985;
                            continue;
                        }
                        if (var472 == 2606) {
                            class185.field3176[var6++] = var452.field3940;
                            continue;
                        }
                        if (var472 == 2607) {
                            class185.field3176[var6++] = var452.field3960;
                            continue;
                        }
                        if (var472 == 2608) {
                            class185.field3176[var6++] = var452.field3932;
                            continue;
                        }
                        if (var472 == 2609) {
                            class185.field3176[var6++] = var452.field3921;
                            continue;
                        }
                    } else if (var472 < 2800) {
                        if (var472 == 2700) {
                            var6--;
                            class229 var442 = class261.method1709(class185.field3176[var6], -113);
                            class185.field3176[var6++] = var442.field4006;
                            continue;
                        }
                        if (var472 == 2701) {
                            var6--;
                            class229 var443 = class261.method1709(class185.field3176[var6], -92);
                            if (var443.field4006 == -1) {
                                class185.field3176[var6++] = 0;
                            } else {
                                class185.field3176[var6++] = var443.field3882;
                            }
                            continue;
                        }
                        if (var472 == 2702) {
                            var6--;
                            int var444 = class185.field3176[var6];
                            class112 var445 = (class112) class267.field4633.method1871(0, (long) var444);
                            if (var445 == null) {
                                class185.field3176[var6++] = 0;
                            } else {
                                class185.field3176[var6++] = 1;
                            }
                            continue;
                        }
                        if (var472 == 2703) {
                            var6--;
                            class229 var446 = class261.method1709(class185.field3176[var6], -115);
                            if (var446.field3942 == null) {
                                class185.field3176[var6++] = 0;
                                continue;
                            }
                            int var447 = var446.field3942.length;
                            for (int var448 = 0; var448 < var446.field3942.length; var448++) {
                                if (var446.field3942[var448] == null) {
                                    var447 = var448;
                                    break;
                                }
                            }
                            class185.field3176[var6++] = var447;
                            continue;
                        }
                        if (var472 == 2704 || var472 == 2705) {
                            var6 -= 2;
                            int var449 = class185.field3176[var6];
                            int var450 = class185.field3176[var6 + 1];
                            class112 var451 = (class112) class267.field4633.method1871(0, (long) var449);
                            if (var451 != null && var451.field1977 == var450) {
                                class185.field3176[var6++] = 1;
                                continue;
                            }
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                    } else if (var472 < 2900) {
                        var6--;
                        class229 var84 = class261.method1709(class185.field3176[var6], -108);
                        if (var472 == 2800) {
                            class185.field3176[var6++] = class73.method483((byte) 106, client.method635(var84));
                            continue;
                        }
                        if (var472 == 2801) {
                            var6--;
                            int var85 = class185.field3176[var6];
                            int var473 = var85 - 1;
                            if (var84.field4024 != null && var473 < var84.field4024.length && var84.field4024[var473] != null) {
                                class224.field3797[var7++] = var84.field4024[var473];
                                continue;
                            }
                            class224.field3797[var7++] = class67.field1097;
                            continue;
                        }
                        if (var472 == 2802) {
                            if (var84.field4005 == null) {
                                class224.field3797[var7++] = class67.field1097;
                            } else {
                                class224.field3797[var7++] = var84.field4005;
                            }
                            continue;
                        }
                    } else if (var472 < 3200) {
                        if (var472 == 3100) {
                            var7--;
                            class275 var427 = class224.field3797[var7];
                            class277.method1874(var427, class67.field1097, 0, true);
                            continue;
                        }
                        if (var472 == 3101) {
                            var6 -= 2;
                            class179.method1202(class185.field3176[var6 + 1], class66.field1094, -2695, class185.field3176[var6]);
                            continue;
                        }
                        if (var472 == 3103) {
                            class112.method819((byte) 65);
                            continue;
                        }
                        if (var472 == 3104) {
                            class134.field2382++;
                            var7--;
                            class275 var428 = class224.field3797[var7];
                            int var429 = 0;
                            if (var428.method1854(77)) {
                                var429 = var428.method1847((byte) 5);
                            }
                            class149.field2597.method526((byte) -73, 40);
                            class149.field2597.method586(53, var429);
                            continue;
                        }
                        if (var472 == 3105) {
                            class12.field178++;
                            var7--;
                            class275 var430 = class224.field3797[var7];
                            class149.field2597.method526((byte) -57, 113);
                            class149.field2597.method560(var430.method1833(0), arg0 ^ 0x2DCB);
                            continue;
                        }
                        if (var472 == 3106) {
                            class238.field4164++;
                            var7--;
                            class275 var431 = class224.field3797[var7];
                            class149.field2597.method526((byte) -127, 228);
                            class149.field2597.method575((byte) 127, var431.method1838(3) + 1);
                            class149.field2597.method584((byte) 102, var431);
                            continue;
                        }
                        if (var472 == 3107) {
                            var6--;
                            int var432 = class185.field3176[var6];
                            var7--;
                            class275 var433 = class224.field3797[var7];
                            class261.method1712(var432, 0, var433);
                            continue;
                        }
                        if (var472 == 3108) {
                            var6 -= 3;
                            int var434 = class185.field3176[var6];
                            int var435 = class185.field3176[var6 + 1];
                            int var436 = class185.field3176[var6 + 2];
                            class229 var437 = class261.method1709(var436, -124);
                            class25.method159(var437, -26764, var435, var434);
                            continue;
                        }
                        if (var472 == 3109) {
                            var6 -= 2;
                            int var438 = class185.field3176[var6 + 1];
                            class229 var439 = var46 ? class80.field1319 : class138.field2417;
                            int var440 = class185.field3176[var6];
                            class25.method159(var439, arg0 ^ 0x453C, var438, var440);
                            continue;
                        }
                        if (var472 == 3110) {
                            class234.field4089++;
                            var6--;
                            int var441 = class185.field3176[var6];
                            class149.field2597.method526((byte) -62, 109);
                            class149.field2597.method600(var441, (byte) 98);
                            continue;
                        }
                    } else if (var472 < 3300) {
                        if (var472 == 3200) {
                            var6 -= 3;
                            class153.method1080(class185.field3176[var6 + 2], class185.field3176[var6 + 1], class185.field3176[var6], (byte) -107);
                            continue;
                        }
                        if (var472 == 3201) {
                            var6--;
                            class120.method877(class185.field3176[var6], (byte) 99);
                            continue;
                        }
                        if (var472 == 3202) {
                            var6 -= 2;
                            class269.method1775(true, class185.field3176[var6 + 1], class185.field3176[var6]);
                            continue;
                        }
                    } else if (var472 < 3400) {
                        if (var472 == 3300) {
                            class185.field3176[var6++] = class35.field576;
                            continue;
                        }
                        if (var472 == 3301) {
                            var6 -= 2;
                            int var400 = class185.field3176[var6];
                            int var401 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class122.method892(var401, 25171, var400);
                            continue;
                        }
                        if (var472 == 3302) {
                            var6 -= 2;
                            int var402 = class185.field3176[var6];
                            int var403 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class178.method1200((byte) 43, var402, var403);
                            continue;
                        }
                        if (var472 == 3303) {
                            var6 -= 2;
                            int var404 = class185.field3176[var6];
                            int var405 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class225.method1459(var404, -1, var405);
                            continue;
                        }
                        if (var472 == 3304) {
                            var6--;
                            int var406 = class185.field3176[var6];
                            class185.field3176[var6++] = class61.method387(5, var406).field169;
                            continue;
                        }
                        if (var472 == 3305) {
                            var6--;
                            int var407 = class185.field3176[var6];
                            class185.field3176[var6++] = class79.field1303[var407];
                            continue;
                        }
                        if (var472 == 3306) {
                            var6--;
                            int var408 = class185.field3176[var6];
                            class185.field3176[var6++] = class19.field273[var408];
                            continue;
                        }
                        if (var472 == 3307) {
                            var6--;
                            int var409 = class185.field3176[var6];
                            class185.field3176[var6++] = class4.field57[var409];
                            continue;
                        }
                        if (var472 == 3308) {
                            int var410 = (class66.field1094.field1770 >> 7) + class16.field237;
                            int var411 = class159.field2790;
                            int var412 = (class66.field1094.field1758 >> 7) + class234.field4083;
                            class185.field3176[var6++] = (var411 << 28) - (-(var410 << 14) - var412);
                            continue;
                        }
                        if (var472 == 3309) {
                            var6--;
                            int var413 = class185.field3176[var6];
                            class185.field3176[var6++] = class19.method98(16383, var413 >> 14);
                            continue;
                        }
                        if (var472 == 3310) {
                            var6--;
                            int var414 = class185.field3176[var6];
                            class185.field3176[var6++] = var414 >> 28;
                            continue;
                        }
                        if (var472 == 3311) {
                            var6--;
                            int var415 = class185.field3176[var6];
                            class185.field3176[var6++] = class19.method98(var415, 16383);
                            continue;
                        }
                        if (var472 == 3312) {
                            class185.field3176[var6++] = class167.field2911 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3313) {
                            var6 -= 2;
                            int var416 = class185.field3176[var6] + 32768;
                            int var417 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class122.method892(var417, 25171, var416);
                            continue;
                        }
                        if (var472 == 3314) {
                            var6 -= 2;
                            int var418 = class185.field3176[var6] + 32768;
                            int var419 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class178.method1200((byte) 24, var418, var419);
                            continue;
                        }
                        if (var472 == 3315) {
                            var6 -= 2;
                            int var420 = class185.field3176[var6 + 1];
                            int var421 = class185.field3176[var6] + 32768;
                            class185.field3176[var6++] = class225.method1459(var421, -1, var420);
                            continue;
                        }
                        if (var472 == 3316) {
                            if (class277.field4838 < 2) {
                                class185.field3176[var6++] = 0;
                            } else {
                                class185.field3176[var6++] = class277.field4838;
                            }
                            continue;
                        }
                        if (var472 == 3317) {
                            class185.field3176[var6++] = class270.field4697;
                            continue;
                        }
                        if (var472 == 3318) {
                            class185.field3176[var6++] = class108.field1880;
                            continue;
                        }
                        if (var472 == 3321) {
                            class185.field3176[var6++] = class152.field2669;
                            continue;
                        }
                        if (var472 == 3322) {
                            class185.field3176[var6++] = class86.field1461;
                            continue;
                        }
                        if (var472 == 3323) {
                            if (class155.field2694 >= 5 && class155.field2694 <= 9) {
                                class185.field3176[var6++] = 1;
                                continue;
                            }
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3324) {
                            if (class155.field2694 >= 5 && class155.field2694 <= 9) {
                                class185.field3176[var6++] = class155.field2694;
                                continue;
                            }
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3325) {
                            class185.field3176[var6++] = class196.field3358 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3326) {
                            class185.field3176[var6++] = class66.field1094.field1908;
                            continue;
                        }
                        if (var472 == 3327) {
                            class185.field3176[var6++] = class66.field1094.field1907.field4063 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3328) {
                            class185.field3176[var6++] = class255.field4490;
                            continue;
                        }
                        if (var472 == 3329) {
                            class185.field3176[var6++] = class131.field2343;
                            continue;
                        }
                        if (var472 == 3330) {
                            var6--;
                            int var422 = class185.field3176[var6];
                            class185.field3176[var6++] = class193.method1268(var422, 110);
                            continue;
                        }
                        if (var472 == 3331) {
                            var6 -= 2;
                            int var423 = class185.field3176[var6];
                            int var424 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class66.method447(false, class261.method1705(arg0, -11764), var423, var424);
                            continue;
                        }
                        if (var472 == 3332) {
                            var6 -= 2;
                            int var425 = class185.field3176[var6];
                            int var426 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class66.method447(true, 90, var425, var426);
                            continue;
                        }
                        if (var472 == 3333) {
                            class185.field3176[var6++] = class273.field4726;
                            continue;
                        }
                        if (var472 == 3335) {
                            class185.field3176[var6++] = class205.field3480;
                            continue;
                        }
                    } else if (var472 < 3500) {
                        if (var472 == 3400) {
                            var6 -= 2;
                            int var86 = class185.field3176[var6];
                            int var87 = class185.field3176[var6 + 1];
                            class74 var88 = class216.method1392(var86, 29436);
                            class224.field3797[var7++] = var88.method491(var87, false);
                            continue;
                        }
                        if (var472 == 3408) {
                            var6 -= 4;
                            int var89 = class185.field3176[var6];
                            int var90 = class185.field3176[var6 + 1];
                            int var91 = class185.field3176[var6 + 3];
                            int var92 = class185.field3176[var6 + 2];
                            class74 var93 = class216.method1392(var92, 29436);
                            if (var93.field1214 == var89 && var93.field1229 == var90) {
                                if (var90 == 115) {
                                    class224.field3797[var7++] = var93.method491(var91, false);
                                } else {
                                    class185.field3176[var6++] = var93.method484(var91, class261.method1705(arg0, 29661));
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var472 == 3409) {
                            var6 -= 3;
                            int var94 = class185.field3176[var6];
                            int var95 = class185.field3176[var6 + 1];
                            int var96 = class185.field3176[var6 + 2];
                            if (var95 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class74 var97 = class216.method1392(var95, 29436);
                            if (var97.field1229 != var94) {
                                throw new RuntimeException("C3409-1");
                            }
                            class185.field3176[var6++] = var97.method486((byte) -40, var96) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3410) {
                            var6--;
                            int var98 = class185.field3176[var6];
                            var7--;
                            class275 var99 = class224.field3797[var7];
                            if (var98 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class74 var100 = class216.method1392(var98, 29436);
                            if (var100.field1229 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class185.field3176[var6++] = var100.method485(var99, arg0 + 11698) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3411) {
                            var6--;
                            int var101 = class185.field3176[var6];
                            class74 var102 = class216.method1392(var101, arg0 ^ 0xFFFFA0B4);
                            class185.field3176[var6++] = var102.field1220.method1868((byte) 69);
                            continue;
                        }
                    } else if (var472 < 3700) {
                        if (var472 == 3600) {
                            if (class36.field602 == 0) {
                                class185.field3176[var6++] = -2;
                            } else if (class36.field602 == 1) {
                                class185.field3176[var6++] = -1;
                            } else {
                                class185.field3176[var6++] = class63.field1053;
                            }
                            continue;
                        }
                        if (var472 == 3601) {
                            var6--;
                            int var378 = class185.field3176[var6];
                            if (class36.field602 == 2 && class63.field1053 > var378) {
                                class224.field3797[var7++] = class148.field2585[var378];
                                continue;
                            }
                            class224.field3797[var7++] = class67.field1097;
                            continue;
                        }
                        if (var472 == 3602) {
                            var6--;
                            int var379 = class185.field3176[var6];
                            if (class36.field602 == 2 && class63.field1053 > var379) {
                                class185.field3176[var6++] = class102.field1694[var379];
                                continue;
                            }
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3603) {
                            var6--;
                            int var380 = class185.field3176[var6];
                            if (class36.field602 == 2 && class63.field1053 > var380) {
                                class185.field3176[var6++] = class25.field408[var380];
                                continue;
                            }
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3604) {
                            var7--;
                            class275 var381 = class224.field3797[var7];
                            var6--;
                            int var382 = class185.field3176[var6];
                            class201.method1314(4, var381, var382);
                            continue;
                        }
                        if (var472 == 3605) {
                            var7--;
                            class275 var383 = class224.field3797[var7];
                            class29.method171(0, var383.method1833(0));
                            continue;
                        }
                        if (var472 == 3606) {
                            var7--;
                            class275 var384 = class224.field3797[var7];
                            class41.method240(var384.method1833(0), false);
                            continue;
                        }
                        if (var472 == 3607) {
                            var7--;
                            class275 var385 = class224.field3797[var7];
                            class78.method511(var385.method1833(0), 0);
                            continue;
                        }
                        if (var472 == 3608) {
                            var7--;
                            class275 var386 = class224.field3797[var7];
                            class255.method1671(true, var386.method1833(0));
                            continue;
                        }
                        if (var472 == 3609) {
                            var7--;
                            class275 var387 = class224.field3797[var7];
                            if (var387.method1851(class81.field1324, 87) || var387.method1851(class77.field1285, -124)) {
                                var387 = var387.method1839(7, (byte) 113);
                            }
                            class185.field3176[var6++] = class72.method468(var387, (byte) -90) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3610) {
                            var6--;
                            int var388 = class185.field3176[var6];
                            if (class36.field602 == 2 && class63.field1053 > var388) {
                                class224.field3797[var7++] = class86.field1450[var388];
                                continue;
                            }
                            class224.field3797[var7++] = class67.field1097;
                            continue;
                        }
                        if (var472 == 3611) {
                            if (class76.field1244 == null) {
                                class224.field3797[var7++] = class67.field1097;
                            } else {
                                class224.field3797[var7++] = class76.field1244.method1850(arg0 + 11801);
                            }
                            continue;
                        }
                        if (var472 == 3612) {
                            if (class76.field1244 == null) {
                                class185.field3176[var6++] = 0;
                            } else {
                                class185.field3176[var6++] = class225.field3816;
                            }
                            continue;
                        }
                        if (var472 == 3613) {
                            var6--;
                            int var389 = class185.field3176[var6];
                            if (class76.field1244 != null && class225.field3816 > var389) {
                                class224.field3797[var7++] = class74.field1224[var389].field2860.method1850(97);
                                continue;
                            }
                            class224.field3797[var7++] = class67.field1097;
                            continue;
                        }
                        if (var472 == 3614) {
                            var6--;
                            int var390 = class185.field3176[var6];
                            if (class76.field1244 != null && class225.field3816 > var390) {
                                class185.field3176[var6++] = class74.field1224[var390].field2853;
                                continue;
                            }
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3615) {
                            var6--;
                            int var391 = class185.field3176[var6];
                            if (class76.field1244 != null && var391 < class225.field3816) {
                                class185.field3176[var6++] = class74.field1224[var391].field2861;
                                continue;
                            }
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3616) {
                            class185.field3176[var6++] = class48.field809;
                            continue;
                        }
                        if (var472 == 3617) {
                            var7--;
                            class275 var392 = class224.field3797[var7];
                            class188.method1247(var392, arg0 ^ 0x2DB7);
                            continue;
                        }
                        if (var472 == 3618) {
                            class185.field3176[var6++] = class42.field711;
                            continue;
                        }
                        if (var472 == 3619) {
                            var7--;
                            class275 var393 = class224.field3797[var7];
                            class276.method1862(52, var393.method1833(0));
                            continue;
                        }
                        if (var472 == 3620) {
                            class107.method793(52);
                            continue;
                        }
                        if (var472 == 3621) {
                            if (class36.field602 == 0) {
                                class185.field3176[var6++] = -1;
                            } else {
                                class185.field3176[var6++] = class16.field240;
                            }
                            continue;
                        }
                        if (var472 == 3622) {
                            var6--;
                            int var394 = class185.field3176[var6];
                            if (class36.field602 != 0 && var394 < class16.field240) {
                                class224.field3797[var7++] = class181.method1212(class261.method1705(arg0, -11704), field2440[var394]).method1850(97);
                                continue;
                            }
                            class224.field3797[var7++] = class67.field1097;
                            continue;
                        }
                        if (var472 == 3623) {
                            var7--;
                            class275 var395 = class224.field3797[var7];
                            if (var395.method1851(class81.field1324, -83) || var395.method1851(class77.field1285, arg0 ^ 0x2D85)) {
                                var395 = var395.method1839(7, (byte) 118);
                            }
                            class185.field3176[var6++] = class143.method1026(var395, 0) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3624) {
                            var6--;
                            int var396 = class185.field3176[var6];
                            if (class74.field1224 != null && class225.field3816 > var396 && class74.field1224[var396].field2860.method1844(arg0 + 11794, class66.field1094.field1910)) {
                                class185.field3176[var6++] = 1;
                                continue;
                            }
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3625) {
                            if (class235.field4098 == null) {
                                class224.field3797[var7++] = class67.field1097;
                            } else {
                                class224.field3797[var7++] = class235.field4098.method1850(97);
                            }
                            continue;
                        }
                        if (var472 == 3626) {
                            var6--;
                            int var397 = class185.field3176[var6];
                            if (class76.field1244 != null && class225.field3816 > var397) {
                                class224.field3797[var7++] = class74.field1224[var397].field2858;
                                continue;
                            }
                            class224.field3797[var7++] = class67.field1097;
                            continue;
                        }
                        if (var472 == 3627) {
                            var6--;
                            int var398 = class185.field3176[var6];
                            if (class36.field602 == 2 && var398 >= 0 && class63.field1053 > var398) {
                                class185.field3176[var6++] = class157.field2760[var398] ? 1 : 0;
                                continue;
                            }
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                        if (var472 == 3628) {
                            var7--;
                            class275 var399 = class224.field3797[var7];
                            if (var399.method1851(class81.field1324, -126) || var399.method1851(class77.field1285, -103)) {
                                var399 = var399.method1839(7, (byte) 112);
                            }
                            class185.field3176[var6++] = class155.method1099((byte) 44, var399);
                            continue;
                        }
                    } else if (var472 < 4000) {
                        if (var472 == 3903) {
                            var6--;
                            int var364 = class185.field3176[var6];
                            class185.field3176[var6++] = class256.field4514[var364].method1635(0);
                            continue;
                        }
                        if (var472 == 3904) {
                            var6--;
                            int var365 = class185.field3176[var6];
                            class185.field3176[var6++] = class256.field4514[var365].field4424;
                            continue;
                        }
                        if (var472 == 3905) {
                            var6--;
                            int var366 = class185.field3176[var6];
                            class185.field3176[var6++] = class256.field4514[var366].field4421;
                            continue;
                        }
                        if (var472 == 3906) {
                            var6--;
                            int var367 = class185.field3176[var6];
                            class185.field3176[var6++] = class256.field4514[var367].field4423;
                            continue;
                        }
                        if (var472 == 3907) {
                            var6--;
                            int var368 = class185.field3176[var6];
                            class185.field3176[var6++] = class256.field4514[var368].field4415;
                            continue;
                        }
                        if (var472 == 3908) {
                            var6--;
                            int var369 = class185.field3176[var6];
                            class185.field3176[var6++] = class256.field4514[var369].field4412;
                            continue;
                        }
                        if (var472 == 3910) {
                            var6--;
                            int var370 = class185.field3176[var6];
                            int var371 = class256.field4514[var370].method1638(0);
                            class185.field3176[var6++] = var371 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3911) {
                            var6--;
                            int var372 = class185.field3176[var6];
                            int var373 = class256.field4514[var372].method1638(0);
                            class185.field3176[var6++] = var373 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3912) {
                            var6--;
                            int var374 = class185.field3176[var6];
                            int var375 = class256.field4514[var374].method1638(arg0 + 11704);
                            class185.field3176[var6++] = var375 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 3913) {
                            var6--;
                            int var376 = class185.field3176[var6];
                            int var377 = class256.field4514[var376].method1638(0);
                            class185.field3176[var6++] = var377 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var472 < 4100) {
                        if (var472 == 4000) {
                            var6 -= 2;
                            int var103 = class185.field3176[var6];
                            int var104 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = var103 + var104;
                            continue;
                        }
                        if (var472 == 4001) {
                            var6 -= 2;
                            int var105 = class185.field3176[var6];
                            int var106 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = var105 - var106;
                            continue;
                        }
                        if (var472 == 4002) {
                            var6 -= 2;
                            int var107 = class185.field3176[var6];
                            int var108 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = var107 * var108;
                            continue;
                        }
                        if (var472 == 4003) {
                            var6 -= 2;
                            int var109 = class185.field3176[var6];
                            int var110 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = var109 / var110;
                            continue;
                        }
                        if (var472 == 4004) {
                            var6--;
                            int var111 = class185.field3176[var6];
                            class185.field3176[var6++] = (int) (Math.random() * (double) var111);
                            continue;
                        }
                        if (var472 == 4005) {
                            var6--;
                            int var112 = class185.field3176[var6];
                            class185.field3176[var6++] = (int) ((double) (var112 + 1) * Math.random());
                            continue;
                        }
                        if (var472 == 4006) {
                            var6 -= 5;
                            int var113 = class185.field3176[var6];
                            int var114 = class185.field3176[var6 + 2];
                            int var115 = class185.field3176[var6 + 1];
                            int var116 = class185.field3176[var6 + 3];
                            int var117 = class185.field3176[var6 + 4];
                            class185.field3176[var6++] = (var115 - var113) * (var117 - var114) / (var116 - var114) + var113;
                            continue;
                        }
                        if (var472 == 4007) {
                            var6 -= 2;
                            long var118 = (long) class185.field3176[var6];
                            long var120 = (long) class185.field3176[var6 + 1];
                            class185.field3176[var6++] = (int) (var118 * var120 / 100L + var118);
                            continue;
                        }
                        if (var472 == 4008) {
                            var6 -= 2;
                            int var122 = class185.field3176[var6];
                            int var123 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class246.method1612(0x1 << var123, var122);
                            continue;
                        }
                        if (var472 == 4009) {
                            var6 -= 2;
                            int var124 = class185.field3176[var6];
                            int var125 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class19.method98(var124, -(0x1 << var125) - 1);
                            continue;
                        }
                        if (var472 == 4010) {
                            var6 -= 2;
                            int var126 = class185.field3176[var6];
                            int var127 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class19.method98(0x1 << var127, var126) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var472 == 4011) {
                            var6 -= 2;
                            int var128 = class185.field3176[var6];
                            int var129 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = var128 % var129;
                            continue;
                        }
                        if (var472 == 4012) {
                            var6 -= 2;
                            int var130 = class185.field3176[var6 + 1];
                            int var131 = class185.field3176[var6];
                            if (var131 == 0) {
                                class185.field3176[var6++] = 0;
                            } else {
                                class185.field3176[var6++] = (int) Math.pow((double) var131, (double) var130);
                            }
                            continue;
                        }
                        if (var472 == 4013) {
                            var6 -= 2;
                            int var132 = class185.field3176[var6];
                            int var133 = class185.field3176[var6 + 1];
                            if (var132 == 0) {
                                class185.field3176[var6++] = 0;
                            } else if (var133 == 0) {
                                class185.field3176[var6++] = Integer.MAX_VALUE;
                            } else {
                                class185.field3176[var6++] = (int) Math.pow((double) var132, 1.0D / (double) var133);
                            }
                            continue;
                        }
                        if (var472 == 4014) {
                            var6 -= 2;
                            int var134 = class185.field3176[var6 + 1];
                            int var135 = class185.field3176[var6];
                            class185.field3176[var6++] = class19.method98(var134, var135);
                            continue;
                        }
                        if (var472 == 4015) {
                            var6 -= 2;
                            int var136 = class185.field3176[var6 + 1];
                            int var137 = class185.field3176[var6];
                            class185.field3176[var6++] = class246.method1612(var136, var137);
                            continue;
                        }
                        if (var472 == 4016) {
                            var6 -= 2;
                            int var138 = class185.field3176[var6 + 1];
                            int var139 = class185.field3176[var6];
                            class185.field3176[var6++] = var138 > var139 ? var139 : var138;
                            continue;
                        }
                        if (var472 == 4017) {
                            var6 -= 2;
                            int var140 = class185.field3176[var6 + 1];
                            int var141 = class185.field3176[var6];
                            class185.field3176[var6++] = var141 > var140 ? var141 : var140;
                            continue;
                        }
                        if (var472 == 4018) {
                            var6 -= 3;
                            long var142 = (long) class185.field3176[var6 + 1];
                            long var144 = (long) class185.field3176[var6];
                            long var146 = (long) class185.field3176[var6 + 2];
                            class185.field3176[var6++] = (int) (var144 * var146 / var142);
                            continue;
                        }
                    } else if (var472 < 4200) {
                        if (var472 == 4100) {
                            var7--;
                            class275 var148 = class224.field3797[var7];
                            var6--;
                            int var149 = class185.field3176[var6];
                            class224.field3797[var7++] = class197.method1291(new class275[] { var148, class250.method1644(var149, (byte) -115) }, -30025);
                            continue;
                        }
                        if (var472 == 4101) {
                            var7 -= 2;
                            class275 var150 = class224.field3797[var7];
                            class275 var151 = class224.field3797[var7 + 1];
                            class224.field3797[var7++] = class197.method1291(new class275[] { var150, var151 }, arg0 - 18321);
                            continue;
                        }
                        if (var472 == 4102) {
                            var7--;
                            class275 var152 = class224.field3797[var7];
                            var6--;
                            int var153 = class185.field3176[var6];
                            class224.field3797[var7++] = class197.method1291(new class275[] { var152, class212.method1364(class261.method1705(arg0, -21145), var153, true) }, -30025);
                            continue;
                        }
                        if (var472 == 4103) {
                            var7--;
                            class275 var154 = class224.field3797[var7];
                            class224.field3797[var7++] = var154.method1831((byte) -60);
                            continue;
                        }
                        if (var472 == 4104) {
                            var6--;
                            int var155 = class185.field3176[var6];
                            long var156 = (long) var155 * 86400000L + 1014768000000L;
                            class118.field2114.setTime(new Date(var156));
                            int var158 = class118.field2114.get(5);
                            int var159 = class118.field2114.get(2);
                            int var160 = class118.field2114.get(1);
                            class224.field3797[var7++] = class197.method1291(new class275[] { class250.method1644(var158, (byte) -115), class211.field3570, class170.field2949[var159], class211.field3570, class250.method1644(var160, (byte) -115) }, -30025);
                            continue;
                        }
                        if (var472 == 4105) {
                            var7 -= 2;
                            class275 var161 = class224.field3797[var7 + 1];
                            class275 var162 = class224.field3797[var7];
                            if (class66.field1094.field1907 != null && class66.field1094.field1907.field4063) {
                                class224.field3797[var7++] = var161;
                                continue;
                            }
                            class224.field3797[var7++] = var162;
                            continue;
                        }
                        if (var472 == 4106) {
                            var6--;
                            int var163 = class185.field3176[var6];
                            class224.field3797[var7++] = class250.method1644(var163, (byte) -115);
                            continue;
                        }
                        if (var472 == 4107) {
                            var7 -= 2;
                            class185.field3176[var6++] = class224.field3797[var7].method1819((byte) -87, class224.field3797[var7 + 1]);
                            continue;
                        }
                        if (var472 == 4108) {
                            var7--;
                            class275 var164 = class224.field3797[var7];
                            var6 -= 2;
                            int var165 = class185.field3176[var6 + 1];
                            int var166 = class185.field3176[var6];
                            byte[] var167 = class220.field3742.method775(var165, 0, -24799);
                            class260 var168 = new class260(var167);
                            var168.method122(class209.field3539, (int[]) null);
                            class185.field3176[var6++] = var168.method108(var164, var166);
                            continue;
                        }
                        if (var472 == 4109) {
                            var6 -= 2;
                            var7--;
                            class275 var169 = class224.field3797[var7];
                            int var170 = class185.field3176[var6];
                            int var171 = class185.field3176[var6 + 1];
                            byte[] var172 = class220.field3742.method775(var171, 0, -24799);
                            class260 var173 = new class260(var172);
                            var173.method122(class209.field3539, (int[]) null);
                            class185.field3176[var6++] = var173.method129(var169, var170);
                            continue;
                        }
                        if (var472 == 4110) {
                            var7 -= 2;
                            class275 var174 = class224.field3797[var7];
                            class275 var175 = class224.field3797[var7 + 1];
                            var6--;
                            if (class185.field3176[var6] == 1) {
                                class224.field3797[var7++] = var174;
                            } else {
                                class224.field3797[var7++] = var175;
                            }
                            continue;
                        }
                        if (var472 == 4111) {
                            var7--;
                            class275 var176 = class224.field3797[var7];
                            class224.field3797[var7++] = class21.method111(var176);
                            continue;
                        }
                        if (var472 == 4112) {
                            var6--;
                            int var177 = class185.field3176[var6];
                            var7--;
                            class275 var178 = class224.field3797[var7];
                            if (var177 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class224.field3797[var7++] = var178.method1817(var177, -128);
                            continue;
                        }
                        if (var472 == 4113) {
                            var6--;
                            int var179 = class185.field3176[var6];
                            class185.field3176[var6++] = class210.method1354(80, var179) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4114) {
                            var6--;
                            int var180 = class185.field3176[var6];
                            class185.field3176[var6++] = class261.method1707(var180, -4774) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4115) {
                            var6--;
                            int var181 = class185.field3176[var6];
                            class185.field3176[var6++] = class57.method358(var181, 5596) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4116) {
                            var6--;
                            int var182 = class185.field3176[var6];
                            class185.field3176[var6++] = class46.method273(var182, false) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4117) {
                            var7--;
                            class275 var183 = class224.field3797[var7];
                            if (var183 == null) {
                                class185.field3176[var6++] = 0;
                            } else {
                                class185.field3176[var6++] = var183.method1838(3);
                            }
                            continue;
                        }
                        if (var472 == 4118) {
                            var6 -= 2;
                            var7--;
                            class275 var184 = class224.field3797[var7];
                            int var185 = class185.field3176[var6];
                            int var186 = class185.field3176[var6 + 1];
                            class224.field3797[var7++] = var184.method1815(var185, var186, class261.method1705(arg0, -11704));
                            continue;
                        }
                        if (var472 == 4119) {
                            var7--;
                            class275 var187 = class224.field3797[var7];
                            boolean var188 = false;
                            class275 var189 = class169.method1160(var187.method1838(3), 86);
                            for (int var190 = 0; var187.method1838(3) > var190; var190++) {
                                int var191 = var187.method1852(121, var190);
                                if (var191 == 60) {
                                    var188 = true;
                                } else if (var191 == 62) {
                                    var188 = false;
                                } else if (!var188) {
                                    var189.method1824(0, var191);
                                }
                            }
                            var189.method1827(9151);
                            class224.field3797[var7++] = var189;
                            continue;
                        }
                        if (var472 == 4120) {
                            var6 -= 2;
                            var7--;
                            class275 var192 = class224.field3797[var7];
                            int var193 = class185.field3176[var6];
                            int var194 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = var192.method1848(var193, true, var194);
                            continue;
                        }
                        if (var472 == 4121) {
                            var7 -= 2;
                            class275 var195 = class224.field3797[var7 + 1];
                            class275 var196 = class224.field3797[var7];
                            var6--;
                            int var197 = class185.field3176[var6];
                            class185.field3176[var6++] = var196.method1810(var195, (byte) 118, var197);
                            continue;
                        }
                        if (var472 == 4122) {
                            var6--;
                            int var198 = class185.field3176[var6];
                            class185.field3176[var6++] = class270.method1782(-64, var198);
                            continue;
                        }
                        if (var472 == 4123) {
                            var6--;
                            int var199 = class185.field3176[var6];
                            class185.field3176[var6++] = class120.method876(var199, (byte) 112);
                            continue;
                        }
                    } else if (var472 < 4300) {
                        if (var472 == 4200) {
                            var6--;
                            int var345 = class185.field3176[var6];
                            class224.field3797[var7++] = class210.method1352(36, var345).field4322;
                            continue;
                        }
                        if (var472 == 4201) {
                            var6 -= 2;
                            int var346 = class185.field3176[var6];
                            int var347 = class185.field3176[var6 + 1];
                            class245 var348 = class210.method1352(arg0 ^ 0xFFFFD201, var346);
                            if (var347 >= 1 && var347 <= 5 && var348.field4287[var347 - 1] != null) {
                                class224.field3797[var7++] = var348.field4287[var347 - 1];
                                continue;
                            }
                            class224.field3797[var7++] = class67.field1097;
                            continue;
                        }
                        if (var472 == 4202) {
                            var6 -= 2;
                            int var349 = class185.field3176[var6];
                            int var350 = class185.field3176[var6 + 1];
                            class245 var351 = class210.method1352(57, var349);
                            if (var350 >= 1 && var350 <= 5 && var351.field4312[var350 - 1] != null) {
                                class224.field3797[var7++] = var351.field4312[var350 - 1];
                                continue;
                            }
                            class224.field3797[var7++] = class67.field1097;
                            continue;
                        }
                        if (var472 == 4203) {
                            var6--;
                            int var352 = class185.field3176[var6];
                            class185.field3176[var6++] = class210.method1352(37, var352).field4313;
                            continue;
                        }
                        if (var472 == 4204) {
                            var6--;
                            int var353 = class185.field3176[var6];
                            class185.field3176[var6++] = class210.method1352(arg0 + 11812, var353).field4321 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4205) {
                            var6--;
                            int var354 = class185.field3176[var6];
                            class245 var355 = class210.method1352(107, var354);
                            if (var355.field4311 == -1 && var355.field4297 >= 0) {
                                class185.field3176[var6++] = var355.field4297;
                                continue;
                            }
                            class185.field3176[var6++] = var354;
                            continue;
                        }
                        if (var472 == 4206) {
                            var6--;
                            int var356 = class185.field3176[var6];
                            class245 var357 = class210.method1352(94, var356);
                            if (var357.field4311 >= 0 && var357.field4297 >= 0) {
                                class185.field3176[var6++] = var357.field4297;
                                continue;
                            }
                            class185.field3176[var6++] = var356;
                            continue;
                        }
                        if (var472 == 4207) {
                            var6--;
                            int var358 = class185.field3176[var6];
                            class185.field3176[var6++] = class210.method1352(arg0 + 11747, var358).field4268 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 4208) {
                            var6 -= 2;
                            int var359 = class185.field3176[var6];
                            int var360 = class185.field3176[var6 + 1];
                            class51 var361 = class161.method1126(false, var360);
                            if (var361.method319(arg0 + 11604)) {
                                class224.field3797[var7++] = class210.method1352(26, var359).method1610(var361.field847, 0, var360);
                            } else {
                                class185.field3176[var6++] = class210.method1352(class261.method1705(arg0, -11659), var359).method1602(arg0 + 26913, var360, var361.field846);
                            }
                            continue;
                        }
                        if (var472 == 4210) {
                            var7--;
                            class275 var362 = class224.field3797[var7];
                            var6--;
                            int var363 = class185.field3176[var6];
                            class30.method180(var363 == 1, arg0 ^ 0x58EE, var362);
                            class185.field3176[var6++] = class86.field1447;
                            continue;
                        }
                        if (var472 == 4211) {
                            if (class248.field4366 != null && class86.field1447 > class207.field3485) {
                                class185.field3176[var6++] = class19.method98(class248.field4366[class207.field3485++], 65535);
                                continue;
                            }
                            class185.field3176[var6++] = -1;
                            continue;
                        }
                        if (var472 == 4212) {
                            class207.field3485 = 0;
                            continue;
                        }
                    } else if (var472 < 4400) {
                        if (var472 == 4300) {
                            var6 -= 2;
                            int var335 = class185.field3176[var6 + 1];
                            int var336 = class185.field3176[var6];
                            class51 var337 = class161.method1126(false, var335);
                            if (var337.method319(arg0 + 11813)) {
                                class224.field3797[var7++] = class30.method176(-3, var336).method144(70, var337.field847, var335);
                            } else {
                                class185.field3176[var6++] = class30.method176(arg0 + 11701, var336).method154((byte) 111, var337.field846, var335);
                            }
                            continue;
                        }
                        if (var472 == 4301) {
                            var6--;
                            int var338 = class185.field3176[var6];
                            class185.field3176[var6++] = class30.method176(-3, var338).field363;
                            continue;
                        }
                        if (var472 == 4302) {
                            var6--;
                            int var339 = class185.field3176[var6];
                            class185.field3176[var6++] = class30.method176(arg0 + 11701, var339).field351;
                            continue;
                        }
                        if (var472 == 4303) {
                            var6--;
                            int var340 = class185.field3176[var6];
                            class185.field3176[var6++] = class30.method176(-3, var340).field375;
                            continue;
                        }
                        if (var472 == 4304) {
                            var6--;
                            int var341 = class185.field3176[var6];
                            class185.field3176[var6++] = class30.method176(-3, var341).field365;
                            continue;
                        }
                        if (var472 == 4305) {
                            var6--;
                            int var342 = class185.field3176[var6];
                            class185.field3176[var6++] = class30.method176(-3, var342).field359;
                            continue;
                        }
                        if (var472 == 4306) {
                            var6--;
                            int var343 = class185.field3176[var6];
                            class185.field3176[var6++] = class30.method176(arg0 + 11701, var343).field404;
                            continue;
                        }
                        if (var472 == 4307) {
                            var6--;
                            int var344 = class185.field3176[var6];
                            class185.field3176[var6++] = class30.method176(-3, var344).field361;
                            continue;
                        }
                    } else if (var472 < 4500) {
                        if (var472 == 4400) {
                            var6 -= 2;
                            int var200 = class185.field3176[var6 + 1];
                            int var201 = class185.field3176[var6];
                            class51 var202 = class161.method1126(false, var200);
                            if (var202.method319(arg0 + 11770)) {
                                class224.field3797[var7++] = class146.method1040(arg0 + 11625, var201).method200(-2, var200, var202.field847);
                            } else {
                                class185.field3176[var6++] = class146.method1040(105, var201).method202(0, var202.field846, var200);
                            }
                            continue;
                        }
                    } else if (var472 < 4600) {
                        if (var472 == 4500) {
                            var6 -= 2;
                            int var203 = class185.field3176[var6 + 1];
                            int var204 = class185.field3176[var6];
                            class51 var205 = class161.method1126(false, var203);
                            if (var205.method319(105)) {
                                class224.field3797[var7++] = class276.method1863(var204, arg0 + 11704).method1416(false, var203, var205.field847);
                            } else {
                                class185.field3176[var6++] = class276.method1863(var204, 0).method1417(var205.field846, var203, 50);
                            }
                            continue;
                        }
                    } else if (var472 < 5100) {
                        if (var472 == 5000) {
                            class185.field3176[var6++] = class95.field1627;
                            continue;
                        }
                        if (var472 == 5001) {
                            class215.field3665++;
                            var6 -= 3;
                            class95.field1627 = class185.field3176[var6];
                            class9.field149 = class185.field3176[var6 + 1];
                            class95.field1629 = class185.field3176[var6 + 2];
                            class149.field2597.method526((byte) -81, 171);
                            class149.field2597.method575((byte) 125, class95.field1627);
                            class149.field2597.method575((byte) 127, class9.field149);
                            class149.field2597.method575((byte) 127, class95.field1629);
                            continue;
                        }
                        if (var472 == 5002) {
                            class110.field1944++;
                            var6 -= 2;
                            var7--;
                            class275 var272 = class224.field3797[var7];
                            int var273 = class185.field3176[var6 + 1];
                            int var274 = class185.field3176[var6];
                            class149.field2597.method526((byte) -111, 246);
                            class149.field2597.method560(var272.method1833(0), -83);
                            class149.field2597.method575((byte) 125, var274 - 1);
                            class149.field2597.method575((byte) 124, var273);
                            continue;
                        }
                        if (var472 == 5003) {
                            class275 var275 = null;
                            var6--;
                            int var276 = class185.field3176[var6];
                            if (var276 < 100) {
                                var275 = class13.field195[var276];
                            }
                            if (var275 == null) {
                                var275 = class67.field1097;
                            }
                            class224.field3797[var7++] = var275;
                            continue;
                        }
                        if (var472 == 5004) {
                            var6--;
                            int var277 = class185.field3176[var6];
                            int var278 = -1;
                            if (var277 < 100 && class13.field195[var277] != null) {
                                var278 = class270.field4704[var277];
                            }
                            class185.field3176[var6++] = var278;
                            continue;
                        }
                        if (var472 == 5005) {
                            class185.field3176[var6++] = class9.field149;
                            continue;
                        }
                        if (var472 == 5008) {
                            var7--;
                            class275 var279 = class224.field3797[var7];
                            if (var279.method1851(class51.field854, -118)) {
                                class125.method903(var279, (byte) 49);
                                continue;
                            }
                            if (class277.field4838 == 0 && (class255.field4490 == 1 || class131.field2343 == 1)) {
                                continue;
                            }
                            class29.field435++;
                            byte var280 = 0;
                            byte var281 = 0;
                            class275 var282 = var279.method1831((byte) -61);
                            if (var282.method1851(class69.field1117, -120)) {
                                var281 = 0;
                                var279 = var279.method1839(class69.field1117.method1838(arg0 + 11707), (byte) 114);
                            } else if (var282.method1851(class182.field3127, -100)) {
                                var279 = var279.method1839(class182.field3127.method1838(arg0 ^ 0xFFFFD24B), (byte) -93);
                                var281 = 1;
                            } else if (var282.method1851(class118.field2096, 126)) {
                                var281 = 2;
                                var279 = var279.method1839(class118.field2096.method1838(3), (byte) 99);
                            } else if (var282.method1851(class25.field416, 82)) {
                                var281 = 3;
                                var279 = var279.method1839(class25.field416.method1838(3), (byte) 90);
                            } else if (var282.method1851(class195.field3337, -68)) {
                                var281 = 4;
                                var279 = var279.method1839(class195.field3337.method1838(3), (byte) -39);
                            } else if (var282.method1851(class109.field1927, 90)) {
                                var279 = var279.method1839(class109.field1927.method1838(3), (byte) 98);
                                var281 = 5;
                            } else if (var282.method1851(class30.field454, arg0 + 11781)) {
                                var279 = var279.method1839(class30.field454.method1838(3), (byte) -26);
                                var281 = 6;
                            } else if (var282.method1851(class85.field1410, 82)) {
                                var279 = var279.method1839(class85.field1410.method1838(3), (byte) -43);
                                var281 = 7;
                            } else if (var282.method1851(class114.field2023, 77)) {
                                var281 = 8;
                                var279 = var279.method1839(class114.field2023.method1838(3), (byte) 113);
                            } else if (var282.method1851(class124.field2219, arg0 + 11652)) {
                                var281 = 9;
                                var279 = var279.method1839(class124.field2219.method1838(3), (byte) -66);
                            } else if (var282.method1851(class179.field3076, -50)) {
                                var279 = var279.method1839(class179.field3076.method1838(3), (byte) 105);
                                var281 = 10;
                            } else if (var282.method1851(class41.field680, -117)) {
                                var281 = 11;
                                var279 = var279.method1839(class41.field680.method1838(arg0 ^ 0xFFFFD24B), (byte) 103);
                            } else if (class205.field3480 != 0) {
                                if (var282.method1851(class69.field1116, 126)) {
                                    var279 = var279.method1839(class69.field1116.method1838(3), (byte) -74);
                                    var281 = 0;
                                } else if (var282.method1851(class182.field3128, -87)) {
                                    var281 = 1;
                                    var279 = var279.method1839(class182.field3128.method1838(arg0 ^ 0xFFFFD24B), (byte) -24);
                                } else if (var282.method1851(class118.field2104, 109)) {
                                    var279 = var279.method1839(class118.field2104.method1838(3), (byte) 86);
                                    var281 = 2;
                                } else if (var282.method1851(class25.field419, -70)) {
                                    var279 = var279.method1839(class25.field419.method1838(3), (byte) -91);
                                    var281 = 3;
                                } else if (var282.method1851(class195.field3338, -58)) {
                                    var279 = var279.method1839(class195.field3338.method1838(3), (byte) -117);
                                    var281 = 4;
                                } else if (var282.method1851(class109.field1892, -92)) {
                                    var279 = var279.method1839(class109.field1892.method1838(arg0 ^ 0xFFFFD24B), (byte) 88);
                                    var281 = 5;
                                } else if (var282.method1851(class30.field451, arg0 ^ 0xFFFFD22E)) {
                                    var279 = var279.method1839(class30.field451.method1838(3), (byte) 100);
                                    var281 = 6;
                                } else if (var282.method1851(class85.field1406, arg0 ^ 0x2DE0)) {
                                    var281 = 7;
                                    var279 = var279.method1839(class85.field1406.method1838(3), (byte) 89);
                                } else if (var282.method1851(class114.field2026, -78)) {
                                    var281 = 8;
                                    var279 = var279.method1839(class114.field2026.method1838(arg0 ^ 0xFFFFD24B), (byte) 115);
                                } else if (var282.method1851(class124.field2215, arg0 + 11795)) {
                                    var281 = 9;
                                    var279 = var279.method1839(class124.field2215.method1838(3), (byte) -116);
                                } else if (var282.method1851(class179.field3086, -81)) {
                                    var281 = 10;
                                    var279 = var279.method1839(class179.field3086.method1838(3), (byte) -51);
                                } else if (var282.method1851(class41.field677, 101)) {
                                    var279 = var279.method1839(class41.field677.method1838(3), (byte) -65);
                                    var281 = 11;
                                }
                            }
                            class275 var283 = var279.method1831((byte) -119);
                            if (var283.method1851(class170.field2956, -105)) {
                                var280 = 1;
                                var279 = var279.method1839(class170.field2956.method1838(3), (byte) -118);
                            } else if (var283.method1851(class92.field1573, 81)) {
                                var279 = var279.method1839(class92.field1573.method1838(3), (byte) 122);
                                var280 = 2;
                            } else if (var283.method1851(class267.field4638, -99)) {
                                var279 = var279.method1839(class267.field4638.method1838(3), (byte) -118);
                                var280 = 3;
                            } else if (var283.method1851(class187.field3192, -65)) {
                                var280 = 4;
                                var279 = var279.method1839(class187.field3192.method1838(3), (byte) -61);
                            } else if (var283.method1851(class224.field3785, -117)) {
                                var279 = var279.method1839(class224.field3785.method1838(3), (byte) -85);
                                var280 = 5;
                            } else if (class205.field3480 != 0) {
                                if (var283.method1851(class170.field2974, -81)) {
                                    var279 = var279.method1839(class170.field2974.method1838(3), (byte) -113);
                                    var280 = 1;
                                } else if (var283.method1851(class92.field1568, 93)) {
                                    var280 = 2;
                                    var279 = var279.method1839(class92.field1568.method1838(3), (byte) -80);
                                } else if (var283.method1851(class267.field4635, 123)) {
                                    var279 = var279.method1839(class267.field4635.method1838(3), (byte) -106);
                                    var280 = 3;
                                } else if (var283.method1851(class187.field3208, 89)) {
                                    var280 = 4;
                                    var279 = var279.method1839(class187.field3208.method1838(arg0 ^ 0xFFFFD24B), (byte) 93);
                                } else if (var283.method1851(class224.field3781, 118)) {
                                    var279 = var279.method1839(class224.field3781.method1838(3), (byte) 85);
                                    var280 = 5;
                                }
                            }
                            class149.field2597.method526((byte) -56, 46);
                            class149.field2597.method575((byte) 127, 0);
                            int var284 = class149.field2597.field1392;
                            class149.field2597.method575((byte) 127, var281);
                            class149.field2597.method575((byte) 127, var280);
                            class48.method310(class149.field2597, -11052, var279);
                            class149.field2597.method594(false, class149.field2597.field1392 - var284);
                            continue;
                        }
                        if (var472 == 5009) {
                            var7 -= 2;
                            class275 var285 = class224.field3797[var7];
                            class275 var286 = class224.field3797[var7 + 1];
                            if (class277.field4838 != 0 || class255.field4490 != 1 && class131.field2343 != 1) {
                                class149.field2597.method526((byte) -114, 181);
                                class149.field2597.method575((byte) 124, 0);
                                class184.field3155++;
                                int var287 = class149.field2597.field1392;
                                class149.field2597.method560(var285.method1833(0), -73);
                                class48.method310(class149.field2597, -11052, var286);
                                class149.field2597.method594(false, class149.field2597.field1392 - var287);
                            }
                            continue;
                        }
                        if (var472 == 5010) {
                            class275 var288 = null;
                            var6--;
                            int var289 = class185.field3176[var6];
                            if (var289 < 100) {
                                var288 = class190.field3273[var289];
                            }
                            if (var288 == null) {
                                var288 = class67.field1097;
                            }
                            class224.field3797[var7++] = var288;
                            continue;
                        }
                        if (var472 == 5011) {
                            var6--;
                            int var290 = class185.field3176[var6];
                            class275 var291 = null;
                            if (var290 < 100) {
                                var291 = class17.field248[var290];
                            }
                            if (var291 == null) {
                                var291 = class67.field1097;
                            }
                            class224.field3797[var7++] = var291;
                            continue;
                        }
                        if (var472 == 5012) {
                            var6--;
                            int var292 = class185.field3176[var6];
                            int var293 = -1;
                            if (var292 < 100) {
                                var293 = class153.field2687[var292];
                            }
                            class185.field3176[var6++] = var293;
                            continue;
                        }
                        if (var472 == 5015) {
                            class275 var294;
                            if (class66.field1094 == null || class66.field1094.field1910 == null) {
                                var294 = class79.field1299;
                            } else {
                                var294 = class66.field1094.method809((byte) -33);
                            }
                            class224.field3797[var7++] = var294;
                            continue;
                        }
                        if (var472 == 5016) {
                            class185.field3176[var6++] = class95.field1629;
                            continue;
                        }
                        if (var472 == 5017) {
                            class185.field3176[var6++] = class192.field3311;
                            continue;
                        }
                        if (var472 == 5050) {
                            var6--;
                            int var295 = class185.field3176[var6];
                            class224.field3797[var7++] = class99.method707(true, var295).field2366;
                            continue;
                        }
                        if (var472 == 5051) {
                            var6--;
                            int var296 = class185.field3176[var6];
                            class133 var297 = class99.method707(true, var296);
                            if (var297.field2377 == null) {
                                class185.field3176[var6++] = 0;
                            } else {
                                class185.field3176[var6++] = var297.field2377.length;
                            }
                            continue;
                        }
                        if (var472 == 5052) {
                            var6 -= 2;
                            int var298 = class185.field3176[var6 + 1];
                            int var299 = class185.field3176[var6];
                            class133 var300 = class99.method707(true, var299);
                            int var301 = var300.field2377[var298];
                            class185.field3176[var6++] = var301;
                            continue;
                        }
                        if (var472 == 5053) {
                            var6--;
                            int var302 = class185.field3176[var6];
                            class133 var303 = class99.method707(true, var302);
                            if (var303.field2374 == null) {
                                class185.field3176[var6++] = 0;
                            } else {
                                class185.field3176[var6++] = var303.field2374.length;
                            }
                            continue;
                        }
                        if (var472 == 5054) {
                            var6 -= 2;
                            int var304 = class185.field3176[var6];
                            int var305 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class99.method707(true, var304).field2374[var305];
                            continue;
                        }
                        if (var472 == 5055) {
                            var6--;
                            int var306 = class185.field3176[var6];
                            class224.field3797[var7++] = class170.method1168(32768, var306).method965(false);
                            continue;
                        }
                        if (var472 == 5056) {
                            var6--;
                            int var307 = class185.field3176[var6];
                            class131 var308 = class170.method1168(32768, var307);
                            if (var308.field2354 == null) {
                                class185.field3176[var6++] = 0;
                            } else {
                                class185.field3176[var6++] = var308.field2354.length;
                            }
                            continue;
                        }
                        if (var472 == 5057) {
                            var6 -= 2;
                            int var309 = class185.field3176[var6];
                            int var310 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class170.method1168(arg0 + 44472, var309).field2354[var310];
                            continue;
                        }
                        if (var472 == 5058) {
                            class56.field940 = new class38();
                            var6--;
                            class56.field940.field639 = class185.field3176[var6];
                            class56.field940.field631 = class170.method1168(32768, class56.field940.field639);
                            class56.field940.field640 = new int[class56.field940.field631.method966((byte) -97)];
                            continue;
                        }
                        if (var472 == 5059) {
                            class45.field755++;
                            class149.field2597.method526((byte) -51, 249);
                            class149.field2597.method575((byte) 125, 0);
                            int var311 = class149.field2597.field1392;
                            class149.field2597.method575((byte) 126, 0);
                            class149.field2597.method600(class56.field940.field639, (byte) 109);
                            class56.field940.field631.method955(-51, class149.field2597, class56.field940.field640);
                            class149.field2597.method594(false, class149.field2597.field1392 - var311);
                            continue;
                        }
                        if (var472 == 5060) {
                            class230.field4036++;
                            var7--;
                            class275 var312 = class224.field3797[var7];
                            class149.field2597.method526((byte) -79, 125);
                            class149.field2597.method575((byte) 124, 0);
                            int var313 = class149.field2597.field1392;
                            class149.field2597.method560(var312.method1833(0), -54);
                            class149.field2597.method600(class56.field940.field639, (byte) 98);
                            class56.field940.field631.method955(-88, class149.field2597, class56.field940.field640);
                            class149.field2597.method594(false, class149.field2597.field1392 - var313);
                            continue;
                        }
                        if (var472 == 5061) {
                            class45.field755++;
                            class149.field2597.method526((byte) -105, 249);
                            class149.field2597.method575((byte) 125, 0);
                            int var314 = class149.field2597.field1392;
                            class149.field2597.method575((byte) 125, 1);
                            class149.field2597.method600(class56.field940.field639, (byte) 101);
                            class56.field940.field631.method955(arg0 ^ 0x2DE7, class149.field2597, class56.field940.field640);
                            class149.field2597.method594(false, class149.field2597.field1392 - var314);
                            continue;
                        }
                        if (var472 == 5062) {
                            var6 -= 2;
                            int var315 = class185.field3176[var6];
                            int var316 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class99.method707(true, var315).field2373[var316];
                            continue;
                        }
                        if (var472 == 5063) {
                            var6 -= 2;
                            int var317 = class185.field3176[var6];
                            int var318 = class185.field3176[var6 + 1];
                            class185.field3176[var6++] = class99.method707(true, var317).field2371[var318];
                            continue;
                        }
                        if (var472 == 5064) {
                            var6 -= 2;
                            int var319 = class185.field3176[var6 + 1];
                            int var320 = class185.field3176[var6];
                            if (var319 == -1) {
                                class185.field3176[var6++] = -1;
                            } else {
                                class185.field3176[var6++] = class99.method707(true, var320).method973(var319, class261.method1705(arg0, 11703));
                            }
                            continue;
                        }
                        if (var472 == 5065) {
                            var6 -= 2;
                            int var321 = class185.field3176[var6];
                            int var322 = class185.field3176[var6 + 1];
                            if (var322 == -1) {
                                class185.field3176[var6++] = -1;
                            } else {
                                class185.field3176[var6++] = class99.method707(true, var321).method971(-104, var322);
                            }
                            continue;
                        }
                        if (var472 == 5066) {
                            var6--;
                            int var323 = class185.field3176[var6];
                            class185.field3176[var6++] = class170.method1168(32768, var323).method966((byte) -97);
                            continue;
                        }
                        if (var472 == 5067) {
                            var6 -= 2;
                            int var324 = class185.field3176[var6];
                            int var325 = class185.field3176[var6 + 1];
                            int var326 = class170.method1168(32768, var324).method956(-80, var325);
                            class185.field3176[var6++] = var326;
                            continue;
                        }
                        if (var472 == 5068) {
                            var6 -= 2;
                            int var327 = class185.field3176[var6];
                            int var328 = class185.field3176[var6 + 1];
                            class56.field940.field640[var327] = var328;
                            continue;
                        }
                        if (var472 == 5069) {
                            var6 -= 2;
                            int var329 = class185.field3176[var6 + 1];
                            int var330 = class185.field3176[var6];
                            class56.field940.field640[var330] = var329;
                            continue;
                        }
                        if (var472 == 5070) {
                            var6 -= 3;
                            int var331 = class185.field3176[var6 + 1];
                            int var332 = class185.field3176[var6];
                            int var333 = class185.field3176[var6 + 2];
                            class131 var334 = class170.method1168(32768, var332);
                            if (var334.method956(-94, var331) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class185.field3176[var6++] = var334.method959(var333, 111, var331);
                            continue;
                        }
                    } else if (var472 < 5200) {
                        if (var472 == 5100) {
                            if (class149.field2605[86]) {
                                class185.field3176[var6++] = 1;
                            } else {
                                class185.field3176[var6++] = 0;
                            }
                            continue;
                        }
                        if (var472 == 5101) {
                            if (class149.field2605[82]) {
                                class185.field3176[var6++] = 1;
                            } else {
                                class185.field3176[var6++] = 0;
                            }
                            continue;
                        }
                        if (var472 == 5102) {
                            if (class149.field2605[81]) {
                                class185.field3176[var6++] = 1;
                            } else {
                                class185.field3176[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var472 < 5300) {
                        if (var472 == 5200) {
                            var6--;
                            class14.method66(class185.field3176[var6], -62);
                            continue;
                        }
                        if (var472 == 5201) {
                            class185.field3176[var6++] = class76.method498((byte) 121);
                            continue;
                        }
                        if (var472 == 5202) {
                            var6--;
                            class219.method1401((byte) -78, class185.field3176[var6]);
                            continue;
                        }
                        if (var472 == 5203) {
                            var7--;
                            class271.method1784(class224.field3797[var7], (byte) -128);
                            continue;
                        }
                        if (var472 == 5204) {
                            class224.field3797[var7 - 1] = class69.method456(class224.field3797[var7 - 1], arg0 + 5509);
                            continue;
                        }
                        if (var472 == 5205) {
                            var7--;
                            class270.method1779(class224.field3797[var7], arg0 ^ 0x5AE9);
                            continue;
                        }
                        if (var472 == 5206) {
                            var6--;
                            int var269 = class185.field3176[var6];
                            class225 var270 = class231.method1500(arg0 ^ 0x2DEF, var269 >> 14 & 0x3FFF, var269 & 0x3FFF);
                            if (var270 == null) {
                                class224.field3797[var7++] = class67.field1097;
                            } else {
                                class224.field3797[var7++] = var270.field3814;
                            }
                            continue;
                        }
                        if (var472 == 5207) {
                            var7--;
                            class225 var271 = class247.method1624(-1, class224.field3797[var7]);
                            if (var271 != null && var271.field3815 != null) {
                                class224.field3797[var7++] = var271.field3815;
                                continue;
                            }
                            class224.field3797[var7++] = class67.field1097;
                            continue;
                        }
                    } else if (var472 < 5400) {
                        if (var472 == 5300) {
                            var6 -= 2;
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                        if (var472 == 5301) {
                            continue;
                        }
                        if (var472 == 5302) {
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                        if (var472 == 5303) {
                            var6--;
                            class185.field3176[var6++] = 0;
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                        if (var472 == 5305) {
                            byte var206 = -1;
                            class185.field3176[var6++] = var206;
                            continue;
                        }
                        if (var472 == 5306) {
                            class185.field3176[var6++] = class56.method353(true);
                            continue;
                        }
                        if (var472 == 5307) {
                            var6--;
                            int var207 = class185.field3176[var6];
                            if (var207 < 0 || var207 > 2) {
                                var207 = 0;
                            }
                            class103.method736(false, -1, var207, -1, arg0 ^ 0x2DC0);
                            continue;
                        }
                        if (var472 == 5308) {
                            class185.field3176[var6++] = class73.field1198;
                            continue;
                        }
                        if (var472 == 5309) {
                            var6--;
                            int var208 = class185.field3176[var6];
                            if (var208 < 0 || var208 > 2) {
                                var208 = 0;
                            }
                            class73.field1198 = var208;
                            class219.method1407(arg0 ^ 0x2DB6, class3.field24);
                            continue;
                        }
                    } else if (var472 < 5500) {
                        if (var472 == 5400) {
                            var7 -= 2;
                            class77.field1275++;
                            class275 var248 = class224.field3797[var7];
                            class275 var249 = class224.field3797[var7 + 1];
                            var6--;
                            int var250 = class185.field3176[var6];
                            class149.field2597.method526((byte) -70, 44);
                            class149.field2597.method575((byte) 125, class75.method493(var248, 127) - (-class75.method493(var249, -34) - 1));
                            class149.field2597.method584((byte) 122, var248);
                            class149.field2597.method584((byte) 127, var249);
                            class149.field2597.method575((byte) 126, var250);
                            continue;
                        }
                        if (var472 == 5401) {
                            var6 -= 2;
                            class117.field2080[class185.field3176[var6]] = (short) class83.method537(true, class185.field3176[var6 + 1]);
                            class150.method1066(-97);
                            class100.method716((byte) -46);
                            class143.method1028(-123);
                            class115.method841((byte) -34);
                            class17.method90(1);
                            continue;
                        }
                        if (var472 == 5405) {
                            var6 -= 2;
                            int var251 = class185.field3176[var6];
                            int var252 = class185.field3176[var6 + 1];
                            if (var251 >= 0 && var251 < 2) {
                                class35.field575[var251] = new int[var252 << 1][4];
                            }
                            continue;
                        }
                        if (var472 == 5406) {
                            var6 -= 7;
                            int var253 = class185.field3176[var6];
                            int var254 = class185.field3176[var6 + 2];
                            int var255 = class185.field3176[var6 + 3];
                            int var256 = class185.field3176[var6 + 1] << 1;
                            int var257 = class185.field3176[var6 + 4];
                            int var258 = class185.field3176[var6 + 5];
                            int var259 = class185.field3176[var6 + 6];
                            if (var253 >= 0 && var253 < 2 && class35.field575[var253] != null && var256 >= 0 && var256 < class35.field575[var253].length) {
                                class35.field575[var253][var256] = new int[] { class19.method98(var254 >> 14, 16383) * 128, var255, class19.method98(var254, 16383) * 128, var259 };
                                class35.field575[var253][var256 + 1] = new int[] { class19.method98(var257 >> 14, 16383) * 128, var258, class19.method98(var257, 16383) * 128 };
                            }
                            continue;
                        }
                        if (var472 == 5407) {
                            var6--;
                            int var260 = class35.field575[class185.field3176[var6]].length >> 1;
                            class185.field3176[var6++] = var260;
                            continue;
                        }
                        if (var472 == 5411) {
                            if (class165.field2870 == null) {
                                class200.method1307(class108.method803(-1), arg0 ^ 0xFFFFD27A, false);
                            } else {
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var472 == 5419) {
                            class275 var261 = class67.field1097;
                            if (class148.field2576 != null) {
                                var261 = class125.method905(class148.field2576.field4627, 123);
                                try {
                                    if (class148.field2576.field4625 != null) {
                                        byte[] var262 = ((String) class148.field2576.field4625).getBytes("ISO-8859-1");
                                        var261 = class191.method1256(var262, arg0 + 11600, var262.length, 0);
                                    }
                                } catch (UnsupportedEncodingException var470) {
                                }
                            }
                            class224.field3797[var7++] = var261;
                            continue;
                        }
                        if (var472 == 5420) {
                            class185.field3176[var6++] = class58.field979 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 5421) {
                            var6--;
                            boolean var263 = class185.field3176[var6] == 1;
                            var7--;
                            class275 var264 = class224.field3797[var7];
                            class275 var265 = class197.method1291(new class275[] { class108.method803(-1), var264 }, -30025);
                            if (class165.field2870 != null || var263 && class58.field979 != 3 && class58.field975.startsWith("win") && !class81.field1326) {
                                class230.field4033 = var263;
                                class93.field1595 = var265;
                                class255.field4492 = class3.field24.method369((byte) -16, new String(var265.method1812((byte) -14), "ISO-8859-1"));
                                continue;
                            }
                            class200.method1307(var265, 50, var263);
                            continue;
                        }
                        if (var472 == 5422) {
                            var7 -= 2;
                            class275 var266 = class224.field3797[var7];
                            class275 var267 = class224.field3797[var7 + 1];
                            var6--;
                            int var268 = class185.field3176[var6];
                            if (var266.method1838(3) > 0) {
                                if (class127.field2258 == null) {
                                    class127.field2258 = new class275[class96.field1635[class38.field630]];
                                }
                                class127.field2258[var268] = var266;
                            }
                            if (var267.method1838(3) > 0) {
                                if (class42.field713 == null) {
                                    class42.field713 = new class275[class96.field1635[class38.field630]];
                                }
                                class42.field713[var268] = var267;
                            }
                            continue;
                        }
                        if (var472 == 5423) {
                            var7--;
                            class224.field3797[var7].method1834(true);
                            continue;
                        }
                    } else if (var472 < 5600) {
                        if (var472 == 5500) {
                            var6 -= 4;
                            int var209 = class185.field3176[var6 + 1];
                            int var210 = class185.field3176[var6];
                            int var211 = class185.field3176[var6 + 2];
                            int var212 = class185.field3176[var6 + 3];
                            class65.method440((var210 >> 14 & 0x3FFF) - class16.field237, var209, 89, var212, var211, false, (var210 & 0x3FFF) - class234.field4083);
                            continue;
                        }
                        if (var472 == 5501) {
                            var6 -= 4;
                            int var213 = class185.field3176[var6];
                            int var214 = class185.field3176[var6 + 1];
                            int var215 = class185.field3176[var6 + 2];
                            int var216 = class185.field3176[var6 + 3];
                            class35.method212(var216, (var213 & 0x3FFF) - class234.field4083, var214, -65536, (var213 >> 14 & 0x3FFF) - class16.field237, var215);
                            continue;
                        }
                        if (var472 == 5502) {
                            var6 -= 6;
                            int var217 = class185.field3176[var6];
                            if (var217 >= 2) {
                                throw new RuntimeException();
                            }
                            class29.field434 = var217;
                            int var218 = class185.field3176[var6 + 1];
                            if (var218 + 1 >= class35.field575[class29.field434].length >> 1) {
                                throw new RuntimeException();
                            }
                            class60.field1016 = 0;
                            class85.field1383 = var218;
                            class29.field440 = class185.field3176[var6 + 2];
                            class231.field4037 = class185.field3176[var6 + 3];
                            int var219 = class185.field3176[var6 + 4];
                            if (var219 >= 2) {
                                throw new RuntimeException();
                            }
                            class44.field750 = var219;
                            int var220 = class185.field3176[var6 + 5];
                            if (var220 + 1 >= class35.field575[class44.field750].length >> 1) {
                                throw new RuntimeException();
                            }
                            class159.field2789 = 3;
                            class134.field2381 = var220;
                            continue;
                        }
                        if (var472 == 5503) {
                            class31.method184(arg0 - 13514);
                            continue;
                        }
                        if (var472 == 5504) {
                            var6 -= 2;
                            class275.field4794 = class185.field3176[var6];
                            class169.field2938 = class185.field3176[var6 + 1];
                            class97.method688(arg0 ^ 0xFFFF5248);
                            continue;
                        }
                        if (var472 == 5505) {
                            class185.field3176[var6++] = class275.field4794;
                            continue;
                        }
                        if (var472 == 5506) {
                            class185.field3176[var6++] = class169.field2938;
                            continue;
                        }
                    } else if (var472 < 5700) {
                        if (var472 == 5600) {
                            var7 -= 2;
                            class275 var221 = class224.field3797[var7];
                            class275 var222 = class224.field3797[var7 + 1];
                            var6--;
                            int var223 = class185.field3176[var6];
                            if (class200.field3427 == 10 && class137.field2407 == 0 && class89.field1501 == 0 && class79.field1300 == 0 && class3.field27 == 0) {
                                class269.method1764(var222, (byte) -128, var223, var221);
                            }
                            continue;
                        }
                        if (var472 == 5601) {
                            class214.method1376((byte) -5);
                            continue;
                        }
                        if (var472 == 5602) {
                            if (class89.field1501 == 0) {
                                class119.field2140 = -2;
                            }
                            continue;
                        }
                        if (var472 == 5603) {
                            var6 -= 4;
                            if (class200.field3427 == 10 && class137.field2407 == 0 && class89.field1501 == 0 && class79.field1300 == 0 && class3.field27 == 0) {
                                class268.method1759(class185.field3176[var6 + 3], class185.field3176[var6 + 2], class185.field3176[var6], true, class185.field3176[var6 + 1]);
                            }
                            continue;
                        }
                        if (var472 == 5604) {
                            var7--;
                            if (class200.field3427 == 10 && class137.field2407 == 0 && class89.field1501 == 0 && class79.field1300 == 0 && class3.field27 == 0) {
                                class148.method1054(class224.field3797[var7].method1833(arg0 + 11704), -123);
                            }
                            continue;
                        }
                        if (var472 == 5605) {
                            var6 -= 4;
                            var7 -= 2;
                            if (class200.field3427 == 10 && class137.field2407 == 0 && class89.field1501 == 0 && class79.field1300 == 0 && class3.field27 == 0) {
                                class151.method1068(class224.field3797[var7 + 1], class185.field3176[var6 + 2], 6214, class185.field3176[var6 + 1], class224.field3797[var7].method1833(arg0 + 11704), class185.field3176[var6], class185.field3176[var6 + 3]);
                            }
                            continue;
                        }
                        if (var472 == 5606) {
                            if (class79.field1300 == 0) {
                                class175.field3030 = -2;
                            }
                            continue;
                        }
                        if (var472 == 5607) {
                            class185.field3176[var6++] = class119.field2140;
                            continue;
                        }
                        if (var472 == 5608) {
                            class185.field3176[var6++] = class153.field2682;
                            continue;
                        }
                        if (var472 == 5609) {
                            class185.field3176[var6++] = class175.field3030;
                            continue;
                        }
                        if (var472 == 5610) {
                            for (int var224 = 0; var224 < 5; var224++) {
                                class224.field3797[var7++] = var224 >= class138.field2422.length ? class67.field1097 : class138.field2422[var224].method1850(arg0 + 11801);
                            }
                            class138.field2422 = null;
                            continue;
                        }
                        if (var472 == 5611) {
                            class185.field3176[var6++] = class36.field599;
                            continue;
                        }
                    } else if (var472 < 6100) {
                        if (var472 == 6001) {
                            var6--;
                            int var225 = class185.field3176[var6];
                            if (var225 < 1) {
                                var225 = 1;
                            }
                            if (var225 > 4) {
                                var225 = 4;
                            }
                            class193.field3325 = var225;
                            if (class193.field3325 == 1) {
                                class223.method1437(0.9F);
                            }
                            if (class193.field3325 == 2) {
                                class223.method1437(0.8F);
                            }
                            if (class193.field3325 == 3) {
                                class223.method1437(0.7F);
                            }
                            if (class193.field3325 == 4) {
                                class223.method1437(0.6F);
                            }
                            class100.method716((byte) -46);
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6002) {
                            var6--;
                            class108.method802(class185.field3176[var6] == 1, true);
                            class41.method233(arg0 + 8511);
                            class203.method1326((byte) 126);
                            class77.method503(118);
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6003) {
                            var6--;
                            class66.field1080 = class185.field3176[var6] == 1;
                            class77.method503(117);
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6005) {
                            var6--;
                            class77.field1284 = class185.field3176[var6] == 1;
                            class203.method1326((byte) -25);
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6006) {
                            var6--;
                            class29.field447 = class185.field3176[var6] == 1;
                            ((class187) class223.field3771).method1239(!class29.field447, 0);
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6007) {
                            var6--;
                            class76.field1257 = class185.field3176[var6] == 1;
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6008) {
                            var6--;
                            class32.field483 = class185.field3176[var6] == 1;
                            class219.method1407(arg0 ^ 0x2DB6, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6009) {
                            var6--;
                            class250.field4425 = class185.field3176[var6] == 1;
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6010) {
                            var6--;
                            class163.field2845 = class185.field3176[var6] == 1;
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6011) {
                            var6--;
                            int var226 = class185.field3176[var6];
                            if (var226 < 0 || var226 > 2) {
                                var226 = 0;
                            }
                            class240.field4219 = var226;
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6012) {
                            var6--;
                            class155.field2695 = class185.field3176[var6] == 1;
                            if (class193.field3325 == 1) {
                                class223.method1437(0.9F);
                            }
                            if (class193.field3325 == 2) {
                                class223.method1437(0.8F);
                            }
                            if (class193.field3325 == 3) {
                                class223.method1437(0.7F);
                            }
                            if (class193.field3325 == 4) {
                                class223.method1437(0.6F);
                            }
                            class203.method1326((byte) 22);
                            class219.method1407(arg0 + 11702, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6014) {
                            var6--;
                            class104.field1759 = class185.field3176[var6] == 1;
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6015) {
                            var6--;
                            class153.field2674 = class185.field3176[var6] == 1;
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6016) {
                            var6--;
                            int var227 = class185.field3176[var6];
                            if (var227 < 0 || var227 > 2) {
                                var227 = 0;
                            }
                            class73.field1189 = var227;
                            class219.method1407(arg0 ^ 0x2DB6, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6017) {
                            var6--;
                            class225.field3810 = class185.field3176[var6] == 1;
                            class168.method1152((byte) 60);
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6018) {
                            var6--;
                            int var228 = class185.field3176[var6];
                            if (var228 < 0) {
                                var228 = 0;
                            }
                            if (var228 > 127) {
                                var228 = 127;
                            }
                            class61.field1019 = var228;
                            class219.method1407(arg0 ^ 0x2DB6, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6019) {
                            var6--;
                            int var229 = class185.field3176[var6];
                            if (var229 < 0) {
                                var229 = 0;
                            }
                            if (var229 > 255) {
                                var229 = 255;
                            }
                            if (class90.field1531 != var229) {
                                if (class90.field1531 == 0 && class5.field69 != -1) {
                                    class112.method820(0, class5.field69, 10000, false, var229, class164.field2859);
                                    class243.field4243 = false;
                                } else if (var229 == 0) {
                                    class165.method1141((byte) 24);
                                    class243.field4243 = false;
                                } else {
                                    class13.method58(-1048, var229);
                                }
                                class90.field1531 = var229;
                            }
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6020) {
                            var6--;
                            int var230 = class185.field3176[var6];
                            if (var230 < 0) {
                                var230 = 0;
                            }
                            if (var230 > 127) {
                                var230 = 127;
                            }
                            class173.field3006 = var230;
                            class219.method1407(-2, class3.field24);
                            class45.field760 = false;
                            continue;
                        }
                        if (var472 == 6021) {
                            var6--;
                            class275.field4745 = class185.field3176[var6] == 1;
                            class77.method503(124);
                            continue;
                        }
                    } else if (var472 < 6200) {
                        if (var472 == 6101) {
                            class185.field3176[var6++] = class193.field3325;
                            continue;
                        }
                        if (var472 == 6102) {
                            class185.field3176[var6++] = class262.method1714(-1) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 6103) {
                            class185.field3176[var6++] = class66.field1080 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 6105) {
                            class185.field3176[var6++] = class77.field1284 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 6106) {
                            class185.field3176[var6++] = class29.field447 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 6107) {
                            class185.field3176[var6++] = class76.field1257 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 6108) {
                            class185.field3176[var6++] = class32.field483 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 6109) {
                            class185.field3176[var6++] = class250.field4425 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 6110) {
                            class185.field3176[var6++] = class163.field2845 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 6111) {
                            class185.field3176[var6++] = class240.field4219;
                            continue;
                        }
                        if (var472 == 6112) {
                            class185.field3176[var6++] = class155.field2695 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 6114) {
                            class185.field3176[var6++] = class104.field1759 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 6115) {
                            class185.field3176[var6++] = class153.field2674 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 6116) {
                            class185.field3176[var6++] = class73.field1189;
                            continue;
                        }
                        if (var472 == 6117) {
                            class185.field3176[var6++] = class225.field3810 ? 1 : 0;
                            continue;
                        }
                        if (var472 == 6118) {
                            class185.field3176[var6++] = class61.field1019;
                            continue;
                        }
                        if (var472 == 6119) {
                            class185.field3176[var6++] = class90.field1531;
                            continue;
                        }
                        if (var472 == 6120) {
                            class185.field3176[var6++] = class173.field3006;
                            continue;
                        }
                        if (var472 == 6121) {
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                    } else if (var472 < 6300) {
                        if (var472 == 6200) {
                            var6 -= 2;
                            class265.field4619 = (short) class185.field3176[var6];
                            if (class265.field4619 <= 0) {
                                class265.field4619 = 256;
                            }
                            class211.field3580 = (short) class185.field3176[var6 + 1];
                            if (class211.field3580 <= 0) {
                                class211.field3580 = 205;
                            }
                            continue;
                        }
                        if (var472 == 6201) {
                            var6 -= 2;
                            class203.field3453 = (short) class185.field3176[var6];
                            if (class203.field3453 <= 0) {
                                class203.field3453 = 256;
                            }
                            class35.field584 = (short) class185.field3176[var6 + 1];
                            if (class35.field584 <= 0) {
                                class35.field584 = 320;
                            }
                            continue;
                        }
                        if (var472 == 6202) {
                            var6 -= 4;
                            class18.field262 = (short) class185.field3176[var6];
                            if (class18.field262 <= 0) {
                                class18.field262 = 1;
                            }
                            class178.field3056 = (short) class185.field3176[var6 + 1];
                            if (class178.field3056 <= 0) {
                                class178.field3056 = 32767;
                            } else if (class178.field3056 < class18.field262) {
                                class178.field3056 = class18.field262;
                            }
                            class65.field1071 = (short) class185.field3176[var6 + 2];
                            if (class65.field1071 <= 0) {
                                class65.field1071 = 1;
                            }
                            class149.field2596 = (short) class185.field3176[var6 + 3];
                            if (class149.field2596 <= 0) {
                                class149.field2596 = 32767;
                            } else if (class149.field2596 < class65.field1071) {
                                class149.field2596 = class65.field1071;
                            }
                            continue;
                        }
                        if (var472 == 6203) {
                            class37.method221(false, 0, (byte) 79, 0, class91.field1542.field3885, class91.field1542.field3980);
                            class185.field3176[var6++] = class23.field379;
                            class185.field3176[var6++] = class163.field2847;
                            continue;
                        }
                        if (var472 == 6204) {
                            class185.field3176[var6++] = class203.field3453;
                            class185.field3176[var6++] = class35.field584;
                            continue;
                        }
                        if (var472 == 6205) {
                            class185.field3176[var6++] = class265.field4619;
                            class185.field3176[var6++] = class211.field3580;
                            continue;
                        }
                    } else if (var472 < 6400) {
                        if (var472 == 6300) {
                            class185.field3176[var6++] = (int) (class121.method888((byte) -119) / 60000L);
                            continue;
                        }
                        if (var472 == 6301) {
                            class185.field3176[var6++] = (int) (class121.method888((byte) -119) / 86400000L) - 11745;
                            continue;
                        }
                        if (var472 == 6302) {
                            var6 -= 3;
                            int var243 = class185.field3176[var6 + 2];
                            int var244 = class185.field3176[var6];
                            int var245 = class185.field3176[var6 + 1];
                            class118.field2114.clear();
                            class118.field2114.set(11, 12);
                            class118.field2114.set(var243, var245, var244);
                            class185.field3176[var6++] = (int) (class118.field2114.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var472 == 6303) {
                            class118.field2114.clear();
                            class118.field2114.setTime(new Date(class121.method888((byte) -119)));
                            class185.field3176[var6++] = class118.field2114.get(1);
                            continue;
                        }
                        if (var472 == 6304) {
                            var6--;
                            int var246 = class185.field3176[var6];
                            boolean var247 = true;
                            if (var246 < 0) {
                                var247 = (var246 + 1) % 4 == 0;
                            } else if (var246 < 1582) {
                                var247 = var246 % 4 == 0;
                            } else if (var246 % 4 != 0) {
                                var247 = false;
                            } else if ((var246 % 100) != 0) {
                                var247 = true;
                            } else if ((var246 % 400) != 0) {
                                var247 = false;
                            }
                            class185.field3176[var6++] = var247 ? 1 : 0;
                            continue;
                        }
                    } else if (var472 < 6500) {
                        if (var472 == 6405) {
                            class185.field3176[var6++] = class193.method1267(112) ? 1 : 0;
                            continue;
                        }
                        if (var472 == 6406) {
                            class185.field3176[var6++] = class178.method1196((byte) 65) ? 1 : 0;
                            continue;
                        }
                    } else if (var472 < 6600) {
                        if (var472 == 6500) {
                            if (class200.field3427 == 10 && class137.field2407 == 0 && class89.field1501 == 0 && class79.field1300 == 0) {
                                class185.field3176[var6++] = class100.method712(-1) == -1 ? 0 : 1;
                                continue;
                            }
                            class185.field3176[var6++] = 1;
                            continue;
                        }
                        if (var472 == 6501) {
                            class270 var231 = class29.method173(arg0 ^ 0x2DCF);
                            if (var231 == null) {
                                class185.field3176[var6++] = -1;
                                class185.field3176[var6++] = 0;
                                class224.field3797[var7++] = class67.field1097;
                                class185.field3176[var6++] = 0;
                                class224.field3797[var7++] = class67.field1097;
                                class185.field3176[var6++] = 0;
                            } else {
                                class185.field3176[var6++] = var231.field4698;
                                class185.field3176[var6++] = var231.field1445;
                                class224.field3797[var7++] = var231.field4705;
                                class205 var232 = var231.method1781(5595);
                                class185.field3176[var6++] = var232.field3474;
                                class224.field3797[var7++] = var232.field3479;
                                class185.field3176[var6++] = var231.field1452;
                            }
                            continue;
                        }
                        if (var472 == 6502) {
                            class270 var233 = class67.method451(arg0 + 11704);
                            if (var233 == null) {
                                class185.field3176[var6++] = -1;
                                class185.field3176[var6++] = 0;
                                class224.field3797[var7++] = class67.field1097;
                                class185.field3176[var6++] = 0;
                                class224.field3797[var7++] = class67.field1097;
                                class185.field3176[var6++] = 0;
                            } else {
                                class185.field3176[var6++] = var233.field4698;
                                class185.field3176[var6++] = var233.field1445;
                                class224.field3797[var7++] = var233.field4705;
                                class205 var234 = var233.method1781(5595);
                                class185.field3176[var6++] = var234.field3474;
                                class224.field3797[var7++] = var234.field3479;
                                class185.field3176[var6++] = var233.field1452;
                            }
                            continue;
                        }
                        if (var472 == 6503) {
                            var6--;
                            int var235 = class185.field3176[var6];
                            if (class200.field3427 == 10 && class137.field2407 == 0 && class89.field1501 == 0 && class79.field1300 == 0) {
                                class185.field3176[var6++] = class196.method1274(1933, var235) ? 1 : 0;
                                continue;
                            }
                            class185.field3176[var6++] = 0;
                            continue;
                        }
                        if (var472 == 6504) {
                            var6--;
                            class4.field62 = class185.field3176[var6];
                            class219.method1407(arg0 ^ 0x2DB6, class3.field24);
                            continue;
                        }
                        if (var472 == 6505) {
                            class185.field3176[var6++] = class4.field62;
                            continue;
                        }
                        if (var472 == 6506) {
                            var6--;
                            int var236 = class185.field3176[var6];
                            class270 var237 = class201.method1322(var236, true);
                            if (var237 == null) {
                                class185.field3176[var6++] = -1;
                                class224.field3797[var7++] = class67.field1097;
                                class185.field3176[var6++] = 0;
                                class224.field3797[var7++] = class67.field1097;
                                class185.field3176[var6++] = 0;
                            } else {
                                class185.field3176[var6++] = var237.field1445;
                                class224.field3797[var7++] = var237.field4705;
                                class205 var238 = var237.method1781(arg0 ^ 0xFFFFC793);
                                class185.field3176[var6++] = var238.field3474;
                                class224.field3797[var7++] = var238.field3479;
                                class185.field3176[var6++] = var237.field1452;
                            }
                            continue;
                        }
                        if (var472 == 6507) {
                            var6 -= 4;
                            int var239 = class185.field3176[var6];
                            boolean var240 = class185.field3176[var6 + 1] == 1;
                            boolean var241 = class185.field3176[var6 + 3] == 1;
                            int var242 = class185.field3176[var6 + 2];
                            class102.method732(var239, -55, var241, var240, var242);
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var471) {
            if (var5.field271 == null) {
                if (class42.field704 != 0) {
                    class277.method1874(class63.field1058, class67.field1097, 0, true);
                }
                class1.method1(var471, "CS2 - scr:" + var5.field1707 + " op:" + var11, false);
            } else {
                class275 var467 = class169.method1160(30, 54);
                var467.method1835(class166.field2887, arg0 + 11704).method1835(var5.field271, arg0 ^ 0xFFFFD248);
                for (int var468 = class35.field580 - 1; var468 >= 0; var468--) {
                    var467.method1835(class252.field4475, 0).method1835(class195.field3339[var468].field929.field271, arg0 + 11704);
                }
                if (var11 == 40) {
                    int var469 = var10[var8];
                    var467.method1835(class12.field174, 0).method1835(class250.method1644(var469, (byte) -115), arg0 ^ 0xFFFFD248);
                }
                if (class42.field704 != 0) {
                    class277.method1874(class197.method1291(new class275[] { class243.field4246, var5.field271 }, -30025), class67.field1097, 0, true);
                }
                class1.method1(var471, "CS2 - scr:" + var5.field1707 + " op:" + var11 + new String(var467.method1812((byte) -14)), false);
            }
        }
    }
}
