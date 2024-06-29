import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class122 {

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    private int field1373 = 32;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Z")
    private boolean field1381 = false;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "J")
    private long field1371 = class641.method3604(false);

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    private int field1394 = 0;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "[Lcd;")
    private class283[] field1392 = new class283[8];

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "J")
    private long field1396 = 0L;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "[Lcd;")
    private class283[] field1400 = new class283[8];

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    private int field1401 = 0;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    private int field1399 = 0;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    private int field1395 = 0;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "Z")
    private boolean field1402 = true;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "J")
    private long field1393 = 0L;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[I")
    public static int[] field1372 = new int[16];

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Lrt;")
    public static class208 field1377;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Lcd;")
    private class283 field1389;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "[I")
    public int[] field1388;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([II)V", line = 5)
    private final void method714(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class81.field856) {
            var3 = arg1 << 1;
        }
        class652.method3681(arg0, 0, var3);
        this.field1401 -= arg1;
        if (this.field1389 != null && this.field1401 <= 0) {
            this.field1401 += class519.field7413 >> 4;
            class41.method215(this.field1389, 40);
            this.method718(193329573, this.field1389.method935(), this.field1389);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
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
                        class283 var10 = null;
                        class283 var11 = this.field1392[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class661 var12 = var11.field3597;
                                if (var12 == null || var12.field9405 <= var8) {
                                    var11.field3595 = true;
                                    int var13 = var11.method671();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field9405 += var13;
                                    }
                                    if (var4 >= this.field1373) {
                                        break label107;
                                    }
                                    class283 var14 = var11.method650();
                                    if (var14 != null) {
                                        int var15 = var11.field3596;
                                        while (var14 != null) {
                                            this.method718(193329573, var15 * var14.method935() >> 8, var14);
                                            var14 = var11.method651();
                                        }
                                    }
                                    class283 var16 = var11.field3598;
                                    var11.field3598 = null;
                                    if (var10 == null) {
                                        this.field1392[var7] = var16;
                                    } else {
                                        var10.field3598 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1400[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3598;
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
                class283 var18 = this.field1392[var17];
                this.field1392[var17] = this.field1400[var17] = null;
                while (var18 != null) {
                    class283 var19 = var18.field3598;
                    var18.field3598 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1401 < 0) {
            this.field1401 = 0;
        }
        if (this.field1389 != null) {
            this.field1389.method657(arg0, 0, arg1);
        }
        this.field1371 = class641.method3604(false);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 164)
    public final synchronized void method715(int arg0) {
        field1387++;
        if (this.field1381) {
            return;
        }
        long var2 = class641.method3604(false);
        try {
            if (var2 > this.field1371 + 500000L) {
                this.field1371 = var2 - 500000L;
            }
            while (var2 > this.field1371 + 5000L) {
                this.method720(0, 256);
                this.field1371 += (256000 / class519.field7413);
            }
        } catch (Exception var7) {
            this.field1371 = var2;
        }
        if (this.field1388 == null) {
            return;
        }
        if (arg0 <= 20) {
            field1372 = null;
        }
        try {
            if (this.field1393 != 0L) {
                if (this.field1393 > var2) {
                    return;
                }
                this.method616(this.field1398);
                this.field1393 = 0L;
                this.field1402 = true;
            }
            int var4 = this.method617();
            if (this.field1395 < (this.field1394 - var4)) {
                this.field1395 = this.field1394 - var4;
            }
            int var5 = this.field1403 + this.field1397;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field1398 < (var5 + 256)) {
                this.field1398 += 1024;
                if (this.field1398 > 16384) {
                    this.field1398 = 16384;
                }
                this.method621();
                this.method616(this.field1398);
                var4 = 0;
                if ((var5 + 256) > this.field1398) {
                    var5 = this.field1398 - 256;
                    this.field1403 = var5 - this.field1397;
                }
                this.field1402 = true;
            }
            while (var5 > var4) {
                this.method714(this.field1388, 256);
                this.method618();
                var4 += 256;
            }
            if (var2 > this.field1396) {
                if (this.field1402) {
                    this.field1402 = false;
                } else if (this.field1395 == 0 && this.field1399 == 0) {
                    this.method621();
                    this.field1393 = var2 + 2000L;
                    return;
                } else {
                    this.field1403 = Math.min(this.field1399, this.field1395);
                    this.field1399 = this.field1395;
                }
                this.field1396 = var2 + 2000L;
                this.field1395 = 0;
            }
            this.field1394 = var4;
        } catch (Exception var6) {
            this.method621();
            this.field1393 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZII)Lva;", line = 282)
    public static final class454 method716(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1374++;
        int var5 = -100 / ((31 - arg0) / 55);
        class454 var6 = new class454();
        var6.field6291 = arg3;
        var6.field6297 = arg1;
        class234.field2982.method3235((long) arg4, -1, var6);
        class201.method1223(arg3, 65);
        class382 var7 = class505.method2903(arg4, 65535);
        if (var7 != null) {
            class567.method3207((byte) -69, var7);
        }
        if (class418.field5557 != null) {
            class567.method3207((byte) -69, class418.field5557);
            class418.field5557 = null;
        }
        class150.method820(53);
        if (var7 != null) {
            class57.method387(119, var7, !arg2);
        }
        if (!arg2) {
            class364.method2003(arg3);
        }
        if (!arg2 && class397.field5320 != -1) {
            class62.method422((byte) -122, class397.field5320, 1);
        }
        return var6;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()I", line = 321)
    public int method617() throws Exception {
        field1386++;
        return this.field1398;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 330)
    public void method620(Component arg0) throws Exception {
        field1378++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lcd;I)V", line = 342)
    public final synchronized void method717(class283 arg0, int arg1) {
        if (arg1 != 16128) {
            this.method715(-1);
        }
        field1390++;
        this.field1389 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILcd;)V", line = 356)
    private final void method718(int arg0, int arg1, class283 arg2) {
        field1385++;
        int var4 = arg1 >> 5;
        if (arg0 != 193329573) {
            this.method715(89);
        }
        class283 var5 = this.field1400[var4];
        if (var5 == null) {
            this.field1392[var4] = arg2;
        } else {
            var5.field3598 = arg2;
        }
        this.field1400[var4] = arg2;
        arg2.field3596 = arg1;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()V", line = 377)
    public void method618() throws Exception {
        field1383++;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 387)
    public void method616(int arg0) throws Exception {
        field1379++;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "()V", line = 404)
    public void method621() {
        field1384++;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V", line = 413)
    public final synchronized void method719(int arg0) {
        if (arg0 != -5908) {
            field1375 = -26;
        }
        this.field1402 = true;
        field1380++;
        try {
            this.method619();
        } catch (Exception var2) {
            this.method621();
            this.field1393 = class641.method3604(false) + 2000L;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V", line = 443)
    private final void method720(int arg0, int arg1) {
        field1382++;
        if (arg0 != 0) {
            method722((byte) 8);
        }
        this.field1401 -= arg1;
        if (this.field1401 < 0) {
            this.field1401 = 0;
        }
        if (this.field1389 != null) {
            this.field1389.method639(arg1);
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "()V", line = 473)
    public void method619() throws Exception {
        field1391++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V", line = 496)
    public final synchronized void method721(boolean arg0) {
        if (class294.field3868 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class294.field3868.field3245[var3] == this) {
                    class294.field3868.field3245[var3] = null;
                }
                if (class294.field3868.field3245[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class294.field3868.field3244 = true;
                while (class294.field3868.field3246) {
                    class370.method2025(-1, 50L);
                }
                class294.field3868 = null;
            }
        }
        field1370++;
        if (arg0) {
            this.field1396 = -111L;
        }
        this.method621();
        this.field1381 = true;
        this.field1388 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 544)
    public static void method722(byte arg0) {
        field1372 = null;
        field1377 = null;
        if (arg0 >= -94) {
            method716(-68, -52, false, -38, -98);
        }
    }
}
