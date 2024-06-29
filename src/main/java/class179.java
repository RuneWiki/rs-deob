import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public abstract class class179 {

    @OriginalMember(owner = "client!up", name = "b", descriptor = "Lki;")
    public static class498 field2633 = new class498(4, -1);

    @OriginalMember(owner = "client!up", name = "c", descriptor = "Lki;")
    public static class498 field2634 = new class498(11, 16);

    @OriginalMember(owner = "client!up", name = "d", descriptor = "Lri;")
    public static class73 field2635 = new class73(11, -2);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "J")
    public static long field2636;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "Lf;")
    public static class529 field2637;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
    public static void method1219(byte arg0) {
        field2634 = null;
        field2635 = null;
        field2633 = null;
        field2637 = null;
        if (arg0 > -20) {
            method1220(-111, -17, null, null, 77);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILgm;)Lgm;")
    public abstract class79 method1000(int arg0, class79 arg1);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II[S[Ljava/lang/String;I)V")
    public static final void method1220(int arg0, int arg1, short[] arg2, String[] arg3, int arg4) {
        field2632++;
        if (arg1 < arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg1; var9 < arg4; var9++) {
                if (var7 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].compareTo(var7)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method1220(117, arg1, arg2, arg3, var6 - 1);
            method1220(42, var6 + 1, arg2, arg3, arg4);
        }
        if (arg0 <= 14) {
            method1220(-108, -69, null, null, 66);
        }
    }
}
