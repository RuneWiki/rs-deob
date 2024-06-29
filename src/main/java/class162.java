import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class162 {

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lel;")
    public class293 field2626;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "[I")
    public static int[] field2627 = new int[2048];

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "[I")
    public static int[] field2624 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2628 = "Members object";

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field2632 = 10;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "[I")
    public static int[] field2625 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field2631 = 2;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "Lpf;")
    public static class17 field2633 = new class17(5);

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "Lhg;")
    public static class207 field2635 = null;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "Z")
    public static boolean field2636 = true;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2630;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)Lng;")
    public static final class73 method1197(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1498[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2814; var4++) {
            class73 var5 = var3.field2812[var4];
            if ((var5.field1278 >> 29 & 0x3L) == 2L && var5.field1270 == arg1 && var5.field1266 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBLci;Lab;)V")
    public static final void method1198(int arg0, byte arg1, class83 arg2, class249 arg3) {
        field2629++;
        class130 var4 = new class130();
        var4.field2148 = arg3.method1802((byte) 75);
        var4.field2158 = arg3.method1800(-80);
        var4.field2160 = new int[var4.field2148];
        var4.field2156 = new byte[var4.field2148][][];
        var4.field2152 = new int[var4.field2148];
        var4.field2144 = new class191[var4.field2148];
        var4.field2145 = new int[var4.field2148];
        var4.field2155 = new class191[var4.field2148];
        for (int var5 = 0; var5 < var4.field2148; var5++) {
            try {
                int var6 = arg3.method1802((byte) 109);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg3.method1769(1);
                    String var18 = arg3.method1769(arg1 ^ 0x4B);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method1800(arg1 + 52);
                    }
                    var4.field2160[var5] = var6;
                    var4.field2152[var5] = var19;
                    var4.field2155[var5] = arg2.method580(class97.method684(var17, false), var18, false);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg3.method1769(arg1 ^ 0x4B);
                    String var8 = arg3.method1769(arg1 ^ 0x4B);
                    int var9 = arg3.method1802((byte) -86);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg3.method1769(1);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method1800(123);
                            var12[var13] = new byte[var14];
                            arg3.method1805((byte) -106, var14, 0, var12[var13]);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field2160[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class97.method684(var10[var16], false);
                    }
                    var4.field2144[var5] = arg2.method584(var8, class97.method684(var7, false), 0, var15);
                    var4.field2156[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2145[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2145[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2145[var5] = -3;
            } catch (Exception var23) {
                var4.field2145[var5] = -4;
            } catch (Throwable var24) {
                var4.field2145[var5] = -5;
            }
        }
        if (arg1 != 74) {
            field2632 = 11;
        }
        class259.field4351.method311(arg1 + 2, var4);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    public static void method1199(byte arg0) {
        field2627 = null;
        field2635 = null;
        field2630 = null;
        if (arg0 != -40) {
            method1198(-51, (byte) 10, (class83) null, (class249) null);
        }
        field2633 = null;
        field2625 = null;
        field2628 = null;
        field2624 = null;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(II)V")
    public class162(int arg0, int arg1) {
        this.field2626 = class209.method1466(arg0, (byte) 8);
        this.field2623 = arg1;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lel;I)V")
    public class162(class293 arg0, int arg1) {
        this.field2623 = arg1;
        this.field2626 = arg0;
    }
}
