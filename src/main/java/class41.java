import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class41 {

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "Z")
    public static boolean field522 = false;

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "I")
    private static int field524 = 0;

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "I")
    public static volatile int field521 = 0;

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "[[B")
    private static byte[][] field523 = new byte[1000][];

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "Z")
    public static volatile boolean field519 = true;

    @OriginalMember(owner = "mapview!w", name = "h", descriptor = "[[B")
    private static byte[][] field526 = new byte[50][];

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "La;")
    public static class1 field520 = class3.method36("Key", -113);

    @OriginalMember(owner = "mapview!w", name = "i", descriptor = "La;")
    public static class1 field527 = class3.method36("Mace Shop", -90);

    @OriginalMember(owner = "mapview!w", name = "g", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Z)I", line = 9)
    public static final int method261(boolean arg0) {
        if (!arg0) {
            method265(-54, -63);
        }
        return class6.field60 == null ? 0 : class6.field60[class5.field47];
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "([La;B)V", line = 32)
    public static final void method262(class1[] arg0, byte arg1) {
        class14.method69(true, arg0, arg0.length, 0);
        if (arg1 >= -122) {
            field519 = false;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(III[B)I", line = 43)
    public static final int method263(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        int var5 = arg1;
        if (arg2 != 0) {
            return -46;
        }
        while (var5 < arg0) {
            var4 = class3.field38[(var4 ^ arg3[var5]) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(ILa;Lq;La;)[Lu;", line = 73)
    public static final class38[] method264(int arg0, class1 arg1, class31 arg2, class1 arg3) {
        if (arg0 == -1684916888) {
            int var4 = arg2.method196(-2, arg3);
            int var5 = arg2.method201(arg0 + 1684916888, var4, arg1);
            return class21.method112(false, arg2, var5, var4);
        } else {
            return (class38[]) null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(II)[B", line = 86)
    public static final synchronized byte[] method265(int arg0, int arg1) {
        if (arg0 == 100 && class11.field112 > 0) {
            byte[] var2 = field523[--class11.field112];
            field523[class11.field112] = null;
            return var2;
        } else if (arg0 == 5000 && class3.field28 > 0) {
            byte[] var3 = class21.field191[--class3.field28];
            class21.field191[class3.field28] = null;
            return var3;
        } else {
            if (arg1 != -251) {
                field527 = null;
            }
            if (arg0 == 30000 && field524 > 0) {
                byte[] var4 = field526[--field524];
                field526[field524] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(B)V", line = 152)
    public static void method266(byte arg0) {
        field523 = null;
        field526 = null;
        if (arg0 > -72) {
            field525 = 40;
        }
        field527 = null;
        field520 = null;
    }
}
