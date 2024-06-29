import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class331 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
    public static int[] field5087 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field5086 = -1;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field5090 = 0;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[I")
    public static int[] field5091;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLrn;)Z", line = 25)
    public static final boolean method2337(byte arg0, class18 arg1) {
        if (arg0 > -75) {
            method2338((byte) -111);
        }
        field5085++;
        return arg1.method199(2209, class133.field2229);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 46)
    public static void method2338(byte arg0) {
        field5087 = null;
        if (arg0 <= 78) {
            method2337((byte) 42, (class18) null);
        }
        field5091 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([Ljava/lang/Object;I[JII)V", line = 58)
    public static final void method2339(Object[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        if (arg3 > arg1) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg1;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var9;
            for (int var10 = arg1; var10 < arg3; var10++) {
                if ((var7 + ((long) (var10 & 0x1))) > arg2[var10]) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var13 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var13;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var9;
            method2339(arg0, arg1, arg2, var6 - 1, arg4);
            method2339(arg0, var6 + 1, arg2, arg3, arg4 ^ 0x0);
        }
        if (arg4 != 27781) {
            field5087 = (int[]) null;
        }
        field5089++;
    }
}
