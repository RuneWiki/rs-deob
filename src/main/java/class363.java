import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class363 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[I")
    public int[] field5305;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "[[F")
    public float[][] field5306;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "[I")
    public int[] field5312;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
    public int[] field5311;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "[Z")
    public static boolean[] field5308 = new boolean[100];

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field5307 = 0;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(JI)V", line = 4)
    public static final void method2283(long arg0, int arg1) {
        if (arg1 != -24244) {
            field5308 = null;
        }
        field5313++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class519.method3155(arg0 - 1L, 6);
            class519.method3155(1L, 6);
        } else {
            class519.method3155(arg0, 6);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 27)
    public static final void method2284(byte arg0) {
        class561.method3361((byte) 108);
        field5310++;
        if (arg0 != 1) {
            method2286(11, -11, -84);
        }
        class569.method3387(0);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 39)
    public static void method2285(int arg0) {
        field5308 = null;
        if (arg0 != 27002) {
            method2287(-95, null, null, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)Z", line = 68)
    public static final boolean method2286(int arg0, int arg1, int arg2) {
        field5314++;
        if (arg2 != 542) {
            method2287(13, null, null, (byte) -3);
        }
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILsl;Lhga;B)V", line = 80)
    public static final void method2287(int arg0, class479 arg1, class300 arg2, byte arg3) {
        field5309++;
        if (arg3 != -95) {
            method2286(70, 38, -3);
        }
        class408 var4 = new class408();
        var4.field5808 = arg1.method2886(true);
        var4.field5815 = arg1.method2868(arg3 + 21);
        var4.field5811 = new int[var4.field5808];
        var4.field5804 = new int[var4.field5808];
        var4.field5809 = new int[var4.field5808];
        var4.field5810 = new class432[var4.field5808];
        var4.field5816 = new class432[var4.field5808];
        var4.field5814 = new byte[var4.field5808][][];
        for (int var5 = 0; var5 < var4.field5808; var5++) {
            try {
                int var6 = arg1.method2886(true);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg1.method2894(-13192);
                    String var8 = arg1.method2894(arg3 ^ 0x33D9);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method2868(-48);
                    }
                    var4.field5809[var5] = var6;
                    var4.field5804[var5] = var9;
                    var4.field5816[var5] = arg2.method1882(class122.method865(var7, 22428), var8, (byte) -125);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg1.method2894(-13192);
                    String var11 = arg1.method2894(-13192);
                    int var12 = arg1.method2886(true);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg1.method2894(class639.method3689(arg3, 13273));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method2868(arg3 ^ 0x2E);
                            var15[var16] = new byte[var17];
                            arg1.method2867(-290150072, var15[var16], var17, 0);
                        }
                    }
                    var4.field5809[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class122.method865(var13[var19], class639.method3689(arg3, -22467));
                    }
                    var4.field5810[var5] = arg2.method1873(var11, (byte) -21, class122.method865(var10, 22428), var18);
                    var4.field5814[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field5811[var5] = -1;
            } catch (SecurityException var21) {
                var4.field5811[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field5811[var5] = -3;
            } catch (Exception var23) {
                var4.field5811[var5] = -4;
            } catch (Throwable var24) {
                var4.field5811[var5] = -5;
            }
        }
        class231.field3473.method3559(var4, (byte) 12);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "([I[I[I[[F)V", line = 191)
    public class363(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field5305 = arg2;
        this.field5306 = arg3;
        this.field5312 = arg0;
        this.field5311 = arg1;
    }
}
