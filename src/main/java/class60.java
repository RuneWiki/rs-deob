import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 extends class32 {

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public int field1386 = 0;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "[Lmf;")
    public class89[] field1405 = new class89[5];

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "[I")
    public int[] field1409 = new int[5];

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "Lv;")
    public static class146 field1381 = class159.method1226((byte) -37, "<col=00ff00>");

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Lv;")
    private static class146 field1380 = class159.method1226((byte) -37, "FULL");

    @OriginalMember(owner = "client!id", name = "y", descriptor = "Lv;")
    public static class146 field1383 = field1380;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lv;")
    private static class146 field1382 = class159.method1226((byte) -37, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!id", name = "z", descriptor = "Lv;")
    public static class146 field1384 = field1382;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "[I")
    public static int[] field1406 = new int[50];

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!id", name = "X", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "Lq;")
    public class111 field1399;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "Lrf;")
    public class124 field1402;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "Ltd;")
    public class136 field1403;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "Ldc;")
    public static class25 field1377;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "Lhd;")
    public class53 field1404;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "Lid;")
    public class60 field1387;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "Ljb;")
    public class64 field1398;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "Lme;")
    public class88 field1394;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "Z")
    public boolean field1389;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "Z")
    public boolean field1391;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "Z")
    public boolean field1397;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BILcf;Lne;)V")
    public static final void method419(byte arg0, int arg1, class21 arg2, class95 arg3) {
        field1408++;
        class110 var4 = new class110();
        var4.field2595 = arg3.method790((byte) 73);
        var4.field2593 = arg3.method740((byte) 87);
        var4.field2598 = new class39[var4.field2595];
        var4.field2597 = new int[var4.field2595];
        var4.field2607 = new class39[var4.field2595];
        var4.field2592 = new int[var4.field2595];
        var4.field2594 = new byte[var4.field2595][][];
        var4.field2603 = new int[var4.field2595];
        int var5 = 0;
        if (arg0 > -120) {
            return;
        }
        while (var5 < var4.field2595) {
            try {
                int var6 = arg3.method790((byte) 73);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method772(102).method1095((byte) -121));
                    String var18 = new String(arg3.method772(99).method1095((byte) -63));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method740((byte) 69);
                    }
                    var4.field2592[var5] = var6;
                    var4.field2603[var5] = var19;
                    var4.field2607[var5] = arg2.method117(true, var18, class54.method369(var17, -11589));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method772(99).method1095((byte) -127));
                    String var8 = new String(arg3.method772(-114).method1095((byte) -77));
                    int var9 = arg3.method790((byte) 73);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method772(108).method1095((byte) -117));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method740((byte) -103);
                            var12[var13] = new byte[var14];
                            arg3.method751(125, var12[var13], var14, 0);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field2592[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class54.method369(var10[var16], -11589);
                    }
                    var4.field2598[var5] = arg2.method115(76, var8, var15, class54.method369(var7, -11589));
                    var4.field2594[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2597[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2597[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2597[var5] = -3;
            } catch (Exception var23) {
                var4.field2597[var5] = -4;
            } catch (Throwable var24) {
                var4.field2597[var5] = -5;
            }
            var5++;
        }
        class148.field3437.method1136(var4, false);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lcf;BLjava/lang/Object;)V")
    public static final void method420(class21 arg0, byte arg1, Object arg2) {
        field1379++;
        if (arg0.field316 == null) {
            return;
        }
        if (arg1 < 119) {
            field1383 = null;
        }
        for (int var3 = 0; var3 < 50 && arg0.field316.peekEvent() != null; var3++) {
            class6.method51(1L, -14344);
        }
        if (arg2 != null) {
            arg0.field316.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(III)V")
    public class60(int arg0, int arg1, int arg2) {
        this.field1392 = arg2;
        this.field1393 = this.field1400 = arg0;
        this.field1385 = arg1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method421(byte arg0) {
        if (arg0 != -93) {
            method420(null, (byte) -35, null);
        }
        field1384 = null;
        field1382 = null;
        field1383 = null;
        field1406 = null;
        field1377 = null;
        field1381 = null;
        field1380 = null;
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
    public static final void method422(int arg0) {
        if (arg0 == -3) {
            field1378++;
            class98.field2369.method1050(true);
            class13.field209.method1050(true);
        }
    }
}
