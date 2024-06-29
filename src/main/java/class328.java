import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class328 {

    @OriginalMember(owner = "client!kka", name = "f", descriptor = "Lqj;")
    private class535 field4648 = new class535(64);

    @OriginalMember(owner = "client!kka", name = "x", descriptor = "Lqj;")
    public class535 field4666 = new class535(50);

    @OriginalMember(owner = "client!kka", name = "A", descriptor = "Ljba;")
    public class419 field4669 = new class419(250);

    @OriginalMember(owner = "client!kka", name = "B", descriptor = "Lqaa;")
    private class29 field4670 = new class29();

    @OriginalMember(owner = "client!kka", name = "d", descriptor = "I")
    public int field4646;

    @OriginalMember(owner = "client!kka", name = "h", descriptor = "Luq;")
    public class172 field4650;

    @OriginalMember(owner = "client!kka", name = "u", descriptor = "Luq;")
    private class172 field4663;

    @OriginalMember(owner = "client!kka", name = "r", descriptor = "Z")
    private boolean field4660;

    @OriginalMember(owner = "client!kka", name = "E", descriptor = "Lte;")
    private class639 field4673;

    @OriginalMember(owner = "client!kka", name = "l", descriptor = "I")
    public int field4654;

    @OriginalMember(owner = "client!kka", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field4672;

    @OriginalMember(owner = "client!kka", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field4671;

    @OriginalMember(owner = "client!kka", name = "b", descriptor = "Lfea;")
    public static class152 field4644 = new class152();

    @OriginalMember(owner = "client!kka", name = "k", descriptor = "Lsaa;")
    public static class345 field4653 = new class345();

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!kka", name = "c", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!kka", name = "e", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!kka", name = "g", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!kka", name = "j", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!kka", name = "m", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!kka", name = "n", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!kka", name = "o", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!kka", name = "p", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!kka", name = "q", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!kka", name = "s", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!kka", name = "t", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!kka", name = "v", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!kka", name = "w", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!kka", name = "z", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!kka", name = "F", descriptor = "I")
    public int field4674;

    @OriginalMember(owner = "client!kka", name = "i", descriptor = "[[B")
    public static byte[][] field4651;

    @OriginalMember(owner = "client!kka", name = "y", descriptor = "[[[B")
    public static byte[][][] field4667;

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(III)Z")
    public static final boolean method2119(int arg0, int arg1, int arg2) {
        int var3 = -121 % ((19 - arg2) / 35);
        field4643++;
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Lha;ZIILvp;Lda;IIZLha;II)Lhh;")
    public final class140 method2120(class66 arg0, boolean arg1, int arg2, int arg3, class201 arg4, class67 arg5, int arg6, int arg7, boolean arg8, class66 arg9, int arg10, int arg11) {
        field4655++;
        class140 var13 = this.method2132(arg11, arg10, arg3, (byte) 104, arg9, arg6, arg2, arg4);
        if (var13 != null) {
            return var13;
        }
        class369 var14 = this.method2121(arg6, arg7 ^ 0x656C);
        if (arg10 > 1 && var14.field5351 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field5316[var16] <= arg10 && var14.field5316[var16] != 0) {
                    var15 = var14.field5351[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2121(var15, 25928);
            }
        }
        int[] var17 = var14.method2325(arg2, arg5, arg8, arg10, arg11, -28, arg3, arg4, arg0, arg9);
        if (var17 == null) {
            return null;
        }
        class140 var18;
        if (arg1) {
            var18 = arg0.method446(var17, -124, 36, 32, 36, 0);
        } else {
            var18 = arg9.method446(var17, arg7 + 78, 36, 32, 36, 0);
        }
        if (!arg1) {
            class29 var19 = new class29();
            var19.field290 = arg2;
            var19.field291 = arg9.field906;
            var19.field289 = arg3;
            var19.field287 = arg6;
            var19.field286 = arg11;
            var19.field283 = arg10;
            var19.field285 = arg4 != null;
            this.field4669.method2516(var18, (byte) 51, var19);
        }
        return arg7 == 36 ? var18 : null;
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(II)Lak;")
    public final class369 method2121(int arg0, int arg1) {
        field4658++;
        class535 var3 = this.field4648;
        class369 var4;
        synchronized (this.field4648) {
            if (arg1 != 25928) {
                field4653 = null;
            }
            var4 = (class369) this.field4648.method3109((byte) 107, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field4663;
        byte[] var6;
        synchronized (this.field4663) {
            var6 = this.field4663.method1188(class87.method700(arg1 ^ 0x4B3, arg0), -18047, class377.method2362((byte) -54, arg0));
        }
        class369 var7 = new class369();
        var7.field5379 = arg0;
        var7.field5397 = this;
        var7.field5369 = new String[] { null, null, class58.field705.method365(this.field4646, (byte) 81), null, null };
        var7.field5363 = new String[] { null, null, null, null, class58.field706.method365(this.field4646, (byte) 51) };
        if (var6 != null) {
            var7.method2311(new class254(var6), -1);
        }
        var7.method2326(46);
        if (var7.field5339 != -1) {
            var7.method2320((byte) 127, this.method2121(var7.field5339, 25928), this.method2121(var7.field5392, 25928));
        }
        if (var7.field5354 != -1) {
            var7.method2313(-116, this.method2121(var7.field5354, 25928), this.method2121(var7.field5398, 25928));
        }
        if (var7.field5345 != -1) {
            var7.method2318(36, this.method2121(var7.field5345, 25928), this.method2121(var7.field5344, arg1));
        }
        if (!this.field4660 && var7.field5364) {
            var7.field5349 = class58.field702.method365(this.field4646, (byte) 62);
            var7.field5366 = null;
            var7.field5363 = this.field4671;
            var7.field5343 = false;
            var7.field5328 = 0;
            var7.field5369 = this.field4672;
            if (var7.field5335 != null) {
                boolean var8 = false;
                for (class159 var9 = var7.field5335.method1249((byte) -125); var9 != null; var9 = var7.field5335.method1246(true)) {
                    class560 var10 = this.field4673.method3515((int) var9.field2146, 0);
                    if (var10.field7672) {
                        var9.method1102((byte) 106);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field5335 = null;
                }
            }
        }
        class535 var11 = this.field4648;
        synchronized (this.field4648) {
            this.field4648.method3108((long) arg0, arg1 ^ 0x5A99, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(ZZ)V")
    public final void method2122(boolean arg0, boolean arg1) {
        field4656++;
        if (arg0 && this.field4660 != arg1) {
            this.field4660 = arg1;
            this.method2127((byte) 79);
        }
    }

    @OriginalMember(owner = "client!kka", name = "b", descriptor = "(II)V")
    public final void method2123(int arg0, int arg1) {
        class535 var3 = this.field4648;
        synchronized (this.field4648) {
            int var4 = 65 / ((arg0 + 23) / 36);
            this.field4648.method3101(false, arg1);
        }
        field4649++;
        class535 var5 = this.field4666;
        synchronized (this.field4666) {
            this.field4666.method3101(false, arg1);
        }
        class419 var6 = this.field4669;
        synchronized (this.field4669) {
            this.field4669.method2514(arg1, 914);
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(I)V")
    public static void method2124(int arg0) {
        field4644 = null;
        field4651 = null;
        field4653 = null;
        field4667 = null;
        if (arg0 != 0) {
            field4644 = null;
        }
    }

    @OriginalMember(owner = "client!kka", name = "c", descriptor = "(II)V")
    public final void method2125(int arg0, int arg1) {
        field4659++;
        if (arg1 != 4) {
            return;
        }
        this.field4674 = arg0;
        class535 var3 = this.field4666;
        synchronized (this.field4666) {
            this.field4666.method3103(arg1 ^ 0xFFFFD3E6);
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method2126(String arg0, boolean arg1) {
        field4647++;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (arg1) {
            field4668 = -123;
        }
        if (var3 >= 0) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        return var2 == null ? arg0 : var2 + arg0;
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(B)V")
    public final void method2127(byte arg0) {
        class535 var2 = this.field4648;
        synchronized (this.field4648) {
            if (arg0 != 79) {
                return;
            }
            this.field4648.method3103(-11294);
        }
        field4657++;
        class535 var3 = this.field4666;
        synchronized (this.field4666) {
            this.field4666.method3103(arg0 - 11373);
        }
        class419 var4 = this.field4669;
        synchronized (this.field4669) {
            this.field4669.method2518(false);
        }
    }

    @OriginalMember(owner = "client!kka", name = "b", descriptor = "(I)V")
    public final void method2128(int arg0) {
        class535 var2 = this.field4648;
        synchronized (this.field4648) {
            this.field4648.method3113(-128);
        }
        field4652++;
        class535 var3 = this.field4666;
        synchronized (this.field4666) {
            this.field4666.method3113(-128);
            if (arg0 != -22837) {
                this.field4669 = null;
            }
        }
        class419 var4 = this.field4669;
        synchronized (this.field4669) {
            this.field4669.method2512(28157);
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Z)V")
    public final void method2129(boolean arg0) {
        field4662++;
        class535 var2 = this.field4666;
        synchronized (this.field4666) {
            this.field4666.method3103(-11294);
        }
        if (arg0) {
            field4651 = null;
        }
    }

    @OriginalMember(owner = "client!kka", name = "b", descriptor = "(III)Z")
    public static final boolean method2130(int arg0, int arg1, int arg2) {
        field4664++;
        if (arg2 < 29) {
            field4653 = null;
        }
        return class598.method3350(arg1, -84, arg0) | (arg0 & 0x800) != 0 || class84.method680(arg1, arg0, (byte) -62);
    }

    @OriginalMember(owner = "client!kka", name = "c", descriptor = "(I)V")
    public final void method2131(int arg0) {
        field4645++;
        class419 var2 = this.field4669;
        synchronized (this.field4669) {
            if (arg0 == 21503) {
                this.field4669.method2518(false);
            }
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(IIIBLha;IILvp;)Lhh;")
    public final class140 method2132(int arg0, int arg1, int arg2, byte arg3, class66 arg4, int arg5, int arg6, class201 arg7) {
        this.field4670.field291 = arg4.field906;
        field4665++;
        this.field4670.field287 = arg5;
        this.field4670.field285 = arg7 != null;
        this.field4670.field289 = arg2;
        if (arg3 != 104) {
            this.field4674 = -70;
        }
        this.field4670.field290 = arg6;
        this.field4670.field286 = arg0;
        this.field4670.field283 = arg1;
        return (class140) this.field4669.method2520(0, this.field4670);
    }

    @OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(Lkw;IZLte;Luq;Luq;)V")
    public class328(class263 arg0, int arg1, boolean arg2, class639 arg3, class172 arg4, class172 arg5) {
        this.field4646 = arg1;
        this.field4650 = arg5;
        this.field4663 = arg4;
        this.field4660 = arg2;
        this.field4673 = arg3;
        if (this.field4663 == null) {
            this.field4654 = 0;
        } else {
            int var7 = this.field4663.method1193(true) - 1;
            this.field4654 = var7 * 256 + this.field4663.method1175(var7, (byte) 126);
        }
        this.field4672 = new String[] { null, null, class58.field705.method365(this.field4646, (byte) 117), null, null };
        this.field4671 = new String[] { null, null, null, null, class58.field706.method365(this.field4646, (byte) 96) };
    }
}
