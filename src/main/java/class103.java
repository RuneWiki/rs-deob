import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class103 extends class357 {

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "S")
    public static short field1470 = 1;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field1467 = 0;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    public static int field1475 = 0;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field1477 = 0;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "B")
    public byte field1468;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "F")
    public static float field1472;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "Ltl;")
    public class91 field1466;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "[Lsu;")
    public static class367[] field1464;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 3)
    public static final String method690(Throwable arg0, int arg1) throws IOException {
        ++field1465;
        String var2;
        if (!(arg0 instanceof class166)) {
            var2 = "";
        } else {
            class166 var3 = (class166) arg0;
            arg0 = var3.field2418;
            var2 = var3.field2413 + " | ";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                String var18 = var2 + "| " + var8;
                if (arg1 != 0) {
                    return null;
                }
                return var18;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 - -1);
            String var12;
            if (var10 != -1) {
                var12 = var9.substring(0, var10);
            } else {
                var12 = var9;
            }
            String var13 = var12.trim();
            String var14 = var13.substring(1 + var13.lastIndexOf(32));
            String var15 = var14.substring(1 + var14.lastIndexOf(9));
            String var16 = var2 + var15;
            if (~var10 != 0 && ~var11 != 0) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V", line = 84)
    public static final void method691(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1478;
        if (arg4 < arg0) {
            class271.method1736(arg0, arg1, arg4, -11, class23.field356[arg2]);
        } else {
            class271.method1736(arg4, arg1, arg0, -11, class23.field356[arg2]);
        }
        int var5 = -112 / ((-22 - arg3) / 60);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 109)
    public static final Class method692(String arg0, int arg1) throws ClassNotFoundException {
        ++field1474;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else {
            if (arg1 != 3) {
                method695(-34);
            }
            if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else {
                return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)I", line = 148)
    public final int method693(int arg0) {
        if (arg0 >= -49) {
            this.field1469 = 91;
        }
        ++field1473;
        return this.field1466 == null ? 0 : this.field1466.field1292 * 100 / (this.field1466.field1277.length - this.field1468);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lqa;B)V", line = 164)
    public static final void method694(class496 arg0, byte arg1) {
        ++field1479;
        int var2 = class107.field1519;
        int var3 = class439.field6536;
        int var4 = class455.field6686;
        int var5 = class148.field2128 + -3;
        if (arg1 >= 100) {
            byte var6 = 20;
            if (class396.field6018 == null || class94.field1372 == null) {
                if (class113.field1576.method2624(-121, class314.field4801) && class113.field1576.method2624(-112, class384.field5870)) {
                    class396.field6018 = arg0.method1117(class476.method2845(class113.field1576, class314.field4801, 0), true);
                    class476 var7 = class476.method2845(class113.field1576, class384.field5870, 0);
                    class94.field1372 = arg0.method1117(var7, true);
                    var7.method2849();
                    class170.field2471 = arg0.method1117(var7, true);
                } else {
                    arg0.method1112(var2, var3, var4, var6, -class13.field208 + 255 << 24 | class367.field5659, 1);
                }
            }
            if (class396.field6018 != null && class94.field1372 != null) {
                int var8 = (var4 + -(class94.field1372.method220() * 2)) / class396.field6018.method220();
                for (int var9 = 0; ~var9 > ~var8; ++var9) {
                    class396.field6018.method1332(var2 - -class94.field1372.method220() + var9 * class396.field6018.method220(), var3);
                }
                class94.field1372.method1332(var2, var3);
                class170.field2471.method1332(var2 + var4 - class170.field2471.method220(), var3);
            }
            class104.field1497.method235(class167.field2428.method2335((byte) -100, class288.field4292), class20.field319 | -16777216, var2 - -3, -1, 29451, var3 - -14);
            arg0.method1112(var2, var3 + var6, var4, -var6 + var5, class367.field5659 | -class13.field208 + 255 << 24, 1);
            int var10 = class346.field5419.method812(false);
            int var11 = class346.field5419.method811(false);
            int var12 = 0;
            for (class32 var13 = (class32) class96.field1395.method1970(64); var13 != null; var13 = (class32) class96.field1395.method1960(24)) {
                int var30 = (class12.field201 - 1 + -var12) * 16 + var3 + var6 + 13;
                if (var10 > var2 && ~(var2 + var4) < ~var10 && ~var11 < ~(var30 + -13) && var30 + 4 > var11 && var13.field489) {
                    arg0.method1112(var2, var30 + -12, var4, 16, class194.field2763 | -class23.field355 + 255 << 24, 1);
                }
                ++var12;
            }
            if ((class62.field888 == null || class487.field7142 == null || class138.field2006 == null) && class113.field1576.method2624(-95, class518.field7680) && class113.field1576.method2624(-89, class516.field7663) && class113.field1576.method2624(-125, class281.field3877)) {
                class476 var14 = class476.method2845(class113.field1576, class516.field7663, 0);
                class487.field7142 = arg0.method1117(var14, true);
                var14.method2849();
                class192.field2714 = arg0.method1117(var14, true);
                class62.field888 = arg0.method1117(class476.method2845(class113.field1576, class518.field7680, 0), true);
                class476 var15 = class476.method2845(class113.field1576, class281.field3877, 0);
                class138.field2006 = arg0.method1117(var15, true);
                var15.method2849();
                class408.field6158 = arg0.method1117(var15, true);
            }
            if (class62.field888 != null && class487.field7142 != null && class138.field2006 != null) {
                int var16 = (var4 - class138.field2006.method220() * 2) / class62.field888.method220();
                for (int var17 = 0; var16 > var17; ++var17) {
                    class62.field888.method1332(var2 - -class138.field2006.method220() + class62.field888.method220() * var17, var3 + var5 - class62.field888.method214());
                }
                int var18 = (-class138.field2006.method214() + -var6 + var5) / class487.field7142.method214();
                for (int var19 = 0; var18 > var19; ++var19) {
                    class487.field7142.method1332(var2, class487.field7142.method214() * var19 + var3 + var6);
                    class192.field2714.method1332(-class192.field2714.method220() + var2 + var4, class487.field7142.method214() * var19 + (var3 - -var6));
                }
                class138.field2006.method1332(var2, -class138.field2006.method214() + var3 + var5);
                class408.field6158.method1332(-class138.field2006.method220() + var4 + var2, -class138.field2006.method214() + var5 + var3);
            }
            int var20 = 0;
            for (class32 var21 = (class32) class96.field1395.method1970(64); var21 != null; var21 = (class32) class96.field1395.method1960(24)) {
                int var22 = var3 - (-var6 - 13) - -((class12.field201 + -1 + -var20) * 16);
                int var23 = class20.field319 | -16777216;
                if (~var2 > ~var10 && ~(var2 - -var4) < ~var10 && ~(var22 + -13) > ~var11 && var11 < var22 + 4 && var21.field489) {
                    var23 = -16777216 | class110.field1547;
                }
                int[] var24 = null;
                if (!class84.method550(111, var21.field485)) {
                    if (~var21.field498 != 0) {
                        var24 = class84.field1154.method2451(-1, var21.field498).field863;
                    } else if (class111.method730(var21.field485, (byte) -40)) {
                        class194 var25 = class151.field2174[(int) var21.field493];
                        if (var25 != null) {
                            class329 var26 = var25.field2768;
                            if (var26.field5068 != null) {
                                var26 = var26.method2125(class36.field583, false);
                            }
                            if (var26 != null) {
                                var24 = var26.field5035;
                            }
                        }
                    } else if (class441.method2665(var21.field485, -26)) {
                        Object var27 = null;
                        class130 var28;
                        if (var21.field485 != 1006) {
                            var28 = class56.field755.method2031(115, (int) (var21.field493 >>> 32 & 2147483647L));
                        } else {
                            var28 = class56.field755.method2031(127, (int) var21.field493);
                        }
                        if (var28.field1823 != null) {
                            var28 = var28.method832((byte) -125, class36.field583);
                        }
                        if (var28 != null) {
                            var24 = var28.field1870;
                        }
                    }
                } else {
                    var24 = class84.field1154.method2451(-1, (int) var21.field493).field863;
                }
                String var29 = class82.method528(-87, var21);
                if (var24 != null) {
                    var29 = var29 + class156.method1011(var24, 0);
                }
                class104.field1497.method241(var22, var29, var2 + 3, -18066, class459.field6743, class55.field748, var23, 0);
                if (var21.field487) {
                    class285.field4250.method1332(var2 + (5 - -class472.field6901.method45(var29, (byte) -77)), var22 + -12);
                }
                ++var20;
            }
            class407.method2485(class107.field1519, (byte) 55, class439.field6536, class455.field6686, class148.field2128);
        }
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V", line = 366)
    public static void method695(int arg0) {
        field1464 = null;
        if (arg0 != 0) {
            field1477 = 46;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)[B", line = 389)
    public final byte[] method696(int arg0) {
        ++field1471;
        if (arg0 > -102) {
            field1470 = 63;
        }
        if (!super.field5535 && this.field1466.field1292 >= this.field1466.field1277.length + -this.field1468) {
            return this.field1466.field1277;
        } else {
            throw new RuntimeException();
        }
    }
}
