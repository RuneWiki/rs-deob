import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class115 {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1751 = 0;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Z")
    public static boolean field1753 = true;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "F")
    public static float field1755;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "[[B")
    public static byte[][] field1750;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method859(byte arg0) {
        if (arg0 >= -38) {
            field1751 = -64;
        }
        field1750 = null;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)Z")
    public static final boolean method860(byte arg0) {
        if (arg0 >= -1) {
            method859((byte) -103);
        }
        field1749++;
        class429 var1 = (class429) class451.field6491.field2296.field4225;
        if (var1 == null || class451.field6491.field2296 == var1) {
            return false;
        } else {
            if (var1.field5977 >= 2000) {
                var1.field5977 -= 2000;
            }
            return var1.field5977 == 1009;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Lnr;")
    public static final class439 method861(int arg0, byte arg1) {
        field1752++;
        class439 var2 = (class439) class346.field4679.method2529(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class70.field975.method1926(0, arg0, 33);
        class439 var4 = new class439();
        if (arg1 >= -81) {
            return null;
        }
        if (var3 != null) {
            var4.method2702((byte) -44, new class366(var3), arg0);
        }
        class346.field4679.method2527(104, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lne;Lrg;ZI)V")
    public static final void method862(class76 arg0, class366 arg1, boolean arg2, int arg3) {
        field1754++;
        class406 var4 = new class406();
        var4.field5620 = arg1.method2306((byte) 97);
        var4.field5614 = arg1.method2258(1177515464);
        if (arg2) {
            method859((byte) 16);
        }
        var4.field5623 = new int[var4.field5620];
        var4.field5629 = new class285[var4.field5620];
        var4.field5616 = new byte[var4.field5620][][];
        var4.field5618 = new class285[var4.field5620];
        var4.field5626 = new int[var4.field5620];
        var4.field5624 = new int[var4.field5620];
        for (int var5 = 0; var5 < var4.field5620; var5++) {
            try {
                int var6 = arg1.method2306((byte) 58);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg1.method2255(-32226);
                    String var8 = arg1.method2255(-32226);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method2258(1177515464);
                    }
                    var4.field5626[var5] = var6;
                    var4.field5624[var5] = var9;
                    var4.field5629[var5] = arg0.method611(arg2, var8, class439.method2700(30, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg1.method2255(-32226);
                    String var11 = arg1.method2255(-32226);
                    int var12 = arg1.method2306((byte) 59);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg1.method2255(-32226);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method2258(1177515464);
                            var15[var16] = new byte[var17];
                            arg1.method2249(0, (byte) -45, var17, var15[var16]);
                        }
                    }
                    var4.field5626[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class439.method2700(30, var13[var19]);
                    }
                    var4.field5618[var5] = arg0.method593(true, class439.method2700(30, var10), var18, var11);
                    var4.field5616[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field5623[var5] = -1;
            } catch (SecurityException var21) {
                var4.field5623[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field5623[var5] = -3;
            } catch (Exception var23) {
                var4.field5623[var5] = -4;
            } catch (Throwable var24) {
                var4.field5623[var5] = -5;
            }
        }
        class311.field4218.method1162(122, var4);
    }
}
