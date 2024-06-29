import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class115 extends class213 {

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "Lob;")
    public static class141 field2201 = class175.method1195(40, " )2> ");

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "[I")
    public static int[] field2203 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "Lob;")
    public static class141 field2202 = class175.method1195(40, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public int field2195;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public int field2217;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public int field2218;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public int field2219;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "Loa;")
    public class140 field2209;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "Lt;")
    public static class189 field2200;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "Ltd;")
    public class193 field2216;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Lfi;")
    public class60 field2193;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "Lid;")
    public class84 field2196;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([Lra;II)V")
    public static final void method739(class170[] arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class170 var4 = arg0[var3];
            if (var4 != null && var4.field3400 == arg1 && (!var4.field3305 || !class20.method122((byte) -84, var4))) {
                if (var4.field3392 == 0) {
                    if (!var4.field3305 && class20.method122((byte) -125, var4) && class167.field3222 != var4) {
                        continue;
                    }
                    method739(arg0, var4.field3396, -127);
                    if (var4.field3337 != null) {
                        method739(var4.field3337, var4.field3396, -118);
                    }
                    class174 var5 = (class174) class173.field3437.method792((long) var4.field3396, 22346);
                    if (var5 != null) {
                        class76.method533(var5.field3454, -104);
                    }
                }
                if (var4.field3392 == 6) {
                    if (var4.field3379 != -1 || var4.field3388 != -1) {
                        boolean var6 = class135.method851(var4, 0);
                        int var7;
                        if (var6) {
                            var7 = var4.field3388;
                        } else {
                            var7 = var4.field3379;
                        }
                        if (var7 != -1) {
                            class26 var8 = class114.method736(15619, var7);
                            if (var8 != null) {
                                var4.field3345 += class34.field695;
                                while (var8.field496[var4.field3406] < var4.field3345) {
                                    var4.field3345 -= var8.field496[var4.field3406];
                                    var4.field3406++;
                                    if (var4.field3406 >= var8.field499.length) {
                                        var4.field3406 -= var8.field494;
                                        if (var4.field3406 < 0 || var8.field499.length <= var4.field3406) {
                                            var4.field3406 = 0;
                                        }
                                    }
                                    class38.method252(var4, -124);
                                }
                            }
                        }
                    }
                    if (var4.field3351 != 0 && !var4.field3305) {
                        int var9 = var4.field3351 >> 16;
                        int var10 = var4.field3351 << 16 >> 16;
                        int var11 = class34.field695 * var10;
                        int var12 = class34.field695 * var9;
                        var4.field3306 = var4.field3306 + var11 & 0x7FF;
                        var4.field3272 = var4.field3272 + var12 & 0x7FF;
                        class38.method252(var4, -96);
                    }
                }
            }
        }
        if (arg2 > -113) {
            method740(78);
        }
        field2212++;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)I")
    public static final int method740(int arg0) {
        if (arg0 < 55) {
            field2202 = null;
        }
        field2213++;
        return class70.field1407;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public final void method741(int arg0) {
        field2215++;
        this.field2196 = null;
        this.field2193 = null;
        if (arg0 > -27) {
            this.field2209 = null;
        }
        this.field2216 = null;
        this.field2209 = null;
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static void method742(int arg0) {
        if (arg0 > -68) {
            method740(67);
        }
        field2203 = null;
        field2200 = null;
        field2202 = null;
        field2201 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)Lfa;")
    public static final class52 method743(boolean arg0) {
        class52 var1 = new class52();
        var1.field1004 = class224.field4225[0];
        field2206++;
        var1.field1003 = class201.field3801[0];
        var1.field1002 = class30.field581[0];
        var1.field1000 = class114.field2186[0];
        var1.field1001 = class16.field291;
        var1.field998 = class30.field578[0];
        if (arg0) {
            return null;
        } else {
            var1.field999 = class196.field3743;
            var1.field997 = class103.field1989;
            class88.method601(-54);
            return var1;
        }
    }
}
