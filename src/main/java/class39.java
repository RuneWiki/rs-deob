import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class39 {

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lvj;")
    public static class117 field549 = class244.method1740(false);

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "[I")
    public static int[] field554 = new int[50];

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "[I")
    public static int[] field556 = new int[32768];

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Llc;")
    public static class86 field555;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "S")
    public short field547;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Z")
    public boolean field545;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Z")
    public boolean field548;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Z")
    public boolean field550;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Z")
    public boolean field553;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLqi;I)I")
    public static final int method300(byte arg0, class131 arg1, int arg2) {
        field557++;
        if (arg1.field2017 == null || arg1.field2017.length <= arg2) {
            return -2;
        }
        try {
            if (arg0 > -71) {
                return 35;
            }
            int var3 = 0;
            int[] var4 = arg1.field2017[arg2];
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var4[var6++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class227.field3644[var4[var6++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 2) {
                    var8 = class96.field1420[var4[var6++]];
                }
                if (var7 == 3) {
                    var8 = class235.field3764[var4[var6++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var4[var6++] << 16;
                    int var11 = var10 + var4[var6++];
                    class131 var12 = class122.method891(var11, (byte) -128);
                    int var13 = var4[var6++];
                    if (var13 != -1 && (!class254.method1800(var13, 15017).field869 || class222.field3567)) {
                        for (int var14 = 0; var14 < var12.field2101.length; var14++) {
                            if ((var13 + 1) == var12.field2101[var14]) {
                                var8 += var12.field2113[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class243.field3904[var4[var6++]];
                }
                if (var7 == 6) {
                    var8 = class11.field128[class96.field1420[var4[var6++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class243.field3904[var4[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class186.field2993.field355;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class179.field2891[var15]) {
                            var8 += class96.field1420[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var6++] << 16;
                    int var17 = var16 + var4[var6++];
                    class131 var18 = class122.method891(var17, (byte) -128);
                    int var19 = var4[var6++];
                    if (var19 != -1 && (!class254.method1800(var19, 15017).field869 || class222.field3567)) {
                        for (int var20 = 0; var20 < var18.field2101.length; var20++) {
                            if (var19 + 1 == var18.field2101[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class78.field1131;
                }
                if (var7 == 12) {
                    var8 = class260.field4257;
                }
                if (var7 == 13) {
                    int var21 = class243.field3904[var4[var6++]];
                    int var22 = var4[var6++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var6++];
                    var8 = class75.method549(var23, (byte) 125);
                }
                if (var7 == 18) {
                    var8 = (class186.field2993.field1979 >> 7) + class282.field4487;
                }
                if (var7 == 19) {
                    var8 = (class186.field2993.field1910 >> 7) + class99.field1465;
                }
                if (var7 == 20) {
                    var8 = var4[var6++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var3 += var8;
                    }
                    if (var5 == 1) {
                        var3 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var3 /= var8;
                    }
                    if (var5 == 3) {
                        var3 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V")
    public static final void method301(int arg0, byte arg1) {
        field551++;
        class129.field1983.method1548(arg0, 0);
        if (arg1 <= 29) {
            field555 = null;
        }
        class155.field2555.method1548(arg0, 0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method302(byte arg0) {
        field549 = null;
        field555 = null;
        field556 = null;
        field554 = null;
        if (arg0 >= -89) {
            method303(false);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static final void method303(boolean arg0) {
        if (!arg0) {
            field552++;
            class115.field1666.method1558(-94);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method304(int arg0, Throwable arg1) throws IOException {
        field544++;
        String var2;
        if ((arg1 instanceof class163)) {
            class163 var3 = (class163) arg1;
            var2 = var3.field2643 + " | ";
            arg1 = var3.field2649;
        } else {
            var2 = "";
        }
        if (arg0 != -1) {
            field554 = null;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }
}
