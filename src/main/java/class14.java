import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Z")
    public static boolean field147 = false;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field148 = 0;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field151 = 0;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "[Lya;")
    public static class38[] field152;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static void method84(int arg0) {
        field152 = null;
        if (arg0 != 15154) {
            method85(null, 74, null, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lfq;ILug;B)V")
    public static final void method85(class137 arg0, int arg1, class396 arg2, byte arg3) {
        field150++;
        class117 var4 = new class117();
        var4.field1527 = arg2.method2388((byte) -110);
        var4.field1529 = arg2.method2406((byte) -113);
        var4.field1523 = new int[var4.field1527];
        var4.field1522 = new class236[var4.field1527];
        var4.field1524 = new int[var4.field1527];
        var4.field1528 = new class236[var4.field1527];
        var4.field1525 = new int[var4.field1527];
        var4.field1531 = new byte[var4.field1527][][];
        if (arg3 <= 50) {
            field151 = 50;
        }
        for (int var5 = 0; var5 < var4.field1527; var5++) {
            try {
                int var6 = arg2.method2388((byte) -118);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg2.method2432((byte) 125);
                    String var18 = arg2.method2432((byte) 125);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method2406((byte) -98);
                    }
                    var4.field1525[var5] = var6;
                    var4.field1523[var5] = var19;
                    var4.field1522[var5] = arg0.method835(class299.method1788(var17, true), (byte) -126, var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method2432((byte) 125);
                    String var8 = arg2.method2432((byte) 125);
                    int var9 = arg2.method2388((byte) -111);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method2432((byte) 125);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method2406((byte) -122);
                            var12[var13] = new byte[var14];
                            arg2.method2395((byte) -65, var12[var13], 0, var14);
                        }
                    }
                    var4.field1525[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class299.method1788(var10[var16], true);
                    }
                    var4.field1528[var5] = arg0.method834(21, var8, var15, class299.method1788(var7, true));
                    var4.field1531[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1524[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1524[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1524[var5] = -3;
            } catch (Exception var23) {
                var4.field1524[var5] = -4;
            } catch (Throwable var24) {
                var4.field1524[var5] = -5;
            }
        }
        class105.field1417.method975(0, var4);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lza;Lot;IIIII)V")
    public static final void method86(class287 arg0, class419 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class478.field7065 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class515.field7487) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class114.field1494 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class498 var15 = class186.field2421[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class152.field1993[var12].method217(var13, var14) + class152.field1993[var12].method217(var13 + 1, var14) + class152.field1993[var12].method217(var13, var14 + 1) + class152.field1993[var12].method217(var13 + 1, var14 + 1)) / 4 - (class152.field1993[arg2].method217(arg3, arg4) + class152.field1993[arg2].method217(arg3 + 1, arg4) + class152.field1993[arg2].method217(arg3, arg4 + 1) + class152.field1993[arg2].method217(arg3 + 1, arg4 + 1)) / 4;
                                    class262 var17 = var15.field7264;
                                    class262 var18 = var15.field7257;
                                    if (var17 != null && var17.method41((byte) -62)) {
                                        arg1.method40(109, (var14 - arg4) * class166.field2152 + (1 - arg6) * class123.field1595, var16, var7, (var13 - arg3) * class166.field2152 + (1 - arg5) * class123.field1595, var17, arg0);
                                    }
                                    if (var18 != null && var18.method41((byte) -62)) {
                                        arg1.method40(122, (var14 - arg4) * class166.field2152 + (1 - arg6) * class123.field1595, var16, var7, (var13 - arg3) * class166.field2152 + (1 - arg5) * class123.field1595, var18, arg0);
                                    }
                                    for (class192 var19 = var15.field7263; var19 != null; var19 = var19.field2469) {
                                        class279 var20 = var19.field2466;
                                        if (var20 != null && var20.method41((byte) -62) && (var20.field3698 == var13 || var8 == var13) && (var20.field3688 == var14 || var10 == var14)) {
                                            int var21 = var20.field3697 + 1 - var20.field3698;
                                            int var22 = var20.field3691 + 1 - var20.field3688;
                                            arg1.method40(113, (var20.field3688 - arg4) * class166.field2152 + (var22 - arg6) * class123.field1595, var16, var7, (var20.field3698 - arg3) * class166.field2152 + (var21 - arg5) * class123.field1595, var20, arg0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }
}
