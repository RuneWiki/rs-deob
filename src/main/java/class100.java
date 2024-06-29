import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class100 extends class70 {

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    public int field2414;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    private int field2422;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "[[I")
    public int[][] field2411;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "[I")
    public int[] field2421;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "Lwd;")
    public static class153 field2418 = new class153(512);

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "Lqf;")
    public static class117 field2428 = class72.method514(125, "Nehmen");

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "Lqf;")
    public static class117 field2430 = class72.method514(103, "Texturen geladen)3");

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "Lqf;")
    private static class117 field2426 = class72.method514(104, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "Lqf;")
    public static class117 field2427 = field2426;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "Lqf;")
    private static class117 field2431 = class72.method514(124, "Please try again)3");

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "Lqf;")
    public static class117 field2433 = field2431;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "Lha;")
    public static class50 field2416;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "Lma;")
    public static class84 field2425;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "[I")
    public static int[] field2412;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)Z")
    public static final boolean method781(int arg0, int arg1) {
        field2415++;
        if (arg0 >= -111) {
            method783(-30, (byte) -23);
        }
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public static final void method782(byte arg0) {
        field2417++;
        class96.field2338.method960(-1);
        int var1 = -46 / ((72 - arg0) / 32);
        int var2 = class96.field2338.method963(-88, 1);
        if (var2 == 0) {
            return;
        }
        int var3 = class96.field2338.method963(-120, 2);
        if (var3 == 0) {
            class56.field1151[class91.field2225++] = 2047;
        } else if (var3 == 1) {
            int var4 = class96.field2338.method963(-40, 3);
            class141.field3395.method686((byte) 127, false, var4);
            int var5 = class96.field2338.method963(-92, 1);
            if (var5 == 1) {
                class56.field1151[class91.field2225++] = 2047;
            }
        } else if (var3 == 2) {
            int var6 = class96.field2338.method963(-59, 3);
            class141.field3395.method686((byte) 127, true, var6);
            int var7 = class96.field2338.method963(-96, 3);
            class141.field3395.method686((byte) -89, true, var7);
            int var8 = class96.field2338.method963(-108, 1);
            if (var8 == 1) {
                class56.field1151[class91.field2225++] = 2047;
            }
        } else if (var3 == 3) {
            int var9 = class96.field2338.method963(-113, 1);
            class140.field3344 = class96.field2338.method963(-57, 2);
            int var10 = class96.field2338.method963(-68, 7);
            int var11 = class96.field2338.method963(-118, 7);
            int var12 = class96.field2338.method963(-88, 1);
            if (var12 == 1) {
                class56.field1151[class91.field2225++] = 2047;
            }
            class141.field3395.method685((byte) 18, var9 == 1, var10, var11);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Lqf;")
    public static final class117 method783(int arg0, byte arg1) {
        class117 var2 = new class117();
        if (arg1 < 122) {
            method784((byte) -28);
        }
        var2.field2800 = new byte[arg0];
        field2420++;
        var2.field2799 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V")
    public static void method784(byte arg0) {
        field2428 = null;
        if (arg0 > -101) {
            field2427 = null;
        }
        field2412 = null;
        field2433 = null;
        field2418 = null;
        field2416 = null;
        field2430 = null;
        field2426 = null;
        field2425 = null;
        field2427 = null;
        field2431 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILmf;B)Lqf;")
    public static final class117 method785(int arg0, class89 arg1, byte arg2) {
        field2413++;
        if (!class94.method743(arg0, class42.method292(arg1, -5447), (byte) -112) && arg1.field2108 == null) {
            return null;
        }
        if (arg2 <= 2) {
            method783(-71, (byte) 114);
        }
        if (arg1.field2157 == null || arg1.field2157.length <= arg0 || arg1.field2157[arg0] == null || arg1.field2157[arg0].method906((byte) -120).method915(27) == 0) {
            return class139.field3314 ? class73.method530((byte) -83, new class117[] { class56.field1153, class79.method614(15591, arg0) }) : null;
        } else {
            return arg1.field2157[arg0];
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lmf;I)V")
    public static final void method786(class89 arg0, int arg1) {
        field2419++;
        int var2 = arg0.field2136;
        if (var2 >= 1 && var2 <= 100 || !(var2 < 701 || var2 > 800)) {
            if (class64.field1334 == 0) {
                if (var2 == 1) {
                    arg0.field2094 = 0;
                    arg0.field2118 = class80.field1820;
                    return;
                }
                if (var2 == 2) {
                    arg0.field2118 = class3.field62;
                    arg0.field2094 = 0;
                    return;
                }
            }
            if (class64.field1334 == 1) {
                if (var2 == 1) {
                    arg0.field2094 = 0;
                    arg0.field2118 = class101.field2452;
                    return;
                }
                if (var2 == 2) {
                    arg0.field2118 = class3.field46;
                    arg0.field2094 = 0;
                    return;
                }
                if (var2 == 3) {
                    arg0.field2094 = 0;
                    arg0.field2118 = class48.field982;
                    return;
                }
            }
            if (var2 > 700) {
                var2 -= 601;
            } else {
                var2--;
            }
            int var3 = class75.field1651;
            if (class64.field1334 != 2) {
                var3 = 0;
            }
            if (var3 <= var2) {
                arg0.field2094 = 0;
                arg0.field2118 = class141.field3351;
            } else {
                arg0.field2118 = class67.field1401[var2];
                arg0.field2094 = 1;
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            int var4 = class75.field1651;
            if (class64.field1334 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg0.field2094 = 0;
                arg0.field2118 = class141.field3351;
            } else {
                if (class50.field1063[var2] == 0) {
                    arg0.field2118 = class73.method530((byte) -83, new class117[] { class80.field1824, class78.field1761 });
                } else if (class50.field1063[var2] >= 5000) {
                    if (class50.field1063[var2] == class56.field1152) {
                        arg0.field2118 = class73.method530((byte) -83, new class117[] { class115.field2729, class75.field1627, class79.method614(15591, class50.field1063[var2] - 5000) });
                    } else {
                        arg0.field2118 = class73.method530((byte) -83, new class117[] { class89.field2158, class75.field1627, class79.method614(15591, class50.field1063[var2] - 5000) });
                    }
                } else if (class50.field1063[var2] == class56.field1152) {
                    arg0.field2118 = class73.method530((byte) -83, new class117[] { class115.field2729, class91.field2234, class79.method614(15591, class50.field1063[var2]) });
                } else {
                    arg0.field2118 = class73.method530((byte) -83, new class117[] { class89.field2158, class91.field2234, class79.method614(15591, class50.field1063[var2]) });
                }
                arg0.field2094 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class75.field1651;
            if (class64.field1334 != 2) {
                var5 = 0;
            }
            arg0.field2123 = var5 * 15 + 20;
            if (arg0.field2123 <= arg0.field2095) {
                arg0.field2123 = arg0.field2095 + 1;
            }
        } else {
            if (arg1 != 1) {
                field2412 = null;
            }
            if (var2 >= 401 && var2 <= 500) {
                var2 -= 401;
                if (var2 == 0 && class64.field1334 == 0) {
                    arg0.field2118 = class53.field1107;
                    arg0.field2094 = 0;
                } else if (var2 == 1 && class64.field1334 == 0) {
                    arg0.field2118 = class3.field62;
                    arg0.field2094 = 0;
                } else {
                    int var6 = class128.field3029;
                    if (class64.field1334 == 0) {
                        var6 = 0;
                    }
                    if (var2 >= var6) {
                        arg0.field2094 = 0;
                        arg0.field2118 = class141.field3351;
                    } else {
                        arg0.field2118 = class116.method900(class134.field3195[var2], 126).method945(-91);
                        arg0.field2094 = 1;
                    }
                }
            } else if (var2 == 503) {
                arg0.field2123 = class128.field3029 * 15 + 20;
                if (arg0.field2123 <= arg0.field2095) {
                    arg0.field2123 = arg0.field2095 + 1;
                }
            } else if (var2 == 324) {
                if (class18.field280 == -1) {
                    class18.field280 = arg0.field2146;
                    class19.field294 = arg0.field2073;
                }
                if (class79.field1788.field2403) {
                    arg0.field2146 = class18.field280;
                } else {
                    arg0.field2146 = class19.field294;
                }
            } else if (var2 == 325) {
                if (class18.field280 == -1) {
                    class19.field294 = arg0.field2073;
                    class18.field280 = arg0.field2146;
                }
                if (class79.field1788.field2403) {
                    arg0.field2146 = class19.field294;
                } else {
                    arg0.field2146 = class18.field280;
                }
            } else if (var2 == 327) {
                arg0.field2078 = 150;
                arg0.field2150 = (int) (Math.sin((double) class43.field856 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field2091 = 5;
                arg0.field2113 = 0;
            } else if (var2 == 328) {
                arg0.field2078 = 150;
                arg0.field2150 = (int) (Math.sin((double) class43.field856 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field2091 = 5;
                arg0.field2113 = 1;
            } else if (var2 == 600) {
                arg0.field2118 = class73.method530((byte) -83, new class117[] { class141.field3384, class41.field819 });
            } else if (var2 == 620) {
                if (class116.field2752 < 1) {
                    arg0.field2118 = class141.field3351;
                } else if (class4.field74) {
                    arg0.field2118 = class112.field2618;
                    arg0.field2100 = 16711680;
                } else {
                    arg0.field2100 = 16777215;
                    arg0.field2118 = class18.field269;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method787(boolean arg0, Throwable arg1) throws IOException {
        field2423++;
        String var2;
        if (arg1 instanceof class121) {
            class121 var3 = (class121) arg1;
            arg1 = var3.field2879;
            var2 = var3.field2889 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        if (!arg0) {
            field2433 = null;
        }
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
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I[B)V")
    public class100(int arg0, byte[] arg1) {
        this.field2414 = arg0;
        class77 var3 = new class77(arg1);
        this.field2422 = var3.method570((byte) 123);
        this.field2411 = new int[this.field2422][];
        this.field2421 = new int[this.field2422];
        for (int var4 = 0; var4 < this.field2422; var4++) {
            this.field2421[var4] = var3.method570((byte) 123);
        }
        for (int var5 = 0; var5 < this.field2422; var5++) {
            this.field2411[var5] = new int[var3.method570((byte) 123)];
        }
        for (int var6 = 0; var6 < this.field2422; var6++) {
            for (int var7 = 0; var7 < this.field2411[var6].length; var7++) {
                this.field2411[var6][var7] = var3.method570((byte) 123);
            }
        }
    }
}
