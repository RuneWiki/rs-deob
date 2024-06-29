import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class128 {

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    private int field2241 = 65000;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Leh;")
    private class80 field2247 = null;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Leh;")
    private class80 field2243 = null;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    private int field2244;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lpj;")
    public static class237 field2246 = class33.method353("http:)4)4", 14);

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Lie;")
    public static class32 field2240 = new class32(new byte[5000]);

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lci;")
    public static class233 field2248 = new class233(64);

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lpj;")
    public static class237 field2249 = class33.method353("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 107);

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lpj;")
    public static class237 field2250 = class33.method353("Hierhin gehen", 42);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Ljd;")
    public static class86 field2251;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static final void method902(int arg0) {
        if (arg0 == -32769) {
            class131.field2298.method942(0);
            field2236++;
            class68.field1332.method942(0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIZII)V")
    private static final void method903(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class264.method1766(arg2, 0);
        int var7 = arg2 - arg6;
        int var8 = 0;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = -arg2;
        field2233++;
        if (arg4) {
            field2251 = null;
        }
        int var10 = arg2;
        int var11 = var7;
        int var12 = -var7;
        int var13 = -1;
        int var14 = arg3 - var7;
        int var15 = -1;
        int[] var16 = class62.field1241[arg5];
        int var17 = arg3 + var7;
        class199.method1361(arg1, var14, var16, arg3 - arg2, 113);
        class199.method1361(arg0, var17, var16, var14, 69);
        class199.method1361(arg1, arg3 + arg2, var16, var17, 69);
        while (var10 > var8) {
            var15 += 2;
            var13 += 2;
            var9 += var13;
            var12 += var15;
            if (var12 >= 0 && var11 >= 1) {
                class106.field1886[var11] = var8;
                var11--;
                var12 -= var11 << 1;
            }
            var8++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                if (var7 <= var10) {
                    int[] var18 = class62.field1241[arg5 + var10];
                    int[] var19 = class62.field1241[arg5 - var10];
                    int var20 = arg3 + var8;
                    int var21 = arg3 - var8;
                    class199.method1361(arg1, var20, var18, var21, 89);
                    class199.method1361(arg1, var20, var19, var21, 106);
                } else {
                    int[] var22 = class62.field1241[arg5 + var10];
                    int var23 = class106.field1886[var10];
                    int var24 = arg3 - var8;
                    int var25 = arg3 + var8;
                    int var26 = arg3 - var23;
                    int[] var27 = class62.field1241[arg5 - var10];
                    int var28 = arg3 + var23;
                    class199.method1361(arg1, var26, var22, var24, 76);
                    class199.method1361(arg0, var28, var22, var26, 85);
                    class199.method1361(arg1, var25, var22, var28, 76);
                    class199.method1361(arg1, var26, var27, var24, 101);
                    class199.method1361(arg0, var28, var27, var26, 62);
                    class199.method1361(arg1, var25, var27, var28, 61);
                }
            }
            int[] var29 = class62.field1241[arg5 + var8];
            int[] var30 = class62.field1241[arg5 - var8];
            int var31 = arg3 + var10;
            int var32 = arg3 - var10;
            if (var7 > var8) {
                int var33 = var8 <= var11 ? var11 : class106.field1886[var8];
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class199.method1361(arg1, var35, var29, var32, 97);
                class199.method1361(arg0, var34, var29, var35, 66);
                class199.method1361(arg1, var31, var29, var34, 109);
                class199.method1361(arg1, var35, var30, var32, 118);
                class199.method1361(arg0, var34, var30, var35, 98);
                class199.method1361(arg1, var31, var30, var34, 88);
            } else {
                class199.method1361(arg1, var31, var29, var32, 93);
                class199.method1361(arg1, var31, var30, var32, 105);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Laf;I)V")
    public static final void method904(class67 arg0, int arg1) {
        field2242++;
        class165 var2 = null;
        try {
            class103 var3 = arg0.method548("runescape", 93);
            while (var3.field1823 == 0) {
                class84.method645(1, 1L);
            }
            if (var3.field1823 == 1) {
                var2 = (class165) var3.field1826;
                class32 var4 = class253.method1715(7493);
                var2.method1155(-14594, var4.field647, 0, var4.field644);
            }
        } catch (Exception var7) {
        }
        try {
            int var5 = 95 % ((arg1 - 93) / 32);
            if (var2 != null) {
                var2.method1153((byte) -11);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method905(byte arg0) {
        field2249 = null;
        field2251 = null;
        field2250 = null;
        int var1 = -114 / (arg0 / 34);
        field2248 = null;
        field2246 = null;
        field2240 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II[BB)Z")
    public final boolean method906(int arg0, int arg1, byte[] arg2, byte arg3) {
        field2235++;
        if (arg3 != -19) {
            method905((byte) -128);
        }
        class80 var5 = this.field2247;
        synchronized (this.field2247) {
            if (arg0 < 0 || arg0 > this.field2241) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method910(arg2, arg0, 26167, arg1, true);
            if (!var6) {
                var6 = this.method910(arg2, arg0, arg3 + 26186, arg1, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ob", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2239++;
        return "Cache:" + this.field2244;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[B")
    public final byte[] method907(int arg0, int arg1) {
        field2245++;
        class80 var3 = this.field2247;
        synchronized (this.field2247) {
            try {
                if (this.field2243.method623(97) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field2243.method627((long) (arg0 * 6), 15294);
                this.field2243.method620(0, 6, false, class249.field4330);
                int var5 = (class249.field4330[2] & 0xFF) + ((class249.field4330[0] & 0xFF) << 16) + (class249.field4330[1] & 0xFF << 8);
                int var6 = (class249.field4330[5] & 0xFF) + ((class249.field4330[3] & 0xFF << 16) + ((class249.field4330[4] & 0xFF) << 8));
                if (var5 < 0 || this.field2241 < var5) {
                    return null;
                } else if (var6 > 0 && (this.field2247.method623(116) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = arg1;
                    int var11 = 0;
                    label70: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2247.method627((long) (var6 * 520), 15294);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2247.method620(0, var13 + 8, false, class249.field4330);
                        int var14 = (class249.field4330[0] & 0xFF << 8) + (class249.field4330[1] & 0xFF);
                        int var15 = ((class249.field4330[2] & 0xFF) << 8) + (class249.field4330[3] & 0xFF);
                        int var16 = (class249.field4330[5] & 0xFF << 8) + (class249.field4330[4] & 0xFF << 16) + (class249.field4330[6] & 0xFF);
                        int var17 = class249.field4330[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field2244 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field2247.method623(120) / 520L) {
                                var6 = var16;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label70;
                                    }
                                    var9[var10++] = class249.field4330[var20 + 8];
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

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BIIZIII)V")
    public static final void method908(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2232++;
        if (class263.field4495 == arg2 && class63.field1264 == arg1 && class214.field3647 == arg6 || class151.method1033((byte) -63)) {
            return;
        }
        class63.field1264 = arg1;
        class263.field4495 = arg2;
        if (arg0 != 61) {
            field2246 = null;
        }
        class214.field3647 = arg6;
        if (class151.method1033((byte) -98)) {
            class214.field3647 = 0;
        }
        if (arg3) {
            class79.method610(28, (byte) 115);
        } else {
            class79.method610(25, (byte) 114);
        }
        class118.method856(class45.field983, true, arg0 ^ 0xFFFFD12B);
        int var7 = class235.field4087;
        int var8 = class27.field494;
        class27.field494 = (arg1 - 6) * 8;
        class235.field4087 = arg2 * 8 - 48;
        class112.field1964 = class271.method1807(false, class263.field4495 * 8, class63.field1264 * 8);
        int var9 = class27.field494 - var8;
        int var10 = class27.field494;
        int var11 = class235.field4087 - var7;
        int var12 = class235.field4087;
        if (arg3) {
            class89.field1636 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class210 var14 = class232.field4022[var13];
                if (var14 != null) {
                    var14.field3710 -= var11 * 128;
                    var14.field3700 -= var9 * 128;
                    if (var14.field3710 >= 0 && var14.field3710 <= 13184 && var14.field3700 >= 0 && var14.field3700 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field3715[var15] -= var11;
                            var14.field3743[var15] -= var9;
                        }
                        class263.field4498[class89.field1636++] = var13;
                    } else {
                        class232.field4022[var13].field3586 = null;
                        class232.field4022[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class210 var32 = class232.field4022[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field3715[var33] -= var11;
                        var32.field3743[var33] -= var9;
                    }
                    var32.field3710 -= var11 * 128;
                    var32.field3700 -= var9 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class271 var30 = class232.field4025[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field3715[var31] -= var11;
                    var30.field3743[var31] -= var9;
                }
                var30.field3710 -= var11 * 128;
                var30.field3700 -= var9 * 128;
            }
        }
        class274.field4798 = arg6;
        class229.field3911.method1803(0, arg5, arg4, false);
        byte var18 = 104;
        byte var19 = 0;
        byte var20 = 1;
        if (var11 < 0) {
            var19 = 103;
            var20 = -1;
            var18 = -1;
        }
        byte var21 = 0;
        byte var22 = 104;
        byte var23 = 1;
        if (var9 < 0) {
            var21 = 103;
            var23 = -1;
            var22 = -1;
        }
        for (int var24 = var19; var24 != var18; var24 += var20) {
            for (int var26 = var21; var26 != var22; var26 += var23) {
                int var27 = var24 + var11;
                int var28 = var26 + var9;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class32.field674[var29][var24][var26] = class32.field674[var29][var27][var28];
                    } else {
                        class32.field674[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class61 var25 = (class61) class27.field487.method673(false); var25 != null; var25 = (class61) class27.field487.method680(32)) {
            var25.field1228 -= var11;
            var25.field1226 -= var9;
            if (var25.field1228 < 0 || var25.field1226 < 0 || var25.field1228 >= 104 || var25.field1226 >= 104) {
                var25.method629(0);
            }
        }
        class264.field4517 = 0;
        if (arg3) {
            class160.field2879 -= var11;
            class49.field1050 -= var11;
            class199.field3454 -= var9;
            class235.field4089 -= var9;
        } else {
            class163.field2899 = 1;
        }
        class270.field4625 = -1;
        if (class36.field815 != 0) {
            class36.field815 -= var11;
            class135.field2345 -= var9;
        }
        class47.field1017.method676(16841);
        class182.field3202.method676(arg0 ^ 0x41F4);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)V")
    public static final void method909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2234++;
        if ((arg4 - arg1) >= class89.field1637 && arg4 + arg1 <= class94.field1676 && class13.field215 <= arg3 - arg1 && arg1 + arg3 <= class34.field727) {
            method903(arg0, arg5, arg1, arg4, false, arg3, arg6);
        } else {
            class123.method878((byte) -68, arg5, arg1, arg0, arg3, arg6, arg4);
        }
        if (arg2 != 0) {
            field2246 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIIIZ)Z")
    private final boolean method910(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2231++;
        class80 var6 = this.field2247;
        synchronized (this.field2247) {
            try {
                int var8;
                if (arg4) {
                    if (this.field2243.method623(111) < ((long) (arg3 * 6 + 6))) {
                        return false;
                    }
                    this.field2243.method627((long) (arg3 * 6), 15294);
                    this.field2243.method620(0, 6, false, class249.field4330);
                    var8 = (class249.field4330[5] & 0xFF) + (((class249.field4330[3] & 0xFF) << 16) + (class249.field4330[4] & 0xFF << 8));
                    if (var8 <= 0 || ((long) var8) > (this.field2247.method623(108) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2247.method623(118) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                if (arg2 != 26167) {
                    this.field2244 = -23;
                }
                class249.field4330[1] = (byte) (arg1 >> 8);
                class249.field4330[5] = (byte) var8;
                class249.field4330[0] = (byte) (arg1 >> 16);
                int var10 = 0;
                class249.field4330[4] = (byte) (var8 >> 8);
                int var11 = 0;
                class249.field4330[2] = (byte) arg1;
                class249.field4330[3] = (byte) (var8 >> 16);
                this.field2243.method627((long) (arg3 * 6), 15294);
                this.field2243.method624(true, 6, 0, class249.field4330);
                while (var10 < arg1) {
                    int var12 = 0;
                    if (arg4) {
                        label108: {
                            this.field2247.method627((long) (var8 * 520), 15294);
                            try {
                                this.field2247.method620(0, 8, false, class249.field4330);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class249.field4330[2] & 0xFF) << 8) + (class249.field4330[3] & 0xFF);
                            int var14 = ((class249.field4330[0] & 0xFF) << 8) + (class249.field4330[1] & 0xFF);
                            var12 = ((class249.field4330[4] & 0xFF) << 16) + (class249.field4330[5] & 0xFF << 8) + (class249.field4330[6] & 0xFF);
                            int var15 = class249.field4330[7] & 0xFF;
                            if (arg3 == var14 && var11 == var13 && this.field2244 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field2247.method623(88) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field2247.method623(98) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class249.field4330[7] = (byte) this.field2244;
                    int var18 = arg1 - var10;
                    class249.field4330[2] = (byte) (var11 >> 8);
                    class249.field4330[3] = (byte) var11;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    var11++;
                    class249.field4330[0] = (byte) (arg3 >> 8);
                    if ((arg1 - var10) <= 512) {
                        var12 = 0;
                    }
                    class249.field4330[5] = (byte) (var12 >> 8);
                    class249.field4330[4] = (byte) (var12 >> 16);
                    class249.field4330[6] = (byte) var12;
                    class249.field4330[1] = (byte) arg3;
                    this.field2247.method627((long) (var8 * 520), 15294);
                    var8 = var12;
                    this.field2247.method624(true, 8, 0, class249.field4330);
                    this.field2247.method624(true, var18, var10, arg0);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lw;I)V")
    public static final void method911(class141 arg0, int arg1) {
        if (arg1 == -17149) {
            if (class36.field808 == arg0.field2503) {
                class166.field2941[arg0.field2493] = true;
            }
            field2237++;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZB)V")
    public static final void method912(boolean arg0, byte arg1) {
        field2238++;
        class96.method718((byte) -52);
        if (class264.field4507 != 30 && class264.field4507 != 25) {
            return;
        }
        class50.field1067++;
        if (class50.field1067 < 50 && !arg0) {
            return;
        }
        class50.field1067 = 0;
        int var2 = -111 / ((arg1 + 52) / 52);
        if (!class213.field3641 && class127.field2219 != null) {
            class223.field3830.method368(62, 130);
            try {
                class127.field2219.method1434(0, -26363, class223.field3830.field647, class223.field3830.field644);
                class223.field3830.field647 = 0;
            } catch (IOException var3) {
                class213.field3641 = true;
            }
            class207.field3528++;
        }
        class96.method718((byte) -52);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(ILeh;Leh;I)V")
    public class128(int arg0, class80 arg1, class80 arg2, int arg3) {
        this.field2241 = arg3;
        this.field2243 = arg2;
        this.field2244 = arg0;
        this.field2247 = arg1;
    }
}
