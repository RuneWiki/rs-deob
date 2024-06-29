import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class180 {

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "J")
    public long field2737 = 0L;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2727 = "Opened title screen";

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public int field2731;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public int field2732;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public int field2736;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lsk;")
    public class202 field2729;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lsk;")
    public class202 field2735;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[Z")
    public static boolean[] field2728;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V")
    public static final void method1147(int arg0, boolean arg1) {
        class15.field267.method943(arg0, arg1);
        field2726++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method1148(int arg0) {
        if (arg0 != 1) {
            method1148(-18);
        }
        field2727 = null;
        field2728 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[III[I)V")
    public static final void method1149(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        field2738++;
        if (arg0 > arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg4[var5];
            arg4[var5] = arg4[arg0];
            int var7 = arg3;
            arg4[arg0] = var6;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (arg4[var9] < ((var9 & 0x1) + var6)) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7++] = var11;
                }
            }
            arg4[arg0] = arg4[var7];
            arg4[var7] = var6;
            arg1[arg0] = arg1[var7];
            arg1[var7] = var8;
            method1149(var7 - 1, arg1, -51, arg3, arg4);
            method1149(arg0, arg1, -79, var7 + 1, arg4);
        }
        int var12 = -119 / ((arg2 - 35) / 58);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILnh;)V")
    public static final void method1150(int arg0, class305 arg1) {
        class92.field1350 = arg1;
        if (arg0 != 1) {
            field2739 = 98;
        }
        field2733++;
    }
}
