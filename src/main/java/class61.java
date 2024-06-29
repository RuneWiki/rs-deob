import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class61 {

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    private int field969 = 65000;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lbb;")
    private class13 field970 = null;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Lbb;")
    private class13 field976 = null;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "[S")
    public static short[] field968 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "[J")
    public static long[] field978 = new long[100];

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lnd;")
    public static class122 field972 = new class122();

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Lkb;")
    public static class93 field981 = class76.method390("sich mit einer anderen Welt zu verbinden)3", 0);

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Lkb;")
    public static class93 field980 = class76.method390("http:)4)4www)3runescape)3com", 0);

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field982 = 0;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lme;")
    public static class114 field974;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lsd;")
    public static class167 field967;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZII[B)Z")
    private final boolean method315(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        field975++;
        class13 var6 = this.field970;
        synchronized (this.field970) {
            try {
                int var7;
                if (arg1) {
                    if (this.field976.method66(-127) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field976.method76((long) (arg2 * 6), (byte) 111);
                    this.field976.method71(0, class110.field1976, 7888, 6);
                    var7 = ((class110.field1976[4] & 0xFF) << 8) + (class110.field1976[3] << 16 & 0xFF0000) + (class110.field1976[5] & 0xFF);
                    if (var7 <= 0 || this.field970.method66(-5) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field970.method66(101) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class110.field1976[5] = (byte) var7;
                if (arg0 <= 102) {
                    this.field969 = -26;
                }
                class110.field1976[1] = (byte) (arg3 >> 8);
                class110.field1976[4] = (byte) (var7 >> 8);
                class110.field1976[3] = (byte) (var7 >> 16);
                int var10 = 0;
                class110.field1976[2] = (byte) arg3;
                int var11 = 0;
                class110.field1976[0] = (byte) (arg3 >> 16);
                this.field976.method76((long) (arg2 * 6), (byte) 73);
                this.field976.method68(6, false, 0, class110.field1976);
                while (var11 < arg3) {
                    int var12 = 0;
                    if (arg1) {
                        label108: {
                            this.field970.method76((long) (var7 * 520), (byte) 89);
                            try {
                                this.field970.method71(0, class110.field1976, 7888, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class110.field1976[6] & 0xFF) + ((class110.field1976[5] & 0xFF) << 8) + ((class110.field1976[4] & 0xFF) << 16);
                            int var13 = ((class110.field1976[2] & 0xFF) << 8) + (class110.field1976[3] & 0xFF);
                            int var14 = ((class110.field1976[0] & 0xFF) << 8) + (class110.field1976[1] & 0xFF);
                            int var15 = class110.field1976[7] & 0xFF;
                            if (arg2 == var14 && var10 == var13 && this.field977 == var15) {
                                if (var12 >= 0 && this.field970.method66(-2) / 520L >= (long) var12) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field970.method66(90) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        arg1 = false;
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class110.field1976[7] = (byte) this.field977;
                    class110.field1976[1] = (byte) arg2;
                    class110.field1976[0] = (byte) (arg2 >> 8);
                    class110.field1976[2] = (byte) (var10 >> 8);
                    class110.field1976[3] = (byte) var10;
                    var10++;
                    if (arg3 - var11 <= 512) {
                        var12 = 0;
                    }
                    class110.field1976[6] = (byte) var12;
                    class110.field1976[5] = (byte) (var12 >> 8);
                    int var18 = arg3 - var11;
                    class110.field1976[4] = (byte) (var12 >> 16);
                    this.field970.method76((long) (var7 * 520), (byte) 68);
                    var7 = var12;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field970.method68(8, false, 0, class110.field1976);
                    this.field970.method68(var18, false, var11, arg4);
                    var11 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)Z")
    public static final boolean method316(int arg0, byte arg1, int arg2) {
        field973++;
        if (arg1 > -49) {
            method321(false);
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class81 var3 = class154.method990(arg0, true);
        return var3.method405(1, arg2);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjg;)V")
    public static final void method317(int arg0, class89 arg1) {
        class170.field3377 = arg1;
        field971++;
        if (arg0 <= 7) {
            field974 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([BBII)Z")
    public final boolean method318(byte[] arg0, byte arg1, int arg2, int arg3) {
        field964++;
        class13 var5 = this.field970;
        synchronized (this.field970) {
            if (arg2 < 0 || this.field969 < arg2) {
                throw new IllegalArgumentException();
            }
            if (arg1 > -44) {
                this.method315(-70, true, -118, 91, null);
            }
            boolean var6 = this.method315(118, true, arg3, arg2, arg0);
            if (!var6) {
                var6 = this.method315(106, false, arg3, arg2, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static final void method319(boolean arg0) {
        field966++;
        int var1 = 0;
        if (arg0) {
            return;
        }
        while (var1 < class124.field2313) {
            int var2 = class14.field243[var1];
            class34 var3 = class206.field4035[var2];
            int var4 = class59.field942.method1054(128);
            if ((var4 & 0x2) != 0) {
                var4 += class59.field942.method1054(128) << 8;
            }
            class108.method591(2, var2, var3, var4);
            var1++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)[B")
    public final byte[] method320(byte arg0, int arg1) {
        field979++;
        class13 var3 = this.field970;
        synchronized (this.field970) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field976.method66(43)) {
                    return null;
                }
                this.field976.method76((long) (arg1 * 6), (byte) 34);
                this.field976.method71(0, class110.field1976, 7888, 6);
                int var5 = (class110.field1976[2] & 0xFF) + ((class110.field1976[1] & 0xFF) << 8) + ((class110.field1976[0] & 0xFF) << 16);
                int var6 = ((class110.field1976[3] & 0xFF) << 16) + ((class110.field1976[4] & 0xFF) << 8) + (class110.field1976[5] & 0xFF);
                if (var5 < 0 || var5 > this.field969) {
                    return null;
                } else if (var6 > 0 && this.field970.method66(99) / 520L >= (long) var6) {
                    if (arg0 < 76) {
                        this.field976 = null;
                    }
                    int var9 = 0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    label74: while (var5 > var9) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field970.method76((long) (var6 * 520), (byte) 53);
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field970.method71(0, class110.field1976, 7888, var13 + 8);
                        int var14 = class110.field1976[7] & 0xFF;
                        int var15 = ((class110.field1976[0] & 0xFF) << 8) + (class110.field1976[1] & 0xFF);
                        int var16 = ((class110.field1976[2] & 0xFF) << 8) + (class110.field1976[3] & 0xFF);
                        int var17 = ((class110.field1976[4] & 0xFF) << 16) + (class110.field1976[5] << 8 & 0xFF00) + (class110.field1976[6] & 0xFF);
                        if (arg1 == var15 && var11 == var16 && this.field977 == var14) {
                            if (var17 >= 0 && this.field970.method66(-125) / 520L >= (long) var17) {
                                var6 = var17;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label74;
                                    }
                                    var10[var9++] = class110.field1976[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
    public static void method321(boolean arg0) {
        field967 = null;
        field978 = null;
        field972 = null;
        field981 = null;
        field980 = null;
        field968 = null;
        if (!arg0) {
            method321(false);
        }
        field974 = null;
    }

    @OriginalMember(owner = "client!ge", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field965++;
        return "Cache:" + this.field977;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ILbb;Lbb;I)V")
    public class61(int arg0, class13 arg1, class13 arg2, int arg3) {
        this.field970 = arg1;
        this.field977 = arg0;
        this.field976 = arg2;
        this.field969 = arg3;
    }
}
