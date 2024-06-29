import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class134 extends class133 {

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "Lph;")
    public static class229 field2172 = class266.method1858("", 0);

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "Lph;")
    private static class229 field2171 = class266.method1858("Choose Option", 0);

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "Lph;")
    public static class229 field2176 = class266.method1858("Suche nach Updates )2 ", 0);

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "Lph;")
    public static class229 field2174 = class266.method1858(" )2> <col=ffff00>", 0);

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "Lph;")
    public static class229 field2181 = field2172;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "Lph;")
    public static class229 field2183 = field2171;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "Lph;")
    public static class229 field2175 = class266.method1858("loc", 0);

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "Lph;")
    public static class229 field2186 = field2172;

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "I")
    public static int field2187 = 0;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "Lja;")
    public static class143 field2173 = new class143(128);

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    public int field2178;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "Lph;")
    public class229 field2177;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "Lph;")
    public class229 field2185;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B[F)[F", line = 4)
    public static final float[] method949(byte arg0, float[] arg1) {
        field2180++;
        if (arg1 == null) {
            return null;
        } else {
            float[] var2 = new float[arg1.length];
            int var3 = -110 / ((arg0 + 4) / 47);
            class42.method318(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "(B)V", line = 23)
    public static final void method950(byte arg0) {
        field2179++;
        class39.field614.method1414(125);
        if (arg0 > -114) {
            field2174 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 35)
    public static void method951(int arg0) {
        field2175 = null;
        field2176 = null;
        field2174 = null;
        field2186 = null;
        if (arg0 != 1) {
            field2187 = -92;
        }
        field2181 = null;
        field2172 = null;
        field2173 = null;
        field2171 = null;
        field2183 = null;
    }

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "(B)Lic;", line = 62)
    public final class180 method952(byte arg0) {
        if (arg0 != 95) {
            this.method952((byte) 13);
        }
        field2182++;
        return class298.field4844[this.field2156];
    }

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "(B)V", line = 99)
    public static final void method953(byte arg0) {
        field2184++;
        if (class255.method1779(14838) != 2) {
            return;
        }
        int var1 = class188.field3055 % 104;
        byte var2 = (byte) (class188.field3055 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class142.field2301[var3][var1][var4] = var2;
            }
        }
        if (arg0 != -98 || class298.field4849 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class136.field2206[var5] = -1000000;
            class331.field5632[var5] = 1000000;
            class148.field2389[var5] = 0;
            class15.field187[var5] = 1000000;
            class222.field3659[var5] = 0;
        }
        if (class217.field3565 != 1) {
            int var16 = class259.method1801(class167.field2725, -20428, class298.field4849, class192.field3177);
            if ((var16 - class205.field3387) < 800 && (class245.field4050[class298.field4849][class192.field3177 >> 7][class167.field2725 >> 7] & 0x4) != 0) {
                class24.method150(1, class225.field3705, false, 10807, class167.field2725 >> 7, class192.field3177 >> 7);
            }
            return;
        }
        if ((class245.field4050[class298.field4849][class230.field3820.field5147 >> 7][class230.field3820.field5168 >> 7] & 0x4) != 0) {
            class24.method150(0, class225.field3705, false, 10807, class230.field3820.field5168 >> 7, class230.field3820.field5147 >> 7);
        }
        if (class222.field3653 >= 310) {
            return;
        }
        int var6 = class192.field3177 >> 7;
        int var7 = class167.field2725 >> 7;
        int var8 = class230.field3820.field5168 >> 7;
        int var9 = class230.field3820.field5147 >> 7;
        int var10;
        if (var8 > var7) {
            var10 = var8 - var7;
        } else {
            var10 = var7 - var8;
        }
        int var11;
        if (var6 >= var9) {
            var11 = var6 - var9;
        } else {
            var11 = var9 - var6;
        }
        if (var11 > var10) {
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var6 != var9) {
                if (var6 < var9) {
                    var6++;
                } else if (var6 > var9) {
                    var6--;
                }
                if ((class245.field4050[class298.field4849][var6][var7] & 0x4) != 0) {
                    class24.method150(1, class225.field3705, false, 10807, var7, var6);
                    break;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var8 > var7) {
                        var7++;
                    } else if (var8 < var7) {
                        var7--;
                    }
                    if ((class245.field4050[class298.field4849][var6][var7] & 0x4) != 0) {
                        class24.method150(1, class225.field3705, false, 10807, var7, var6);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var11 * 65536 / var10;
        int var13 = 32768;
        while (var7 != var8) {
            if (var8 > var7) {
                var7++;
            } else if (var7 > var8) {
                var7--;
            }
            if ((class245.field4050[class298.field4849][var6][var7] & 0x4) != 0) {
                class24.method150(1, class225.field3705, false, arg0 + 10905, var7, var6);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                if (var6 < var9) {
                    var6++;
                } else if (var9 < var6) {
                    var6--;
                }
                var13 -= 65536;
                if ((class245.field4050[class298.field4849][var6][var7] & 0x4) != 0) {
                    class24.method150(1, class225.field3705, false, arg0 + 10905, var7, var6);
                    break;
                }
            }
        }
    }
}
