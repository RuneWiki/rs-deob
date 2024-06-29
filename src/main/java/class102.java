import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class102 {

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    private int field1423 = 65000;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Ljs;")
    private class178 field1421 = null;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Ljs;")
    private class178 field1427 = null;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Lch;")
    public static class151 field1429;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Z")
    public static boolean field1431;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Lrc;")
    public static class108 field1430;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Lrc;")
    public static class108 field1433;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Lch;")
    public static class151 field1434;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[B")
    public final byte[] method821(int arg0, int arg1) {
        field1425++;
        class178 var3 = this.field1427;
        synchronized (this.field1427) {
            try {
                if (this.field1421.method1274(109) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field1421.method1284(false, (long) (arg0 * 6));
                this.field1421.method1282(6, 0, class107.field1503, (byte) -72);
                int var5 = ((class107.field1503[0] & 0xFF) << 16) + (class107.field1503[1] & 0xFF << 8) + (class107.field1503[2] & 0xFF);
                int var6 = ((class107.field1503[4] & 0xFF) << 8) + (((class107.field1503[3] & 0xFF) << 16) + (class107.field1503[5] & 0xFF));
                if (var5 < 0 || var5 > this.field1423) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field1427.method1274(102) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 23 % ((64 - arg1) / 45);
                    int var12 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1427.method1284(false, (long) (var6 * 520));
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1427.method1282(var14 + 8, 0, class107.field1503, (byte) -89);
                        int var15 = ((class107.field1503[0] & 0xFF) << 8) + (class107.field1503[1] & 0xFF);
                        int var16 = (class107.field1503[2] & 0xFF << 8) + (class107.field1503[3] & 0xFF);
                        int var17 = (class107.field1503[5] & 0xFF << 8) + (class107.field1503[4] & 0xFF << 16) + (class107.field1503[6] & 0xFF);
                        int var18 = class107.field1503[7] & 0xFF;
                        if (arg0 == var15 && var12 == var16 && this.field1428 == var18) {
                            if (var17 >= 0 && this.field1427.method1274(97) / 520L >= (long) var17) {
                                var12++;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var10++] = class107.field1503[var21 + 8];
                                }
                                var6 = var17;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[BII)Z")
    public final boolean method822(int arg0, byte[] arg1, int arg2, int arg3) {
        field1420++;
        class178 var5 = this.field1427;
        synchronized (this.field1427) {
            if (arg2 < 0 || this.field1423 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method824(arg1, true, arg0, false, arg2);
            if (arg3 < 54) {
                this.method824((byte[]) null, false, 92, true, 0);
            }
            if (!var6) {
                var6 = this.method824(arg1, false, arg0, false, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V")
    public static final void method823(int arg0, byte arg1) {
        field1424++;
        if (arg1 <= 77) {
            field1431 = true;
        }
        class334 var2 = class352.method2172(arg0, 4, 16711935);
        var2.method2099(true);
    }

    @OriginalMember(owner = "client!q", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1426++;
        return "Cache:" + this.field1428;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([BZIZI)Z")
    private final boolean method824(byte[] arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field1422++;
        class178 var6 = this.field1427;
        synchronized (this.field1427) {
            try {
                int var8;
                if (arg1) {
                    if ((long) (arg2 * 6 + 6) > this.field1421.method1274(114)) {
                        return false;
                    }
                    this.field1421.method1284(false, (long) (arg2 * 6));
                    this.field1421.method1282(6, 0, class107.field1503, (byte) -25);
                    var8 = (class107.field1503[4] & 0xFF << 8) + (((class107.field1503[3] & 0xFF) << 16) + (class107.field1503[5] & 0xFF));
                    if (var8 <= 0 || (this.field1427.method1274(116) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1427.method1274(-63) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class107.field1503[5] = (byte) var8;
                class107.field1503[0] = (byte) (arg4 >> 16);
                class107.field1503[2] = (byte) arg4;
                class107.field1503[1] = (byte) (arg4 >> 8);
                class107.field1503[4] = (byte) (var8 >> 8);
                class107.field1503[3] = (byte) (var8 >> 16);
                this.field1421.method1284(arg3, (long) (arg2 * 6));
                this.field1421.method1281(-62, 0, 6, class107.field1503);
                int var10 = 0;
                int var11 = 0;
                while (arg4 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label104: {
                            this.field1427.method1284(false, (long) (var8 * 520));
                            try {
                                this.field1427.method1282(8, 0, class107.field1503, (byte) -64);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class107.field1503[0] & 0xFF << 8) + (class107.field1503[1] & 0xFF);
                            int var14 = ((class107.field1503[2] & 0xFF) << 8) + (class107.field1503[3] & 0xFF);
                            var12 = ((class107.field1503[4] & 0xFF) << 16) + ((class107.field1503[5] & 0xFF) << 8) + (class107.field1503[6] & 0xFF);
                            int var15 = class107.field1503[7] & 0xFF;
                            if (arg2 == var13 && var11 == var14 && this.field1428 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field1427.method1274(112) / 520L)) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg1 = false;
                        var12 = (int) ((this.field1427.method1274(109) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if ((arg4 - var10) <= 512) {
                        var12 = 0;
                    }
                    class107.field1503[2] = (byte) (var11 >> 8);
                    class107.field1503[3] = (byte) var11;
                    class107.field1503[0] = (byte) (arg2 >> 8);
                    class107.field1503[1] = (byte) arg2;
                    class107.field1503[4] = (byte) (var12 >> 16);
                    class107.field1503[6] = (byte) var12;
                    class107.field1503[5] = (byte) (var12 >> 8);
                    class107.field1503[7] = (byte) this.field1428;
                    this.field1427.method1284(false, (long) (var8 * 520));
                    this.field1427.method1281(-54, 0, 8, class107.field1503);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field1427.method1281(-86, var10, var18, arg0);
                    var8 = var12;
                    var10 += var18;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method825(byte arg0) {
        field1429 = null;
        field1430 = null;
        if (arg0 >= -65) {
            field1432 = -119;
        }
        field1434 = null;
        field1433 = null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(ILjs;Ljs;I)V")
    public class102(int arg0, class178 arg1, class178 arg2, int arg3) {
        this.field1427 = arg1;
        this.field1423 = arg3;
        this.field1428 = arg0;
        this.field1421 = arg2;
    }

    static {
        Math.sqrt(8192.0D);
        field1429 = new class151("Discard", "Ablegen", "Jeter", "Descartar");
        field1431 = true;
        field1430 = new class108(23, -2);
        field1433 = new class108(55, -2);
        field1434 = new class151("glow2:", "leuchten2:", "brillant2:", "brilho2:");
    }
}
