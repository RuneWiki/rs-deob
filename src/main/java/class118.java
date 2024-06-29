import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class118 extends class119 {

    @OriginalMember(owner = "client!n", name = "A", descriptor = "Z")
    public boolean field2283 = false;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
    public static int[] field2274 = new int[128];

    @OriginalMember(owner = "client!n", name = "t", descriptor = "[[B")
    public static byte[][] field2276 = new byte[1000][];

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Z")
    public static boolean field2275 = false;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "Lai;")
    public static class10 field2280 = class44.method278("Standort", -70);

    @OriginalMember(owner = "client!n", name = "z", descriptor = "Lai;")
    private static class10 field2282 = class44.method278(" has logged out)3", 126);

    @OriginalMember(owner = "client!n", name = "B", descriptor = "Lai;")
    public static class10 field2284 = field2282;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public int field2272;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public int field2281;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "[I")
    public static int[] field2273;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILta;)V")
    public static final void method842(int arg0, class173 arg1) {
        int var2 = -102 % ((84 - arg0) / 42);
        for (int var3 = 0; var3 < class13.field210.length; var3++) {
            class13.field210[var3] = 0;
        }
        field2277++;
        short var4 = 256;
        for (int var5 = 0; var5 < 5000; var5++) {
            int var17 = (int) (Math.random() * 128.0D * (double) var4);
            class13.field210[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var13 = 1; var13 < var4 - 1; var13++) {
                for (int var15 = 1; var15 < 127; var15++) {
                    int var16 = (var13 << 7) + var15;
                    class133.field2505[var16] = (class13.field210[var16 + 128] + class13.field210[var16 + 1] + class13.field210[var16 - 1] + class13.field210[var16 + -128]) / 4;
                }
            }
            int[] var14 = class13.field210;
            class13.field210 = class133.field2505;
            class133.field2505 = var14;
        }
        if (arg1 == null) {
            return;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg1.field3342; var8++) {
            for (int var9 = 0; var9 < arg1.field3341; var9++) {
                if (arg1.field3338[var7++] != 0) {
                    int var10 = arg1.field3343 + var8 + 16;
                    int var11 = arg1.field3340 + var9 + 16;
                    int var12 = (var10 << 7) + var11;
                    class13.field210[var12] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method843(byte arg0) {
        field2276 = null;
        field2273 = null;
        field2274 = null;
        field2280 = null;
        if (arg0 == -103) {
            field2282 = null;
            field2284 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lih;ILme;B)V")
    public static final void method844(class81 arg0, int arg1, class114 arg2, byte arg3) {
        field2285++;
        class73 var4 = new class73();
        var4.field1255 = arg2.method767(true);
        var4.field1256 = arg2.method761(255);
        var4.field1246 = new byte[var4.field1255][][];
        var4.field1261 = new int[var4.field1255];
        var4.field1259 = new class22[var4.field1255];
        var4.field1251 = new int[var4.field1255];
        var4.field1254 = new int[var4.field1255];
        var4.field1258 = new class22[var4.field1255];
        for (int var5 = 0; var5 < var4.field1255; var5++) {
            try {
                int var6 = arg2.method767(true);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg2.method764((byte) 13).method45((byte) 111));
                    String var18 = new String(arg2.method764((byte) 101).method45((byte) 83));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method761(255);
                    }
                    var4.field1251[var5] = var6;
                    var4.field1261[var5] = var19;
                    var4.field1259[var5] = arg0.method496(-9037, var18, class82.method505(var17, (byte) 32));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg2.method764((byte) 17).method45((byte) 80));
                    String var8 = new String(arg2.method764((byte) -124).method45((byte) 120));
                    int var9 = arg2.method767(true);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg2.method764((byte) 111).method45((byte) 100));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method761(255);
                            var12[var13] = new byte[var14];
                            arg2.method776(var14, var12[var13], 0, (byte) -82);
                        }
                    }
                    var4.field1251[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class82.method505(var10[var16], (byte) 32);
                    }
                    var4.field1258[var5] = arg0.method500(class82.method505(var7, (byte) 32), (byte) 52, var8, var15);
                    var4.field1246[var5] = var12;
                }
            } catch (ClassNotFoundException var21) {
                var4.field1254[var5] = -1;
            } catch (SecurityException var22) {
                var4.field1254[var5] = -2;
            } catch (NullPointerException var23) {
                var4.field1254[var5] = -3;
            } catch (Exception var24) {
                var4.field1254[var5] = -4;
            } catch (Throwable var25) {
                var4.field1254[var5] = -5;
            }
        }
        int var20 = 122 % ((arg3 + 5) / 55);
        class82.field1438.method1230(var4, true);
    }
}
