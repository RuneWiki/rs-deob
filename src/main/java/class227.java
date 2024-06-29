import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class227 {

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "Lae;")
    public static class40 field2830 = new class40();

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "Lil;")
    public static class68 field2834 = new class68(8);

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "Lpl;")
    public static class612 field2829;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V", line = 6)
    public static void method1358(int arg0) {
        if (arg0 != 0) {
            field2829 = null;
        }
        field2829 = null;
        field2830 = null;
        field2834 = null;
    }

    @OriginalMember(owner = "client!ju", name = "toString", descriptor = "()Ljava/lang/String;", line = 18)
    public final String toString() {
        field2832++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V", line = 27)
    public static final void method1359(byte arg0) {
        if (arg0 > -102) {
            field2829 = null;
        }
        field2828++;
        int var1 = (int) ((double) class431.field5395 * 34.46D);
        int var2 = var1 << 2;
        if (class32.field452.method1011()) {
            var2 += 512;
        }
        class32.field452.method1062(200, var2);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lda;ILsd;III)V", line = 44)
    public static final void method1360(class474 arg0, int arg1, class362 arg2, int arg3, int arg4, int arg5) {
        field2827++;
        if (arg0 != null && arg5 == 26219) {
            arg2.method1990(arg1, true, arg0.method757(), arg0.method727(), arg0.method734(), arg4, arg0.method699(), arg0.method758(), arg0.method703(), arg3, arg0.method692());
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)V", line = 66)
    public static final void method1361(byte arg0) {
        field2833++;
        int[] var1 = new int[class633.field8881.field974];
        int var2 = 0;
        for (int var3 = 0; var3 < class633.field8881.field974; var3++) {
            class3 var6 = class633.field8881.method434(12388, var3);
            if (var6.field51 >= 0 || var6.field59 >= 0) {
                var1[var2++] = var3;
            }
        }
        class105.field1409 = new int[var2];
        int var4 = 0;
        int var5 = -26 / ((arg0 - 63) / 42);
        while (var4 < var2) {
            class105.field1409[var4] = var1[var4];
            var4++;
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(II)V", line = 99)
    public class227(int arg0, int arg1) {
        this.field2831 = arg0;
    }
}
