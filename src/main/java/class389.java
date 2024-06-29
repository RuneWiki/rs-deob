import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class389 {

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "Lad;")
    private class11 field5117 = new class11(64);

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Ldn;")
    private class201 field5111;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Ldn;")
    public class201 field5114;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lpi;")
    public static class340 field5110 = new class340(0, -2);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[B)Ljava/lang/String;", line = 4)
    public static final String method2318(int arg0, int arg1, int arg2, byte[] arg3) {
        field5109++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        int var6 = 0;
        int var7 = -13 % ((8 - arg1) / 59);
        while (arg0 > var6) {
            int var8 = arg3[arg2 + var6] & 0xFF;
            if (var8 != 0) {
                if (var8 >= 128 && var8 < 160) {
                    char var9 = class168.field2194[var8 - 128];
                    if (var9 == '\u0000') {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var4[var5++] = (char) var8;
            }
            var6++;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)Lof;", line = 43)
    public final class407 method2319(byte arg0, int arg1) {
        field5113++;
        class11 var3 = this.field5117;
        class407 var4;
        synchronized (this.field5117) {
            var4 = (class407) this.field5117.method78((long) arg1, (byte) -98);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5111.method1313((byte) -106, 3, arg1);
        class407 var6 = new class407();
        var6.field5452 = this;
        if (var5 != null) {
            var6.method2415(new class88(var5), (byte) -95);
        }
        if (arg0 > -87) {
            this.field5117 = null;
        }
        class11 var7 = this.field5117;
        synchronized (this.field5117) {
            this.field5117.method88((long) arg1, 107, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IC)C", line = 73)
    public static final char method2320(int arg0, char arg1) {
        if (arg0 != 17270) {
            return (char) 65473;
        }
        field5108++;
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 474)
    public static void method2321(byte arg0) {
        field5110 = null;
        if (arg0 <= 33) {
            method2321((byte) -1);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(BI)V", line = 484)
    public final void method2322(byte arg0, int arg1) {
        field5107++;
        class11 var3 = this.field5117;
        synchronized (this.field5117) {
            int var4 = -127 % ((66 - arg0) / 46);
            this.field5117.method80(-123, arg1);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 497)
    public final void method2323(int arg0) {
        field5115++;
        class11 var2 = this.field5117;
        synchronized (this.field5117) {
            this.field5117.method84(arg0 - 153);
        }
        if (arg0 != 100) {
            this.method2325(-126);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 512)
    public static final void method2324(int arg0) {
        for (int var1 = 0; var1 < class405.field5433; var1++) {
            class449 var2 = class46.field673[var1];
            boolean var3 = false;
            if (var2.field6259 == null) {
                var2.field6258--;
                if (var2.field6258 >= (var2.field6253 == 2 ? -1500 : -10)) {
                    if (var2.field6253 == 1 && var2.field6246 == null) {
                        var2.field6246 = class384.method2299(class135.field1829, var2.field6260, 0);
                        if (var2.field6246 == null) {
                            continue;
                        }
                        var2.field6258 += var2.field6246.method2298();
                    } else if (var2.field6253 == 2 && (var2.field6248 == null || var2.field6251 == null)) {
                        if (var2.field6248 == null) {
                            var2.field6248 = class309.method1843(class351.field4485, var2.field6260);
                        }
                        if (var2.field6248 == null) {
                            continue;
                        }
                        if (var2.field6251 == null) {
                            var2.field6251 = var2.field6248.method1844(new int[] { 22050 });
                            if (var2.field6251 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field6258 < 0) {
                        int var4;
                        if (var2.field6249 == 0) {
                            var4 = class421.field5647.field7704 * var2.field6250 >> 8;
                        } else {
                            int var5 = (var2.field6249 & 0x3A68C5B) >> 24;
                            if (class37.field573.field6220 == var5) {
                                int var6 = var2.field6249 & 0xFF << 7;
                                int var7 = (var2.field6249 & 0xFFA77B) >> 16;
                                int var8 = (var7 << 7) + 64 - class37.field573.field6239;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var2.field6249 >> 8 & 0xFF;
                                int var10 = (var9 << 7) + 64 - class37.field573.field6241;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var6 < var11) {
                                    var2.field6258 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var4 = (var6 - var11) * class421.field5647.field7695 * var2.field6250 / var6 >> 8;
                            } else {
                                var4 = 0;
                            }
                        }
                        if (var4 > 0) {
                            class59 var12 = null;
                            if (var2.field6253 == 1) {
                                var12 = var2.field6246.method2300().method337(class439.field6117);
                            } else if (var2.field6253 == 2) {
                                var12 = var2.field6251;
                            }
                            class383 var13 = var2.field6259 = class383.method2257(var12, 100, var4);
                            var13.method2287(var2.field6257 - 1);
                            class18.field313.method1891(var13);
                        }
                    }
                } else {
                    var3 = true;
                }
            } else if (!var2.field6259.method3019(-128)) {
                var3 = true;
            }
            if (var3) {
                class405.field5433--;
                for (int var14 = var1; var14 < class405.field5433; var14++) {
                    class46.field673[var14] = class46.field673[var14 + 1];
                }
                var1--;
            }
        }
        field5116++;
        if (arg0 != -234) {
            field5110 = null;
        }
        if (class265.field3366 && !class342.method2013(73)) {
            if (class421.field5647.field7712 != 0 && class513.field7546 != -1) {
                class362.method2121(class421.field5647.field7712, (byte) -81, 0, false, class288.field3685, class513.field7546);
            }
            class265.field3366 = false;
        } else if (class421.field5647.field7712 != 0 && class513.field7546 != -1 && !class342.method2013(-76)) {
            class443.field6165++;
            class420.method2472((byte) -101, class482.field7030);
            class319.field4112.method572(-117, class513.field7546);
            class513.field7546 = -1;
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 689)
    public final void method2325(int arg0) {
        class11 var2 = this.field5117;
        synchronized (this.field5117) {
            this.field5117.method90((byte) -27);
        }
        if (arg0 != -1500) {
            this.field5117 = null;
        }
        field5112++;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lgt;ILdn;Ldn;)V", line = 711)
    public class389(class65 arg0, int arg1, class201 arg2, class201 arg3) {
        this.field5111 = arg2;
        this.field5114 = arg3;
        this.field5111.method1302(-119, 3);
    }
}
