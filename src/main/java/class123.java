import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class123 {

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "Lkp;")
    public class337 field1879 = new class337();

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field1864 = 0;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "Z")
    public static boolean field1870 = false;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "B")
    public static byte field1873;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "F")
    public static float field1863;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "Lkp;")
    private class337 field1881;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "Lum;")
    public static class362 field1868;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "[I")
    public static int[] field1865;

    static {
        new class475(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)Leu;", line = 3)
    public static final class333 method808(byte arg0) {
        field1861++;
        int var1 = -94 / ((arg0 + 52) / 47);
        try {
            return (class333) Class.forName("vu").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lkp;Z)V", line = 24)
    public final void method809(class337 arg0, boolean arg1) {
        if (arg1) {
            this.method816(-128);
        }
        if (arg0.field4735 != null) {
            arg0.method2049(-121);
        }
        field1874++;
        arg0.field4737 = this.field1879;
        arg0.field4735 = this.field1879.field4735;
        arg0.field4735.field4737 = arg0;
        arg0.field4737.field4735 = arg0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)I", line = 41)
    public final int method810(boolean arg0) {
        field1866++;
        int var2 = 0;
        if (arg0) {
            field1863 = -0.22464967F;
        }
        for (class337 var3 = this.field1879.field4737; var3 != this.field1879; var3 = var3.field4737) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BILdh;Lji;)V", line = 62)
    public static final void method811(byte arg0, int arg1, class209 arg2, class432 arg3) {
        field1882++;
        class353 var4 = new class353();
        var4.field5412 = arg2.method1428(arg0 ^ 0x7D0F);
        var4.field5411 = arg2.method1452(65280);
        var4.field5405 = new int[var4.field5412];
        var4.field5402 = new class281[var4.field5412];
        var4.field5410 = new int[var4.field5412];
        if (arg0 != 117) {
            return;
        }
        var4.field5400 = new class281[var4.field5412];
        var4.field5408 = new byte[var4.field5412][][];
        var4.field5409 = new int[var4.field5412];
        for (int var5 = 0; var5 < var4.field5412; var5++) {
            try {
                int var6 = arg2.method1428(32122);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg2.method1449(arg0 ^ 0x11);
                    String var18 = arg2.method1449(124);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method1452(65280);
                    }
                    var4.field5405[var5] = var6;
                    var4.field5409[var5] = var19;
                    var4.field5402[var5] = arg3.method2585((byte) -99, var18, class140.method932(-1, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method1449(72);
                    String var8 = arg2.method1449(103);
                    int var9 = arg2.method1428(32122);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method1449(class315.method1970(arg0, 40));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method1452(arg0 ^ 0xFF75);
                            var12[var13] = new byte[var14];
                            arg2.method1436((byte) 127, 0, var12[var13], var14);
                        }
                    }
                    var4.field5405[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class140.method932(-1, var10[var16]);
                    }
                    var4.field5400[var5] = arg3.method2570(class140.method932(class315.method1970(arg0, -118), var7), var8, 99, var15);
                    var4.field5408[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field5410[var5] = -1;
            } catch (SecurityException var21) {
                var4.field5410[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field5410[var5] = -3;
            } catch (Exception var23) {
                var4.field5410[var5] = -4;
            } catch (Throwable var24) {
                var4.field5410[var5] = -5;
            }
        }
        class499.field7355.method809(var4, false);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Lkp;", line = 183)
    public final class337 method812(int arg0) {
        field1869++;
        class337 var2 = this.field1881;
        if (this.field1879 == var2) {
            this.field1881 = null;
            return null;
        }
        if (arg0 < 79) {
            this.method812(-99);
        }
        this.field1881 = var2.field4737;
        return var2;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLsc;)V", line = 205)
    public static final void method813(byte arg0, class229 arg1) {
        int var2 = 108 % ((-arg0 - 42) / 57);
        field1878++;
        arg1.field3420 = null;
        if (class487.field7193 < 20) {
            class263.field3857.method1878(2, arg1);
            class487.field7193++;
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)Lkp;", line = 226)
    public final class337 method814(int arg0) {
        field1875++;
        class337 var2 = this.field1881;
        if (this.field1879 == var2) {
            this.field1881 = null;
            return null;
        }
        this.field1881 = var2.field4735;
        if (arg0 >= -40) {
            this.method823((byte) -89);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)Lkp;", line = 252)
    public final class337 method815(int arg0) {
        field1862++;
        class337 var2 = this.field1879.field4737;
        if (arg0 >= -118) {
            this.method816(-51);
        }
        if (this.field1879 == var2) {
            return null;
        } else {
            var2.method2049(-119);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)Lkp;", line = 269)
    public final class337 method816(int arg0) {
        if (arg0 < 96) {
            return null;
        }
        field1872++;
        class337 var2 = this.field1879.field4737;
        if (this.field1879 == var2) {
            this.field1881 = null;
            return null;
        } else {
            this.field1881 = var2.field4737;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V", line = 289)
    public final void method817(int arg0) {
        if (arg0 != -4) {
            field1870 = false;
        }
        field1867++;
        while (true) {
            class337 var2 = this.field1879.field4737;
            if (this.field1879 == var2) {
                this.field1881 = null;
                return;
            }
            var2.method2049(-85);
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(Z)Lkp;", line = 312)
    public final class337 method818(boolean arg0) {
        field1880++;
        class337 var2 = this.field1879.field4735;
        if (this.field1879 == var2) {
            this.field1881 = null;
            return null;
        }
        this.field1881 = var2.field4735;
        if (arg0) {
            this.method816(46);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLkp;)V", line = 335)
    public final void method819(byte arg0, class337 arg1) {
        field1877++;
        if (arg1.field4735 != null) {
            arg1.method2049(-74);
        }
        arg1.field4735 = this.field1879;
        arg1.field4737 = this.field1879.field4737;
        arg1.field4735.field4737 = arg1;
        if (arg0 <= -56) {
            arg1.field4737.field4735 = arg1;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lkp;ILvp;)V", line = 356)
    private final void method820(class337 arg0, int arg1, class123 arg2) {
        field1871++;
        class337 var4 = this.field1879.field4735;
        int var5 = 23 % ((-arg1 - 16) / 59);
        this.field1879.field4735 = arg0.field4735;
        arg0.field4735.field4737 = this.field1879;
        if (this.field1879 != arg0) {
            arg0.field4735 = arg2.field1879.field4735;
            arg0.field4735.field4737 = arg0;
            var4.field4737 = arg2.field1879;
            arg2.field1879.field4735 = var4;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILvp;)V", line = 384)
    public final void method821(int arg0, class123 arg1) {
        this.method820(this.field1879.field4737, -83, arg1);
        field1883++;
        if (arg0 != -32686) {
            this.method809(null, false);
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V", line = 406)
    public class123() {
        this.field1879.field4735 = this.field1879;
        this.field1879.field4737 = this.field1879;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V", line = 415)
    public static void method822(byte arg0) {
        field1865 = null;
        if (arg0 > -38) {
            method822((byte) 65);
        }
        field1868 = null;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(B)Z", line = 426)
    public final boolean method823(byte arg0) {
        field1876++;
        if (arg0 < 2) {
            field1863 = -0.5067937F;
        }
        return this.field1879.field4737 == this.field1879;
    }
}
