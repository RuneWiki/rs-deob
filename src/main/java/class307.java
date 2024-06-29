import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class307 extends class418 {

    @OriginalMember(owner = "client!le", name = "y", descriptor = "Lnt;")
    public class220 field4347 = new class220();

    @OriginalMember(owner = "client!le", name = "A", descriptor = "Lcc;")
    public class728 field4349 = new class728();

    @OriginalMember(owner = "client!le", name = "v", descriptor = "Lae;")
    private class250 field4344;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "[I")
    public static int[] field4339 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field4340 = 0;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lqaa;")
    public static class27 field4336 = new class27(25, 7);

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field4350;

    // $FF: synthetic field
    @OriginalMember(owner = "client!le", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field4352;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "[[Lgs;")
    public static class43[][] field4351;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILem;[IZII)V")
    private final void method1991(int arg0, class223 arg1, int[] arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            this.method1693();
        }
        field4334++;
        if ((this.field4344.field3521[arg1.field3189] & 0x4) != 0 && arg1.field3176 < 0) {
            int var7 = this.field4344.field3548[arg1.field3189] / class215.field3077;
            while (true) {
                int var8 = (1048575 - (arg1.field3193 - var7)) / var7;
                if (arg0 < var8) {
                    arg1.field3193 += arg0 * var7;
                    break;
                }
                arg1.field3191.method1687(arg2, arg4, var8);
                arg0 -= var8;
                arg4 += var8;
                arg1.field3193 += var7 * var8 - 1048576;
                int var9 = class215.field3077 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class294 var11 = arg1.field3191;
                if (this.field4344.field3514[arg1.field3189] == 0) {
                    arg1.field3191 = class294.method1896(arg1.field3172, var11.method1914(), var11.method1895(), var11.method1894());
                } else {
                    arg1.field3191 = class294.method1896(arg1.field3172, var11.method1914(), 0, var11.method1894());
                    this.field4344.method1668(arg1.field3179.field2341[arg1.field3175] < 0, (byte) -114, arg1);
                    arg1.field3191.method1911(var9, var11.method1895());
                }
                if (arg1.field3179.field2341[arg1.field3175] < 0) {
                    arg1.field3191.method1888(-1);
                }
                var11.method1919(var9);
                var11.method1687(arg2, arg4, arg5 - arg4);
                if (var11.method1917()) {
                    this.field4349.method4053(var11);
                }
            }
        }
        arg1.field3191.method1687(arg2, arg4, arg0);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public final void method1663(int arg0) {
        field4337++;
        this.field4349.method1663(arg0);
        for (class223 var2 = (class223) this.field4347.method1522(true); var2 != null; var2 = (class223) this.field4347.method1527((byte) 57)) {
            if (!this.field4344.method1690(2097152, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3186) {
                        this.method1996(var2, var3, 0);
                        var2.field3186 -= var3;
                        break;
                    }
                    this.method1996(var2, var2.field3186, 0);
                    var3 -= var2.field3186;
                } while (!this.field4344.method1701(var2, null, 0, var3, -2038027480));
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static final void method1992(byte arg0) {
        if (arg0 < 51) {
            method1994(-47);
        }
        field4346++;
        if (class341.field4796.field5130) {
            class438.field6123 = 96;
            return;
        }
        try {
            Method var1 = (field4352 == null ? (field4352 = method1998("java.lang.Runtime")) : field4352).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class438.field6123 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()I")
    public final int method1673() {
        field4345++;
        return 0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lvr;I)[I")
    public static final int[] method1993(class135 arg0, int arg1) {
        field4335++;
        class35 var2 = new class35(518);
        int[] var3 = new int[4];
        int var4 = 0;
        if (arg1 != 100) {
            field4336 = null;
        }
        while (var4 < 4) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
            var4++;
        }
        var2.method263((byte) -103, 10);
        var2.method233(var3[0], -23162);
        var2.method233(var3[1], -23162);
        var2.method233(var3[2], -23162);
        var2.method233(var3[3], arg1 ^ 0xFFFFA5E2);
        for (int var5 = 0; var5 < 10; var5++) {
            var2.method233((int) (Math.random() * 9.9999999E7D), -23162);
        }
        var2.method223(1493807496, (int) (Math.random() * 9.9999999E7D));
        var2.method264(class174.field2519, class610.field8832, (byte) -123);
        arg0.field2109.method283(0, (byte) 123, var2.field483, var2.field469);
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([III)V")
    public final void method1687(int[] arg0, int arg1, int arg2) {
        field4343++;
        this.field4349.method1687(arg0, arg1, arg2);
        for (class223 var4 = (class223) this.field4347.method1522(true); var4 != null; var4 = (class223) this.field4347.method1527((byte) 82)) {
            if (!this.field4344.method1690(2097152, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field3186 >= var6) {
                        this.method1991(var6, var4, arg0, true, var5, var5 + var6);
                        var4.field3186 -= var6;
                        break;
                    }
                    this.method1991(var4.field3186, var4, arg0, true, var5, var5 + var6);
                    var6 -= var4.field3186;
                    var5 += var4.field3186;
                } while (!this.field4344.method1701(var4, arg0, var5, var6, -2038027480));
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()Lep;")
    public final class418 method1696() {
        field4350++;
        class223 var1 = (class223) this.field4347.method1522(true);
        if (var1 == null) {
            return null;
        } else if (var1.field3191 == null) {
            return this.method1693();
        } else {
            return var1.field3191;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static void method1994(int arg0) {
        field4339 = null;
        if (arg0 != 1048575) {
            method1995((byte) -9);
        }
        field4336 = null;
        field4351 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)[Lqca;")
    public static final class115[] method1995(byte arg0) {
        if (arg0 <= 117) {
            field4340 = -117;
        }
        field4341++;
        return new class115[] { class200.field2871, class512.field7309, class180.field2579, class615.field8894, class178.field2570, class638.field9095, class199.field2850, class395.field5531, class434.field6070, class419.field5883, class624.field8976, class564.field7977, class490.field6982, class679.field9573 };
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lem;II)V")
    private final void method1996(class223 arg0, int arg1, int arg2) {
        if ((this.field4344.field3521[arg0.field3189] & 0x4) != arg2 && arg0.field3176 < 0) {
            int var4 = this.field4344.field3548[arg0.field3189] / class215.field3077;
            int var5 = (var4 + 1048575 - arg0.field3193) / var4;
            arg0.field3193 = arg1 * var4 + arg0.field3193 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field4344.field3514[arg0.field3189] == 0) {
                    arg0.field3191 = class294.method1896(arg0.field3172, arg0.field3191.method1914(), arg0.field3191.method1895(), arg0.field3191.method1894());
                } else {
                    arg0.field3191 = class294.method1896(arg0.field3172, arg0.field3191.method1914(), 0, arg0.field3191.method1894());
                    this.field4344.method1668(arg0.field3179.field2341[arg0.field3175] < 0, (byte) -77, arg0);
                }
                if (arg0.field3179.field2341[arg0.field3175] < 0) {
                    arg0.field3191.method1888(-1);
                }
                arg1 = arg0.field3193 / var4;
            }
        }
        field4342++;
        arg0.field3191.method1663(arg1);
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()Lep;")
    public final class418 method1693() {
        field4338++;
        class223 var1;
        do {
            var1 = (class223) this.field4347.method1527((byte) 112);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3191 == null);
        return var1.field3191;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)V")
    public static final void method1997(int arg0, boolean arg1) {
        class587.field8271 = arg0;
        field4348++;
        class358.field5026 = -1;
        class320.field4554 = -1;
        class63.method682((byte) 125);
        if (!arg1) {
            field4339 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lae;)V")
    public class307(class250 arg0) {
        this.field4344 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1998(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
