import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class727 {

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "Lhe;")
    private class372 field10152 = new class372(256);

    @OriginalMember(owner = "client!pea", name = "q", descriptor = "Lhe;")
    private class372 field10159 = new class372(256);

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "Lvd;")
    private class39 field10150;

    @OriginalMember(owner = "client!pea", name = "p", descriptor = "Lvd;")
    private class39 field10158;

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "I")
    public static int field10151 = 0;

    @OriginalMember(owner = "client!pea", name = "n", descriptor = "[I")
    public static int[] field10156 = new int[3];

    @OriginalMember(owner = "client!pea", name = "o", descriptor = "[B")
    public static byte[] field10157 = new byte[2048];

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
    public static int field10143;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
    public static int field10145;

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "I")
    public static int field10147;

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "I")
    public static int field10149;

    @OriginalMember(owner = "client!pea", name = "k", descriptor = "I")
    public static int field10153;

    @OriginalMember(owner = "client!pea", name = "m", descriptor = "I")
    public static int field10155;

    @OriginalMember(owner = "client!pea", name = "l", descriptor = "Lfg;")
    public static class129 field10154;

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "Ltj;")
    public static class197 field10146;

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "[[[Z")
    public static boolean[][][] field10148;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(II[I)Lut;")
    public final class125 method4096(int arg0, int arg1, int[] arg2) {
        if (arg0 != 31360) {
            return null;
        }
        field10149++;
        if (this.field10158.method222((byte) 125) == 1) {
            return this.method4097(arg1, arg2, arg0 ^ 0x1000757F, 0);
        } else if (this.field10158.method229(arg1, arg0 - 31360) == 1) {
            return this.method4097(0, arg2, 268439551, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I[III)Lut;")
    private final class125 method4097(int arg0, int[] arg1, int arg2, int arg3) {
        field10147++;
        int var5 = arg0 ^ ((arg2 & arg3) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class125 var9 = (class125) this.field10159.method2287(var7, (byte) -117);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class552 var10 = (class552) this.field10152.method2287(var7, (byte) -117);
            if (var10 == null) {
                var10 = class552.method3222(this.field10158, arg3, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field10152.method2278((byte) -21, var7, var10);
            }
            class125 var11 = var10.method3225(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1304((byte) 7);
                this.field10159.method2278((byte) -41, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
    public static void method4098(byte arg0) {
        field10154 = null;
        field10157 = null;
        field10146 = null;
        field10148 = null;
        field10156 = null;
        int var1 = 103 / ((-arg0 - 86) / 32);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B[II)Lut;")
    public final class125 method4099(byte arg0, int[] arg1, int arg2) {
        field10155++;
        if (this.field10150.method222((byte) 126) == 1) {
            return this.method4102(arg1, arg2, true, 0);
        } else if (this.field10150.method229(arg2, 0) == 1) {
            return this.method4102(arg1, 0, true, arg2);
        } else {
            if (arg0 != 1) {
                this.method4102(null, 80, true, 31);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILog;IIIIIIILega;II)V")
    public static final void method4100(int arg0, class651 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class713 arg9, int arg10, int arg11) {
        class462.field6812 = arg8;
        class130.field1750 = arg11;
        if (arg6 != -26233) {
            method4100(112, null, 63, -11, -42, -80, 49, 97, 111, null, -29, -70);
        }
        class91.field1271 = arg9;
        class152.field2351 = arg5;
        class25.field262 = arg7;
        field10144++;
        class649.field9149 = arg4;
        class506.field7190 = arg0;
        class564.field8025 = arg10;
        field10154 = null;
        class497.field7072 = arg2;
        class55.field768 = null;
        class91.field1278 = arg1;
        class566.field8045 = null;
        class585.field8300 = arg3;
        class59.method415((byte) 117);
        class433.field6448 = true;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILge;IILjava/awt/Component;)Lvn;")
    public static final class313 method4101(int arg0, class711 arg1, int arg2, int arg3, Component arg4) {
        field10143++;
        if (client.field4279 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class313 var5 = (class313) Class.forName("lga").getDeclaredConstructor().newInstance();
                if (arg3 != 23841) {
                    method4100(84, null, 96, -79, -23, 9, 11, -50, 40, null, -52, -53);
                }
                var5.field4432 = new int[(class266.field3798 ? 2 : 1) * 256];
                var5.field4436 = arg2;
                var5.method1397(arg4);
                var5.field4451 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field4451 > 16384) {
                    var5.field4451 = 16384;
                }
                var5.method1392(var5.field4451);
                if (class375.field5681 > 0 && class740.field10382 == null) {
                    class740.field10382 = new class490();
                    class740.field10382.field6996 = arg1;
                    arg1.method4056(class740.field10382, 121, class375.field5681);
                }
                if (class740.field10382 != null) {
                    if (class740.field10382.field6998[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class740.field10382.field6998[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class205 var6 = new class205(arg1, arg0);
                    var6.field4436 = arg2;
                    var6.field4432 = new int[(class266.field3798 ? 2 : 1) * 256];
                    var6.method1397(arg4);
                    var6.field4451 = 16384;
                    var6.method1392(var6.field4451);
                    if (class375.field5681 > 0 && class740.field10382 == null) {
                        class740.field10382 = new class490();
                        class740.field10382.field6996 = arg1;
                        arg1.method4056(class740.field10382, 100, class375.field5681);
                    }
                    if (class740.field10382 != null) {
                        if (class740.field10382.field6998[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class740.field10382.field6998[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class313();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "([IIZI)Lut;")
    private final class125 method4102(int[] arg0, int arg1, boolean arg2, int arg3) {
        field10153++;
        if (!arg2) {
            method4103(13, null);
        }
        int var5 = arg1 ^ ((arg3 & 0x20000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class125 var9 = (class125) this.field10159.method2287(var7, (byte) -117);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class747 var10 = class747.method4174(this.field10150, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class125 var11 = var10.method4175();
            this.field10159.method2278((byte) -49, var7, var11);
            if (arg0 != null) {
                arg0[0] -= var11.field1678.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILrg;)Lmm;")
    public static final class279 method4103(int arg0, class645 arg1) {
        field10145++;
        if (arg0 != 2) {
            field10156 = null;
        }
        class80 var2 = class756.method4221(false, arg1);
        int var3 = arg1.method3718(-28732);
        return new class279(var2.field1126, var2.field1127, var2.field1129, var2.field1135, var2.field1125, var3);
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lvd;Lvd;)V")
    public class727(class39 arg0, class39 arg1) {
        this.field10150 = arg0;
        this.field10158 = arg1;
    }
}
