import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class71 {

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lga;")
    private class18 field1234 = new class18();

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Lga;")
    private class18 field1243 = new class18();

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    private int field1244 = 0;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "Lga;")
    private class18 field1246 = new class18();

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "Lga;")
    private class18 field1247 = new class18();

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    private int field1249 = 0;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "Lfe;")
    private class229 field1251 = new class229(4);

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "B")
    private byte field1256 = 0;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public volatile int field1255 = 0;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public volatile int field1257 = 0;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "Lfe;")
    private class229 field1254 = new class229(8);

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Z")
    public static boolean field1230 = true;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "Lbe;")
    private static class283 field1245 = class153.method941(125, "Attack");

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lbe;")
    public static class283 field1221 = field1245;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "Z")
    public static boolean field1242 = false;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1224 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "[[I")
    public static int[][] field1252 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "J")
    private long field1248;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "Llb;")
    private class199 field1250;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "Lti;")
    private class210 field1258;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[[[B")
    public static byte[][][] field1225;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 5)
    public static void method463(byte arg0) {
        if (arg0 > -54) {
            field1221 = (class283) null;
        }
        field1225 = (byte[][][]) null;
        field1221 = null;
        field1245 = null;
        field1224 = null;
        field1252 = (int[][]) null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZIBI)Lti;", line = 21)
    public final class210 method464(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        field1228++;
        long var6 = (long) ((arg4 << 16) + arg2);
        class210 var8 = new class210();
        if (arg0 != 0) {
            this.method470(-110);
        }
        var8.field600 = arg1;
        var8.field3575 = arg3;
        var8.field3034 = var6;
        if (arg1) {
            if (this.field1244 >= 20) {
                throw new RuntimeException();
            }
            this.field1234.method111(-54, var8);
            this.field1244++;
        } else if (this.field1249 < 20) {
            this.field1246.method111(9, var8);
            this.field1249++;
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[BI)I", line = 73)
    public static final int method465(int arg0, byte[] arg1, int arg2) {
        field1237++;
        if (arg0 >= -89) {
            method469(27, 43, 34, 59, -124, 43, (byte) -91);
        }
        return class6.method33(-10467, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 86)
    public final void method466(int arg0) {
        this.field1256 = (byte) ((int) (Math.random() * 255.0D + (double) arg0));
        field1238++;
        this.field1255++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V", line = 103)
    public final void method467(int arg0, boolean arg1) {
        field1232++;
        if (this.field1250 == null) {
            return;
        }
        try {
            this.field1251.field3905 = 0;
            this.field1251.method1499(true, arg1 ? 2 : 3);
            this.field1251.method1502((byte) -125, 0);
            this.field1250.method1278(arg0, this.field1251.field3879, 0, (byte) -37);
        } catch (IOException var6) {
            try {
                this.field1250.method1282(true);
            } catch (Exception var5) {
            }
            this.field1257++;
            this.field1250 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([Lbe;B)[Lbe;", line = 128)
    public static final class283[] method468(class283[] arg0, byte arg1) {
        field1229++;
        class283[] var2 = new class283[5];
        int var3 = 55 / ((-arg1 - 78) / 34);
        for (int var4 = 0; var4 < 5; var4++) {
            var2[var4] = class299.method2022(new class283[] { class296.method2012(var4, (byte) -48), class291.field4940 }, (byte) 34);
            if (arg0 != null && arg0[var4] != null) {
                var2[var4] = class299.method2022(new class283[] { var2[var4], arg0[var4] }, (byte) 17);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIB)V", line = 152)
    public static final void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field1222++;
        int var7 = arg2 + arg4;
        int var8 = arg3 + arg4;
        int var9 = arg5 - arg4;
        for (int var10 = arg2; var10 < var7; var10++) {
            class114.method742(arg6 ^ 0x7595, arg3, class97.field1636[var10], arg0, arg1);
        }
        if (arg6 != 96) {
            method469(61, 39, 40, 125, -29, 8, (byte) -108);
        }
        for (int var11 = arg5; var11 > var9; var11--) {
            class114.method742(arg6 ^ 0x7595, arg3, class97.field1636[var11], arg0, arg1);
        }
        int var12 = arg0 - arg4;
        for (int var13 = var7; var13 <= var9; var13++) {
            int[] var14 = class97.field1636[var13];
            class114.method742(30197, arg3, var14, var8, arg1);
            class114.method742(30197, var12, var14, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Z", line = 199)
    public final boolean method470(int arg0) {
        field1231++;
        if (arg0 == 20) {
            return this.field1244 >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)I", line = 218)
    public final int method471(boolean arg0) {
        field1235++;
        if (arg0) {
            method465(-37, (byte[]) null, 108);
        }
        return this.field1244;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Z", line = 230)
    public final boolean method472(int arg0) {
        if (arg0 == -21) {
            field1226++;
            return this.field1249 >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V", line = 252)
    public final void method473(boolean arg0) {
        if (this.field1250 != null) {
            this.field1250.method1282(true);
        }
        if (!arg0) {
            this.field1247 = (class18) null;
        }
        field1223++;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V", line = 270)
    private final void method474(int arg0) {
        field1227++;
        if (this.field1250 == null) {
            return;
        }
        try {
            this.field1251.field3905 = 0;
            this.field1251.method1499(true, 6);
            this.field1251.method1502((byte) 54, 2);
            this.field1250.method1278(4, this.field1251.field3879, arg0, (byte) -37);
        } catch (IOException var5) {
            try {
                this.field1250.method1282(true);
            } catch (Exception var4) {
            }
            this.field1257++;
            this.field1250 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)Z", line = 309)
    public final boolean method475(int arg0) {
        field1233++;
        long var2 = class216.method1426(255);
        if (arg0 != 14) {
            this.method466(-76);
        }
        int var4 = (int) (var2 - this.field1248);
        if (var4 > 200) {
            var4 = 200;
        }
        this.field1248 = var2;
        this.field1253 += var4;
        if (this.field1244 == 0 && this.field1249 == 0) {
            if (this.field1250 == null) {
                return true;
            }
            if (this.field1253 > 30000) {
                try {
                    this.field1250.method1282(true);
                } catch (Exception var29) {
                }
                this.field1250 = null;
                return true;
            }
        } else if (this.field1250 == null) {
            return false;
        }
        boolean var6 = false;
        try {
            for (class210 var7 = (class210) this.field1234.method106(false); var7 != null; var7 = (class210) this.field1234.method110((byte) -27)) {
                this.field1251.field3905 = 0;
                this.field1251.method1499(true, 1);
                this.field1251.method1502((byte) -126, (int) var7.field3034);
                this.field1250.method1278(4, this.field1251.field3879, 0, (byte) -37);
                this.field1243.method111(106, var7);
            }
            for (class210 var8 = (class210) this.field1246.method106(false); var8 != null; var8 = (class210) this.field1246.method110((byte) -72)) {
                this.field1251.field3905 = 0;
                this.field1251.method1499(true, 0);
                this.field1251.method1502((byte) -114, (int) var8.field3034);
                this.field1250.method1278(4, this.field1251.field3879, 0, (byte) -37);
                this.field1247.method111(arg0 - 141, var8);
            }
            for (int var9 = 0; var9 < 100; var9++) {
                int var10 = this.field1250.method1284(-1);
                if (var10 < 0) {
                    throw new IOException();
                }
                if (var10 == 0) {
                    break;
                }
                this.field1253 = 0;
                byte var11 = 0;
                if (this.field1258 == null) {
                    var11 = 8;
                } else if (this.field1258.field3588 == 0) {
                    var11 = 1;
                }
                if (var11 > 0) {
                    int var12 = var11 - this.field1254.field3905;
                    if (var10 < var12) {
                        var12 = var10;
                    }
                    this.field1250.method1279(this.field1254.field3905, this.field1254.field3879, var12, -88);
                    if (this.field1256 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field1254.field3879[this.field1254.field3905 + var13] = (byte) class281.method1877(this.field1254.field3879[this.field1254.field3905 + var13], this.field1256);
                        }
                    }
                    this.field1254.field3905 += var12;
                    if (this.field1254.field3905 >= var11) {
                        if (this.field1258 == null) {
                            this.field1254.field3905 = 0;
                            if (this.field1254.method1495((byte) 79) == -72057594037927937L) {
                                this.field1254.field3905 = 0;
                                var6 = true;
                            } else {
                                this.field1254.field3905 = 0;
                                int var14 = this.field1254.method1535((byte) 96);
                                int var15 = this.field1254.method1496(true);
                                long var16 = (long) ((var14 << 16) + var15);
                                int var18 = this.field1254.method1535((byte) 86);
                                int var19 = this.field1254.method1528(true);
                                Object var20 = null;
                                class210 var21 = (class210) this.field1243.method106(false);
                                label151: while (true) {
                                    if (var21 == null) {
                                        var21 = (class210) this.field1247.method106(false);
                                        while (true) {
                                            if (var21 == null || var21.field3034 == var16) {
                                                break label151;
                                            }
                                            var21 = (class210) this.field1247.method110((byte) -72);
                                        }
                                    }
                                    if (var21.field3034 == var16) {
                                        break;
                                    }
                                    var21 = (class210) this.field1243.method110((byte) -29);
                                }
                                if (var21 == null) {
                                    throw new IOException();
                                }
                                this.field1258 = var21;
                                int var22 = var18 == 0 ? 5 : 9;
                                this.field1258.field3576 = new class229(var19 + var22 + this.field1258.field3575);
                                this.field1258.field3576.method1499(true, var18);
                                this.field1258.field3576.method1515(var19, arg0 + 94);
                                this.field1254.field3905 = 0;
                                this.field1258.field3588 = 8;
                            }
                        } else if (this.field1258.field3588 != 0) {
                            throw new IOException();
                        } else if (this.field1254.field3879[0] == -1) {
                            this.field1254.field3905 = 0;
                            this.field1258.field3588 = 1;
                        } else {
                            this.field1258 = null;
                        }
                    }
                } else {
                    int var23 = this.field1258.field3576.field3879.length - this.field1258.field3575;
                    int var24 = 512 - this.field1258.field3588;
                    if (var24 > (var23 - this.field1258.field3576.field3905)) {
                        var24 = var23 - this.field1258.field3576.field3905;
                    }
                    if (var24 > var10) {
                        var24 = var10;
                    }
                    this.field1250.method1279(this.field1258.field3576.field3905, this.field1258.field3576.field3879, var24, -102);
                    if (this.field1256 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field1258.field3576.field3879[this.field1258.field3576.field3905 + var25] = (byte) class281.method1877(this.field1258.field3576.field3879[this.field1258.field3576.field3905 + var25], this.field1256);
                        }
                    }
                    this.field1258.field3576.field3905 += var24;
                    this.field1258.field3588 += var24;
                    if (this.field1258.field3576.field3905 == var23) {
                        this.field1258.method1168(4);
                        if (this.field1258.field600) {
                            this.field1244--;
                        } else {
                            this.field1249--;
                        }
                        this.field1258.field602 = false;
                        this.field1258 = null;
                    } else if (this.field1258.field3588 == 512) {
                        this.field1258.field3588 = 0;
                    }
                }
            }
            if (var6) {
                this.field1251.field3905 = 0;
                this.field1251.method1499(true, 5);
                this.field1250.method1278(4, this.field1251.field3879, 0, (byte) -37);
            }
            return true;
        } catch (IOException var30) {
            try {
                this.field1250.method1282(true);
            } catch (Exception var28) {
            }
            this.field1257++;
            this.field1250 = null;
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Llb;ZI)V", line = 624)
    public final void method476(class199 arg0, boolean arg1, int arg2) {
        if (this.field1250 != null) {
            try {
                this.field1250.method1282(true);
            } catch (Exception var11) {
            }
            this.field1250 = null;
        }
        field1241++;
        this.field1250 = arg0;
        this.method474(0);
        this.method467(arg2, arg1);
        if (arg2 != 4) {
            return;
        }
        this.field1254.field3905 = 0;
        this.field1258 = null;
        while (true) {
            class210 var5 = (class210) this.field1243.method114((byte) 47);
            if (var5 == null) {
                while (true) {
                    class210 var6 = (class210) this.field1247.method114((byte) 47);
                    if (var6 == null) {
                        if (this.field1256 != 0) {
                            try {
                                this.field1251.field3905 = 0;
                                this.field1251.method1499(true, 4);
                                this.field1251.method1499(true, this.field1256);
                                this.field1251.method1510((byte) 35, 0);
                                this.field1250.method1278(4, this.field1251.field3879, 0, (byte) -37);
                            } catch (IOException var10) {
                                try {
                                    this.field1250.method1282(true);
                                } catch (Exception var9) {
                                }
                                this.field1250 = null;
                                this.field1257++;
                            }
                        }
                        this.field1253 = 0;
                        this.field1248 = class216.method1426(255);
                        return;
                    }
                    this.field1246.method111(-125, var6);
                }
            }
            this.field1234.method111(arg2 - 49, var5);
        }
    }
}
