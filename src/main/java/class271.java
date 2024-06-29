import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class271 extends class119 {

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "Lvq;")
    public static class24 field4012 = new class24(74, 10);

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "Ldq;")
    public static class90 field4014 = new class90(16);

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field4015 = new String[200];

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "Lct;")
    public static class104 field4018;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "[I")
    public static int[] field4016;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "[[Lfc;")
    public static class199[][] field4017;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
    public static void method1856(byte arg0) {
        field4017 = null;
        if (arg0 <= 11) {
            method1857((long[]) null, -55, (int[]) null, 100, 16);
        }
        field4016 = null;
        field4015 = null;
        field4018 = null;
        field4014 = null;
        field4012 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "([JI[III)V")
    public static final void method1857(long[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg1 > arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            int var9 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var9;
            for (int var10 = arg3; var10 < arg1; var10++) {
                if (((long) (var10 & 0x1) + var7) > arg0[var10]) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    int var13 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var13;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var9;
            method1857(arg0, var6 - 1, arg2, arg3, arg4);
            method1857(arg0, arg1, arg2, var6 + 1, arg4);
        }
        if (arg4 != 13973) {
            method1856((byte) -108);
        }
        field4010++;
    }
}
