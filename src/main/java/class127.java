import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class127 {

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "Lgn;")
    private class77 field1988 = null;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    private int field1975 = 65000;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "Lgn;")
    private class77 field1972 = null;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    private int field1984;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1974 = null;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1980 = "Take";

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1987 = "glow2:";

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "[I")
    public static int[] field1985 = new int[5];

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Ljj;")
    public static class44 field1971 = new class44(new byte[5000]);

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public static int field1990 = 0;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1992 = "Loaded sprites";

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "[Z")
    public static boolean[] field1991 = new boolean[100];

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "Log;")
    public static class157 field1989;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "[I")
    public static int[] field1981;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I", line = 5)
    public static final int method919(int arg0, int arg1) {
        if (arg0 != -252213048) {
            field1974 = (String[]) null;
        }
        field1979++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 23)
    public static void method920(int arg0) {
        field1985 = null;
        field1971 = null;
        field1980 = null;
        field1974 = null;
        field1992 = null;
        field1981 = null;
        field1987 = null;
        field1991 = null;
        field1989 = null;
        if (arg0 != 255) {
            field1990 = 35;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B[BII)Z", line = 43)
    public final boolean method921(byte arg0, byte[] arg1, int arg2, int arg3) {
        field1977++;
        class77 var5 = this.field1972;
        synchronized (this.field1972) {
            if (arg2 < 0 || this.field1975 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method925(0, arg2, true, arg3, arg1);
            if (arg0 >= -104) {
                return true;
            } else {
                if (!var6) {
                    var6 = this.method925(0, arg2, false, arg3, arg1);
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)[B", line = 83)
    public final byte[] method922(boolean arg0, int arg1) {
        field1978++;
        class77 var3 = this.field1972;
        synchronized (this.field1972) {
            try {
                Object var10000;
                if (this.field1988.method530(125) < (long) (arg1 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1988.method528((long) (arg1 * 6), 101);
                this.field1988.method525(class304.field4766, 0, 6, 0);
                int var4 = ((class304.field4766[3] & 0xFF) << 16) + (class304.field4766[4] & 0xFF << 8) + (class304.field4766[5] & 0xFF);
                int var5 = ((class304.field4766[1] & 0xFF) << 8) + ((class304.field4766[0] & 0xFF) << 16) + (class304.field4766[2] & 0xFF);
                if (var5 < 0 || var5 > this.field1975) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 <= 0 || this.field1972.method530(-112) / 520L < (long) var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var5];
                    if (!arg0) {
                        this.method921((byte) 34, (byte[]) null, -53, 86);
                    }
                    int var7 = 0;
                    int var8 = 0;
                    while (var7 < var5) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        int var9 = var5 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field1972.method528((long) (var4 * 520), -82);
                        this.field1972.method525(class304.field4766, 0, var9 + 8, 0);
                        int var10 = ((class304.field4766[2] & 0xFF) << 8) + (class304.field4766[3] & 0xFF);
                        int var11 = class304.field4766[7] & 0xFF;
                        int var12 = ((class304.field4766[5] & 0xFF) << 8) + ((class304.field4766[4] & 0xFF) << 16) + (class304.field4766[6] & 0xFF);
                        int var13 = (class304.field4766[0] & 0xFF << 8) + (class304.field4766[1] & 0xFF);
                        if (arg1 != var13 || var8 != var10 || this.field1984 != var11) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var12 < 0 || ((long) var12) > (this.field1972.method530(-78) / 520L)) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var4 = var12;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var7++] = class304.field4766[var14 + 8];
                        }
                        var8++;
                    }
                    byte[] var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 164)
    public static final void method923(int arg0) {
        if (arg0 != -1565068888) {
            method919(-42, 5);
        }
        field1976++;
        class90.field1246.method702((byte) 121);
        class207.field3409.method702((byte) 127);
    }

    @OriginalMember(owner = "client!tm", name = "toString", descriptor = "()Ljava/lang/String;", line = 186)
    public final String toString() {
        field1982++;
        return "Cache:" + this.field1984;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZB)Z", line = 199)
    public static final boolean method924(boolean arg0, byte arg1) {
        field1973++;
        if (arg1 != 71) {
            method919(-107, -96);
        }
        boolean var2 = class269.method1912();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class269.method1909();
        } else if (!class269.method1916() || !class269.method1914() || !class269.method1908()) {
            arg0 = false;
        }
        class79.field1111 = arg0;
        class61.method412(class14.field159, 3);
        if (arg0 == var2) {
            return false;
        } else {
            ((class130) class170.field2814).method939(-102);
            return true;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIZI[B)Z", line = 236)
    private final boolean method925(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field1986++;
        class77 var6 = this.field1972;
        synchronized (this.field1972) {
            try {
                int var7;
                boolean var10000;
                if (arg2) {
                    if (this.field1988.method530(-11) < ((long) (arg3 * 6 + 6))) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1988.method528((long) (arg3 * 6), arg0 ^ 0xFFFFFFC4);
                    this.field1988.method525(class304.field4766, 0, 6, 0);
                    var7 = (class304.field4766[3] & 0xFF << 16) + ((class304.field4766[4] & 0xFF) << 8) + (class304.field4766[5] & 0xFF);
                    if (var7 <= 0 || this.field1972.method530(arg0 ^ 0x7E) / 520L < (long) var7) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field1972.method530(-104) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class304.field4766[0] = (byte) (arg1 >> 16);
                class304.field4766[4] = (byte) (var7 >> 8);
                class304.field4766[1] = (byte) (arg1 >> 8);
                class304.field4766[2] = (byte) arg1;
                class304.field4766[3] = (byte) (var7 >> 16);
                int var8 = 0;
                int var9 = 0;
                class304.field4766[5] = (byte) var7;
                this.field1988.method528((long) (arg3 * 6), -58);
                this.field1988.method529(class304.field4766, arg0, -1, 6);
                while (true) {
                    if (var8 < arg1) {
                        label137: {
                            int var10 = 0;
                            if (arg2) {
                                this.field1972.method528((long) (var7 * 520), -87);
                                try {
                                    this.field1972.method525(class304.field4766, 0, 8, 0);
                                } catch (EOFException var18) {
                                    break label137;
                                }
                                int var12 = ((class304.field4766[0] & 0xFF) << 8) + (class304.field4766[1] & 0xFF);
                                var10 = (class304.field4766[6] & 0xFF) + ((class304.field4766[4] & 0xFF) << 16) + (class304.field4766[5] & 0xFF << 8);
                                int var13 = (class304.field4766[2] & 0xFF << 8) + (class304.field4766[3] & 0xFF);
                                int var14 = class304.field4766[7] & 0xFF;
                                if (arg3 != var12 || var9 != var13 || this.field1984 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (long) var10 > this.field1972.method530(126) / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field1972.method530(124) + 519L) / 520L);
                                arg2 = false;
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class304.field4766[1] = (byte) arg3;
                            class304.field4766[7] = (byte) this.field1984;
                            if (arg1 - var8 <= 512) {
                                var10 = 0;
                            }
                            class304.field4766[0] = (byte) (arg3 >> 8);
                            class304.field4766[2] = (byte) (var9 >> 8);
                            class304.field4766[4] = (byte) (var10 >> 16);
                            class304.field4766[3] = (byte) var9;
                            var9++;
                            int var15 = arg1 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class304.field4766[5] = (byte) (var10 >> 8);
                            class304.field4766[6] = (byte) var10;
                            this.field1972.method528((long) (var7 * 520), 91);
                            this.field1972.method529(class304.field4766, 0, -1, 8);
                            var7 = var10;
                            this.field1972.method529(arg4, var8, -1, var15);
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

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(ILgn;Lgn;I)V", line = 364)
    public class127(int arg0, class77 arg1, class77 arg2, int arg3) {
        this.field1988 = arg2;
        this.field1975 = arg3;
        this.field1984 = arg0;
        this.field1972 = arg1;
    }
}
