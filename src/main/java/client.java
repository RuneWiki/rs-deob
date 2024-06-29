import jagex3.jagmisc.jagmisc;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class602 {

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Lbv;")
    private static class567 field8778 = new class567("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Liu;")
    public static class517 field8782 = new class517(104, -1);

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field8783 = 0;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lcba;")
    public static class232 field8777;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lcw;")
    public static class471 field8770;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Ljava/lang/Class;")
    public static Class field8784;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Z")
    public static boolean field8785;

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class105.method890((byte) 71, "Argument count");
            }
            class308.field4469 = new class232();
            class308.field4469.field3409 = Integer.parseInt(arg0[0]);
            class552.field7820 = new class232();
            class552.field7820.field3409 = Integer.parseInt(arg0[1]);
            field8777 = new class232();
            field8777.field3409 = Integer.parseInt(arg0[2]);
            class47.field657 = class97.field1693;
            if (arg0[3].equals("live")) {
                class616.field8722 = class173.field2510;
            } else if (arg0[3].equals("rc")) {
                class616.field8722 = class539.field7510;
            } else if (arg0[3].equals("wip")) {
                class616.field8722 = class115.field1889;
            } else {
                class105.method890((byte) 71, "modewhat");
            }
            class538.field7500 = class139.method1045(true, arg0[4]);
            if (class538.field7500 == -1) {
                if (arg0[4].equals("english")) {
                    class538.field7500 = 0;
                } else if (arg0[4].equals("german")) {
                    class538.field7500 = 1;
                } else {
                    class105.method890((byte) 71, "language");
                }
            }
            class162.field2400 = false;
            class61.field852 = false;
            if (arg0[5].equals("game0")) {
                class640.field9282 = class202.field2846;
            } else if (arg0[5].equals("game1")) {
                class640.field9282 = class78.field1412;
            } else {
                class105.method890((byte) 71, "game");
            }
            class636.field9235 = true;
            class153.field2297 = true;
            class56.field803 = 0;
            class311.field4555 = false;
            class92.field1634 = false;
            class258.field3752 = null;
            class635.field9232 = class640.field9282.field8321;
            class459.field6612 = "";
            class600.field8520 = 0;
            class98.field1707 = 0;
            client var1 = new client();
            class454.field6574 = var1;
            var1.method3430(1024, 768, 608, true, 32, class640.field9282.field8323, false, class616.field8722.method1216(-63) + 32);
            class327.field4718.setLocation(40, 40);
        } catch (Exception var3) {
            class593.method3390(null, var3, 0);
        }
        field8769++;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static final void method3509(int arg0) {
        int var1 = class43.field586;
        int[] var2 = class343.field4927;
        int var3 = class595.field8466 ? var1 : class128.field2098 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class85 var5;
            if (var4 < var1) {
                var5 = class39.field536[var2[var4]];
            } else {
                var5 = ((class181) class432.field6368.method740(0, (long) class591.field8401[var4 - var1])).field2623;
            }
            if (var5.field5116 == arg0) {
                var5.field1529 = 0;
                if (var5.field1497 < 0) {
                    var5.field1493 = false;
                } else {
                    int var6 = var5.method781((byte) -123);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field5108 & 0x7F) != 0 || (var5.field5109 & 0x7F) != 0) {
                            var5.field1493 = false;
                            continue;
                        }
                    } else if ((var5.field5108 & 0x7F) != 64 || (var5.field5109 & 0x7F) != 64) {
                        var5.field1493 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field5108 >> 7;
                        int var8 = var5.field5109 >> 7;
                        if (class393.field5893[var7][var8] != var5.field1497) {
                            var5.field1493 = true;
                            continue;
                        }
                        if (class97.field1698[var7][var8] > 1) {
                            var10002 = class97.field1698[var7][var8]--;
                            var5.field1493 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field5108 - var9 >> 7;
                        int var11 = var5.field5109 - var9 >> 7;
                        int var12 = var5.field5108 + var9 >> 7;
                        int var13 = var5.field5109 + var9 >> 7;
                        if (!class80.method748(var13, var5.field1497, var12, var10, -115, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class393.field5893[var14][var15] == var5.field1497) {
                                        var10002 = class97.field1698[var14][var15]--;
                                    }
                                }
                            }
                            var5.field1493 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class400 && var5.field1573 != null && class310.field4553 >= var5.field1573.field7477 && class310.field4553 < var5.field1573.field7473) {
                        ((class400) var5).field5973 = false;
                    }
                    var5.field1493 = false;
                    var5.field5111 = class355.method2160(var5.field5108, var5.field5109, var5.field5116, (byte) 103);
                    method3524(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method3431(boolean arg0) {
        if (arg0) {
            method3511(42);
        }
        if (class646.field9388 == 2) {
            try {
                this.method3520(-23965);
            } catch (Throwable var3) {
                class593.method3390(var3.getMessage() + " (Recovered) " + this.method3421((byte) 36), var3, 0);
                class471.method2738(127, 0);
            }
        } else {
            this.method3520(-23965);
        }
        field8768++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method3510() {
        int var0 = class43.field586;
        int[] var1 = class343.field4927;
        boolean var2 = class202.field2854.field7899 == 1 && var0 > 200 || class202.field2854.field7899 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class400 var13 = class39.field536[var1[var3]];
            if (var13.method2442(-116)) {
                var13.method788((byte) 127);
                if (var13.field5117 >= 0 && var13.field5113 >= 0 && var13.field5119 < class146.field2247 && var13.field5107 < class66.field990) {
                    var13.field5973 = var13.field1489 ? var2 : false;
                    if (class644.field9367 == var13) {
                        var13.field1497 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field1493) {
                            var14++;
                        }
                        if (var13.field1547 > class310.field4553) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method781((byte) -80) << 2);
                        if (var13.field5977) {
                            var15 += 512;
                        } else {
                            if (class356.field5084 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field1497 = var15 + 1;
                    }
                } else {
                    var13.field1497 = -1;
                }
            } else {
                var13.field1497 = -1;
            }
        }
        for (int var4 = 0; var4 < class128.field2098; var4++) {
            class170 var10 = ((class181) class432.field6368.method740(0, (long) class591.field8401[var4])).field2623;
            if (var10.method1184(-128) && var10.field2492.method2580(15, class401.field6001)) {
                var10.method788((byte) 112);
                if (var10.field5117 >= 0 && var10.field5113 >= 0 && var10.field5119 < class146.field2247 && var10.field5107 < class66.field990) {
                    int var11 = 0;
                    if (!var10.field1493) {
                        var11++;
                    }
                    if (var10.field1547 > class310.field4553) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method781((byte) -96) << 2);
                    if (class356.field5084 == 0) {
                        if (var10.field2492.field6295) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class356.field5084 == 1) {
                        if (var10.field2492.field6295) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field2492.field6361) {
                        var12 += 1024;
                    } else if (!var10.field2492.field6311) {
                        var12 += 256;
                    }
                    var10.field1497 = var12 + 1;
                } else {
                    var10.field1497 = -1;
                }
            } else {
                var10.field1497 = -1;
            }
        }
        for (int var5 = 0; var5 < class451.field6552.length; var5++) {
            class371 var6 = class451.field6552[var5];
            if (var6 != null) {
                if (var6.field5361 == 1) {
                    class181 var7 = (class181) class432.field6368.method740(0, (long) var6.field5357);
                    if (var7 != null) {
                        class170 var8 = var7.field2623;
                        if (var8.field1497 >= 0) {
                            var8.field1497 += 2048;
                        }
                    }
                } else if (var6.field5361 == 10) {
                    class400 var9 = class39.field536[var6.field5357];
                    if (var9 != null && class644.field9367 != var9 && var9.field1497 >= 0) {
                        var9.field1497 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method3511(int arg0) {
        int var1 = class43.field586;
        int[] var2 = class343.field4927;
        for (int var3 = 0; var3 < class128.field2098 + var1; var3++) {
            class85 var4;
            if (var3 < var1) {
                var4 = class39.field536[var2[var3]];
            } else {
                var4 = ((class181) class432.field6368.method740(0, (long) class591.field8401[var3 - var1])).field2623;
            }
            if (var4.field5116 == arg0 && var4.field1497 >= 0) {
                int var5 = var4.method781((byte) 104);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5108 & 0x7F) != 0 || (var4.field5109 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field5108 & 0x7F) != 64 || (var4.field5109 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field5108 >> 7;
                    int var7 = var4.field5109 >> 7;
                    if (var4.field1497 > class393.field5893[var6][var7]) {
                        class393.field5893[var6][var7] = var4.field1497;
                        class97.field1698[var6][var7] = 1;
                    } else if (class393.field5893[var6][var7] == var4.field1497) {
                        var10002 = class97.field1698[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field5108 - var8 >> 7;
                    int var10 = var4.field5109 - var8 >> 7;
                    int var11 = var4.field5108 + var8 >> 7;
                    int var12 = var4.field5109 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field1497 > class393.field5893[var13][var14]) {
                                class393.field5893[var13][var14] = var4.field1497;
                                class97.field1698[var13][var14] = 1;
                            } else if (class393.field5893[var13][var14] == var4.field1497) {
                                var10002 = class97.field1698[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;")
    public final String method3421(byte arg0) {
        field8772++;
        String var2 = null;
        try {
            var2 = "[1)" + class382.field5687 + "," + class597.field8500 + "," + class146.field2247 + "," + class66.field990 + "|";
            if (class644.field9367 != null) {
                var2 = var2 + "2)" + class545.field7583 + "," + (class644.field9367.field1571[0] + class382.field5687) + "," + (class644.field9367.field1572[0] + class597.field8500) + "|";
            }
            var2 = var2 + "3)" + class646.field9388 + "|4)" + class202.field2854.field7889 + "|5)" + class512.method2868(2) + "|6)" + class68.field1285 + "," + class442.field6464 + "|";
            var2 = var2 + "7)" + class202.field2854.method3140(class646.field9388, 2) + "|";
            var2 = var2 + "8)" + class202.field2854.method3143(class646.field9388, 0) + "|";
            var2 = var2 + "9)" + class202.field2854.field7898 + "|";
            var2 = var2 + "10)" + class202.field2854.field7893 + "|";
            var2 = var2 + "11)" + class202.field2854.field7905 + "|";
            var2 = var2 + "12)" + class202.field2854.method2628((byte) 68, class646.field9388) + "|";
            var2 = var2 + "13)" + class555.field7861 + "|";
            var2 = var2 + "14)" + class64.field893;
            try {
                if (arg0 != 36) {
                    return null;
                }
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class646.field9388 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field8784 == null ? (field8784 = method3532("client")) : field8784).getClassLoader());
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
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method3512() {
        int var0 = class43.field586;
        int[] var1 = class343.field4927;
        int var2 = class595.field8466 ? var0 : class128.field2098 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class85 var4;
            if (var3 < var0) {
                var4 = class39.field536[var1[var3]];
            } else {
                var4 = ((class181) class432.field6368.method740(0, (long) class591.field8401[var3 - var0])).field2623;
            }
            if (var4.field1497 >= 0) {
                int var5 = var4.method781((byte) -78);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5108 & 0x7F) == 0 && (var4.field5109 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field5108 & 0x7F) == 64 && (var4.field5109 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class400 && var4.field1573 != null && class310.field4553 >= var4.field1573.field7477 && class310.field4553 < var4.field1573.field7473) {
                    ((class400) var4).field5973 = false;
                }
                var4.field5111 = class355.method2160(var4.field5108, var4.field5109, var4.field5116, (byte) 103);
                method3524(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Loh;)Loh;")
    public static final class549 method3513(class549 arg0) {
        int var1 = method3530(arg0).method3052(-1707416750);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class495.method2822((byte) -103, arg0.field7637);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
    private final void method3514(byte[] arg0, int arg1) {
        field8771++;
        int var3 = 47 % ((-arg1 - 45) / 62);
        class268 var4 = new class268(arg0);
        while (true) {
            int var5 = var4.method1738(255);
            if (var5 == 0) {
                return;
            }
            if (var5 == 2) {
                class139.field2192 = var4.method1745(32132);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;ZLjava/awt/Color;I)V")
    private static final void method3515(int arg0, Color arg1, String arg2, Color arg3, boolean arg4, Color arg5, int arg6) {
        try {
            Graphics var7 = class474.field6795.getGraphics();
            if (class451.field6553 == null) {
                class451.field6553 = new Font("Helvetica", 1, 13);
            }
            if (arg4) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class68.field1285, class442.field6464);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            int var8 = 62 / ((arg6 - 50) / 48);
            if (arg5 == null) {
                arg5 = new Color(255, 255, 255);
            }
            try {
                if (class566.field8088 == null) {
                    class566.field8088 = class474.field6795.createImage(304, 34);
                }
                Graphics var9 = class566.field8088.getGraphics();
                var9.setColor(arg1);
                var9.drawRect(0, 0, 303, 33);
                var9.setColor(arg3);
                var9.fillRect(2, 2, arg0 * 3, 30);
                var9.setColor(Color.black);
                var9.drawRect(1, 1, 301, 31);
                var9.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var9.setFont(class451.field6553);
                var9.setColor(arg5);
                var9.drawString(arg2, (304 - (arg2.length() * 6)) / 2, 22);
                var7.drawImage(class566.field8088, class68.field1285 / 2 - 152, class442.field6464 / 2 + -18, null);
            } catch (Exception var12) {
                int var10 = class68.field1285 / 2 - 152;
                int var11 = class442.field6464 / 2 - 18;
                var7.setColor(arg1);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var10 + 2, var11 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var10 + 1, var11 + 1, 301, 31);
                var7.fillRect(arg0 * 3 + var10 + 2, var11 + 2, 300 - arg0 * 3, 30);
                var7.setFont(class451.field6553);
                var7.setColor(arg5);
                var7.drawString(arg2, (304 - (arg2.length() * 6)) / 2 + var10, var11 - -22);
            }
            if (class311.field4558 != null) {
                var7.setFont(class451.field6553);
                var7.setColor(arg5);
                var7.drawString(class311.field4558, class68.field1285 / 2 - class311.field4558.length() * 6 / 2, class442.field6464 / 2 - 26);
            }
        } catch (Exception var13) {
            class474.field6795.repaint();
        }
        field8779++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method3516(byte arg0, int arg1) {
        class384.field5712.field1791++;
        field8766++;
        class384.field5712.field1793 = arg1;
        if (arg0 == -10) {
            class268.field3930 = null;
            class503.field7035 = 0;
            class57.field815 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Loh;IIIIIIIII)V")
    public static final void method3517(class549[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class549 var11 = arg0[var10];
            if (var11 != null && var11.field7637 == arg1) {
                int var12 = var11.field7631 + arg6;
                int var13 = var11.field7687 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field7749 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field7678 + var12;
                    int var19 = var11.field7776 + var13;
                    if (var11.field7749 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field7749 == 0 || var11.field7780 || method3530(var11).field7595 != 0 || class179.field2601 == var11 || class308.field4441 == var11.field7662) {
                    if (!method3529(var11)) {
                        if (class311.field4557 == var11 && class332.method2053(class311.field4557, -88) != null) {
                            class640.field9283 = true;
                            class473.field6780 = var12;
                            class512.field7084 = var13;
                        }
                        if (var11.field7647 || var14 < var16 && var15 < var17) {
                            if (var11.field7757 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class526 var20 = (class526) class307.field4417.method427(true); var20 != null; var20 = (class526) class307.field4417.method420(false)) {
                                    if (var20.field7317) {
                                        var20.method911(-52);
                                        var20.field7315.field7753 = false;
                                    }
                                }
                                if (class55.field790 == 0) {
                                    class311.field4557 = null;
                                    class179.field2601 = null;
                                }
                                class551.field7807 = 0;
                                class181.field2621 = false;
                                class156.field2351 = false;
                                if (!class2.field20) {
                                    class167.method1161(13361);
                                }
                            }
                            boolean var21;
                            if (class619.field8735.method1614((byte) -46) >= var14 && class619.field8735.method1607((byte) -78) >= var15 && class619.field8735.method1614((byte) -46) < var16 && class619.field8735.method1607((byte) -78) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class90.field1620 && var21) {
                                if (var11.field7646 >= 0) {
                                    class185.field2692 = var11.field7646;
                                } else if (var11.field7757) {
                                    class185.field2692 = -1;
                                }
                            }
                            if (!class2.field20 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class174.method1201(arg9 - var13, arg8 - var12, var11, 21491);
                            }
                            boolean var22 = false;
                            if (class619.field8735.method1613(-1) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class7 var24 = (class7) class360.field5112.method427(true);
                            if (var24 != null && var24.method25(26999) == 0 && var24.method27(false) >= var14 && var24.method26(true) >= var15 && var24.method27(false) < var16 && var24.method26(true) < var17) {
                                var23 = true;
                            }
                            if (var11.field7691 != null) {
                                for (int var25 = 0; var25 < var11.field7691.length; var25++) {
                                    if (class404.field6022.method2183(var11.field7691[var25], false)) {
                                        if (var11.field7673 == null || class310.field4553 >= var11.field7673[var25]) {
                                            byte var26 = var11.field7745[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class404.field6022.method2183(86, false) && !class404.field6022.method2183(82, false) && !class404.field6022.method2183(81, false)) && ((var26 & 0x2) == 0 || class404.field6022.method2183(86, false)) && ((var26 & 0x1) == 0 || class404.field6022.method2183(82, false)) && ((var26 & 0x4) == 0 || class404.field6022.method2183(81, false))) {
                                                if (var25 < 10) {
                                                    class639.method3688(var11.field7734, -1791, -1, "", var25 + 1);
                                                } else if (var25 == 10) {
                                                    class294.method1853(49);
                                                    class546 var27 = method3530(var11);
                                                    class380.method2304(var11, false, var27.method3051((byte) -70), var27.field7587);
                                                    class511.field7082 = class242.method1544(var11, (byte) -118);
                                                    if (class511.field7082 == null) {
                                                        class511.field7082 = "Null";
                                                    }
                                                    class413.field6111 = var11.field7652 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field7634[var25];
                                                if (var11.field7673 == null) {
                                                    var11.field7673 = new int[var11.field7691.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field7673[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field7673[var25] = class310.field4553 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field7673 != null) {
                                        var11.field7673[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class606.method3455(var11, var24.method26(true) - var13, 3553, var24.method27(false) - var12);
                            }
                            if (class311.field4557 != null && class311.field4557 != var11 && var21 && method3530(var11).method3054(15)) {
                                class558.field7915 = var11;
                            }
                            if (class179.field2601 == var11) {
                                class604.field8590 = true;
                                class560.field7943 = var12;
                                class409.field6068 = var13;
                            }
                            if (var11.field7780 || var11.field7662 != 0) {
                                if (var21 && class85.field1564 != 0 && var11.field7774 != null) {
                                    class526 var29 = new class526();
                                    var29.field7317 = true;
                                    var29.field7315 = var11;
                                    var29.field7326 = class85.field1564;
                                    var29.field7314 = var11.field7774;
                                    class307.field4417.method414(var29, (byte) 34);
                                }
                                if (class311.field4557 != null || class2.field20 || class70.field1320 != var11.field7662 && class551.field7807 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field7662 != 0) {
                                    if (class57.field821 == var11.field7662 || class190.field2719 == var11.field7662) {
                                        class477.field6818 = var11;
                                        if (class580.field8259 != null) {
                                            class580.field8259.method1503((byte) 125, class159.field2378, var11.field7776);
                                        }
                                        if (class57.field821 == var11.field7662) {
                                            if (!class2.field20 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class494.method2818(arg9, class159.field2378, arg8, -1);
                                                for (class17 var30 = (class17) class591.field8389.method944(-127); var30 != null; var30 = (class17) class591.field8389.method947((byte) -68)) {
                                                    if (arg8 >= var30.field260 && arg8 < var30.field266 && arg9 >= var30.field259 && arg9 < var30.field263) {
                                                        class167.method1161(13361);
                                                        class70.method683(-1, var30.field254);
                                                    }
                                                }
                                            }
                                            class319.method1957(var13, 128, var12, var11);
                                            continue;
                                        }
                                    }
                                    if (class308.field4441 == var11.field7662) {
                                        if (var11.method3086(class159.field2378, 119) == null || class473.field6783 != 0 && class473.field6783 != 3 || class2.field20 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field7633[var32];
                                        if (var31 < var33 || var31 > var11.field7778[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field7678 / 2;
                                        int var35 = var32 - var11.field7776 / 2;
                                        int var36;
                                        if (class377.field5547 == 4) {
                                            var36 = (int) class523.field7256 & 0x3FFF;
                                        } else {
                                            var36 = (int) class523.field7256 + class495.field6941 & 0x3FFF;
                                        }
                                        int var37 = class285.field4154[var36];
                                        int var38 = class285.field4152[var36];
                                        if (class377.field5547 != 4) {
                                            var37 = (class353.field5042 + 256) * var37 >> 8;
                                            var38 = (class353.field5042 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class377.field5547 == 4) {
                                            var41 = (class69.field1304 >> 7) + (var39 >> 2);
                                            var42 = (class56.field807 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class644.field9367.method781((byte) 84) - 1) * 64;
                                            var41 = (class644.field9367.field5108 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class644.field9367.field5109 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class90.field1620 && (class549.field7789 & 0x40) != 0) {
                                            class549 var44 = class547.method3061(4096, class388.field5795, class293.field4224);
                                            if (var44 == null) {
                                                class294.method1853(49);
                                            } else {
                                                class366.method2209(class335.field4799, var42, 20, var11.field7703, true, 1L, -1, var41, class511.field7082, false, " ->");
                                            }
                                            continue;
                                        }
                                        if (class78.field1412 == class640.field9282) {
                                            class366.method2209(-1, var42, 59, -1, true, 1L, -1, var41, class592.field8411.method3220(false, class538.field7500), false, "");
                                        }
                                        class366.method2209(class201.field2841, var42, 46, -1, true, 1L, -1, var41, class488.field6873, false, "");
                                        continue;
                                    }
                                    if (class70.field1320 == var11.field7662) {
                                        class276.field4034 = var11;
                                        if (var21) {
                                            class181.field2621 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method27(false) - var12 - var11.field7678 / 2) * 2.0D / (double) class212.field3102);
                                            int var46 = (int) (-((double) (var24.method26(true) - var13 - var11.field7776 / 2) * 2.0D / (double) class212.field3102));
                                            int var47 = class274.field4008 + var45 + class212.field3118;
                                            int var48 = class119.field1915 + var46 + class212.field3120;
                                            class644 var49 = class184.method1236(true);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method3714(-2, var47, var48, var50);
                                            if (var50 != null) {
                                                if (class404.field6022.method2183(82, false) && class602.field8571 > 0) {
                                                    class32.method295(var50[1], var50[0], false, var50[2]);
                                                    continue;
                                                }
                                                class156.field2351 = true;
                                                class336.field4812 = var50[0];
                                                class527.field7337 = var50[1];
                                                class202.field2853 = var50[2];
                                            }
                                            class551.field7807 = 1;
                                            class544.field7577 = false;
                                            class641.field9292 = class619.field8735.method1614((byte) -46);
                                            class216.field3271 = class619.field8735.method1607((byte) -78);
                                            continue;
                                        }
                                        if (var22 && class551.field7807 > 0) {
                                            if (class551.field7807 == 1 && (class641.field9292 != class619.field8735.method1614((byte) -46) || class216.field3271 != class619.field8735.method1607((byte) -78))) {
                                                class416.field6125 = class274.field4008;
                                                class299.field4327 = class119.field1915;
                                                class551.field7807 = 2;
                                            }
                                            if (class551.field7807 == 2) {
                                                class544.field7577 = true;
                                                class504.method2854(class416.field6125 + (int) ((double) (class641.field9292 - class619.field8735.method1614((byte) -46)) * 2.0D / (double) class212.field3108), -1);
                                                class272.method1764(class299.field4327 - (int) ((double) (class216.field3271 - class619.field8735.method1607((byte) -78)) * 2.0D / (double) class212.field3108), -88);
                                            }
                                            continue;
                                        }
                                        if (class551.field7807 > 0 && !class544.field7577) {
                                            if ((class54.field776 == 1 || class55.method454((byte) -120)) && class480.field6825 > 2) {
                                                class565.method3217(2, class641.field9292, class216.field3271);
                                            } else if (class249.method1580(4)) {
                                                class565.method3217(2, class641.field9292, class216.field3271);
                                            }
                                        }
                                        class551.field7807 = 0;
                                        continue;
                                    }
                                    if (class244.field3526 == var11.field7662) {
                                        if (var22) {
                                            class469.method2727(class619.field8735.method1614((byte) -46) - var12, var11.field7776, class619.field8735.method1607((byte) -78) - var13, var11.field7678, -28701);
                                        }
                                        continue;
                                    }
                                    if (class233.field3426 == var11.field7662) {
                                        class125.method992(var13, var12, (byte) 8, var11);
                                        continue;
                                    }
                                }
                                if (!var11.field7706 && var23) {
                                    var11.field7706 = true;
                                    if (var11.field7739 != null) {
                                        class526 var51 = new class526();
                                        var51.field7317 = true;
                                        var51.field7315 = var11;
                                        var51.field7323 = var24.method27(false) - var12;
                                        var51.field7326 = var24.method26(true) - var13;
                                        var51.field7314 = var11.field7739;
                                        class307.field4417.method414(var51, (byte) 100);
                                    }
                                }
                                if (var11.field7706 && var22 && var11.field7756 != null) {
                                    class526 var52 = new class526();
                                    var52.field7317 = true;
                                    var52.field7315 = var11;
                                    var52.field7323 = class619.field8735.method1614((byte) -46) - var12;
                                    var52.field7326 = class619.field8735.method1607((byte) -78) - var13;
                                    var52.field7314 = var11.field7756;
                                    class307.field4417.method414(var52, (byte) 103);
                                }
                                if (var11.field7706 && !var22) {
                                    var11.field7706 = false;
                                    if (var11.field7635 != null) {
                                        class526 var53 = new class526();
                                        var53.field7317 = true;
                                        var53.field7315 = var11;
                                        var53.field7323 = class619.field8735.method1614((byte) -46) - var12;
                                        var53.field7326 = class619.field8735.method1607((byte) -78) - var13;
                                        var53.field7314 = var11.field7635;
                                        class477.field6816.method414(var53, (byte) 29);
                                    }
                                }
                                if (var22 && var11.field7645 != null) {
                                    class526 var54 = new class526();
                                    var54.field7317 = true;
                                    var54.field7315 = var11;
                                    var54.field7323 = class619.field8735.method1614((byte) -46) - var12;
                                    var54.field7326 = class619.field8735.method1607((byte) -78) - var13;
                                    var54.field7314 = var11.field7645;
                                    class307.field4417.method414(var54, (byte) 28);
                                }
                                if (!var11.field7753 && var21) {
                                    var11.field7753 = true;
                                    if (var11.field7667 != null) {
                                        class526 var55 = new class526();
                                        var55.field7317 = true;
                                        var55.field7315 = var11;
                                        var55.field7323 = class619.field8735.method1614((byte) -46) - var12;
                                        var55.field7326 = class619.field8735.method1607((byte) -78) - var13;
                                        var55.field7314 = var11.field7667;
                                        class307.field4417.method414(var55, (byte) 55);
                                    }
                                }
                                if (var11.field7753 && var21 && var11.field7692 != null) {
                                    class526 var56 = new class526();
                                    var56.field7317 = true;
                                    var56.field7315 = var11;
                                    var56.field7323 = class619.field8735.method1614((byte) -46) - var12;
                                    var56.field7326 = class619.field8735.method1607((byte) -78) - var13;
                                    var56.field7314 = var11.field7692;
                                    class307.field4417.method414(var56, (byte) 34);
                                }
                                if (var11.field7753 && !var21) {
                                    var11.field7753 = false;
                                    if (var11.field7762 != null) {
                                        class526 var57 = new class526();
                                        var57.field7317 = true;
                                        var57.field7315 = var11;
                                        var57.field7323 = class619.field8735.method1614((byte) -46) - var12;
                                        var57.field7326 = class619.field8735.method1607((byte) -78) - var13;
                                        var57.field7314 = var11.field7762;
                                        class477.field6816.method414(var57, (byte) 49);
                                    }
                                }
                                if (var11.field7752 != null) {
                                    class526 var58 = new class526();
                                    var58.field7315 = var11;
                                    var58.field7314 = var11.field7752;
                                    class332.field4772.method414(var58, (byte) 75);
                                }
                                if (var11.field7714 != null && class141.field2198 > var11.field7732) {
                                    if (var11.field7665 == null || class141.field2198 - var11.field7732 > 32) {
                                        class526 var63 = new class526();
                                        var63.field7315 = var11;
                                        var63.field7314 = var11.field7714;
                                        class307.field4417.method414(var63, (byte) 81);
                                    } else {
                                        label693: for (int var59 = var11.field7732; var59 < class141.field2198; var59++) {
                                            int var60 = class440.field6422[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field7665.length; var61++) {
                                                if (var11.field7665[var61] == var60) {
                                                    class526 var62 = new class526();
                                                    var62.field7315 = var11;
                                                    var62.field7314 = var11.field7714;
                                                    class307.field4417.method414(var62, (byte) 32);
                                                    break label693;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7732 = class141.field2198;
                                }
                                if (var11.field7767 != null && class287.field4179 > var11.field7777) {
                                    if (var11.field7629 == null || class287.field4179 - var11.field7777 > 32) {
                                        class526 var68 = new class526();
                                        var68.field7315 = var11;
                                        var68.field7314 = var11.field7767;
                                        class307.field4417.method414(var68, (byte) 83);
                                    } else {
                                        label669: for (int var64 = var11.field7777; var64 < class287.field4179; var64++) {
                                            int var65 = class300.field4339[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field7629.length; var66++) {
                                                if (var11.field7629[var66] == var65) {
                                                    class526 var67 = new class526();
                                                    var67.field7315 = var11;
                                                    var67.field7314 = var11.field7767;
                                                    class307.field4417.method414(var67, (byte) 44);
                                                    break label669;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7777 = class287.field4179;
                                }
                                if (var11.field7693 != null && class495.field6939 > var11.field7736) {
                                    if (var11.field7779 == null || class495.field6939 - var11.field7736 > 32) {
                                        class526 var73 = new class526();
                                        var73.field7315 = var11;
                                        var73.field7314 = var11.field7693;
                                        class307.field4417.method414(var73, (byte) 16);
                                    } else {
                                        label645: for (int var69 = var11.field7736; var69 < class495.field6939; var69++) {
                                            int var70 = class388.field5796[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field7779.length; var71++) {
                                                if (var11.field7779[var71] == var70) {
                                                    class526 var72 = new class526();
                                                    var72.field7315 = var11;
                                                    var72.field7314 = var11.field7693;
                                                    class307.field4417.method414(var72, (byte) 105);
                                                    break label645;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7736 = class495.field6939;
                                }
                                if (var11.field7751 != null && class45.field634 > var11.field7724) {
                                    if (var11.field7663 == null || class45.field634 - var11.field7724 > 32) {
                                        class526 var78 = new class526();
                                        var78.field7315 = var11;
                                        var78.field7314 = var11.field7751;
                                        class307.field4417.method414(var78, (byte) 127);
                                    } else {
                                        label621: for (int var74 = var11.field7724; var74 < class45.field634; var74++) {
                                            int var75 = class93.field1639[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field7663.length; var76++) {
                                                if (var11.field7663[var76] == var75) {
                                                    class526 var77 = new class526();
                                                    var77.field7315 = var11;
                                                    var77.field7314 = var11.field7751;
                                                    class307.field4417.method414(var77, (byte) 31);
                                                    break label621;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7724 = class45.field634;
                                }
                                if (var11.field7743 != null && class407.field6045 > var11.field7770) {
                                    if (var11.field7679 == null || class407.field6045 - var11.field7770 > 32) {
                                        class526 var83 = new class526();
                                        var83.field7315 = var11;
                                        var83.field7314 = var11.field7743;
                                        class307.field4417.method414(var83, (byte) 47);
                                    } else {
                                        label597: for (int var79 = var11.field7770; var79 < class407.field6045; var79++) {
                                            int var80 = class69.field1305[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field7679.length; var81++) {
                                                if (var11.field7679[var81] == var80) {
                                                    class526 var82 = new class526();
                                                    var82.field7315 = var11;
                                                    var82.field7314 = var11.field7743;
                                                    class307.field4417.method414(var82, (byte) 73);
                                                    break label597;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7770 = class407.field6045;
                                }
                                if (class68.field1286 > var11.field7625 && var11.field7782 != null) {
                                    class526 var84 = new class526();
                                    var84.field7315 = var11;
                                    var84.field7314 = var11.field7782;
                                    class307.field4417.method414(var84, (byte) 75);
                                }
                                if (class137.field2179 > var11.field7625 && var11.field7675 != null) {
                                    class526 var85 = new class526();
                                    var85.field7315 = var11;
                                    var85.field7314 = var11.field7675;
                                    class307.field4417.method414(var85, (byte) 111);
                                }
                                if (class323.field4668 > var11.field7625 && var11.field7737 != null) {
                                    class526 var86 = new class526();
                                    var86.field7315 = var11;
                                    var86.field7314 = var11.field7737;
                                    class307.field4417.method414(var86, (byte) 87);
                                }
                                if (class593.field8420 > var11.field7625 && var11.field7661 != null) {
                                    class526 var87 = new class526();
                                    var87.field7315 = var11;
                                    var87.field7314 = var11.field7661;
                                    class307.field4417.method414(var87, (byte) 94);
                                }
                                if (class410.field6095 > var11.field7625 && var11.field7725 != null) {
                                    class526 var88 = new class526();
                                    var88.field7315 = var11;
                                    var88.field7314 = var11.field7725;
                                    class307.field4417.method414(var88, (byte) 27);
                                }
                                var11.field7625 = class498.field6986;
                                if (var11.field7666 != null) {
                                    for (int var89 = 0; var89 < class151.field2283; var89++) {
                                        class526 var90 = new class526();
                                        var90.field7315 = var11;
                                        var90.field7310 = class465.field6706[var89].method835((byte) -21);
                                        var90.field7316 = class465.field6706[var89].method837(false);
                                        var90.field7314 = var11.field7666;
                                        class307.field4417.method414(var90, (byte) 103);
                                    }
                                }
                                if (class559.field7927 && var11.field7636 != null) {
                                    class526 var91 = new class526();
                                    var91.field7315 = var11;
                                    var91.field7314 = var11.field7636;
                                    class307.field4417.method414(var91, (byte) 19);
                                }
                            }
                            if (var11.field7749 == 5 && var11.field7771 != -1) {
                                var11.method3090(class92.field1638, class316.field4615, 16049).method1503((byte) 125, class159.field2378, var11.field7776);
                            }
                            class234.method1523((byte) -122, var11);
                            if (var11.field7749 == 0) {
                                method3517(arg0, var11.field7734, var14, var15, var16, var17, var12 - var11.field7676, var13 - var11.field7643, arg8, arg9);
                                if (var11.field7684 != null) {
                                    method3517(var11.field7684, var11.field7734, var14, var15, var16, var17, var12 - var11.field7676, var13 - var11.field7643, arg8, arg9);
                                }
                                class553 var92 = (class553) class639.field9274.method740(0, (long) var11.field7734);
                                if (var92 != null) {
                                    if (class640.field9282 == class202.field2846 && var92.field7831 == 0 && !class2.field20 && var21 && !class640.field9285) {
                                        class167.method1161(13361);
                                    }
                                    class422.method2538(var13, var17, 5121, arg9, var12, var14, var92.field7827, var16, arg8, var15);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class234.method1523((byte) -122, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lbda;Z[I[I[I)V")
    public static final void method3518(class400 arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg2[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && arg0.field1504.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field1504[var9] = null;
                    } else {
                        class439 var10 = class49.field739.method2297((byte) 106, var6);
                        int var11 = var10.field6396;
                        class527 var12 = arg0.field1504[var9];
                        if (var12 != null) {
                            if (var12.field7335 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field1504[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field7327 = var8;
                                    var12.field7330 = 0;
                                    var12.field7332 = 1;
                                    var12.field7331 = 0;
                                    var12.field7328 = 0;
                                    class402.method2456(class644.field9367 == arg0, arg0.field5109, 0, var10, (byte) -23, arg0.field5108, arg0.field5116);
                                } else if (var11 == 2) {
                                    var12.field7328 = 0;
                                }
                            } else if (var10.field6408 >= class49.field739.method2297((byte) 116, var12.field7335).field6408) {
                                var12 = arg0.field1504[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class527 var13 = arg0.field1504[var9] = new class527();
                            var13.field7331 = 0;
                            var13.field7328 = 0;
                            var13.field7335 = var6;
                            var13.field7330 = 0;
                            var13.field7327 = var8;
                            var13.field7332 = 1;
                            class402.method2456(class644.field9367 == arg0, arg0.field5109, 0, var10, (byte) -23, arg0.field5108, arg0.field5116);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (!arg1) {
            main(null);
        }
        field8781++;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field8764++;
        if (!this.method3425(4095)) {
            return;
        }
        class308.field4469 = new class232();
        class308.field4469.field3409 = Integer.parseInt(this.getParameter("worldid"));
        class552.field7820 = new class232();
        class552.field7820.field3409 = Integer.parseInt(this.getParameter("lobbyid"));
        class552.field7820.field3411 = this.getParameter("lobbyaddress");
        field8777 = new class232();
        field8777.field3409 = Integer.parseInt(this.getParameter("demoid"));
        field8777.field3411 = this.getParameter("demoaddress");
        class47.field657 = class474.method2748(98, Integer.parseInt(this.getParameter("modewhere")));
        if (!class211.method1385(10584, class47.field657) && class563.field8065 != class47.field657) {
            class47.field657 = class563.field8065;
        }
        class616.field8722 = class376.method2288(Integer.parseInt(this.getParameter("modewhat")), 62);
        if (class616.field8722 != class115.field1889 && class616.field8722 != class539.field7510 && class616.field8722 != class173.field2510) {
            class616.field8722 = class173.field2510;
        }
        try {
            class538.field7500 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class538.field7500 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class162.field2400 = true;
        } else {
            class162.field2400 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class61.field852 = true;
        } else {
            class61.field852 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class44.field605 = true;
        } else {
            class44.field605 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class640.field9282 = class202.field2846;
            } else if (var4.equals("1")) {
                class640.field9282 = class78.field1412;
            }
        }
        try {
            class56.field803 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class56.field803 = 0;
        }
        class43.field594 = this.getParameter("quiturl");
        class459.field6612 = this.getParameter("settings");
        if (class459.field6612 == null) {
            class459.field6612 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class98.field1707 = Integer.parseInt(var5);
            } catch (Exception var10) {
                class98.field1707 = 0;
            }
        }
        class635.field9232 = Integer.parseInt(this.getParameter("colourid"));
        if (class635.field9232 < 0 || class635.field9232 >= class35.field464.length) {
            class635.field9232 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class636.field9235 = true;
            class153.field2297 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class92.field1634 = true;
        }
        class258.field3752 = this.getParameter("sskey");
        if (class258.field3752 != null && class258.field3752.length() < 2) {
            class258.field3752 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class311.field4555 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class600.field8520 = Integer.parseInt(var8);
            } catch (Exception var9) {
            }
        }
        class454.field6574 = this;
        if (class640.field9282 == class202.field2846) {
            class434.field6380 = 503;
            class356.field5086 = 765;
        } else if (class78.field1412 == class640.field9282) {
            class356.field5086 = 640;
            class434.field6380 = 480;
        }
        this.method3435(class356.field5086, class434.field6380, 608, 59, class616.field8722.method1216(16) + 32);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method3519() {
        class142.field2217 = 0;
        for (int var0 = 0; var0 < class128.field2098; var0++) {
            class170 var1 = ((class181) class432.field6368.method740(0, (long) class591.field8401[var0])).field2623;
            if (var1.field1493 && var1.method778(-33) != -1) {
                int var2 = (var1.method781((byte) -81) - 1) * 64 + 60;
                int var3 = var1.field5108 - var2 >> 7;
                int var4 = var1.field5109 - var2 >> 7;
                class85 var5 = class33.method298((byte) 12, var3, var1.field5116, var4);
                if (var5 != null) {
                    int var6 = var5.field1555;
                    if (var5 instanceof class170) {
                        var6 += 2048;
                    }
                    if (var5.field1529 == 0 && var5.method778(-114) != -1) {
                        class189.field2716[class142.field2217] = var6;
                        class441.field6444[class142.field2217] = var6;
                        class142.field2217++;
                        var5.field1529++;
                    }
                    class189.field2716[class142.field2217] = var6;
                    class441.field6444[class142.field2217] = var1.field1555 + 2048;
                    class142.field2217++;
                    var5.field1529++;
                }
            }
        }
        class520.method2940(class142.field2217 - 1, 0, class441.field6444, class189.field2716, 1);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method3520(int arg0) {
        field8767++;
        if (arg0 != -23965) {
            this.method3525(76);
        }
        if (class64.field893 == 13) {
            return;
        }
        long var2 = class161.method1130((byte) 34) / 1000000L - class44.field599;
        class44.field599 = class161.method1130((byte) -126) / 1000000L;
        boolean var4 = class353.method2150(-121);
        if (var4 && class331.field4757 && class127.field2087 != null) {
            class127.field2087.method2071(0);
        }
        if (class634.method3663(-119, class64.field893)) {
            if (class337.field4833 != 0L && class508.method2860(false) > class337.field4833) {
                class5.method14(class202.field2854.field7920, arg0 ^ 0xFFFFA21A, class202.field2854.field7924, false, class512.method2868(2));
            } else if (!class159.field2378.method559() && class183.field2633) {
                class562.method3206(23874);
            }
        }
        if (class443.field6474 == null) {
            Container var5;
            if (class327.field4718 == null) {
                var5 = class270.field3976.field549;
            } else {
                var5 = class327.field4718;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class327.field4718 == var5) {
                Insets var8 = class327.field4718.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class416.field6134 != var6 || class638.field9262 != var7) {
                if (class159.field2378 == null || class159.field2378.method635()) {
                    class568.method3223(arg0 ^ 0x599C);
                } else {
                    class638.field9262 = var7;
                    class416.field6134 = var6;
                }
                class337.field4833 = class508.method2860(false) + 500L;
            }
        }
        if (class443.field6474 != null && !class497.field6973 && class634.method3663(-63, class64.field893)) {
            class5.method14(-1, -74, -1, false, class202.field2854.field7925);
        }
        boolean var9 = false;
        if (class17.field258) {
            class17.field258 = false;
            var9 = true;
        }
        if (var9) {
            class629.method3560(-1);
        }
        if (class159.field2378 != null && class159.field2378.method559() || class512.method2868(2) != 1) {
            class530.method2980(arg0 ^ 0x4776);
        }
        if (class64.field893 == 0) {
            method3515(class133.field2149, class534.field7461[class635.field9232], class451.field6556, class35.field464[class635.field9232], var9, class263.field3836[class635.field9232], -77);
        } else if (class64.field893 == 1) {
            class605.method3448(class273.field3996, class159.field2378, class534.field7461[class635.field9232].getRGB(), class263.field3836[class635.field9232].getRGB(), 2, class35.field464[class635.field9232].getRGB(), var9 | class159.field2378.method559());
        } else if (class363.method2190(class64.field893, true)) {
            class362.method2186(true);
        } else if (class339.method2084(class64.field893, 0)) {
            class362.method2186(true);
        } else if (class118.method974(class64.field893, arg0 ^ 0xFFFFA218)) {
            if (class534.field7460 == 1) {
                if (class62.field860 < class179.field2612) {
                    class62.field860 = class179.field2612;
                }
                int var10 = (class62.field860 - class179.field2612) * 50 / class62.field860;
                class247.method1570(class130.field2119.method3220(false, class538.field7500) + "<br>(" + var10 + "%)", class409.field6077, true, 15900);
            } else if (class534.field7460 == 2) {
                if (class583.field8317 > class639.field9279) {
                    class639.field9279 = class583.field8317;
                }
                int var11 = ((class639.field9279 - class583.field8317) * 50 / class639.field9279) + 50;
                class247.method1570(class130.field2119.method3220(false, class538.field7500) + "<br>(" + var11 + "%)", class409.field6077, true, 15900);
            } else {
                class247.method1570(class130.field2119.method3220(false, class538.field7500), class409.field6077, true, arg0 + 39865);
            }
        } else if (class64.field893 == 9) {
            class409.method2484(21981, var2);
        } else if (class64.field893 == 12) {
            class247.method1570(class573.field8155.method3220(false, class538.field7500) + "<br>" + class158.field2374.method3220(false, class538.field7500), class409.field6077, true, arg0 ^ 0xFFFF9C7F);
        }
        if (class525.field7288 == 3) {
            for (int var12 = 0; var12 < class562.field8052; var12++) {
                Rectangle var13 = class514.field7113[var12];
                if (class141.field2208[var12]) {
                    class159.field2378.method1159(-1996553985, var13.height, var13.y, var13.x, (byte) 87, var13.width);
                } else if (class301.field4347[var12]) {
                    class159.field2378.method1159(-1996554240, var13.height, var13.y, var13.x, (byte) 92, var13.width);
                }
            }
        }
        if (class310.method1932(true)) {
            class146.method1066(class159.field2378, -26173);
        }
        if (class634.method3663(-94, class64.field893) && class525.field7288 == 0 && class512.method2868(2) == 1 && !var9 && class40.field562.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class562.field8052; var15++) {
                if (class301.field4347[var15]) {
                    class301.field4347[var15] = false;
                    class214.field3245[var14++] = class514.field7113[var15];
                }
            }
            try {
                class159.field2378.method158(class214.field3245, var14);
            } catch (class354 var19) {
            }
        } else if (class64.field893 != 0) {
            for (int var16 = 0; var16 < class562.field8052; var16++) {
                class301.field4347[var16] = false;
            }
            try {
                class159.field2378.method94();
            } catch (class354 var18) {
                class593.method3390(var18.getMessage() + " (Recovered) " + this.method3421((byte) 36), var18, 0);
                class471.method2738(arg0 + 24092, 0);
            }
        }
        if (class202.field2854.field7883 == 0) {
            class210.method1342(-68, 15L);
        } else if (class202.field2854.field7883 == 1) {
            class210.method1342(-31, 10L);
        } else if (class202.field2854.field7883 == 2) {
            class210.method1342(-52, 5L);
        } else if (class202.field2854.field7883 == 3) {
            class210.method1342(-75, 2L);
        }
        if (class155.field2337) {
            class192.method1269(-937456707);
        }
        if (class202.field2854.field7923 && class64.field893 == 2 && class609.field8659 != -1) {
            class202.field2854.field7923 = false;
            class202.field2854.method2642((byte) -120, class270.field3976);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method3521(byte arg0) {
        field8777 = null;
        field8782 = null;
        int var1 = 33 / ((arg0 + 54) / 44);
        field8778 = null;
        field8770 = null;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method3522() {
        for (int var0 = 0; var0 < class146.field2247; var0++) {
            int[] var1 = class393.field5893[var0];
            for (int var2 = 0; var2 < class66.field990; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method3523(int arg0) {
        field8773++;
        if (class384.field5712.field1791 > class109.field1824) {
            class417.field6142 = (class384.field5712.field1791 * 50 - 50) * 5;
            class352.field5017.field3408 = !class352.field5017.field3408;
            if (class417.field6142 > 3000) {
                class417.field6142 = 3000;
            }
            if (class384.field5712.field1791 >= 2 && class384.field5712.field1793 == 6) {
                this.method3418("js5connect_outofdate", arg0 + 3487);
                class64.field893 = 13;
                return;
            }
            if (class384.field5712.field1791 >= 4 && class384.field5712.field1793 == -1) {
                this.method3418("js5crc", 4095);
                class64.field893 = 13;
                return;
            }
            if (class384.field5712.field1791 >= 4 && class454.method2670(class64.field893, true)) {
                if (class384.field5712.field1793 == 7 || class384.field5712.field1793 == 9) {
                    this.method3418("js5connect_full", 4095);
                } else if (class384.field5712.field1793 <= 0) {
                    this.method3418("js5io", arg0 ^ 0xD9F);
                } else {
                    this.method3418("js5connect", 4095);
                }
                class64.field893 = 13;
                return;
            }
        }
        class109.field1824 = class384.field5712.field1791;
        if (class417.field6142 > 0) {
            class417.field6142--;
            return;
        }
        try {
            if (class503.field7035 == 0) {
                class57.field815 = class270.field3976.method347(2471, class352.field5017.field3411, class352.field5017.method1517(-7005));
                class503.field7035++;
            }
            if (class503.field7035 == 1) {
                if (class57.field815.field4739 == 2) {
                    this.method3516((byte) -10, 1000);
                    return;
                }
                if (class57.field815.field4739 == 1) {
                    class503.field7035++;
                }
            }
            if (class503.field7035 == 2) {
                class268.field3930 = new class580((Socket) class57.field815.field4737, class270.field3976);
                class268 var2 = new class268(5);
                var2.method1710(class97.field1679.field7507, 110);
                var2.method1702(608, false);
                class268.field3930.method3317(0, 5, var2.field3952, false);
                class503.field7035++;
                class172.field2500 = class508.method2860(false);
            }
            if (class503.field7035 == 3) {
                if (class454.method2670(class64.field893, true) || class268.field3930.method3321(90) > 0) {
                    int var3 = class268.field3930.method3320((byte) -38);
                    if (var3 != 0) {
                        this.method3516((byte) -10, var3);
                        return;
                    }
                    class503.field7035++;
                } else if ((class508.method2860(false) - class172.field2500) > 30000L) {
                    this.method3516((byte) -10, 1001);
                    return;
                }
            }
            if (class503.field7035 == 4) {
                boolean var4 = class64.field893 == 1 || class332.method2055(class64.field893, (byte) 98) || class24.method238(-107, class64.field893);
                class384.field5712.method905(class268.field3930, !var4, -30001);
                class503.field7035 = 0;
                class268.field3930 = null;
                class57.field815 = null;
            }
            if (arg0 != 608) {
                field8770 = null;
            }
        } catch (IOException var5) {
            this.method3516((byte) -10, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ltv;Z)Z")
    public static final boolean method3524(class360 arg0, boolean arg1) {
        boolean var2 = class88.field1594 == class73.field1360;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method788((byte) 118);
        if (arg0.field5117 < 0 || arg0.field5113 < 0 || arg0.field5119 >= class362.field5145 || arg0.field5107 >= class305.field4400) {
            return false;
        }
        for (int var6 = arg0.field5117; var6 <= arg0.field5119; var6++) {
            for (int var9 = arg0.field5113; var9 <= arg0.field5107; var9++) {
                class184 var10 = class551.method3098(arg0.field5116, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field5117) {
                        var11++;
                    }
                    if (var6 < arg0.field5119) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field5113) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field5107) {
                        var11 += 2;
                    }
                    class277 var12 = class33.method300(false, var11, arg0);
                    class277 var13 = var10.field2675;
                    if (var13 == null) {
                        var10.field2675 = var12;
                    } else {
                        while (var13.field4045 != null) {
                            var13 = var13.field4045;
                        }
                        var13.field4045 = var12;
                    }
                    var10.field2671 = (byte) (var10.field2671 | var11);
                    if (var2 && (class99.field1716[var6][var9] & 0xFF000000) != 0) {
                        var3 = class99.field1716[var6][var9];
                        var4 = class470.field6764[var6][var9];
                        var5 = class103.field1746[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field5117; var7 <= arg0.field5119; var7++) {
                for (int var8 = arg0.field5113; var8 <= arg0.field5107; var8++) {
                    if ((class99.field1716[var7][var8] & 0xFF000000) == 0) {
                        class99.field1716[var7][var8] = var3;
                        class470.field6764[var7][var8] = var4;
                        class103.field1746[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class393.field5892[class262.field3831++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method3422(int arg0) {
        if (class311.field4555) {
            class555.field7861 = 64;
        }
        field8761++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class568.method3223(-1025);
        class469.field6754 = new class372(class270.field3976);
        class384.field5712 = new class106();
        if (class563.field8065 != class47.field657) {
            class583.field8316 = new byte[50][];
        }
        class202.field2854 = new class446(class270.field3976);
        if (class563.field8065 == class47.field657) {
            class308.field4469.field3411 = this.getCodeBase().getHost();
        } else if (class211.method1385(10584, class47.field657)) {
            class308.field4469.field3411 = this.getCodeBase().getHost();
            class308.field4469.field3416 = class308.field4469.field3409 + 40000;
            class552.field7820.field3416 = class552.field7820.field3409 + 40000;
            field8777.field3416 = field8777.field3409 + 40000;
            class308.field4469.field3413 = class308.field4469.field3409 + 50000;
            class552.field7820.field3413 = class552.field7820.field3409 + 50000;
            field8777.field3413 = field8777.field3409 + 50000;
        } else if (class97.field1693 == class47.field657) {
            class308.field4469.field3411 = "127.0.0.1";
            class552.field7820.field3411 = "127.0.0.1";
            class308.field4469.field3416 = class308.field4469.field3409 + 40000;
            field8777.field3411 = "127.0.0.1";
            class552.field7820.field3416 = class552.field7820.field3409 + 40000;
            field8777.field3416 = field8777.field3409 + 40000;
            class308.field4469.field3413 = class308.field4469.field3409 + 50000;
            class552.field7820.field3413 = class552.field7820.field3409 + 50000;
            field8777.field3413 = field8777.field3409 + 50000;
        }
        if (class78.field1412 == class640.field9282) {
            class265.field3873 = class52.field760;
            class201.field2840 = class97.field1695;
            class616.field8714 = 16777215;
            class99.field1724 = true;
            class242.field3517 = class484.field6852;
            class273.field3991 = class464.field6703;
            class274.field3997 = 0;
        } else {
            class242.field3517 = class218.field3289;
            class273.field3991 = class168.field2454;
            class201.field2840 = class322.field4655;
            class265.field3873 = class49.field743;
        }
        class352.field5017 = class308.field4469;
        class129.field2101 = class581.field8285 = class324.field4672 = class616.field8715 = new short[256];
        if (class640.field9282 == class202.field2846) {
            class69.field1308 = false;
        }
        class404.field6022 = class209.method1336(false, class474.field6795);
        class619.field8735 = class222.method1486(class474.field6795, arg0 ^ 0x2D99, true);
        class243.field3520 = class40.field554;
        try {
            if (arg0 != 2969) {
                return;
            }
            if (class270.field3976.field551 != null) {
                class247.field3558 = new class392(class270.field3976.field551, 5200, 0);
                for (int var3 = 0; var3 < 32; var3++) {
                    class528.field7352[var3] = new class392(class270.field3976.field547[var3], 6000, 0);
                }
                class223.field3353 = new class392(class270.field3976.field563, 6000, 0);
                class561.field8016 = new class270(255, class247.field3558, class223.field3353, 500000);
                class374.field5490 = new class392(class270.field3976.field557, 24, 0);
                class270.field3976.field563 = null;
                class270.field3976.field551 = null;
                class270.field3976.field547 = null;
                class270.field3976.field557 = null;
            }
        } catch (IOException var4) {
            class223.field3353 = null;
            class561.field8016 = null;
            class374.field5490 = null;
            class247.field3558 = null;
        }
        if (class563.field8065 != class47.field657) {
            class201.field2844 = true;
        }
        if (class640.field9282 == class202.field2846) {
            class311.field4558 = class305.field4390.method3220(false, class538.field7500);
        } else if (class78.field1412 == class640.field9282) {
            class311.field4558 = class80.field1437.method3220(false, class538.field7500);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method3525(int arg0) {
        field8775++;
        boolean var2 = class384.field5712.method903(arg0 ^ 0x6649);
        if (arg0 != -26186) {
            this.method3419(false);
        }
        if (!var2) {
            this.method3523(608);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
    private final void method3526(byte arg0, byte[] arg1) {
        field8760++;
        if (arg0 > -39) {
            this.method3514(null, -30);
        }
        class268 var3 = new class268(arg1);
        while (true) {
            while (true) {
                int var4 = var3.method1738(255);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class538.field7502 = new int[6];
                    var5[0] = var3.method1745(32132);
                    var5[1] = var3.method1745(32132);
                    var5[2] = var3.method1745(32132);
                    var5[3] = var3.method1745(32132);
                    var5[4] = var3.method1745(32132);
                    var5[5] = var3.method1745(32132);
                } else if (var4 == 4) {
                    int var6 = var3.method1738(255);
                    class122.field1951 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class122.field1951[var7] = var3.method1745(32132);
                        if (class122.field1951[var7] == 65535) {
                            class122.field1951[var7] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var8 = var3.method1738(255);
                    class536.field7486 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class536.field7486[var9] = var3.method1745(32132);
                        if (class536.field7486[var9] == 65535) {
                            class536.field7486[var9] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method3527(int arg0) {
        if (!class202.field2854.field7923) {
            for (int var2 = 0; var2 < class151.field2283; var2++) {
                if (class465.field6706[var2].method837(false) == 's' || class465.field6706[var2].method837(false) == 'S') {
                    class202.field2854.field7923 = true;
                    break;
                }
            }
        }
        field8763++;
        if (class111.field1845 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class508.method2860(false);
            if (class614.field8711 == 0L) {
                class614.field8711 = var5;
            }
            if (var4 > 16384 && var5 - class614.field8711 < 5000L) {
                if ((var5 - class300.field4334) > 1000L) {
                    System.gc();
                    class300.field4334 = var5;
                }
                class451.field6556 = class514.field7111.method3220(false, class538.field7500);
                class133.field2149 = 5;
            } else {
                class451.field6556 = class79.field1433.method3220(false, class538.field7500);
                class111.field1845 = 10;
                class133.field2149 = 5;
            }
        } else if (class111.field1845 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class268.field3916[var7] = class380.method2305((byte) 101, class146.field2247, class66.field990);
            }
            class451.field6556 = class127.field2086.method3220(false, class538.field7500);
            class111.field1845 = 20;
            class133.field2149 = 10;
        } else if (class111.field1845 == 20) {
            if (class584.field8322 == null) {
                class584.field8322 = new class6(class384.field5712, class469.field6754, class471.field6775, class131.field2124);
            }
            if (class584.field8322.method21(6)) {
                class420.field6182 = class496.method2831(0, 1, false, 0, true);
                class576.field8225 = class496.method2831(0, 1, false, 1, true);
                class352.field5018 = class496.method2831(0, 1, false, 2, true);
                class51.field759 = class496.method2831(0, 1, false, 3, true);
                class366.field5196 = class496.method2831(0, 1, false, 4, true);
                class597.field8501 = class496.method2831(0, 1, true, 5, true);
                class115.field1890 = class496.method2831(0, 1, true, 6, false);
                class193.field2784 = class496.method2831(0, 1, false, 7, true);
                class325.field4675 = class496.method2831(arg0 + 15931, 1, false, 8, true);
                class325.field4681 = class496.method2831(0, 1, false, 9, true);
                class555.field7858 = class496.method2831(0, 1, false, 10, true);
                class234.field3442 = class496.method2831(0, 1, false, 11, true);
                class108.field1804 = class496.method2831(0, 1, false, 12, true);
                class353.field5059 = class496.method2831(arg0 + 15931, 1, false, 13, true);
                class523.field7265 = class496.method2831(0, 1, false, 14, false);
                class539.field7506 = class496.method2831(0, 1, false, 15, true);
                class129.field2108 = class496.method2831(0, 1, false, 16, true);
                class284.field4145 = class496.method2831(0, 1, false, 17, true);
                class206.field2901 = class496.method2831(0, 1, false, 18, true);
                class179.field2600 = class496.method2831(0, 1, false, 19, true);
                class220.field3308 = class496.method2831(0, 1, false, 20, true);
                class565.field8087 = class496.method2831(0, 1, false, 21, true);
                class274.field4011 = class496.method2831(0, 1, false, 22, true);
                class421.field6184 = class496.method2831(0, 1, true, 23, true);
                class287.field4182 = class496.method2831(0, 1, false, 24, true);
                class627.field8841 = class496.method2831(0, 1, false, 25, true);
                class419.field6163 = class496.method2831(0, 1, true, 26, true);
                class431.field6293 = class496.method2831(0, 1, false, 27, true);
                class578.field8246 = class496.method2831(0, 1, true, 28, true);
                class459.field6619 = class496.method2831(0, 1, false, 29, true);
                class394.field5908 = class496.method2831(0, 1, true, 30, true);
                class111.field1843 = class496.method2831(arg0 ^ 0xFFFFC1C5, 1, true, 31, true);
                class451.field6556 = class132.field2126.method3220(false, class538.field7500);
                class111.field1845 = 30;
                class133.field2149 = 15;
            } else {
                class451.field6556 = class609.field8656.method3220(false, class538.field7500);
                class133.field2149 = 12;
            }
        } else if (class111.field1845 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 32; var9++) {
                var8 += class509.field7069[var9].method2986(arg0 ^ 0xFFFFC1C5) * class624.field8790[var9] / 100;
            }
            if (var8 == 100) {
                class451.field6556 = class8.field79.method3220(false, class538.field7500);
                class133.field2149 = 20;
                class504.method2855(4095, class325.field4675);
                class291.method1842((byte) -56, class325.field4675);
                class111.field1845 = 35;
            } else {
                if (var8 != 0) {
                    class451.field6556 = class353.field5035.method3220(false, class538.field7500) + var8 + "%";
                }
                class133.field2149 = 20;
            }
        } else if (class111.field1845 == 35) {
            class246.method1561(true, class270.field3976, class394.field5908);
            class451.field6556 = class408.field6053.method3220(false, class538.field7500);
            class111.field1845 = 40;
            class133.field2149 = 20;
        } else {
            if (arg0 != -15931) {
                method3518(null, true, null, null, null);
            }
            if (class111.field1845 == 40) {
                if (class578.field8246.method3181(-125)) {
                    this.method3526((byte) -52, class578.field8246.method3177(arg0 ^ 0xFFFFC1C5, 1));
                    this.method3514(class578.field8246.method3177(0, 3), 100);
                    if (class139.field2192 == -1 || class193.field2784.method3187(0, (byte) 68, class139.field2192)) {
                        class451.field6556 = class181.field2619.method3220(false, class538.field7500);
                        class133.field2149 = 25;
                        class111.field1845 = 41;
                    }
                } else {
                    class451.field6556 = class303.field4376.method3220(false, class538.field7500) + class578.field8246.method3171((byte) 42) + "%";
                    class133.field2149 = 25;
                }
            } else if (class111.field1845 == 41) {
                int var10 = class62.method490("jaggl", 28598);
                if (var10 >= 0 && var10 < 100) {
                    class451.field6556 = class275.field4022.method3220(false, class538.field7500) + var10 + "%";
                    class133.field2149 = 25;
                } else {
                    class451.field6556 = class578.field8247.method3220(false, class538.field7500);
                    class133.field2149 = 25;
                    class111.field1845 = 42;
                }
            } else if (class111.field1845 == 42) {
                int var11 = class62.method490("jagdx", 28598);
                if (var11 >= 0 && var11 < 100) {
                    class451.field6556 = class182.field2629.method3220(false, class538.field7500) + var11 + "%";
                    class133.field2149 = 25;
                } else {
                    class451.field6556 = class449.field6542.method3220(false, class538.field7500);
                    class111.field1845 = 43;
                    class133.field2149 = 25;
                }
            } else if (class111.field1845 == 43) {
                int var12 = class62.method490("jagmisc", 28598);
                if (var12 >= 0 && var12 < 100) {
                    class451.field6556 = class388.field5787.method3220(false, class538.field7500) + var12 + "%";
                    class133.field2149 = 25;
                } else {
                    if (var12 == 100) {
                        this.method3433(arg0 + 15968);
                    }
                    class451.field6556 = class498.field6984.method3220(false, class538.field7500);
                    class111.field1845 = 44;
                    class133.field2149 = 25;
                }
            } else if (class111.field1845 == 44) {
                int var13 = class62.method490("sw3d", 28598);
                if (var13 >= 0 && var13 < 100) {
                    class451.field6556 = class90.field1616.method3220(false, class538.field7500) + var13 + "%";
                    class133.field2149 = 25;
                } else {
                    class451.field6556 = class272.field3990.method3220(false, class538.field7500);
                    class111.field1845 = 45;
                    class133.field2149 = 25;
                }
            } else if (class111.field1845 == 45) {
                int var14 = class62.method490("jaclib", 28598);
                if (var14 >= 0 && var14 < 100) {
                    class451.field6556 = class265.field3859.method3220(false, class538.field7500) + var14 + "%";
                    class133.field2149 = 25;
                } else {
                    if (var14 == 100) {
                        this.method3427(-127);
                    }
                    class451.field6556 = class241.field3511.method3220(false, class538.field7500);
                    class111.field1845 = 46;
                    class133.field2149 = 25;
                }
            } else if (class111.field1845 == 46) {
                int var15 = class62.method490("hw3d", 28598);
                if (var15 >= 0 && var15 < 100) {
                    class451.field6556 = class603.field8584.method3220(false, class538.field7500) + var15 + "%";
                    class133.field2149 = 25;
                } else {
                    class451.field6556 = class89.field1601.method3220(false, class538.field7500);
                    class133.field2149 = 25;
                    class111.field1845 = 47;
                }
            } else if (class111.field1845 == 47) {
                if (class111.field1843.method3181(-125)) {
                    class451.field6556 = class369.field5240.method3220(false, class538.field7500);
                    class111.field1845 = 50;
                    class133.field2149 = 25;
                } else {
                    class451.field6556 = class147.field2249.method3220(false, class538.field7500);
                    class133.field2149 = 25;
                }
            } else if (class111.field1845 == 50) {
                class382.method2329(true);
                class451.field6556 = class640.field9290.method3220(false, class538.field7500);
                class133.field2149 = 30;
                class111.field1845 = 60;
            } else if (class111.field1845 == 60) {
                int var16 = class328.method2041(class353.field5059, class325.field4675, 0);
                int var17 = class517.method2915((byte) -73);
                if (var17 > var16) {
                    class451.field6556 = class640.field9287.method3220(false, class538.field7500) + var16 * 100 / var17 + "%";
                    class133.field2149 = 35;
                } else {
                    class451.field6556 = class492.field6915.method3220(false, class538.field7500);
                    class111.field1845 = 70;
                    class133.field2149 = 35;
                }
            } else if (class111.field1845 == 70) {
                int var18 = class34.method311(class325.field4675, -1394);
                int var19 = class79.method747(2);
                if (var18 < var19) {
                    class451.field6556 = class219.field3293.method3220(false, class538.field7500) + var18 * 100 / var19 + "%";
                    class133.field2149 = 40;
                } else {
                    class451.field6556 = class638.field9267.method3220(false, class538.field7500);
                    class133.field2149 = 40;
                    class111.field1845 = 80;
                }
            } else if (class111.field1845 == 80) {
                if (class419.field6163.method3181(-125)) {
                    class227.field3390 = new class394(class419.field6163, class325.field4681, class325.field4675);
                    class451.field6556 = class258.field3747.method3220(false, class538.field7500);
                    class133.field2149 = 45;
                    class111.field1845 = 90;
                } else {
                    class451.field6556 = class430.field6272.method3220(false, class538.field7500) + class419.field6163.method3171((byte) 113) + "%";
                    class133.field2149 = 45;
                }
            } else if (class111.field1845 == 90) {
                class451.field6556 = class139.field2191.method3220(false, class538.field7500);
                class133.field2149 = 50;
                class111.field1845 = 95;
            } else if (class111.field1845 == 95) {
                if (class202.field2854.field7923) {
                    class202.field2854.field7885 = 0;
                    class202.field2854.field7890 = 0;
                    class202.field2854.field7918 = 0;
                    class202.field2854.field7925 = 1;
                    class202.field2854.field7889 = 0;
                }
                class202.field2854.field7923 = true;
                class202.field2854.method2642((byte) -120, class270.field3976);
                class169.method1173(-1, false, class202.field2854.field7918);
                class451.field6556 = class65.field928.method3220(false, class538.field7500);
                class111.field1845 = 100;
                class133.field2149 = 55;
            } else if (class111.field1845 == 100) {
                class568.method3224(class353.field5059, (byte) 11, class159.field2378, class325.field4675);
                class451.field6556 = class274.field4009.method3220(false, class538.field7500);
                class133.field2149 = 60;
                class307.method1904(true, 1);
                class111.field1845 = 110;
            } else if (class111.field1845 == 110) {
                byte var20 = 0;
                class352.field5018.method3181(-128);
                int var21 = var20 + class352.field5018.method3171((byte) 117);
                class129.field2108.method3181(-124);
                int var22 = var21 + class129.field2108.method3171((byte) 95);
                class284.field4145.method3181(-128);
                int var23 = var22 + class284.field4145.method3171((byte) -126);
                class206.field2901.method3181(-128);
                int var24 = var23 + class206.field2901.method3171((byte) -108);
                class179.field2600.method3181(-124);
                int var25 = var24 + class179.field2600.method3171((byte) -124);
                class220.field3308.method3181(-128);
                int var26 = var25 + class220.field3308.method3171((byte) 50);
                class565.field8087.method3181(arg0 + 15805);
                int var27 = var26 + class565.field8087.method3171((byte) -120);
                class274.field4011.method3181(-126);
                int var28 = var27 + class274.field4011.method3171((byte) -65);
                class287.field4182.method3181(arg0 + 15804);
                int var29 = var28 + class287.field4182.method3171((byte) -117);
                class627.field8841.method3181(-127);
                int var30 = var29 + class627.field8841.method3171((byte) 103);
                class431.field6293.method3181(-126);
                int var31 = var30 + class431.field6293.method3171((byte) 102);
                class459.field6619.method3181(arg0 ^ 0x3E46);
                int var32 = var31 + class459.field6619.method3171((byte) 96);
                if (var32 < 1200) {
                    class451.field6556 = field8778.method3220(false, class538.field7500) + var32 / 12 + "%";
                    class133.field2149 = 65;
                } else {
                    class190.field2724 = new class289(class640.field9282, class538.field7500, class352.field5018);
                    class469.field6760 = new class173(class640.field9282, class538.field7500, class352.field5018);
                    class576.field8224 = new class586(class640.field9282, class538.field7500, class352.field5018, class325.field4675);
                    class386.field5742 = new class131(class640.field9282, class538.field7500, class284.field4145);
                    class275.field4027 = new class195(class640.field9282, class538.field7500, class352.field5018);
                    class540.field7521 = new class114(class640.field9282, class538.field7500, class352.field5018);
                    class468.field6744 = new class376(class640.field9282, class538.field7500, class352.field5018, class193.field2784);
                    class12.field130 = new class484(class640.field9282, class538.field7500, class352.field5018);
                    class639.field9269 = new class469(class640.field9282, class538.field7500, class352.field5018);
                    class552.field7819 = new class515(class640.field9282, class538.field7500, true, class129.field2108, class193.field2784);
                    class249.field3634 = new class12(class640.field9282, class538.field7500, class352.field5018, class325.field4675);
                    class484.field6855 = new class429(class640.field9282, class538.field7500, class352.field5018, class325.field4675);
                    class204.field2882 = new class31(class640.field9282, class538.field7500, true, class206.field2901, class193.field2784);
                    class611.field8684 = new class257(class640.field9282, class538.field7500, true, class190.field2724, class179.field2600, class193.field2784);
                    class394.field5911 = new class77(class640.field9282, class538.field7500, class352.field5018);
                    class49.field739 = new class378(class640.field9282, class538.field7500, class220.field3308, class420.field6182, class576.field8225);
                    class316.field4615 = new class205(class640.field9282, class538.field7500, class352.field5018);
                    class92.field1638 = new class524(class640.field9282, class538.field7500, class352.field5018);
                    class522.field7247 = new class410(class640.field9282, class538.field7500, class565.field8087, class193.field2784);
                    class632.field9046 = new class590(class640.field9282, class538.field7500, class352.field5018);
                    class548.field7616 = new class330(class640.field9282, class538.field7500, class352.field5018);
                    class524.field7287 = new class635(class640.field9282, class538.field7500, class352.field5018);
                    class17.field257 = new class461(class640.field9282, class538.field7500, class274.field4011);
                    class173.field2515 = new class547(class640.field9282, class538.field7500, class352.field5018);
                    class75.method717(2259880, class353.field5059, class193.field2784, class51.field759, class325.field4675);
                    class246.method1565(class459.field6619, arg0 ^ 0x3E39);
                    class159.field2377 = new class577(class538.field7500, class287.field4182, class627.field8841);
                    class377.field5545 = new class408(class538.field7500, class287.field4182, class627.field8841, new class46());
                    class451.field6556 = class359.field5094.method3220(false, class538.field7500);
                    class133.field2149 = 65;
                    class374.method2274(false);
                    class552.field7819.method2887((byte) -91, !class202.field2854.method2628((byte) 68, class646.field9388));
                    class401.field6001 = new class626();
                    class229.method1508(0);
                    class589.method3372(class431.field6293, -106);
                    class19.method219(class227.field3390, class193.field2784, -3);
                    class111.field1845 = 120;
                }
            } else if (class111.field1845 == 120) {
                int var33 = class282.method1803(class325.field4675, 5424);
                int var34 = class574.method3285((byte) -121);
                if (var34 > var33) {
                    class451.field6556 = class232.field3414.method3220(false, class538.field7500) + var33 * 100 / var34 + "%";
                    class133.field2149 = 70;
                } else {
                    class542.method3040(class325.field4675, true, class159.field2378);
                    class278.method1794(class25.field351, (byte) -73);
                    class451.field6556 = class286.field4165.method3220(false, class538.field7500);
                    class133.field2149 = 70;
                    class111.field1845 = 130;
                }
            } else if (class111.field1845 == 130) {
                if (class555.field7858.method3173("huffman", -45, "")) {
                    class413 var35 = new class413(class555.field7858.method3193(-14855, "huffman", ""));
                    class59.method474(var35, -4);
                    class451.field6556 = class633.field9200.method3220(false, class538.field7500);
                    class111.field1845 = 140;
                    class133.field2149 = 75;
                } else {
                    class451.field6556 = class261.field3806.method3220(false, class538.field7500) + "0%";
                    class133.field2149 = 75;
                }
            } else if (class111.field1845 == 140) {
                if (class51.field759.method3181(-126)) {
                    class451.field6556 = class371.field5367.method3220(false, class538.field7500);
                    class133.field2149 = 80;
                    class111.field1845 = 150;
                } else {
                    class451.field6556 = class350.field5004.method3220(false, class538.field7500) + class51.field759.method3171((byte) 113) + "%";
                    class133.field2149 = 80;
                }
            } else if (class111.field1845 == 150) {
                if (class108.field1804.method3181(-125)) {
                    class451.field6556 = class571.field8151.method3220(false, class538.field7500);
                    class133.field2149 = 82;
                    class111.field1845 = 160;
                } else {
                    class451.field6556 = class64.field892.method3220(false, class538.field7500) + class108.field1804.method3171((byte) 106) + "%";
                    class133.field2149 = 82;
                }
            } else if (class111.field1845 == 160) {
                if (class353.field5059.method3181(arg0 + 15805)) {
                    class451.field6556 = class621.field8753.method3220(false, class538.field7500);
                    class111.field1845 = 170;
                    class133.field2149 = 85;
                } else {
                    class451.field6556 = class621.field8753.method3220(false, class538.field7500) + class353.field5059.method3171((byte) 52) + "%";
                    class133.field2149 = 85;
                }
            } else if (class111.field1845 == 170) {
                if (class421.field6184.method3168((byte) -106, "details")) {
                    class212.method1422(class421.field6184, class275.field4027, class540.field7521, class552.field7819, class249.field3634, class484.field6855, class401.field6001);
                    class451.field6556 = class551.field7810.method3220(false, class538.field7500);
                    class111.field1845 = 190;
                    class133.field2149 = 89;
                } else {
                    class451.field6556 = class209.field2952.method3220(false, class538.field7500) + class421.field6184.method3182("details", -50) + "%";
                    class133.field2149 = 87;
                }
            } else if (class111.field1845 == 190) {
                class340.field4893 = new String[class548.field7616.field4745];
                class310.field4551 = new int[class524.field7287.field9227];
                class459.field6618 = new boolean[class524.field7287.field9227];
                for (int var36 = 0; var36 < class524.field7287.field9227; var36++) {
                    if (class524.field7287.method3670(var36, true).field291 == 0) {
                        class459.field6618[var36] = true;
                        class17.field256++;
                    }
                    class310.field4551[var36] = -1;
                }
                class278.method1795(0);
                class221.field3318 = class51.field759.method3195(0, "loginscreen");
                class79.field1430 = class51.field759.method3195(arg0 ^ 0xFFFFC1C5, "lobbyscreen");
                class597.field8501.method3174(false, true, 16112);
                class115.field1890.method3174(true, true, 16112);
                class325.field4675.method3174(true, true, 16112);
                class353.field5059.method3174(true, true, 16112);
                class555.field7858.method3174(true, true, 16112);
                class51.field759.method3174(true, true, 16112);
                class155.field2337 = true;
                class352.field5018.field8003 = 2;
                class284.field4145.field8003 = 2;
                class129.field2108.field8003 = 2;
                class206.field2901.field8003 = 2;
                class179.field2600.field8003 = 2;
                class220.field3308.field8003 = 2;
                class565.field8087.field8003 = 2;
                class5.method14(-1, 79, -1, false, class202.field2854.field7925);
                class451.field6556 = class605.field8616.method3220(false, class538.field7500);
                class111.field1845 = 200;
                class133.field2149 = 95;
            } else if (class111.field1845 == 200) {
                class307.method1904(true, 2);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method3426(boolean arg0) {
        field8759++;
        if (class2.field14) {
            class433.method2583(6428);
        }
        if (class159.field2378 != null) {
            class159.field2378.method1163(6510);
        }
        if (class443.field6474 != null) {
            class499.method2843(class270.field3976, (byte) 10, class443.field6474);
            class443.field6474 = null;
        }
        if (field8770 != null) {
            field8770.method2743((byte) -124);
            field8770 = null;
        }
        class302.method1887((byte) -101);
        class384.field5712.method899(-101);
        class469.field6754.method2260(arg0);
        if (class294.field4251 != null) {
            class294.field4251.method2059(4);
            class294.field4251 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method3419(boolean arg0) {
        field8776++;
        method3521((byte) 108);
        class237.method1539((byte) -23);
        class137.method1043(-71);
        class21.method226(66);
        class352.method2133((byte) -79);
        class324.method2010(256);
        class443.method2618(2);
        class108.method913(0);
        class78.method743(-87);
        class602.method3436(32763);
        class179.method1218(0);
        class36.method318(true);
        class584.method3341(53);
        class105.method886((byte) 32);
        class167.method1158(-8670);
        class446.method2643(-2001);
        class371.method2254(0);
        class626.method3556(-8520);
        class47.method422(0);
        class580.method3324((byte) -95);
        class106.method894(255);
        class6.method17((byte) -41);
        class531.method2996((byte) -78);
        class561.method3188((byte) -124);
        class270.method1753(255);
        class395.method2402(113);
        class173.method1195(10209);
        class586.method3359(false);
        class131.method1018(17584);
        class195.method1287((byte) 38);
        class114.method938((byte) 93);
        class376.method2285(-8);
        class484.method2783((byte) -103);
        class469.method2729(-1);
        class515.method2879((byte) -106);
        class12.method72(36);
        class429.method2554(-1);
        class31.method289(5886);
        class289.method1832(113);
        class205.method1316(78);
        class524.method2950(!arg0);
        class410.method2485(-102);
        class590.method3379(false);
        class330.method2047(-3682);
        class635.method3668((byte) -128);
        class461.method2704(-1);
        class547.method3066(5708);
        class577.method3301(false);
        class408.method2480((byte) 99);
        class181.method1221(-101);
        class471.method2736(false);
        class261.method1665((byte) -128);
        class333.method2056((byte) -116);
        class218.method1468((byte) 106);
        class39.method344(-1996488705);
        class644.method3711((byte) 73);
        class313.method1940((byte) -53);
        class226.method1502(-32630);
        class115.method943((byte) 100);
        class549.method3084((byte) -124);
        class145.method1065((byte) -18);
        class400.method2441(-93);
        class573.method3278(78);
        class74.method715(30802);
        class407.method2470(104);
        class268.method1694((byte) 92);
        class85.method777(-10);
        class259.method1636(arg0);
        class184.method1231(124);
        class214.method1454(122);
        class127.method1002((byte) 121);
        class38.method327(true);
        class170.method1179((byte) -19);
        class546.method3055(127);
        class464.method2706(-106);
        class89.method799(false);
        class457.method2678(0);
        class272.method1763(115);
        class476.method2755(38);
        class223.method1494((byte) -15);
        class327.method2037((byte) 126);
        class358.method2170(-114);
        class627.method3559(18024);
        class225.method1498((byte) -66);
        class293.method1846((byte) 16);
        class232.method1516(98);
        class399.method2439(540800);
        class146.method1067(-28558);
        class420.method2530((byte) 107);
        class474.method2747((byte) 0);
        class558.method3144((byte) -97);
        class525.method2963(3801);
        class285.method1815(23493);
        class527.method2971(17874);
        class519.method2932(-19378);
        class101.method860(-124);
        class366.method2211(30259);
        class255.method1604((byte) -60);
        class370.method2248((byte) 106);
        class380.method2308(6);
        class542.method3041((byte) 79);
        class432.method2570(13);
        class425.method2545((byte) 63);
        class354.method2157(-119);
        class593.method3391(5);
        class424.method2539(115);
        class633.method3656((byte) 81);
        class616.method3493(2953);
        class637.method3676((byte) 104);
        class64.method506((byte) -115);
        class16.method186(127);
        class337.method2068((byte) 67);
        class275.method1773((byte) -19);
        class509.method2861((byte) -127);
        class529.method2975(!arg0);
        class230.method1512((byte) 119);
        class139.method1046(0);
        class243.method1547((byte) 23);
        class489.method2795(-1);
        class86.method791((byte) -121);
        class97.method843(Integer.MIN_VALUE);
        class612.method3470(121);
        class162.method1135(false);
        class360.method2174((byte) -102);
        class103.method865((byte) 126);
        class465.method2708((byte) -59);
        class104.method874(-20842);
        class585.method3351();
        class536.method3020(127);
        class298.method1867(10399);
        class193.method1279((byte) -113);
        class523.method2947(8041);
        class161.method1133(-1);
        class159.method1124(-11);
        class365.method2204(27871);
        class30.method281();
        class212.method1411();
        class128.method1005(-256);
        class153.method1090(121);
        class482.method2774();
        class300.method1878(32);
        class192.method1278(-100);
        class539.method3032(-127);
        class434.method2586(-25146);
        class477.method2758(-29799);
        class445.method2627((byte) 18);
        class394.method2384((byte) -76);
        class574.method3284((byte) 110);
        class576.method3295(-8);
        class621.method3506(-117);
        class32.method296(-9716);
        class188.method1256(-118);
        class129.method1010(10);
        class44.method389(true);
        class278.method1791(-14894);
        class496.method2828(70);
        class136.method1040(59);
        class169.method1169((byte) -97);
        class235.method1529(-14);
        class207.method1332(true);
        class359.method2172(-4);
        class287.method1823((byte) -28);
        class19.method221((byte) 81);
        class148.method1070((byte) -117);
        class185.method1246((byte) 115);
        class46.method412(0);
        class151.method1079(14272);
        class368.method2227(0);
        class52.method444(false);
        class440.method2601(32);
        class406.method2463(20167);
        class18.method206();
        class254.method1602(false);
        class413.method2501(76);
        class617.method3494((byte) 5);
        class132.method1022(-1);
        class526.method2970(0);
        class240.method1540((byte) 50);
        class301.method1881((byte) 48);
        class314.method1941(65536);
        class624.method3541(-14550);
        class493.method2816(2);
        class382.method2328((byte) 51);
        class363.method2191(108);
        class367.method2218(-101);
        class277.method1785(123);
        class648.method3726((byte) 113);
        class88.method796(-1);
        class552.method3101((byte) -37);
        class595.method3398(arg0);
        class540.method3035(-71);
        class393.method2382(98);
        class385.method2340();
        class49.method434(-114);
        class217.method1466(-4092);
        class147.method1069(107);
        class154.method1092(0);
        class646.method3719((byte) 112);
        class522.method2945((byte) 105);
        class537.method3024((byte) -119);
        class48.method431(-1);
        class251.method1587(6);
        class130.method1016(0);
        class295.method1858(1311506432);
        class454.method2673(-114);
        class227.method1504(-1445);
        class50.method438(true);
        class565.method3214(110);
        class437.method2591(2);
        class242.method1545(0);
        class318.method1952(!arg0);
        class17.method203((byte) 99);
        class642.method3703(-1);
        class634.method3666(114);
        class51.method439(117);
        class623.method3535(1);
        class82.method755(false);
        class631.method3566(-124);
        class308.method1909(22500);
        class28.method259(-1235);
        class390.method2360(0);
        class332.method2054(-83);
        class404.method2462(-9660);
        class305.method1898((byte) 14);
        class361.method2184(1);
        class369.method2236(3632);
        class335.method2061(7);
        class449.method2657(119);
        class511.method2867(46);
        class182.method1223(1);
        class356.method2167(!arg0);
        class604.method3441((byte) -70);
        class629.method3561(false);
        class641.method3695(-23543);
        class11.method58();
        class594.method3393((byte) 38);
        class639.method3686(-48);
        class144.method1061(79);
        class338.method2080((byte) -40);
        class134.method1032((byte) -126);
        class638.method3685((byte) 60);
        class581.method3328((byte) -102);
        class543.method3046(262144);
        class409.method2482(-20769);
        class388.method2350(-1);
        class262.method1671(127);
        class265.method1678((byte) -108);
        class121.method977(arg0);
        class339.method2081((byte) 99);
        class280.method1797(-69);
        class264.method1676(-1785070368);
        class172.method1185((byte) -125);
        class43.method382(-1);
        class266.method1686(55);
        class168.method1165((byte) -74);
        class35.method314(-12);
        class157.method1111();
        class220.method1471(arg0);
        class532.method2999();
        class379.method2302();
        class625.method3545();
        class336.method2064((byte) 80);
        class564.method3213();
        class80.method749((byte) -72);
        class219.method1470(-28066);
        class13.method74((byte) 80);
        class208.method1334((byte) -118);
        class521.method2942((byte) -107);
        class65.method509(1);
        class417.method2515(-46);
        class198.method1292();
        class311.method1935((byte) 127);
        class328.method2043((byte) -59);
        class122.method980(65535);
        class492.method2815((byte) -15);
        class302.method1885(92);
        class513.method2871((byte) -94);
        class303.method1895(0);
        class56.method460(-193);
        class609.method3464(!arg0);
        class600.method3410((byte) -2);
        class514.method2876(false);
        class316.method1947(false);
        class99.method851((byte) 96);
        class57.method466((byte) 6);
        class418.method2517(arg0);
        class73.method709(true);
        class453.method2668(-3);
        class174.method1200((byte) 11);
        class45.method401(99);
        class66.method512(17447);
        class606.method3451(-11344);
        class419.method2523(Integer.MIN_VALUE);
        class441.method2608((byte) 75);
        class10.method55(false);
        class249.method1576(-66);
        class61.method488((byte) 7);
        class373.method2262(-118);
        class353.method2153((byte) 104);
        class222.method1489(-116);
        class355.method2165(77);
        class544.method3047(-44);
        class98.method844(126);
        class374.method2269(-19972);
        class25.method242(true);
        class583.method3340(-968305224);
        class498.method2836((byte) 112);
        class632.method3635(50);
        class109.method915(false);
        class343.method2092((byte) -67);
        class331.method2049((byte) 127);
        class516.method2906(12);
        class273.method1767(-104);
        class442.method2614((byte) -90);
        class143.method1057(24170);
        class466.method2710((byte) 78);
        class92.method818((byte) -117);
        class483.method2781((byte) -119);
        class340.method2085(16);
        class112.method931((byte) 96);
        class530.method2977(true);
        class211.method1370(105);
        class468.method2720((byte) 13);
        class175.method1206(258);
        class362.method2187(0);
        class125.method991(false);
        class177.method1208((byte) 65);
        class341.method2090(-44);
        class152.method1081();
        class14.method79(true);
        class69.method677(3);
        class118.method973(9055);
        class252.method1595((byte) 93);
        class473.method2744((byte) 98);
        class605.method3447(true);
        class386.method2342((byte) 122);
        class322.method2004(false);
        class291.method1841(13);
        class26.method244((byte) -24);
        class389.method2356(-1);
        class377.method2290(70);
        class470.method2731(95);
        class566.method3219((byte) -126);
        class512.method2870((byte) 107);
        class480.method2766((byte) -124);
        class2.method6((byte) -49);
        class304.method1896((byte) -90);
        class306.method1902(115);
        class187.method1251(!arg0);
        class286.method1818((byte) 63);
        class241.method1543(23508);
        class459.method2687(-274305948);
        class1.method5((byte) -79);
        class597.method3406(0);
        class555.method3113(255);
        class412.method2498((byte) -95);
        class213.method1432();
        class491.method2805(-1);
        class416.method2511((byte) 109);
        class90.method803(270);
        class178.method1210();
        class603.method3438((byte) -59);
        class551.method3096(-35);
        class421.method2535(-1625504893);
        class557.method3133(76);
        class166.method1153(false);
        class538.method3027(89);
        class571.method3261((byte) -95);
        class206.method1322((byte) 126);
        class34.method304(-125);
        class247.method1568(65535);
        class640.method3690(-18619);
        class528.method2973(-16853);
        class548.method3069(-103);
        class190.method1261(0);
        class307.method1905(-16387);
        class426.method2549(79);
        class24.method239(50);
        class141.method1051(false);
        class451.method2663(8);
        class290.method1837((byte) 126);
        class294.method1847(-1);
        class284.method1806(-122);
        class54.method451((byte) -45);
        class350.method2129((byte) -47);
        class202.method1303(58);
        class245.method1557((byte) 73);
        class598.method3407((byte) 77);
        class133.method1025((byte) -4);
        class111.method923(3);
        class274.method1769(true);
        class619.method3502((byte) 127);
        class501.method2845((byte) -26);
        class194.method1280((byte) -126);
        class183.method1230(-110);
        class384.method2337(6978);
        class233.method1520((byte) 54);
        class299.method1874(1);
        class321.method2003(117);
        class503.method2849(Integer.MAX_VALUE);
        class599.method3408(111);
        class592.method3386(102);
        class5.method13(121);
        class444.method2624(false);
        class310.method1934(0);
        class117.method969(5154);
        class460.method2696(7701);
        class448.method2653((byte) -4);
        class541.method3038(0);
        class596.method3404(7);
        class563.method3212((byte) -72);
        class497.method2833((byte) -95);
        class155.method1096(-113);
        class72.method705(26856);
        class23.method237(false);
        class591.method3383(5121);
        class163.method1143(4316);
        class611.method3469(1);
        class142.method1055((byte) -111);
        class601.method3414(arg0);
        class201.method1302((byte) 24);
        class210.method1347((byte) -71);
        class608.method3461((byte) 121);
        class27.method250(arg0);
        class33.method299((byte) 120);
        class488.method2791(107);
        class186.method1248(-32486);
        class614.method3489(false);
        class79.method746(true);
        class495.method2821(7);
        class204.method1309((byte) -128);
        class559.method3145(0);
        class325.method2012(3516);
        class433.method2584(false);
        class430.method2564((byte) 5);
        class499.method2839((byte) -89);
        class81.method751(1408);
        class258.method1631(-78);
        class276.method1779(-1872566840);
        class93.method822(-1);
        class534.method3016(false);
        class94.method828((byte) -119);
        class229.method1509(4);
        class345.method2098(39);
        class587.method3364(-108);
        class95.method838((byte) 36);
        class215.method1456(255);
        class533.method3011((byte) -16);
        class431.method2569((byte) -128);
        class42.method375(97);
        class263.method1674(36);
        class189.method1260(500);
        class589.method3375(113);
        class234.method1524((byte) 122);
        class41.method373(-24294);
        class554.method3107(-27971);
        class401.method2452(10794);
        class485.method2788(arg0);
        class504.method2853((byte) 52);
        class387.method2347((byte) 76);
        class578.method3303((byte) -50);
        class158.method1120((byte) 105);
        class260.method1650(false);
        class402.method2457(-20310);
        class467.method2718(-473328628);
        class8.method35(-1427967220);
        class209.method1338(2027846796);
        class102.method862(111);
        class636.method3675(-1196);
        if (class602.field8573) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method3432(boolean arg0) {
        if (class646.field9388 == 2) {
            try {
                this.method3528(-6519);
            } catch (Throwable var3) {
                class593.method3390(var3.getMessage() + " (Recovered) " + this.method3421((byte) 36), var3, 0);
                class471.method2738(127, 0);
            }
        } else {
            this.method3528(-6519);
        }
        field8762++;
        if (!arg0) {
            field8783 = 17;
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    private final void method3528(int arg0) {
        field8780++;
        if (class64.field893 == 13) {
            return;
        }
        class310.field4553++;
        if (class310.field4553 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class363.field5154 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class371.field5358.setSeed((long) class363.field5154);
        }
        if ((class310.field4553 % 50) == 0) {
            class47.field662 = class339.field4857;
            class575.field8186 = class39.field537;
            class339.field4857 = 0;
            class39.field537 = 0;
        }
        this.method3525(-26186);
        if (class584.field8322 != null) {
            class584.field8322.method18((byte) -115);
        }
        class28.method257(51);
        class404.field6022.method2179((byte) -124);
        class619.field8735.method1606(arg0 + 6518);
        if (class159.field2378 != null) {
            class159.field2378.method101((int) class508.method2860(false));
        }
        class644.method3712(2);
        class529.field7356 = 0;
        class151.field2283 = 0;
        if (arg0 != -6519) {
            return;
        }
        for (class200 var3 = class404.field6022.method2176(true); var3 != null; var3 = class404.field6022.method2176(true)) {
            int var6 = var3.method832(-2472);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method837(false);
                if (class565.method3216(true) && (var7 == '`' || var7 == '§')) {
                    if (class310.method1932(true)) {
                        class151.method1078(1);
                    } else {
                        class555.method3112(125);
                    }
                } else if (class151.field2283 < 128) {
                    class465.field6706[class151.field2283] = var3;
                    class151.field2283++;
                }
            } else if (var6 == 0 && class529.field7356 < 75) {
                class442.field6469[class529.field7356] = var3;
                class529.field7356++;
            }
        }
        class85.field1564 = 0;
        for (class7 var4 = class619.field8735.method1618(arg0 ^ 0x1906); var4 != null; var4 = class619.field8735.method1618(-114)) {
            int var5 = var4.method25(26999);
            if (var5 == -1) {
                class19.field286.method414(var4, (byte) 76);
            } else if (var5 == 6) {
                class85.field1564 += var4.method23(-31225);
            } else if (class634.method3665(125, var5)) {
                class360.field5112.method414(var4, (byte) 37);
                if (class360.field5112.method419(arg0 + 6585) > 10) {
                    class360.field5112.method417((byte) 51);
                }
            }
        }
        if (class310.method1932(true)) {
            class257.method1629((byte) 38);
        }
        if (class64.field893 == 0) {
            this.method3527(arg0 - 9412);
            class369.method2229(arg0 ^ 0x1968);
        } else if (class64.field893 == 1) {
            this.method3527(arg0 - 9412);
            class369.method2229(arg0 ^ 0x1961);
        } else if (class118.method974(class64.field893, arg0 + 6617)) {
            class90.method806((byte) -127);
        }
        if (class332.method2055(class64.field893, (byte) 121) && !class118.method974(class64.field893, -127)) {
            this.method3531(10);
            class388.method2351((byte) 118);
            class291.method1839(-120);
        } else if (class24.method238(arg0 + 6433, class64.field893) && !class118.method974(class64.field893, arg0 ^ 0x1927)) {
            this.method3531(10);
            class291.method1839(arg0 ^ 0x191C);
        } else if (class64.field893 == 11) {
            class291.method1839(-99);
        } else if (class541.method3037(106, class64.field893) && !class118.method974(class64.field893, 103)) {
            class95.method830((byte) -122);
        } else if (class64.field893 == 12) {
            class291.method1839(-125);
            if (class544.field7580 != -3 && class544.field7580 != 2 && class544.field7580 != 15) {
                class271.method1759(false, 4);
            }
        }
        class474.method2749(36, class159.field2378);
        class360.field5112.method417((byte) 51);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Loh;)Z")
    public static final boolean method3529(class549 arg0) {
        if (class640.field9285) {
            if (method3530(arg0).field7595 != 0) {
                return false;
            }
            if (arg0.field7749 == 0) {
                return false;
            }
        }
        return arg0.field7677;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Loh;)Ldf;")
    public static final class546 method3530(class549 arg0) {
        class546 var1 = (class546) class170.field2472.method740(0, ((long) arg0.field7734 << 32) + (long) arg0.field7761);
        return var1 == null ? arg0.field7760 : var1;
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    private final void method3531(int arg0) {
        field8774++;
        if (class64.field893 == 6 && class599.field8510 == 0) {
            if (class189.field2717 > 1) {
                class189.field2717--;
                class410.field6095 = class498.field6986;
            }
            if (!class2.field20) {
                class167.method1161(13361);
            }
            for (int var2 = 0; var2 < 100 && class369.method2230(-32666); var2++) {
            }
        }
        class303.field4378++;
        class319.method1957(-1, 128, -1, null);
        class125.method992(-1, -1, (byte) 8, null);
        class184.method1238(true);
        class498.field6986++;
        for (int var3 = 0; var3 < class313.field4570; var3++) {
            class170 var4 = class629.field8848[var3].field2623;
            if (var4 != null) {
                byte var5 = var4.field2492.field6310;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method781((byte) -84);
                    if ((var5 & 0x2) != 0 && var4.field1567 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field1571[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > class146.field2247 - var6 - 1) {
                                var9 = class146.field2247 - var6 - 1;
                            }
                            int var10 = var4.field1572[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class66.field990 - (var6 + 1) < var10) {
                                var10 = class66.field990 - var6 - 1;
                            }
                            int var11 = class503.method2851(var9, var10, class268.field3916[var4.field5116], class2.field15, var6, 0, class648.field9391, var4.field1571[0], var4.field1572[0], false, 0, var6, var6, -1, true);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field1571[var12] = class648.field9391[var11 - var12 - 1];
                                    var4.field1572[var12] = class2.field15[var11 - var12 - 1];
                                    var4.field1574[var12] = 1;
                                }
                                var4.field1567 = var11;
                            }
                        }
                    }
                    class215.method1457((byte) 28, var4, true);
                    int var13 = class381.method2316(var4, 16383);
                    class461.method2698(var4, var13, -24469, class393.field5886, class580.field8260);
                    class95.method836(var4, (byte) -56);
                }
            }
        }
        if (class599.field8510 == 0 && class23.field324 == 0) {
            if (class377.field5547 == 2) {
                class286.method1817(arg0 ^ 0x4E);
            } else {
                class421.method2531((byte) -66);
            }
            if ((class545.field7584 >> 7) < 14 || (class146.field2247 - 14) <= (class545.field7584 >> 7) || (class216.field3274 >> 7) < 14 || (class216.field3274 >> 7) >= (class66.field990 - 14)) {
                class384.method2339(1043);
            }
        }
        while (true) {
            class526 var14;
            class549 var15;
            class549 var16;
            do {
                var14 = (class526) class332.field4772.method417((byte) 51);
                if (var14 == null) {
                    while (true) {
                        class526 var17;
                        class549 var18;
                        class549 var19;
                        do {
                            var17 = (class526) class477.field6816.method417((byte) 51);
                            if (var17 == null) {
                                while (true) {
                                    class526 var20;
                                    class549 var21;
                                    class549 var22;
                                    do {
                                        var20 = (class526) class307.field4417.method417((byte) 51);
                                        if (var20 == null) {
                                            if (arg0 != 10) {
                                                this.method3523(31);
                                            }
                                            if (class311.field4557 != null) {
                                                class115.method942(true);
                                            }
                                            if ((class310.field4553 % 1500) == 0) {
                                                class266.method1687(-1);
                                            }
                                            if (class64.field893 == 6 && class599.field8510 == 0) {
                                                class117.method972(true);
                                            }
                                            class174.method1199((byte) 113);
                                            if (class2.field14 && class437.field6385 < class508.method2860(false) - 60000L) {
                                                class433.method2583(arg0 ^ 0x1916);
                                            }
                                            for (class81 var23 = (class81) class8.field76.method944(123); var23 != null; var23 = (class81) class8.field76.method947((byte) -17)) {
                                                if (class508.method2860(false) / 1000L - 5L > (long) var23.field1443) {
                                                    if (var23.field1439 > 0) {
                                                        class175.method1205("", 0, 5, var23.field1442 + class366.field5189.method3220(false, class538.field7500), arg0 - 11, "");
                                                    }
                                                    if (var23.field1439 == 0) {
                                                        class175.method1205("", 0, 5, var23.field1442 + class232.field3418.method3220(false, class538.field7500), -1, "");
                                                    }
                                                    var23.method2753(0);
                                                }
                                            }
                                            if (class64.field893 == 6 && class599.field8510 == 0) {
                                                if (field8770 == null) {
                                                    class271.method1759(false, 4);
                                                    return;
                                                }
                                                class259.field3775++;
                                                if (class259.field3775 > 50) {
                                                    class257.field3733++;
                                                    class624.method3537(arg0 ^ 0xFFFFFF80, class195.field2799);
                                                }
                                                try {
                                                    if (field8770 != null && class127.field2088.field3913 > 0) {
                                                        class339.field4857 += class127.field2088.field3913;
                                                        field8770.method2733(3, class127.field2088.field3913, 0, class127.field2088.field3952);
                                                        class127.field2088.field3913 = 0;
                                                        class259.field3775 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class271.method1759(false, 4);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field7315;
                                        if (var21.field7761 < 0) {
                                            break;
                                        }
                                        var22 = class495.method2822((byte) -105, var21.field7637);
                                    } while (var22 == null || var22.field7684 == null || var21.field7761 >= var22.field7684.length || var22.field7684[var21.field7761] != var21);
                                    class30.method277(var20);
                                }
                            }
                            var18 = var17.field7315;
                            if (var18.field7761 < 0) {
                                break;
                            }
                            var19 = class495.method2822((byte) -125, var18.field7637);
                        } while (var19 == null || var19.field7684 == null || var19.field7684.length <= var18.field7761 || var19.field7684[var18.field7761] != var18);
                        class30.method277(var17);
                    }
                }
                var15 = var14.field7315;
                if (var15.field7761 < 0) {
                    break;
                }
                var16 = class495.method2822((byte) -103, var15.field7637);
            } while (var16 == null || var16.field7684 == null || var16.field7684.length <= var15.field7761 || var16.field7684[var15.field7761] != var15);
            class30.method277(var14);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3532(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
