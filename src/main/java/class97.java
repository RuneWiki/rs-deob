import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class97 {

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[I")
    public static int[] field1813 = new int[1000];

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
    public static int[] field1811 = new int[32768];

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field1820 = 0;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field1821 = 0;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Ldd;")
    public static class211 field1810;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Ldd;")
    public static class211 field1812;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lli;Lp;B)Lli;")
    public static final class185 method621(class185 arg0, class82 arg1, byte arg2) {
        if (arg0.method1321((byte) 111, class228.field4156) != -1) {
            label62: while (true) {
                int var3 = arg0.method1321((byte) 111, class110.field1974);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method1321((byte) 65, class55.field939);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method1321((byte) 52, class131.field2348);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method1321((byte) 96, class199.field3661);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method1321((byte) 58, class210.field3834);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method1321((byte) 88, class156.field2942);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class185 var9 = class20.field336;
                                                        if (class256.field4555 != null) {
                                                            var9 = class237.method1607(class256.field4555.field489, (byte) -95);
                                                            try {
                                                                if (class256.field4555.field486 != null) {
                                                                    byte[] var10 = ((String) class256.field4555.field486).getBytes("ISO-8859-1");
                                                                    var9 = class204.method1451(var10, (byte) -115, var10.length, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class87.method567(-11039, new class185[] { arg0.method1301((byte) -97, var8, 0), var9, arg0.method1310(39, var8 + 4) });
                                                    }
                                                }
                                                arg0 = class87.method567(-11039, new class185[] { arg0.method1301((byte) -52, var7, 0), class24.method165(-29515, class156.method1110(arg1, 4, (byte) 96)), arg0.method1310(39, var7 + 2) });
                                            }
                                        }
                                        arg0 = class87.method567(-11039, new class185[] { arg0.method1301((byte) -104, var6, 0), class24.method165(-29515, class156.method1110(arg1, 3, (byte) 118)), arg0.method1310(39, var6 + 2) });
                                    }
                                }
                                arg0 = class87.method567(-11039, new class185[] { arg0.method1301((byte) -51, var5, 0), class24.method165(-29515, class156.method1110(arg1, 2, (byte) 76)), arg0.method1310(39, var5 + 2) });
                            }
                        }
                        arg0 = class87.method567(-11039, new class185[] { arg0.method1301((byte) -75, var4, 0), class24.method165(-29515, class156.method1110(arg1, 1, (byte) 117)), arg0.method1310(39, var4 + 2) });
                    }
                }
                arg0 = class87.method567(-11039, new class185[] { arg0.method1301((byte) -86, var3, 0), class24.method165(-29515, class156.method1110(arg1, 0, (byte) 106)), arg0.method1310(39, var3 + 2) });
            }
        }
        field1814++;
        if (arg2 < 6) {
            field1820 = -56;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)I")
    public static final int method622(byte arg0, int arg1) {
        if (arg0 >= -26) {
            method621((class185) null, (class82) null, (byte) 43);
        }
        field1816++;
        return (arg1 & 0x1C0995) >> 18;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V")
    public static final void method623(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1817++;
        class18 var5 = (class18) class152.field2871.method195(arg0 ^ 0x7E, (long) arg1);
        if (var5 == null) {
            var5 = new class18();
            class152.field2871.method190(var5, (byte) -85, (long) arg1);
        }
        if (arg3 >= var5.field286.length) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field286.length; var8++) {
                var6[var8] = var5.field286[var8];
                var7[var8] = var5.field285[var8];
            }
            for (int var9 = var5.field286.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field285 = var7;
            var5.field286 = var6;
        }
        var5.field286[arg3] = arg4;
        var5.field285[arg3] = arg2;
        if (arg0 != 1) {
            method624((byte) -107);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method624(byte arg0) {
        field1813 = null;
        int var1 = -67 / ((arg0 + 45) / 53);
        field1810 = null;
        field1811 = null;
        field1812 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLp;)Z")
    public static final boolean method625(byte arg0, class82 arg1) {
        field1819++;
        if (arg1.field1615 == null) {
            return false;
        }
        if (arg0 < 120) {
            method625((byte) -126, (class82) null);
        }
        for (int var2 = 0; var2 < arg1.field1615.length; var2++) {
            int var3 = class156.method1110(arg1, var2, (byte) 88);
            int var4 = arg1.field1545[var2];
            if (arg1.field1615[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field1615[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field1615[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }
}
