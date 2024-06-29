import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class201 {

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "Lvl;")
    private class165 field2947 = null;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "Lvl;")
    private class165 field2952 = null;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    private int field2954 = 65000;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    private int field2950;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2949 = "Please wait...";

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field2946 = 0;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "Lof;")
    public static class223 field2955;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "[Lin;")
    public static class177[] field2956;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)[B", line = 11)
    public final byte[] method1461(int arg0, int arg1) {
        field2945++;
        class165 var3 = this.field2947;
        synchronized (this.field2947) {
            try {
                Object var10000;
                if (((long) (arg0 * 6 + 6)) > this.field2952.method1176(-10584)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2952.method1167((long) (arg0 * 6), 8);
                int var4 = 109 / ((arg1 + 14) / 42);
                this.field2952.method1169((byte) 122, class355.field5451, 6, 0);
                int var5 = (class355.field5451[2] & 0xFF) + ((class355.field5451[1] & 0xFF) << 8) + (class355.field5451[0] & 0xFF << 16);
                int var6 = ((class355.field5451[3] & 0xFF) << 16) + (class355.field5451[4] & 0xFF << 8) + (class355.field5451[5] & 0xFF);
                if (var5 < 0 || this.field2954 < var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var6 > 0 && ((long) var6) <= (this.field2947.method1176(-10584) / 520L)) {
                    int var7 = 0;
                    int var8 = 0;
                    byte[] var9 = new byte[var5];
                    while (var8 < var5) {
                        if (var6 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2947.method1167((long) (var6 * 520), 8);
                        int var10 = var5 - var8;
                        if (var10 > 512) {
                            var10 = 512;
                        }
                        this.field2947.method1169((byte) 120, class355.field5451, var10 + 8, 0);
                        int var11 = class355.field5451[7] & 0xFF;
                        int var12 = ((class355.field5451[4] & 0xFF) << 16) + (class355.field5451[5] & 0xFF << 8) + (class355.field5451[6] & 0xFF);
                        int var13 = ((class355.field5451[2] & 0xFF) << 8) + (class355.field5451[3] & 0xFF);
                        int var14 = (class355.field5451[0] & 0xFF << 8) + (class355.field5451[1] & 0xFF);
                        if (arg0 != var14 || var7 != var13 || this.field2950 != var11) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var12 < 0 || this.field2947.method1176(-10584) / 520L < (long) var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var6 = var12;
                        var7++;
                        for (int var15 = 0; var15 < var10; var15++) {
                            var9[var8++] = class355.field5451[var15 + 8];
                        }
                    }
                    byte[] var20 = var9;
                    return var20;
                } else {
                    var10000 = null;
                    return (byte[]) var10000;
                }
            } catch (IOException var18) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(ILvl;Lvl;I)V", line = 261)
    public class201(int arg0, class165 arg1, class165 arg2, int arg3) {
        this.field2954 = arg3;
        this.field2947 = arg1;
        this.field2950 = arg0;
        this.field2952 = arg2;
    }

    @OriginalMember(owner = "client!nm", name = "toString", descriptor = "()Ljava/lang/String;", line = 95)
    public final String toString() {
        field2948++;
        return "Cache:" + this.field2950;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[BIIZ)Z", line = 116)
    private final boolean method1462(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field2953++;
        class165 var6 = this.field2947;
        synchronized (this.field2947) {
            try {
                int var7;
                boolean var10000;
                if (arg4) {
                    if (this.field2952.method1176(arg0 - 10589) < (long) (arg2 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2952.method1167((long) (arg2 * 6), arg0 ^ 0xD);
                    this.field2952.method1169((byte) 126, class355.field5451, 6, 0);
                    var7 = ((class355.field5451[3] & 0xFF) << 16) - (-((class355.field5451[4] & 0xFF) << 8) - (class355.field5451[5] & 0xFF));
                    if (var7 <= 0 || ((long) var7) > (this.field2947.method1176(-10584) / 520L)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field2947.method1176(arg0 ^ 0xFFFFD6AD) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class355.field5451[3] = (byte) (var7 >> 16);
                class355.field5451[2] = (byte) arg3;
                class355.field5451[arg0] = (byte) var7;
                class355.field5451[0] = (byte) (arg3 >> 16);
                int var8 = 0;
                int var9 = 0;
                class355.field5451[4] = (byte) (var7 >> 8);
                class355.field5451[1] = (byte) (arg3 >> 8);
                this.field2952.method1167((long) (arg2 * 6), 8);
                this.field2952.method1171(0, -1, 6, class355.field5451);
                while (true) {
                    if (var8 < arg3) {
                        label132: {
                            int var10 = 0;
                            if (arg4) {
                                this.field2947.method1167((long) (var7 * 520), 8);
                                try {
                                    this.field2947.method1169((byte) 108, class355.field5451, 8, 0);
                                } catch (EOFException var18) {
                                    break label132;
                                }
                                int var12 = (class355.field5451[0] & 0xFF << 8) + (class355.field5451[1] & 0xFF);
                                var10 = (class355.field5451[5] & 0xFF << 8) + ((class355.field5451[4] & 0xFF) << 16) + (class355.field5451[6] & 0xFF);
                                int var13 = ((class355.field5451[2] & 0xFF) << 8) + (class355.field5451[3] & 0xFF);
                                int var14 = class355.field5451[7] & 0xFF;
                                if (arg2 != var12 || var9 != var13 || this.field2950 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || this.field2947.method1176(-10584) / 520L < (long) var10) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            int var15 = arg3 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            if (var10 == 0) {
                                arg4 = false;
                                var10 = (int) ((this.field2947.method1176(-10584) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            if (arg3 - var8 <= 512) {
                                var10 = 0;
                            }
                            class355.field5451[0] = (byte) (arg2 >> 8);
                            class355.field5451[1] = (byte) arg2;
                            class355.field5451[6] = (byte) var10;
                            class355.field5451[4] = (byte) (var10 >> 16);
                            class355.field5451[2] = (byte) (var9 >> 8);
                            class355.field5451[3] = (byte) var9;
                            class355.field5451[5] = (byte) (var10 >> 8);
                            var9++;
                            class355.field5451[7] = (byte) this.field2950;
                            this.field2947.method1167((long) (var7 * 520), arg0 + 3);
                            var7 = var10;
                            this.field2947.method1171(0, -1, 8, class355.field5451);
                            this.field2947.method1171(var8, -1, var15, arg1);
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

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([BIIZ)Z", line = 235)
    public final boolean method1463(byte[] arg0, int arg1, int arg2, boolean arg3) {
        field2951++;
        class165 var5 = this.field2947;
        synchronized (this.field2947) {
            if (arg1 < 0 || arg1 > this.field2954) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1462(5, arg0, arg2, arg1, arg3);
            if (!var6) {
                var6 = this.method1462(5, arg0, arg2, arg1, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 275)
    public static void method1464(int arg0) {
        field2956 = null;
        field2949 = null;
        if (arg0 < 85) {
            field2955 = (class223) null;
        }
        field2955 = null;
    }
}
