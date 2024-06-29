import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class79 extends class89 {

    @OriginalMember(owner = "client!be", name = "T", descriptor = "Lha;")
    public static class46 field1507 = class271.method1828("Lade Benutzeroberfl-=che )2 ", -46);

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "I")
    public static int field1513 = 2301979;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "[I")
    public static int[] field1509 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "[Z")
    public static boolean[] field1515 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V")
    private class79(int arg0) {
        super(0, false);
        this.method629(arg0, -99);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class79() {
        this(0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZB)V")
    public static final void method628(boolean arg0, byte arg1) {
        ++field1505;
        int var2 = -67 % ((39 - arg1) / 47);
        byte var3 = 4;
        byte[][] var4 = class131.field2398;
        for (int var5 = 0; var5 < var3; ++var5) {
            class267.method1789(102);
            for (int var6 = 0; ~var6 > -14; ++var6) {
                for (int var7 = 0; var7 < 13; ++var7) {
                    boolean var8 = false;
                    int var9 = class189.field3380[var5][var6][var7];
                    if (~var9 != 0) {
                        int var10 = 3 & var9 >> 24;
                        if (!arg0 || ~var10 == -1) {
                            int var11 = 3 & var9 >> 1;
                            int var12 = (16763750 & var9) >> 14;
                            int var13 = 2047 & var9 >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; ~var15 > ~class92.field1717.length; ++var15) {
                                if (class92.field1717[var15] == var14 && var4[var15] != null) {
                                    class87.method679(var5, class183.field3282, arg0, var6 * 8, (7 & var12) * 8, (var13 & 7) * 8, var4[var15], var10, var7 * 8, (byte) 59, var11);
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class227.method1553(8, false, var5, var6 * 8, 8, var7 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
    private final void method629(int arg0, int arg1) {
        this.field1508 = (arg0 & 255) << 4;
        if (arg1 >= -61) {
            field1509 = null;
        }
        ++field1511;
        this.field1510 = 4080 & arg0 >> 4;
        this.field1516 = (arg0 & 16711680) >> 12;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method630(Throwable arg0, int arg1) throws IOException {
        ++field1512;
        String var3;
        if (arg0 instanceof class14) {
            class14 var2 = (class14) arg0;
            arg0 = var2.field212;
            var3 = var2.field214 + " | ";
        } else {
            var3 = "";
        }
        if (arg1 != 3) {
            method628(true, (byte) 48);
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (~var10 <= -1 && var11 >= 0) {
                    String var12 = var9.substring(var10 - -1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (~var13 <= -1) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(1 + var16.lastIndexOf(9));
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.method629(arg0.method559(-1), -95);
        }
        if (arg1 != -641641492) {
            method628(false, (byte) -72);
        }
        ++field1514;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIZ)V")
    public static final void method631(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class173.field3076 = arg1;
        class128.field2359 = arg2;
        class81.field1538 = arg3;
        class198.field3543 = new class201[arg0][class173.field3076][class128.field2359];
        class2.field33 = new int[arg0][class173.field3076 + 1][class128.field2359 + 1];
        if (arg4) {
            class212.field3772 = new class201[1][class173.field3076][class128.field2359];
            class89.field1694 = new int[class173.field3076][class128.field2359];
            class258.field4491 = new int[1][class173.field3076 + 1][class128.field2359 + 1];
        } else {
            class212.field3772 = null;
            class89.field1694 = null;
            class258.field4491 = null;
        }
        class149.method1101(false);
        class138.field2480 = new class249[500];
        class54.field924 = 0;
        class131.field2413 = new class249[500];
        class63.field1062 = 0;
        class109.field2037 = new int[arg0][class173.field3076 + 1][class128.field2359 + 1];
        class254.field4459 = new class197[5000];
        class134.field2421 = 0;
        class198.field3544 = new class197[100];
        class122.field2276 = new boolean[class81.field1538 + class81.field1538 + 1][class81.field1538 + class81.field1538 + 1];
        class33.field620 = new boolean[class81.field1538 + class81.field1538 + 2][class81.field1538 + class81.field1538 + 2];
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        if (arg1 != 25) {
            return null;
        } else {
            int[][] var3 = super.field1695.method843((byte) -25, arg0);
            if (super.field1695.field2028) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; class241.field4284 > var7; ++var7) {
                    var4[var7] = this.field1516;
                    var5[var7] = this.field1510;
                    var6[var7] = this.field1508;
                }
            }
            ++field1506;
            return var3;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V")
    public static void method632(boolean arg0) {
        field1515 = null;
        field1509 = null;
        field1507 = null;
        if (!arg0) {
            field1513 = -82;
        }
    }
}
