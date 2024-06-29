import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class9 {

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Lh;")
    private class42 field306 = new class42();

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Loc;")
    private class87 field316 = new class87();

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Lhd;")
    private class46 field321;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field299 = 0;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lad;")
    private static class5 field307 = class88.method674("Connecting to server)3)3)3", 37);

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Lad;")
    private static class5 field312 = class88.method674("Use", 117);

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field314 = 0;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lad;")
    private static class5 field301 = class88.method674("Invalid username or password)3", -125);

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Lad;")
    private static class5 field315 = class88.method674("Choose Option", 92);

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lad;")
    public static class5 field309 = field315;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "[Lad;")
    public static class5[] field311 = new class5[100];

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "Lad;")
    public static class5 field325 = field301;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "Lad;")
    public static class5 field324 = field307;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Lad;")
    public static class5 field318 = field312;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Lad;")
    public static class5 field326 = class88.method674("Ihr Charakter)2Profil wird in:", -101);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "J")
    public static long field320;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lrd;")
    public static class106 field303;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field305;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII[Ljd;Lqa;IIII[B)V", line = 4)
    public static final void method97(int arg0, int arg1, int arg2, int arg3, class58[] arg4, class97 arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        int var11 = 50 % ((arg9 + 40) / 58);
        field322++;
        class39 var12 = new class39(arg10);
        int var13 = -1;
        while (true) {
            int var14 = var12.method328((byte) 85);
            if (var14 == 0) {
                return;
            }
            int var15 = 0;
            var13 += var14;
            while (true) {
                int var16 = var12.method328((byte) 85);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method330(-30864);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg3 == var19 && arg6 <= var18 && var18 < arg6 + 8 && arg2 <= var17 && arg2 + 8 > var17) {
                    class70 var23 = class42.method357(var13, (byte) -42);
                    int var24 = class74.method587(var23.field1693, var18 & 0x7, (byte) 96, var17 & 0x7, var23.field1705, var22, arg1) + arg0;
                    int var25 = class120.method950(arg1, var23.field1705, var22, var17 & 0x7, var18 & 0x7, var23.field1693, 0) + arg8;
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg7;
                        if ((class12.field371[1][var24][var25] & 0x2) == 2) {
                            var26 = arg7 - 1;
                        }
                        class58 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg4[var26];
                        }
                        class102.method819(var13, var24, arg5, arg7, var27, (byte) -107, arg1 + var22 & 0x3, var21, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IJ)Lh;", line = 86)
    public final class42 method98(int arg0, long arg1) {
        if (arg0 != -8) {
            return null;
        }
        field300++;
        class42 var4 = (class42) this.field321.method408(arg1, 63);
        if (var4 != null) {
            this.field316.method664(var4, (byte) -3);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 112)
    public static void method99(int arg0) {
        field309 = null;
        field307 = null;
        field305 = null;
        field326 = null;
        field318 = null;
        field311 = null;
        field301 = null;
        if (arg0 != 0) {
            return;
        }
        field312 = null;
        field324 = null;
        field303 = null;
        field315 = null;
        field325 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BJ)V", line = 133)
    public final void method100(byte arg0, long arg1) {
        if (arg0 > -97) {
            this.method102(-52L, null, 56);
        }
        field323++;
        class42 var4 = (class42) this.field321.method408(arg1, 113);
        if (var4 != null) {
            var4.method114(-3789);
            var4.method355(-530883280);
            this.field319++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 156)
    public final void method101(byte arg0) {
        if (arg0 > -74) {
            return;
        }
        field302++;
        while (true) {
            class42 var2 = this.field316.method662((byte) -117);
            if (var2 == null) {
                this.field319 = this.field317;
                return;
            }
            var2.method114(-3789);
            var2.method355(-530883280);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(JLh;I)V", line = 193)
    public final void method102(long arg0, class42 arg1, int arg2) {
        if (this.field319 == 0) {
            class42 var5 = this.field316.method662((byte) -111);
            var5.method114(-3789);
            var5.method355(-530883280);
            if (this.field306 == var5) {
                class42 var6 = this.field316.method662((byte) -109);
                var6.method114(-3789);
                var6.method355(-530883280);
            }
        } else {
            this.field319--;
        }
        field298++;
        this.field321.method403(arg0, arg1, true);
        if (arg2 > 73) {
            this.field316.method664(arg1, (byte) -3);
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(I)V", line = 300)
    public class9(int arg0) {
        int var2 = 1;
        this.field319 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field317 = arg0;
        this.field321 = new class46(var2);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 273)
    public static final void method103(int arg0) {
        class27.method226(1, false, null, 0);
        field313++;
        if (arg0 >= -118) {
            method99(-104);
        }
    }
}
