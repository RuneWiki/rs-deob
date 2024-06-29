import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class25 {

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "Lwl;")
    public static class452 field320 = new class452(79, 4);

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field322 = 0;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "[Lug;")
    public static class291[] field323 = new class291[16];

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "Lpf;")
    public static class425 field321 = new class425(7, -1);

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "[I")
    public static int[] field326 = new int[4096];

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field325 = 2;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "Liq;")
    public static class134 field324;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[J[II)V")
    public static final void method153(int arg0, int arg1, long[] arg2, int[] arg3, int arg4) {
        if (arg0 != -26819) {
            field320 = null;
        }
        if (arg1 > arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var9;
            for (int var10 = arg4; var10 < arg1; var10++) {
                if ((var7 + ((long) (var10 & 0x1))) > arg2[var10]) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var13 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var13;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var9;
            method153(arg0, var6 - 1, arg2, arg3, arg4);
            method153(-26819, arg1, arg2, arg3, var6 + 1);
        }
        field319++;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method154(String arg0, byte arg1) {
        int var2 = -37 % ((64 - arg1) / 57);
        field318++;
        return class145.method893(arg0, 10, (byte) 109, true);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
    public static void method155(int arg0) {
        field326 = null;
        field321 = null;
        field323 = null;
        field320 = null;
        field324 = null;
        int var1 = 51 % ((-arg0 - 54) / 37);
    }
}
