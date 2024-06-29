import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class109 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "[[I")
    public static int[][] field1409 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1411 = 0;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lra;")
    public static class361 field1414 = new class361(75, 12);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[I")
    public static int[] field1416;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "[J")
    public static long[] field1412;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 9)
    public static void method837(int arg0) {
        field1414 = null;
        field1409 = null;
        field1416 = null;
        if (arg0 > 119) {
            field1412 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II[FIIFIIIIF)V", line = 22)
    public static final void method838(int arg0, int arg1, float[] arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, float arg10) {
        int var11 = arg4 - arg0;
        int var12 = arg9 - arg7;
        field1413++;
        int var13 = arg3 - arg8;
        float var14 = arg2[arg6] * (float) var11 + arg2[1] * (float) var12 + arg2[0] * (float) var13;
        float var15 = arg2[5] * (float) var11 + arg2[3] * (float) var13 + arg2[4] * (float) var12;
        float var16 = arg2[8] * (float) var11 + arg2[6] * (float) var13 + arg2[7] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg10 != 1.0F) {
            var17 = arg10 * var17;
        }
        float var18 = var15 + arg5 + 0.5F;
        if (arg1 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg1 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg1 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class512.field6708 = var18;
        class385.field4918 = var17;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIB)Z", line = 75)
    public static final boolean method839(int arg0, int arg1, byte arg2) {
        if (arg2 != 90) {
            field1409 = null;
        }
        field1410++;
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 88)
    public static final void method840(byte arg0) {
        if (class556.field7274 < 0) {
            class693.field9478 = -1;
            class82.field1112 = -1;
            class556.field7274 = 0;
        }
        if (arg0 >= -25) {
            method839(65, 103, (byte) 106);
        }
        field1415++;
        if (class556.field7274 > class706.field9861) {
            class693.field9478 = -1;
            class82.field1112 = -1;
            class556.field7274 = class706.field9861;
        }
        if (class527.field6862 < 0) {
            class82.field1112 = -1;
            class693.field9478 = -1;
            class527.field6862 = 0;
        }
        if (class706.field9851 < class527.field6862) {
            class527.field6862 = class706.field9851;
            class82.field1112 = -1;
            class693.field9478 = -1;
        }
    }
}
