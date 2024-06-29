import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class228 extends class317 {

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "Lea;")
    public static class204 field3640 = new class204();

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "I")
    public int field3639;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "Lpm;")
    public class103 field3638;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "[B")
    public byte[] field3637;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)I", line = 4)
    public final int method406(byte arg0) {
        if (arg0 == 34) {
            field3642++;
            return this.field4940 ? 0 : 100;
        } else {
            return -70;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)[B", line = 22)
    public final byte[] method402(byte arg0) {
        if (arg0 >= -31) {
            this.field3639 = 68;
        }
        field3641++;
        if (this.field4940) {
            throw new RuntimeException();
        }
        return this.field3637;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZII)V", line = 51)
    public static final void method1653(boolean arg0, int arg1, int arg2) {
        class295.field4670 = arg1 - class310.field4885;
        field3635++;
        int var3 = (int) ((float) class91.field1500.field4608 / class101.field1719) + class295.field4670;
        int var4 = class295.field4670 - ((int) ((float) class91.field1500.field4608 / class101.field1719));
        if (var4 < 0) {
            class295.field4670 = (int) ((float) class91.field1500.field4608 / class101.field1719);
        }
        class188.field2994 = class279.field4316 - (-class70.field1107 + arg2) - 1;
        int var5 = class188.field2994 - ((int) ((float) class91.field1500.field4499 / class101.field1719));
        int var6 = (int) ((float) class91.field1500.field4499 / class101.field1719) + class188.field2994;
        if (!arg0) {
            field3643 = 64;
        }
        if (var5 < 0) {
            class188.field2994 = (int) ((float) class91.field1500.field4499 / class101.field1719);
        }
        if (var6 > class279.field4316) {
            class188.field2994 = class279.field4316 - ((int) ((float) class91.field1500.field4499 / class101.field1719));
        }
        if (var3 > class79.field1208) {
            class295.field4670 = class79.field1208 - ((int) ((float) class91.field1500.field4608 / class101.field1719));
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLja;)V", line = 90)
    public static final void method1654(boolean arg0, class64 arg1) {
        if (!arg0) {
            class77.field1179 = arg1;
            field3636++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "(I)V", line = 101)
    public static void method1655(int arg0) {
        field3640 = null;
        if (arg0 != -1) {
            field3643 = -35;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljk;B)V", line = 111)
    public static final void method1656(class88 arg0, byte arg1) {
        class269.method1935(arg0, 200000, 16285);
        if (arg1 >= -27) {
            method1653(true, -68, -36);
        }
        field3634++;
    }
}
