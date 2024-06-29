import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class76 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1162 = 0;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1164 = 0;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lob;")
    public static class292 field1165 = null;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1170 = 0;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 9)
    public static void method565(byte arg0) {
        field1165 = null;
        if (arg0 <= 119) {
            method565((byte) 4);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V", line = 31)
    public static final void method566(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        class74.field1140 = new int[arg1];
        class10.field169 = new int[arg1];
        class259.field4019 = new int[arg1];
        field1167++;
        class151.field2430 = new int[arg1];
        class185.field2939 = new int[arg1];
    }
}
