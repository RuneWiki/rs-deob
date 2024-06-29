import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class86 {

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Z")
    private boolean field1494 = false;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    private int field1497 = 32;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "J")
    private long field1488 = class211.method1419(12921);

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "Z")
    private boolean field1512 = true;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    private int field1515 = 0;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    private int field1511 = 0;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    private int field1508 = 0;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "[Lbl;")
    private class458[] field1516 = new class458[8];

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "J")
    private long field1517 = 0L;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "[Lbl;")
    private class458[] field1510 = new class458[8];

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    private int field1514 = 0;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "J")
    private long field1519 = 0L;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field1487 = 1339;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "[I")
    public static int[] field1499 = new int[4096];

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "[[Z")
    public static boolean[][] field1482 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
    public static int[] field1486 = new int[4];

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Lpi;")
    public static class342 field1496 = new class342("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "Lko;")
    public static class347 field1505;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "Lbl;")
    private class458 field1507;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[I")
    public int[] field1489;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "[[[I")
    public static int[][][] field1503;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public final synchronized void method663(int arg0) {
        if (class364.field5515 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class364.field5515.field2861[var3] == this) {
                    class364.field5515.field2861[var3] = null;
                }
                if (class364.field5515.field2861[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class364.field5515.field2862 = true;
                while (class364.field5515.field2866) {
                    class71.method583(50L, 39);
                }
                class364.field5515 = null;
            }
        }
        field1493++;
        this.method672();
        if (arg0 == 32) {
            this.field1489 = null;
            this.field1494 = true;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public final void method664(int arg0) {
        field1481++;
        this.field1512 = true;
        if (arg0 < 30) {
            field1482 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lko;")
    public static final class347 method665(int arg0, int arg1) {
        field1483++;
        if (arg0 > -19) {
            return null;
        }
        class347[] var2 = class419.method2535(-87);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class347 var4 = var2[var3];
            if (var4.field5194 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
    private final void method666(int arg0, int arg1) {
        field1484++;
        this.field1514 -= arg1;
        if (this.field1514 < arg0) {
            this.field1514 = 0;
        }
        if (this.field1507 != null) {
            this.field1507.method2041(arg1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILbw;)V")
    public static final void method667(int arg0, class483 arg1) {
        if (arg0 == -22129) {
            field1498++;
            class3.field101 = arg1;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
    public static final void method668(int arg0) {
        field1479++;
        if (class514.field7563) {
            return;
        }
        class421.method2548(-118, class40.field733);
        if (arg0 <= 34) {
            field1499 = null;
        }
        if (class268.field3870 != null) {
            class421.method2548(-101, class268.field3870);
        }
        class514.field7563 = true;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lbl;I)V")
    public final synchronized void method669(class458 arg0, int arg1) {
        if (arg1 == 0) {
            this.field1507 = arg0;
            field1501++;
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public final synchronized void method670(int arg0) {
        field1495++;
        if (this.field1494) {
            return;
        }
        long var2 = class211.method1419(12921);
        try {
            if (var2 > this.field1488 + 500000L) {
                this.field1488 = var2 - 500000L;
            }
            while (var2 > this.field1488 + 5000L) {
                this.method666(arg0 ^ 0xFFFFD235, 256);
                this.field1488 += (256000 / class256.field3725);
            }
        } catch (Exception var7) {
            this.field1488 = var2;
        }
        if (this.field1489 == null) {
            return;
        }
        try {
            if (this.field1519 != 0L) {
                if (this.field1519 > var2) {
                    return;
                }
                this.method674(this.field1509);
                this.field1512 = true;
                this.field1519 = 0L;
            }
            int var4 = this.method677();
            if (this.field1515 < (this.field1508 - var4)) {
                this.field1515 = this.field1508 - var4;
            }
            int var5 = this.field1518 + this.field1513;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field1509 < var5 + 256) {
                this.field1509 += 1024;
                if (this.field1509 > 16384) {
                    this.field1509 = 16384;
                }
                this.method672();
                this.method674(this.field1509);
                var4 = 0;
                if (var5 + 256 > this.field1509) {
                    var5 = this.field1509 - 256;
                    this.field1513 = var5 - this.field1518;
                }
                this.field1512 = true;
            }
            while (var4 < var5) {
                this.method673(this.field1489, 256);
                this.method676();
                var4 += 256;
            }
            if (arg0 != -11723) {
                field1496 = null;
            }
            if (this.field1517 < var2) {
                if (this.field1512) {
                    this.field1512 = false;
                } else if (this.field1515 == 0 && this.field1511 == 0) {
                    this.method672();
                    this.field1519 = var2 + 2000L;
                    return;
                } else {
                    this.field1513 = Math.min(this.field1511, this.field1515);
                    this.field1511 = this.field1515;
                }
                this.field1515 = 0;
                this.field1517 = var2 + 2000L;
            }
            this.field1508 = var4;
        } catch (Exception var6) {
            this.method672();
            this.field1519 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method671(Component arg0) throws Exception {
        field1500++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
    public void method672() {
        field1485++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([II)V")
    private final void method673(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class320.field4899) {
            var3 = arg1 << 1;
        }
        class73.method590(arg0, 0, var3);
        this.field1514 -= arg1;
        if (this.field1507 != null && this.field1514 <= 0) {
            this.field1514 += class256.field3725 >> 4;
            class42.method422((byte) 104, this.field1507);
            this.method681((byte) -123, this.field1507, this.field1507.method2729());
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
                        class458 var10 = null;
                        class458 var11 = this.field1516[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class192 var12 = var11.field6862;
                                if (var12 == null || var12.field2853 <= var8) {
                                    var11.field6864 = true;
                                    int var13 = var11.method2034();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2853 += var13;
                                    }
                                    if (var4 >= this.field1497) {
                                        break label107;
                                    }
                                    class458 var14 = var11.method2033();
                                    if (var14 != null) {
                                        int var15 = var11.field6863;
                                        while (var14 != null) {
                                            this.method681((byte) -96, var14, var15 * var14.method2729() >> 8);
                                            var14 = var11.method2044();
                                        }
                                    }
                                    class458 var16 = var11.field6865;
                                    var11.field6865 = null;
                                    if (var10 == null) {
                                        this.field1516[var7] = var16;
                                    } else {
                                        var10.field6865 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1510[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field6865;
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
                class458 var18 = this.field1516[var17];
                this.field1516[var17] = this.field1510[var17] = null;
                while (var18 != null) {
                    class458 var19 = var18.field6865;
                    var18.field6865 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1514 < 0) {
            this.field1514 = 0;
        }
        if (this.field1507 != null) {
            this.field1507.method2037(arg0, 0, arg1);
        }
        this.field1488 = class211.method1419(12921);
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
    public void method674(int arg0) throws Exception {
        field1480++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Lqn;")
    public static final class45 method675(byte arg0, int arg1) {
        field1504++;
        if (arg0 != -49) {
            method668(108);
        }
        if (arg1 == 0) {
            return new class164();
        } else if (arg1 == 1) {
            return new class407();
        } else if (arg1 == 2) {
            return new class475();
        } else if (arg1 == 3) {
            return new class488();
        } else if (arg1 == 4) {
            return new class406();
        } else if (arg1 == 5) {
            return new class171();
        } else if (arg1 == 6) {
            return new class232();
        } else if (arg1 == 7) {
            return new class228();
        } else if (arg1 == 8) {
            return new class129();
        } else if (arg1 == 9) {
            return new class51();
        } else if (arg1 == 10) {
            return new class446();
        } else if (arg1 == 11) {
            return new class528();
        } else if (arg1 == 12) {
            return new class283();
        } else if (arg1 == 13) {
            return new class443();
        } else if (arg1 == 14) {
            return new class464();
        } else if (arg1 == 15) {
            return new class59();
        } else if (arg1 == 16) {
            return new class98();
        } else if (arg1 == 17) {
            return new class323();
        } else if (arg1 == 18) {
            return new class433();
        } else if (arg1 == 19) {
            return new class12();
        } else if (arg1 == 20) {
            return new class373();
        } else if (arg1 == 21) {
            return new class9();
        } else if (arg1 == 22) {
            return new class97();
        } else if (arg1 == 23) {
            return new class62();
        } else if (arg1 == 24) {
            return new class378();
        } else if (arg1 == 25) {
            return new class260();
        } else if (arg1 == 26) {
            return new class317();
        } else if (arg1 == 27) {
            return new class423();
        } else if (arg1 == 28) {
            return new class515();
        } else if (arg1 == 29) {
            return new class212();
        } else if (arg1 == 30) {
            return new class123();
        } else if (arg1 == 31) {
            return new class87();
        } else if (arg1 == 32) {
            return new class265();
        } else if (arg1 == 33) {
            return new class430();
        } else if (arg1 == 34) {
            return new class25();
        } else if (arg1 == 35) {
            return new class280();
        } else if (arg1 == 36) {
            return new class399();
        } else if (arg1 == 37) {
            return new class258();
        } else if (arg1 == 38) {
            return new class5();
        } else if (arg1 == 39) {
            return new class425();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
    public void method676() throws Exception {
        field1506++;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()I")
    public int method677() throws Exception {
        field1492++;
        return this.field1509;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
    public final synchronized void method678(boolean arg0) {
        field1491++;
        if (arg0) {
            method665(63, -118);
        }
        this.field1512 = true;
        try {
            this.method680();
        } catch (Exception var2) {
            this.method672();
            this.field1519 = class211.method1419(12921) + 2000L;
        }
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V")
    public static void method679(int arg0) {
        field1503 = null;
        field1482 = null;
        field1499 = null;
        field1486 = null;
        field1496 = null;
        field1505 = null;
        if (arg0 != -11454) {
            method679(-124);
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()V")
    public void method680() throws Exception {
        field1502++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLbl;I)V")
    private final void method681(byte arg0, class458 arg1, int arg2) {
        field1490++;
        int var4 = 22 / ((arg0 + 58) / 32);
        int var5 = arg2 >> 5;
        class458 var6 = this.field1510[var5];
        if (var6 == null) {
            this.field1516[var5] = arg1;
        } else {
            var6.field6865 = arg1;
        }
        this.field1510[var5] = arg1;
        arg1.field6863 = arg2;
    }
}
