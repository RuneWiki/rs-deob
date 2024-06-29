import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class11 {

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "Lbt;")
    private class363 field151 = new class363(64);

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "Lbt;")
    public class363 field156 = new class363(50);

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "Lp;")
    public class458 field157 = new class458(250);

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "Lpq;")
    private class353 field158 = new class353();

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "Z")
    private boolean field147;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "Lct;")
    private class104 field148;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "Lct;")
    public class104 field144;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field160;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field159;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "Ljn;")
    public static class409 field149 = new class409("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "[Lnp;")
    public static class213[] field155 = new class213[14];

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "S")
    public static short field153 = 256;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "[I")
    public static int[] field143;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lfp;IIZLdf;Ltq;ILfp;ZIIZ)Lae;")
    public final class285 method175(class9 arg0, int arg1, int arg2, boolean arg3, class85 arg4, class259 arg5, int arg6, class9 arg7, boolean arg8, int arg9, int arg10, boolean arg11) {
        field138++;
        class285 var13 = this.method182(-127, arg6, arg0, arg10, arg5, arg9, arg2, arg1);
        if (var13 != null) {
            return var13;
        }
        class427 var14 = this.method176((byte) -89, arg9);
        if (arg6 > 1 && var14.field6154 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field6169[var16] <= arg6 && var14.field6169[var16] != 0) {
                    var15 = var14.field6154[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method176((byte) -118, var15);
            }
        }
        int[] var17 = var14.method2623(arg6, arg1, arg7, arg5, arg10, arg4, arg11, arg2, arg3, arg0);
        if (var17 == null) {
            return null;
        }
        class285 var18;
        if (arg8) {
            var18 = arg7.method98(var17, 0, 36, 36, 32);
        } else {
            var18 = arg0.method98(var17, 0, 36, 36, 32);
        }
        if (!arg8) {
            class353 var19 = new class353();
            var19.field5150 = arg0.field120;
            var19.field5147 = arg5 != null;
            var19.field5154 = arg9;
            var19.field5148 = arg6;
            var19.field5144 = arg1;
            var19.field5140 = arg2;
            var19.field5151 = arg10;
            this.field157.method2829(var18, var19, -3284);
        }
        return var18;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)Lca;")
    public final class427 method176(byte arg0, int arg1) {
        field145++;
        class363 var3 = this.field151;
        class427 var4;
        synchronized (this.field151) {
            var4 = (class427) this.field151.method2310((byte) -125, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field148.method715(class24.method250(false, arg1), (byte) 108, class318.method2096((byte) -66, arg1));
        class427 var6 = new class427();
        var6.field6201 = this;
        var6.field6192 = arg1;
        if (arg0 > -22) {
            return null;
        }
        var6.field6158 = new String[] { null, null, class72.field939.method2543(false, this.field146), null, null };
        var6.field6213 = new String[] { null, null, null, null, class307.field4532.method2543(false, this.field146) };
        if (var5 != null) {
            var6.method2620(5, new class256(var5));
        }
        var6.method2628(-37);
        if (var6.field6178 != -1) {
            var6.method2630(1, this.method176((byte) -65, var6.field6178), this.method176((byte) -119, var6.field6190));
        }
        if (var6.field6143 != -1) {
            var6.method2618(this.method176((byte) -88, var6.field6143), this.method176((byte) -121, var6.field6172), 0);
        }
        if (!this.field147 && var6.field6197) {
            var6.field6145 = class409.field5884.method2543(false, this.field146);
            var6.field6177 = 0;
            var6.field6147 = false;
            var6.field6158 = this.field160;
            var6.field6203 = null;
            var6.field6213 = this.field159;
            if (var6.field6186 != null) {
                boolean var7 = false;
                for (class264 var8 = var6.field6186.method608((byte) 122); var8 != null; var8 = var6.field6186.method604(-91)) {
                    class294 var9 = class320.method2109((int) var8.field3907, (byte) -102);
                    if (var9.field4281) {
                        var8.method1820(-25246);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field6186 = null;
                }
            }
        }
        class363 var10 = this.field151;
        synchronized (this.field151) {
            this.field151.method2299(true, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)V")
    public final void method177(int arg0, int arg1) {
        class363 var3 = this.field151;
        synchronized (this.field151) {
            this.field151.method2300(arg0, true);
        }
        field135++;
        class363 var4 = this.field156;
        synchronized (this.field156) {
            if (arg1 != -10920) {
                field153 = 84;
            }
            this.field156.method2300(arg0, true);
        }
        class458 var5 = this.field157;
        synchronized (this.field157) {
            this.field157.method2832(arg1 ^ 0xFFFFC37A, arg0);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method178(byte arg0) {
        field149 = null;
        field155 = null;
        field143 = null;
        int var1 = 7 / ((40 - arg0) / 59);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZB)V")
    public final void method179(boolean arg0, byte arg1) {
        field150++;
        if (arg0 == this.field147) {
            return;
        }
        this.field147 = arg0;
        this.method181(0);
        if (arg1 != -44) {
            field155 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public final void method180(int arg0) {
        if (arg0 >= -70) {
            field153 = 96;
        }
        field139++;
        class458 var2 = this.field157;
        synchronized (this.field157) {
            this.field157.method2830((byte) 110);
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public final void method181(int arg0) {
        if (arg0 != 0) {
            this.method184((byte) 118, 107);
        }
        class363 var2 = this.field151;
        synchronized (this.field151) {
            this.field151.method2313(115);
        }
        field136++;
        class363 var3 = this.field156;
        synchronized (this.field156) {
            this.field156.method2313(arg0 + 116);
        }
        class458 var4 = this.field157;
        synchronized (this.field157) {
            this.field157.method2830((byte) -93);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILfp;ILtq;III)Lae;")
    public final class285 method182(int arg0, int arg1, class9 arg2, int arg3, class259 arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= -116) {
            return null;
        }
        this.field158.field5148 = arg1;
        this.field158.field5144 = arg7;
        this.field158.field5140 = arg6;
        this.field158.field5154 = arg5;
        this.field158.field5151 = arg3;
        this.field158.field5147 = arg4 != null;
        this.field158.field5150 = arg2.field120;
        field142++;
        return (class285) this.field157.method2842((byte) 76, this.field158);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
    public final void method183(byte arg0) {
        class363 var2 = this.field156;
        synchronized (this.field156) {
            this.field156.method2313(103);
        }
        field141++;
        int var3 = -7 / ((arg0 - 54) / 43);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(BI)V")
    public final void method184(byte arg0, int arg1) {
        this.field161 = arg1;
        field140++;
        class363 var3 = this.field156;
        synchronized (this.field156) {
            if (arg0 != 41) {
                this.field160 = null;
            }
            this.field156.method2313(110);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([SB)[S")
    public static final short[] method185(short[] arg0, byte arg1) {
        field152++;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 121 / ((arg1 + 39) / 35);
            short[] var3 = new short[arg0.length];
            class224.method1540(arg0, 0, var3, 0, arg0.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
    public final void method186(byte arg0) {
        class363 var2 = this.field151;
        synchronized (this.field151) {
            int var3 = -107 % ((71 - arg0) / 34);
            this.field151.method2307(69);
        }
        field137++;
        class363 var4 = this.field156;
        synchronized (this.field156) {
            this.field156.method2307(-83);
        }
        class458 var5 = this.field157;
        synchronized (this.field157) {
            this.field157.method2834(-103);
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lhj;IZLct;Lct;)V")
    public class11(class109 arg0, int arg1, boolean arg2, class104 arg3, class104 arg4) {
        this.field146 = arg1;
        this.field147 = arg2;
        this.field148 = arg3;
        this.field144 = arg4;
        if (this.field148 != null) {
            int var6 = this.field148.method712(false) - 1;
            this.field154 = this.field148.method734(115, var6) + var6 * 256;
        }
        this.field160 = new String[] { null, null, class72.field939.method2543(false, this.field146), null, null };
        this.field159 = new String[] { null, null, null, null, class307.field4532.method2543(false, this.field146) };
    }
}
