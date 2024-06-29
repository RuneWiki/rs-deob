import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class254 {

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lna;")
    public static class26 field4153 = class69.method505("Librairie 3D d-Bmarr-Be", (byte) -118);

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lna;")
    public static class26 field4156 = class69.method505("cookiehost", (byte) -121);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field4150 = 0;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lna;")
    private static class26 field4161 = class69.method505("Your ignore list is full)3 Max of 100 users)3", (byte) -128);

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lna;")
    public static class26 field4155 = field4161;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLve;Lve;)V", line = 14)
    public static final void method1755(byte arg0, class266 arg1, class266 arg2) {
        class181.field2824 = arg1;
        if (arg0 <= -103) {
            class249.field4054 = arg2;
            field4152++;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V", line = 67)
    public static final void method1756(boolean arg0) {
        if (arg0) {
            return;
        }
        for (class63 var1 = (class63) class303.field5219.method264(-20); var1 != null; var1 = (class63) class303.field5219.method263(4)) {
            class272 var2 = var1.field1001;
            if (class279.field4651 != var2.field4562 || var2.field4563) {
                var1.method1006(-1024);
            } else if (var2.field4540 <= class229.field3626) {
                var2.method1933(true, class25.field366);
                if (var2.field4563) {
                    var1.method1006(-1024);
                } else {
                    class318.method2207(var2.field4562, var2.field4560, var2.field4552, var2.field4554, 60, var2, 0, -1L, false);
                }
            }
        }
        field4159++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lme;IIII)V", line = 101)
    public static final void method1757(class187 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4151++;
        if (class126.field1955 >= 400) {
            return;
        }
        if (arg0.field2953 != null) {
            arg0 = arg0.method1273((byte) 66);
        }
        if (arg0 == null || !arg0.field2928) {
            return;
        }
        if (arg2 > -83) {
            field4155 = (class26) null;
        }
        class26 var5 = arg0.field2931;
        if (arg0.field2917 != 0) {
            class26 var6 = class170.field2670 == 1 ? class47.field767 : class322.field5543;
            var5 = class236.method1587(new class26[] { var5, class149.method1016(arg0.field2917, (byte) -122, class13.field221.field2481), class149.field2329, var6, class149.method1019((byte) 9, arg0.field2917), class224.field3563 }, (byte) -73);
        }
        if (class134.field2046 == 1) {
            class29.method237(class67.field1059, (long) arg3, (byte) -125, class236.method1587(new class26[] { class236.field3764, class148.field2314, var5 }, (byte) -125), arg1, (short) 26, class110.field1755, arg4);
            class302.field5209++;
        } else if (class86.field1420) {
            class33 var14 = class299.field5143 == -1 ? null : class32.method252(64, class299.field5143);
            if ((class58.field940 & 0x2) != 0 && (var14 == null || arg0.method1277(class299.field5143, -26460, var14.field545) != var14.field545)) {
                class29.method237(field4158, (long) arg3, (byte) -93, class236.method1587(new class26[] { class308.field5303, class148.field2314, var5 }, (byte) -65), arg1, (short) 45, class33.field559, arg4);
                class298.field5140++;
            }
        } else {
            class82.field1282++;
            class26[] var7 = arg0.field2914;
            if (class269.field4441) {
                var7 = class174.method1194(19406, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class170.field2670 != 0 || !var7[var8].method162(-113, class264.field4321))) {
                        class217.field3414++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 17;
                        }
                        if (var8 == 1) {
                            var9 = 16;
                        }
                        int var10 = -1;
                        if (var8 == 2) {
                            var9 = 4;
                        }
                        if (var8 == 3) {
                            var9 = 19;
                        }
                        if (arg0.field2958 == var8) {
                            var10 = arg0.field2905;
                        }
                        if (arg0.field2949 == var8) {
                            var10 = arg0.field2936;
                        }
                        if (var8 == 4) {
                            var9 = 2;
                        }
                        class29.method237(var10, (long) arg3, (byte) -103, class236.method1587(new class26[] { class108.field1698, var5 }, (byte) -99), arg1, var9, var7[var8], arg4);
                    }
                }
            }
            if (class170.field2670 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].method162(-112, class264.field4321)) {
                        class304.field5234++;
                        short var12 = 0;
                        if (arg0.field2917 > class13.field221.field2481) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 17;
                        }
                        if (var11 == 1) {
                            var13 = 16;
                        }
                        if (var11 == 2) {
                            var13 = 4;
                        }
                        if (var11 == 3) {
                            var13 = 19;
                        }
                        if (var11 == 4) {
                            var13 = 2;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class29.method237(arg0.field2960, (long) arg3, (byte) -128, class236.method1587(new class26[] { class108.field1698, var5 }, (byte) -124), arg1, var13, var7[var11], arg4);
                    }
                }
            }
            class29.method237(class12.field164, (long) arg3, (byte) -73, class236.method1587(new class26[] { class108.field1698, var5 }, (byte) -69), arg1, (short) 1007, class218.field3477, arg4);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lmd;", line = 275)
    public static final class250 method1758(int arg0, int arg1) {
        field4160++;
        if (arg1 >= -99) {
            return (class250) null;
        }
        class250 var2 = (class250) class302.field5211.method28((long) arg0, 1400);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class321.field5524.method1889(5, (byte) -122, arg0);
        class250 var4 = new class250();
        if (var3 != null) {
            var4.method1717(new class82(var3), 0);
        }
        class302.field5211.method33(var4, (long) arg0, (byte) 58);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 299)
    public static void method1759(byte arg0) {
        field4155 = null;
        field4161 = null;
        if (arg0 < 0) {
            field4150 = -60;
        }
        field4153 = null;
        field4156 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)[B")
    public abstract byte[] method706(int arg0);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[B)V")
    public abstract void method705(int arg0, byte[] arg1);
}
