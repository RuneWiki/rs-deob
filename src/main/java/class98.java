import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class98 {

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "Lee;")
    private class485 field1218 = null;

    @OriginalMember(owner = "client!wea", name = "k", descriptor = "I")
    private int field1222 = 65000;

    @OriginalMember(owner = "client!wea", name = "j", descriptor = "Lee;")
    private class485 field1221 = null;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client!wea", name = "l", descriptor = "Lmq;")
    public static class78 field1223 = new class78(55, 10);

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!wea", name = "h", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!wea", name = "n", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!wea", name = "m", descriptor = "[J")
    public static long[] field1224;

    @OriginalMember(owner = "client!wea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1214++;
        return "Cache:" + this.field1213;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V")
    public static void method655(int arg0) {
        field1224 = null;
        field1223 = null;
        int var1 = 31 / ((-arg0 - 23) / 35);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZILha;I)Lda;")
    public static final class423 method656(boolean arg0, int arg1, class454 arg2, int arg3) {
        if (arg3 != -786034064) {
            field1224 = null;
        }
        field1217++;
        class365 var4 = class504.method2913(arg0, arg2, arg1, true);
        return var4 == null ? null : var4.field5177;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I[BZII)Z")
    private final boolean method657(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        field1216++;
        class485 var6 = this.field1218;
        synchronized (this.field1218) {
            try {
                int var8;
                if (arg2) {
                    if (this.field1221.method2825((byte) -61) < ((long) (arg4 * 6 + 6))) {
                        return false;
                    }
                    this.field1221.method2833((long) (arg4 * 6), (byte) -67);
                    this.field1221.method2824(true, 0, class497.field7032, 6);
                    var8 = (class497.field7032[3] & 0xFF << 16) + ((class497.field7032[4] & 0xFF) << 8) + (class497.field7032[5] & 0xFF);
                    if (var8 <= 0 || (this.field1218.method2825((byte) -65) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1218.method2825((byte) -89) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class497.field7032[2] = (byte) arg3;
                class497.field7032[3] = (byte) (var8 >> 16);
                class497.field7032[4] = (byte) (var8 >> 8);
                class497.field7032[0] = (byte) (arg3 >> 16);
                class497.field7032[1] = (byte) (arg3 >> 8);
                class497.field7032[5] = (byte) var8;
                this.field1221.method2833((long) (arg4 * 6), (byte) -95);
                if (arg0 != 4) {
                    return true;
                }
                this.field1221.method2826(-1, 0, class497.field7032, 6);
                int var11 = 0;
                int var12 = 0;
                while (arg3 > var11) {
                    int var13 = 0;
                    if (arg2) {
                        label110: {
                            this.field1218.method2833((long) (var8 * 520), (byte) 127);
                            try {
                                this.field1218.method2824(true, 0, class497.field7032, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = (class497.field7032[0] & 0xFF << 8) + (class497.field7032[1] & 0xFF);
                            var13 = (class497.field7032[4] & 0xFF << 16) + ((class497.field7032[5] & 0xFF) << 8) + (class497.field7032[6] & 0xFF);
                            int var15 = ((class497.field7032[2] & 0xFF) << 8) + (class497.field7032[3] & 0xFF);
                            int var16 = class497.field7032[7] & 0xFF;
                            if (arg4 == var14 && var12 == var15 && this.field1213 == var16) {
                                if (var13 >= 0 && (this.field1218.method2825((byte) -122) / 520L) >= ((long) var13)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field1218.method2825((byte) -121) + 519L) / 520L);
                        arg2 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class497.field7032[0] = (byte) (arg4 >> 8);
                    class497.field7032[3] = (byte) var12;
                    if (arg3 - var11 <= 512) {
                        var13 = 0;
                    }
                    class497.field7032[1] = (byte) arg4;
                    class497.field7032[2] = (byte) (var12 >> 8);
                    class497.field7032[4] = (byte) (var13 >> 16);
                    class497.field7032[5] = (byte) (var13 >> 8);
                    class497.field7032[6] = (byte) var13;
                    class497.field7032[7] = (byte) this.field1213;
                    this.field1218.method2833((long) (var8 * 520), (byte) -102);
                    this.field1218.method2826(-1, 0, class497.field7032, 8);
                    int var19 = arg3 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field1218.method2826(-1, var11, arg1, var19);
                    var12++;
                    var8 = var13;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "([BIII)Z")
    public final boolean method658(byte[] arg0, int arg1, int arg2, int arg3) {
        field1220++;
        class485 var5 = this.field1218;
        synchronized (this.field1218) {
            if (arg1 < 0 || arg1 > this.field1222) {
                throw new IllegalArgumentException();
            } else if (arg3 >= -13) {
                return false;
            } else {
                boolean var7 = this.method657(4, arg0, true, arg1, arg2);
                if (!var7) {
                    var7 = this.method657(4, arg0, false, arg1, arg2);
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIC)I")
    public static final int method659(int arg0, int arg1, char arg2) {
        if (arg0 > -25) {
            field1225 = 111;
        }
        field1219++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var4 = Character.toLowerCase(arg2);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)[B")
    public final byte[] method660(int arg0, int arg1) {
        field1212++;
        class485 var3 = this.field1218;
        synchronized (this.field1218) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field1221.method2825((byte) -35)) {
                    return null;
                } else if (arg0 < 88) {
                    return null;
                } else {
                    this.field1221.method2833((long) (arg1 * 6), (byte) 116);
                    this.field1221.method2824(true, 0, class497.field7032, 6);
                    int var6 = (class497.field7032[2] & 0xFF) + ((class497.field7032[0] & 0xFF << 16) + ((class497.field7032[1] & 0xFF) << 8));
                    int var7 = (class497.field7032[5] & 0xFF) + ((class497.field7032[3] & 0xFF) << 16) + (class497.field7032[4] & 0xFF << 8);
                    if (var6 < 0 || var6 > this.field1222) {
                        return null;
                    } else if (var7 > 0 && (this.field1218.method2825((byte) -79) / 520L) >= ((long) var7)) {
                        byte[] var10 = new byte[var6];
                        int var11 = 0;
                        int var12 = 0;
                        while (var11 < var6) {
                            if (var7 == 0) {
                                return null;
                            }
                            this.field1218.method2833((long) (var7 * 520), (byte) -108);
                            int var14 = var6 - var11;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1218.method2824(true, 0, class497.field7032, var14 + 8);
                            int var15 = ((class497.field7032[0] & 0xFF) << 8) + (class497.field7032[1] & 0xFF);
                            int var16 = (class497.field7032[2] & 0xFF << 8) + (class497.field7032[3] & 0xFF);
                            int var17 = (class497.field7032[4] & 0xFF << 16) + ((class497.field7032[5] & 0xFF) << 8) + (class497.field7032[6] & 0xFF);
                            int var18 = class497.field7032[7] & 0xFF;
                            if (arg1 == var15 && var12 == var16 && this.field1213 == var18) {
                                if (var17 >= 0 && ((long) var17) <= (this.field1218.method2825((byte) -27) / 520L)) {
                                    var7 = var17;
                                    for (int var21 = 0; var21 < var14; var21++) {
                                        var10[var11++] = class497.field7032[var21 + 8];
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
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(ILee;Lee;I)V")
    public class98(int arg0, class485 arg1, class485 arg2, int arg3) {
        this.field1221 = arg2;
        this.field1213 = arg0;
        this.field1218 = arg1;
        this.field1222 = arg3;
    }
}
