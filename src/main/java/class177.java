import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class177 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lhh;")
    private class294 field2826 = null;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    private int field2824 = 65000;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Lhh;")
    private class294 field2838 = null;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    private int field2823;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lmh;")
    public static class62 field2829 = class201.method1405(true, "Weiter");

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lmh;")
    private static class62 field2836 = class201.method1405(true, "Please wait)3)3)3");

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lmh;")
    public static class62 field2832 = field2836;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lmh;")
    private static class62 field2835 = class201.method1405(true, "Created gameworld");

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Lmh;")
    public static class62 field2840 = class201.method1405(true, "Fertigkeit)2");

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lmh;")
    public static class62 field2833 = field2835;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lwj;")
    public static class135 field2828;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lhi;")
    public static class26 field2839;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "[[[I")
    public static int[][][] field2841;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[BIZB)Z", line = 10)
    private final boolean method1243(int arg0, byte[] arg1, int arg2, boolean arg3, byte arg4) {
        field2825++;
        class294 var6 = this.field2838;
        synchronized (this.field2838) {
            try {
                int var7;
                boolean var10000;
                if (arg3) {
                    if (((long) (arg0 * 6 + 6)) > this.field2826.method1992(-2)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2826.method1996((long) (arg0 * 6), 63);
                    this.field2826.method1990((byte) -128, class24.field268, 0, 6);
                    var7 = (class24.field268[5] & 0xFF) + ((class24.field268[3] & 0xFF) << 16) + (class24.field268[4] & 0xFF << 8);
                    if (var7 <= 0 || (long) var7 > this.field2838.method1992(-2) / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field2838.method1992(-2) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class24.field268[0] = (byte) (arg2 >> 16);
                class24.field268[4] = (byte) (var7 >> 8);
                class24.field268[5] = (byte) var7;
                class24.field268[1] = (byte) (arg2 >> 8);
                class24.field268[2] = (byte) arg2;
                int var8 = 0;
                class24.field268[3] = (byte) (var7 >> 16);
                if (arg4 <= 42) {
                    this.method1243(-67, (byte[]) null, -92, true, (byte) 82);
                }
                this.field2826.method1996((long) (arg0 * 6), 100);
                int var9 = 0;
                this.field2826.method1994(class24.field268, 0, 6, (byte) 109);
                while (true) {
                    if (var8 < arg2) {
                        label142: {
                            int var10 = 0;
                            if (arg3) {
                                this.field2838.method1996((long) (var7 * 520), 122);
                                try {
                                    this.field2838.method1990((byte) 64, class24.field268, 0, 8);
                                } catch (EOFException var18) {
                                    break label142;
                                }
                                int var12 = (class24.field268[0] & 0xFF << 8) + (class24.field268[1] & 0xFF);
                                int var13 = class24.field268[7] & 0xFF;
                                var10 = (class24.field268[6] & 0xFF) + ((class24.field268[5] & 0xFF) << 8) + (class24.field268[4] & 0xFF << 16);
                                int var14 = ((class24.field268[2] & 0xFF) << 8) + (class24.field268[3] & 0xFF);
                                if (arg0 != var12 || var9 != var14 || this.field2823 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || ((long) var10) > (this.field2838.method1992(-2) / 520L)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field2838.method1992(-2) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                arg3 = false;
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class24.field268[0] = (byte) (arg0 >> 8);
                            class24.field268[3] = (byte) var9;
                            class24.field268[2] = (byte) (var9 >> 8);
                            class24.field268[7] = (byte) this.field2823;
                            if (arg2 - var8 <= 512) {
                                var10 = 0;
                            }
                            class24.field268[6] = (byte) var10;
                            class24.field268[5] = (byte) (var10 >> 8);
                            int var15 = arg2 - var8;
                            class24.field268[4] = (byte) (var10 >> 16);
                            class24.field268[1] = (byte) arg0;
                            this.field2838.method1996((long) (var7 * 520), 91);
                            this.field2838.method1994(class24.field268, 0, 8, (byte) 98);
                            var7 = var10;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            this.field2838.method1994(arg1, var8, var15, (byte) 82);
                            var9++;
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 139)
    public static void method1244(byte arg0) {
        field2839 = null;
        field2832 = null;
        field2841 = (int[][][]) null;
        field2840 = null;
        field2829 = null;
        field2828 = null;
        field2833 = null;
        field2836 = null;
        field2835 = null;
        if (arg0 != -127) {
            field2828 = (class135) null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(ILhh;Lhh;I)V", line = 398)
    public class177(int arg0, class294 arg1, class294 arg2, int arg3) {
        this.field2838 = arg1;
        this.field2824 = arg3;
        this.field2823 = arg0;
        this.field2826 = arg2;
    }

    @OriginalMember(owner = "client!pb", name = "toString", descriptor = "()Ljava/lang/String;", line = 171)
    public final String toString() {
        field2827++;
        return "Cache:" + this.field2823;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BIII)Z", line = 179)
    public final boolean method1245(byte[] arg0, int arg1, int arg2, int arg3) {
        field2837++;
        class294 var5 = this.field2838;
        synchronized (this.field2838) {
            if (arg2 < 0 || this.field2824 < arg2) {
                throw new IllegalArgumentException();
            }
            int var6 = -73 / ((arg3 + 60) / 48);
            boolean var7 = this.method1243(arg1, arg0, arg2, true, (byte) 99);
            if (!var7) {
                var7 = this.method1243(arg1, arg0, arg2, false, (byte) 69);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 206)
    public static final void method1246(boolean arg0) {
        class261.field4393++;
        class170.field2772.method1693(173, false);
        field2830++;
        class170.field2772.method694(0L, (byte) -34);
        if (!arg0) {
            method1246(false);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V", line = 233)
    public static final void method1247(byte arg0) {
        for (int var1 = -1; var1 < class118.field1975; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class98.field1617[var1];
            }
            class153 var3 = class5.field50[var2];
            if (var3 != null && var3.field3844 > 0) {
                var3.field3844--;
                if (var3.field3844 == 0) {
                    var3.field3869 = null;
                }
            }
        }
        field2834++;
        for (int var4 = 0; var4 < class133.field2163; var4++) {
            int var5 = class288.field4914[var4];
            class204 var6 = class301.field5186[var5];
            if (var6 != null && var6.field3844 > 0) {
                var6.field3844--;
                if (var6.field3844 == 0) {
                    var6.field3869 = null;
                }
            }
        }
        if (arg0 < 22) {
            method1246(true);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)[B", line = 289)
    public final byte[] method1248(int arg0, byte arg1) {
        field2831++;
        class294 var3 = this.field2838;
        synchronized (this.field2838) {
            try {
                Object var10000;
                if ((long) (arg0 * 6 + 6) > this.field2826.method1992(arg1 - 19)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2826.method1996((long) (arg0 * 6), arg1 + 57);
                this.field2826.method1990((byte) 62, class24.field268, 0, 6);
                int var4 = ((class24.field268[0] & 0xFF) << 16) + (class24.field268[1] & 0xFF << 8) + (class24.field268[2] & 0xFF);
                int var5 = (class24.field268[5] & 0xFF) + (((class24.field268[3] & 0xFF) << 16) + ((class24.field268[4] & 0xFF) << 8));
                if (var4 < 0 || this.field2824 < var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || (long) var5 > this.field2838.method1992(-2) / 520L) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    if (arg1 != 17) {
                        field2833 = (class62) null;
                    }
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    int var8 = 0;
                    while (var4 > var7) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2838.method1996((long) (var5 * 520), 75);
                        int var9 = var4 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field2838.method1990((byte) -124, class24.field268, 0, var9 + 8);
                        int var10 = (class24.field268[0] & 0xFF << 8) + (class24.field268[1] & 0xFF);
                        int var11 = (class24.field268[2] & 0xFF << 8) + (class24.field268[3] & 0xFF);
                        int var12 = (class24.field268[5] & 0xFF << 8) + ((class24.field268[4] & 0xFF) << 16) + (class24.field268[6] & 0xFF);
                        int var13 = class24.field268[7] & 0xFF;
                        if (arg0 != var10 || var8 != var11 || this.field2823 != var13) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var12 < 0 || this.field2838.method1992(-2) / 520L < (long) var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var8++;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var7++] = class24.field268[var14 + 8];
                        }
                        var5 = var12;
                    }
                    byte[] var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }
}
