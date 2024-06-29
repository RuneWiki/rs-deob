import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class119 extends Canvas {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field1994;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Lce;")
    public static class126 field2000 = class206.method1445(-7923, "Wordpack geladen)3");

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Lce;")
    public static class126 field1995 = class206.method1445(-7923, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "Lce;")
    public static class126 field2004 = class206.method1445(-7923, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "[Lha;")
    public static class26[] field2007;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "[S")
    public static short[] field1997;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "[[[I")
    public static int[][][] field2003;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)I", line = 4)
    public static final int method781(boolean arg0, int arg1) {
        if (arg0) {
            return 34;
        } else {
            field1996++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!ol", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 15)
    public final void update(Graphics arg0) {
        field2001++;
        this.field1994.update(arg0);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 28)
    public static void method782(int arg0) {
        field2007 = null;
        field2000 = null;
        field2003 = (int[][][]) null;
        if (arg0 == 0) {
            field1997 = null;
            field2004 = null;
            field1995 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lwd;I)Lwd;", line = 44)
    public static final class112 method783(class112 arg0, int arg1) {
        field2006++;
        if (arg0.field1865 != -1) {
            return class252.method1706(5157, arg0.field1865);
        }
        int var2 = arg0.field1833 >>> 16;
        class31 var3 = new class31(class16.field222);
        for (class65 var4 = (class65) var3.method150((byte) 62); var4 != null; var4 = (class65) var3.method148(-112)) {
            if (var4.field1097 == var2) {
                return class252.method1706(5157, (int) var4.field1117);
            }
        }
        if (arg1 < 9) {
            method784((byte) 126);
        }
        return null;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 72)
    public class119(Component arg0) {
        this.field1994 = arg0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 81)
    public static final void method784(byte arg0) {
        field2002++;
        if (class281.field4680 == 0 || class281.field4680 == 5) {
            return;
        }
        try {
            if ((++class10.field134) > 2000) {
                if (class59.field953 != null) {
                    class59.field953.method1941((byte) 61);
                    class59.field953 = null;
                }
                if (class7.field76 >= 1) {
                    class289.field4792 = -5;
                    class281.field4680 = 0;
                    return;
                }
                class7.field76++;
                if (class63.field1069 == class239.field4040) {
                    class239.field4040 = class172.field3035;
                } else {
                    class239.field4040 = class63.field1069;
                }
                class281.field4680 = 1;
                class10.field134 = 0;
            }
            if (class281.field4680 == 1) {
                class82.field1327 = class161.field2907.method1092(class239.field4040, class190.field3258, true);
                class281.field4680 = 2;
            }
            if (class281.field4680 == 2) {
                if (class82.field1327.field965 == 2) {
                    throw new IOException();
                }
                if (class82.field1327.field965 != 1) {
                    return;
                }
                class59.field953 = new class293((Socket) class82.field1327.field967, class161.field2907);
                class82.field1327 = null;
                long var1 = class89.field1395 = class224.field3784.method845((byte) -124);
                class103.field1645.field2299 = 0;
                class103.field1645.method933(arg0 ^ 0xFFFFFFBC, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class103.field1645.method933(arg0 ^ 0xFFFFFFBC, var3);
                class59.field953.method1945(2, true, 0, class103.field1645.field2282);
                if (class118.field1993 != null) {
                    class118.field1993.method1048((byte) 97);
                }
                if (class125.field2109 != null) {
                    class125.field2109.method1048((byte) 101);
                }
                int var4 = class59.field953.method1938((byte) 41);
                if (class118.field1993 != null) {
                    class118.field1993.method1048((byte) 81);
                }
                if (class125.field2109 != null) {
                    class125.field2109.method1048((byte) 99);
                }
                if (var4 != 0) {
                    class281.field4680 = 0;
                    class289.field4792 = var4;
                    class59.field953.method1941((byte) -127);
                    class59.field953 = null;
                    return;
                }
                class281.field4680 = 3;
            }
            if (class281.field4680 == 3) {
                if (class59.field953.method1939((byte) 86) < 8) {
                    return;
                }
                class59.field953.method1935(0, class227.field3834.field2282, 8, -1);
                class227.field3834.field2299 = 0;
                class7.field81 = class227.field3834.method939(-642283040);
                int[] var5 = new int[4];
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class103.field1645.field2299 = 0;
                var5[3] = (int) class7.field81;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class7.field81 >> 32);
                class103.field1645.method933(-3, 10);
                class103.field1645.method947(var5[0], (byte) 102);
                class103.field1645.method947(var5[1], (byte) 110);
                class103.field1645.method947(var5[2], (byte) 119);
                class103.field1645.method947(var5[3], (byte) 100);
                class103.field1645.method962(-117, class224.field3784.method845((byte) -120));
                class103.field1645.method980(class224.field3789, true);
                class103.field1645.method946(class195.field3323, class187.field3231, (byte) -75);
                class183.field3193.field2299 = 0;
                if (class280.field4662 == 40) {
                    class183.field3193.method933(-3, 18);
                } else {
                    class183.field3193.method933(arg0 ^ 0xFFFFFFBC, 16);
                }
                class183.field3193.method959(95, class103.field1645.field2299 + (class281.method1882((byte) -100, class23.field321) + 159));
                class183.field3193.method947(527, (byte) 96);
                class183.field3193.method933(-3, class132.field2270);
                class183.field3193.method933(-3, class314.field5394 ? 1 : 0);
                class183.field3193.method933(-3, 1);
                class183.field3193.method933(arg0 ^ 0xFFFFFFBC, class45.method282(88));
                class183.field3193.method959(arg0 ^ 0x23, class7.field87);
                class183.field3193.method959(-127, class1.field6);
                class183.field3193.method933(-3, class22.field300);
                class18.method100(class183.field3193, (byte) 68);
                class183.field3193.method980(class23.field321, true);
                class183.field3193.method947(class126.field2121, (byte) 113);
                class183.field3193.method947(class68.method495((byte) -20), (byte) 115);
                class253.field4255 = true;
                class183.field3193.method959(-84, class63.field1035);
                class183.field3193.method947(class167.field2971.method2162((byte) 101), (byte) 95);
                class183.field3193.method947(class293.field4864.method2162((byte) -68), (byte) 106);
                class183.field3193.method947(class91.field1423.method2162((byte) 85), (byte) 126);
                class183.field3193.method947(class12.field161.method2162((byte) 89), (byte) 118);
                class183.field3193.method947(class273.field4598.method2162((byte) -116), (byte) 120);
                class183.field3193.method947(class168.field3000.method2162((byte) -96), (byte) 97);
                class183.field3193.method947(class4.field28.method2162((byte) 92), (byte) 103);
                class183.field3193.method947(class309.field5239.method2162((byte) -120), (byte) 102);
                class183.field3193.method947(class127.field2170.method2162((byte) -74), (byte) 94);
                class183.field3193.method947(class273.field4589.method2162((byte) 113), (byte) 99);
                class183.field3193.method947(class228.field3840.method2162((byte) 90), (byte) 117);
                class183.field3193.method947(class112.field1756.method2162((byte) 90), (byte) 109);
                class183.field3193.method947(class70.field1148.method2162((byte) -107), (byte) 98);
                class183.field3193.method947(class274.field4612.method2162((byte) 116), (byte) 112);
                class183.field3193.method947(class73.field1166.method2162((byte) 117), (byte) 100);
                class183.field3193.method947(class266.field4510.method2162((byte) -43), (byte) 114);
                class183.field3193.method947(class280.field4654.method2162((byte) 123), (byte) 96);
                class183.field3193.method947(class68.field1124.method2162((byte) 86), (byte) 98);
                class183.field3193.method947(class148.field2729.method2162((byte) 98), (byte) 94);
                class183.field3193.method947(class161.field2904.method2162((byte) -46), (byte) 114);
                class183.field3193.method947(class153.field2795.method2162((byte) 118), (byte) 94);
                class183.field3193.method947(class40.field646.method2162((byte) -51), (byte) 100);
                class183.field3193.method947(class279.field4644.method2162((byte) -27), (byte) 97);
                class183.field3193.method947(class165.field2942.method2162((byte) -94), (byte) 99);
                class183.field3193.method947(class301.field4999.method2162((byte) -98), (byte) 119);
                class183.field3193.method947(class93.field1450.method2162((byte) -41), (byte) 126);
                class183.field3193.method947(class21.field278.method2162((byte) -11), (byte) 119);
                class183.field3193.method947(class283.field4711.method2162((byte) -66), (byte) 121);
                class183.field3193.method924((byte) 112, 0, class103.field1645.field2299, class103.field1645.field2282);
                class59.field953.method1945(class183.field3193.field2299, true, 0, class183.field3193.field2282);
                class103.field1645.method1242(8, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class227.field3834.method1242(8, var5);
                class281.field4680 = 4;
            }
            if (class281.field4680 == 4) {
                if (class59.field953.method1939((byte) 86) < 1) {
                    return;
                }
                int var7 = class59.field953.method1938((byte) 41);
                if (var7 == 21) {
                    class281.field4680 = 7;
                } else if (var7 == 29) {
                    class281.field4680 = 10;
                } else if (var7 == 1) {
                    class289.field4792 = var7;
                    class281.field4680 = 5;
                    return;
                } else if (var7 == 2) {
                    class281.field4680 = 8;
                } else if (var7 == 15) {
                    class289.field4792 = var7;
                    class281.field4680 = 0;
                    return;
                } else if (var7 == 23 && class7.field76 < 1) {
                    class10.field134 = 0;
                    class7.field76++;
                    class281.field4680 = 1;
                    class59.field953.method1941((byte) -67);
                    class59.field953 = null;
                    return;
                } else {
                    class281.field4680 = 0;
                    class289.field4792 = var7;
                    class59.field953.method1941((byte) -112);
                    class59.field953 = null;
                    return;
                }
            }
            if (class281.field4680 == 6) {
                class103.field1645.field2299 = 0;
                class103.field1645.method1238(17, 69);
                class59.field953.method1945(class103.field1645.field2299, true, 0, class103.field1645.field2282);
                class281.field4680 = 4;
                return;
            }
            if (class281.field4680 == 7) {
                if (class59.field953.method1939((byte) 86) >= 1) {
                    class223.field3764 = class59.field953.method1938((byte) 41) * 60 + 180;
                    class281.field4680 = 0;
                    class289.field4792 = 21;
                    class59.field953.method1941((byte) 100);
                    class59.field953 = null;
                    return;
                }
                return;
            }
            if (class281.field4680 == 10) {
                if (class59.field953.method1939((byte) 86) >= 1) {
                    class85.field1347 = class59.field953.method1938((byte) 41);
                    class281.field4680 = 0;
                    class289.field4792 = 29;
                    class59.field953.method1941((byte) -75);
                    class59.field953 = null;
                    return;
                }
                return;
            }
            if (class281.field4680 == 8) {
                if (class59.field953.method1939((byte) 86) < 14) {
                    return;
                }
                class59.field953.method1935(0, class227.field3834.field2282, 14, arg0 - 66);
                class227.field3834.field2299 = 0;
                class73.field1172 = class227.field3834.method948(-124);
                class41.field669 = class227.field3834.method948(-127);
                class239.field4038 = class227.field3834.method948(arg0 - 188) == 1;
                class162.field2920 = class227.field3834.method948(-123) == 1;
                class127.field2189 = class227.field3834.method948(-122) == 1;
                class242.field4099 = class227.field3834.method948(arg0 ^ 0xFFFFFFC2) == 1;
                class34.field510 = class227.field3834.method948(arg0 - 187) == 1;
                class11.field145 = class227.field3834.method942(true);
                class4.field31 = class227.field3834.method948(-124) == 1;
                class107.field1686 = class227.field3834.method948(-125) == 1;
                class315.method2201(class107.field1686, 14);
                class55.method347(class107.field1686, -32);
                if (!class314.field5394) {
                    if ((!class239.field4038 || class127.field2189) && !class4.field31) {
                        try {
                            class5.field47.method844(class161.field2907.field2705, (byte) -64);
                        } catch (Throwable var12) {
                        }
                    } else {
                        try {
                            class302.field5032.method844(class161.field2907.field2705, (byte) -64);
                        } catch (Throwable var11) {
                        }
                    }
                }
                class122.field2051 = class227.field3834.method1234(7);
                class315.field5404 = class227.field3834.method942(true);
                class281.field4680 = 9;
            }
            if (class281.field4680 == 9) {
                if (class59.field953.method1939((byte) 86) >= class315.field5404) {
                    class227.field3834.field2299 = 0;
                    class59.field953.method1935(0, class227.field3834.field2282, class315.field5404, -1);
                    class281.field4680 = 0;
                    class289.field4792 = 2;
                    class140.method1029(0);
                    class23.field329 = -1;
                    class118.method773(false, 125);
                    class122.field2051 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var13) {
            if (class59.field953 != null) {
                class59.field953.method1941((byte) 116);
                class59.field953 = null;
            }
            if (class7.field76 < 1) {
                class7.field76++;
                class10.field134 = 0;
                if (class63.field1069 == class239.field4040) {
                    class239.field4040 = class172.field3035;
                } else {
                    class239.field4040 = class63.field1069;
                }
                class281.field4680 = 1;
            } else {
                class281.field4680 = 0;
                class289.field4792 = -4;
            }
        }
        if (arg0 != 65) {
            field1995 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)Lmd;", line = 466)
    public static final class229 method785(int arg0, int arg1, int arg2) {
        field2005++;
        if (arg2 <= 59) {
            return (class229) null;
        }
        for (class229 var3 = (class229) class100.field1616.method898((byte) -112); var3 != null; var3 = (class229) class100.field1616.method893((byte) 31)) {
            if (var3.field3860 && var3.method1555(arg0, 0, arg1)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)I", line = 503)
    public static final int method786(byte arg0) {
        if (arg0 != -13) {
            field1995 = (class126) null;
        }
        field2008++;
        if (class228.field3852 == null) {
            return -1;
        }
        while (class259.field4348 < class228.field3852.field887) {
            if (class228.field3852.method391(class259.field4348, (byte) -128)) {
                return class259.field4348++;
            }
            class259.field4348++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ol", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 531)
    public final void paint(Graphics arg0) {
        field1998++;
        this.field1994.paint(arg0);
    }
}
