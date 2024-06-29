import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class46 {

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "[[I")
    public static int[][] field587 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "[I")
    public static int[] field591 = new int[8];

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "Lfk;")
    public static class23 field588;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZBII)I", line = 3)
    public static final int method378(boolean arg0, byte arg1, int arg2, int arg3) {
        field592++;
        class57 var4 = class2.method5(arg0, arg2, true);
        if (var4 == null) {
            return 0;
        }
        if (arg1 != 95) {
            method382(115, 42L, (int[]) null, 100);
        }
        if (arg3 == -1) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field739.length; var6++) {
            if (var4.field741[var6] == arg3) {
                var5 += var4.field739[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;IIZJIILjava/lang/String;)V", line = 41)
    public static final void method379(String arg0, int arg1, int arg2, boolean arg3, long arg4, int arg5, int arg6, String arg7) {
        field593++;
        if (class317.field4324 || class149.field2171 >= 500) {
            return;
        }
        int var9 = arg6 == -1 ? class156.field2225 : arg6;
        if (arg3) {
            class429 var10 = new class429(arg0, arg7, var9, arg1, arg4, arg2, arg5);
            class451.field6491.method1162(117, var10);
            class149.field2171++;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 75)
    public static void method380(byte arg0) {
        field588 = null;
        int var1 = -46 % ((60 - arg0) / 42);
        field587 = null;
        field591 = null;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)V", line = 88)
    public static final void method381(int arg0, byte arg1) {
        field589++;
        class26 var2 = class217.method1445(true, arg0, 10);
        var2.method164(12);
        if (arg1 >= -83) {
            method379((String) null, 101, -14, true, 25L, 61, -17, (String) null);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IJ[II)Ljava/lang/String;", line = 104)
    public static final String method382(int arg0, long arg1, int[] arg2, int arg3) {
        field594++;
        if (class152.field2186 != null) {
            String var5 = class152.field2186.method42(arg0, 65, arg2, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg3 != 13564) {
            method378(false, (byte) 83, -111, -27);
        }
        return Long.toString(arg1);
    }
}
