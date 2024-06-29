import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class314 {

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "Ld;")
    private class242 field4770 = new class242(64);

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "Ld;")
    public class242 field4790 = new class242(50);

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "Lco;")
    public class216 field4792 = new class216(250);

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "Luk;")
    private class359 field4793 = new class359();

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "Lum;")
    private class83 field4775;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "Lcg;")
    private class456 field4797;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Lum;")
    public class83 field4771;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "Z")
    private boolean field4784;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public int field4780;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
    public int field4787;

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field4796;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field4795;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
    public static int field4788 = 0;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
    public int field4794;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "Lip;")
    public static class326 field4777;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "Lmu;")
    public static class346 field4781;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 4)
    public static void method2079(int arg0) {
        field4777 = null;
        field4781 = null;
        if (arg0 != 252645135) {
            method2079(-12);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIII)V", line = 15)
    public static final void method2080(int arg0, int arg1, int arg2, int arg3) {
        field4786++;
        int var4 = class40.field667.field4192 * arg2 >> 8;
        if (var4 != 0 && arg0 != -1) {
            class15.method87(arg0, var4, 0, class1.field8, false, 19900);
            class326.field4938 = true;
        }
        if (arg1 != -28619) {
            method2086(113, -99);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZI)V", line = 36)
    public final void method2081(boolean arg0, int arg1) {
        if (arg1 != 32) {
            this.field4770 = null;
        }
        field4769++;
        if (this.field4784 != arg0) {
            this.field4784 = arg0;
            this.method2083((byte) 89);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIILwq;BLza;II)Lo;", line = 53)
    public final class363 method2082(int arg0, int arg1, int arg2, class286 arg3, byte arg4, class299 arg5, int arg6, int arg7) {
        this.field4793.field5303 = arg3 != null;
        this.field4793.field5306 = arg2;
        this.field4793.field5310 = arg5.field4590;
        this.field4793.field5307 = arg0;
        this.field4793.field5311 = arg7;
        this.field4793.field5305 = arg1;
        field4779++;
        if (arg4 != -10) {
            this.method2081(false, -74);
        }
        this.field4793.field5299 = arg6;
        return (class363) this.field4792.method1495(this.field4793, (byte) 96);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V", line = 71)
    public final void method2083(byte arg0) {
        if (arg0 <= 55) {
            this.field4795 = null;
        }
        class242 var2 = this.field4770;
        synchronized (this.field4770) {
            this.field4770.method1637((byte) 13);
        }
        field4782++;
        class242 var3 = this.field4790;
        synchronized (this.field4790) {
            this.field4790.method1637((byte) 13);
        }
        class216 var4 = this.field4792;
        synchronized (this.field4792) {
            this.field4792.method1493((byte) 114);
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V", line = 90)
    public final void method2084(byte arg0) {
        field4773++;
        if (arg0 >= -32) {
            this.field4797 = null;
        }
        class216 var2 = this.field4792;
        synchronized (this.field4792) {
            this.field4792.method1493((byte) 120);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)V", line = 104)
    public final void method2085(int arg0, int arg1) {
        field4778++;
        class242 var3 = this.field4770;
        synchronized (this.field4770) {
            this.field4770.method1631(arg0, (byte) -19);
        }
        class242 var4 = this.field4790;
        synchronized (this.field4790) {
            this.field4790.method1631(arg0, (byte) -19);
        }
        if (arg1 < 3) {
            this.method2089(-55);
        }
        class216 var5 = this.field4792;
        synchronized (this.field4792) {
            this.field4792.method1490(0, arg0);
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)I", line = 126)
    public static final int method2086(int arg0, int arg1) {
        field4791++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = -80 / ((33 - arg0) / 51);
        int var4 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        int var5 = (var4 >>> 4) + var4 & 0xF0F0F0F;
        int var6 = (var5 >>> 8) + var5;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 0xFF;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILza;ILza;ZIZILwq;ILla;I)Lo;", line = 142)
    public final class363 method2087(int arg0, class299 arg1, int arg2, class299 arg3, boolean arg4, int arg5, boolean arg6, int arg7, class286 arg8, int arg9, class310 arg10, int arg11) {
        field4774++;
        class363 var13 = this.method2082(arg5, arg0, arg9, arg8, (byte) -10, arg3, arg11, arg2);
        if (var13 != null) {
            return var13;
        }
        class221 var14 = this.method2088(arg5, 114);
        if (arg9 > 1 && var14.field3376 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg9 >= var14.field3366[var16] && var14.field3366[var16] != 0) {
                    var15 = var14.field3376[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2088(var15, 117);
            }
        }
        int[] var17 = var14.method1530(arg10, arg2, arg1, arg0, arg4, arg9, true, arg8, arg11, arg3);
        int var18 = 123 / ((59 - arg7) / 47);
        if (var17 == null) {
            return null;
        }
        class363 var19;
        if (arg6) {
            var19 = arg1.method520(var17, 0, 36, 36, 32);
        } else {
            var19 = arg3.method520(var17, 0, 36, 36, 32);
        }
        if (!arg6) {
            class359 var20 = new class359();
            var20.field5305 = arg0;
            var20.field5310 = arg3.field4590;
            var20.field5311 = arg2;
            var20.field5303 = arg8 != null;
            var20.field5299 = arg11;
            var20.field5306 = arg9;
            var20.field5307 = arg5;
            this.field4792.method1496(-26500, var19, var20);
        }
        return var19;
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(II)Lcs;", line = 206)
    public final class221 method2088(int arg0, int arg1) {
        if (arg1 <= 103) {
            this.field4795 = null;
        }
        field4783++;
        class242 var3 = this.field4770;
        class221 var4;
        synchronized (this.field4770) {
            var4 = (class221) this.field4770.method1634((long) arg0, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field4775;
        byte[] var6;
        synchronized (this.field4775) {
            var6 = this.field4775.method731(0, class352.method2254(arg0, (byte) 15), class268.method1858(arg0, (byte) -128));
        }
        class221 var7 = new class221();
        var7.field3339 = arg0;
        var7.field3320 = this;
        var7.field3307 = new String[] { null, null, class297.field4570.method1265(this.field4780, -69), null, null };
        var7.field3383 = new String[] { null, null, null, null, class76.field1280.method1265(this.field4780, -57) };
        if (var6 != null) {
            var7.method1522((byte) -29, new class194(var6));
        }
        var7.method1525(85);
        if (var7.field3386 != -1) {
            var7.method1520(59, this.method2088(var7.field3322, 112), this.method2088(var7.field3386, 111));
        }
        if (var7.field3364 != -1) {
            var7.method1523(this.method2088(var7.field3364, 109), this.method2088(var7.field3345, 121), 23152);
        }
        if (!this.field4784 && var7.field3335) {
            var7.field3377 = class294.field4536.method1265(this.field4780, -71);
            var7.field3307 = this.field4796;
            var7.field3331 = null;
            var7.field3308 = false;
            var7.field3325 = 0;
            var7.field3383 = this.field4795;
            if (var7.field3332 != null) {
                boolean var8 = false;
                for (class130 var9 = var7.field3332.method359(true); var9 != null; var9 = var7.field3332.method365(-61)) {
                    class450 var10 = this.field4797.method2789((byte) 36, (int) var9.field1932);
                    if (var10.field6690) {
                        var9.method947((byte) 113);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field3332 = null;
                }
            }
        }
        class242 var11 = this.field4770;
        synchronized (this.field4770) {
            this.field4770.method1623((long) arg0, 17621, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V", line = 284)
    public final void method2089(int arg0) {
        field4785++;
        class242 var2 = this.field4770;
        synchronized (this.field4770) {
            this.field4770.method1630(-87);
        }
        class242 var3 = this.field4790;
        synchronized (this.field4790) {
            this.field4790.method1630(-99);
        }
        class216 var4 = this.field4792;
        synchronized (this.field4792) {
            this.field4792.method1488((byte) 93);
        }
        if (arg0 != 6567) {
            this.method2092(88);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)V", line = 304)
    public final void method2090(int arg0, byte arg1) {
        this.field4794 = arg0;
        field4772++;
        class242 var3 = this.field4790;
        synchronized (this.field4790) {
            this.field4790.method1637((byte) 13);
        }
        if (arg1 != 44) {
            this.method2084((byte) 83);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIBII)V", line = 329)
    public static final void method2091(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field4776++;
        int var8 = arg1 + arg7;
        if (arg5 != -37) {
            return;
        }
        int var9 = arg6 - arg7;
        for (int var10 = arg1; var10 < var8; var10++) {
            class262.method1831(arg3, class402.field5946[var10], (byte) 43, arg0, arg4);
        }
        int var11 = arg4 + arg7;
        for (int var12 = arg6; var12 > var9; var12--) {
            class262.method1831(arg3, class402.field5946[var12], (byte) 43, arg0, arg4);
        }
        int var13 = arg3 - arg7;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class402.field5946[var14];
            class262.method1831(var11, var15, (byte) 43, arg0, arg4);
            class262.method1831(var13, var15, (byte) 43, arg2, var11);
            class262.method1831(arg3, var15, (byte) 43, arg0, var13);
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lpt;IZLcg;Lum;Lum;)V", line = 411)
    public class314(class308 arg0, int arg1, boolean arg2, class456 arg3, class83 arg4, class83 arg5) {
        this.field4775 = arg4;
        this.field4797 = arg3;
        this.field4771 = arg5;
        this.field4784 = arg2;
        this.field4780 = arg1;
        if (this.field4775 == null) {
            this.field4787 = 0;
        } else {
            int var7 = this.field4775.method754(false) - 1;
            this.field4787 = var7 * 256 + this.field4775.method748(var7, 12408);
        }
        this.field4796 = new String[] { null, null, class297.field4570.method1265(this.field4780, -62), null, null };
        this.field4795 = new String[] { null, null, null, null, class76.field1280.method1265(this.field4780, -127) };
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V", line = 380)
    public final void method2092(int arg0) {
        class242 var2 = this.field4790;
        synchronized (this.field4790) {
            this.field4790.method1637((byte) 13);
        }
        if (arg0 != 1431655765) {
            method2086(-118, 43);
        }
        field4789++;
    }
}
