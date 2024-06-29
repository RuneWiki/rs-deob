import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class238 extends InputStream {

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "[I")
    public static int[] field3158;

    @OriginalMember(owner = "client!em", name = "read", descriptor = "()I")
    public final int read() {
        class171.method1152(30000L, false);
        field3160++;
        return -1;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1504(String arg0, int arg1, int arg2) {
        field3157++;
        int var3 = class652.field8795;
        int[] var4 = class497.field6986;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class758 var7 = class84.field1204[var4[var6]];
            if (var7 != null && class625.field8475 != var7 && var7.field10367 != null && var7.field10367.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (arg1 == 1) {
                    class24.field243++;
                    class43 var13 = class492.method2903(class201.field2620, arg2 ^ 0x9, class73.field983);
                    var13.field457.method1718((byte) -34, var4[var6]);
                    var13.field457.method1681((byte) -84, 0);
                    class409.method2457((byte) -100, var13);
                } else if (arg1 == 4) {
                    class585.field7971++;
                    class43 var8 = class492.method2903(class709.field9698, 0, class73.field983);
                    var8.field457.method1681((byte) -122, 0);
                    var8.field457.method1713((byte) -71, var4[var6]);
                    class409.method2457((byte) -100, var8);
                } else if (arg1 == 5) {
                    class706.field9651++;
                    class43 var12 = class492.method2903(class723.field9818, 0, class73.field983);
                    var12.field457.method1713((byte) -128, var4[var6]);
                    var12.field457.method1732(0, (byte) -121);
                    class409.method2457((byte) -100, var12);
                } else if (arg1 == 6) {
                    class414.field5953++;
                    class43 var11 = class492.method2903(class584.field7957, 0, class73.field983);
                    var11.field457.method1713((byte) -104, var4[var6]);
                    var11.field457.method1732(0, (byte) -111);
                    class409.method2457((byte) -100, var11);
                } else if (arg1 == 7) {
                    class641.field8638++;
                    class43 var10 = class492.method2903(class397.field5691, 0, class73.field983);
                    var10.field457.method1713((byte) -101, var4[var6]);
                    var10.field457.method1681((byte) -121, 0);
                    class409.method2457((byte) -100, var10);
                } else if (arg1 == 9) {
                    class43 var9 = class492.method2903(class770.field10598, arg2 - 9, class73.field983);
                    var9.field457.method1713((byte) -90, var4[var6]);
                    var9.field457.method1725(0, 82);
                    class409.method2457((byte) -100, var9);
                }
                break;
            }
        }
        if (!var5) {
            class743.method4082(arg2 ^ 0xFFFFFF8A, 4, class58.field718.method365(class55.field647, (byte) 48) + arg0);
        }
        if (arg2 != 9) {
            method1505(null, null, -86, -24);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ldt;Lec;II)V")
    public static final void method1505(class254 arg0, class248 arg1, int arg2, int arg3) {
        field3159++;
        if (arg2 != -6176) {
            field3158 = null;
        }
        class279 var4 = new class279();
        var4.field4035 = arg0.method1731((byte) 64);
        var4.field4039 = arg0.method1672(-16516);
        var4.field4043 = new int[var4.field4035];
        var4.field4049 = new class621[var4.field4035];
        var4.field4042 = new byte[var4.field4035][][];
        var4.field4048 = new int[var4.field4035];
        var4.field4040 = new int[var4.field4035];
        var4.field4036 = new class621[var4.field4035];
        for (int var5 = 0; var5 < var4.field4035; var5++) {
            try {
                int var6 = arg0.method1731((byte) 64);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg0.method1699(-113);
                    String var18 = arg0.method1699(-71);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method1672(arg2 - 10340);
                    }
                    var4.field4048[var5] = var6;
                    var4.field4040[var5] = var19;
                    var4.field4036[var5] = arg1.method1552(var18, class192.method1272(var17, (byte) -104), 9);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg0.method1699(-91);
                    String var8 = arg0.method1699(-84);
                    int var9 = arg0.method1731((byte) 64);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg0.method1699(-108);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method1672(-16516);
                            var12[var13] = new byte[var14];
                            arg0.method1735(0, -122, var12[var13], var14);
                        }
                    }
                    var4.field4048[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class192.method1272(var10[var16], (byte) -100);
                    }
                    var4.field4049[var5] = arg1.method1542(var15, 0, class192.method1272(var7, (byte) -127), var8);
                    var4.field4042[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4043[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4043[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4043[var5] = -3;
            } catch (Exception var23) {
                var4.field4043[var5] = -4;
            } catch (Throwable var24) {
                var4.field4043[var5] = -5;
            }
        }
        class769.field10591.method689(var4, arg2 ^ 0xFFFFE788);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
    public static void method1506(byte arg0) {
        if (arg0 == -120) {
            field3158 = null;
        }
    }
}
