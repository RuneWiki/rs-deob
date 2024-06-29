import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 extends class51 {

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "I")
    public int field1166 = -1;

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "I")
    public int field1167 = -1;

    @OriginalMember(owner = "client!gd", name = "lb", descriptor = "Z")
    public boolean field1172 = true;

    @OriginalMember(owner = "client!gd", name = "nb", descriptor = "I")
    public int field1174 = 0;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "Lic;")
    public static class59 field1154 = class59.method433(0, "Hidden)2");

    @OriginalMember(owner = "client!gd", name = "pb", descriptor = "[Lwd;")
    public static class157[] field1176 = new class157[2048];

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "[[B")
    public static byte[][] field1168 = new byte[1000][];

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "[I")
    public static int[] field1158 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!gd", name = "jb", descriptor = "Lic;")
    public static class59 field1170 = class59.method433(0, "0(U");

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public static int field1157 = 0;

    @OriginalMember(owner = "client!gd", name = "ub", descriptor = "I")
    public static int field1181 = 0;

    @OriginalMember(owner = "client!gd", name = "rb", descriptor = "I")
    public static int field1178 = -1;

    @OriginalMember(owner = "client!gd", name = "kb", descriptor = "Lm;")
    public static class83 field1171 = new class83();

    @OriginalMember(owner = "client!gd", name = "xb", descriptor = "Lic;")
    public static class59 field1184 = class59.method433(0, "Weiter");

    @OriginalMember(owner = "client!gd", name = "zb", descriptor = "Lic;")
    private static class59 field1186 = class59.method433(0, "Existing User");

    @OriginalMember(owner = "client!gd", name = "Ab", descriptor = "Lic;")
    public static class59 field1187 = field1186;

    @OriginalMember(owner = "client!gd", name = "Cb", descriptor = "Lic;")
    public static class59 field1189 = class59.method433(0, "null");

    @OriginalMember(owner = "client!gd", name = "Bb", descriptor = "Lic;")
    public static class59 field1188 = class59.method433(0, "<col=00ff80>");

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!gd", name = "ob", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!gd", name = "qb", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!gd", name = "sb", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "client!gd", name = "tb", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!gd", name = "vb", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!gd", name = "wb", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!gd", name = "Db", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!gd", name = "yb", descriptor = "Lpd;")
    public static class108 field1185;

    @OriginalMember(owner = "client!gd", name = "mb", descriptor = "[[Lwf;")
    public static class159[][] field1173;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
    private final void method355(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field1175++;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = var3;
        double var11 = (double) (arg1 & arg0) / 256.0D;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var5 > var3) {
            var7 = var5;
        }
        double var13 = 0.0D;
        if (var9 > var11) {
            var9 = var11;
        }
        if (var7 < var11) {
            var7 = var11;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var9) / 2.0D;
        if (var7 != var9) {
            if (var3 == var7) {
                var15 = (var5 - var11) / (-var9 + var7);
            } else if (var5 == var7) {
                var15 = (var11 - var3) / (var7 - var9) + 2.0D;
            } else if (var7 == var11) {
                var15 = (var3 - var5) / (-var9 + var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var7 - var9) / (var7 + var9);
            }
            if (var17 >= 0.5D) {
                var13 = (var7 - var9) / (2.0D - var7 - var9);
            }
        }
        this.field1182 = (int) (var13 * 256.0D);
        double var19 = var15 / 6.0D;
        this.field1179 = (int) (var17 * 256.0D);
        if (this.field1179 < 0) {
            this.field1179 = 0;
        } else if (this.field1179 > 255) {
            this.field1179 = 255;
        }
        this.field1162 = (int) (var19 * 256.0D);
        if (this.field1182 < 0) {
            this.field1182 = 0;
        } else if (this.field1182 > 255) {
            this.field1182 = 255;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIILwf;IIII)V")
    public static final void method356(int arg0, int arg1, int arg2, class159 arg3, int arg4, int arg5, int arg6, int arg7) {
        field1169++;
        if (class89.field2243) {
            class60.field1473 = 32;
        } else {
            class60.field1473 = 0;
        }
        class89.field2243 = false;
        if (class159.field3667 != 0) {
            if (arg7 <= arg6 && arg7 + 16 > arg6 && arg5 <= arg2 && arg5 + 16 > arg2) {
                arg3.field3538 -= 4;
                class42.method320(false, arg3);
            } else if (arg7 <= arg6 && arg6 < arg7 + 16 && arg5 + arg1 - 16 <= arg2 && arg1 + arg5 > arg2) {
                arg3.field3538 += 4;
                class42.method320(false, arg3);
            } else if (arg7 - class60.field1473 <= arg6 && class60.field1473 + arg7 + 16 > arg6 && arg2 >= arg5 + 16 && arg2 < arg5 + arg1 - 16) {
                int var8 = (arg1 - 32) * arg1 / arg0;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - arg5 - var8 / 2 - 16;
                int var10 = arg1 - var8 - 32;
                arg3.field3538 = (arg0 - arg1) * var9 / var10;
                class42.method320(false, arg3);
                class89.field2243 = true;
            }
        }
        int var11 = -115 % ((66 - arg4) / 59);
        if (class154.field3352 == 0) {
            return;
        }
        int var12 = arg3.field3629;
        if (arg7 - var12 <= arg6 && arg2 >= arg5 && arg7 + 16 > arg6 && arg1 + arg5 >= arg2) {
            arg3.field3538 += class154.field3352 * 45;
            class42.method320(false, arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)Loa;")
    public static final class98 method357(byte arg0) {
        field1177++;
        try {
            if (arg0 <= 69) {
                field1176 = null;
            }
            return (class98) Class.forName("bd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([Lic;B)Lic;")
    public static final class59 method358(class59[] arg0, byte arg1) {
        field1156++;
        if (arg1 != -75) {
            return null;
        } else if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else {
            return class32.method253(arg1 + 109, 0, arg0.length, arg0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public static void method359(boolean arg0) {
        field1188 = null;
        field1154 = null;
        field1173 = null;
        if (!arg0) {
            return;
        }
        field1176 = null;
        field1186 = null;
        field1184 = null;
        field1170 = null;
        field1171 = null;
        field1185 = null;
        field1158 = null;
        field1189 = null;
        field1187 = null;
        field1168 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ldd;Ldd;I)V")
    public static final void method360(class26 arg0, class26 arg1, int arg2) {
        class80.field1990 = arg0;
        class22.field532 = arg1;
        class51.field1283 = class22.field532.method181(0, arg2);
        field1164++;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)Lic;")
    public static final class59 method361(int arg0, int arg1) {
        field1190++;
        int var2 = 78 % ((arg1 + 10) / 59);
        return class106.method821(false, arg0, (byte) 98, 10);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lwd;II)V")
    public final void method362(class157 arg0, int arg1, int arg2) {
        field1165++;
        if (arg1 != -1) {
            field1189 = null;
        }
        while (true) {
            int var4 = arg0.method1194(false);
            if (var4 == 0) {
                return;
            }
            this.method365(var4, arg0, arg2, 65493);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lwf;B)Lwf;")
    public static final class159 method363(class159 arg0, byte arg1) {
        field1163++;
        if (arg1 != -74) {
            method363(null, (byte) -58);
        }
        int var2 = class137.method1048((byte) 64, class112.method915(arg0, arg1 ^ 0x79BD0416));
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0 = class134.method1032(arg0.field3660, 499749840);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(B)V")
    public final void method364(byte arg0) {
        if (this.field1166 != -1) {
            this.method355(this.field1166, 255);
            this.field1155 = this.field1162;
            this.field1161 = this.field1182;
            this.field1180 = this.field1179;
        }
        if (arg0 != -76) {
            method358(null, (byte) 42);
        }
        field1159++;
        this.method355(this.field1174, 255);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILwd;II)V")
    private final void method365(int arg0, class157 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field1174 = arg1.method1207((byte) 124);
        } else if (arg0 == 2) {
            this.field1167 = arg1.method1194(false);
        } else if (arg0 == 3) {
            this.field1167 = arg1.method1161((byte) 60);
            if (this.field1167 == 65535) {
                this.field1167 = -1;
            }
        } else if (arg0 == 5) {
            this.field1172 = false;
        } else if (arg0 == 7) {
            this.field1166 = arg1.method1207((byte) 124);
        }
        field1160++;
        if (arg3 != 65493) {
            field1154 = null;
        }
    }
}
