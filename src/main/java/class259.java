import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class259 {

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "Lwo;")
    public static class445 field3385 = new class445();

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)Lto;")
    public static final class229 method1564(int arg0) {
        if (arg0 != -6) {
            field3390 = -109;
        }
        field3386++;
        return class65.field811 == 0 ? new class229() : class535.field7353[--class65.field811];
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(I)V")
    public static final void method1565(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class149.field2028[var1] = false;
        }
        field3389++;
        class669.field9514 = -1;
        class65.field810 = class147.field1980;
        class68.field831 = -1;
        class170.field2427 = arg0;
        class311.field4200 = 5;
        class91.field1120 = class558.field7615;
        class490.field6784 = class148.field1986;
        class292.field3856 = class604.field8440;
        class284.field3742 = class82.field946;
        class323.field4356 = class327.field4404;
        class83.field1004 = -1;
        class342.field4585 = -1;
        class108.field1281 = 0;
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)V")
    public static void method1566(int arg0) {
        if (arg0 != -11803) {
            field3390 = 115;
        }
        field3385 = null;
    }

    @OriginalMember(owner = "client!jw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3387++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(II)V")
    public class259(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "(I)[Lrb;")
    public static final class379[] method1567(int arg0) {
        field3388++;
        if (arg0 != -1) {
            method1567(-50);
        }
        return new class379[] { class616.field8531, class267.field3494, class386.field5152 };
    }
}
