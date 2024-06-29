import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class219 {

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "Lmo;")
    private class336 field3177 = new class336(16);

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "Lnl;")
    private class435 field3166;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "[I")
    public static int[] field3168 = new int[1000];

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field3169 = 52;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "[I")
    public static int[] field3178;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3175;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "[Lrn;")
    public static class417[] field3176;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V")
    public final void method1507(int arg0, boolean arg1) {
        if (!arg1) {
            field3168 = null;
        }
        class336 var3 = this.field3177;
        synchronized (this.field3177) {
            this.field3177.method2120((byte) 106, arg0);
        }
        field3165++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
    public static void method1508(boolean arg0) {
        field3168 = null;
        field3178 = null;
        if (arg0) {
            method1514(-51);
        }
        field3176 = null;
        field3175 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)V")
    public static final void method1509(boolean arg0, int arg1) {
        field3172++;
        class153.method1088((byte) 122);
        int var2 = class31.field332.method2460((byte) 0, arg1).field4502;
        if (var2 == 0) {
            return;
        }
        if (arg0) {
            method1511((byte) -97);
        }
        int var3 = class416.field5691.field3652[arg1];
        if (var2 == 6) {
            class334.field4641 = var3;
        }
        if (var2 == 5) {
            class398.field5463 = var3;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public final void method1510(byte arg0) {
        if (arg0 >= -117) {
            return;
        }
        field3174++;
        class336 var2 = this.field3177;
        synchronized (this.field3177) {
            this.field3177.method2119(0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)I")
    public static final int method1511(byte arg0) {
        field3171++;
        if (arg0 != 70) {
            method1508(true);
        }
        return 2;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)Las;")
    public final class373 method1512(int arg0, byte arg1) {
        field3173++;
        class336 var3 = this.field3177;
        class373 var4;
        synchronized (this.field3177) {
            var4 = (class373) this.field3177.method2113(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != -73) {
            field3179 = 54;
        }
        byte[] var5 = this.field3166.method2633(30, arg0, 120);
        class373 var6 = new class373();
        if (var5 != null) {
            var6.method2277(new class161(var5), (byte) 18);
        }
        class336 var7 = this.field3177;
        synchronized (this.field3177) {
            this.field3177.method2116((long) arg0, (byte) -126, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V")
    public final void method1513(byte arg0) {
        if (arg0 != -87) {
            field3168 = null;
        }
        field3167++;
        class336 var2 = this.field3177;
        synchronized (this.field3177) {
            this.field3177.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static final void method1514(int arg0) {
        field3170++;
        if (class164.method1210(false) != 2) {
            return;
        }
        byte var1 = (byte) (class392.field5407 - 4 & 0xFF);
        int var2 = class392.field5407 % class36.field388;
        int var3 = 0;
        if (arg0 != -7186) {
            field3178 = null;
        }
        while (var3 < 4) {
            for (int var16 = 0; var16 < class68.field998; var16++) {
                class486.field6878[var3][var2][var16] = var1;
            }
            var3++;
        }
        if (class387.field5306 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class114.field1601[var4] = -1000000;
            class363.field4999[var4] = 1000000;
            class176.field2670[var4] = 0;
            class173.field2641[var4] = 1000000;
            class239.field3504[var4] = 0;
        }
        if (class390.field5393 != 1) {
            int var15 = class407.method2440(class135.field1884, arg0 ^ 0x5C78, class184.field2784, class387.field5306);
            if (var15 - class303.field4302 >= 800 || (class372.field5120[class387.field5306][class135.field1884 >> 7][class184.field2784 >> 7] & 0x4) == 0) {
                return;
            }
            class12.method63(class385.field5285, class184.field2784 >> 7, class135.field1884 >> 7, -104, false, 1);
            return;
        }
        if ((class372.field5120[class387.field5306][class262.field3781.field4537 >> 7][class262.field3781.field4530 >> 7] & 0x4) != 0) {
            class12.method63(class385.field5285, class262.field3781.field4530 >> 7, class262.field3781.field4537 >> 7, 29, false, 0);
        }
        if (class366.field5028 >= 2560) {
            return;
        }
        int var5 = class135.field1884 >> 7;
        int var6 = class184.field2784 >> 7;
        int var7 = class262.field3781.field4537 >> 7;
        int var8 = class262.field3781.field4530 >> 7;
        int var9;
        if (var5 < var7) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var6 < var8) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        if ((var9 != 0 || var10 != 0) && var9 > -class36.field388 && class36.field388 > var9 && -class68.field998 < var10 && var10 < class68.field998) {
            if (var10 >= var9) {
                int var11 = var9 * 65536 / var10;
                int var12 = 32768;
                while (var6 != var8) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class372.field5120[class387.field5306][var5][var6] & 0x4) != 0) {
                        class12.method63(class385.field5285, var6, var5, arg0 + 7068, false, 1);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var7 > var5) {
                            var5++;
                        } else if (var7 < var5) {
                            var5--;
                        }
                        var12 -= 65536;
                        if ((class372.field5120[class387.field5306][var5][var6] & 0x4) != 0) {
                            class12.method63(class385.field5285, var6, var5, -117, false, 1);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var10 * 65536 / var9;
            int var14 = 32768;
            while (var5 != var7) {
                if (var5 < var7) {
                    var5++;
                } else if (var5 > var7) {
                    var5--;
                }
                if ((class372.field5120[class387.field5306][var5][var6] & 0x4) != 0) {
                    class12.method63(class385.field5285, var6, var5, arg0 ^ 0xFFFFE380, false, 1);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    var14 -= 65536;
                    if ((class372.field5120[class387.field5306][var5][var6] & 0x4) != 0) {
                        class12.method63(class385.field5285, var6, var5, arg0 ^ 0x1C70, false, 1);
                        return;
                    }
                }
            }
            return;
        }
        class83.method704((byte) 94, (Throwable) null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class279.field4012 + "," + class189.field2810);
        return;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Llo;ILnl;)V")
    public class219(class280 arg0, int arg1, class435 arg2) {
        this.field3166 = arg2;
        this.field3166.method2638(1, 30);
    }

    static {
        new class151("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field3178 = new int[13];
        field3179 = -1;
    }
}
