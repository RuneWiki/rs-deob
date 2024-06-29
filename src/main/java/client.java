import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
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
public class client extends class468 {

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field9616 = 64;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Llg;")
    public static class32 field9622 = new class32(8, 0, 4, 1);

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field9610;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field9612;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field9613;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field9617;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field9623;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field9624;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field9625;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field9628;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljava/lang/Class;")
    public static Class field9627;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method2603(byte arg0) {
        if (class124.field1737) {
            field9616 = 64;
        }
        field9626++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class302.method1777((byte) 76);
        class475.field6619 = new class399(class312.field4206);
        class567.field7725 = new class159();
        class239.method1482(false, new int[] { 1000, 100 }, new int[] { 20, 260 });
        if (class480.field6673 != class180.field2522) {
            class389.field5218 = new byte[50][];
        }
        class602.field8408 = new class642(class312.field4206);
        if (class480.field6673 == class180.field2522) {
            class625.field8660.field3772 = this.getCodeBase().getHost();
        } else if (class337.method1974(class480.field6673, true)) {
            class625.field8660.field3772 = this.getCodeBase().getHost();
            class625.field8660.field3773 = class625.field8660.field3769 + 40000;
            class324.field4369.field3773 = class324.field4369.field3769 + 40000;
            class625.field8660.field3764 = class625.field8660.field3769 + 50000;
            class450.field5948.field3773 = class450.field5948.field3769 + 40000;
            class324.field4369.field3764 = class324.field4369.field3769 + 50000;
            class450.field5948.field3764 = class450.field5948.field3769 + 50000;
        } else if (class675.field9604 == class480.field6673) {
            class625.field8660.field3772 = "127.0.0.1";
            class324.field4369.field3772 = "127.0.0.1";
            class450.field5948.field3772 = "127.0.0.1";
            class625.field8660.field3773 = class625.field8660.field3769 + 40000;
            class324.field4369.field3773 = class324.field4369.field3769 + 40000;
            class625.field8660.field3764 = class625.field8660.field3769 + 50000;
            class450.field5948.field3773 = class450.field5948.field3769 + 40000;
            class324.field4369.field3764 = class324.field4369.field3769 + 50000;
            class450.field5948.field3764 = class450.field5948.field3769 + 50000;
        }
        if (class678.field9636 == class508.field7015) {
            class64.field806 = class568.field7745;
            class482.field6723 = true;
            class129.field1801 = 0;
            class119.field1523 = class666.field9481;
            class381.field5038 = 16777215;
        } else {
            class119.field1523 = class72.field860;
            class64.field806 = class58.field741;
        }
        class540.field7409 = class625.field8660;
        class549.field7509 = class269.field3508 = class162.field2333 = class322.field4337 = new short[256];
        if (class510.field7101 == class508.field7015) {
            class162.field2327 = false;
        }
        try {
            class157.field2205 = class386.field5153.getToolkit().getSystemClipboard();
        } catch (Exception var5) {
        }
        class643.field8914 = class211.method1338(class583.field7996, -114);
        class409.field5387 = class381.method2184(true, false, class583.field7996);
        try {
            if (class312.field4206.field5195 != null) {
                class495.field6817 = new class131(class312.field4206.field5195, 5200, 0);
                for (int var3 = 0; var3 < 35; var3++) {
                    class688.field9718[var3] = new class131(class312.field4206.field5198[var3], 6000, 0);
                }
                class114.field1455 = new class131(class312.field4206.field5183, 6000, 0);
                class576.field7858 = new class485(255, class495.field6817, class114.field1455, 500000);
                class527.field7301 = new class131(class312.field4206.field5181, 24, 0);
                class312.field4206.field5181 = null;
                class312.field4206.field5195 = null;
                class312.field4206.field5183 = null;
                class312.field4206.field5198 = null;
            }
            int var4 = 44 % ((arg0 - 69) / 33);
        } catch (IOException var6) {
            class495.field6817 = null;
            class527.field7301 = null;
            class576.field7858 = null;
            class114.field1455 = null;
        }
        if (class480.field6673 != class180.field2522) {
            class559.field7627 = true;
        }
        if (class510.field7101 == class508.field7015) {
            class370.field4873 = class371.field4875.method2141(class422.field5539, true);
        } else if (class678.field9636 == class508.field7015) {
            class370.field4873 = class371.field4879.method2141(class422.field5539, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)Ljava/lang/String;")
    public final String method2606(int arg0) {
        field9621++;
        String var2 = null;
        try {
            var2 = "[1)" + class125.field1745 + "," + class4.field23 + "," + class703.field9886 + "," + class431.field5789 + "|";
            if (class408.field5369 != null) {
                var2 = var2 + "2)" + class298.field3942 + "," + (class408.field5369.field3088[0] + class125.field1745) + "," + (class408.field5369.field3086[0] + class4.field23) + "|";
            }
            var2 = var2 + "3)" + class618.field8566 + "|4)" + class602.field8408.field4325 + "|5)" + class702.method3945((byte) -128) + "|6)" + class399.field5301 + "," + class60.field750 + "|";
            var2 = var2 + "7)" + class602.field8408.method1868(class618.field8566, 1) + "|";
            var2 = var2 + "8)" + class602.field8408.method1870((byte) -124, class618.field8566) + "|";
            var2 = var2 + "9)" + class602.field8408.field4322 + "|";
            var2 = var2 + "10)" + class602.field8408.field4311 + "|";
            var2 = var2 + "11)" + class602.field8408.field4335 + "|";
            var2 = var2 + "12)" + class602.field8408.method3554(class618.field8566, (byte) -115) + "|";
            var2 = var2 + "13)" + field9616 + "|";
            var2 = var2 + "14)" + class576.field7861;
            if (arg0 != 0) {
                method3855(null);
            }
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class618.field8566 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field9627 == null ? (field9627 = method3864("client")) : field9627).getClassLoader());
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method3847(int arg0, int arg1) {
        int var3 = 115 / (arg0 / 42);
        class123.field1647 = null;
        class516.field7175 = 0;
        class192.field2656 = null;
        class567.field7725.field2308++;
        field9612++;
        class567.field7725.field2306 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method3848(byte arg0) {
        field9625++;
        if (arg0 <= 3) {
            return;
        }
        if (class422.field5535 < class567.field7725.field2308) {
            class540.field7409.method1694(5);
            class281.field3702 = (class567.field7725.field2308 * 50 - 50) * 5;
            if (class281.field3702 > 3000) {
                class281.field3702 = 3000;
            }
            if (class567.field7725.field2308 >= 2 && class567.field7725.field2306 == 6) {
                this.method2614("js5connect_outofdate", (byte) -20);
                class576.field7861 = 14;
                return;
            }
            if (class567.field7725.field2308 >= 4 && class567.field7725.field2306 == -1) {
                this.method2614("js5crc", (byte) -20);
                class576.field7861 = 14;
                return;
            }
            if (class567.field7725.field2308 >= 4 && class516.method2929((byte) -66, class576.field7861)) {
                if (class567.field7725.field2306 == 7 || class567.field7725.field2306 == 9) {
                    this.method2614("js5connect_full", (byte) -20);
                } else if (class567.field7725.field2306 <= 0) {
                    this.method2614("js5io", (byte) -20);
                } else if (class323.field4362 == null) {
                    this.method2614("js5connect", (byte) -20);
                } else {
                    this.method2614("js5proxy_" + class323.field4362.trim(), (byte) -20);
                }
                class576.field7861 = 14;
                return;
            }
        }
        class422.field5535 = class567.field7725.field2308;
        if (class281.field3702 > 0) {
            class281.field3702--;
            return;
        }
        try {
            if (class516.field7175 == 0) {
                class192.field2656 = class540.field7409.method1689(-10520, class312.field4206);
                class516.field7175++;
            }
            if (class516.field7175 == 1) {
                if (class192.field2656.field9420 == 2) {
                    if (class192.field2656.field9421 != null) {
                        class323.field4362 = (String) class192.field2656.field9421;
                    }
                    this.method3847(106, 1000);
                    return;
                }
                if (class192.field2656.field9420 == 1) {
                    class516.field7175++;
                }
            }
            if (class516.field7175 == 2) {
                class123.field1647 = new class284((Socket) class192.field2656.field9421, class312.field4206);
                class157 var2 = new class157(5);
                var2.method915(-31914, class624.field8644.field799);
                var2.method958(0, 619);
                class123.field1647.method1687(5, 125, var2.field2199, 0);
                class516.field7175++;
                class485.field6739 = class529.method2982((byte) -69);
            }
            if (class516.field7175 == 3) {
                if (class516.method2929((byte) -66, class576.field7861) || class123.field1647.method1683(-31136) > 0) {
                    int var3 = class123.field1647.method1686(-1912);
                    if (var3 != 0) {
                        this.method3847(61, var3);
                        return;
                    }
                    class516.field7175++;
                } else if (class529.method2982((byte) -69) - class485.field6739 > 30000L) {
                    this.method3847(-101, 1001);
                    return;
                }
            }
            if (class516.field7175 == 4) {
                boolean var4 = class516.method2929((byte) -66, class576.field7861) || class594.method3301((byte) 33, class576.field7861) || class367.method2128(65280, class576.field7861);
                class293[] var5 = class293.method1739(-1);
                class157 var6 = new class157(var5.length * 4);
                class123.field1647.method1688(0, 0, var6.field2199, var6.field2199.length);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method1737(var6.method908(false), 10240);
                }
                class567.field7725.method985(!var4, class123.field1647, false);
                class516.field7175 = 0;
                class123.field1647 = null;
                class192.field2656 = null;
            }
        } catch (IOException var8) {
            this.method3847(-105, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method3849(int arg0) {
        field9615++;
        if (class576.field7861 == 14) {
            return;
        }
        if (arg0 != -12269) {
            field9616 = 106;
        }
        long var2 = class693.method3910(0) / 1000000L - class87.field1064;
        class87.field1064 = class693.method3910(0) / 1000000L;
        boolean var4 = class653.method3693(0);
        if (var4 && class33.field460 && class546.field7467 != null) {
            class546.field7467.method3092(118);
        }
        if (class659.method3770(arg0 ^ 0xFFFFD06C, class576.field7861)) {
            if (class199.field2702 != 0L && class199.field2702 < class529.method2982((byte) -69)) {
                class152.method892(class702.method3945((byte) -109), false, class602.field8408.field4299, class602.field8408.field4346, arg0 ^ 0xFFFFD010);
            } else if (!class146.field1963.method1112() && class58.field737) {
                class25.method145(arg0 + 12269);
            }
        }
        if (class529.field7314 == null) {
            Container var5;
            if (class190.field2630 != null) {
                var5 = class190.field2630;
            } else if (class516.field7178 == null) {
                var5 = class27.field400;
            } else {
                var5 = class516.field7178;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class190.field2630 == var5) {
                Insets var8 = class190.field2630.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class455.field5994 != var6 || class246.field3213 != var7 || class55.field725) {
                if (class146.field1963 == null || class146.field1963.method1069()) {
                    class302.method1777((byte) 88);
                } else {
                    class455.field5994 = var6;
                    class246.field3213 = var7;
                }
                class199.field2702 = class529.method2982((byte) -69) + 500L;
                class55.field725 = false;
            }
        }
        if (class529.field7314 != null && !class327.field4400 && class659.method3770(95, class576.field7861)) {
            class152.method892(class602.field8408.field4313, false, -1, -1, 3);
        }
        boolean var9 = false;
        if (class340.field4575) {
            class340.field4575 = false;
            var9 = true;
        }
        if (var9) {
            class314.method1837((byte) 62);
        }
        if (class146.field1963 != null && class146.field1963.method1112() || class702.method3945((byte) -128) != 1) {
            class398.method2275(-1);
        }
        if (class516.method2929((byte) -66, class576.field7861)) {
            class164.method1007(false, var9);
        } else if (class58.method336(6, class576.field7861)) {
            class641.method3550((byte) -125);
        } else if (class543.method3045(arg0 ^ 0x1AB0, class576.field7861)) {
            class641.method3550((byte) -125);
        } else if (class688.method3889(-127, class576.field7861)) {
            if (class117.field1491 == 1) {
                if (class628.field8705 < class46.field560) {
                    class628.field8705 = class46.field560;
                }
                int var11 = (class628.field8705 - class46.field560) * 50 / class628.field8705;
                class591.method3268(class325.field4382, class146.field1963, true, class371.field4891.method2141(class422.field5539, true) + "<br>(" + var11 + "%)", class401.field5319, false);
            } else if (class117.field1491 == 2) {
                if (class680.field9655 < class623.field8632) {
                    class680.field9655 = class623.field8632;
                }
                int var10 = (class680.field9655 - class623.field8632) * 50 / class680.field9655 + 50;
                class591.method3268(class325.field4382, class146.field1963, true, class371.field4891.method2141(class422.field5539, true) + "<br>(" + var10 + "%)", class401.field5319, false);
            } else {
                class591.method3268(class325.field4382, class146.field1963, true, class371.field4891.method2141(class422.field5539, true), class401.field5319, false);
            }
        } else if (class576.field7861 == 10) {
            class146.method832(-48, var2);
        } else if (class576.field7861 == 13) {
            class591.method3268(class325.field4382, class146.field1963, false, class371.field4893.method2141(class422.field5539, true) + "<br>" + class371.field4894.method2141(class422.field5539, true), class401.field5319, false);
        }
        if (class220.field2869 == 3) {
            for (int var12 = 0; var12 < class629.field8707; var12++) {
                Rectangle var13 = class680.field9648[var12];
                if (class14.field174[var12]) {
                    class146.field1963.method3118(true, var13.height, var13.x, var13.y, var13.width, -1996553985);
                } else if (class13.field166[var12]) {
                    class146.field1963.method3118(true, var13.height, var13.x, var13.y, var13.width, -1996554240);
                }
            }
        }
        if (class144.method823(-1924733010)) {
            class94.method537(class146.field1963, (byte) -18);
        }
        if (class312.field4206.field5192 && class659.method3770(118, class576.field7861) && class220.field2869 == 0 && class702.method3945((byte) -106) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class629.field8707; var15++) {
                if (class13.field166[var15]) {
                    class13.field166[var15] = false;
                    class110.field1300[var14++] = class680.field9648[var15];
                }
            }
            try {
                class146.field1963.method1056(class110.field1300, var14);
            } catch (class56 var19) {
            }
        } else if (!class516.method2929((byte) -66, class576.field7861)) {
            for (int var16 = 0; var16 < class629.field8707; var16++) {
                class13.field166[var16] = false;
            }
            try {
                class146.field1963.method1151();
            } catch (class56 var18) {
                class91.method499(var18.getMessage() + " (Recovered) " + this.method2606(0), var18, (byte) 120);
                class174.method1190(arg0 ^ 0xFFFFD013, 0);
            }
        }
        if (class602.field8408.field4338 == 0) {
            class588.method3253(0, 15L);
        } else if (class602.field8408.field4338 == 1) {
            class588.method3253(0, 10L);
        } else if (class602.field8408.field4338 == 2) {
            class588.method3253(arg0 ^ 0xFFFFD013, 5L);
        } else if (class602.field8408.field4338 == 3) {
            class588.method3253(0, 2L);
        }
        if (class491.field6789) {
            class387.method2218(arg0 + 12915);
        }
        if (class602.field8408.field4309 && class576.field7861 == 3 && class164.field2349 != -1) {
            class602.field8408.field4309 = false;
            class602.field8408.method3557(class312.field4206, -2);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method2613(int arg0) {
        field9614++;
        if (arg0 != 7969) {
            field9622 = null;
        }
        if (class618.field8566 != 2) {
            this.method3849(-12269);
            return;
        }
        try {
            this.method3849(-12269);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class91.method499(var5.getMessage() + " (Recovered) " + this.method2606(0), var5, (byte) 120);
            class174.method1190(arg0 ^ 0x1F21, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static void method3850(int arg0) {
        int var1 = 124 / ((66 - arg0) / 59);
        field9622 = null;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method3851(int arg0) {
        int var1 = class426.field5750;
        int[] var2 = class586.field8104;
        for (int var3 = 0; var3 < class289.field3820 + var1; var3++) {
            class231 var4;
            if (var3 < var1) {
                var4 = class513.field7145[var2[var3]];
            } else {
                var4 = ((class407) class296.field3921.method3057(1, (long) class389.field5220[var3 - var1])).field5354;
            }
            if (var4.field385 == arg0 && var4.field3031 >= 0) {
                int var5 = var4.method1435((byte) 66);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field398 & 0x1FF) != 0 || (var4.field397 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field398 & 0x1FF) != 256 || (var4.field397 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field398 >> 9;
                    int var7 = var4.field397 >> 9;
                    if (var4.field3031 > class59.field744[var6][var7]) {
                        class59.field744[var6][var7] = var4.field3031;
                        class8.field68[var6][var7] = 1;
                    } else if (class59.field744[var6][var7] == var4.field3031) {
                        var10002 = class8.field68[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field398 - var8 >> 9;
                    int var10 = var4.field397 - var8 >> 9;
                    int var11 = var4.field398 + var8 >> 9;
                    int var12 = var4.field397 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field3031 > class59.field744[var13][var14]) {
                                class59.field744[var13][var14] = var4.field3031;
                                class8.field68[var13][var14] = 1;
                            } else if (class59.field744[var13][var14] == var4.field3031) {
                                var10002 = class8.field68[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method3852() {
        int var0 = class426.field5750;
        int[] var1 = class586.field8104;
        boolean var2 = class602.field8408.field4333 == 1 && var0 > 200 || class602.field8408.field4333 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class573 var13 = class513.field7145[var1[var3]];
            if (var13.method3163(0)) {
                var13.method186(13035);
                if (var13.field423 >= 0 && var13.field419 >= 0 && var13.field420 < class703.field9886 && var13.field421 < class431.field5789) {
                    var13.field7832 = var13.field3021 ? var2 : false;
                    if (class408.field5369 == var13) {
                        var13.field3031 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field3042) {
                            var14++;
                        }
                        if (var13.field3032 > class327.field4404) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method1435((byte) 113) << 2);
                        if (var13.field7818) {
                            var15 += 512;
                        } else {
                            if (class324.field4366 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field3031 = var15 + 1;
                    }
                } else {
                    var13.field3031 = -1;
                }
            } else {
                var13.field3031 = -1;
            }
        }
        for (int var4 = 0; var4 < class289.field3820; var4++) {
            class351 var10 = ((class407) class296.field3921.method3057(1, (long) class389.field5220[var4])).field5354;
            if (var10.method2077(0) && var10.field4671.method2201(30332, class564.field7696)) {
                var10.method186(13035);
                if (var10.field423 >= 0 && var10.field419 >= 0 && var10.field420 < class703.field9886 && var10.field421 < class431.field5789) {
                    int var11 = 0;
                    if (!var10.field3042) {
                        var11++;
                    }
                    if (var10.field3032 > class327.field4404) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method1435((byte) 84) << 2);
                    if (class324.field4366 == 0) {
                        if (var10.field4671.field5117) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class324.field4366 == 1) {
                        if (var10.field4671.field5117) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field4671.field5111) {
                        var12 += 1024;
                    } else if (!var10.field4671.field5132) {
                        var12 += 256;
                    }
                    var10.field3031 = var12 + 1;
                } else {
                    var10.field3031 = -1;
                }
            } else {
                var10.field3031 = -1;
            }
        }
        for (int var5 = 0; var5 < class121.field1575.length; var5++) {
            class669 var6 = class121.field1575[var5];
            if (var6 != null) {
                if (var6.field9508 == 1) {
                    class407 var7 = (class407) class296.field3921.method3057(1, (long) var6.field9513);
                    if (var7 != null) {
                        class351 var8 = var7.field5354;
                        if (var8.field3031 >= 0) {
                            var8.field3031 += 2048;
                        }
                    }
                } else if (var6.field9508 == 10) {
                    class573 var9 = class513.field7145[var6.field9513];
                    if (var9 != null && class408.field5369 != var9 && var9.field3031 >= 0) {
                        var9.field3031 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method3853() {
        int var0 = class426.field5750;
        int[] var1 = class586.field8104;
        int var2 = class248.field3218 ? var0 : class289.field3820 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class231 var4;
            if (var3 < var0) {
                var4 = class513.field7145[var1[var3]];
            } else {
                var4 = ((class407) class296.field3921.method3057(1, (long) class389.field5220[var3 - var0])).field5354;
            }
            if (var4.field3031 >= 0) {
                int var5 = var4.method1435((byte) 79);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field398 & 0x1FF) == 0 && (var4.field397 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field398 & 0x1FF) == 256 && (var4.field397 & 0x1FF) == 256) {
                    continue;
                }
                var4.field388 = class180.method1211(var4.field385, true, var4.field398, var4.field397);
                class616.method3409(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method3854(int arg0) {
        field9624++;
        if (class576.field7861 == 14) {
            return;
        }
        class327.field4404++;
        if (class327.field4404 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class693.field9763 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class473.field6592.setSeed((long) class693.field9763);
        }
        if (class327.field4404 % 50 == 0) {
            class648.field8950 = class337.field4545;
            class337.field4545 = 0;
            class100.field1205 = class73.field867;
            class73.field867 = 0;
        }
        this.method3859((byte) 0);
        if (class157.field2202 != null) {
            class157.field2202.method1794((byte) 5);
        }
        if (arg0 != 600) {
            field9622 = null;
        }
        class499.method2832(-1);
        class643.field8914.method2110(-126);
        class409.field5387.method1888(arg0 ^ 0xFFFFFDCD);
        if (class146.field1963 != null) {
            class146.field1963.method1063((int) class529.method2982((byte) -69));
        }
        class417.method2363(true);
        class270.field3531 = 0;
        class24.field290 = 0;
        for (class477 var3 = class643.field8914.method2111((byte) 116); var3 != null; var3 = class643.field8914.method2111((byte) 114)) {
            int var6 = var3.method2747(false);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2750(false);
                if (class326.method1899((byte) 65) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class144.method823(-1924733010)) {
                        class218.method1379((byte) 122);
                    } else {
                        class538.method3028((byte) 114);
                    }
                } else if (class270.field3531 < 128) {
                    class96.field1162[class270.field3531] = var3;
                    class270.field3531++;
                }
            } else if (var6 == 0 && class24.field290 < 75) {
                class266.field3461[class24.field290] = var3;
                class24.field290++;
            }
        }
        class427.field5753 = 0;
        for (class294 var4 = class409.field5387.method1886(true); var4 != null; var4 = class409.field5387.method1886(true)) {
            int var5 = var4.method452(false);
            if (var5 == -1) {
                class469.field6296.method2507(var4, (byte) -122);
            } else if (var5 == 6) {
                class427.field5753 += var4.method450(true);
            } else if (class240.method1488(var5, false)) {
                class58.field743.method2507(var4, (byte) -127);
                if (class58.field743.method2503(-83) > 10) {
                    class58.field743.method2502((byte) -94);
                }
            }
        }
        if (class144.method823(-1924733010)) {
            class154.method898((byte) -110);
        }
        if (class516.method2929((byte) -66, class576.field7861)) {
            class545.method3048(-115);
            class49.method259(-47);
        } else if (class688.method3889(88, class576.field7861)) {
            class632.method3508((byte) 57);
        }
        if (class594.method3301((byte) 33, class576.field7861) && !class688.method3889(6, class576.field7861)) {
            this.method3862((byte) -58);
            class431.method2428(2000);
            class451.method2534(-10401);
        } else if (class367.method2128(arg0 ^ 0xFD58, class576.field7861) && !class688.method3889(arg0 - 508, class576.field7861)) {
            this.method3862((byte) -58);
            class451.method2534(arg0 - 11001);
        } else if (class576.field7861 == 12) {
            class451.method2534(arg0 - 11001);
        } else if (class96.method543(arg0 - 13356, class576.field7861) && !class688.method3889(arg0 - 484, class576.field7861)) {
            class24.method140((byte) -101);
        } else if (class576.field7861 == 13) {
            class451.method2534(-10401);
            if (class567.field7721 != -3 && class567.field7721 != 2 && class567.field7721 != 15) {
                class669.method3801((byte) 110, false);
            }
        }
        class89.method488(class146.field1963, -89);
        class58.field743.method2502((byte) -113);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class583.method3219("Argument count", 0);
            }
            class625.field8660 = new class285();
            class625.field8660.field3769 = Integer.parseInt(arg0[0]);
            class324.field4369 = new class285();
            class324.field4369.field3769 = Integer.parseInt(arg0[1]);
            class450.field5948 = new class285();
            class450.field5948.field3769 = Integer.parseInt(arg0[2]);
            class480.field6673 = class675.field9604;
            if (arg0[3].equals("live")) {
                class234.field3113 = class616.field8531;
            } else if (arg0[3].equals("rc")) {
                class234.field3113 = class267.field3494;
            } else if (arg0[3].equals("wip")) {
                class234.field3113 = class386.field5152;
            } else {
                class583.method3219("modewhat", 0);
            }
            class422.field5539 = class670.method3806(arg0[4], 0);
            if (class422.field5539 == -1) {
                if (arg0[4].equals("english")) {
                    class422.field5539 = 0;
                } else if (arg0[4].equals("german")) {
                    class422.field5539 = 1;
                } else {
                    class583.method3219("language", 0);
                }
            }
            class120.field1546 = false;
            class480.field6682 = false;
            if (arg0[5].equals("game0")) {
                class508.field7015 = class510.field7101;
            } else if (arg0[5].equals("game1")) {
                class508.field7015 = class678.field9636;
            } else {
                class583.method3219("game", 0);
            }
            class358.field4759 = true;
            class545.field7450 = true;
            class124.field1737 = false;
            class671.field9545 = 0;
            class200.field2710 = null;
            class482.field6705 = class508.field7015.field8976;
            class291.field3850 = "";
            class523.field7236 = false;
            class478.field6658 = 0L;
            class693.field9779 = 0;
            class190.field2640 = 0;
            class14.field183 = null;
            client var1 = new client();
            class386.field5153 = var1;
            var1.method2620(619, 1024, (byte) 58, 35, class508.field7015.field8978, false, class234.field3113.method2164((byte) -65) + 32, 768);
            class190.field2630.setLocation(40, 40);
        } catch (Exception var3) {
            class91.method499(null, var3, (byte) 121);
        }
        field9620++;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field9610++;
        if (!this.method2602(-1)) {
            return;
        }
        class625.field8660 = new class285();
        class625.field8660.field3769 = Integer.parseInt(this.getParameter("worldid"));
        class324.field4369 = new class285();
        class324.field4369.field3769 = Integer.parseInt(this.getParameter("lobbyid"));
        class324.field4369.field3772 = this.getParameter("lobbyaddress");
        class450.field5948 = new class285();
        class450.field5948.field3769 = Integer.parseInt(this.getParameter("demoid"));
        class450.field5948.field3772 = this.getParameter("demoaddress");
        class480.field6673 = class538.method3029(-84, Integer.parseInt(this.getParameter("modewhere")));
        if (class675.field9604 == class480.field6673) {
            class480.field6673 = class85.field1021;
        } else if (!class337.method1974(class480.field6673, true) && class480.field6673 != class180.field2522) {
            class480.field6673 = class180.field2522;
        }
        class234.field3113 = class162.method998(Integer.parseInt(this.getParameter("modewhat")), 0);
        if (class386.field5152 != class234.field3113 && class267.field3494 != class234.field3113 && class616.field8531 != class234.field3113) {
            class234.field3113 = class616.field8531;
        }
        try {
            class422.field5539 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class422.field5539 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class120.field1546 = true;
        } else {
            class120.field1546 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class480.field6682 = true;
        } else {
            class480.field6682 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class252.field3312 = true;
        } else {
            class252.field3312 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class508.field7015 = class510.field7101;
            } else if (var4.equals("1")) {
                class508.field7015 = class678.field9636;
            }
        }
        try {
            class190.field2640 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class190.field2640 = 0;
        }
        class516.field7171 = this.getParameter("quiturl");
        class291.field3850 = this.getParameter("settings");
        if (class291.field3850 == null) {
            class291.field3850 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class671.field9545 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class671.field9545 = 0;
            }
        }
        class482.field6705 = Integer.parseInt(this.getParameter("colourid"));
        if (class482.field6705 < 0 || class482.field6705 >= class390.field5226.length) {
            class482.field6705 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class358.field4759 = true;
            class545.field7450 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class523.field7236 = true;
        }
        class14.field183 = this.getParameter("sskey");
        if (class14.field183 != null && class14.field183.length() < 2) {
            class14.field183 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class124.field1737 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class693.field9779 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class478.field6658 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class200.field2710 = this.getParameter("additionalInfo");
        if (class200.field2710 != null && class200.field2710.length() > 50) {
            class200.field2710 = null;
        }
        class386.field5153 = this;
        if (class510.field7101 == class508.field7015) {
            class666.field9479 = 765;
            class399.field5293 = 503;
        } else if (class678.field9636 == class508.field7015) {
            class666.field9479 = 640;
            class399.field5293 = 480;
        }
        this.method2608(class234.field3113.method2164((byte) -78) + 32, (byte) -79, 619, class399.field5293, class508.field7015.field8978, class666.field9479, 35);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final synchronized void method2610(int arg0) {
        field9613++;
        if (class516.field7178 != null && class583.field7996 == null && !class312.field4206.field5192) {
            try {
                Class var2 = class516.field7178.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class583.field7996 = (Canvas) var3.get(class516.field7178);
                var3.set(class516.field7178, null);
                if (class583.field7996 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method2610((char) arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwv;)Z")
    public static final boolean method3855(class423 arg0) {
        if (class452.field5967) {
            if (method3858(arg0).field48 != 0) {
                return false;
            }
            if (arg0.field5598 == 0) {
                return false;
            }
        }
        return arg0.field5681;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method3856() {
        class471.field6568 = 0;
        for (int var0 = 0; var0 < class289.field3820; var0++) {
            class351 var1 = ((class407) class296.field3921.method3057(1, (long) class389.field5220[var0])).field5354;
            if (var1.field3042 && var1.method1436((byte) 87) != -1) {
                int var2 = (var1.method1435((byte) 75) - 1) * 256 + 252;
                int var3 = var1.field398 - var2 >> 9;
                int var4 = var1.field397 - var2 >> 9;
                class231 var5 = class419.method2369(var3, var1.field385, (byte) -121, var4);
                if (var5 != null) {
                    int var6 = var5.field3010;
                    if (var5 instanceof class351) {
                        var6 += 2048;
                    }
                    if (var5.field3041 == 0 && var5.method1436((byte) -57) != -1) {
                        class377.field4991[class471.field6568] = var6;
                        class457.field6005[class471.field6568] = var6;
                        class471.field6568++;
                        var5.field3041++;
                    }
                    class377.field4991[class471.field6568] = var6;
                    class457.field6005[class471.field6568] = var1.field3010 + 2048;
                    class471.field6568++;
                    var5.field3041++;
                }
            }
        }
        class308.method1815(class377.field4991, 0, (byte) 31, class471.field6568 - 1, class457.field6005);
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static final void method3857(int arg0) {
        int var1 = class426.field5750;
        int[] var2 = class586.field8104;
        int var3 = class248.field3218 ? var1 : class289.field3820 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class231 var5;
            if (var4 < var1) {
                var5 = class513.field7145[var2[var4]];
            } else {
                var5 = ((class407) class296.field3921.method3057(1, (long) class389.field5220[var4 - var1])).field5354;
            }
            if (var5.field385 == arg0) {
                var5.field3041 = 0;
                if (var5.field3031 < 0) {
                    var5.field3042 = false;
                } else {
                    int var6 = var5.method1435((byte) 110);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field398 & 0x1FF) != 0 || (var5.field397 & 0x1FF) != 0) {
                            var5.field3042 = false;
                            continue;
                        }
                    } else if ((var5.field398 & 0x1FF) != 256 || (var5.field397 & 0x1FF) != 256) {
                        var5.field3042 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field398 >> 9;
                        int var8 = var5.field397 >> 9;
                        if (class59.field744[var7][var8] != var5.field3031) {
                            var5.field3042 = true;
                            continue;
                        }
                        if (class8.field68[var7][var8] > 1) {
                            var10002 = class8.field68[var7][var8]--;
                            var5.field3042 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field398 - var9 >> 9;
                        int var11 = var5.field397 - var9 >> 9;
                        int var12 = var5.field398 + var9 >> 9;
                        int var13 = var5.field397 + var9 >> 9;
                        if (!class182.method1214(var13, var10, var11, var12, var5.field3031, (byte) -125)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class59.field744[var14][var15] == var5.field3031) {
                                        var10002 = class8.field68[var14][var15]--;
                                    }
                                }
                            }
                            var5.field3042 = true;
                            continue;
                        }
                    }
                    var5.field3042 = false;
                    var5.field388 = class180.method1211(var5.field385, true, var5.field398, var5.field397);
                    class616.method3409(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method2616(int arg0) {
        method3850(125);
        field9619++;
        class253.method1535(arg0 - 11164);
        class579.method3195((byte) 38);
        class256.method1545((byte) -105);
        class371.method2140(-3808);
        class360.method2108((byte) -61);
        class325.method1892((byte) -38);
        class340.method1986(61);
        class293.method1732(false);
        class64.method371(arg0 ^ 0x51);
        class85.method459(arg0 ^ 0x5F62);
        class339.method1980(arg0 ^ 0x4A);
        class150.method882((byte) -54);
        class546.method3059((byte) -113);
        class468.method2605((byte) 53);
        class361.method2112((byte) 90);
        class562.method3119(-93);
        class642.method3565((byte) 53);
        class14.method88((byte) -8);
        class445.method2509(true);
        class284.method1680(-22575);
        class159.method988((byte) 109);
        class399.method2286(29722);
        class306.method1792((byte) 72);
        class643.method3584(-3);
        class332.method1934((byte) 100);
        class485.method2789((byte) 68);
        class380.method2170(false);
        class647.method3597((byte) -11);
        class431.method2431(true);
        class368.method2133(false);
        class202.method1293((byte) -75);
        class692.method3904(2);
        class391.method2256(0);
        class3.method18((byte) 77);
        class695.method3927(arg0 ^ 0x51);
        class377.method2156(128);
        class166.method1018(96);
        class91.method496(-2);
        class622.method3461(true);
        class481.method2771(true);
        class288.method1705(-26938);
        class234.method1446((byte) 77);
        class519.method2947(-6632);
        class104.method579((byte) -121);
        class410.method2334((byte) -114);
        class657.method3755((byte) -79);
        class479.method2757(arg0 - 75);
        class448.method2523((byte) -97);
        class378.method2161(121);
        class407.method2309(4983);
        class576.method3179(106);
        class603.method3357(0);
        class537.method3013(-1);
        class550.method3078((byte) 116);
        class499.method2836(1);
        class292.method1729((byte) -91);
        class235.method1460(110);
        class289.method1718(30);
        class592.method3276((byte) -96);
        class586.method3243(1);
        class204.method1302(-1);
        class423.method2390(1);
        class573.method3165(-127);
        class408.method2315((byte) 15);
        class346.method2061(false);
        class174.method1192(113);
        class157.method934((byte) -107);
        class229.method1420(-100);
        class231.method1434(80);
        class207.method1316(false);
        class259.method1566(-11803);
        class685.method3880(256);
        class351.method2072((byte) -102);
        class137.method779(7396);
        class5.method36((byte) -51);
        class99.method563((byte) 68);
        class68.method379(-1875);
        class369.method2138((byte) 66);
        class246.method1502((byte) 1);
        class631.method3502(6);
        class134.method778(-1);
        class701.method3939(false);
        class529.method2983((byte) 53);
        class426.method2415((byte) 24);
        class172.method1167((byte) 76);
        class654.method3696(73);
        class285.method1693(119);
        class614.method3396((byte) -24);
        class457.method2571(false);
        class82.method434((byte) -55);
        class154.method899(-1);
        class322.method1872(17305);
        class321.method1856(-128);
        class493.method2811((byte) 106);
        class186.method1226(arg0 ^ 0xFFFFFFAE);
        class405.method2308(32);
        class213.method1348((byte) -111);
        class34.method202(-111);
        class513.method2903(false);
        class50.method267(-10463);
        class600.method3320((byte) -110);
        class270.method1610((byte) -124);
        class384.method2204((byte) -38);
        class584.method3232(-29491);
        class409.method2326(arg0 - 82);
        class611.method3385((byte) 104);
        class102.method570(-467036338);
        class56.method329(0);
        class596.method3308(102);
        if (arg0 != 81) {
            return;
        }
        class658.method3763((byte) -126);
        class144.method826((byte) 119);
        class392.method2262((byte) 88);
        class81.method432((byte) 90);
        class51.method306(-32748);
        class552.method3083((byte) 105);
        class112.method662((byte) -123);
        class480.method2763(-1);
        class424.method2405(262144);
        class59.method338((byte) 107);
        class696.method3931(14);
        class383.method2192(-7);
        class429.method2426(arg0 - 79);
        class58.method337((byte) 24);
        class635.method3516(-126);
        class595.method3302((byte) -124);
        class57.method335((byte) -121);
        class460.method2575((byte) 74);
        class585.method3242(true);
        class220.method1386(-10990);
        class252.method1531(-101);
        class582.method3214((byte) -60);
        class494.method2821((byte) -128);
        class548.method3072((byte) 72);
        class672.method3821();
        class504.method2866(1);
        class610.method3382((byte) 91);
        class436.method2468((byte) 38);
        class400.method2293((byte) 118);
        class79.method427(27);
        class566.method3138(-107);
        class286.method1698(0);
        class29.method187(false);
        class27.method172(-1);
        class329.method1914((byte) 21);
        class475.method2738(2);
        class649.method3606((byte) 86);
        class514.method2917();
        class266.method1589((byte) 55);
        class699.method3936(-117);
        class121.method715((byte) 34);
        class615.method3404(-28678);
        class163.method1002(18447);
        class587.method3252((byte) 110);
        class656.method3751();
        class624.method3469((byte) -126);
        class110.method595(false);
        class218.method1382((byte) 110);
        class694.method3914(false);
        class437.method2472();
        class83.method444(arg0 - 197);
        class63.method369(15423);
        class67.method378(50);
        class358.method2104((byte) -77);
        class52.method308(arg0 ^ 0x2F);
        class274.method1649((byte) 114);
        class192.method1261(arg0 ^ 0xC);
        class484.method2783(0);
        class138.method782((byte) -71);
        class628.method3481(14411);
        class602.method3350((byte) -117);
        class271.method1614(arg0 - 79);
        class98.method556(-1713569622);
        class190.method1249(arg0 - 79);
        class634.method3512((byte) 123);
        class117.method685(0);
        class238.method1473();
        class140.method789((byte) 120);
        class118.method688((byte) 113);
        class254.method1536(false);
        class108.method590(123);
        class578.method3193();
        class338.method1977((byte) 110);
        class382.method2190((byte) 6);
        class389.method2242((byte) 1);
        class521.method2953((byte) 60);
        class60.method340(-90);
        class16.method104((byte) -105);
        class41.method226((byte) 125);
        class502.method2851(-3);
        class577.method3184();
        class390.method2254(true);
        class228.method1416((byte) 103);
        class678.method3868(false);
        class425.method2407(-112);
        class471.method2724(-49);
        class76.method418(false);
        class55.method319((byte) -3);
        class119.method697(13614);
        class53.method309(-22790);
        class230.method1426(-100);
        class568.method3148((byte) 110);
        class541.method3038(125);
        class623.method3467(0);
        class153.method895((byte) 52);
        class632.method3505((byte) 15);
        class240.method1487(-128);
        class223.method1392(arg0 - 172);
        class30.method189(true);
        class402.method2300((byte) -105);
        class196.method1275(arg0 ^ 0x50);
        class279.method1665(arg0 ^ 0x50);
        class65.method373(false);
        class267.method1597(75);
        class609.method3378(-123);
        class122.method721(-1);
        class601.method3345(-100);
        class523.method2969(-1);
        class33.method199((byte) 49);
        class543.method3046(-117);
        class362.method2118((byte) 107);
        class307.method1804(60);
        class32.method196(arg0 ^ 0xFFFFFFDD);
        class520.method2950(5753);
        class473.method2729((byte) 53);
        class370.method2139(2048);
        class11.method70(86);
        class681.method3875(111);
        class660.method3774(arg0 ^ 0x51);
        class417.method2362(-676);
        class71.method393(0);
        class461.method2579(arg0 ^ 0xFFFFFEE3);
        class141.method793((byte) -121);
        class679.method3870((byte) -115);
        class547.method3066(arg0 - 81);
        class677.method3866((byte) -102);
        class226.method1409((byte) 102);
        class257.method1552(108);
        class77.method423(50);
        class540.method3031((byte) -83);
        class302.method1778(arg0 ^ 0x51);
        class421.method2374(-15190);
        class703.method3948(1);
        class420.method2372(arg0 - 692);
        class574.method3174(0);
        class86.method472(0);
        class126.method746(true);
        class662.method3777(false);
        class440.method2479(arg0 ^ 0x54);
        class466.method2599(false);
        class291.method1724(-99);
        class152.method893(arg0 ^ 0xFFFFBB58);
        class315.method1843(-119);
        class364.method2124(1);
        class663.method3783(1);
        class347.method2065(66);
        class398.method2277(arg0 ^ 0x4ECC);
        class328.method1909(arg0 ^ 0x90D);
        class331.method1924();
        class309.method1822(2);
        class664.method3785(-17004);
        class6.method41(7);
        class336.method1973((byte) 126);
        class171.method1166(19213);
        class465.method2591(arg0 - 11051);
        class120.method708(1);
        class617.method3414(27166);
        class535.method3005(98);
        class583.method3217((byte) 13);
        class37.method208((byte) -125);
        class419.method2370(arg0 - 80);
        class394.method2269(109);
        class665.method3792(-1);
        class463.method2588((byte) 79);
        class323.method1879(113);
        class506.method2880((byte) 92);
        class167.method1036();
        class147.method839((byte) 100);
        class304.method1786();
        class268.method1599();
        class17.method106((byte) 36);
        class179.method1204(true);
        class539.method3030();
        class94.method535((byte) 75);
        class335.method1970(5442);
        class544.method3047(false);
        class28.method181(1);
        class542.method3041((byte) -23);
        class374.method2147(-3498);
        class411.method2335(false);
        class66.method375(0);
        class495.method2823(-113);
        class73.method399(-22928);
        class689.method3895(true);
        class113.method667(false);
        class524.method2975(-29348);
        class512.method2900(-40);
        class454.method2553(1);
        class316.method1846(9);
        class344.method2053(true);
        class44.method233();
        class25.method147(false);
        class269.method1606(3);
        class588.method3255(10);
        class545.method3050((byte) -76);
        class618.method3419(-1);
        class311.method1831((byte) 86);
        class151.method890(0);
        class509.method2889(28102);
        class89.method484((byte) -20);
        class114.method674(0);
        class414.method2342(25311);
        class164.method1008((byte) -58);
        class492.method2809(true);
        class365.method2127((byte) -31);
        class319.method1850(8);
        class156.method904(true);
        class251.method1528(-127);
        class297.method1748(11442);
        class197.method1279(985094500);
        class225.method1407(-3);
        class348.method2066(25923);
        class557.method3100((byte) 116);
        class26.method157(-103);
        class469.method2641(9054);
        class572.method3158((byte) 79);
        class12.method72(15535);
        class598.method3316((byte) 70);
        class62.method347(-13139);
        class630.method3490(-115);
        class162.method996(arg0 ^ 0x120A80C9);
        class560.method3104(74);
        class262.method1572((byte) -120);
        class441.method2494((byte) -43);
        class326.method1902(104);
        class8.method45(true);
        class111.method608((byte) -107);
        class199.method1282(44);
        class210.method1333(true);
        class327.method1906(arg0 + 32912);
        class651.method3673(-27846);
        class255.method1540(arg0 + 13098);
        class404.method2305(2);
        class96.method542((byte) -79);
        class149.method872((byte) -82);
        class549.method3074(103);
        class666.method3794(true);
        class10.method57(-23957);
        class698.method3933(true);
        class680.method3874(true);
        class109.method594(arg0 ^ 0x53);
        class123.method737(127);
        class452.method2543(false);
        class116.method679(arg0 ^ 0x51);
        class276.method1655((byte) 37);
        class636.method3523(arg0 ^ 0x50);
        class498.method2827(255);
        class510.method2894(arg0 ^ 0xFFFFFFED);
        class534.method2997((byte) 28);
        class194.method1270();
        class95.method539(99);
        class559.method3102(true);
        class591.method3267((byte) -94);
        class24.method141(2);
        class567.method3143(-55);
        class87.method478(true);
        class298.method1752(false);
        class687.method3888((byte) -123);
        class565.method3134(2);
        class206.method1314((byte) 101);
        class478.method2753(15);
        class569.method3150(arg0 - 22);
        class626.method3473(false);
        class450.method2530((byte) -25);
        class517.method2934(arg0 - 179);
        class275.method1654((byte) -7);
        class1.method4(false);
        class191.method1259((byte) 26);
        class645.method3588(-68);
        class184.method1220(0);
        class564.method3130(120);
        class554.method3095((byte) -79);
        class54.method318(false);
        class324.method1884(76);
        class195.method1272(-1729473140);
        class115.method677(arg0 ^ 0x51);
        class333.method1966(1001);
        class353.method2086(true);
        class702.method3944((byte) -57);
        class139.method785();
        class272.method1619();
        class646.method3591(76);
        class46.method244((byte) 50);
        class124.method741(115);
        class97.method555(61);
        class143.method821((byte) 20);
        class508.method2884(-13395);
        class19.method116((byte) -86);
        class290.method1720((byte) -68);
        class490.method2807(4);
        class428.method2422(-22775);
        class72.method397(true);
        class619.method3425((byte) 108);
        class182.method1215((byte) 117);
        class215.method1365(16);
        class15.method101(115);
        class474.method2733((byte) 16);
        class187.method1235(-85);
        class653.method3695((byte) -112);
        class538.method3024(125);
        class516.method2931(true);
        class75.method411(arg0 + 22);
        class4.method28(121);
        class35.method207(false);
        class209.method1328(arg0 - 130);
        class287.method1699(arg0 ^ 0x20A7A353);
        class590.method3260(arg0 ^ 0xFFAF);
        class18.method111((byte) -44);
        class258.method1555(-52);
        class467.method2601(false);
        class217.method1377((byte) 22);
        class613.method3393(-125);
        class100.method566((byte) -124);
        class625.method3472(-16092);
        class13.method85((byte) 113);
        class165.method1011((byte) -126);
        class451.method2535((byte) 7);
        class233.method1445(false);
        class219.method1385(30036);
        class169.method1156((byte) -98);
        class78.method426(-10274);
        class49.method260(true);
        class239.method1480(arg0 ^ 0x1B29);
        class393.method2265(arg0 + 19232);
        class674.method3840(7);
        class129.method758(1);
        class200.method1285((byte) 88);
        class704.method3949(-10069);
        class581.method3201(arg0 ^ 0x5EB2);
        class90.method495(-1);
        class38.method210(arg0 ^ 0xF36);
        class637.method3528(true);
        class146.method834((byte) 72);
        class101.method568((byte) 125);
        class533.method2995(true);
        class305.method1789(-487070654);
        class427.method2418(arg0 ^ 0xFFFFFFC2);
        class158.method975(-22167);
        class300.method1775(-9223);
        class80.method428(-4124);
        class455.method2563((byte) -128);
        class496.method2825(-71);
        class133.method775(-123);
        class418.method2366(0);
        class668.method3798(43);
        class604.method3365(-91);
        class299.method1763((byte) 127);
        class671.method3812((byte) -34);
        class386.method2210(34065);
        class676.method3846(true);
        class312.method1833(-128);
        class248.method1503(arg0 ^ 0x62);
        class310.method1825((byte) -92);
        class208.method1324(true);
        class401.method2295(arg0 ^ 0x52);
        class249.method1505(-16103);
        class670.method3809((byte) -49);
        class61.method343(23082);
        class43.method227((byte) 127);
        class375.method2149(100);
        class314.method1839((byte) -117);
        class294.method1742((byte) 93);
        class594.method3300(-20402);
        class608.method3374(arg0 ^ 0x69A1);
        class675.method3843(-1289729144);
        class354.method2089((byte) 99);
        class227.method1413(1197289511);
        class31.method192(95);
        class688.method3892(0);
        class180.method1205(1);
        class446.method2517(false);
        class616.method3410(-128);
        class170.method1158((byte) 101);
        class320.method1851((byte) 126);
        class244.method1495(35);
        class273.method1645((byte) -67);
        class245.method1499(127);
        class177.method1200(0);
        class342.method1987(-8784);
        class413.method2340((byte) 86);
        class686.method3882((byte) 98);
        class237.method1467(arg0 ^ 0x851);
        class648.method3600(-128);
        class242.method1490(true);
        class462.method2586((byte) 124);
        class189.method1248((byte) -113);
        class296.method1745((byte) -71);
        class527.method2979((byte) -114);
        class221.method1389(0);
        class376.method2151(arg0 ^ 0xFFFFAE);
        class130.method762(arg0 ^ 0x52);
        class629.method3484(72);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lwv;)Lmca;")
    public static final class5 method3858(class423 arg0) {
        class5 var1 = (class5) class608.field8455.method3057(1, ((long) arg0.field5685 << 32) + (long) arg0.field5610);
        return var1 == null ? arg0.field5696 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method2604(int arg0) {
        field9623++;
        if (class618.field8566 == 2) {
            try {
                this.method3854(600);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class91.method499(var5.getMessage() + " (Recovered) " + this.method2606(0), var5, (byte) -20);
                class174.method1190(0, 0);
            }
        } else {
            this.method3854(600);
        }
        if (arg0 > -15) {
            main(null);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method3859(byte arg0) {
        field9617++;
        if (arg0 == 0) {
            boolean var2 = class567.field7725.method977(false);
            if (!var2) {
                this.method3848((byte) 67);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lwv;IIIIIIIII)V")
    public static final void method3860(class423[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class423 var11 = arg0[var10];
            if (var11 != null && var11.field5585 == arg1) {
                int var12 = var11.field5570 + arg6;
                int var13 = var11.field5654 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field5598 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field5561 + var12;
                    int var19 = var11.field5672 + var13;
                    if (var11.field5598 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field5598 == 0 || var11.field5646 || method3858(var11).field48 != 0 || class342.field4584 == var11 || class116.field1490 == var11.field5619 || class291.field3851 == var11.field5619) {
                    if (!method3855(var11)) {
                        if (class85.field1028 == var11 && class645.method3586(class85.field1028, (byte) -128) != null) {
                            class452.field5965 = true;
                            class34.field486 = var12;
                            class593.field8182 = var13;
                        }
                        if (var11.field5621 || var14 < var16 && var15 < var17) {
                            if (var11.field5587 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class274 var20 = (class274) class114.field1466.method2506(68); var20 != null; var20 = (class274) class114.field1466.method2505(-127)) {
                                    if (var20.field3654) {
                                        var20.method242(true);
                                        var20.field3644.field5692 = false;
                                    }
                                }
                                if (class392.field5252 == 0) {
                                    class85.field1028 = null;
                                    class342.field4584 = null;
                                }
                                class182.field2544 = 0;
                                class81.field943 = false;
                                class346.field4621 = false;
                                if (!class674.field9590) {
                                    class541.method3033((byte) 69);
                                }
                            }
                            boolean var21;
                            if (class409.field5387.method1890(16777215) >= var14 && class409.field5387.method1893((byte) 44) >= var15 && class409.field5387.method1890(16777215) < var16 && class409.field5387.method1893((byte) 79) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class38.field507 && var21) {
                                if (var11.field5562 >= 0) {
                                    class689.field9739 = var11.field5562;
                                } else if (var11.field5587) {
                                    class689.field9739 = -1;
                                }
                            }
                            if (!class674.field9590 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class617.method3411((byte) -125, arg9 - var13, var11, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class409.field5387.method1894((byte) 40) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class294 var24 = (class294) class58.field743.method2506(68);
                            if (var24 != null && var24.method452(false) == 0 && var24.method454(-3) >= var14 && var24.method451((byte) -102) >= var15 && var24.method454(-3) < var16 && var24.method451((byte) -70) < var17) {
                                var23 = true;
                            }
                            if (var11.field5568 != null && !class144.method823(-1924733010)) {
                                for (int var25 = 0; var25 < var11.field5568.length; var25++) {
                                    if (class643.field8914.method2106((byte) -114, var11.field5568[var25])) {
                                        if (var11.field5683 == null || class327.field4404 >= var11.field5683[var25]) {
                                            byte var26 = var11.field5668[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class643.field8914.method2106((byte) -121, 86) && !class643.field8914.method2106((byte) -109, 82) && !class643.field8914.method2106((byte) -127, 81)) && ((var26 & 0x2) == 0 || class643.field8914.method2106((byte) -110, 86)) && ((var26 & 0x1) == 0 || class643.field8914.method2106((byte) -119, 82)) && ((var26 & 0x4) == 0 || class643.field8914.method2106((byte) -117, 81))) {
                                                if (var25 < 10) {
                                                    class495.method2822(var11.field5685, -1, "", var25 + 1, 31868);
                                                } else if (var25 == 10) {
                                                    class364.method2122((byte) 3);
                                                    class5 var27 = method3858(var11);
                                                    class315.method1840(var27.method37((byte) 119), 0, var11, var27.field52);
                                                    class418.field5499 = class159.method986(6874, var11);
                                                    if (class418.field5499 == null) {
                                                        class418.field5499 = "Null";
                                                    }
                                                    class209.field2788 = var11.field5653 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field5606[var25];
                                                if (var11.field5683 == null) {
                                                    var11.field5683 = new int[var11.field5568.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field5683[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field5683[var25] = class327.field4404 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field5683 != null) {
                                        var11.field5683[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class250.method1512(var24.method451((byte) -59) - var13, (byte) 117, var11, var24.method454(-3) - var12);
                            }
                            if (class85.field1028 != null && class85.field1028 != var11 && var21 && method3858(var11).method34((byte) -114)) {
                                class271.field3533 = var11;
                            }
                            if (class342.field4584 == var11) {
                                class606.field8447 = true;
                                class664.field9452 = var12;
                                class460.field6026 = var13;
                            }
                            if (var11.field5646 || var11.field5619 != 0) {
                                if (var21 && class427.field5753 != 0 && var11.field5593 != null) {
                                    class274 var29 = new class274();
                                    var29.field3654 = true;
                                    var29.field3644 = var11;
                                    var29.field3651 = class427.field5753;
                                    var29.field3639 = var11.field5593;
                                    class114.field1466.method2507(var29, (byte) -126);
                                }
                                if (class85.field1028 != null || class674.field9590 || class508.field7014 != var11.field5619 && class182.field2544 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field5619 != 0) {
                                    if (class651.field9031 == var11.field5619 || class309.field4185 == var11.field5619) {
                                        class302.field3995 = var11;
                                        if (class292.field3855 != null) {
                                            class292.field3855.method3247(var11.field5672, (byte) -123, class146.field1963);
                                        }
                                        if (class651.field9031 == var11.field5619) {
                                            if (!class674.field9590 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class68.method382(arg8, -2181, class146.field1963, arg9);
                                                for (class501 var30 = (class501) class217.field2853.method1298((byte) 40); var30 != null; var30 = (class501) class217.field2853.method1305((byte) -109)) {
                                                    if (arg8 >= var30.field6885 && arg8 < var30.field6890 && arg9 >= var30.field6886 && arg9 < var30.field6887) {
                                                        class541.method3033((byte) 82);
                                                        class510.method2892(var30.field6883, 99);
                                                    }
                                                }
                                            }
                                            class411.method2336(0, var13, var11, var12);
                                            continue;
                                        }
                                    }
                                    if (class116.field1490 == var11.field5619) {
                                        if (var11.method2383(-1, class146.field1963) == null || class657.field9361 != 0 && class657.field9361 != 3 || class674.field9590 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field5569[var32];
                                        if (var31 < var33 || var31 > var11.field5622[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field5561 / 2;
                                        int var35 = var32 - var11.field5672 / 2;
                                        int var36;
                                        if (class311.field4200 == 4) {
                                            var36 = (int) class565.field7707 & 0x3FFF;
                                        } else {
                                            var36 = (int) class565.field7707 + class478.field6651 & 0x3FFF;
                                        }
                                        int var37 = class240.field3176[var36];
                                        int var38 = class240.field3177[var36];
                                        if (class311.field4200 != 4) {
                                            var37 = (class424.field5716 + 256) * var37 >> 8;
                                            var38 = (class424.field5716 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class311.field4200 == 4) {
                                            var41 = (class165.field2369 >> 9) + (var39 >> 2);
                                            var42 = (class622.field8621 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class408.field5369.method1435((byte) 81) - 1) * 256;
                                            var41 = (class408.field5369.field398 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class408.field5369.field397 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class38.field507 && (class544.field7442 & 0x40) != 0) {
                                            class423 var44 = class546.method3064(-119, class351.field4679, class369.field4847);
                                            if (var44 == null) {
                                                class364.method2122((byte) 3);
                                            } else {
                                                class592.method3274(false, true, var11.field5552, 20, class418.field5499, false, 1L, class101.field1208, var42, var41, " ->");
                                            }
                                            continue;
                                        }
                                        if (class678.field9636 == class508.field7015) {
                                            class592.method3274(false, true, -1, 25, class371.field4906.method2141(class422.field5539, true), false, 1L, -1, var42, var41, "");
                                        }
                                        class592.method3274(false, true, -1, 12, class466.field6119, false, 1L, class50.field581, var42, var41, "");
                                        continue;
                                    }
                                    if (class508.field7014 == var11.field5619) {
                                        class418.field5502 = var11;
                                        if (var21) {
                                            class81.field943 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method454(-3) - var12 - var11.field5561 / 2) * 2.0D / (double) class672.field9558);
                                            int var46 = (int) (-((double) (var24.method451((byte) -124) - var13 - var11.field5672 / 2) * 2.0D / (double) class672.field9558));
                                            int var47 = class698.field9854 + var45 + class672.field9567;
                                            int var48 = class424.field5722 + var46 + class672.field9587;
                                            class289 var49 = class112.method665(-122);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1711(var47, -32400, var50, var48);
                                            if (var50 != null) {
                                                if (class643.field8914.method2106((byte) -112, 82) && class121.field1585 > 0) {
                                                    class242.method1491(var50[0], var50[1], (byte) -32, var50[2]);
                                                    continue;
                                                }
                                                class346.field4621 = true;
                                                class169.field2421 = var50[0];
                                                class125.field1750 = var50[1];
                                                class208.field2778 = var50[2];
                                            }
                                            class182.field2544 = 1;
                                            class600.field8321 = false;
                                            class287.field3789 = class409.field5387.method1890(16777215);
                                            class366.field4832 = class409.field5387.method1893((byte) 42);
                                            continue;
                                        }
                                        if (var22 && class182.field2544 > 0) {
                                            if (class182.field2544 == 1 && (class287.field3789 != class409.field5387.method1890(16777215) || class366.field4832 != class409.field5387.method1893((byte) 123))) {
                                                class6.field63 = class698.field9854;
                                                class340.field4577 = class424.field5722;
                                                class182.field2544 = 2;
                                            }
                                            if (class182.field2544 == 2) {
                                                class600.field8321 = true;
                                                class216.method1373((byte) 123, class6.field63 + (int) ((double) (class287.field3789 - class409.field5387.method1890(16777215)) * 2.0D / (double) class672.field9562));
                                                class510.method2891(61, class340.field4577 - (int) ((double) (class366.field4832 - class409.field5387.method1893((byte) 59)) * 2.0D / (double) class672.field9562));
                                            }
                                            continue;
                                        }
                                        if (class182.field2544 > 0 && !class600.field8321) {
                                            if ((class52.field665 == 1 || class274.method1650(0)) && class137.field1873 > 2) {
                                                class502.method2849((byte) 82, class287.field3789, class366.field4832);
                                            } else if (class398.method2276(-9772)) {
                                                class502.method2849((byte) 82, class287.field3789, class366.field4832);
                                            }
                                        }
                                        class182.field2544 = 0;
                                        continue;
                                    }
                                    if (class208.field2782 == var11.field5619) {
                                        if (var22) {
                                            class407.method2311(2, class409.field5387.method1893((byte) 46) - var13, var11.field5672, class409.field5387.method1890(16777215) - var12, var11.field5561);
                                        }
                                        continue;
                                    }
                                    if (class291.field3851 == var11.field5619) {
                                        class110.method600(var11, 5, var12, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field5592 && var23) {
                                    var11.field5592 = true;
                                    if (var11.field5679 != null) {
                                        class274 var51 = new class274();
                                        var51.field3654 = true;
                                        var51.field3644 = var11;
                                        var51.field3652 = var24.method454(-3) - var12;
                                        var51.field3651 = var24.method451((byte) -107) - var13;
                                        var51.field3639 = var11.field5679;
                                        class114.field1466.method2507(var51, (byte) -126);
                                    }
                                }
                                if (var11.field5592 && var22 && var11.field5688 != null) {
                                    class274 var52 = new class274();
                                    var52.field3654 = true;
                                    var52.field3644 = var11;
                                    var52.field3652 = class409.field5387.method1890(16777215) - var12;
                                    var52.field3651 = class409.field5387.method1893((byte) 56) - var13;
                                    var52.field3639 = var11.field5688;
                                    class114.field1466.method2507(var52, (byte) -127);
                                }
                                if (var11.field5592 && !var22) {
                                    var11.field5592 = false;
                                    if (var11.field5554 != null) {
                                        class274 var53 = new class274();
                                        var53.field3654 = true;
                                        var53.field3644 = var11;
                                        var53.field3652 = class409.field5387.method1890(16777215) - var12;
                                        var53.field3651 = class409.field5387.method1893((byte) 80) - var13;
                                        var53.field3639 = var11.field5554;
                                        class200.field2705.method2507(var53, (byte) -126);
                                    }
                                }
                                if (var22 && var11.field5645 != null) {
                                    class274 var54 = new class274();
                                    var54.field3654 = true;
                                    var54.field3644 = var11;
                                    var54.field3652 = class409.field5387.method1890(16777215) - var12;
                                    var54.field3651 = class409.field5387.method1893((byte) 124) - var13;
                                    var54.field3639 = var11.field5645;
                                    class114.field1466.method2507(var54, (byte) -124);
                                }
                                if (!var11.field5692 && var21) {
                                    var11.field5692 = true;
                                    if (var11.field5574 != null) {
                                        class274 var55 = new class274();
                                        var55.field3654 = true;
                                        var55.field3644 = var11;
                                        var55.field3652 = class409.field5387.method1890(16777215) - var12;
                                        var55.field3651 = class409.field5387.method1893((byte) 119) - var13;
                                        var55.field3639 = var11.field5574;
                                        class114.field1466.method2507(var55, (byte) -123);
                                    }
                                }
                                if (var11.field5692 && var21 && var11.field5698 != null) {
                                    class274 var56 = new class274();
                                    var56.field3654 = true;
                                    var56.field3644 = var11;
                                    var56.field3652 = class409.field5387.method1890(16777215) - var12;
                                    var56.field3651 = class409.field5387.method1893((byte) 126) - var13;
                                    var56.field3639 = var11.field5698;
                                    class114.field1466.method2507(var56, (byte) -125);
                                }
                                if (var11.field5692 && !var21) {
                                    var11.field5692 = false;
                                    if (var11.field5637 != null) {
                                        class274 var57 = new class274();
                                        var57.field3654 = true;
                                        var57.field3644 = var11;
                                        var57.field3652 = class409.field5387.method1890(16777215) - var12;
                                        var57.field3651 = class409.field5387.method1893((byte) 103) - var13;
                                        var57.field3639 = var11.field5637;
                                        class200.field2705.method2507(var57, (byte) -120);
                                    }
                                }
                                if (var11.field5576 != null) {
                                    class274 var58 = new class274();
                                    var58.field3644 = var11;
                                    var58.field3639 = var11.field5576;
                                    class441.field5855.method2507(var58, (byte) -121);
                                }
                                if (var11.field5578 != null && class579.field7916 > var11.field5706) {
                                    if (var11.field5596 == null || class579.field7916 - var11.field5706 > 32) {
                                        class274 var63 = new class274();
                                        var63.field3644 = var11;
                                        var63.field3639 = var11.field5578;
                                        class114.field1466.method2507(var63, (byte) -122);
                                    } else {
                                        label696: for (int var59 = var11.field5706; var59 < class579.field7916; var59++) {
                                            int var60 = class95.field1150[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field5596.length; var61++) {
                                                if (var11.field5596[var61] == var60) {
                                                    class274 var62 = new class274();
                                                    var62.field3644 = var11;
                                                    var62.field3639 = var11.field5578;
                                                    class114.field1466.method2507(var62, (byte) -126);
                                                    break label696;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5706 = class579.field7916;
                                }
                                if (var11.field5666 != null && class571.field7771 > var11.field5655) {
                                    if (var11.field5694 == null || class571.field7771 - var11.field5655 > 32) {
                                        class274 var68 = new class274();
                                        var68.field3644 = var11;
                                        var68.field3639 = var11.field5666;
                                        class114.field1466.method2507(var68, (byte) -126);
                                    } else {
                                        label672: for (int var64 = var11.field5655; var64 < class571.field7771; var64++) {
                                            int var65 = class490.field6781[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field5694.length; var66++) {
                                                if (var11.field5694[var66] == var65) {
                                                    class274 var67 = new class274();
                                                    var67.field3644 = var11;
                                                    var67.field3639 = var11.field5666;
                                                    class114.field1466.method2507(var67, (byte) -122);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5655 = class571.field7771;
                                }
                                if (var11.field5586 != null && class307.field4113 > var11.field5697) {
                                    if (var11.field5559 == null || class307.field4113 - var11.field5697 > 32) {
                                        class274 var73 = new class274();
                                        var73.field3644 = var11;
                                        var73.field3639 = var11.field5586;
                                        class114.field1466.method2507(var73, (byte) -125);
                                    } else {
                                        label648: for (int var69 = var11.field5697; var69 < class307.field4113; var69++) {
                                            int var70 = class153.field2166[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field5559.length; var71++) {
                                                if (var11.field5559[var71] == var70) {
                                                    class274 var72 = new class274();
                                                    var72.field3644 = var11;
                                                    var72.field3639 = var11.field5586;
                                                    class114.field1466.method2507(var72, (byte) -120);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5697 = class307.field4113;
                                }
                                if (var11.field5707 != null && class466.field6128 > var11.field5710) {
                                    if (var11.field5602 == null || class466.field6128 - var11.field5710 > 32) {
                                        class274 var78 = new class274();
                                        var78.field3644 = var11;
                                        var78.field3639 = var11.field5707;
                                        class114.field1466.method2507(var78, (byte) -123);
                                    } else {
                                        label624: for (int var74 = var11.field5710; var74 < class466.field6128; var74++) {
                                            int var75 = class399.field5289[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field5602.length; var76++) {
                                                if (var11.field5602[var76] == var75) {
                                                    class274 var77 = new class274();
                                                    var77.field3644 = var11;
                                                    var77.field3639 = var11.field5707;
                                                    class114.field1466.method2507(var77, (byte) -123);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5710 = class466.field6128;
                                }
                                if (var11.field5652 != null && class614.field8510 > var11.field5675) {
                                    if (var11.field5700 == null || class614.field8510 - var11.field5675 > 32) {
                                        class274 var83 = new class274();
                                        var83.field3644 = var11;
                                        var83.field3639 = var11.field5652;
                                        class114.field1466.method2507(var83, (byte) -126);
                                    } else {
                                        label600: for (int var79 = var11.field5675; var79 < class614.field8510; var79++) {
                                            int var80 = class703.field9879[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field5700.length; var81++) {
                                                if (var11.field5700[var81] == var80) {
                                                    class274 var82 = new class274();
                                                    var82.field3644 = var11;
                                                    var82.field3639 = var11.field5652;
                                                    class114.field1466.method2507(var82, (byte) -126);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5675 = class614.field8510;
                                }
                                if (class80.field935 > var11.field5549 && var11.field5690 != null) {
                                    class274 var84 = new class274();
                                    var84.field3644 = var11;
                                    var84.field3639 = var11.field5690;
                                    class114.field1466.method2507(var84, (byte) -128);
                                }
                                if (class303.field4026 > var11.field5549 && var11.field5673 != null) {
                                    class274 var85 = new class274();
                                    var85.field3644 = var11;
                                    var85.field3639 = var11.field5673;
                                    class114.field1466.method2507(var85, (byte) -128);
                                }
                                if (class509.field7020 > var11.field5549 && var11.field5611 != null) {
                                    class274 var86 = new class274();
                                    var86.field3644 = var11;
                                    var86.field3639 = var11.field5611;
                                    class114.field1466.method2507(var86, (byte) -124);
                                }
                                if (class1.field1 > var11.field5549 && var11.field5693 != null) {
                                    class274 var87 = new class274();
                                    var87.field3644 = var11;
                                    var87.field3639 = var11.field5693;
                                    class114.field1466.method2507(var87, (byte) -123);
                                }
                                if (class99.field1198 > var11.field5549 && var11.field5686 != null) {
                                    class274 var88 = new class274();
                                    var88.field3644 = var11;
                                    var88.field3639 = var11.field5686;
                                    class114.field1466.method2507(var88, (byte) -126);
                                }
                                var11.field5549 = class155.field2183;
                                if (var11.field5616 != null) {
                                    for (int var89 = 0; var89 < class270.field3531; var89++) {
                                        class274 var90 = new class274();
                                        var90.field3644 = var11;
                                        var90.field3653 = class96.field1162[var89].method2749(-15);
                                        var90.field3640 = class96.field1162[var89].method2750(false);
                                        var90.field3639 = var11.field5616;
                                        class114.field1466.method2507(var90, (byte) -125);
                                    }
                                }
                                if (class328.field4410 && var11.field5566 != null) {
                                    class274 var91 = new class274();
                                    var91.field3644 = var11;
                                    var91.field3639 = var11.field5566;
                                    class114.field1466.method2507(var91, (byte) -128);
                                }
                            }
                            if (var11.field5598 == 5 && var11.field5689 != -1) {
                                var11.method2393((byte) -64, class400.field5313, class579.field7919).method3247(var11.field5672, (byte) -91, class146.field1963);
                            }
                            class625.method3470(true, var11);
                            if (var11.field5598 == 0) {
                                method3860(arg0, var11.field5685, var14, var15, var16, var17, var12 - var11.field5550, var13 - var11.field5640, arg8, arg9);
                                if (var11.field5647 != null) {
                                    method3860(var11.field5647, var11.field5685, var14, var15, var16, var17, var12 - var11.field5550, var13 - var11.field5640, arg8, arg9);
                                }
                                class137 var92 = (class137) class152.field2079.method3057(1, (long) var11.field5685);
                                if (var92 != null) {
                                    if (class510.field7101 == class508.field7015 && var92.field1872 == 0 && !class674.field9590 && var21 && !class452.field5967) {
                                        class541.method3033((byte) 124);
                                    }
                                    class140.method786(var13, var15, var16, arg9, var92.field1870, var14, arg8, 52, var12, var17);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class625.method3470(true, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method2617(byte arg0) {
        if (class122.field1599) {
            class326.method1900(false);
        }
        field9618++;
        class191.method1256(13788);
        if (class146.field1963 != null) {
            class146.field1963.method3127(true);
        }
        if (class529.field7314 != null) {
            class216.method1372(class312.field4206, false, class529.field7314);
            class529.field7314 = null;
        }
        if (class163.field2346 != null) {
            class163.field2346.method1164(101);
            class163.field2346 = null;
        }
        if (arg0 != -116) {
            this.method2606(-78);
        }
        class21.method131(128);
        class567.field7725.method983(24313);
        class475.field6619.method2278(49);
        if (class371.field4943 != null) {
            class371.field4943.method2831(arg0 ^ 0xFFFFFF8C);
            class371.field4943 = null;
        }
        try {
            class495.field6817.method763((byte) -86);
            for (int var2 = 0; var2 < 35; var2++) {
                class688.field9718[var2].method763((byte) -124);
            }
            class114.field1455.method763((byte) -60);
            class527.field7301.method763((byte) -52);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lwv;)Lwv;")
    public static final class423 method3861(class423 arg0) {
        int var1 = method3858(arg0).method32((byte) -109);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class592.method3271(arg0.field5585, (byte) -77);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method3862(byte arg0) {
        field9611++;
        if (class576.field7861 == 7 && class420.field5513 == 0) {
            if (class422.field5543 > 1) {
                class422.field5543--;
                class99.field1198 = class155.field2183;
            }
            if (!class674.field9590) {
                class541.method3033((byte) 41);
            }
            for (int var2 = 0; var2 < 100 && class204.method1308(true); var2++) {
            }
        }
        class498.field6849++;
        class411.method2336(arg0 + 58, -1, null, -1);
        class110.method600(null, 5, -1, -1);
        class537.method3010(arg0 + 57);
        class155.field2183++;
        for (int var3 = 0; var3 < class468.field6163; var3++) {
            class351 var4 = class591.field8148[var3].field5354;
            if (var4 != null) {
                byte var5 = var4.field4671.field5071;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1435((byte) 91);
                    if ((var5 & 0x2) != 0 && var4.field3095 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field3088[0] + var7;
                            int var10 = var4.field3086[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class703.field9886 - var6 - 1 < var9) {
                                var9 = class703.field9886 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if ((class431.field5789 - var6 - 1) < var10) {
                                var10 = class431.field5789 - var6 - 1;
                            }
                            int var11 = class209.method1327(var4.field3088[0], -1, class322.field4302[var4.field385], (byte) 122, var6, var9, var6, 0, class502.field6925, var4.field3086[0], var10, true, 0, var6, class10.field99);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field3088[var12] = class10.field99[var11 - var12 - 1];
                                    var4.field3086[var12] = class502.field6925[var11 - var12 - 1];
                                    var4.field3093[var12] = 1;
                                }
                                var4.field3095 = var11;
                            }
                        }
                    }
                    class516.method2932(var4, true, 73);
                    int var13 = class338.method1978((byte) 127, var4);
                    class293.method1735(class694.field9790, var13, var4, arg0 - 6087, class696.field9853);
                    class115.method675(var4, class696.field9853, (byte) -103);
                    class104.method572(var4, -1);
                }
            }
        }
        if (class420.field5513 == 0 && class589.field8123 == 0) {
            if (class311.field4200 == 2) {
                class270.method1612((byte) 102);
            } else {
                class686.method3881(arg0 + 2106);
            }
            if (class82.field946 >> 9 < 14 || (class703.field9886 - 14) <= (class82.field946 >> 9) || (class147.field1980 >> 9) < 14 || (class147.field1980 >> 9) >= (class431.field5789 - 14)) {
                class471.method2716(-98);
            }
        }
        while (true) {
            class274 var14;
            class423 var15;
            class423 var16;
            do {
                var14 = (class274) class441.field5855.method2502((byte) 13);
                if (var14 == null) {
                    while (true) {
                        class274 var17;
                        class423 var18;
                        class423 var19;
                        do {
                            var17 = (class274) class200.field2705.method2502((byte) 71);
                            if (var17 == null) {
                                while (true) {
                                    class274 var20;
                                    class423 var21;
                                    class423 var22;
                                    do {
                                        var20 = (class274) class114.field1466.method2502((byte) 92);
                                        if (var20 == null) {
                                            if (class85.field1028 != null) {
                                                class474.method2731(arg0 ^ 0xFFFFFFC7);
                                            }
                                            if (class327.field4404 % 1500 == 0) {
                                                class427.method2419((byte) 19);
                                            }
                                            if (class576.field7861 == 7 && class420.field5513 == 0) {
                                                class174.method1187(0);
                                            }
                                            if (arg0 != -58) {
                                                this.method3862((byte) 1);
                                            }
                                            class590.method3262(-115);
                                            if (class122.field1599 && class254.field3331 < (class529.method2982((byte) -69) - 60000L)) {
                                                class326.method1900(false);
                                            }
                                            for (class43 var23 = (class43) class562.field7686.method1298((byte) 40); var23 != null; var23 = (class43) class562.field7686.method1305((byte) -114)) {
                                                if ((class529.method2982((byte) -69) / 1000L - 5L) > ((long) var23.field530)) {
                                                    if (var23.field528 > 0) {
                                                        class116.method681("", "", "", 43, 0, var23.field527 + class371.field4898.method2141(class422.field5539, true), 5);
                                                    }
                                                    if (var23.field528 == 0) {
                                                        class116.method681("", "", "", arg0 ^ 0xFFFFFFEC, 0, var23.field527 + class371.field4899.method2141(class422.field5539, true), 5);
                                                    }
                                                    var23.method3499(12151);
                                                }
                                            }
                                            if (class576.field7861 == 7 && class420.field5513 == 0) {
                                                if (class163.field2346 == null) {
                                                    class669.method3801((byte) 102, false);
                                                    return;
                                                }
                                                class309.field4164++;
                                                if (class309.field4164 > 50) {
                                                    class580.field7921++;
                                                    class229 var24 = class97.method550(class71.field841, false, class565.field7704);
                                                    class307.method1805(var24, arg0 ^ 0x3956);
                                                }
                                                try {
                                                    class493.method2814(-30301);
                                                    return;
                                                } catch (IOException var25) {
                                                    class669.method3801((byte) 115, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field3644;
                                        if (var21.field5610 < 0) {
                                            break;
                                        }
                                        var22 = class592.method3271(var21.field5585, (byte) -82);
                                    } while (var22 == null || var22.field5647 == null || var21.field5610 >= var22.field5647.length || var22.field5647[var21.field5610] != var21);
                                    class656.method3743(var20);
                                }
                            }
                            var18 = var17.field3644;
                            if (var18.field5610 < 0) {
                                break;
                            }
                            var19 = class592.method3271(var18.field5585, (byte) -100);
                        } while (var19 == null || var19.field5647 == null || var18.field5610 >= var19.field5647.length || var19.field5647[var18.field5610] != var18);
                        class656.method3743(var17);
                    }
                }
                var15 = var14.field3644;
                if (var15.field5610 < 0) {
                    break;
                }
                var16 = class592.method3271(var15.field5585, (byte) -85);
            } while (var16 == null || var16.field5647 == null || var16.field5647.length <= var15.field5610 || var16.field5647[var15.field5610] != var15);
            class656.method3743(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method3863() {
        for (int var0 = 0; var0 < class703.field9886; var0++) {
            int[] var1 = class59.field744[var0];
            for (int var2 = 0; var2 < class431.field5789; var2++) {
                var1[var2] = 0;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3864(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
