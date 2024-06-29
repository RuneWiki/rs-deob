import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class132 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lob;")
    public static class141 field2512 = class175.method1195(40, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field2513 = 0;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "[J")
    public static long[] field2518 = new long[1000];

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field2520 = -1;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "[[[B")
    public static byte[][][] field2519;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Lhg;")
    public static final class77 method837(int arg0) {
        field2515++;
        try {
            if (arg0 < 91) {
                method840(71, 73);
            }
            return (class77) Class.forName("te").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class62();
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static void method838(int arg0) {
        field2519 = null;
        field2512 = null;
        if (arg0 > -84) {
            field2520 = -91;
        }
        field2518 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZI)V")
    public static final void method839(int arg0, boolean arg1, int arg2) {
        field2516++;
        if (class188.field3637 < 2 && class29.field568 == 0 && !class61.field1194) {
            return;
        }
        if (arg1) {
            field2520 = -21;
        }
        class141 var3;
        if (class29.field568 == 1 && class188.field3637 < 2) {
            var3 = class220.method1422(new class141[] { class59.field1150, class196.field3752, class179.field3522, class113.field2166 }, -3);
        } else if (class61.field1194 && class188.field3637 < 2) {
            var3 = class220.method1422(new class141[] { class4.field45, class196.field3752, class185.field3607, class113.field2166 }, -3);
        } else {
            var3 = class46.method306(class188.field3637 - 1, (byte) 8);
        }
        if (class188.field3637 > 2) {
            var3 = class220.method1422(new class141[] { var3, class41.field814, class78.method543((byte) 93, class188.field3637 - 2), class40.field795 }, -3);
        }
        int var4 = class81.field1624.method865(var3, arg2 + 4, arg0 + 15, 16777215, 0, class221.field4188, class14.field246);
        class143.method944(arg0, arg2 + 4, var4 + class81.field1624.method869(var3), 15, 2);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method840(int arg0, int arg1) {
        field2517++;
        if (arg0 == 100 && class151.field2905 > 0) {
            byte[] var2 = class131.field2504[--class151.field2905];
            class131.field2504[class151.field2905] = null;
            return var2;
        } else if (arg0 == 5000 && class165.field3208 > 0) {
            byte[] var3 = class163.field3152[--class165.field3208];
            class163.field3152[class165.field3208] = null;
            return var3;
        } else {
            if (arg1 != 15) {
                field2514 = -100;
            }
            if (arg0 == 30000 && class196.field3742 > 0) {
                byte[] var4 = class107.field2068[--class196.field3742];
                class107.field2068[class196.field3742] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }
}
