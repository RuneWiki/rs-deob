import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class164 extends class38 implements class103 {

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "Lub;")
    private class18 field2078 = new class18();

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    private int field2081 = 4096;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    private int field2082 = 4096;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "Lek;")
    private class352 field2088 = new class352(4);

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "Z")
    private boolean field2099 = false;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "Lc;")
    private class123 field2086;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "[I")
    private static int[] field2077 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "[B")
    private static byte[] field2084 = new byte[8191];

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "[I")
    public static int[] field2083 = field2077;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "[F")
    private static float[] field2090 = new float[20];

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "[F")
    private static float[] field2085 = field2090;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "[S")
    private static short[] field2092 = new short[8191];

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "[I")
    private static int[] field2089 = new int[8191];

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "[I")
    public static int[] field2087 = new int[6];

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "[I")
    private static int[] field2091 = field2077;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "[I")
    private static int[] field2095 = field2077;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "[I")
    private static int[] field2096 = new int[8191];

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field2094 = Boolean.FALSE;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
    private int field2097;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "Lza;")
    private class287 field2080;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "Lna;")
    private class35 field2079;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2093;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "[Ln;")
    private class15[] field2098;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()V")
    public final void method352() {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public final void method279(int arg0) {
        this.field2098[arg0].method114();
    }

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()V")
    public final void method313() {
    }

    @OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIII)V")
    public final native void method331(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method277(Canvas arg0) {
        if (this.field2093 == arg0) {
            this.method342((Canvas) null);
        }
        class287 var2 = (class287) this.field2088.method2022(-1, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2165(16225);
            var2.method1695();
        }
    }

    @OriginalMember(owner = "client!qa", name = "sa", descriptor = "(S)Z")
    private final boolean method1053(short arg0) {
        class278 var2 = super.field502;
        synchronized (super.field502) {
            if (!super.field502.method1638(113, arg0)) {
                return false;
            } else {
                class139 var4 = super.field502.method1642(arg0, -52);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field1775 && var4.field1783) {
                        var6 = super.field502.method1641(true, 13724, 128, 0.7F, 128, arg0);
                    } else {
                        var6 = super.field502.method1640(128, 0.7F, 128, (byte) -24, true, arg0);
                    }
                    this.method1065(arg0, var4.field1785, var4.field1788, var4.field1783, var4.field1775, var4.field1779, var4.field1791, var4.field1789, var4.field1794, var4.field1795, var4.field1786, var4.field1784, var4.field1778, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;Lpc;)V")
    public class164(int arg0, Canvas arg1, class278 arg2, class476 arg3) {
        super(arg0, arg2);
        try {
            if (!field2094) {
                if (arg3 != null) {
                    arg3.method2896(2, this.getClass());
                    field2094 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field2094 = Boolean.TRUE;
                }
            }
            if (!field2094) {
                throw new RuntimeException("");
            } else {
                this.method1060(super.field502, 0, 0);
                class102.method773(false, true, 31207);
                this.field2099 = true;
                this.field2086 = new class31();
                this.method287(new class31());
                this.method336(1);
                this.method279(0);
                if (arg1 != null) {
                    this.method271(arg1);
                    this.method342(arg1);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qa", name = "za", descriptor = "(I[I[F)V")
    private final native void method1054(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILma;II)V")
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        this.method1061(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!qa", name = "SA", descriptor = "()Ljava/lang/Object;")
    private final Object method1055() {
        return new class146();
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()V")
    public final void method288() {
        int var1 = 0;
        while (var1 < 9) {
            try {
                synchronized (this.field2093.getTreeLock()) {
                    this.field2080.method1698();
                    return;
                }
            } catch (Exception var6) {
                class199.method1251(200L, (byte) 113);
                ++var1;
            }
        }
        synchronized (this.field2093.getTreeLock()) {
            this.field2080.method1698();
        }
    }

    @OriginalMember(owner = "client!qa", name = "PA", descriptor = "(Lza;)V")
    private final native void method1056(class287 arg0);

    @OriginalMember(owner = "client!qa", name = "ha", descriptor = "()V")
    private final void method1057() {
        System.gc();
        System.runFinalization();
        class132.method920(-12966);
    }

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
    public final boolean method362() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lt;Lfm;Lc;[Lvs;I)V")
    public final void method310(class474[] arg0, class517 arg1, class123 arg2, class419[] arg3, int arg4) {
        this.method1064(arg1, true);
        if (arg3 == null) {
            this.method1068().method111(this, arg0, arg2, (int[]) null, arg4, field2095, field2096, field2089, field2092, field2084, arg1.field7487.method1828((byte) 119), field2083);
        } else {
            class419 var6 = arg3[0];
            field2087[5] = 0;
            this.method1068().method111(this, arg0, arg2, field2087, arg4, field2095, field2096, field2089, field2092, field2084, arg1.field7487.method1828((byte) 90), field2083);
            var6.field5947 = field2087[0];
            var6.field5943 = field2087[1];
            var6.field5946 = field2087[2];
            var6.field5944 = field2087[3];
            var6.field5945 = field2087[4];
            var6.field5942 = field2087[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class44 var9 = (class44) arg0[var8];
                var9.method406(var7, arg2);
                if (var9.field525 != null) {
                    var7 += var9.field525.length * 9;
                }
                if (var9.field526 != null) {
                    var7 += var9.field526.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
    public final boolean method368() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Ll;")
    public final class16 method299(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class71(this, this.field2079, arg0, arg1, arg2, arg3, arg4) : new class417(this, this.field2079, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class71(this, this.field2079, arg0, arg1, arg2, arg3, arg4) : new class417(this, this.field2079, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "MA", descriptor = "(I)V")
    public final native void method305(int arg0);

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "()I")
    public final native int method286();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkc;Lkc;FLkc;)Lkc;")
    public final class87 method273(class87 arg0, class87 arg1, float arg2, class87 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)[I")
    public final native int[] method341(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
    public final boolean method304() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()F")
    public final native float method333();

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z")
    public final boolean method374() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lu;)V")
    public final void method276(class53 arg0) {
        this.field2079 = (class35) arg0;
        this.method1058(arg0);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
    public final int method370(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public final int method307(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "(IFFFFF)V")
    public final native void method328(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "(Lu;)V")
    private final native void method1058(class53 arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
    public final void method272() {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
    public final native int method268();

    @OriginalMember(owner = "client!qa", name = "RA", descriptor = "(IIIIII)V")
    private final native void method1059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()Z")
    public final boolean method281() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "OA", descriptor = "(IIII)V")
    public final native void method330(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lqv;Z)Ll;")
    public final class16 method345(class311 arg0, boolean arg1) {
        int[] var3 = arg0.field3981;
        byte[] var4 = arg0.field3979;
        int var5 = arg0.field3974;
        int var6 = arg0.field3980;
        class16 var7;
        if (arg1 && arg0.field3977 == null) {
            var7 = new class398(this, this.field2079, var3, var4, 0, arg0.field3974, arg0.field3974, arg0.field3980);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field3977;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class71(this, this.field2079, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field3981[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class71(this, this.field2079, var9, 0, arg0.field3974, arg0.field3974, arg0.field3980);
                } else {
                    var7 = new class417(this, this.field2079, var9, 0, arg0.field3974, arg0.field3974, arg0.field3980);
                }
            }
        }
        var7.method133(arg0.field3976, arg0.field3978, arg0.field3973, arg0.field3975);
        return var7;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public final void method346(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "ca", descriptor = "(ILma;II)V")
    public final native void method324(int arg0, class10 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()V")
    public final void method309() {
        this.field2098 = null;
        this.field2080 = null;
        this.field2093 = null;
        this.field2079 = null;
        this.field2086 = null;
        this.field2088.method2024(false);
        for (class35 var1 = (class35) this.field2078.method153(0); var1 != null; var1 = (class35) this.field2078.method161(-85)) {
            var1.method254();
        }
        this.field2078.method154(7491);
        this.method1057();
        this.method1062();
        if (this.field2099) {
            class466.method2811(false, true, (byte) -49);
            this.field2099 = false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public final void method375(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Ll;")
    public final class16 method296(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class71(this, this.field2079, arg0, arg1, arg2, arg3) : new class417(this, this.field2079, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
    public final boolean method356() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "(Lga;II)V")
    private final native void method1060(class278 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
    public final native int method306();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public final void method285(int arg0) {
        this.field2098[arg0].method113();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lli;[Lqv;Z)Lla;")
    public final class316 method300(class297 arg0, class311[] arg1, boolean arg2) {
        return arg2 ? new class185(this, this.field2079, arg0, arg1, (class16[]) null) : new class331(this, this.field2079, arg0, arg1, (class16[]) null);
    }

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "()I")
    public final native int method298();

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
    public final boolean method322() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)Lu;")
    public final class53 method347(int arg0) {
        class35 var2 = new class35(this, arg0);
        this.field2078.method163(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()I")
    public final int method314() {
        return 4;
    }

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIIIILma;II)V")
    private final native void method1061(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
    public final boolean method354() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIIII)V")
    public final native void method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method319(Rectangle[] arg0, int arg1) {
        int var3 = 0;
        while (var3 < 9) {
            try {
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        synchronized (this.field2093.getTreeLock()) {
                            this.field2080.method1697(var5.x, var5.y, var5.width, var5.height);
                        }
                    }
                }
                return;
            } catch (Exception var12) {
                class199.method1251(200L, (byte) 125);
                ++var3;
            }
        }
        for (int var7 = 0; var7 < arg1; ++var7) {
            Rectangle var8 = arg0[var7];
            if (var8.width > 0 && var8.height > 0) {
                synchronized (this.field2093.getTreeLock()) {
                    this.field2080.method1697(var8.x, var8.y, var8.width, var8.height);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
    public final native void method329();

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()V")
    public final void method302() {
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method342(Canvas arg0) {
        if (arg0 != null) {
            class287 var2 = (class287) this.field2088.method2022(-1, (long) arg0.hashCode());
            this.field2093 = arg0;
            this.field2080 = var2;
            this.method1056(var2);
        } else {
            this.field2093 = null;
            this.field2080 = null;
            this.method1056((class287) null);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public final void method280(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkc;)V")
    public final void method294(class87 arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "ia", descriptor = "(II)V")
    public final native void method274(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
    public final native void method357(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
    public final void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1059(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "FA", descriptor = "()V")
    private final native void method1062();

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
    public final boolean method360() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
    public final boolean method293() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public final void method332(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qa", name = "aa", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method1063(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!qa", name = "da", descriptor = "([I)V")
    public final native void method267(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
    public final boolean method289() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIIIII)Z")
    public final native boolean method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "TA", descriptor = "(IIIII)V")
    public final native void method321(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmb;IIII)Lt;")
    public final class474 method361(class173 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class44(this, this.field2079, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
    public final boolean method339() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lfm;Z)V")
    private final void method1064(class517 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class45 var8 = (class45) arg0.field7487.method1832(-2); var8 != null; var8 = (class45) arg0.field7487.method1830(-79)) {
            field2095[var3++] = var8.field536;
            field2095[var3++] = var8.field535;
            field2095[var3++] = var8.field530;
            field2096[var4++] = var8.field529;
            field2092[var6++] = (short) var8.field532;
            field2089[var5++] = var8.field534;
            if (arg1) {
                field2084[var7++] = var8.field531;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public final void method284(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lta;")
    public final class143 method344(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class43(this, this.field2079, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qa", name = "ea", descriptor = "(Lc;)V")
    public final native void method287(class123 arg0);

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "(III[I)V")
    public final native void method270(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lt;Lc;[Lvs;I)V")
    public final void method335(class474[] arg0, class123 arg1, class419[] arg2, int arg3) {
        if (arg2 == null) {
            this.method1068().method122(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class419 var5 = arg2[0];
            field2087[5] = 0;
            this.method1068().method122(this, arg0, arg1, field2087, -1, arg3);
            var5.field5947 = field2087[0];
            var5.field5943 = field2087[1];
            var5.field5946 = field2087[2];
            var5.field5944 = field2087[3];
            var5.field5945 = field2087[4];
            var5.field5942 = field2087[5] != 0;
        }
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
    public final boolean method297() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lku;)V")
    public final void method311(int arg0, class256[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field2091[var3++] = arg1[var4].method1539((byte) 116);
            field2091[var3++] = arg1[var4].method1536((byte) 117);
            field2091[var3++] = arg1[var4].method1537(-409134460);
            field2091[var3++] = arg1[var4].method1534((byte) -108);
            field2085[var4] = arg1[var4].method1542(99);
            field2091[var3++] = arg1[var4].method1533(-409134460);
        }
        this.method1054(arg0, field2091, field2085);
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
    public final native void method318();

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(III)V")
    public final native void method343(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()Lc;")
    public final class123 method371() {
        return new class31();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lku;")
    public final class256 method295(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class325(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(FF)V")
    public final native void method338(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method1065(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "(F)V")
    public final native void method282(float arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)Lkc;")
    public final class87 method292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "()Lc;")
    public final class123 method369() {
        return this.field2086;
    }

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "(IIII)V")
    public final native void method355(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
    public final void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method301(arg0, arg1, arg2, arg4, arg5);
        this.method301(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method321(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method321(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public final void method337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1068().method123(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(IIIIII[BII)V")
    public final native void method349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "ma", descriptor = "(I)V")
    private final native void method1066(int arg0);

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
    public final boolean method363() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "()F")
    public final native float method278();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method271(Canvas arg0) {
        class287 var2 = (class287) this.field2088.method2022(-1, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class287 var5 = new class287(this, arg0);
            this.field2088.method2019((byte) -32, var5, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lma;")
    public final class10 method290(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class138(this, this.field2079, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
    public final boolean method316() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public final void method359(int arg0) {
        class132.method920(-12966);
        this.method1066(arg0);
        for (class35 var2 = (class35) this.field2078.method153(0); var2 != null; var2 = (class35) this.field2078.method161(-90)) {
            var2.method252();
        }
    }

    @OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
    public final native void method334(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "(I)V")
    public final native void method325(int arg0);

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "(S)Z")
    private final boolean method1067(short arg0) {
        synchronized (this) {
            class139 var3 = super.field502.method1642(arg0, 15);
            if (var3 == null) {
                return false;
            } else {
                this.method1063(arg0, var3.field1785, var3.field1788, var3.field1783, var3.field1775, var3.field1779, var3.field1791, var3.field1789, var3.field1794, var3.field1795, var3.field1786, var3.field1784, var3.field1778);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()V")
    public final void method365() {
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method315(Canvas arg0) {
        class287 var2 = (class287) this.field2088.method2022(-1, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method1693(arg0, var3.width, var3.height);
        if (arg0 != null && this.field2093 == arg0) {
            this.method342(arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lfm;)V")
    public final void method351(class517 arg0) {
        this.method1064(arg0, false);
        this.method1068().method127(this, field2095, field2096, field2089, field2092, arg0.field7487.method1828((byte) 105));
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
    public final native void method301(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "AA", descriptor = "(IIII)V")
    public final native void method317(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "()I")
    public final native int method367();

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method120();
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public final void method336(int arg0) {
        this.field2097 = arg0;
        this.field2098 = new class15[this.field2097];
        for (int var2 = 0; var2 < this.field2097; ++var2) {
            this.field2098[var2] = new class15(this, this.field2081, this.field2082);
        }
    }

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "()Ln;")
    public final class15 method1068() {
        for (int var1 = 0; var1 < this.field2097; ++var1) {
            if (this.field2098[var1].field248 == Thread.currentThread()) {
                return this.field2098[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "EA", descriptor = "()V")
    public final native void method120();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lt;Lfm;Lc;Lvs;I)V")
    public final void method366(class474 arg0, class517 arg1, class123 arg2, class419 arg3, int arg4) {
        this.method1064(arg1, true);
        if (arg3 == null) {
            this.method1068().method125(this, arg0, arg2, (int[]) null, arg4, field2095, field2096, field2089, field2092, field2084, arg1.field7487.method1828((byte) 84), field2083);
        } else {
            field2087[5] = 0;
            this.method1068().method125(this, arg0, arg2, field2087, arg4, field2095, field2096, field2089, field2092, field2084, arg1.field7487.method1828((byte) 88), field2083);
            arg3.field5947 = field2087[0];
            arg3.field5943 = field2087[1];
            arg3.field5946 = field2087[2];
            arg3.field5944 = field2087[3];
            arg3.field5945 = field2087[4];
            arg3.field5942 = field2087[5] != 0;
        }
        class44 var6 = (class44) arg0;
        var6.method406(0, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public final void method348(float arg0, float arg1, float arg2) {
    }
}
