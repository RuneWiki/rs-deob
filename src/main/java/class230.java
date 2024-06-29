import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class230 {

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Z")
    public static boolean field3256 = false;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "[J")
    public static long[] field3264 = new long[500];

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "F")
    public static float field3261;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lkm;")
    public static class133 field3258;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "[I")
    public static int[] field3259;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 10)
    public static void method1595(int arg0) {
        if (arg0 >= -13) {
            method1596((class316) null, -64);
        }
        field3259 = null;
        field3258 = null;
        field3264 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lcg;I)Lob;", line = 25)
    public static final class83 method1596(class316 arg0, int arg1) {
        field3255++;
        if (arg1 != -665979312) {
            field3254 = 97;
        }
        class83 var2 = new class83();
        var2.field1204 = arg0.method2220((byte) 87);
        var2.field1200 = class142.method1023((byte) 27, var2.field1204);
        return var2;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLan;)V", line = 39)
    public static final void method1597(boolean arg0, class3 arg1) {
        field3265++;
        arg1.field25 = false;
        if (arg1.field23 != null) {
            arg1.field23.field807 = 0;
        }
        class3 var2 = arg1.method12();
        if (!arg0) {
            method1597(false, (class3) null);
        }
        while (var2 != null) {
            method1597(arg0, var2);
            var2 = arg1.method17();
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILsc;)V", line = 67)
    public static final void method1598(int arg0, class329 arg1) {
        if (arg0 != 9707) {
            field3263 = -109;
        }
        field3262++;
        for (class98 var2 = (class98) class174.field2372.method1335(arg0 - 9706); var2 != null; var2 = (class98) class174.field2372.method1336(3)) {
            if (var2.field1334 == arg1) {
                if (var2.field1333 != null) {
                    class160.field2196.method1130(var2.field1333);
                    var2.field1333 = null;
                }
                var2.method1274((byte) -26);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lin;II)V", line = 104)
    public static final void method1599(class344[] arg0, int arg1, int arg2) {
        field3257++;
        for (int var3 = arg2; var3 < arg0.length; var3++) {
            class344 var4 = arg0[var3];
            if (var4 != null && var4.field5246 == arg1 && (!var4.field5267 || !client.method815(var4))) {
                if (var4.field5316 == 0) {
                    if (!var4.field5267 && client.method815(var4) && class339.field5095 != var4) {
                        continue;
                    }
                    method1599(arg0, var4.field5206, arg2);
                    if (var4.field5248 != null) {
                        method1599(var4.field5248, var4.field5206, 0);
                    }
                    class48 var5 = (class48) class211.field3056.method111(71, (long) var4.field5206);
                    if (var5 != null) {
                        class28.method170((byte) -119, var5.field595);
                    }
                }
                if (var4.field5316 == 6) {
                    if (var4.field5272 != -1 || var4.field5253 != -1) {
                        boolean var6 = class145.method1044(var4, (byte) -49);
                        int var7;
                        if (var6) {
                            var7 = var4.field5253;
                        } else {
                            var7 = var4.field5272;
                        }
                        if (var7 != -1) {
                            class125 var8 = class52.method361(true, var7);
                            if (var8 != null) {
                                var4.field5233 += class287.field4278;
                                while (var8.field1706[var4.field5205] < var4.field5233) {
                                    var4.field5233 -= var8.field1706[var4.field5205];
                                    var4.field5205++;
                                    if (var8.field1707.length <= var4.field5205) {
                                        var4.field5205 -= var8.field1687;
                                        if (var4.field5205 < 0 || var4.field5205 >= var8.field1707.length) {
                                            var4.field5205 = 0;
                                        }
                                    }
                                    var4.field5328 = var4.field5205 + 1;
                                    if (var4.field5328 >= var8.field1707.length) {
                                        var4.field5328 -= var8.field1687;
                                        if (var4.field5328 < 0 || var8.field1707.length <= var4.field5328) {
                                            var4.field5328 = -1;
                                        }
                                    }
                                    class255.method1741(var4, false);
                                }
                            }
                        }
                    }
                    if (var4.field5311 != 0 && !var4.field5267) {
                        int var9 = var4.field5311 << 16 >> 16;
                        int var10 = class287.field4278 * var9;
                        var4.field5241 = var4.field5241 + var10 & 0x7FF;
                        int var11 = var4.field5311 >> 16;
                        int var12 = class287.field4278 * var11;
                        var4.field5172 = var4.field5172 + var12 & 0x7FF;
                        class255.method1741(var4, false);
                    }
                }
            }
        }
    }
}
