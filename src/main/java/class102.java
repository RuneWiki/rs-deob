import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class102 extends class237 {

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "[J")
    private long[] field1867 = new long[10];

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    private int field1858 = 256;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    private int field1856 = 0;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    private int field1868 = 1;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "J")
    private long field1855 = class300.method2048((byte) 18);

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static volatile int field1854 = 0;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field1862 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Lbd;")
    public static class162 field1866 = class17.method142(0, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    private int field1865;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lda;")
    public static class143 field1853;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "[I")
    public static int[] field1861;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 16)
    public static final void method836(byte arg0) {
        if (arg0 >= -4) {
            field1866 = (class162) null;
        }
        field1860++;
        for (int var1 = 0; var1 < class267.field4446; var1++) {
            int var2 = class181.field3118[var1];
            class60 var3 = class204.field3446[var2];
            int var4 = class63.field975.method756(915905888);
            if ((var4 & 0x40) != 0) {
                var3.field5019 = class63.field975.method715(250);
                if (var3.field5019 == 65535) {
                    var3.field5019 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field5007 = class63.field975.method715(250);
                var3.field5059 = class63.field975.method715(250);
            }
            if ((var4 & 0x4) != 0) {
                var3.field5070 = class63.field975.method744((byte) 105);
                var3.field5052 = 100;
            }
            if ((var4 & 0x80) != 0) {
                int var5 = class63.field975.method756(915905888);
                int var6 = class63.field975.method707(2);
                var3.method2055(var6, 21686, class90.field1598, var5);
                var3.field5065 = class90.field1598 + 300;
                var3.field5071 = class63.field975.method714((byte) 34);
            }
            if ((var4 & 0x1) != 0) {
                int var7 = class63.field975.method756(915905888);
                int var8 = class63.field975.method735((byte) -1);
                var3.method2055(var8, 21686, class90.field1598, var7);
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field926.method640(5782)) {
                    class22.method182(false, var3);
                }
                var3.field926 = class223.method1613(class63.field975.method711(255), false);
                var3.method2051(var3.field926.field1485, 7);
                var3.field5068 = var3.field926.field1444;
                var3.field5053 = var3.field926.field1452;
                var3.field5043 = var3.field926.field1466;
                var3.field5030 = var3.field926.field1474;
                var3.field5042 = var3.field926.field1477;
                var3.field5066 = var3.field926.field1481;
                var3.field5037 = var3.field926.field1437;
                var3.field5072 = var3.field926.field1457;
                if (var3.field926.method640(5782)) {
                    class68.method486(var3.field5034[0], -86, 0, (class311) null, (class39) null, class157.field2765, var3, var3.field5050[0]);
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field5029 = class63.field975.method761((byte) 108);
                int var9 = class63.field975.method760(false);
                var3.field5033 = var9 >> 16;
                var3.field5048 = 0;
                var3.field5015 = 0;
                if (var3.field5029 == 65535) {
                    var3.field5029 = -1;
                }
                var3.field5036 = class90.field1598 + (var9 & 0xFFFF);
                if (class90.field1598 < var3.field5036) {
                    var3.field5015 = -1;
                }
                if (var3.field5029 != -1 && class90.field1598 == var3.field5036) {
                    int var10 = class297.method2038(-115, var3.field5029).field674;
                    if (var10 != -1) {
                        class142 var11 = class139.method1084(-103, var10);
                        if (var11 != null && var11.field2522 != null) {
                            class229.method1638(false, var11, 0, var3.field5047, -648569400, var3.field5013);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                int var12 = class63.field975.method711(255);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = class63.field975.method707(2);
                class114.method905(var13, var12, false, var3);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)I", line = 162)
    public final int method837(int arg0, int arg1, int arg2) {
        field1852++;
        int var4 = this.field1858;
        this.field1858 = 300;
        int var5 = this.field1868;
        this.field1868 = 1;
        this.field1855 = class300.method2048((byte) 18);
        if (this.field1867[this.field1865] == 0L) {
            this.field1858 = var4;
            this.field1868 = var5;
        } else if (this.field1867[this.field1865] < this.field1855) {
            this.field1858 = (int) ((long) (arg2 * 2560) / (this.field1855 - this.field1867[this.field1865]));
        }
        if (this.field1858 < 25) {
            this.field1858 = 25;
        }
        if (this.field1858 > 256) {
            this.field1858 = 256;
            this.field1868 = (int) ((long) arg2 - ((this.field1855 - this.field1867[this.field1865]) / 10L));
        }
        if (arg2 < this.field1868) {
            this.field1868 = arg2;
        }
        this.field1867[this.field1865] = this.field1855;
        if (arg0 != 22302) {
            method840(127);
        }
        this.field1865 = (this.field1865 + 1) % 10;
        if (this.field1868 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1867[var6] != 0L) {
                    this.field1867[var6] += (long) this.field1868;
                }
            }
        }
        if (this.field1868 < arg1) {
            this.field1868 = arg1;
        }
        int var7 = 0;
        class177.method1342((long) this.field1868, arg0 ^ 0x571F);
        while (this.field1856 < 256) {
            var7++;
            this.field1856 += this.field1858;
        }
        this.field1856 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V", line = 243)
    public static final void method838(byte arg0) {
        class262.method1804(-12039);
        int var1 = -61 % ((30 - arg0) / 57);
        field1859++;
        class58.method404(94);
        class67.method479((byte) -66);
        class303.method2068((byte) -127);
        class143.method1145(14815);
        class126.method1022((byte) -128);
        class194.method1432((byte) -78);
        class82.method631(10057);
        class136.method1068((byte) -84);
        class147.method1168(false);
        class261.method1798((byte) -18);
        class245.method1731((byte) 114);
        class63.method433(0);
        class64.method444((byte) 46);
        class136.field2427.method1533(true);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V", line = 306)
    public class102() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1867[var1] = this.field1855;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 289)
    public final void method839(int arg0) {
        field1863++;
        if (arg0 != -11677) {
            method838((byte) -82);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1867[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V", line = 327)
    public static void method840(int arg0) {
        field1853 = null;
        if (arg0 != 100) {
            method840(-34);
        }
        field1866 = null;
        field1861 = null;
    }
}
