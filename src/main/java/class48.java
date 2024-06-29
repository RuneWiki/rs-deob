import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class48 {

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    private int field1280 = 0;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "[Lnd;")
    private class82[] field1275;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1262 = 0;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Z")
    public static boolean field1273 = false;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "La;")
    public static class1 field1271 = class113.method934(-11538, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!i", name = "j", descriptor = "La;")
    public static class1 field1266 = class113.method934(-11538, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!i", name = "e", descriptor = "La;")
    public static class1 field1261 = class113.method934(-11538, "l");

    @OriginalMember(owner = "client!i", name = "u", descriptor = "La;")
    public static class1 field1277 = class113.method934(-11538, " (X");

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public static int field1281 = -1;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "J")
    private long field1258;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Le;")
    public static class25 field1257;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lnd;")
    private class82 field1274;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "Lnd;")
    private class82 field1282;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "Z")
    public static boolean field1279;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLu;IIBIB)V", line = 4)
    public static final void method497(boolean arg0, class120 arg1, int arg2, int arg3, byte arg4, int arg5, byte arg6) {
        int var7 = 14 % ((arg6 - 5) / 62);
        long var8 = (long) ((arg2 << 16) + arg3);
        class104 var10 = (class104) class103.field2599.method501(var8, 6120);
        field1269++;
        if (var10 != null) {
            return;
        }
        class104 var11 = (class104) class78.field1920.method501(var8, 6120);
        if (var11 != null) {
            return;
        }
        class104 var12 = (class104) class49.field1330.method501(var8, 6120);
        if (var12 == null) {
            if (!arg0) {
                class104 var13 = (class104) class74.field1834.method501(var8, 6120);
                if (var13 != null) {
                    return;
                }
            }
            class104 var14 = new class104();
            var14.field2627 = arg5;
            var14.field2622 = arg4;
            var14.field2618 = arg1;
            if (arg0) {
                class103.field2599.method500(var14, (byte) 54, var8);
                class134.field3288++;
            } else {
                class37.field997.method601(126, var14);
                class49.field1330.method500(var14, (byte) 109, var8);
                field1262++;
            }
        } else if (arg0) {
            var12.method470(0);
            class103.field2599.method500(var12, (byte) 116, var8);
            field1262--;
            class134.field3288++;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 72)
    public static void method498(boolean arg0) {
        field1257 = null;
        field1261 = null;
        field1266 = null;
        if (arg0) {
            field1277 = null;
        }
        field1271 = null;
        field1277 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)Lnd;", line = 87)
    public final class82 method499(boolean arg0) {
        this.field1280 = 0;
        field1260++;
        return arg0 ? null : this.method506((byte) -38);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lnd;BJ)V", line = 101)
    public final void method500(class82 arg0, byte arg1, long arg2) {
        field1268++;
        if (arg0.field2108 != null) {
            arg0.method742(-1);
        }
        class82 var5 = this.field1275[(int) ((long) (this.field1270 - 1) & arg2)];
        arg0.field2090 = var5;
        arg0.field2076 = arg2;
        arg0.field2108 = var5.field2108;
        arg0.field2108.field2090 = arg0;
        arg0.field2090.field2108 = arg0;
        int var6 = -96 / ((arg1 + 54) / 54);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(JI)Lnd;", line = 126)
    public final class82 method501(long arg0, int arg1) {
        this.field1258 = arg0;
        if (arg1 != 6120) {
            return null;
        }
        field1276++;
        class82 var4 = this.field1275[(int) ((long) (this.field1270 - 1) & arg0)];
        for (this.field1274 = var4.field2090; this.field1274 != var4; this.field1274 = this.field1274.field2090) {
            if (this.field1274.field2076 == arg0) {
                class82 var5 = this.field1274;
                this.field1274 = this.field1274.field2090;
                return var5;
            }
        }
        this.field1274 = null;
        return null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 165)
    public static final void method502(int arg0) {
        field1278++;
        Object var1 = class5.field214;
        synchronized (class5.field214) {
            if (class8.field308 == 0) {
                class39.field1072.method659(5, 0, new class89());
            }
            class8.field308 = arg0;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)Lnd;", line = 187)
    public final class82 method503(int arg0) {
        field1264++;
        if (this.field1274 == null) {
            return null;
        }
        int var2 = -52 / (arg0 / 62);
        class82 var3 = this.field1275[(int) (this.field1258 & (long) (this.field1270 - 1))];
        while (this.field1274 != var3) {
            if (this.field1274.field2076 == this.field1258) {
                class82 var4 = this.field1274;
                this.field1274 = this.field1274.field2090;
                return var4;
            }
            this.field1274 = this.field1274.field2090;
        }
        this.field1274 = null;
        return null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)La;", line = 218)
    public static final class1 method504(int arg0, int arg1) {
        if (arg1 == -1) {
            field1267++;
            return class36.method419(false, (byte) 8, 10, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 242)
    public static final void method505(byte arg0) {
        field1263++;
        class19 var1 = (class19) class86.field2163.method805((byte) -90);
        if (arg0 != 61) {
            return;
        }
        while (var1 != null) {
            if (class2.field76 != var1.field639 || class82.field2066 > var1.field629) {
                var1.method742(-1);
            } else if (var1.field632 <= class82.field2066) {
                if (var1.field619 > 0) {
                    class130 var2 = class120.field2995[var1.field619 - 1];
                    if (var2 != null && var2.field1975 >= 0 && var2.field1975 < 13312 && var2.field1966 >= 0 && var2.field1966 < 13312) {
                        var1.method301(class82.field2066, arg0 - 61, var2.field1966, class78.method715((byte) -127, var1.field639, var2.field1975, var2.field1966) - var1.field618, var2.field1975);
                    }
                }
                if (var1.field619 < 0) {
                    int var3 = -var1.field619 - 1;
                    class2 var4;
                    if (class67.field1686 == var3) {
                        var4 = class104.field2624;
                    } else {
                        var4 = class80.field2033[var3];
                    }
                    if (var4 != null && var4.field1975 >= 0 && var4.field1975 < 13312 && var4.field1966 >= 0 && var4.field1966 < 13312) {
                        var1.method301(class82.field2066, 0, var4.field1966, class78.method715((byte) -127, var1.field639, var4.field1975, var4.field1966) - var1.field618, var4.field1975);
                    }
                }
                var1.method300(51, class9.field322);
                class130.field3186.method91(class2.field76, (int) var1.field638, (int) var1.field651, (int) var1.field650, 60, var1, var1.field671, -1, false);
            }
            var1 = (class19) class86.field2163.method812(arg0 - 65);
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V", line = 294)
    public class48(int arg0) {
        this.field1270 = arg0;
        this.field1275 = new class82[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class82 var3 = this.field1275[var2] = new class82();
            var3.field2090 = var3;
            var3.field2108 = var3;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)Lnd;", line = 337)
    private final class82 method506(byte arg0) {
        field1259++;
        if (arg0 > -26) {
            this.field1274 = null;
        }
        if (this.field1280 > 0 && this.field1275[this.field1280 - 1] != this.field1282) {
            class82 var2 = this.field1282;
            this.field1282 = var2.field2090;
            return var2;
        }
        while (this.field1270 > this.field1280) {
            class82 var3 = this.field1275[this.field1280++].field2090;
            if (this.field1275[this.field1280 - 1] != var3) {
                this.field1282 = var3.field2090;
                return var3;
            }
        }
        return null;
    }
}
