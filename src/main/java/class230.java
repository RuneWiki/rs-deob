import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class230 {

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    private int field4298 = 0;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    private int field4303 = -1;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Lwi;")
    private class248 field4302 = new class248();

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Z")
    public boolean field4312 = false;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    private int field4307;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[Lod;")
    private class156[] field4293;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    private int field4299;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "[[[I")
    private int[][][] field4308;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Li;")
    private static class88 field4295 = class208.method1425(105, "Loading textures )2 ");

    @OriginalMember(owner = "client!va", name = "m", descriptor = "[B")
    public static byte[] field4305 = new byte[520];

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Li;")
    public static class88 field4297 = field4295;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Lca;")
    public static class24 field4304 = new class24(30);

    @OriginalMember(owner = "client!va", name = "u", descriptor = "Li;")
    public static class88 field4313 = class208.method1425(105, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!va", name = "v", descriptor = "Lae;")
    public static class6 field4314 = new class6(5000);

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field4318 = 7759444;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "Li;")
    private static class88 field4317 = class208.method1425(105, "Please use a different world)3");

    @OriginalMember(owner = "client!va", name = "A", descriptor = "Li;")
    public static class88 field4319 = field4317;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field4320 = 0;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "Li;")
    public static class88 field4321 = field4317;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Lob;")
    public static class154 field4315;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "[Lrh;")
    public static class193[] field4322;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public final void method1533(int arg0) {
        field4296++;
        for (int var2 = arg0; var2 < this.field4299; var2++) {
            this.field4308[var2][0] = null;
            this.field4308[var2][1] = null;
            this.field4308[var2][2] = null;
            this.field4308[var2] = null;
        }
        this.field4308 = null;
        this.field4293 = null;
        this.field4302.method1618(-3);
        this.field4302 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIB)V")
    public static final void method1534(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4300++;
        if (class67.field1207 <= arg0 - arg1 && class12.field183 >= arg0 + arg1 && arg2 - arg1 >= class49.field919 && class18.field279 >= arg1 + arg2) {
            class109.method747(116, arg2, arg3, arg1, arg0);
        } else {
            class46.method318(-61, arg3, arg0, arg1, arg2);
        }
        if (arg4 != 34) {
            method1537(null, 71, 10, null);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4301++;
        if (class211.method1447(0, arg6)) {
            class143.method935(arg2, arg4, 31, arg7, -1, arg1, class78.field1418[arg6], arg3, arg0);
            int var8 = -83 / ((24 - arg5) / 34);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII[I)V")
    public static final void method1536(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field4294++;
        arg0--;
        int var13 = arg3 - 1;
        int var5 = arg2 + var13;
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg4[var6] = arg1;
            int var7 = var6 + 1;
            arg4[var7] = arg1;
            int var8 = var7 + 1;
            arg4[var8] = arg1;
            int var9 = var8 + 1;
            arg4[var9] = arg1;
            int var10 = var9 + 1;
            arg4[var10] = arg1;
            int var11 = var10 + 1;
            arg4[var11] = arg1;
            int var12 = var11 + 1;
            arg4[var12] = arg1;
            arg0 = var12 + 1;
            arg4[arg0] = arg1;
        }
        while (arg0 < var13) {
            arg0++;
            arg4[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lqg;IILea;)V")
    public static final void method1537(class181 arg0, int arg1, int arg2, class46 arg3) {
        field4310++;
        class9 var4 = new class9();
        var4.field124 = arg3.method347(26119);
        var4.field136 = arg3.method323((byte) -62);
        var4.field129 = new int[var4.field124];
        var4.field139 = new class163[var4.field124];
        if (arg1 != 0) {
            return;
        }
        var4.field128 = new int[var4.field124];
        var4.field132 = new int[var4.field124];
        var4.field131 = new byte[var4.field124][][];
        var4.field138 = new class163[var4.field124];
        for (int var5 = 0; var5 < var4.field124; var5++) {
            try {
                int var6 = arg3.method347(26119);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method298(-125).method613(-67));
                    String var18 = new String(arg3.method298(-126).method613(-87));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method323((byte) -61);
                    }
                    var4.field128[var5] = var6;
                    var4.field129[var5] = var19;
                    var4.field139[var5] = arg0.method1293(var18, 15, class237.method1576(var17, 10608));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method298(-127).method613(-81));
                    String var8 = new String(arg3.method298(-126).method613(arg1 - 123));
                    int var9 = arg3.method347(26119);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method298(-126).method613(arg1 - 103));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method323((byte) -34);
                            var12[var13] = new byte[var14];
                            arg3.method307(false, var14, var12[var13], 0);
                        }
                    }
                    var4.field128[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class237.method1576(var10[var16], 10608);
                    }
                    var4.field138[var5] = arg0.method1296(var8, class237.method1576(var7, 10608), var15, (byte) 7);
                    var4.field131[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field132[var5] = -1;
            } catch (SecurityException var21) {
                var4.field132[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field132[var5] = -3;
            } catch (Exception var23) {
                var4.field132[var5] = -4;
            } catch (Throwable var24) {
                var4.field132[var5] = -5;
            }
        }
        class89.field1695.method1624(var4, 115);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ[Lq;)V")
    public static final void method1538(int arg0, boolean arg1, class174[] arg2) {
        if (arg1) {
            field4317 = null;
        }
        field4306++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class174 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field3392 == 0) {
                    if (var4.field3467 != null) {
                        method1538(arg0, false, var4.field3467);
                    }
                    class168 var5 = (class168) class128.field2397.method1051(-1, (long) var4.field3425);
                    if (var5 != null) {
                        class137.method914(var5.field3231, arg0, 4);
                    }
                }
                if (arg0 == 0 && var4.field3436 != null) {
                    class39 var6 = new class39();
                    var6.field678 = var4;
                    var6.field681 = var4.field3436;
                    class200.method1375(var6, -876775538);
                }
                if (arg0 == 1 && var4.field3497 != null) {
                    if (var4.field3408 >= 0) {
                        class174 var7 = class239.method1581(-64, var4.field3425);
                        if (var7 == null || var7.field3467 == null || var4.field3408 >= var7.field3467.length || var7.field3467[var4.field3408] != var4) {
                            continue;
                        }
                    }
                    class39 var8 = new class39();
                    var8.field678 = var4;
                    var8.field681 = var4.field3497;
                    class200.method1375(var8, -876775538);
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)[[[I")
    public final int[][][] method1539(boolean arg0) {
        field4309++;
        if (this.field4307 != this.field4299) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (!arg0) {
            method1534(-124, 61, -59, 26, (byte) -82);
        }
        for (int var2 = 0; var2 < this.field4299; var2++) {
            this.field4293[var2] = class68.field1236;
        }
        return this.field4308;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static void method1540(int arg0) {
        field4313 = null;
        if (arg0 != 0) {
            field4321 = null;
        }
        field4305 = null;
        field4322 = null;
        field4317 = null;
        field4315 = null;
        field4295 = null;
        field4321 = null;
        field4297 = null;
        field4319 = null;
        field4304 = null;
        field4314 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method1541(boolean arg0, int arg1) {
        field4311++;
        if (!arg0) {
            return null;
        } else if (this.field4307 == this.field4299) {
            this.field4312 = this.field4293[arg1] == null;
            this.field4293[arg1] = class68.field1236;
            return this.field4308[arg1];
        } else if (this.field4299 == 1) {
            this.field4312 = this.field4303 != arg1;
            this.field4303 = arg1;
            return this.field4308[0];
        } else {
            class156 var3 = this.field4293[arg1];
            if (var3 == null) {
                this.field4312 = true;
                if (this.field4299 > this.field4298) {
                    var3 = new class156(arg1, this.field4298);
                    this.field4298++;
                } else {
                    class156 var4 = (class156) this.field4302.method1614((byte) -25);
                    var3 = new class156(arg1, var4.field3008);
                    this.field4293[var4.field3017] = null;
                    var4.method460(true);
                }
                this.field4293[arg1] = var3;
            } else {
                this.field4312 = false;
            }
            this.field4302.method1617(24290, var3);
            return this.field4308[var3.field3008];
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(III)V")
    public class230(int arg0, int arg1, int arg2) {
        this.field4307 = arg1;
        this.field4293 = new class156[this.field4307];
        this.field4299 = arg0;
        this.field4308 = new int[this.field4299][3][arg2];
    }
}
