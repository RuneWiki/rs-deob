import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class624 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lpa;")
    private class387 field8790 = new class387(64);

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "Lpa;")
    public class387 field8813 = new class387(50);

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "Lcba;")
    public class574 field8814 = new class574(250);

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "Lqg;")
    private class485 field8815 = new class485();

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Lcb;")
    public class544 field8799;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "Lqb;")
    private class233 field8816;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Z")
    private boolean field8796;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public int field8802;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "Lcb;")
    private class544 field8808;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public int field8812;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field8817;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "[Ljava/lang/String;")
    private String[] field8819;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "[I")
    public static int[] field8795 = new int[2];

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "[I")
    public static int[] field8789 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Lep;")
    public static class440 field8798 = new class440("WIP", 2);

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public int field8818;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "Lbk;")
    public static class393 field8797;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 3)
    public static void method3560(int arg0) {
        field8798 = null;
        field8789 = null;
        field8795 = null;
        if (arg0 != 9912) {
            method3561(0.02955276F, 65, -17, -13, null, 1.4403F, -100, -0.5405248F, 0.23169136F, -29, 0.6576124F, 67, null, -59);
        }
        field8797 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(FIIILbn;FIFFIFI[BI)V", line = 20)
    public static final void method3561(float arg0, int arg1, int arg2, int arg3, class465 arg4, float arg5, int arg6, float arg7, float arg8, int arg9, float arg10, int arg11, byte[] arg12, int arg13) {
        field8810++;
        int var14 = arg2 * arg13;
        float[] var15 = new float[var14];
        int var16 = 0;
        if (arg9 != -18416) {
            method3561(-0.49189374F, 22, 74, -29, null, -1.1903139F, -12, -0.18363696F, 0.5329109F, -32, 0.6430396F, -128, null, -33);
        }
        while (arg11 > var16) {
            arg4.method2753(0, arg10 / (float) arg6, arg3, arg2, arg5 * 127.0F, arg0 / (float) arg2, 255, arg13, arg7 / (float) arg13, var15, arg6);
            int var19 = arg1;
            arg7 *= 2.0F;
            arg10 *= 2.0F;
            arg5 *= arg8;
            for (int var20 = 0; var20 < var14; var20++) {
                arg12[var19] = (byte) ((int) ((float) arg12[var19] + var15[var20]));
                var19++;
            }
            arg0 *= 2.0F;
            var16++;
        }
        int var17 = arg1;
        for (int var18 = 0; var18 < var14; var18++) {
            arg12[var17] = (byte) (arg12[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ)V", line = 74)
    public final void method3562(int arg0, boolean arg1) {
        field8794++;
        class387 var3 = this.field8790;
        synchronized (this.field8790) {
            this.field8790.method2366(arg0, 106);
        }
        class387 var4 = this.field8813;
        synchronized (this.field8813) {
            this.field8813.method2366(arg0, 109);
        }
        class574 var5 = this.field8814;
        synchronized (this.field8814) {
            this.field8814.method3330(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIIII)Z", line = 93)
    public static final boolean method3563(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field8809++;
        if (!class74.field991 || !class790.field10837) {
            return false;
        } else if (class683.field9698 < 100) {
            return false;
        } else if (class136.method966(0, arg4, arg3, arg2)) {
            int var5 = arg2 << class310.field4616;
            int var6 = arg3 << class310.field4616;
            if (class357.method2250(class13.field254, class622.field8777[arg4].method1976(arg2, -1, arg3), var6, arg1, var5, class13.field254, (byte) -56)) {
                class422.field5967++;
                return true;
            } else if (arg0) {
                return false;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(IZ)V", line = 126)
    public final void method3564(int arg0, boolean arg1) {
        field8807++;
        if (arg1 == this.field8796) {
            return;
        }
        this.field8796 = arg1;
        this.method3570(-107);
        if (arg0 != 0) {
            this.method3572(false);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILmw;IZLha;IZLda;Lha;II)Lqda;", line = 143)
    public final class112 method3565(int arg0, int arg1, class515 arg2, int arg3, boolean arg4, class66 arg5, int arg6, boolean arg7, class67 arg8, class66 arg9, int arg10, int arg11) {
        field8804++;
        class112 var13 = this.method3569(arg2, -121, arg11, arg9, arg0, arg1, arg10, arg3);
        if (var13 != null) {
            return var13;
        }
        class501 var14 = this.method3567(arg3, true);
        if (arg1 > 1 && var14.field7112 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field7124[var16] <= arg1 && var14.field7124[var16] != 0) {
                    var15 = var14.field7112[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method3567(var15, true);
            }
        }
        int[] var17 = var14.method2926(arg2, arg11, arg1, arg9, -12157, arg0, arg10, arg5, arg8, arg7);
        if (arg6 < 113) {
            this.method3572(false);
        }
        if (var17 == null) {
            return null;
        }
        class112 var18;
        if (arg4) {
            var18 = arg5.method476(0, 32, 36, true, 36, var17);
        } else {
            var18 = arg9.method476(0, 32, 36, true, 36, var17);
        }
        if (!arg4) {
            class485 var19 = new class485();
            var19.field6876 = arg9.field884;
            var19.field6875 = arg11;
            var19.field6869 = arg1;
            var19.field6877 = arg3;
            var19.field6871 = arg0;
            var19.field6879 = arg2 != null;
            var19.field6870 = arg10;
            this.field8814.method3334(-23819, var18, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)V", line = 207)
    public final void method3566(boolean arg0, int arg1) {
        field8800++;
        this.field8818 = arg1;
        if (arg0) {
            this.method3564(6, false);
        }
        class387 var3 = this.field8813;
        synchronized (this.field8813) {
            this.field8813.method2364(1);
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(IZ)Llia;", line = 222)
    public final class501 method3567(int arg0, boolean arg1) {
        field8811++;
        class387 var3 = this.field8790;
        class501 var4;
        synchronized (this.field8790) {
            var4 = (class501) this.field8790.method2373((long) arg0, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field8808;
        byte[] var6;
        synchronized (this.field8808) {
            var6 = this.field8808.method3150(class137.method969(255, arg0), 41, class584.method3386(arg0, (byte) -101));
        }
        class501 var7 = new class501();
        var7.field7130 = arg0;
        var7.field7134 = this;
        var7.field7172 = new String[] { null, null, class674.field9559.method3825((byte) -10, this.field8802), null, null };
        var7.field7098 = new String[] { null, null, null, null, class674.field9560.method3825((byte) -10, this.field8802) };
        if (var6 != null) {
            var7.method2915(-1, new class120(var6));
        }
        var7.method2922(1);
        if (var7.field7096 != -1) {
            var7.method2917(this.method3567(var7.field7144, true), 9462, this.method3567(var7.field7096, arg1));
        }
        if (var7.field7110 != -1) {
            var7.method2924(-128, this.method3567(var7.field7110, true), this.method3567(var7.field7135, true));
        }
        if (var7.field7125 != -1) {
            var7.method2923(this.method3567(var7.field7131, true), 18551, this.method3567(var7.field7125, true));
        }
        if (!this.field8796 && var7.field7154) {
            var7.field7108 = class674.field9556.method3825((byte) -10, this.field8802);
            var7.field7118 = false;
            var7.field7123 = 0;
            var7.field7175 = null;
            var7.field7098 = this.field8819;
            var7.field7172 = this.field8817;
            if (var7.field7149 != null) {
                boolean var8 = false;
                for (class540 var9 = var7.field7149.method382(0); var9 != null; var9 = var7.field7149.method391(37)) {
                    class330 var10 = this.field8816.method1609((int) var9.field7577, -87);
                    if (var10.field4922) {
                        var9.method3117((byte) -85);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field7149 = null;
                }
            }
        }
        if (!arg1) {
            return null;
        }
        class387 var11 = this.field8790;
        synchronized (this.field8790) {
            this.field8790.method2362(var7, 0, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 307)
    public final void method3568(byte arg0) {
        field8803++;
        if (arg0 < 125) {
            method3561(-1.4395001F, -31, 108, -104, null, -1.0975307F, 69, -1.1476539F, -0.008346648F, 102, 0.37123793F, -53, null, -61);
        }
        class387 var2 = this.field8813;
        synchronized (this.field8813) {
            this.field8813.method2364(1);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lmw;IILha;IIII)Lqda;", line = 325)
    public final class112 method3569(class515 arg0, int arg1, int arg2, class66 arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field8815.field6876 = arg3.field884;
        this.field8815.field6869 = arg5;
        this.field8815.field6879 = arg0 != null;
        field8806++;
        this.field8815.field6871 = arg4;
        if (arg1 > -79) {
            this.method3562(15, false);
        }
        this.field8815.field6877 = arg7;
        this.field8815.field6870 = arg6;
        this.field8815.field6875 = arg2;
        return (class112) this.field8814.method3332(this.field8815, (byte) -93);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 349)
    public final void method3570(int arg0) {
        field8805++;
        if (arg0 >= -59) {
            return;
        }
        class387 var2 = this.field8790;
        synchronized (this.field8790) {
            this.field8790.method2364(1);
        }
        class387 var3 = this.field8813;
        synchronized (this.field8813) {
            this.field8813.method2364(1);
        }
        class574 var4 = this.field8814;
        synchronized (this.field8814) {
            this.field8814.method3333((byte) -67);
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V", line = 371)
    public final void method3571(int arg0) {
        class387 var2 = this.field8790;
        synchronized (this.field8790) {
            this.field8790.method2369(arg0 ^ 0xFFFF9ED1);
        }
        field8793++;
        if (arg0 != 24878) {
            return;
        }
        class387 var3 = this.field8813;
        synchronized (this.field8813) {
            this.field8813.method2369(-1);
        }
        class574 var4 = this.field8814;
        synchronized (this.field8814) {
            this.field8814.method3335(arg0 - 24879);
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Liv;IZLqb;Lcb;Lcb;)V", line = 421)
    public class624(class106 arg0, int arg1, boolean arg2, class233 arg3, class544 arg4, class544 arg5) {
        this.field8799 = arg5;
        this.field8816 = arg3;
        this.field8796 = arg2;
        this.field8802 = arg1;
        this.field8808 = arg4;
        if (this.field8808 == null) {
            this.field8812 = 0;
        } else {
            int var7 = this.field8808.method3136(false) - 1;
            this.field8812 = var7 * 256 + this.field8808.method3147(var7, -57);
        }
        this.field8817 = new String[] { null, null, class674.field9559.method3825((byte) -10, this.field8802), null, null };
        this.field8819 = new String[] { null, null, null, null, class674.field9560.method3825((byte) -10, this.field8802) };
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V", line = 401)
    public final void method3572(boolean arg0) {
        field8791++;
        class574 var2 = this.field8814;
        synchronized (this.field8814) {
            this.field8814.method3333((byte) -67);
            if (!arg0) {
                this.method3569(null, -67, -82, null, 11, -97, 102, -117);
            }
        }
    }
}
