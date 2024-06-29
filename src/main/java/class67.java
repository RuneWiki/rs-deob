import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class67 {

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field1167 = 0;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "Ldc;")
    public static class5 field1169 = new class5(0, 0);

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)I")
    public static final int method580(boolean arg0) {
        field1170++;
        if (arg0) {
            field1169 = null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(Z)V")
    public static final void method581(boolean arg0) {
        if (arg0) {
            class36.field545 = class74.field1242;
            class529.field7807 = class62.field1063;
        } else {
            class36.field545 = class73.field1223;
            class529.field7807 = class145.field2135;
        }
        class334.field5130 = class36.field545.length;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public static final void method582(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class165.field2473[var1] = true;
        }
        if (arg0 == -25099) {
            field1168++;
        }
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V")
    public static void method583(int arg0) {
        field1169 = null;
        if (arg0 != 0) {
            field1167 = -122;
        }
    }
}
