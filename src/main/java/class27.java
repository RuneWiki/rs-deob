import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class27 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    private int field455 = 65000;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lef;")
    private class322 field457 = null;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lef;")
    private class322 field463 = null;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Z")
    public static boolean field458 = false;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field466 = -1;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field468 = 0;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lwm;")
    public static class152 field467 = class157.method1048("loginscreen", 108);

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lol;")
    public static class231 field456 = new class231(512);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Lhh;")
    public static class209 field473;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "[I")
    public static int[] field465;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "[[Laj;")
    public static class1[][] field472;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZI[B)Z", line = 5)
    private final boolean method219(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field469++;
        class322 var6 = this.field463;
        synchronized (this.field463) {
            try {
                int var7;
                boolean var10000;
                if (arg2) {
                    if ((long) (arg3 * 6 + 6) > this.field457.method2274((byte) -2)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field457.method2265(-2, (long) (arg3 * 6));
                    this.field457.method2271(0, 6, (byte) -99, class185.field2932);
                    var7 = ((class185.field2932[3] & 0xFF) << 16) + (class185.field2932[4] & 0xFF << 8) + (class185.field2932[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field463.method2274((byte) -2) / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field463.method2274((byte) -2) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class185.field2932[1] = (byte) (arg1 >> 8);
                if (arg0 > -73) {
                    field467 = (class152) null;
                }
                class185.field2932[3] = (byte) (var7 >> 16);
                class185.field2932[4] = (byte) (var7 >> 8);
                class185.field2932[2] = (byte) arg1;
                class185.field2932[5] = (byte) var7;
                class185.field2932[0] = (byte) (arg1 >> 16);
                int var8 = 0;
                this.field457.method2265(-2, (long) (arg3 * 6));
                this.field457.method2268(0, class185.field2932, true, 6);
                int var9 = 0;
                while (true) {
                    if (var8 < arg1) {
                        label137: {
                            int var10 = 0;
                            if (arg2) {
                                this.field463.method2265(-2, (long) (var7 * 520));
                                try {
                                    this.field463.method2271(0, 8, (byte) -99, class185.field2932);
                                } catch (EOFException var18) {
                                    break label137;
                                }
                                var10 = (class185.field2932[6] & 0xFF) + ((class185.field2932[5] & 0xFF) << 8) + (class185.field2932[4] & 0xFF << 16);
                                int var12 = ((class185.field2932[0] & 0xFF) << 8) + (class185.field2932[1] & 0xFF);
                                int var13 = ((class185.field2932[2] & 0xFF) << 8) + (class185.field2932[3] & 0xFF);
                                int var14 = class185.field2932[7] & 0xFF;
                                if (arg3 != var12 || var9 != var13 || this.field462 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || this.field463.method2274((byte) -2) / 520L < (long) var10) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                arg2 = false;
                                var10 = (int) ((this.field463.method2274((byte) -2) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            if ((arg1 - var8) <= 512) {
                                var10 = 0;
                            }
                            class185.field2932[3] = (byte) var9;
                            class185.field2932[7] = (byte) this.field462;
                            class185.field2932[0] = (byte) (arg3 >> 8);
                            class185.field2932[5] = (byte) (var10 >> 8);
                            int var15 = arg1 - var8;
                            class185.field2932[4] = (byte) (var10 >> 16);
                            class185.field2932[1] = (byte) arg3;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class185.field2932[2] = (byte) (var9 >> 8);
                            var9++;
                            class185.field2932[6] = (byte) var10;
                            this.field463.method2265(-2, (long) (var7 * 520));
                            this.field463.method2268(0, class185.field2932, true, 8);
                            var7 = var10;
                            this.field463.method2268(var8, arg4, true, var15);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 133)
    public static void method220(int arg0) {
        int var1 = 98 % ((30 - arg0) / 52);
        field456 = null;
        field467 = null;
        field473 = null;
        field465 = null;
        field472 = (class1[][]) null;
    }

    @OriginalMember(owner = "client!sd", name = "toString", descriptor = "()Ljava/lang/String;", line = 147)
    public final String toString() {
        field454++;
        return "Cache:" + this.field462;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(ILef;Lef;I)V", line = 317)
    public class27(int arg0, class322 arg1, class322 arg2, int arg3) {
        this.field455 = arg3;
        this.field462 = arg0;
        this.field463 = arg1;
        this.field457 = arg2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI[BI)Z", line = 169)
    public final boolean method221(boolean arg0, int arg1, byte[] arg2, int arg3) {
        field461++;
        class322 var5 = this.field463;
        synchronized (this.field463) {
            if (arg3 < 0 || this.field455 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method219(-123, arg3, true, arg1, arg2);
            if (!var6) {
                var6 = this.method219(-102, arg3, false, arg1, arg2);
            }
            if (arg0) {
                method223(-75, (byte) 102, (class152) null);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[B", line = 208)
    public final byte[] method222(int arg0, int arg1) {
        field464++;
        class322 var3 = this.field463;
        synchronized (this.field463) {
            try {
                Object var10000;
                if (this.field457.method2274((byte) -2) < (long) (arg1 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field457.method2265(arg0 - 10928, (long) (arg1 * 6));
                this.field457.method2271(0, 6, (byte) -99, class185.field2932);
                int var4 = (class185.field2932[2] & 0xFF) + ((class185.field2932[0] & 0xFF << 16) + (class185.field2932[1] & 0xFF << 8));
                int var5 = (class185.field2932[5] & 0xFF) + ((class185.field2932[3] & 0xFF << 16) + (class185.field2932[4] & 0xFF << 8));
                if (var4 < 0 || this.field455 < var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || ((long) var5) > (this.field463.method2274((byte) -2) / 520L)) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    byte[] var19;
                    if (arg0 != 10926) {
                        var19 = (byte[]) null;
                        return var19;
                    }
                    int var8 = 0;
                    while (var8 < var4) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field463.method2265(arg0 - 10928, (long) (var5 * 520));
                        int var9 = var4 - var8;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field463.method2271(0, var9 + 8, (byte) -99, class185.field2932);
                        int var10 = class185.field2932[7] & 0xFF;
                        int var11 = ((class185.field2932[2] & 0xFF) << 8) + (class185.field2932[3] & 0xFF);
                        int var12 = ((class185.field2932[0] & 0xFF) << 8) + (class185.field2932[1] & 0xFF);
                        int var13 = (class185.field2932[6] & 0xFF) + ((class185.field2932[5] & 0xFF) << 8) + ((class185.field2932[4] & 0xFF) << 16);
                        if (arg1 == var12 && var7 == var11 && this.field462 == var10) {
                            if (var13 >= 0 && (this.field463.method2274((byte) -2) / 520L) >= ((long) var13)) {
                                for (int var14 = 0; var14 < var9; var14++) {
                                    var6[var8++] = class185.field2932[var14 + 8];
                                }
                                var7++;
                                var5 = var13;
                                continue;
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBLwm;)V", line = 304)
    public static final void method223(int arg0, byte arg1, class152 arg2) {
        if (arg1 != 101) {
            field473 = (class209) null;
        }
        class172.field2727++;
        field471++;
        class245.field4102.method1065(113, 123);
        class245.field4102.method1977(arg2.method1013(arg1 - 18775), arg1 ^ 0x6FA6);
        class245.field4102.method1999(arg0, -450437624);
    }
}
