import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class199 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lfj;")
    public final class252 field3455;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public final int field3462;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Loa;")
    private static class99 field3460 = class221.method1463(2844, "Members object");

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Loa;")
    public static class99 field3459 = field3460;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "Loa;")
    private static class99 field3465 = class221.method1463(2844, "Attack");

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Loa;")
    private static class99 field3467 = class221.method1463(2844, " ");

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Loa;")
    public static class99 field3461 = field3465;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "[J")
    public static long[] field3468 = new long[100];

    @OriginalMember(owner = "client!si", name = "p", descriptor = "Loa;")
    public static class99 field3469 = field3467;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "[Lpi;")
    public static class139[] field3466;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static final void method1336(boolean arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class197.field3426[var1] = false;
        }
        class24.field361 = -1;
        field3464++;
        class141.field2481 = 1;
        if (arg0) {
            field3465 = null;
        }
        class220.field3824 = -1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static final void method1337(byte arg0) {
        field3457++;
        if (arg0 < 1) {
            method1337((byte) -41);
        }
        class232.field3993.method1812(-84);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Loa;I)I")
    public static final int method1338(class99 arg0, int arg1) {
        field3463++;
        int var2 = 0;
        if (arg1 != -1) {
            return 120;
        }
        while (class207.field3584.length > var2) {
            if (class207.field3584[var2].method706(arg0, 119)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)I")
    public static final int method1339(int arg0, int arg1, int arg2) {
        field3454++;
        int var3 = 0;
        int var4 = 24 / ((2 - arg0) / 51);
        while (arg1 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Lhj;")
    public static final class71 method1340(int arg0, int arg1) {
        field3456++;
        class71 var2 = (class71) class248.field4269.method1811((long) arg1, 112);
        if (var2 != null) {
            return var2;
        }
        int var3 = -112 / ((arg0 + 47) / 63);
        byte[] var4 = class138.field2427.method1242(arg1, 16, 6801);
        class71 var5 = new class71();
        if (var4 != null) {
            var5.method499(new class261(var4), (byte) 99);
        }
        class248.field4269.method1817((long) arg1, 16, var5);
        return var5;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
    public static void method1341(byte arg0) {
        field3467 = null;
        field3461 = null;
        field3469 = null;
        field3468 = null;
        field3466 = null;
        field3460 = null;
        if (arg0 >= -60) {
            method1341((byte) 16);
        }
        field3459 = null;
        field3465 = null;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(II)V")
    public class199(int arg0, int arg1) {
        this.field3455 = class218.method1453((byte) -101, arg0);
        this.field3462 = arg1;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lfj;I)V")
    public class199(class252 arg0, int arg1) {
        this.field3462 = arg1;
        this.field3455 = arg0;
    }
}
