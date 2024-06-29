import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class57 {

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    private int field1399 = 32;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "J")
    private long field1404 = class26.method209((byte) -66);

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "J")
    private long field1407 = 0L;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "Z")
    private boolean field1412 = true;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "[Lmd;")
    private class87[] field1415 = new class87[8];

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "[Lmd;")
    private class87[] field1417 = new class87[8];

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "J")
    private long field1418 = 0L;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    private int field1421 = 0;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    private int field1422 = 0;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    private int field1420 = 0;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    private int field1411 = 0;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1391 = 0;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field1405 = -1;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "Lja;")
    private static class62 field1424 = class30.method243(43, "Connecting to update server");

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lja;")
    public static class62 field1395 = field1424;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field1428 = 0;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "Lpd;")
    public static class108 field1430;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lea;")
    public static class29 field1401;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Lic;")
    public static class58 field1389;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Lmd;")
    private class87 field1394;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[I")
    public static int[] field1397;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "[I")
    public int[] field1400;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()I")
    public int method286() throws Exception {
        field1393++;
        return this.field1426;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()V")
    public void method287() throws Exception {
        field1406++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public void method281(int arg0) throws Exception {
        field1402++;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public final synchronized void method388(int arg0) {
        if (class9.field243 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class9.field243.field1042[var3] == this) {
                    class9.field243.field1042[var3] = null;
                }
                if (class9.field243.field1042[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class9.field243.field1052 = true;
                while (class9.field243.field1047) {
                    class146.method1168(-19127, 50L);
                }
                class9.field243 = null;
            }
        }
        this.method284();
        field1396++;
        this.field1400 = null;
        if (arg0 < 119) {
            this.method284();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public final void method389(byte arg0) {
        this.field1412 = true;
        field1408++;
        if (arg0 >= -56) {
            this.field1394 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([II)V")
    private final void method390(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class8.field231) {
            var3 = arg1 << 1;
        }
        class78.method625(arg0, 0, var3);
        this.field1420 -= arg1;
        if (this.field1394 != null && this.field1420 <= 0) {
            this.field1420 += class144.field3371 >> 4;
            class119.method948(this.field1394, 92);
            this.method391((byte) -95, this.field1394.method673(), this.field1394);
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
                        class87 var10 = null;
                        class87 var11 = this.field1415[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class61 var12 = var11.field2076;
                                if (var12 == null || var12.field1481 <= var8) {
                                    var11.field2075 = true;
                                    int var13 = var11.method42();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1481 += var13;
                                    }
                                    if (var4 >= this.field1399) {
                                        break label107;
                                    }
                                    class87 var14 = var11.method30();
                                    if (var14 != null) {
                                        int var15 = var11.field2077;
                                        while (var14 != null) {
                                            this.method391((byte) 49, var15 * var14.method673() >> 8, var14);
                                            var14 = var11.method35();
                                        }
                                    }
                                    class87 var16 = var11.field2074;
                                    var11.field2074 = null;
                                    if (var10 == null) {
                                        this.field1415[var7] = var16;
                                    } else {
                                        var10.field2074 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1417[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2074;
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
                class87 var18 = this.field1415[var17];
                this.field1415[var17] = this.field1417[var17] = null;
                while (var18 != null) {
                    class87 var19 = var18.field2074;
                    var18.field2074 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1420 < 0) {
            this.field1420 = 0;
        }
        if (this.field1394 != null) {
            this.field1394.method44(arg0, 0, arg1);
        }
        this.field1404 = class26.method209((byte) -15);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BILmd;)V")
    private final void method391(byte arg0, int arg1, class87 arg2) {
        int var4 = arg1 >> 5;
        field1423++;
        class87 var5 = this.field1417[var4];
        int var6 = 82 / ((-arg0 - 28) / 61);
        if (var5 == null) {
            this.field1415[var4] = arg2;
        } else {
            var5.field2074 = arg2;
        }
        this.field1417[var4] = arg2;
        arg2.field2077 = arg1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V")
    private final void method392(int arg0, int arg1) {
        field1427++;
        this.field1420 -= arg0;
        if (this.field1420 < 0) {
            this.field1420 = 0;
        }
        if (this.field1394 != null) {
            this.field1394.method41(arg0);
        }
        if (arg1 != 0) {
            this.field1411 = 89;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lmd;I)V")
    public final synchronized void method393(class87 arg0, int arg1) {
        if (arg1 != -7764) {
            this.method392(23, 117);
        }
        field1390++;
        this.field1394 = arg0;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()V")
    public void method284() {
        field1403++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public final synchronized void method394(boolean arg0) {
        field1414++;
        if (this.field1400 == null) {
            return;
        }
        long var2 = class26.method209((byte) -98);
        try {
            if (this.field1407 != 0L) {
                if (this.field1407 > var2) {
                    return;
                }
                this.method281(this.field1426);
                this.field1412 = true;
                this.field1407 = 0L;
            }
            int var4 = this.method286();
            if (this.field1421 < this.field1422 - var4) {
                this.field1421 = this.field1422 - var4;
            }
            if (arg0) {
                return;
            }
            int var5 = this.field1425 + this.field1413;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field1426) {
                this.field1426 += 1024;
                var4 = 0;
                if (this.field1426 > 16384) {
                    this.field1426 = 16384;
                }
                this.method284();
                this.method281(this.field1426);
                this.field1412 = true;
                if (this.field1426 < var5 + 256) {
                    var5 = this.field1426 - 256;
                    this.field1413 = var5 - this.field1425;
                }
            }
            while (var4 < var5) {
                this.method390(this.field1400, 256);
                this.method283();
                var4 += 256;
            }
            if (var2 > this.field1418) {
                if (this.field1412) {
                    this.field1412 = false;
                } else if (this.field1421 == 0 && this.field1411 == 0) {
                    this.method284();
                    this.field1407 = var2 + 2000L;
                    return;
                } else {
                    this.field1413 = Math.min(this.field1411, this.field1421);
                    this.field1411 = this.field1421;
                }
                this.field1421 = 0;
                this.field1418 = var2 + 2000L;
            }
            this.field1422 = var4;
        } catch (Exception var7) {
            this.method284();
            this.field1407 = var2 + 2000L;
        }
        try {
            if (var2 > this.field1404 + 500000L) {
                var2 = this.field1404;
            }
            while (this.field1404 + 5000L < var2) {
                this.method392(256, 0);
                this.field1404 += 256000 / class144.field3371;
            }
        } catch (Exception var6) {
            this.field1404 = var2;
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()V")
    public void method283() throws Exception {
        field1398++;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public static final void method395(int arg0) {
        field1429++;
        int var1 = class38.field879.method811(7, 8);
        if (var1 < class147.field3460) {
            for (int var2 = var1; var2 < class147.field3460; var2++) {
                class42.field989[class134.field3088++] = class141.field3311[var2];
            }
        }
        if (var1 > class147.field3460) {
            throw new RuntimeException("gppov1");
        }
        class147.field3460 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class141.field3311[var3];
            class115 var5 = class52.field1200[var4];
            int var6 = class38.field879.method811(arg0 - 249, 1);
            if (var6 == 0) {
                class141.field3311[class147.field3460++] = var4;
                var5.field180 = class86.field2060;
            } else {
                int var7 = class38.field879.method811(arg0 - 249, 2);
                if (var7 == 0) {
                    class141.field3311[class147.field3460++] = var4;
                    var5.field180 = class86.field2060;
                    class38.field894[class34.field814++] = var4;
                } else if (var7 == 1) {
                    class141.field3311[class147.field3460++] = var4;
                    var5.field180 = class86.field2060;
                    int var8 = class38.field879.method811(arg0 ^ 0x107, 3);
                    var5.method60(false, (byte) -102, var8);
                    int var9 = class38.field879.method811(arg0 ^ 0x107, 1);
                    if (var9 == 1) {
                        class38.field894[class34.field814++] = var4;
                    }
                } else if (var7 == 2) {
                    class141.field3311[class147.field3460++] = var4;
                    var5.field180 = class86.field2060;
                    int var10 = class38.field879.method811(7, 3);
                    var5.method60(true, (byte) -121, var10);
                    int var11 = class38.field879.method811(arg0 ^ 0x107, 3);
                    var5.method60(true, (byte) -85, var11);
                    int var12 = class38.field879.method811(7, 1);
                    if (var12 == 1) {
                        class38.field894[class34.field814++] = var4;
                    }
                } else if (var7 == 3) {
                    class42.field989[class134.field3088++] = var4;
                }
            }
        }
        if (arg0 != 256) {
            field1430 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method285(Component arg0) throws Exception {
        field1416++;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public final synchronized void method396(int arg0) {
        this.field1412 = true;
        try {
            this.method287();
        } catch (Exception var2) {
            this.method284();
            this.field1407 = class26.method209((byte) 122) + 2000L;
        }
        field1392++;
        if (arg0 != 906) {
            this.method392(-111, -32);
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    public static void method397(int arg0) {
        field1401 = null;
        field1424 = null;
        field1430 = null;
        field1397 = null;
        field1389 = null;
        field1395 = null;
        if (arg0 <= 85) {
            field1405 = -1;
        }
    }
}
