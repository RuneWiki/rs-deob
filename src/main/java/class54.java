import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 extends class66 {

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
    public static int field1233 = 0;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "Lv;")
    public static class146 field1231 = class159.method1226((byte) -37, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!he", name = "gb", descriptor = "I")
    public static int field1238 = 0;

    @OriginalMember(owner = "client!he", name = "db", descriptor = "Lv;")
    private static class146 field1235 = class159.method1226((byte) -37, "Please wait)3)3)3");

    @OriginalMember(owner = "client!he", name = "ub", descriptor = "Lv;")
    public static class146 field1252 = field1235;

    @OriginalMember(owner = "client!he", name = "eb", descriptor = "Lv;")
    private static class146 field1236 = class159.method1226((byte) -37, "Please enter your password)3");

    @OriginalMember(owner = "client!he", name = "mb", descriptor = "Lv;")
    public static class146 field1244 = field1236;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
    public static int field1232 = 0;

    @OriginalMember(owner = "client!he", name = "kb", descriptor = "Lv;")
    public static class146 field1242 = class159.method1226((byte) -37, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!he", name = "xb", descriptor = "I")
    public static int field1255 = 127;

    @OriginalMember(owner = "client!he", name = "yb", descriptor = "Lv;")
    private static class146 field1256 = class159.method1226((byte) -37, "glow2:");

    @OriginalMember(owner = "client!he", name = "pb", descriptor = "Lv;")
    public static class146 field1247 = class159.method1226((byte) -37, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!he", name = "ib", descriptor = "Lv;")
    public static class146 field1240 = field1256;

    @OriginalMember(owner = "client!he", name = "sb", descriptor = "Lv;")
    public static class146 field1250 = field1256;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!he", name = "fb", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!he", name = "hb", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!he", name = "lb", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!he", name = "nb", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!he", name = "ob", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!he", name = "qb", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!he", name = "rb", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!he", name = "tb", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "client!he", name = "vb", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!he", name = "wb", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!he", name = "zb", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!he", name = "jb", descriptor = "Ldc;")
    public static class25 field1241;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILdc;I)V")
    public static final void method359(int arg0, class25 arg1, int arg2) {
        field1257++;
        if (class41.field930 == null) {
            class68.method481(255, (byte) -85, arg0, null, true, (byte) 0, 255);
            class38.field857[arg2] = arg1;
        } else {
            class41.field930.field2304 = arg2 * 8 + 5;
            int var3 = class41.field930.method740((byte) -62);
            int var4 = class41.field930.method740((byte) 66);
            arg1.method154(var4, var3, 4111);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[BI)I")
    public static final int method360(int arg0, byte[] arg1, int arg2) {
        if (arg2 != -21736) {
            method363(null, -55);
        }
        field1254++;
        return class58.method401(arg0, arg1, arg2 + 21674, 0);
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Z")
    public static final boolean method361(int arg0) {
        field1230++;
        class98 var1 = class6.field150;
        synchronized (class6.field150) {
            if (class155.field3532 == class121.field2811) {
                return false;
            }
            class33.field711 = class67.field1521[class121.field2811];
            class94.field2236 = class113.field2640[class121.field2811];
            class121.field2811 = class121.field2811 + 1 & 0x7F;
            int var3 = 50 % ((-arg0 - 58) / 61);
            return true;
        }
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V")
    public static final void method362(int arg0) {
        field1239++;
        class107 var1 = class110.field2601;
        synchronized (class110.field2601) {
            class146.field3386 = class69.field1621;
            class2.field45 = class13.field221;
            class151.field3491 = class118.field2742;
            class46.field1065 = class137.field3115;
            class90.field2150 = class51.field1160;
            class25.field401 = class148.field3446;
            class44.field1000 = class28.field582;
            class137.field3115 = 0;
            if (arg0 != -13611) {
                field1252 = null;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lla;I)V")
    public static final void method363(class77 arg0, int arg1) {
        class143.field3278 = arg0;
        if (arg1 == 0) {
            field1237++;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILv;)Z")
    public static final boolean method364(int arg0, class146 arg1) {
        field1234++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 5) {
            method365(19, 24);
        }
        for (int var2 = 0; var2 < field1233; var2++) {
            if (arg1.method1111(class90.field2138[var2], arg0 - 46)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Z")
    public static final boolean method365(int arg0, int arg1) {
        field1245++;
        if (class110.field2609[arg1]) {
            return true;
        } else if (class37.field820.method584(arg1, arg0 - 29771)) {
            int var2 = class37.field820.method578(arg1, 0);
            if (var2 == 0) {
                class110.field2609[arg1] = true;
                return true;
            }
            if (class34.field736[arg1] == null) {
                class34.field736[arg1] = new class26[var2];
            }
            int var3 = 0;
            if (arg0 != 29657) {
                return true;
            }
            while (var3 < var2) {
                if (class34.field736[arg1][var3] == null) {
                    byte[] var4 = class37.field820.method585(arg1, 112, var3);
                    if (var4 != null) {
                        class34.field736[arg1][var3] = new class26();
                        class34.field736[arg1][var3].field547 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class34.field736[arg1][var3].method175((byte) 76, new class95(var4));
                        } else {
                            class34.field736[arg1][var3].method167(new class95(var4), (byte) 104);
                        }
                    }
                }
                var3++;
            }
            class110.field2609[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V")
    public static void method366(boolean arg0) {
        field1231 = null;
        field1240 = null;
        field1242 = null;
        field1256 = null;
        field1236 = null;
        field1235 = null;
        field1252 = null;
        field1247 = null;
        field1250 = null;
        if (arg0) {
            field1241 = null;
            field1244 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIBII)V")
    public static final void method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field1246++;
        if (method365(29657, arg2)) {
            class115.field2669 = null;
            if (arg6 <= 126) {
                field1231 = null;
            }
            class117.method898(arg8, arg4, class34.field736[arg2], arg5, arg1, -1, (byte) 104, arg7, arg0, arg3);
            if (class115.field2669 != null) {
                class117.method898(arg8, arg4, class115.field2669, arg5, class34.field733, -1412584499, (byte) 104, arg7, class82.field2003, arg3);
                class115.field2669 = null;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class83.field2013[var9] = true;
            }
        } else {
            class83.field2013[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Lu;")
    public final class139 method255(byte arg0) {
        if (arg0 > -90) {
            field1244 = null;
        }
        field1243++;
        return class73.method524((byte) 120, this.field1248).method403((byte) -125, this.field1251);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLne;)V")
    public static final void method368(boolean arg0, class95 arg1) {
        byte[] var2 = new byte[24];
        field1253++;
        if (arg0) {
            return;
        }
        if (class82.field1980 != null) {
            try {
                int var3 = 0;
                class82.field1980.method994(0L, 0);
                class82.field1980.method986(false, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method792(var2, 0, -116, 24);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method369(String arg0, int arg1) throws ClassNotFoundException {
        if (arg1 != -11589) {
            field1238 = -26;
        }
        field1249++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }
}
