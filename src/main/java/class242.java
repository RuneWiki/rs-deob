import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class242 extends RuntimeException {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3471;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Ljava/lang/String;")
    public String field3472;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Lhia;")
    public static class49 field3475;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Lqv;")
    public static class79 field3473;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V", line = 7)
    public static final void method1611(int arg0, int arg1, int arg2) {
        if (class439.field6099 != arg2) {
            class295.field4296 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class295.field4296[var3] = (var3 << 12) / arg2;
            }
            class439.field6099 = arg2;
            class495.field6796 = arg2 * 32;
            class478.field6578 = arg2 - 1;
        }
        field3474++;
        if (class327.field4668 != arg0) {
            if (class439.field6099 == arg0) {
                class527.field7361 = class295.field4296;
            } else {
                class527.field7361 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class527.field7361[var4] = (var4 << 12) / arg0;
                }
            }
            class327.field4668 = arg0;
            class147.field2360 = arg0 - 1;
        }
        if (arg1 != -1) {
            method1613(-42);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lvu;I)Z", line = 56)
    public static final boolean method1612(class226 arg0, int arg1) {
        field3476++;
        class416 var2 = class312.field4418.method369((byte) 126, arg0.method1165((byte) 109));
        if (var2.field5775 == -1) {
            return true;
        }
        class309 var3 = class309.field4401.method654(var2.field5775, -31772);
        if (arg1 == 0) {
            return var3.field4399 == -1 ? true : var3.method1901(17519);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 77)
    public static void method1613(int arg0) {
        if (arg0 == -1) {
            field3475 = null;
            field3473 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 87)
    public class242(Throwable arg0, String arg1) {
        this.field3471 = arg0;
        this.field3472 = arg1;
    }
}
