import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class284 {

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "[I")
    private int[] field4764 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public int field4751 = -1;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "Z")
    public boolean field4767 = false;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "Lna;")
    public static class26 field4754 = class69.method505("(U", (byte) -125);

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "Lna;")
    private static class26 field4762 = class69.method505("Loading title screen )2 ", (byte) -127);

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "Lna;")
    public static class26 field4748 = class69.method505("Bitte entfernen Sie ", (byte) -122);

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field4753 = 0;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int field4761 = 0;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field4757 = 0;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "Lna;")
    public static class26 field4750 = class69.method505(" ", (byte) -117);

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Lna;")
    public static class26 field4744 = field4762;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "Lna;")
    private static class26 field4768 = class69.method505("Loading)3)3)3", (byte) -118);

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Lna;")
    public static class26 field4745 = field4768;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "[I")
    private int[] field4763;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "[S")
    private short[] field4742;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "[S")
    private short[] field4749;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "[S")
    private short[] field4759;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "[S")
    private short[] field4760;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Lgb;", line = 9)
    public final class169 method1998(boolean arg0) {
        field4756++;
        if (!arg0) {
            return (class169) null;
        }
        int var2 = 0;
        class169[] var3 = new class169[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field4764[var4] != -1) {
                var3[var2++] = class169.method1166(class306.field5278, this.field4764[var4], 0);
            }
        }
        class169 var5 = new class169(var3, var2);
        if (this.field4749 != null) {
            for (int var6 = 0; var6 < this.field4749.length; var6++) {
                var5.method1167(this.field4749[var6], this.field4742[var6]);
            }
        }
        if (this.field4760 != null) {
            for (int var7 = 0; var7 < this.field4760.length; var7++) {
                var5.method1149(this.field4760[var7], this.field4759[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Z", line = 65)
    public final boolean method1999(int arg0) {
        field4746++;
        if (this.field4763 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 < 72) {
            this.method2005(44);
        }
        for (int var3 = 0; var3 < this.field4763.length; var3++) {
            if (!class306.field5278.method1885((byte) -90, 0, this.field4763[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V", line = 94)
    public static void method2000(int arg0) {
        field4754 = null;
        field4762 = null;
        if (arg0 != -9893) {
            return;
        }
        field4768 = null;
        field4750 = null;
        field4745 = null;
        field4748 = null;
        field4744 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BII[B)Z", line = 115)
    public static final boolean method2001(byte arg0, int arg1, int arg2, byte[] arg3) {
        field4743++;
        int var4 = 106 % ((-arg0 - 11) / 51);
        boolean var5 = true;
        int var6 = -1;
        class82 var7 = new class82(arg3);
        label68: while (true) {
            int var8 = var7.method612((byte) -121);
            if (var8 == 0) {
                return var5;
            }
            int var9 = 0;
            var6 += var8;
            boolean var10 = false;
            while (true) {
                int var16;
                class78 var17;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var10) {
                                        int var18 = var7.method617(true);
                                        if (var18 == 0) {
                                            continue label68;
                                        }
                                        var7.method642((byte) -116);
                                    }
                                    int var11 = var7.method617(true);
                                    if (var11 == 0) {
                                        continue label68;
                                    }
                                    var9 += var11 - 1;
                                    int var12 = var9 & 0x3F;
                                    int var13 = (var9 & 0xFF8) >> 6;
                                    var14 = arg2 + var12;
                                    var15 = arg1 + var13;
                                    var16 = var7.method642((byte) -94) >> 2;
                                } while (var15 <= 0);
                            } while (var14 <= 0);
                        } while (var15 >= 103);
                    } while (var14 >= 103);
                    var17 = class104.method750(4, var6);
                } while (var16 == 22 && !class22.field307 && var17.field1229 == 0 && var17.field1239 != 1 && !var17.field1175);
                var10 = true;
                if (!var17.method561(false)) {
                    var5 = false;
                    class104.field1665++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V", line = 199)
    public static final void method2002(byte arg0) {
        field4758++;
        class300.field5157.method1422((byte) -98);
        int var1 = class300.field5157.method1427(arg0, 8);
        if (class81.field1270 > var1) {
            for (int var2 = var1; var2 < class81.field1270; var2++) {
                class116.field1824[class312.field5341++] = class316.field5412[var2];
            }
        }
        if (class81.field1270 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class81.field1270 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class316.field5412[var3];
            class324 var5 = class185.field2877[var4];
            int var6 = class300.field5157.method1427((byte) -11, 1);
            if (var6 == 0) {
                class316.field5412[class81.field1270++] = var4;
                var5.field3982 = class229.field3626;
            } else {
                int var7 = class300.field5157.method1427((byte) -11, 2);
                if (var7 == 0) {
                    class316.field5412[class81.field1270++] = var4;
                    var5.field3982 = class229.field3626;
                    class168.field2599[class28.field474++] = var4;
                } else if (var7 == 1) {
                    class316.field5412[class81.field1270++] = var4;
                    var5.field3982 = class229.field3626;
                    int var12 = class300.field5157.method1427((byte) -11, 3);
                    var5.method1658(1, (byte) 32, var12);
                    int var13 = class300.field5157.method1427((byte) -11, 1);
                    if (var13 == 1) {
                        class168.field2599[class28.field474++] = var4;
                    }
                } else if (var7 == 2) {
                    class316.field5412[class81.field1270++] = var4;
                    var5.field3982 = class229.field3626;
                    if (class300.field5157.method1427((byte) -11, 1) == 1) {
                        int var8 = class300.field5157.method1427((byte) -11, 3);
                        var5.method1658(2, (byte) -122, var8);
                        int var9 = class300.field5157.method1427((byte) -11, 3);
                        var5.method1658(2, (byte) 85, var9);
                    } else {
                        int var10 = class300.field5157.method1427((byte) -11, 3);
                        var5.method1658(0, (byte) -80, var10);
                    }
                    int var11 = class300.field5157.method1427((byte) -11, 1);
                    if (var11 == 1) {
                        class168.field2599[class28.field474++] = var4;
                    }
                } else if (var7 == 3) {
                    class116.field1824[class312.field5341++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLwa;I)V", line = 317)
    private final void method2003(byte arg0, class82 arg1, int arg2) {
        if (arg0 >= -16) {
            this.field4759 = (short[]) null;
        }
        if (arg2 == 1) {
            this.field4751 = arg1.method642((byte) -67);
        } else if (arg2 == 2) {
            int var4 = arg1.method642((byte) -71);
            this.field4763 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4763[var5] = arg1.method576(1);
            }
        } else if (arg2 == 3) {
            this.field4767 = true;
        } else if (arg2 == 40) {
            int var8 = arg1.method642((byte) -128);
            this.field4742 = new short[var8];
            this.field4749 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4749[var9] = (short) arg1.method576(1);
                this.field4742[var9] = (short) arg1.method576(1);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method642((byte) -49);
            this.field4760 = new short[var6];
            this.field4759 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4760[var7] = (short) arg1.method576(1);
                this.field4759[var7] = (short) arg1.method576(1);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field4764[arg2 - 60] = arg1.method576(1);
        }
        field4766++;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Lgb;", line = 395)
    public final class169 method2004(byte arg0) {
        field4747++;
        if (this.field4763 == null) {
            return null;
        }
        class169[] var2 = new class169[this.field4763.length];
        for (int var3 = 0; var3 < this.field4763.length; var3++) {
            var2[var3] = class169.method1166(class306.field5278, this.field4763[var3], 0);
        }
        int var4 = 27 / ((arg0 - 74) / 35);
        class169 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class169(var2, var2.length);
        }
        if (this.field4749 != null) {
            for (int var6 = 0; var6 < this.field4749.length; var6++) {
                var5.method1167(this.field4749[var6], this.field4742[var6]);
            }
        }
        if (this.field4760 != null) {
            for (int var7 = 0; var7 < this.field4760.length; var7++) {
                var5.method1149(this.field4760[var7], this.field4759[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)Z", line = 453)
    public final boolean method2005(int arg0) {
        boolean var2 = true;
        if (arg0 != 18991) {
            this.field4742 = (short[]) null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field4764[var3] != -1 && !class306.field5278.method1885((byte) 95, 0, this.field4764[var3])) {
                var2 = false;
            }
        }
        field4752++;
        return var2;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBIII)V", line = 487)
    public static final void method2006(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4769++;
        int var5 = -44 / ((24 - arg1) / 59);
        int var6 = 0;
        class76.method543(class45.field710[arg4], arg0 - arg2, 100, arg0 + arg2, arg3);
        int var7 = -arg2;
        int var8 = arg2;
        int var9 = -1;
        while (var6 < var8) {
            var6++;
            var9 += 2;
            var7 += var9;
            if (var7 >= 0) {
                var8--;
                var7 -= var8 << 1;
                int[] var10 = class45.field710[arg4 + var8];
                int[] var11 = class45.field710[arg4 - var8];
                int var12 = arg0 + var6;
                int var13 = arg0 - var6;
                class76.method543(var10, var13, 115, var12, arg3);
                class76.method543(var11, var13, 114, var12, arg3);
            }
            int var14 = arg0 + var8;
            int var15 = arg0 - var8;
            int[] var16 = class45.field710[arg4 + var6];
            int[] var17 = class45.field710[arg4 - var6];
            class76.method543(var16, var15, -61, var14, arg3);
            class76.method543(var17, var15, -93, var14, arg3);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lbe;III)V", line = 543)
    public static final void method2007(class297 arg0, int arg1, int arg2, int arg3) {
        field4755++;
        if (class126.field1955 < 2 && class134.field2046 == 0 && !class86.field1420) {
            return;
        }
        if (arg1 > -55) {
            field4762 = (class26) null;
        }
        class26 var4 = class118.method819((byte) 94);
        if (arg0 == null) {
            int var5 = class89.field1474.method1200(var4, arg3 + 4, arg2 - -15, 16777215, 0, class142.field2166, class11.field156);
            class222.method1486(arg3 + 4, class89.field1474.method1199(var4) + var5, (byte) -40, arg2, 15);
            return;
        }
        class175 var6 = arg0.method2102(class268.field4428, 0);
        if (var6 == null) {
            var6 = class89.field1474;
        }
        var6.method1219(var4, arg3, arg2, arg0.field4967, arg0.field4996, arg0.field5022, arg0.field5097, arg0.field4997, arg0.field5029, class142.field2166, class11.field156, class159.field2472);
        class222.method1486(class159.field2472[0], class159.field2472[2], (byte) -40, class159.field2472[1], class159.field2472[3]);
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V", line = 589)
    public static final void method2008(int arg0) {
        field4741++;
        class27.field459 = false;
        class126.field1953 = 0;
        class170.field2658 = -3;
        class121.field1884 = 0;
        class230.field3647 = 1;
        class10.field140 = arg0;
        class301.field5193 = -1;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILwa;)V", line = 624)
    public final void method2009(int arg0, class82 arg1) {
        field4765++;
        if (arg0 != -31957) {
            return;
        }
        while (true) {
            int var3 = arg1.method642((byte) -52);
            if (var3 == 0) {
                return;
            }
            this.method2003((byte) -84, arg1, var3);
        }
    }
}
