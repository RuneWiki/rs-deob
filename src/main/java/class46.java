import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class46 {

    @OriginalMember(owner = "client!u", name = "e", descriptor = "[S")
    public static short[] field643 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Ljs;")
    public static class181 field648 = new class181(5000);

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Lkn;")
    public static class442 field649 = new class442("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lbj;")
    public static class131 field650 = new class131(64);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static final void method404(byte arg0) {
        field641++;
        int var1 = -13 % ((-arg0 - 61) / 62);
        for (class410 var2 = (class410) class243.field3450.method646(48); var2 != null; var2 = (class410) class243.field3450.method641(false)) {
            class277 var3 = var2.field5801;
            if (class142.field2034 != var3.field6267 || class276.field3837 > var3.field3855) {
                var2.method2467((byte) -114);
                var3.method1799(12771);
            } else if (var3.field3868 <= class276.field3837) {
                if (var3.field3844 > 0) {
                    class198 var4 = class98.field1358[var3.field3844 - 1];
                    if (var4 != null && var4.field6262 >= 0 && class211.field2954 * 128 > var4.field6262 && var4.field6266 >= 0 && class290.field4061 * 128 > var4.field6266) {
                        var3.method1803(var4.field6262, (byte) 105, class285.method1858(var4.field6262, var3.field6267, var4.field6266, -117) - var3.field3876, var4.field6266, class276.field3837);
                    }
                }
                if (var3.field3844 < 0) {
                    int var5 = -var3.field3844 - 1;
                    class134 var6;
                    if (class40.field588 == var5) {
                        var6 = class412.field5841;
                    } else {
                        var6 = class381.field5447[var5];
                    }
                    if (var6 != null && var6.field6262 >= 0 && var6.field6262 < class211.field2954 * 128 && var6.field6266 >= 0 && var6.field6266 < (class290.field4061 * 128)) {
                        var3.method1803(var6.field6262, (byte) 83, class285.method1858(var6.field6262, var3.field6267, var6.field6266, -108) - var3.field3876, var6.field6266, class276.field3837);
                    }
                }
                var3.method1806(class349.field4797, -128);
                class80.method583(var3, true);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(DZ)V")
    public static final void method405(double arg0, boolean arg1) {
        if (!arg1) {
            method408((byte) 42, 'S', (String) null);
        }
        field639++;
        if (class263.field3670 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class328.field4545[var3] = var4 > 255 ? 255 : var4;
        }
        class263.field3670 = arg0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BIIIIII)Lqe;")
    public static final class275 method406(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field645++;
        long var7 = (long) arg4 * 32147369L ^ (long) arg3 * 986053L ^ (long) arg5 * 475427L ^ (long) arg1 * 97549L ^ (long) arg6 * 67481L ^ (long) arg2 * 76724863L;
        if (arg0 > -90) {
            return null;
        }
        class275 var9 = (class275) class388.field5577.method904(false, var7);
        if (var9 == null) {
            class275 var10 = class341.field4664.method50(arg6, arg1, arg5, arg3, arg4, arg2);
            class388.field5577.method902(var7, (byte) 112, var10);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILko;ZLkh;)V")
    public static final void method407(int arg0, class294 arg1, boolean arg2, class11 arg3) {
        field642++;
        class1 var4 = new class1();
        var4.field5 = arg3.method172((byte) 52);
        var4.field3 = arg3.method185(25239);
        var4.field18 = new byte[var4.field5][][];
        var4.field16 = new class283[var4.field5];
        var4.field6 = new int[var4.field5];
        var4.field17 = new int[var4.field5];
        if (arg2) {
            return;
        }
        var4.field8 = new class283[var4.field5];
        var4.field2 = new int[var4.field5];
        for (int var5 = 0; var5 < var4.field5; var5++) {
            try {
                int var6 = arg3.method172((byte) 52);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method171(-9265);
                    String var8 = arg3.method171(-9265);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method185(25239);
                    }
                    var4.field2[var5] = var6;
                    var4.field6[var5] = var9;
                    var4.field8[var5] = arg1.method1915(var8, 1, class66.method507(0, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method171(-9265);
                    String var11 = arg3.method171(-9265);
                    int var12 = arg3.method172((byte) 52);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method171(-9265);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method185(25239);
                            var15[var16] = new byte[var17];
                            arg3.method196(var15[var16], var17, 255, 0);
                        }
                    }
                    var4.field2[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class66.method507(0, var13[var19]);
                    }
                    var4.field16[var5] = arg1.method1907(class66.method507(0, var10), var18, -96, var11);
                    var4.field18[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field17[var5] = -1;
            } catch (SecurityException var21) {
                var4.field17[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field17[var5] = -3;
            } catch (Exception var23) {
                var4.field17[var5] = -4;
            } catch (Throwable var24) {
                var4.field17[var5] = -5;
            }
        }
        class432.field6110.method643(var4, -101);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BCLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method408(byte arg0, char arg1, String arg2) {
        field644++;
        if (arg0 != 68) {
            method408((byte) -103, (char) 65432, (String) null);
        }
        int var3 = class329.method2121(arg2, (byte) 85, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZILpg;ZLpg;II)I")
    public static final int method409(boolean arg0, int arg1, class437 arg2, boolean arg3, class437 arg4, int arg5, int arg6) {
        if (arg1 != 23590) {
            method411(true);
        }
        field640++;
        int var7 = class334.method2142((byte) 86, arg0, arg6, arg4, arg2);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class334.method2142((byte) 86, arg3, arg5, arg4, arg2);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
    public static final void method410(int arg0, int arg1, int arg2) {
        field646++;
        if (class16.method238(arg1, 21)) {
            class195.method1264(0, arg0, class143.field2057[arg1]);
            if (arg2 > -97) {
                field650 = null;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public static final void method411(boolean arg0) {
        field647++;
        if (arg0) {
            field643 = null;
        }
        if (class64.field949 == null) {
            return;
        }
        class100.field1383.method1011((byte) -76);
        class291.method1884();
        class247.method1666((byte) -125);
        class303.method1958((byte) -121);
        class450.method2798(false);
        class429.method2709(-125);
        if (class338.field4650 != null) {
            class338.field4650.method2438(0);
        }
        class130.method895(!arg0);
        client.method1095(false);
        class148.method1002(-8);
        class18.method251((byte) 110, false);
        class105.method749(104);
        for (int var1 = 0; var1 < 2048; var1++) {
            class134 var5 = class381.field5447[var1];
            if (var5 != null) {
                var5.field5343 = null;
                for (int var6 = 0; var6 < var5.field5325.length; var6++) {
                    var5.field5325[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class98.field1358.length; var2++) {
            class198 var3 = class98.field1358[var2];
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field5325.length; var4++) {
                    var3.field5325[var4] = null;
                }
            }
        }
        class64.field949.method2190(false);
        class64.field949 = null;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V")
    public static void method412(boolean arg0) {
        field648 = null;
        field649 = null;
        field643 = null;
        field650 = null;
        if (arg0) {
            field648 = null;
        }
    }
}
