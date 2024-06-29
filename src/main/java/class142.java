import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class142 extends class578 {

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    private int field2343;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    private int field2346;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    private int field2350;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    private int field2349;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    private int field2347;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    private int field2336;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
    public static int[] field2341 = new int[14];

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2342 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 5)
    public static final void method1127(int arg0) {
        if (arg0 != -1636518164) {
            field2352 = -40;
        }
        class590.field8050.method1466(0);
        ++field2351;
        class147.field2460.method1466(0);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLjava/lang/String;IBZIIZIJLjava/lang/String;JI)V", line = 20)
    public static final void method1128(boolean arg0, String arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6, boolean arg7, int arg8, long arg9, String arg10, long arg11, int arg12) {
        ++field2338;
        if (!class311.field4321 && class192.field2844 < 500) {
            int var15 = ~arg12 != 0 ? arg12 : class130.field2184;
            if (arg3 >= -65) {
                method1131((byte) 19);
            }
            class324 var16 = new class324(arg10, arg1, var15, arg8, arg6, arg11, arg5, arg2, arg7, arg0, arg9, arg4);
            class22.method198((byte) 6, var16);
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(III)V", line = 43)
    public static final void method1129(int arg0, int arg1, int arg2) {
        if (arg1 == -18075) {
            ++field2348;
            class594 var3 = class692.method3869(arg0, (byte) 105, 1);
            var3.method3378(-25490);
            var3.field8126 = arg2;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 60)
    public static final boolean method1130(String arg0, int arg1) {
        int var2 = -91 % ((-35 - arg1) / 52);
        ++field2339;
        return class558.method3204(true, true, 10, arg0);
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(III)V", line = 70)
    public final void method400(int arg0, int arg1, int arg2) {
        ++field2354;
        int var4 = this.field2346 * arg1 >> 12;
        int var5 = this.field2350 * arg0 >> 12;
        int var6 = this.field2345 * arg1 >> 12;
        int var7 = this.field2347 * arg0 >> 12;
        int var8 = this.field2336 * arg1 >> 12;
        int var9 = this.field2337 * arg0 >> 12;
        int var10 = this.field2343 * arg1 >> 12;
        if (arg2 > -29) {
            field2352 = -91;
        }
        int var11 = this.field2349 * arg0 >> 12;
        class240.method1667(var5, var7, super.field7937, var11, var6, var4, var8, var9, var10, true);
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 98)
    public class142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2343 = arg6;
        this.field2346 = arg0;
        this.field2350 = arg1;
        this.field2349 = arg7;
        this.field2347 = arg3;
        this.field2336 = arg4;
        this.field2345 = arg2;
        this.field2337 = arg5;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V", line = 116)
    public final void method402(int arg0, int arg1, int arg2) {
        ++field2344;
        if (arg0 < 87) {
            this.field2347 = 18;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 127)
    public static void method1131(byte arg0) {
        int var1 = -24 / ((arg0 - -12) / 41);
        field2342 = null;
        field2341 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([SB)[S", line = 138)
    public static final short[] method1132(short[] arg0, byte arg1) {
        ++field2353;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class363.method2318(arg0, 0, var2, 0, arg0.length);
            if (arg1 >= -103) {
                method1132((short[]) null, (byte) -35);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V", line = 162)
    public final void method399(int arg0, int arg1, int arg2) {
        ++field2340;
        if (arg2 >= -98) {
            method1132((short[]) null, (byte) -17);
        }
    }
}
