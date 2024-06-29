import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class57 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "J")
    public long field1171 = 0L;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field1175 = 5063219;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Lkh;")
    public static class117 field1187 = class224.method1450((byte) -4, ")2");

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Lkh;")
    public static class117 field1190 = class224.method1450((byte) 110, "Weiter");

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Ldd;")
    public class38 field1182;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method432(byte arg0) {
        field1187 = null;
        field1190 = null;
        if (arg0 > -48) {
            method432((byte) -100);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)I")
    public static final int method433(int arg0, int arg1, int arg2) {
        field1188++;
        if (arg2 < 11) {
            field1175 = 120;
        }
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)V")
    public static final void method434(int arg0, byte arg1, int arg2) {
        if (class175.field3161 != 0 && arg0 != -1) {
            class93.method641(arg0, 0, false, class175.field3161, class5.field80, 16419);
            class115.field2137 = true;
        }
        field1173++;
        int var3 = 46 % ((arg1 + 4) / 45);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method435(int arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class102) {
            class102 var2 = (class102) arg1;
            arg1 = var2.field1855;
            var3 = var2.field1859 + " | ";
        } else {
            var3 = "";
        }
        field1181++;
        int var4 = -26 % ((arg0 - 67) / 43);
        StringWriter var5 = new StringWriter();
        PrintWriter var6 = new PrintWriter(var5);
        arg1.printStackTrace(var6);
        var6.close();
        String var7 = var5.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var3 + "| " + var9;
                }
                int var11 = var10.indexOf(40);
                int var12 = var10.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var10.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var11);
                }
                String var16 = var10.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
    public static final void method436(boolean arg0) {
        field1172++;
        if (!arg0) {
            field1175 = 61;
        }
        class18.field511.method395((byte) -99);
        int var1 = class18.field511.method396(8, (byte) -9);
        if (var1 < class61.field1229) {
            for (int var2 = var1; var2 < class61.field1229; var2++) {
                class137.field2483[class66.field1265++] = class21.field565[var2];
            }
        }
        if (var1 > class61.field1229) {
            throw new RuntimeException("gnpov1");
        }
        class61.field1229 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class21.field565[var3];
            class207 var5 = class1.field18[var4];
            int var6 = class18.field511.method396(1, (byte) -9);
            if (var6 == 0) {
                class21.field565[class61.field1229++] = var4;
                var5.field4226 = class44.field966;
            } else {
                int var7 = class18.field511.method396(2, (byte) -9);
                if (var7 == 0) {
                    class21.field565[class61.field1229++] = var4;
                    var5.field4226 = class44.field966;
                    class203.field3679[class215.field3914++] = var4;
                } else if (var7 == 1) {
                    class21.field565[class61.field1229++] = var4;
                    var5.field4226 = class44.field966;
                    int var8 = class18.field511.method396(3, (byte) -9);
                    var5.method1509(false, var8, (byte) -7);
                    int var9 = class18.field511.method396(1, (byte) -9);
                    if (var9 == 1) {
                        class203.field3679[class215.field3914++] = var4;
                    }
                } else if (var7 == 2) {
                    class21.field565[class61.field1229++] = var4;
                    var5.field4226 = class44.field966;
                    int var10 = class18.field511.method396(3, (byte) -9);
                    var5.method1509(true, var10, (byte) -49);
                    int var11 = class18.field511.method396(3, (byte) -9);
                    var5.method1509(true, var11, (byte) -39);
                    int var12 = class18.field511.method396(1, (byte) -9);
                    if (var12 == 1) {
                        class203.field3679[class215.field3914++] = var4;
                    }
                } else if (var7 == 3) {
                    class137.field2483[class66.field1265++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([Llh;IIB)V")
    public static final void method437(class128[] arg0, int arg1, int arg2, byte arg3) {
        if (arg1 > arg2) {
            int var4 = arg2 - 1;
            int var5 = arg1 + 1;
            int var6 = (arg1 + arg2) / 2;
            class128 var7 = arg0[var6];
            arg0[var6] = arg0[arg2];
            arg0[arg2] = var7;
            while (var5 > var4) {
                boolean var8 = true;
                do {
                    var5--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class71.field1358[var9] == 2) {
                            var10 = var7.field2366;
                            var11 = arg0[var5].field2366;
                        } else if (class71.field1358[var9] == 1) {
                            var10 = var7.field2364;
                            if (var10 == -1 && class25.field616[var9] == 1) {
                                var10 = 2001;
                            }
                            var11 = arg0[var5].field2364;
                            if (var11 == -1 && class25.field616[var9] == 1) {
                                var11 = 2001;
                            }
                        } else if (class71.field1358[var9] == 3) {
                            var10 = var7.field2363 ? 1 : 0;
                            var11 = arg0[var5].field2363 ? 1 : 0;
                        } else {
                            var10 = var7.field2378;
                            var11 = arg0[var5].field2378;
                        }
                        if (var10 != var11) {
                            if ((class25.field616[var9] != 1 || var11 <= var10) && (class25.field616[var9] != 0 || var10 <= var11)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var4++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class71.field1358[var13] == 2) {
                            var15 = arg0[var4].field2366;
                            var14 = var7.field2366;
                        } else if (class71.field1358[var13] == 1) {
                            var14 = var7.field2364;
                            var15 = arg0[var4].field2364;
                            if (var15 == -1 && class25.field616[var13] == 1) {
                                var15 = 2001;
                            }
                            if (var14 == -1 && class25.field616[var13] == 1) {
                                var14 = 2001;
                            }
                        } else if (class71.field1358[var13] == 3) {
                            var15 = arg0[var4].field2363 ? 1 : 0;
                            var14 = var7.field2363 ? 1 : 0;
                        } else {
                            var15 = arg0[var4].field2378;
                            var14 = var7.field2378;
                        }
                        if (var14 != var15) {
                            if ((class25.field616[var13] != 1 || var15 >= var14) && (class25.field616[var13] != 0 || var14 >= var15)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var4 < var5) {
                    class128 var16 = arg0[var4];
                    arg0[var4] = arg0[var5];
                    arg0[var5] = var16;
                }
            }
            method437(arg0, var5, arg2, (byte) 40);
            method437(arg0, arg1, var5 + 1, (byte) 40);
        }
        field1189++;
        if (arg3 != 40) {
            field1185 = -102;
        }
    }
}
