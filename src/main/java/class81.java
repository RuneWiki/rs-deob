import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class81 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1385 = 0;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Z")
    public static boolean field1388 = false;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lwf;")
    public static class250 field1392 = null;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 12)
    public static final void method659(int arg0) {
        if (arg0 != 26326) {
            field1385 = 74;
        }
        field1387++;
        if (class259.field4362 == 10 && class42.field607) {
            class22.method143(-29, 28);
        }
        if (class259.field4362 == 30) {
            class22.method143(arg0 ^ 0xFFFF9935, 25);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 33)
    public static final String method660(String arg0, int arg1) {
        field1389++;
        if (arg0 == null) {
            return null;
        }
        int var2 = arg0.length();
        if (var2 < 1) {
            return null;
        }
        if (var2 > 20) {
            var2 = 20;
        }
        StringBuffer var3 = new StringBuffer(var2);
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (class143.method1105(var5, true)) {
                if (var5 == '[' || var5 == ']' || var5 == '#') {
                    var3.append(var5);
                } else if (var5 != '-') {
                    if (var5 == 'à' || var5 == 'á' || var5 == 'â' || var5 == 'ä' || var5 == 'ã' || var5 == 'À' || var5 == 'Á' || var5 == 'Â' || var5 == 'Ä' || var5 == 'Ã') {
                        var3.append('a');
                    } else if (var5 == 'è' || var5 == 'é' || var5 == 'ê' || var5 == 'ë' || var5 == 'È' || var5 == 'É' || var5 == 'Ê' || var5 == 'Ë') {
                        var3.append('e');
                    } else if (var5 == 'í' || var5 == 'î' || var5 == 'ï' || var5 == 'Í' || var5 == 'Î' || var5 == 'Ï') {
                        var3.append('i');
                    } else if (var5 == 'ò' || var5 == 'ó' || var5 == 'ô' || var5 == 'ö' || var5 == 'õ' || var5 == 'Ò' || var5 == 'Ó' || var5 == 'Ô' || var5 == 'Ö' || var5 == 'Õ') {
                        var3.append('o');
                    } else if (var5 == 'ù' || var5 == 'ú' || var5 == 'û' || var5 == 'ü' || var5 == 'Ù' || var5 == 'Ú' || var5 == 'Û' || var5 == 'Ü') {
                        var3.append('u');
                    } else if (var5 == 'ç' || var5 == 'Ç') {
                        var3.append('c');
                    } else if (var5 == 'ÿ' || var5 == 'Ÿ') {
                        var3.append('y');
                    } else if (var5 == 'ñ' || var5 == 'Ñ') {
                        var3.append('n');
                    } else if (var5 == 'ß') {
                        var3.append("b");
                    } else if (var5 == ' ' || var5 == ' ') {
                        var3.append('_');
                    } else {
                        var3.append(Character.toLowerCase(var5));
                    }
                }
            }
        }
        if (var3.length() == 0) {
            return null;
        } else if (arg1 == -239) {
            return var3.toString();
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lqm;I)V", line = 475)
    public final void method661(class227 arg0, int arg1) {
        field1398++;
        int var3 = 2 / ((18 - arg1) / 37);
        while (true) {
            int var4 = arg0.method1720((byte) -61);
            if (var4 == 0) {
                return;
            }
            this.method663(var4, (byte) -18, arg0);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 494)
    public static void method662(byte arg0) {
        field1392 = null;
        int var1 = 97 / ((arg0 - 82) / 44);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBLqm;)V", line = 503)
    private final void method663(int arg0, byte arg1, class227 arg2) {
        if (arg0 == 1) {
            this.field1391 = arg2.method1765(true);
            this.field1390 = arg2.method1720((byte) -28);
            this.field1397 = arg2.method1720((byte) -32);
        }
        field1396++;
        if (arg1 != -18) {
            method659(-11);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V", line = 523)
    public static final void method664(byte arg0) {
        field1395++;
        class291 var1 = (class291) class206.field3254.method2300((byte) 118);
        if (arg0 > -2) {
            return;
        }
        while (var1 != null) {
            class181 var2 = var1.field4706;
            if (class186.field2991 != var2.field2923 || class332.field5261 > var2.field2924) {
                var1.method330(15);
            } else if (var2.field2914 <= class332.field5261) {
                if (var2.field2902 > 0) {
                    class288 var3 = class165.field2621[var2.field2902 - 1];
                    if (var3 != null && var3.field3577 >= 0 && var3.field3577 < 13312 && var3.field3511 >= 0 && var3.field3511 < 13312) {
                        var2.method1419(var3.field3577, class332.field5261, class271.method2034(-1, var3.field3511, var3.field3577, var2.field2923) - var2.field2922, var3.field3511, (byte) 126);
                    }
                }
                if (var2.field2902 < 0) {
                    int var4 = -var2.field2902 - 1;
                    class258 var5;
                    if (class261.field4399 == var4) {
                        var5 = class6.field55;
                    } else {
                        var5 = class56.field924[var4];
                    }
                    if (var5 != null && var5.field3577 >= 0 && var5.field3577 < 13312 && var5.field3511 >= 0 && var5.field3511 < 13312) {
                        var2.method1419(var5.field3577, class332.field5261, class271.method2034(-1, var5.field3511, var5.field3577, var2.field2923) - var2.field2922, var5.field3511, (byte) 123);
                    }
                }
                var2.method1421(-1, class272.field4516);
                class65.method561(class186.field2991, (int) var2.field2913, (int) var2.field2909, (int) var2.field2889, 60, var2, var2.field2925, -1L, false);
            }
            var1 = (class291) class206.field3254.method2306(-23);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V", line = 582)
    public static final void method665(int arg0) {
        class321.field5105.method2326(arg0 + 215);
        field1393++;
        class360.field5702.method2326(-4);
        if (arg0 != -219) {
            field1385 = 21;
        }
        class2.field10.method2326(-4);
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)Z", line = 601)
    public static final boolean method666(int arg0) {
        field1386++;
        if (arg0 != 25749) {
            return false;
        }
        try {
            return class300.method2153(-1);
        } catch (IOException var5) {
            class152.method1172(0);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class220.field3497 + "," + class340.field5442 + "," + class124.field2125 + " - " + class223.field3706 + "," + (class6.field55.field3519[0] + class93.field1562) + "," + (class6.field55.field3553[0] + class275.field4546) + " - ";
            for (int var4 = 0; var4 < class223.field3706 && var4 < 50; var4++) {
                var3 = var3 + class29.field383.field3793[var4] + ",";
            }
            class285.method2079(var6, (byte) -16, var3);
            class74.method620((byte) -115);
            return true;
        }
    }
}
