import java.awt.FontMetrics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public int field682 = 0;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public int field697 = 0;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Lsc;")
    public static class128 field691 = class129.method1017(false, "lila:");

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lsc;")
    public static class128 field687 = class129.method1017(false, "hitmarks");

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Z")
    public static boolean field681 = false;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field685 = 0;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field703 = 0;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "Lsc;")
    public static class128 field706 = class129.method1017(false, "Fallen lassen");

    @OriginalMember(owner = "client!f", name = "B", descriptor = "Lsc;")
    private static class128 field707 = class129.method1017(false, "Could not complete login)3");

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Lsc;")
    public static class128 field696 = field707;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lwc;")
    public class156 field689;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "Lwc;")
    public class156 field705;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Lhe;")
    public static class54 field699;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lie;")
    public static class61 field692;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Lae;")
    public static class6 field701;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field684;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "[I")
    public static int[] field698;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "[[I")
    public static int[][] field702;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)Z")
    public static final boolean method259(byte arg0) {
        field680++;
        long var1 = class68.method516(false);
        int var3 = (int) (var1 - class87.field1990);
        class87.field1990 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class34.field641 += var3;
        if (class127.field2877 == 0 && class99.field2297 == 0 && class117.field2642 == 0 && class20.field375 == 0) {
            return true;
        } else if (class92.field2083 == null) {
            return false;
        } else {
            try {
                if (class34.field641 > 30000) {
                    throw new IOException();
                }
                while (class99.field2297 < 20 && class20.field375 > 0) {
                    class44 var4 = (class44) class31.field613.method970(true);
                    class86 var5 = new class86(4);
                    var5.method653(1, arg0 ^ 0x73);
                    var5.method626((int) var4.field365, (byte) -126);
                    class92.field2083.method496(true, var5.field1920, 4, 0);
                    class93.field2124.method964(false, var4, var4.field365);
                    class99.field2297++;
                    class20.field375--;
                }
                while (class127.field2877 < 20 && class117.field2642 > 0) {
                    class44 var6 = (class44) class42.field773.method563(-115);
                    class86 var7 = new class86(4);
                    var7.method653(0, arg0 - 115);
                    var7.method626((int) var6.field365, (byte) -121);
                    class92.field2083.method496(true, var7.field1920, 4, 0);
                    var6.method339(97);
                    class99.field2280.method964(false, var6, var6.field365);
                    class127.field2877++;
                    class117.field2642--;
                }
                int var8 = 0;
                if (arg0 != 115) {
                    return true;
                }
                while (var8 < 100) {
                    int var9 = class92.field2083.method501((byte) 10);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class34.field641 = 0;
                    byte var10 = 0;
                    if (class93.field2145 == null) {
                        var10 = 8;
                    } else if (class124.field2807 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class90.field2055.field1920.length - class93.field2145.field827;
                        int var12 = 512 - class124.field2807;
                        if (var11 - class90.field2055.field1924 < var12) {
                            var12 = var11 - class90.field2055.field1924;
                        }
                        if (var9 < var12) {
                            var12 = var9;
                        }
                        class92.field2083.method500(class90.field2055.field1924, var12, class90.field2055.field1920, false);
                        if (class14.field283 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class90.field2055.field1920[class90.field2055.field1924 + var13] = (byte) class29.method238(class90.field2055.field1920[class90.field2055.field1924 + var13], class14.field283);
                            }
                        }
                        class124.field2807 += var12;
                        class90.field2055.field1924 += var12;
                        if (class90.field2055.field1924 == var11) {
                            if (class93.field2145.field365 == 16711935L) {
                                class122.field2784 = class90.field2055;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class6 var15 = class62.field1333[var14];
                                    if (var15 != null) {
                                        class122.field2784.field1924 = var14 * 8 + 5;
                                        int var16 = class122.field2784.method666(1183700424);
                                        int var17 = class122.field2784.method666(1183700424);
                                        var15.method18(var16, var17, arg0 + 25636);
                                    }
                                }
                            } else {
                                class124.field2808.reset();
                                class124.field2808.update(class90.field2055.field1920, 0, var11);
                                int var18 = (int) class124.field2808.getValue();
                                if (class93.field2145.field830 != var18) {
                                    try {
                                        class92.field2083.method502((byte) -1);
                                    } catch (Exception var30) {
                                    }
                                    class92.field2083 = null;
                                    class97.field2256++;
                                    class14.field283 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class97.field2256 = 0;
                                class27.field525 = 0;
                                class93.field2145.field825.method22((int) (class93.field2145.field365 & 0xFFFFL), (class93.field2145.field365 & 0xFF0000L) == 16711680L, class23.field469, class90.field2055.field1920, (byte) -77);
                            }
                            class93.field2145.method172(-2658);
                            if (class23.field469) {
                                class99.field2297--;
                            } else {
                                class127.field2877--;
                            }
                            class124.field2807 = 0;
                            class93.field2145 = null;
                            class90.field2055 = null;
                        } else {
                            if (class124.field2807 != 512) {
                                break;
                            }
                            class124.field2807 = 0;
                        }
                    } else {
                        int var19 = var10 - class69.field1562.field1924;
                        if (var9 < var19) {
                            var19 = var9;
                        }
                        class92.field2083.method500(class69.field1562.field1924, var19, class69.field1562.field1920, false);
                        if (class14.field283 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class69.field1562.field1920[class69.field1562.field1924 + var20] = (byte) class29.method238(class69.field1562.field1920[class69.field1562.field1924 + var20], class14.field283);
                            }
                        }
                        class69.field1562.field1924 += var19;
                        if (var10 > class69.field1562.field1924) {
                            break;
                        }
                        if (class93.field2145 == null) {
                            class69.field1562.field1924 = 0;
                            int var21 = class69.field1562.method646(arg0 - 15562);
                            int var22 = class69.field1562.method632((byte) -80);
                            long var23 = (long) ((var21 << 16) + var22);
                            int var25 = class69.field1562.method646(arg0 ^ 0xFFFFC3DA);
                            int var26 = class69.field1562.method666(arg0 ^ 0x468DD5BB);
                            class44 var27 = (class44) class93.field2124.method969(var23, arg0 ^ 0xFFFFFFC7);
                            class23.field469 = true;
                            if (var27 == null) {
                                var27 = (class44) class99.field2280.method969(var23, arg0 ^ 0xFFFFFFEB);
                                class23.field469 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class93.field2145 = var27;
                            int var28 = var25 == 0 ? 5 : 9;
                            class90.field2055 = new class86(var26 + var28 + class93.field2145.field827);
                            class90.field2055.method653(var25, 0);
                            class90.field2055.method649(-75, var26);
                            class69.field1562.field1924 = 0;
                            class124.field2807 = 8;
                        } else if (class124.field2807 == 0) {
                            if (class69.field1562.field1920[0] == -1) {
                                class124.field2807 = 1;
                                class69.field1562.field1924 = 0;
                            } else {
                                class93.field2145 = null;
                            }
                        }
                    }
                    var8++;
                }
                return true;
            } catch (IOException var31) {
                try {
                    class92.field2083.method502((byte) -1);
                } catch (Exception var29) {
                }
                class27.field525++;
                class92.field2083 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Z")
    public static final boolean method260(byte arg0, int arg1) {
        if (arg0 >= -9) {
            return true;
        }
        field688++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)[Li;")
    public static final class56[] method261(byte arg0) {
        field690++;
        class56[] var1 = new class56[class43.field809];
        if (arg0 != -70) {
            field691 = null;
        }
        for (int var2 = 0; var2 < class43.field809; var2++) {
            class56 var3 = var1[var2] = new class56();
            var3.field1236 = class62.field1336;
            var3.field1235 = class121.field2747;
            var3.field1238 = class122.field2777[var2];
            var3.field1240 = field698[var2];
            var3.field1237 = class150.field3443[var2];
            var3.field1234 = class19.field361[var2];
            var3.field1241 = class21.field412;
            var3.field1239 = class37.field721[var2];
        }
        class29.method239(36);
        return var1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public static void method262(boolean arg0) {
        field687 = null;
        field707 = null;
        field698 = null;
        field691 = null;
        field696 = null;
        field701 = null;
        field706 = null;
        field699 = null;
        field692 = null;
        if (!arg0) {
            method260((byte) -39, -65);
        }
        field702 = null;
        field684 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
    public static final void method263(int arg0, byte arg1) {
        if (arg1 != -56) {
            field699 = null;
        }
        if (class27.field530 == 0) {
            class46.field861.method363(false, arg0);
        } else {
            class49.field882 = arg0;
        }
        field694++;
    }
}
