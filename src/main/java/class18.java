import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class18 {

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Lco;")
    private class210 field223 = new class210(64);

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "Lco;")
    public class210 field240 = new class210(50);

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "Luk;")
    public class162 field241 = new class162(250);

    @OriginalMember(owner = "client!qr", name = "x", descriptor = "Lwr;")
    private class400 field242 = new class400();

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "Lg;")
    public class470 field220;

    @OriginalMember(owner = "client!qr", name = "B", descriptor = "Lfn;")
    private class342 field246;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "Z")
    private boolean field231;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "Lg;")
    private class470 field230;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!qr", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field245;

    @OriginalMember(owner = "client!qr", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field243;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "Lsd;")
    public static class74 field226 = new class74(3, 6);

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field235 = new Rectangle[100];

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "Z")
    public static boolean field238;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    public final void method111(byte arg0) {
        class210 var2 = this.field223;
        synchronized (this.field223) {
            this.field223.method1169(1076);
        }
        field222++;
        class210 var3 = this.field240;
        synchronized (this.field240) {
            this.field240.method1169(arg0 + 1201);
        }
        class162 var4 = this.field241;
        synchronized (this.field241) {
            this.field241.method792(1);
            if (arg0 != -125) {
                this.field223 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)V")
    public final void method112(byte arg0, int arg1) {
        this.field244 = arg1;
        if (arg0 < 58) {
            method120(51, (class313) null, -7, (byte) -69, -127, (class395) null, 98, (class256) null);
        }
        field221++;
        class210 var3 = this.field240;
        synchronized (this.field240) {
            this.field240.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public static void method113(int arg0) {
        if (arg0 != 2) {
            field235 = null;
        }
        field235 = null;
        field226 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZLnd;ZILoj;Loj;IILcr;III)Lrg;")
    public final class395 method114(boolean arg0, class448 arg1, boolean arg2, int arg3, class280 arg4, class280 arg5, int arg6, int arg7, class206 arg8, int arg9, int arg10, int arg11) {
        field237++;
        class395 var13 = this.method115(arg7, arg3, 127, arg10, arg1, arg6, arg4, arg9);
        if (arg11 <= 78) {
            this.method115(-49, -17, 81, 120, (class448) null, 122, (class280) null, 90);
        }
        if (var13 != null) {
            return var13;
        }
        class385 var14 = this.method121(arg3, -1);
        if (arg7 > 1 && var14.field5504 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field5519[var16] <= arg7 && var14.field5519[var16] != 0) {
                    var15 = var14.field5504[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method121(var15, -1);
            }
        }
        int[] var17 = var14.method2322(arg5, arg6, arg9, (byte) 30, arg10, arg1, arg7, arg0, arg8, arg4);
        if (var17 == null) {
            return null;
        }
        class395 var18;
        if (arg2) {
            var18 = arg5.method1355(var17, 0, 36, 36, 32);
        } else {
            var18 = arg4.method1355(var17, 0, 36, 36, 32);
        }
        if (!arg2) {
            class400 var19 = new class400();
            var19.field5698 = arg10;
            var19.field5704 = arg6;
            var19.field5694 = arg3;
            var19.field5696 = arg7;
            var19.field5700 = arg9;
            var19.field5695 = arg4.field4075;
            var19.field5699 = arg1 != null;
            this.field241.method794(var18, 1, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIILnd;ILoj;I)Lrg;")
    public final class395 method115(int arg0, int arg1, int arg2, int arg3, class448 arg4, int arg5, class280 arg6, int arg7) {
        int var9 = -76 % ((70 - arg2) / 54);
        field227++;
        this.field242.field5700 = arg7;
        this.field242.field5695 = arg6.field4075;
        this.field242.field5696 = arg0;
        this.field242.field5698 = arg3;
        this.field242.field5704 = arg5;
        this.field242.field5694 = arg1;
        this.field242.field5699 = arg4 != null;
        return (class395) this.field241.method787((byte) 14, this.field242);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZI)V")
    public final void method116(boolean arg0, int arg1) {
        field232++;
        if (arg0 == this.field231) {
            return;
        }
        this.field231 = arg0;
        this.method118(arg1 - 67);
        if (arg1 != 100) {
            this.field220 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
    public final void method117(int arg0) {
        field225++;
        class162 var2 = this.field241;
        synchronized (this.field241) {
            if (arg0 != 0) {
                this.field220 = null;
            }
            this.field241.method789(119);
        }
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V")
    public final void method118(int arg0) {
        field228++;
        class210 var2 = this.field223;
        synchronized (this.field223) {
            if (arg0 < 27) {
                return;
            }
            this.field223.method1165((byte) 118);
        }
        class210 var3 = this.field240;
        synchronized (this.field240) {
            this.field240.method1165((byte) 118);
        }
        class162 var4 = this.field241;
        synchronized (this.field241) {
            this.field241.method789(127);
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
    public final void method119(byte arg0) {
        class210 var2 = this.field240;
        synchronized (this.field240) {
            this.field240.method1165((byte) 118);
        }
        field233++;
        if (arg0 > -121) {
            this.method117(30);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILhg;IBILrg;ILab;)V")
    public static final void method120(int arg0, class313 arg1, int arg2, byte arg3, int arg4, class395 arg5, int arg6, class256 arg7) {
        field224++;
        if (arg5 == null) {
            return;
        }
        int var8;
        if (class358.field5167 == 4) {
            var8 = (int) class349.field5021 & 0x3FFF;
        } else {
            var8 = (int) class349.field5021 + class367.field5251 & 0x3FFF;
        }
        if (arg3 != -63) {
            return;
        }
        int var9 = Math.max(arg7.field3597 / 2, arg7.field3707 / 2) + 10;
        int var10 = arg0 * arg0 + (arg2 * arg2);
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class16.field212[var8];
        int var12 = class16.field214[var8];
        if (class358.field5167 != 4) {
            var11 = var11 * 256 / (class415.field6000 + 256);
            var12 = var12 * 256 / (class415.field6000 + 256);
        }
        int var13 = arg0 * var12 + arg2 * var11 >> 15;
        int var14 = arg2 * var12 - (arg0 * var11) >> 15;
        arg5.method217(arg7.field3597 / 2 + var13 + (arg4 - arg5.method216() / 2), arg6 - -(arg7.field3707 / 2) + -var14 + -(arg5.method222() / 2), arg1, arg4, arg6);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Lmm;")
    public final class385 method121(int arg0, int arg1) {
        field239++;
        class210 var3 = this.field223;
        class385 var4;
        synchronized (this.field223) {
            var4 = (class385) this.field223.method1163((byte) 114, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field230.method2768(-20472, class226.method1247(false, arg0), class390.method2351(arg0, -707861748));
        class385 var6 = new class385();
        var6.field5479 = this;
        var6.field5466 = arg0;
        var6.field5472 = new String[] { null, null, class83.field1002.method205((byte) 104, this.field236), null, null };
        var6.field5502 = new String[] { null, null, null, null, class363.field5223.method205((byte) 119, this.field236) };
        if (var5 != null) {
            var6.method2325(arg1 ^ 0xFFFF84EE, new class179(var5));
        }
        var6.method2332(115);
        if (var6.field5473 != -1) {
            var6.method2314(this.method121(var6.field5473, arg1), true, this.method121(var6.field5509, arg1));
        }
        if (var6.field5474 != arg1) {
            var6.method2330(this.method121(var6.field5474, -1), this.method121(var6.field5506, -1), 31902);
        }
        if (!this.field231 && var6.field5462) {
            var6.field5469 = class301.field4474.method205((byte) 122, this.field236);
            var6.field5520 = null;
            var6.field5472 = this.field245;
            var6.field5475 = 0;
            var6.field5487 = false;
            var6.field5502 = this.field243;
            if (var6.field5488 != null) {
                boolean var7 = false;
                for (class147 var8 = var6.field5488.method241(0); var8 != null; var8 = var6.field5488.method239(~arg1)) {
                    class307 var9 = this.field246.method2076((byte) -122, (int) var8.field1776);
                    if (var9.field4517) {
                        var8.method702((byte) -114);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field5488 = null;
                }
            }
        }
        class210 var10 = this.field223;
        synchronized (this.field223) {
            this.field223.method1172((long) arg0, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)V")
    public final void method122(int arg0, int arg1) {
        class210 var3 = this.field223;
        synchronized (this.field223) {
            this.field223.method1166(arg0, (byte) -52);
        }
        field229++;
        class210 var4 = this.field240;
        synchronized (this.field240) {
            this.field240.method1166(arg0, (byte) -52);
        }
        class162 var5 = this.field241;
        synchronized (this.field241) {
            this.field241.method791((byte) -120, arg0);
            if (arg1 != -1) {
                this.method118(122);
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I[S[Ljava/lang/String;)V")
    public static final void method123(int arg0, short[] arg1, String[] arg2) {
        field234++;
        if (arg0 == -28872) {
            class214.method1203(arg2.length - 1, 0, arg1, (byte) 24, arg2);
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lci;IZLfn;Lg;Lg;)V")
    public class18(class421 arg0, int arg1, boolean arg2, class342 arg3, class470 arg4, class470 arg5) {
        this.field236 = arg1;
        this.field220 = arg5;
        this.field246 = arg3;
        this.field231 = arg2;
        this.field230 = arg4;
        if (this.field230 == null) {
            this.field219 = 0;
        } else {
            int var7 = this.field230.method2756(true) - 1;
            this.field219 = var7 * 256 + this.field230.method2755(-112, var7);
        }
        this.field245 = new String[] { null, null, class83.field1002.method205((byte) 124, this.field236), null, null };
        this.field243 = new String[] { null, null, null, null, class363.field5223.method205((byte) 127, this.field236) };
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field235[var0] = new Rectangle();
        }
        field238 = false;
    }
}
