import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class176 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    private int field2869 = 65000;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lao;")
    private class194 field2873 = null;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lao;")
    private class194 field2880 = null;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    private int field2878;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lol;")
    public static class246 field2870 = new class246(8);

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2872 = 500;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2874 = "shake:";

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field2875 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "[[[Li;")
    public static class230[][][] field2879;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[BI)Z", line = 7)
    public final boolean method1232(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 <= 122) {
            this.field2869 = 17;
        }
        field2881++;
        class194 var5 = this.field2873;
        synchronized (this.field2873) {
            if (arg3 < 0 || this.field2869 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1233(arg0, arg2, arg3, true, -17118);
            if (!var6) {
                var6 = this.method1233(arg0, arg2, arg3, false, -17118);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BIZI)Z", line = 33)
    private final boolean method1233(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        field2877++;
        class194 var6 = this.field2873;
        synchronized (this.field2873) {
            try {
                int var7;
                boolean var10000;
                if (arg3) {
                    if ((long) (arg0 * 6 + 6) > this.field2880.method1427(-8962)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2880.method1420((long) (arg0 * 6), arg4 ^ 0x42B4);
                    this.field2880.method1419(6, -125, class79.field1183, 0);
                    var7 = (class79.field1183[5] & 0xFF) + (class79.field1183[4] & 0xFF << 8) + (class79.field1183[3] & 0xFF << 16);
                    if (var7 <= 0 || (long) var7 > this.field2873.method1427(-8962) / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field2873.method1427(arg4 + 8156) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class79.field1183[1] = (byte) (arg2 >> 8);
                if (arg4 != -17118) {
                    this.toString();
                }
                class79.field1183[2] = (byte) arg2;
                class79.field1183[4] = (byte) (var7 >> 8);
                class79.field1183[0] = (byte) (arg2 >> 16);
                class79.field1183[5] = (byte) var7;
                class79.field1183[3] = (byte) (var7 >> 16);
                int var8 = 0;
                this.field2880.method1420((long) (arg0 * 6), -89);
                this.field2880.method1416(108, class79.field1183, 0, 6);
                int var9 = 0;
                while (true) {
                    if (var8 < arg2) {
                        label144: {
                            int var10 = 0;
                            if (arg3) {
                                this.field2873.method1420((long) (var7 * 520), -94);
                                try {
                                    this.field2873.method1419(8, -123, class79.field1183, 0);
                                } catch (EOFException var18) {
                                    break label144;
                                }
                                var10 = (class79.field1183[6] & 0xFF) + ((class79.field1183[4] & 0xFF << 16) + (class79.field1183[5] & 0xFF << 8));
                                int var12 = (class79.field1183[0] & 0xFF << 8) + (class79.field1183[1] & 0xFF);
                                int var13 = (class79.field1183[2] & 0xFF << 8) + (class79.field1183[3] & 0xFF);
                                int var14 = class79.field1183[7] & 0xFF;
                                if (arg0 != var12 || var9 != var13 || this.field2878 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (this.field2873.method1427(-8962) / 520L) < ((long) var10)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field2873.method1427(-8962) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                                arg3 = false;
                            }
                            class79.field1183[0] = (byte) (arg0 >> 8);
                            class79.field1183[2] = (byte) (var9 >> 8);
                            if (arg2 - var8 <= 512) {
                                var10 = 0;
                            }
                            class79.field1183[4] = (byte) (var10 >> 16);
                            class79.field1183[3] = (byte) var9;
                            class79.field1183[7] = (byte) this.field2878;
                            class79.field1183[1] = (byte) arg0;
                            class79.field1183[6] = (byte) var10;
                            int var15 = arg2 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class79.field1183[5] = (byte) (var10 >> 8);
                            this.field2873.method1420((long) (var7 * 520), -128);
                            var7 = var10;
                            this.field2873.method1416(122, class79.field1183, 0, 8);
                            var9++;
                            this.field2873.method1416(126, arg1, var8, var15);
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

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[B", line = 155)
    public final byte[] method1234(int arg0, int arg1) {
        field2867++;
        class194 var3 = this.field2873;
        synchronized (this.field2873) {
            try {
                Object var10000;
                if ((long) (arg0 * 6 + 6) > this.field2880.method1427(-8962)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2880.method1420((long) (arg0 * 6), arg1 ^ 0xBC708E37);
                this.field2880.method1419(6, arg1 ^ 0xBC708E31, class79.field1183, 0);
                int var4 = ((class79.field1183[0] & 0xFF) << 16) + (class79.field1183[1] & 0xFF << 8) + (class79.field1183[2] & 0xFF);
                int var5 = ((class79.field1183[3] & 0xFF) << 16) + (class79.field1183[4] & 0xFF << 8) + (class79.field1183[5] & 0xFF);
                if (var4 < 0 || var4 > this.field2869) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                byte[] var19;
                if (arg1 != 1133474224) {
                    var19 = (byte[]) null;
                    return var19;
                } else if (var5 <= 0 || ((long) var5) > (this.field2873.method1427(-8962) / 520L)) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    int var8 = 0;
                    while (var7 < var4) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2873.method1420((long) (var5 * 520), arg1 - 1133474341);
                        int var9 = var4 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field2873.method1419(var9 + 8, -128, class79.field1183, 0);
                        int var10 = class79.field1183[7] & 0xFF;
                        int var11 = ((class79.field1183[2] & 0xFF) << 8) + (class79.field1183[3] & 0xFF);
                        int var12 = (class79.field1183[6] & 0xFF) + ((class79.field1183[5] & 0xFF) << 8) + (class79.field1183[4] & 0xFF << 16);
                        int var13 = (class79.field1183[0] & 0xFF << 8) + (class79.field1183[1] & 0xFF);
                        if (arg0 == var13 && var8 == var11 && this.field2878 == var10) {
                            if (var12 >= 0 && this.field2873.method1427(-8962) / 520L >= (long) var12) {
                                var8++;
                                for (int var14 = 0; var14 < var9; var14++) {
                                    var6[var7++] = class79.field1183[var14 + 8];
                                }
                                var5 = var12;
                                continue;
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 236)
    public static void method1235(int arg0) {
        field2870 = null;
        field2874 = null;
        if (arg0 != -14) {
            method1235(-72);
        }
        field2879 = (class230[][][]) null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 248)
    public static final String method1236(int arg0, byte arg1) {
        field2868++;
        if (arg1 != 10) {
            method1236(7, (byte) -69);
        }
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF9B1B) >> 16) + "." + ((arg0 & 0xFFFE) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(ILao;Lao;I)V", line = 342)
    public class176(int arg0, class194 arg1, class194 arg2, int arg3) {
        this.field2869 = arg3;
        this.field2880 = arg2;
        this.field2878 = arg0;
        this.field2873 = arg1;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V", line = 280)
    public static final void method1237(int arg0) {
        if (class274.field4345 != null) {
            class21 var1 = new class21();
            for (int var2 = 0; var2 < 13; var2++) {
                for (int var3 = 0; var3 < 13; var3++) {
                    class274.field4345[var2][var3] = var1;
                }
            }
        }
        if (arg0 != 22989) {
            method1237(-89);
        }
        field2876++;
    }

    @OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;", line = 320)
    public final String toString() {
        field2871++;
        return "Cache:" + this.field2878;
    }
}
