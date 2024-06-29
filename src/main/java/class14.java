import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class14 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Z")
    public static boolean field237 = true;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lli;")
    public static class185 field242 = class245.method1649("huffman", -91);

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Lli;")
    private static class185 field245 = class245.method1649("Your ignore list is full)3 Max of 100 users)3", 122);

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field243 = 0;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "[I")
    public static int[] field244 = new int[32];

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lli;")
    public static class185 field239 = field245;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lsh;")
    public static class246 field240;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method108(byte arg0) {
        field244 = null;
        field239 = null;
        field242 = null;
        field245 = null;
        field240 = null;
        int var1 = -69 / ((arg0 + 66) / 32);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Lne;")
    public static final class199 method109(int arg0, int arg1) {
        field238++;
        if (arg0 < 49) {
            field237 = false;
        }
        return class187.field3463 && class235.field4220 <= arg1 && arg1 <= class180.field3311 ? class94.field1797[arg1 - class235.field4220] : null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Luc;ILjd;I)V")
    public static final void method110(class160 arg0, int arg1, class118 arg2, int arg3) {
        field241++;
        class17 var4 = new class17();
        var4.field273 = arg2.method867(false);
        var4.field275 = arg2.method875((byte) 105);
        var4.field271 = new class29[var4.field273];
        if (arg3 != -3) {
            return;
        }
        var4.field274 = new int[var4.field273];
        var4.field277 = new int[var4.field273];
        var4.field278 = new class29[var4.field273];
        var4.field279 = new byte[var4.field273][][];
        var4.field276 = new int[var4.field273];
        for (int var5 = 0; var5 < var4.field273; var5++) {
            try {
                int var6 = arg2.method867(false);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    int var7 = 0;
                    String var8 = new String(arg2.method865(arg3 + 9202).method1339((byte) 110));
                    String var9 = new String(arg2.method865(9199).method1339((byte) 91));
                    if (var6 == 1) {
                        var7 = arg2.method875((byte) 124);
                    }
                    var4.field276[var5] = var6;
                    var4.field277[var5] = var7;
                    var4.field278[var5] = arg0.method1160(class1.method14(var8, 126), 29529, var9);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg2.method865(9199).method1339((byte) 121));
                    String var11 = new String(arg2.method865(arg3 ^ 0xFFFFDC12).method1339((byte) 120));
                    int var12 = arg2.method867(false);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg2.method865(9199).method1339((byte) 98));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method875((byte) 60);
                            var15[var16] = new byte[var17];
                            arg2.method828(var17, 0, var15[var16], -29518);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field276[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class1.method14(var13[var19], 124);
                    }
                    var4.field271[var5] = arg0.method1156(class1.method14(var10, arg3 + 121), var18, (byte) 120, var11);
                    var4.field279[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field274[var5] = -1;
            } catch (SecurityException var21) {
                var4.field274[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field274[var5] = -3;
            } catch (Exception var23) {
                var4.field274[var5] = -4;
            } catch (Throwable var24) {
                var4.field274[var5] = -5;
            }
        }
        class203.field3717.method1382(var4, (byte) -30);
    }
}
