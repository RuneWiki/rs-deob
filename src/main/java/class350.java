import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class350 extends class101 {

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Lft;")
    public static class4 field4519 = new class4();

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public int field4517;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public int field4518;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public int field4524;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Ljava/lang/String;")
    public String field4523;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method1949(int arg0) {
        if (arg0 != 0) {
            field4519 = null;
        }
        field4519 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lha;I)V")
    public static final void method1950(class52[] arg0, int arg1) {
        if (arg1 != 10) {
            return;
        }
        class310.field3963 = arg0.length;
        field4522++;
        class580.field8461 = new int[class310.field3963 + 10];
        class7.field59 = new class52[class310.field3963 + 10];
        class345.method1929(arg0, 0, class7.field59, 0, class310.field3963);
        for (int var2 = 0; var2 < class310.field3963; var2++) {
            class580.field8461[var2] = class7.field59[var2].method286();
        }
        for (int var3 = class310.field3963; var3 < class7.field59.length; var3++) {
            class580.field8461[var3] = 12;
        }
    }
}
