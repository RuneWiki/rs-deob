import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 {

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lua;")
    private class140 field715 = null;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    private int field719 = 65000;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "Lua;")
    private class140 field726 = null;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    private int field712;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lsc;")
    public static class128 field716 = class129.method1017(false, "VOLL");

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Lsc;")
    private static class128 field722 = class129.method1017(false, "Loaded fonts");

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Lhe;")
    public static class54 field727 = null;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field724 = 0;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Lsc;")
    public static class128 field718 = field722;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Lsc;")
    public static class128 field728 = class129.method1017(false, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "[Lsc;")
    public static class128[] field709 = new class128[100];

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lsf;")
    public static class131 field717;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
    public static int[] field713;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "[[B")
    public static byte[][] field721;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static final void method264(int arg0) {
        field725++;
        class111 var1 = class141.field3302;
        synchronized (class141.field3302) {
            class148.field3418 = class121.field2744;
            if (arg0 < ~class18.field332) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class147.field3407[var2] = false;
                }
                class18.field332 = class105.field2376;
            } else {
                while (class18.field332 != class105.field2376) {
                    int var3 = class102.field2336[class105.field2376];
                    class105.field2376 = class105.field2376 + 1 & 0x7F;
                    if (var3 < 0) {
                        class147.field3407[~var3] = false;
                    } else {
                        class147.field3407[var3] = true;
                    }
                }
            }
            class121.field2744 = class141.field3315;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public static void method265(int arg0) {
        field713 = null;
        field718 = null;
        field709 = null;
        field722 = null;
        field716 = null;
        field727 = null;
        field721 = null;
        field728 = null;
        field717 = null;
        if (arg0 != 6) {
            field721 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field714++;
        return "Cache:" + this.field712;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([BIII)Z")
    public final boolean method266(byte[] arg0, int arg1, int arg2, int arg3) {
        field710++;
        if (arg2 != 16711680) {
            return false;
        }
        class140 var5 = this.field715;
        synchronized (this.field715) {
            if (arg1 < 0 || this.field719 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method270(true, arg3, arg0, arg1, arg2 - 16711561);
            if (!var6) {
                var6 = this.method270(false, arg3, arg0, arg1, 126);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILid;IIB)V")
    public static final void method267(int arg0, class60 arg1, int arg2, int arg3, byte arg4) {
        field723++;
        if (class7.field103 >= 400) {
            return;
        }
        if (arg1.field1270 != null) {
            arg1 = arg1.method452(-107);
        }
        if (arg1 == null || !arg1.field1268) {
            return;
        }
        class128 var5 = arg1.field1274;
        if (arg1.field1308 != 0) {
            var5 = class51.method395(new class128[] { var5, class51.method399(false, arg1.field1308, class151.field3473.field1064), class55.field1227, class20.field390, class111.method857(arg1.field1308, (byte) -118), class79.field1759 }, false);
        }
        if (arg4 != 54) {
            field717 = null;
        }
        if (class105.field2392 == 1) {
            class121.method921(class14.field273, 25, arg0, (byte) -70, arg2, arg3, class51.method395(new class128[] { class53.field1067, class11.field180, var5 }, false));
            class152.field3500++;
        } else if (!class65.field1459) {
            class11.field182++;
            class128[] var6 = arg1.field1306;
            if (class112.field2526) {
                var6 = class121.method924((byte) -126, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method1010(1, class140.field3277)) {
                        class70.field1570++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 12;
                        }
                        if (var7 == 1) {
                            var8 = 43;
                        }
                        if (var7 == 2) {
                            var8 = 58;
                        }
                        if (var7 == 3) {
                            var8 = 35;
                        }
                        if (var7 == 4) {
                            var8 = 19;
                        }
                        class121.method921(var6[var7], var8, arg0, (byte) -70, arg2, arg3, class51.method395(new class128[] { class25.field491, var5 }, false));
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1010(1, class140.field3277)) {
                        class155.field3567++;
                        short var10 = 0;
                        if (arg1.field1308 > class151.field3473.field1064) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 12;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 43;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 58;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 35;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 19;
                        }
                        class121.method921(var6[var9], var11, arg0, (byte) -70, arg2, arg3, class51.method395(new class128[] { class25.field491, var5 }, false));
                    }
                }
            }
            class121.method921(class19.field357, 1006, arg0, (byte) -70, arg2, arg3, class51.method395(new class128[] { class25.field491, var5 }, false));
        } else if ((class153.field3526 & 0x2) == 2) {
            class121.method921(class110.field2486, 45, arg0, (byte) -70, arg2, arg3, class51.method395(new class128[] { class35.field656, class11.field180, var5 }, false));
            class31.field612++;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[B")
    public final byte[] method268(int arg0, int arg1) {
        field711++;
        class140 var3 = this.field715;
        synchronized (this.field715) {
            try {
                if (this.field726.method1152(arg1 ^ 0x6A) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field726.method1154((long) (arg0 * 6), false);
                this.field726.method1153(client.field425, 6, 0, arg1 + 22974);
                int var5 = (client.field425[5] & 0xFF) + ((client.field425[4] & 0xFF) << 8) + ((client.field425[3] & 0xFF) << 16);
                int var6 = ((client.field425[0] & 0xFF) << 16) + (((client.field425[1] & 0xFF) << 8) + (client.field425[2] & 0xFF));
                if (var6 < 0 || this.field719 < var6) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field715.method1152(112) / 520L) {
                    byte[] var9 = new byte[var6];
                    int var10 = arg1;
                    int var11 = 0;
                    label70: while (var11 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field715.method1154((long) (var5 * 520), false);
                        int var13 = var6 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field715.method1153(client.field425, var13 + 8, 0, 22974);
                        int var14 = ((client.field425[0] & 0xFF) << 8) + (client.field425[1] & 0xFF);
                        int var15 = (client.field425[6] & 0xFF) + ((client.field425[4] & 0xFF) << 16) + ((client.field425[5] & 0xFF) << 8);
                        int var16 = client.field425[7] & 0xFF;
                        int var17 = ((client.field425[2] & 0xFF) << 8) + (client.field425[3] & 0xFF);
                        if (arg0 == var14 && var10 == var17 && this.field712 == var16) {
                            if (var15 >= 0 && this.field715.method1152(95) / 520L >= (long) var15) {
                                var5 = var15;
                                var10++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label70;
                                    }
                                    var9[var11++] = client.field425[var20 + 8];
                                    var20++;
                                }
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

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
    public static final void method269(int arg0, int arg1, int arg2) {
        int[] var3 = new int[4];
        field720++;
        int var4 = 1;
        var3[0] = arg2;
        int[] var5 = new int[4];
        var5[0] = arg0;
        int var6 = 0;
        if (arg1 > -97) {
            return;
        }
        while (var6 < 4) {
            if (class143.field3346[var6] != arg2) {
                var3[var4] = class143.field3346[var6];
                var5[var4] = class55.field1231[var6];
                var4++;
            }
            var6++;
        }
        class143.field3346 = var3;
        class55.field1231 = var5;
        class41.method296(class143.field3346, 0, 9871, class23.field475.length - 1, class55.field1231, class23.field475);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI[BII)Z")
    private final boolean method270(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field708++;
        class140 var6 = this.field715;
        synchronized (this.field715) {
            try {
                int var7;
                if (arg0) {
                    if ((long) (arg1 * 6 + 6) > this.field726.method1152(77)) {
                        return false;
                    }
                    this.field726.method1154((long) (arg1 * 6), false);
                    this.field726.method1153(client.field425, 6, 0, 22974);
                    var7 = (client.field425[5] & 0xFF) + ((client.field425[4] & 0xFF) << 8) + ((client.field425[3] & 0xFF) << 16);
                    if (var7 <= 0 || (long) var7 > this.field715.method1152(122) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field715.method1152(122) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                client.field425[0] = (byte) (arg3 >> 16);
                client.field425[3] = (byte) (var7 >> 16);
                if (arg4 < 108) {
                    return true;
                }
                client.field425[1] = (byte) (arg3 >> 8);
                client.field425[4] = (byte) (var7 >> 8);
                client.field425[5] = (byte) var7;
                int var11 = 0;
                client.field425[2] = (byte) arg3;
                this.field726.method1154((long) (arg1 * 6), false);
                this.field726.method1147(-15468, 0, 6, client.field425);
                int var12 = 0;
                while (var11 < arg3) {
                    int var13 = 0;
                    if (arg0) {
                        label110: {
                            this.field715.method1154((long) (var7 * 520), false);
                            try {
                                this.field715.method1153(client.field425, 8, 0, 22974);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = (client.field425[6] & 0xFF) + ((client.field425[5] & 0xFF) << 8) + ((client.field425[4] & 0xFF) << 16);
                            int var14 = ((client.field425[2] & 0xFF) << 8) + (client.field425[3] & 0xFF);
                            int var15 = ((client.field425[0] & 0xFF) << 8) + (client.field425[1] & 0xFF);
                            int var16 = client.field425[7] & 0xFF;
                            if (arg1 == var15 && var12 == var14 && this.field712 == var16) {
                                if (var13 >= 0 && this.field715.method1152(88) / 520L >= (long) var13) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg0 = false;
                        var13 = (int) ((this.field715.method1152(117) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    client.field425[0] = (byte) (arg1 >> 8);
                    client.field425[2] = (byte) (var12 >> 8);
                    if (arg3 - var11 <= 512) {
                        var13 = 0;
                    }
                    client.field425[3] = (byte) var12;
                    client.field425[4] = (byte) (var13 >> 16);
                    client.field425[7] = (byte) this.field712;
                    client.field425[1] = (byte) arg1;
                    int var19 = arg3 - var11;
                    client.field425[5] = (byte) (var13 >> 8);
                    client.field425[6] = (byte) var13;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    var12++;
                    this.field715.method1154((long) (var7 * 520), false);
                    var7 = var13;
                    this.field715.method1147(-15468, 0, 8, client.field425);
                    this.field715.method1147(-15468, var11, var19, arg2);
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ILua;Lua;I)V")
    public class37(int arg0, class140 arg1, class140 arg2, int arg3) {
        this.field719 = arg3;
        this.field715 = arg1;
        this.field712 = arg0;
        this.field726 = arg2;
    }
}
