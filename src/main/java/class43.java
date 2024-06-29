import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class43 extends class21 {

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    private int field825;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "[I")
    public static int[] field817 = new int[5];

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field818 = 0;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(Z)V", line = 5)
    public static final void method322(boolean arg0) {
        field824++;
        class280.field4308.method1884(-22054);
        if (!arg0) {
            method326((class307) null, -126, 88);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lag;B)V", line = 17)
    public static final void method323(class202 arg0, byte arg1) {
        field815++;
        int var2 = arg0.method1296((byte) 91);
        class180.field2897 = new class241[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class180.field2897[var3] = new class241();
            class180.field2897[var3].field3760 = arg0.method1296((byte) 91);
            class180.field2897[var3].field3761 = arg0.method1340((byte) -11);
        }
        class72.field1512 = arg0.method1296((byte) 91);
        class104.field1797 = arg0.method1296((byte) 91);
        if (arg1 != -112) {
            return;
        }
        class77.field1540 = arg0.method1296((byte) 91);
        class202.field3294 = new class103[class104.field1797 - (class72.field1512 - 1)];
        for (int var4 = 0; var4 < class77.field1540; var4++) {
            int var5 = arg0.method1296((byte) 91);
            class103 var6 = class202.field3294[var5] = new class103();
            var6.field3351 = arg0.method1317((byte) -118);
            var6.field3345 = arg0.method1346(77);
            var6.field1791 = class72.field1512 + var5;
            var6.field1792 = arg0.method1340((byte) -11);
            var6.field1783 = arg0.method1340((byte) -11);
        }
        class84.field1591 = arg0.method1346(arg1 ^ 0x1A);
        class263.field4089 = true;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(Z)V", line = 65)
    public static void method324(boolean arg0) {
        field817 = null;
        if (arg0) {
            method324(true);
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V", line = 83)
    public class43(int arg0) {
        super(0, true);
        this.field825 = 4096;
        this.field825 = arg0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lbm;I)V", line = 92)
    public static final void method325(class307 arg0, int arg1) {
        if (arg1 == 5) {
            class260.field4067 = arg0;
            field823++;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 105)
    public class43() {
        this(4096);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lbm;II)Loj;", line = 110)
    public static final class283 method326(class307 arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            method324(false);
        }
        field819++;
        return class148.method966((byte) 125, arg1, arg0) ? class24.method200(arg2 - 5) : null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILag;)V", line = 135)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg1 == 0) {
            this.field825 = (arg2.method1317((byte) -85) << 12) / 255;
        }
        if (arg0 != -318) {
            method322(true);
        }
        field822++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)[I", line = 164)
    public final int[] method177(int arg0, int arg1) {
        int[] var3 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            class129.method854(var3, 0, class294.field4489, this.field825);
        }
        int var4 = 93 % ((arg0 - 33) / 36);
        field816++;
        return var3;
    }
}
