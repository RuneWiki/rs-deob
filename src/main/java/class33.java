import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class33 {

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "Lud;")
    public static class279 field736 = class130.method1024("::cardmem", 255);

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "[[S")
    public static short[][] field741 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "Lud;")
    public static class279 field747 = class130.method1024("Speicher wird zugewiesen)3", 255);

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "Lud;")
    private static class279 field739 = class130.method1024("Take", 255);

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Lud;")
    public static class279 field738 = field739;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field748 = 0;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Lok;")
    public static class149 field742;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "[S")
    public static short[] field745;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "[Z")
    public static boolean[] field740;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 13)
    public static final void method296(byte arg0) {
        if (arg0 != -90) {
            method298(-25, 5, (byte) -66, 57, 93);
        }
        for (int var1 = 0; var1 < class174.field3139; var1++) {
            int var2 = class45.field945[var1];
            class239 var3 = class96.field1780[var2];
            int var4 = class287.field5106.method483(-116);
            if ((var4 & 0x10) != 0) {
                var4 += class287.field5106.method483(arg0 - 31) << 8;
            }
            class103.method871(var3, var4, var2, -120);
        }
        field743++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IBI)I", line = 49)
    public static final int method297(int arg0, byte arg1, int arg2) {
        field744++;
        int var3 = arg2 - 1 & arg0 >> 31;
        if (arg1 != 124) {
            method299(99);
        }
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBII)V", line = 70)
    public static final void method298(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field746++;
        if (arg2 < 58) {
            field742 = (class149) null;
        }
        for (int var5 = 0; var5 < class14.field434; var5++) {
            if (arg0 < class115.field2100[var5] + class191.field3434[var5] && (arg0 + arg3) > class115.field2100[var5] && class249.field4436[var5] + class102.field1900[var5] > arg1 && arg1 + arg4 > class102.field1900[var5]) {
                class249.field4446[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Z", line = 94)
    public static final boolean method299(int arg0) {
        field737++;
        if (arg0 != 5799) {
            method296((byte) -39);
        }
        if (class304.field5396) {
            try {
                return !(Boolean) class298.field5281.method1983(class110.field2022.field5418, 7308);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)V", line = 116)
    public static final void method300(int arg0, byte arg1) {
        class104 var2 = class293.method2085(1, arg0, false);
        var2.method875(12466);
        field735++;
        if (arg1 <= 114) {
            method298(-5, -97, (byte) 48, 125, 65);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 132)
    public static void method301(boolean arg0) {
        field741 = (short[][]) null;
        field742 = null;
        field740 = null;
        field745 = null;
        field747 = null;
        field739 = null;
        field736 = null;
        if (!arg0) {
            method298(14, 51, (byte) 96, 94, -95);
        }
        field738 = null;
    }
}
