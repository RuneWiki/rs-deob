import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class90 implements Runnable {

    @OriginalMember(owner = "client!n", name = "x", descriptor = "Z")
    private boolean field2246 = false;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    private int field2240 = 0;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "I")
    private int field2259 = 0;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "Z")
    private boolean field2260 = false;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Ldd;")
    private class26 field2247;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "Ljava/net/Socket;")
    private Socket field2250;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field2223;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2238;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lid;")
    public static class60 field2234 = class11.method72(" zuerst von Ihrer Ignorieren)2Liste(Q", (byte) 121);

    @OriginalMember(owner = "client!n", name = "D", descriptor = "[I")
    public static int[] field2252 = new int[1000];

    @OriginalMember(owner = "client!n", name = "I", descriptor = "Lid;")
    public static class60 field2257 = class11.method72("und die Schaltfl-=che (WSpielkonto erstellen(W am", (byte) -18);

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Lid;")
    public static class60 field2235 = class11.method72("leuchten1:", (byte) 125);

    @OriginalMember(owner = "client!n", name = "O", descriptor = "Lid;")
    private static class60 field2263 = class11.method72("Invalid username or password)3", (byte) -60);

    @OriginalMember(owner = "client!n", name = "M", descriptor = "Lid;")
    public static class60 field2261 = class11.method72("<col=ffffff>", (byte) 95);

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Lid;")
    public static class60 field2241 = class11.method72("Lade Sprites )2 ", (byte) 101);

    @OriginalMember(owner = "client!n", name = "J", descriptor = "Lid;")
    public static class60 field2258 = class11.method72("T", (byte) 118);

    @OriginalMember(owner = "client!n", name = "F", descriptor = "Lid;")
    public static class60 field2254 = class11.method72("Benutzen", (byte) 104);

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lid;")
    public static class60 field2229 = field2263;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "[I")
    public static int[] field2249 = new int[500];

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Ltf;")
    private class138 field2239;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lie;")
    public static class61 field2225;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "[B")
    private byte[] field2242;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "[I")
    public static int[] field2236;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "[I")
    public static int[] field2256;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "[Lae;")
    public static class6[] field2228;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public final void method729(boolean arg0) {
        field2231++;
        if (this.field2246) {
            return;
        }
        synchronized (this) {
            this.field2246 = true;
            this.notifyAll();
        }
        if (this.field2239 != null) {
            while (this.field2239.field3145 == 0) {
                class128.method1007((byte) 76, 1L);
            }
            if (this.field2239.field3145 == 1) {
                try {
                    ((Thread) this.field2239.field3144).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        if (arg0) {
            field2225 = null;
        }
        this.field2239 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II[BI)V")
    public final void method730(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2227++;
        if (this.field2246) {
            return;
        }
        if (this.field2260) {
            this.field2260 = false;
            throw new IOException();
        }
        if (this.field2242 == null) {
            this.field2242 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = arg1; var6 < arg3; var6++) {
                this.field2242[this.field2240] = arg2[arg0 + var6];
                this.field2240 = (this.field2240 + 1) % 5000;
                if ((this.field2259 + 4900) % 5000 == this.field2240) {
                    throw new IOException();
                }
            }
            if (this.field2239 == null) {
                this.field2239 = this.field2247.method201(3, (byte) -57, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ln;ZZ)V")
    public static final void method731(class90 arg0, boolean arg1, boolean arg2) {
        field2248++;
        if (!arg2) {
            field2263 = null;
        }
        if (class48.field1261 != null) {
            try {
                class48.field1261.method729(false);
            } catch (Exception var8) {
            }
            class48.field1261 = null;
        }
        class48.field1261 = arg0;
        method733(arg1, (byte) -85);
        class102.field2479 = null;
        class47.field1233.field2501 = 0;
        class24.field588 = null;
        class105.field2562 = 0;
        while (true) {
            class93 var3 = (class93) class38.field921.method713(12421);
            if (var3 == null) {
                while (true) {
                    class93 var4 = (class93) class111.field2675.method713(12421);
                    if (var4 == null) {
                        if (class155.field3547 != 0) {
                            try {
                                class103 var5 = new class103(4);
                                var5.method818(!arg2, 4);
                                var5.method818(false, class155.field3547);
                                var5.method811(true, 0);
                                class48.field1261.method730(0, 0, var5.field2498, 4);
                            } catch (IOException var7) {
                                try {
                                    class48.field1261.method729(false);
                                } catch (Exception var6) {
                                }
                                class48.field1261 = null;
                                class121.field2764++;
                            }
                        }
                        class17.field408 = 0;
                        class152.field3415 = class39.method307(8);
                        return;
                    }
                    class104.field2547.method1149(var4, 1);
                    class32.field741.method712(var4.field2929, var4, (byte) 60);
                    class157.field3588++;
                    class128.field2933--;
                }
            }
            class41.field1080.method712(var3.field2929, var3, (byte) 63);
            class13.field232++;
            class34.field798--;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method732(int arg0) {
        field2261 = null;
        field2234 = null;
        field2257 = null;
        field2241 = null;
        if (arg0 != -23828) {
            field2257 = null;
        }
        field2228 = null;
        field2249 = null;
        field2254 = null;
        field2263 = null;
        field2258 = null;
        field2235 = null;
        field2225 = null;
        field2236 = null;
        field2229 = null;
        field2252 = null;
        field2256 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZB)V")
    public static final void method733(boolean arg0, byte arg1) {
        field2244++;
        if (class48.field1261 == null) {
            return;
        }
        try {
            class103 var2 = new class103(4);
            var2.method818(false, arg0 ? 2 : 3);
            var2.method839((byte) 86, 0);
            class48.field1261.method730(0, 0, var2.field2498, 4);
            if (arg1 > -71) {
                method732(120);
            }
        } catch (IOException var4) {
            try {
                class48.field1261.method729(false);
            } catch (Exception var3) {
            }
            class121.field2764++;
            class48.field1261 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([BIII)V")
    public final void method734(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 >= 0) {
            return;
        }
        field2255++;
        if (this.field2246) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field2223.read(arg0, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)I")
    public final int method735(int arg0) throws IOException {
        field2243++;
        if (arg0 == 0) {
            return this.field2246 ? 0 : this.field2223.available();
        } else {
            return 84;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLfd;)Lfd;")
    public static final class40 method736(byte arg0, class40 arg1) {
        field2232++;
        int var2 = class32.method246(class97.method770(arg1, -1370253216), (byte) 59);
        if (var2 == 0) {
            return null;
        }
        if (arg0 >= -123) {
            method732(-71);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class132.method1041(true, arg1.field1028);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILfd;II)V")
    public static final void method737(int arg0, class40 arg1, int arg2, int arg3) {
        field2245++;
        if (arg1.field1007 == 1) {
            class82.method689(0, 28, (byte) -93, class94.field2314, 0, arg1.field1008, arg1.field945);
            class105.field2573++;
        }
        if (arg1.field1007 == 2 && !class1.field17) {
            class60 var4 = class21.method163((byte) 96, arg1);
            if (var4 != null) {
                class73.field1762++;
                class82.method689(0, 46, (byte) 124, class104.method853(-112, new class60[] { class33.field781, arg1.field1039 }), -1, arg1.field1008, var4);
            }
        }
        if (arg0 != 3259) {
            method736((byte) -54, null);
        }
        if (arg1.field1007 == 3) {
            class82.method689(0, 50, (byte) 124, class94.field2314, 0, arg1.field1008, class81.field2023);
            class47.field1234++;
        }
        if (arg1.field1007 == 4) {
            class10.field168++;
            class82.method689(0, 17, (byte) 20, class94.field2314, 0, arg1.field1008, arg1.field945);
        }
        if (arg1.field1007 == 5) {
            class82.method689(0, 41, (byte) -7, class94.field2314, 0, arg1.field1008, arg1.field945);
            class158.field3615++;
        }
        if (arg1.field1007 == 6 && class124.field2864 == null) {
            class82.method689(0, 9, (byte) 14, class94.field2314, -1, arg1.field1008, arg1.field945);
            class158.field3614++;
        }
        if (arg1.field938 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field1014; var6++) {
                for (int var7 = 0; var7 < arg1.field1038; var7++) {
                    int var8 = (arg1.field1045 + 32) * var7;
                    int var9 = (arg1.field1062 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg1.field946[var5];
                        var8 += arg1.field1074[var5];
                    }
                    if (var8 <= arg2 && arg3 >= var9 && arg2 < var8 + 32 && arg3 < var9 + 32) {
                        class157.field3597 = var5;
                        class45.field1192 = arg1;
                        if (arg1.field1053[var5] > 0) {
                            class85 var10 = class85.method710(arg1.field1053[var5] - 1, 10);
                            if (class155.field3546 == 1 && class87.method724(class97.method770(arg1, -1370253216), false)) {
                                if (class107.field2634 != arg1.field1008 || class23.field564 != var5) {
                                    class82.method689(var10.field2082, 34, (byte) -88, class104.method853(-112, new class60[] { class85.field2121, class146.field3280, var10.field2122 }), var5, arg1.field1008, class81.field2014);
                                    class54.field1354++;
                                }
                            } else if (!class1.field17 || !class87.method724(class97.method770(arg1, -1370253216), false)) {
                                class60[] var11 = var10.field2089;
                                class48.field1251++;
                                if (class13.field245) {
                                    var11 = class19.method154(var11, -30876);
                                }
                                if (class87.method724(class97.method770(arg1, -1370253216), false)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 23;
                                            } else {
                                                var13 = 26;
                                            }
                                            class82.method689(var10.field2082, var13, (byte) -18, class104.method853(-91, new class60[] { class131.field2986, var10.field2122 }), var5, arg1.field1008, var11[var12]);
                                            class144.field3239++;
                                        } else if (var12 == 4) {
                                            class125.field2885++;
                                            class82.method689(var10.field2082, 26, (byte) 108, class104.method853(-88, new class60[] { class131.field2986, var10.field2122 }), var5, arg1.field1008, class124.field2841);
                                        }
                                    }
                                }
                                if (class104.method856((byte) 121, class97.method770(arg1, -1370253216))) {
                                    class44.field1166++;
                                    class82.method689(var10.field2082, 49, (byte) -63, class104.method853(-119, new class60[] { class131.field2986, var10.field2122 }), var5, arg1.field1008, class81.field2014);
                                }
                                if (class87.method724(class97.method770(arg1, arg0 - 1370256475), false) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class152.field3409++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 30;
                                            }
                                            if (var14 == 1) {
                                                var15 = 31;
                                            }
                                            if (var14 == 2) {
                                                var15 = 37;
                                            }
                                            class82.method689(var10.field2082, var15, (byte) 125, class104.method853(-114, new class60[] { class131.field2986, var10.field2122 }), var5, arg1.field1008, var11[var14]);
                                        }
                                    }
                                }
                                class60[] var16 = arg1.field990;
                                if (class13.field245) {
                                    var16 = class19.method154(var16, arg0 - 34135);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            client.field503++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 5;
                                            }
                                            if (var17 == 1) {
                                                var18 = 38;
                                            }
                                            if (var17 == 2) {
                                                var18 = 20;
                                            }
                                            if (var17 == 3) {
                                                var18 = 47;
                                            }
                                            if (var17 == 4) {
                                                var18 = 2;
                                            }
                                            class82.method689(var10.field2082, var18, (byte) -36, class104.method853(-97, new class60[] { class131.field2986, var10.field2122 }), var5, arg1.field1008, var16[var17]);
                                        }
                                    }
                                }
                                class82.method689(var10.field2082, 1001, (byte) 122, class104.method853(-119, new class60[] { class131.field2986, var10.field2122 }), var5, arg1.field1008, class153.field3450);
                            } else if ((class7.field100 & 0x10) == 16) {
                                class82.method689(var10.field2082, 48, (byte) -54, class104.method853(-100, new class60[] { class56.field1389, class146.field3280, var10.field2122 }), var5, arg1.field1008, class35.field857);
                                class133.field3012++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg1.field977) {
            return;
        }
        if (!class1.field17) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class60 var23 = class39.method304(var19, -1, arg1);
                if (var23 != null) {
                    class60.field1482++;
                    class82.method689(var19 + 1, 1004, (byte) 118, arg1.field1036, arg1.field949, arg1.field1008, var23);
                }
            }
            class60 var20 = class21.method163((byte) 62, arg1);
            if (var20 != null) {
                class73.field1762++;
                class82.method689(0, 46, (byte) 115, arg1.field1036, arg1.field949, arg1.field1008, var20);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class60 var22 = class39.method304(var21, arg0 - 3260, arg1);
                if (var22 != null) {
                    class60.field1482++;
                    class82.method689(var21 + 1, 43, (byte) 124, arg1.field1036, arg1.field949, arg1.field1008, var22);
                }
            }
            if (class60.method419((byte) -100, class97.method770(arg1, -1370253216))) {
                class158.field3614++;
                class82.method689(0, 9, (byte) -12, class94.field2314, arg1.field949, arg1.field1008, class1.field28);
                return;
            }
            return;
        }
        if (class47.method370(class97.method770(arg1, -1370253216), arg0 - 3260) && (class7.field100 & 0x20) == 32) {
            class87.field2168++;
            class82.method689(0, 57, (byte) -121, class104.method853(-85, new class60[] { class56.field1389, class81.field2028, arg1.field1036 }), arg1.field949, arg1.field1008, class35.field857);
            return;
        }
    }

    @OriginalMember(owner = "client!n", name = "run", descriptor = "()V")
    public final void run() {
        field2262++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2259 == this.field2240) {
                        if (this.field2246) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2240 >= this.field2259) {
                        var2 = this.field2240 - this.field2259;
                    } else {
                        var2 = 5000 - this.field2259;
                    }
                    var3 = this.field2259;
                }
                if (var2 > 0) {
                    try {
                        this.field2238.write(this.field2242, var3, var2);
                    } catch (IOException var9) {
                        this.field2260 = true;
                    }
                    this.field2259 = (this.field2259 + var2) % 5000;
                    try {
                        if (this.field2259 == this.field2240) {
                            this.field2238.flush();
                        }
                    } catch (IOException var8) {
                        this.field2260 = true;
                    }
                }
            }
            try {
                if (this.field2223 != null) {
                    this.field2223.close();
                }
                if (this.field2238 != null) {
                    this.field2238.close();
                }
                if (this.field2250 != null) {
                    this.field2250.close();
                }
            } catch (IOException var7) {
            }
            this.field2242 = null;
        } catch (Exception var12) {
            class73.method558(-1, null, var12);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
    public static final void method738(int arg0) {
        if (arg0 < 118) {
            method738(-59);
        }
        class22.field548 = false;
        field2251++;
        class76.field1851 = false;
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2233++;
        this.method729(false);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)I")
    public final int method739(boolean arg0) throws IOException {
        if (arg0) {
            field2226++;
            return this.field2246 ? 0 : this.field2223.read();
        } else {
            return 48;
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Ljava/net/Socket;Ldd;)V")
    public class90(Socket arg0, class26 arg1) throws IOException {
        this.field2247 = arg1;
        this.field2250 = arg0;
        this.field2250.setSoTimeout(30000);
        this.field2250.setTcpNoDelay(true);
        this.field2223 = this.field2250.getInputStream();
        this.field2238 = this.field2250.getOutputStream();
    }
}
