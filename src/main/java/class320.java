import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class320 {

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Lse;")
    private class213 field4076 = null;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "Lse;")
    private class213 field4075 = null;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    private int field4077 = 65000;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    private int field4073;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "Lcea;")
    public static class180 field4074 = new class180("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!es", name = "k", descriptor = "Lre;")
    public static class515 field4082 = new class515("stellardawn", 1);

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V", line = 4)
    public static void method1764(byte arg0) {
        if (arg0 != -99) {
            method1765(-48, 75, -108, -126, -88, -38, -71, 49, -17);
        }
        field4074 = null;
        field4082 = null;
    }

    @OriginalMember(owner = "client!es", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        field4081++;
        return "Cache:" + this.field4073;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(ILse;Lse;I)V", line = 144)
    public class320(int arg0, class213 arg1, class213 arg2, int arg3) {
        this.field4073 = arg0;
        this.field4075 = arg2;
        this.field4077 = arg3;
        this.field4076 = arg1;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIIIIII)Z", line = 37)
    public static final boolean method1765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4080++;
        int var9 = -126 / ((27 - arg2) / 48);
        if ((arg3 + arg8) > arg4 && (arg1 + arg4) > arg3) {
            return (arg5 + arg0) > arg6 && arg5 < arg6 + arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)[B", line = 62)
    public final byte[] method1766(int arg0, int arg1) {
        field4072++;
        class213 var3 = this.field4076;
        synchronized (this.field4076) {
            try {
                if (this.field4075.method1224((byte) 18) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field4075.method1218((long) (arg1 * 6), 0);
                this.field4075.method1217(6, (byte) 127, 0, class531.field7462);
                int var5 = (class531.field7462[0] & 0xFF << 16) + (class531.field7462[1] & 0xFF << 8) + (class531.field7462[2] & 0xFF);
                int var6 = (class531.field7462[5] & 0xFF) + ((class531.field7462[3] & 0xFF) << 16) + (class531.field7462[arg0] & 0xFF << 8);
                if (var5 < 0 || var5 > this.field4077) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field4076.method1224((byte) 18) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4076.method1218((long) (var6 * 520), arg0 ^ 0x4);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4076.method1217(var13 + 8, (byte) 123, 0, class531.field7462);
                        int var14 = (class531.field7462[0] & 0xFF << 8) + (class531.field7462[1] & 0xFF);
                        int var15 = (class531.field7462[2] & 0xFF << 8) + (class531.field7462[3] & 0xFF);
                        int var16 = (class531.field7462[4] & 0xFF << 16) + ((class531.field7462[5] & 0xFF) << 8) + (class531.field7462[6] & 0xFF);
                        int var17 = class531.field7462[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field4073 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field4076.method1224((byte) 18) / 520L)) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class531.field7462[var20 + 8];
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

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZI[BI)Z", line = 157)
    private final boolean method1767(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field4078++;
        class213 var6 = this.field4076;
        synchronized (this.field4076) {
            try {
                int var7;
                if (arg1) {
                    if ((long) (arg2 * 6 + 6) > this.field4075.method1224((byte) 18)) {
                        return false;
                    }
                    this.field4075.method1218((long) (arg2 * 6), 0);
                    this.field4075.method1217(6, (byte) 112, 0, class531.field7462);
                    var7 = (class531.field7462[3] & 0xFF << 16) - (-(class531.field7462[4] & 0xFF << 8) - (class531.field7462[5] & 0xFF));
                    if (var7 <= 0 || (this.field4076.method1224((byte) 18) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field4076.method1224((byte) 18) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class531.field7462[1] = (byte) (arg4 >> 8);
                class531.field7462[0] = (byte) (arg4 >> 16);
                class531.field7462[5] = (byte) var7;
                class531.field7462[2] = (byte) arg4;
                class531.field7462[4] = (byte) (var7 >> 8);
                class531.field7462[3] = (byte) (var7 >> 16);
                this.field4075.method1218((long) (arg2 * 6), 0);
                this.field4075.method1223(class531.field7462, 6, (byte) -85, 0);
                int var10 = 0;
                int var11 = 0;
                if (arg0 != 255) {
                    this.field4075 = null;
                }
                while (arg4 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label107: {
                            this.field4076.method1218((long) (var7 * 520), 0);
                            try {
                                this.field4076.method1217(8, (byte) 104, 0, class531.field7462);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class531.field7462[0] & 0xFF) << 8) + (class531.field7462[1] & 0xFF);
                            int var14 = ((class531.field7462[2] & 0xFF) << 8) + (class531.field7462[3] & 0xFF);
                            var12 = (class531.field7462[6] & 0xFF) + ((class531.field7462[5] & 0xFF) << 8) + ((class531.field7462[4] & 0xFF) << 16);
                            int var15 = class531.field7462[7] & 0xFF;
                            if (arg2 == var13 && var11 == var14 && this.field4073 == var15) {
                                if (var12 >= 0 && this.field4076.method1224((byte) 18) / 520L >= (long) var12) {
                                    break label107;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field4076.method1224((byte) 18) + 519L) / 520L);
                        arg1 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class531.field7462[3] = (byte) var11;
                    class531.field7462[1] = (byte) arg2;
                    class531.field7462[0] = (byte) (arg2 >> 8);
                    class531.field7462[2] = (byte) (var11 >> 8);
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class531.field7462[7] = (byte) this.field4073;
                    class531.field7462[4] = (byte) (var12 >> 16);
                    class531.field7462[5] = (byte) (var12 >> 8);
                    class531.field7462[6] = (byte) var12;
                    this.field4076.method1218((long) (var7 * 520), 0);
                    this.field4076.method1223(class531.field7462, 8, (byte) -104, 0);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field4076.method1223(arg3, var18, (byte) -110, var10);
                    var10 += var18;
                    var11++;
                    var7 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I[BII)Z", line = 280)
    public final boolean method1768(int arg0, byte[] arg1, int arg2, int arg3) {
        field4079++;
        class213 var5 = this.field4076;
        synchronized (this.field4076) {
            if (arg3 < 0 || arg3 > this.field4077) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1767(arg0 ^ 0x4531, true, arg2, arg1, arg3);
            if (arg0 != 17870) {
                this.field4077 = -5;
            }
            if (!var6) {
                var6 = this.method1767(arg0 - 17615, false, arg2, arg1, arg3);
            }
            return var6;
        }
    }
}
