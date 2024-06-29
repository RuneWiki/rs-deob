import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class595 {

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "Lps;")
    public static class105 field8082 = new class105();

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "Z")
    public static boolean field8086 = true;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field8085 = 0;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "Les;")
    public static class403 field8084 = new class403(1350);

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
    public static void method3407(int arg0) {
        field8082 = null;
        field8084 = null;
        if (arg0 >= -16) {
            field8086 = true;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BII)V")
    public static final void method3408(byte arg0, int arg1, int arg2) {
        if (arg0 != 92) {
            method3408((byte) -14, 127, -12);
        }
        class632.field8632 = arg2;
        field8083++;
        class176.field2182 = arg1;
        if (class727.field10184 == 0) {
            class734.field10263 = class369.field4587 * 2 + class176.field2182;
            class608.field8178 = class136.field1707 * 2 + class632.field8632;
        } else if (class727.field10184 == 1) {
            class223.field2612 = class176.field2182 / class372.field4683 + class690.field9392 + 2;
            class331.field4092 = class632.field8632 / class603.field8149 + class375.field4708 + 2;
            class608.field8178 = class603.field8149 * class331.field4092;
            class734.field10263 = class372.field4683 * class223.field2612;
            class136.field1707 = class608.field8178 - class632.field8632 >> 1;
            class369.field4587 = class734.field10263 - class176.field2182 >> 1;
            return;
        } else if (class727.field10184 == 2) {
            class734.field10263 = class176.field2182;
            class608.field8178 = class632.field8632;
            return;
        }
    }
}
