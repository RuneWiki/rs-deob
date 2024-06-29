import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class155 extends class320 {

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public static int field2446 = -1;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field2438 = -60;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field2431;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public int field2432;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public int field2433;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public int field2434;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public int field2436;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public int field2439;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public int field2440;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public int field2442;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public int field2444;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public int field2445;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public int field2448;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fa", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field2449;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZLqa;)Lc;")
    public final class121 method1165(int arg0, boolean arg1, class162 arg2) {
        field2443++;
        if (arg1) {
            method1166(null, 62);
        }
        int var4 = class72.field1249[this.field2439];
        if (var4 == 0) {
            class241 var11 = class310.method2028(this.field2436, this.field2430, this.field2440);
            if (var11 instanceof class167) {
                class167 var12 = (class167) var11;
                if (var12.field2594 != null) {
                    return ((class248) var12.field2594).method23(arg2, 17793, arg0);
                }
            }
        } else if (var4 == 1) {
            class506 var5 = class462.method2745(this.field2436, this.field2430, this.field2440);
            if (var5 instanceof class36) {
                class36 var6 = (class36) var5;
                if (var6.field697 != null) {
                    return ((class248) var6.field697).method23(arg2, 17793, arg0);
                }
            }
        } else if (var4 == 2) {
            class417 var7 = class367.method2294(this.field2436, this.field2430, this.field2440, field2449 == null ? (field2449 = method1167("pa")) : field2449);
            if (var7 instanceof class65) {
                class65 var8 = (class65) var7;
                if (var8.field1109 != null) {
                    return ((class248) var8.field1109).method23(arg2, 17793, arg0);
                }
            }
        } else if (var4 == 3) {
            class480 var9 = class412.method2496(this.field2436, this.field2430, this.field2440);
            if (var9 instanceof class244) {
                class244 var10 = (class244) var9;
                if (var10.field3512 != null) {
                    return ((class248) var10.field3512).method23(arg2, 17793, arg0);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lqa;I)V")
    public static final void method1166(class162 arg0, int arg1) {
        field2435++;
        int var2 = class106.field1766;
        int var3 = class215.field3104;
        int var4 = class499.field7375;
        int var5 = class87.field1529;
        int var6 = -10660793;
        arg0.method1200(var6, var5, var2, var3, var4, arg1 + 16777226);
        arg0.method1200(arg1, 16, var2 + 1, var3 + 1, var4 - 2, 10);
        arg0.method1196(var4 - 2, var2 + 1, (byte) -54, var5 - 19, -16777216, var3 + 18);
        class310.field4726.method2913(-1, class297.field4210.method2180(client.field2870, 29491), -107, var6, var2 + 3, var3 + 14);
        int var7 = class166.field2579.method1024(true);
        int var8 = class166.field2579.method1019((byte) 3);
        int var9 = 0;
        for (class208 var10 = (class208) class339.field5122.method2427(126); var10 != null; var10 = (class208) class339.field5122.method2422(-76)) {
            int var11 = (class363.field5500 - var9 - 1) * 16 + (var3 + 31);
            short var12 = -1;
            if (var7 > var2 && var2 + var4 > var7 && var11 - 13 < var8 && var8 < (var11 + 3) && var10.field3002) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class2.method27(-45, var10.field3005)) {
                var13 = class367.field5550.method1312((byte) 91, (int) var10.field3012).field2126;
            } else if (var10.field3009 != -1) {
                var13 = class367.field5550.method1312((byte) 91, var10.field3009).field2126;
            } else if (class164.method1213(var10.field3005, (byte) -65)) {
                class255 var16 = class34.field668[(int) var10.field3012];
                if (var16 != null) {
                    class42 var17 = var16.field3677;
                    if (var17.field797 != null) {
                        var17 = var17.method427(class335.field5059, (byte) -77);
                    }
                    if (var17 != null) {
                        var13 = var17.field799;
                    }
                }
            } else if (class338.method2169(var10.field3005, 46)) {
                Object var14 = null;
                class79 var15;
                if (var10.field3005 == 1011) {
                    var15 = class319.field4807.method2874((int) var10.field3012, -17045);
                } else {
                    var15 = class319.field4807.method2874((int) (var10.field3012 >>> 32 & 0x7FFFFFFFL), arg1 + 16760171);
                }
                if (var15.field1370 != null) {
                    var15 = var15.method631(6574, class335.field5059);
                }
                if (var15 != null) {
                    var13 = var15.field1374;
                }
            }
            String var18 = class170.method1247(var10, 36096);
            if (var13 != null) {
                var18 = var18 + class58.method517(var13, 88);
            }
            class310.field4726.method2914((byte) -118, var2 + 3, class11.field186, var12, class378.field5719, var18, var11, 0);
            if (var10.field3004) {
                class377.field5711.method3137(var2 - (-class501.field7392.method2136(var18, 13216) - 5), var11 + -12);
            }
            var9++;
        }
        class259.method1672((byte) 77, class87.field1529, class215.field3104, class106.field1766, class499.field7375);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1167(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
