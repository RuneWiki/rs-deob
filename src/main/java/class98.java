import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class98 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lnp;")
    private class85 field1365 = new class85();

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Lvi;")
    private class476 field1375 = new class476();

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    private int field1377;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Ljr;")
    private class357 field1376;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lgp;")
    public static class459 field1366 = new class459(9, 7);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
    public static boolean field1368;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lnp;JI)V")
    public final void method668(class85 arg0, long arg1, int arg2) {
        if (~this.field1373 == arg2) {
            class85 var5 = this.field1375.method2861((byte) -124);
            var5.method3021(-125);
            var5.method540((byte) -127);
            if (this.field1365 == var5) {
                class85 var6 = this.field1375.method2861((byte) -124);
                var6.method3021(-97);
                var6.method540((byte) -69);
            }
        } else {
            this.field1373--;
        }
        field1369++;
        this.field1376.method2096(arg1, arg0, (byte) 76);
        this.field1375.method2858(arg2 ^ 0xFFFFFFF0, arg0);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([Leo;II)V")
    public static final void method669(class423[] arg0, int arg1, int arg2) {
        for (int var3 = arg1; var3 < arg0.length; var3++) {
            class423 var4 = arg0[var3];
            if (var4 != null && var4.field5823 == arg2 && !client.method3033(var4)) {
                if (var4.field5741 == 0) {
                    method669(arg0, arg1, var4.field5734);
                    if (var4.field5679 != null) {
                        method669(var4.field5679, 0, var4.field5734);
                    }
                    class367 var5 = (class367) class381.field4963.method2085((long) var4.field5734, -5423);
                    if (var5 != null) {
                        class438.method2588(var5.field4719, 2272);
                    }
                }
                if (var4.field5741 == 6 && var4.field5792 != -1) {
                    class44 var6 = class403.field5429.method1962(var4.field5792, false);
                    if (var6 != null) {
                        var4.field5691 += class314.field4050;
                        while (var6.field647[var4.field5667] < var4.field5691) {
                            var4.field5691 -= var6.field647[var4.field5667];
                            var4.field5667++;
                            if (var6.field640.length <= var4.field5667) {
                                var4.field5667 -= var6.field657;
                                if (var4.field5667 < 0 || var6.field640.length <= var4.field5667) {
                                    var4.field5667 = 0;
                                }
                            }
                            var4.field5807 = var4.field5667 + 1;
                            if (var4.field5807 >= var6.field640.length) {
                                var4.field5807 -= var6.field657;
                                if (var4.field5807 < 0 || var6.field640.length <= var4.field5807) {
                                    var4.field5807 = -1;
                                }
                            }
                            class415.method2440(10, var4);
                        }
                    }
                }
            }
        }
        field1371++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)I")
    public static final int method670(int arg0, int arg1, int arg2, int arg3) {
        field1367++;
        if (arg0 != 17629) {
            return -98;
        } else if ((class8.field76[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (class8.field76[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public final void method671(boolean arg0) {
        this.field1375.method2862(97);
        field1364++;
        this.field1376.method2088((byte) 116);
        this.field1365 = new class85();
        if (!arg0) {
            method673((byte) 37);
        }
        this.field1373 = this.field1377;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JB)Lnp;")
    public final class85 method672(long arg0, byte arg1) {
        if (arg1 != -75) {
            return null;
        }
        field1372++;
        class85 var4 = (class85) this.field1376.method2085(arg0, -5423);
        if (var4 != null) {
            this.field1375.method2858(15, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method673(byte arg0) {
        field1366 = null;
        if (arg0 != -52) {
            field1374 = -41;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    public static final void method674(int arg0, int arg1) {
        class254 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class251 var4 = class405.field5436[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class13.field230; var5++) {
                    for (int var6 = 0; var6 < class166.field2155; var6++) {
                        var2 = var4.method1180(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class169.field2206;
                            int var8 = var5 << class169.field2206;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class251 var10 = class405.field5436[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1187(var6, var5) - var10.method1187(var6, var5);
                                    int var12 = var4.method1187(var6 + 1, var5) - var10.method1187(var6 + 1, var5);
                                    int var13 = var4.method1187(var6 + 1, var5 + 1) - var10.method1187(var6 + 1, var5 + 1);
                                    int var14 = var4.method1187(var6, var5 + 1) - var10.method1187(var6, var5 + 1);
                                    var10.method1181(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
    public class98(int arg0) {
        this.field1373 = arg0;
        this.field1377 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1376 = new class357(var2);
    }
}
