import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class104 {

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field1489 = -1;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[S")
    public static short[] field1491 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Llh;")
    public static class23 field1490 = new class23();

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lwm;")
    public static class152 field1492 = class157.method1048("Clientscript error )2 check log for details", 117);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Z")
    public static boolean field1494;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "[I")
    public static int[] field1495;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[[S")
    public static short[][] field1493;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILoe;I)V", line = 9)
    public static final void method700(int arg0, int arg1, class127 arg2, int arg3) {
        if (arg2.field1857 == 0) {
            arg2.field1924 = arg2.field1927;
        } else if (arg2.field1857 == 1) {
            arg2.field1924 = (arg1 - arg2.field1876) / 2 + arg2.field1927;
        } else if (arg2.field1857 == 2) {
            arg2.field1924 = arg1 - (arg2.field1927 + arg2.field1876);
        } else if (arg2.field1857 == 3) {
            arg2.field1924 = arg2.field1927 * arg1 >> 14;
        } else if (arg2.field1857 == 4) {
            arg2.field1924 = (arg1 - arg2.field1876) / 2 + (arg2.field1927 * arg1 >> 14);
        } else {
            arg2.field1924 = arg1 - (arg2.field1927 * arg1 >> 14) - arg2.field1876;
        }
        if (arg2.field1838 == 0) {
            arg2.field1828 = arg2.field1851;
        } else if (arg2.field1838 == 1) {
            arg2.field1828 = (arg0 - arg2.field1921) / 2 + arg2.field1851;
        } else if (arg2.field1838 == 2) {
            arg2.field1828 = arg0 - arg2.field1921 - arg2.field1851;
        } else if (arg2.field1838 == 3) {
            arg2.field1828 = arg2.field1851 * arg0 >> 14;
        } else if (arg2.field1838 == 4) {
            arg2.field1828 = (arg2.field1851 * arg0 >> 14) + (arg0 - arg2.field1921) / 2;
        } else {
            arg2.field1828 = arg0 - (arg2.field1851 * arg0 >> 14) - arg2.field1921;
        }
        if (arg3 != -16133) {
            method703(-80, 49);
        }
        field1486++;
        if (!class317.field5495 || !(client.method1759(arg2).field1171 != 0 || arg2.field1902 == 0)) {
            return;
        }
        if (arg2.field1828 < 0) {
            arg2.field1828 = 0;
        } else if (arg0 < arg2.field1921 + arg2.field1828) {
            arg2.field1828 = arg0 - arg2.field1921;
        }
        if (arg2.field1924 < 0) {
            arg2.field1924 = 0;
        } else if (arg1 < (arg2.field1924 + arg2.field1876)) {
            arg2.field1924 = arg1 - arg2.field1876;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILwm;)V", line = 81)
    public static final void method701(int arg0, class152 arg1) {
        field1488++;
        class106.field1514 = arg1;
        if (class34.field572.field2359 == null) {
            return;
        }
        try {
            class152 var2 = class10.field125.method976((byte) -128, class34.field572.field2359);
            class152 var3 = class305.field5240.method976((byte) -60, class34.field572.field2359);
            class152 var4 = class195.method1307(new class152[] { var2, class61.field926, arg1, class100.field1460, var3 }, (byte) 29);
            class152 var5;
            if (arg1.method1000(0) == 0) {
                var5 = class195.method1307(new class152[] { var4, class59.field905 }, (byte) 29);
            } else {
                var5 = class195.method1307(new class152[] { var4, class216.field3505, class111.method742(arg0 - 8067, class76.method507(-30994) + 94608000000L), class286.field4848, class241.method1641(85, 94608000L) }, (byte) 29);
            }
            class195.method1307(new class152[] { class212.field3436, var5, class82.field1148 }, (byte) 29).method990(0, class34.field572.field2359);
        } catch (Throwable var7) {
        }
        if (arg0 != 8080) {
            method704((byte) 84);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)I", line = 118)
    public static final int method702(int arg0, byte arg1) {
        field1485++;
        return arg1 == -118 ? arg0 >>> 10 : 74;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I", line = 132)
    public static final int method703(int arg0, int arg1) {
        field1487++;
        if (arg1 > -121) {
            method701(106, (class152) null);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 146)
    public static void method704(byte arg0) {
        field1492 = null;
        field1491 = null;
        if (arg0 >= 70) {
            field1490 = null;
            field1493 = (short[][]) null;
            field1495 = null;
        }
    }
}
