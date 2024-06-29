import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class347 {

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Z")
    public boolean field4738 = false;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lmq;")
    private class104 field4751 = new class104(64);

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Lmq;")
    public class104 field4755 = new class104(500);

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "Lmq;")
    public class104 field4756 = new class104(30);

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "Lmq;")
    public class104 field4758 = new class104(50);

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lfc;")
    private class343 field4747;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
    public boolean field4736;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public int field4750;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lfc;")
    public class343 field4741;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Z")
    public static boolean field4745 = false;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    public int field4759;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "Lfc;")
    public static class343 field4752;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Loo;")
    public static class71 field4733;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "[I")
    public static int[] field4754;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public final void method2069(byte arg0) {
        class104 var2 = this.field4751;
        synchronized (this.field4751) {
            this.field4751.method656(arg0 ^ 0x6D);
        }
        field4735++;
        class104 var3 = this.field4755;
        synchronized (this.field4755) {
            this.field4755.method656(125);
        }
        class104 var4 = this.field4756;
        synchronized (this.field4756) {
            this.field4756.method656(94);
        }
        class104 var5 = this.field4758;
        synchronized (this.field4758) {
            if (arg0 == 21) {
                this.field4758.method656(94);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method2070(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        int var9 = -18 % (-arg5 / 46);
        field4737++;
        if (arg0 < 1 || arg6 < 1 || class200.field2875 - 2 < arg0 || arg6 > class422.field5811 - 2) {
            return;
        }
        if (!class410.method2404(-1) && !class341.method2020(class480.field6794, arg0, arg8, (byte) 80, arg6)) {
            return;
        }
        if (class455.field6293 == null) {
            return;
        }
        class154.field2208.method723(arg6, arg8, class338.field4636, arg0, 4, arg1, class308.field4209[arg8]);
        if (arg3 < 0) {
            return;
        }
        boolean var10 = class216.field3068;
        class216.field3068 = true;
        int var11 = arg8;
        if (arg8 < 3 && class473.method2774(false, arg0, arg6)) {
            var11 = arg8 + 1;
        }
        class154.field2208.method724(class338.field4636, -12678, arg4, arg3, arg7, arg6, arg2, var11, arg0, arg8, class308.field4209[arg8]);
        class216.field3068 = var10;
        return;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public final void method2071(int arg0) {
        class104 var2 = this.field4751;
        synchronized (this.field4751) {
            if (arg0 != -6166) {
                this.method2075(-75, true);
            }
            this.field4751.method654(false);
        }
        field4734++;
        class104 var3 = this.field4755;
        synchronized (this.field4755) {
            this.field4755.method654(false);
        }
        class104 var4 = this.field4756;
        synchronized (this.field4756) {
            this.field4756.method654(false);
        }
        class104 var5 = this.field4758;
        synchronized (this.field4758) {
            this.field4758.method654(false);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
    public final void method2072(int arg0, boolean arg1) {
        field4742++;
        int var3 = 77 % ((arg0 + 29) / 59);
        if (this.field4736 != arg1) {
            this.field4736 = arg1;
            this.method2069((byte) 21);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
    public final void method2073(byte arg0, int arg1) {
        field4744++;
        this.field4759 = arg1;
        class104 var3 = this.field4755;
        synchronized (this.field4755) {
            this.field4755.method656(112);
        }
        class104 var4 = this.field4756;
        synchronized (this.field4756) {
            this.field4756.method656(108);
        }
        class104 var5 = this.field4758;
        synchronized (this.field4758) {
            this.field4758.method656(94);
            int var6 = 88 % ((-arg0 - 41) / 35);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I")
    public static int method2074(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(IZ)Lcj;")
    public final class475 method2075(int arg0, boolean arg1) {
        field4753++;
        class104 var3 = this.field4751;
        class475 var4;
        synchronized (this.field4751) {
            var4 = (class475) this.field4751.method659((long) arg0, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4747.method2029(class221.method1401(0, arg0), class211.method1327(23111, arg0), 0);
        class475 var6 = new class475();
        var6.field6705 = arg0;
        var6.field6662 = this;
        if (var5 != null) {
            var6.method2798(new class425(var5), 97);
        }
        if (arg1) {
            this.field4758 = null;
        }
        var6.method2790(0);
        if (!this.field4736 && var6.field6692) {
            var6.field6676 = null;
            var6.field6672 = null;
        }
        if (var6.field6731) {
            var6.field6700 = false;
            var6.field6671 = 0;
        }
        class104 var7 = this.field4751;
        synchronized (this.field4751) {
            this.field4751.method653(72, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V")
    public final void method2076(int arg0, int arg1) {
        field4749++;
        this.field4751 = new class104(arg0);
        if (arg1 != 26748) {
            this.method2075(23, false);
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)V")
    public final void method2077(int arg0, int arg1) {
        if (arg1 != 12790) {
            this.field4750 = -81;
        }
        field4739++;
        class104 var3 = this.field4751;
        synchronized (this.field4751) {
            this.field4751.method666(arg0, false);
        }
        class104 var4 = this.field4755;
        synchronized (this.field4755) {
            this.field4755.method666(arg0, false);
        }
        class104 var5 = this.field4756;
        synchronized (this.field4756) {
            this.field4756.method666(arg0, false);
        }
        class104 var6 = this.field4758;
        synchronized (this.field4758) {
            this.field4758.method666(arg0, false);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static void method2078(int arg0) {
        if (arg0 != 29149) {
            field4733 = null;
        }
        field4733 = null;
        field4752 = null;
        field4754 = null;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(II)Lbp;")
    public static final class69 method2079(int arg0, int arg1) {
        field4748++;
        class69 var2 = (class69) class248.field3481.method659((long) arg0, (byte) -1);
        if (var2 != null) {
            return var2;
        } else if (arg1 == -1) {
            byte[] var3 = class243.field3445.method2029(1, arg0, 0);
            class69 var4 = new class69();
            var4.field1024 = arg0;
            if (var3 != null) {
                var4.method487(new class425(var3), (byte) 113);
            }
            var4.method486(arg1 + 1);
            if (var4.field1013 == 2 && class317.field4307.method2614((long) arg0, -83) == null) {
                class317.field4307.method2620((long) arg0, new class128(class136.field1931), false);
                class473.field6631[class136.field1931++] = var4;
            }
            class248.field3481.method653(30, (long) arg0, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLqr;)I")
    public static final int method2080(boolean arg0, class23 arg1) {
        if (!arg0) {
            return -68;
        }
        field4743++;
        int var2 = arg1.field386;
        class318 var3 = arg1.method517(-75);
        if (arg1.field1127) {
            var2 = arg1.field398;
        } else if (arg1.field1089 == var3.field4348 || arg1.field1089 == var3.field4312 || arg1.field1089 == var3.field4352 || arg1.field1089 == var3.field4317) {
            var2 = arg1.field382;
        } else if (arg1.field1089 == var3.field4350 || arg1.field1089 == var3.field4357 || arg1.field1089 == var3.field4329 || arg1.field1089 == var3.field4315) {
            var2 = arg1.field420;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILdq;Llk;)V")
    public static final void method2081(int arg0, int arg1, class14 arg2, class425 arg3) {
        field4740++;
        class325 var4 = new class325();
        var4.field4474 = arg3.method2503(true);
        if (arg1 != -1) {
            method2078(69);
        }
        var4.field4467 = arg3.method2502((byte) -86);
        var4.field4479 = new int[var4.field4474];
        var4.field4475 = new int[var4.field4474];
        var4.field4471 = new class420[var4.field4474];
        var4.field4465 = new byte[var4.field4474][][];
        var4.field4466 = new int[var4.field4474];
        var4.field4463 = new class420[var4.field4474];
        for (int var5 = 0; var5 < var4.field4474; var5++) {
            try {
                int var6 = arg3.method2503(true);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method2464(false);
                    String var8 = arg3.method2464(false);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method2502((byte) -86);
                    }
                    var4.field4475[var5] = var6;
                    var4.field4466[var5] = var9;
                    var4.field4471[var5] = arg2.method142(var8, class226.method1423(class382.method2292(arg1, -74), var7), false);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method2464(false);
                    String var11 = arg3.method2464(false);
                    int var12 = arg3.method2503(true);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method2464(false);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method2502((byte) -86);
                            var15[var16] = new byte[var17];
                            arg3.method2507(var15[var16], (byte) 84, 0, var17);
                        }
                    }
                    var4.field4475[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class226.method1423(76, var13[var19]);
                    }
                    var4.field4463[var5] = arg2.method130((byte) -101, var11, var18, class226.method1423(113, var10));
                    var4.field4465[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4479[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4479[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4479[var5] = -3;
            } catch (Exception var23) {
                var4.field4479[var5] = -4;
            } catch (Throwable var24) {
                var4.field4479[var5] = -5;
            }
        }
        class290.field3988.method1553((byte) -123, var4);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BZ)V")
    public final void method2082(byte arg0, boolean arg1) {
        if (arg0 > -6) {
            this.method2072(42, false);
        }
        field4746++;
        if (this.field4738 != arg1) {
            this.field4738 = arg1;
            this.method2069((byte) 21);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static final void method2083(byte arg0) {
        field4757++;
        int var1 = class163.field2345;
        int[] var2 = class482.field6800;
        for (int var3 = 0; var3 < var1; var3++) {
            class23 var7 = class310.field4235[var2[var3]];
            if (var7 != null && var7.field1084 > 0) {
                var7.field1084--;
                if (var7.field1084 == 0) {
                    var7.field1118 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class32.field520; var4++) {
            int var5 = class42.field718[var4];
            class196 var6 = class256.field3581[var5];
            if (var6 != null && var6.field1084 > 0) {
                var6.field1084--;
                if (var6.field1084 == 0) {
                    var6.field1118 = null;
                }
            }
        }
        if (arg0 != -2) {
            field4745 = false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ldk;IZLfc;Lfc;)V")
    public class347(class328 arg0, int arg1, boolean arg2, class343 arg3, class343 arg4) {
        this.field4747 = arg3;
        this.field4736 = arg2;
        this.field4750 = arg1;
        this.field4741 = arg4;
        if (this.field4747 != null) {
            int var6 = this.field4747.method2027(125) - 1;
            this.field4747.method2054(0, var6);
        }
    }

    static {
        new class112("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
    }
}
