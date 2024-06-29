import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class145 implements Runnable {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Z")
    private boolean field3291 = false;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Z")
    private boolean field3297 = false;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    private int field3319 = 0;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    private int field3316 = 0;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "Ljava/net/Socket;")
    private Socket field3321;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "Lcf;")
    private class21 field3315;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Ljava/io/InputStream;")
    private InputStream field3296;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3323;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lv;")
    public static class146 field3288 = class159.method1226((byte) -37, "swe");

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field3303 = 0;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Lv;")
    public static class146 field3305 = class159.method1226((byte) -37, "<col=00ffff>");

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Lv;")
    private static class146 field3306 = class159.method1226((byte) -37, "Players");

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lv;")
    public static class146 field3304 = field3306;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "Lv;")
    public static class146 field3314 = class159.method1226((byte) -37, "(U");

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lv;")
    public static class146 field3298 = class159.method1226((byte) -37, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "Lv;")
    public static class146 field3318 = class159.method1226((byte) -37, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "Lv;")
    public static class146 field3326 = class159.method1226((byte) -37, "blinken1:");

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field3301 = 0;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "J")
    public static long field3290 = 0L;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "Lub;")
    public static class141 field3322;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lcf;")
    public static class21 field3293;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Lfc;")
    private class39 field3302;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "[B")
    private byte[] field3325;

    @OriginalMember(owner = "client!uf", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3320++;
        this.method1071((byte) 123);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
    public static final void method1067(int arg0, int arg1) {
        class77.field1870 = -1;
        class132.field3010 = arg1;
        class67.field1526 = arg0;
        class120.field2778 = -1;
        field3313++;
        class58.field1300 = 1;
        class33.field693 = null;
        class25.field410 = false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V")
    public static final void method1068(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class56.method387(arg3, arg1, arg0 + arg3, arg1 + arg2);
        field3299++;
        class45.method304();
        class25.field431++;
        class2.method5(true, false);
        class107.method861(true, 383);
        class2.method5(false, false);
        class107.method861(false, 383);
        class64.method465((byte) -62);
        class121.method915((byte) 53);
        if (!class150.field3477) {
            int var5 = class5.field103;
            if (var5 < class100.field2436 / 256) {
                var5 = class100.field2436 / 256;
            }
            if (class12.field187[4] && class105.field2522[4] + 128 > var5) {
                var5 = class105.field2522[4] + 128;
            }
            int var6 = class72.field1692 + class101.field2448 & 0x7FF;
            class13.method78(1939431536, var5, class121.field2819, class105.field2523, class79.method612(class148.field3428, class116.field2696.field757, class116.field2696.field790, false) - 50, var5 * 3 + 600, var6);
        }
        int var7;
        if (class150.field3477) {
            var7 = class70.method502(arg4 ^ 0xFFFFFD02);
        } else {
            var7 = class74.method549(64);
        }
        int var8 = class126.field2920;
        int var9 = class116.field2698;
        int var10 = class89.field2109;
        int var11 = class143.field3266;
        int var12 = class123.field2854;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class12.field187[var13]) {
                int var16 = (int) ((double) -class101.field2449[var13] + Math.random() * (double) (class101.field2449[var13] * 2 + 1) + Math.sin((double) class158.field3640[var13] / 100.0D * (double) class15.field243[var13]) * (double) class105.field2522[var13]);
                if (var13 == 1) {
                    class116.field2698 += var16;
                }
                if (var13 == 0) {
                    class126.field2920 += var16;
                }
                if (var13 == 2) {
                    class143.field3266 += var16;
                }
                if (var13 == 4) {
                    class89.field2109 += var16;
                    if (class89.field2109 < 128) {
                        class89.field2109 = 128;
                    }
                    if (class89.field2109 > 383) {
                        class89.field2109 = 383;
                    }
                }
                if (var13 == 3) {
                    class123.field2854 = class123.field2854 + var16 & 0x7FF;
                }
            }
        }
        int var14 = class2.field45;
        int var15 = class151.field3491;
        if (arg4 != -1) {
            return;
        }
        if (arg3 <= var14 && var14 < arg0 + arg3 && var15 >= arg1 && arg1 + arg2 > var15) {
            class139.field3176 = 0;
            class139.field3177 = class2.field45 - arg3;
            class139.field3191 = class151.field3491 - arg1;
            class139.field3180 = true;
        } else {
            class139.field3176 = 0;
            class139.field3180 = false;
        }
        class25.method160((byte) 43);
        class56.method382(arg3, arg1, arg0, arg2, 0);
        class25.method160((byte) 43);
        class66.field1496.method1191(class126.field2920, class116.field2698, class143.field3266, class89.field2109, class123.field2854, var7);
        class25.method160((byte) 43);
        class66.field1496.method1164();
        class87.method691(arg2, arg0, arg3, arg1, false);
        class120.method911(arg3, (byte) -26, arg1);
        ((class49) class45.field1046).method340(class1.field16, 0);
        class88.method703(arg0, (byte) -7, arg2, arg1, arg3);
        class89.field2109 = var10;
        class116.field2698 = var9;
        class143.field3266 = var11;
        class126.field2920 = var8;
        class123.field2854 = var12;
        if (class22.field365 && class111.method876(false, true, false) == 0) {
            class22.field365 = false;
        }
        if (class22.field365) {
            class56.method382(arg3, arg1, arg0, arg2, 0);
            class12.method70(false, 96, class152.field3501);
        }
        if (!class22.field365 && !class38.field842 && var14 >= arg3 && var14 < arg0 + arg3 && var15 >= arg1 && arg1 + arg2 > var15) {
            class136.method1012(var15, 126, arg3, var14, arg1);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)V")
    public static final void method1069(int arg0, byte arg1) {
        field3307++;
        class71.field1639 += arg0 * 128;
        short var2 = 256;
        if (class71.field1639 > class68.field1541.length) {
            int var3 = (int) (Math.random() * 12.0D);
            class71.field1639 -= class68.field1541.length;
            class22.method141(class88.field2077[var3], (byte) -45);
        }
        int var4 = 0;
        int var5 = (var2 - arg0) * 128;
        int var6 = arg0 * 128;
        if (arg1 > -66) {
            return;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var27 = class49.field1121[var4 + var6] - class68.field1541[class71.field1639 + var4 & class68.field1541.length + -1] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class49.field1121[var4++] = var27;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class49.field1121[var24 + var25] = 255;
                } else {
                    class49.field1121[var25 + var24] = 0;
                }
            }
        }
        if (class103.field2514 > 0) {
            class103.field2514 -= arg0 * 4;
        }
        if (class100.field2430 > 0) {
            class100.field2430 -= arg0 * 4;
        }
        if (class100.field2430 == 0 && class103.field2514 == 0) {
            int var9 = (int) ((double) (2000 / arg0) * Math.random());
            if (var9 == 1) {
                class103.field2514 = 1024;
            }
            if (var9 == 0) {
                class100.field2430 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg0; var10++) {
            class70.field1635[var10] = class70.field1635[arg0 + var10];
        }
        for (int var11 = var2 - arg0; var11 < var2; var11++) {
            class70.field1635[var11] = (int) (Math.sin((double) class75.field1781 / 14.0D) * 16.0D + Math.sin((double) class75.field1781 / 15.0D) * 14.0D + Math.sin((double) class75.field1781 / 16.0D) * 12.0D);
            class75.field1781++;
        }
        class136.field3090 += arg0;
        int var12 = ((class94.field2229 & 0x1) + arg0) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class136.field3090 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class49.field1121[(var23 << 7) + var22] = 192;
        }
        class136.field3090 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = var14 * 128;
            int var20 = 0;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var20 += class49.field1121[var12 + var21 + var19];
                }
                if (var21 - var12 - 1 >= 0) {
                    var20 -= class49.field1121[var19 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class75.field1800[var19 + var21] = var20 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var12 + var17 < var2) {
                    var16 += class75.field1800[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class75.field1800[var15 + var18 - (var12 + 1) * 128];
                }
                if (var17 >= 0) {
                    class49.field1121[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1070(int arg0) {
        field3288 = null;
        field3298 = null;
        field3326 = null;
        field3322 = null;
        if (arg0 != -129) {
            field3318 = null;
        }
        field3293 = null;
        field3306 = null;
        field3304 = null;
        field3305 = null;
        field3314 = null;
        field3318 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public final void method1071(byte arg0) {
        field3292++;
        if (this.field3291) {
            return;
        }
        synchronized (this) {
            if (arg0 <= 89) {
                field3322 = null;
            }
            this.field3291 = true;
            this.notifyAll();
        }
        if (this.field3302 != null) {
            while (this.field3302.field866 == 0) {
                class6.method51(1L, -14344);
            }
            if (this.field3302.field866 == 1) {
                try {
                    ((Thread) this.field3302.field870).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3302 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[BIB)V")
    public final void method1072(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field3295++;
        if (this.field3291) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field3296.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
        if (arg3 != -52) {
            field3314 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "run", descriptor = "()V")
    public final void run() {
        field3289++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field3319 == this.field3316) {
                        if (this.field3291) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field3316 <= this.field3319) {
                        var2 = this.field3319 - this.field3316;
                    } else {
                        var2 = 5000 - this.field3316;
                    }
                    var3 = this.field3316;
                }
                if (var2 > 0) {
                    try {
                        this.field3323.write(this.field3325, var3, var2);
                    } catch (IOException var9) {
                        this.field3297 = true;
                    }
                    this.field3316 = (this.field3316 + var2) % 5000;
                    try {
                        if (this.field3319 == this.field3316) {
                            this.field3323.flush();
                        }
                    } catch (IOException var8) {
                        this.field3297 = true;
                    }
                }
            }
            try {
                if (this.field3296 != null) {
                    this.field3296.close();
                }
                if (this.field3323 != null) {
                    this.field3323.close();
                }
                if (this.field3321 != null) {
                    this.field3321.close();
                }
            } catch (IOException var7) {
            }
            this.field3325 = null;
        } catch (Exception var12) {
            class122.method921((byte) 90, null, var12);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I")
    public final int method1073(int arg0) throws IOException {
        field3312++;
        if (arg0 != 0) {
            field3288 = null;
        }
        return this.field3291 ? 0 : this.field3296.available();
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    public static final void method1074(int arg0) {
        field3324++;
        class29.field597.method267(-104);
        int var1 = class29.field597.method262(-1, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class29.field597.method262(-117, 2);
        if (var2 == 0) {
            class72.field1685[class58.field1294++] = 2047;
        } else if (arg0 < -17) {
            if (var2 == 1) {
                int var3 = class29.field597.method262(-13, 3);
                class116.field2696.method239(var3, false, 5591);
                int var4 = class29.field597.method262(-34, 1);
                if (var4 == 1) {
                    class72.field1685[class58.field1294++] = 2047;
                }
            } else if (var2 == 2) {
                int var5 = class29.field597.method262(91, 3);
                class116.field2696.method239(var5, true, 5591);
                int var6 = class29.field597.method262(60, 3);
                class116.field2696.method239(var6, true, 5591);
                int var7 = class29.field597.method262(-111, 1);
                if (var7 == 1) {
                    class72.field1685[class58.field1294++] = 2047;
                }
            } else if (var2 == 3) {
                int var8 = class29.field597.method262(-10, 1);
                int var9 = class29.field597.method262(55, 1);
                if (var9 == 1) {
                    class72.field1685[class58.field1294++] = 2047;
                }
                int var10 = class29.field597.method262(-125, 7);
                int var11 = class29.field597.method262(80, 7);
                class148.field3428 = class29.field597.method262(-111, 2);
                class116.field2696.method233(var8 == 1, 0, var10, var11);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
    public static final void method1075(boolean arg0) {
        field3311++;
        for (int var1 = 0; var1 < class58.field1294; var1++) {
            int var2 = class72.field1685[var1];
            class67 var3 = class125.field2902[var2];
            int var4 = class29.field597.method790((byte) 73);
            if ((var4 & 0x2) != 0) {
                var4 += class29.field597.method790((byte) 73) << 8;
            }
            class124.method927((byte) 127, var2, var3, var4);
        }
        if (arg0) {
            method1075(false);
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
    public static final void method1076(int arg0) {
        class148.field3437 = new class152();
        if (arg0 != 2847) {
            method1076(88);
        }
        field3310++;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)I")
    public final int method1077(int arg0) throws IOException {
        int var2 = -84 % ((arg0 + 64) / 45);
        field3300++;
        return this.field3291 ? 0 : this.field3296.read();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III[B)V")
    public final void method1078(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != 1) {
            return;
        }
        field3294++;
        if (this.field3291) {
            return;
        }
        if (this.field3297) {
            this.field3297 = false;
            throw new IOException();
        }
        if (this.field3325 == null) {
            this.field3325 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field3325[this.field3319] = arg3[arg0 + var6];
                this.field3319 = (this.field3319 + 1) % 5000;
                if ((this.field3316 + 4900) % 5000 == this.field3319) {
                    throw new IOException();
                }
            }
            if (this.field3302 == null) {
                this.field3302 = this.field3315.method123(this, 3, -109);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Ljava/net/Socket;Lcf;)V")
    public class145(Socket arg0, class21 arg1) throws IOException {
        this.field3321 = arg0;
        this.field3315 = arg1;
        this.field3321.setSoTimeout(30000);
        this.field3321.setTcpNoDelay(true);
        this.field3296 = this.field3321.getInputStream();
        this.field3323 = this.field3321.getOutputStream();
    }
}
