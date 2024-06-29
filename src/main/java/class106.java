import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class106 {

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1646 = " more options";

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field1639 = 0;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "Lka;")
    public static class104 field1642 = new class104(5000);

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 4)
    public static final void method767(byte arg0) {
        field1644++;
        class202.field3028.method2174(-10385);
        class31.field447.method2174(-10385);
        if (arg0 < 10) {
            field1646 = (String) null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 18)
    public static void method768(int arg0) {
        field1646 = null;
        field1642 = null;
        int var1 = -101 / ((60 - arg0) / 63);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZBZI)Ll;", line = 43)
    public static final class133 method769(boolean arg0, boolean arg1, byte arg2, boolean arg3, int arg4) {
        field1645++;
        class314 var5 = null;
        int var6 = 89 % ((arg2 + 8) / 58);
        if (class52.field849 != null) {
            var5 = new class314(arg4, class52.field849, class108.field1701[arg4], 1000000);
        }
        class235.field3753[arg4] = class322.field5022.method290(var5, class31.field455, (byte) 124, arg4);
        if (arg0) {
            class235.field3753[arg4].method782((byte) -64);
        }
        return new class133(class235.field3753[arg4], arg3, arg1);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BIII)I", line = 64)
    public static final int method770(byte arg0, int arg1, int arg2, int arg3) {
        field1640++;
        if (arg0 >= -107) {
            method767((byte) 18);
        }
        int var4 = class15.field215[class66.method503(arg3, arg2)];
        if (arg1 > 0) {
            int var5 = class15.field207.method2088(arg1 & 0xFFFF, (byte) 66);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 <= 127) {
                    var6 = arg2 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var6 & 0xFF00) * var5 + ((var4 & 0xFF00) * var8) & 0xFF0000) + ((var6 & 0xFF00FF) * var5 + ((var4 & 0xFF00FF) * var8) & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class15.field207.method2082(255, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var11 & 0xFF00) + (var12 >> 8) + (var10 << 8 & 0xFF0039);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIII)V", line = 148)
    public static final void method771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 0) {
            field1642 = (class104) null;
        }
        field1638++;
        if (class206.field3170 <= arg2 && class12.field184 >= arg5 && class119.field1817 <= arg0 && arg4 <= class141.field2187) {
            class294.method2000(false, arg2, arg5, arg3, arg0, arg4);
        } else {
            class78.method572(arg2, arg3, arg5, false, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V", line = 169)
    public static final void method772(int arg0) {
        class241 var1 = (class241) class273.field4229.method636(-1);
        if (arg0 != -28727) {
            method767((byte) 72);
        }
        field1643++;
        while (var1 != null) {
            if (var1.field3847 > 0) {
                var1.field3847--;
            }
            if (var1.field3847 != 0) {
                if (var1.field3860 > 0) {
                    var1.field3860--;
                }
                if (var1.field3860 == 0 && var1.field3859 >= 1 && var1.field3843 >= 1 && var1.field3859 <= 102 && var1.field3843 <= 102 && (var1.field3863 < 0 || class204.method1443(arg0 ^ 0xFFFF89C9, var1.field3863, var1.field3855))) {
                    class297.method2015(var1.field3843, 55, var1.field3851, var1.field3859, var1.field3855, var1.field3863, var1.field3844, var1.field3850);
                    var1.field3860 = -1;
                    if (var1.field3863 == var1.field3857 && var1.field3857 == -1) {
                        var1.method403(1);
                    } else if (var1.field3863 == var1.field3857 && var1.field3850 == var1.field3849 && var1.field3855 == var1.field3854) {
                        var1.method403(1);
                    }
                }
            } else if (var1.field3857 < 0 || class204.method1443(1536, var1.field3857, var1.field3854)) {
                class297.method2015(var1.field3843, arg0 + 28781, var1.field3851, var1.field3859, var1.field3854, var1.field3857, var1.field3844, var1.field3849);
                var1.method403(1);
            }
            var1 = (class241) class273.field4229.method638(78);
        }
    }
}
