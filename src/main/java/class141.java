import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class141 {

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lau;")
    private class692 field2036 = new class692(256);

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lfa;")
    private class615 field2044;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Lum;")
    private class528 field2043;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "[I")
    public static int[] field2037 = new int[] { 25000, 2000 };

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "[Lcu;")
    public static class268[] field2038 = new class268[50];

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "J")
    public static long field2040;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "Lke;")
    public static class247 field2041;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lfo;")
    public static class606 field2042;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 7)
    public static void method989(int arg0) {
        field2041 = null;
        field2042 = null;
        if (arg0 == -1) {
            field2037 = null;
            field2038 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lfj;", line = 23)
    public final class75 method990(int arg0, int arg1) {
        field2033++;
        Object var3 = this.field2036.method3901((long) arg1, -118);
        if (var3 != null) {
            return (class75) var3;
        } else if (this.field2044.method956(arg1, 15925)) {
            if (arg0 != 5459) {
                field2038 = null;
            }
            class457 var4 = this.field2044.method955(-1330, arg1);
            int var5 = var4.field6610 ? 64 : this.field2043.field7698;
            class75 var7;
            if (var4.field6587 && this.field2043.method705()) {
                float[] var6 = this.field2044.method951(var5, false, 0.7F, arg1, var5, arg0 + 4475);
                var7 = this.field2043.method3008(var5, var5, 0, var6, var4.field6605 != 0, class564.field8245);
            } else {
                int[] var8 = !var4.field6594 && class572.method3282(1, var4.field6600) ? this.field2044.method958(0.7F, var5, -17786, true, var5, arg1) : this.field2044.method957(var5, arg0 ^ 0xFFFFE21D, var5, false, 0.7F, arg1);
                var7 = this.field2043.method3035(var5, var5, (byte) -50, var4.field6605 != 0, var8);
            }
            var7.method432(var4.field6588, var4.field6598, (byte) 88);
            this.field2036.method3894(var7, (byte) 60, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[BII[BIIII)V", line = 71)
    public static final void method991(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field2032++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg1[var10001] = (byte) (arg1[var10001] - arg4[arg5++]);
                int var14 = arg0++;
                arg1[var14] = (byte) (arg1[var14] - arg4[arg5++]);
                int var15 = arg0++;
                arg1[var15] = (byte) (arg1[var15] - arg4[arg5++]);
                int var16 = arg0++;
                arg1[var16] = (byte) (arg1[var16] - arg4[arg5++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg1[var10001] = (byte) (arg1[var10001] - arg4[arg5++]);
            }
            arg0 += arg2;
            arg5 += arg3;
        }
        if (arg8 != -31619) {
            method989(-48);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V", line = 115)
    public final void method992(boolean arg0) {
        field2039++;
        this.field2036.method3900(5, 0);
        if (!arg0) {
            field2040 = 103L;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V", line = 126)
    public final void method993(boolean arg0) {
        if (arg0) {
            this.method990(112, -32);
        }
        this.field2036.method3890(-1);
        field2034++;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lum;Lfa;)V", line = 144)
    public class141(class528 arg0, class615 arg1) {
        this.field2044 = arg1;
        this.field2043 = arg0;
    }
}
