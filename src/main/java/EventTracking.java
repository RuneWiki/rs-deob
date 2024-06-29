import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class EventTracking {

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "Z")
    public static boolean field33 = false;

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "Lk;")
    public static Packet field34 = null;

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "Lk;")
    public static Packet field35 = null;

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "J")
    public static long field36 = 0L;

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "I")
    public static int field37 = 0;

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "J")
    public static long field38 = 0L;

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "I")
    public static int field40 = 0;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I)V")
    private static final synchronized void method13(int arg0) {
        if (field34.field87 + arg0 >= 500) {
            Packet var1 = field34;
            field34 = Packet.method61(1);
            field35 = var1;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(II)V")
    public static final synchronized void method14(int arg0, int arg1) {
        if (!field33 || (arg0 < 0 || arg0 >= 789 || arg1 < 0 || arg1 >= 532)) {
            return;
        }
        long var2 = System.currentTimeMillis();
        if (var2 - field38 < 50L) {
            return;
        }
        field38 = var2;
        field37++;
        long var4 = (var2 - field36) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field36 = var2;
        if (arg0 - field39 < 8 && arg0 - field39 >= -8 && arg1 - field40 < 8 && arg1 - field40 >= -8) {
            method13(3);
            field34.method58(5);
            field34.method58((int) var4);
            field34.method58((arg1 + 8 - field40 << 4) + arg0 + 8 - field39);
        } else if (arg0 - field39 < 128 && arg0 - field39 >= -128 && arg1 - field40 < 128 && arg1 - field40 >= -128) {
            method13(4);
            field34.method58(6);
            field34.method58((int) var4);
            field34.method58(arg0 + 128 - field39);
            field34.method58(arg1 + 128 - field40);
        } else {
            method13(5);
            field34.method58(7);
            field34.method58((int) var4);
            field34.method62((arg1 << 10) + arg0);
        }
        field39 = arg0;
        field40 = arg1;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "()V")
    public static final synchronized void method15() {
        if (!field33) {
            return;
        }
        field37++;
        long var0 = System.currentTimeMillis();
        long var2 = (var0 - field36) / 10L;
        if (var2 > 250L) {
            var2 = 250L;
        }
        field36 = var0;
        method13(2);
        field34.method58(10);
        field34.method58((int) var2);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(III)V")
    public static final synchronized void method16(int arg0, int arg1, int arg2) {
        if (!field33 || (arg0 < 0 || arg0 >= 789 || arg1 < 0 || arg1 >= 532)) {
            return;
        }
        field37++;
        long var3 = System.currentTimeMillis();
        long var5 = (var3 - field36) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field36 = var3;
        method13(5);
        if (arg2 == 1) {
            field34.method58(1);
        } else {
            field34.method58(2);
        }
        field34.method58((int) var5);
        field34.method62((arg1 << 10) + arg0);
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "()V")
    public static final synchronized void method17() {
        if (!field33) {
            return;
        }
        field37++;
        long var0 = System.currentTimeMillis();
        long var2 = (var0 - field36) / 10L;
        if (var2 > 250L) {
            var2 = 250L;
        }
        field36 = var0;
        method13(2);
        field34.method58(11);
        field34.method58((int) var2);
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(I)V")
    public static final synchronized void method18(int arg0) {
        if (!field33) {
            return;
        }
        field37++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field36) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field36 = var1;
        method13(2);
        if (arg0 == 1) {
            field34.method58(3);
        } else {
            field34.method58(4);
        }
        field34.method58((int) var3);
    }

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "(I)V")
    public static final synchronized void method19(int arg0) {
        if (!field33) {
            return;
        }
        field37++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field36) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field36 = var1;
        if (arg0 == 1000) {
            arg0 = 11;
        }
        if (arg0 == 1001) {
            arg0 = 12;
        }
        if (arg0 == 1002) {
            arg0 = 14;
        }
        if (arg0 == 1003) {
            arg0 = 15;
        }
        if (arg0 >= 1008) {
            arg0 -= 992;
        }
        method13(3);
        field34.method58(8);
        field34.method58((int) var3);
        field34.method58(arg0);
    }

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "()V")
    public static final synchronized void method20() {
        if (!field33) {
            return;
        }
        field37++;
        long var0 = System.currentTimeMillis();
        long var2 = (var0 - field36) / 10L;
        if (var2 > 250L) {
            var2 = 250L;
        }
        field36 = var0;
        method13(2);
        field34.method58(12);
        field34.method58((int) var2);
    }

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "()V")
    public static final synchronized void method21() {
        if (!field33) {
            return;
        }
        field37++;
        long var0 = System.currentTimeMillis();
        long var2 = (var0 - field36) / 10L;
        if (var2 > 250L) {
            var2 = 250L;
        }
        field36 = var0;
        method13(2);
        field34.method58(13);
        field34.method58((int) var2);
    }

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "(I)V")
    public static final synchronized void method22(int arg0) {
        if (!field33) {
            return;
        }
        field37++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field36) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field36 = var1;
        if (arg0 == 1000) {
            arg0 = 11;
        }
        if (arg0 == 1001) {
            arg0 = 12;
        }
        if (arg0 == 1002) {
            arg0 = 14;
        }
        if (arg0 == 1003) {
            arg0 = 15;
        }
        if (arg0 >= 1008) {
            arg0 -= 992;
        }
        method13(3);
        field34.method58(9);
        field34.method58((int) var3);
        field34.method58(arg0);
    }
}
