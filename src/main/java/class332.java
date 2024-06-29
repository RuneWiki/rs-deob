import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class332 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Ll;")
    public static class66 field5095 = new class66(64);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Lrn;")
    public static class18 field5099;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "[[I")
    public static int[][] field5096;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILua;Lug;B)V", line = 8)
    public static final void method2340(int arg0, class323 arg1, class25 arg2, byte arg3) {
        class34 var4 = new class34();
        field5094++;
        var4.field525 = arg2.method281(-125);
        if (arg3 > -49) {
            field5099 = (class18) null;
        }
        var4.field528 = arg2.method262((byte) 15);
        var4.field518 = new int[var4.field525];
        var4.field530 = new class95[var4.field525];
        var4.field522 = new int[var4.field525];
        var4.field516 = new class95[var4.field525];
        var4.field527 = new int[var4.field525];
        var4.field520 = new byte[var4.field525][][];
        for (int var5 = 0; var5 < var4.field525; var5++) {
            try {
                int var6 = arg2.method281(25);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    int var17 = 0;
                    String var18 = arg2.method297((byte) -123);
                    String var19 = arg2.method297((byte) -88);
                    if (var6 == 1) {
                        var17 = arg2.method262((byte) 41);
                    }
                    var4.field518[var5] = var6;
                    var4.field522[var5] = var17;
                    var4.field516[var5] = arg1.method2280(24491, class139.method1167(false, var18), var19);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method297((byte) -106);
                    String var8 = arg2.method297((byte) -56);
                    int var9 = arg2.method281(75);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method297((byte) -93);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method262((byte) 122);
                            var12[var13] = new byte[var14];
                            arg2.method301((byte) -56, var14, var12[var13], 0);
                        }
                    }
                    var4.field518[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class139.method1167(false, var10[var16]);
                    }
                    var4.field530[var5] = arg1.method2286(var15, (byte) -22, var8, class139.method1167(false, var7));
                    var4.field520[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field527[var5] = -1;
            } catch (SecurityException var26) {
                var4.field527[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field527[var5] = -3;
            } catch (Exception var28) {
                var4.field527[var5] = -4;
            } catch (Throwable var29) {
                var4.field527[var5] = -5;
            }
        }
        class294.field4575.method2245(var4, 104);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 137)
    public static void method2341(byte arg0) {
        field5099 = null;
        field5095 = null;
        field5096 = (int[][]) null;
        if (arg0 != 117) {
            method2343(-29, 89);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Ljava/lang/String;", line = 149)
    public static final String method2342(int arg0) {
        field5097++;
        String var1 = "www";
        if (arg0 != -2490) {
            method2342(-27);
        }
        if (class353.field5636 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class181.field2853 != null) {
            var2 = "/p=" + class181.field2853;
        }
        return "http://" + var1 + ".runescape.com/l=" + class339.field5211 + "/a=" + class350.field5549 + var2 + "/";
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Ljl;", line = 172)
    public static final class300 method2343(int arg0, int arg1) {
        field5093++;
        int var2 = 98 % ((27 - arg0) / 37);
        class300 var3 = (class300) class9.field129.method654(-97, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class128.field2124.method187(3, arg1, -1);
        class300 var5 = new class300();
        if (var4 != null) {
            var5.method2163(-6, new class25(var4));
        }
        class9.field129.method652(-104, var5, (long) arg1);
        return var5;
    }
}
