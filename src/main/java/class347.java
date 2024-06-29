import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class347 extends class599 {

    @OriginalMember(owner = "client!ofa", name = "A", descriptor = "I")
    private int field5633;

    @OriginalMember(owner = "client!ofa", name = "t", descriptor = "I")
    private int field5621;

    @OriginalMember(owner = "client!ofa", name = "o", descriptor = "I")
    private int field5636;

    @OriginalMember(owner = "client!ofa", name = "s", descriptor = "I")
    private int field5623;

    @OriginalMember(owner = "client!ofa", name = "B", descriptor = "I")
    private int field5624;

    @OriginalMember(owner = "client!ofa", name = "z", descriptor = "Lgca;")
    private class261 field5622;

    @OriginalMember(owner = "client!ofa", name = "E", descriptor = "I")
    private int field5631;

    @OriginalMember(owner = "client!ofa", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field5638 = new String[] { method2906(method2905("v!\u0015\u007f\u00151")), method2906(method2905("v!\u0015\u007fhp)\u001d%j1")), method2906(method2905("w2\u0018=")), method2906(method2905("biZ\u007f)")), method2906(method2905("v!\u0015\u007f\u00121")), method2906(method2905("v!\u0015\u007f\u00131")), method2906(method2905("v!\u0015\u007f\u00101")), method2906(method2905("v!\u0015\u007f\u00111")) };

    @OriginalMember(owner = "client!ofa", name = "r", descriptor = "Lvn;")
    public static class330 field5630 = new class330(54, 4);

    @OriginalMember(owner = "client!ofa", name = "u", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!ofa", name = "w", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!ofa", name = "q", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!ofa", name = "p", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!ofa", name = "D", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!ofa", name = "C", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!ofa", name = "x", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!ofa", name = "v", descriptor = "Loda;")
    private class125 field5637;

    @OriginalMember(owner = "client!ofa", name = "y", descriptor = "Luh;")
    public static class174 field5632;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(B)V")
    public static void method2900(byte arg0) {
        try {
            field5632 = null;
            field5630 = null;
            if (arg0 != 51) {
                method2901(true, null, (byte) -34, -89, -57, 120);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5638[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZLgda;BIII)V")
    public static final void method2901(boolean arg0, class58 arg1, byte arg2, int arg3, int arg4, int arg5) {
        try {
            field5625++;
            class37.method364(0L, arg1, arg0, arg4, arg5, arg3, (byte) 126);
            int var6 = -22 / ((54 - arg2) / 59);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5638[7] + arg0 + ',' + (arg1 == null ? field5638[2] : field5638[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "(I)Loda;")
    public final class125 method2902(int arg0) {
        try {
            field5629++;
            if (this.field5637 == null) {
                class132.field1887[2] = this.field5633;
                class158 var2 = this.field5622.field864;
                class132.field1887[1] = this.field5623;
                class132.field1887[4] = this.field5631;
                class132.field1887[3] = this.field5624;
                class132.field1887[0] = this.field5621;
                class132.field1887[5] = this.field5636;
                boolean var3 = false;
                int var4 = 0;
                for (int var5 = 0; var5 < 6; var5++) {
                    if (!var2.method1417((byte) 112, class132.field1887[var5])) {
                        return null;
                    }
                    class304 var6 = var2.method1419(class132.field1887[var5], -97);
                    int var7 = var6.field4911 ? 64 : 128;
                    if (var6.field4904 > 0) {
                        var3 = true;
                    }
                    if (var4 < var7) {
                        var4 = var7;
                    }
                }
                for (int var8 = 0; var8 < 6; var8++) {
                    class115.field1679[var8] = var2.method1420(var4, false, var4, class132.field1887[var8], 1.0F, -7385);
                }
                this.field5637 = this.field5622.method1049((byte) -121, class115.field1679, var3, var4);
            }
            return arg0 > -123 ? null : this.field5637;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field5638[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IBILgda;)Lpja;")
    public static final class40 method2903(int arg0, byte arg1, int arg2, class58 arg3) {
        try {
            field5626++;
            class176 var4 = new class176(arg3.method604((byte) 120, arg0, arg2));
            int var5 = -113 / ((arg1 + 15) / 58);
            class40 var6 = new class40(arg0, var4.method1635((byte) 116), var4.method1635((byte) 89), var4.method1622(-18712), var4.method1622(-18712), var4.method1645((byte) -120) == 1, var4.method1645((byte) -128), var4.method1645((byte) -107));
            int var7 = var4.method1645((byte) -87);
            for (int var8 = 0; var8 < var7; var8++) {
                var6.field449.method3220(new class579(var4.method1645((byte) -123), var4.method1687((byte) -117), var4.method1687((byte) -56), var4.method1687((byte) -71), var4.method1687((byte) -49), var4.method1687((byte) -51), var4.method1687((byte) -80), var4.method1687((byte) -46), var4.method1687((byte) -96)), 0);
            }
            var6.method378(0);
            return var6;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field5638[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5638[2] : field5638[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIB)I")
    public static final int method2904(int arg0, int arg1, byte arg2) {
        try {
            field5627++;
            if (arg1 == -1) {
                return 12345678;
            }
            arg0 = (arg1 & 0x7F) * arg0 >> 7;
            if (arg2 != 101) {
                field5632 = null;
            }
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return (arg1 & 0xFF80) + arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5638[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Lgca;IIIIII)V")
    public class347(class261 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.field5633 = arg3;
            this.field5621 = arg1;
            this.field5636 = arg6;
            this.field5623 = arg2;
            this.field5624 = arg4;
            this.field5622 = arg0;
            this.field5631 = arg5;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field5638[1] + (arg0 == null ? field5638[2] : field5638[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ofa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2905(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x54);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ofa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2906(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 25;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 84;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
