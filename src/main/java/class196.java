import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class196 implements Runnable {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Z")
    private boolean field3370 = false;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    private int field3376 = 0;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Z")
    private boolean field3384 = false;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    private int field3386 = 0;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "Lik;")
    private class117 field3383;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field3375;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field3379;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3382;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "[I")
    public static int[] field3380 = new int[99];

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "Lr;")
    public static class66 field3393;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "Lr;")
    public static class66 field3398;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "Lr;")
    public static class66 field3399;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "[Lr;")
    public static class66[] field3391;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "Lr;")
    public static class66 field3400;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "J")
    public static long field3395;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lei;")
    private class232 field3373;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "Ljb;")
    public static class256 field3396;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "[B")
    private byte[] field3397;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "[Z")
    public static boolean[] field3394;

    @OriginalMember(owner = "client!jk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1277(-120);
        field3372++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBI[B)V")
    public final void method1273(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field3402++;
        if (this.field3384) {
            return;
        }
        if (this.field3370) {
            this.field3370 = false;
            throw new IOException();
        } else if (arg1 >= 23) {
            if (this.field3397 == null) {
                this.field3397 = new byte[5000];
            }
            synchronized (this) {
                for (int var6 = 0; var6 < arg2; var6++) {
                    this.field3397[this.field3386] = arg3[arg0 + var6];
                    this.field3386 = (this.field3386 + 1) % 5000;
                    if (((this.field3376 + 4900) % 5000) == this.field3386) {
                        throw new IOException();
                    }
                }
                if (this.field3373 == null) {
                    this.field3373 = this.field3383.method770((byte) -89, 3, this);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3386 == this.field3376) {
                            if (this.field3384) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field3376;
                        if (this.field3386 < this.field3376) {
                            var3 = 5000 - this.field3376;
                        } else {
                            var3 = this.field3386 - this.field3376;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field3382.write(this.field3397, var2, var3);
                    } catch (IOException var9) {
                        this.field3370 = true;
                    }
                    this.field3376 = (this.field3376 + var3) % 5000;
                    try {
                        if (this.field3386 == this.field3376) {
                            this.field3382.flush();
                        }
                    } catch (IOException var8) {
                        this.field3370 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3379 != null) {
                        this.field3379.close();
                    }
                    if (this.field3382 != null) {
                        this.field3382.close();
                    }
                    if (this.field3375 != null) {
                        this.field3375.close();
                    }
                } catch (IOException var7) {
                }
                this.field3397 = null;
                break;
            }
        } catch (Exception var12) {
            class181.method1205((String) null, var12, 38);
        }
        field3374++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III[B)V")
    public final void method1274(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3392++;
        int var5 = 74 % ((arg0 - 47) / 41);
        if (this.field3384) {
            return;
        }
        while (arg1 > 0) {
            int var6 = this.field3379.read(arg3, arg2, arg1);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg1 -= var6;
            arg2 += var6;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILcj;)V")
    public static final void method1275(int arg0, class28 arg1) {
        field3385++;
        class263.field4613 = class160.method1086(arg1, class102.field1994, 0, -122);
        class93.field1788 = new class265[class263.field4613.length];
        class199.field3431 = new class265[class263.field4613.length];
        class154.field2741 = new class265[class263.field4613.length];
        for (int var2 = 0; var2 < class263.field4613.length; var2++) {
            class263.field4613[var2].method1790();
            class93.field1788[var2] = class263.field4613[var2].method1793();
            class263.field4613[var2].method1790();
            class199.field3431[var2] = class263.field4613[var2].method1793();
            class263.field4613[var2].method1790();
            class154.field2741[var2] = class263.field4613[var2].method1793();
            class263.field4613[var2].method1790();
        }
        class249.field4396 = class64.method438(false, class254.field4448, 0, arg1);
        class261.field4600 = class100.method688(0, class222.field3792, 0, arg1);
        class82.field1597 = class100.method688(0, class112.field2150, 0, arg1);
        class78.field1545 = class100.method688(arg0 - 12339, class8.field73, 0, arg1);
        class158.field2853 = class100.method688(0, class215.field3690, 0, arg1);
        class2.field32 = class8.method33(arg1, 0, class52.field912, (byte) 13);
        class73.field1452 = class8.method33(arg1, 0, class132.field2466, (byte) 13);
        class154.field2750 = class202.method1310(arg0 - 12275, class40.field638, 0, arg1);
        class72.field1421 = class8.method33(arg1, 0, class233.field4075, (byte) 13);
        class93.field1785 = class8.method33(arg1, 0, class69.field1377, (byte) 13);
        class261.field4604 = class138.method948(arg1, 0, false, class94.field1812);
        if (arg0 != 12339) {
            return;
        }
        class249.field4400 = class138.method948(arg1, 0, false, class109.field2120);
        class176.field3103.method220(class249.field4400, (int[]) null);
        class33.field501.method220(class249.field4400, (int[]) null);
        class59.field1016.method220(class249.field4400, (int[]) null);
        class168 var3 = class15.method63(class11.field134, (byte) -96, arg1, 0);
        var3.method1151();
        class231.field4052 = var3;
        class168[] var4 = class64.method438(false, class11.field128, 0, arg1);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1151();
        }
        class121.field2295 = var4;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 41.0D) - 20;
        for (int var10 = 0; var10 < class249.field4396.length; var10++) {
            class249.field4396[var10].method1152(var6 + var9, var7 + var9, var8 + var9);
        }
        class263.field4613[0].method1791(var6 + var9, var7 + var9, var8 + var9);
        class96.field1845 = class249.field4396;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)I")
    public final int method1276(int arg0) throws IOException {
        field3377++;
        if (this.field3384) {
            return 0;
        } else if (arg0 <= 38) {
            return 120;
        } else {
            return this.field3379.read();
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
    public final void method1277(int arg0) {
        field3389++;
        if (arg0 > -2) {
            field3398 = null;
        }
        if (this.field3384) {
            return;
        }
        synchronized (this) {
            this.field3384 = true;
            this.notifyAll();
        }
        if (this.field3373 != null) {
            while (this.field3373.field4066 == 0) {
                class91.method636(-5, 1L);
            }
            if (this.field3373.field4066 == 1) {
                try {
                    ((Thread) this.field3373.field4069).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3373 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V")
    public static final void method1278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -6) {
            return;
        }
        if (arg4 <= arg2) {
            for (int var5 = arg4; var5 < arg2; var5++) {
                class15.field183[var5][arg1] = arg3;
            }
        } else {
            for (int var6 = arg2; var6 < arg4; var6++) {
                class15.field183[var6][arg1] = arg3;
            }
        }
        field3371++;
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V")
    public static final void method1279(int arg0) {
        field3378++;
        class234.method1532((byte) -120);
        class82.method565((byte) -79);
        class2.method9(true);
        class145.method997(arg0 ^ 0xFFFFFFC7);
        class211.method1367(76);
        class90.method634((byte) 124);
        class41.method265(arg0);
        class20.method85(arg0 ^ 0xFFFFE178);
        class36.method203(arg0 - 26678);
        class85.method601(arg0 + 5698);
        class247.method1624(127);
        class150.method1021(7);
        class11.method49(122);
        class151.method1026(arg0 ^ 0x23);
        class158.field2852.method1614(arg0 + 127);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)I")
    public final int method1280(byte arg0) throws IOException {
        field3381++;
        if (arg0 != 102) {
            method1278(53, 70, 102, -56, 118);
        }
        return this.field3384 ? 0 : this.field3379.available();
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V")
    public static final void method1281(int arg0) {
        boolean var1 = true;
        field3387++;
        class138.method954(-12915, false);
        class199.field3434 = 0;
        for (int var2 = 0; var2 < class76.field1503.length; var2++) {
            if (class170.field3025[var2] != -1 && class76.field1503[var2] == null) {
                class76.field1503[var2] = class29.field427.method135(0, 0, class170.field3025[var2]);
                if (class76.field1503[var2] == null) {
                    class199.field3434++;
                    var1 = false;
                }
            }
            if (class223.field3806[var2] != -1 && class57.field977[var2] == null) {
                class57.field977[var2] = class29.field427.method147(class77.field1533[var2], class223.field3806[var2], 0, (byte) -28);
                if (class57.field977[var2] == null) {
                    var1 = false;
                    class199.field3434++;
                }
            }
            if (class206.field3516 != null && class162.field2910[var2] == null && class206.field3516[var2] != -1) {
                class162.field2910[var2] = class29.field427.method147(class77.field1533[var2], class206.field3516[var2], 0, (byte) 115);
                if (class162.field2910[var2] == null) {
                    var1 = false;
                    class199.field3434++;
                }
            }
        }
        if (class11.field124 == null || !class26.field327.method144((byte) -101, class212.method1372(2, new class66[] { class11.field124.field4164, class181.field3169 }))) {
            class176.field3090 = null;
        } else if (class26.field327.method151(0, class212.method1372(2, new class66[] { class11.field124.field4164, class181.field3169 }))) {
            class176.field3090 = class62.method403(class212.method1372(2, new class66[] { class11.field124.field4164, class181.field3169 }), 12666, class26.field327);
        } else {
            class199.field3434++;
            var1 = false;
        }
        if (!var1) {
            class28.field426 = 1;
            return;
        }
        class63.field1248 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class76.field1503.length; var4++) {
            byte[] var19 = class57.field977[var4];
            if (var19 != null) {
                int var20 = (class202.field3469[var4] >> 8) * 64 - class3.field39;
                int var21 = (class202.field3469[var4] & 0xFF) * 64 - class34.field512;
                if (class3.field36) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class257.method1720(var19, -32692, var21, var20);
            }
        }
        if (!var3) {
            class28.field426 = 2;
            return;
        }
        if (class28.field426 != 0) {
            class250.method1693(true, class212.method1372(2, new class66[] { class199.field3428, class67.field1348 }), -16678);
        }
        if (arg0 < 78) {
            method1278(113, 66, -49, 57, 30);
        }
        class129.method901(16322);
        class83.method576(137);
        class59.method389();
        for (int var5 = 0; var5 < 4; var5++) {
            class193.field3346[var5].method1110(false);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var17 = 0; var17 < 104; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    class47.field846[var6][var17][var18] = 0;
                }
            }
        }
        class195.method1268(0, false);
        class129.method901(16322);
        System.gc();
        class138.method954(-12915, true);
        class125.method862(false, -1261);
        if (!class3.field36) {
            class129.method903(false, false);
            class138.method954(-12915, true);
            class207.method1350(false, (byte) 84);
            if (class162.field2910 != null) {
                class211.method1369((byte) -110);
            }
        }
        if (class3.field36) {
            class80.method558(false, (byte) -32);
            class138.method954(-12915, true);
            class120.method815((byte) -124, false);
        }
        class83.method576(137);
        class138.method954(-12915, true);
        class243.method1600((byte) -111, false, class193.field3346);
        class138.method954(-12915, true);
        int var7 = class147.field2681;
        if (field3401 < var7) {
            var7 = field3401;
        }
        if ((field3401 - 1) > var7) {
            int var8 = field3401 - 1;
        }
        if (class88.method625(24781)) {
            class52.method357(0);
        } else {
            class52.method357(class147.field2681);
        }
        class252.method1698(108);
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class197.method1287(var9, (byte) -52, var16);
            }
        }
        class225.method1438(-13401);
        class129.method901(16322);
        class194.method1264(-28968);
        class83.method576(137);
        if (class158.field2857 != null && class101.field1972 != null && class244.field4258 == 25) {
            class28.field412.method578(-63, 22);
            class28.field412.method1666(544537784, 1057001181);
            class21.field297++;
        }
        if (!class3.field36) {
            int var10 = (class157.field2816 - 6) / 8;
            int var11 = (class155.field2755 - 6) / 8;
            int var12 = (class157.field2816 + 6) / 8;
            int var13 = (class155.field2755 + 6) / 8;
            for (int var14 = var10 - 1; var14 <= var12 + 1; var14++) {
                for (int var15 = var11 - 1; var15 <= var13 + 1; var15++) {
                    if (var10 > var14 || var14 > var12 || var11 > var15 || var13 < var15) {
                        class29.field427.method127(class212.method1372(2, new class66[] { class79.field1554, class144.method989(var14, 0), class26.field329, class144.method989(var15, 0) }), 118);
                        class29.field427.method127(class212.method1372(2, new class66[] { class240.field4176, class144.method989(var14, 0), class26.field329, class144.method989(var15, 0) }), 114);
                    }
                }
            }
        }
        if (class244.field4258 == 28) {
            class112.method755(10, (byte) -128);
        } else {
            class112.method755(30, (byte) -77);
            if (class101.field1972 != null) {
                class28.field412.method578(64, 60);
            }
        }
        class129.method901(16322);
        class203.method1319((byte) 105);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
    public static void method1282(byte arg0) {
        field3380 = null;
        field3393 = null;
        int var1 = -22 / ((arg0 + 68) / 46);
        field3394 = null;
        field3399 = null;
        field3400 = null;
        field3398 = null;
        field3396 = null;
        field3391 = null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/net/Socket;Lik;)V")
    public class196(Socket arg0, class117 arg1) throws IOException {
        this.field3383 = arg1;
        this.field3375 = arg0;
        this.field3375.setSoTimeout(30000);
        this.field3375.setTcpNoDelay(true);
        this.field3379 = this.field3375.getInputStream();
        this.field3382 = this.field3375.getOutputStream();
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3380[var1] = var0 / 4;
        }
        field3390 = 0;
        field3393 = class93.method641(43, "::tele ");
        field3398 = class93.method641(43, " )2> <col=ffff00>");
        field3399 = class93.method641(43, ")1j");
        field3391 = new class66[100];
        field3400 = class93.method641(43, "");
    }
}
