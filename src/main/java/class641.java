import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class641 {

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "[I")
    private int[] field9309 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "[I")
    public static int[] field9305 = new int[5];

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "[I")
    public static int[] field9311 = new int[1];

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "Lvt;")
    public static class344 field9301 = new class344("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "Z")
    public static boolean field9319 = false;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    public static int field9314;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "Lom;")
    public static class333 field9317;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "Lau;")
    public class478 field9306;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "[I")
    private int[] field9315;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "[S")
    private short[] field9300;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "[S")
    private short[] field9302;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "[S")
    private short[] field9304;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "[S")
    private short[] field9307;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)Z")
    public final boolean method3695(boolean arg0) {
        field9299++;
        if (this.field9315 == null) {
            return true;
        }
        boolean var2 = arg0;
        class329 var3 = this.field9306.field6715;
        synchronized (this.field9306.field6715) {
            for (int var4 = 0; var4 < this.field9315.length; var4++) {
                if (!this.field9306.field6715.method2051(0, this.field9315[var4], -22)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILge;)V")
    private final void method3696(int arg0, int arg1, class551 arg2) {
        field9313++;
        if (arg0 == 1) {
            arg2.method3045(-126);
        } else if (arg0 == 2) {
            int var8 = arg2.method3045(-128);
            this.field9315 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field9315[var9] = arg2.method3090(-122);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var4 = arg2.method3045(-126);
                this.field9302 = new short[var4];
                this.field9300 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field9300[var5] = (short) arg2.method3090(-116);
                    this.field9302[var5] = (short) arg2.method3090(-78);
                }
            } else if (arg0 == 41) {
                int var6 = arg2.method3045(-127);
                this.field9304 = new short[var6];
                this.field9307 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field9304[var7] = (short) arg2.method3090(-70);
                    this.field9307[var7] = (short) arg2.method3090(arg1 - 73);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field9309[arg0 - 60] = arg2.method3090(class426.method2502(arg1, 97));
            }
        }
        if (arg1 != -1) {
            method3698((byte) -71);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)Z")
    public final boolean method3697(byte arg0) {
        field9308++;
        boolean var2 = true;
        class329 var3 = this.field9306.field6715;
        synchronized (this.field9306.field6715) {
            int var4 = 0;
            while (true) {
                if (var4 >= 5) {
                    break;
                }
                if (this.field9309[var4] != -1 && !this.field9306.field6715.method2051(0, this.field9309[var4], -26)) {
                    var2 = false;
                }
                var4++;
            }
        }
        if (arg0 <= 32) {
            this.field9300 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)V")
    public static void method3698(byte arg0) {
        field9301 = null;
        field9311 = null;
        if (arg0 >= -85) {
            method3699(-93, 95, -122);
        }
        field9317 = null;
        field9305 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)Lnd;")
    public static final class632 method3699(int arg0, int arg1, int arg2) {
        field9303++;
        class632 var3 = (class632) class635.field9234.method3476((long) arg2 | (long) arg1 << 32, (byte) 28);
        if (var3 == null) {
            var3 = new class632(arg1, arg2);
            class635.field9234.method3475(-102, var3, var3.field1401);
        }
        if (arg0 >= -98) {
            field9311 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method3700(boolean arg0, String arg1) {
        field9312++;
        if (arg0) {
            method3698((byte) 6);
        }
        String var2 = class191.method1224(2783, class30.method181(-103, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)Lfp;")
    public final class528 method3701(byte arg0) {
        field9314++;
        class528[] var2 = new class528[5];
        int var3 = 0;
        class329 var4 = this.field9306.field6715;
        synchronized (this.field9306.field6715) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field9309[var5] != -1) {
                    var2[var3++] = class624.method3603(-91, 0, this.field9309[var5], this.field9306.field6715);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field7380 < 13) {
                var2[var6].method2949(2, -128);
            }
        }
        class528 var7 = new class528(var2, var3);
        if (this.field9300 != null) {
            for (int var8 = 0; var8 < this.field9300.length; var8++) {
                var7.method2948(false, this.field9300[var8], this.field9302[var8]);
            }
        }
        if (this.field9304 != null) {
            for (int var9 = 0; var9 < this.field9304.length; var9++) {
                var7.method2947(this.field9304[var9], this.field9307[var9], -88);
            }
        }
        if (arg0 < 37) {
            this.method3695(true);
        }
        return var7;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lge;I)V")
    public final void method3702(class551 arg0, int arg1) {
        field9310++;
        if (arg1 > -78) {
            return;
        }
        while (true) {
            int var3 = arg0.method3045(-128);
            if (var3 == 0) {
                return;
            }
            this.method3696(var3, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)Lfp;")
    public final class528 method3703(int arg0) {
        field9298++;
        if (this.field9315 == null) {
            return null;
        }
        class528[] var2 = new class528[this.field9315.length];
        class329 var3 = this.field9306.field6715;
        synchronized (this.field9306.field6715) {
            int var4 = 0;
            while (true) {
                if (this.field9315.length <= var4) {
                    break;
                }
                var2[var4] = class624.method3603(-76, 0, this.field9315[var4], this.field9306.field6715);
                var4++;
            }
        }
        for (int var5 = arg0; var5 < this.field9315.length; var5++) {
            if (var2[var5].field7380 < 13) {
                var2[var5].method2949(2, -124);
            }
        }
        class528 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class528(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field9300 != null) {
            for (int var7 = 0; var7 < this.field9300.length; var7++) {
                var6.method2948(false, this.field9300[var7], this.field9302[var7]);
            }
        }
        if (this.field9304 != null) {
            for (int var8 = 0; var8 < this.field9304.length; var8++) {
                var6.method2947(this.field9304[var8], this.field9307[var8], -81);
            }
        }
        return var6;
    }
}
