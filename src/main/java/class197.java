import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class197 {

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Lsg;")
    public static class30 field3567 = class167.method1221((byte) 33, "");

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Lsg;")
    public static class30 field3568 = class167.method1221((byte) 33, "Fertigkeit: ");

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Z")
    public static boolean field3569 = true;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field3563 = 0;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field3571 = 0;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Z")
    public static boolean field3570 = false;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Z")
    public static boolean field3566 = false;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Lcg;")
    public static class34 field3561;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lcg;")
    public static class34 field3562;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3564;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[[B")
    public static byte[][] field3559;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILnf;)Lnf;")
    public abstract class53 method175(int arg0, class53 arg1);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method1421(int arg0) {
        field3564 = null;
        field3562 = null;
        field3561 = null;
        if (arg0 >= -115) {
            method1421(-70);
        }
        field3567 = null;
        field3568 = null;
        field3559 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(JI)Lsg;")
    public static final class30 method1422(long arg0, int arg1) {
        field3565++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            long var3 = arg0;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            if (arg1 >= -116) {
                return null;
            }
            byte[] var6 = new byte[var5];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var5--;
                var6[var5] = class169.field3171[(int) (var8 - (arg0 * 37L))];
            }
            class30 var7 = new class30();
            var7.field618 = var6;
            var7.field576 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static final void method1423(byte arg0) {
        class132.field2600.method1652(-8259);
        field3560++;
        int var1 = -70 % ((arg0 - 3) / 52);
        class9.field168.method1652(-8259);
        class261.field4606.method1652(-8259);
    }
}
