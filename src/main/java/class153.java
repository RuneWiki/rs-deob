import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class153 {

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Lsf;")
    private class139 field2485 = null;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    private int field2482 = 65000;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Lsf;")
    private class139 field2480 = null;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    private int field2488;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2489 = "Allocating memory";

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lqc;")
    public static class106 field2481;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "[I")
    public static int[] field2477;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B[BII)Z", line = 6)
    public final boolean method1259(byte arg0, byte[] arg1, int arg2, int arg3) {
        field2479++;
        class139 var5 = this.field2485;
        synchronized (this.field2485) {
            if (arg0 > -41) {
                this.field2488 = 29;
            }
            if (arg3 < 0 || arg3 > this.field2482) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1260(true, arg1, arg2, arg3, 124);
            if (!var6) {
                var6 = this.method1260(false, arg1, arg2, arg3, 116);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z[BIII)Z", line = 39)
    private final boolean method1260(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field2483++;
        class139 var6 = this.field2485;
        synchronized (this.field2485) {
            boolean var10000;
            try {
                if (arg4 <= 101) {
                    var10000 = true;
                    return var10000;
                }
                int var7;
                if (arg0) {
                    if (this.field2480.method1157((byte) 4) < (long) (arg2 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2480.method1165((long) (arg2 * 6), 0);
                    this.field2480.method1164(class62.field959, 6, -1, 0);
                    var7 = (class62.field959[5] & 0xFF) + ((class62.field959[4] & 0xFF) << 8) + (class62.field959[3] & 0xFF << 16);
                    if (var7 <= 0 || this.field2485.method1157((byte) 4) / 520L < (long) var7) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field2485.method1157((byte) 4) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class62.field959[2] = (byte) arg3;
                class62.field959[4] = (byte) (var7 >> 8);
                class62.field959[5] = (byte) var7;
                class62.field959[1] = (byte) (arg3 >> 8);
                class62.field959[3] = (byte) (var7 >> 16);
                int var8 = 0;
                class62.field959[0] = (byte) (arg3 >> 16);
                this.field2480.method1165((long) (arg2 * 6), 0);
                int var9 = 0;
                this.field2480.method1161(6, -1, 0, class62.field959);
                while (arg3 > var8) {
                    int var10 = 0;
                    if (arg0) {
                        this.field2485.method1165((long) (var7 * 520), 0);
                        try {
                            this.field2485.method1164(class62.field959, 8, -1, 0);
                        } catch (EOFException var18) {
                            break;
                        }
                        var10 = (class62.field959[6] & 0xFF) + (class62.field959[4] & 0xFF << 16) + (class62.field959[5] & 0xFF << 8);
                        int var12 = ((class62.field959[0] & 0xFF) << 8) + (class62.field959[1] & 0xFF);
                        int var13 = (class62.field959[2] & 0xFF << 8) + (class62.field959[3] & 0xFF);
                        int var14 = class62.field959[7] & 0xFF;
                        if (arg2 != var12 || var9 != var13 || this.field2488 != var14) {
                            var10000 = false;
                            return var10000;
                        }
                        if (var10 < 0 || (long) var10 > this.field2485.method1157((byte) 4) / 520L) {
                            var10000 = false;
                            return var10000;
                        }
                    }
                    if (var10 == 0) {
                        arg0 = false;
                        var10 = (int) ((this.field2485.method1157((byte) 4) + 519L) / 520L);
                        if (var10 == 0) {
                            var10++;
                        }
                        if (var7 == var10) {
                            var10++;
                        }
                    }
                    class62.field959[3] = (byte) var9;
                    class62.field959[2] = (byte) (var9 >> 8);
                    class62.field959[7] = (byte) this.field2488;
                    var9++;
                    if (arg3 - var8 <= 512) {
                        var10 = 0;
                    }
                    class62.field959[5] = (byte) (var10 >> 8);
                    int var15 = arg3 - var8;
                    if (var15 > 512) {
                        var15 = 512;
                    }
                    class62.field959[1] = (byte) arg2;
                    class62.field959[6] = (byte) var10;
                    class62.field959[4] = (byte) (var10 >> 16);
                    class62.field959[0] = (byte) (arg2 >> 8);
                    this.field2485.method1165((long) (var7 * 520), 0);
                    var7 = var10;
                    this.field2485.method1161(8, -1, 0, class62.field959);
                    this.field2485.method1161(var15, -1, var8, arg1);
                    var8 += var15;
                }
                var10000 = true;
            } catch (IOException var19) {
                return false;
            }
            return var10000;
        }
    }

    @OriginalMember(owner = "client!th", name = "toString", descriptor = "()Ljava/lang/String;", line = 166)
    public final String toString() {
        field2484++;
        return "Cache:" + this.field2488;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)[B", line = 176)
    public final byte[] method1261(boolean arg0, int arg1) {
        if (!arg0) {
            this.method1259((byte) -112, (byte[]) null, 79, -31);
        }
        field2487++;
        class139 var3 = this.field2485;
        synchronized (this.field2485) {
            try {
                Object var10000;
                if ((long) (arg1 * 6 + 6) > this.field2480.method1157((byte) 4)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2480.method1165((long) (arg1 * 6), 0);
                this.field2480.method1164(class62.field959, 6, -1, 0);
                int var4 = (class62.field959[5] & 0xFF) + ((class62.field959[3] & 0xFF << 16) + (class62.field959[4] & 0xFF << 8));
                int var5 = (class62.field959[0] & 0xFF << 16) + (((class62.field959[1] & 0xFF) << 8) + (class62.field959[2] & 0xFF));
                if (var5 < 0 || var5 > this.field2482) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 <= 0 || ((long) var4) > (this.field2485.method1157((byte) 4) / 520L)) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var5];
                    int var7 = 0;
                    int var8 = 0;
                    while (var5 > var8) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2485.method1165((long) (var4 * 520), 0);
                        int var9 = var5 - var8;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field2485.method1164(class62.field959, var9 + 8, -1, 0);
                        int var10 = ((class62.field959[2] & 0xFF) << 8) + (class62.field959[3] & 0xFF);
                        int var11 = (class62.field959[0] & 0xFF << 8) + (class62.field959[1] & 0xFF);
                        int var12 = class62.field959[7] & 0xFF;
                        int var13 = ((class62.field959[4] & 0xFF) << 16) + (class62.field959[5] & 0xFF << 8) + (class62.field959[6] & 0xFF);
                        if (arg1 != var11 || var7 != var10 || this.field2488 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var13 < 0 || this.field2485.method1157((byte) 4) / 520L < (long) var13) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var7++;
                        var4 = var13;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var8++] = class62.field959[var14 + 8];
                        }
                    }
                    byte[] var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Lti;", line = 266)
    public static final class222 method1262(int arg0, int arg1) {
        field2478++;
        class222 var2 = (class222) class186.field2905.method654(64, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 < 62) {
            return (class222) null;
        } else {
            byte[] var3 = class228.field3563.method187(class293.method2121(0, arg0), class340.method2391(arg0, (byte) -124), -1);
            class222 var4 = new class222();
            if (var3 != null) {
                var4.method1670(24457, new class25(var3));
            }
            class186.field2905.method652(-59, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(ILsf;Lsf;I)V", line = 304)
    public class153(int arg0, class139 arg1, class139 arg2, int arg3) {
        this.field2480 = arg2;
        this.field2488 = arg0;
        this.field2485 = arg1;
        this.field2482 = arg3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 318)
    public static void method1263(byte arg0) {
        field2477 = null;
        field2481 = null;
        if (arg0 < -67) {
            field2489 = null;
        }
    }
}
