import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class123 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Lhq;")
    public class423 field1902 = new class423();

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field1903 = 0;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Z")
    public static boolean field1906 = false;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lhq;")
    private class423 field1912;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)Lhq;", line = 4)
    public final class423 method890(byte arg0) {
        field1907++;
        class423 var2 = this.field1912;
        if (this.field1902 == var2) {
            this.field1912 = null;
            return null;
        } else {
            this.field1912 = var2.field6146;
            return arg0 > -59 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ldk;I)V", line = 26)
    public static final void method891(class421 arg0, int arg1) {
        field1913++;
        class454.field6637 = arg0.method2488("p11_full", false);
        class521.field7644 = arg0.method2488("p12_full", false);
        class348.field4999 = arg0.method2488("b12_full", false);
        class376.field5399 = arg0.method2488("hitmarks", false);
        class355.field5133 = arg0.method2488("hitbar_default", false);
        class79.field1115 = arg0.method2488("timerbar_default", false);
        class437.field6313 = arg0.method2488("headicons_pk", false);
        class409.field5789 = arg0.method2488("headicons_prayer", false);
        class449.field6584 = arg0.method2488("hint_headicons", false);
        class371.field5319 = arg0.method2488("hint_mapmarkers", false);
        class434.field6278 = arg0.method2488("mapflag", false);
        class176.field2645 = arg0.method2488("cross", false);
        if (arg1 <= 12) {
            method896((byte) 115, 117);
        }
        class497.field7280 = arg0.method2488("mapdots", false);
        class136.field2063 = arg0.method2488("scrollbar", false);
        class16.field195 = arg0.method2488("name_icons", false);
        class38.field571 = arg0.method2488("floorshadows", false);
        class75.field1063 = arg0.method2488("compass", false);
        class443.field6383 = arg0.method2488("otherlevel", false);
        class35.field540 = arg0.method2488("hint_mapedge", false);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)I", line = 56)
    public final int method892(byte arg0) {
        field1904++;
        int var2 = 0;
        int var3 = 109 / ((arg0 + 60) / 42);
        for (class423 var4 = this.field1902.field6146; var4 != this.field1902; var4 = var4.field6146) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIBI)I", line = 77)
    public static final int method893(int arg0, int arg1, byte arg2, int arg3) {
        field1905++;
        if (class492.field7122 == null) {
            return 0;
        } else if (arg2 == -13) {
            int var4 = arg1 >> 7;
            int var5 = arg0 >> 7;
            if (var4 < 0 || var5 < 0 || (class9.field111 - 1) < var4 || (class192.field2809 - 1) < var5) {
                return 0;
            }
            int var6 = arg3;
            if (arg3 < 3 && (class27.field379[1][var4][var5] & 0x2) != 0) {
                var6 = arg3 + 1;
            }
            return class492.field7122[var6].method79(arg1, arg0);
        } else {
            return -92;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Lhq;", line = 106)
    public final class423 method894(int arg0) {
        field1910++;
        class423 var2 = this.field1902.field6146;
        if (arg0 < 48) {
            field1909 = 125;
        }
        if (this.field1902 == var2) {
            this.field1912 = null;
            return null;
        } else {
            this.field1912 = var2.field6146;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 129)
    public final void method895(int arg0) {
        field1914++;
        if (arg0 != 3) {
            return;
        }
        while (true) {
            class423 var2 = this.field1902.field6146;
            if (this.field1902 == var2) {
                this.field1912 = null;
                return;
            }
            var2.method2529((byte) 111);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)I", line = 153)
    public static final int method896(byte arg0, int arg1) {
        field1901++;
        return arg0 > -53 ? -19 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)I", line = 168)
    public static final int method897(int arg0) {
        if (arg0 != -3) {
            return 65;
        }
        field1908++;
        if (class294.field3967 == null) {
            if (!class526.field7677 && class527.field7690 > 0) {
                if (class211.field3011 && class78.field1106.method2585(81, (byte) 72) && class527.field7690 > 2) {
                    return ((class440) class391.field5638.field7789.field6879.field6879).field6342;
                }
                return ((class440) class391.field5638.field7789.field6879).field6342;
            }
            int var1 = class113.field1820.method55((byte) -37);
            int var2 = class113.field1820.method62((byte) 100);
            int var3 = class110.field1797;
            int var4 = class27.field371;
            int var5 = class72.field1031;
            if (var1 > var3 && (var3 + var5) > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class527.field7690; var7++) {
                    if (class170.field2591) {
                        int var12 = (class527.field7690 - (var7 + 1)) * 16 + var4 + 33;
                        if ((var12 - 13) < var2 && var2 <= (var12 + 3)) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class527.field7690 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > (var11 - 13) && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class58 var9 = new class58(class391.field5638);
                    for (class440 var10 = (class440) var9.method379((byte) -127); var10 != null; var10 = (class440) var9.method378(126)) {
                        if ((var8++) == var6) {
                            return var10.field6342;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILhq;)V", line = 268)
    public final void method898(int arg0, class423 arg1) {
        field1911++;
        if (arg1.field6150 != null) {
            arg1.method2529((byte) 118);
        }
        arg1.field6146 = this.field1902;
        arg1.field6150 = this.field1902.field6150;
        if (arg0 >= 51) {
            arg1.field6150.field6146 = arg1;
            arg1.field6146.field6150 = arg1;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 296)
    public class123() {
        this.field1902.field6150 = this.field1902;
        this.field1902.field6146 = this.field1902;
    }
}
