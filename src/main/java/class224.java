import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class224 {

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "Lsw;")
    private class641 field2763 = new class641(64);

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "Ldn;")
    private class438 field2762;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "Lrg;")
    public static class548 field2754 = new class548(2, -1);

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "Lrg;")
    public static class548 field2758 = new class548(68, 6);

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field2761 = -1;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lvi;ZZ)V")
    public static final void method1283(class459 arg0, boolean arg1, boolean arg2) {
        field2755++;
        if (class199.field2397 >= 400 || arg1) {
            return;
        }
        class74 var3 = arg0.field6334;
        if (var3.field800 != null) {
            var3 = var3.method420(class281.field3700, 97);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field809) {
            return;
        }
        String var4 = var3.field830;
        if (var3.field849 != 0) {
            String var5 = class341.field4399 == class320.field4082 ? class585.field8505.method987(class31.field247, 22) : class559.field8235.method987(class31.field247, 22);
            var4 = var4 + class218.method1258((byte) 126, class103.field1265.field8000, var3.field849) + " (" + var5 + var3.field849 + ")";
        }
        if (!class449.field6225) {
            if (!arg2) {
                String[] var7 = var3.field839;
                if (class369.field4872) {
                    var7 = class427.method2403(var7, (byte) -88);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (var3.field869 == 0 || !var7[var8].equalsIgnoreCase(class524.field7342.method987(class31.field247, 22)))) {
                            byte var9 = 0;
                            int var10 = class14.field112;
                            if (var8 == 0) {
                                var9 = 21;
                            }
                            if (var8 == 1) {
                                var9 = 17;
                            }
                            if (var8 == 2) {
                                var9 = 59;
                            }
                            if (var8 == 3) {
                                var9 = 23;
                            }
                            if (var3.field829 == var8) {
                                var10 = var3.field852;
                            }
                            if (var8 == 4) {
                                var9 = 45;
                            }
                            if (var3.field818 == var8) {
                                var10 = var3.field843;
                            }
                            class4.field21++;
                            class22.method139(var9, true, 0, (byte) 65, var7[var8].equalsIgnoreCase(class524.field7342.method987(class31.field247, 22)) ? var3.field803 : var10, 0, "<col=ffff00>" + var4, var7[var8], (long) arg0.field6399, false, -1);
                        }
                    }
                }
                if (var3.field869 == 1 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class524.field7342.method987(class31.field247, 22))) {
                            short var12 = 0;
                            if (class103.field1265.field8000 < var3.field849) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 21;
                            }
                            if (var11 == 1) {
                                var13 = 17;
                            }
                            if (var11 == 2) {
                                var13 = 59;
                            }
                            if (var11 == 3) {
                                var13 = 23;
                            }
                            if (var11 == 4) {
                                var13 = 45;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class22.method139(var13, true, 0, (byte) 65, var3.field803, 0, "<col=ffff00>" + var4, var7[var11], (long) arg0.field6399, false, -1);
                            class315.field4013++;
                        }
                    }
                }
            }
            class22.method139(1012, true, 0, (byte) 65, class45.field388, 0, "<col=ffff00>" + var4, class264.field3441.method987(class31.field247, 22), (long) arg0.field6399, arg2, -1);
            class127.field1573++;
        } else if (!arg2) {
            class395 var6 = class391.field5183 == -1 ? null : class290.field3771.method2793(11, class391.field5183);
            if ((class117.field1477 & 0x2) != 0) {
                if (var6 == null || var3.method430(var6.field5211, class391.field5183, false) != var6.field5211) {
                    class22.method139(25, true, 0, (byte) 65, class468.field6542, 0, class472.field6608 + " -> <col=ffff00>" + var4, class208.field2503, (long) arg0.field6399, false, -1);
                    class362.field4759++;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Lgo;")
    public final class533 method1284(int arg0, int arg1) {
        field2760++;
        class641 var3 = this.field2763;
        class533 var4;
        synchronized (this.field2763) {
            var4 = (class533) this.field2763.method3682(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field2762;
        byte[] var6;
        synchronized (this.field2762) {
            var6 = this.field2762.method2558(100, arg1, 5);
        }
        class533 var7 = new class533();
        if (var6 != null) {
            var7.method3047(new class374(var6), 28198);
        }
        class641 var8 = this.field2763;
        synchronized (this.field2763) {
            this.field2763.method3684(var7, 0, (long) arg1);
            int var9 = -93 / ((68 - arg0) / 53);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BZLpq;Ljava/lang/String;Z)V")
    public static final void method1285(byte arg0, boolean arg1, class165 arg2, String arg3, boolean arg4) {
        field2757++;
        int var5 = 90 / ((-arg0 - 12) / 51);
        if (!arg4) {
            class250.method1422(arg2, (byte) 51, 3, arg3);
            return;
        }
        if (class165.field2026.startsWith("win") && class165.field2028 != 3) {
            String var6 = null;
            if (arg2.field2014 != null) {
                var6 = arg2.field2014.getParameter("haveie6");
            }
            if (var6 == null || !var6.equals("1")) {
                class506 var7 = class250.method1422(arg2, (byte) -123, 0, arg3);
                class447.field6198 = arg2;
                class220.field2721 = var7;
                class246.field3155 = arg3;
                return;
            }
        }
        if (class165.field2026.startsWith("mac")) {
            String var8 = null;
            if (arg2.field2014 != null) {
                var8 = arg2.field2014.getParameter("havefirefox");
            }
            if (var8 != null && var8.equals("1") && arg1) {
                class250.method1422(arg2, (byte) 15, 1, arg3);
                return;
            }
        }
        class250.method1422(arg2, (byte) 66, 2, arg3);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public static void method1286(int arg0) {
        if (arg0 >= -30) {
            field2754 = null;
        }
        field2758 = null;
        field2754 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)V")
    public static final void method1287(int arg0, byte arg1) {
        class503.field6979 = -1;
        class79.field923 = 0;
        class121.field1518 = false;
        class527.field7382 = null;
        int var2 = 71 % ((arg1 - 46) / 51);
        class175.field2117 = -1;
        class442.field6104 = arg0;
        class578.field8436 = 1;
        field2756++;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)I")
    public static final int method1288(int arg0, int arg1) {
        field2759++;
        if (arg1 != 59) {
            method1288(20, -117);
        }
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lre;ILdn;)V")
    public class224(class515 arg0, int arg1, class438 arg2) {
        this.field2762 = arg2;
        this.field2762.method2554(5, 123);
    }
}
