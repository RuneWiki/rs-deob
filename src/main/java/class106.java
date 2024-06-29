import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 {

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    private int field2401 = 65000;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lb;")
    private class8 field2394 = null;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lb;")
    private class8 field2397 = null;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    private int field2392;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2385 = 0;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2387 = 0;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "J")
    public static long field2390 = 0L;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lwd;")
    public static class150 field2398 = class2.method9(true, "backvmid2");

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lwd;")
    public static class150 field2391 = class2.method9(true, "(U");

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Lwd;")
    private static class150 field2400 = class2.method9(true, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lwd;")
    public static class150 field2395 = field2400;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Lqd;")
    public static class114 field2403;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI[BII)Z")
    private final boolean method729(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field2393++;
        class8 var6 = this.field2397;
        synchronized (this.field2397) {
            try {
                int var8;
                if (arg0) {
                    if (this.field2394.method48(-16777216) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field2394.method46((long) (arg3 * 6), true);
                    this.field2394.method43(-6592, 0, class91.field2112, 6);
                    var8 = ((class91.field2112[3] & 0xFF) << 16) + (class91.field2112[5] & 0xFF) + ((class91.field2112[4] & 0xFF) << 8);
                    if (var8 <= 0 || (long) var8 > this.field2397.method48(arg4 - 16777223) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2397.method48(-16777216) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class91.field2112[0] = (byte) (arg1 >> 16);
                class91.field2112[5] = (byte) var8;
                if (arg4 != 7) {
                    this.method731(-96, -72, null, -106);
                }
                class91.field2112[3] = (byte) (var8 >> 16);
                class91.field2112[1] = (byte) (arg1 >> 8);
                class91.field2112[2] = (byte) arg1;
                class91.field2112[4] = (byte) (var8 >> 8);
                this.field2394.method46((long) (arg3 * 6), true);
                this.field2394.method42(0, arg4 - 16085, 6, class91.field2112);
                int var10 = 0;
                int var11 = 0;
                while (arg1 > var10) {
                    int var12 = 0;
                    if (arg0) {
                        label108: {
                            this.field2397.method46((long) (var8 * 520), true);
                            try {
                                this.field2397.method43(-6592, 0, class91.field2112, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class91.field2112[6] & 0xFF) + ((class91.field2112[5] & 0xFF) << 8) + ((class91.field2112[4] & 0xFF) << 16);
                            int var13 = ((class91.field2112[0] & 0xFF) << 8) + (class91.field2112[1] & 0xFF);
                            int var14 = ((class91.field2112[2] & 0xFF) << 8) + (class91.field2112[3] & 0xFF);
                            int var15 = class91.field2112[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field2392 == var15) {
                                if (var12 >= 0 && this.field2397.method48(-16777216) / 520L >= (long) var12) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field2397.method48(-16777216) + 519L) / 520L);
                        arg0 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class91.field2112[0] = (byte) (arg3 >> 8);
                    class91.field2112[2] = (byte) (var11 >> 8);
                    int var18 = arg1 - var10;
                    class91.field2112[3] = (byte) var11;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class91.field2112[5] = (byte) (var12 >> 8);
                    class91.field2112[7] = (byte) this.field2392;
                    class91.field2112[4] = (byte) (var12 >> 16);
                    class91.field2112[6] = (byte) var12;
                    var11++;
                    class91.field2112[1] = (byte) arg3;
                    this.field2397.method46((long) (var8 * 520), true);
                    var8 = var12;
                    this.field2397.method42(0, arg4 ^ 0xFFFFC135, 8, class91.field2112);
                    this.field2397.method42(var10, -16078, var18, arg2);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static final void method730(int arg0) {
        if (class11.field259[98]) {
            class50.field1371 += (12 - class50.field1371) / 2;
        } else if (class11.field259[99]) {
            class50.field1371 += (-class50.field1371 - 12) / 2;
        } else {
            class50.field1371 /= 2;
        }
        int var1 = class9.field229 + class46.field1244.field3000;
        class88.field2073 += class50.field1371 / 2;
        if (class11.field259[96]) {
            class22.field652 += (-class22.field652 - 24) / 2;
        } else if (class11.field259[97]) {
            class22.field652 += (24 - class22.field652) / 2;
        } else {
            class22.field652 /= 2;
        }
        field2402++;
        int var2 = class46.field1244.field2939 + class40.field1060;
        class147.field3568 = class22.field652 / 2 + class147.field3568 & 0x7FF;
        if (class80.field1951 - var1 < -500 || class80.field1951 - var1 > 500 || class6.field157 - var2 < -500 || class6.field157 - var2 > 500) {
            class6.field157 = var2;
            class80.field1951 = var1;
        }
        if (class80.field1951 != var1) {
            class80.field1951 += (var1 - class80.field1951) / 16;
        }
        int var3 = class80.field1951 >> 7;
        int var4 = 0;
        if (class6.field157 != var2) {
            class6.field157 += (var2 - class6.field157) / 16;
        }
        int var5 = class6.field157 >> 7;
        if (class88.field2073 < 128) {
            class88.field2073 = 128;
        }
        if (arg0 < 69) {
            return;
        }
        if (class88.field2073 > 383) {
            class88.field2073 = 383;
        }
        int var6 = class25.method205(class80.field1951, class17.field466, -23287, class6.field157);
        if (var3 > 3 && var5 > 3 && var3 < 100 && var5 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class17.field466;
                    if (var9 < 3 && (class131.field3097[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class121.field2789[var9][var7][var8];
                    if (var10 > var4) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class63.field1620 < var11) {
            class63.field1620 += (var11 - class63.field1620) / 24;
        } else if (var11 < class63.field1620) {
            class63.field1620 += (var11 - class63.field1620) / 80;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II[BI)Z")
    public final boolean method731(int arg0, int arg1, byte[] arg2, int arg3) {
        field2389++;
        if (arg3 != -19045) {
            return false;
        }
        class8 var5 = this.field2397;
        synchronized (this.field2397) {
            if (arg0 < 0 || arg0 > this.field2401) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method729(true, arg0, arg2, arg1, arg3 ^ 0xFFFFB59C);
            if (!var6) {
                var6 = this.method729(false, arg0, arg2, arg1, 7);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)[B")
    public final byte[] method732(byte arg0, int arg1) {
        field2386++;
        class8 var3 = this.field2397;
        synchronized (this.field2397) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field2394.method48(-16777216)) {
                    return null;
                }
                this.field2394.method46((long) (arg1 * 6), true);
                this.field2394.method43(-6592, 0, class91.field2112, 6);
                int var5 = ((class91.field2112[0] & 0xFF) << 16) + (class91.field2112[1] << 8 & 0xFF00) + (class91.field2112[2] & 0xFF);
                int var6 = ((class91.field2112[4] & 0xFF) << 8) + (class91.field2112[3] << 16 & 0xFF0000) + (class91.field2112[5] & 0xFF);
                if (var5 < 0 || var5 > this.field2401) {
                    return null;
                } else if (var6 > 0 && this.field2397.method48(-16777216) / 520L >= (long) var6) {
                    if (arg0 <= 110) {
                        field2390 = 64L;
                    }
                    int var9 = 0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    while (var9 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2397.method46((long) (var6 * 520), true);
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2397.method43(-6592, 0, class91.field2112, var13 + 8);
                        int var14 = ((class91.field2112[2] & 0xFF) << 8) + (class91.field2112[3] & 0xFF);
                        int var15 = class91.field2112[7] & 0xFF;
                        int var16 = ((class91.field2112[0] & 0xFF) << 8) + (class91.field2112[1] & 0xFF);
                        int var17 = ((class91.field2112[5] & 0xFF) << 8) + (((class91.field2112[4] & 0xFF) << 16) + (class91.field2112[6] & 0xFF));
                        if (arg1 == var16 && var11 == var14 && this.field2392 == var15) {
                            if (var17 >= 0 && (long) var17 <= this.field2397.method48(-16777216) / 520L) {
                                var6 = var17;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var10[var9++] = class91.field2112[var20 + 8];
                                }
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method733(byte arg0) {
        field2391 = null;
        field2400 = null;
        field2395 = null;
        field2398 = null;
        field2403 = null;
        int var1 = 72 / ((-arg0 - 76) / 41);
    }

    @OriginalMember(owner = "client!pb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2388++;
        return "Cache:" + this.field2392;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIBLrb;)V")
    public static final void method734(int arg0, int arg1, int arg2, byte arg3, class118 arg4) {
        field2396++;
        if (class125.field2900 >= 400) {
            return;
        }
        if (arg4.field2714 != null) {
            arg4 = arg4.method858(114);
        }
        if (arg4 == null || !arg4.field2694) {
            return;
        }
        if (arg3 <= 68) {
            field2390 = -95L;
        }
        class150 var5 = arg4.field2697;
        if (arg4.field2719 != 0) {
            var5 = class111.method786((byte) 95, new class150[] { var5, class66.method509(class46.field1244.field2540, 11146, arg4.field2719), class104.field2357, class127.field2933, class29.method239(1000, arg4.field2719), class47.field1275 });
        }
        if (class130.field3060 == 1) {
            class68.method521(arg2, 14, class9.field214, false, arg0, class111.method786((byte) -124, new class150[] { class78.field1923, class126.field2913, var5 }), arg1);
            class121.field2778++;
        } else if (!class90.field2095) {
            class20.field526++;
            class150[] var6 = arg4.field2732;
            if (class25.field742) {
                var6 = class35.method266(5, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method1181(true, class109.field2514)) {
                        class70.field1751++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 50;
                        }
                        if (var7 == 1) {
                            var8 = 44;
                        }
                        if (var7 == 2) {
                            var8 = 1;
                        }
                        if (var7 == 3) {
                            var8 = 27;
                        }
                        if (var7 == 4) {
                            var8 = 25;
                        }
                        class68.method521(arg2, var8, var6[var7], false, arg0, class111.method786((byte) -121, new class150[] { class138.field3244, var5 }), arg1);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1181(true, class109.field2514)) {
                        class29.field870++;
                        short var10 = 0;
                        if (class46.field1244.field2540 < arg4.field2719) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 50;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 44;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 1;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 27;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 25;
                        }
                        class68.method521(arg2, var11, var6[var9], false, arg0, class111.method786((byte) 52, new class150[] { class138.field3244, var5 }), arg1);
                    }
                }
            }
            class68.method521(arg2, 1001, class58.field1505, false, arg0, class111.method786((byte) 86, new class150[] { class138.field3244, var5 }), arg1);
        } else if ((class56.field1466 & 0x2) == 2) {
            class68.method521(arg2, 28, class80.field1937, false, arg0, class111.method786((byte) 87, new class150[] { class68.field1727, class126.field2913, var5 }), arg1);
            class35.field968++;
            return;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(ILb;Lb;I)V")
    public class106(int arg0, class8 arg1, class8 arg2, int arg3) {
        this.field2401 = arg3;
        this.field2394 = arg2;
        this.field2397 = arg1;
        this.field2392 = arg0;
    }
}
