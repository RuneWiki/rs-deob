import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class137 extends class109 {

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public int field2928;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field2925 = 0;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field2926 = 4;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "[I")
    public static int[] field2923 = new int[field2926];

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "[[Lhi;")
    public static class79[][] field2932 = new class79[field2926][500];

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "Ldd;")
    public static class35 field2933 = class180.method1196((byte) -42, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2924 = Calendar.getInstance();

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "Ldd;")
    public static class35 field2934 = class180.method1196((byte) 127, "p12_full");

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field2935 = 0;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "Ldd;")
    private static class35 field2937 = class180.method1196((byte) -31, "Loaded config");

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "Ldd;")
    public static class35 field2938 = field2937;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "Lo;")
    public static class134 field2936;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public static final void method934(byte arg0) {
        if (class198.field3944[96]) {
            class37.field830 += (-class37.field830 - 24) / 2;
        } else if (class198.field3944[97]) {
            class37.field830 += (24 - class37.field830) / 2;
        } else {
            class37.field830 /= 2;
        }
        int var1 = class121.field2668 + class71.field1704.field1664;
        field2930++;
        if (arg0 < 101) {
            return;
        }
        class2.field40 = class37.field830 / 2 + class2.field40 & 0x7FF;
        int var2 = class147.field3092 + class71.field1704.field1676;
        if (class198.field3944[98]) {
            class5.field84 += (12 - class5.field84) / 2;
        } else if (class198.field3944[99]) {
            class5.field84 += (-class5.field84 - 12) / 2;
        } else {
            class5.field84 /= 2;
        }
        class35.field750 += class5.field84 / 2;
        if (class35.field750 < 128) {
            class35.field750 = 128;
        }
        if (class84.field1938 - var1 < -500 || class84.field1938 - var1 > 500 || class165.field3330 - var2 < -500 || class165.field3330 - var2 > 500) {
            class165.field3330 = var2;
            class84.field1938 = var1;
        }
        if (class165.field3330 != var2) {
            class165.field3330 += (var2 - class165.field3330) / 16;
        }
        int var3 = class165.field3330 >> 7;
        if (class35.field750 > 383) {
            class35.field750 = 383;
        }
        if (class84.field1938 != var1) {
            class84.field1938 += (var1 - class84.field1938) / 16;
        }
        int var4 = 0;
        int var5 = class84.field1938 >> 7;
        int var6 = class73.method583(class175.field3585, class165.field3330, class84.field1938, (byte) 1);
        if (var5 > 3 && var3 > 3 && var5 < 100 && var3 < 100) {
            for (int var7 = var5 - 4; var7 <= var5 + 4; var7++) {
                for (int var8 = var3 - 4; var8 <= var3 + 4; var8++) {
                    int var9 = class175.field3585;
                    if (var9 < 3 && (class40.field894[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class206.field4109[var9][var7][var8];
                    if (var10 > var4) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class84.field1931 < var11) {
            class84.field1931 += (var11 - class84.field1931) / 24;
        } else if (var11 < class84.field1931) {
            class84.field1931 += (var11 - class84.field1931) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static void method935(boolean arg0) {
        field2923 = null;
        field2936 = null;
        field2938 = null;
        field2937 = null;
        field2933 = null;
        field2932 = null;
        field2934 = null;
        field2924 = null;
        if (arg0) {
            field2933 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lfd;ILdd;)Ldd;")
    public static final class35 method936(class55 arg0, int arg1, class35 arg2) {
        if (~arg2.method327((byte) 67, class101.field2225) != arg1) {
            label58: while (true) {
                int var3 = arg2.method327((byte) 108, class14.field257);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method327((byte) 79, class115.field2581);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method327((byte) 117, class160.field3243);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method327((byte) 103, class131.field2829);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method327((byte) 76, class59.field1466);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method327((byte) 113, class130.field2786);
                                                        if (var8 == -1) {
                                                            break label58;
                                                        }
                                                        class35 var9 = class20.field387;
                                                        if (class168.field3388 != null) {
                                                            var9 = class52.method458((byte) -90, class168.field3388.field1807);
                                                            try {
                                                                if (class168.field3388.field1804 != null) {
                                                                    byte[] var10 = ((String) class168.field3388.field1804).getBytes("ISO-8859-1");
                                                                    var9 = class150.method1020(0, var10.length, var10, arg1 + 88);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class63.method529(new class35[] { arg2.method326(0, 121, var8), var9, arg2.method344(var8 + 4, -26886) }, (byte) 98);
                                                    }
                                                }
                                                arg2 = class63.method529(new class35[] { arg2.method326(0, 16, var7), class184.method1221((byte) -3, class68.method551((byte) 7, 4, arg0)), arg2.method344(var7 + 2, arg1 + -26886) }, (byte) 68);
                                            }
                                        }
                                        arg2 = class63.method529(new class35[] { arg2.method326(0, -10, var6), class184.method1221((byte) -3, class68.method551((byte) 7, 3, arg0)), arg2.method344(var6 + 2, -26886) }, (byte) 96);
                                    }
                                }
                                arg2 = class63.method529(new class35[] { arg2.method326(0, -22, var5), class184.method1221((byte) -3, class68.method551((byte) 7, 2, arg0)), arg2.method344(var5 + 2, arg1 ^ 0xFFFF96FA) }, (byte) 98);
                            }
                        }
                        arg2 = class63.method529(new class35[] { arg2.method326(0, arg1 ^ 0xFFFFFF9C, var4), class184.method1221((byte) -3, class68.method551((byte) 7, 1, arg0)), arg2.method344(var4 + 2, -26886) }, (byte) 74);
                    }
                }
                arg2 = class63.method529(new class35[] { arg2.method326(0, 106, var3), class184.method1221((byte) -3, class68.method551((byte) 7, 0, arg0)), arg2.method344(var3 + 2, -26886) }, (byte) 74);
            }
        }
        field2929++;
        return arg2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lfd;B)V")
    public static final void method937(class55 arg0, byte arg1) {
        if (class78.field1819 == arg0.field1253) {
            class158.field3228[arg0.field1354] = true;
        }
        field2927++;
        if (arg1 != -85) {
            method937(null, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(II)V")
    public class137(int arg0, int arg1) {
        this.field2928 = arg1;
        this.field2921 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public static final void method938(int arg0) {
        field2920++;
        class195.field3891.method813(-116);
        if (arg0 == 2) {
            class141.field2988.method813(-116);
        }
    }
}
