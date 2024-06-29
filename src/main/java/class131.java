import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class131 {

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Ldg;")
    private class307 field2152 = null;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    private int field2157 = 65000;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "Ldg;")
    private class307 field2158 = null;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    private int field2164;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Z")
    public static boolean field2154 = false;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lve;")
    public static class255 field2153 = class87.method607(108, "zap");

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "[J")
    public static long[] field2161 = new long[500];

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2155 = 1;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field2169 = 2;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "Lrg;")
    public static class88 field2166;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "[I")
    public static int[] field2167;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZI[B)Z", line = 11)
    private final boolean method964(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field2163++;
        class307 var6 = this.field2152;
        synchronized (this.field2152) {
            try {
                boolean var10000;
                if (arg1 != -513) {
                    var10000 = false;
                    return var10000;
                }
                int var7;
                if (arg2) {
                    if (this.field2158.method2131((byte) -58) < ((long) (arg3 * 6 + 6))) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2158.method2130((long) (arg3 * 6), true);
                    this.field2158.method2134(6, 0, class168.field2821, true);
                    var7 = ((class168.field2821[3] & 0xFF) << 16) + (class168.field2821[4] & 0xFF << 8) + (class168.field2821[5] & 0xFF);
                    if (var7 <= 0 || this.field2152.method2131((byte) -46) / 520L < (long) var7) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field2152.method2131((byte) -27) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class168.field2821[0] = (byte) (arg0 >> 16);
                class168.field2821[5] = (byte) var7;
                class168.field2821[4] = (byte) (var7 >> 8);
                class168.field2821[3] = (byte) (var7 >> 16);
                class168.field2821[1] = (byte) (arg0 >> 8);
                int var8 = 0;
                class168.field2821[2] = (byte) arg0;
                int var9 = 0;
                this.field2158.method2130((long) (arg3 * 6), true);
                this.field2158.method2129(0, arg1 ^ 0x200, 6, class168.field2821);
                while (true) {
                    if (var8 < arg0) {
                        label147: {
                            int var10 = 0;
                            if (arg2) {
                                this.field2152.method2130((long) (var7 * 520), true);
                                try {
                                    this.field2152.method2134(8, 0, class168.field2821, true);
                                } catch (EOFException var18) {
                                    break label147;
                                }
                                var10 = (class168.field2821[4] & 0xFF << 16) + ((class168.field2821[5] & 0xFF << 8) + (class168.field2821[6] & 0xFF));
                                int var12 = ((class168.field2821[2] & 0xFF) << 8) + (class168.field2821[3] & 0xFF);
                                int var13 = class168.field2821[7] & 0xFF;
                                int var14 = ((class168.field2821[0] & 0xFF) << 8) + (class168.field2821[1] & 0xFF);
                                if (arg3 != var14 || var9 != var12 || this.field2164 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (long) var10 > this.field2152.method2131((byte) -48) / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field2152.method2131((byte) -24) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                                arg2 = false;
                            }
                            class168.field2821[7] = (byte) this.field2164;
                            class168.field2821[1] = (byte) arg3;
                            class168.field2821[3] = (byte) var9;
                            if ((arg0 - var8) <= 512) {
                                var10 = 0;
                            }
                            int var15 = arg0 - var8;
                            class168.field2821[0] = (byte) (arg3 >> 8);
                            class168.field2821[6] = (byte) var10;
                            class168.field2821[4] = (byte) (var10 >> 16);
                            class168.field2821[2] = (byte) (var9 >> 8);
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            var9++;
                            class168.field2821[5] = (byte) (var10 >> 8);
                            this.field2152.method2130((long) (var7 * 520), true);
                            var7 = var10;
                            this.field2152.method2129(0, arg1 ^ 0x200, 8, class168.field2821);
                            this.field2152.method2129(var8, -1, var15, arg4);
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

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 131)
    public static final void method965(byte arg0) {
        field2168++;
        for (int var1 = -1; var1 < class309.field5269; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class259.field4398[var1];
            }
            class242 var3 = class151.field2555[var2];
            if (var3 != null && var3.field5168 > 0) {
                var3.field5168--;
                if (var3.field5168 == 0) {
                    var3.field5132 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class282.field4858; var4++) {
            int var5 = class84.field1356[var4];
            class186 var6 = class82.field1334[var5];
            if (var6 != null && var6.field5168 > 0) {
                var6.field5168--;
                if (var6.field5168 == 0) {
                    var6.field5132 = null;
                }
            }
        }
        if (arg0 <= 97) {
            field2169 = -84;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;", line = 197)
    public static final String method966(Throwable arg0, boolean arg1) throws IOException {
        String var2;
        if ((arg0 instanceof class43)) {
            class43 var3 = (class43) arg0;
            var2 = var3.field669 + " | ";
            arg0 = var3.field668;
        } else {
            var2 = "";
        }
        field2159++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (!arg1) {
            method967((byte) 57, -99, -67, (Object[]) null, (long[]) null);
        }
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BII[Ljava/lang/Object;[J)V", line = 271)
    public static final void method967(byte arg0, int arg1, int arg2, Object[] arg3, long[] arg4) {
        if (arg0 >= -83) {
            field2170 = -44;
        }
        field2171++;
        if (arg2 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg1;
        long var7 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var7;
        Object var9 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var9;
        for (int var10 = arg1; var10 < arg2; var10++) {
            if (arg4[var10] < (long) (var10 & 0x1) + var7) {
                long var11 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6] = var11;
                Object var13 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6++] = var13;
            }
        }
        arg4[arg2] = arg4[var6];
        arg4[var6] = var7;
        arg3[arg2] = arg3[var6];
        arg3[var6] = var9;
        method967((byte) -101, arg1, var6 - 1, arg3, arg4);
        method967((byte) -101, var6 + 1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(ILdg;Ldg;I)V", line = 543)
    public class131(int arg0, class307 arg1, class307 arg2, int arg3) {
        this.field2164 = arg0;
        this.field2152 = arg1;
        this.field2157 = arg3;
        this.field2158 = arg2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III[B)Z", line = 349)
    public final boolean method968(int arg0, int arg1, int arg2, byte[] arg3) {
        field2151++;
        class307 var5 = this.field2152;
        synchronized (this.field2152) {
            if (~arg0 > arg1 || this.field2157 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method964(arg0, -513, true, arg2, arg3);
            if (!var6) {
                var6 = this.method964(arg0, -513, false, arg2, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[B", line = 383)
    public final byte[] method969(int arg0, int arg1) {
        field2149++;
        if (arg0 != 15318) {
            this.field2158 = (class307) null;
        }
        class307 var3 = this.field2152;
        synchronized (this.field2152) {
            try {
                Object var10000;
                if (this.field2158.method2131((byte) -122) < ((long) (arg1 * 6 + 6))) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2158.method2130((long) (arg1 * 6), true);
                this.field2158.method2134(6, 0, class168.field2821, true);
                int var4 = ((class168.field2821[3] & 0xFF) << 16) + ((class168.field2821[4] & 0xFF) << 8) + (class168.field2821[5] & 0xFF);
                int var5 = (class168.field2821[0] & 0xFF << 16) + (class168.field2821[1] & 0xFF << 8) + (class168.field2821[2] & 0xFF);
                if (var5 < 0 || var5 > this.field2157) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 <= 0 || ((long) var4) > (this.field2152.method2131((byte) -86) / 520L)) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var5];
                    int var7 = 0;
                    int var8 = 0;
                    while (var7 < var5) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        int var9 = var5 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field2152.method2130((long) (var4 * 520), true);
                        this.field2152.method2134(var9 + 8, 0, class168.field2821, true);
                        int var10 = (class168.field2821[0] & 0xFF << 8) + (class168.field2821[1] & 0xFF);
                        int var11 = ((class168.field2821[2] & 0xFF) << 8) + (class168.field2821[3] & 0xFF);
                        int var12 = (class168.field2821[4] & 0xFF << 16) + (class168.field2821[6] & 0xFF) + ((class168.field2821[5] & 0xFF) << 8);
                        int var13 = class168.field2821[7] & 0xFF;
                        if (arg1 != var10 || var8 != var11 || this.field2164 != var13) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var12 < 0 || (this.field2152.method2131((byte) -58) / 520L) < ((long) var12)) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var7++] = class168.field2821[var14 + 8];
                        }
                        var4 = var12;
                        var8++;
                    }
                    byte[] var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLt;)V", line = 465)
    public static final void method970(boolean arg0, class242 arg1) {
        if (arg0) {
            field2161 = (long[]) null;
        }
        field2150++;
        class152 var2 = (class152) class187.field3022.method280(arg1.field4068.method1764((byte) -101), 29153);
        if (var2 == null) {
            class196.method1405(arg1.field5125[0], (byte) 19, (class145) null, client.field4039, arg1, 0, arg1.field5154[0], (class186) null);
        } else {
            var2.method1119(1);
        }
    }

    @OriginalMember(owner = "client!ch", name = "toString", descriptor = "()Ljava/lang/String;", line = 486)
    public final String toString() {
        field2165++;
        return "Cache:" + this.field2164;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V", line = 495)
    public static void method971(byte arg0) {
        field2161 = null;
        if (arg0 != -123) {
            field2155 = 125;
        }
        field2153 = null;
        field2167 = null;
        field2166 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BZLtl;)V", line = 521)
    public static final void method972(byte arg0, boolean arg1, class197 arg2) {
        field2160++;
        int var3 = arg2.field3384 == 0 ? arg2.field3253 : arg2.field3384;
        int var4 = arg2.field3261 == 0 ? arg2.field3294 : arg2.field3261;
        if (arg0 <= 67) {
            return;
        }
        class274.method1924(arg1, arg2.field3256, class297.field5087[arg2.field3256 >> 16], var4, (byte) -99, var3);
        if (arg2.field3359 != null) {
            class274.method1924(arg1, arg2.field3256, arg2.field3359, var4, (byte) -113, var3);
        }
        class155 var5 = (class155) class158.field2675.method280((long) arg2.field3256, 29153);
        if (var5 != null) {
            class41.method256(true, var3, arg1, var4, var5.field2637);
        }
    }
}
