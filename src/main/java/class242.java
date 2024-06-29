import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class242 extends class93 {

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    private int field3486;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    private int field3487;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    private int field3488;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    private int field3492;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    private int field3484;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "Lvj;")
    private class303 field3482;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    private int field3493;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "Lcu;")
    public static class145 field3483 = new class145(new byte[5000]);

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "Lrd;")
    private class221 field3485;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILli;Lcu;I)V")
    public static final void method1579(int arg0, class293 arg1, class145 arg2, int arg3) {
        field3489++;
        class84 var4 = new class84();
        var4.field1458 = arg2.method1063((byte) -40);
        var4.field1462 = arg2.method1070(-32387);
        var4.field1461 = new int[var4.field1458];
        var4.field1454 = new class324[var4.field1458];
        var4.field1460 = new int[var4.field1458];
        var4.field1463 = new int[var4.field1458];
        var4.field1456 = new class324[var4.field1458];
        var4.field1457 = new byte[var4.field1458][][];
        for (int var5 = arg3; var5 < var4.field1458; var5++) {
            try {
                int var6 = arg2.method1063((byte) 117);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg2.method1101((byte) -106);
                    String var18 = arg2.method1101((byte) -69);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method1070(-32387);
                    }
                    var4.field1463[var5] = var6;
                    var4.field1461[var5] = var19;
                    var4.field1456[var5] = arg1.method1850(-10, var18, class104.method788(var17, 118));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method1101((byte) -107);
                    String var8 = arg2.method1101((byte) -65);
                    int var9 = arg2.method1063((byte) 117);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method1101((byte) -124);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method1070(arg3 ^ 0xFFFF817D);
                            var12[var13] = new byte[var14];
                            arg2.method1061(var14, var12[var13], 0, 119);
                        }
                    }
                    var4.field1463[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class104.method788(var10[var16], class125.method953(arg3, -114));
                    }
                    var4.field1454[var5] = arg1.method1868(0, class104.method788(var7, -84), var15, var8);
                    var4.field1457[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1460[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1460[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1460[var5] = -3;
            } catch (Exception var23) {
                var4.field1460[var5] = -4;
            } catch (Throwable var24) {
                var4.field1460[var5] = -5;
            }
        }
        class201.field2942.method2417(-122, var4);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)Lrd;")
    public final class221 method713(boolean arg0) {
        field3490++;
        if (this.field3485 == null) {
            class13.field214[4] = this.field3487;
            class13.field214[5] = this.field3484;
            class13.field214[0] = this.field3492;
            class13.field214[1] = this.field3493;
            class13.field214[2] = this.field3486;
            class13.field214[3] = this.field3488;
            class126 var2 = this.field3482.field2501;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method959(class13.field214[var5], (byte) 94)) {
                    return null;
                }
                class83 var7 = var2.method956(-945, class13.field214[var5]);
                int var8 = var7.field1429 ? 64 : 128;
                if (var7.field1438 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class91.field1566[var6] = var2.method958(class13.field214[var6], var4, var4, true, false, 1.0F);
            }
            this.field3485 = new class221(this.field3482, 6407, var4, var3, class91.field1566);
        }
        if (arg0) {
            this.field3488 = 32;
        }
        return this.field3485;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V")
    public static void method1580(byte arg0) {
        field3483 = null;
        if (arg0 < 92) {
            method1581(null);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lqa;)V")
    public static final void method1581(class162 arg0) {
        for (int var1 = class11.field196; var1 < class190.field2830; var1++) {
            for (int var2 = 0; var2 < class151.field2408; var2++) {
                for (int var3 = 0; var3 < class261.field3792; var3++) {
                    class429 var4 = class380.field5761[var1][var2][var3];
                    if (var4 != null) {
                        class241 var5 = var4.field6370;
                        class241 var6 = var4.field6365;
                        if (var5 != null && var5.method24(false)) {
                            class288.method1826(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method24(false)) {
                                class288.method1826(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method18(0, arg0, false, var5, -1, 0, 0);
                                var6.method22((byte) -3);
                            }
                            var5.method22((byte) -3);
                        }
                        for (class166 var7 = var4.field6364; var7 != null; var7 = var7.field2572) {
                            class417 var9 = var7.field2576;
                            if (var9 != null && var9.method24(false)) {
                                class288.method1826(arg0, var9, var1, var2, var3, var9.field6235 + 1 - var9.field6231, var9.field6226 - var9.field6238 + 1);
                                var9.method22((byte) -3);
                            }
                        }
                        class480 var8 = var4.field6366;
                        if (var8 != null && var8.method24(false)) {
                            class65.method548(arg0, var8, var1, var2, var3);
                            var8.method22((byte) -3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lvj;IIIIII)V")
    public class242(class303 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3486 = arg3;
        this.field3487 = arg5;
        this.field3488 = arg4;
        this.field3492 = arg1;
        this.field3484 = arg6;
        this.field3482 = arg0;
        this.field3493 = arg2;
    }
}
