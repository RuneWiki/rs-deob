import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class473 {

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Luj;")
    public class226 field6625 = new class226();

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Z")
    public boolean field6628 = false;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "[Lbp;")
    public static class69[] field6631 = new class69[16];

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Lbd;")
    public static class464 field6629 = new class464(9, 15);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public int field6626;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public int field6630;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lid;")
    public static class400 field6627;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[[[I")
    public static int[][][] field6624;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2774(boolean arg0, int arg1, int arg2) {
        field6622++;
        if (arg0) {
            field6631 = null;
        }
        return (class205.field2947[1][arg1][arg2] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lld;III)V")
    public static final void method2775(class196 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field6624 = null;
        }
        field6621++;
        if (arg0.field1128 == arg3 && arg3 != -1) {
            class372 var4 = class31.field505.method950(true, arg3);
            int var5 = var4.field5271;
            if (var5 == 1) {
                arg0.field1126 = 0;
                arg0.field1064 = 0;
                arg0.field1110 = arg1;
                arg0.field1071 = 0;
                arg0.field1124 = 1;
                class272.method1706(arg0.field6766, var4, false, (byte) 31, arg0.field6765, arg0.field6746, arg0.field1064);
            }
            if (var5 == 2) {
                arg0.field1071 = 0;
                return;
            }
        } else if (arg3 == -1 || arg0.field1128 == -1 || class31.field505.method950(true, arg3).field5260 >= class31.field505.method950(true, arg0.field1128).field5260) {
            arg0.field1110 = arg1;
            arg0.field1128 = arg3;
            arg0.field1124 = 1;
            arg0.field1064 = 0;
            arg0.field1126 = 0;
            arg0.field1071 = 0;
            arg0.field1138 = arg0.field1142;
            if (arg0.field1128 == -1) {
                return;
            }
            class272.method1706(arg0.field6766, class31.field505.method950(true, arg0.field1128), false, (byte) 31, arg0.field6765, arg0.field6746, arg0.field1064);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lms;B)V")
    public static final void method2776(class363 arg0, byte arg1) {
        field6623++;
        if (class61.field946 == arg0.field5080) {
            if (class2.field21.field407 == null) {
                arg0.field5154 = 0;
                arg0.field5055 = 0;
            } else {
                arg0.field5075 = 150;
                arg0.field5108 = (int) (Math.sin((double) class356.field4972 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field5154 = class327.field4523;
                arg0.field5143 = 5;
                arg0.field5055 = class161.method973(class2.field21.field407, -32435);
                arg0.field5152 = class2.field21.field1088;
                arg0.field5045 = 0;
                arg0.field5172 = class2.field21.field1062;
                arg0.field5121 = class2.field21.field1089;
            }
        } else if (arg1 > -65) {
            field6631 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method2777(byte arg0) {
        field6627 = null;
        field6631 = null;
        field6624 = null;
        field6629 = null;
        int var1 = 53 / ((arg0 - 56) / 53);
    }
}
