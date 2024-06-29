import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class234 {

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    private int field3954 = 0;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Ldh;")
    private class159 field3949;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Lcd;")
    public static class64 field3953 = class44.method335((byte) 71, "<col=ff0000>");

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3947 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "[B")
    public static byte[] field3955 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "Lcd;")
    public static class64 field3958 = class44.method335((byte) 71, "Hidden)2");

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field3957 = 0;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "Z")
    public static boolean field3960 = false;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "Lna;")
    private class25 field3956;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "[I")
    public static int[] field3959;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Lna;", line = 5)
    public final class25 method1676(int arg0) {
        if (arg0 != -10409) {
            method1677(27, 51, -45, (class282) null, (Component) null);
        }
        field3946++;
        this.field3954 = 0;
        return this.method1680(false);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIILte;Ljava/awt/Component;)Lej;", line = 24)
    public static final class149 method1677(int arg0, int arg1, int arg2, class282 arg3, Component arg4) {
        field3950++;
        if (class63.field1213 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class149 var5 = (class149) Class.forName("ek").getDeclaredConstructor().newInstance();
                var5.field2619 = new int[(class188.field3233 ? 2 : 1) * 256];
                var5.field2636 = arg2;
                var5.method1054(arg4);
                var5.field2626 = (arg1 & arg2) + 1024;
                if (var5.field2626 > 16384) {
                    var5.field2626 = 16384;
                }
                var5.method1052(var5.field2626);
                if (class314.field5326 > 0 && class228.field3875 == null) {
                    class228.field3875 = new class275();
                    class228.field3875.field4725 = arg3;
                    arg3.method1958(class314.field5326, class228.field3875, 16711);
                }
                if (class228.field3875 != null) {
                    if (class228.field3875.field4732[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class228.field3875.field4732[arg0] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class171 var7 = new class171(arg3, arg0);
                    var7.field2636 = arg2;
                    var7.field2619 = new int[(class188.field3233 ? 2 : 1) * 256];
                    var7.method1054(arg4);
                    var7.field2626 = 16384;
                    var7.method1052(var7.field2626);
                    if (class314.field5326 > 0 && class228.field3875 == null) {
                        class228.field3875 = new class275();
                        class228.field3875.field4725 = arg3;
                        arg3.method1958(class314.field5326, class228.field3875, 16711);
                    }
                    if (class228.field3875 != null) {
                        if (class228.field3875.field4732[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class228.field3875.field4732[arg0] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class149();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIII)V", line = 108)
    public static final void method1678(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3948++;
        int var10001 = arg3 + 123;
        int var9 = arg5 + 1;
        class31.method268(arg0, var10001, arg4, class124.field2241[arg5], arg2);
        int var8 = arg1 - 1;
        class31.method268(arg0, 119, arg4, class124.field2241[arg1], arg2);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class124.field2241[var6];
            var7[arg4] = var7[arg0] = arg2;
        }
        if (arg3 != -1) {
            method1677(44, -34, -48, (class282) null, (Component) null);
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Ldh;)V", line = 227)
    public class234(class159 arg0) {
        this.field3949 = arg0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lcd;ILkh;)I", line = 144)
    public static final int method1679(class64 arg0, int arg1, class13 arg2) {
        int var3 = arg2.field281;
        arg2.method139(true, arg0.field1274);
        field3952++;
        arg2.field281 += class3.field26.method1842(arg0.field1274, arg2.field254, 0, (byte) 113, arg2.field281, arg0.field1252);
        return arg1 == -1 ? arg2.field281 - var3 : -75;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)Lna;", line = 165)
    public final class25 method1680(boolean arg0) {
        field3951++;
        if (arg0) {
            return (class25) null;
        } else if (this.field3954 <= 0 || this.field3949.field2806[this.field3954 - 1] == this.field3956) {
            class25 var3;
            do {
                if (this.field3949.field2791 <= this.field3954) {
                    return null;
                }
                var3 = this.field3949.field2806[this.field3954++].field415;
            } while (this.field3949.field2806[this.field3954 - 1] == var3);
            this.field3956 = var3.field415;
            return var3;
        } else {
            class25 var2 = this.field3956;
            this.field3956 = var2.field415;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 204)
    public static void method1681(int arg0) {
        field3947 = null;
        if (arg0 > -27) {
            method1678(72, 115, 115, 12, 23, -1);
        }
        field3955 = null;
        field3959 = null;
        field3958 = null;
        field3953 = null;
    }
}
