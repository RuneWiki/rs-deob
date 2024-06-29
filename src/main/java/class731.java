import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class731 extends class540 {

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "[I")
    public static int[] field10217 = new int[14];

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Lwq;")
    public static class176 field10218 = null;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Ljo;")
    public static class351 field10216 = new class351(26, 16);

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field10212;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field10213;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public int field10214;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public int field10215;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Liw;")
    public class331 field10211;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Ljo;")
    public class351 field10210;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lha;")
    public static class66 field10209;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 13)
    public final void method4095(byte arg0) {
        if (arg0 == 55) {
            field10213++;
            if (class325.field4865 < class257.field3606.length) {
                class257.field3606[class325.field4865++] = this;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 28)
    public static void method4096(int arg0) {
        field10217 = null;
        if (arg0 != -14596) {
            method4096(73);
        }
        field10209 = null;
        field10216 = null;
        field10218 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V", line = 42)
    public static final void method4097(String arg0, int arg1, boolean arg2, String arg3) {
        field10212++;
        class336.field4992 = arg3;
        class676.field9624 = arg0;
        class155.field2305 = arg2;
        if (!class155.field2305 && (class336.field4992.equals("") || class676.field9624.equals(""))) {
            class399.method2423(201, 3);
        } else if (arg1 == 31533) {
            class255.field3580 = false;
            if (class544.field7651 != 1) {
                class388.field5533 = 0;
                class9.field152 = -1;
            }
            class399.method2423(201, -3);
            class554.field7895 = 0;
            class76.field1022 = 0;
            class237.field3423 = 1;
        }
    }
}
