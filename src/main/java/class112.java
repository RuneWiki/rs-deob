import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class112 {

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Leb;")
    public static class230 field2015 = class68.method589(0, "leuchten3:");

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[Lhh;")
    public static class116[] field2007 = new class116[4];

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Leb;")
    public static class230 field2011 = class68.method589(0, "<col=ff7000>");

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lgd;")
    public static class73 field2006;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2014;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "[B")
    public static byte[] field2009;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static final void method898(int arg0) {
        class213.field3686.method1124(0);
        field2005++;
        if (arg0 != 23267) {
            method898(-39);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I")
    public static final int method899(int arg0, int arg1) {
        if (arg0 <= 112) {
            method904(34L, -86);
        }
        field2016++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public static final void method900(int arg0) {
        field2010++;
        for (int var1 = 0; var1 < class105.field1911; var1++) {
            int var2 = class121.field2132[var1];
            class260 var3 = class230.field4011[var2];
            int var4 = class183.field3182.method200(255);
            if ((var4 & 0x2) != 0) {
                var4 += class183.field3182.method200(255) << 8;
            }
            class114.method912(var4, var2, var3, true);
        }
        if (arg0 != -4639) {
            method902(1, 29);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Z")
    public static final boolean method901(int arg0) {
        field2017++;
        if (class261.field4660) {
            try {
                if ((Boolean) class123.field2143.method1588(97, class184.field3228.field2320)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 < 78) {
            method900(-20);
        }
        return true;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
    public static final void method902(int arg0, int arg1) {
        field2008++;
        if (class202.method1422(arg1, true)) {
            if (arg0 <= 54) {
                field2006 = null;
            }
            class98.method842(class99.field1839[arg1], false, -1);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method903(byte arg0) {
        field2007 = null;
        field2009 = null;
        if (arg0 <= -46) {
            field2011 = null;
            field2014 = null;
            field2006 = null;
            field2015 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)V")
    public static final void method904(long arg0, int arg1) {
        field2013++;
        if (arg1 != 16934) {
            method902(86, -27);
        }
        if (arg0 == 0L) {
            return;
        }
        if (!(class273.field4805 < 100 || class80.field1460) || class273.field4805 >= 200) {
            class227.method1565(class89.field1580, (byte) 85, 0, class34.field633);
            return;
        }
        class230 var3 = class113.method906(arg0, (byte) -87).method1623(-30947);
        for (int var4 = 0; var4 < class273.field4805; var4++) {
            if (class140.field2508[var4] == arg0) {
                class227.method1565(class89.field1580, (byte) 57, 0, class173.method1267((byte) 59, new class230[] { var3, class82.field1481 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class45.field796; var5++) {
            if (class145.field2607[var5] == arg0) {
                class227.method1565(class89.field1580, (byte) 13, 0, class173.method1267((byte) 59, new class230[] { class98.field1811, var3, class190.field3353 }));
                return;
            }
        }
        if (var3.method1585(class56.field1033.field4620, 114)) {
            class227.method1565(class89.field1580, (byte) 79, 0, class60.field1159);
            return;
        }
        class12.field239[class273.field4805] = var3;
        class140.field2508[class273.field4805] = arg0;
        class268.field4750[class273.field4805] = 0;
        class180.field3153[class273.field4805] = class89.field1580;
        class59.field1130[class273.field4805] = 0;
        class245.field4279++;
        class114.field2040[class273.field4805] = false;
        class67.field1265 = class54.field935;
        class273.field4805++;
        class153.field2747.method978(arg1 ^ 0xFFFFBDA4, 198);
        class153.field2747.method148(arg0, (byte) 126);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method905(String arg0, byte arg1) throws ClassNotFoundException {
        field2018++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else {
            int var2 = -77 / ((76 - arg1) / 47);
            if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }
}
