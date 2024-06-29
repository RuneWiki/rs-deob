import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class337 {

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field4493 = 0;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
    public static int[] field4492 = new int[4096];

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Luc;")
    public static class58 field4495 = new class58(8);

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field4497 = 0;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4499 = "Loading - please wait.";

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lam;")
    public static class286 field4500;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lqk;")
    public static class334 field4498;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "[Lto;")
    public static class272[] field4489;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1960(int arg0) {
        field4487++;
        if (arg0 != 0) {
            return;
        }
        for (int var1 = -1; var1 < class293.field3991; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class345.field4629[var1];
            }
            class158 var3 = class85.field957[var2];
            if (var3 != null) {
                class156.method842(9226, var3, var3.method857((byte) -106));
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBC)I", line = 35)
    public static final int method1961(int arg0, byte arg1, char arg2) {
        field4490++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return arg1 == 81 ? var3 : -102;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Llh;BLtq;I)V", line = 60)
    public static final void method1962(class450 arg0, byte arg1, class250 arg2, int arg3) {
        field4494++;
        class444 var4 = new class444();
        var4.field6497 = arg2.method1350(31351);
        var4.field6498 = arg2.method1359(255);
        var4.field6488 = new byte[var4.field6497][][];
        var4.field6492 = new class304[var4.field6497];
        var4.field6485 = new class304[var4.field6497];
        var4.field6493 = new int[var4.field6497];
        var4.field6483 = new int[var4.field6497];
        var4.field6487 = new int[var4.field6497];
        for (int var5 = 0; var5 < var4.field6497; var5++) {
            try {
                int var6 = arg2.method1350(31351);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg2.method1349(-1754884856);
                    String var8 = arg2.method1349(-1754884856);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method1359(arg1 ^ 0xB0);
                    }
                    var4.field6483[var5] = var6;
                    var4.field6487[var5] = var9;
                    var4.field6485[var5] = arg0.method2798(class92.method508(var7, class379.method2318(arg1, 38)), var8, -19372);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg2.method1349(-1754884856);
                    String var11 = arg2.method1349(arg1 ^ 0x97669547);
                    int var12 = arg2.method1350(31351);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg2.method1349(arg1 - 1754884935);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method1359(arg1 ^ 0xB0);
                            var15[var16] = new byte[var17];
                            arg2.method1351(var15[var16], (byte) -128, 0, var17);
                        }
                    }
                    var4.field6483[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class92.method508(var13[var19], class379.method2318(arg1, 109));
                    }
                    var4.field6492[var5] = arg0.method2776(var11, var18, class92.method508(var10, class379.method2318(arg1, 30)), class379.method2318(arg1, 79));
                    var4.field6488[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field6493[var5] = -1;
            } catch (SecurityException var21) {
                var4.field6493[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field6493[var5] = -3;
            } catch (Exception var23) {
                var4.field6493[var5] = -4;
            } catch (Throwable var24) {
                var4.field6493[var5] = -5;
            }
        }
        if (arg1 != 79) {
            field4492 = null;
        }
        class203.field2721.method825(-116, var4);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBI)Lml;", line = 174)
    public static final class451 method1963(int arg0, int arg1, byte arg2, int arg3) {
        field4488++;
        int var4 = arg3 | arg0 << 8;
        class451 var5 = (class451) class256.field3500.method222((long) var4 << 16, -8407);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class211.field2868.method1699(class211.field2868.method1696(var4, false), 99);
        int var7 = 94 % ((arg2 + 47) / 53);
        if (var6 == null) {
            int var9 = arg1 + 65536 << 8 | arg3;
            class451 var10 = (class451) class256.field3500.method222((long) var9 << 16, -8407);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class211.field2868.method1699(class211.field2868.method1696(var9, false), 115);
            if (var11 == null) {
                int var13 = arg3 | 0xFFFF00;
                class451 var14 = (class451) class256.field3500.method222((long) var13 << 16, -8407);
                if (var14 != null) {
                    return var14;
                }
                byte[] var15 = class211.field2868.method1699(class211.field2868.method1696(var13, false), 48);
                if (var15 == null) {
                    return null;
                } else if (var15.length <= 1) {
                    return null;
                } else {
                    class451 var16 = class182.method969(var15, 25740);
                    var16.field6564 = arg3;
                    class256.field3500.method218((long) var13 << 16, (byte) -126, var16);
                    return var16;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class451 var12 = class182.method969(var11, 25740);
                var12.field6564 = arg3;
                class256.field3500.method218((long) var9 << 16, (byte) 35, var12);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class451 var8 = class182.method969(var6, 25740);
            var8.field6564 = arg3;
            class256.field3500.method218((long) var4 << 16, (byte) 88, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 252)
    public static void method1964(int arg0) {
        field4500 = null;
        field4489 = null;
        field4498 = null;
        field4492 = null;
        field4499 = null;
        if (arg0 >= 43) {
            field4495 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBII)V", line = 267)
    public static final void method1965(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = -22 % (arg2 / 55);
        field4491++;
        class316.field4223 = arg3;
        class260.field3562 = arg1;
        class188.field2371 = arg4;
        class132.field1703 = arg0;
    }
}
