import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class81 {

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public int field1976;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public int field1969;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
    public static int[] field1964 = new int[50];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Z")
    public static boolean field1961 = false;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[Lsc;")
    public static class128[] field1967 = new class128[50];

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field1970 = 0;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field1975 = 2;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lua;")
    public static class140 field1963 = new class140(64);

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Lv;")
    private static class146 field1978 = class159.method1226((byte) -37, "Loading config )2 ");

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lv;")
    public static class146 field1977 = field1978;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lie;")
    public static class61 field1971;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIZIIIII)Z")
    public static final boolean method617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class47.field1081[var12][var36] = 0;
                class115.field2677[var12][var36] = 99999999;
            }
        }
        field1973++;
        int var13 = arg11;
        int var14 = arg9;
        int var15 = 0;
        boolean var16 = false;
        class47.field1081[arg9][arg11] = 99;
        byte var17 = 0;
        class115.field2677[arg9][arg11] = 0;
        class52.field1196[var17] = arg9;
        int var37 = var17 + 1;
        class89.field2119[var17] = arg11;
        int var18 = class52.field1196.length;
        int[][] var19 = class64.field1437[class148.field3428].field2185;
        while (var15 != var37) {
            var14 = class52.field1196[var15];
            var13 = class89.field2119[var15];
            var15 = (var15 + 1) % var18;
            if (arg2 == var14 && arg7 == var13) {
                var16 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class64.field1437[class148.field3428].method725(-100, var13, arg4 - 1, arg0, arg2, arg7, var14)) {
                    var16 = true;
                    break;
                }
                if (arg4 < 10 && class64.field1437[class148.field3428].method722(arg4 - 1, var14, (byte) -37, arg2, arg7, var13, arg0)) {
                    var16 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg8 != 0 && class64.field1437[class148.field3428].method729(arg5, arg8, arg2, var13, 19661088, arg1, var14, arg7)) {
                var16 = true;
                break;
            }
            int var35 = class115.field2677[var14][var13] + 1;
            if (var14 > 0 && class47.field1081[var14 - 1][var13] == 0 && (var19[var14 - 1][var13] & 0x12C0108) == 0) {
                class52.field1196[var37] = var14 - 1;
                class89.field2119[var37] = var13;
                class47.field1081[var14 - 1][var13] = 2;
                class115.field2677[var14 - 1][var13] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var14 < 103 && class47.field1081[var14 + 1][var13] == 0 && (var19[var14 + 1][var13] & 0x12C0180) == 0) {
                class52.field1196[var37] = var14 + 1;
                class89.field2119[var37] = var13;
                var37 = (var37 + 1) % var18;
                class47.field1081[var14 + 1][var13] = 8;
                class115.field2677[var14 + 1][var13] = var35;
            }
            if (var13 > 0 && class47.field1081[var14][var13 - 1] == 0 && (var19[var14][var13 - 1] & 0x12C0102) == 0) {
                class52.field1196[var37] = var14;
                class89.field2119[var37] = var13 - 1;
                class47.field1081[var14][var13 - 1] = 1;
                class115.field2677[var14][var13 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && class47.field1081[var14][var13 + 1] == 0 && (var19[var14][var13 + 1] & 0x12C0120) == 0) {
                class52.field1196[var37] = var14;
                class89.field2119[var37] = var13 + 1;
                class47.field1081[var14][var13 + 1] = 4;
                class115.field2677[var14][var13 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var14 > 0 && var13 > 0 && class47.field1081[var14 - 1][var13 - 1] == 0 && (var19[var14 - 1][var13 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var13] & 0x12C0108) == 0 && (var19[var14][var13 - 1] & 0x12C0102) == 0) {
                class52.field1196[var37] = var14 - 1;
                class89.field2119[var37] = var13 - 1;
                var37 = (var37 + 1) % var18;
                class47.field1081[var14 - 1][var13 - 1] = 3;
                class115.field2677[var14 - 1][var13 - 1] = var35;
            }
            if (var14 < 103 && var13 > 0 && class47.field1081[var14 + 1][var13 - 1] == 0 && (var19[var14 + 1][var13 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var13] & 0x12C0180) == 0 && (var19[var14][var13 - 1] & 0x12C0102) == 0) {
                class52.field1196[var37] = var14 + 1;
                class89.field2119[var37] = var13 - 1;
                class47.field1081[var14 + 1][var13 - 1] = 9;
                class115.field2677[var14 + 1][var13 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var14 > 0 && var13 < 103 && class47.field1081[var14 - 1][var13 + 1] == 0 && (var19[var14 - 1][var13 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var13] & 0x12C0108) == 0 && (var19[var14][var13 + 1] & 0x12C0120) == 0) {
                class52.field1196[var37] = var14 - 1;
                class89.field2119[var37] = var13 + 1;
                var37 = (var37 + 1) % var18;
                class47.field1081[var14 - 1][var13 + 1] = 6;
                class115.field2677[var14 - 1][var13 + 1] = var35;
            }
            if (var14 < 103 && var13 < 103 && class47.field1081[var14 + 1][var13 + 1] == 0 && (var19[var14 + 1][var13 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var13] & 0x12C0180) == 0 && (var19[var14][var13 + 1] & 0x12C0120) == 0) {
                class52.field1196[var37] = var14 + 1;
                class89.field2119[var37] = var13 + 1;
                class47.field1081[var14 + 1][var13 + 1] = 12;
                class115.field2677[var14 + 1][var13 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
        }
        class115.field2683 = 0;
        if (!var16) {
            if (!arg6) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg2 - var21; var23 <= arg2 + var21; var23++) {
                for (int var24 = arg7 - var21; var24 <= arg7 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class115.field2677[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg2) {
                            var25 = arg2 - var23;
                        } else if (arg2 + arg5 - 1 < var23) {
                            var25 = var23 + 1 - arg2 - arg5;
                        }
                        int var26 = 0;
                        if (var24 < arg7) {
                            var26 = arg7 - var24;
                        } else if (arg7 + arg8 - 1 < var24) {
                            var26 = var24 + 1 - arg7 - arg8;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && class115.field2677[var23][var24] < var22) {
                            var22 = class115.field2677[var23][var24];
                            var13 = var24;
                            var14 = var23;
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg9 == var14 && arg11 == var13) {
                return false;
            }
            class115.field2683 = 1;
        }
        byte var28 = 0;
        class52.field1196[var28] = var14;
        int var38 = var28 + 1;
        class89.field2119[var28] = var13;
        int var29;
        int var30 = var29 = class47.field1081[var14][var13];
        while (arg9 != var14 || arg11 != var13) {
            if (var29 != var30) {
                class52.field1196[var38] = var14;
                class89.field2119[var38++] = var13;
                var29 = var30;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            if ((var30 & 0x1) != 0) {
                var13++;
            } else if ((var30 & 0x4) != 0) {
                var13--;
            }
            var30 = class47.field1081[var14][var13];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class89.field2119[var38];
            int var33 = class52.field1196[var38];
            if (arg10 == 0) {
                class82.field1990.method265((byte) -85, 157);
                class124.field2885++;
                class82.field1990.method791(false, var31 + var31 + 3);
            }
            if (arg10 == 1) {
                class82.field1990.method265((byte) -85, 107);
                class105.field2527++;
                class82.field1990.method791(false, var31 + var31 + 14 + 3);
            }
            if (arg10 == 2) {
                class2.field22++;
                class82.field1990.method265((byte) -85, 229);
                class82.field1990.method791(false, var31 + var31 + 3);
            }
            class82.field1990.method783(class51.field1150[82] ? 1 : 0, false);
            class82.field1990.method756(class76.field1814 + var32, false);
            class110.field2608 = class89.field2119[0];
            class63.field1421 = class52.field1196[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class82.field1990.method761(32, class52.field1196[var38] - var33);
                class82.field1990.method753((byte) 97, class89.field2119[var38] - var32);
            }
            class82.field1990.method757((byte) 124, class63.field1429 + var33);
            return true;
        } else if (arg3 == arg10) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILla;)Z")
    public static final boolean method618(int arg0, int arg1, class77 arg2) {
        field1974++;
        byte[] var3 = arg2.method586(arg1, arg0 ^ 0x6874);
        if (var3 == null) {
            return false;
        }
        class113.method883(var3, (byte) 125);
        if (arg0 != -26658) {
            field1964 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lcf;BIILjava/awt/Component;)Lab;")
    public static final class3 method619(class21 arg0, byte arg1, int arg2, int arg3, Component arg4) {
        field1965++;
        if (class126.field2922 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class3 var5 = (class3) Class.forName("qc").getDeclaredConstructor().newInstance();
                var5.field81 = arg2;
                var5.field63 = new int[(class87.field2075 ? 2 : 1) * 256];
                var5.method30(arg4);
                var5.field71 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field71 > 16384) {
                    var5.field71 = 16384;
                }
                var5.method26(var5.field71);
                if (class100.field2424 > 0 && class13.field217 == null) {
                    class13.field217 = new class68();
                    class13.field217.field1550 = arg0;
                    arg0.method123(class13.field217, class100.field2424, 41);
                }
                if (class13.field217 != null) {
                    if (class13.field217.field1551[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class13.field217.field1551[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class4 var6 = new class4(arg0, arg3);
                    var6.field63 = new int[(class87.field2075 ? 2 : 1) * 256];
                    var6.field81 = arg2;
                    var6.method30(arg4);
                    var6.field71 = 16384;
                    if (arg1 != -93) {
                        method621(-54);
                    }
                    var6.method26(var6.field71);
                    if (class100.field2424 > 0 && class13.field217 == null) {
                        class13.field217 = new class68();
                        class13.field217.field1550 = arg0;
                        arg0.method123(class13.field217, class100.field2424, -115);
                    }
                    if (class13.field217 != null) {
                        if (class13.field217.field1551[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class13.field217.field1551[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class3();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method620(byte arg0, Throwable arg1) throws IOException {
        field1962++;
        String var3;
        if (arg1 instanceof class127) {
            class127 var2 = (class127) arg1;
            arg1 = var2.field2936;
            var3 = var2.field2927 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    String var18 = var3 + "| " + var8;
                    if (arg0 != 35) {
                        method619(null, (byte) 19, -31, 50, null);
                    }
                    return var18;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method621(int arg0) {
        field1971 = null;
        field1964 = null;
        field1967 = null;
        field1963 = null;
        field1977 = null;
        if (arg0 == -1) {
            field1978 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class81() {
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lle;)V")
    public class81(class81 arg0) {
        this.field1976 = arg0.field1976;
        this.field1968 = arg0.field1968;
        this.field1966 = arg0.field1966;
        this.field1969 = arg0.field1969;
    }
}
