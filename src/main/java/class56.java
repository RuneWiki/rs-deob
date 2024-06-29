import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class56 extends class147 {

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "Lna;")
    public class26 field914;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "[Lna;")
    public static class26[] field904 = new class26[100];

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "Z")
    public static boolean field908 = false;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field903 = 1;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "Lna;")
    public static class26 field910 = class69.method505("<)4col>", (byte) -123);

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "Lna;")
    public static class26 field911 = class69.method505("Connexion au serveur de mise -9 jour en cours", (byte) -124);

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field907 = 0;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field921 = 0;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "Lrc;")
    public static class325 field919 = null;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "Lve;")
    public static class266 field905;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V", line = 6)
    public static final void method404(int arg0) {
        class22.field315.method1987(3);
        int var1 = 56 / ((arg0 - 7) / 54);
        field906++;
        class295.field4909.method1987(3);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 24)
    public static final void method405(boolean arg0) {
        if (arg0) {
            method408((class266) null, (byte) 118);
        }
        field916++;
        try {
            if (class306.field5280 == 1) {
                int var1 = class225.field3568.method992(arg0);
                if (var1 > 0 && class225.field3568.method966(-124)) {
                    int var2 = var1 - class300.field5172;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class225.field3568.method999(128, var2);
                    return;
                }
                class225.field3568.method998((byte) -128);
                class225.field3568.method978(-110);
                class243.field3995 = null;
                class281.field4696 = null;
                if (class225.field3570 == null) {
                    class306.field5280 = 0;
                } else {
                    class306.field5280 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class225.field3568.method998((byte) -127);
            class225.field3570 = null;
            class243.field3995 = null;
            class306.field5280 = 0;
            class281.field4696 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BII)I", line = 69)
    public static final int method406(byte arg0, int arg1, int arg2) {
        field915++;
        if (arg0 > -32) {
            return 88;
        } else if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIBIII)V", line = 120)
    public static final void method407(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = 19 % ((arg2 + 44) / 47);
        if (arg0 >= class225.field3572 && arg4 <= class27.field454 && class80.field1259 <= arg5 && class117.field1840 >= arg3) {
            class290.method2046(95, arg3, arg4, arg5, arg0, arg1);
        } else {
            class282.method1988(3074, arg1, arg4, arg5, arg0, arg3);
        }
        field913++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lve;B)V", line = 136)
    public static final void method408(class266 arg0, byte arg1) {
        int var2 = 3 / ((arg1 + 62) / 37);
        field922++;
        class72.field1112 = arg0;
        class313.field5358 = class72.field1112.method1898(16, (byte) 71);
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 153)
    public class56() {
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;I)Lna;", line = 159)
    public static final class26 method409(String arg0, int arg1) {
        field909++;
        if (arg1 != 27307) {
            field921 = -93;
        }
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class26 var4 = new class26();
        var4.field418 = var2;
        var4.field436 = 0;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field436++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)Lcb;", line = 194)
    public static final class281 method410(int arg0, int arg1) {
        field920++;
        class281 var2 = (class281) class280.field4667.method28((long) arg1, 1400);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class293.field4876.method1889(1, (byte) -122, arg1);
        } else {
            var3 = class307.field5294.method1889(1, (byte) -122, arg1 & 0x7FFF);
        }
        class281 var4 = new class281();
        if (arg0 != 12345678) {
            field907 = 56;
        }
        if (var3 != null) {
            var4.method1968(new class82(var3), -1);
        }
        if (arg1 >= 32768) {
            var4.method1970(60);
        }
        class280.field4667.method33(var4, (long) arg1, (byte) -117);
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILna;)V", line = 230)
    public static final void method411(int arg0, class26 arg1) {
        field912++;
        class211.field3273 = arg1;
        if (class45.field712.field2431 == null) {
            return;
        }
        try {
            class26 var2 = class81.field1268.method204((byte) 125, class45.field712.field2431);
            class26 var3 = class254.field4156.method204((byte) 126, class45.field712.field2431);
            class26 var4 = class236.method1587(new class26[] { var2, class165.field2567, arg1, class10.field135, var3 }, (byte) -119);
            class26 var5;
            if (arg0 == arg1.method171(arg0 - 84)) {
                var5 = class236.method1587(new class26[] { var4, class71.field1088 }, (byte) -60);
            } else {
                var5 = class236.method1587(new class26[] { var4, class262.field4287, class316.method2195(class128.method869((byte) -55) + 94608000000L, (byte) 52), class59.field956, class250.method1719(94608000L, (byte) 102) }, (byte) -80);
            }
            class236.method1587(new class26[] { class271.field4532, var5, class259.field4219 }, (byte) -84).method185(true, class45.field712.field2431);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V", line = 272)
    public static void method412(int arg0) {
        field905 = null;
        field904 = null;
        field910 = null;
        if (arg0 != -22749) {
            field903 = 66;
        }
        field911 = null;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)V", line = 288)
    public static final void method413(int arg0, int arg1) {
        if (arg1 <= 61) {
            method413(-60, -93);
        }
        if (class306.field5280 == 0) {
            class225.field3568.method999(128, arg0);
        } else {
            class264.field4314 = arg0;
        }
        field918++;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lna;)V", line = 306)
    public class56(class26 arg0) {
        this.field914 = arg0;
    }
}
