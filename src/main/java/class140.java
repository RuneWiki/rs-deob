import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class140 extends class64 {

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
    private int field2594 = 1;

    @OriginalMember(owner = "client!pe", name = "mb", descriptor = "I")
    private int field2603 = 204;

    @OriginalMember(owner = "client!pe", name = "nb", descriptor = "I")
    private int field2604 = 1;

    @OriginalMember(owner = "client!pe", name = "kb", descriptor = "I")
    public static int field2601 = 0;

    @OriginalMember(owner = "client!pe", name = "jb", descriptor = "Lsg;")
    public static class169 field2600 = class165.method1060("sl_back", 1536);

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "Lua;")
    public static class181 field2595 = new class181(128);

    @OriginalMember(owner = "client!pe", name = "ob", descriptor = "[I")
    public static int[] field2605 = new int[32];

    @OriginalMember(owner = "client!pe", name = "pb", descriptor = "Lqg;")
    public static class151 field2606;

    @OriginalMember(owner = "client!pe", name = "qb", descriptor = "Lsg;")
    private static class169 field2607;

    @OriginalMember(owner = "client!pe", name = "sb", descriptor = "Lsg;")
    public static class169 field2609;

    @OriginalMember(owner = "client!pe", name = "rb", descriptor = "Lsg;")
    public static class169 field2608;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!pe", name = "hb", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!pe", name = "ib", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!pe", name = "lb", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "Lga;")
    public static class57 field2592;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "(I)V")
    public static void method931(int arg0) {
        field2606 = null;
        field2600 = null;
        field2605 = null;
        if (arg0 < 31) {
            method932((byte) 121);
        }
        field2609 = null;
        field2607 = null;
        field2595 = null;
        field2592 = null;
        field2608 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        int[] var3 = super.field1192.method19((byte) 125, arg0);
        if (super.field1192.field75) {
            for (int var4 = 0; var4 < class147.field2715; ++var4) {
                int var5 = class189.field3699[arg0];
                int var6 = this.field2604 * var5 >> 12;
                int var7 = class185.field3607[var4];
                int var8 = this.field2594 * var7 >> 12;
                int var9 = var7 % (4096 / this.field2594) * this.field2594;
                int var10 = var5 % (4096 / this.field2604) * this.field2604;
                if (~this.field2603 < ~var10) {
                    for (var8 -= var6; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (~var8 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field2603 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field2603) {
                    int var11;
                    for (var11 = var8 - var6; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg1 != 19) {
            return null;
        } else {
            ++field2597;
            return var3;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class140() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static final void method932(byte arg0) {
        ++field2599;
        int var1 = 0;
        if (arg0 <= 79) {
            method935((byte) 68);
        }
        while (~var1 > ~class164.field3149) {
            int var2 = class182.field3547[var1];
            class197 var3 = class54.field992[var2];
            if (var3 != null) {
                class191.method1263((byte) 113, var3, var3.field3872.field3392);
            }
            ++var1;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        ++field2593;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field2603 = arg1.method785(true);
                }
            } else {
                this.field2604 = arg1.method819((byte) 22);
            }
        } else {
            this.field2594 = arg1.method819((byte) 22);
        }
        int var5 = 61 % ((arg0 - -60) / 36);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)V")
    public static final void method933(byte arg0, int arg1) {
        ++field2602;
        if (~class111.field2031 != ~arg1) {
            if (~class111.field2031 == -1) {
                class61.method384((byte) 86);
            }
            if (arg1 == 20 || ~arg1 == -41) {
                class55.field1005 = 0;
                class16.field333 = 0;
                class99.field1861 = 0;
            }
            if (arg1 != 20 && arg1 != 40 && class1.field25 != null) {
                class1.field25.method359((byte) 79);
                class1.field25 = null;
            }
            if (~class111.field2031 == -26) {
                class141.field2632 = 0;
                class46.field851 = 1;
                client.field578 = 1;
                class82.field1508 = 0;
                class17.field354 = 0;
            }
            if (arg1 != 5 && ~arg1 != -11 && arg1 != 20) {
                class206.method1334(4);
            } else {
                class201.method1313(124, class104.field1907, class125.field2288, class1.field4);
            }
            int var2 = 123 / ((70 - arg0) / 51);
            class111.field2031 = arg1;
        }
    }

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "(I)V")
    public static final void method934(int arg0) {
        class85.field1559.method1033(true);
        ++field2596;
        int var1 = class85.field1559.method1031(8, (byte) -94);
        if (~class164.field3149 < ~var1) {
            for (int var2 = var1; ~class164.field3149 < ~var2; ++var2) {
                class35.field699[class82.field1510++] = class182.field3547[var2];
            }
        }
        if (~class164.field3149 > ~var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class164.field3149 = 0;
            int var3 = 0;
            if (arg0 == 1) {
                while (var3 < var1) {
                    int var4 = class182.field3547[var3];
                    class197 var5 = class54.field992[var4];
                    int var6 = class85.field1559.method1031(1, (byte) 60);
                    if (~var6 == -1) {
                        class182.field3547[class164.field3149++] = var4;
                        var5.field3700 = class162.field3107;
                    } else {
                        int var7 = class85.field1559.method1031(2, (byte) 41);
                        if (var7 == 0) {
                            class182.field3547[class164.field3149++] = var4;
                            var5.field3700 = class162.field3107;
                            class6.field120[class199.field3895++] = var4;
                        } else if (~var7 == -2) {
                            class182.field3547[class164.field3149++] = var4;
                            var5.field3700 = class162.field3107;
                            int var8 = class85.field1559.method1031(3, (byte) 91);
                            var5.method1244(var8, false, 0);
                            int var9 = class85.field1559.method1031(1, (byte) 19);
                            if (var9 == 1) {
                                class6.field120[class199.field3895++] = var4;
                            }
                        } else if (var7 == 2) {
                            class182.field3547[class164.field3149++] = var4;
                            var5.field3700 = class162.field3107;
                            int var10 = class85.field1559.method1031(3, (byte) 25);
                            var5.method1244(var10, true, 0);
                            int var11 = class85.field1559.method1031(3, (byte) -118);
                            var5.method1244(var11, true, 0);
                            int var12 = class85.field1559.method1031(1, (byte) 113);
                            if (var12 == 1) {
                                class6.field120[class199.field3895++] = var4;
                            }
                        } else if (~var7 == -4) {
                            class35.field699[class82.field1510++] = var4;
                        }
                    }
                    ++var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
    public static final void method935(byte arg0) {
        class128.method831(arg0 + 172);
        ++field2598;
        class187.method1231((byte) 104);
        class23.method159(28524);
        class63.method388(false);
        class46.method288(false);
        class29.method205(-3954);
        class66.method415(2048);
        class54.method345((byte) -70);
        class66.method419((byte) 109);
        class177.method1184(119);
        class28.method189((byte) -42);
        class67.method425(4096);
        ((class103) class12.field275).method610(false);
        field2595.method1205(true);
        if (arg0 == -107) {
            class127.field2374.method571((byte) 85);
            class94.field1750.method571((byte) 127);
            class201.field3916.method571((byte) 108);
            class62.field1143.method571((byte) 88);
            class137.field2555.method571((byte) 109);
            class201.field3923.method571((byte) 121);
            class187.field3632.method571((byte) 123);
            class104.field1907.method571((byte) 92);
            class125.field2288.method571((byte) 99);
            class142.field2655.method571((byte) 79);
            class45.field842.method571((byte) 79);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field2605[var1] = var0 + -1;
            var0 += var0;
        }
        field2606 = new class151();
        field2607 = class165.method1060("glow3:", 1536);
        field2609 = field2607;
        field2608 = field2607;
    }
}
