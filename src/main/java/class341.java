import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class341 {

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lmo;")
    public static class746 field4403 = new class746();

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[I")
    public static int[] field4409 = new int[14];

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lpia;")
    public static class94 field4410 = new class94(21, -1);

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Ltda;")
    public static class635 field4405;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[Lfd;")
    public static class526[] field4407;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB)V", line = 3)
    public static final void method2025(int arg0, int arg1, byte arg2) {
        field4406++;
        if (class635.field9139 != arg0) {
            class246.field2980 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class246.field2980[var3] = (var3 << 12) / arg0;
            }
            class635.field9139 = arg0;
            class291.field3584 = arg0 * 32;
            class110.field1162 = arg0 - 1;
        }
        int var4 = 58 % ((50 - arg2) / 43);
        if (class201.field2372 == arg1) {
            return;
        }
        if (class635.field9139 == arg1) {
            class164.field1840 = class246.field2980;
        } else {
            class164.field1840 = new int[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                class164.field1840[var5] = (var5 << 12) / arg1;
            }
        }
        class201.field2372 = arg1;
        class312.field3870 = arg1 - 1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 49)
    public static final void method2026(int arg0) {
        if (arg0 == 9349) {
            class568.field8077 = true;
            field4404++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V", line = 74)
    public static final void method2027(int arg0, int arg1) {
        field4408++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        class518.field7364 = arg0;
        if (arg1 > 85) {
            class44.field497 = new class257[class20.field180[class518.field7364] + 1];
            class323.field4127 = 0;
            class38.field431 = 0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 93)
    public static void method2028(byte arg0) {
        field4409 = null;
        field4405 = null;
        field4407 = null;
        int var1 = 38 / ((arg0 + 8) / 42);
        field4403 = null;
        field4410 = null;
    }
}
