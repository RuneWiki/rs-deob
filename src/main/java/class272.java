import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class272 extends class44 {

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
    private int field4332;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    private int field4330;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    private int field4333;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    private int field4317;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    private int field4329;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    private int field4325;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    private int field4321;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    private int field4334;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4318 = "yellow:";

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4319 = "purple:";

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field4322 = 0;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public static int field4328 = 0;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Lrh;")
    public static class46 field4323 = new class46();

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "[I")
    public static int[] field4336 = new int[100];

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)V")
    public final void method332(int arg0, int arg1, int arg2) {
        ++field4326;
        if (arg1 <= 113) {
            method1835((byte) 10, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(III)V")
    public final void method333(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            ++field4320;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BB)C")
    public static final char method1835(byte arg0, byte arg1) {
        ++field4324;
        if (arg1 > -104) {
            field4322 = 84;
        }
        int var2 = arg0 & 255;
        if (~var2 == -1) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && var2 < 160) {
                char var3 = class46.field581[var2 + -128];
                if (var3 == 0) {
                    throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
    public static final void method1836(int arg0, int arg1) {
        ++field4327;
        client.field2315.method1425(arg0, arg1 ^ -788436126);
        if (arg1 != 788436204) {
            field4319 = null;
        }
        class206.field3217.method1425(arg0, -127);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4332 = arg4;
        this.field4330 = arg1;
        this.field4333 = arg6;
        this.field4317 = arg2;
        this.field4329 = arg3;
        this.field4325 = arg7;
        this.field4321 = arg0;
        this.field4334 = arg5;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IBI)V")
    public final void method336(int arg0, byte arg1, int arg2) {
        ++field4335;
        int var4 = this.field4321 * arg2 >> 12;
        int var5 = this.field4330 * arg0 >> 12;
        int var6 = this.field4317 * arg2 >> 12;
        int var7 = this.field4329 * arg0 >> 12;
        int var8 = this.field4332 * arg2 >> 12;
        int var9 = this.field4334 * arg0 >> 12;
        int var10 = this.field4333 * arg2 >> 12;
        if (arg1 != 43) {
            method1835((byte) -68, (byte) 126);
        }
        int var11 = this.field4325 * arg0 >> 12;
        class84.method581(arg1 + 212, var11, var6, var4, var9, var7, var5, super.field565, var8, var10);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public static void method1837(boolean arg0) {
        if (!arg0) {
            field4336 = null;
            field4318 = null;
            field4323 = null;
            field4319 = null;
        }
    }
}
