import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class35 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lke;")
    public static class65 field881 = class1.method17(" zuerst von Ihrer Ignorieren)2Liste(Q", -114);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field880 = 0;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "[J")
    public static long[] field885 = new long[100];

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field890 = -1;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "[I")
    public static int[] field888 = new int[128];

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Lke;")
    private static class65 field892 = class1.method17("Enter message to send to ", -114);

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Lke;")
    public static class65 field883 = field892;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Lpa;")
    public static class90 field887;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
    public static int[] field886;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "[I")
    public static int[] field891;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 17)
    public static void method262(int arg0) {
        field885 = null;
        field881 = null;
        field883 = null;
        if (arg0 != 16711935) {
            return;
        }
        field887 = null;
        field892 = null;
        field891 = null;
        field886 = null;
        field888 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V", line = 55)
    public static final void method263(int arg0, int arg1) {
        field889++;
        if (!class81.method707((byte) 94) || arg1 != 1) {
            return;
        }
        if (class64.field1683) {
            class27.field664 = arg0;
        } else {
            class31.method248(arg0, -1909);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)Z", line = 75)
    public static final boolean method264(byte arg0) {
        field882++;
        if (arg0 != -108) {
            method262(124);
        }
        long var1 = System.currentTimeMillis();
        int var3 = (int) (var1 - class54.field1390);
        class54.field1390 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class117.field2926 += var3;
        if (class90.field2394 == 0 && class88.field2359 == 0 && class91.field2408 == 0 && class125.field3053 == 0) {
            return true;
        } else if (class112.field2773 == null) {
            return false;
        } else {
            try {
                if (class117.field2926 > 30000) {
                    throw new IOException();
                }
                while (class88.field2359 < 20 && class125.field3053 > 0) {
                    class110 var4 = (class110) class88.field2344.method856(true);
                    class39 var5 = new class39(4);
                    var5.method305(false, 1);
                    var5.method299((int) var4.field349, 29520);
                    class112.field2773.method82(4, -114, 0, var5.field994);
                    class91.field2420.method854(var4.field349, false, var4);
                    class88.field2359++;
                    class125.field3053--;
                }
                while (class90.field2394 < 20 && class91.field2408 > 0) {
                    class110 var6 = (class110) class123.field2990.method389((byte) 36);
                    class39 var7 = new class39(4);
                    var7.method305(false, 0);
                    var7.method299((int) var6.field349, arg0 + 29628);
                    class112.field2773.method82(4, arg0 - 16, 0, var7.field994);
                    var6.method817((byte) -106);
                    class116.field2917.method854(var6.field349, false, var6);
                    class91.field2408--;
                    class90.field2394++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class112.field2773.method81(-22925);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class117.field2926 = 0;
                    byte var10 = 0;
                    if (class114.field2839 == null) {
                        var10 = 8;
                    } else if (class21.field504 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class5.field98.field994.length - class114.field2839.field2714;
                        int var12 = 512 - class21.field504;
                        if (var12 > var11 - class5.field98.field998) {
                            var12 = var11 - class5.field98.field998;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class112.field2773.method83(class5.field98.field994, var12, -15520, class5.field98.field998);
                        if (class5.field95 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class5.field98.field994[class5.field98.field998 + var13] = (byte) class117.method950(class5.field98.field994[class5.field98.field998 + var13], class5.field95);
                            }
                        }
                        class21.field504 += var12;
                        class5.field98.field998 += var12;
                        if (class5.field98.field998 == var11) {
                            if (class114.field2839.field349 == 16711935L) {
                                class89.field2366 = class5.field98;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class112 var15 = class9.field165[var14];
                                    if (var15 != null) {
                                        class89.field2366.field998 = var14 * 4 + 5;
                                        int var16 = class89.field2366.method329(144752608);
                                        var15.method914(var16, arg0 ^ 0x19);
                                    }
                                }
                            } else {
                                class75.field2010.reset();
                                class75.field2010.update(class5.field98.field994, 0, var11);
                                int var17 = (int) class75.field2010.getValue();
                                if (class114.field2839.field2718 != var17) {
                                    try {
                                        class112.field2773.method73(70);
                                    } catch (Exception var29) {
                                    }
                                    class5.field95 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class53.field1361++;
                                    class112.field2773 = null;
                                    return false;
                                }
                                class57.field1523 = 0;
                                class53.field1361 = 0;
                                class114.field2839.field2715.method916(class5.field98.field994, (int) (class114.field2839.field349 & 0xFFFFL), 120, class102.field2654, (class114.field2839.field349 & 0xFF0000L) == 16711680L);
                            }
                            class114.field2839.method133(arg0 ^ 0xFFFFFF96);
                            class21.field504 = 0;
                            class5.field98 = null;
                            class114.field2839 = null;
                            if (class102.field2654) {
                                class88.field2359--;
                            } else {
                                class90.field2394--;
                            }
                        } else {
                            if (class21.field504 != 512) {
                                break;
                            }
                            class21.field504 = 0;
                        }
                    } else {
                        int var18 = var10 - class65.field1744.field998;
                        if (var9 < var18) {
                            var18 = var9;
                        }
                        class112.field2773.method83(class65.field1744.field994, var18, -15520, class65.field1744.field998);
                        if (class5.field95 != 0) {
                            for (int var19 = 0; var19 < var18; var19++) {
                                class65.field1744.field994[class65.field1744.field998 + var19] = (byte) class117.method950(class65.field1744.field994[class65.field1744.field998 + var19], class5.field95);
                            }
                        }
                        class65.field1744.field998 += var18;
                        if (class65.field1744.field998 < var10) {
                            break;
                        }
                        if (class114.field2839 == null) {
                            class65.field1744.field998 = 0;
                            int var20 = class65.field1744.method334(arg0 ^ 0xFFFFFFF3);
                            int var21 = class65.field1744.method326(255);
                            int var22 = class65.field1744.method334(arg0 + 209);
                            int var23 = class65.field1744.method329(144752608);
                            long var24 = (long) ((var20 << 16) + var21);
                            class110 var26 = (class110) class91.field2420.method861(var24, 30);
                            class102.field2654 = true;
                            if (var26 == null) {
                                var26 = (class110) class116.field2917.method861(var24, 24);
                                class102.field2654 = false;
                            }
                            if (var26 == null) {
                                throw new IOException();
                            }
                            class114.field2839 = var26;
                            int var27 = var22 == 0 ? 5 : 9;
                            class5.field98 = new class39(class114.field2839.field2714 + var23 + var27);
                            class5.field98.method305(false, var22);
                            class5.field98.method351(var23, 58);
                            class21.field504 = 8;
                            class65.field1744.field998 = 0;
                        } else if (class21.field504 == 0) {
                            if (class65.field1744.field994[0] == -1) {
                                class21.field504 = 1;
                                class65.field1744.field998 = 0;
                            } else {
                                class114.field2839 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var30) {
                try {
                    class112.field2773.method73(116);
                } catch (Exception var28) {
                }
                class112.field2773 = null;
                class57.field1523++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 373)
    public static final void method265(int arg0) {
        field884++;
        if (class87.field2318 > 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class87.field2318 > 768) {
                    class99.field2587[var3] = class75.method669(1024 - class87.field2318, (byte) -24, class5.field91[var3], class41.field1121[var3]);
                } else if (class87.field2318 > 256) {
                    class99.field2587[var3] = class5.field91[var3];
                } else {
                    class99.field2587[var3] = class75.method669(256 - class87.field2318, (byte) 48, class41.field1121[var3], class5.field91[var3]);
                }
            }
        } else if (class112.field2774 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class112.field2774 > 768) {
                    class99.field2587[var1] = class75.method669(1024 - class112.field2774, (byte) -115, class129.field3125[var1], class41.field1121[var1]);
                } else if (class112.field2774 <= 256) {
                    class99.field2587[var1] = class75.method669(256 - class112.field2774, (byte) 80, class41.field1121[var1], class129.field3125[var1]);
                } else {
                    class99.field2587[var1] = class129.field3125[var1];
                }
            }
        } else {
            for (int var2 = 0; var2 < 256; var2++) {
                class99.field2587[var2] = class41.field1121[var2];
            }
        }
        for (int var4 = 0; var4 < 33920; var4++) {
            class41.field1124.field2385[var4] = class87.field2309.field1623[var4];
        }
        short var5 = 256;
        int var6 = 1 / ((arg0 - 12) / 36);
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var5 - 1; var9++) {
            int var23 = (var5 - var9) * class86.field2294[var9] / var5;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; var25++) {
                int var26 = class83.field2182[var7++];
                if (var26 == 0) {
                    var8++;
                } else {
                    int var28 = 256 - var26;
                    int var29 = class99.field2587[var26];
                    int var30 = class41.field1124.field2385[var8];
                    class41.field1124.field2385[var8++] = class114.method934(16711680, class114.method934(65280, var29) * var26 + var28 * class114.method934(var30, 65280)) + class114.method934(var28 * class114.method934(16711935, var30) + var26 * class114.method934(var29, 16711935), -16711936) >> 8;
                }
            }
            var8 += var24;
        }
        int var10 = 1176;
        int var11 = 0;
        for (int var12 = 0; var12 < 33920; var12++) {
            class54.field1372.field2385[var12] = class29.field782.field1623[var12];
        }
        for (int var13 = 1; var13 < var5 - 1; var13++) {
            int var14 = (var5 - var13) * class86.field2294[var13] / var5;
            int var15 = var10 + var14;
            int var16 = 103 - var14;
            for (int var17 = 0; var17 < var16; var17++) {
                int var18 = class83.field2182[var11++];
                if (var18 == 0) {
                    var15++;
                } else {
                    int var20 = 256 - var18;
                    int var21 = class99.field2587[var18];
                    int var22 = class54.field1372.field2385[var15];
                    class54.field1372.field2385[var15++] = class114.method934(16711680, var18 * class114.method934(var21, 65280) + var20 * class114.method934(var22, 65280)) + class114.method934(var20 * class114.method934(var22, 16711935) + var18 * class114.method934(16711935, var21), -16711936) >> 8;
                }
            }
            var11 += 128 - var16;
            var10 = var15 + 128 - var16 - var14;
        }
    }
}
