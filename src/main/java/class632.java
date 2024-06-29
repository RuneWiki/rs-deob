import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class632 {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lrb;")
    public static class352 field9235 = new class352(7, 0, 1, 1);

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lqp;")
    public static class586 field9237 = new class586(90, 12);

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field9239 = 765;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[[I")
    public static int[][] field9238 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field9232;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field9233;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field9234;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field9236;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V")
    public static final void method3676(byte arg0, int arg1) {
        int var2 = 69 / ((arg0 - 10) / 55);
        field9233++;
        class621 var3 = class442.method2691(arg1, 16, true);
        var3.method3598(255);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()V")
    public static final void method3677() {
        class480.method2913(1, class487.field7383);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lps;Luf;ZI)V")
    public static final void method3678(class428 arg0, class353 arg1, boolean arg2, int arg3) {
        field9236++;
        class117 var4 = new class117();
        var4.field1534 = arg0.method2561((byte) -102);
        var4.field1538 = arg0.method2589(-11179);
        var4.field1536 = new class286[var4.field1534];
        var4.field1530 = new int[var4.field1534];
        var4.field1539 = new int[var4.field1534];
        var4.field1527 = new class286[var4.field1534];
        var4.field1533 = new byte[var4.field1534][][];
        if (arg2) {
            return;
        }
        var4.field1537 = new int[var4.field1534];
        for (int var5 = 0; var5 < var4.field1534; var5++) {
            try {
                int var6 = arg0.method2561((byte) -57);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg0.method2585(119);
                    String var18 = arg0.method2585(116);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method2589(-11179);
                    }
                    var4.field1530[var5] = var6;
                    var4.field1537[var5] = var19;
                    var4.field1527[var5] = arg1.method2176(var18, class36.method185(var17, (byte) -116), -53);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg0.method2585(111);
                    String var8 = arg0.method2585(-95);
                    int var9 = arg0.method2561((byte) -31);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg0.method2585(124);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method2589(-11179);
                            var12[var13] = new byte[var14];
                            arg0.method2575(28637, var14, var12[var13], 0);
                        }
                    }
                    var4.field1530[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class36.method185(var10[var16], (byte) -124);
                    }
                    var4.field1536[var5] = arg1.method2166(var15, class36.method185(var7, (byte) -127), var8, -128);
                    var4.field1533[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1539[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1539[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1539[var5] = -3;
            } catch (Exception var23) {
                var4.field1539[var5] = -4;
            } catch (Throwable var24) {
                var4.field1539[var5] = -5;
            }
        }
        class625.field9166.method2492(var4, (byte) -124);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZIIIIIIII)Z")
    public static final boolean method3679(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field9234++;
        int var9 = class239.field3493.field1090[0];
        int var10 = class239.field3493.field1089[0];
        if (var9 < 0 || class35.field399 <= var9 || var10 < 0 || class382.field5586 <= var10) {
            return false;
        } else if (arg7 >= 0 && class35.field399 > arg7 && arg6 >= 0 && arg6 < class382.field5586) {
            int var11 = class124.method747(arg5, arg4, class77.field886, var9, 4, class239.field3493.method514(0), arg6, class306.field4462, arg1, arg8, var10, arg2, arg7, class67.field772[class239.field3493.field3457], arg0);
            if (var11 < 1) {
                return false;
            }
            class415.field5969 = class306.field4462[var11 - 1];
            class158.field2058 = class77.field886[arg3 + var11];
            class121.field1566 = false;
            class498.method3002(-117);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(BI)V")
    public static final void method3680(byte arg0, int arg1) {
        field9232++;
        if (arg0 > -26) {
            method3680((byte) -71, 72);
        }
        class621 var2 = class442.method2691(arg1, 9, true);
        var2.method3598(255);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method3681(int arg0) {
        field9238 = null;
        if (arg0 != 0) {
            field9238 = null;
        }
        field9237 = null;
        field9235 = null;
    }
}
