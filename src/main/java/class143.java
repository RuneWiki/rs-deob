import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class143 {

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Z")
    public static boolean field2780 = false;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lsd;")
    public static class166 field2778 = class135.method935("b12_full", 0);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public int field2769;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public int field2783;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "J")
    public static long field2771;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Lsd;")
    public class166 field2775;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Lih;")
    public static class80 field2782;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Z")
    public boolean field2776;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lsd;Z)V")
    public static final void method976(class166 arg0, boolean arg1) {
        if (arg1) {
            field2780 = true;
        }
        field2779++;
        if (class156.field2995 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method1133((byte) 30);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class156.field2995.length && class156.field2995[var2].field2541 != var3) {
            var2++;
        }
        if (class156.field2995.length > var2 && class156.field2995[var2] != null) {
            class29.field544++;
            class156.field2989.method705(113, (byte) 9);
            class156.field2989.method428(class156.field2995[var2].field2541, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Z")
    public static final boolean method977(byte arg0) {
        field2784++;
        if (class153.field2952 == 0) {
            return arg0 == 90 ? class165.field3139.method473(arg0 - 188) : true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V")
    public static final void method978(int arg0, byte arg1) {
        field2772++;
        if (!class169.method1169(arg0, arg1 ^ 0x6A)) {
            return;
        }
        if (arg1 != 106) {
            field2786 = 125;
        }
        class193[] var2 = class63.field1309[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class193 var4 = var2[var3];
            if (var4 != null) {
                var4.field3745 = 0;
                var4.field3732 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static final void method979(int arg0) {
        Object var1 = class89.field1751;
        synchronized (class89.field1751) {
            if (class32.field586 != 0) {
                class32.field586 = 1;
                try {
                    class89.field1751.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        if (arg0 != -17543) {
            field2780 = false;
        }
        field2773++;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
    public static void method980(byte arg0) {
        if (arg0 != -114) {
            field2781 = 79;
        }
        field2782 = null;
        field2778 = null;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    public static final void method981(int arg0) {
        field2777++;
        if (arg0 != -27517) {
            return;
        }
        while (true) {
            class165 var1 = class137.field2671;
            class153 var2;
            synchronized (class137.field2671) {
                var2 = (class153) class119.field2329.method1114(true);
            }
            if (var2 == null) {
                return;
            }
            var2.field2950.method149(3673, false, var2.field2948, var2.field2953, (int) var2.field2541);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIBI)I")
    public static final int method982(int arg0, int arg1, byte arg2, int arg3) {
        field2774++;
        if (arg2 >= -2) {
            field2771 = -118L;
        }
        if (arg1 > 179) {
            arg0 /= 2;
        }
        if (arg1 > 192) {
            arg0 /= 2;
        }
        if (arg1 > 217) {
            arg0 /= 2;
        }
        if (arg1 > 243) {
            arg0 /= 2;
        }
        return (arg3 / 4 << 10) + (arg0 / 32 << 7) + arg1 / 2;
    }
}
