import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class15 {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field161;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIILum;ZI)V")
    public static final void method87(int arg0, int arg1, int arg2, class83 arg3, boolean arg4, int arg5) {
        if (arg5 != 19900) {
            field161 = null;
        }
        class439.field6547 = 10000;
        class134.field1992 = arg3;
        class40.field655 = arg0;
        class367.field5417 = arg2;
        class169.field2569 = arg1;
        class386.field5678 = 1;
        field164++;
        class215.field3250 = arg4;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[B[BIBIII)V")
    public static final void method88(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        int var9 = 69 % ((-arg5 - 43) / 49);
        field165++;
        int var10 = -(arg0 >> 2);
        int var11 = -(arg0 & 0x3);
        for (int var12 = -arg7; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg2[var10001] += arg3[arg8++];
                int var15 = arg1++;
                arg2[var15] += arg3[arg8++];
                int var16 = arg1++;
                arg2[var16] += arg3[arg8++];
                int var17 = arg1++;
                arg2[var17] += arg3[arg8++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                var10001 = arg1++;
                arg2[var10001] += arg3[arg8++];
            }
            arg8 += arg6;
            arg1 += arg4;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZZ)Z")
    public static boolean method89(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
    public static void method90(boolean arg0) {
        if (!arg0) {
            field162 = 38;
        }
        field161 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILum;)V")
    public static final void method91(int arg0, class83 arg1) {
        field163++;
        if (arg0 != 4) {
            method90(true);
        }
        class408.field6039 = arg1;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Z")
    public static final boolean method92(int arg0, int arg1) {
        if (arg0 != 9) {
            method92(57, 60);
        }
        field160++;
        return arg1 == 2 || arg1 == 6 || arg1 == 9;
    }
}
