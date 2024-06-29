import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class126 {

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "Lji;")
    private class635 field1945 = null;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "Lji;")
    private class635 field1947 = null;

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "I")
    private int field1950 = 65000;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    private int field1944;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "Lfba;")
    public static class27 field1949 = new class27(87, -1);

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "I")
    public static int field1953 = 0;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)[B", line = 4)
    public final byte[] method948(byte arg0, int arg1) {
        field1943++;
        class635 var3 = this.field1947;
        synchronized (this.field1947) {
            if (arg0 != -58) {
                return null;
            }
            try {
                if (((long) (arg1 * 6 + 6)) > this.field1945.method3637((byte) -127)) {
                    return null;
                }
                this.field1945.method3632((byte) -117, (long) (arg1 * 6));
                this.field1945.method3636(6, 1, 0, class107.field1591);
                int var6 = (class107.field1591[2] & 0xFF) + ((class107.field1591[1] & 0xFF) << 8) + ((class107.field1591[0] & 0xFF) << 16);
                int var7 = (class107.field1591[5] & 0xFF) + ((class107.field1591[3] & 0xFF << 16) + ((class107.field1591[4] & 0xFF) << 8));
                if (var6 < 0 || this.field1950 < var6) {
                    return null;
                } else if (var7 > 0 && (this.field1947.method3637((byte) -127) / 520L) >= ((long) var7)) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    while (var6 > var11) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field1947.method3632((byte) -90, (long) (var7 * 520));
                        int var14 = var6 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1947.method3636(var14 + 8, 1, 0, class107.field1591);
                        int var15 = (class107.field1591[0] & 0xFF << 8) + (class107.field1591[1] & 0xFF);
                        int var16 = (class107.field1591[2] & 0xFF << 8) + (class107.field1591[3] & 0xFF);
                        int var17 = (class107.field1591[4] & 0xFF << 16) + ((class107.field1591[5] & 0xFF) << 8) + (class107.field1591[6] & 0xFF);
                        int var18 = class107.field1591[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field1944 == var18) {
                            if (var17 >= 0 && (this.field1947.method3637((byte) -127) / 520L) >= ((long) var17)) {
                                var7 = var17;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class107.field1591[var21 + 8];
                                }
                                var12++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "([BIIIZ)Z", line = 85)
    private final boolean method949(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1946++;
        class635 var6 = this.field1947;
        synchronized (this.field1947) {
            try {
                int var8;
                if (arg4) {
                    if (this.field1945.method3637((byte) -127) < ((long) (arg3 * 6 + 6))) {
                        return false;
                    }
                    this.field1945.method3632((byte) 88, (long) (arg3 * 6));
                    this.field1945.method3636(6, 1, 0, class107.field1591);
                    var8 = (class107.field1591[5] & 0xFF) + (class107.field1591[3] & 0xFF << 16) + (class107.field1591[4] & 0xFF << 8);
                    if (var8 <= 0 || (long) var8 > this.field1947.method3637((byte) -127) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1947.method3637((byte) -127) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class107.field1591[0] = (byte) (arg2 >> 16);
                class107.field1591[5] = (byte) var8;
                class107.field1591[4] = (byte) (var8 >> 8);
                class107.field1591[1] = (byte) (arg2 >> 8);
                class107.field1591[3] = (byte) (var8 >> 16);
                class107.field1591[2] = (byte) arg2;
                this.field1945.method3632((byte) -113, (long) (arg3 * 6));
                if (arg1 != 865975144) {
                    method952((byte) -66);
                }
                this.field1945.method3635(6, class107.field1591, arg1 - 865958893, 0);
                int var10 = 0;
                int var11 = 0;
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg4) {
                        label108: {
                            this.field1947.method3632((byte) -78, (long) (var8 * 520));
                            try {
                                this.field1947.method3636(8, arg1 - 865975143, 0, class107.field1591);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class107.field1591[0] & 0xFF << 8) + (class107.field1591[1] & 0xFF);
                            var12 = (class107.field1591[6] & 0xFF) + (class107.field1591[4] & 0xFF << 16) + (class107.field1591[5] & 0xFF << 8);
                            int var14 = ((class107.field1591[2] & 0xFF) << 8) + (class107.field1591[3] & 0xFF);
                            int var15 = class107.field1591[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field1944 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field1947.method3637((byte) -127) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field1947.method3637((byte) -127) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class107.field1591[3] = (byte) var11;
                    class107.field1591[1] = (byte) arg3;
                    class107.field1591[0] = (byte) (arg3 >> 8);
                    class107.field1591[2] = (byte) (var11 >> 8);
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class107.field1591[6] = (byte) var12;
                    class107.field1591[4] = (byte) (var12 >> 16);
                    class107.field1591[7] = (byte) this.field1944;
                    class107.field1591[5] = (byte) (var12 >> 8);
                    this.field1947.method3632((byte) 21, (long) (var8 * 520));
                    this.field1947.method3635(8, class107.field1591, 16251, 0);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field1947.method3635(var18, arg0, 16251, var10);
                    var10 += var18;
                    var11++;
                    var8 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BC)B", line = 211)
    public static final byte method950(byte arg0, char arg1) {
        int var2 = -47 / ((arg0 - 58) / 57);
        field1948++;
        byte var3;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var3 = (byte) arg1;
        } else if (arg1 == '€') {
            var3 = -128;
        } else if (arg1 == '‚') {
            var3 = -126;
        } else if (arg1 == 'ƒ') {
            var3 = -125;
        } else if (arg1 == '„') {
            var3 = -124;
        } else if (arg1 == '…') {
            var3 = -123;
        } else if (arg1 == '†') {
            var3 = -122;
        } else if (arg1 == '‡') {
            var3 = -121;
        } else if (arg1 == 'ˆ') {
            var3 = -120;
        } else if (arg1 == '‰') {
            var3 = -119;
        } else if (arg1 == 'Š') {
            var3 = -118;
        } else if (arg1 == '‹') {
            var3 = -117;
        } else if (arg1 == 'Œ') {
            var3 = -116;
        } else if (arg1 == 'Ž') {
            var3 = -114;
        } else if (arg1 == '‘') {
            var3 = -111;
        } else if (arg1 == '’') {
            var3 = -110;
        } else if (arg1 == '“') {
            var3 = -109;
        } else if (arg1 == '”') {
            var3 = -108;
        } else if (arg1 == '•') {
            var3 = -107;
        } else if (arg1 == '–') {
            var3 = -106;
        } else if (arg1 == '—') {
            var3 = -105;
        } else if (arg1 == '˜') {
            var3 = -104;
        } else if (arg1 == '™') {
            var3 = -103;
        } else if (arg1 == 'š') {
            var3 = -102;
        } else if (arg1 == '›') {
            var3 = -101;
        } else if (arg1 == 'œ') {
            var3 = -100;
        } else if (arg1 == 'ž') {
            var3 = -98;
        } else if (arg1 == 'Ÿ') {
            var3 = -97;
        } else {
            var3 = 63;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uaa", name = "toString", descriptor = "()Ljava/lang/String;", line = 337)
    public final String toString() {
        field1951++;
        return "Cache:" + this.field1944;
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(ILji;Lji;I)V", line = 406)
    public class126(int arg0, class635 arg1, class635 arg2, int arg3) {
        this.field1945 = arg2;
        this.field1950 = arg3;
        this.field1944 = arg0;
        this.field1947 = arg1;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II[BI)Z", line = 356)
    public final boolean method951(int arg0, int arg1, byte[] arg2, int arg3) {
        field1952++;
        class635 var5 = this.field1947;
        synchronized (this.field1947) {
            if (arg3 < 0 || arg3 > this.field1950) {
                throw new IllegalArgumentException();
            }
            if (arg0 != -18221) {
                this.field1947 = null;
            }
            boolean var6 = this.method949(arg2, 865975144, arg3, arg1, true);
            if (!var6) {
                var6 = this.method949(arg2, arg0 ^ 0xCC6203BB, arg3, arg1, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V", line = 397)
    public static void method952(byte arg0) {
        if (arg0 < 122) {
            field1953 = 11;
        }
        field1949 = null;
    }
}
