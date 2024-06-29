import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class49 extends class67 {

    @OriginalMember(owner = "client!ib", name = "jb", descriptor = "I")
    private int field1244 = 0;

    @OriginalMember(owner = "client!ib", name = "rb", descriptor = "I")
    public int field1252 = -1;

    @OriginalMember(owner = "client!ib", name = "pb", descriptor = "I")
    private int field1250 = 128;

    @OriginalMember(owner = "client!ib", name = "ub", descriptor = "[I")
    private int[] field1255 = new int[6];

    @OriginalMember(owner = "client!ib", name = "tb", descriptor = "I")
    private int field1254 = 0;

    @OriginalMember(owner = "client!ib", name = "vb", descriptor = "[I")
    private int[] field1256 = new int[6];

    @OriginalMember(owner = "client!ib", name = "wb", descriptor = "I")
    private int field1257 = 0;

    @OriginalMember(owner = "client!ib", name = "zb", descriptor = "I")
    private int field1260 = 128;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "Lgd;")
    private static class40 field1233 = class14.method90(false, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "Lgd;")
    public static class40 field1238 = class14.method90(false, "@gr3@");

    @OriginalMember(owner = "client!ib", name = "mb", descriptor = "Lgd;")
    public static class40 field1247 = class14.method90(false, ")2");

    @OriginalMember(owner = "client!ib", name = "sb", descriptor = "[I")
    public static int[] field1253 = new int[5];

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "[I")
    public static int[] field1242 = new int[100];

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "Lgd;")
    public static class40 field1243 = field1233;

    @OriginalMember(owner = "client!ib", name = "nb", descriptor = "Lgd;")
    public static class40 field1248 = class14.method90(false, "Weiter");

    @OriginalMember(owner = "client!ib", name = "yb", descriptor = "I")
    public static int field1259 = 0;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "Lgd;")
    public static class40 field1236 = class14.method90(false, "mapscene");

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
    public int field1241;

    @OriginalMember(owner = "client!ib", name = "kb", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!ib", name = "lb", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ib", name = "qb", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ib", name = "xb", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "J")
    public static long field1237;

    @OriginalMember(owner = "client!ib", name = "ob", descriptor = "Lmb;")
    public static class73 field1249;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZZ[B)V", line = 4)
    public static final void method379(int arg0, int arg1, boolean arg2, boolean arg3, byte[] arg4) {
        field1258++;
        if (class114.field2744 == null || !arg2) {
            return;
        }
        if (class21.field491 >= 0) {
            arg1 -= 20;
            if (arg1 < 1) {
                arg1 = 1;
            }
            class11.field291 = arg1;
            if (class21.field491 == 0) {
                class103.field2474 = 0;
            } else {
                int var5 = class126.method1005(class21.field491, -128);
                int var6 = var5 - class5.field156;
                class103.field2474 = (var6 + arg1 + 3599) / arg1;
            }
            class30.field693 = arg3;
            class50.field1280 = arg4;
            class112.field2688 = arg0;
        } else if (class11.field291 == 0) {
            method383(arg4, 20, arg3, arg0);
        } else {
            class112.field2688 = arg0;
            class30.field693 = arg3;
            class50.field1280 = arg4;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lrc;II)V", line = 52)
    private final void method380(class104 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1239 = arg0.method797(-7916);
        } else if (arg1 == 2) {
            this.field1252 = arg0.method797(-7916);
        } else if (arg1 == 4) {
            this.field1260 = arg0.method797(arg2 ^ 0x3175);
        } else if (arg1 == 5) {
            this.field1250 = arg0.method797(-7916);
        } else if (arg1 == 6) {
            this.field1257 = arg0.method797(arg2 + 4275);
        } else if (arg1 == 7) {
            this.field1254 = arg0.method798((byte) -92);
        } else if (arg1 == 8) {
            this.field1244 = arg0.method798((byte) -46);
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field1256[arg1 - 40] = arg0.method797(arg2 + 4275);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field1255[arg1 - 50] = arg0.method797(-7916);
        }
        if (arg2 == -12191) {
            field1234++;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)Lqb;", line = 122)
    public final class97 method381(byte arg0, int arg1) {
        class97 var3 = (class97) class134.field3270.method39(28, (long) this.field1241);
        field1251++;
        if (var3 == null) {
            var3 = class97.method671(class101.field2412, this.field1239, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field1256[0] != 0) {
                    var3.method656(this.field1256[var4], this.field1255[var4]);
                }
            }
            var3.method655();
            var3.method666(this.field1254 + 64, 850 - -this.field1244, -30, -50, -30, true);
            class134.field3270.method38(var3, (long) this.field1241, true);
        }
        class97 var5;
        if (this.field1252 == -1 || arg1 == -1) {
            var5 = var3.method676(true);
        } else {
            var5 = class22.method126((byte) 52, this.field1252).method319(var3, arg1, true);
        }
        if (this.field1260 != 128 || this.field1250 != 128) {
            var5.method657(this.field1260, this.field1250, this.field1260);
        }
        int var6 = -127 % ((28 - arg0) / 53);
        if (this.field1257 != 0) {
            if (this.field1257 == 90) {
                var5.method679();
            }
            if (this.field1257 == 180) {
                var5.method679();
                var5.method679();
            }
            if (this.field1257 == 270) {
                var5.method679();
                var5.method679();
                var5.method679();
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lrc;B)V", line = 189)
    public final void method382(class104 arg0, byte arg1) {
        field1245++;
        if (arg1 < 84) {
            return;
        }
        while (true) {
            int var3 = arg0.method798((byte) -66);
            if (var3 == 0) {
                return;
            }
            this.method380(arg0, var3, -12191);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([BIZI)V", line = 209)
    public static final void method383(byte[] arg0, int arg1, boolean arg2, int arg3) {
        field1240++;
        if (class114.field2744 == null) {
            return;
        }
        if (class21.field491 >= 0) {
            class114.field2744.method80((byte) 109);
            class50.field1280 = null;
            class21.field491 = -1;
            class11.field291 = 20;
            class5.field156 = 0;
        }
        if (arg1 != 20) {
            field1233 = null;
        }
        if (arg0 == null) {
            return;
        }
        if (class11.field291 > 0) {
            class114.field2744.method76((byte) -86, arg3);
            class11.field291 = 0;
        }
        class21.field491 = arg3;
        class114.field2744.method77(arg3, arg0, arg2, -28);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lrb;IZLrb;I)Lve;", line = 257)
    public static final class131 method384(class103 arg0, int arg1, boolean arg2, class103 arg3, int arg4) {
        field1246++;
        boolean var5 = true;
        int[] var6 = arg3.method739(true, arg4);
        for (int var7 = arg1; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method747(arg4, var6[var7], 0);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg2) {
                    var10 = arg0.method747(0, var9, 0);
                } else {
                    var10 = arg0.method747(var9, 0, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class131(arg3, arg0, arg4, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V", line = 324)
    public static final void method385(int arg0) {
        int var1 = 0;
        int var2 = -22 % ((60 - arg0) / 48);
        while (var1 < class23.field548) {
            int var3 = class115.field2763[var1];
            class23 var4 = class130.field3142[var3];
            if (var4 != null) {
                class83.method550(var4.field531.field3030, var4, 18617);
            }
            var1++;
        }
        field1235++;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V", line = 351)
    public static void method386(byte arg0) {
        field1248 = null;
        field1243 = null;
        field1233 = null;
        field1253 = null;
        field1247 = null;
        field1249 = null;
        field1238 = null;
        if (arg0 != 31) {
            method379(57, -27, false, false, null);
        }
        field1242 = null;
        field1236 = null;
    }
}
