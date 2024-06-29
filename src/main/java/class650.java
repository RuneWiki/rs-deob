import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class650 extends class329 {

    @OriginalMember(owner = "client!sba", name = "o", descriptor = "Lae;")
    public class40 field9177 = new class40();

    @OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
    public static int field9179 = 0;

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "I")
    public static int field9175;

    @OriginalMember(owner = "client!sba", name = "n", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!sba", name = "p", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "[I")
    public static int[] field9174;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)V")
    public static void method3647(byte arg0) {
        field9174 = null;
        if (arg0 != -123) {
            method3651(-82);
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(ILrj;ILes;)V")
    public static final void method3648(int arg0, class648 arg1, int arg2, class630 arg3) {
        field9175++;
        if (arg0 >= -5) {
            method3647((byte) -30);
        }
        class113 var4 = new class113();
        var4.field1478 = arg3.method3501(-9268);
        var4.field1475 = arg3.method3483(115);
        var4.field1473 = new int[var4.field1478];
        var4.field1472 = new byte[var4.field1478][][];
        var4.field1477 = new class264[var4.field1478];
        var4.field1471 = new int[var4.field1478];
        var4.field1476 = new int[var4.field1478];
        var4.field1470 = new class264[var4.field1478];
        for (int var5 = 0; var5 < var4.field1478; var5++) {
            try {
                int var6 = arg3.method3501(-9268);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method3500((byte) 122);
                    String var8 = arg3.method3500((byte) 120);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method3483(78);
                    }
                    var4.field1473[var5] = var6;
                    var4.field1476[var5] = var9;
                    var4.field1470[var5] = arg1.method3638(var8, class265.method1538(18944, var7), 0);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method3500((byte) 117);
                    String var11 = arg3.method3500((byte) 118);
                    int var12 = arg3.method3501(-9268);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method3500((byte) 116);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method3483(93);
                            var15[var16] = new byte[var17];
                            arg3.method3522(var15[var16], true, var17, 0);
                        }
                    }
                    var4.field1473[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class265.method1538(18944, var13[var19]);
                    }
                    var4.field1477[var5] = arg1.method3634(class265.method1538(18944, var10), var11, var18, 1727313032);
                    var4.field1472[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1471[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1471[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1471[var5] = -3;
            } catch (Exception var23) {
                var4.field1471[var5] = -4;
            } catch (Throwable var24) {
                var4.field1471[var5] = -5;
            }
        }
        class115.field1487.method239(var4, (byte) 93);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IB)V")
    public static final void method3649(int arg0, byte arg1) {
        field9176++;
        class592 var2 = class61.method371(2, arg0, (byte) -127);
        var2.method3253(0);
        int var3 = -24 % (-arg1 / 45);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BII)Z")
    public static final boolean method3650(byte arg0, int arg1, int arg2) {
        if (arg0 < 32) {
            method3651(-77);
        }
        field9180++;
        return class551.method3051(33, arg1, arg2) | (arg1 & 0x70000) != 0 || class167.method955(arg1, -1, arg2);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
    public static final void method3651(int arg0) {
        field9178++;
        class510.method2757();
        for (int var1 = 0; var1 < 4; var1++) {
            class154.field1991[var1].method1954(2097152);
        }
        class687.method3870((byte) -67);
        if (arg0 != 9811) {
            method3650((byte) -53, -47, 45);
        }
        class111.method623(0);
        System.gc();
        class32.field452.method1031();
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)V")
    public static final void method3652(int arg0, int arg1, int arg2) {
        int var3 = -49 % ((-arg1 - 46) / 62);
        field9173++;
        class592 var4 = class61.method371(5, arg2, (byte) -128);
        var4.method3256((byte) 11);
        var4.field8314 = arg0;
    }
}
