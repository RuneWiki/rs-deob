import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class142 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lrd;")
    public static class117 field3362 = class95.method812("backhmid2", (byte) 8);

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3367 = 0;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lrd;")
    public static class117 field3376 = class95.method812("(U1", (byte) 8);

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lrd;")
    public static class117 field3369 = class95.method812("Name eingeben:", (byte) 8);

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lrd;")
    public static class117 field3366 = class95.method812("", (byte) 8);

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lrd;")
    private static class117 field3371 = class95.method812("Take", (byte) 8);

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "[Z")
    public static boolean[] field3375 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Lrd;")
    public static class117 field3378 = field3371;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "Lrd;")
    private static class117 field3394 = class95.method812("Loading fonts )2 ", (byte) 8);

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Lrd;")
    public static class117 field3377 = field3394;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public int field3368;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public int field3374;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public int field3384;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public int field3387;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public int field3389;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public int field3390;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public int field3393;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZZLjava/lang/Object;)[B")
    public static final byte[] method1129(boolean arg0, boolean arg1, Object arg2) {
        field3385++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class133.method1088(var3, !arg1) : var3;
        } else {
            if (!arg1) {
                method1133(-92, -101, 85, 43);
            }
            if (!(arg2 instanceof class100)) {
                throw new IllegalArgumentException();
            }
            class100 var4 = (class100) arg2;
            return var4.method849(0);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static final void method1130(int arg0) {
        field3392++;
        if (class68.field1925 && class53.field1483 != class120.field2940) {
            class110.method911(class144.field3516.field708[0], class5.field113, -21713, class120.field2940, class144.field3516.field739[0], class2.field68);
            return;
        }
        if (class120.field2940 != class102.field2581) {
            class102.field2581 = class120.field2940;
            class54.method587(class120.field2940, (byte) 113);
        }
        if (arg0 > -62) {
            method1129(false, false, null);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)Lrd;")
    public static final class117 method1131(int arg0, boolean arg1) {
        field3373++;
        if (!arg1) {
            method1131(-54, true);
        }
        return class61.method620(arg0, false, -17485, 10);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static final void method1132(int arg0) {
        field3363++;
        if (arg0 == 20439) {
            class1.field27.method1026(-127);
            class32.field944 = null;
            class79.field2112 = 1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)I")
    public static final int method1133(int arg0, int arg1, int arg2, int arg3) {
        field3381++;
        if ((class124.field3002[arg2][arg3][arg0] & 0x8) == 0) {
            return arg1 >= arg2 || (class124.field3002[1][arg3][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public static void method1134(int arg0) {
        field3371 = null;
        field3376 = null;
        field3377 = null;
        if (arg0 > -9) {
            field3375 = null;
        }
        field3378 = null;
        field3366 = null;
        field3394 = null;
        field3369 = null;
        field3362 = null;
        field3375 = null;
    }
}
