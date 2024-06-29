import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class253 {

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Lcc;")
    public static class209 field4557 = class95.method669(104, "Fallen lassen");

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field4565 = 0;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "Lcc;")
    private static class209 field4569 = class95.method669(84, "green:");

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "[J")
    public static long[] field4566 = new long[100];

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Lcc;")
    public static class209 field4562 = field4569;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field4550 = 0;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "Lcc;")
    public static class209 field4563 = field4569;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public static int field4571 = 0;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "Lcc;")
    public static class209 field4560 = class95.method669(95, "0(U");

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "Lhl;")
    public static class39 field4561 = new class39(5000);

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "I")
    public static int field4573 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public int field4554;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public int field4558;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "J")
    public long field4551;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Lpb;")
    public class126 field4553;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "Lpb;")
    public class126 field4559;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "Lpb;")
    public class126 field4570;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static final void method1745(int arg0) {
        field4568++;
        class2 var1 = class226.field4117;
        synchronized (class226.field4117) {
            class161.field2915++;
            class205.field3660 = field4573;
            if (arg0 != -20720) {
                field4565 = 67;
            }
            if (class60.field1202 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class228.field4153[var2] = false;
                }
                class60.field1202 = class43.field867;
            } else {
                while (class60.field1202 != class43.field867) {
                    int var3 = class147.field2695[class43.field867];
                    class43.field867 = class43.field867 + 1 & 0x7F;
                    if (var3 < 0) {
                        class228.field4153[~var3] = false;
                    } else {
                        class228.field4153[var3] = true;
                    }
                }
            }
            field4573 = class70.field1337;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
    public static void method1746(int arg0) {
        field4566 = null;
        field4562 = null;
        field4560 = null;
        field4569 = null;
        if (arg0 != 0) {
            method1747(-57, 96);
        }
        field4563 = null;
        field4561 = null;
        field4557 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)Laj;")
    public static final class47 method1747(int arg0, int arg1) {
        field4567++;
        class47 var2 = (class47) class27.field488.method670((byte) -91, (long) arg0);
        if (arg1 >= -31) {
            method1747(-104, -76);
        }
        if (var2 != null) {
            return var2;
        }
        class47 var3 = class104.method710(-10240, arg0, class247.field4469, class2.field31, false);
        if (var3 != null) {
            class27.field488.method673((long) arg0, -5087, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILw;Ltf;I)V")
    public static final void method1748(int arg0, class143 arg1, class106 arg2, int arg3) {
        class219 var4 = new class219();
        field4572++;
        var4.field3995 = arg2.method774((byte) 93);
        var4.field3988 = arg2.method746((byte) -100);
        var4.field3989 = new int[var4.field3995];
        var4.field3982 = new class203[var4.field3995];
        var4.field3983 = new int[var4.field3995];
        var4.field3990 = new int[var4.field3995];
        var4.field3984 = new byte[var4.field3995][][];
        if (arg0 != 2374) {
            method1749((byte) -2, -18);
        }
        var4.field3985 = new class203[var4.field3995];
        for (int var5 = 0; var5 < var4.field3995; var5++) {
            try {
                int var6 = arg2.method774((byte) 89);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg2.method755(1).method1455((byte) 108));
                    String var18 = new String(arg2.method755(1).method1455((byte) 119));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method746((byte) -100);
                    }
                    var4.field3990[var5] = var6;
                    var4.field3983[var5] = var19;
                    var4.field3985[var5] = arg1.method1005(-7468, class30.method236(117, var17), var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg2.method755(1).method1455((byte) -40));
                    String var8 = new String(arg2.method755(1).method1455((byte) 121));
                    int var9 = arg2.method774((byte) 82);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg2.method755(1).method1455((byte) -103));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method746((byte) -100);
                            var12[var13] = new byte[var14];
                            arg2.method759(0, var12[var13], var14, false);
                        }
                    }
                    var4.field3990[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class30.method236(class3.method15(arg0, 2345), var10[var16]);
                    }
                    var4.field3982[var5] = arg1.method1002(var15, class30.method236(112, var7), var8, 3);
                    var4.field3984[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3989[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3989[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3989[var5] = -3;
            } catch (Exception var23) {
                var4.field3989[var5] = -4;
            } catch (Throwable var24) {
                var4.field3989[var5] = -5;
            }
        }
        class102.field1965.method1123(var4, (byte) -127);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)V")
    public static final void method1749(byte arg0, int arg1) {
        class167.method1150((byte) 115);
        field4564++;
        class106.method748(-14336);
        int var2 = class78.method547(arg1, 16).field3567;
        if (var2 == 0) {
            return;
        }
        int var3 = class38.field647[arg1];
        if (var2 == 6) {
            class112.field2257 = var3;
        }
        if (var2 == 9) {
            class69.field1318 = var3;
        }
        int var4 = 25 % ((arg0 - 5) / 44);
        if (var2 == 5) {
            class147.field2700 = var3;
        }
    }
}
