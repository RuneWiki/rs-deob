import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class129 implements Runnable {

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    private int field3158 = 0;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    private int field3169 = 0;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Z")
    private boolean field3162 = false;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Z")
    private boolean field3159 = false;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Llc;")
    private class69 field3164;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field3157;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field3152;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3177;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "La;")
    private static class1 field3149 = class113.method934(-11538, "Your account has been disabled)3");

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "La;")
    public static class1 field3151 = class113.method934(-11538, "Wordpack geladen)3");

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "La;")
    public static class1 field3154 = class113.method934(-11538, "Handel akzeptieren");

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3160 = -1;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "La;")
    public static class1 field3175 = field3149;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "La;")
    public static class1 field3172 = class113.method934(-11538, "");

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "La;")
    public static class1 field3173 = class113.method934(-11538, "Menge eingeben:");

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "La;")
    public static class1 field3166 = class113.method934(-11538, "redstone3");

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field3178 = 99;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "Lbd;")
    public static class11 field3170;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Led;")
    private class29 field3161;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[B")
    private byte[] field3153;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[B)V", line = 3)
    public final void method1017(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3171++;
        if (this.field3162 || arg2 >= -126) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field3152.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 30)
    public final void method1018(int arg0) {
        int var2 = 27 / ((-arg0 - 54) / 32);
        field3165++;
        if (this.field3162) {
            return;
        }
        synchronized (this) {
            this.field3162 = true;
            this.notifyAll();
        }
        if (this.field3161 != null) {
            while (this.field3161.field816 == 0) {
                class86.method756(1L, 115);
            }
            if (this.field3161.field816 == 1) {
                try {
                    ((Thread) this.field3161.field819).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field3161 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBI[B)V", line = 68)
    public final void method1019(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field3174++;
        if (this.field3162) {
            return;
        }
        if (this.field3159) {
            this.field3159 = false;
            throw new IOException();
        }
        if (this.field3153 == null) {
            this.field3153 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field3153[this.field3158] = arg3[arg2 + var6];
                this.field3158 = (this.field3158 + 1) % 5000;
                if ((this.field3169 + 4900) % 5000 == this.field3158) {
                    throw new IOException();
                }
            }
            if (this.field3161 == null) {
                this.field3161 = this.field3164.method659(3, 0, this);
            }
            this.notifyAll();
            if (arg1 != -19) {
                this.run();
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 123)
    public static void method1020(boolean arg0) {
        field3154 = null;
        field3175 = null;
        if (!arg0) {
            field3151 = null;
        }
        field3172 = null;
        field3151 = null;
        field3170 = null;
        field3173 = null;
        field3149 = null;
        field3166 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V", line = 165)
    public static final void method1021(int arg0, int arg1) {
        field3167++;
        if (!class134.method1055(arg0, 126)) {
            return;
        }
        class100[] var2 = class117.field2925[arg0];
        if (arg1 != 2) {
            method1022(true);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class100 var4 = var2[var3];
            if (var4.field2486 != null) {
                class86.method757(var4.field2486, 0, 0, var4, 0, false);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V", line = 199)
    protected final void finalize() {
        this.method1018(-4);
        field3150++;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Ljava/net/Socket;Llc;)V", line = 669)
    public class129(Socket arg0, class69 arg1) throws IOException {
        this.field3164 = arg1;
        this.field3157 = arg0;
        this.field3157.setSoTimeout(30000);
        this.field3157.setTcpNoDelay(true);
        this.field3152 = this.field3157.getInputStream();
        this.field3177 = this.field3157.getOutputStream();
    }

    @OriginalMember(owner = "client!vc", name = "run", descriptor = "()V", line = 214)
    public final void run() {
        field3168++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field3169 == this.field3158) {
                        if (this.field3162) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field3169 <= this.field3158) {
                        var2 = this.field3158 - this.field3169;
                    } else {
                        var2 = 5000 - this.field3169;
                    }
                    var3 = this.field3169;
                }
                if (var2 > 0) {
                    try {
                        this.field3177.write(this.field3153, var3, var2);
                    } catch (IOException var9) {
                        this.field3159 = true;
                    }
                    this.field3169 = (this.field3169 + var2) % 5000;
                    try {
                        if (this.field3169 == this.field3158) {
                            this.field3177.flush();
                        }
                    } catch (IOException var8) {
                        this.field3159 = true;
                    }
                }
            }
            try {
                if (this.field3152 != null) {
                    this.field3152.close();
                }
                if (this.field3177 != null) {
                    this.field3177.close();
                }
                if (this.field3157 != null) {
                    this.field3157.close();
                }
            } catch (IOException var7) {
            }
            this.field3153 = null;
        } catch (Exception var12) {
            class11.method215(null, (byte) -122, var12);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V", line = 286)
    public static final void method1022(boolean arg0) {
        field3163++;
        int var1 = -1;
        if (arg0) {
            method1022(false);
        }
        if (class14.field476 == 0 && client.field595 == 0) {
            class93.field2314++;
            class34.method399(0, class123.field3060, class102.field2571, -501, class24.field742, 7, class132.field3237);
        }
        for (int var2 = 0; var2 < class91.field2264; var2++) {
            int var3 = class91.field2255[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 29 & 0x3;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var6 == 2 && class130.field3186.method98(class2.field76, var4, var5, var3) >= 0) {
                    class49 var8 = class32.method390(var7, (byte) 126);
                    if (var8.field1319 != null) {
                        var8 = var8.method518(-20);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class14.field476 == 1) {
                        class34.method399(var3, client.field585, var5, -501, var4, 5, class116.method959(106, new class1[] { class130.field3180, class16.field525, var8.field1334 }));
                        class89.field2188++;
                    } else if (client.field595 != 1) {
                        class1[] var9 = var8.field1293;
                        if (class118.field2937) {
                            var9 = class109.method908(var9, arg0);
                        }
                        class66.field1653++;
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    short var11 = 0;
                                    class75.field1871++;
                                    if (var10 == 0) {
                                        var11 = 16;
                                    }
                                    if (var10 == 1) {
                                        var11 = 29;
                                    }
                                    if (var10 == 2) {
                                        var11 = 17;
                                    }
                                    if (var10 == 3) {
                                        var11 = 27;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1002;
                                    }
                                    class34.method399(var3, var9[var10], var5, -501, var4, var11, class116.method959(-91, new class1[] { class128.field3139, var8.field1334 }));
                                }
                            }
                        }
                        class34.method399(var8.field1323 << 14, class114.field2808, var5, -501, var4, 1004, class116.method959(113, new class1[] { class128.field3139, var8.field1334 }));
                    } else if ((class115.field2849 & 0x4) == 4) {
                        class128.field3140++;
                        class34.method399(var3, class60.field1526, var5, -501, var4, 32, class116.method959(111, new class1[] { class52.field1387, class16.field525, var8.field1334 }));
                    }
                }
                if (var6 == 1) {
                    class130 var12 = class120.field2995[var7];
                    if (var12.field3185.field1085 == 1 && (var12.field1975 & 0x7F) == 64 && (var12.field1966 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class49.field1343; var13++) {
                            class130 var16 = class120.field2995[class22.field678[var13]];
                            if (var16 != null && var12 != var16 && var16.field3185.field1085 == 1 && var12.field1975 == var16.field1975 && var12.field1966 == var16.field1966) {
                                class132.method1038(0, var4, var5, class22.field678[var13], var16.field3185);
                            }
                        }
                        for (int var14 = 0; var14 < class118.field2942; var14++) {
                            class2 var15 = class80.field2033[class112.field2761[var14]];
                            if (var15 != null && var12.field1975 == var15.field1975 && var12.field1966 == var15.field1966) {
                                class16.method273(var5, false, var4, var15, class112.field2761[var14]);
                            }
                        }
                    }
                    class132.method1038(0, var4, var5, var7, var12.field3185);
                }
                if (var6 == 0) {
                    class2 var17 = class80.field2033[var7];
                    if ((var17.field1975 & 0x7F) == 64 && (var17.field1966 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class49.field1343; var18++) {
                            class130 var21 = class120.field2995[class22.field678[var18]];
                            if (var21 != null && var21.field3185.field1085 == 1 && var17.field1975 == var21.field1975 && var17.field1966 == var21.field1966) {
                                class132.method1038(0, var4, var5, class22.field678[var18], var21.field3185);
                            }
                        }
                        for (int var19 = 0; var19 < class118.field2942; var19++) {
                            class2 var20 = class80.field2033[class112.field2761[var19]];
                            if (var20 != null && var17 != var20 && var17.field1975 == var20.field1975 && var17.field1966 == var20.field1966) {
                                class16.method273(var5, arg0, var4, var20, class112.field2761[var19]);
                            }
                        }
                    }
                    class16.method273(var5, false, var4, var17, var7);
                }
                if (var6 == 3) {
                    class92 var22 = class17.field553[class2.field76][var4][var5];
                    if (var22 != null) {
                        for (class59 var23 = (class59) var22.method804((byte) -95); var23 != null; var23 = (class59) var22.method815(4)) {
                            class115 var24 = class89.method763(var23.field1502, 10);
                            if (class14.field476 == 1) {
                                class89.field2179++;
                                class34.method399(var23.field1502, client.field585, var5, -501, var4, 47, class116.method959(115, new class1[] { class130.field3180, class9.field329, var24.field2830 }));
                            } else if (client.field595 != 1) {
                                class1[] var25 = var24.field2838;
                                class109.field2738++;
                                if (class118.field2937) {
                                    var25 = class109.method908(var25, arg0);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        class34.field907++;
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 2;
                                        }
                                        if (var26 == 1) {
                                            var27 = 38;
                                        }
                                        if (var26 == 2) {
                                            var27 = 3;
                                        }
                                        if (var26 == 3) {
                                            var27 = 8;
                                        }
                                        if (var26 == 4) {
                                            var27 = 36;
                                        }
                                        class34.method399(var23.field1502, var25[var26], var5, -501, var4, var27, class116.method959(-97, new class1[] { class93.field2337, var24.field2830 }));
                                    } else if (var26 == 2) {
                                        class17.field535++;
                                        class34.method399(var23.field1502, class63.field1597, var5, -501, var4, 3, class116.method959(123, new class1[] { class93.field2337, var24.field2830 }));
                                    }
                                }
                                class34.method399(var23.field1502, class114.field2808, var5, -501, var4, 1003, class116.method959(89, new class1[] { class93.field2337, var24.field2830 }));
                            } else if ((class115.field2849 & 0x1) == 1) {
                                class34.method399(var23.field1502, class60.field1526, var5, -501, var4, 15, class116.method959(-67, new class1[] { class52.field1387, class9.field329, var24.field2830 }));
                                class113.field2795++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)I", line = 586)
    public final int method1023(int arg0) throws IOException {
        field3156++;
        if (arg0 >= -120) {
            this.field3164 = null;
        }
        return this.field3162 ? 0 : this.field3152.available();
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V", line = 628)
    public static final void method1024(int arg0) {
        class122 var1 = class54.field1415;
        synchronized (class54.field1415) {
            class28.field802 = class15.field495;
            class24.field742 = class23.field711;
            if (arg0 != -656) {
                field3173 = null;
            }
            class102.field2571 = class15.field497;
            class122.field3053 = class80.field2020;
            class112.field2765 = class108.field2714;
            class1.field14 = class97.field2399;
            class49.field1346 = class34.field920;
            class80.field2020 = 0;
        }
        field3176++;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)I", line = 655)
    public final int method1025(int arg0) throws IOException {
        if (arg0 < 14) {
            field3173 = null;
        }
        field3155++;
        return this.field3162 ? 0 : this.field3152.read();
    }
}
