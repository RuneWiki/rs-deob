import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class125 {

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "[B")
    public static byte[] field1665 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "Lkg;")
    public static class179 field1667 = new class179(58, 1);

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field1668;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "[[[Lev;")
    public static class490[][][] field1664;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V", line = 3)
    public static final void method877(int arg0, int arg1) {
        field1663++;
        for (class383 var2 = class412.field5876.method2021(arg1 + 4582); var2 != null; var2 = class412.field5876.method2017(110)) {
            if ((var2.field5043 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method2165(16225);
            }
        }
        if (arg1 != -4478) {
            field1670 = -75;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V", line = 27)
    public static final void method878(byte arg0) {
        class290.field3702.method2642(arg0 ^ 0x45);
        field1666++;
        if (arg0 != 69) {
            method880(null, -80, -91, -128, null);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V", line = 43)
    public static void method879(int arg0) {
        field1667 = null;
        field1665 = null;
        if (arg0 == 27906) {
            field1668 = null;
            field1664 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lba;III[Z)Z", line = 60)
    public static final boolean method880(class264 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class520.field7520 != class140.field1808) {
            int var6 = class531.field7811[arg1].method396(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class143 var8 = class531.field7811[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method396(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method391(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method390(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V", line = 96)
    public static final void method881(byte arg0) {
        if (arg0 != -4) {
            method877(62, 96);
        }
        class290.field3702.method2640(arg0 ^ 0xFFFFFFA5);
        field1669++;
    }
}
