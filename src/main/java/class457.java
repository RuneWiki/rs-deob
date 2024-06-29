import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class457 {

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "[I")
    public static int[] field6635 = new int[3];

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "[I")
    public static int[] field6638 = new int[4096];

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "[Lpba;")
    public static class195[] field6636 = new class195[2048];

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "[I")
    public static int[] field6639 = new int[32];

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IILtw;I)J", line = 5)
    public static final long method2794(int arg0, int arg1, class523 arg2, int arg3) {
        if (arg3 != -817460050) {
            return -30L;
        }
        field6632++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class595 var8 = class576.field8167.method3074(0, arg2.method87(2836));
        long var9 = (long) (arg2.method85((byte) -72) | 0x10000 << 14 | arg0 << 7 | arg1 | arg2.method98(arg3 ^ 0x30B95CF0) << 20);
        if (var8.field8426 == 0) {
            var9 |= var6;
        }
        if (var8.field8352 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg2.method87(2836) << 32;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIII)I", line = 33)
    public static final int method2795(int arg0, int arg1, int arg2, int arg3) {
        field6633++;
        if (arg0 == arg3) {
            return arg3;
        }
        if (arg2 != 3) {
            field6635 = null;
        }
        int var4 = 128 - arg1;
        int var5 = (arg0 & 0x7F) * arg1 + (arg3 & 0x7F) * var4 >> 7;
        int var6 = (arg0 & 0x380) * arg1 + (arg3 & 0x380) * var4 >> 7;
        int var7 = (arg3 & 0xFC00) * var4 + ((arg0 & 0xFC00) * arg1) >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)V", line = 57)
    public static final void method2796(int arg0, int arg1) {
        field6637++;
        if (~class442.field6421 == arg1) {
            class208.field3480.method2332(89, arg0);
        } else {
            class540.field7712 = arg0;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V", line = 72)
    public static void method2797(int arg0) {
        field6636 = null;
        field6638 = null;
        field6639 = null;
        int var1 = -15 % ((-arg0 - 31) / 57);
        field6635 = null;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)V", line = 84)
    public static final void method2798(int arg0) {
        if (class121.field1865 != null) {
            for (int var1 = 0; var1 < class121.field1865.length; var1++) {
                for (int var2 = 0; var2 < class121.field1865[var1].length; var2++) {
                    class121.field1865[var1][var2] = class290.field4471;
                }
            }
        }
        field6634++;
        if (arg0 >= -29) {
            field6639 = null;
        }
    }
}
