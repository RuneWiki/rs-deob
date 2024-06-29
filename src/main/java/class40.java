import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class40 extends class156 {

    @OriginalMember(owner = "client!fd", name = "zb", descriptor = "I")
    private int field739;

    @OriginalMember(owner = "client!fd", name = "ub", descriptor = "I")
    private int field734;

    @OriginalMember(owner = "client!fd", name = "vb", descriptor = "I")
    private int field735;

    @OriginalMember(owner = "client!fd", name = "yb", descriptor = "I")
    private int field738;

    @OriginalMember(owner = "client!fd", name = "tb", descriptor = "I")
    private int field733;

    @OriginalMember(owner = "client!fd", name = "Ib", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "client!fd", name = "Gb", descriptor = "Ltb;")
    private class134 field746;

    @OriginalMember(owner = "client!fd", name = "Mb", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "client!fd", name = "Lb", descriptor = "I")
    private int field751;

    @OriginalMember(owner = "client!fd", name = "Bb", descriptor = "Lsc;")
    public static class128 field741 = class129.method1017(false, "<col=ffff00>");

    @OriginalMember(owner = "client!fd", name = "Ab", descriptor = "Z")
    public static boolean field740 = false;

    @OriginalMember(owner = "client!fd", name = "Eb", descriptor = "Lsc;")
    private static class128 field744 = class129.method1017(false, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!fd", name = "sb", descriptor = "[I")
    public static int[] field732 = new int[] { 32, 40, 15, 10, 34, 36, 51, 8 };

    @OriginalMember(owner = "client!fd", name = "Hb", descriptor = "Lsc;")
    public static class128 field747 = class129.method1017(false, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!fd", name = "Kb", descriptor = "I")
    public static int field750 = 0;

    @OriginalMember(owner = "client!fd", name = "Fb", descriptor = "Lsc;")
    public static class128 field745 = class129.method1017(false, "Mem:");

    @OriginalMember(owner = "client!fd", name = "Ob", descriptor = "J")
    public static long field754 = 0L;

    @OriginalMember(owner = "client!fd", name = "Nb", descriptor = "Lsc;")
    public static class128 field753 = field744;

    @OriginalMember(owner = "client!fd", name = "wb", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!fd", name = "xb", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!fd", name = "Cb", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!fd", name = "Db", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!fd", name = "Jb", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!fd", name = "Pb", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)Lsc;")
    public static final class128 method287(byte arg0, int arg1) {
        if (arg0 < 120) {
            field740 = true;
        }
        field737++;
        return class105.field2394[arg1].method1014(-9) > 0 ? class51.method395(new class128[] { class120.field2738[arg1], class64.field1370, class105.field2394[arg1] }, false) : class120.field2738[arg1];
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
    public static final void method288(int arg0) {
        while (true) {
            if (class158.field3626.method510(true, class128.field2942) >= 27) {
                int var1 = class158.field3626.method512(15, (byte) -78);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class92.field2104[var1] == null) {
                        var2 = true;
                        class92.field2104[var1] = new class51();
                    }
                    class51 var3 = class92.field2104[var1];
                    class68.field1528[class41.field767++] = var1;
                    var3.field1006 = class29.field554;
                    int var4 = class100.field2299[class158.field3626.method512(3, (byte) -78)];
                    if (var2) {
                        var3.field985 = var3.field1012 = var4;
                    }
                    int var5 = class158.field3626.method512(1, (byte) -78);
                    int var6 = class158.field3626.method512(1, (byte) -78);
                    if (var6 == 1) {
                        class55.field1228[class124.field2802++] = var1;
                    }
                    int var7 = class158.field3626.method512(5, (byte) -78);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var3.field1028 = class69.method518(true, class158.field3626.method512(14, (byte) -78));
                    int var8 = class158.field3626.method512(5, (byte) -78);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field1010 = var3.field1028.field1293;
                    var3.field1018 = var3.field1028.field1278;
                    var3.field960 = var3.field1028.field1290;
                    var3.field963 = var3.field1028.field1297;
                    var3.field994 = var3.field1028.field1309;
                    var3.field953 = var3.field1028.field1285;
                    var3.field1009 = var3.field1028.field1284;
                    var3.field977 = var3.field1028.field1269;
                    var3.field1013 = var3.field1028.field1307;
                    if (var3.field953 == 0) {
                        var3.field1012 = 0;
                    }
                    var3.method389(class151.field3473.field989[0] + var8, var5 == 1, class151.field3473.field962[0] + var7, (byte) 80);
                    continue;
                }
            }
            field736++;
            if (arg0 != 23097) {
                field741 = null;
            }
            class158.field3626.method511(false);
            return;
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)Llb;")
    public final class78 method1(int arg0) {
        field749++;
        if (this.field746 != null) {
            int var2 = class29.field554 - this.field751;
            if (var2 > 100 && this.field746.field3158 > 0) {
                var2 = 100;
            }
            label52: {
                do {
                    do {
                        if (this.field746.field3162[this.field752] >= var2) {
                            break label52;
                        }
                        var2 -= this.field746.field3162[this.field752];
                        this.field752++;
                    } while (this.field746.field3142.length > this.field752);
                    this.field752 -= this.field746.field3158;
                } while (this.field752 >= 0 && this.field746.field3142.length > this.field752);
                this.field746 = null;
            }
            this.field751 = class29.field554 - var2;
        }
        class94 var3 = class147.method1185(-2, this.field738);
        if (var3.field2164 != null) {
            var3 = var3.method735(-118);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field735 == 1 || this.field735 == 3) {
            var5 = var3.field2195;
            var4 = var3.field2166;
        } else {
            var4 = var3.field2195;
            var5 = var3.field2166;
        }
        int var6 = (var4 + 1 >> 1) + this.field734;
        int var7 = (var5 >> 1) + this.field748;
        int var8 = (var4 >> 1) + this.field734;
        int[][] var9 = class55.field1229[this.field739];
        int var10 = (this.field748 << 7) + (var5 << 6);
        if (arg0 != -20521144) {
            this.field735 = 116;
        }
        int var11 = this.field748 + (var5 + 1 >> 1);
        int var12 = (this.field734 << 7) + (var4 << 6);
        int var13 = var9[var7][var6] + var9[var11][var8] + var9[var7][var8] + var9[var11][var6] >> 2;
        return var3.method746((byte) -63, this.field735, this.field733, var10, var13, this.field746, var9, var12, this.field752);
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
    public static void method289(int arg0) {
        field745 = null;
        field741 = null;
        field753 = null;
        field747 = null;
        field744 = null;
        if (arg0 >= -109) {
            field732 = null;
        }
        field732 = null;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V")
    public static final void method290(byte arg0) {
        if (arg0 != -113) {
            field744 = null;
        }
        field742++;
        for (int var1 = 0; var1 < class55.field1232; var1++) {
            int var10002 = class64.field1401[var1]--;
            if (class64.field1401[var1] >= -10) {
                class17 var3 = class93.field2132[var1];
                if (var3 == null) {
                    var3 = class17.method158(class108.field2446, class144.field3362[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class64.field1401[var1] += var3.method156();
                    class93.field2132[var1] = var3;
                }
                if (class64.field1401[var1] < 0) {
                    int var4;
                    if (class110.field2490[var1] == 0) {
                        var4 = class50.field967;
                    } else {
                        int var5 = (class110.field2490[var1] & 0xFF) * 128;
                        int var6 = class110.field2490[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class151.field3473.field975;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class110.field2490[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class151.field3473.field987;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var5 < var10) {
                            class64.field1401[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class143.field3348 / var5;
                    }
                    if (var4 > 0) {
                        class139 var11 = var3.method157().method1144(class72.field1620);
                        class107 var12 = class107.method807(var11, 100, var4);
                        var12.method814(class60.field1301[var1] - 1);
                        class92.field2088.method438(var12);
                    }
                    class64.field1401[var1] = -100;
                }
            } else {
                class55.field1232--;
                for (int var2 = var1; var2 < class55.field1232; var2++) {
                    class144.field3362[var2] = class144.field3362[var2 + 1];
                    class93.field2132[var2] = class93.field2132[var2 + 1];
                    class60.field1301[var2] = class60.field1301[var2 + 1];
                    class64.field1401[var2] = class64.field1401[var2 + 1];
                    class110.field2490[var2] = class110.field2490[var2 + 1];
                }
                var1--;
            }
        }
        if (class67.field1511 && !class49.method350((byte) -121)) {
            if (class149.field3440 != 0 && class141.field3305 != -1) {
                class79.method595(0, class36.field701, 1, class141.field3305, false, class149.field3440);
            }
            class67.field1511 = false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public static final void method291(boolean arg0) {
        class131.field3036.method919((byte) -104);
        if (arg0) {
            field755++;
            class65.field1444.method919((byte) -104);
            class112.field2540.method919((byte) -104);
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIIIIIZLwc;)V")
    public class40(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class156 arg8) {
        this.field739 = arg3;
        this.field734 = arg5;
        this.field735 = arg2;
        this.field738 = arg0;
        this.field733 = arg1;
        this.field748 = arg4;
        if (arg6 != -1) {
            this.field746 = class70.method527(12, arg6);
            this.field752 = 0;
            this.field751 = class29.field554 - 1;
            if (this.field746.field3159 == 0 && arg8 != null && arg8 instanceof class40) {
                class40 var10 = (class40) arg8;
                if (this.field746 == var10.field746) {
                    this.field751 = var10.field751;
                    this.field752 = var10.field752;
                    return;
                }
            }
            if (arg7 && this.field746.field3158 != -1) {
                this.field752 = (int) ((double) this.field746.field3142.length * Math.random());
                this.field751 -= (int) ((double) this.field746.field3162[this.field752] * Math.random());
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field743++;
        class16 var10 = null;
        if (arg4 != 34) {
            method292(-76, 54, 71, 114, 94, -107, -89, -124, -73, -10);
        }
        for (class16 var11 = (class16) class90.field2048.method920((byte) -64); var11 != null; var11 = (class16) class90.field2048.method932(arg4 ^ 0xFFFFFFD8)) {
            if (var11.field306 == arg0 && var11.field296 == arg5 && var11.field287 == arg7 && var11.field301 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class16();
            var10.field287 = arg7;
            var10.field306 = arg0;
            var10.field301 = arg3;
            var10.field296 = arg5;
            class9.method72(19026, var10);
            class90.field2048.method926(5569, var10);
        }
        var10.field300 = arg6;
        var10.field292 = arg1;
        var10.field295 = arg2;
        var10.field286 = arg9;
        var10.field293 = arg8;
    }
}
