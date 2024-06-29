import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class71 {

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lre;")
    private class107 field1566 = new class107();

    @OriginalMember(owner = "client!le", name = "s", descriptor = "Lcd;")
    private class17 field1571 = new class17();

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    private int field1572;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    private int field1576;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Lmb;")
    private class74 field1573;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field1558 = 0;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field1559 = 0;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Lrc;")
    public static class105 field1565 = class43.method374("Ung-Ultiges Anmelde)2Paket)3", 0);

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[I")
    public static int[] field1562 = new int[4000];

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field1567 = 0;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Lrc;")
    public static class105 field1570 = class43.method374("Bitte entfernen Sie ", 0);

    @OriginalMember(owner = "client!le", name = "w", descriptor = "Lrc;")
    public static class105 field1575 = class43.method374("60 Sekunden noch einmal)3)3)3", 0);

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[I")
    public static int[] field1564;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[[[B")
    public static byte[][][] field1553;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(JB)Lre;", line = 9)
    public final class107 method601(long arg0, byte arg1) {
        field1554++;
        class107 var4 = (class107) this.field1573.method624((byte) 81, arg0);
        if (arg1 != 118) {
            field1565 = null;
        }
        if (var4 != null) {
            this.field1571.method182((byte) 92, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 42)
    public final void method602(byte arg0) {
        field1556++;
        while (true) {
            class107 var2 = this.field1571.method184(18186);
            if (var2 == null) {
                if (arg0 != -70) {
                    field1565 = null;
                }
                this.field1576 = this.field1572;
                return;
            }
            var2.method551(arg0 + 174);
            var2.method874(true);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V", line = 78)
    public static final void method603(int arg0, byte arg1) {
        field1563++;
        if (arg0 == -1 || !class29.method273(arg0, arg1 + 67)) {
            return;
        }
        class119[] var2 = class14.field282[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class119 var4 = var2[var3];
            if (var4.field2857 != null) {
                class66.method558(0, var4.field2857, var4, (byte) -109, 0, 0);
            }
        }
        if (arg1 != 35) {
            method603(103, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 124)
    public static final void method604(int arg0) {
        int var1 = 0;
        if (arg0 <= 52) {
            method605(28);
        }
        while (var1 < class76.field1701) {
            int var2 = class122.field3001[var1];
            class15 var3 = class58.field1303[var2];
            int var4 = class18.field389.method96(27023);
            if ((var4 & 0x40) != 0) {
                var4 += class18.field389.method96(27023) << 8;
            }
            class107.method871(var3, var2, (byte) 120, var4);
            var1++;
        }
        field1555++;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 153)
    public static final void method605(int arg0) {
        field1560++;
        int var1 = class66.field1498 * 128 + 64;
        int var2 = class41.field924 * 128 + 64;
        int var3 = class134.method1061(arg0 + 11259, class73.field1619, var1, var2) - class22.field544;
        if (class10.field214 < var3) {
            class10.field214 += (var3 - class10.field214) * class39.field908 / 1000 + class89.field2051;
            if (var3 < class10.field214) {
                class10.field214 = var3;
            }
        }
        if (class10.field214 > var3) {
            class10.field214 -= (class10.field214 - var3) * class39.field908 / 1000 + class89.field2051;
            if (class10.field214 < var3) {
                class10.field214 = var3;
            }
        }
        if (var2 > class78.field1755) {
            class78.field1755 += (var2 - class78.field1755) * class39.field908 / 1000 + class89.field2051;
            if (class78.field1755 > var2) {
                class78.field1755 = var2;
            }
        }
        if (class78.field1755 > var2) {
            class78.field1755 -= class89.field2051 + (class78.field1755 - var2) * class39.field908 / 1000;
            if (var2 > class78.field1755) {
                class78.field1755 = var2;
            }
        }
        if (class113.field2658 < var1) {
            class113.field2658 += (var1 - class113.field2658) * class39.field908 / 1000 + class89.field2051;
            if (class113.field2658 > var1) {
                class113.field2658 = var1;
            }
        }
        int var4 = class37.field859 * 128 + 64;
        if (var1 < class113.field2658) {
            class113.field2658 -= (class113.field2658 - var1) * class39.field908 / 1000 + class89.field2051;
            if (class113.field2658 < var1) {
                class113.field2658 = var1;
            }
        }
        int var5 = class61.field1357 * arg0 + 64;
        int var6 = class134.method1061(11387, class73.field1619, var5, var4) - class6.field72;
        int var7 = var5 - class113.field2658;
        int var8 = var6 - class10.field214;
        int var9 = var4 - class78.field1755;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        if (class100.field2291 < var11) {
            class100.field2291 += (var11 - class100.field2291) * class57.field1208 / 1000 + class130.field3157;
            if (class100.field2291 > var11) {
                class100.field2291 = var11;
            }
        }
        if (var11 < class100.field2291) {
            class100.field2291 -= (class100.field2291 - var11) * class57.field1208 / 1000 + class130.field3157;
            if (var11 > class100.field2291) {
                class100.field2291 = var11;
            }
        }
        int var13 = var12 - class3.field52;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class3.field52 += class57.field1208 * var13 / 1000 + class130.field3157;
            class3.field52 &= 0x7FF;
        }
        if (var13 < 0) {
            class3.field52 -= -var13 * class57.field1208 / 1000 + class130.field3157;
            class3.field52 &= 0x7FF;
        }
        int var14 = var12 - class3.field52;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class3.field52 = var12;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lpb;ZILpb;)V", line = 299)
    public static final void method606(class92 arg0, boolean arg1, int arg2, class92 arg3) {
        class111.field2586 = arg1;
        class117.field2742 = arg3;
        if (arg2 != 8981) {
            field1553 = null;
        }
        field1574++;
        class9.field172 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 325)
    public static void method607(int arg0) {
        field1565 = null;
        field1570 = null;
        field1553 = null;
        field1564 = null;
        if (arg0 != -1) {
            field1553 = null;
        }
        field1562 = null;
        field1575 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(JLre;B)V", line = 353)
    public final void method608(long arg0, class107 arg1, byte arg2) {
        if (this.field1576 == 0) {
            class107 var5 = this.field1571.method184(18186);
            var5.method551(-87);
            var5.method874(true);
            if (this.field1566 == var5) {
                class107 var6 = this.field1571.method184(18186);
                var6.method551(40);
                var6.method874(true);
            }
        } else {
            this.field1576--;
        }
        field1569++;
        if (arg2 > 120) {
            this.field1573.method625((byte) 22, arg1, arg0);
            this.field1571.method182((byte) 92, arg1);
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V", line = 428)
    public class71(int arg0) {
        this.field1572 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1576 = arg0;
        this.field1573 = new class74(var2);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(JI)V", line = 398)
    public final void method609(long arg0, int arg1) {
        field1561++;
        class107 var4 = (class107) this.field1573.method624((byte) 71, arg0);
        if (var4 != null) {
            var4.method551(-105);
            var4.method874(true);
            this.field1576++;
        }
        int var5 = 81 / ((-arg1 - 72) / 54);
    }
}
