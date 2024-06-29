import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class332 {

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Lmg;")
    private class116 field5260 = new class116();

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    private int field5266;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    private int field5258;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "Lvl;")
    private class164 field5265;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field5261 = 0;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Lta;")
    public static class300 field5264 = new class300(64);

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field5271 = 0;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "[[I")
    public static int[][] field5270;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(JI)V", line = 4)
    public final void method2325(long arg0, int arg1) {
        if (arg1 <= 36) {
            this.field5258 = -56;
        }
        class54 var4 = (class54) this.field5265.method1268(99, arg0);
        if (var4 != null) {
            var4.method330(15);
            var4.method1352(-57);
            this.field5258++;
        }
        field5273++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 23)
    public final void method2326(int arg0) {
        this.field5260.method915((byte) -126);
        field5263++;
        this.field5265.method1266(0);
        if (arg0 == -4) {
            this.field5258 = this.field5266;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 40)
    public final void method2327(int arg0) {
        field5272++;
        if (arg0 != 1) {
            return;
        }
        for (class54 var2 = (class54) this.field5260.method912(false); var2 != null; var2 = (class54) this.field5260.method909(-119)) {
            if (var2.method424(0)) {
                var2.method330(15);
                var2.method1352(arg0 - 52);
                this.field5258++;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 75)
    public static final void method2328(byte arg0) {
        class17.field196.method2327(arg0 ^ 0x59);
        field5262++;
        if (arg0 != 88) {
            method2332(85);
        }
        class348.field5536.method2327(1);
        class230.field3816.method2327(1);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 89)
    public final Object method2329(byte arg0, long arg1) {
        field5268++;
        class54 var4 = (class54) this.field5265.method1268(-101, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg0 != 107) {
            this.method2325(-56L, -29);
        }
        Object var5 = var4.method430((byte) 79);
        if (var5 == null) {
            var4.method330(15);
            var4.method1352(-115);
            this.field5258++;
            return null;
        }
        if (var4.method424(arg0 ^ 0x6B)) {
            class157 var6 = new class157(var5);
            this.field5265.method1273(1, var4.field698, var6);
            this.field5260.method911(500, var6);
            var6.field2754 = 0L;
            var4.method330(15);
            var4.method1352(-87);
        } else {
            this.field5260.method911(500, var4);
            var4.field2754 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILqm;Lna;)V", line = 133)
    public static final void method2330(int arg0, int arg1, class227 arg2, class145 arg3) {
        field5257++;
        class292 var4 = new class292();
        if (arg0 < 68) {
            field5261 = 49;
        }
        var4.field4722 = arg2.method1720((byte) -28);
        var4.field4718 = arg2.method1715((byte) 46);
        var4.field4716 = new int[var4.field4722];
        var4.field4725 = new int[var4.field4722];
        var4.field4714 = new class192[var4.field4722];
        var4.field4721 = new class192[var4.field4722];
        var4.field4715 = new byte[var4.field4722][][];
        var4.field4720 = new int[var4.field4722];
        for (int var5 = 0; var5 < var4.field4722; var5++) {
            try {
                int var6 = arg2.method1720((byte) -8);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg2.method1758((byte) -78);
                    String var18 = arg2.method1758((byte) 60);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method1715((byte) -112);
                    }
                    var4.field4716[var5] = var6;
                    var4.field4725[var5] = var19;
                    var4.field4721[var5] = arg3.method1119(class16.method88((byte) -105, var17), var18, -122);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method1758((byte) 93);
                    String var8 = arg2.method1758((byte) -85);
                    int var9 = arg2.method1720((byte) -82);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method1758((byte) 72);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method1715((byte) 87);
                            var12[var13] = new byte[var14];
                            arg2.method1753(var14, -8988, 0, var12[var13]);
                        }
                    }
                    var4.field4716[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class16.method88((byte) -116, var10[var16]);
                    }
                    var4.field4714[var5] = arg3.method1120(class16.method88((byte) -125, var7), var8, (byte) -35, var15);
                    var4.field4715[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field4720[var5] = -1;
            } catch (SecurityException var26) {
                var4.field4720[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field4720[var5] = -3;
            } catch (Exception var28) {
                var4.field4720[var5] = -4;
            } catch (Throwable var29) {
                var4.field4720[var5] = -5;
            }
        }
        class281.field4616.method2302((byte) -44, var4);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(I)V", line = 275)
    public class332(int arg0) {
        this.field5266 = arg0;
        this.field5258 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field5265 = new class164(var2);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)I", line = 253)
    public final int method2331(boolean arg0) {
        field5267++;
        int var2 = 0;
        class54 var3 = (class54) this.field5260.method912(arg0);
        if (arg0) {
            this.field5266 = -65;
        }
        while (var3 != null) {
            if (!var3.method424(0)) {
                var2++;
            }
            var3 = (class54) this.field5260.method909(-95);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 300)
    public static void method2332(int arg0) {
        field5270 = (int[][]) null;
        if (arg0 > 42) {
            field5264 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(JILjava/lang/Object;)V", line = 312)
    public final void method2333(long arg0, int arg1, Object arg2) {
        this.method2325(arg0, 43);
        field5259++;
        if (this.field5258 == 0) {
            class54 var5 = (class54) this.field5260.method914(-20217);
            var5.method330(15);
            var5.method1352(-44);
        } else {
            this.field5258--;
        }
        class157 var6 = new class157(arg2);
        this.field5265.method1273(1, arg0, var6);
        this.field5260.method911(500, var6);
        var6.field2754 = (long) arg1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V", line = 340)
    public final void method2334(int arg0, int arg1) {
        if (class322.field5128 != null) {
            for (class54 var3 = (class54) this.field5260.method912(false); var3 != null; var3 = (class54) this.field5260.method909(-106)) {
                if (var3.method424(0)) {
                    if (var3.method430((byte) -63) == null) {
                        var3.method330(arg0 + 11);
                        var3.method1352(-69);
                        this.field5258++;
                    }
                } else if ((long) arg1 < ++var3.field2754) {
                    class54 var4 = class322.field5128.method176(-118, var3);
                    this.field5265.method1273(arg0 ^ 0x5, var3.field698, var4);
                    class76.method631(var4, var3, (byte) -126);
                    var3.method330(15);
                    var3.method1352(-69);
                }
            }
        }
        field5269++;
        if (arg0 != 4) {
            this.method2331(false);
        }
    }
}
