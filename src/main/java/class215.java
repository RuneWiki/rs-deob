import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class215 implements Runnable {

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    private int field3159 = 0;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    private int field3167 = 0;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Z")
    private boolean field3166 = false;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "Z")
    private boolean field3179 = false;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "Lnf;")
    private class61 field3178;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "Ljava/net/Socket;")
    private Socket field3171;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field3155;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3157;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[I")
    public static int[] field3158 = new int[1024];

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field3169 = 99;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Laj;")
    private class210 field3154;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "Lp;")
    public static class25 field3173;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "[B")
    private byte[] field3153;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "[I")
    public static int[] field3175;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1550(int arg0, int arg1) {
        field3170++;
        class119.field1668.method464(3398, arg0);
        class167.field2414.method464(3398, arg0);
        class124.field1801.method464(arg1 + 17598, arg0);
        if (arg1 != -14200) {
            method1560(-28, 0.769303895042754D);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 22)
    public final void method1551(byte arg0) throws IOException {
        field3161++;
        if (this.field3166) {
            return;
        }
        if (this.field3179) {
            this.field3179 = false;
            throw new IOException();
        } else if (arg0 < 39) {
            field3175 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([BIIB)V", line = 45)
    public final void method1552(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        if (arg3 != 33) {
            return;
        }
        field3177++;
        if (this.field3166) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field3155.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)I", line = 70)
    public final int method1553(int arg0) throws IOException {
        field3176++;
        if (this.field3166) {
            return 0;
        } else {
            if (arg0 != 0) {
                field3175 = (int[]) null;
            }
            return this.field3155.read();
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Ljava/net/Socket;Lnf;)V", line = 734)
    public class215(Socket arg0, class61 arg1) throws IOException {
        this.field3178 = arg1;
        this.field3171 = arg0;
        this.field3171.setSoTimeout(30000);
        this.field3171.setTcpNoDelay(true);
        this.field3155 = this.field3171.getInputStream();
        this.field3157 = this.field3171.getOutputStream();
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)I", line = 92)
    public final int method1554(int arg0) throws IOException {
        field3165++;
        if (this.field3166) {
            return 0;
        } else if (arg0 == -2) {
            return this.field3155.available();
        } else {
            return 90;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V", line = 119)
    public final void method1555(boolean arg0) {
        field3164++;
        if (this.field3166) {
            return;
        }
        if (arg0) {
            this.field3159 = -41;
        }
        synchronized (this) {
            this.field3166 = true;
            this.notifyAll();
        }
        if (this.field3154 != null) {
            while (this.field3154.field3056 == 0) {
                class184.method1283(1L, 10);
            }
            if (this.field3154.field3056 == 1) {
                try {
                    ((Thread) this.field3154.field3058).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field3154 = null;
    }

    @OriginalMember(owner = "client!ag", name = "finalize", descriptor = "()V", line = 155)
    protected final void finalize() {
        this.method1555(false);
        field3163++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILqf;II)V", line = 164)
    public static final void method1556(int arg0, int arg1, class359 arg2, int arg3, int arg4) {
        field3156++;
        class32.method228(0);
        if (class141.field2031) {
            class205.method1503(arg3, arg0, arg2.field5506 + arg3, arg2.field5560 + arg0);
        } else {
            class44.method326(arg3, arg0, arg2.field5506 + arg3, arg0 - -arg2.field5560);
        }
        if (class352.field5426 != 2 && class352.field5426 != 5 && class71.field1030 != null) {
            int var5;
            int var6;
            int var7;
            int var8;
            if (class86.field1208 == 4) {
                var5 = class194.field2823;
                var6 = (int) class36.field535 & 0x7FF;
                var7 = 256;
                var8 = class259.field3864;
            } else {
                var5 = class1.field55.field5165;
                var6 = (int) class36.field535 + class298.field4460 & 0x7FF;
                var8 = class1.field55.field5137;
                var7 = class281.field4271 + 256;
            }
            int var9 = 464 - (var5 / 32);
            int var10 = (var8 / 32) + 48;
            if (class141.field2031) {
                ((class325) class71.field1030).method2251(arg3, arg0, arg2.field5506, arg2.field5560, var10, var9, var6, var7, (class325) arg2.method2493(109, false));
            } else {
                ((class118) class71.field1030).method653(arg3, arg0, arg2.field5506, arg2.field5560, var10, var9, var6, var7, arg2.field5570, arg2.field5591);
            }
            if (class62.field901 != null) {
                for (int var11 = 0; var11 < class62.field901.field1589; var11++) {
                    if (class62.field901.field1576[var11] != null && class62.field901.field1586[var11] >> 28 == class321.field4835) {
                        int var12 = ((class62.field901.field1586[var11] & 0xFFFF32D) >> 14) - class272.field4123;
                        int var13 = (class62.field901.field1586[var11] & 0x3FFF) - class202.field2968;
                        if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                            int var14 = var12 * 4 - ((var8 / 32) - 2);
                            int var15 = var13 * 4 + (2 - var5 / 32);
                            class257.method1893(arg3, class62.field901.field1576[var11].field4350, arg0, var14, var15, -12193, arg2);
                        }
                    }
                }
            }
            for (int var16 = 0; var16 < class353.field5434; var16++) {
                int var17 = class278.field4230[var16] * 4 - (var8 / 32 - 2);
                int var18 = class2.field72[var16] * 4 - ((var5 / 32) - 2);
                class261 var19 = class30.method212(0, class248.field3698[var16]);
                if (var19.field3895 != null) {
                    var19 = var19.method1925(88);
                    if (var19 == null || var19.field3933 == -1) {
                        continue;
                    }
                }
                class257.method1893(arg3, var19.field3933, arg0, var17, var18, -12193, arg2);
            }
            for (int var20 = 0; var20 < 104; var20++) {
                for (int var21 = 0; var21 < 104; var21++) {
                    class16 var22 = class252.field3762[class321.field4835][var20][var21];
                    if (var22 != null) {
                        int var23 = var20 * 4 + 2 - (var8 / 32);
                        int var24 = var21 * 4 + 2 - (var5 / 32);
                        class257.method1894(arg2, arg0, -256, var24, arg3, class64.field940[0], var23);
                    }
                }
            }
            for (int var25 = 0; var25 < class166.field2384; var25++) {
                class181 var26 = class300.field4495[field3158[var25]];
                if (var26 != null && var26.method1256(19942)) {
                    class214 var27 = var26.field2609;
                    if (var27 != null && var27.field3142 != null) {
                        var27 = var27.method1539(false);
                    }
                    if (var27 != null && var27.field3097 && var27.field3136) {
                        int var28 = var26.field5137 / 32 - var8 / 32;
                        int var29 = var26.field5165 / 32 - (var5 / 32);
                        if (var27.field3132 == -1) {
                            class257.method1894(arg2, arg0, -256, var29, arg3, class64.field940[1], var28);
                        } else {
                            class257.method1893(arg3, var27.field3132, arg0, var28, var29, -12193, arg2);
                        }
                    }
                }
            }
            for (int var30 = 0; var30 < class265.field4053; var30++) {
                class228 var31 = class343.field5312[class227.field3426[var30]];
                if (var31 != null && var31.method1256(19942)) {
                    int var32 = var31.field5137 / 32 - (var8 / 32);
                    boolean var33 = false;
                    int var34 = var31.field5165 / 32 - (var5 / 32);
                    for (int var35 = 0; var35 < class110.field1608; var35++) {
                        if (var31.field3453.equals(class109.field1585[var35]) && class284.field4294[var35] != 0) {
                            var33 = true;
                            break;
                        }
                    }
                    boolean var36 = false;
                    for (int var37 = 0; var37 < class256.field3832; var37++) {
                        if (var31.field3453.equals(class132.field1942[var37].field2126)) {
                            var36 = true;
                            break;
                        }
                    }
                    boolean var38 = false;
                    if (class1.field55.field3431 != 0 && var31.field3431 != 0 && class1.field55.field3431 == var31.field3431) {
                        var38 = true;
                    }
                    if (var33) {
                        class257.method1894(arg2, arg0, -256, var34, arg3, class64.field940[3], var32);
                    } else if (var36) {
                        class257.method1894(arg2, arg0, -256, var34, arg3, class64.field940[5], var32);
                    } else if (var38) {
                        class257.method1894(arg2, arg0, -256, var34, arg3, class64.field940[4], var32);
                    } else {
                        class257.method1894(arg2, arg0, -256, var34, arg3, class64.field940[2], var32);
                    }
                }
            }
            int var39 = 0;
            class230[] var40 = class351.field5417;
            while (var39 < var40.length) {
                class230 var41 = var40[var39];
                if (var41 != null && var41.field3487 != 0 && class304.field4560 % 20 < 10) {
                    if (var41.field3487 == 1 && var41.field3480 >= 0 && class300.field4495.length > var41.field3480) {
                        class181 var42 = class300.field4495[var41.field3480];
                        if (var42 != null) {
                            int var43 = var42.field5137 / 32 - var8 / 32;
                            int var44 = var42.field5165 / 32 - (var5 / 32);
                            class72.method600(-104285653, arg3, arg2, 360000, arg0, var44, var41.field3490, var43);
                        }
                    }
                    if (var41.field3487 == 2) {
                        int var45 = (var41.field3492 - class202.field2968) * 4 + 2 - var5 / 32;
                        int var46 = (var41.field3481 - class272.field4123) * 4 + 2 - (var8 / 32);
                        int var47 = var41.field3486 * 4;
                        int var48 = var47 * var47;
                        class72.method600(-104285653, arg3, arg2, var48, arg0, var45, var41.field3490, var46);
                    }
                    if (var41.field3487 == 10 && var41.field3480 >= 0 && class343.field5312.length > var41.field3480) {
                        class228 var49 = class343.field5312[var41.field3480];
                        if (var49 != null) {
                            int var50 = var49.field5137 / 32 - (var8 / 32);
                            int var51 = var49.field5165 / 32 - (var5 / 32);
                            class72.method600(-104285653, arg3, arg2, 360000, arg0, var51, var41.field3490, var50);
                        }
                    }
                }
                var39++;
            }
            if (class86.field1208 != 4) {
                if (class3.field101 != 0) {
                    int var52 = class3.field101 * 4 + ((class1.field55.method1700(-126) + -1) * 2) + 2 - (var8 / 32);
                    int var53 = class358.field5478 * 4 + (class1.field55.method1700(-121) - 1) * 2 + 2 - (var5 / 32);
                    class257.method1894(arg2, arg0, -256, var53, arg3, class58.field847[class50.field757 ? 1 : 0], var52);
                }
                if (class141.field2031) {
                    class205.method1499(arg2.field5506 / 2 + arg3 - 1, arg2.field5560 / 2 + arg0 + -1, 3, 3, 16777215);
                } else {
                    class44.method317(arg2.field5506 / 2 + (arg3 - 1), arg2.field5560 / 2 + arg0 + -1, 3, 3, 16777215);
                }
            }
        } else if (class141.field2031) {
            class177 var54 = arg2.method2493(113, false);
            if (var54 != null) {
                var54.method642(arg3, arg0);
            }
        } else {
            class44.method324(arg3, arg0, 0, arg2.field5570, arg2.field5591);
        }
        int var55 = -65 / ((76 - arg4) / 45);
        class186.field2674[arg1] = true;
    }

    @OriginalMember(owner = "client!ag", name = "run", descriptor = "()V", line = 496)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label90: {
                    synchronized (this) {
                        label91: {
                            if (this.field3167 == this.field3159) {
                                if (this.field3166) {
                                    break label91;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            if (this.field3167 < this.field3159) {
                                var3 = 5000 - this.field3159;
                            } else {
                                var3 = this.field3167 - this.field3159;
                            }
                            var4 = this.field3159;
                            break label90;
                        }
                    }
                    try {
                        if (this.field3155 != null) {
                            this.field3155.close();
                        }
                        if (this.field3157 != null) {
                            this.field3157.close();
                        }
                        if (this.field3171 != null) {
                            this.field3171.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field3153 = null;
                    break;
                }
                if (var3 > 0) {
                    try {
                        this.field3157.write(this.field3153, var4, var3);
                    } catch (IOException var12) {
                        this.field3179 = true;
                    }
                    this.field3159 = (this.field3159 + var3) % 5000;
                    try {
                        if (this.field3167 == this.field3159) {
                            this.field3157.flush();
                        }
                    } catch (IOException var11) {
                        this.field3179 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class343.method2402((String) null, var15, -2);
        }
        field3160++;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V", line = 568)
    public static void method1557(byte arg0) {
        field3158 = null;
        field3173 = null;
        if (arg0 == -54) {
            field3175 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[BII)V", line = 584)
    public final void method1558(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3174++;
        if (this.field3166) {
            return;
        }
        if (this.field3179) {
            this.field3179 = false;
            throw new IOException();
        }
        if (this.field3153 == null) {
            this.field3153 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg0 != 5000) {
                this.field3167 = 16;
            }
            while (arg3 > var6) {
                this.field3153[this.field3167] = arg1[arg2 + var6];
                this.field3167 = (this.field3167 + 1) % 5000;
                if ((this.field3159 + 4900) % 5000 == this.field3167) {
                    throw new IOException();
                }
                var6++;
            }
            if (this.field3154 == null) {
                this.field3154 = this.field3178.method490(2, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lnj;B)V", line = 637)
    public static final void method1559(class217 arg0, byte arg1) {
        field3162++;
        long var2 = 0L;
        int var4 = 0;
        int var5 = -1;
        if (arg0.field3192 == 0) {
            var2 = class62.method503(arg0.field3197, arg0.field3194, arg0.field3201);
        }
        if (arg0.field3192 == 1) {
            var2 = class2.method14(arg0.field3197, arg0.field3194, arg0.field3201);
        }
        if (arg0.field3192 == 2) {
            var2 = class85.method693(arg0.field3197, arg0.field3194, arg0.field3201);
        }
        if (arg0.field3192 == 3) {
            var2 = class313.method2191(arg0.field3197, arg0.field3194, arg0.field3201);
        }
        int var6 = 0;
        if (arg1 < 96) {
            field3173 = (class25) null;
        }
        if (var2 != 0L) {
            var6 = (int) var2 >> 20 & 0x3;
            var5 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var4 = (int) var2 >> 14 & 0x1F;
        }
        arg0.field3200 = var6;
        arg0.field3193 = var4;
        arg0.field3196 = var5;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ID)V", line = 681)
    public static final void method1560(int arg0, double arg1) {
        if (class129.field1872 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class248.field3695[var3] = var4 > 255 ? 255 : var4;
            }
            class129.field1872 = arg1;
        }
        field3172++;
        if (arg0 != 0) {
            field3169 = 110;
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V", line = 707)
    public final void method1561(byte arg0) {
        field3168++;
        if (arg0 <= 60) {
            method1557((byte) -122);
        }
        if (!this.field3166) {
            this.field3155 = new class192();
            this.field3157 = new class134();
        }
    }
}
