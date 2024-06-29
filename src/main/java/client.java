import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class174 {

    @OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
    public static int[] field1056 = new int[6];

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1059;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Ljava/lang/Class;")
    public static Class field1060;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
    public static boolean field1061;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method490(boolean arg0) {
        field1049++;
        if (class452.field7013 == 2) {
            try {
                this.method507((byte) -123);
            } catch (Throwable var3) {
                class196.method1341(0, 6670);
                class80.method575(var3, var3.getMessage() + " (Recovered) " + this.method495(-112), (byte) -56);
            }
        } else {
            this.method507((byte) -59);
        }
        if (arg0) {
            field1056 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method491(int arg0) {
        field1058++;
        if (class464.field7128 < class104.field1525.field3132) {
            class511.field7605 = (class104.field1525.field3132 - 1) * 50 * 5;
            class95.field1387.field7726 = !class95.field1387.field7726;
            if (class511.field7605 > 3000) {
                class511.field7605 = 3000;
            }
            if (class104.field1525.field3132 >= 2 && class104.field1525.field3130 == 6) {
                this.method1089("js5connect_outofdate", (byte) 114);
                class148.field1994 = 13;
                return;
            }
            if (class104.field1525.field3132 >= 4 && class104.field1525.field3130 == -1) {
                this.method1089("js5crc", (byte) 124);
                class148.field1994 = 13;
                return;
            }
            if (class104.field1525.field3132 >= 4 && class409.method2614(class148.field1994, -104)) {
                if (class104.field1525.field3130 == 7 || class104.field1525.field3130 == 9) {
                    this.method1089("js5connect_full", (byte) 110);
                } else if (class104.field1525.field3130 <= 0) {
                    this.method1089("js5io", (byte) -82);
                } else {
                    this.method1089("js5connect", (byte) -63);
                }
                class148.field1994 = 13;
                return;
            }
        }
        class464.field7128 = class104.field1525.field3132;
        int var2 = 124 % ((-arg0 - 34) / 60);
        if (class511.field7605 > 0) {
            class511.field7605--;
            return;
        }
        try {
            if (class116.field1619 == 0) {
                class294.field4632 = class339.field5294.method32(class95.field1387.field7721, 0, class95.field1387.method3123(true));
                class116.field1619++;
            }
            if (class116.field1619 == 1) {
                if (class294.field4632.field7458 == 2) {
                    this.method509(-14932, 1000);
                    return;
                }
                if (class294.field4632.field7458 == 1) {
                    class116.field1619++;
                }
            }
            if (class116.field1619 == 2) {
                class427.field6462 = new class247((Socket) class294.field4632.field7462, class339.field5294);
                class208 var3 = new class208(5);
                var3.method1479((byte) -94, class432.field6520.field4683);
                var3.method1477(65280, 600);
                class427.field6462.method1707(-55, var3.field3193, 5, 0);
                class116.field1619++;
                class446.field6917 = class246.method1705((byte) 28);
            }
            if (class116.field1619 == 3) {
                if (class409.method2614(class148.field1994, 126) || class427.field6462.method1712(0) > 0) {
                    int var4 = class427.field6462.method1714(109);
                    if (var4 != 0) {
                        this.method509(-14932, var4);
                        return;
                    }
                    class116.field1619++;
                } else if ((class246.method1705((byte) 28) - class446.field6917) > 30000L) {
                    this.method509(-14932, 1001);
                    return;
                }
            }
            if (class116.field1619 == 4) {
                boolean var5 = class148.field1994 == 1 || class486.method2983((byte) 82, class148.field1994) || class225.method1624(true, class148.field1994);
                class104.field1525.method1401(!var5, class427.field6462, 124);
                class294.field4632 = null;
                class116.field1619 = 0;
                class427.field6462 = null;
            }
        } catch (IOException var6) {
            this.method509(-14932, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lgi;)Lvp;")
    public static final class467 method492(class437 arg0) {
        class467 var1 = (class467) class368.field5673.method1122((byte) 59, ((long) arg0.field6751 << 32) + (long) arg0.field6595);
        return var1 == null ? arg0.field6705 : var1;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method493(byte arg0) {
        field1057++;
        if (class148.field1994 == 13) {
            return;
        }
        long var2 = class282.method1899(0) / 1000000L - class250.field4059;
        class250.field4059 = class282.method1899(0) / 1000000L;
        boolean var4 = class137.method840(44);
        if (var4 && class5.field55 && class119.field1631 != null) {
            class119.field1631.method1784(86);
        }
        if (class19.method109(-8702, class148.field1994)) {
            if (class210.field3245 != 0L && class246.method1705((byte) 28) > class210.field3245) {
                class320.method2142(false, class141.field1911.field6116, class141.field1911.field6117, class5.method47(-1129530388), -4);
            } else if (!class19.field198.method1312() && class365.field5660) {
                class88.method608(66);
            }
        }
        if (class216.field3671 == null) {
            Container var5;
            if (class92.field1342 == null) {
                var5 = class339.field5294.field27;
            } else {
                var5 = class92.field1342;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class92.field1342 == var5) {
                Insets var8 = class92.field1342.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class414.field6267 != var6 || class329.field5175 != var7) {
                if (class19.field198 == null || class19.field198.method1304()) {
                    class523.method3126(true);
                } else {
                    class414.field6267 = var6;
                    class329.field5175 = var7;
                }
                class210.field3245 = class246.method1705((byte) 28) + 500L;
            }
        }
        if (class216.field3671 != null && !class224.field3767 && class19.method109(-8702, class148.field1994)) {
            class320.method2142(false, -1, -1, class141.field1911.field6110, -4);
        }
        boolean var9 = false;
        if (class372.field5718) {
            var9 = true;
            class372.field5718 = false;
        }
        if (var9) {
            class271.method1836(0);
        }
        if (arg0 > -18) {
            return;
        }
        if (class19.field198 != null && class19.field198.method1312() || class5.method47(-1129530388) != 1) {
            class236.method1667(2318);
        }
        if (class148.field1994 == 0) {
            class526.method3135(class425.field6441[class293.field4626], class243.field3944[class293.field4626], true, class387.field5908[class293.field4626], var9, class280.field4431, class365.field5657);
        } else if (class148.field1994 == 1) {
            class5.method48(class243.field3944[class293.field4626].getRGB(), class19.field198, class387.field5908[class293.field4626].getRGB(), class425.field6441[class293.field4626].getRGB(), class289.field4571, var9 | class19.field198.method1312(), true);
        } else if (class65.method474((byte) -2, class148.field1994)) {
            class387.method2486((byte) -65);
        } else if (class280.method1890(class148.field1994, false)) {
            class387.method2486((byte) -65);
        } else if (class87.method602(10, class148.field1994)) {
            if (class189.field2744 == 1) {
                if (class19.field203 < class64.field1008) {
                    class19.field203 = class64.field1008;
                }
                int var10 = (class19.field203 - class64.field1008) * 50 / class19.field203;
                class57.method439(true, class382.field5862.method1583(79, class12.field131) + "<br>(" + var10 + "%)", (byte) -60, class128.field1741);
            } else if (class189.field2744 == 2) {
                if (class354.field5504 < class361.field5590) {
                    class354.field5504 = class361.field5590;
                }
                int var11 = (class354.field5504 - class361.field5590) * 50 / class354.field5504 + 50;
                class57.method439(true, class382.field5862.method1583(87, class12.field131) + "<br>(" + var11 + "%)", (byte) -60, class128.field1741);
            } else {
                class57.method439(true, class382.field5862.method1583(96, class12.field131), (byte) -60, class128.field1741);
            }
        } else if (class148.field1994 == 9) {
            class501.method3054(var2, (byte) 107);
        } else if (class148.field1994 == 12) {
            class57.method439(true, class508.field7574.method1583(120, class12.field131) + "<br>" + class68.field1038.method1583(94, class12.field131), (byte) -60, class128.field1741);
        }
        if (class64.field1005 == 3) {
            for (int var12 = 0; var12 < class126.field1703; var12++) {
                Rectangle var13 = class18.field194[var12];
                if (class442.field6875[var12]) {
                    class19.field198.method3042(var13.height, (byte) -118, var13.y, -1996553985, var13.x, var13.width);
                } else if (class98.field1414[var12]) {
                    class19.field198.method3042(var13.height, (byte) -124, var13.y, -1996554240, var13.x, var13.width);
                }
            }
        }
        if (class372.method2421(-94)) {
            class229.method1644(class19.field198, (byte) 109);
        }
        if (class19.method109(-8702, class148.field1994) && class64.field1005 == 0 && class5.method47(-1129530388) == 1 && !var9 && class2.field10.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class126.field1703; var15++) {
                if (class98.field1414[var15]) {
                    class98.field1414[var15] = false;
                    class3.field37[var14++] = class18.field194[var15];
                }
            }
            class19.field198.method1243(class3.field37, var14);
        } else if (class148.field1994 != 0) {
            class19.field198.method1255();
            for (int var16 = 0; var16 < class126.field1703; var16++) {
                class98.field1414[var16] = false;
            }
        }
        if (class141.field1911.field6119 == 0) {
            class208.method1464((byte) -113, 15L);
        } else if (class141.field1911.field6119 == 1) {
            class208.method1464((byte) -90, 10L);
        } else if (class141.field1911.field6119 == 2) {
            class208.method1464((byte) -97, 5L);
        } else if (class141.field1911.field6119 == 3) {
            class208.method1464((byte) -72, 2L);
        }
        if (class280.field4441) {
            class306.method2062((byte) -43);
        }
        if (class141.field1911.field6107 && class148.field1994 == 2 && class509.field7597 != -1) {
            class141.field1911.field6107 = false;
            class141.field1911.method1638(32749, class339.field5294);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method494() {
        class153.field2047 = 0;
        for (int var0 = 0; var0 < class378.field5815; var0++) {
            class378 var1 = ((class38) class365.field5659.method1122((byte) 59, (long) class81.field1198[var0])).field378;
            if (var1.field816 && var1.method417(64) != -1) {
                int var2 = (var1.method415(-4) - 1) * 64 + 60;
                int var3 = var1.field6417 - var2 >> 7;
                int var4 = var1.field6410 - var2 >> 7;
                class55 var5 = class466.method2908(var3, 64, var1.field6419, var4);
                if (var5 != null) {
                    int var6 = var5.field847;
                    if (var5 instanceof class378) {
                        var6 += 2048;
                    }
                    if (var5.field810 == 0 && var5.method417(64) != -1) {
                        class329.field5179[class153.field2047] = var6;
                        class84.field1229[class153.field2047] = var6;
                        class153.field2047++;
                        var5.field810++;
                    }
                    class329.field5179[class153.field2047] = var6;
                    class84.field1229[class153.field2047] = var1.field847 + 2048;
                    class153.field2047++;
                    var5.field810++;
                }
            }
        }
        class78.method561(class84.field1229, (byte) 21, class329.field5179, class153.field2047 - 1, 0);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1048++;
        if (!this.method1091((byte) 89)) {
            return;
        }
        class310.field4862 = new class522();
        class310.field4862.field7722 = Integer.parseInt(this.getParameter("worldid"));
        class407.field6152 = new class522();
        class407.field6152.field7722 = Integer.parseInt(this.getParameter("lobbyid"));
        class407.field6152.field7721 = this.getParameter("lobbyaddress");
        class540.field7899 = new class522();
        class540.field7899.field7722 = Integer.parseInt(this.getParameter("demoid"));
        class540.field7899.field7721 = this.getParameter("demoaddress");
        class209.field3228 = class471.method2927(-65, Integer.parseInt(this.getParameter("modewhere")));
        if (!class530.method3151((byte) 127, class209.field3228) && class209.field3228 != class181.field2626) {
            class209.field3228 = class181.field2626;
        }
        class464.field7130 = class6.method53(Integer.parseInt(this.getParameter("modewhat")), 0);
        if (class464.field7130 != class303.field4752 && class464.field7130 != class206.field3149 && class6.field70 != class464.field7130) {
            class464.field7130 = class6.field70;
        }
        try {
            class12.field131 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class12.field131 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class416.field6313 = true;
        } else {
            class416.field6313 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class304.field4778 = true;
        } else {
            class304.field4778 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class187.field2731 = true;
        } else {
            class187.field2731 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class516.field7674 = class153.field2042;
            } else if (var4.equals("1")) {
                class516.field7674 = class261.field4216;
            }
        }
        try {
            class348.field5403 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class348.field5403 = 0;
        }
        class164.field2372 = this.getParameter("quiturl");
        class77.field1153 = this.getParameter("settings");
        if (class77.field1153 == null) {
            class77.field1153 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class328.field5158 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class328.field5158 = 0;
            }
        }
        class293.field4626 = Integer.parseInt(this.getParameter("colourid"));
        if (class293.field4626 < 0 || class293.field4626 >= class243.field3944.length) {
            class293.field4626 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class293.field4625 = true;
            class198.field3050 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class447.field6946 = true;
        }
        if (class516.field7674 == class153.field2042) {
            class437.field6752 = 765;
            class95.field1391 = 503;
        } else if (class516.field7674 == class261.field4216) {
            class95.field1391 = 480;
            class437.field6752 = 640;
        }
        class528.field7769 = this;
        this.method1093(0, 600, class437.field6752, class464.field7130.method1665(-1) + 32, class95.field1391);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method495(int arg0) {
        field1051++;
        String var2 = null;
        try {
            var2 = "[1)" + class453.field7018 + "," + class126.field1718 + "," + class135.field1839 + "," + class197.field3038 + "|";
            if (class358.field5565 != null) {
                var2 = var2 + "2)" + class201.field3057 + "," + (class358.field5565.field894[0] + class453.field7018) + "," + (class358.field5565.field899[0] + class126.field1718) + "|";
            }
            var2 = var2 + "3)" + class452.field7013 + "|4)" + class141.field1911.field6097 + "|5)" + class5.method47(-1129530388) + "|6)" + class489.field7400 + "," + class219.field3715 + "|";
            var2 = var2 + "7)" + class141.field1911.method2601((byte) -14, class452.field7013) + "|";
            if (arg0 > -110) {
                field1056 = null;
            }
            var2 = var2 + "8)" + class141.field1911.method2603((byte) -98, class452.field7013) + "|";
            var2 = var2 + "9)" + class141.field1911.field6123 + "|";
            var2 = var2 + "10)" + class141.field1911.field6099 + "|";
            var2 = var2 + "11)" + class141.field1911.field6098 + "|";
            var2 = var2 + "12)" + class141.field1911.method1635(class452.field7013, -1) + "|";
            var2 = var2 + "13)" + class491.field7438 + "|";
            var2 = var2 + "14)" + class148.field1994;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class452.field7013 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field1060 == null ? (field1060 = method516("client")) : field1060).getClassLoader());
                    for (int var8 = 0; var7.size() > var8; var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method496(int arg0) {
        if (class325.field5107) {
            class535.method3169(-117);
        }
        field1041++;
        if (class19.field198 != null) {
            class19.field198.method3039(12755);
        }
        if (class216.field3671 != null) {
            class355.method2342((byte) 126, class339.field5294, class216.field3671);
            class216.field3671 = null;
        }
        if (class338.field5281 != null) {
            class338.field5281.method1892(90);
            class338.field5281 = null;
        }
        class198.method1361((byte) -52);
        class104.field1525.method1393(6443);
        if (arg0 != 2) {
            method497(45);
        }
        class541.field7906.method2270(0);
        if (class128.field1738 != null) {
            class128.field1738.method2429((byte) 115);
            class128.field1738 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method497(int arg0) {
        int var1 = class234.field3861;
        int[] var2 = class21.field245;
        int var3 = class168.field2446 ? var1 : class378.field5815 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class55 var5;
            if (var4 < var1) {
                var5 = class264.field4276[var2[var4]];
            } else {
                var5 = ((class38) class365.field5659.method1122((byte) 59, (long) class81.field1198[var4 - var1])).field378;
            }
            if (var5.field6419 == arg0) {
                var5.field810 = 0;
                if (var5.field881 < 0) {
                    var5.field816 = false;
                } else {
                    int var6 = var5.method415(-4);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field6417 & 0x7F) != 0 || (var5.field6410 & 0x7F) != 0) {
                            var5.field816 = false;
                            continue;
                        }
                    } else if ((var5.field6417 & 0x7F) != 64 || (var5.field6410 & 0x7F) != 64) {
                        var5.field816 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field6417 >> 7;
                        int var8 = var5.field6410 >> 7;
                        if (class452.field7015[var7][var8] != var5.field881) {
                            var5.field816 = true;
                            continue;
                        }
                        if (class159.field2186[var7][var8] > 1) {
                            var10002 = class159.field2186[var7][var8]--;
                            var5.field816 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field6417 - var9 >> 7;
                        int var11 = var5.field6410 - var9 >> 7;
                        int var12 = var5.field6417 + var9 >> 7;
                        int var13 = var5.field6410 + var9 >> 7;
                        if (!class72.method526(var5.field881, var12, var13, var10, 1, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class452.field7015[var14][var15] == var5.field881) {
                                        var10002 = class159.field2186[var14][var15]--;
                                    }
                                }
                            }
                            var5.field816 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class350 && var5.field890 != null && class88.field1278 >= var5.field890.field578 && class88.field1278 < var5.field890.field576) {
                        ((class350) var5).field5444 = false;
                    }
                    var5.field816 = false;
                    var5.field6412 = class532.method3165(var5.field6419, var5.field6417, false, var5.field6410);
                    class186.method1160(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method498(int arg0) {
        field1054++;
        if (arg0 == 1) {
            boolean var2 = class104.field1525.method1391(8);
            if (!var2) {
                this.method491(-124);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method499(boolean arg0) {
        field1043++;
        if (class148.field1994 == 6 && class46.field606 == 0) {
            if (class513.field7615 > 1) {
                class513.field7615--;
                class104.field1530 = class387.field5910;
            }
            if (!class409.field6204) {
                class360.method2379(28958);
            }
            for (int var2 = 0; var2 < 100 && class402.method2584(114); var2++) {
            }
        }
        if (!arg0) {
            method501(123);
        }
        class376.field5786++;
        class48.method348(null, 2, -1, -1);
        class346.method2285(-1, null, false, -1);
        class54.method409((byte) 104);
        class387.field5910++;
        for (int var3 = 0; var3 < class78.field1176; var3++) {
            class378 var4 = class14.field150[var3].field378;
            if (var4 != null) {
                byte var5 = var4.field5809.field2790;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method415(-4);
                    if ((var5 & 0x2) != 0 && var4.field898 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field894[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > class135.field1839 - var6 - 1) {
                                var9 = class135.field1839 - var6 - 1;
                            }
                            int var10 = var4.field899[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if ((class197.field3038 - var6 - 1) < var10) {
                                var10 = class197.field3038 - var6 - 1;
                            }
                            int var11 = class161.method982(-1, class5.field59, var9, var6, 0, var4.field899[0], class155.field2060, var6, true, var4.field894[0], var6, class352.field5488[var4.field6419], var10, -117, 0);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field894[var12] = class155.field2060[var11 - var12 - 1];
                                    var4.field899[var12] = class5.field59[var11 - var12 - 1];
                                    var4.field895[var12] = 1;
                                }
                                var4.field898 = var11;
                            }
                        }
                    }
                    class443.method2804(var4, true, (byte) 121);
                    int var13 = class113.method726(var4, 32768);
                    class315.method2108((byte) 2, class438.field6804, class540.field7894, var4, var13);
                    class328.method2194((byte) -68, var4);
                }
            }
        }
        if (class46.field606 == 0 && class457.field7048 == 0) {
            if (class334.field5222 == 2) {
                class352.method2335(-64);
            } else {
                class345.method2282((byte) -124);
            }
            if ((class163.field2367 >> 7) < 14 || (class135.field1839 - 14) <= (class163.field2367 >> 7) || (class98.field1404 >> 7) < 14 || (class98.field1404 >> 7) >= (class197.field3038 - 14)) {
                class476.method2957((byte) -80);
            }
        }
        while (true) {
            class491 var14;
            class437 var15;
            class437 var16;
            do {
                var14 = (class491) class9.field96.method2127(-105);
                if (var14 == null) {
                    while (true) {
                        class491 var17;
                        class437 var18;
                        class437 var19;
                        do {
                            var17 = (class491) class65.field1017.method2127(-110);
                            if (var17 == null) {
                                while (true) {
                                    class491 var20;
                                    class437 var21;
                                    class437 var22;
                                    do {
                                        var20 = (class491) class176.field2580.method2127(-112);
                                        if (var20 == null) {
                                            if (class477.field7309 != null) {
                                                class496.method3033((byte) -119);
                                            }
                                            if (class88.field1278 % 1500 == 0) {
                                                class481.method2968(false);
                                            }
                                            if (class148.field1994 == 6 && class46.field606 == 0) {
                                                class206.method1408(-128);
                                            }
                                            class330.method2210((byte) 121);
                                            if (class325.field5107 && class246.method1705((byte) 28) - 60000L > class526.field7757) {
                                                class535.method3169(-64);
                                            }
                                            for (class513 var23 = (class513) class193.field2862.method2616(255); var23 != null; var23 = (class513) class193.field2862.method2619(255)) {
                                                if ((class246.method1705((byte) 28) / 1000L - 5L) > ((long) var23.field7618)) {
                                                    if (var23.field7617 > 0) {
                                                        class528.method3140("", "", var23.field7611 + class78.field1157.method1583(115, class12.field131), 9, 5, 0);
                                                    }
                                                    if (var23.field7617 == 0) {
                                                        class528.method3140("", "", var23.field7611 + class487.field7381.method1583(120, class12.field131), 57, 5, 0);
                                                    }
                                                    var23.method1613(1049391719);
                                                }
                                            }
                                            if (class148.field1994 == 6 && class46.field606 == 0) {
                                                if (class338.field5281 == null) {
                                                    class496.method3034(true, false);
                                                    return;
                                                }
                                                class468.field7161++;
                                                if (class468.field7161 > 50) {
                                                    class83.field1214++;
                                                    class81.method578((byte) 66, class13.field142);
                                                }
                                                try {
                                                    if (class338.field5281 != null && class170.field2488.field3162 > 0) {
                                                        class53.field730 += class170.field2488.field3162;
                                                        class338.field5281.method1895(10, class170.field2488.field3162, class170.field2488.field3193, 0);
                                                        class468.field7161 = 0;
                                                        class170.field2488.field3162 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class496.method3034(true, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field7423;
                                        if (var21.field6595 < 0) {
                                            break;
                                        }
                                        var22 = class255.method1747(var21.field6599, !arg0);
                                    } while (var22 == null || var22.field6675 == null || var22.field6675.length <= var21.field6595 || var22.field6675[var21.field6595] != var21);
                                    class420.method2673(var20);
                                }
                            }
                            var18 = var17.field7423;
                            if (var18.field6595 < 0) {
                                break;
                            }
                            var19 = class255.method1747(var18.field6599, false);
                        } while (var19 == null || var19.field6675 == null || var19.field6675.length <= var18.field6595 || var19.field6675[var18.field6595] != var18);
                        class420.method2673(var17);
                    }
                }
                var15 = var14.field7423;
                if (var15.field6595 < 0) {
                    break;
                }
                var16 = class255.method1747(var15.field6599, false);
            } while (var16 == null || var16.field6675 == null || var16.field6675.length <= var15.field6595 || var16.field6675[var15.field6595] != var15);
            class420.method2673(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lgi;)Lgi;")
    public static final class437 method500(class437 arg0) {
        int var1 = method492(arg0).method2915(-796955630);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class255.method1747(arg0.field6599, false);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method501(int arg0) {
        int var1 = class234.field3861;
        int[] var2 = class21.field245;
        for (int var3 = 0; var3 < class378.field5815 + var1; var3++) {
            class55 var4;
            if (var3 < var1) {
                var4 = class264.field4276[var2[var3]];
            } else {
                var4 = ((class38) class365.field5659.method1122((byte) 59, (long) class81.field1198[var3 - var1])).field378;
            }
            if (var4.field6419 == arg0 && var4.field881 >= 0) {
                int var5 = var4.method415(-4);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6417 & 0x7F) != 0 || (var4.field6410 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field6417 & 0x7F) != 64 || (var4.field6410 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field6417 >> 7;
                    int var7 = var4.field6410 >> 7;
                    if (var4.field881 > class452.field7015[var6][var7]) {
                        class452.field7015[var6][var7] = var4.field881;
                        class159.field2186[var6][var7] = 1;
                    } else if (class452.field7015[var6][var7] == var4.field881) {
                        var10002 = class159.field2186[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field6417 - var8 >> 7;
                    int var10 = var4.field6410 - var8 >> 7;
                    int var11 = var4.field6417 + var8 >> 7;
                    int var12 = var4.field6410 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field881 > class452.field7015[var13][var14]) {
                                class452.field7015[var13][var14] = var4.field881;
                                class159.field2186[var13][var14] = 1;
                            } else if (class452.field7015[var13][var14] == var4.field881) {
                                var10002 = class159.field2186[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method502(int arg0) {
        if (!class141.field1911.field6107) {
            for (int var2 = 0; var2 < class538.field7881; var2++) {
                if (class358.field5564[var2].method1829(-32393) == 's' || class358.field5564[var2].method1829(-32393) == 'S') {
                    class141.field1911.field6107 = true;
                    break;
                }
            }
        }
        field1045++;
        if (class208.field3206 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class246.method1705((byte) 28);
            if (class427.field6463 == 0L) {
                class427.field6463 = var5;
            }
            if (var4 > 16384 && (var5 - class427.field6463) < 5000L) {
                if ((var5 - class441.field6850) > 1000L) {
                    System.gc();
                    class441.field6850 = var5;
                }
                class365.field5657 = class330.field5183.method1583(101, class12.field131);
                class280.field4431 = 5;
            } else {
                class365.field5657 = class462.field7108.method1583(90, class12.field131);
                class280.field4431 = 5;
                class208.field3206 = 10;
            }
        } else if (class208.field3206 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class352.field5488[var7] = class85.method595(-124, class197.field3038, class135.field1839);
            }
            class365.field5657 = class364.field5631.method1583(113, class12.field131);
            class280.field4431 = 10;
            class208.field3206 = 20;
        } else if (class208.field3206 == 20) {
            if (class319.field4975 == null) {
                class319.field4975 = new class82(class104.field1525, class541.field7906);
            }
            if (class319.field4975.method580((byte) -53)) {
                class184.field2680 = class344.method2277(true, 1, 0, false, -6);
                class89.field1314 = class344.method2277(true, 1, 1, false, -6);
                class483.field7346 = class344.method2277(true, 1, 2, false, -6);
                class315.field4926 = class344.method2277(true, 1, 3, false, -6);
                class300.field4717 = class344.method2277(true, 1, 4, false, -6);
                class128.field1730 = class344.method2277(true, 1, 5, true, -6);
                class305.field4799 = class344.method2277(false, 1, 6, true, -6);
                class236.field3876 = class344.method2277(true, 1, 7, false, -6);
                class120.field1646 = class344.method2277(true, 1, 8, false, -6);
                class186.field2714 = class344.method2277(true, 1, 9, false, -6);
                class337.field5259 = class344.method2277(true, 1, 10, false, -6);
                class198.field3045 = class344.method2277(true, 1, 11, false, -6);
                class467.field7157 = class344.method2277(true, 1, 12, false, -6);
                class130.field1767 = class344.method2277(true, 1, 13, false, -6);
                class116.field1621 = class344.method2277(false, 1, 14, false, -6);
                class71.field1074 = class344.method2277(true, 1, 15, false, -6);
                class263.field4264 = class344.method2277(true, 1, 16, false, -6);
                class415.field6290 = class344.method2277(true, 1, 17, false, -6);
                class79.field1178 = class344.method2277(true, 1, 18, false, -6);
                class181.field2636 = class344.method2277(true, 1, 19, false, -6);
                class290.field4581 = class344.method2277(true, 1, 20, false, -6);
                class463.field7119 = class344.method2277(true, 1, 21, false, -6);
                class41.field448 = class344.method2277(true, 1, 22, false, -6);
                class52.field706 = class344.method2277(true, 1, 23, true, -6);
                class122.field1664 = class344.method2277(true, 1, 24, false, -6);
                class285.field4501 = class344.method2277(true, 1, 25, false, -6);
                class502.field7525 = class344.method2277(true, 1, 26, true, -6);
                class214.field3646 = class344.method2277(true, 1, 27, false, -6);
                class10.field106 = class344.method2277(true, 1, 28, true, -6);
                class463.field7117 = class344.method2277(true, 1, 29, false, -6);
                class365.field5657 = class327.field5132.method1583(89, class12.field131);
                class208.field3206 = 30;
                class280.field4431 = 15;
            } else {
                class365.field5657 = class95.field1385.method1583(112, class12.field131);
                class280.field4431 = 12;
            }
        } else if (class208.field3206 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class102.field1484[var9].method2150(false) * class98.field1407[var9] / 100;
            }
            if (var8 == 100) {
                class365.field5657 = class299.field4708.method1583(83, class12.field131);
                class280.field4431 = 20;
                class380.method2455(126, class120.field1646);
                class443.method2806(111, class120.field1646);
                class208.field3206 = 40;
            } else {
                if (var8 != 0) {
                    class365.field5657 = class172.field2521.method1583(102, class12.field131) + var8 + "%";
                }
                class280.field4431 = 20;
            }
        } else if (class208.field3206 == 40) {
            if (class10.field106.method992(-10486)) {
                this.method513(class10.field106.method1010(1, (byte) 125), -16554);
                class365.field5657 = class100.field1440.method1583(91, class12.field131);
                class208.field3206 = 50;
                class280.field4431 = 25;
            } else {
                class365.field5657 = class126.field1719.method1583(117, class12.field131) + class10.field106.method1018((byte) -28) + "%";
                class280.field4431 = 25;
            }
        } else if (class208.field3206 == 50) {
            class343.method2273(1084489728);
            class365.field5657 = class522.field7719.method1583(87, class12.field131);
            class208.field3206 = 60;
            class280.field4431 = 30;
        } else if (class208.field3206 == 60) {
            int var10 = class56.method437(class120.field1646, class130.field1767, -18288);
            int var11 = class36.method222(6);
            if (var10 < var11) {
                class365.field5657 = class438.field6780.method1583(117, class12.field131) + var10 * 100 / var11 + "%";
                class280.field4431 = 35;
            } else {
                class365.field5657 = class247.field4019.method1583(97, class12.field131);
                class208.field3206 = 70;
                class280.field4431 = 35;
            }
        } else if (class208.field3206 == 70) {
            int var12 = class463.method2906(class120.field1646, false);
            int var13 = class5.method50(4);
            if (var13 > var12) {
                class365.field5657 = class144.field1938.method1583(78, class12.field131) + var12 * 100 / var13 + "%";
                class280.field4431 = 40;
            } else {
                class365.field5657 = class397.field5995.method1583(107, class12.field131);
                class280.field4431 = 40;
                class208.field3206 = 80;
            }
        } else if (class208.field3206 != 80) {
            int var14 = 77 % ((-arg0 - 85) / 36);
            if (class208.field3206 == 90) {
                class365.field5657 = class101.field1444.method1583(107, class12.field131);
                class208.field3206 = 95;
                class280.field4431 = 50;
            } else if (class208.field3206 == 95) {
                if (class141.field1911.field6107) {
                    class141.field1911.field6089 = 0;
                    class141.field1911.field6097 = 0;
                    class141.field1911.field6095 = 0;
                    class141.field1911.field6083 = 0;
                    class141.field1911.field6110 = 1;
                }
                class141.field1911.field6107 = true;
                class141.field1911.method1638(32749, class339.field5294);
                class116.method745(class141.field1911.field6083, false, -1068);
                class365.field5657 = class463.field7114.method1583(95, class12.field131);
                class280.field4431 = 55;
                class208.field3206 = 100;
            } else if (class208.field3206 == 100) {
                class319.method2134(class19.field198, (byte) -37, class130.field1767, class120.field1646);
                class365.field5657 = class508.field7582.method1583(110, class12.field131);
                class280.field4431 = 60;
                class89.method610(1, (byte) -105);
                class208.field3206 = 110;
            } else if (class208.field3206 == 110) {
                class483.field7346.method992(-10486);
                byte var15 = 0;
                int var16 = var15 + class483.field7346.method1018((byte) 121);
                class263.field4264.method992(-10486);
                int var17 = var16 + class263.field4264.method1018((byte) -90);
                class415.field6290.method992(-10486);
                int var18 = var17 + class415.field6290.method1018((byte) -89);
                class79.field1178.method992(-10486);
                int var19 = var18 + class79.field1178.method1018((byte) 11);
                class181.field2636.method992(-10486);
                int var20 = var19 + class181.field2636.method1018((byte) 110);
                class290.field4581.method992(-10486);
                int var21 = var20 + class290.field4581.method1018((byte) -20);
                class463.field7119.method992(-10486);
                int var22 = var21 + class463.field7119.method1018((byte) 13);
                class41.field448.method992(-10486);
                int var23 = var22 + class41.field448.method1018((byte) 6);
                class122.field1664.method992(-10486);
                int var24 = var23 + class122.field1664.method1018((byte) -48);
                class285.field4501.method992(-10486);
                int var25 = var24 + class285.field4501.method1018((byte) 119);
                class214.field3646.method992(-10486);
                int var26 = var25 + class214.field3646.method1018((byte) -126);
                class463.field7117.method992(-10486);
                int var27 = var26 + class463.field7117.method1018((byte) -15);
                if (var27 < 1200) {
                    class365.field5657 = class80.field1191.method1583(126, class12.field131) + var27 / 12 + "%";
                    class280.field4431 = 65;
                } else {
                    class274.field4353 = new class187(class516.field7674, class12.field131, class483.field7346);
                    class19.field199 = new class346(class516.field7674, class12.field131, class483.field7346);
                    class359.field5569 = new class259(class516.field7674, class12.field131, class483.field7346, class120.field1646);
                    class375.field5749 = new class377(class516.field7674, class12.field131, class415.field6290);
                    class310.field4844 = new class70(class516.field7674, class12.field131, class483.field7346);
                    class32.field333 = new class178(class516.field7674, class12.field131, class483.field7346);
                    class17.field178 = new class163(class516.field7674, class12.field131, class483.field7346, class236.field3876);
                    class373.field5722 = new class64(class516.field7674, class12.field131, class483.field7346);
                    class525.field7743 = new class77(class516.field7674, class12.field131, class483.field7346);
                    class454.field7029 = new class489(class516.field7674, class12.field131, true, class263.field4264, class236.field3876);
                    class457.field7049 = new class98(class516.field7674, class12.field131, class483.field7346, class120.field1646);
                    class453.field7020 = new class435(class516.field7674, class12.field131, class483.field7346, class120.field1646);
                    class6.field72 = new class483(class516.field7674, class12.field131, true, class79.field1178, class236.field3876);
                    class337.field5262 = new class310(class516.field7674, class12.field131, true, class274.field4353, class181.field2636, class236.field3876);
                    class360.field5583 = new class20(class516.field7674, class12.field131, class483.field7346);
                    class388.field5915 = new class244(class516.field7674, class12.field131, class290.field4581, class184.field2680, class89.field1314);
                    class93.field1361 = new class137(class516.field7674, class12.field131, class483.field7346);
                    class187.field2727 = new class123(class516.field7674, class12.field131, class483.field7346);
                    class85.field1242 = new class294(class516.field7674, class12.field131, class463.field7119, class236.field3876);
                    class436.field6588 = new class48(class516.field7674, class12.field131, class483.field7346);
                    class278.field4390 = new class36(class516.field7674, class12.field131, class483.field7346);
                    class483.field7340 = new class49(class516.field7674, class12.field131, class483.field7346);
                    class197.field3037 = new class121(class516.field7674, class12.field131, class41.field448);
                    class322.field5027 = new class86(class516.field7674, class12.field131, class483.field7346);
                    class418.method2668(class236.field3876, class315.field4926, 19420, class120.field1646, class130.field1767);
                    class323.method2165(class463.field7117, -2);
                    class5.field62 = new class344(class12.field131, class122.field1664, class285.field4501);
                    class500.field7501 = new class274(class12.field131, class122.field1664, class285.field4501, new class250());
                    class365.field5657 = class207.field3153.method1583(126, class12.field131);
                    class280.field4431 = 65;
                    class234.method1659(0);
                    class454.field7029.method2999(!class141.field1911.method1635(class452.field7013, -1), 83);
                    class96.field1394 = new class295();
                    class497.method3041(1889);
                    class481.method2969(122, class214.field3646);
                    class382.method2471((byte) 1, class236.field3876, class161.field2206);
                    class208.field3206 = 120;
                }
            } else if (class208.field3206 == 120) {
                int var28 = class360.method2378((byte) -61, class120.field1646);
                int var29 = class46.method336(64);
                if (var29 > var28) {
                    class365.field5657 = class103.field1518.method1583(118, class12.field131) + var28 * 100 / var29 + "%";
                    class280.field4431 = 70;
                } else {
                    class233.method1657(0, class120.field1646, class19.field198);
                    class375.method2426(-2106, class447.field6944);
                    class365.field5657 = class178.field2613.method1583(110, class12.field131);
                    class280.field4431 = 70;
                    class208.field3206 = 130;
                }
            } else if (class208.field3206 == 130) {
                if (class337.field5259.method994("huffman", (byte) -48, "")) {
                    class473 var30 = new class473(class337.field5259.method1022(110, "", "huffman"));
                    class500.method3050(122, var30);
                    class365.field5657 = class336.field5251.method1583(78, class12.field131);
                    class280.field4431 = 75;
                    class208.field3206 = 140;
                } else {
                    class365.field5657 = class218.field3704.method1583(118, class12.field131) + "0%";
                    class280.field4431 = 75;
                }
            } else if (class208.field3206 == 140) {
                if (class315.field4926.method992(-10486)) {
                    class365.field5657 = class59.field939.method1583(111, class12.field131);
                    class208.field3206 = 150;
                    class280.field4431 = 80;
                } else {
                    class365.field5657 = class52.field705.method1583(111, class12.field131) + class315.field4926.method1018((byte) 6) + "%";
                    class280.field4431 = 80;
                }
            } else if (class208.field3206 == 150) {
                if (class467.field7157.method992(-10486)) {
                    class365.field5657 = class73.field1104.method1583(127, class12.field131);
                    class280.field4431 = 82;
                    class208.field3206 = 160;
                } else {
                    class365.field5657 = class255.field4139.method1583(91, class12.field131) + class467.field7157.method1018((byte) -126) + "%";
                    class280.field4431 = 82;
                }
            } else if (class208.field3206 == 160) {
                if (class130.field1767.method992(-10486)) {
                    class365.field5657 = class490.field7419.method1583(99, class12.field131);
                    class280.field4431 = 85;
                    class208.field3206 = 170;
                } else {
                    class365.field5657 = class490.field7419.method1583(110, class12.field131) + class130.field1767.method1018((byte) 116) + "%";
                    class280.field4431 = 85;
                }
            } else if (class208.field3206 == 170) {
                if (class52.field706.method1001((byte) -56, "details")) {
                    class194.method1221(class52.field706, class310.field4844, class32.field333, class454.field7029, class457.field7049, class453.field7020, class96.field1394);
                    class365.field5657 = class221.field3738.method1583(104, class12.field131);
                    class280.field4431 = 89;
                    class208.field3206 = 190;
                } else {
                    class365.field5657 = class393.field5962.method1583(111, class12.field131) + class52.field706.method1003("details", 0) + "%";
                    class280.field4431 = 87;
                }
            } else if (class208.field3206 == 190) {
                class187.field2726 = new int[class483.field7340.field620];
                class192.field2842 = new String[class278.field4390.field372];
                class225.field3770 = new boolean[class483.field7340.field620];
                for (int var31 = 0; var31 < class483.field7340.field620; var31++) {
                    if (class483.field7340.method353(19, var31).field5921 == 0) {
                        class225.field3770[var31] = true;
                        class209.field3225++;
                    }
                    class187.field2726[var31] = -1;
                }
                class509.method3083((byte) -127);
                class39.field385 = class315.field4926.method1014(true, "loginscreen");
                class89.field1308 = class315.field4926.method1014(true, "lobbyscreen");
                class128.field1730.method1015(false, 104, true);
                class305.field4799.method1015(true, 110, true);
                class120.field1646.method1015(true, 120, true);
                class130.field1767.method1015(true, 114, true);
                class337.field5259.method1015(true, 104, true);
                class315.field4926.method1015(true, 107, true);
                class483.field7346.field2342 = 2;
                class280.field4441 = true;
                class415.field6290.field2342 = 2;
                class263.field4264.field2342 = 2;
                class79.field1178.field2342 = 2;
                class181.field2636.field2342 = 2;
                class290.field4581.field2342 = 2;
                class463.field7119.field2342 = 2;
                class320.method2142(false, -1, -1, class141.field1911.field6110, -4);
                class365.field5657 = class271.field4322.method1583(124, class12.field131);
                class208.field3206 = 200;
                class280.field4431 = 95;
            } else if (class208.field3206 == 200) {
                class89.method610(2, (byte) -125);
            }
        } else if (class502.field7525.method992(-10486)) {
            class161.field2206 = new class399(class502.field7525, class186.field2714, class120.field1646);
            class365.field5657 = class372.field5711.method1583(107, class12.field131);
            class280.field4431 = 45;
            class208.field3206 = 90;
        } else {
            class365.field5657 = class467.field7148.method1583(93, class12.field131) + class502.field7525.method1018((byte) 107) + "%";
            class280.field4431 = 45;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method503() {
        int var0 = class234.field3861;
        int[] var1 = class21.field245;
        boolean var2 = class141.field1911.field6121 == 1 && var0 > 200 || class141.field1911.field6121 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class350 var13 = class264.field4276[var1[var3]];
            if (var13.method2310(false)) {
                var13.method423(-125);
                if (var13.field6423 >= 0 && var13.field6424 >= 0 && var13.field6420 < class135.field1839 && var13.field6418 < class197.field3038) {
                    var13.field5444 = var13.field822 ? var2 : false;
                    if (class358.field5565 == var13) {
                        var13.field881 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field816) {
                            var14++;
                        }
                        if (var13.field871 > class88.field1278) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method415(-4) << 2);
                        if (var13.field5425) {
                            var15 += 512;
                        } else {
                            if (class34.field350 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field881 = var15 + 1;
                    }
                } else {
                    var13.field881 = -1;
                }
            } else {
                var13.field881 = -1;
            }
        }
        for (int var4 = 0; var4 < class378.field5815; var4++) {
            class378 var10 = ((class38) class365.field5659.method1122((byte) 59, (long) class81.field1198[var4])).field378;
            if (var10.method2444(false) && var10.field5809.method1189(class96.field1394, (byte) -18)) {
                var10.method423(-124);
                if (var10.field6423 >= 0 && var10.field6424 >= 0 && var10.field6420 < class135.field1839 && var10.field6418 < class197.field3038) {
                    int var11 = 0;
                    if (!var10.field816) {
                        var11++;
                    }
                    if (var10.field871 > class88.field1278) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method415(-4) << 2);
                    if (class34.field350 == 0) {
                        if (var10.field5809.field2836) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class34.field350 == 1) {
                        if (var10.field5809.field2836) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field5809.field2824) {
                        var12 += 1024;
                    } else if (!var10.field5809.field2795) {
                        var12 += 256;
                    }
                    var10.field881 = var12 + 1;
                } else {
                    var10.field881 = -1;
                }
            } else {
                var10.field881 = -1;
            }
        }
        for (int var5 = 0; var5 < class323.field5076.length; var5++) {
            class402 var6 = class323.field5076[var5];
            if (var6 != null) {
                if (var6.field6058 == 1) {
                    class38 var7 = (class38) class365.field5659.method1122((byte) 59, (long) var6.field6053);
                    if (var7 != null) {
                        class378 var8 = var7.field378;
                        if (var8.field881 >= 0) {
                            var8.field881 += 2048;
                        }
                    }
                } else if (var6.field6058 == 10) {
                    class350 var9 = class264.field4276[var6.field6053];
                    if (var9 != null && class358.field5565 != var9 && var9.field881 >= 0) {
                        var9.field881 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method504(int arg0) {
        method506(arg0 ^ 0xFFFFF0D0);
        field1042++;
        class176.method1118(arg0 ^ 0xFFFFDB7F);
        class456.method2859(arg0 - 9451);
        class213.method1580((byte) -125);
        class371.method2415(-119);
        class152.method928(-13531);
        class433.method2726((byte) 98);
        class452.method2848((byte) -119);
        class529.method3145((byte) 55);
        class434.method2733(false);
        class177.method1125(5);
        class174.method1095((byte) 113);
        class464.method2907(66);
        class235.method1664(75);
        class426.method2696((byte) 113);
        class236.method1666(122);
        class205.method1404(false);
        class497.method3043(-12913);
        class227.method1634((byte) -126);
        class402.method2582((byte) -26);
        class295.method1987(arg0 ^ 0xFFFFDB66);
        class317.method2115((byte) -66);
        class247.method1710(-75);
        class204.method1402(arg0 ^ 0x24EB);
        class342.method2268((byte) -24);
        class322.method2153(-1);
        class162.method1025(false);
        class403.method2596((byte) -116);
        class307.method2070((byte) 62);
        class328.method2198((byte) 69);
        class346.method2287(49);
        class259.method1769((byte) 37);
        class377.method2440(false);
        class70.method520((byte) 37);
        class178.method1132((byte) -112);
        class64.method470(65536);
        class77.method552(true);
        class489.method3001(119);
        class98.method664(98);
        class435.method2737((byte) 100);
        class483.method2974((byte) 72);
        class310.method2079(250);
        class187.method1167(7);
        class244.method1701((byte) 58);
        class137.method837(29);
        class123.method776((byte) 36);
        class294.method1973(97);
        class48.method346((byte) -114);
        class36.method224(false);
        class49.method351(1);
        class121.method761(-128);
        class86.method597(-125);
        class274.method1846(false);
        class38.method229(0);
        class440.method2791((byte) -76);
        class276.method1858(-1342326174);
        class104.method709(arg0 - 9571);
        class375.method2431(arg0 - 9373);
        class141.method856(-1);
        class284.method1924(arg0 + 13069);
        class242.method1683((byte) 127);
        class258.method1761(arg0 - 9452);
        class218.method1602(16);
        class437.method2753(true);
        class534.method3167(false);
        class350.method2316(-1);
        class305.method2056((byte) 2);
        class537.method3183(-1);
        class55.method420(-5);
        class299.method2018((byte) -84);
        class409.method2613(9);
        class31.method199((byte) -95);
        class422.method2690((byte) -102);
        class454.method2855(arg0 - 9450);
        class378.method2447(0);
        class301.method2025((byte) 122);
        class467.method2912(arg0 ^ 0x2489);
        class219.method1605(true);
        class122.method770(arg0 ^ 0xFFFFB42B);
        class269.method1823((byte) 48);
        class6.method52(-84);
        class392.method2498((byte) -89);
        class14.method81(128);
        class221.method1612(295);
        class147.method899((byte) -107);
        class320.method2143(true);
        class68.method487(-21);
        class222.method1617(true);
        class522.method3121(-91);
        class179.method1139(52);
        class490.method3009((byte) 67);
        class319.method2137(4);
        class87.method603(arg0 ^ 0x24B3);
        class405.method2600(true);
        class78.method567(6311);
        class249.method1722(true);
        class75.method543((byte) 104);
        class536.method3176((byte) -56);
        class389.method2494(10);
        class341.method2263(true);
        class321.method2144(arg0 - 9451);
        class285.method1927((byte) -116);
        class156.method952(-122);
        class438.method2774(46);
        class445.method2817(7);
        class223.method1620((byte) 116);
        class191.method1194((byte) -7);
        class196.method1345(4497);
        class453.method2854(-3878);
        class517.method3106(-126);
        class340.method2250(32);
        class415.method2646((byte) -85);
        class148.method903((byte) 62);
        class53.method376(-43);
        class262.method1782(arg0 + 16255);
        class239.method1672((byte) 59);
        class17.method90(-10961);
        class531.method3156((byte) -118);
        class462.method2902(true);
        class8.method62(6656);
        class337.method2239(arg0 ^ 0xFFFF9520);
        class479.method2963((byte) -124);
        class481.method2966(-126);
        class80.method572(36);
        class439.method2787(0);
        class423.method2691(8);
        class484.method2981((byte) 16);
        class514.method3095(-25569);
        class487.method2987(true);
        class356.method2351();
        class45.method333((byte) 126);
        class289.method1949((byte) 114);
        class119.method753(46);
        class132.method819(0);
        class278.method1864(-115);
        class306.method2065((byte) -84);
        class170.method1077(26);
        class420.method2684();
        class194.method1222();
        class325.method2173((byte) 123);
        class224.method1622((byte) -107);
        class29.method192();
        class450.method2833(false);
        class210.method1488(-29);
        class298.method1998((byte) 98);
        class399.method2573(0);
        class318.method2129(15);
        class476.method2956((byte) -120);
        class272.method1839(true);
        class71.method524((byte) 40);
        class442.method2800(arg0 - 9563);
        class335.method2223(12762);
        class41.method255((byte) -100);
        class186.method1158(-8241);
        class436.method2744(true);
        class261.method1779(-106);
        class101.method680(3);
        class114.method732(true);
        class398.method2570(0);
        class126.method785(-14);
        class93.method639(arg0 - 9451);
        class279.method1876(125);
        class349.method2306((byte) 70);
        class388.method2490(1);
        class198.method1363(-128);
        class314.method2102(-120);
        class336.method2230((byte) -98);
        class250.method1730(20258);
        class10.method65(false);
        class504.method3061(0);
        class539.method3189(arg0 - 9448);
        class150.method916((byte) 73);
        class206.method1409(false);
        class381.method2460();
        class413.method2634(true);
        class473.method2947(true);
        class385.method2482(22);
        class491.method3013(-93);
        class46.method340(16);
        class149.method914(0);
        class135.method831((byte) -41);
        class169.method1068(arg0 - 8427);
        class12.method74(arg0 - 9351);
        class528.method3141(69);
        class477.method2959(true);
        class192.method1201((byte) 19);
        class506.method3071((byte) -98);
        class521.method3118(false);
        class401.method2581(123);
        class339.method2244(true);
        class315.method2103(-1);
        class407.method2606(0);
        class397.method2558(22534);
        class83.method586(0);
        class34.method214(-108);
        class323.method2164((byte) -60);
        class444.method2814(false);
        class109.method716(arg0 ^ 0x24EB);
        class419.method2671((byte) -86);
        class30.method197(99);
        class207.method1414((byte) -89);
        class61.method453(119);
        class3.method37(-30354);
        class214.method1587(-15589);
        class414.method2644(107);
        class312.method2096((byte) 73);
        class257.method1755((byte) -126);
        class524.method3129(false);
        class510.method3087(0);
        class542.method3195(544);
        class472.method2934((byte) 40);
        class345.method2284((byte) 80);
        class217.method1598(-119);
        class471.method2931(1751617831);
        class443.method2805((byte) -4);
        class432.method2722((byte) 78);
        class231.method1650(9);
        class124.method777();
        class293.method1967((byte) -120);
        class100.method673(-25336);
        class51.method361(-125);
        class255.method1745((byte) -115);
        class303.method2037((byte) -122);
        class54.method413(-20536);
        class95.method650((byte) 72);
        class359.method2376(13);
        class300.method2022(-104);
        class332.method2212(false);
        class168.method1064(65280);
        class502.method3055((byte) -128);
        class474.method2954(6);
        class461.method2897();
        class136.method833((byte) -48);
        class523.method3125((byte) 45);
        class96.method652(-8078);
        class154.method941(2);
        class416.method2659((byte) 4);
        class406.method2604((byte) -2);
        class376.method2434((byte) 116);
        class153.method932((byte) -128);
        class516.method3105((byte) 34);
        class447.method2820(11827);
        class19.method101(true);
        class189.method1184((byte) 95);
        class330.method2207(-23939);
        class130.method809((byte) 99);
        class167.method1060((byte) -99);
        class16.method87(arg0 - 7062);
        class393.method2509(true);
        class91.method633(-67);
        class494.method3023();
        class354.method2337((byte) 123);
        class120.method756(true);
        class40.method241();
        class333.method2218();
        class99.method669();
        class286.method1930(-89);
        class478.method2961();
        class220.method1608(11983);
        class165.method1044((byte) -80);
        class380.method2456(arg0 ^ 0x24C7);
        class288.method1943();
        class382.method2469(-16431);
        class202.method1374(true);
        class327.method2184(69);
        class188.method1176((byte) 58);
        class166.method1051(-2);
        class379.method2453(14535);
        class509.method3081((byte) -119);
        class181.method1144(arg0 ^ 0xFFFFDB7E);
        class518.method3109(-1007);
        class237.method1668(false);
        class525.method3131(3);
        class411.method2629(99);
        class184.method1152((byte) -66);
        class128.method800(-2);
        class290.method1953(4);
        class540.method3190(59);
        class343.method2275((byte) 103);
        class50.method356((byte) -74);
        class211.method1500(6);
        class280.method1891((byte) -113);
        class23.method146(6);
        class62.method467(arg0 ^ 0x2497);
        class429.method2716((byte) 81);
        class129.method801(false);
        class89.method613((byte) 51);
        class1.method1((byte) -122);
        class311.method2090(false);
        class146.method887((byte) -100);
        class427.method2702(-31);
        class532.method3158((byte) -93);
        class296.method1991(-4160);
        class508.method3077(arg0 - 9450);
        class161.method988((byte) 77);
        class67.method483(-1257604058);
        class302.method2032(15);
        class15.method86(8264);
        class145.method872();
        class418.method2670(true);
        class225.method1627(-167);
        class7.method57(0);
        class338.method2242(4096);
        class108.method714(arg0 - 9451);
        class9.method63(false);
        class131.method812(false);
        class172.method1085(-508058780);
        class84.method590((byte) -102);
        class535.method3171(-680233268);
        class5.method46(4096);
        class226.method1630(-81);
        class138.method844((byte) 46);
        class159.method972(true);
        class372.method2418(26061);
        class103.method702(arg0 ^ 0x2494);
        class271.method1835((byte) -125);
        class144.method868(arg0 + 885864385);
        class193.method1203(11032);
        class24.method151(arg0 ^ 0xFFFFDB14);
        class482.method2970((byte) -1);
        class4.method42(true);
        class155.method946(-2);
        class63.method468(237);
        class18.method94(-27);
        class460.method2892(arg0 ^ 0x24EB);
        class183.method1151((byte) -124);
        class243.method1692(2);
        class88.method605((byte) 89);
        class541.method3192(-9297);
        class52.method366((byte) 60);
        class266.method1816((byte) -104);
        class112.method725(1742608961);
        class505.method3068();
        class44.method331();
        class396.method2556((byte) -92);
        class417.method2666((byte) 87);
        class72.method531(true);
        class65.method472(-1);
        class384.method2478(116);
        class468.method2918(1);
        class264.method1810(-1);
        class102.method691(false);
        class233.method1655(-69);
        class160.method973(arg0 - 9575);
        class85.method594((byte) -36);
        class357.method2362((byte) -73);
        class348.method2299(125);
        class216.method1592((byte) -106);
        class94.method645((byte) -114);
        class92.method636(true);
        class283.method1906(arg0 ^ 0xFFFF9FA2);
        class457.method2866(true);
        class387.method2487((byte) 56);
        class449.method2826((byte) -99);
        class390.method2495((byte) -88);
        class171.method1081((byte) 113);
        class526.method3132(true);
        class116.method743((byte) 119);
        class498.method3049(140735399);
        class21.method136(true);
        class260.method1770((byte) -29);
        class42.method260(26589);
        class520.method3116(false);
        class309.method2072((byte) -126);
        class421.method2687(arg0 - 9449);
        class240.method1677(-113);
        class358.method2373(26738);
        class134.method828((byte) 32);
        class297.method1996(114);
        class180.method1141(-8065);
        if (arg0 != 9451) {
            this.method496(-83);
        }
        class229.method1641(true);
        class463.method2904(-78);
        class386.method2484(3);
        class316.method2110((byte) 104);
        class143.method865((byte) -84);
        class81.method577((byte) -4);
        class215.method1589((byte) -67);
        class79.method570(arg0 - 9452);
        class365.method2397(255);
        class142.method862(10);
        class352.method2334(128);
        class512.method3090(false);
        class364.method2394((byte) -53);
        class268.method1821(55);
        class513.method3093(arg0 ^ 0x24E3);
        class60.method450(-50);
        class209.method1482(arg0 - 9451);
        class32.method205(126);
        class241.method1679((byte) 31);
        class360.method2380(0);
        class13.method75(255);
        class500.method3051(-113);
        class39.method231((byte) -19);
        class140.method855(true);
        class270.method1826(false);
        class373.method2423((byte) -118);
        class428.method2711(4380);
        class76.method547((byte) 51);
        class197.method1357(false);
        class425.method2693((byte) 108);
        class59.method448((byte) -85);
        class164.method1034(-1);
        class361.method2383(59);
        class530.method3150(false);
        class256.method1754((byte) -80);
        class234.method1658(98);
        class73.method533(6046);
        class228.method1639((byte) -125);
        class329.method2203(17570);
        class326.method2179((byte) -119);
        class368.method2409((byte) -51);
        class263.method1807(arg0 - 9448);
        class212.method1576(true);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lgi;IIIIIIIII)V")
    public static final void method505(class437[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class437 var11 = arg0[var10];
            if (var11 != null && var11.field6599 == arg1) {
                int var12 = var11.field6666 + arg6;
                int var13 = var11.field6644 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field6729 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field6615 + var12;
                    int var19 = var11.field6730 + var13;
                    if (var11.field6729 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field6729 == 0 || var11.field6711 || method492(var11).field7149 != 0 || class326.field5117 == var11 || class301.field4733 == var11.field6688) {
                    if (!method512(var11)) {
                        if (class477.field7309 == var11) {
                            class387.field5906 = true;
                            class169.field2478 = var12;
                            class319.field4974 = var13;
                        }
                        if (var11.field6626 || var14 < var16 && var15 < var17) {
                            if (var11.field6639 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class491 var20 = (class491) class176.field2580.method2123(55); var20 != null; var20 = (class491) class176.field2580.method2126((byte) 61)) {
                                    if (var20.field7421) {
                                        var20.method3149(69);
                                        var20.field7423.field6682 = false;
                                    }
                                }
                                if (class479.field7322 == 0) {
                                    class477.field7309 = null;
                                    class326.field5117 = null;
                                }
                                class160.field2192 = 0;
                                class7.field85 = false;
                                class361.field5596 = false;
                                if (!class409.field6204) {
                                    class360.method2379(28958);
                                }
                            }
                            boolean var21;
                            if (class472.field7240.method2038(-49) >= var14 && class472.field7240.method2043((byte) -102) >= var15 && class472.field7240.method2038(-49) < var16 && class472.field7240.method2043((byte) -78) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class128.field1732 && var21) {
                                if (var11.field6593 >= 0) {
                                    class436.field6587 = var11.field6593;
                                } else if (var11.field6639) {
                                    class436.field6587 = -1;
                                }
                            }
                            if (!class409.field6204 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class217.method1599(-1, var11, arg8 - var12, arg9 - var13);
                            }
                            boolean var22 = false;
                            if (class472.field7240.method2046(-25) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class32 var24 = (class32) class513.field7612.method2123(59);
                            if (var24 != null && var24.method141((byte) -58) == 0 && var24.method139(true) >= var14 && var24.method142(101) >= var15 && var24.method139(true) < var16 && var24.method142(70) < var17) {
                                var23 = true;
                            }
                            if (var11.field6674 != null) {
                                for (int var25 = 0; var25 < var11.field6674.length; var25++) {
                                    if (class36.field376.method927(var11.field6674[var25], -1234)) {
                                        if (var11.field6663 == null || class88.field1278 >= var11.field6663[var25]) {
                                            byte var26 = var11.field6631[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class36.field376.method927(86, -1234) && !class36.field376.method927(82, -1234) && !class36.field376.method927(81, -1234)) && ((var26 & 0x2) == 0 || class36.field376.method927(86, -1234)) && ((var26 & 0x1) == 0 || class36.field376.method927(82, -1234)) && ((var26 & 0x4) == 0 || class36.field376.method927(81, -1234))) {
                                                if (var25 < 10) {
                                                    class311.method2093(false, -1, var25 + 1, var11.field6751, "");
                                                } else if (var25 == 10) {
                                                    class497.method3038(101);
                                                    class467 var27 = method492(var11);
                                                    class262.method1795(true, var27.field7145, var27.method2913(-9), var11);
                                                    class427.field6450 = class210.method1484(var11, 0);
                                                    if (class427.field6450 == null) {
                                                        class427.field6450 = "Null";
                                                    }
                                                    class283.field4459 = var11.field6632 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field6620[var25];
                                                if (var11.field6663 == null) {
                                                    var11.field6663 = new int[var11.field6674.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field6663[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field6663[var25] = class88.field1278 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field6663 != null) {
                                        var11.field6663[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class39.method233(2, var24.method142(112) - var13, var11, var24.method139(true) - var12);
                            }
                            if (class477.field7309 != null && class477.field7309 != var11 && var21 && method492(var11).method2909(true)) {
                                class309.field4834 = var11;
                            }
                            if (class326.field5117 == var11) {
                                class6.field76 = true;
                                class56.field904 = var12;
                                class390.field5931 = var13;
                            }
                            if (var11.field6711 || var11.field6688 != 0) {
                                if (var21 && class349.field5412 != 0 && var11.field6627 != null) {
                                    class491 var29 = new class491();
                                    var29.field7421 = true;
                                    var29.field7423 = var11;
                                    var29.field7426 = class349.field5412;
                                    var29.field7430 = var11.field6627;
                                    class176.field2580.method2124(var29, (byte) 94);
                                }
                                if (class477.field7309 != null || class409.field6204 || class376.field5788 != var11.field6688 && class160.field2192 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field6688 != 0) {
                                    if (class411.field6238 == var11.field6688 || class464.field7124 == var11.field6688) {
                                        class330.field5180 = var11;
                                        if (class302.field4737 != null) {
                                            class302.field4737.method1383(class19.field198, (byte) 5, var11.field6730);
                                        }
                                        if (class411.field6238 == var11.field6688) {
                                            if (!class409.field6204 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class31.method203(class19.field198, (byte) -122, arg8, arg9);
                                                for (class214 var30 = (class214) class114.field1603.method2616(255); var30 != null; var30 = (class214) class114.field1603.method2619(255)) {
                                                    if (arg8 >= var30.field3651 && arg8 < var30.field3645 && arg9 >= var30.field3644 && arg9 < var30.field3647) {
                                                        class360.method2379(28958);
                                                        class438.method2772(var30.field3650, (byte) -58);
                                                    }
                                                }
                                            }
                                            class48.method348(var11, -95, var13, var12);
                                            continue;
                                        }
                                    }
                                    if (class301.field4733 == var11.field6688) {
                                        if (var11.method2761(class19.field198, (byte) 53) == null || class148.field1999 != 0 && class148.field1999 != 3 || class409.field6204 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field6732[var32];
                                        if (var31 < var33 || var31 > var11.field6642[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field6615 / 2;
                                        int var35 = var32 - var11.field6730 / 2;
                                        int var36;
                                        if (class334.field5222 == 4) {
                                            var36 = (int) class388.field5918 & 0x3FFF;
                                        } else {
                                            var36 = (int) class388.field5918 + class386.field5903 & 0x3FFF;
                                        }
                                        int var37 = class147.field1988[var36];
                                        int var38 = class147.field1986[var36];
                                        if (class334.field5222 != 4) {
                                            var37 = (class326.field5126 + 256) * var37 >> 8;
                                            var38 = (class326.field5126 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class334.field5222 == 4) {
                                            var41 = (class433.field6538 >> 7) + (var39 >> 2);
                                            var42 = (class5.field61 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class358.field5565.method415(-4) - 1) * 64;
                                            var41 = (class358.field5565.field6417 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class358.field5565.field6410 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class128.field1732 && (class535.field7838 & 0x40) != 0) {
                                            class437 var44 = class24.method150(true, class31.field327, class398.field6007);
                                            if (var44 == null) {
                                                class497.method3038(111);
                                            } else {
                                                class279.method1875(1L, var42, true, false, " ->", var11.field6716, var41, class427.field6450, -71, 25, class186.field2716);
                                            }
                                            continue;
                                        }
                                        if (class516.field7674 == class261.field4216) {
                                            class279.method1875(1L, var42, true, false, "", -1, var41, class305.field4794.method1583(101, class12.field131), -61, 60, -1);
                                        }
                                        class279.method1875(1L, var42, true, false, "", -1, var41, class390.field5930, -104, 47, class372.field5717);
                                        continue;
                                    }
                                    if (class376.field5788 == var11.field6688) {
                                        class204.field3125 = var11;
                                        if (var21) {
                                            class7.field85 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method139(true) - var12 - var11.field6615 / 2) * 2.0D / (double) class194.field2877);
                                            int var46 = (int) (-((double) (var24.method142(124) - var13 - var11.field6730 / 2) * 2.0D / (double) class194.field2877));
                                            int var47 = class201.field3060 + var45 + class194.field2883;
                                            int var48 = class297.field4679 + var46 + class194.field2900;
                                            class258 var49 = class192.method1200(-23);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1759(var50, var47, 73, var48);
                                            if (var50 != null) {
                                                if (class36.field376.method927(82, -1234) && class439.field6815 > 0) {
                                                    class330.method2208(117, var50[1], var50[0], var50[2]);
                                                    continue;
                                                }
                                                class361.field5596 = true;
                                                class385.field5894 = var50[0];
                                                class423.field6422 = var50[1];
                                                class325.field5108 = var50[2];
                                            }
                                            class160.field2192 = 1;
                                            class51.field693 = false;
                                            class7.field87 = class472.field7240.method2038(-49);
                                            class38.field383 = class472.field7240.method2043((byte) -125);
                                            continue;
                                        }
                                        if (var22 && class160.field2192 > 0) {
                                            if (class160.field2192 == 1 && (class7.field87 != class472.field7240.method2038(-49) || class38.field383 != class472.field7240.method2043((byte) -87))) {
                                                class340.field5311 = class201.field3060;
                                                class190.field2764 = class297.field4679;
                                                class160.field2192 = 2;
                                            }
                                            if (class160.field2192 == 2) {
                                                class51.field693 = true;
                                                class513.method3094((byte) 36, class340.field5311 + (int) ((double) (class7.field87 - class472.field7240.method2038(-49)) * 2.0D / (double) class194.field2875));
                                                class375.method2427((byte) -109, class190.field2764 - (int) ((double) (class38.field383 - class472.field7240.method2043((byte) -127)) * 2.0D / (double) class194.field2875));
                                            }
                                            continue;
                                        }
                                        if (class160.field2192 > 0 && !class51.field693) {
                                            if ((class247.field4006 == 1 || class385.method2483(-126)) && class501.field7514 > 2) {
                                                class225.method1626(class38.field383, class7.field87, 0);
                                            } else if (class327.method2185(true)) {
                                                class225.method1626(class38.field383, class7.field87, 0);
                                            }
                                        }
                                        class160.field2192 = 0;
                                        continue;
                                    }
                                    if (class409.field6199 == var11.field6688) {
                                        if (var22) {
                                            class235.method1663(var11.field6730, var11.field6615, (byte) -87, class472.field7240.method2043((byte) -75) - var13, class472.field7240.method2038(-49) - var12);
                                        }
                                        continue;
                                    }
                                    if (class535.field7839 == var11.field6688) {
                                        class346.method2285(var13, var11, false, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field6684 && var23) {
                                    var11.field6684 = true;
                                    if (var11.field6738 != null) {
                                        class491 var51 = new class491();
                                        var51.field7421 = true;
                                        var51.field7423 = var11;
                                        var51.field7424 = var24.method139(true) - var12;
                                        var51.field7426 = var24.method142(75) - var13;
                                        var51.field7430 = var11.field6738;
                                        class176.field2580.method2124(var51, (byte) -89);
                                    }
                                }
                                if (var11.field6684 && var22 && var11.field6686 != null) {
                                    class491 var52 = new class491();
                                    var52.field7421 = true;
                                    var52.field7423 = var11;
                                    var52.field7424 = class472.field7240.method2038(-49) - var12;
                                    var52.field7426 = class472.field7240.method2043((byte) -76) - var13;
                                    var52.field7430 = var11.field6686;
                                    class176.field2580.method2124(var52, (byte) 104);
                                }
                                if (var11.field6684 && !var22) {
                                    var11.field6684 = false;
                                    if (var11.field6641 != null) {
                                        class491 var53 = new class491();
                                        var53.field7421 = true;
                                        var53.field7423 = var11;
                                        var53.field7424 = class472.field7240.method2038(-49) - var12;
                                        var53.field7426 = class472.field7240.method2043((byte) -106) - var13;
                                        var53.field7430 = var11.field6641;
                                        class65.field1017.method2124(var53, (byte) -35);
                                    }
                                }
                                if (var22 && var11.field6741 != null) {
                                    class491 var54 = new class491();
                                    var54.field7421 = true;
                                    var54.field7423 = var11;
                                    var54.field7424 = class472.field7240.method2038(-49) - var12;
                                    var54.field7426 = class472.field7240.method2043((byte) -95) - var13;
                                    var54.field7430 = var11.field6741;
                                    class176.field2580.method2124(var54, (byte) 99);
                                }
                                if (!var11.field6682 && var21) {
                                    var11.field6682 = true;
                                    if (var11.field6612 != null) {
                                        class491 var55 = new class491();
                                        var55.field7421 = true;
                                        var55.field7423 = var11;
                                        var55.field7424 = class472.field7240.method2038(-49) - var12;
                                        var55.field7426 = class472.field7240.method2043((byte) -99) - var13;
                                        var55.field7430 = var11.field6612;
                                        class176.field2580.method2124(var55, (byte) -43);
                                    }
                                }
                                if (var11.field6682 && var21 && var11.field6719 != null) {
                                    class491 var56 = new class491();
                                    var56.field7421 = true;
                                    var56.field7423 = var11;
                                    var56.field7424 = class472.field7240.method2038(-49) - var12;
                                    var56.field7426 = class472.field7240.method2043((byte) -122) - var13;
                                    var56.field7430 = var11.field6719;
                                    class176.field2580.method2124(var56, (byte) -58);
                                }
                                if (var11.field6682 && !var21) {
                                    var11.field6682 = false;
                                    if (var11.field6614 != null) {
                                        class491 var57 = new class491();
                                        var57.field7421 = true;
                                        var57.field7423 = var11;
                                        var57.field7424 = class472.field7240.method2038(-49) - var12;
                                        var57.field7426 = class472.field7240.method2043((byte) -84) - var13;
                                        var57.field7430 = var11.field6614;
                                        class65.field1017.method2124(var57, (byte) 112);
                                    }
                                }
                                if (var11.field6708 != null) {
                                    class491 var58 = new class491();
                                    var58.field7423 = var11;
                                    var58.field7430 = var11.field6708;
                                    class9.field96.method2124(var58, (byte) -64);
                                }
                                if (var11.field6602 != null && class186.field2710 > var11.field6589) {
                                    if (var11.field6617 == null || class186.field2710 - var11.field6589 > 32) {
                                        class491 var63 = new class491();
                                        var63.field7423 = var11;
                                        var63.field7430 = var11.field6602;
                                        class176.field2580.method2124(var63, (byte) 92);
                                    } else {
                                        label691: for (int var59 = var11.field6589; var59 < class186.field2710; var59++) {
                                            int var60 = class229.field3811[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field6617.length; var61++) {
                                                if (var11.field6617[var61] == var60) {
                                                    class491 var62 = new class491();
                                                    var62.field7423 = var11;
                                                    var62.field7430 = var11.field6602;
                                                    class176.field2580.method2124(var62, (byte) 120);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6589 = class186.field2710;
                                }
                                if (var11.field6601 != null && class360.field5579 > var11.field6592) {
                                    if (var11.field6645 == null || class360.field5579 - var11.field6592 > 32) {
                                        class491 var68 = new class491();
                                        var68.field7423 = var11;
                                        var68.field7430 = var11.field6601;
                                        class176.field2580.method2124(var68, (byte) -66);
                                    } else {
                                        label667: for (int var64 = var11.field6592; var64 < class360.field5579; var64++) {
                                            int var65 = class516.field7673[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field6645.length; var66++) {
                                                if (var11.field6645[var66] == var65) {
                                                    class491 var67 = new class491();
                                                    var67.field7423 = var11;
                                                    var67.field7430 = var11.field6601;
                                                    class176.field2580.method2124(var67, (byte) 116);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6592 = class360.field5579;
                                }
                                if (var11.field6638 != null && class103.field1522 > var11.field6703) {
                                    if (var11.field6652 == null || class103.field1522 - var11.field6703 > 32) {
                                        class491 var73 = new class491();
                                        var73.field7423 = var11;
                                        var73.field7430 = var11.field6638;
                                        class176.field2580.method2124(var73, (byte) 127);
                                    } else {
                                        label643: for (int var69 = var11.field6703; var69 < class103.field1522; var69++) {
                                            int var70 = class45.field586[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field6652.length; var71++) {
                                                if (var11.field6652[var71] == var70) {
                                                    class491 var72 = new class491();
                                                    var72.field7423 = var11;
                                                    var72.field7430 = var11.field6638;
                                                    class176.field2580.method2124(var72, (byte) -45);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6703 = class103.field1522;
                                }
                                if (var11.field6619 != null && class12.field134 > var11.field6673) {
                                    if (var11.field6701 == null || class12.field134 - var11.field6673 > 32) {
                                        class491 var78 = new class491();
                                        var78.field7423 = var11;
                                        var78.field7430 = var11.field6619;
                                        class176.field2580.method2124(var78, (byte) 86);
                                    } else {
                                        label619: for (int var74 = var11.field6673; var74 < class12.field134; var74++) {
                                            int var75 = class220.field3729[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field6701.length; var76++) {
                                                if (var11.field6701[var76] == var75) {
                                                    class491 var77 = new class491();
                                                    var77.field7423 = var11;
                                                    var77.field7430 = var11.field6619;
                                                    class176.field2580.method2124(var77, (byte) -81);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6673 = class12.field134;
                                }
                                if (var11.field6658 != null && class255.field4125 > var11.field6623) {
                                    if (var11.field6634 == null || class255.field4125 - var11.field6623 > 32) {
                                        class491 var83 = new class491();
                                        var83.field7423 = var11;
                                        var83.field7430 = var11.field6658;
                                        class176.field2580.method2124(var83, (byte) 89);
                                    } else {
                                        label595: for (int var79 = var11.field6623; var79 < class255.field4125; var79++) {
                                            int var80 = class464.field7126[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field6634.length; var81++) {
                                                if (var11.field6634[var81] == var80) {
                                                    class491 var82 = new class491();
                                                    var82.field7423 = var11;
                                                    var82.field7430 = var11.field6658;
                                                    class176.field2580.method2124(var82, (byte) 100);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6623 = class255.field4125;
                                }
                                if (class32.field332 > var11.field6628 && var11.field6720 != null) {
                                    class491 var84 = new class491();
                                    var84.field7423 = var11;
                                    var84.field7430 = var11.field6720;
                                    class176.field2580.method2124(var84, (byte) -76);
                                }
                                if (class76.field1138 > var11.field6628 && var11.field6685 != null) {
                                    class491 var85 = new class491();
                                    var85.field7423 = var11;
                                    var85.field7430 = var11.field6685;
                                    class176.field2580.method2124(var85, (byte) -26);
                                }
                                if (class349.field5414 > var11.field6628 && var11.field6723 != null) {
                                    class491 var86 = new class491();
                                    var86.field7423 = var11;
                                    var86.field7430 = var11.field6723;
                                    class176.field2580.method2124(var86, (byte) 119);
                                }
                                if (class352.field5479 > var11.field6628 && var11.field6591 != null) {
                                    class491 var87 = new class491();
                                    var87.field7423 = var11;
                                    var87.field7430 = var11.field6591;
                                    class176.field2580.method2124(var87, (byte) 104);
                                }
                                if (class104.field1530 > var11.field6628 && var11.field6712 != null) {
                                    class491 var88 = new class491();
                                    var88.field7423 = var11;
                                    var88.field7430 = var11.field6712;
                                    class176.field2580.method2124(var88, (byte) 123);
                                }
                                var11.field6628 = class387.field5910;
                                if (var11.field6687 != null) {
                                    for (int var89 = 0; var89 < class538.field7881; var89++) {
                                        class491 var90 = new class491();
                                        var90.field7423 = var11;
                                        var90.field7433 = class358.field5564[var89].method1828((byte) 43);
                                        var90.field7431 = class358.field5564[var89].method1829(-32393);
                                        var90.field7430 = var11.field6687;
                                        class176.field2580.method2124(var90, (byte) 125);
                                    }
                                }
                                if (class440.field6825 && var11.field6706 != null) {
                                    class491 var91 = new class491();
                                    var91.field7423 = var11;
                                    var91.field7430 = var11.field6706;
                                    class176.field2580.method2124(var91, (byte) -73);
                                }
                            }
                            if (var11.field6729 == 5 && var11.field6657 != -1) {
                                var11.method2756(class187.field2727, (byte) -37, class93.field1361).method1383(class19.field198, (byte) -128, var11.field6730);
                            }
                            class95.method649(-3157, var11);
                            if (var11.field6729 == 0) {
                                method505(arg0, var11.field6751, var14, var15, var16, var17, var12 - var11.field6649, var13 - var11.field6613, arg8, arg9);
                                if (var11.field6675 != null) {
                                    method505(var11.field6675, var11.field6751, var14, var15, var16, var17, var12 - var11.field6649, var13 - var11.field6613, arg8, arg9);
                                }
                                class301 var92 = (class301) class423.field6414.method1122((byte) 59, (long) var11.field6751);
                                if (var92 != null) {
                                    if (class516.field7674 == class153.field2042 && var92.field4720 == 0 && !class409.field6204 && var21 && !class223.field3757) {
                                        class360.method2379(28958);
                                    }
                                    class159.method968(arg9, arg8, var92.field4721, var14, var15, -60, var12, var17, var13, var16);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class95.method649(-3157, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public static void method506(int arg0) {
        if (arg0 != -11205) {
            field1056 = null;
        }
        field1056 = null;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method507(byte arg0) {
        field1050++;
        if (class148.field1994 == 13) {
            return;
        }
        class88.field1278++;
        if (class88.field1278 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class417.field6334 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class460.field7086.setSeed((long) class417.field6334);
        }
        if ((class88.field1278 % 50) == 0) {
            class55.field809 = class53.field730;
            class452.field7012 = class50.field673;
            class53.field730 = 0;
            class50.field673 = 0;
        }
        this.method498(1);
        if (class319.field4975 != null) {
            class319.field4975.method581(0);
        }
        class113.method731(-1);
        class36.field376.method925((byte) -75);
        class472.field7240.method2050(23747);
        if (class19.field198 != null) {
            class19.field198.method1287((int) class246.method1705((byte) 28));
        }
        class279.method1874(1);
        class443.field6884 = 0;
        class538.field7881 = 0;
        for (class369 var3 = class36.field376.method926(21863); var3 != null; var3 = class36.field376.method926(21863)) {
            int var6 = var3.method1830(-104);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method1829(-32393);
                if (class161.method977(-3552) && (var7 == '`' || var7 == '§')) {
                    if (class372.method2421(-127)) {
                        class114.method735((byte) 121);
                    } else {
                        class107.method712((byte) 123);
                    }
                } else if (class538.field7881 < 128) {
                    class358.field5564[class538.field7881] = var3;
                    class538.field7881++;
                }
            } else if (var6 == 0 && class443.field6884 < 75) {
                class235.field3864[class443.field6884] = var3;
                class443.field6884++;
            }
        }
        class349.field5412 = 0;
        for (class32 var4 = class472.field7240.method2047((byte) 41); var4 != null; var4 = class472.field7240.method2047((byte) 41)) {
            int var5 = var4.method141((byte) -58);
            if (var5 == -1) {
                class322.field5019.method2124(var4, (byte) -40);
            } else if (var5 == 6) {
                class349.field5412 += var4.method143(3);
            } else if (class399.method2576(var5, (byte) -119)) {
                class513.field7612.method2124(var4, (byte) -55);
                if (class513.field7612.method2114((byte) -95) > 10) {
                    class513.field7612.method2127(-105);
                }
            }
        }
        if (class372.method2421(-84)) {
            class217.method1597(11030);
        }
        if (class148.field1994 == 0) {
            this.method502(-25);
            class68.method485(0);
        } else if (class148.field1994 == 1) {
            this.method502(8);
            class68.method485(0);
        } else if (class87.method602(10, class148.field1994)) {
            class411.method2630((byte) 75);
        }
        if (class486.method2983((byte) 121, class148.field1994) && !class87.method602(10, class148.field1994)) {
            this.method499(true);
            class238.method1669(117);
            class293.method1968((byte) -34);
        } else if (class225.method1624(true, class148.field1994) && !class87.method602(10, class148.field1994)) {
            this.method499(true);
            class293.method1968((byte) -98);
        } else if (class148.field1994 == 11) {
            class293.method1968((byte) -37);
        } else if (class163.method1031(class148.field1994, 11) && !class87.method602(10, class148.field1994)) {
            class416.method2658(true);
        } else if (class148.field1994 == 12) {
            class293.method1968((byte) -64);
            if (class390.field5935 != -3 && class390.field5935 != 2 && class390.field5935 != 15) {
                class496.method3034(true, false);
            }
        }
        class312.method2094(class19.field198, -1);
        if (arg0 <= -42) {
            class513.field7612.method2127(-106);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method508() {
        int var0 = class234.field3861;
        int[] var1 = class21.field245;
        int var2 = class168.field2446 ? var0 : class378.field5815 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class55 var4;
            if (var3 < var0) {
                var4 = class264.field4276[var1[var3]];
            } else {
                var4 = ((class38) class365.field5659.method1122((byte) 59, (long) class81.field1198[var3 - var0])).field378;
            }
            if (var4.field881 >= 0) {
                int var5 = var4.method415(-4);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6417 & 0x7F) == 0 && (var4.field6410 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field6417 & 0x7F) == 64 && (var4.field6410 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class350 && var4.field890 != null && class88.field1278 >= var4.field890.field578 && class88.field1278 < var4.field890.field576) {
                    ((class350) var4).field5444 = false;
                }
                var4.field6412 = class532.method3165(var4.field6419, var4.field6417, false, var4.field6410);
                class186.method1160(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method509(int arg0, int arg1) {
        class294.field4632 = null;
        class116.field1619 = 0;
        class104.field1525.field3130 = arg1;
        class427.field6462 = null;
        if (arg0 == -14932) {
            class104.field1525.field3132++;
            field1052++;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method510(byte arg0) {
        if (arg0 != 110) {
            method512(null);
        }
        field1044++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class523.method3126(true);
        class541.field7906 = new class342(class339.field5294);
        class104.field1525 = new class204();
        if (class209.field3228 != class181.field2626) {
            class112.field1571 = new byte[50][];
        }
        class141.field1911 = new class227(class339.field5294);
        if (class209.field3228 == class181.field2626) {
            class310.field4862.field7721 = this.getCodeBase().getHost();
        } else if (class530.method3151((byte) -38, class209.field3228)) {
            class310.field4862.field7721 = this.getCodeBase().getHost();
            class310.field4862.field7724 = class310.field4862.field7722 + 40000;
            class407.field6152.field7724 = class407.field6152.field7722 + 40000;
            class540.field7899.field7724 = class540.field7899.field7722 + 40000;
            class310.field4862.field7728 = class310.field4862.field7722 + 50000;
            class407.field6152.field7728 = class407.field6152.field7722 + 50000;
            class540.field7899.field7728 = class540.field7899.field7722 + 50000;
        } else if (class77.field1152 == class209.field3228) {
            class310.field4862.field7721 = "127.0.0.1";
            class407.field6152.field7721 = "127.0.0.1";
            class310.field4862.field7724 = class310.field4862.field7722 + 40000;
            class540.field7899.field7721 = "127.0.0.1";
            class407.field6152.field7724 = class407.field6152.field7722 + 40000;
            class540.field7899.field7724 = class540.field7899.field7722 + 40000;
            class310.field4862.field7728 = class310.field4862.field7722 + 50000;
            class407.field6152.field7728 = class407.field6152.field7722 + 50000;
            class540.field7899.field7728 = class540.field7899.field7722 + 50000;
        }
        if (class516.field7674 == class261.field4216) {
            class298.field4686 = true;
            class187.field2725 = class193.field2859;
            class295.field4661 = class34.field357;
            class81.field1200 = class296.field4664;
            class386.field5902 = 16777215;
            class284.field4477 = class341.field5328;
            class271.field4323 = 0;
        } else {
            class81.field1200 = class172.field2524;
            class295.field4661 = class322.field5028;
            class284.field4477 = class9.field100;
            class187.field2725 = class76.field1134;
        }
        class95.field1387 = class310.field4862;
        if (class516.field7674 == class153.field2042) {
            class290.field4577 = false;
        }
        class96.field1397 = class535.field7840 = class352.field5481 = class439.field6817 = new short[256];
        class36.field376 = class426.method2697(18541, class320.field4980);
        class472.field7240 = class45.method334(class320.field4980, true, (byte) -114);
        class328.field5139 = class2.field15;
        try {
            if (class339.field5294.field13 != null) {
                class77.field1151 = new class403(class339.field5294.field13, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class93.field1359[var3] = new class403(class339.field5294.field20[var3], 6000, 0);
                }
                class388.field5919 = new class403(class339.field5294.field22, 6000, 0);
                class460.field7102 = new class307(255, class77.field1151, class388.field5919, 500000);
                class320.field4981 = new class403(class339.field5294.field12, 24, 0);
                class339.field5294.field20 = null;
                class339.field5294.field12 = null;
                class339.field5294.field13 = null;
                class339.field5294.field22 = null;
            }
        } catch (IOException var4) {
            class460.field7102 = null;
            class320.field4981 = null;
            class77.field1151 = null;
            class388.field5919 = null;
        }
        if (class209.field3228 != class181.field2626) {
            class150.field2014 = true;
        }
        if (class516.field7674 == class153.field2042) {
            class384.field5882 = class422.field6394.method1583(115, class12.field131);
        } else if (class516.field7674 == class261.field4216) {
            class384.field5882 = class345.field5378.method1583(84, class12.field131);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILgi;)V")
    public static final void method511(int arg0, class437 arg1) {
        field1046++;
        if (!class128.field1732) {
            return;
        }
        if (arg1.field6717 != null) {
            class437 var2 = class24.method150(true, class31.field327, class398.field6007);
            if (var2 != null) {
                class491 var3 = new class491();
                var3.field7430 = arg1.field6717;
                var3.field7422 = var2;
                var3.field7423 = arg1;
                class420.method2673(var3);
            }
        }
        class269.field4304++;
        class81.method578((byte) 66, class301.field4728);
        class170.field2488.method1477(arg0 + 65255, arg1.field6751);
        class170.field2488.method1437(arg1.field6716, arg0 - 25);
        class170.field2488.method1443(class398.field6007, (byte) 94);
        class170.field2488.method1419(-10147, class31.field327);
        class170.field2488.method1442(4499, arg1.field6595);
        class170.field2488.method1419(arg0 - 10172, class264.field4277);
        if (arg0 != 25) {
            method497(63);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lgi;)Z")
    public static final boolean method512(class437 arg0) {
        if (class223.field3757) {
            if (method492(arg0).field7149 != 0) {
                return false;
            }
            if (arg0.field6729 == 0) {
                return false;
            }
        }
        return arg0.field6739;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
    private final void method513(byte[] arg0, int arg1) {
        field1047++;
        class208 var3 = new class208(arg0);
        while (true) {
            while (true) {
                int var4 = var3.method1445(arg1 ^ 0x40E3);
                if (var4 == 0) {
                    if (arg1 != -16554) {
                        this.method490(true);
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class487.field7386 = new int[6];
                    var5[0] = var3.method1455(-3387);
                    var5[1] = var3.method1455(class229.method1643(arg1, 19859));
                    var5[2] = var3.method1455(-3387);
                    var5[3] = var3.method1455(-3387);
                    var5[4] = var3.method1455(-3387);
                    var5[5] = var3.method1455(-3387);
                } else if (var4 == 4) {
                    int var8 = var3.method1445(-83);
                    class343.field5350 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class343.field5350[var9] = var3.method1455(-3387);
                        if (class343.field5350[var9] == 65535) {
                            class343.field5350[var9] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var6 = var3.method1445(arg1 + 16663);
                    class339.field5292 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class339.field5292[var7] = var3.method1455(-3387);
                        if (class339.field5292[var7] == 65535) {
                            class339.field5292[var7] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method514(int arg0) {
        field1059++;
        if (class452.field7013 == 2) {
            try {
                this.method493((byte) -115);
            } catch (Throwable var3) {
                class196.method1341(0, arg0 + 3112);
                class80.method575(var3, var3.getMessage() + " (Recovered) " + this.method495(-127), (byte) -109);
            }
        } else {
            this.method493((byte) -113);
        }
        if (arg0 != 3558) {
            field1056 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method515() {
        for (int var0 = 0; var0 < class135.field1839; var0++) {
            int[] var1 = class452.field7015[var0];
            for (int var2 = 0; var2 < class197.field3038; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field1053++;
        try {
            if (arg0.length != 6) {
                class57.method440(22693, "Argument count");
            }
            class310.field4862 = new class522();
            class310.field4862.field7722 = Integer.parseInt(arg0[0]);
            class407.field6152 = new class522();
            class407.field6152.field7722 = Integer.parseInt(arg0[1]);
            class540.field7899 = new class522();
            class540.field7899.field7722 = Integer.parseInt(arg0[2]);
            class209.field3228 = class77.field1152;
            if (arg0[3].equals("live")) {
                class464.field7130 = class6.field70;
            } else if (arg0[3].equals("rc")) {
                class464.field7130 = class206.field3149;
            } else if (arg0[3].equals("wip")) {
                class464.field7130 = class303.field4752;
            } else {
                class57.method440(22693, "modewhat");
            }
            class12.field131 = class58.method445(true, arg0[4]);
            if (class12.field131 == -1) {
                if (arg0[4].equals("english")) {
                    class12.field131 = 0;
                } else if (arg0[4].equals("german")) {
                    class12.field131 = 1;
                } else {
                    class57.method440(22693, "language");
                }
            }
            class416.field6313 = false;
            class304.field4778 = false;
            if (arg0[5].equals("game0")) {
                class516.field7674 = class153.field2042;
            } else if (arg0[5].equals("game1")) {
                class516.field7674 = class261.field4216;
            } else {
                class57.method440(22693, "game");
            }
            class293.field4625 = true;
            class198.field3050 = true;
            class447.field6946 = false;
            class328.field5158 = 0;
            class348.field5403 = 0;
            class77.field1153 = "";
            class293.field4626 = class516.field7674.field3873;
            client var1 = new client();
            class528.field7769 = var1;
            var1.method1098(768, class464.field7130.method1665(-1) + 32, 0, 600, false, 1024, class516.field7674.field3877, 30);
            class92.field1342.setLocation(40, 40);
        } catch (Exception var3) {
            class80.method575(var3, null, (byte) -75);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method516(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
