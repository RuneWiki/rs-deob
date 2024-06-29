import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class151 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "[I")
    public static int[] field2733 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Z")
    public static boolean field2737 = false;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "[I")
    public static int[] field2740 = new int[2000];

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lsf;")
    public static class108 field2739 = class140.method973(255, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lsf;")
    private static class108 field2734 = class140.method973(255, "Loading config )2 ");

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lsf;")
    public static class108 field2738 = field2734;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Lhe;")
    public static class94 field2732 = new class94(50);

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Lsf;")
    public static class108 field2743 = class140.method973(255, "::");

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field2742 = -1;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Ljava/awt/Font;")
    public static Font field2731;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lla;Lrm;BI)V", line = 30)
    public static final void method1069(class139 arg0, class249 arg1, byte arg2, int arg3) {
        field2735++;
        class182 var4 = new class182();
        var4.field3338 = arg1.method1731(true);
        var4.field3332 = arg1.method1738(-1756395344);
        var4.field3354 = new class205[var4.field3338];
        var4.field3350 = new int[var4.field3338];
        var4.field3340 = new byte[var4.field3338][][];
        var4.field3341 = new int[var4.field3338];
        var4.field3352 = new class205[var4.field3338];
        var4.field3356 = new int[var4.field3338];
        for (int var5 = 0; var5 < var4.field3338; var5++) {
            try {
                int var6 = arg1.method1731(true);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg1.method1740(true).method782(false));
                    int var18 = 0;
                    String var19 = new String(arg1.method1740(true).method782(false));
                    if (var6 == 1) {
                        var18 = arg1.method1738(-1756395344);
                    }
                    var4.field3341[var5] = var6;
                    var4.field3350[var5] = var18;
                    var4.field3354[var5] = arg0.method968(var19, class292.method2089(var17, 500), 109);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg1.method1740(true).method782(false));
                    String var8 = new String(arg1.method1740(true).method782(false));
                    int var9 = arg1.method1731(true);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg1.method1740(true).method782(false));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg1.method1738(-1756395344);
                            var12[var13] = new byte[var14];
                            arg1.method1711(0, var12[var13], var14, 119);
                        }
                    }
                    var4.field3341[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class292.method2089(var10[var16], 500);
                    }
                    var4.field3352[var5] = arg0.method966(var8, var15, class292.method2089(var7, 500), (byte) 114);
                    var4.field3340[var5] = var12;
                }
            } catch (ClassNotFoundException var26) {
                var4.field3356[var5] = -1;
            } catch (SecurityException var27) {
                var4.field3356[var5] = -2;
            } catch (NullPointerException var28) {
                var4.field3356[var5] = -3;
            } catch (Exception var29) {
                var4.field3356[var5] = -4;
            } catch (Throwable var30) {
                var4.field3356[var5] = -5;
            }
        }
        int var25 = -64 % ((arg2 + 40) / 57);
        class96.field1554.method5(var4, (byte) -120);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 155)
    public static void method1070(int arg0) {
        field2738 = null;
        field2734 = null;
        field2731 = null;
        field2740 = null;
        field2732 = null;
        if (arg0 != -21092) {
            method1070(-72);
        }
        field2733 = null;
        field2743 = null;
        field2739 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIII)V", line = 184)
    public static final void method1071(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2741++;
        if (class166.field2984 >= arg0 && class266.field4677 <= arg1) {
            boolean var6;
            if (arg4 < class260.field4593) {
                arg4 = class260.field4593;
                var6 = false;
            } else if (arg4 <= class79.field1202) {
                var6 = true;
            } else {
                arg4 = class79.field1202;
                var6 = false;
            }
            boolean var7;
            if (class260.field4593 > arg3) {
                arg3 = class260.field4593;
                var7 = false;
            } else if (arg3 <= class79.field1202) {
                var7 = true;
            } else {
                arg3 = class79.field1202;
                var7 = false;
            }
            if (class266.field4677 <= arg0) {
                class209.method1452(arg4, class106.field1839[arg0++], 7, arg3, arg2);
            } else {
                arg0 = class266.field4677;
            }
            if (arg1 <= class166.field2984) {
                class209.method1452(arg4, class106.field1839[arg1--], 7, arg3, arg2);
            } else {
                arg1 = class166.field2984;
            }
            if (var7 && var6) {
                for (int var8 = arg0; var8 <= arg1; var8++) {
                    int[] var9 = class106.field1839[var8];
                    var9[arg3] = var9[arg4] = arg2;
                }
            } else if (var7) {
                for (int var10 = arg0; var10 <= arg1; var10++) {
                    class106.field1839[var10][arg3] = arg2;
                }
            } else if (var6) {
                for (int var11 = arg0; var11 <= arg1; var11++) {
                    class106.field1839[var11][arg4] = arg2;
                }
            }
        }
        int var12 = -28 % ((arg5 - 4) / 57);
    }
}
