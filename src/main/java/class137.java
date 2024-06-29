import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class137 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    private int field2127 = 65000;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "Lui;")
    private class266 field2129 = null;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "Lui;")
    private class266 field2138 = null;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    private int field2132;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field2128 = 0;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "[I")
    public static int[] field2140 = new int[256];

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "[I")
    public static int[] field2139 = new int[14];

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field2142 = -1;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Llb;")
    public static class211 field2133;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "Llb;")
    public static class211 field2136;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2134;

    @OriginalMember(owner = "client!bm", name = "toString", descriptor = "()Ljava/lang/String;", line = 12)
    public final String toString() {
        field2141++;
        return "Cache:" + this.field2132;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(ILui;Lui;I)V", line = 308)
    public class137(int arg0, class266 arg1, class266 arg2, int arg3) {
        this.field2132 = arg0;
        this.field2129 = arg1;
        this.field2127 = arg3;
        this.field2138 = arg2;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([BIII)Z", line = 27)
    public final boolean method1041(byte[] arg0, int arg1, int arg2, int arg3) {
        field2131++;
        class266 var5 = this.field2129;
        synchronized (this.field2129) {
            if (arg3 < 0 || this.field2127 < arg3) {
                throw new IllegalArgumentException();
            } else if (arg2 < 42) {
                return false;
            } else {
                boolean var6 = this.method1045(arg0, arg1, (byte) -125, arg3, true);
                if (!var6) {
                    var6 = this.method1045(arg0, arg1, (byte) 125, arg3, false);
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)[B", line = 53)
    public final byte[] method1042(int arg0, byte arg1) {
        if (arg1 != -18) {
            this.method1042(-34, (byte) 80);
        }
        field2130++;
        class266 var3 = this.field2129;
        synchronized (this.field2129) {
            try {
                Object var10000;
                if (this.field2138.method1843(false) < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2138.method1837((long) (arg0 * 6), arg1 + 18);
                this.field2138.method1839(-1, class236.field3611, 6, 0);
                int var4 = (class236.field3611[2] & 0xFF) + (class236.field3611[1] & 0xFF << 8) + (class236.field3611[0] & 0xFF << 16);
                int var5 = ((class236.field3611[4] & 0xFF) << 8) + (class236.field3611[3] & 0xFF << 16) + (class236.field3611[5] & 0xFF);
                if (var4 < 0 || this.field2127 < var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || this.field2129.method1843(false) / 520L < (long) var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    int var8 = 0;
                    while (var7 < var4) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2129.method1837((long) (var5 * 520), arg1 + 18);
                        int var9 = var4 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field2129.method1839(-1, class236.field3611, var9 + 8, 0);
                        int var10 = (class236.field3611[6] & 0xFF) + ((class236.field3611[4] & 0xFF << 16) + ((class236.field3611[5] & 0xFF) << 8));
                        int var11 = class236.field3611[7] & 0xFF;
                        int var12 = (class236.field3611[0] & 0xFF << 8) + (class236.field3611[1] & 0xFF);
                        int var13 = ((class236.field3611[2] & 0xFF) << 8) + (class236.field3611[3] & 0xFF);
                        if (arg0 != var12 || var8 != var13 || this.field2132 != var11) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var10 < 0 || this.field2129.method1843(false) / 520L < (long) var10) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var8++;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var7++] = class236.field3611[var14 + 8];
                        }
                        var5 = var10;
                    }
                    byte[] var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)V", line = 153)
    public static final void method1043(byte arg0, int arg1) {
        if (arg0 != 7) {
            method1043((byte) -127, -47);
        }
        field2143++;
        class87.field1275.method1429((byte) 127, arg1);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 164)
    public static void method1044(int arg0) {
        field2134 = null;
        if (arg0 == 27327) {
            field2136 = null;
            field2133 = null;
            field2139 = null;
            field2140 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([BIBIZ)Z", line = 184)
    private final boolean method1045(byte[] arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field2135++;
        class266 var6 = this.field2129;
        synchronized (this.field2129) {
            try {
                int var7;
                boolean var10000;
                if (arg4) {
                    if (((long) (arg1 * 6 + 6)) > this.field2138.method1843(false)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2138.method1837((long) (arg1 * 6), 0);
                    this.field2138.method1839(-1, class236.field3611, 6, 0);
                    var7 = (class236.field3611[3] & 0xFF << 16) + (class236.field3611[5] & 0xFF) + (class236.field3611[4] & 0xFF << 8);
                    if (var7 <= 0 || (long) var7 > this.field2129.method1843(false) / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field2129.method1843(false) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class236.field3611[4] = (byte) (var7 >> 8);
                class236.field3611[0] = (byte) (arg3 >> 16);
                class236.field3611[5] = (byte) var7;
                class236.field3611[2] = (byte) arg3;
                class236.field3611[3] = (byte) (var7 >> 16);
                class236.field3611[1] = (byte) (arg3 >> 8);
                this.field2138.method1837((long) (arg1 * 6), 0);
                this.field2138.method1838(6, 0, class236.field3611, -1);
                int var8 = 0;
                int var9 = 0;
                while (true) {
                    if (arg3 > var8) {
                        label136: {
                            int var10 = 0;
                            if (arg4) {
                                this.field2129.method1837((long) (var7 * 520), 0);
                                try {
                                    this.field2129.method1839(-1, class236.field3611, 8, 0);
                                } catch (EOFException var19) {
                                    break label136;
                                }
                                var10 = ((class236.field3611[5] & 0xFF) << 8) + ((class236.field3611[4] & 0xFF) << 16) + (class236.field3611[6] & 0xFF);
                                int var12 = (class236.field3611[0] & 0xFF << 8) + (class236.field3611[1] & 0xFF);
                                int var13 = (class236.field3611[2] & 0xFF << 8) + (class236.field3611[3] & 0xFF);
                                int var14 = class236.field3611[7] & 0xFF;
                                if (arg1 != var12 || var9 != var13 || this.field2132 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || this.field2129.method1843(false) / 520L < (long) var10) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field2129.method1843(false) + 519L) / 520L);
                                arg4 = false;
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            if ((arg3 - var8) <= 512) {
                                var10 = 0;
                            }
                            class236.field3611[2] = (byte) (var9 >> 8);
                            class236.field3611[4] = (byte) (var10 >> 16);
                            class236.field3611[3] = (byte) var9;
                            class236.field3611[1] = (byte) arg1;
                            class236.field3611[6] = (byte) var10;
                            int var15 = arg3 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class236.field3611[0] = (byte) (arg1 >> 8);
                            class236.field3611[5] = (byte) (var10 >> 8);
                            class236.field3611[7] = (byte) this.field2132;
                            var9++;
                            this.field2129.method1837((long) (var7 * 520), 0);
                            var7 = var10;
                            this.field2129.method1838(8, 0, class236.field3611, -1);
                            this.field2129.method1838(var15, var8, arg0, -1);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var20) {
                int var17 = -18 / ((-arg2 - 67) / 47);
                return false;
            }
        }
    }
}
