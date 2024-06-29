import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class86 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    private int field1703 = 65000;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lv;")
    private class189 field1707 = null;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Lv;")
    private class189 field1711 = null;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    private int field1712;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lsd;")
    public static class166 field1704 = class135.method935("Mitglieder)2Welt", 0);

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field1717 = 0;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field1716 = 0;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lsd;")
    public static class166 field1705 = class135.method935("leuchten3:", 0);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lgf;")
    public static class61 field1706;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([BIII)Z")
    public final boolean method684(byte[] arg0, int arg1, int arg2, int arg3) {
        field1710++;
        class189 var5 = this.field1711;
        synchronized (this.field1711) {
            if (arg3 < arg1 || arg3 > this.field1703) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method686(arg2, 26928, true, arg0, arg3);
            if (!var6) {
                var6 = this.method686(arg2, 26928, false, arg0, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!je", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1715++;
        return "Cache:" + this.field1712;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method685(int arg0) {
        field1706 = null;
        field1704 = null;
        field1705 = null;
        if (arg0 != 16573) {
            method685(-31);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZ[BI)Z")
    private final boolean method686(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        field1718++;
        class189 var6 = this.field1711;
        synchronized (this.field1711) {
            try {
                int var8;
                if (arg2) {
                    if ((long) (arg0 * 6 + 6) > this.field1707.method1268(arg1 ^ 0x7A46)) {
                        return false;
                    }
                    this.field1707.method1259((byte) -97, (long) (arg0 * 6));
                    this.field1707.method1265(6, class167.field3206, 0, (byte) 126);
                    var8 = ((class167.field3206[3] & 0xFF) << 16) + (((class167.field3206[4] & 0xFF) << 8) + (class167.field3206[5] & 0xFF));
                    if (var8 <= 0 || (long) var8 > this.field1711.method1268(4982) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1711.method1268(4982) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class167.field3206[1] = (byte) (arg4 >> 8);
                class167.field3206[4] = (byte) (var8 >> 8);
                int var10 = 0;
                class167.field3206[5] = (byte) var8;
                int var11 = 0;
                class167.field3206[2] = (byte) arg4;
                class167.field3206[3] = (byte) (var8 >> 16);
                if (arg1 != 26928) {
                    field1717 = 89;
                }
                class167.field3206[0] = (byte) (arg4 >> 16);
                this.field1707.method1259((byte) -66, (long) (arg0 * 6));
                this.field1707.method1267(6, (byte) -85, 0, class167.field3206);
                while (var11 < arg4) {
                    int var12 = 0;
                    if (arg2) {
                        label108: {
                            this.field1711.method1259((byte) -45, (long) (var8 * 520));
                            try {
                                this.field1711.method1265(8, class167.field3206, 0, (byte) 126);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class167.field3206[0] & 0xFF) << 8) + (class167.field3206[1] & 0xFF);
                            int var14 = class167.field3206[7] & 0xFF;
                            int var15 = ((class167.field3206[2] & 0xFF) << 8) + (class167.field3206[3] & 0xFF);
                            var12 = (class167.field3206[6] & 0xFF) + ((class167.field3206[5] & 0xFF) << 8) + ((class167.field3206[4] & 0xFF) << 16);
                            if (arg0 == var13 && var10 == var15 && this.field1712 == var14) {
                                if (var12 >= 0 && this.field1711.method1268(arg1 - 21946) / 520L >= (long) var12) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg4 - var11;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field1711.method1268(4982) + 519L) / 520L);
                        arg2 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class167.field3206[0] = (byte) (arg0 >> 8);
                    class167.field3206[2] = (byte) (var10 >> 8);
                    class167.field3206[7] = (byte) this.field1712;
                    class167.field3206[1] = (byte) arg0;
                    class167.field3206[3] = (byte) var10;
                    if (arg4 - var11 <= 512) {
                        var12 = 0;
                    }
                    class167.field3206[5] = (byte) (var12 >> 8);
                    class167.field3206[4] = (byte) (var12 >> 16);
                    class167.field3206[6] = (byte) var12;
                    this.field1711.method1259((byte) -12, (long) (var8 * 520));
                    var8 = var12;
                    this.field1711.method1267(8, (byte) 9, 0, class167.field3206);
                    this.field1711.method1267(var18, (byte) 125, var11, arg3);
                    var11 += var18;
                    var10++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lsd;I)Z")
    public static final boolean method687(class166 arg0, int arg1) {
        field1714++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class189.field3609; var2++) {
            if (arg0.method1146((byte) -77, class127.field2500[var2])) {
                return true;
            }
        }
        if (arg0.method1146((byte) -94, class41.field728.field2412)) {
            return true;
        } else {
            int var3 = -33 / ((-arg1 - 44) / 32);
            return false;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLff;I)Lsd;")
    public static final class166 method688(byte arg0, class53 arg1, int arg2) {
        field1708++;
        try {
            class166 var3 = new class166();
            var3.field3187 = arg1.method425(-21462);
            int var4 = 25 / ((arg0 - 60) / 49);
            if (var3.field3187 > arg2) {
                var3.field3187 = arg2;
            }
            var3.field3162 = new byte[var3.field3187];
            arg1.field1000 += class127.field2502.method918(true, var3.field3187, arg1.field988, arg1.field1000, 0, var3.field3162);
            return var3;
        } catch (Exception var5) {
            return class154.field2975;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[B")
    public final byte[] method689(int arg0, int arg1) {
        field1709++;
        class189 var3 = this.field1711;
        synchronized (this.field1711) {
            try {
                if (this.field1707.method1268(4982) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field1707.method1259((byte) -48, (long) (arg0 * 6));
                this.field1707.method1265(6, class167.field3206, 0, (byte) 113);
                int var5 = ((arg1 & class167.field3206[0]) << 16) - (-((class167.field3206[1] & 0xFF) << 8) - (class167.field3206[2] & 0xFF));
                int var6 = (class167.field3206[5] & 0xFF) + ((class167.field3206[3] & 0xFF) << 16) + ((class167.field3206[4] & 0xFF) << 8);
                if (var5 < 0 || this.field1703 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field1711.method1268(4982) / 520L) {
                    int var9 = 0;
                    int var10 = 0;
                    byte[] var11 = new byte[var5];
                    while (var5 > var9) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1711.method1259((byte) -54, (long) (var6 * 520));
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1711.method1265(var13 + 8, class167.field3206, 0, (byte) 124);
                        int var14 = ((class167.field3206[2] & 0xFF) << 8) + (class167.field3206[3] & 0xFF);
                        int var15 = ((class167.field3206[0] & 0xFF) << 8) + (class167.field3206[1] & 0xFF);
                        int var16 = class167.field3206[7] & 0xFF;
                        int var17 = (class167.field3206[6] & 0xFF) + ((class167.field3206[5] & 0xFF) << 8) + ((class167.field3206[4] & 0xFF) << 16);
                        if (arg0 == var15 && var10 == var14 && this.field1712 == var16) {
                            if (var17 >= 0 && (long) var17 <= this.field1711.method1268(4982) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var11[var9++] = class167.field3206[var20 + 8];
                                }
                                var10++;
                                var6 = var17;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var11;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Z")
    public static final boolean method690(byte arg0, int arg1) {
        if (arg0 < 52) {
            method688((byte) -107, null, -3);
        }
        field1702++;
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(ILv;Lv;I)V")
    public class86(int arg0, class189 arg1, class189 arg2, int arg3) {
        this.field1711 = arg1;
        this.field1712 = arg0;
        this.field1703 = arg3;
        this.field1707 = arg2;
    }
}
