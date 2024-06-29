import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class557 {

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field7953 = 0;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public static int field7955 = 0;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field7949;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "[[I")
    public static int[][] field7954;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "[[[S")
    public static short[][][] field7952;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
    public static void method3155(int arg0) {
        field7954 = null;
        if (arg0 > 44) {
            field7952 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIILdba;Lpa;IIIIII)V")
    public static final void method3156(int arg0, int arg1, int arg2, int arg3, class240 arg4, class648 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg11 != 1) {
            return;
        }
        class507.field7279 = arg9;
        class629.field8862 = arg5;
        class602.field8469 = arg1;
        class8.field85 = null;
        class124.field1390 = arg0;
        class689.field9701 = arg8;
        class564.field8064 = arg4;
        class175.field1958 = arg7;
        class103.field1110 = null;
        class631.field8880 = arg6;
        class42.field413 = arg3;
        class460.field6530 = null;
        field7951++;
        class46.field477 = arg2;
        class397.field5365 = arg10;
        class66.method351(0);
        class474.field6834 = true;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)J")
    public static final synchronized long method3157(int arg0) {
        field7949++;
        long var1 = System.currentTimeMillis();
        if (class243.field3006 > var1) {
            class626.field8848 += class243.field3006 - var1;
        }
        if (arg0 > -49) {
            method3156(-1, 81, 95, -127, null, null, 121, 103, -6, -62, -38, -103);
        }
        class243.field3006 = var1;
        return class626.field8848 + var1;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IFIFF)F")
    public static final float method3158(int arg0, float arg1, int arg2, float arg3, float arg4) {
        field7950++;
        float[] var5 = class124.field1392[arg2];
        if (arg0 != 1) {
            field7954 = null;
        }
        return var5[2] * arg3 + var5[1] * arg1 + var5[0] * arg4;
    }
}
