import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class93 extends class121 {

    @OriginalMember(owner = "client!n", name = "S", descriptor = "Z")
    public boolean field2249 = false;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public int field2250 = -1;

    @OriginalMember(owner = "client!n", name = "cb", descriptor = "[S")
    private short[] field2259 = new short[6];

    @OriginalMember(owner = "client!n", name = "gb", descriptor = "[I")
    private int[] field2263 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!n", name = "W", descriptor = "[S")
    private short[] field2253 = new short[6];

    @OriginalMember(owner = "client!n", name = "U", descriptor = "Loc;")
    public static class99 field2251 = null;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "Loc;")
    public static class99 field2256 = class48.method402((byte) -104, "Die Verbindung konnte");

    @OriginalMember(owner = "client!n", name = "bb", descriptor = "Loc;")
    private static class99 field2258 = class48.method402((byte) -104, "Accept trade");

    @OriginalMember(owner = "client!n", name = "R", descriptor = "Loc;")
    public static class99 field2248 = field2258;

    @OriginalMember(owner = "client!n", name = "jb", descriptor = "Loc;")
    public static class99 field2266 = class48.method402((byte) -104, "lila:");

    @OriginalMember(owner = "client!n", name = "sb", descriptor = "[J")
    public static long[] field2275 = new long[32];

    @OriginalMember(owner = "client!n", name = "mb", descriptor = "I")
    public static int field2269 = 0;

    @OriginalMember(owner = "client!n", name = "ob", descriptor = "Loc;")
    private static class99 field2271 = class48.method402((byte) -104, "Connection timed out)3");

    @OriginalMember(owner = "client!n", name = "nb", descriptor = "Loc;")
    public static class99 field2270 = class48.method402((byte) -104, "backbase1");

    @OriginalMember(owner = "client!n", name = "pb", descriptor = "Loc;")
    public static class99 field2272 = field2271;

    @OriginalMember(owner = "client!n", name = "qb", descriptor = "I")
    public static int field2273 = 0;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!n", name = "db", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!n", name = "eb", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!n", name = "fb", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!n", name = "ib", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!n", name = "kb", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!n", name = "lb", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!n", name = "rb", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!n", name = "tb", descriptor = "Lef;")
    public static class35 field2276;

    @OriginalMember(owner = "client!n", name = "hb", descriptor = "Ljava/awt/Image;")
    public static Image field2264;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "[I")
    private int[] field2255;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lib;I)V")
    public final void method764(class57 arg0, int arg1) {
        field2265++;
        while (true) {
            int var3 = arg0.method510(-111);
            if (var3 == 0) {
                int var4 = 105 % ((84 - arg1) / 33);
                return;
            }
            this.method765(arg0, -41, var3);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lib;II)V")
    private final void method765(class57 arg0, int arg1, int arg2) {
        field2261++;
        if (arg2 == 1) {
            this.field2250 = arg0.method510(-109);
        } else if (arg2 == 2) {
            int var4 = arg0.method510(arg1 ^ 0x58);
            this.field2255 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2255[var5] = arg0.method506(arg1 + 40);
            }
        } else if (arg2 == 3) {
            this.field2249 = true;
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field2253[arg2 - 40] = (short) arg0.method506(-1);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field2259[arg2 - 50] = (short) arg0.method506(class69.method609(arg1, 40));
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2263[arg2 - 60] = arg0.method506(-1);
        }
        if (arg1 != -41) {
            method772(null, -47, -67, (byte) 115, -30, 102, -28, 4);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)Z")
    public final boolean method766(int arg0) {
        field2260++;
        if (arg0 <= 17) {
            this.method767(50);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2263[var3] != -1 && !class148.field3678.method884(-1, this.field2263[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)Z")
    public final boolean method767(int arg0) {
        field2254++;
        if (this.field2255 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = -12 % ((arg0 + 10) / 58);
        for (int var4 = 0; var4 < this.field2255.length; var4++) {
            if (!class148.field3678.method884(-1, this.field2255[var4], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)Ltc;")
    public final class129 method768(int arg0) {
        class129[] var2 = new class129[5];
        field2252++;
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2263[var4] != -1) {
                var2[var3++] = class129.method1060(class148.field3678, this.field2263[var4], 0);
            }
        }
        if (arg0 != 8936) {
            field2272 = null;
        }
        class129 var5 = new class129(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field2253[var6] != 0; var6++) {
            var5.method1043(this.field2253[var6], this.field2259[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Loc;")
    public static final class99 method769(int arg0, int arg1) {
        field2257++;
        class99 var2 = new class99();
        var2.field2391 = arg1;
        var2.field2394 = new byte[arg0];
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)Ltc;")
    public final class129 method770(byte arg0) {
        field2262++;
        if (this.field2255 == null) {
            return null;
        }
        class129[] var2 = new class129[this.field2255.length];
        for (int var3 = 0; var3 < this.field2255.length; var3++) {
            var2[var3] = class129.method1060(class148.field3678, this.field2255[var3], 0);
        }
        class129 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class129(var2, var2.length);
        }
        if (arg0 == -22) {
            for (int var5 = 0; var5 < 6 && this.field2253[var5] != 0; var5++) {
                var4.method1043(this.field2253[var5], this.field2259[var5]);
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
    public static void method771(int arg0) {
        field2275 = null;
        if (arg0 != 25469) {
            field2272 = null;
        }
        field2264 = null;
        field2251 = null;
        field2270 = null;
        field2276 = null;
        field2272 = null;
        field2248 = null;
        field2266 = null;
        field2271 = null;
        field2256 = null;
        field2258 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lib;IIBIIII)V")
    public static final void method772(class57 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= 0 && arg4 < 104 && arg2 >= 0 && arg2 < 104) {
            class81.field2028[arg5][arg4][arg2] = 0;
            while (true) {
                int var8 = arg0.method510(-125);
                if (var8 == 0) {
                    if (arg5 == 0) {
                        class121.field2964[0][arg4][arg2] = -class95.method781(-17149, arg4 + arg7 + 932731, arg1 + 556238 + arg2) * 8;
                    } else {
                        class121.field2964[arg5][arg4][arg2] = class121.field2964[arg5 - 1][arg4][arg2] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg0.method510(-128);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg5 == 0) {
                        class121.field2964[0][arg4][arg2] = -var9 * 8;
                    } else {
                        class121.field2964[arg5][arg4][arg2] = class121.field2964[arg5 - 1][arg4][arg2] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class2.field39[arg5][arg4][arg2] = arg0.method485(104);
                    class133.field3259[arg5][arg4][arg2] = (byte) ((var8 - 2) / 4);
                    class4.field74[arg5][arg4][arg2] = (byte) class17.method171(arg6 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class81.field2028[arg5][arg4][arg2] = (byte) (var8 - 49);
                } else {
                    class20.field486[arg5][arg4][arg2] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg0.method510(-116);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg0.method510(-113);
                    break;
                }
                if (var10 <= 49) {
                    arg0.method510(-120);
                }
            }
        }
        field2268++;
        int var11 = -76 / ((arg3 - 39) / 32);
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "(I)V")
    public static final void method773(int arg0) {
        try {
            Graphics var1 = class5.field99.getGraphics();
            class59.field1578.method109(553, 205, 0, var1);
        } catch (Exception var2) {
            class5.field99.repaint();
        }
        field2274++;
        if (arg0 > -60) {
            field2258 = null;
        }
    }
}
