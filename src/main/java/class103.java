import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class103 extends class264 {

    @OriginalMember(owner = "client!mb", name = "sb", descriptor = "I")
    private int field1538 = -1;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "[I")
    public static int[] field1526 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "Lma;")
    public static class5 field1531 = class12.method119("<col=00ffff>", (byte) 101);

    @OriginalMember(owner = "client!mb", name = "wb", descriptor = "Lma;")
    public static class5 field1542 = class12.method119("mapscene", (byte) 117);

    @OriginalMember(owner = "client!mb", name = "xb", descriptor = "I")
    public static int field1543 = 0;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!mb", name = "qb", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!mb", name = "rb", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!mb", name = "tb", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!mb", name = "ub", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "[I")
    public int[] field1525;

    @OriginalMember(owner = "client!mb", name = "pb", descriptor = "[Lfi;")
    public static class222[] field1535;

    @OriginalMember(owner = "client!mb", name = "vb", descriptor = "[[B")
    public static byte[][] field1541;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V", line = 5)
    public static void method650(int arg0) {
        field1542 = null;
        if (arg0 == -8378) {
            field1535 = null;
            field1531 = null;
            field1526 = null;
            field1541 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII)V", line = 19)
    public static final void method651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class152 var7 = new class152();
        var7.field2228 = arg1 / 128;
        var7.field2234 = arg2 / 128;
        var7.field2224 = arg3 / 128;
        var7.field2236 = arg4 / 128;
        var7.field2221 = arg0;
        var7.field2223 = arg1;
        var7.field2218 = arg2;
        var7.field2229 = arg3;
        var7.field2230 = arg4;
        var7.field2220 = arg5;
        var7.field2215 = arg6;
        class106.field1569[class272.field4658++] = var7;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V", line = 45)
    public final void method652(int arg0) {
        super.method652(109);
        this.field1525 = null;
        field1532++;
        int var2 = -76 / ((arg0 - 75) / 34);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILii;)Lma;", line = 56)
    public static final class5 method653(int arg0, class221 arg1) {
        field1528++;
        if (arg0 != 0) {
            field1535 = (class222[]) null;
        }
        return class21.method168(arg1, 32767, -102);
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)Z", line = 68)
    public final boolean method654(byte arg0) {
        if (arg0 != 111) {
            field1541 = (byte[][]) ((byte[][]) null);
        }
        field1540++;
        if (this.field1525 != null) {
            return true;
        } else if (this.field1538 < 0) {
            return false;
        } else {
            class222 var2 = class43.method300(arg0 - 111, class139.field2065, this.field1538);
            var2.method1563();
            this.field1536 = var2.field3918;
            this.field1525 = var2.field3652;
            this.field1529 = var2.field3914;
            return true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)Lpk;", line = 98)
    public static final class74 method655(boolean arg0) {
        if (arg0) {
            field1530++;
            class298 var1 = new class298(class282.field4786, class281.field4765, class88.field1315[0], class287.field4836[0], class112.field1665[0], class179.field2718[0], class37.field590[0], class268.field4610);
            class207.method1365(9);
            return var1;
        } else {
            return (class74) null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(BI)[[I", line = 138)
    public int[][] method138(byte arg0, int arg1) {
        field1533++;
        int var3 = 31 / ((-arg0 - 43) / 55);
        int[][] var4 = this.field4524.method1462(-15077, arg1);
        if (this.field4524.field3506 && this.method654((byte) 111)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int var7 = (class119.field1807 == this.field1529 ? arg1 : this.field1529 * arg1 / class119.field1807) * this.field1536;
            int[] var8 = var4[2];
            if (class226.field3716 == this.field1536) {
                for (int var12 = 0; var12 < class226.field3716; var12++) {
                    int var13 = this.field1525[var7++];
                    var8[var12] = class204.method1354(255, var13) << 4;
                    var6[var12] = class204.method1354(var13 >> 4, 4080);
                    var5[var12] = class204.method1354(var13 >> 12, 4080);
                }
            } else {
                for (int var9 = 0; var9 < class226.field3716; var9++) {
                    int var10 = this.field1536 * var9 / class226.field3716;
                    int var11 = this.field1525[var7 + var10];
                    var8[var9] = class204.method1354(var11 << 4, 4080);
                    var6[var9] = class204.method1354(4080, var11 >> 4);
                    var5[var9] = class204.method1354(16711680, var11) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lma;I)Z", line = 201)
    public static final boolean method656(class5 arg0, int arg1) {
        field1527++;
        if (arg0 == null) {
            return false;
        } else if (arg1 == 32767) {
            for (int var2 = 0; var2 < class100.field1484; var2++) {
                if (arg0.method29(arg1 - 32706, class153.field2239[var2])) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I", line = 227)
    public final int method657(int arg0) {
        field1534++;
        if (arg0 != -1) {
            this.method652(-84);
        }
        return this.field1538;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILii;)V", line = 238)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg0 == 0) {
            this.field1538 = arg2.method1524((byte) 93);
        }
        if (arg1 >= -27) {
            field1537 = -122;
        }
        field1539++;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 271)
    public class103() {
        super(0, false);
    }
}
