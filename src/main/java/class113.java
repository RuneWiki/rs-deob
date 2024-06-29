import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class113 extends class187 {

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "[J")
    private long[] field1661 = new long[10];

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    private int field1657 = 1;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    private int field1651 = 256;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    private int field1653 = 0;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "J")
    private long field1654 = class183.method1195((byte) 117);

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field1656 = 0;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field1658 = 0;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    private int field1659;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public final void method149(int arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1661[var2] = 0L;
        }
        if (arg0 != 16) {
            method684(67);
        }
        field1660++;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static final void method684(int arg0) {
        class154 var1 = class105.field1522;
        synchronized (class105.field1522) {
            class60.field802++;
            class58.field794 = class173.field2913;
            if (class116.field1672 >= 0) {
                while (class220.field3948 != class116.field1672) {
                    int var3 = class230.field4090[class220.field3948];
                    class220.field3948 = class220.field3948 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class174.field2936[var3] = true;
                    } else {
                        class174.field2936[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class174.field2936[var2] = false;
                }
                class116.field1672 = class220.field3948;
            }
            class173.field2913 = class146.field2296;
        }
        field1652++;
        if (arg0 != 103) {
            field1656 = -102;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B[Lqj;[S)V")
    public static final void method685(byte arg0, class196[] arg1, short[] arg2) {
        if (arg0 >= -25) {
            field1656 = -18;
        }
        field1655++;
        class44.method235(arg2, 9423, 0, arg1.length - 1, arg1);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I")
    public final int method150(int arg0, int arg1, int arg2) {
        field1650++;
        int var4 = this.field1651;
        int var5 = this.field1657;
        this.field1657 = 1;
        this.field1651 = 300;
        this.field1654 = class183.method1195((byte) 119);
        if (this.field1661[this.field1659] == 0L) {
            this.field1651 = var4;
            this.field1657 = var5;
        } else if (this.field1661[this.field1659] < this.field1654) {
            this.field1651 = (int) ((long) (arg1 * 2560) / (this.field1654 - this.field1661[this.field1659]));
        }
        if (this.field1651 < 25) {
            this.field1651 = 25;
        }
        if (this.field1651 > 256) {
            this.field1651 = 256;
            this.field1657 = (int) ((long) arg1 - (this.field1654 - this.field1661[this.field1659]) / 10L);
        }
        if (this.field1657 > arg1) {
            this.field1657 = arg1;
        }
        this.field1661[this.field1659] = this.field1654;
        if (arg2 != -1) {
            this.field1661 = null;
        }
        this.field1659 = (this.field1659 + 1) % 10;
        if (this.field1657 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1661[var6] != 0L) {
                    this.field1661[var6] += this.field1657;
                }
            }
        }
        if (arg0 > this.field1657) {
            this.field1657 = arg0;
        }
        int var7 = 0;
        class73.method464((byte) 127, (long) this.field1657);
        while (this.field1653 < 256) {
            var7++;
            this.field1653 += this.field1651;
        }
        this.field1653 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public static final void method686(int arg0) {
        field1662++;
        class96.field1413 = 0;
        class148.field2336 = 0;
        class18.method96(2);
        class52.method277(arg0 + 24402);
        if (arg0 != -24434) {
            return;
        }
        class212.method1466(110);
        for (int var1 = 0; var1 < class96.field1413; var1++) {
            int var3 = class232.field4128[var1];
            if (class171.field2879 != class153.field2482[var3].field2055) {
                if (class153.field2482[var3].field2648.method676((byte) 125)) {
                    class125.method772(arg0 ^ 0x5F06, class153.field2482[var3]);
                }
                class153.field2482[var3].field2648 = null;
                class153.field2482[var3] = null;
            }
        }
        if (class76.field1096 != class229.field4077.field699) {
            throw new RuntimeException("gnp1 pos:" + class229.field4077.field699 + " psize:" + class76.field1096);
        }
        for (int var2 = 0; var2 < class63.field863; var2++) {
            if (class153.field2482[class188.field3295[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class63.field863);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILqj;)V")
    public static final void method687(int arg0, class196 arg1) {
        field1663++;
        if (class25.field320 >= 2) {
            if (arg1.method1320(false, class202.field3614)) {
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class236.method1586(class93.method572(-69, new class196[] { class57.field762, class163.method1029(var4, false), class53.field668 }), 95, 0, null);
            }
            if (arg1.method1320(false, class242.field4306)) {
                class195.method1285(arg0 ^ 0xFFFFFFD7);
            }
            if (arg1.method1320(false, class21.field265)) {
                class180.method1182((byte) -101, 25);
            }
            if (arg1.method1320(false, class245.field4369)) {
                class135.field1969 = true;
            }
            if (arg1.method1320(false, class158.field2542)) {
                class135.field1969 = false;
            }
            if (arg1.method1320(false, class74.field1077)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class188.field3298[var5].field2462[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method1317(class57.field771, (byte) -120) && class211.field3797 != 0) {
                class98.method601(arg1.method1296(6, -1).method1286(arg0 + 2), arg0 + 1001);
            }
            if (arg1.method1320(false, class20.field234) && class211.field3797 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1317(class197.field3498, (byte) -111)) {
                class138.field2132 = arg1.method1296(12, -1).method1304(-104).method1286(1);
                class236.method1586(class93.method572(-64, new class196[] { class69.field967, class163.method1029(class138.field2132, false) }), arg0 ^ 0xFFFFFF8A, 0, null);
            }
            if (arg1.method1320(false, class39.field443)) {
                class236.field4195 = true;
            }
        }
        class44.field520.method1173(148, 14592);
        class42.field477++;
        class44.field520.method329((byte) 49, arg0 + arg1.method1299(37));
        class44.field520.method330(arg1.method1296(2, -1), 12865);
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class113() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1661[var1] = this.field1654;
        }
    }
}
