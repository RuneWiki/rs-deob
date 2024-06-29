import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class73 {

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "Lie;")
    private class80 field1108 = null;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "Z")
    private boolean field1105;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "Lvb;")
    private class50 field1095;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Z")
    private boolean field1090;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "S")
    public static short field1080 = 256;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "Z")
    public static boolean field1106 = true;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    public static int field1104 = 0;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field1097 = 0;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field1099 = 0;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!vl", name = "P", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "Ljava/awt/Frame;")
    public static Frame field1086;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "[I")
    public static int[] field1085;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "[Ljava/lang/Object;")
    private Object[] field1076;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1112;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)[I")
    public final int[] method480(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        }
        field1116++;
        if (!this.method482(arg1, -31255)) {
            return null;
        }
        int[] var3 = this.field1108.field1221[arg1];
        if (var3 == null) {
            var3 = new int[this.field1108.field1217[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)I")
    public final int method481(int arg0, int arg1) {
        field1094++;
        if (this.method482(arg1, arg0 ^ 0xFFFF8F69)) {
            if (arg0 != 2688) {
                field1080 = 50;
            }
            return this.field1108.field1203[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)Z")
    private final boolean method482(int arg0, int arg1) {
        field1077++;
        if (!this.method484(true)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field1108.field1203.length && this.field1108.field1203[arg0] != 0) {
            if (arg1 != -31255) {
                method492(38);
            }
            return true;
        } else if (class265.field4305) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)I")
    public final int method483(byte arg0) {
        field1118++;
        if (arg0 > -47) {
            return -77;
        } else if (this.method484(true)) {
            return this.field1108.field1205;
        } else {
            throw new IllegalStateException("");
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)Z")
    private final boolean method484(boolean arg0) {
        field1078++;
        if (!arg0) {
            return true;
        }
        if (this.field1108 == null) {
            this.field1108 = this.field1095.method261((byte) 80);
            if (this.field1108 == null) {
                return false;
            }
            this.field1112 = new Object[this.field1108.field1206][];
            this.field1076 = new Object[this.field1108.field1206];
        }
        return true;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)I")
    private final int method485(int arg0, byte arg1) {
        int var3 = -74 % ((32 - arg1) / 36);
        field1075++;
        if (this.method482(arg0, -31255)) {
            return this.field1076[arg0] == null ? this.field1095.method256(true, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lim;I)Lgg;")
    public static final class66 method486(class170 arg0, int arg1) {
        field1111++;
        return arg1 == 10392 ? new class66(arg0.method1193(-1), arg0.method1193(arg1 - 10393), arg0.method1193(arg1 - 10393), arg0.method1193(-1), arg0.method1212(arg1 + 460726456), arg0.method1212(460736848), arg0.method1218(67)) : null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZII)Z")
    public final boolean method487(boolean arg0, int arg1, int arg2) {
        field1102++;
        if (arg0) {
            this.field1090 = false;
        }
        if (!this.method496(arg2, (byte) 114, arg1)) {
            return false;
        } else if (this.field1112[arg1] != null && this.field1112[arg1][arg2] != null) {
            return true;
        } else if (this.field1076[arg1] == null) {
            this.method504(arg1, 1);
            return this.field1076[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method488(byte arg0, String arg1) {
        field1081++;
        if (!this.method484(true)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1108.field1209.method1318(class127.method817((byte) 84, var3), -105);
        if (var4 < 0) {
            return false;
        } else {
            if (arg0 < 101) {
                this.field1095 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZI)V")
    private final void method489(boolean arg0, int arg1) {
        field1115++;
        this.field1095.method265(31, arg1);
        if (arg0) {
            this.method495((byte) 40, (String) null);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
    public final byte[] method490(String arg0, int arg1, String arg2) {
        field1114++;
        if (!this.method484(true)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        if (arg1 != -1) {
            this.field1105 = true;
        }
        int var6 = this.field1108.field1209.method1318(class127.method817((byte) 84, var4), -123);
        if (this.method482(var6, arg1 - 31254)) {
            int var7 = this.field1108.field1214[var6].method1318(class127.method817((byte) 84, var5), -79);
            return this.method501(-2, var7, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[II)Z")
    private final boolean method491(int arg0, int[] arg1, int arg2) {
        field1117++;
        if (!this.method482(arg0, -31255)) {
            return false;
        } else if (this.field1076[arg0] == null) {
            return false;
        } else {
            int var4 = this.field1108.field1217[arg0];
            int[] var5 = this.field1108.field1221[arg0];
            boolean var6 = true;
            if (this.field1112[arg0] == null) {
                this.field1112[arg0] = new Object[this.field1108.field1203[arg0]];
            }
            Object[] var7 = this.field1112[arg0];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var10 = class33.method171(this.field1076[arg0], -5673, true);
                class170 var11 = new class170(var10);
                var11.method1178(false, var11.field2650.length, 5, arg1);
            } else {
                var10 = class33.method171(this.field1076[arg0], -5673, false);
            }
            byte[] var12;
            try {
                if (arg2 >= -110) {
                    return true;
                }
                var12 = class228.method1608((byte) 48, var10);
            } catch (RuntimeException var31) {
                throw class81.method550(var31, "T3 - " + (arg1 != null) + "," + arg0 + "," + var10.length + "," + class41.method237((byte) -15, var10.length, var10) + "," + class41.method237((byte) -50, var10.length - 2, var10) + "," + this.field1108.field1218[arg0] + "," + this.field1108.field1205);
            }
            if (this.field1090) {
                this.field1076[arg0] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var15 * 4 * var4;
                int[] var17 = new int[var4];
                class170 var18 = new class170(var12);
                var18.field2676 = var16;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var18.method1190(6345);
                        var17[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var17[var23]];
                    var17[var23] = 0;
                }
                var18.field2676 = var16;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var18.method1190(6345);
                        class103.method689(var12, var24, var22[var27], var17[var27], var26);
                        var24 += var26;
                        var17[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field1105) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class29.method151(136, false, var22[var28]);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field1105) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class29.method151(136, false, var12);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method492(int arg0) {
        field1086 = null;
        field1085 = null;
        if (arg0 != 0) {
            field1097 = -127;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method493(String arg0, byte arg1) {
        field1083++;
        if (!this.method484(true)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 60) {
            field1099 = -47;
        }
        int var4 = this.field1108.field1209.method1318(class127.method817((byte) 84, var3), arg1 - 127);
        this.method489(false, var4);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)I")
    public final int method494(int arg0) {
        field1079++;
        if (this.method484(true)) {
            return arg0 < 104 ? 68 : this.field1108.field1203.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(BLjava/lang/String;)I")
    public final int method495(byte arg0, String arg1) {
        if (arg0 != 47) {
            field1085 = null;
        }
        field1101++;
        if (this.method484(true)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1108.field1209.method1318(class127.method817((byte) 84, var3), -98);
            return this.method485(var4, (byte) -106);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)Z")
    private final boolean method496(int arg0, byte arg1, int arg2) {
        field1088++;
        if (arg1 <= 101) {
            return false;
        } else if (!this.method484(true)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && arg2 < this.field1108.field1203.length && arg0 < this.field1108.field1203[arg2]) {
            return true;
        } else if (class265.field4305) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V")
    public static final void method497(boolean arg0) {
        if (arg0) {
            field1106 = true;
        }
        class108.field1577.method1511((byte) 107);
        class295.field4722.method1511((byte) 92);
        class205.field3204.method1511((byte) 102);
        field1087++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method498(int arg0, String arg1) {
        field1084++;
        if (!this.method484(true)) {
            return -1;
        }
        if (arg0 != 0) {
            this.method510(true, 100, true);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1108.field1209.method1318(class127.method817((byte) 84, var3), -88);
        return this.method482(var4, -31255) ? var4 : -1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BI)Z")
    public final boolean method499(byte arg0, int arg1) {
        field1091++;
        if (!this.method482(arg1, -31255)) {
            return false;
        } else if (this.field1076[arg1] == null) {
            this.method504(arg1, 1);
            if (this.field1076[arg1] == null) {
                if (arg0 <= 61) {
                    field1106 = false;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)I")
    public final int method500(int arg0) {
        field1092++;
        if (!this.method484(true)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        if (arg0 < 53) {
            this.method482(-41, -17);
        }
        for (int var4 = 0; var4 < this.field1076.length; var4++) {
            if (this.field1108.field1217[var4] > 0) {
                var3 += this.method485(var4, (byte) 78);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)[B")
    public final byte[] method501(int arg0, int arg1, int arg2) {
        if (arg0 == -2) {
            field1098++;
            return this.method511((byte) -41, (int[]) null, arg2, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
    public final void method502(int arg0) {
        if (this.field1112 != null) {
            for (int var2 = 0; var2 < this.field1112.length; var2++) {
                this.field1112[var2] = null;
            }
        }
        field1096++;
        if (arg0 != 0) {
            field1085 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Z")
    public final boolean method503(byte arg0) {
        field1119++;
        int var2 = -7 / ((arg0 - 34) / 63);
        if (!this.method484(true)) {
            return false;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1108.field1226.length; var4++) {
            int var5 = this.field1108.field1226[var4];
            if (this.field1076[var5] == null) {
                this.method504(var5, 1);
                if (this.field1076[var5] == null) {
                    var3 = false;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(II)V")
    private final void method504(int arg0, int arg1) {
        field1082++;
        if (this.field1090) {
            this.field1076[arg0] = this.field1095.method255(arg0, 12963);
        } else {
            this.field1076[arg0] = class29.method151(136, false, this.field1095.method255(arg0, 12963));
        }
        if (arg1 != 1) {
            this.method499((byte) -51, -95);
        }
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(II)V")
    public final void method505(int arg0, int arg1) {
        field1120++;
        if (this.method482(arg0, -31255)) {
            int var3 = 82 / ((36 - arg1) / 51);
            if (this.field1112 != null) {
                this.field1112[arg0] = null;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method506(int arg0, String arg1) {
        field1103++;
        if (this.method484(true)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1108.field1209.method1318(class127.method817((byte) 84, var3), -96);
            return arg0 == 0 ? this.method499((byte) 100, var4) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "(II)[B")
    public final byte[] method507(int arg0, int arg1) {
        field1109++;
        if (!this.method484(true)) {
            return null;
        } else if (this.field1108.field1203.length == 1) {
            return this.method501(arg0, arg1, 0);
        } else if (!this.method482(arg1, -31255)) {
            return null;
        } else if (~this.field1108.field1203[arg1] == arg0) {
            return this.method501(-2, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(IB)I")
    public final int method508(int arg0, byte arg1) {
        field1100++;
        if (arg1 > -53) {
            return -122;
        } else if (this.method484(true)) {
            int var3 = this.field1108.field1209.method1318(arg0, -82);
            return this.method482(var3, -31255) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "(II)Z")
    public final boolean method509(int arg0, int arg1) {
        field1107++;
        if (!this.method484(true)) {
            return false;
        } else if (this.field1108.field1203.length == 1) {
            return this.method487(false, 0, arg1);
        } else if (!this.method482(arg1, -31255)) {
            return false;
        } else if (this.field1108.field1203[arg1] == 1) {
            return this.method487(false, arg1, 0);
        } else if (arg0 == 27635) {
            throw new RuntimeException();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZIZ)V")
    public final void method510(boolean arg0, int arg1, boolean arg2) {
        field1089++;
        if (arg1 != 26423) {
            field1085 = null;
        }
        if (!this.method484(true)) {
            return;
        }
        if (arg2) {
            this.field1108.field1220 = null;
            this.field1108.field1214 = null;
        }
        if (arg0) {
            this.field1108.field1209 = null;
            this.field1108.field1207 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lvb;ZZ)V")
    public class73(class50 arg0, boolean arg1, boolean arg2) {
        this.field1105 = arg2;
        this.field1095 = arg0;
        this.field1090 = arg1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B[III)[B")
    public final byte[] method511(byte arg0, int[] arg1, int arg2, int arg3) {
        field1093++;
        if (!this.method496(arg3, (byte) 103, arg2)) {
            return null;
        }
        if (this.field1112[arg2] == null || this.field1112[arg2][arg3] == null) {
            boolean var5 = this.method491(arg2, arg1, -124);
            if (!var5) {
                this.method504(arg2, 1);
                boolean var6 = this.method491(arg2, arg1, -116);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class33.method171(this.field1112[arg2][arg3], -5673, false);
        if (this.field1105) {
            this.field1112[arg2][arg3] = null;
            if (this.field1108.field1203[arg2] == 1) {
                this.field1112[arg2] = null;
            }
        }
        return arg0 > -9 ? null : var7;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
    public final boolean method512(String arg0, byte arg1, String arg2) {
        field1113++;
        if (!this.method484(true)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1108.field1209.method1318(class127.method817((byte) 84, var4), -101);
        if (arg1 >= -107) {
            field1086 = null;
        }
        if (this.method482(var6, -31255)) {
            int var7 = this.field1108.field1214[var6].method1318(class127.method817((byte) 84, var5), -88);
            return this.method487(false, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(III)[B")
    public final byte[] method513(int arg0, int arg1, int arg2) {
        field1110++;
        if (arg0 != -2) {
            return null;
        } else if (this.method496(arg2, (byte) 111, arg1)) {
            if (this.field1112[arg1] == null || this.field1112[arg1][arg2] == null) {
                boolean var4 = this.method491(arg1, (int[]) null, -116);
                if (!var4) {
                    this.method504(arg1, 1);
                    boolean var5 = this.method491(arg1, (int[]) null, -113);
                    if (!var5) {
                        return null;
                    }
                }
            }
            return class33.method171(this.field1112[arg1][arg2], -5673, false);
        } else {
            return null;
        }
    }
}
