import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class521 {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lfja;")
    public static class783 field7062 = new class783(63, 5);

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[I")
    public static int[] field7070 = new int[1];

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "F")
    public static float field7071 = 1.0F;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public int field7061;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lbda;")
    public class533 field7063;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
    public static int[] field7065;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "[I")
    public int[] field7067;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[Lnf;")
    public static class604[] field7068;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method2961(int arg0) {
        if (arg0 != 11920) {
            field7071 = 1.089521F;
        }
        field7062 = null;
        field7070 = null;
        field7065 = null;
        field7068 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lfl;BBII)V")
    public static final void method2962(class771 arg0, byte arg1, byte arg2, int arg3, int arg4) {
        field7066++;
        int var5 = arg0.field5304[0];
        int var6 = arg0.field5308[0];
        if (var5 < 0 || var5 >= class483.field6515 || var6 < 0 || var6 >= class65.field926 || arg4 < 0 || arg4 >= class483.field6515 || arg3 < 0 || class65.field926 <= arg3) {
            return;
        }
        int var7 = class260.method1689(0, -64, arg0.method2342((byte) -14), -4, arg3, var6, class711.field9798[arg0.field7391], true, arg4, class203.field3066, 0, class482.field6505, 0, var5, 0);
        if (var7 >= 1 && var7 <= 3) {
            int var8 = 8 / ((arg2 + 8) / 55);
            for (int var9 = 0; var9 < var7 - 1; var9++) {
                arg0.method4244((byte) -51, arg1, class203.field3066[var9], class482.field6505[var9]);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z[[F[[S)[[S")
    public static final short[][] method2963(boolean arg0, float[][] arg1, short[][] arg2) {
        field7064++;
        int var3 = 0;
        if (!arg0) {
            return null;
        }
        while (var3 < arg1.length) {
            for (int var4 = 0; var4 < arg2[var3].length; var4++) {
                arg2[var3][var4] = (short) ((int) (arg1[var3][var4] * 16383.0F));
            }
            var3++;
        }
        return arg2;
    }
}
