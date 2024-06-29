import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class71 extends class5 {

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    public int field1739 = 0;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "Lce;")
    public static class18 field1736 = new class18();

    @OriginalMember(owner = "client!le", name = "eb", descriptor = "I")
    public static int field1745 = 0;

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
    public static int field1742 = 0;

    @OriginalMember(owner = "client!le", name = "fb", descriptor = "Lhb;")
    public static class44 field1746 = class102.method810("Neuer Benutzer", -28606);

    @OriginalMember(owner = "client!le", name = "gb", descriptor = "Lhb;")
    public static class44 field1747 = class102.method810("Ihr Charakter)2Profil wird in:", -28606);

    @OriginalMember(owner = "client!le", name = "ib", descriptor = "Lhb;")
    public static class44 field1749 = class102.method810("mod_icons", -28606);

    @OriginalMember(owner = "client!le", name = "jb", descriptor = "I")
    public static int field1750 = 0;

    @OriginalMember(owner = "client!le", name = "db", descriptor = "I")
    public static int field1744 = 0;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "Lpc;")
    public static class93 field1743;

    @OriginalMember(owner = "client!le", name = "hb", descriptor = "Lpc;")
    public static class93 field1748;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "(I)V", line = 5)
    public static final void method602(int arg0) {
        class81.field2085 = false;
        if (arg0 != 5) {
            field1744 = -68;
        }
        class29.field711 = false;
        field1737++;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IIII)I", line = 24)
    public static final int method603(int arg0, int arg1, int arg2, int arg3) {
        field1741++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            int var5 = -106 / ((arg3 - 25) / 62);
            return arg2;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILwd;I)V", line = 46)
    private final void method604(int arg0, class131 arg1, int arg2) {
        if (arg0 == 496) {
            if (arg2 == 5) {
                this.field1739 = arg1.method1001(arg0 + 64784);
            }
            field1735++;
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)V", line = 64)
    public static final void method605(byte arg0) {
        field1740++;
        class125 var1 = (class125) class96.field2437.method443((byte) -111);
        int var2 = 61 / ((-arg0 - 49) / 56);
        while (var1 != null) {
            if (var1.field3007 > 0) {
                var1.field3007--;
            }
            if (var1.field3007 != 0) {
                if (var1.field3006 > 0) {
                    var1.field3006--;
                }
                if (var1.field3006 == 0 && var1.field3038 >= 1 && var1.field3017 >= 1 && var1.field3038 <= 102 && var1.field3017 <= 102 && (var1.field3018 < 0 || class113.method864(var1.field3015, 29622, var1.field3018))) {
                    class46.method431(var1.field3015, var1.field3038, var1.field3018, -28464, var1.field3011, var1.field3017, var1.field3010, var1.field3003);
                    var1.field3006 = -1;
                    if (var1.field3018 == var1.field3004 && var1.field3004 == -1) {
                        var1.method948(-87);
                    } else if (var1.field3018 == var1.field3004 && var1.field3024 == var1.field3003 && var1.field3015 == var1.field3009) {
                        var1.method948(77);
                    }
                }
            } else if (var1.field3004 < 0 || class113.method864(var1.field3009, 29622, var1.field3004)) {
                class46.method431(var1.field3009, var1.field3038, var1.field3004, -28464, var1.field3011, var1.field3017, var1.field3010, var1.field3024);
                var1.method948(113);
            }
            var1 = (class125) class96.field2437.method434(true);
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(B)V", line = 127)
    public static void method606(byte arg0) {
        field1749 = null;
        field1736 = null;
        if (arg0 != 46) {
            method603(-22, 11, -59, -15);
        }
        field1748 = null;
        field1747 = null;
        field1743 = null;
        field1746 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lwd;B)V", line = 158)
    public final void method607(class131 arg0, byte arg1) {
        if (arg1 != 33) {
            field1743 = null;
        }
        field1738++;
        while (true) {
            int var3 = arg0.method971(true);
            if (var3 == 0) {
                return;
            }
            this.method604(496, arg0, var3);
        }
    }
}
