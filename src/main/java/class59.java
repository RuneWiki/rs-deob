import java.awt.Font;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 {

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Ldf;")
    private class28 field1429 = null;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Ldf;")
    private class28 field1431 = null;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    private int field1434 = 65000;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "[[I")
    public static int[][] field1430 = new int[104][104];

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lid;")
    public static class60 field1437 = class11.method72(" )2> <col=00ffff>", (byte) 116);

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field1438 = 0;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Ljava/awt/Font;")
    public static Font field1425;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[Le;")
    public static class29[] field1428;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "[[S")
    public static short[][] field1424;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIII[B)Z")
    private final boolean method414(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field1426++;
        class28 var6 = this.field1429;
        synchronized (this.field1429) {
            try {
                int var8;
                if (arg0) {
                    if ((long) (arg1 * 6 + 6) > this.field1431.method214((byte) 114)) {
                        return false;
                    }
                    this.field1431.method221((byte) 51, (long) (arg1 * 6));
                    this.field1431.method217(class43.field1142, 0, 6, (byte) 123);
                    var8 = ((class43.field1142[3] & 0xFF) << 16) + (class43.field1142[4] << 8 & 0xFF00) + (class43.field1142[5] & 0xFF);
                    if (var8 <= 0 || this.field1429.method214((byte) 114) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1429.method214((byte) 114) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class43.field1142[2] = (byte) arg2;
                class43.field1142[3] = (byte) (var8 >> 16);
                class43.field1142[0] = (byte) (arg2 >> 16);
                if (arg3 != -21016) {
                    return true;
                }
                class43.field1142[1] = (byte) (arg2 >> 8);
                int var11 = 0;
                class43.field1142[5] = (byte) var8;
                class43.field1142[4] = (byte) (var8 >> 8);
                this.field1431.method221((byte) 87, (long) (arg1 * 6));
                int var12 = 0;
                this.field1431.method219(arg3 ^ 0x7986, 6, 0, class43.field1142);
                while (arg2 > var11) {
                    int var13 = 0;
                    if (arg0) {
                        label110: {
                            this.field1429.method221((byte) 94, (long) (var8 * 520));
                            try {
                                this.field1429.method217(class43.field1142, 0, 8, (byte) 107);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = ((class43.field1142[5] & 0xFF) << 8) + ((class43.field1142[4] & 0xFF) << 16) + (class43.field1142[6] & 0xFF);
                            int var14 = ((class43.field1142[0] & 0xFF) << 8) + (class43.field1142[1] & 0xFF);
                            int var15 = ((class43.field1142[2] & 0xFF) << 8) + (class43.field1142[3] & 0xFF);
                            int var16 = class43.field1142[7] & 0xFF;
                            if (arg1 == var14 && var12 == var15 && this.field1432 == var16) {
                                if (var13 >= 0 && this.field1429.method214((byte) 114) / 520L >= (long) var13) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg0 = false;
                        var13 = (int) ((this.field1429.method214((byte) 114) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class43.field1142[0] = (byte) (arg1 >> 8);
                    int var19 = arg2 - var11;
                    if (arg2 - var11 <= 512) {
                        var13 = 0;
                    }
                    class43.field1142[3] = (byte) var12;
                    class43.field1142[2] = (byte) (var12 >> 8);
                    class43.field1142[7] = (byte) this.field1432;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class43.field1142[4] = (byte) (var13 >> 16);
                    var12++;
                    class43.field1142[1] = (byte) arg1;
                    class43.field1142[5] = (byte) (var13 >> 8);
                    class43.field1142[6] = (byte) var13;
                    this.field1429.method221((byte) 122, (long) (var8 * 520));
                    var8 = var13;
                    this.field1429.method219(-11154, 8, 0, class43.field1142);
                    this.field1429.method219(-11154, var19, var11, arg4);
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1435++;
        return "Cache:" + this.field1432;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method415(byte arg0) {
        field1428 = null;
        if (arg0 <= 0) {
            field1428 = null;
        }
        field1424 = null;
        field1425 = null;
        field1430 = null;
        field1437 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BIII)Z")
    public final boolean method416(byte[] arg0, int arg1, int arg2, int arg3) {
        field1433++;
        if (arg2 <= 119) {
            return false;
        }
        class28 var5 = this.field1429;
        synchronized (this.field1429) {
            if (arg1 < 0 || arg1 > this.field1434) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method414(true, arg3, arg1, -21016, arg0);
            if (!var6) {
                var6 = this.method414(false, arg3, arg1, -21016, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[B")
    public final byte[] method417(int arg0, int arg1) {
        field1436++;
        class28 var3 = this.field1429;
        synchronized (this.field1429) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field1431.method214((byte) 114)) {
                    return null;
                }
                this.field1431.method221((byte) 55, (long) (arg0 * 6));
                this.field1431.method217(class43.field1142, 0, 6, (byte) 121);
                int var5 = (class43.field1142[5] & 0xFF) + ((class43.field1142[3] & 0xFF) << 16) + (arg1 & class43.field1142[4] << 8);
                int var6 = (class43.field1142[2] & 0xFF) + (((class43.field1142[0] & 0xFF) << 16) + ((class43.field1142[1] & 0xFF) << 8));
                if (var6 < 0 || this.field1434 < var6) {
                    return null;
                } else if (var5 > 0 && this.field1429.method214((byte) 114) / 520L >= (long) var5) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    label70: while (var10 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field1429.method221((byte) 50, (long) (var5 * 520));
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1429.method217(class43.field1142, 0, var13 + 8, (byte) 119);
                        int var14 = ((class43.field1142[0] & 0xFF) << 8) + (class43.field1142[1] & 0xFF);
                        int var15 = class43.field1142[7] & 0xFF;
                        int var16 = ((class43.field1142[2] & 0xFF) << 8) + (class43.field1142[3] & 0xFF);
                        int var17 = ((class43.field1142[5] & 0xFF) << 8) + ((class43.field1142[4] & 0xFF) << 16) + (class43.field1142[6] & 0xFF);
                        if (arg0 == var14 && var11 == var16 && this.field1432 == var15) {
                            if (var17 >= 0 && (long) var17 <= this.field1429.method214((byte) 114) / 520L) {
                                var5 = var17;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label70;
                                    }
                                    var9[var10++] = class43.field1142[var20 + 8];
                                    var20++;
                                }
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

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(ILdf;Ldf;I)V")
    public class59(int arg0, class28 arg1, class28 arg2, int arg3) {
        this.field1434 = arg3;
        this.field1431 = arg2;
        this.field1429 = arg1;
        this.field1432 = arg0;
    }
}
