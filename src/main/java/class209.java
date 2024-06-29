import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class209 {

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Lep;")
    private class288 field2956 = null;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Lep;")
    private class288 field2959 = null;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    private int field2961 = 65000;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    private int field2960;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "[I")
    public static int[] field2955 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Ljm;")
    public static class485 field2958 = new class485(3, 0);

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Lnc;")
    public static class21 field2962 = new class21();

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "[I")
    public static int[] field2966 = new int[4096];

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "[I")
    public static int[] field2967 = new int[6];

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Luf;")
    public static class310 field2965 = new class310(54, 5);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!dh", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field2954++;
        return "Cache:" + this.field2960;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)[B", line = 12)
    public final byte[] method1264(int arg0, int arg1) {
        field2964++;
        class288 var3 = this.field2959;
        synchronized (this.field2959) {
            try {
                if (this.field2956.method1642((byte) 18) < ((long) (arg0 * 6 + 6))) {
                    return null;
                }
                this.field2956.method1650((byte) 32, (long) (arg0 * 6));
                this.field2956.method1640(-118, 0, class42.field594, 6);
                int var5 = (class42.field594[2] & 0xFF) + ((class42.field594[1] & 0xFF) << 8) + (class42.field594[0] & 0xFF << 16);
                if (arg1 != 518237192) {
                    field2958 = null;
                }
                int var6 = (class42.field594[3] & 0xFF << 16) + (class42.field594[5] & 0xFF) + (class42.field594[4] & 0xFF << 8);
                if (var5 < 0 || var5 > this.field2961) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field2959.method1642((byte) 18) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2959.method1650((byte) 37, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2959.method1640(arg1 ^ 0xE11C538C, 0, class42.field594, var13 + 8);
                        int var14 = ((class42.field594[0] & 0xFF) << 8) + (class42.field594[1] & 0xFF);
                        int var15 = ((class42.field594[2] & 0xFF) << 8) + (class42.field594[3] & 0xFF);
                        int var16 = (class42.field594[6] & 0xFF) + ((class42.field594[5] & 0xFF) << 8) + (class42.field594[4] & 0xFF << 16);
                        int var17 = class42.field594[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field2960 == var17) {
                            if (var16 >= 0 && this.field2959.method1642((byte) 18) / 520L >= (long) var16) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class42.field594[var20 + 8];
                                }
                                var11++;
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
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 97)
    public static void method1265(byte arg0) {
        field2962 = null;
        field2965 = null;
        field2966 = null;
        field2967 = null;
        field2958 = null;
        if (arg0 != 55) {
            field2962 = null;
        }
        field2955 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([BIIBZ)Z", line = 112)
    private final boolean method1266(byte[] arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field2957++;
        class288 var6 = this.field2959;
        synchronized (this.field2959) {
            try {
                int var8;
                if (arg4) {
                    if (((long) (arg2 * 6 + 6)) > this.field2956.method1642((byte) 18)) {
                        return false;
                    }
                    this.field2956.method1650((byte) 112, (long) (arg2 * 6));
                    this.field2956.method1640(-110, 0, class42.field594, 6);
                    var8 = (class42.field594[3] & 0xFF << 16) + (class42.field594[4] & 0xFF << 8) + (class42.field594[5] & 0xFF);
                    if (var8 <= 0 || (this.field2959.method1642((byte) 18) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2959.method1642((byte) 18) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class42.field594[1] = (byte) (arg1 >> 8);
                class42.field594[2] = (byte) arg1;
                class42.field594[3] = (byte) (var8 >> 16);
                if (arg3 != 102) {
                    return true;
                }
                class42.field594[4] = (byte) (var8 >> 8);
                class42.field594[0] = (byte) (arg1 >> 16);
                class42.field594[5] = (byte) var8;
                this.field2956.method1650((byte) 37, (long) (arg2 * 6));
                this.field2956.method1645(6, class42.field594, false, 0);
                int var11 = 0;
                int var12 = 0;
                while (arg1 > var11) {
                    int var13 = 0;
                    if (arg4) {
                        label110: {
                            this.field2959.method1650((byte) 32, (long) (var8 * 520));
                            try {
                                this.field2959.method1640(-49, 0, class42.field594, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = (class42.field594[0] & 0xFF << 8) + (class42.field594[1] & 0xFF);
                            int var15 = (class42.field594[2] & 0xFF << 8) + (class42.field594[3] & 0xFF);
                            var13 = (class42.field594[6] & 0xFF) + (((class42.field594[4] & 0xFF) << 16) + (class42.field594[5] & 0xFF << 8));
                            int var16 = class42.field594[7] & 0xFF;
                            if (arg2 == var14 && var12 == var15 && this.field2960 == var16) {
                                if (var13 >= 0 && ((long) var13) <= (this.field2959.method1642((byte) 18) / 520L)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field2959.method1642((byte) 18) + 519L) / 520L);
                        arg4 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    if ((arg1 - var11) <= 512) {
                        var13 = 0;
                    }
                    class42.field594[1] = (byte) arg2;
                    class42.field594[3] = (byte) var12;
                    class42.field594[2] = (byte) (var12 >> 8);
                    class42.field594[0] = (byte) (arg2 >> 8);
                    class42.field594[5] = (byte) (var13 >> 8);
                    class42.field594[4] = (byte) (var13 >> 16);
                    class42.field594[7] = (byte) this.field2960;
                    class42.field594[6] = (byte) var13;
                    this.field2959.method1650((byte) 110, (long) (var8 * 520));
                    this.field2959.method1645(8, class42.field594, false, 0);
                    int var19 = arg1 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field2959.method1645(var19, arg0, false, var11);
                    var11 += var19;
                    var12++;
                    var8 = var13;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II[BB)Z", line = 234)
    public final boolean method1267(int arg0, int arg1, byte[] arg2, byte arg3) {
        field2963++;
        if (arg3 != 42) {
            this.field2956 = null;
        }
        class288 var5 = this.field2959;
        synchronized (this.field2959) {
            if (arg0 < 0 || arg0 > this.field2961) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1266(arg2, arg0, arg1, (byte) 102, true);
            if (!var6) {
                var6 = this.method1266(arg2, arg0, arg1, (byte) 102, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(ILep;Lep;I)V", line = 284)
    public class209(int arg0, class288 arg1, class288 arg2, int arg3) {
        this.field2960 = arg0;
        this.field2961 = arg3;
        this.field2959 = arg1;
        this.field2956 = arg2;
    }
}
