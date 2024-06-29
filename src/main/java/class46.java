import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class46 extends class55 {

    @OriginalMember(owner = "client!hd", name = "bd", descriptor = "I")
    public static int field1135 = 0;

    @OriginalMember(owner = "client!hd", name = "jd", descriptor = "Lhb;")
    private static class44 field1143 = class102.method810("From", -28606);

    @OriginalMember(owner = "client!hd", name = "ed", descriptor = "Lhb;")
    public static class44 field1138 = field1143;

    @OriginalMember(owner = "client!hd", name = "cd", descriptor = "Lhb;")
    public static class44 field1136 = class102.method810("backright2", -28606);

    @OriginalMember(owner = "client!hd", name = "ad", descriptor = "Lhe;")
    public static class47 field1134 = new class47();

    @OriginalMember(owner = "client!hd", name = "nd", descriptor = "Lhb;")
    public static class44 field1147 = class102.method810("Verbindung mit Update)2Server)3)3)3", -28606);

    @OriginalMember(owner = "client!hd", name = "od", descriptor = "Lhb;")
    public static class44 field1148 = class102.method810("Handel akzeptieren", -28606);

    @OriginalMember(owner = "client!hd", name = "ld", descriptor = "Lhb;")
    public static class44 field1145 = class102.method810("Menge eingeben:", -28606);

    @OriginalMember(owner = "client!hd", name = "pd", descriptor = "I")
    public static int field1149 = 50;

    @OriginalMember(owner = "client!hd", name = "fd", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!hd", name = "gd", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!hd", name = "hd", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!hd", name = "id", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!hd", name = "kd", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!hd", name = "md", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!hd", name = "dd", descriptor = "Lha;")
    public class43 field1137;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(II)V", line = 9)
    public static final void method429(int arg0, int arg1) {
        ++field1144;
        if (~arg1 != 0) {
            if (class69.field1719[arg1]) {
                class109.field2740.method895(false, arg1);
                if (class113.field2777[arg1] != null) {
                    boolean var2 = true;
                    int var3 = 0;
                    if (arg0 == 41) {
                        while (class113.field2777[arg1].length > var3) {
                            if (class113.field2777[arg1][var3] != null) {
                                if (class113.field2777[arg1][var3].field1810 != 2) {
                                    class113.field2777[arg1][var3] = null;
                                } else {
                                    var2 = false;
                                }
                            }
                            ++var3;
                        }
                        if (var2) {
                            class113.field2777[arg1] = null;
                        }
                        class69.field1719[arg1] = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)Lde;", line = 58)
    public final class24 method209(byte arg0) {
        ++field1141;
        if (this.field1137 == null) {
            return null;
        } else {
            class118 var2 = ~super.field1415 != 0 && super.field1359 == 0 ? client.method139(1, super.field1415) : null;
            class118 var3 = ~super.field1361 == 0 || ~super.field1388 == ~super.field1361 && var2 != null ? null : client.method139(1, super.field1361);
            class24 var4 = this.field1137.method368(var2, super.field1369, 0, super.field1334, var3);
            if (var4 == null) {
                return null;
            } else {
                var4.method205();
                super.field1351 = var4.field2466;
                if (~super.field1353 != 0 && ~super.field1377 != 0) {
                    class24 var5 = class98.method773(-124, super.field1353).method826(-1, super.field1377);
                    if (var5 != null) {
                        var5.method198(0, -super.field1363, 0);
                        class24[] var6 = new class24[] { var4, var5 };
                        var4 = new class24(var6, 2, true);
                    }
                }
                int var7 = 51 / ((35 - arg0) / 59);
                if (~this.field1137.field997 == -2) {
                    var4.field530 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "(I)V", line = 103)
    public static void method430(int arg0) {
        field1143 = null;
        field1147 = null;
        field1145 = null;
        field1138 = null;
        if (arg0 != 1) {
            method429(-53, 39);
        }
        field1134 = null;
        field1136 = null;
        field1148 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V", line = 133)
    public static final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != -28464) {
            method430(-14);
        }
        ++field1139;
        if (~arg1 <= -2 && ~arg5 <= -2 && arg1 <= 102 && arg5 <= 102) {
            if (class81.field2085 && class79.field1993 != arg6) {
                return;
            }
            int var8 = 0;
            boolean var9 = true;
            if (~arg4 == -1) {
                var8 = class89.field2283.method248(arg6, arg1, arg5);
            }
            if (arg4 == 1) {
                var8 = class89.field2283.method250(arg6, arg1, arg5);
            }
            boolean var10 = false;
            if (arg4 == 2) {
                var8 = class89.field2283.method261(arg6, arg1, arg5);
            }
            if (arg4 == 3) {
                var8 = class89.field2283.method274(arg6, arg1, arg5);
            }
            boolean var11 = false;
            if (var8 != 0) {
                int var12 = (536868760 & var8) >> 14;
                int var13 = class89.field2283.method278(arg6, arg1, arg5, var8);
                int var14 = var13 & 31;
                int var15 = 3 & var13 >> 6;
                if (arg4 == 0) {
                    class89.field2283.method235(arg6, arg1, arg5);
                    class57 var16 = class130.method965(var12, 75);
                    if (var16.field1499) {
                        class67.field1678[arg6].method744(arg1, var16.field1489, arg3 + 28592, var15, arg5, var14);
                    }
                }
                if (~arg4 == -2) {
                    class89.field2283.method249(arg6, arg1, arg5);
                }
                if (~arg4 == -3) {
                    class89.field2283.method281(arg6, arg1, arg5);
                    class57 var17 = class130.method965(var12, 127);
                    if (var17.field1498 + arg1 > 103 || ~(arg5 - -var17.field1498) < -104 || var17.field1458 + arg1 > 103 || ~(var17.field1458 + arg5) < -104) {
                        return;
                    }
                    if (var17.field1499) {
                        class67.field1678[arg6].method743(arg5, var17.field1489, arg1, 109, var17.field1498, var15, var17.field1458);
                    }
                }
                if (arg4 == 3) {
                    class89.field2283.method267(arg6, arg1, arg5);
                    class57 var18 = class130.method965(var12, 107);
                    if (var18.field1499 && ~var18.field1460 == -2) {
                        class67.field1678[arg6].method741(arg1, arg5, (byte) 112);
                    }
                }
            }
            if (~arg2 <= -1) {
                int var19 = arg6;
                if (arg6 < 3 && ~(class104.field2668[1][arg1][arg5] & 2) == -3) {
                    var19 = arg6 + 1;
                }
                class33.method325(0, arg1, arg2, arg7, var19, class89.field2283, arg6, class67.field1678[arg6], arg0, arg5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)Z", line = 239)
    public final boolean method432(byte arg0) {
        ++field1142;
        if (this.field1137 == null) {
            return false;
        } else {
            if (arg0 > -48) {
                field1148 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 254)
    public static final String method433(Throwable arg0, int arg1) throws IOException {
        ++field1140;
        String var2;
        if (!(arg0 instanceof class48)) {
            var2 = "";
        } else {
            class48 var3 = (class48) arg0;
            var2 = var3.field1197 + " | ";
            arg0 = var3.field1206;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 != 27575) {
            method431(113, 42, -11, -121, 55, -34, -43, 113);
        }
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (~var10 <= -1 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (~var13 <= -1) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) - -1);
                String var17 = var16.substring(1 + var16.lastIndexOf(9));
                var2 = var2 + var17 + ' ';
            }
        }
    }
}
