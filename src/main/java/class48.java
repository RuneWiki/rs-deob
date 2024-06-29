import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class48 {

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lea;")
    private class40 field968 = null;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lea;")
    private class40 field972 = null;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    private int field964 = 65000;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Led;")
    public static class43 field961 = class191.method1219("Bitte versuchen Sie es in ", false);

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Led;")
    public static class43 field966 = class191.method1219("Bitte warten Sie)3)3)3", false);

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Led;")
    private static class43 field975 = class191.method1219("You need a members account to login to this world)3", false);

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Led;")
    public static class43 field976 = class191.method1219("Diese Welt ist voll)3", false);

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Led;")
    public static class43 field971 = class191.method1219("nav", false);

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Led;")
    public static class43 field962 = field975;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Led;")
    public static class43 field970 = class191.method1219("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", false);

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Led;")
    public static class43 field969 = class191.method1219(":trade:", false);

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field978 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Lje;")
    public static class87 field977;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[I")
    public static int[] field967;

    @OriginalMember(owner = "client!f", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field974++;
        return "Cache:" + this.field973;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B[BIIZ)Z")
    private final boolean method297(byte arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field963++;
        class40 var6 = this.field968;
        synchronized (this.field968) {
            try {
                int var8;
                if (arg4) {
                    if ((long) (arg2 * 6 + 6) > this.field972.method217(arg0 ^ 0x1E)) {
                        return false;
                    }
                    this.field972.method226((long) (arg2 * 6), (byte) -105);
                    this.field972.method219(0, 6, class36.field671, 0);
                    var8 = ((class36.field671[3] & 0xFF) << 16) + ((class36.field671[4] & 0xFF) << 8) + (class36.field671[5] & 0xFF);
                    if (var8 <= 0 || this.field968.method217(-1) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field968.method217(-1) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class36.field671[3] = (byte) (var8 >> 16);
                if (arg0 != -31) {
                    this.method300(47, -95, null, 119);
                }
                class36.field671[4] = (byte) (var8 >> 8);
                class36.field671[0] = (byte) (arg3 >> 16);
                class36.field671[2] = (byte) arg3;
                class36.field671[1] = (byte) (arg3 >> 8);
                int var10 = 0;
                class36.field671[5] = (byte) var8;
                this.field972.method226((long) (arg2 * 6), (byte) -105);
                this.field972.method216(6, class36.field671, (byte) 45, 0);
                int var11 = 0;
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg4) {
                        label108: {
                            this.field968.method226((long) (var8 * 520), (byte) -105);
                            try {
                                this.field968.method219(0, 8, class36.field671, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class36.field671[4] & 0xFF) << 16) + (class36.field671[5] << 8 & 0xFF00) + (class36.field671[6] & 0xFF);
                            int var13 = class36.field671[7] & 0xFF;
                            int var14 = ((class36.field671[0] & 0xFF) << 8) + (class36.field671[1] & 0xFF);
                            int var15 = ((class36.field671[2] & 0xFF) << 8) + (class36.field671[3] & 0xFF);
                            if (arg2 == var14 && var11 == var15 && this.field973 == var13) {
                                if (var12 >= 0 && (long) var12 <= this.field968.method217(-1) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field968.method217(arg0 + 30) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (arg3 - var10 <= 512) {
                        var12 = 0;
                    }
                    int var18 = arg3 - var10;
                    class36.field671[2] = (byte) (var11 >> 8);
                    class36.field671[6] = (byte) var12;
                    class36.field671[0] = (byte) (arg2 >> 8);
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class36.field671[3] = (byte) var11;
                    class36.field671[7] = (byte) this.field973;
                    class36.field671[1] = (byte) arg2;
                    class36.field671[4] = (byte) (var12 >> 16);
                    class36.field671[5] = (byte) (var12 >> 8);
                    this.field968.method226((long) (var8 * 520), (byte) -105);
                    this.field968.method216(8, class36.field671, (byte) 45, 0);
                    var8 = var12;
                    var11++;
                    this.field968.method216(var18, arg1, (byte) 45, var10);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)[B")
    public final byte[] method298(int arg0, boolean arg1) {
        field960++;
        class40 var3 = this.field968;
        synchronized (this.field968) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field972.method217(-1)) {
                    return null;
                }
                this.field972.method226((long) (arg0 * 6), (byte) -105);
                this.field972.method219(0, 6, class36.field671, 0);
                int var5 = (class36.field671[2] & 0xFF) + ((class36.field671[0] & 0xFF) << 16) + ((class36.field671[1] & 0xFF) << 8);
                int var6 = ((class36.field671[3] & 0xFF) << 16) + (((class36.field671[4] & 0xFF) << 8) + (class36.field671[5] & 0xFF));
                if (var5 < 0 || var5 > this.field964) {
                    return null;
                } else if (var6 > 0 && this.field968.method217(-1) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    if (arg1) {
                        this.method298(65, true);
                    }
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        int var13 = var5 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field968.method226((long) (var6 * 520), (byte) -105);
                        this.field968.method219(0, var13 + 8, class36.field671, 0);
                        int var14 = ((class36.field671[0] & 0xFF) << 8) + (class36.field671[1] & 0xFF);
                        int var15 = class36.field671[7] & 0xFF;
                        int var16 = ((class36.field671[4] & 0xFF) << 16) + ((class36.field671[5] & 0xFF) << 8) + (class36.field671[6] & 0xFF);
                        int var17 = ((class36.field671[2] & 0xFF) << 8) + (class36.field671[3] & 0xFF);
                        if (arg0 == var14 && var10 == var17 && this.field973 == var15) {
                            if (var16 >= 0 && (long) var16 <= this.field968.method217(-1) / 520L) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var11++] = class36.field671[var20 + 8];
                                }
                                var10++;
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

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljg;Led;I)I")
    public static final int method299(class89 arg0, class43 arg1, int arg2) {
        field980++;
        int var3 = arg0.field1727;
        arg0.method564(arg1.field818, -1);
        arg0.field1727 += class143.field2946.method927(arg1.field844, arg0.field1769, 111, arg0.field1727, arg1.field818, arg2);
        return arg0.field1727 - var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II[BI)Z")
    public final boolean method300(int arg0, int arg1, byte[] arg2, int arg3) {
        field979++;
        class40 var5 = this.field968;
        synchronized (this.field968) {
            if (arg0 != 3) {
                method301(-17);
            }
            if (arg1 < 0 || this.field964 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method297((byte) -31, arg2, arg3, arg1, true);
            if (!var6) {
                var6 = this.method297((byte) -31, arg2, arg3, arg1, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method301(int arg0) {
        field977 = null;
        field961 = null;
        field976 = null;
        field962 = null;
        if (arg0 != 65000) {
            field976 = null;
        }
        field975 = null;
        field966 = null;
        field969 = null;
        field971 = null;
        field967 = null;
        field970 = null;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILea;Lea;I)V")
    public class48(int arg0, class40 arg1, class40 arg2, int arg3) {
        this.field968 = arg1;
        this.field973 = arg0;
        this.field964 = arg3;
        this.field972 = arg2;
    }
}
