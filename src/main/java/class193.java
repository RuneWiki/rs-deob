import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class193 extends class244 {

    @OriginalMember(owner = "client!q", name = "y", descriptor = "La;")
    public class281 field3004 = new class281();

    @OriginalMember(owner = "client!q", name = "I", descriptor = "Lbe;")
    public class19 field3013 = new class19();

    @OriginalMember(owner = "client!q", name = "z", descriptor = "Lmg;")
    private class64 field3005;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "Lwd;")
    public static class118 field3011 = new class118(0, 0);

    @OriginalMember(owner = "client!q", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field3016 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "()I", line = 4)
    public final int method146() {
        field3009++;
        return 0;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "([III)V", line = 20)
    public final void method140(int[] arg0, int arg1, int arg2) {
        this.field3013.method140(arg0, arg1, arg2);
        field3010++;
        for (class210 var4 = (class210) this.field3004.method1954(-66); var4 != null; var4 = (class210) this.field3004.method1950((byte) 100)) {
            if (!this.field3005.method465(var4, 27201)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field3216 >= var5) {
                        this.method1415(var5 + var6, arg0, var5, (byte) -25, var4, var6);
                        var4.field3216 -= var5;
                        break;
                    }
                    this.method1415(var6 + var5, arg0, var4.field3216, (byte) -54, var4, var6);
                    var5 -= var4.field3216;
                    var6 += var4.field3216;
                } while (!this.field3005.method450(84, var5, var6, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLwi;I)V", line = 56)
    private final void method1413(byte arg0, class210 arg1, int arg2) {
        field3008++;
        if (arg0 != -79) {
            return;
        }
        if ((this.field3005.field872[arg1.field3235] & 0x4) != 0 && arg1.field3225 < 0) {
            int var4 = this.field3005.field902[arg1.field3235] / class260.field4009;
            int var5 = (var4 + 1048575 - arg1.field3210) / var4;
            arg1.field3210 = arg2 * var4 + arg1.field3210 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field3005.field871[arg1.field3235] == 0) {
                    arg1.field3223 = class316.method2201(arg1.field3231, arg1.field3223.method2190(), arg1.field3223.method2204(), arg1.field3223.method2184());
                } else {
                    arg1.field3223 = class316.method2201(arg1.field3231, arg1.field3223.method2190(), 0, arg1.field3223.method2184());
                    this.field3005.method448(arg0 - 791555691, arg1.field3232.field4637[arg1.field3205] < 0, arg1);
                }
                if (arg1.field3232.field4637[arg1.field3205] < 0) {
                    arg1.field3223.method2180(-1);
                }
                arg2 = arg1.field3210 / var4;
            }
        }
        arg1.field3223.method149(arg2);
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "()Lmd;", line = 97)
    public final class244 method142() {
        field3012++;
        class210 var1;
        do {
            var1 = (class210) this.field3004.method1950((byte) 121);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3223 == null);
        return var1.field3223;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V", line = 119)
    public static void method1414(byte arg0) {
        field3016 = null;
        field3011 = null;
        int var1 = 67 / ((arg0 - 25) / 61);
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V", line = 134)
    public final void method149(int arg0) {
        this.field3013.method149(arg0);
        for (class210 var2 = (class210) this.field3004.method1954(-66); var2 != null; var2 = (class210) this.field3004.method1950((byte) 88)) {
            if (!this.field3005.method465(var2, 27201)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3216) {
                        this.method1413((byte) -79, var2, var3);
                        var2.field3216 -= var3;
                        break;
                    }
                    this.method1413((byte) -79, var2, var2.field3216);
                    var3 -= var2.field3216;
                } while (!this.field3005.method450(3, var3, 0, var2, (int[]) null));
            }
        }
        field3007++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[IIBLwi;I)V", line = 168)
    private final void method1415(int arg0, int[] arg1, int arg2, byte arg3, class210 arg4, int arg5) {
        field3006++;
        int var7 = 85 / ((57 - arg3) / 54);
        if ((this.field3005.field872[arg4.field3235] & 0x4) != 0 && arg4.field3225 < 0) {
            int var8 = this.field3005.field902[arg4.field3235] / class260.field4009;
            while (true) {
                int var9 = (var8 + 1048575 - arg4.field3210) / var8;
                if (arg2 < var9) {
                    arg4.field3210 += arg2 * var8;
                    break;
                }
                arg4.field3223.method140(arg1, arg5, var9);
                arg4.field3210 += var8 * var9 - 1048576;
                arg2 -= var9;
                arg5 += var9;
                class316 var10 = arg4.field3223;
                int var11 = class260.field4009 / 100;
                int var12 = 262144 / var8;
                if (var12 < var11) {
                    var11 = var12;
                }
                if (this.field3005.field871[arg4.field3235] == 0) {
                    arg4.field3223 = class316.method2201(arg4.field3231, var10.method2190(), var10.method2204(), var10.method2184());
                } else {
                    arg4.field3223 = class316.method2201(arg4.field3231, var10.method2190(), 0, var10.method2184());
                    this.field3005.method448(-791555770, ~arg4.field3232.field4637[arg4.field3205] > -1, arg4);
                    arg4.field3223.method2170(var11, var10.method2204());
                }
                if (arg4.field3232.field4637[arg4.field3205] < 0) {
                    arg4.field3223.method2180(-1);
                }
                var10.method2194(var11);
                var10.method140(arg1, arg5, arg0 - arg5);
                if (var10.method2196()) {
                    this.field3013.method144(var10);
                }
            }
        }
        arg4.field3223.method140(arg1, arg5, arg2);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "()Lmd;", line = 229)
    public final class244 method145() {
        class210 var1 = (class210) this.field3004.method1954(-66);
        field3003++;
        if (var1 == null) {
            return null;
        } else if (var1.field3223 == null) {
            return this.method142();
        } else {
            return var1.field3223;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lmg;)V", line = 258)
    public class193(class64 arg0) {
        this.field3005 = arg0;
    }
}
