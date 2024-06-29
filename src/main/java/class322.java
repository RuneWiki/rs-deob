import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class322 {

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public int field4973 = 8;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public int field4980 = 16777215;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field4965 = 100;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Z")
    public static boolean field4964 = false;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Z")
    public static boolean field4976 = true;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public int field4962;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public int field4967;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public int field4977;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public int field4978;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Lmn;")
    public static class161 field4971;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lbe;")
    public static class19 field4961;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "Z")
    public boolean field4975;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "[[B")
    public static byte[][] field4963;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lqh;BIII)V", line = 7)
    public static final void method2231(class32 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4966++;
        if (arg1 > -69) {
            method2233(-35);
        }
        for (class239 var5 = (class239) class108.field1590.method1954(-66); var5 != null; var5 = (class239) class108.field1590.method1950((byte) 107)) {
            if (var5.field3640 == arg3 && arg2 * 128 == var5.field3637 && arg4 * 128 == var5.field3638 && var5.field3634.field404 == arg0.field404) {
                if (var5.field3632 != null) {
                    field4961.method147(var5.field3632);
                    var5.field3632 = null;
                }
                if (var5.field3633 != null) {
                    field4961.method147(var5.field3633);
                    var5.field3633 = null;
                }
                var5.method39(10717);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lwm;IIZ)V", line = 44)
    private final void method2232(class254 arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            return;
        }
        if (arg1 == 1) {
            this.field4973 = arg0.method1755(false);
        } else if (arg1 == 2) {
            this.field4975 = true;
        } else if (arg1 == 3) {
            this.field4978 = arg0.method1768(65536);
            this.field4977 = arg0.method1768(65536);
            this.field4967 = arg0.method1768(65536);
        } else if (arg1 == 4) {
            this.field4962 = arg0.method1774((byte) -122);
        } else if (arg1 == 5) {
            this.field4972 = arg0.method1755(false);
        } else if (arg1 == 6) {
            this.field4980 = arg0.method1758((byte) 60);
        }
        field4970++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 95)
    public static void method2233(int arg0) {
        field4971 = null;
        field4963 = (byte[][]) null;
        field4961 = null;
        if (arg0 != -2731) {
            field4971 = (class161) null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)[F", line = 109)
    public static final float[] method2234(int arg0) {
        field4968++;
        float var1 = class179.method1342() + class179.method1336();
        int var2 = class179.method1337();
        class136.field2058[3] = 1.0F;
        float var3 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        if (arg0 != 22313) {
            method2236(-73, -49, (byte) -44, -2, 124);
        }
        float var4 = (float) ((var2 & 0xFFD7) >> 8) / 255.0F;
        float var5 = 0.58823526F;
        class136.field2058[1] = class34.field491[1] * var4 * var5 * var1;
        float var6 = (float) (var2 & 0xFF) / 255.0F;
        class136.field2058[2] = class34.field491[2] * var6 * var5 * var1;
        class136.field2058[0] = class34.field491[0] * var3 * var5 * var1;
        return class136.field2058;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILwm;)V", line = 141)
    public final void method2235(int arg0, int arg1, class254 arg2) {
        while (true) {
            int var4 = arg2.method1774((byte) -114);
            if (var4 == 0) {
                if (arg0 != 5) {
                    method2237((byte) 46, (class254) null, (String) null);
                }
                field4974++;
                return;
            }
            this.method2232(arg2, var4, arg1, false);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIBII)V", line = 177)
    public static final void method2236(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class78.field1145 = -1;
        class49.field680 = class229.field3494 * arg4 / arg0;
        class114.field1799 = -1;
        class8.field119 = class243.field3691 * arg3 / arg1;
        if (arg2 != -46) {
            method2231((class32) null, (byte) -74, -5, -35, -32);
        }
        class7.method73(-13969);
        field4979++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLwm;Ljava/lang/String;)I", line = 197)
    public static final int method2237(byte arg0, class254 arg1, String arg2) {
        field4969++;
        int var3 = arg1.field3866;
        byte[] var4 = class331.method2309(arg2, true);
        arg1.method1750(var4.length, 2143774776);
        arg1.field3866 += class318.field4918.method632(var4.length, 0, arg1.field3840, var4, (byte) 116, arg1.field3866);
        return arg0 > -1 ? -123 : arg1.field3866 - var3;
    }
}
