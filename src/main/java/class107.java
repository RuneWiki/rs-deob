import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class107 extends class30 {

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "[[Z")
    public static boolean[][] field1490 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field1494 = 0;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)I", line = 4)
    private final int method778(int arg0, int arg1, int arg2) {
        ++field1489;
        int var4 = arg0 - -(arg2 * 57);
        int var5 = var4 ^ var4 << 1;
        int var6 = 97 / ((-28 - arg1) / 51);
        return 4096 - ((var5 * 15731 * var5 - -789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLvda;)Z", line = 27)
    public static final boolean method779(byte arg0, class165 arg1) {
        ++field1492;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field2397) {
            return false;
        } else if (!arg1.method1158(class510.field6978, 122)) {
            return false;
        } else if (class109.field1504.method970((byte) 89, (long) arg1.field2400) != null) {
            return false;
        } else {
            if (arg0 != 13) {
                method780(-79);
            }
            return class207.field2905.method970((byte) 89, (long) arg1.field2409) == null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V", line = 56)
    public static void method780(int arg0) {
        field1490 = null;
        int var1 = 56 / ((60 - arg0) / 46);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[I", line = 67)
    public final int[] method48(int arg0, int arg1) {
        ++field1491;
        if (arg0 != 1) {
            return null;
        } else {
            int[] var3 = super.field374.method3664(arg1, (byte) 8);
            if (super.field374.field9032) {
                int var4 = class430.field6016[arg1];
                for (int var5 = 0; ~var5 > ~class31.field399; ++var5) {
                    var3[var5] = this.method778(class48.field568[var5], class324.method1944(arg0, -106), var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 104)
    public class107() {
        super(0, true);
    }
}
