import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class41 extends class154 {

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "I")
    public static int field650 = 0;

    @OriginalMember(owner = "client!ej", name = "bb", descriptor = "[I")
    public static int[] field654 = new int[] { 0, 0, -1, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 7, 6, 0, -1, 0, 0, 0, 6, 4, 24, 0, 8, 1, 0, 0, 0, 0, 15, 0, 0, 6, -1, 0, 0, 0, 0, 0, 7, 0, -1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 15, 0, 0, 0, 0, 0, 10, 0, 0, 2, -1, 0, 3, 7, 0, -1, 20, 0, 0, 4, 1, 0, 0, 0, 10, 3, 0, 0, 2, 6, 8, 0, 0, -2, 0, 0, 0, 0, 0, 12, 0, 0, 0, 9, 0, 0, 5, 0, 0, 0, 3, 0, 0, 0, 0, 5, 0, 0, 0, -1, -2, 0, 0, 0, 4, -2, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 0, 10, 9, 0, -2, -2, 0, 0, 0, 6, 0, 0, -1, 1, 0, -2, 0, 7, 0, 1, 0, 0, 0, 5, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 6, 0, 0, 0, 6, 0, 0, 0, 8, 0, 0, 0, -2, 0, -2, 6, 5, 8, 14, 4, -1, 0, 0, 0, 2, 0, 0, 0, -2, 2, -2, 8, 4, -2, 0, 0, 6, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, -1, 10, 0, 0, -1, 10, 0, -2, 0, 0, 5, 0, 0, 0, 0, 0, -2, 3, 8, 0, 0, -1, 2, 0, 0, 0, 0, 3, 0, -1, 5, 0, 0, 12, 0, 0 };

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "I")
    public static int field651 = 0;

    @OriginalMember(owner = "client!ej", name = "eb", descriptor = "Lmg;")
    public static class53 field657 = new class53(16);

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ej", name = "ab", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!ej", name = "db", descriptor = "Lwi;")
    public static class178 field656;

    @OriginalMember(owner = "client!ej", name = "cb", descriptor = "[S")
    public static short[] field655;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(B)V")
    public static void method275(byte arg0) {
        field656 = null;
        if (arg0 >= -25) {
            method275((byte) 11);
        }
        field657 = null;
        field654 = null;
        field655 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BII)I")
    public static final int method276(byte arg0, int arg1, int arg2) {
        ++field652;
        class100 var3 = (class100) class166.field2750.method992((byte) 125, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (~arg1 == 0) {
            return 0;
        } else {
            int var4 = 0;
            if (arg0 != 43) {
                method275((byte) 73);
            }
            for (int var5 = 0; var3.field1553.length > var5; ++var5) {
                if (var3.field1552[var5] == arg1) {
                    var4 += var3.field1553[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class41() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            class54.method350(var3, 0, class227.field3898, class62.field1029[arg0]);
        }
        ++field653;
        if (arg1 != 1075962732) {
            this.method143(-95, -5);
        }
        return var3;
    }
}
