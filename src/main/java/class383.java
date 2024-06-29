import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class383 {

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Lvn;")
    public static class169 field5617 = new class169();

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field5619 = 0;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "Lfi;")
    public static class331 field5621 = new class331(10);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Lra;")
    public static class57 field5620;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BIIIIII)V", line = 10)
    public static final void method2455(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5615++;
        class119 var7 = class354.method2262(-128, arg4, arg6);
        if (var7 != null && var7.field1416 != null) {
            class191 var8 = new class191();
            var8.field2602 = var7.field1416;
            var8.field2605 = var7;
            class387.method2471(var8);
        }
        class271.field3842 = true;
        class43.field535 = arg5;
        class338.field5007 = arg1;
        class410.field5936 = arg3;
        if (arg0 == -5) {
            class199.field2715 = arg6;
            class289.field4103 = arg2;
            class24.field243 = arg4;
            class101.method543((byte) -65, var7);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 42)
    public static void method2456(int arg0) {
        field5621 = null;
        field5617 = null;
        field5620 = null;
        if (arg0 != 17051) {
            field5620 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BILbk;Lam;)V", line = 58)
    public static final void method2457(byte arg0, int arg1, class211 arg2, class378 arg3) {
        if (arg0 != 123) {
            field5621 = null;
        }
        field5618++;
        class225 var4 = new class225();
        var4.field3071 = arg2.method1342((byte) -128);
        var4.field3068 = arg2.method1336((byte) -94);
        var4.field3066 = new class241[var4.field3071];
        var4.field3069 = new class241[var4.field3071];
        var4.field3079 = new byte[var4.field3071][][];
        var4.field3074 = new int[var4.field3071];
        var4.field3067 = new int[var4.field3071];
        var4.field3078 = new int[var4.field3071];
        for (int var5 = 0; var5 < var4.field3071; var5++) {
            try {
                int var6 = arg2.method1342((byte) -127);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg2.method1350(arg0 - 50);
                    String var18 = arg2.method1350(116);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method1336((byte) -25);
                    }
                    var4.field3078[var5] = var6;
                    var4.field3074[var5] = var19;
                    var4.field3069[var5] = arg3.method2404(var18, class235.method1498(var17, -127), 119);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method1350(48);
                    String var8 = arg2.method1350(92);
                    int var9 = arg2.method1342((byte) -127);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method1350(50);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method1336((byte) -42);
                            var12[var13] = new byte[var14];
                            arg2.method1370(var12[var13], 0, 19294, var14);
                        }
                    }
                    var4.field3078[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class235.method1498(var10[var16], arg0 - 2);
                    }
                    var4.field3066[var5] = arg3.method2405(true, var8, var15, class235.method1498(var7, 110));
                    var4.field3079[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3067[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3067[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3067[var5] = -3;
            } catch (Exception var23) {
                var4.field3067[var5] = -4;
            } catch (Throwable var24) {
                var4.field3067[var5] = -5;
            }
        }
        class147.field2063.method1125(-1, var4);
    }
}
