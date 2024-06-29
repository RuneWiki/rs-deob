import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class80 {

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "Lni;")
    private class87 field1077 = null;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
    private int field1078 = 65000;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "Lni;")
    private class87 field1069 = null;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
    public static int field1072 = -1;

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "J")
    public static long field1080 = 0L;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)Z", line = 9)
    public static final boolean method518(int arg0, int arg1, int arg2) {
        field1071++;
        if (arg1 != 2048) {
            method518(108, -107, 101);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V", line = 29)
    public static final void method519(int arg0) {
        class12.field201 = 0;
        field1079++;
        if (arg0 > -8) {
            method518(69, -48, 69);
        }
        class96.field1395.method1959((byte) 113);
        class96.field1395.method1958(class353.field5479, 0);
        class12.field201++;
    }

    @OriginalMember(owner = "client!ht", name = "toString", descriptor = "()Ljava/lang/String;", line = 43)
    public final String toString() {
        field1070++;
        return "Cache:" + this.field1068;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIB[B)Z", line = 51)
    public final boolean method520(int arg0, int arg1, byte arg2, byte[] arg3) {
        field1075++;
        class87 var5 = this.field1069;
        synchronized (this.field1069) {
            if (arg1 < 0 || this.field1078 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method522(true, arg1, 4431, arg0, arg3);
            if (arg2 != 55) {
                this.toString();
            }
            if (!var6) {
                var6 = this.method522(false, arg1, 4431, arg0, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(ILni;Lni;I)V", line = 299)
    public class80(int arg0, class87 arg1, class87 arg2, int arg3) {
        this.field1078 = arg3;
        this.field1077 = arg2;
        this.field1069 = arg1;
        this.field1068 = arg0;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI)[B", line = 85)
    public final byte[] method521(boolean arg0, int arg1) {
        field1073++;
        class87 var3 = this.field1069;
        synchronized (this.field1069) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field1077.method569(arg0)) {
                    return null;
                }
                this.field1077.method570((long) (arg1 * 6), 0);
                this.field1077.method565(6, 0, class110.field1554, (byte) 121);
                int var5 = ((class110.field1554[0] & 0xFF) << 16) + (class110.field1554[1] & 0xFF << 8) + (class110.field1554[2] & 0xFF);
                int var6 = ((class110.field1554[3] & 0xFF) << 16) - (-(class110.field1554[4] & 0xFF << 8) - (class110.field1554[5] & 0xFF));
                if (var5 < 0 || this.field1078 < var5) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field1069.method569(false) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1069.method570((long) (var6 * 520), 0);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1069.method565(var13 + 8, 0, class110.field1554, (byte) -79);
                        int var14 = (class110.field1554[0] & 0xFF << 8) + (class110.field1554[1] & 0xFF);
                        int var15 = ((class110.field1554[2] & 0xFF) << 8) + (class110.field1554[3] & 0xFF);
                        int var16 = ((class110.field1554[5] & 0xFF) << 8) + (class110.field1554[4] & 0xFF << 16) + (class110.field1554[6] & 0xFF);
                        int var17 = class110.field1554[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field1068 == var17) {
                            if (var16 >= 0 && this.field1069.method569(arg0) / 520L >= (long) var16) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class110.field1554[var20 + 8];
                                }
                                var6 = var16;
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

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZIII[B)Z", line = 178)
    private final boolean method522(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field1074++;
        class87 var6 = this.field1069;
        synchronized (this.field1069) {
            try {
                int var8;
                if (arg0) {
                    if ((long) (arg3 * 6 + 6) > this.field1077.method569(false)) {
                        return false;
                    }
                    this.field1077.method570((long) (arg3 * 6), 0);
                    this.field1077.method565(6, 0, class110.field1554, (byte) 118);
                    var8 = (class110.field1554[3] & 0xFF << 16) + (class110.field1554[5] & 0xFF) + ((class110.field1554[4] & 0xFF) << 8);
                    if (var8 <= 0 || ((long) var8) > (this.field1069.method569(false) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1069.method569(false) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class110.field1554[5] = (byte) var8;
                class110.field1554[3] = (byte) (var8 >> 16);
                class110.field1554[4] = (byte) (var8 >> 8);
                class110.field1554[1] = (byte) (arg1 >> 8);
                class110.field1554[2] = (byte) arg1;
                class110.field1554[0] = (byte) (arg1 >> 16);
                this.field1077.method570((long) (arg3 * 6), 0);
                this.field1077.method571((byte) -124, 0, class110.field1554, 6);
                int var10 = 0;
                int var11 = 0;
                while (arg1 > var10) {
                    int var12 = 0;
                    if (arg0) {
                        label110: {
                            this.field1069.method570((long) (var8 * 520), 0);
                            try {
                                this.field1069.method565(8, 0, class110.field1554, (byte) 125);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class110.field1554[0] & 0xFF << 8) + (class110.field1554[1] & 0xFF);
                            var12 = ((class110.field1554[5] & 0xFF) << 8) + ((class110.field1554[4] & 0xFF) << 16) + (class110.field1554[6] & 0xFF);
                            int var14 = (class110.field1554[2] & 0xFF << 8) + (class110.field1554[3] & 0xFF);
                            int var15 = class110.field1554[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field1068 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field1069.method569(false) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field1069.method569(false) + 519L) / 520L);
                        arg0 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class110.field1554[1] = (byte) arg3;
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class110.field1554[0] = (byte) (arg3 >> 8);
                    class110.field1554[2] = (byte) (var11 >> 8);
                    class110.field1554[3] = (byte) var11;
                    class110.field1554[5] = (byte) (var12 >> 8);
                    class110.field1554[4] = (byte) (var12 >> 16);
                    class110.field1554[7] = (byte) this.field1068;
                    class110.field1554[6] = (byte) var12;
                    this.field1069.method570((long) (var8 * 520), 0);
                    this.field1069.method571((byte) -122, 0, class110.field1554, 8);
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field1069.method571((byte) -126, var10, arg4, var18);
                    var8 = var12;
                    var11++;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                if (arg2 != 4431) {
                    field1072 = 67;
                }
                return false;
            }
        }
    }
}
