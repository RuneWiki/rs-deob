import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class203 {

    @OriginalMember(owner = "client!client", name = "H", descriptor = "[I")
    public static int[] field1519 = new int[100];

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lia;")
    private static class257 field1526 = class28.method234(-76, "flash2:");

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "[Lia;")
    public static class257[] field1536 = new class257[200];

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Lia;")
    public static class257 field1524 = field1526;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lia;")
    public static class257 field1534 = field1526;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1531 = -1;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Z")
    public static boolean field1541 = false;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Z")
    public static boolean field1542;

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public static void method577(boolean arg0) {
        if (arg0) {
            method591(75, (byte) -17);
        }
        field1526 = null;
        field1524 = null;
        field1536 = null;
        field1519 = null;
        field1534 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method578(boolean arg0) {
        field1522++;
        if (!arg0) {
            field1532 = -81;
        }
        if (class217.field3675 == 1000) {
            return;
        }
        class7.field153++;
        if ((class7.field153 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class185.field3217 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class237.field4058.setSeed((long) class185.field3217);
        }
        this.method594(-1);
        class230.method1503((byte) -14);
        class29.method243((byte) -33);
        class39.method319((byte) 87);
        class111.method811(-16221);
        class16.method164(64);
        if (class114.field2059 != null) {
            int var3 = class114.field2059.method103(true);
            class45.field1044 = var3;
        }
        if (class217.field3675 == 0) {
            this.method587(104);
            class123.method860(-1);
        } else if (class217.field3675 == 5) {
            this.method587(104);
            class123.method860(-1);
        } else if (class217.field3675 == 10) {
            this.method582(-113);
            class206.method1383(-26778);
            return;
        } else if (class217.field3675 == 20) {
            this.method582(-124);
            class118.method837(true);
        } else if (class217.field3675 == 25) {
            class2.method9(-1);
        } else if (class217.field3675 == 28) {
            class2.method9(-1);
            class206.method1383(-26778);
        }
        if (class217.field3675 == 30) {
            class31.method263(-107);
        } else if (class217.field3675 == 10) {
            this.method582(-124);
            return;
        } else if (class217.field3675 == 40) {
            class118.method837(true);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lme;)Lme;")
    public static final class44 method579(class44 arg0) {
        int var1 = class78.method575(119, method590(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class221.method1456(arg0.field885, (byte) -127);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method580(byte arg0) {
        field1540++;
        if (class96.field1805 != null) {
            class96.field1805.detach();
        }
        if (arg0 > -42) {
            field1531 = -23;
        }
        if (class72.field1404 != null) {
            class72.field1404.method713(this.getClass(), 2);
        }
        if (class252.field4335 != null) {
            class252.field4335.field3235 = false;
        }
        class252.field4335 = null;
        if (class151.field2595 != null) {
            class151.field2595.method1421((byte) 121);
            class151.field2595 = null;
        }
        class25.method220(class156.field2728, -26569);
        class7.method107(class156.field2728, false);
        if (class114.field2059 != null) {
            class114.field2059.method104((byte) 127, class156.field2728);
        }
        class238.method1568(19661064);
        class28.method237(-2049);
        class114.field2059 = null;
        if (class182.field3175 != null) {
            class182.field3175.method624(98);
        }
        if (class79.field1543 != null) {
            class79.field1543.method624(99);
        }
        class75.method555(10853);
        class185.method1260(0);
        try {
            if (class172.field2947 != null) {
                class172.field2947.method883(7273);
            }
            if (class184.field3200 != null) {
                for (int var2 = 0; var2 < class184.field3200.length; var2++) {
                    if (class184.field3200[var2] != null) {
                        class184.field3200[var2].method883(7273);
                    }
                }
            }
            if (class189.field3256 != null) {
                class189.field3256.method883(7273);
            }
            if (class103.field1910 != null) {
                class103.field1910.method883(7273);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lme;IIIIIII)V")
    public static final void method581(class44[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class44 var9 = arg0[var8];
            if (var9 != null && var9.field885 == arg1 && (!var9.field990 || var9.field871 == 0 || var9.field883 || method590(var9) != 0 || class239.field4110 == var9 || var9.field949 == 1338) && (!var9.field990 || !method584(var9))) {
                int var10 = var9.field1025 + arg6;
                int var11 = var9.field928 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field871 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field926 + var10;
                    int var17 = var9.field981 + var11;
                    if (var9.field871 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class78.field1516 == var9) {
                    class170.field2931 = true;
                    class42.field849 = var10;
                    class37.field734 = var11;
                }
                if (!var9.field990 || var12 < var14 && var13 < var15) {
                    if (var9.field871 == 0) {
                        if (!var9.field990 && method584(var9) && class117.field2095 != var9) {
                            continue;
                        }
                        if (var9.field938 && class245.field4253 >= var12 && class102.field1904 >= var13 && class245.field4253 < var14 && class102.field1904 < var15) {
                            for (class164 var18 = (class164) class154.field2706.method288(26111); var18 != null; var18 = (class164) class154.field2706.method277(1)) {
                                if (var18.field2866) {
                                    var18.method254(1);
                                }
                            }
                            if (class80.field1561 == 0) {
                                class78.field1516 = null;
                                class239.field4110 = null;
                            }
                            class18.field384 = false;
                        }
                    }
                    if (var9.field990) {
                        boolean var19;
                        if (class245.field4253 >= var12 && class102.field1904 >= var13 && class245.field4253 < var14 && class102.field1904 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class94.field1780 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class102.field1902 == 1 && class105.field1952 >= var12 && class74.field1430 >= var13 && class105.field1952 < var14 && class74.field1430 < var15) {
                            var21 = true;
                        }
                        if (class104.field1934 > 0 && var9.field886 != null) {
                            for (int var22 = 0; var22 < var9.field886.length; var22++) {
                                for (int var23 = 0; var23 < class104.field1934; var23++) {
                                    int var24 = var9.field886[var22] & 0xFF;
                                    if (class13.field250[var23] == var24) {
                                        class250.method1634(var9.field935, -1, -10, class17.field378, var22 + 1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class94.method690(class74.field1430 - var11, class105.field1952 - var10, false, var9);
                        }
                        if (class78.field1516 != null && class78.field1516 != var9 && var19 && class128.method885(method590(var9), -21)) {
                            class116.field2085 = var9;
                        }
                        if (class239.field4110 == var9) {
                            class186.field3229 = true;
                            class231.field3883 = var10;
                            class92.field1747 = var11;
                        }
                        if (var9.field883 || var9.field949 != 0) {
                            if (var19 && class45.field1044 != 0 && var9.field977 != null) {
                                class164 var25 = new class164();
                                var25.field2866 = true;
                                var25.field2864 = var9;
                                var25.field2863 = class45.field1044;
                                var25.field2867 = var9.field977;
                                class154.field2706.method287(var25, 0);
                            }
                            if (class78.field1516 != null || class131.field2347 != null || class216.field3663 || var9.field949 != 1400 && class18.field384) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field949 != 0) {
                                if (var9.field949 == 1337) {
                                    class243.field4206 = var9;
                                    class257.method1718(false, var9);
                                    continue;
                                }
                                if (var9.field949 == 1338) {
                                    if (var21) {
                                        class62.method463(var9, class105.field1952 - var10, class74.field1430 - var11, 7829);
                                    }
                                    continue;
                                }
                                if (var9.field949 == 1400) {
                                    class239.field4114 = var9;
                                    if (var21) {
                                        if (class39.field793[82] && class59.field1244 > 0) {
                                            int var26 = (int) ((double) (class105.field1952 - var10 - var9.field926 / 2) * 2.0D / class15.field332) + class182.field3159 + class181.field3146;
                                            int var27 = class8.field174 + class181.field3149 - (int) ((double) (class74.field1430 - var11 - var9.field981 / 2) * 2.0D / class15.field332) - class233.field3997;
                                            class257 var28 = class233.method1528(new class257[] { class157.field2748, class111.method808(10, var26 >> 6), class133.field2382, class111.method808(10, var27 >> 6), class133.field2382, class111.method808(10, var26 & 0x3F), class133.field2382, class111.method808(10, var27 & 0x3F) }, 0);
                                            var28.method1719(14919);
                                            class145.method979(var28, 1);
                                            class189.method1274(false);
                                            continue;
                                        }
                                        class18.field384 = true;
                                        class161.field2823 = class245.field4253;
                                        class205.field3515 = class102.field1904;
                                        class125.field2249 = class181.field3146;
                                        class79.field1557 = class233.field3997;
                                        continue;
                                    }
                                    if (var20 && class18.field384) {
                                        class106.method764((byte) 104, (int) ((double) (class161.field2823 - class245.field4253) * 2.0D / class32.field628) + class125.field2249);
                                        class171.method1171(127, (int) ((double) (class205.field3515 - class102.field1904) * 2.0D / class32.field628) + class79.field1557);
                                        continue;
                                    }
                                    class18.field384 = false;
                                    continue;
                                }
                                if (var9.field949 == 1401) {
                                    if (var20) {
                                        class30.method253(var9.field926, -1, class102.field1904 - var11, class245.field4253 - var10, var9.field981);
                                    }
                                    continue;
                                }
                                if (var9.field949 == 1402) {
                                    class257.method1718(false, var9);
                                    continue;
                                }
                                if (var9.field949 == 1404) {
                                    class257.method1718(false, var9);
                                    continue;
                                }
                            }
                            if (!var9.field1022 && var21) {
                                var9.field1022 = true;
                                if (var9.field904 != null) {
                                    class164 var29 = new class164();
                                    var29.field2866 = true;
                                    var29.field2864 = var9;
                                    var29.field2862 = class105.field1952 - var10;
                                    var29.field2863 = class74.field1430 - var11;
                                    var29.field2867 = var9.field904;
                                    class154.field2706.method287(var29, 0);
                                }
                            }
                            if (var9.field1022 && var20 && var9.field891 != null) {
                                class164 var30 = new class164();
                                var30.field2866 = true;
                                var30.field2864 = var9;
                                var30.field2862 = class245.field4253 - var10;
                                var30.field2863 = class102.field1904 - var11;
                                var30.field2867 = var9.field891;
                                class154.field2706.method287(var30, 0);
                            }
                            if (var9.field1022 && !var20) {
                                var9.field1022 = false;
                                if (var9.field897 != null) {
                                    class164 var31 = new class164();
                                    var31.field2866 = true;
                                    var31.field2864 = var9;
                                    var31.field2862 = class245.field4253 - var10;
                                    var31.field2863 = class102.field1904 - var11;
                                    var31.field2867 = var9.field897;
                                    class81.field1586.method287(var31, 0);
                                }
                            }
                            if (var20 && var9.field868 != null) {
                                class164 var32 = new class164();
                                var32.field2866 = true;
                                var32.field2864 = var9;
                                var32.field2862 = class245.field4253 - var10;
                                var32.field2863 = class102.field1904 - var11;
                                var32.field2867 = var9.field868;
                                class154.field2706.method287(var32, 0);
                            }
                            if (!var9.field957 && var19) {
                                var9.field957 = true;
                                if (var9.field922 != null) {
                                    class164 var33 = new class164();
                                    var33.field2866 = true;
                                    var33.field2864 = var9;
                                    var33.field2862 = class245.field4253 - var10;
                                    var33.field2863 = class102.field1904 - var11;
                                    var33.field2867 = var9.field922;
                                    class154.field2706.method287(var33, 0);
                                }
                            }
                            if (var9.field957 && var19 && var9.field978 != null) {
                                class164 var34 = new class164();
                                var34.field2866 = true;
                                var34.field2864 = var9;
                                var34.field2862 = class245.field4253 - var10;
                                var34.field2863 = class102.field1904 - var11;
                                var34.field2867 = var9.field978;
                                class154.field2706.method287(var34, 0);
                            }
                            if (var9.field957 && !var19) {
                                var9.field957 = false;
                                if (var9.field1021 != null) {
                                    class164 var35 = new class164();
                                    var35.field2866 = true;
                                    var35.field2864 = var9;
                                    var35.field2862 = class245.field4253 - var10;
                                    var35.field2863 = class102.field1904 - var11;
                                    var35.field2867 = var9.field1021;
                                    class81.field1586.method287(var35, 0);
                                }
                            }
                            if (var9.field915 != null) {
                                class164 var36 = new class164();
                                var36.field2864 = var9;
                                var36.field2867 = var9.field915;
                                class258.field4478.method287(var36, 0);
                            }
                            if (var9.field911 != null && class82.field1590 > var9.field1014) {
                                if (var9.field934 == null || class82.field1590 - var9.field1014 > 32) {
                                    class164 var41 = new class164();
                                    var41.field2864 = var9;
                                    var41.field2867 = var9.field911;
                                    class154.field2706.method287(var41, 0);
                                } else {
                                    label543: for (int var37 = var9.field1014; var37 < class82.field1590; var37++) {
                                        int var38 = class139.field2477[var37 & 0x1F];
                                        for (int var39 = 0; var39 < var9.field934.length; var39++) {
                                            if (var9.field934[var39] == var38) {
                                                class164 var40 = new class164();
                                                var40.field2864 = var9;
                                                var40.field2867 = var9.field911;
                                                class154.field2706.method287(var40, 0);
                                                break label543;
                                            }
                                        }
                                    }
                                }
                                var9.field1014 = class82.field1590;
                            }
                            if (var9.field875 != null && class121.field2180 > var9.field972) {
                                if (var9.field905 == null || class121.field2180 - var9.field972 > 32) {
                                    class164 var46 = new class164();
                                    var46.field2864 = var9;
                                    var46.field2867 = var9.field875;
                                    class154.field2706.method287(var46, 0);
                                } else {
                                    label519: for (int var42 = var9.field972; var42 < class121.field2180; var42++) {
                                        int var43 = class83.field1628[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field905.length; var44++) {
                                            if (var9.field905[var44] == var43) {
                                                class164 var45 = new class164();
                                                var45.field2864 = var9;
                                                var45.field2867 = var9.field875;
                                                class154.field2706.method287(var45, 0);
                                                break label519;
                                            }
                                        }
                                    }
                                }
                                var9.field972 = class121.field2180;
                            }
                            if (var9.field893 != null && class114.field2057 > var9.field999) {
                                if (var9.field1009 == null || class114.field2057 - var9.field999 > 32) {
                                    class164 var51 = new class164();
                                    var51.field2864 = var9;
                                    var51.field2867 = var9.field893;
                                    class154.field2706.method287(var51, 0);
                                } else {
                                    label495: for (int var47 = var9.field999; var47 < class114.field2057; var47++) {
                                        int var48 = class99.field1829[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field1009.length; var49++) {
                                            if (var9.field1009[var49] == var48) {
                                                class164 var50 = new class164();
                                                var50.field2864 = var9;
                                                var50.field2867 = var9.field893;
                                                class154.field2706.method287(var50, 0);
                                                break label495;
                                            }
                                        }
                                    }
                                }
                                var9.field999 = class114.field2057;
                            }
                            if (var9.field1002 != null && class12.field232 > var9.field909) {
                                if (var9.field932 == null || class12.field232 - var9.field909 > 32) {
                                    class164 var56 = new class164();
                                    var56.field2864 = var9;
                                    var56.field2867 = var9.field1002;
                                    class154.field2706.method287(var56, 0);
                                } else {
                                    label471: for (int var52 = var9.field909; var52 < class12.field232; var52++) {
                                        int var53 = class43.field857[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field932.length; var54++) {
                                            if (var9.field932[var54] == var53) {
                                                class164 var55 = new class164();
                                                var55.field2864 = var9;
                                                var55.field2867 = var9.field1002;
                                                class154.field2706.method287(var55, 0);
                                                break label471;
                                            }
                                        }
                                    }
                                }
                                var9.field909 = class12.field232;
                            }
                            if (var9.field869 != null && class44.field943 > var9.field880) {
                                if (var9.field984 == null || class44.field943 - var9.field880 > 32) {
                                    class164 var61 = new class164();
                                    var61.field2864 = var9;
                                    var61.field2867 = var9.field869;
                                    class154.field2706.method287(var61, 0);
                                } else {
                                    label447: for (int var57 = var9.field880; var57 < class44.field943; var57++) {
                                        int var58 = class140.field2488[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field984.length; var59++) {
                                            if (var9.field984[var59] == var58) {
                                                class164 var60 = new class164();
                                                var60.field2864 = var9;
                                                var60.field2867 = var9.field869;
                                                class154.field2706.method287(var60, 0);
                                                break label447;
                                            }
                                        }
                                    }
                                }
                                var9.field880 = class44.field943;
                            }
                            if (class137.field2458 > var9.field1004 && var9.field874 != null) {
                                class164 var62 = new class164();
                                var62.field2864 = var9;
                                var62.field2867 = var9.field874;
                                class154.field2706.method287(var62, 0);
                            }
                            if (class188.field3252 > var9.field1004 && var9.field986 != null) {
                                class164 var63 = new class164();
                                var63.field2864 = var9;
                                var63.field2867 = var9.field986;
                                class154.field2706.method287(var63, 0);
                            }
                            if (class166.field2899 > var9.field1004 && var9.field952 != null) {
                                class164 var64 = new class164();
                                var64.field2864 = var9;
                                var64.field2867 = var9.field952;
                                class154.field2706.method287(var64, 0);
                            }
                            if (class151.field2603 > var9.field1004 && var9.field960 != null) {
                                class164 var65 = new class164();
                                var65.field2864 = var9;
                                var65.field2867 = var9.field960;
                                class154.field2706.method287(var65, 0);
                            }
                            if (class145.field2541 > var9.field1004 && var9.field882 != null) {
                                class164 var66 = new class164();
                                var66.field2864 = var9;
                                var66.field2867 = var9.field882;
                                class154.field2706.method287(var66, 0);
                            }
                            var9.field1004 = class111.field2038;
                            if (var9.field895 != null) {
                                for (int var67 = 0; var67 < class104.field1934; var67++) {
                                    class164 var68 = new class164();
                                    var68.field2864 = var9;
                                    var68.field2868 = class13.field250[var67];
                                    var68.field2859 = class211.field3610[var67];
                                    var68.field2867 = var9.field895;
                                    class154.field2706.method287(var68, 0);
                                }
                            }
                            if (class14.field308 && var9.field942 != null) {
                                class164 var69 = new class164();
                                var69.field2864 = var9;
                                var69.field2867 = var9.field942;
                                class154.field2706.method287(var69, 0);
                            }
                        }
                    }
                    if (!var9.field990 && class78.field1516 == null && class131.field2347 == null && !class216.field3663) {
                        if ((var9.field998 >= 0 || var9.field971 != 0) && class245.field4253 >= var12 && class102.field1904 >= var13 && class245.field4253 < var14 && class102.field1904 < var15) {
                            if (var9.field998 >= 0) {
                                class117.field2095 = arg0[var9.field998];
                            } else {
                                class117.field2095 = var9;
                            }
                        }
                        if (var9.field871 == 8 && class245.field4253 >= var12 && class102.field1904 >= var13 && class245.field4253 < var14 && class102.field1904 < var15) {
                            class89.field1712 = var9;
                        }
                        if (var9.field947 > var9.field981) {
                            class217.method1441(var11, var9, class245.field4253, var9.field947, class102.field1904, var9.field981, var9.field926 + var10, (byte) 123);
                        }
                    }
                    if (var9.field871 == 0) {
                        method581(arg0, var9.field935, var12, var13, var14, var15, var10 - var9.field992, var11 - var9.field873);
                        if (var9.field1015 != null) {
                            method581(var9.field1015, var9.field935, var12, var13, var14, var15, var10 - var9.field992, var11 - var9.field873);
                        }
                        class157 var70 = (class157) class136.field2426.method434((byte) -93, (long) var9.field935);
                        if (var70 != null) {
                            class165.method1130(var12, var70.field2746, var14, var10, var11, var15, (byte) 68, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    private final void method582(int arg0) {
        field1535++;
        class182.method1246(this, (byte) -81);
        for (class104.field1934 = 0; class211.method1426((byte) -126) && class104.field1934 < 128; class104.field1934++) {
            class13.field250[class104.field1934] = class25.field486;
            class211.field3610[class104.field1934] = class128.field2273;
        }
        if (arg0 > -9) {
            field1519 = null;
        }
        class171.field2935++;
        if (class5.field114 != -1) {
            class165.method1130(0, class5.field114, class12.field241, 0, 0, class166.field2897, (byte) 114, 0);
        }
        class111.field2038++;
        class30.method249(82);
        while (true) {
            class164 var2;
            class44 var3;
            class44 var4;
            do {
                var2 = (class164) class258.field4478.method285(0);
                if (var2 == null) {
                    while (true) {
                        class164 var5;
                        class44 var6;
                        class44 var7;
                        do {
                            var5 = (class164) class81.field1586.method285(0);
                            if (var5 == null) {
                                while (true) {
                                    class164 var8;
                                    class44 var9;
                                    class44 var10;
                                    do {
                                        var8 = (class164) class154.field2706.method285(0);
                                        if (var8 == null) {
                                            if (class78.field1516 != null) {
                                                class178.method1215((byte) -44);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field2864;
                                        if (var9.field890 < 0) {
                                            break;
                                        }
                                        var10 = class221.method1456(var9.field885, (byte) -27);
                                    } while (var10 == null || var10.field1015 == null || var10.field1015.length <= var9.field890 || var10.field1015[var9.field890] != var9);
                                    class57.method441(var8, -10305);
                                }
                            }
                            var6 = var5.field2864;
                            if (var6.field890 < 0) {
                                break;
                            }
                            var7 = class221.method1456(var6.field885, (byte) -108);
                        } while (var7 == null || var7.field1015 == null || var6.field890 >= var7.field1015.length || var7.field1015[var6.field890] != var6);
                        class57.method441(var5, -10305);
                    }
                }
                var3 = var2.field2864;
                if (var3.field890 < 0) {
                    break;
                }
                var4 = class221.method1456(var3.field885, (byte) -25);
            } while (var4 == null || var4.field1015 == null || var4.field1015.length <= var3.field890 || var4.field1015[var3.field890] != var3);
            class57.method441(var2, -10305);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class221.method1457(-1);
            }
            class151.field2598 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class165.field2879 = 0;
            } else if (arg0[1].equals("office")) {
                class165.field2879 = 1;
            } else if (arg0[1].equals("local")) {
                class165.field2879 = 2;
            } else {
                class221.method1457(-1);
            }
            if (arg0[2].equals("live")) {
                class33.field644 = 0;
            } else if (arg0[2].equals("rc")) {
                class33.field644 = 1;
            } else if (arg0[2].equals("wip")) {
                class33.field644 = 2;
            } else {
                class221.method1457(-1);
            }
            if (arg0[4].equals("free")) {
                class68.field1363 = false;
            } else if (arg0[4].equals("members")) {
                class68.field1363 = true;
            } else {
                class221.method1457(-1);
            }
            if (arg0[5].equals("english")) {
                class227.field3822 = 0;
            } else if (arg0[5].equals("german")) {
                class161.method1118(-31633);
                class227.field3822 = 1;
            } else {
                class221.method1457(-1);
            }
            if (arg0[6].equals("game0")) {
                class87.field1675 = 0;
            } else if (arg0[6].equals("game1")) {
                class87.field1675 = 1;
            } else {
                class221.method1457(-1);
            }
            if (arg0.length != 8) {
                class170.field2932 = false;
            } else if (arg0[7].equals("safemode")) {
                class170.field2932 = true;
            } else {
                class221.method1457(-1);
            }
            class238.field4065 = "127.0.0.1";
            class225.field3779 = 0;
            class194.field3290 = class17.field378;
            client var1 = new client();
            var1.method1365(false, 503, 503, 27, "runescape", 765, class33.field644 + 32);
            class220.field3728.setLocation(40, 40);
        } catch (Exception var3) {
            class198.method1325((String) null, var3, -122);
        }
        field1530++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
    public static final void method583(boolean arg0, byte arg1) {
        class94.field1770 = new int[104];
        field1529++;
        class162.field2837 = new int[104];
        class12.field235 = 99;
        class33.field637 = new int[104];
        if (arg1 != 55) {
            return;
        }
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class131.field2346 = new byte[var2][104][104];
        class228.field3832 = new int[104];
        class21.field442 = new byte[var2][104][104];
        class164.field2869 = new int[var2][105][105];
        class185.field3216 = new byte[var2][104][104];
        class102.field1898 = new byte[var2][104][104];
        class58.field1236 = new int[104];
        class2.field64 = new byte[var2][105][105];
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1525++;
        if (!this.method1362(-30302)) {
            return;
        }
        class151.field2598 = Integer.parseInt(this.getParameter("worldid"));
        class33.field644 = Integer.parseInt(this.getParameter("modewhat"));
        class165.field2879 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class170.field2932 = true;
        } else {
            class170.field2932 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class68.field1363 = true;
        } else {
            class68.field1363 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class161.method1118(-31633);
            class227.field3822 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class87.field1675 = 1;
        } else {
            class87.field1675 = 0;
        }
        try {
            class161.field2819 = Integer.parseInt(this.getParameter("js"));
            class59.field1249 = Integer.parseInt(this.getParameter("plug"));
            class225.field3779 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var9) {
        }
        class194.field3290 = class129.field2309.method1692(this, (byte) 93);
        if (class194.field3290 == null) {
            class194.field3290 = class17.field378;
        }
        String var5 = this.getParameter("advert");
        if (var5 != null) {
            byte[] var6 = var5.getBytes();
            class257 var7 = class55.method422(-29067, var6.length, 0, var6);
            boolean var8 = class126.method878(var7, -29090);
        }
        class238.field4065 = this.getCodeBase().getHost();
        this.method1367(503, 765, 503, class33.field644 + 32, -58);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lme;)Z")
    public static final boolean method584(class44 arg0) {
        if (class87.field1695) {
            if (method590(arg0) != 0) {
                return false;
            }
            if (arg0.field871 == 0) {
                return false;
            }
        }
        return arg0.field970;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method585(int arg0) {
        field1537++;
        if (arg0 != -6539) {
            field1531 = 119;
        }
        if (class217.field3675 == 1000) {
            return;
        }
        boolean var2 = class59.method445((byte) 121);
        if (var2 && class246.field4259 && class182.field3175 != null) {
            class182.field3175.method631(16128);
        }
        boolean var3 = false;
        if (class172.field2953 && (class217.field3675 == 30 || class217.field3675 == 10)) {
            class71.method538((byte) 35);
        }
        if (class139.field2478) {
            class139.field2478 = false;
            var3 = true;
        }
        if (class217.field3675 == 0) {
            class121.method852(var3, (Color) null, class236.field4046, 23157, class112.field2044);
        } else if (class217.field3675 == 5) {
            class156.method1091(-105, class71.field1399);
        } else if (class217.field3675 == 10 || class217.field3675 == 20) {
            class170.method1164(true);
        } else if (class217.field3675 == 25 || class217.field3675 == 28) {
            if (class158.field2781 == 1) {
                if (class32.field624 < class21.field438) {
                    class32.field624 = class21.field438;
                }
                int var4 = (class32.field624 - class21.field438) * 50 / class32.field624;
                class10.method121(class233.method1528(new class257[] { class20.field415, class10.field196, class111.method808(10, var4), class245.field4256 }, 0), (byte) 45, false);
            } else if (class158.field2781 == 2) {
                if (class16.field344 > class169.field2908) {
                    class169.field2908 = class16.field344;
                }
                int var5 = (class169.field2908 - class16.field344) * 50 / class169.field2908 + 50;
                class10.method121(class233.method1528(new class257[] { class20.field415, class10.field196, class111.method808(10, var5), class245.field4256 }, 0), (byte) -127, false);
            } else {
                class10.method121(class20.field415, (byte) 89, false);
            }
        } else if (class217.field3675 == 30) {
            class137.method943(arg0 + 6555);
        } else if (class217.field3675 == 40) {
            class10.method121(class233.method1528(new class257[] { class233.field4015, class165.field2873, class229.field3844 }, 0), (byte) -90, false);
        }
        if ((class217.field3675 == 30 || class217.field3675 == 10) && class156.field2738 == 0 && !var3) {
            try {
                Graphics var6 = class156.field2728.getGraphics();
                for (int var7 = 0; var7 < class44.field1030; var7++) {
                    if (class75.field1464[var7]) {
                        class256.field4387.method824(class13.field242[var7], false, class11.field215[var7], field1519[var7], class197.field3327[var7], var6);
                        class75.field1464[var7] = false;
                    }
                }
            } catch (Exception var11) {
                class156.field2728.repaint();
            }
        } else if (class217.field3675 > 0) {
            try {
                Graphics var8 = class156.field2728.getGraphics();
                class256.field4387.method830(0, -1097334752, 0, var8);
                for (int var9 = 0; var9 < class44.field1030; var9++) {
                    class75.field1464[var9] = false;
                }
            } catch (Exception var10) {
                class156.field2728.repaint();
            }
        }
        if (class149.field2581) {
            class216.method1437(arg0 ^ 0xFFFFE670);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public static final void method586(int arg0, int arg1) {
        class202 var2 = class222.method1466(1, -32, arg1);
        field1520++;
        var2.method1355(108);
        int var3 = 59 % ((arg0 - 34) / 53);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    private final void method587(int arg0) {
        field1527++;
        if (class62.field1286 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class80.method600(arg0 - 163);
            if (class188.field3250 == 0L) {
                class188.field3250 = var4;
            }
            if (var3 > 16384 && (var4 - class188.field3250) < 5000L) {
                if (var4 - class221.field3741 > 1000L) {
                    System.gc();
                    class221.field3741 = var4;
                }
                class112.field2044 = class244.field4241;
                class236.field4046 = 5;
            } else {
                class236.field4046 = 5;
                class62.field1286 = 10;
                class112.field2044 = class175.field2985;
            }
        } else if (class62.field1286 == 10) {
            class54.method414(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class173.field2961[var6] = new class238(104, 104);
            }
            class62.field1286 = 30;
            class112.field2044 = class44.field980;
            class236.field4046 = 10;
        } else if (class62.field1286 == 30) {
            class135.field2411 = class253.method1654(1000000, true, true, false, 0);
            class152.field2655 = class253.method1654(1000000, true, true, false, 1);
            class18.field394 = class253.method1654(1000000, true, false, true, 2);
            class46.field1060 = class253.method1654(1000000, true, true, false, 3);
            class76.field1490 = class253.method1654(1000000, true, true, false, 4);
            class128.field2279 = class253.method1654(arg0 + 999896, true, true, true, 5);
            class259.field4502 = class253.method1654(1000000, false, true, true, 6);
            class175.field2991 = class253.method1654(1000000, true, true, false, 7);
            class42.field850 = class253.method1654(1000000, true, true, false, 8);
            class121.field2179 = class253.method1654(arg0 + 999896, true, true, false, 9);
            class56.field1204 = class253.method1654(1000000, true, true, false, 10);
            class40.field831 = class253.method1654(1000000, true, true, false, 11);
            class27.field528 = class253.method1654(1000000, true, true, false, 12);
            class115.field2072 = class253.method1654(arg0 ^ 0xF4228, true, true, false, 13);
            class180.field3137 = class253.method1654(1000000, false, true, false, 14);
            class78.field1505 = class253.method1654(1000000, true, true, false, 15);
            class33.field635 = class253.method1654(1000000, true, true, false, 16);
            class167.field2905 = class253.method1654(1000000, true, true, false, 17);
            class238.field4062 = class253.method1654(1000000, true, true, false, 18);
            class169.field2914 = class253.method1654(1000000, true, true, false, 19);
            class54.field1159 = class253.method1654(1000000, true, true, false, 20);
            class52.field1133 = class253.method1654(1000000, true, true, false, 21);
            class34.field660 = class253.method1654(1000000, true, true, false, 22);
            class10.field195 = class253.method1654(1000000, true, true, true, 23);
            class45.field1040 = class253.method1654(arg0 + 999896, true, true, false, 24);
            class25.field476 = class253.method1654(arg0 ^ 0xF4228, true, true, false, 25);
            class152.field2685 = class253.method1654(1000000, true, true, true, 26);
            class112.field2044 = class244.field4248;
            class62.field1286 = 40;
            class236.field4046 = 15;
        } else if (class62.field1286 == 40) {
            byte var7 = 0;
            int var8 = var7 + class135.field2411.method1475(-7) * 4 / 100;
            int var9 = var8 + class152.field2655.method1475(arg0 - 111) * 4 / 100;
            int var10 = var9 + class18.field394.method1475(-7) / 100;
            int var11 = var10 + class46.field1060.method1475(-7) * 2 / 100;
            int var12 = var11 + class76.field1490.method1475(-7) * 6 / 100;
            int var13 = var12 + class128.field2279.method1475(-7) * 4 / 100;
            int var14 = var13 + class259.field4502.method1475(-7) * 2 / 100;
            int var15 = var14 + class175.field2991.method1475(arg0 - 111) * 50 / 100;
            int var16 = var15 + class42.field850.method1475(-7) * 2 / 100;
            int var17 = var16 + class121.field2179.method1475(-7) * 2 / 100;
            int var18 = var17 + class56.field1204.method1475(-7) * 2 / 100;
            int var19 = var18 + class40.field831.method1475(arg0 ^ 0xFFFFFF91) * 2 / 100;
            int var20 = var19 + class27.field528.method1475(-7) * 2 / 100;
            int var21 = var20 + class115.field2072.method1475(-7) * 2 / 100;
            int var22 = var21 + class180.field3137.method1475(-7) * 2 / 100;
            int var23 = var22 + class78.field1505.method1475(-7) * 2 / 100;
            int var24 = var23 + class33.field635.method1475(-7) / 100;
            int var25 = var24 + class167.field2905.method1475(-7) / 100;
            int var26 = var25 + class238.field4062.method1475(arg0 - 111) / 100;
            int var27 = var26 + class169.field2914.method1475(-7) / 100;
            int var28 = var27 + class54.field1159.method1475(-7) / 100;
            int var29 = var28 + class52.field1133.method1475(-7) / 100;
            int var30 = var29 + class34.field660.method1475(arg0 - 111) / 100;
            int var31 = var30 + class10.field195.method1475(arg0 - 111) / 100;
            int var32 = var31 + class45.field1040.method1475(-7) / 100;
            int var33 = var32 + class25.field476.method1475(-7) / 100;
            int var34 = var33 + class152.field2685.method1475(-7) / 100;
            if (var34 == 100) {
                class236.field4046 = 20;
                class112.field2044 = class211.field3616;
                class125.method870(-46, class42.field850);
                class35.method292(class42.field850, (byte) -120);
                class260.method1731(25128, class42.field850);
                class211.method1417(true, class42.field850);
                class62.field1286 = 45;
            } else {
                if (var34 != 0) {
                    class112.field2044 = class233.method1528(new class257[] { class44.field1035, class111.method808(arg0 ^ 0x62, var34), class200.field3415 }, 0);
                }
                class236.field4046 = 20;
            }
        } else if (class62.field1286 == 45) {
            class12.method127(2, class2.field45, (byte) -48, 22050);
            class136.field2436 = new class2();
            class136.field2436.method44(18444, 128, 9);
            class182.field3175 = class105.method762(-1, class156.field2728, 22050, class72.field1404, 0);
            class182.field3175.method622(false, class136.field2436);
            class143.method973(class76.field1490, class180.field3137, (byte) -116, class78.field1505, class136.field2436);
            class79.field1543 = class105.method762(-1, class156.field2728, 2048, class72.field1404, 1);
            class78.field1504 = new class61();
            class79.field1543.method622(false, class78.field1504);
            class57.field1211 = new class148(22050, class134.field2399);
            class164.field2870 = class259.field4502.method1211(class185.field3221, (byte) -69);
            class62.field1286 = 50;
            class112.field2044 = class69.field1377;
            class236.field4046 = 30;
        } else if (class62.field1286 == 50) {
            int var35 = class92.method681((byte) 7, class42.field850, class115.field2072);
            int var36 = class95.method696(16663);
            if (var35 < var36) {
                class112.field2044 = class233.method1528(new class257[] { class72.field1415, class111.method808(10, var35 * 100 / var36), class200.field3415 }, 0);
                class236.field4046 = 35;
            } else {
                class62.field1286 = 60;
                class112.field2044 = class20.field426;
                class236.field4046 = 35;
            }
        } else if (class62.field1286 == 60) {
            int var37 = class25.method225(arg0 ^ 0xFFFFFF97, class42.field850);
            int var38 = class138.method949(arg0 ^ 0xFFFFFFF4);
            if (var37 < var38) {
                class112.field2044 = class233.method1528(new class257[] { class140.field2495, class111.method808(10, var37 * 100 / var38), class200.field3415 }, 0);
                class236.field4046 = 40;
            } else {
                class236.field4046 = 40;
                class112.field2044 = class54.field1164;
                class62.field1286 = 65;
            }
        } else if (class62.field1286 == 65) {
            class135.method937(class42.field850, class115.field2072, false);
            class112.field2044 = class243.field4203;
            class236.field4046 = 45;
            class209.method1404((byte) -38, 5);
            class62.field1286 = 70;
        } else {
            if (arg0 != 104) {
                this.method580((byte) 76);
            }
            if (class62.field1286 == 70) {
                class18.field394.method1227(0);
                byte var39 = 0;
                int var40 = var39 + class18.field394.method1201(23445);
                class33.field635.method1227(0);
                int var41 = var40 + class33.field635.method1201(23445);
                class167.field2905.method1227(arg0 - 104);
                int var42 = var41 + class167.field2905.method1201(23445);
                class238.field4062.method1227(arg0 - 104);
                int var43 = var42 + class238.field4062.method1201(arg0 + 23341);
                class169.field2914.method1227(0);
                int var44 = var43 + class169.field2914.method1201(arg0 ^ 0x5BFD);
                class54.field1159.method1227(arg0 - 104);
                int var45 = var44 + class54.field1159.method1201(23445);
                class52.field1133.method1227(0);
                int var46 = var45 + class52.field1133.method1201(arg0 ^ 0x5BFD);
                class34.field660.method1227(0);
                int var47 = var46 + class34.field660.method1201(23445);
                class45.field1040.method1227(0);
                int var48 = var47 + class45.field1040.method1201(23445);
                class25.field476.method1227(0);
                int var49 = var48 + class25.field476.method1201(23445);
                if (var49 < 1000) {
                    class112.field2044 = class233.method1528(new class257[] { class221.field3747, class111.method808(10, var49 / 10), class200.field3415 }, arg0 - 104);
                    class236.field4046 = 50;
                } else {
                    class248.method1624((byte) -89, class18.field394);
                    class91.method678(class18.field394, -90);
                    class241.method1582(-112, class18.field394);
                    class149.method1004(false, class175.field2991, class18.field394);
                    class37.method303(class68.field1363, class33.field635, (byte) 107, class175.field2991);
                    class188.method1270(120, class238.field4062, class175.field2991);
                    class201.method1352((byte) -48, class175.field2991, class92.field1748, class169.field2914, class68.field1363);
                    class208.method1399(26, class18.field394);
                    class21.method180(class54.field1159, class135.field2411, class152.field2655, arg0 + 6715);
                    class151.method1017((byte) 102, class175.field2991, class52.field1133);
                    class24.method210(arg0 - 105, class34.field660);
                    class189.method1273(class18.field394, 121);
                    class120.method844(class115.field2072, class46.field1060, class42.field850, class175.field2991, arg0 - 104);
                    class221.method1459(arg0 ^ 0xFFFFFFE2, class18.field394);
                    class37.method299(class167.field2905, -1527);
                    class246.method1615(new class10(), (byte) 76, class25.field476, class45.field1040);
                    class169.method1158(false, class25.field476, class45.field1040);
                    class112.field2044 = class258.field4484;
                    class236.field4046 = 50;
                    class62.method466((byte) 90);
                    class62.field1286 = 80;
                }
            } else if (class62.field1286 == 80) {
                int var50 = class128.method889(0, class42.field850);
                int var51 = class39.method314(arg0 - 88);
                if (var51 > var50) {
                    class112.field2044 = class233.method1528(new class257[] { class198.field3355, class111.method808(10, var50 * 100 / var51), class200.field3415 }, arg0 ^ 0x68);
                    class236.field4046 = 60;
                } else {
                    class132.method916(class42.field850, (byte) -73);
                    class112.field2044 = class220.field3732;
                    class236.field4046 = 60;
                    class62.field1286 = 90;
                }
            } else if (class62.field1286 == 90) {
                if (class152.field2685.method1227(arg0 - 104)) {
                    class5 var52 = new class5(class121.field2179, class152.field2685, class42.field850, 20, !class2.field62);
                    class101.method731(var52);
                    if (class30.field566 == 1) {
                        class101.method729(0.9F);
                    }
                    if (class30.field566 == 2) {
                        class101.method729(0.8F);
                    }
                    if (class30.field566 == 3) {
                        class101.method729(0.7F);
                    }
                    if (class30.field566 == 4) {
                        class101.method729(0.6F);
                    }
                    class62.field1286 = 100;
                    class112.field2044 = class146.field2557;
                    class236.field4046 = 70;
                } else {
                    class112.field2044 = class233.method1528(new class257[] { class91.field1741, class111.method808(10, class152.field2685.method1201(arg0 ^ 0x5BFD)), class200.field3415 }, 0);
                    class236.field4046 = 70;
                }
            } else if (class62.field1286 == 100) {
                if (class245.method1610(class42.field850, (byte) -114)) {
                    class62.field1286 = 110;
                }
            } else if (class62.field1286 == 110) {
                class252.field4335 = new class186();
                class72.field1404.method710(class252.field4335, (byte) -121, 10);
                class236.field4046 = 75;
                class62.field1286 = 120;
                class112.field2044 = class36.field721;
            } else if (class62.field1286 == 120) {
                if (class56.field1204.method1203(arg0 - 1907, class17.field378, class220.field3725)) {
                    class121 var53 = new class121(class56.field1204.method1213(class17.field378, class220.field3725, 0));
                    class132.method920(var53, false);
                    class236.field4046 = 80;
                    class112.field2044 = class28.field541;
                    class62.field1286 = 130;
                } else {
                    class112.field2044 = class233.method1528(new class257[] { class2.field33, class87.field1693 }, arg0 - 104);
                    class236.field4046 = 80;
                }
            } else if (class62.field1286 == 130) {
                if (!class46.field1060.method1227(0)) {
                    class112.field2044 = class233.method1528(new class257[] { class150.field2587, class111.method808(10, class46.field1060.method1201(23445) * 4 / 5), class200.field3415 }, 0);
                    class236.field4046 = 85;
                } else if (!class27.field528.method1227(0)) {
                    class112.field2044 = class233.method1528(new class257[] { class150.field2587, class111.method808(10, class27.field528.method1201(23445) / 6 + 80), class200.field3415 }, 0);
                    class236.field4046 = 85;
                } else if (class115.field2072.method1227(0)) {
                    class236.field4046 = 100;
                    class62.field1286 = 140;
                    class112.field2044 = class34.field669;
                } else {
                    class112.field2044 = class233.method1528(new class257[] { class150.field2587, class111.method808(10, class115.field2072.method1201(arg0 ^ 0x5BFD) / 20 + 96), class200.field3415 }, arg0 ^ 0x68);
                    class236.field4046 = 85;
                }
            } else if (class62.field1286 == 140) {
                class96.field1813 = class46.field1060.method1211(class128.field2293, (byte) -94);
                class128.field2279.method1214(false, 68, true);
                class259.field4502.method1214(true, 122, true);
                class42.field850.method1214(true, arg0 - 164, true);
                class115.field2072.method1214(true, -121, true);
                class56.field1204.method1214(true, 109, true);
                class46.field1060.method1214(true, -113, true);
                class149.field2581 = true;
                class209.method1404((byte) -38, 8);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method588(byte arg0) {
        field1538++;
        if (arg0 != -121) {
            field1531 = 7;
        }
        if (class96.field1810 >= 4) {
            this.method1363("js5crc", 95);
            class217.field3675 = 1000;
            return;
        }
        if (class94.field1778 >= 4) {
            if (class217.field3675 <= 5) {
                this.method1363("js5io", arg0 + 227);
                class217.field3675 = 1000;
                return;
            }
            class138.field2475 = 3000;
            class94.field1778 = 3;
        }
        if (class138.field2475-- > 0) {
            return;
        }
        try {
            if (class148.field2567 == 0) {
                class9.field180 = class72.field1404.method718(class238.field4065, class151.field2608, (byte) -124);
                class148.field2567++;
            }
            if (class148.field2567 == 1) {
                if (class9.field180.field3000 == 2) {
                    this.method592(-1, 1);
                    return;
                }
                if (class9.field180.field3000 == 1) {
                    class148.field2567++;
                }
            }
            if (class148.field2567 == 2) {
                class58.field1231 = new class211((Socket) class9.field180.field3001, class72.field1404);
                class152 var2 = new class152(5);
                var2.method1023(arg0 ^ 0xFFFFCC0C, 15);
                var2.method1066(-1687589720, 503);
                class58.field1231.method1419(5, 0, var2.field2638, 122);
                class148.field2567++;
                class69.field1373 = class80.method600(arg0 + 80);
            }
            if (class148.field2567 == 3) {
                if (class217.field3675 <= 5 || class58.field1231.method1423((byte) 104) > 0) {
                    int var3 = class58.field1231.method1425(0);
                    if (var3 != 0) {
                        this.method592(var3, arg0 ^ 0xFFFFFF86);
                        return;
                    }
                    class148.field2567++;
                } else if ((class80.method600(arg0 + 58) - class69.field1373) > 30000L) {
                    this.method592(-2, 1);
                    return;
                }
            }
            if (class148.field2567 == 4) {
                class212.method1429(class217.field3675 > 20, 0, class58.field1231);
                class148.field2567 = 0;
                class1.field4 = 0;
                class58.field1231 = null;
                class9.field180 = null;
            }
        } catch (IOException var4) {
            this.method592(-3, 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method589(byte arg0) {
        method577(false);
        field1528++;
        class257.method1711(-2440);
        class203.method1364((byte) 89);
        class20.method179(126);
        class116.method828(-78);
        class186.method1262(-1);
        class12.method130((byte) -119);
        class152.method1028(112);
        class211.method1420(121);
        class226.method1476(-1);
        class128.method888((byte) -72);
        class229.method1495(0);
        class197.method1319(2);
        class131.method913((byte) -127);
        class33.method281((byte) 81);
        class238.method1560(-128);
        class44.method341(-96);
        class180.method1238((byte) -121);
        class56.method433(0);
        class189.method1275(98);
        class185.method1259(23065);
        class210.method1411(-30);
        class184.method1258((byte) -118);
        class2.method11(112);
        class83.method626(-22972);
        class244.method1604((byte) -115);
        class31.method267(false);
        class241.method1583(1000);
        class177.method1193((byte) -1);
        class34.method289((byte) 55);
        class198.method1321(-8329);
        class157.method1097(false);
        class30.method248(-1);
        class126.method874((byte) -74);
        class252.method1648((byte) 94);
        class117.method834(127);
        class92.method679(127);
        class196.method1314(0);
        if (arg0 <= 90) {
            field1524 = null;
        }
        class144.method976(false);
        class201.method1349((byte) 64);
        class123.method856((byte) -43);
        class213.method1434(256);
        class233.method1530(true);
        class216.method1438(1);
        class54.method413((byte) 98);
        class178.method1221(101);
        class67.method496();
        class187.method1267((byte) 49);
        class14.method152((byte) -105);
        class232.method1514();
        class111.method807(122);
        class17.method167(16873);
        class80.method602(false);
        class96.method699((byte) 98);
        class231.method1508(1);
        class221.method1462(-14742);
        class191.method1294((byte) 41);
        class85.method641(108);
        class246.method1613(false);
        class90.method669(0);
        class107.method791();
        class59.method443((byte) -119);
        class154.method1080(29990);
        class217.method1440((byte) 49);
        class166.method1132(-113);
        class8.method109(3963);
        class7.method106(22);
        class115.method821(1476);
        class39.method323(-128);
        class58.method442(14169);
        class122.method855();
        class114.method817(-96241763);
        class82.method618(1);
        class146.method988(24693);
        class5.method95((byte) 80);
        class101.method737();
        class23.method191();
        class50.method392(false);
        class205.method1375(true);
        class143.method972(0);
        class138.method950(false);
        class182.method1244((byte) -85);
        class132.method917((byte) -70);
        class13.method134(-125);
        class51.method397();
        class11.method125((byte) -50);
        class169.method1160((byte) -97);
        class167.method1135(-6162);
        class137.method944(-4948);
        class102.method746(7778);
        class142.method964();
        class124.method863((byte) 127);
        class253.method1651(-1);
        class139.method951((byte) -117);
        class94.method687(-3571);
        class125.method871(-21786);
        class64.method474(128);
        class38.method305(13822);
        class78.method568((byte) 42);
        class173.method1179((byte) -121);
        class69.method526(-1);
        class219.method1446(-1);
        class161.method1120(-113);
        class21.method182(10924);
        class73.method546(0);
        class81.method606(8895);
        class206.method1384((byte) -119);
        class10.method118(true);
        class159.method1113(122);
        class121.method854(60);
        class79.method598(76);
        class207.method1396((byte) 86);
        class225.method1473(true);
        class259.method1728((byte) 111);
        class164.method1126(false);
        class188.method1269(true);
        class71.method535(false);
        class204.method1371(255);
        class37.method302(-31833);
        class202.method1359(111);
        class260.method1733(1);
        class103.method750(128);
        class72.method540((byte) -104);
        class19.method171(true);
        class3.method46((byte) 72);
        class130.method903();
        class106.method765((byte) -26);
        class242.method1589(128);
        class99.method708((byte) 50);
        class40.method328(-24);
        class74.method550((byte) 67);
        class220.method1451(true);
        class1.method1(0);
        class62.method465(true);
        class28.method235(-10110);
        class129.method897(0);
        class171.method1170((byte) -92);
        class93.method684(16777215);
        class236.method1550(false);
        class52.method404((byte) -118);
        class200.method1342((byte) 110);
        class75.method553(6116423);
        class175.method1186((byte) 109);
        class250.method1633(45);
        class212.method1428((byte) 23);
        class25.method224((byte) 86);
        class163.method1125();
        class97.method704();
        class84.method637();
        class104.method756(13);
        class224.method1470(-102);
        class9.method113(21615);
        class49.method386();
        class119.method842(9806);
        class136.method940((byte) 99);
        class195.method1311(-1);
        class108.method796(-70);
        class47.method364();
        class60.method451();
        class105.method758(-176778750);
        class76.method561(-1);
        class158.method1103((byte) -115);
        class181.method1241(6691);
        class55.method417(-43);
        class87.method650(true);
        class174.method1184((byte) -107);
        class36.method297((byte) 86);
        class43.method336(true);
        class133.method924((byte) 108);
        class179.method1231(-29652);
        class248.method1622((byte) 88);
        class194.method1304(53);
        class160.method1114((byte) -50);
        class45.method353((byte) 107);
        class258.method1723(4096);
        class95.method695((byte) -75);
        class18.method170(0);
        class255.method1661(-5468);
        class24.method219(10);
        class27.method233(-124);
        class32.method274((byte) -122);
        class237.method1551(-290020116);
        class170.method1167(11287);
        class70.method533(82);
        class91.method677(94);
        class162.method1123(65535);
        class145.method981((byte) 126);
        class135.method935((byte) 111);
        class150.method1011(6313);
        class215.method1435(-5182);
        class172.method1175((byte) -67);
        class245.method1612((byte) -98);
        class208.method1401((byte) 104);
        class120.method847(false);
        class68.method521(1);
        class228.method1487(11566);
        class165.method1128(78);
        class35.method293((byte) 127);
        class249.method1628(104);
        class256.method1664((byte) 44);
        class26.method226(-24539);
        class151.method1015(10474);
        class251.method1646((byte) 76);
        class230.method1498(-122);
        class53.method411(-32421);
        class156.method1094((byte) -125);
        class193.method1303(-5652);
        class140.method953((byte) 121);
        class41.method330(true);
        class222.method1465(-125);
        class112.method812((byte) -65);
        class42.method333(16926);
        class118.method840(-12491);
        class227.method1484((byte) 77);
        class209.method1402(-23605);
        class199.method1335((byte) -54);
        class89.method665(1);
        class57.method440((byte) -113);
        class239.method1576((byte) 79);
        class183.method1251(-128);
        class243.method1594(200);
        class46.method359(-72);
        class29.method245(10828);
        if (class203.field3498) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lme;)I")
    public static final int method590(class44 arg0) {
        class220 var1 = (class220) class137.field2448.method434((byte) -93, ((long) arg0.field935 << 32) + (long) arg0.field890);
        return var1 == null ? arg0.field889 : var1.field3726;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)I")
    public static final int method591(int arg0, byte arg1) {
        field1539++;
        if (arg1 >= -121) {
            field1534 = null;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method592(int arg0, int arg1) {
        class148.field2567 = 0;
        field1533++;
        if (class211.field3612 == class151.field2608) {
            class151.field2608 = class115.field2074;
        } else {
            class151.field2608 = class211.field3612;
        }
        class1.field4++;
        class58.field1231 = null;
        if (arg1 != 1) {
            method586(-17, -34);
        }
        class9.field180 = null;
        if (class1.field4 >= 2 && arg0 == 7 || arg0 == 9) {
            if (class217.field3675 > 5) {
                class138.field2475 = 3000;
            } else {
                this.method1363("js5connect_full", 99);
                class217.field3675 = 1000;
            }
        } else if (class1.field4 >= 2 && arg0 == 6) {
            this.method1363("js5connect_outofdate", arg1 ^ 0xFFFFFF92);
            class217.field3675 = 1000;
        } else if (class1.field4 >= 4) {
            if (class217.field3675 <= 5) {
                this.method1363("js5connect", -52);
                class217.field3675 = 1000;
            } else {
                class138.field2475 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method593(boolean arg0) {
        field1521++;
        class250.method1636(class72.field1404, class170.field2932, -28525);
        class117.field2096 = class128.field2300 = class145.field2538 = class151.field2614 = new short[256];
        if (class87.field1675 == 1) {
            class180.field3105 = class43.field858;
            class17.field361 = class32.field625;
            class206.field3529 = class27.field530;
            class144.field2526 = class156.field2740;
        } else {
            class206.field3529 = class180.field3118;
            class17.field361 = class56.field1191;
            class144.field2526 = class118.field2121;
            class180.field3105 = class238.field4077;
        }
        class211.field3612 = class165.field2879 == 0 ? 43594 : class151.field2598 + 40000;
        class115.field2074 = class165.field2879 == 0 ? 443 : class151.field2598 + 50000;
        class151.field2608 = class211.field3612;
        class208.method1400((byte) -44);
        class149.method1008(62, class156.field2728);
        class134.method927(class156.field2728, -67);
        if (arg0) {
            field1526 = null;
        }
        class114.field2059 = class108.method798(0);
        if (class114.field2059 != null) {
            class114.field2059.method105(class156.field2728, -103);
        }
        class144.field2528 = class100.field1843;
        try {
            if (class72.field1404.field1854 != null) {
                class172.field2947 = new class128(class72.field1404.field1854, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class184.field3200[var2] = new class128(class72.field1404.field1848[var2], 6000, 0);
                }
                class189.field3256 = new class128(class72.field1404.field1838, 6000, 0);
                class30.field578 = new class229(255, class172.field2947, class189.field3256, 500000);
                class103.field1910 = new class128(class72.field1404.field1852, 24, 0);
                class72.field1404.field1854 = null;
                class72.field1404.field1848 = null;
                class72.field1404.field1852 = null;
                class72.field1404.field1838 = null;
            }
        } catch (IOException var3) {
            class30.field578 = null;
            class172.field2947 = null;
            class189.field3256 = null;
            class103.field1910 = null;
        }
        class39.field794 = class56.field1187;
        if (class165.field2879 != 0) {
            class171.field2937 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    private final void method594(int arg0) {
        boolean var2 = class194.method1307(118);
        if (!var2) {
            this.method588((byte) -121);
        }
        field1523++;
        if (arg0 != -1) {
            field1536 = null;
        }
    }
}
