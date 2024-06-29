import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class126 {

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "Lhv;")
    private class149 field1958 = null;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "Lhv;")
    private class149 field1961 = null;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    private int field1965 = 65000;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    private int field1957;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "Lkc;")
    public static class157 field1962 = new class157("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "[I")
    public static int[] field1966 = new int[4096];

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "Lsn;")
    public static class205 field1964 = new class205(10, 19);

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II[BZZ)Z", line = 4)
    private final boolean method909(int arg0, int arg1, byte[] arg2, boolean arg3, boolean arg4) {
        field1959++;
        class149 var6 = this.field1961;
        synchronized (this.field1961) {
            try {
                int var7;
                if (arg3) {
                    if (((long) (arg1 * 6 + 6)) > this.field1958.method1085(-114)) {
                        return false;
                    }
                    this.field1958.method1076((long) (arg1 * 6), -128);
                    this.field1958.method1081(6, class33.field514, 0, 0);
                    var7 = (class33.field514[5] & 0xFF) + ((class33.field514[4] & 0xFF) << 8) + (class33.field514[3] & 0xFF << 16);
                    if (var7 <= 0 || ((long) var7) > (this.field1961.method1085(43) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1961.method1085(-120) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class33.field514[1] = (byte) (arg0 >> 8);
                class33.field514[0] = (byte) (arg0 >> 16);
                class33.field514[4] = (byte) (var7 >> 8);
                class33.field514[5] = (byte) var7;
                class33.field514[3] = (byte) (var7 >> 16);
                class33.field514[2] = (byte) arg0;
                this.field1958.method1076((long) (arg1 * 6), -83);
                this.field1958.method1083(6, class33.field514, -1, 0);
                int var10 = 0;
                int var11 = 0;
                if (!arg4) {
                    this.field1957 = -89;
                }
                while (var10 < arg0) {
                    int var12 = 0;
                    if (arg3) {
                        label107: {
                            this.field1961.method1076((long) (var7 * 520), -98);
                            try {
                                this.field1961.method1081(8, class33.field514, 0, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class33.field514[0] & 0xFF) << 8) + (class33.field514[1] & 0xFF);
                            int var14 = ((class33.field514[2] & 0xFF) << 8) + (class33.field514[3] & 0xFF);
                            var12 = ((class33.field514[4] & 0xFF) << 16) - (-((class33.field514[5] & 0xFF) << 8) - (class33.field514[6] & 0xFF));
                            int var15 = class33.field514[7] & 0xFF;
                            if (arg1 == var13 && var11 == var14 && this.field1957 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field1961.method1085(-89) / 520L)) {
                                    break label107;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg3 = false;
                        var12 = (int) ((this.field1961.method1085(56) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class33.field514[2] = (byte) (var11 >> 8);
                    class33.field514[3] = (byte) var11;
                    if ((arg0 - var10) <= 512) {
                        var12 = 0;
                    }
                    class33.field514[0] = (byte) (arg1 >> 8);
                    class33.field514[1] = (byte) arg1;
                    class33.field514[6] = (byte) var12;
                    class33.field514[5] = (byte) (var12 >> 8);
                    class33.field514[4] = (byte) (var12 >> 16);
                    class33.field514[7] = (byte) this.field1957;
                    this.field1961.method1076((long) (var7 * 520), -125);
                    this.field1961.method1083(8, class33.field514, -1, 0);
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field1961.method1083(var18, arg2, -1, var10);
                    var7 = var12;
                    var11++;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(ILhv;Lhv;I)V", line = 295)
    public class126(int arg0, class149 arg1, class149 arg2, int arg3) {
        this.field1961 = arg1;
        this.field1957 = arg0;
        this.field1965 = arg3;
        this.field1958 = arg2;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)[B", line = 133)
    public final byte[] method910(int arg0, int arg1) {
        field1963++;
        class149 var3 = this.field1961;
        synchronized (this.field1961) {
            try {
                if (this.field1958.method1085(-95) < ((long) (arg0 * 6 + 6))) {
                    return null;
                }
                this.field1958.method1076((long) (arg0 * 6), -107);
                this.field1958.method1081(6, class33.field514, 0, 0);
                int var5 = ((class33.field514[1] & 0xFF) << 8) + (class33.field514[0] & 0xFF << 16) + (class33.field514[2] & 0xFF);
                int var6 = ((class33.field514[4] & 0xFF) << 8) + ((class33.field514[3] & 0xFF) << 16) + (class33.field514[5] & 0xFF);
                if (var5 < 0 || var5 > this.field1965) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field1961.method1085(6) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1961.method1076((long) (var6 * 520), -80);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1961.method1081(var13 + 8, class33.field514, 0, 0);
                        int var14 = (class33.field514[0] & 0xFF << 8) + (class33.field514[1] & 0xFF);
                        int var15 = (class33.field514[2] & 0xFF << 8) + (class33.field514[3] & 0xFF);
                        int var16 = (class33.field514[5] & 0xFF << 8) + ((class33.field514[4] & 0xFF << 16) + (class33.field514[6] & 0xFF));
                        int var17 = class33.field514[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field1957 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field1961.method1085(-84) / 520L) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class33.field514[var20 + 8];
                                }
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    if (arg1 > -8) {
                        this.field1961 = null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 215)
    public static void method911(byte arg0) {
        field1966 = null;
        field1964 = null;
        if (arg0 >= -20) {
            field1966 = null;
        }
        field1962 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III[B)Z", line = 227)
    public final boolean method912(int arg0, int arg1, int arg2, byte[] arg3) {
        field1960++;
        class149 var5 = this.field1961;
        synchronized (this.field1961) {
            if (arg0 < 0 || arg0 > this.field1965) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method909(arg0, arg2, arg3, true, true);
            if (arg1 != 65280) {
                method911((byte) 9);
            }
            if (!var6) {
                var6 = this.method909(arg0, arg2, arg3, false, true);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)Lin;", line = 255)
    public static final class167 method913(int arg0, int arg1, int arg2) {
        class532 var3 = class103.field1632[arg0][arg1][arg2];
        return var3 == null || var3.field7838 == null ? null : var3.field7838;
    }

    @OriginalMember(owner = "client!ro", name = "toString", descriptor = "()Ljava/lang/String;", line = 268)
    public final String toString() {
        field1956++;
        return "Cache:" + this.field1957;
    }
}
