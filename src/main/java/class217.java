import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class217 {

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    private int field3495 = 0;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    private int field3500 = -1;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lel;")
    private class218 field3493 = new class218();

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Z")
    public boolean field3506 = false;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    private int field3494;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    private int field3492;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "[[[I")
    private int[][][] field3505;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[Luj;")
    private class149[] field3496;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lma;")
    public static class5 field3488 = class12.method119("k", (byte) 115);

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Lma;")
    public static class5 field3504 = class12.method119("null", (byte) 102);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "[Lrj;")
    public static class237[] field3498;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[[I", line = 6)
    public final int[][] method1462(int arg0, int arg1) {
        if (arg0 != -15077) {
            this.field3505 = (int[][][]) ((int[][][]) null);
        }
        field3486++;
        if (this.field3494 == this.field3492) {
            this.field3506 = this.field3496[arg1] == null;
            this.field3496[arg1] = class141.field2082;
            return this.field3505[arg1];
        } else if (this.field3494 == 1) {
            this.field3506 = this.field3500 != arg1;
            this.field3500 = arg1;
            return this.field3505[0];
        } else {
            class149 var3 = this.field3496[arg1];
            if (var3 == null) {
                this.field3506 = true;
                if (this.field3494 <= this.field3495) {
                    class149 var4 = (class149) this.field3493.method1479((byte) -111);
                    var3 = new class149(arg1, var4.field2151);
                    this.field3496[var4.field2152] = null;
                    var4.method1997(arg0 ^ 0x5010);
                } else {
                    var3 = new class149(arg1, this.field3495);
                    this.field3495++;
                }
                this.field3496[arg1] = var3;
            } else {
                this.field3506 = false;
            }
            this.field3493.method1477(false, var3);
            return this.field3505[var3.field2151];
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 77)
    public static final void method1463(int arg0) {
        for (int var1 = 0; var1 < class114.field1707; var1++) {
            class201 var2 = class107.method675(var1, 112);
            if (var2 != null && var2.field3192 == 0) {
                class114.field1702[var1] = 0;
                class149.field2149[var1] = 0;
            }
        }
        if (arg0 != -1) {
            field3488 = (class5) null;
        }
        class161.field2453 = new class209(16);
        field3499++;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)[[[I", line = 102)
    public final int[][][] method1464(int arg0) {
        field3491++;
        if (this.field3494 != this.field3492) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 > -21) {
            return (int[][][]) ((int[][][]) null);
        } else {
            for (int var2 = 0; var2 < this.field3494; var2++) {
                this.field3496[var2] = class141.field2082;
            }
            return this.field3505;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V", line = 127)
    public static final void method1465() {
        for (int var0 = 0; var0 < class168.field2570; var0++) {
            for (int var1 = 0; var1 < class115.field1721; var1++) {
                for (int var2 = 0; var2 < class179.field2708; var2++) {
                    class43.field646[var0][var1][var2] = null;
                }
            }
        }
        for (int var3 = 0; var3 < class272.field4658; var3++) {
            class106.field1569[var3] = null;
        }
        class272.field4658 = 0;
        for (int var4 = 0; var4 < class194.field3029; var4++) {
            class111.field1650[var4] = null;
        }
        class194.field3029 = 0;
        for (int var5 = 0; var5 < class266.field4550.length; var5++) {
            class266.field4550[var5] = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V", line = 176)
    public static final void method1466(int arg0) {
        field3487++;
        class12.field234.method522(97);
        int var1 = -45 % ((10 - arg0) / 62);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBIII)V", line = 186)
    public static final void method1467(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class57.field899 <= arg0 - arg4 && class301.field5073 >= arg0 + arg4 && class294.field4956 <= arg2 - arg4 && class101.field1505 >= arg2 + arg4) {
            class247.method1730(16262, arg0, arg2, arg3, arg4);
        } else {
            class117.method784(arg3, arg0, 2, arg4, arg2);
        }
        int var5 = 96 / ((arg1 - 37) / 44);
        field3489++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZZIILni;)V", line = 205)
    public static final void method1468(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, class202 arg5) {
        class171.field2629 = arg5;
        class100.field1487 = arg0;
        class15.field274 = 10000;
        class142.field2088 = arg4;
        class33.field509 = arg1;
        class174.field2656 = arg3;
        if (arg2) {
            class106.field1579 = 1;
            field3501++;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V", line = 231)
    public final void method1469(int arg0) {
        for (int var2 = 0; var2 < this.field3494; var2++) {
            this.field3505[var2][0] = null;
            this.field3505[var2][1] = null;
            this.field3505[var2][2] = null;
            this.field3505[var2] = (int[][]) null;
        }
        if (arg0 < 42) {
            method1465();
        }
        this.field3496 = null;
        this.field3505 = (int[][][]) null;
        this.field3493.method1474((byte) 100);
        this.field3493 = null;
        field3502++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BII)V", line = 257)
    public static final void method1470(byte arg0, int arg1, int arg2) {
        class218 var3 = class91.field1358[class276.field4701][arg2][arg1];
        field3497++;
        if (var3 == null) {
            class137.method895(class276.field4701, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class236 var5 = (class236) var3.method1475(arg0 ^ 0xFFFFFFC9);
        if (arg0 != -57) {
            return;
        }
        class236 var6 = null;
        while (var5 != null) {
            class196 var7 = class235.method1664(122, var5.field3891.field1572);
            int var8 = var7.field3102;
            if (var7.field3109 == 1) {
                var8 = (var5.field3891.field1573 + 1) * var8;
            }
            if (var4 < var8) {
                var4 = var8;
                var6 = var5;
            }
            var5 = (class236) var3.method1486(38);
        }
        if (var6 == null) {
            class137.method895(class276.field4701, arg2, arg1);
            return;
        }
        var3.method1477(false, var6);
        class236 var9 = (class236) var3.method1475(14);
        class106 var10 = null;
        class106 var11 = null;
        while (var9 != null) {
            class106 var12 = var9.field3891;
            if (var6.field3891.field1572 != var12.field1572) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1572 != var12.field1572 && var11 == null) {
                    var11 = var12;
                }
            }
            var9 = (class236) var3.method1486(arg0 ^ 0xFFFFFFE1);
        }
        long var13 = (long) ((arg1 << 7) + arg2 + 1610612736);
        class152.method957(class276.field4701, arg2, arg1, class20.method161(arg1 * 128 + 64, arg2 * 128 + 64, arg0 ^ 0xFFFFFFC6, class276.field4701), var6.field3891, var13, var10, var11);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(III)V", line = 402)
    public class217(int arg0, int arg1, int arg2) {
        this.field3494 = arg0;
        this.field3492 = arg1;
        this.field3505 = new int[this.field3494][3][arg2];
        this.field3496 = new class149[this.field3492];
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V", line = 342)
    public static void method1471(int arg0) {
        field3488 = null;
        field3498 = null;
        if (arg0 < -120) {
            field3504 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IJ)Lma;", line = 357)
    public static final class5 method1472(int arg0, long arg1) {
        field3503++;
        if (arg0 >= -21) {
            method1467(-73, (byte) -110, 22, 79, -34);
        }
        class72.field1130.setTime(new Date(arg1));
        int var3 = class72.field1130.get(7);
        int var4 = class72.field1130.get(5);
        int var5 = class72.field1130.get(2);
        int var6 = class72.field1130.get(1);
        int var7 = class72.field1130.get(11);
        int var8 = class72.field1130.get(12);
        int var9 = class72.field1130.get(13);
        return class288.method1940((byte) 63, new class5[] { class155.field2293[var3 - 1], class153.field2249, class175.method1148(var4 / 10, false), class175.method1148(var4 % 10, false), class78.field1217, class264.field4512[var5], class78.field1217, class175.method1148(var6, false), class272.field4648, class175.method1148(var7 / 10, false), class175.method1148(var7 % 10, false), class185.field2837, class175.method1148(var8 / 10, false), class175.method1148(var8 % 10, false), class185.field2837, class175.method1148(var9 / 10, false), class175.method1148(var9 % 10, false), class301.field5074 });
    }
}
