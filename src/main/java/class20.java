import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class20 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Lob;")
    public static class141 field339 = class175.method1195(40, "huffman");

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Lob;")
    public static class141 field343 = class175.method1195(40, "gr-Un:");

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field344 = 0;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLra;)Z")
    public static final boolean method122(byte arg0, class170 arg1) {
        field342++;
        if (arg0 > -31) {
            return false;
        }
        if (class97.field1923) {
            if (class26.method180(arg1, 18125) != 0) {
                return false;
            }
            if (arg1.field3392 == 0) {
                return false;
            }
        }
        return arg1.field3292;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[Lob;)Lob;")
    public static final class141 method123(int arg0, int arg1, int arg2, class141[] arg3) {
        field345++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg3[arg1 + var5] == null) {
                arg3[arg1 + var5] = class7.field118;
            }
            var4 += arg3[arg1 + var5].field2705;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg2; var8++) {
            class141 var11 = arg3[arg1 + var8];
            class149.method1039(var11.field2701, 0, var6, var7, var11.field2705);
            var7 += var11.field2705;
        }
        class141 var9 = new class141();
        var9.field2705 = var4;
        var9.field2701 = var6;
        int var10 = 19 % ((arg0 + 13) / 51);
        return var9;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method124(int arg0) {
        if (arg0 == -18944) {
            field339 = null;
            field343 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V")
    public static final void method125(byte arg0, int arg1) {
        field340++;
        if (arg0 != 120) {
            field343 = null;
        }
        class136 var2 = (class136) class96.field1894.method792((long) arg1, 22346);
        if (var2 != null) {
            var2.method1392(arg0 + 8);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[[[I)V")
    public static final void method126(int arg0, int arg1, int arg2, int[][][] arg3) {
        class108.field2090 = arg0;
        class163.field3158 = arg1;
        class220.field4172 = arg2;
        class131.field2506 = new class153[arg0][arg1][arg2];
        class141.field2734 = new int[arg0][arg1 + 1][arg2 + 1];
        class110.field2119 = arg3;
        class166.method1145();
    }
}
