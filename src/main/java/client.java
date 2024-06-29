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
public class client extends class767 {

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
    public static int[] field4512 = new int[2];

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field4516;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Ljava/lang/Class;")
    public static Class field4515;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method2031(int arg0) {
        field4506++;
        String var2 = null;
        try {
            var2 = "[1)" + class120.field1625 + "," + class259.field3849 + "," + class102.field1467 + "," + class393.field5663 + "|";
            if (class625.field8475 != null) {
                var2 = var2 + "2)" + class184.field2420 + "," + (class625.field8475.field6198[0] + class120.field1625) + "," + (class625.field8475.field6197[0] + class259.field3849) + "|";
            }
            var2 = var2 + "3)" + class125.field1721.field5141.method2541(43) + "|4)" + class125.field1721.field5174.method335(43) + "|5)" + class164.method1133(-15388) + "|6)" + class460.field6558 + "," + class693.field9222 + "|";
            var2 = var2 + "7)" + class125.field1721.field5160.method3282(43) + "|";
            var2 = var2 + "8)" + class125.field1721.field5156.method159(43) + "|";
            var2 = var2 + "9)" + class125.field1721.field5188.method2377(43) + "|";
            var2 = var2 + "10)" + class125.field1721.field5167.method1438(43) + "|";
            var2 = var2 + "11)" + class125.field1721.field5164.method607(43) + "|";
            var2 = var2 + "12)" + class125.field1721.field5155.method591(43) + "|";
            var2 = var2 + "13)" + class115.field1557 + "|";
            var2 = var2 + "14)" + class780.field10712;
            if (class706.field9663 != null) {
                var2 = var2 + "|15)" + class706.field9663.field9953;
            }
            try {
                if (class125.field1721.field5141.method2541(43) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field4515 == null ? (field4515 = method2059("client")) : field4515).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
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
            } catch (Throwable var15) {
            }
            var2 = var2 + "]";
            if (arg0 != -31064) {
                this.method2050((byte) -17);
            }
        } catch (Throwable var16) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method2032(int arg0, int arg1) {
        class128.field1767 = 0;
        class66.field899 = null;
        field4497++;
        class83.field1178 = null;
        class479.field6732.field103++;
        if (arg0 != 82) {
            this.method2052(-112);
        }
        class479.field6732.field105 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Luq;I)V")
    public static final void method2033(class172 arg0, int arg1) {
        if (arg1 == -1) {
            class598.field8139 = arg0;
            field4500++;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class233.method1477("Argument count", 2);
            }
            class356.field5196 = new class680();
            class356.field5196.field9099 = Integer.parseInt(arg0[0]);
            class394.field5678 = new class680();
            class394.field5678.field9099 = Integer.parseInt(arg0[1]);
            class168.field2215 = new class680();
            class168.field2215.field9099 = Integer.parseInt(arg0[2]);
            class554.field7645 = class135.field1836;
            if (arg0[3].equals("live")) {
                class771.field10604 = class216.field2827;
            } else if (arg0[3].equals("rc")) {
                class771.field10604 = class545.field7538;
            } else if (arg0[3].equals("wip")) {
                class771.field10604 = class11.field126;
            } else {
                class233.method1477("modewhat", 2);
            }
            class55.field647 = class746.method4087(arg0[4], 0);
            if (class55.field647 == -1) {
                if (arg0[4].equals("english")) {
                    class55.field647 = 0;
                } else if (arg0[4].equals("german")) {
                    class55.field647 = 1;
                } else {
                    class233.method1477("language", 2);
                }
            }
            class787.field10808 = false;
            class273.field3971 = false;
            if (arg0[5].equals("game0")) {
                class426.field6204 = class743.field10050;
            } else if (arg0[5].equals("game1")) {
                class426.field6204 = class682.field9122;
            } else if (arg0[5].equals("game2")) {
                class426.field6204 = class39.field406;
            } else if (arg0[5].equals("game3")) {
                class426.field6204 = class333.field4716;
            } else {
                class233.method1477("game", 2);
            }
            class33.field317 = "";
            class253.field3719 = class426.field6204.field3879;
            class628.field8500 = null;
            class744.field10061 = false;
            class786.field10799 = 0L;
            class302.field4241 = 0;
            class368.field5315 = false;
            class379.field5528 = true;
            class254.field3755 = true;
            class416.field6007 = 0;
            class157.field2106 = null;
            class281.field4059 = 0;
            client var1 = new client();
            class723.field9821 = var1;
            var1.method4220(false, 37, class426.field6204.field3876, 125, 645, 768, class771.field10604.method693(-118) + 32, 1024);
            class639.field8606.setLocation(40, 40);
        } catch (Exception var3) {
            class607.method3379(null, var3, true);
        }
        field4504++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lofa;)Z")
    public static final boolean method2034(class347 arg0) {
        if (class341.field4764) {
            if (method2055(arg0).field4635 != 0) {
                return false;
            }
            if (arg0.field4884 == 0) {
                return false;
            }
        }
        return arg0.field4951;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method2035(int arg0) {
        if (arg0 >= -78) {
            method2049(null, false);
        }
        class183.method1240();
        field4498++;
        for (int var1 = 0; var1 < 4; var1++) {
            class257.field3830[var1].method1425(-1);
        }
        class630.method3478(-19580);
        class74.method601((byte) 50);
        class23.method134((byte) -85);
        System.gc();
        class375.field5490.method547();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method2036() {
        int var0 = class652.field8795;
        int[] var1 = class497.field6986;
        int var2 = class125.field1721.field5163.method2356(43);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class758 var14 = class84.field1204[var1[var4]];
            if (!var14.method4165((byte) 63)) {
                var14.field6144 = -1;
            } else if (var14.field10374) {
                var14.field6144 = -1;
            } else {
                var14.method771(32082);
                if (var14.field7466 >= 0 && var14.field7467 >= 0 && var14.field7455 < class102.field1467 && var14.field7453 < class393.field5663) {
                    var14.field10353 = var14.field6128 ? var3 : false;
                    if (class625.field8475 == var14) {
                        var14.field6144 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field6135) {
                            var15++;
                        }
                        if (var14.field6174 > class572.field7788) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method2563(-12840) << 2);
                        if (var14.field10373 || var14.field10397) {
                            var16 += 512;
                        } else {
                            if (class408.field5785 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field6144 = var16 + 1;
                    }
                } else {
                    var14.field6144 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class178.field2352; var5++) {
            class22 var11 = ((class316) class176.field2326.method1248(93, (long) class245.field3206[var5])).field4455;
            if (var11.method120((byte) 63) && var11.field217.method1961(true, class480.field6740)) {
                var11.method771(32082);
                if (var11.field7466 >= 0 && var11.field7467 >= 0 && var11.field7455 < class102.field1467 && var11.field7453 < class393.field5663) {
                    int var12 = 0;
                    if (!var11.field6135) {
                        var12++;
                    }
                    if (var11.field6174 > class572.field7788) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method2563(-12840) << 2);
                    if (class408.field5785 == 0) {
                        if (var11.field217.field4268) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class408.field5785 == 1) {
                        if (var11.field217.field4268) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field217.field4259) {
                        var13 += 1024;
                    } else if (!var11.field217.field4274) {
                        var13 += 256;
                    }
                    var11.field6144 = var13 + 1;
                } else {
                    var11.field6144 = -1;
                }
            } else {
                var11.field6144 = -1;
            }
        }
        for (int var6 = 0; var6 < class681.field9112.length; var6++) {
            class436 var7 = class681.field9112[var6];
            if (var7 != null) {
                if (var7.field6307 == 1) {
                    class316 var8 = (class316) class176.field2326.method1248(126, (long) var7.field6304);
                    if (var8 != null) {
                        class22 var9 = var8.field4455;
                        if (var9.field6144 >= 0) {
                            var9.field6144 += 2048;
                        }
                    }
                } else if (var7.field6307 == 10) {
                    class758 var10 = class84.field1204[var7.field6304];
                    if (var10 != null && class625.field8475 != var10 && var10.field6144 >= 0) {
                        var10.field6144 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4501++;
        if (!this.method4219((byte) 48)) {
            return;
        }
        class356.field5196 = new class680();
        class356.field5196.field9099 = Integer.parseInt(this.getParameter("worldid"));
        class394.field5678 = new class680();
        class394.field5678.field9099 = Integer.parseInt(this.getParameter("lobbyid"));
        class394.field5678.field9101 = this.getParameter("lobbyaddress");
        class168.field2215 = new class680();
        class168.field2215.field9099 = Integer.parseInt(this.getParameter("demoid"));
        class168.field2215.field9101 = this.getParameter("demoaddress");
        class554.field7645 = class5.method33(Integer.parseInt(this.getParameter("modewhere")), (byte) 94);
        if (class554.field7645 == class135.field1836) {
            class554.field7645 = class416.field6001;
        } else if (!class196.method1289((byte) -104, class554.field7645) && class554.field7645 != class222.field2884) {
            class554.field7645 = class222.field2884;
        }
        class771.field10604 = class222.method1417(Integer.parseInt(this.getParameter("modewhat")), 4975);
        if (class771.field10604 != class11.field126 && class771.field10604 != class545.field7538 && class771.field10604 != class216.field2827) {
            class771.field10604 = class216.field2827;
        }
        try {
            class55.field647 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class55.field647 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class787.field10808 = true;
        } else {
            class787.field10808 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class273.field3971 = true;
        } else {
            class273.field3971 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class692.field9219 = true;
        } else {
            class692.field9219 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class426.field6204 = class743.field10050;
            } else if (var4.equals("1")) {
                class426.field6204 = class682.field9122;
            } else if (var4.equals("2")) {
                class426.field6204 = class39.field406;
            } else if (var4.equals("3")) {
                class426.field6204 = class333.field4716;
            }
        }
        try {
            class416.field6007 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class416.field6007 = 0;
        }
        class267.field3916 = this.getParameter("quiturl");
        class33.field317 = this.getParameter("settings");
        if (class33.field317 == null) {
            class33.field317 = "";
        }
        class643.field8660 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class281.field4059 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class281.field4059 = 0;
            }
        }
        class253.field3719 = Integer.parseInt(this.getParameter("colourid"));
        if (class253.field3719 < 0 || class253.field3719 >= class325.field4619.length) {
            class253.field3719 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class379.field5528 = true;
            class254.field3755 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class744.field10061 = true;
        }
        class157.field2106 = this.getParameter("sskey");
        if (class157.field2106 != null && class157.field2106.length() < 2) {
            class157.field2106 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class368.field5315 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class302.field4241 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class786.field10799 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class628.field8500 = this.getParameter("additionalInfo");
        if (class628.field8500 != null && class628.field8500.length() > 50) {
            class628.field8500 = null;
        }
        class723.field9821 = this;
        if (class743.field10050 == class426.field6204) {
            class67.field933 = 765;
            class187.field2450 = 503;
        } else if (class682.field9122 == class426.field6204) {
            class187.field2450 = 480;
            class67.field933 = 640;
        }
        this.method4223(37, class67.field933, class771.field10604.method693(-92) + 32, true, class187.field2450, class426.field6204.field3876, 645);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method2037(int arg0) {
        int var1 = class652.field8795;
        int[] var2 = class497.field6986;
        int var3 = class181.field2378 ? var1 : class178.field2352 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class425 var5;
            if (var4 < var1) {
                var5 = class84.field1204[var2[var4]];
            } else {
                var5 = ((class316) class176.field2326.method1248(115, (long) class245.field3206[var4 - var1])).field4455;
            }
            if (var5.field2813 == arg0) {
                var5.field6116 = 0;
                if (var5.field6144 < 0) {
                    var5.field6135 = false;
                } else {
                    int var6 = var5.method2563(-12840);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field2802 & 0x1FF) != 0 || (var5.field2810 & 0x1FF) != 0) {
                            var5.field6135 = false;
                            continue;
                        }
                    } else if ((var5.field2802 & 0x1FF) != 256 || (var5.field2810 & 0x1FF) != 256) {
                        var5.field6135 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field2802 >> 9;
                        int var8 = var5.field2810 >> 9;
                        if (class689.field9214[var7][var8] != var5.field6144) {
                            var5.field6135 = true;
                            continue;
                        }
                        if (class227.field2932[var7][var8] > 1) {
                            var10002 = class227.field2932[var7][var8]--;
                            var5.field6135 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field2802 - var9 >> 9;
                        int var11 = var5.field2810 - var9 >> 9;
                        int var12 = var5.field2802 + var9 >> 9;
                        int var13 = var5.field2810 + var9 >> 9;
                        if (!class654.method3635(var12, var5.field6144, 127, var10, var13, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class689.field9214[var14][var15] == var5.field6144) {
                                        var10002 = class227.field2932[var14][var15]--;
                                    }
                                }
                            }
                            var5.field6135 = true;
                            continue;
                        }
                    }
                    var5.field6135 = false;
                    var5.field2815 = class778.method4273(var5.field2810, (byte) -127, var5.field2802, var5.field2813);
                    class359.method2278(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method2038(boolean arg0) {
        field4508++;
        if (class125.field1721.field5141.method2541(43) == 2) {
            try {
                this.method2058((byte) 89);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class607.method3379(var5.getMessage() + " (Recovered) " + this.method2031(-31064), var5, true);
                class40.field414 = true;
                class399.method2434(false, (byte) -47, 0);
            }
        } else {
            this.method2058((byte) 109);
        }
        if (!arg0) {
            field4512 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final synchronized void method2039(byte arg0) {
        field4514++;
        if (class552.field7624 != null && class669.field8962 == null && !class786.field10800.field3233) {
            try {
                Class var2 = class552.field7624.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class669.field8962 = (Canvas) var3.get(class552.field7624);
                var3.set(class552.field7624, null);
                if (class669.field8962 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method2039(arg0);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method2040(int arg0) {
        field4495++;
        if (class311.field4401 < class479.field6732.field103) {
            class102.field1464.method3734(374);
            class703.field9347 = (class479.field6732.field103 - 1) * 50 * 5;
            if (class703.field9347 > 3000) {
                class703.field9347 = 3000;
            }
            if (class479.field6732.field103 >= 2 && class479.field6732.field105 == 6) {
                this.method4215("js5connect_outofdate", 1000);
                class780.field10712 = 14;
                return;
            }
            if (class479.field6732.field103 >= 4 && class479.field6732.field105 == -1) {
                this.method4215("js5crc", 1000);
                class780.field10712 = 14;
                return;
            }
            if (class479.field6732.field103 >= 4 && class236.method1499((byte) 62, class780.field10712)) {
                if (class479.field6732.field105 == 7 || class479.field6732.field105 == 9) {
                    this.method4215("js5connect_full", 1000);
                } else if (class479.field6732.field105 <= 0) {
                    this.method4215("js5io", 1000);
                } else if (class458.field6541 == null) {
                    this.method4215("js5connect", 1000);
                } else {
                    this.method4215("js5proxy_" + class458.field6541.trim(), 1000);
                }
                class780.field10712 = 14;
                return;
            }
        }
        class311.field4401 = class479.field6732.field103;
        if (class703.field9347 > 0) {
            class703.field9347--;
        } else if (arg0 < -83) {
            try {
                if (class128.field1767 == 0) {
                    class66.field899 = class102.field1464.method3736(class786.field10800, (byte) -10);
                    class128.field1767++;
                }
                if (class128.field1767 == 1) {
                    if (class66.field899.field8405 == 2) {
                        if (class66.field899.field8403 != null) {
                            class458.field6541 = (String) class66.field899.field8403;
                        }
                        this.method2032(82, 1000);
                        return;
                    }
                    if (class66.field899.field8405 == 1) {
                        class128.field1767++;
                    }
                }
                if (class128.field1767 == 2) {
                    class83.field1178 = new class443((Socket) class66.field899.field8403, class786.field10800, 25000);
                    class254 var2 = new class254(5);
                    var2.method1725(class377.field5496.field5208, 31);
                    var2.method1686(-107, 645);
                    class83.field1178.method2649(false, 5, var2.field3789, 0);
                    class128.field1767++;
                    class72.field969 = class401.method2440(false);
                }
                if (class128.field1767 == 3) {
                    if (class236.method1499((byte) 76, class780.field10712) || class83.field1178.method2645((byte) 71) > 0) {
                        int var3 = class83.field1178.method2644(0);
                        if (var3 != 0) {
                            this.method2032(82, var3);
                            return;
                        }
                        class128.field1767++;
                    } else if (class401.method2440(false) - class72.field969 > 30000L) {
                        this.method2032(82, 1001);
                        return;
                    }
                }
                if (class128.field1767 == 4) {
                    boolean var4 = class236.method1499((byte) 57, class780.field10712) || class235.method1490((byte) 54, class780.field10712) || class586.method3297(true, class780.field10712);
                    class410[] var5 = class410.method2464(1);
                    class254 var6 = new class254(var5.length * 4);
                    class83.field1178.method2648(0, var6.field3789, var6.field3789.length, false);
                    for (int var7 = 0; var7 < var5.length; var7++) {
                        var5[var7].method2462(var6.method1672(-16516), (byte) -108);
                    }
                    class479.field6732.method62(class83.field1178, (byte) 116, !var4);
                    class66.field899 = null;
                    class83.field1178 = null;
                    class128.field1767 = 0;
                }
            } catch (IOException var8) {
                this.method2032(82, 1002);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lofa;IIIIIIIIIII)V")
    public static final void method2041(class347[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label824: for (int var12 = 0; var12 < arg0.length; var12++) {
            class347 var13 = arg0[var12];
            if (var13 != null && var13.field4921 == arg1) {
                int var14 = var13.field4934 + arg6;
                int var15 = var13.field4887 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field4884 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field4986 + var14;
                    int var21 = var13.field4940 + var15;
                    if (var13.field4884 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field4884 == 0 || var13.field4960 || method2055(var13).field4635 != 0 || class237.field3155 == var13 || class480.field6742 == var13.field4970 || class696.field9243 == var13.field4970) {
                    if (!method2034(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class24.field246) {
                            var22 = class186.method1252(0);
                            var23 = class550.method3163(16383);
                        }
                        if (class528.field7306 == var13 && class733.method4045(-24216, class528.field7306) != null) {
                            class157.field2116 = true;
                            class451.field6473 = var14;
                            class113.field1542 = var15;
                        }
                        if (var13.field5047 || var16 < var18 && var17 < var19) {
                            if (var13.field4935 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class158 var24 = (class158) class780.field10708.method679((byte) -86); var24 != null; var24 = (class158) class780.field10708.method681(-36)) {
                                    if (var24.field2126) {
                                        var24.method1102((byte) 85);
                                        var24.field2137.field4899 = false;
                                    }
                                }
                                if (class735.field9960 == 0) {
                                    class528.field7306 = null;
                                    class237.field3155 = null;
                                }
                                class28.field281 = 0;
                                class284.field4084 = false;
                                class113.field1541 = false;
                                if (!class677.field9075) {
                                    class473.method2753(-15151);
                                }
                            }
                            boolean var25;
                            if (class494.field6961.method1652(0) + var22 >= var16 && class494.field6961.method1663((byte) 127) + var23 >= var17 && class494.field6961.method1652(0) + var22 < var18 && class494.field6961.method1663((byte) 119) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class506.field7094 && var25) {
                                if (var13.field4947 >= 0) {
                                    class2.field22 = var13.field4947;
                                } else if (var13.field4935) {
                                    class2.field22 = -1;
                                }
                            }
                            if (!class677.field9075 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class577.method3270(var13, arg11 - var15, arg10 - var14, true);
                            }
                            boolean var26 = false;
                            if (class494.field6961.method1661((byte) 127) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class428 var28 = (class428) class318.field4527.method679((byte) -86);
                            if (var28 != null && var28.method376((byte) -29) == 0 && var28.method375(117) + var22 >= var16 && var28.method379(true) + var23 >= var17 && var28.method375(122) + var22 < var18 && var28.method379(true) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field5021 != null && !class68.method575(-22203)) {
                                for (int var29 = 0; var29 < var13.field5021.length; var29++) {
                                    if (class235.field3128.method983(101, var13.field5021[var29])) {
                                        if (var13.field4981 == null || class572.field7788 >= var13.field4981[var29]) {
                                            byte var30 = var13.field4904[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class235.field3128.method983(101, 86) && !class235.field3128.method983(101, 82) && !class235.field3128.method983(101, 81)) && ((var30 & 0x2) == 0 || class235.field3128.method983(101, 86)) && ((var30 & 0x1) == 0 || class235.field3128.method983(101, 82)) && ((var30 & 0x4) == 0 || class235.field3128.method983(101, 81))) {
                                                if (var29 < 10) {
                                                    class711.method3947(73, -1, var13.field5003, "", var29 + 1);
                                                } else if (var29 == 10) {
                                                    class579.method3278(-1);
                                                    class327 var31 = method2055(var13);
                                                    class485.method2839(var31.field4640, var13, (byte) -44, var31.method2114(-106));
                                                    class385.field5594 = class87.method699(-18920, var13);
                                                    if (class385.field5594 == null) {
                                                        class385.field5594 = "Null";
                                                    }
                                                    class545.field7534 = var13.field5036 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field4918[var29];
                                                if (var13.field4981 == null) {
                                                    var13.field4981 = new int[var13.field5021.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field4981[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field4981[var29] = class572.field7788 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field4981 != null) {
                                        var13.field4981[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class657.method3652(-8674, var22 + var28.method375(124) - var14, var23 + var28.method379(true) - var15, var13);
                            }
                            if (class528.field7306 != null && class528.field7306 != var13 && var25 && method2055(var13).method2113((byte) 58)) {
                                class336.field4737 = var13;
                            }
                            if (class237.field3155 == var13) {
                                class178.field2351 = true;
                                class154.field2089 = var14;
                                class350.field5105 = var15;
                            }
                            if (var13.field4960 || var13.field4970 != 0) {
                                if (var25 && class685.field9162 != 0 && var13.field4907 != null) {
                                    class158 var33 = new class158();
                                    var33.field2126 = true;
                                    var33.field2137 = var13;
                                    var33.field2123 = class685.field9162;
                                    var33.field2128 = var13.field4907;
                                    class780.field10708.method689(var33, 118);
                                }
                                if (class528.field7306 != null || class677.field9075 || class341.field4782 != var13.field4970 && class28.field281 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field4970 != 0) {
                                    if (class386.field5614 == var13.field4970 || class730.field9896 == var13.field4970) {
                                        class400.field5718 = var13;
                                        if (class126.field1734 != null) {
                                            class126.field1734.method2178(class375.field5490, 0, var13.field4940);
                                        }
                                        if (class386.field5614 == var13.field4970) {
                                            if (class677.field9075 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class32.method179(0, arg8, class375.field5490, arg9);
                                            class480 var34 = (class480) class572.field7792.method2189((byte) 96);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label824;
                                                }
                                                if (arg10 >= var34.field6738 && arg10 < var34.field6746 && arg11 >= var34.field6743 && arg11 < var34.field6744) {
                                                    class473.method2753(-15151);
                                                    class761.method4194(var34.field6739, true);
                                                }
                                                var34 = (class480) class572.field7792.method2192(0);
                                            }
                                        }
                                    }
                                    if (class480.field6742 == var13.field4970) {
                                        if (var13.method2214((byte) 39, class375.field5490) == null || class8.field70 != 0 && class8.field70 != 3 || class677.field9075 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field4995[var36];
                                        if (var35 < var37 || var35 > var13.field4979[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field4986 / 2;
                                        int var39 = var36 - var13.field4940 / 2;
                                        int var40;
                                        if (class697.field9252 == 4) {
                                            var40 = (int) class514.field7144 & 0x3FFF;
                                        } else {
                                            var40 = (int) class514.field7144 + class551.field7614 & 0x3FFF;
                                        }
                                        int var41 = class110.field1524[var40];
                                        int var42 = class110.field1523[var40];
                                        if (class697.field9252 != 4) {
                                            var41 = (class767.field10544 + 256) * var41 >> 8;
                                            var42 = (class767.field10544 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class697.field9252 == 4) {
                                            var45 = (class46.field479 >> 9) + (var43 >> 2);
                                            var46 = (class265.field3902 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class625.field8475.method2563(-12840) - 1) * 256;
                                            var45 = (class625.field8475.field2802 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class625.field8475.field2810 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class506.field7094 && (class384.field5578 & 0x40) != 0) {
                                            class347 var48 = class90.method717(class294.field4170, class658.field8875, (byte) -42);
                                            if (var48 == null) {
                                                class579.method3278(-1);
                                            } else {
                                                class26.method147(var13.field4956, true, class385.field5594, 1L, 3, var46, " ->", (long) (var13.field4955 << 0 | var13.field5003), true, var45, -1, class182.field2384, false);
                                            }
                                            continue;
                                        }
                                        if (class682.field9122 == class426.field6204) {
                                            class26.method147(-1, true, class58.field724.method365(class55.field647, (byte) 56), 1L, 9, var46, "", 0L, true, var45, -1, -1, false);
                                        }
                                        class26.method147(-1, true, class384.field5580, 1L, 8, var46, "", 0L, true, var45, -1, class333.field4717, false);
                                        continue;
                                    }
                                    if (class341.field4782 == var13.field4970) {
                                        class254.field3722 = var13;
                                        if (var25) {
                                            class284.field4084 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method375(123) - var14 - var13.field4986 / 2) * 2.0D / (double) class752.field10166);
                                            int var50 = (int) (-((double) (var23 + var28.method379(true) - var15 - var13.field4940 / 2) * 2.0D / (double) class752.field10166));
                                            int var51 = class720.field9789 + var49 + class752.field10177;
                                            int var52 = class81.field1129 + var50 + class752.field10178;
                                            class199 var53 = class768.method4233(false);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method1305(var51, var54, -1, var52);
                                            if (var54 != null) {
                                                if (class235.field3128.method983(101, 82) && class479.field6726 > 0) {
                                                    class537.method3117(var54[0], var54[1], -15913, var54[2]);
                                                    continue;
                                                }
                                                class113.field1541 = true;
                                                class159.field2147 = var54[0];
                                                class228.field2946 = var54[1];
                                                class715.field9757 = var54[2];
                                            }
                                            class28.field281 = 1;
                                            class755.field10217 = false;
                                            class723.field9822 = class494.field6961.method1652(0);
                                            class99.field1441 = class494.field6961.method1663((byte) 115);
                                            continue;
                                        }
                                        if (var26 && class28.field281 > 0) {
                                            if (class28.field281 == 1 && (class723.field9822 != class494.field6961.method1652(0) || class99.field1441 != class494.field6961.method1663((byte) 114))) {
                                                class6.field43 = class720.field9789;
                                                class529.field7320 = class81.field1129;
                                                class28.field281 = 2;
                                            }
                                            if (class28.field281 == 2) {
                                                class755.field10217 = true;
                                                class597.method3343(class6.field43 + (int) ((double) (class723.field9822 - class494.field6961.method1652(0)) * 2.0D / (double) class752.field10160), 0);
                                                class738.method4069(-97, class529.field7320 - (int) ((double) (class99.field1441 - class494.field6961.method1663((byte) 124)) * 2.0D / (double) class752.field10160));
                                            }
                                            continue;
                                        }
                                        if (class28.field281 > 0 && !class755.field10217) {
                                            if ((class151.field2051 == 1 || class563.method3207((byte) 100)) && class269.field3929 > 2) {
                                                class262.method1769((byte) 106, class723.field9822, class99.field1441);
                                            } else if (class1.method5(-9112)) {
                                                class262.method1769((byte) 106, class723.field9822, class99.field1441);
                                            }
                                        }
                                        class28.field281 = 0;
                                        continue;
                                    }
                                    if (class751.field10149 == var13.field4970) {
                                        if (var26) {
                                            class341.method2169(0, var13.field4940, var22 + class494.field6961.method1652(0) - var14, var13.field4986, var23 + class494.field6961.method1663((byte) 124) - var15);
                                        }
                                        continue;
                                    }
                                    if (class696.field9243 == var13.field4970) {
                                        class275.method1808(var15, var14, 119, var13);
                                        continue;
                                    }
                                }
                                if (!var13.field4905 && var27) {
                                    var13.field4905 = true;
                                    if (var13.field4996 != null) {
                                        class158 var55 = new class158();
                                        var55.field2126 = true;
                                        var55.field2137 = var13;
                                        var55.field2129 = var22 + var28.method375(111) - var14;
                                        var55.field2123 = var23 + var28.method379(true) - var15;
                                        var55.field2128 = var13.field4996;
                                        class780.field10708.method689(var55, 121);
                                    }
                                }
                                if (var13.field4905 && var26 && var13.field4889 != null) {
                                    class158 var56 = new class158();
                                    var56.field2126 = true;
                                    var56.field2137 = var13;
                                    var56.field2129 = var22 + class494.field6961.method1652(0) - var14;
                                    var56.field2123 = var23 + class494.field6961.method1663((byte) 117) - var15;
                                    var56.field2128 = var13.field4889;
                                    class780.field10708.method689(var56, 120);
                                }
                                if (var13.field4905 && !var26) {
                                    var13.field4905 = false;
                                    if (var13.field4880 != null) {
                                        class158 var57 = new class158();
                                        var57.field2126 = true;
                                        var57.field2137 = var13;
                                        var57.field2129 = var22 + class494.field6961.method1652(0) - var14;
                                        var57.field2123 = var23 + class494.field6961.method1663((byte) 115) - var15;
                                        var57.field2128 = var13.field4880;
                                        class345.field4840.method689(var57, 99);
                                    }
                                }
                                if (var26 && var13.field4881 != null) {
                                    class158 var58 = new class158();
                                    var58.field2126 = true;
                                    var58.field2137 = var13;
                                    var58.field2129 = var22 + class494.field6961.method1652(0) - var14;
                                    var58.field2123 = var23 + class494.field6961.method1663((byte) 124) - var15;
                                    var58.field2128 = var13.field4881;
                                    class780.field10708.method689(var58, -106);
                                }
                                if (!var13.field4899 && var25) {
                                    var13.field4899 = true;
                                    if (var13.field5017 != null) {
                                        class158 var59 = new class158();
                                        var59.field2126 = true;
                                        var59.field2137 = var13;
                                        var59.field2129 = var22 + class494.field6961.method1652(0) - var14;
                                        var59.field2123 = var23 + class494.field6961.method1663((byte) 126) - var15;
                                        var59.field2128 = var13.field5017;
                                        class780.field10708.method689(var59, 101);
                                    }
                                }
                                if (var13.field4899 && var25 && var13.field4891 != null) {
                                    class158 var60 = new class158();
                                    var60.field2126 = true;
                                    var60.field2137 = var13;
                                    var60.field2129 = var22 + class494.field6961.method1652(0) - var14;
                                    var60.field2123 = var23 + class494.field6961.method1663((byte) 116) - var15;
                                    var60.field2128 = var13.field4891;
                                    class780.field10708.method689(var60, 125);
                                }
                                if (var13.field4899 && !var25) {
                                    var13.field4899 = false;
                                    if (var13.field5041 != null) {
                                        class158 var61 = new class158();
                                        var61.field2126 = true;
                                        var61.field2137 = var13;
                                        var61.field2129 = var22 + class494.field6961.method1652(0) - var14;
                                        var61.field2123 = var23 + class494.field6961.method1663((byte) 114) - var15;
                                        var61.field2128 = var13.field5041;
                                        class345.field4840.method689(var61, -52);
                                    }
                                }
                                if (var13.field5018 != null) {
                                    class158 var62 = new class158();
                                    var62.field2137 = var13;
                                    var62.field2128 = var13.field5018;
                                    class80.field1101.method689(var62, 112);
                                }
                                if (var13.field4945 != null && class70.field957 > var13.field4939) {
                                    if (var13.field4911 == null || class70.field957 - var13.field4939 > 32) {
                                        class158 var67 = new class158();
                                        var67.field2137 = var13;
                                        var67.field2128 = var13.field4945;
                                        class780.field10708.method689(var67, -59);
                                    } else {
                                        label711: for (int var63 = var13.field4939; var63 < class70.field957; var63++) {
                                            int var64 = class761.field10454[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field4911.length; var65++) {
                                                if (var13.field4911[var65] == var64) {
                                                    class158 var66 = new class158();
                                                    var66.field2137 = var13;
                                                    var66.field2128 = var13.field4945;
                                                    class780.field10708.method689(var66, 100);
                                                    break label711;
                                                }
                                            }
                                        }
                                    }
                                    var13.field4939 = class70.field957;
                                }
                                if (var13.field4948 != null && class214.field2807 > var13.field5040) {
                                    if (var13.field4968 == null || class214.field2807 - var13.field5040 > 32) {
                                        class158 var72 = new class158();
                                        var72.field2137 = var13;
                                        var72.field2128 = var13.field4948;
                                        class780.field10708.method689(var72, -4);
                                    } else {
                                        label687: for (int var68 = var13.field5040; var68 < class214.field2807; var68++) {
                                            int var69 = class514.field7145[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field4968.length; var70++) {
                                                if (var13.field4968[var70] == var69) {
                                                    class158 var71 = new class158();
                                                    var71.field2137 = var13;
                                                    var71.field2128 = var13.field4948;
                                                    class780.field10708.method689(var71, 106);
                                                    break label687;
                                                }
                                            }
                                        }
                                    }
                                    var13.field5040 = class214.field2807;
                                }
                                if (var13.field5020 != null && class588.field8010 > var13.field4962) {
                                    if (var13.field4929 == null || class588.field8010 - var13.field4962 > 32) {
                                        class158 var77 = new class158();
                                        var77.field2137 = var13;
                                        var77.field2128 = var13.field5020;
                                        class780.field10708.method689(var77, 113);
                                    } else {
                                        label663: for (int var73 = var13.field4962; var73 < class588.field8010; var73++) {
                                            int var74 = class313.field4422[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field4929.length; var75++) {
                                                if (var13.field4929[var75] == var74) {
                                                    class158 var76 = new class158();
                                                    var76.field2137 = var13;
                                                    var76.field2128 = var13.field5020;
                                                    class780.field10708.method689(var76, -77);
                                                    break label663;
                                                }
                                            }
                                        }
                                    }
                                    var13.field4962 = class588.field8010;
                                }
                                if (var13.field4967 != null && class79.field1086 > var13.field4937) {
                                    if (var13.field5039 == null || class79.field1086 - var13.field4937 > 32) {
                                        class158 var82 = new class158();
                                        var82.field2137 = var13;
                                        var82.field2128 = var13.field4967;
                                        class780.field10708.method689(var82, 104);
                                    } else {
                                        label639: for (int var78 = var13.field4937; var78 < class79.field1086; var78++) {
                                            int var79 = class573.field7813[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field5039.length; var80++) {
                                                if (var13.field5039[var80] == var79) {
                                                    class158 var81 = new class158();
                                                    var81.field2137 = var13;
                                                    var81.field2128 = var13.field4967;
                                                    class780.field10708.method689(var81, -107);
                                                    break label639;
                                                }
                                            }
                                        }
                                    }
                                    var13.field4937 = class79.field1086;
                                }
                                if (var13.field4998 != null && class611.field8258 > var13.field4915) {
                                    if (var13.field5042 == null || class611.field8258 - var13.field4915 > 32) {
                                        class158 var87 = new class158();
                                        var87.field2137 = var13;
                                        var87.field2128 = var13.field4998;
                                        class780.field10708.method689(var87, 100);
                                    } else {
                                        label615: for (int var83 = var13.field4915; var83 < class611.field8258; var83++) {
                                            int var84 = class324.field4599[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field5042.length; var85++) {
                                                if (var13.field5042[var85] == var84) {
                                                    class158 var86 = new class158();
                                                    var86.field2137 = var13;
                                                    var86.field2128 = var13.field4998;
                                                    class780.field10708.method689(var86, -122);
                                                    break label615;
                                                }
                                            }
                                        }
                                    }
                                    var13.field4915 = class611.field8258;
                                }
                                if (class124.field1712 > var13.field5045 && var13.field4943 != null) {
                                    class158 var88 = new class158();
                                    var88.field2137 = var13;
                                    var88.field2128 = var13.field4943;
                                    class780.field10708.method689(var88, -100);
                                }
                                if (class462.field6564 > var13.field5045 && var13.field4923 != null) {
                                    class158 var89 = new class158();
                                    var89.field2137 = var13;
                                    var89.field2128 = var13.field4923;
                                    class780.field10708.method689(var89, 116);
                                }
                                if (class317.field4468 > var13.field5045 && var13.field5033 != null) {
                                    class158 var90 = new class158();
                                    var90.field2137 = var13;
                                    var90.field2128 = var13.field5033;
                                    class780.field10708.method689(var90, -125);
                                }
                                if (class89.field1264 > var13.field5045 && var13.field4878 != null) {
                                    class158 var91 = new class158();
                                    var91.field2137 = var13;
                                    var91.field2128 = var13.field4878;
                                    class780.field10708.method689(var91, -5);
                                }
                                if (class346.field4861 > var13.field5045 && var13.field4980 != null) {
                                    class158 var92 = new class158();
                                    var92.field2137 = var13;
                                    var92.field2128 = var13.field4980;
                                    class780.field10708.method689(var92, -104);
                                }
                                if (class494.field6967 > var13.field5045 && var13.field4908 != null) {
                                    class158 var93 = new class158();
                                    var93.field2137 = var13;
                                    var93.field2128 = var13.field4908;
                                    class780.field10708.method689(var93, 104);
                                }
                                if (class183.field2411 > var13.field5045 && var13.field5007 != null) {
                                    class158 var94 = new class158();
                                    var94.field2137 = var13;
                                    var94.field2128 = var13.field5007;
                                    class780.field10708.method689(var94, 119);
                                }
                                var13.field5045 = class701.field9280;
                                if (var13.field4953 != null) {
                                    for (int var95 = 0; var95 < class735.field9967; var95++) {
                                        class158 var96 = new class158();
                                        var96.field2137 = var13;
                                        var96.field2132 = class123.field1707[var95].method1991(32262);
                                        var96.field2136 = class123.field1707[var95].method1989((byte) -79);
                                        var96.field2128 = var13.field4953;
                                        class780.field10708.method689(var96, -20);
                                    }
                                }
                                if (class303.field4256 && var13.field5034 != null) {
                                    class158 var97 = new class158();
                                    var97.field2137 = var13;
                                    var97.field2128 = var13.field5034;
                                    class780.field10708.method689(var97, -30);
                                }
                            }
                            if (var13.field4884 == 5 && var13.field4873 != -1) {
                                var13.method2218(458233568, class297.field4200, class629.field8517).method2178(class375.field5490, 0, var13.field4940);
                            }
                            class526.method3051((byte) 105, var13);
                            if (var13.field4884 == 0) {
                                method2041(arg0, var13.field5003, var16, var17, var18, var19, var14 - var13.field5004, var15 - var13.field4949, arg8, arg9, arg10, arg11);
                                if (var13.field4928 != null) {
                                    method2041(var13.field4928, var13.field5003, var16, var17, var18, var19, var14 - var13.field5004, var15 - var13.field4949, arg8, arg9, arg10, arg11);
                                }
                                class73 var98 = (class73) class355.field5178.method1248(85, (long) var13.field5003);
                                if (var98 != null) {
                                    if (class743.field10050 == class426.field6204 && var98.field993 == 0 && !class677.field9075 && var25 && !class341.field4764) {
                                        class473.method2753(-15151);
                                    }
                                    class180.method1225(var18, var16, arg8, arg11, var14, arg10, var15, false, var98.field985, var19, arg9, var17);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class526.method3051((byte) -80, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method2042(int arg0) {
        int var1 = class652.field8795;
        int[] var2 = class497.field6986;
        for (int var3 = 0; var3 < class178.field2352 + var1; var3++) {
            class425 var4;
            if (var3 < var1) {
                var4 = class84.field1204[var2[var3]];
            } else {
                var4 = ((class316) class176.field2326.method1248(122, (long) class245.field3206[var3 - var1])).field4455;
            }
            if (var4.field2813 == arg0 && var4.field6144 >= 0) {
                int var5 = var4.method2563(-12840);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2802 & 0x1FF) != 0 || (var4.field2810 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field2802 & 0x1FF) != 256 || (var4.field2810 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field2802 >> 9;
                    int var7 = var4.field2810 >> 9;
                    if (var4.field6144 > class689.field9214[var6][var7]) {
                        class689.field9214[var6][var7] = var4.field6144;
                        class227.field2932[var6][var7] = 1;
                    } else if (class689.field9214[var6][var7] == var4.field6144) {
                        var10002 = class227.field2932[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field2802 - var8 >> 9;
                    int var10 = var4.field2810 - var8 >> 9;
                    int var11 = var4.field2802 + var8 >> 9;
                    int var12 = var4.field2810 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field6144 > class689.field9214[var13][var14]) {
                                class689.field9214[var13][var14] = var4.field6144;
                                class227.field2932[var13][var14] = 1;
                            } else if (class689.field9214[var13][var14] == var4.field6144) {
                                var10002 = class227.field2932[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method2043(int arg0) {
        if (class368.field5315) {
            class115.field1557 = 64;
        }
        field4511++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class642.method3535(-1);
        class688.field9200 = new class598(class786.field10800);
        class479.field6732 = new class9();
        class11.method77(26883, new int[] { 20, 260 }, new int[] { 1000, 100 });
        if (arg0 != 40000) {
            field4512 = null;
        }
        if (class554.field7645 != class222.field2884) {
            class270.field3936 = new byte[50][];
        }
        class125.field1721 = class317.method2028(77);
        if (class554.field7645 == class222.field2884) {
            class356.field5196.field9101 = this.getCodeBase().getHost();
        } else if (class196.method1289((byte) -104, class554.field7645)) {
            class356.field5196.field9101 = this.getCodeBase().getHost();
            class356.field5196.field9102 = class356.field5196.field9099 + 40000;
            class394.field5678.field9102 = class394.field5678.field9099 + 40000;
            class356.field5196.field9095 = class356.field5196.field9099 + 50000;
            class168.field2215.field9102 = class168.field2215.field9099 + 40000;
            class394.field5678.field9095 = class394.field5678.field9099 + 50000;
            class168.field2215.field9095 = class168.field2215.field9099 + 50000;
        } else if (class554.field7645 == class135.field1836) {
            class356.field5196.field9101 = "127.0.0.1";
            class394.field5678.field9101 = "127.0.0.1";
            class356.field5196.field9102 = class356.field5196.field9099 + 40000;
            class168.field2215.field9101 = "127.0.0.1";
            class394.field5678.field9102 = class394.field5678.field9099 + 40000;
            class356.field5196.field9095 = class356.field5196.field9099 + 50000;
            class168.field2215.field9102 = class168.field2215.field9099 + 40000;
            class394.field5678.field9095 = class394.field5678.field9099 + 50000;
            class168.field2215.field9095 = class168.field2215.field9099 + 50000;
        }
        if (class743.field10050 == class426.field6204) {
            class600.field8179 = false;
        }
        class102.field1464 = class356.field5196;
        class394.field5675 = class489.field6819 = class66.field905 = class492.field6924 = new short[256];
        if (class682.field9122 == class426.field6204) {
            class448.field6453 = class708.field9675;
            class441.field6339 = 16777215;
            class494.field6965 = 0;
            class511.field7120 = class502.field7055;
            class186.field2437 = true;
        } else if (class426.field6204 == class333.field4716) {
            class511.field7120 = class464.field6581;
            class448.field6453 = class372.field5435;
        } else {
            class511.field7120 = class356.field5195;
            class448.field6453 = class762.field10467;
        }
        try {
            class26.field257 = class723.field9821.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class235.field3128 = class335.method2150(true, class669.field8962);
        class494.field6961 = class10.method67((byte) -127, class669.field8962, true);
        try {
            if (class786.field10800.field3252 != null) {
                class482.field6761 = new class346(class786.field10800.field3252, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class485.field6777[var3] = new class346(class786.field10800.field3254[var3], 6000, 0);
                }
                class7.field52 = new class346(class786.field10800.field3236, 6000, 0);
                class95.field1331 = new class79(255, class482.field6761, class7.field52, 500000);
                class351.field5121 = new class346(class786.field10800.field3257, 24, 0);
                class786.field10800.field3257 = null;
                class786.field10800.field3252 = null;
                class786.field10800.field3236 = null;
                class786.field10800.field3254 = null;
            }
        } catch (IOException var5) {
            class482.field6761 = null;
            class7.field52 = null;
            class95.field1331 = null;
            class351.field5121 = null;
        }
        if (class554.field7645 != class222.field2884) {
            class275.field3992 = true;
        }
        class531.field7338 = class58.field709.method365(class55.field647, (byte) 73);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lofa;)Lofa;")
    public static final class347 method2044(class347 arg0) {
        int var1 = method2055(arg0).method2115(-107);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class445.method2655(arg0.field4921, (byte) 114);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static void method2045(int arg0) {
        field4512 = null;
        if (arg0 != 0) {
            method2037(119);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method2046() {
        int var0 = class652.field8795;
        int[] var1 = class497.field6986;
        int var2 = class181.field2378 ? var0 : class178.field2352 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class425 var4;
            if (var3 < var0) {
                var4 = class84.field1204[var1[var3]];
            } else {
                var4 = ((class316) class176.field2326.method1248(85, (long) class245.field3206[var3 - var0])).field4455;
            }
            if (var4.field6144 >= 0) {
                int var5 = var4.method2563(-12840);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2802 & 0x1FF) == 0 && (var4.field2810 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field2802 & 0x1FF) == 256 && (var4.field2810 & 0x1FF) == 256) {
                    continue;
                }
                var4.field2815 = class778.method4273(var4.field2810, (byte) -110, var4.field2802, var4.field2813);
                class359.method2278(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method2047() {
        class79.field1096 = 0;
        for (int var0 = 0; var0 < class178.field2352; var0++) {
            class22 var1 = ((class316) class176.field2326.method1248(119, (long) class245.field3206[var0])).field4455;
            if (var1.field6135 && var1.method125((byte) 88) != -1) {
                int var2 = (var1.method2563(-12840) - 1) * 256 + 252;
                int var3 = var1.field2802 - var2 >> 9;
                int var4 = var1.field2810 - var2 >> 9;
                class425 var5 = class41.method235(var4, var1.field2813, var3, true);
                if (var5 != null) {
                    int var6 = var5.field6146;
                    if (var5 instanceof class22) {
                        var6 += 2048;
                    }
                    if (var5.field6116 == 0 && var5.method125((byte) 81) != -1) {
                        class322.field4569[class79.field1096] = var6;
                        class592.field8086[class79.field1096] = var6;
                        class79.field1096++;
                        var5.field6116++;
                    }
                    class322.field4569[class79.field1096] = var6;
                    class592.field8086[class79.field1096] = var1.field6146 + 2048;
                    class79.field1096++;
                    var5.field6116++;
                }
            }
        }
        class627.method3468(class322.field4569, 90, 0, class79.field1096 - 1, class592.field8086);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method2048() {
        for (int var0 = 0; var0 < class102.field1467; var0++) {
            int[] var1 = class689.field9214[var0];
            for (int var2 = 0; var2 < class393.field5663; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method2049(String arg0, boolean arg1) {
        field4496++;
        if (arg0 == null) {
            return false;
        }
        if (arg1) {
            field4512 = null;
        }
        for (int var2 = 0; var2 < class664.field8915; var2++) {
            if (arg0.equalsIgnoreCase(class560.field7682[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class196.field2542[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method2050(byte arg0) {
        field4513++;
        if (class780.field10712 == 14) {
            return;
        }
        class572.field7788++;
        if (class572.field7788 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class36.field382 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class81.field1115.setSeed((long) class36.field382);
        }
        if ((class572.field7788 % 50) == 0) {
            class34.field370 = class222.field2877;
            class222.field2877 = 0;
            class732.field9909 = class23.field234;
            class23.field234 = 0;
        }
        this.method2052(-76);
        if (class454.field6507 != null) {
            class454.field6507.method2546(-123);
        }
        int var3 = -119 % ((arg0 + 58) / 39);
        class110.method826((byte) 56);
        class760.method4185(79);
        class235.field3128.method980(201);
        class494.field6961.method1658(0);
        if (class375.field5490 != null) {
            class375.field5490.method533((int) class401.method2440(false));
        }
        class134.method943(2);
        class243.field3194 = 0;
        class735.field9967 = 0;
        for (class622 var4 = class235.field3128.method981(true); var4 != null; var4 = class235.field3128.method981(true)) {
            int var7 = var4.method1993(15733);
            if (var7 == 2 || var7 == 3) {
                char var8 = var4.method1989((byte) 86);
                if (class303.method1957(1) && (var8 == '`' || var8 == '§' || var8 == '²')) {
                    if (class68.method575(-22203)) {
                        class515.method3010(true);
                    } else {
                        class466.method2740(false);
                    }
                } else if (class735.field9967 < 128) {
                    class123.field1707[class735.field9967] = var4;
                    class735.field9967++;
                }
            } else if (var7 == 0 && class243.field3194 < 75) {
                class133.field1822[class243.field3194] = var4;
                class243.field3194++;
            }
        }
        class685.field9162 = 0;
        for (class428 var5 = class494.field6961.method1653(-7049); var5 != null; var5 = class494.field6961.method1653(-7049)) {
            int var6 = var5.method376((byte) -29);
            if (var6 == -1) {
                class555.field7655.method689(var5, 4);
            } else if (var6 == 6) {
                class685.field9162 += var5.method377(-122);
            } else if (class235.method1491((byte) 35, var6)) {
                class318.field4527.method689(var5, -42);
                if (class318.field4527.method684(-34) > 10) {
                    class318.field4527.method687((byte) -105);
                }
            }
        }
        if (class68.method575(-22203)) {
            class733.method4042(12569);
        }
        if (class236.method1499((byte) 79, class780.field10712)) {
            class394.method2423(true);
            class597.method3344((byte) -36);
        } else if (class729.method4031((byte) -101, class780.field10712)) {
            class132.method932((byte) -7);
        }
        if (class235.method1490((byte) 54, class780.field10712) && !class729.method4031((byte) -101, class780.field10712)) {
            this.method2053(-106);
            class416.method2505(19250);
            class687.method3769(21);
        } else if (class586.method3297(true, class780.field10712) && !class729.method4031((byte) -87, class780.field10712)) {
            this.method2053(-110);
            class687.method3769(21);
        } else if (class780.field10712 == 12) {
            class687.method3769(21);
        } else if (class487.method2845(class780.field10712, (byte) 26) && !class729.method4031((byte) -114, class780.field10712)) {
            class452.method2684(true);
        } else if (class780.field10712 == 13) {
            class687.method3769(21);
            if (class14.field146 != -3 && class14.field146 != 2 && class14.field146 != 15) {
                class87.method696(false, -119);
            }
        }
        class315.method2014(-102, class375.field5490);
        class318.field4527.method687((byte) -88);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method2051(boolean arg0) {
        field4503++;
        method2045(0);
        class743.method4084(0);
        class58.method367(false);
        class141.method986(-110);
        class115.method842(27);
        class112.method833(0);
        class410.method2463(-63);
        class529.method3059(70);
        class492.method2904((byte) -96);
        class257.method1753(-1);
        class607.method3382(-71);
        class659.method3657((byte) 57);
        class159.method1100(19946);
        class26.method149(-13971);
        class767.method4218(10);
        class624.method3442((byte) 58);
        class86.method692(5153);
        class134.method944((byte) 120);
        class263.method1774((byte) -94);
        class109.method819(93);
        class66.method519(true);
        class355.method2256((byte) -69);
        class734.method4046(-110);
        class436.method2615((byte) 107);
        class768.method4228(-121);
        class84.method683((byte) -119);
        class443.method2650(1);
        class9.method51((byte) 97);
        class598.method3351((byte) -111);
        class435.method2610(2261);
        class172.method1171((byte) -126);
        class346.method2198(109);
        class79.method632(5);
        class535.method3105(arg0);
        class441.method2632(false);
        class239.method1512((byte) 92);
        class123.method886(-100);
        class666.method3668((byte) -33);
        class198.method1296(120);
        class320.method2068(-112);
        class552.method3178(34);
        class646.method3588(true);
        class328.method2124(0);
        class639.method3519(11);
        class564.method3215(false);
        class384.method2383(-114);
        class753.method4128(-4353);
        class129.method915((byte) -85);
        class630.method3475(1);
        class674.method3717(-105);
        class791.method4321(113);
        class270.method1794(54);
        class609.method3390((byte) -32);
        class316.method2018(-18921);
        class23.method140(-28996);
        class254.method1701((byte) -50);
        class780.method4283(-370448894);
        class459.method2720((byte) 90);
        class519.method3019(-52);
        class246.method1527(true);
        class689.method3775(true);
        class224.method1427(-1);
        class760.method4181(arg0);
        class199.method1303((byte) -72);
        class329.method2136(-125);
        class345.method2191(-1);
        class347.method2224(false);
        class626.method3464(!arg0);
        class758.method4160((byte) -119);
        class12.method82(72);
        class124.method890(-10986);
        class95.method746(-110);
        class551.method3166((byte) 89);
        class514.method3002(-4347);
        class43.method239(arg0);
        class425.method2566(true);
        class194.method1282(-128);
        class474.method2755(true);
        class309.method1996((byte) -107);
        class22.method124(false);
        class73.method592(false);
        class327.method2112(1);
        class113.method836(16777215);
        class286.method1848((byte) 120);
        class255.method1740(126);
        class776.method4268((byte) -119);
        class605.method3376(123);
        class455.method2702((byte) -123);
        class154.method1071(28);
        class350.method2239((byte) -71);
        class680.method3735(458752);
        class391.method2416((byte) 76);
        class777.method4270(-86);
        class303.method1955((byte) -11);
        class197.method1290((byte) -88);
        class65.method433(false);
        class201.method1321(false);
        class117.method845(0);
        class236.method1498(64);
        class610.method3394((byte) -98);
        class497.method2924(73);
        class74.method600(-93);
        class720.method3973((byte) 127);
        class368.method2308((byte) -97);
        class25.method145(123);
        class412.method2476((byte) 103);
        class625.method3447(-48);
        class786.method4309((byte) 79);
        class295.method1894(false);
        class711.method3942(!arg0);
        class304.method1970(0);
        class400.method2439(true);
        class67.method574(-17319);
        class2.method11((byte) 29);
        class54.method334(29784);
        class75.method606((byte) -59);
        class52.method330(-1);
        class416.method2510(-20690);
        class672.method3706(89);
        class668.method3684(47);
        class375.method2354(1);
        class583.method3281(!arg0);
        class178.method1213(3);
        class216.method1392(0);
        class424.method2552(-119);
        class282.method1841(113);
        class389.method2411(13);
        class227.method1439(73);
        class422.method2539(125);
        class383.method2378((byte) -36);
        class228.method1444((byte) -77);
        class359.method2277(119);
        class770.method4237(74);
        class559.method3193((byte) -59);
        class7.method40(-127);
        class292.method1870((byte) 118);
        class600.method3367(6732);
        class189.method1263(arg0);
        class512.method2988(-102);
        class434.method2602(arg0);
        class651.method3624(false);
        class586.method3296(-9);
        class217.method1395(-57);
        class64.method421((byte) 63);
        class414.method2499((byte) -78);
        class702.method3832(0);
        class183.method1239(false);
        class727.method4006();
        class517.method3014(2);
        class654.method3636(0);
        class755.method4142(false);
        class433.method2585((byte) 84);
        class494.method2908((byte) 48);
        class81.method649((byte) -89);
        class728.method4023(-86);
        class774.method4258((byte) 85);
        class458.method2713((byte) 113);
        class717.method3967(76);
        class230.method1451((byte) -79);
        class249.method1559((byte) -58);
        class171.method1153(110);
        class444.method2651(-57);
        class647.method3592((byte) 102);
        class489.method2865(3);
        class442.method2642(-1);
        class523.method3037(2);
        class752.method4122();
        class144.method1007(-3670);
        class570.method3244((byte) 34);
        class366.method2303(false);
        class740.method4072(-2280);
        class151.method1063(25584);
        class574.method3261(1);
        class673.method3711((byte) 51);
        class731.method4035((byte) 101);
        class485.method2840(-11752);
        class104.method797(-113);
        class398.method2428(0);
        class138.method956(111);
        class150.method1047();
        class588.method3304((byte) -86);
        class601.method3369(0);
        class291.method1865((byte) -103);
        class464.method2734(9108);
        class483.method2838((byte) -127);
        class187.method1256((byte) 78);
        class305.method1975(true);
        class223.method1420(31509);
        class513.method2999();
        class357.method2268(-1);
        class168.method1143(14336);
        class790.method4319(-31114);
        class460.method2728(99);
        class158.method1099(0);
        class315.method2015(94);
        class285.method1847((byte) -92);
        class30.method172(arg0);
        class160.method1106((byte) 42);
        class447.method2660(127);
        class157.method1088((byte) -102);
        class629.method3473(109);
        class511.method2987((byte) -121);
        class397.method2426((byte) -114);
        class63.method389();
        class290.method1861((byte) 113);
        class220.method1407(-104);
        class60.method372();
        class638.method3511(1);
        class419.method2515(0);
        class573.method3252(-9408);
        class716.method3963(!arg0);
        class358.method2269(-105);
        class300.method1947(127);
        class119.method852(-25648);
        class590.method3319();
        class692.method3779(arg0);
        class170.method1147(100);
        class137.method951((byte) 86);
        class310.method1999((byte) -122);
        class452.method2686((byte) -106);
        class130.method920(65);
        class322.method2090(1000);
        class554.method3183(true);
        class132.method935(arg0);
        class560.method3197(false);
        class41.method236(arg0);
        class40.method230((byte) 92);
        class563.method3204(-59);
        class708.method3932(11209);
        class80.method640(true);
        class11.method75(-65);
        class388.method2404((byte) 123);
        class4.method27(4);
        class751.method4102(126);
        class608.method3389(arg0);
        class219.method1400((byte) 90);
        class498.method2926(-105);
        class496.method2914(115);
        class480.method2831(102);
        class98.method776((byte) -107);
        class655.method3645((byte) -23);
        class704.method3918((byte) 114);
        class531.method3070((byte) 26);
        class769.method4236(-29132);
        class31.method176(-92);
        class732.method4039(-125);
        class348.method2227(88);
        class361.method2286(10);
        class211.method1375(-128);
        class698.method3789((byte) 19);
        class85.method691((byte) -110);
        class353.method2246(0);
        class145.method1015(3);
        class374.method2344(-2834);
        class372.method2334(-111);
        class344.method2182(-1);
        class618.method3426(13828096);
        class661.method3662((byte) 25);
        class623.method3438(0);
        class525.method3047(29333);
        class252.method1660(-28933);
        class313.method2008(-53);
        class761.method4198(65533);
        class49.method308(false);
        class709.method3937((byte) 30);
        class593.method3333(0);
        class196.method1287(-11745);
        class68.method577((byte) -22);
        class536.method3115(109);
        class572.method3251(false);
        class684.method3747(-1);
        class611.method3399(-86);
        class577.method3273((byte) 83);
        class701.method3821(16309);
        class385.method2392(0);
        class465.method2738((byte) -98);
        class235.method1488((byte) -54);
        class669.method3694(false);
        class111.method830(59);
        class378.method2364(27947);
        class712.method3948(0);
        class339.method2162(false);
        class642.method3534(123);
        class730.method4034(1);
        class380.method2368(1);
        class336.method2154((byte) 8);
        class520.method3021(28219);
        class102.method792(false);
        class277.method1813();
        class764.method4206((byte) 67);
        class297.method1940(23111);
        class133.method937((byte) 4);
        class24.method142(94);
        class688.method3773((byte) -125);
        class128.method909(true);
        class782.method4290(-106);
        class256.method1749(0);
        class204.method1338((byte) -112);
        class324.method2099(true);
        class445.method2654((byte) 71);
        class553.method3180(true);
        class526.method3053(-125);
        class694.method3782(10810);
        class280.method1830((byte) 126);
        class518.method3015(arg0);
        class146.method1032();
        class575.method3264(-84);
        class578.method3276(49);
        class788.method4315();
        class331.method2138();
        class221.method1412(-14211);
        class362.method2291();
        class738.method4070((byte) 124);
        class325.method2101(1);
        class175.method1206(109);
        class264.method1776(67);
        class550.method3161(2);
        class545.method3140(-8483);
        class186.method1254(37);
        class781.method4285((byte) -26);
        class555.method3187((byte) -128);
        class652.method3630(2);
        class191.method1266(10);
        class540.method3126(14);
        class333.method2147((byte) 126);
        class259.method1758(-21);
        class386.method2401(63);
        class682.method3742(false);
        class180.method1227(-1019);
        class318.method2062(119);
        class155.method1073();
        class76.method612(70);
        class176.method1209(-5458);
        class302.method1950(-66);
        class620.method3435(-5950);
        class126.method895((byte) 5);
        class139.method967(382002753);
        class542.method3132(-18087);
        class69.method579(-50);
        class10.method66(-123);
        class648.method3599(0);
        class16.method89(0);
        class100.method783((byte) -127);
        class28.method160((byte) 33);
        class281.method1837((byte) -92);
        class596.method3338((byte) 69);
        class637.method3508(false);
        class714.method3956(0);
        class250.method1637(29406);
        class771.method4244(-1);
        class312.method2004(4);
        class759.method4170(true);
        class612.method3405((byte) 113);
        class584.method3287(-80);
        class131.method924((byte) -115);
        class56.method357(0);
        class82.method652((byte) 38);
        class205.method1339(0);
        class456.method2703(26609);
        class429.method2581((byte) -119);
        class411.method2468((byte) 69);
        class50.method320(!arg0);
        class135.method948((byte) -83);
        class453.method2695(99);
        class107.method807((byte) -127);
        class703.method3870(0);
        class382.method2374(-17);
        class415.method2502(-27785);
        class532.method3074(arg0);
        class37.method216(156);
        class754.method4135(64);
        class719.method3970(-1);
        class571.method3247(false);
        class426.method2574((byte) 99);
        class110.method827((byte) -103);
        class233.method1483(3);
        class166.method1138((byte) 5);
        class765.method4209(-2008870204);
        class92.method727((byte) 78);
        class269.method1791(-73);
        class757.method4151((byte) -101);
        class547.method3148((byte) 0);
        class147.method1035();
        class632.method3487(1408597892);
        class543.method3135(-63);
        class614.method3413(0);
        class42.method237(-121);
        class323.method2091(261699916);
        class18.method101(1);
        class148.method1039(-23103);
        class565.method3218(-127);
        class103.method794((byte) 45);
        class681.method3740(-124);
        class32.method177(true);
        class299.method1942((byte) 124);
        class164.method1135((byte) -17);
        class635.method3503(95);
        class276.method1811(false);
        class466.method2741(0);
        class762.method4202((byte) 58);
        class687.method3764(0);
        class202.method1333((byte) 83);
        class773.method4248((byte) -123);
        class8.method42(24171);
        class493.method2906(true);
        class597.method3345(false);
        class271.method1801(2);
        class306.method1981((byte) -69);
        class427.method2576(!arg0);
        class181.method1231((byte) -91);
        class735.method4053(52);
        class592.method3329(false);
        class533.method3097(-46);
        class326.method2107();
        class55.method337(0);
        class234.method1486(0);
        class679.method3733((byte) -121);
        class693.method3781(-441893025);
        class634.method3497(-128);
        class448.method2671(-1);
        class561.method3202(93);
        class34.method192((byte) -102);
        class182.method1235(26);
        class405.method2448((byte) -88);
        class420.method2529((byte) 109);
        class200.method1311(true);
        class548.method3154((byte) 121);
        class311.method2001(2);
        class469.method2745((byte) 120);
        class177.method1212(112);
        class338.method2160(-128);
        class251.method1649((byte) -1);
        class356.method2261((byte) -111);
        class756.method4146(false);
        class222.method1415((byte) -125);
        class685.method3758((byte) -45);
        class6.method34(false);
        class789.method4317(-21029);
        class479.method2829((byte) 13);
        class260.method1764(-109);
        class210.method1371((byte) -128);
        class631.method3486(-1);
        class393.method2419((byte) 117);
        class747.method4089(34336);
        class120.method857(10433);
        class96.method762(-32644);
        class272.method1804(19131);
        class213.method1380(0);
        class613.method3410(-97);
        class737.method4067(20);
        class710.method3938(-127);
        class482.method2836(true);
        class677.method3730(-20912);
        class658.method3655((byte) -121);
        class122.method881(-21864);
        class528.method3057(28447);
        class503.method2941(true);
        class676.method3729((byte) 114);
        class237.method1502(-1);
        class501.method2932(0);
        class599.method3359((byte) -94);
        class640.method3526(-121);
        class87.method694(14382);
        class61.method373((byte) -20);
        class90.method715(-1);
        class208.method1360((byte) -126);
        class504.method2943(6);
        class289.method1856((byte) 39);
        class462.method2730(127);
        class294.method1893(false);
        class125.method892(-104);
        class93.method729((byte) -112);
        class88.method710(-4828);
        class77.method619(-125);
        class451.method2682((byte) -19);
        class173.method1196(false);
        class83.method675((byte) -100);
        class627.method3467(0);
        class351.method2240((byte) -14);
        class39.method226(27);
        class243.method1523((byte) -128);
        class408.method2456((byte) 127);
        class15.method87((byte) 126);
        class97.method764(false);
        class363.method2298(3);
        class582.method3280((byte) -106);
        class603.method3371(-108);
        class192.method1276(27199);
        class341.method2171((byte) 6);
        class645.method3575(1);
        class33.method183(8);
        class399.method2436(-222);
        class749.method4092((byte) 106);
        class377.method2363((byte) -64);
        class116.method843((byte) -125);
        class14.method85(-48);
        class91.method721(0);
        class544.method3139((byte) 60);
        class29.method166((byte) 111);
        class784.method4304(16);
        class245.method1526(3073);
        class641.method3531(8192);
        class478.method2825((byte) 126);
        class557.method3190((byte) 109);
        class446.method2658((byte) 59);
        class649.method3605(0);
        class394.method2421(true);
        class438.method2623(255);
        class267.method1784(false);
        class562.method3203((byte) 14);
        class524.method3040((byte) -83);
        class275.method1809((byte) -109);
        class568.method3242(9421);
        class683.method3746(0);
        class253.method1667(21);
        class454.method2698((byte) 127);
        class273.method1807(1);
        class308.method1992(-30677);
        class502.method2937(-100);
        class706.method3927((byte) 14);
        class628.method3471((byte) -62);
        class365.method2302(-125);
        class238.method1506((byte) -120);
        class537.method3118(true);
        class490.method2866(0);
        class193.method1277(-2);
        class417.method2511(true);
        class643.method3539(15433);
        class657.method3649((byte) -70);
        class549.method3156(-11690);
        class99.method779(true);
        class723.method3995((byte) -83);
        class261.method1767((byte) -96);
        class775.method4263((byte) 84);
        class21.method113(-79);
        class105.method800(-11);
        class617.method3423((byte) -121);
        class437.method2619(true);
        if (class767.field10559) {
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    private final void method2052(int arg0) {
        field4510++;
        boolean var2 = class479.field6732.method58((byte) -52);
        if (arg0 != -76) {
            this.method2058((byte) -107);
        }
        if (!var2) {
            this.method2040(-111);
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    private final void method2053(int arg0) {
        field4502++;
        if (class780.field10712 == 7 && class733.field9917 == 0) {
            if (class73.field989 > 1) {
                class183.field2411 = class701.field9280;
                class73.field989--;
            }
            if (!class677.field9075) {
                class473.method2753(-15151);
            }
            for (int var2 = 0; var2 < 100 && class761.method4195((byte) 68); var2++) {
            }
        }
        class643.field8659++;
        class260.method1763(null, -1, -117, -1);
        class275.method1808(-1, -1, 119, null);
        class276.method1812(false);
        class701.field9280++;
        for (int var3 = 0; var3 < class181.field2380; var3++) {
            class22 var4 = class110.field1528[var3].field4455;
            if (var4 != null) {
                byte var5 = var4.field217.field4316;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2563(-12840);
                    if ((var5 & 0x2) != 0 && var4.field6195 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field6198[0] + var7;
                            int var10 = var4.field6197[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class102.field1467 - var6 - 1 < var9) {
                                var9 = class102.field1467 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class393.field5663 - var6 - 1)) {
                                var10 = class393.field5663 - var6 - 1;
                            }
                            int var11 = class22.method121(-1, var9, 0, class719.field9786, var10, true, 0, var4.field6197[0], var4.field6198[0], class257.field3830[var4.field2813], var6, 0, class605.field8203, var6, var6);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field6198[var12] = class719.field9786[var11 - var12 - 1];
                                    var4.field6197[var12] = class605.field8203[var11 - var12 - 1];
                                    var4.field6194[var12] = 1;
                                }
                                var4.field6195 = var11;
                            }
                        }
                    }
                    class747.method4090(true, var4, (byte) -91);
                    int var13 = class265.method1779((byte) -126, var4);
                    class751.method4101(var4, (byte) 111);
                    class208.method1358(false, class605.field8206, var13, var4, class279.field4037);
                    class249.method1560(class279.field4037, true, var4);
                    class142.method991(var4, -24118);
                }
            }
        }
        if (class733.field9917 == 0 && class597.field8132 == 0) {
            if (class697.field9252 == 2) {
                class715.method3959((byte) 85);
            } else {
                class397.method2425(false);
            }
            if (class435.field6273 >> 9 < 14 || class435.field6273 >> 9 >= class102.field1467 - 14 || (class223.field2892 >> 9) < 14 || (class393.field5663 - 14) <= (class223.field2892 >> 9)) {
                class27.method156(false);
            }
        }
        while (true) {
            class158 var14;
            class347 var15;
            class347 var16;
            do {
                var14 = (class158) class80.field1101.method687((byte) -94);
                if (var14 == null) {
                    while (true) {
                        class158 var17;
                        class347 var18;
                        class347 var19;
                        do {
                            var17 = (class158) class345.field4840.method687((byte) -99);
                            if (var17 == null) {
                                while (true) {
                                    class158 var20;
                                    class347 var21;
                                    class347 var22;
                                    do {
                                        var20 = (class158) class780.field10708.method687((byte) -108);
                                        if (var20 == null) {
                                            if (class528.field7306 != null) {
                                                class374.method2346(true);
                                            }
                                            if ((class572.field7788 % 1500) == 0) {
                                                class353.method2244(2);
                                            }
                                            if (class780.field10712 == 7 && class733.field9917 == 0) {
                                                class671.method3703(29448);
                                            }
                                            class385.method2399(5);
                                            if (class303.field4255 && class15.field149 < (class401.method2440(false) - 60000L)) {
                                                class756.method4144((byte) -127);
                                            }
                                            for (class399 var23 = (class399) class328.field4653.method2189((byte) 3); var23 != null; var23 = (class399) class328.field4653.method2192(0)) {
                                                if ((long) var23.field5714 < class401.method2440(false) / 1000L - 5L) {
                                                    if (var23.field5712 > 0) {
                                                        class26.method148(0, var23.field5710 + class58.field716.method365(class55.field647, (byte) 67), -80, "", 5, "", "");
                                                    }
                                                    if (var23.field5712 == 0) {
                                                        class26.method148(0, var23.field5710 + class58.field717.method365(class55.field647, (byte) 78), -80, "", 5, "", "");
                                                    }
                                                    var23.method3310(30305);
                                                }
                                            }
                                            if (arg0 >= -87) {
                                                this.method2057(-18);
                                            }
                                            if (class780.field10712 == 7 && class733.field9917 == 0) {
                                                if (class710.field9707 == null) {
                                                    class87.method696(false, 104);
                                                    return;
                                                }
                                                class701.field9282++;
                                                if (class701.field9282 > 50) {
                                                    class442.field6360++;
                                                    class43 var24 = class492.method2903(class378.field5520, 0, class73.field983);
                                                    class409.method2457((byte) -100, var24);
                                                }
                                                try {
                                                    class345.method2186((byte) 126);
                                                    return;
                                                } catch (IOException var25) {
                                                    class87.method696(false, 93);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field2137;
                                        if (var21.field4955 < 0) {
                                            break;
                                        }
                                        var22 = class445.method2655(var21.field4921, (byte) 121);
                                    } while (var22 == null || var22.field4928 == null || var22.field4928.length <= var21.field4955 || var22.field4928[var21.field4955] != var21);
                                    class727.method4005(var20);
                                }
                            }
                            var18 = var17.field2137;
                            if (var18.field4955 < 0) {
                                break;
                            }
                            var19 = class445.method2655(var18.field4921, (byte) 127);
                        } while (var19 == null || var19.field4928 == null || var18.field4955 >= var19.field4928.length || var19.field4928[var18.field4955] != var18);
                        class727.method4005(var17);
                    }
                }
                var15 = var14.field2137;
                if (var15.field4955 < 0) {
                    break;
                }
                var16 = class445.method2655(var15.field4921, (byte) 120);
            } while (var16 == null || var16.field4928 == null || var16.field4928.length <= var15.field4955 || var16.field4928[var15.field4955] != var15);
            class727.method4005(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method2054(byte arg0) {
        field4507++;
        if (class125.field1721.field5141.method2541(43) == 2) {
            try {
                this.method2050((byte) 89);
            } catch (ThreadDeath var5) {
                throw var5;
            } catch (Throwable var6) {
                class607.method3379(var6.getMessage() + " (Recovered) " + this.method2031(-31064), var6, true);
                class40.field414 = true;
                class399.method2434(false, (byte) -120, 0);
            }
        } else {
            this.method2050((byte) 66);
        }
        int var4 = 20 % ((-arg0 - 34) / 62);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lofa;)Lqja;")
    public static final class327 method2055(class347 arg0) {
        class327 var1 = (class327) class171.field2243.method1248(125, ((long) arg0.field5003 << 32) + (long) arg0.field4955);
        return var1 == null ? arg0.field4932 : var1;
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public static final void method2056(int arg0) {
        class655.field8849 = null;
        class341.field4779 = null;
        class250.field3499 = false;
        if (arg0 != 19898) {
            method2049(null, false);
        }
        class74.field1007 = null;
        class728.field9872 = null;
        field4505++;
        class646.field8703 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method2057(int arg0) {
        field4499++;
        if (class303.field4255) {
            class756.method4144((byte) 87);
        }
        class325.method2104(75);
        if (class375.field5490 != null) {
            class375.field5490.method464((byte) -84);
        }
        if (class393.field5661 != null) {
            class163.method1130(class393.field5661, class786.field10800, -128);
            class393.field5661 = null;
        }
        if (class710.field9707 != null) {
            class710.field9707.method138(-34);
            class710.field9707 = null;
        }
        class512.method2991((byte) -125);
        int var2 = 98 / ((arg0 + 54) / 53);
        class479.field6732.method63((byte) -127);
        class688.field9200.method3348((byte) -77);
        if (class773.field10621 != null) {
            class773.field10621.method1531((byte) 35);
            class773.field10621 = null;
        }
        try {
            class482.field6761.method2195(-1);
            for (int var3 = 0; var3 < 37; var3++) {
                class485.field6777[var3].method2195(-1);
            }
            class7.field52.method2195(-1);
            class351.field5121.method2195(-1);
            class151.method1060(true);
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method2058(byte arg0) {
        field4509++;
        if (class780.field10712 == 14) {
            return;
        }
        long var2 = class292.method1873((byte) 114) / 1000000L - class351.field5119;
        class351.field5119 = class292.method1873((byte) 103) / 1000000L;
        boolean var4 = class37.method214(61);
        if (var4 && class72.field973 && class318.field4526 != null) {
            class318.field4526.method2493((byte) -76);
        }
        if (class669.method3691(class780.field10712, true)) {
            if (class697.field9250 != 0L && class697.field9250 < class401.method2440(false)) {
                class77.method625(false, true, class164.method1133(-15388), class408.field5784, class341.field4781);
            } else if (!class375.field5490.method450() && class319.field4532) {
                class466.method2739(true);
            }
        }
        if (class393.field5661 == null) {
            Container var5;
            if (class639.field8606 != null) {
                var5 = class639.field8606;
            } else if (class552.field7624 == null) {
                var5 = class468.field6609;
            } else {
                var5 = class552.field7624;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class639.field8606 == var5) {
                Insets var8 = class639.field8606.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class358.field5218 != var6 || class482.field6754 != var7 || class130.field1794) {
                if (class375.field5490 == null || class375.field5490.method479()) {
                    class642.method3535(-1);
                } else {
                    class358.field5218 = var6;
                    class482.field6754 = var7;
                }
                class697.field9250 = class401.method2440(false) + 500L;
                class130.field1794 = false;
            }
        }
        if (class393.field5661 != null && !class95.field1347 && class669.method3691(class780.field10712, true)) {
            class77.method625(false, true, class125.field1721.field5183.method1441(43), -1, -1);
        }
        boolean var9 = false;
        if (class317.field4490) {
            var9 = true;
            class317.field4490 = false;
        }
        if (var9) {
            class555.method3188(-32479);
        }
        if (class375.field5490 != null && class375.field5490.method450() || class164.method1133(-15388) != 1) {
            class166.method1137(false);
        }
        if (class236.method1499((byte) 92, class780.field10712)) {
            class55.method339(0, var9);
        } else if (class605.method3377(class780.field10712, -123)) {
            class361.method2287(122);
        } else if (class704.method3919(class780.field10712, -8)) {
            class361.method2287(113);
        } else if (class729.method4031((byte) -112, class780.field10712)) {
            if (class290.field4150 == 1) {
                if (class15.field152 < class441.field6340) {
                    class15.field152 = class441.field6340;
                }
                int var10 = (class15.field152 - class441.field6340) * 50 / class15.field152;
                class316.method2017(0, true, class58.field709.method365(class55.field647, (byte) 109) + "<br>(" + var10 + "%)", class375.field5490, class355.field5157, class166.field2202);
            } else if (class290.field4150 == 2) {
                if (class493.field6947 > class292.field4166) {
                    class292.field4166 = class493.field6947;
                }
                int var11 = (class292.field4166 - class493.field6947) * 50 / class292.field4166 + 50;
                class316.method2017(0, true, class58.field709.method365(class55.field647, (byte) 115) + "<br>(" + var11 + "%)", class375.field5490, class355.field5157, class166.field2202);
            } else {
                class316.method2017(0, true, class58.field709.method365(class55.field647, (byte) 112), class375.field5490, class355.field5157, class166.field2202);
            }
        } else if (class780.field10712 == 10) {
            class304.method1959(false, var2);
        } else if (class780.field10712 == 13) {
            class316.method2017(0, false, class58.field711.method365(class55.field647, (byte) 81) + "<br>" + class58.field712.method365(class55.field647, (byte) 110), class375.field5490, class355.field5157, class166.field2202);
        }
        if (class81.field1126 == 3) {
            for (int var12 = 0; var12 < class689.field9209; var12++) {
                Rectangle var13 = class561.field7691[var12];
                if (class261.field3864[var12]) {
                    class375.field5490.method553(var13.width, var13.x, var13.y, -65281, 118, var13.height);
                } else if (class600.field8182[var12]) {
                    class375.field5490.method553(var13.width, var13.x, var13.y, -65536, 84, var13.height);
                } else {
                    class375.field5490.method553(var13.width, var13.x, var13.y, -16711936, 121, var13.height);
                }
            }
        }
        int var14 = 70 / ((42 - arg0) / 35);
        if (class68.method575(-22203)) {
            class382.method2373(class375.field5490, (byte) -16);
        }
        if (class786.field10800.field3233 && class669.method3691(class780.field10712, true) && class81.field1126 == 0 && class164.method1133(-15388) == 1 && !var9) {
            int var17 = 0;
            for (int var18 = 0; var18 < class689.field9209; var18++) {
                if (class600.field8182[var18]) {
                    class600.field8182[var18] = false;
                    class635.field8578[var17++] = class561.field7691[var18];
                }
            }
            try {
                if (class24.field246) {
                    class683.method3744(-10901, class635.field8578, var17);
                } else {
                    class375.field5490.method548(var17, class635.field8578, 14091);
                }
            } catch (class283 var20) {
            }
        } else if (!class236.method1499((byte) 115, class780.field10712)) {
            for (int var15 = 0; var15 < class689.field9209; var15++) {
                class600.field8182[var15] = false;
            }
            try {
                if (class24.field246) {
                    class492.method2898(0);
                } else {
                    class375.field5490.method483(false);
                }
            } catch (class283 var21) {
                class607.method3379(var21.getMessage() + " (Recovered) " + this.method2031(-31064), var21, true);
                class399.method2434(false, (byte) 92, 0);
            }
        }
        class186.method1253(0);
        int var19 = class125.field1721.field5143.method3194(43);
        if (var19 == 0) {
            class171.method1152(15L, false);
        } else if (var19 == 1) {
            class171.method1152(10L, false);
        } else if (var19 == 2) {
            class171.method1152(5L, false);
        } else if (var19 == 3) {
            class171.method1152(2L, false);
        }
        if (class259.field3838) {
            class514.method3004(-48);
        }
        if (class125.field1721.field5161.method35(43) == 1 && class780.field10712 == 3 && class227.field2935 != -1) {
            class125.field1721.method2255(true, 0, class125.field1721.field5161);
            class515.method3006(-2);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2059(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
