import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class15 {

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    private int field271 = 65000;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Ld;")
    private class19 field264 = null;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Ld;")
    private class19 field266 = null;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
    public static int[] field262 = new int[99];

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
    public static int[] field261 = new int[50];

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lo;")
    public static class84 field265 = method124("Enter name of player to delete from list", 255);

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field274 = 0;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Lo;")
    public static class84 field277 = method124(" @yel@", 255);

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "[Lo;")
    public static class84[] field283;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "Lvb;")
    public static class121 field282;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "[Lvb;")
    public static class121[] field276;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field262[var1] = var0 / 4;
        }
        field280 = 0;
        field281 = 0;
        field283 = new class84[5];
    }

    @OriginalMember(owner = "client!cb", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field263++;
        return "Cache:" + this.field267;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 17)
    public static void method121(int arg0) {
        field265 = null;
        field262 = null;
        if (arg0 != 6) {
            return;
        }
        field261 = null;
        field283 = null;
        field276 = null;
        field277 = null;
        field282 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 48)
    public static final void method122(int arg0) {
        field268++;
        int var1 = -50 / ((arg0 - 54) / 40);
        for (class41 var2 = (class41) class111.field2404.method695((byte) -112); var2 != null; var2 = (class41) class111.field2404.method702(0)) {
            if (var2.field840 == -1) {
                var2.field841 = 0;
                class5.method23(var2, 1196625736);
            } else {
                var2.method333(0);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/awt/Component;Lbb;)V", line = 72)
    public static final void method123(int arg0, Component arg1, class9 arg2) {
        field260++;
        try {
            class47 var3 = (class47) Class.forName("ha").getDeclaredConstructor().newInstance();
            var3.method408(arg2, 2048);
            class97.field2071 = var3;
            if (arg0 > -5) {
                field281 = -16;
            }
        } catch (Throwable var6) {
            try {
                class97.field2071 = new class77(arg2, arg1);
            } catch (Throwable var5) {
                if (class9.field183.toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        class97.field2071 = new class124();
                        return;
                    } catch (Throwable var4) {
                    }
                }
                class97.field2071 = new class128(8000);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;I)Lo;", line = 118)
    public static final class84 method124(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        field275++;
        int var3 = var2.length;
        class84 var4 = new class84();
        var4.field1869 = new byte[var3];
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field1869[var4.field1906++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else {
                var4.field1869[var4.field1906++] = (byte) var6;
            }
        }
        if (arg1 != 255) {
            field261 = null;
        }
        var4.method653((byte) 113);
        return var4.method635(-54);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(ILd;Ld;I)V", line = 356)
    public class15(int arg0, class19 arg1, class19 arg2, int arg3) {
        this.field271 = arg3;
        this.field264 = arg2;
        this.field267 = arg0;
        this.field266 = arg1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ[BII)Z", line = 166)
    private final boolean method125(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4) {
        field278++;
        class19 var6 = this.field266;
        synchronized (this.field266) {
            try {
                if (arg3 != 22054) {
                    method121(103);
                }
                int var7;
                if (arg1) {
                    if (this.field264.method161(52) < (long) (arg4 * 6 + 6)) {
                        return false;
                    }
                    this.field264.method156((long) (arg4 * 6), -22121);
                    this.field264.method160(27487, 0, 6, class105.field2218);
                    var7 = (class105.field2218[5] & 0xFF) + (((class105.field2218[3] & 0xFF) << 16) + ((class105.field2218[4] & 0xFF) << 8));
                    if (var7 <= 0 || this.field266.method161(arg3 - 21996) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field266.method161(98) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class105.field2218[0] = (byte) (arg0 >> 16);
                int var10 = 0;
                int var11 = 0;
                class105.field2218[1] = (byte) (arg0 >> 8);
                class105.field2218[2] = (byte) arg0;
                class105.field2218[3] = (byte) (var7 >> 16);
                class105.field2218[4] = (byte) (var7 >> 8);
                class105.field2218[5] = (byte) var7;
                this.field264.method156((long) (arg4 * 6), arg3 ^ 0xFFFFFFB1);
                this.field264.method158(class105.field2218, 6, 0, 102);
                while (var10 < arg0) {
                    int var12 = 0;
                    if (arg1) {
                        label109: {
                            this.field266.method156((long) (var7 * 520), -22121);
                            try {
                                this.field266.method160(27487, 0, 8, class105.field2218);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class105.field2218[4] & 0xFF) << 16) + (class105.field2218[6] & 0xFF) + ((class105.field2218[5] & 0xFF) << 8);
                            int var13 = ((class105.field2218[0] & 0xFF) << 8) + (class105.field2218[1] & 0xFF);
                            int var14 = class105.field2218[7] & 0xFF;
                            int var15 = ((class105.field2218[2] & 0xFF) << 8) + (class105.field2218[3] & 0xFF);
                            if (arg4 == var13 && var11 == var15 && this.field267 == var14) {
                                if (var12 >= 0 && this.field266.method161(118) / 520L >= (long) var12) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg1 = false;
                        var12 = (int) ((this.field266.method161(100) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class105.field2218[0] = (byte) (arg4 >> 8);
                    class105.field2218[1] = (byte) arg4;
                    class105.field2218[2] = (byte) (var11 >> 8);
                    class105.field2218[3] = (byte) var11;
                    var11++;
                    if (arg0 - var10 <= 512) {
                        var12 = 0;
                    }
                    int var18 = arg0 - var10;
                    class105.field2218[4] = (byte) (var12 >> 16);
                    class105.field2218[5] = (byte) (var12 >> 8);
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class105.field2218[6] = (byte) var12;
                    class105.field2218[7] = (byte) this.field267;
                    this.field266.method156((long) (var7 * 520), -22121);
                    var7 = var12;
                    this.field266.method158(class105.field2218, 8, 0, 105);
                    this.field266.method158(arg2, var18, var10, 23);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[BZ)Z", line = 285)
    public final boolean method126(int arg0, int arg1, byte[] arg2, boolean arg3) {
        field272++;
        class19 var5 = this.field266;
        synchronized (this.field266) {
            if (arg3) {
                return false;
            } else if (arg0 >= 0 && this.field271 >= arg0) {
                boolean var7 = this.method125(arg0, true, arg2, 22054, arg1);
                if (!var7) {
                    var7 = this.method125(arg0, false, arg2, 22054, arg1);
                }
                return var7;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILud;IB)Lfc;", line = 340)
    public static final class34 method127(int arg0, class118 arg1, int arg2, byte arg3) {
        field273++;
        int var4 = 16 / ((arg3 + 49) / 57);
        return class111.method863(arg2, -29446, arg1, arg0) ? class26.method201(121) : null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[B", line = 394)
    public final byte[] method128(int arg0, int arg1) {
        field269++;
        class19 var3 = this.field266;
        synchronized (this.field266) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field264.method161(122)) {
                    return null;
                }
                this.field264.method156((long) (arg0 * 6), -22121);
                if (arg1 <= 72) {
                    field282 = null;
                }
                this.field264.method160(27487, 0, 6, class105.field2218);
                int var5 = ((class105.field2218[0] & 0xFF) << 16) - (-((class105.field2218[1] & 0xFF) << 8) - (class105.field2218[2] & 0xFF));
                int var6 = ((class105.field2218[4] & 0xFF) << 8) + (class105.field2218[3] << 16 & 0xFF0000) + (class105.field2218[5] & 0xFF);
                if (var5 < 0 || var5 > this.field271) {
                    return null;
                } else if (var6 > 0 && this.field266.method161(89) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        int var13 = var5 - var11;
                        this.field266.method156((long) (var6 * 520), -22121);
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field266.method160(27487, 0, var13 + 8, class105.field2218);
                        int var14 = ((class105.field2218[4] & 0xFF) << 16) + (class105.field2218[6] & 0xFF) + ((class105.field2218[5] & 0xFF) << 8);
                        int var15 = ((class105.field2218[2] & 0xFF) << 8) + (class105.field2218[3] & 0xFF);
                        int var16 = class105.field2218[7] & 0xFF;
                        int var17 = ((class105.field2218[0] & 0xFF) << 8) + (class105.field2218[1] & 0xFF);
                        if (arg0 == var17 && var10 == var15 && this.field267 == var16) {
                            if (var14 >= 0 && this.field266.method161(63) / 520L >= (long) var14) {
                                var10++;
                                var6 = var14;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label72;
                                    }
                                    var9[var11++] = class105.field2218[var20 + 8];
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
}
