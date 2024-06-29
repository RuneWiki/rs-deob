import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class91 {

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    private int field1380 = 32;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "Z")
    private boolean field1401 = false;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "J")
    private long field1387 = class304.method2128((byte) -128);

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "J")
    private long field1406 = 0L;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    private int field1413 = 0;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "Z")
    private boolean field1411 = true;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    private int field1410 = 0;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "[Lba;")
    private class178[] field1414 = new class178[8];

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "J")
    private long field1418 = 0L;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    private int field1409 = 0;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    private int field1417 = 0;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "[Lba;")
    private class178[] field1412 = new class178[8];

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field1403 = -1;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field1404 = 3;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1407 = "Loading wordpack - ";

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "F")
    public static float field1388;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Lba;")
    private class178 field1386;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Lkb;")
    public static class39 field1384;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "[I")
    public int[] field1383;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V", line = 6)
    public void method7() throws Exception {
        field1391++;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "()V", line = 13)
    public void method1() {
        field1398++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 20)
    public final synchronized void method653(int arg0) {
        field1405++;
        int var2 = -27 % ((arg0 - 33) / 48);
        this.field1411 = true;
        try {
            this.method7();
        } catch (Exception var4) {
            this.method1();
            this.field1418 = class304.method2128((byte) -102) + 2000L;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V", line = 39)
    private final void method654(int arg0, int arg1) {
        this.field1410 -= arg0;
        if (this.field1410 < 0) {
            this.field1410 = 0;
        }
        if (this.field1386 != null) {
            this.field1386.method288(arg0);
        }
        field1402++;
        if (arg1 != 1) {
            this.method661((int[]) null, -18);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "()V", line = 59)
    public void method3() throws Exception {
        field1400++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 67)
    public final synchronized void method655(byte arg0) {
        field1389++;
        if (this.field1401) {
            return;
        }
        long var2 = class304.method2128((byte) -68);
        try {
            if (var2 > (this.field1387 + 500000L)) {
                this.field1387 = var2 - 500000L;
            }
            while (var2 > (this.field1387 + 5000L)) {
                this.method654(256, 1);
                this.field1387 += (long) (256000 / class264.field4185);
            }
        } catch (Exception var9) {
            this.field1387 = var2;
        }
        if (this.field1383 == null) {
            return;
        }
        try {
            if (this.field1418 != 0L) {
                if (var2 < this.field1418) {
                    return;
                }
                this.method5(this.field1415);
                this.field1411 = true;
                this.field1418 = 0L;
            }
            int var5 = this.method6();
            int var6 = this.field1416 + this.field1408;
            if ((var6 + 256) > 16384) {
                var6 = 16128;
            }
            if (this.field1417 - var5 > this.field1413) {
                this.field1413 = this.field1417 - var5;
            }
            if (var6 + 256 > this.field1415) {
                this.field1415 += 1024;
                var5 = 0;
                if (this.field1415 > 16384) {
                    this.field1415 = 16384;
                }
                this.method1();
                this.method5(this.field1415);
                this.field1411 = true;
                if (var6 + 256 > this.field1415) {
                    var6 = this.field1415 - 256;
                    this.field1408 = var6 - this.field1416;
                }
            }
            while (var6 > var5) {
                this.method661(this.field1383, 256);
                this.method3();
                var5 += 256;
            }
            if (this.field1406 < var2) {
                if (this.field1411) {
                    this.field1411 = false;
                } else if (this.field1413 == 0 && this.field1409 == 0) {
                    this.method1();
                    this.field1418 = var2 + 2000L;
                    return;
                } else {
                    this.field1408 = Math.min(this.field1409, this.field1413);
                    this.field1409 = this.field1413;
                }
                this.field1413 = 0;
                this.field1406 = var2 + 2000L;
            }
            if (arg0 > -117) {
                field1403 = -55;
            }
            this.field1417 = var5;
        } catch (Exception var8) {
            this.method1();
            this.field1418 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V", line = 184)
    public final void method656(byte arg0) {
        if (arg0 != 10) {
            this.field1386 = (class178) null;
        }
        this.field1411 = true;
        field1390++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lkb;ZLrg;ZLkb;)V", line = 195)
    public static final void method657(class39 arg0, boolean arg1, class104 arg2, boolean arg3, class39 arg4) {
        class236.field3742 = arg0;
        class227.field3600 = arg1;
        class145.field2164 = arg4;
        if (!arg3) {
            method663((byte) 94, (class39) null);
        }
        field1397++;
        int var5 = class236.field3742.method271((byte) -115) - 1;
        class239.field3786 = class236.field3742.method261(-121, var5) + var5 * 256;
        class164.field2663 = new String[] { null, null, null, null, class107.field1617 };
        class255.field4044 = arg2;
        class44.field605 = new String[] { null, null, class172.field2732, null, null };
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V", line = 214)
    public void method5(int arg0) throws Exception {
        field1381++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 221)
    public void method4(Component arg0) throws Exception {
        field1385++;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V", line = 230)
    public static void method658(byte arg0) {
        if (arg0 >= 50) {
            field1384 = null;
            field1407 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lba;B)V", line = 241)
    public final synchronized void method659(class178 arg0, byte arg1) {
        if (arg1 <= 5) {
            this.method661((int[]) null, -2);
        }
        field1399++;
        this.field1386 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lok;I)Lok;", line = 256)
    public static final class160 method660(class160 arg0, int arg1) {
        field1394++;
        class160 var2 = client.method1894(arg0);
        if (arg1 == 2000) {
            if (var2 == null) {
                var2 = arg0.field2499;
            }
            return var2;
        } else {
            return (class160) null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([II)V", line = 275)
    private final void method661(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class98.field1499) {
            var3 = arg1 << 1;
        }
        class213.method1555(arg0, 0, var3);
        this.field1410 -= arg1;
        if (this.field1386 != null && this.field1410 <= 0) {
            this.field1410 += class264.field4185 >> 4;
            class5.method24(0, this.field1386);
            this.method662(this.field1386, this.field1386.method967(), 256);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class178 var10 = null;
                        class178 var11 = this.field1412[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class205 var12 = var11.field2885;
                                if (var12 == null || var12.field3343 <= var8) {
                                    var11.field2884 = true;
                                    int var13 = var11.method282();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3343 += var13;
                                    }
                                    if (var4 >= this.field1380) {
                                        break label105;
                                    }
                                    class178 var14 = var11.method281();
                                    if (var14 != null) {
                                        int var15 = var11.field2883;
                                        while (var14 != null) {
                                            this.method662(var14, var15 * var14.method967() >> 8, 256);
                                            var14 = var11.method287();
                                        }
                                    }
                                    class178 var16 = var11.field2882;
                                    var11.field2882 = null;
                                    if (var10 == null) {
                                        this.field1412[var7] = var16;
                                    } else {
                                        var10.field2882 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1414[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2882;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class178 var18 = this.field1412[var17];
                this.field1412[var17] = this.field1414[var17] = null;
                while (var18 != null) {
                    class178 var19 = var18.field2882;
                    var18.field2882 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1410 < 0) {
            this.field1410 = 0;
        }
        if (this.field1386 != null) {
            this.field1386.method284(arg0, 0, arg1);
        }
        this.field1387 = class304.method2128((byte) -109);
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "()I", line = 435)
    public int method6() throws Exception {
        field1379++;
        return this.field1415;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lba;II)V", line = 448)
    private final void method662(class178 arg0, int arg1, int arg2) {
        int var4 = arg1 >> 5;
        field1392++;
        if (arg2 != 256) {
            this.method655((byte) -77);
        }
        class178 var5 = this.field1414[var4];
        if (var5 == null) {
            this.field1412[var4] = arg0;
        } else {
            var5.field2882 = arg0;
        }
        this.field1414[var4] = arg0;
        arg0.field2883 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLkb;)V", line = 468)
    public static final void method663(byte arg0, class39 arg1) {
        field1382++;
        int var2 = -98 % ((arg0 + 63) / 56);
        class23.field337 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V", line = 484)
    public final synchronized void method664(int arg0) {
        if (class342.field5323 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class342.field5323.field5060[var3] == this) {
                    class342.field5323.field5060[var3] = null;
                }
                if (class342.field5323.field5060[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class342.field5323.field5058 = true;
                while (class342.field5323.field5057) {
                    class20.method128(0, 50L);
                }
                class342.field5323 = null;
            }
        }
        field1395++;
        this.method1();
        if (arg0 != -1058) {
            this.method653(-59);
        }
        this.field1401 = true;
        this.field1383 = null;
    }
}
