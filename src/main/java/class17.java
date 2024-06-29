import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 extends class404 {

    @OriginalMember(owner = "client!bu", name = "E", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!bu", name = "A", descriptor = "I")
    public static int field231 = 1;

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "Loe;")
    public static class127 field230 = new class127(63, 6);

    @OriginalMember(owner = "client!bu", name = "J", descriptor = "I")
    public static int field238 = 1401;

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!bu", name = "C", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!bu", name = "D", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!bu", name = "G", descriptor = "[Lfq;")
    public static class128[] field236;

    @OriginalMember(owner = "client!bu", name = "I", descriptor = "[[[I")
    public static int[][][] field237;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method90(int arg0, int arg1) {
        if (arg0 >= -47) {
            this.method90(117, -118);
        }
        ++field232;
        int[] var3 = super.field5870.method372(arg1, (byte) 122);
        if (super.field5870.field810) {
            class356.method2179(var3, 0, class431.field6348, this.field235);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "(I)V", line = 31)
    public static final void method92(int arg0) {
        ++field234;
        class113.field1921.method1761(-121);
        if (arg0 != 1401) {
            method93((byte) 63);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V", line = 45)
    public static void method93(byte arg0) {
        if (arg0 > 28) {
            field236 = null;
            field237 = null;
            field230 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILha;I)V", line = 59)
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field233;
        if (~arg2 == -1) {
            this.field235 = (arg1.method257((byte) 69) << 12) / 255;
        }
        if (arg0 != 0) {
            field230 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(I)V", line = 85)
    public class17(int arg0) {
        super(0, true);
        this.field235 = 4096;
        this.field235 = arg0;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V", line = 93)
    public class17() {
        this(4096);
    }
}
