import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 {

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    private int field2610 = 65000;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lie;")
    private class61 field2602 = null;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "Lie;")
    private class61 field2622 = null;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    private int field2619;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lic;")
    public static class59 field2604 = class59.method433(0, "null");

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Lic;")
    private static class59 field2607 = class59.method433(0, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field2606 = 0;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lic;")
    public static class59 field2611 = class59.method433(0, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lic;")
    public static class59 field2601 = field2607;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "[Lkd;")
    public static class73[] field2616 = new class73[4];

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Lic;")
    private static class59 field2603 = class59.method433(0, "Hidden");

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "Lic;")
    public static class59 field2617 = field2603;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Ldd;")
    public static class26 field2614;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "[[[I")
    public static int[][][] field2605;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ[B)Z")
    public final boolean method847(int arg0, int arg1, boolean arg2, byte[] arg3) {
        field2621++;
        class61 var5 = this.field2622;
        synchronized (this.field2622) {
            if (arg0 < 0 || arg0 > this.field2610) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method850((byte) 121, arg3, arg2, arg0, arg1);
            if (!var6) {
                var6 = this.method850((byte) 87, arg3, false, arg0, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IJ)V")
    public static final void method848(int arg0, long arg1) {
        try {
            int var3 = -41 / ((-arg0 - 24) / 33);
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        field2620++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[B")
    public final byte[] method849(int arg0, int arg1) {
        field2612++;
        class61 var3 = this.field2622;
        synchronized (this.field2622) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field2602.method505(-21343)) {
                    return null;
                }
                this.field2602.method511(-24756, (long) (arg0 * 6));
                this.field2602.method510(0, 6, -113, class86.field2149);
                int var5 = ((class86.field2149[4] & 0xFF) << 8) + (class86.field2149[3] << 16 & 0xFF0000) + (class86.field2149[5] & 0xFF);
                int var6 = (class86.field2149[2] & 0xFF) + ((class86.field2149[0] & 0xFF) << 16) + ((class86.field2149[1] & 0xFF) << 8);
                if (var6 < 0 || this.field2610 < var6) {
                    return null;
                } else if (var5 > 0 && this.field2622.method505(-21343) / 520L >= (long) var5) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    if (arg1 < 123) {
                        this.method850((byte) -123, null, false, 56, 93);
                    }
                    while (var11 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field2622.method511(-24756, (long) (var5 * 520));
                        int var13 = var6 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2622.method510(0, var13 + 8, -85, class86.field2149);
                        int var14 = ((class86.field2149[0] & 0xFF) << 8) + (class86.field2149[1] & 0xFF);
                        int var15 = ((class86.field2149[2] & 0xFF) << 8) + (class86.field2149[3] & 0xFF);
                        int var16 = (class86.field2149[6] & 0xFF) + ((class86.field2149[5] & 0xFF) << 8) + ((class86.field2149[4] & 0xFF) << 16);
                        int var17 = class86.field2149[7] & 0xFF;
                        if (arg0 == var14 && var10 == var15 && this.field2619 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field2622.method505(-21343) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var11++] = class86.field2149[var20 + 8];
                                }
                                var10++;
                                var5 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[BZII)Z")
    private final boolean method850(byte arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        field2618++;
        class61 var6 = this.field2622;
        synchronized (this.field2622) {
            try {
                int var8;
                if (arg2) {
                    if ((long) (arg4 * 6 + 6) > this.field2602.method505(-21343)) {
                        return false;
                    }
                    this.field2602.method511(-24756, (long) (arg4 * 6));
                    this.field2602.method510(0, 6, -110, class86.field2149);
                    var8 = ((class86.field2149[3] & 0xFF) << 16) + ((class86.field2149[4] & 0xFF) << 8) + (class86.field2149[5] & 0xFF);
                    if (var8 <= 0 || this.field2622.method505(-21343) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2622.method505(-21343) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class86.field2149[2] = (byte) arg3;
                class86.field2149[0] = (byte) (arg3 >> 16);
                int var10 = 0;
                class86.field2149[4] = (byte) (var8 >> 8);
                class86.field2149[1] = (byte) (arg3 >> 8);
                class86.field2149[5] = (byte) var8;
                int var11 = 0;
                class86.field2149[3] = (byte) (var8 >> 16);
                this.field2602.method511(-24756, (long) (arg4 * 6));
                this.field2602.method509(6, 0, -98, class86.field2149);
                while (true) {
                    if (var10 < arg3) {
                        label110: {
                            int var12 = 0;
                            if (arg2) {
                                label109: {
                                    this.field2622.method511(-24756, (long) (var8 * 520));
                                    try {
                                        this.field2622.method510(0, 8, -85, class86.field2149);
                                    } catch (EOFException var33) {
                                        break label110;
                                    }
                                    int var13 = ((class86.field2149[0] & 0xFF) << 8) + (class86.field2149[1] & 0xFF);
                                    var12 = ((class86.field2149[4] & 0xFF) << 16) + (class86.field2149[6] & 0xFF) + ((class86.field2149[5] & 0xFF) << 8);
                                    int var14 = ((class86.field2149[2] & 0xFF) << 8) + (class86.field2149[3] & 0xFF);
                                    int var15 = class86.field2149[7] & 0xFF;
                                    if (arg4 == var13 && var11 == var14 && this.field2619 == var15) {
                                        if (var12 >= 0 && (long) var12 <= this.field2622.method505(-21343) / 520L) {
                                            break label109;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                            }
                            if (var12 == 0) {
                                arg2 = false;
                                var12 = (int) ((this.field2622.method505(-21343) + 519L) / 520L);
                                if (var12 == 0) {
                                    var12++;
                                }
                                if (var8 == var12) {
                                    var12++;
                                }
                            }
                            class86.field2149[1] = (byte) arg4;
                            class86.field2149[0] = (byte) (arg4 >> 8);
                            if (arg3 - var10 <= 512) {
                                var12 = 0;
                            }
                            class86.field2149[7] = (byte) this.field2619;
                            class86.field2149[3] = (byte) var11;
                            class86.field2149[6] = (byte) var12;
                            int var18 = arg3 - var10;
                            class86.field2149[2] = (byte) (var11 >> 8);
                            if (var18 > 512) {
                                var18 = 512;
                            }
                            var11++;
                            class86.field2149[5] = (byte) (var12 >> 8);
                            class86.field2149[4] = (byte) (var12 >> 16);
                            this.field2622.method511(-24756, (long) (var8 * 520));
                            var8 = var12;
                            this.field2622.method509(8, 0, -74, class86.field2149);
                            this.field2622.method509(var18, var10, -40, arg1);
                            var10 += var18;
                            continue;
                        }
                    }
                    if (arg0 < 75) {
                        method852((byte) -88, null, 81);
                    }
                    return true;
                }
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
    public static final void method851(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class129.method980(arg2, arg1, arg2 + arg3, arg0 + arg1);
        field2615++;
        class11.method59();
        class51.field1280++;
        class65.method530((byte) -60, true);
        class30.method240(0, true);
        class65.method530((byte) -47, false);
        class30.method240(0, false);
        class59.method430(1);
        class91.method747(true);
        if (!class131.field2942) {
            int var5 = class62.field1569;
            if (var5 < class44.field1144 / 256) {
                var5 = class44.field1144 / 256;
            }
            if (class90.field2281[4] && var5 < class81.field2011[4] + 128) {
                var5 = class81.field2011[4] + 128;
            }
            int var6 = class79.field1941 + class154.field3350 & 0x7FF;
            class106.method830(var5, var6, class131.field2935, class147.method1095((byte) 30, class159.field3650.field1751, class44.field1127, class159.field3650.field1730) - 50, -104, 600 - -(var5 * 3), class49.field1237);
        }
        int var7;
        if (class131.field2942) {
            var7 = class16.method88(128);
        } else {
            var7 = class49.method379(1);
        }
        int var8 = class134.field2989;
        int var9 = class51.field1271;
        int var10 = class15.field295;
        int var11 = class26.field672;
        int var12 = client.field495;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class90.field2281[var13]) {
                int var16 = (int) ((double) -class130.field2923[var13] + (double) (class130.field2923[var13] * 2 + 1) * Math.random() + Math.sin((double) class57.field1392[var13] / 100.0D * (double) class15.field302[var13]) * (double) class81.field2011[var13]);
                if (var13 == 2) {
                    class15.field295 += var16;
                }
                if (var13 == 0) {
                    class51.field1271 += var16;
                }
                if (var13 == 3) {
                    client.field495 = client.field495 + var16 & 0x7FF;
                }
                if (var13 == 1) {
                    class134.field2989 += var16;
                }
                if (var13 == 4) {
                    class26.field672 += var16;
                    if (class26.field672 < 128) {
                        class26.field672 = 128;
                    }
                    if (class26.field672 > 383) {
                        class26.field672 = 383;
                    }
                }
            }
        }
        int var14 = class145.field3166;
        int var15 = class16.field325;
        if (arg2 <= var15 && var15 < arg2 + arg3 && arg1 <= var14 && arg0 + arg1 > var14) {
            class92.field2383 = 0;
            class92.field2364 = class145.field3166 - arg1;
            class92.field2366 = class16.field325 - arg2;
            class92.field2371 = true;
        } else {
            class92.field2383 = 0;
            class92.field2371 = false;
        }
        class35.method268((byte) 18);
        class129.method988(arg2, arg1, arg3, arg0, 0);
        class35.method268((byte) 36);
        class3.field58.method903(class51.field1271, class134.field2989, class15.field295, class26.field672, client.field495, var7);
        class35.method268((byte) 93);
        class3.field58.method881();
        class56.method413(arg3, (byte) 103, arg0, arg2, arg1);
        class52.method393(1, arg1, arg2);
        ((class43) class11.field235).method330(class76.field1872, false);
        if (arg4 != 4) {
            return;
        }
        class9.method45(arg3, -12979, arg0, arg1, arg2);
        client.field495 = var12;
        class134.field2989 = var8;
        class51.field1271 = var9;
        class26.field672 = var11;
        class15.field295 = var10;
        if (class102.field2485 && class137.method1047(true, false, true) == 0) {
            class102.field2485 = false;
        }
        if (class102.field2485) {
            class129.method988(arg2, arg1, arg3, arg0, 0);
            class121.method942(class134.field2982, false, (byte) 65);
        }
        if (!class102.field2485 && !class98.field2440 && arg2 <= var15 && var15 < arg2 + arg3 && var14 >= arg1 && var14 < arg0 + arg1) {
            class44.method333(arg2, var15, arg4 + 59, arg1, var14);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[BI)I")
    public static final int method852(byte arg0, byte[] arg1, int arg2) {
        int var3 = -73 % ((-arg0 - 48) / 59);
        field2600++;
        return class125.method950(arg2, 0, 7202, arg1);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)Lic;")
    public static final class59 method853(int arg0, int arg1, boolean arg2) {
        int var3 = 30 % ((arg0 - 73) / 38);
        field2609++;
        return class106.method821(arg2, arg1, (byte) 98, 10);
    }

    @OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2599++;
        return "Cache:" + this.field2619;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method854(int arg0) {
        field2601 = null;
        field2611 = null;
        if (arg0 != 255) {
            return;
        }
        field2617 = null;
        field2605 = null;
        field2604 = null;
        field2603 = null;
        field2616 = null;
        field2614 = null;
        field2607 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(ILie;Lie;I)V")
    public class108(int arg0, class61 arg1, class61 arg2, int arg3) {
        this.field2622 = arg1;
        this.field2610 = arg3;
        this.field2619 = arg0;
        this.field2602 = arg2;
    }
}
