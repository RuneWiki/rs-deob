import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class36 {

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[I")
    public static int[] field858 = new int[50];

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static volatile int field863 = 0;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "Lmc;")
    private static class75 field867 = class30.method234(true, "Enter your username (V password)3");

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lmc;")
    public static class75 field862 = class30.method234(true, "mapmarker");

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field868 = -1;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Lmc;")
    public static class75 field870 = class30.method234(true, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lmc;")
    public static class75 field860 = field867;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "J")
    public static volatile long field874 = 0L;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "Lmc;")
    public static class75 field878 = class30.method234(true, " weitere Optionen");

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "Lmc;")
    private static class75 field877 = class30.method234(true, "Username: ");

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lmc;")
    public static class75 field861 = field877;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field876 = -1;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field857 = 0;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public int field866;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lvb;")
    public static class124 field859;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lja;")
    public static class55 field865;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lnc;")
    public static class81 field854;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Lpb;")
    public static class92 field872;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "[I")
    public static int[] field880;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "[Laa;")
    public static class2[] field879;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 25)
    public static final void method280(int arg0) {
        if (class129.field3136 != null) {
            class84 var1 = class129.field3136;
            synchronized (class129.field3136) {
                class129.field3136 = null;
            }
        }
        field864++;
        if (arg0 != 1552068359) {
            method283(65);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLjava/awt/Component;Lvb;)Lrc;", line = 89)
    public static final class105 method281(byte arg0, Component arg1, class124 arg2) {
        class75.method627(arg2, 0, arg1);
        field875++;
        if (arg0 != -15) {
            field863 = 80;
        }
        class105 var3 = new class105();
        class38.method292(var3, -111);
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)I", line = 112)
    public static final int method282(int arg0) {
        field856++;
        if (arg0 != -10370) {
            method280(-72);
        }
        int var1 = 3;
        if (class37.field889 < 310) {
            int var2 = class84.field2082 >> 7;
            int var3 = class44.field1057 >> 7;
            if ((class74.field1836[class99.field2510][var2][var3] & 0x4) != 0) {
                var1 = class99.field2510;
            }
            int var4 = class52.field1315.field1233 >> 7;
            int var5 = class52.field1315.field1242 >> 7;
            int var6;
            if (var4 <= var2) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            int var7;
            if (var5 <= var3) {
                var7 = var3 - var5;
            } else {
                var7 = var5 - var3;
            }
            if (var7 < var6) {
                int var8 = var7 * 65536 / var6;
                int var9 = 32768;
                while (var2 != var4) {
                    if (var2 < var4) {
                        var2++;
                    } else if (var4 < var2) {
                        var2--;
                    }
                    var9 += var8;
                    if ((class74.field1836[class99.field2510][var2][var3] & 0x4) != 0) {
                        var1 = class99.field2510;
                    }
                    if (var9 >= 65536) {
                        if (var3 < var5) {
                            var3++;
                        } else if (var5 < var3) {
                            var3--;
                        }
                        if ((class74.field1836[class99.field2510][var2][var3] & 0x4) != 0) {
                            var1 = class99.field2510;
                        }
                        var9 -= 65536;
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var6 * 65536 / var7;
                while (var3 != var5) {
                    var10 += var11;
                    if (var5 > var3) {
                        var3++;
                    } else if (var3 > var5) {
                        var3--;
                    }
                    if ((class74.field1836[class99.field2510][var2][var3] & 0x4) != 0) {
                        var1 = class99.field2510;
                    }
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class74.field1836[class99.field2510][var2][var3] & 0x4) != 0) {
                            var1 = class99.field2510;
                        }
                    }
                }
            }
        }
        if ((class74.field1836[class99.field2510][class52.field1315.field1233 >> 7][class52.field1315.field1242 >> 7] & 0x4) != 0) {
            var1 = class99.field2510;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V", line = 247)
    public static void method283(int arg0) {
        field880 = null;
        field861 = null;
        field872 = null;
        field865 = null;
        field859 = null;
        field870 = null;
        field867 = null;
        field877 = null;
        field862 = null;
        field858 = null;
        field878 = null;
        field879 = null;
        field854 = null;
        if (arg0 <= 82) {
            method283(17);
        }
        field860 = null;
    }
}
