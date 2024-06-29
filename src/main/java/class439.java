import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class439 {

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Z")
    private boolean field6472 = false;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    private int field6480 = 32;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "J")
    private long field6478 = class246.method1483(5957);

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "J")
    private long field6493 = 0L;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Z")
    private boolean field6492 = true;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "J")
    private long field6498 = 0L;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "[Lad;")
    private class293[] field6500 = new class293[8];

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    private int field6495 = 0;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    private int field6502 = 0;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "[Lad;")
    private class293[] field6503 = new class293[8];

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    private int field6504 = 0;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    private int field6501 = 0;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Ldi;")
    public static class83 field6481 = new class83(22, 4);

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "Lrm;")
    public static class282 field6490 = new class282(1);

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "Lri;")
    public static class74 field6491 = new class74(8, 16);

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "J")
    public static long field6494 = -1L;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public int field6496;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    private int field6497;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public int field6499;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lad;")
    private class293 field6475;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "[I")
    public int[] field6486;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()I")
    public int method463() throws Exception {
        field6470++;
        return this.field6499;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILad;)V")
    private final void method2603(int arg0, int arg1, class293 arg2) {
        field6471++;
        if (arg1 > -117) {
            this.method460();
        }
        int var4 = arg0 >> 5;
        class293 var5 = this.field6500[var4];
        if (var5 == null) {
            this.field6503[var4] = arg2;
        } else {
            var5.field4045 = arg2;
        }
        this.field6500[var4] = arg2;
        arg2.field4047 = arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method2604(int arg0) {
        if (arg0 != 22) {
            method2609(118, 93, 17, null);
        }
        field6491 = null;
        field6490 = null;
        field6481 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method464(Component arg0) throws Exception {
        field6482++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLad;)V")
    public final synchronized void method2605(byte arg0, class293 arg1) {
        this.field6475 = arg1;
        if (arg0 != -13) {
            method2604(78);
        }
        field6477++;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public final void method2606(int arg0) {
        this.field6492 = true;
        if (arg0 == 23775) {
            field6487++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()V")
    public void method462() throws Exception {
        field6485++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([II)V")
    private final void method2607(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class295.field4060) {
            var3 = arg1 << 1;
        }
        class91.method682(arg0, 0, var3);
        this.field6495 -= arg1;
        if (this.field6475 != null && this.field6495 <= 0) {
            this.field6495 += class188.field2724 >> 4;
            class237.method1456((byte) -127, this.field6475);
            this.method2603(this.field6475.method1734(), -121, this.field6475);
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
                        class293 var10 = null;
                        class293 var11 = this.field6503[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class496 var12 = var11.field4046;
                                if (var12 == null || var12.field7239 <= var8) {
                                    var11.field4048 = true;
                                    int var13 = var11.method538();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field7239 += var13;
                                    }
                                    if (var4 >= this.field6480) {
                                        break label107;
                                    }
                                    class293 var14 = var11.method550();
                                    if (var14 != null) {
                                        int var15 = var11.field4047;
                                        while (var14 != null) {
                                            this.method2603(var15 * var14.method1734() >> 8, -123, var14);
                                            var14 = var11.method521();
                                        }
                                    }
                                    class293 var16 = var11.field4045;
                                    var11.field4045 = null;
                                    if (var10 == null) {
                                        this.field6503[var7] = var16;
                                    } else {
                                        var10.field4045 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field6500[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4045;
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
                class293 var18 = this.field6503[var17];
                this.field6503[var17] = this.field6500[var17] = null;
                while (var18 != null) {
                    class293 var19 = var18.field4045;
                    var18.field4045 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field6495 < 0) {
            this.field6495 = 0;
        }
        if (this.field6475 != null) {
            this.field6475.method523(arg0, 0, arg1);
        }
        this.field6478 = class246.method1483(5957);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public final synchronized void method2608(int arg0) {
        field6469++;
        if (this.field6472) {
            return;
        }
        long var2 = class246.method1483(5957);
        try {
            if ((this.field6478 + 500000L) < var2) {
                this.field6478 = var2 - 500000L;
            }
            while (var2 > this.field6478 + 5000L) {
                this.method2614(-1, 256);
                this.field6478 += (256000 / class188.field2724);
            }
        } catch (Exception var7) {
            this.field6478 = var2;
        }
        if (this.field6486 == null) {
            return;
        }
        try {
            if (this.field6498 != 0L) {
                if (this.field6498 > var2) {
                    return;
                }
                this.method461(this.field6499);
                this.field6492 = true;
                this.field6498 = 0L;
            }
            int var4 = this.method463();
            if (this.field6501 < (this.field6504 - var4)) {
                this.field6501 = this.field6504 - var4;
            }
            int var5 = this.field6497 + this.field6496;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field6499 < (var5 + 256)) {
                this.field6499 += 1024;
                if (this.field6499 > 16384) {
                    this.field6499 = 16384;
                }
                this.method460();
                var4 = 0;
                this.method461(this.field6499);
                this.field6492 = true;
                if (this.field6499 < (var5 + 256)) {
                    var5 = this.field6499 - 256;
                    this.field6497 = var5 - this.field6496;
                }
            }
            while (var5 > var4) {
                this.method2607(this.field6486, 256);
                this.method462();
                var4 += 256;
            }
            if (arg0 >= -86) {
                this.method460();
            }
            if (var2 > this.field6493) {
                if (this.field6492) {
                    this.field6492 = false;
                } else if (this.field6501 == 0 && this.field6502 == 0) {
                    this.method460();
                    this.field6498 = var2 + 2000L;
                    return;
                } else {
                    this.field6497 = Math.min(this.field6502, this.field6501);
                    this.field6502 = this.field6501;
                }
                this.field6501 = 0;
                this.field6493 = var2 + 2000L;
            }
            this.field6504 = var4;
        } catch (Exception var6) {
            this.method460();
            this.field6498 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILei;)V")
    public static final void method2609(int arg0, int arg1, int arg2, class117 arg3) {
        class486 var4 = class307.method1784(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field7100 = arg3;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public final synchronized void method2610(byte arg0) {
        if (class143.field2051 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class143.field2051.field3775[var3] == this) {
                    class143.field2051.field3775[var3] = null;
                }
                if (class143.field2051.field3775[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class143.field2051.field3773 = true;
                while (class143.field2051.field3774) {
                    class157.method1046(-128, 50L);
                }
                class143.field2051 = null;
            }
        }
        field6483++;
        if (arg0 != -97) {
            this.method2608(121);
        }
        this.method460();
        this.field6472 = true;
        this.field6486 = null;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "()V")
    public void method465() throws Exception {
        field6476++;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "()V")
    public void method460() {
        field6474++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
    public static final void method2611(int arg0, int arg1) {
        class346.field4955 = arg0;
        field6468++;
        class193.field2756 = 100;
        class294.field4050 = -1;
        class222.field3167 = 3;
        int var2 = 82 % ((-arg1 - 23) / 48);
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
    public void method461(int arg0) throws Exception {
        field6479++;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public static final void method2612(int arg0) {
        field6484++;
        class367.method2214(22050, 125, 2, class20.field269.field7646);
        class402.field5902 = new class64();
        class402.field5902.method554(9, 128, -65);
        class118.field1759 = class127.method881(0, class426.field6248, 120, 22050, class202.field2840);
        class118.field1759.method2605((byte) -13, class402.field5902);
        class12.method60((byte) -92, class251.field3473, class497.field7247, class167.field2509, class402.field5902);
        if (arg0 != -12576) {
            field6491 = null;
        }
        class102.field1544 = class127.method881(1, class426.field6248, arg0 + 12694, 2048, class202.field2840);
        class361.field5267 = new class69();
        class102.field1544.method2605((byte) -13, class361.field5267);
        class305.field4166 = new class157(22050, class188.field2724);
        class502.field7391 = class177.field2625.method735(104, "scape main");
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
    public final synchronized void method2613(int arg0) {
        field6473++;
        this.field6492 = true;
        try {
            this.method465();
        } catch (Exception var2) {
            this.method460();
            this.field6498 = class246.method1483(5957) + 2000L;
        }
        if (arg0 < 94) {
            field6481 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V")
    private final void method2614(int arg0, int arg1) {
        field6488++;
        this.field6495 -= arg1;
        if (arg0 < ~this.field6495) {
            this.field6495 = 0;
        }
        if (this.field6475 != null) {
            this.field6475.method546(arg1);
        }
    }
}
