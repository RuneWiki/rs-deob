import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class371 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "[I")
    public static int[] field5509 = new int[5];

    @OriginalMember(owner = "client!je", name = "a", descriptor = "F")
    public static float field5507;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lha;")
    public class54 field5512;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lda;")
    public class55 field5508;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method2348(int arg0) {
        field5509 = null;
        int var1 = -122 % ((arg0 + 59) / 51);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([Ljava/lang/String;II[SI)V")
    public static final void method2349(String[] arg0, int arg1, int arg2, short[] arg3, int arg4) {
        field5510++;
        if (arg2 > arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var8;
            for (int var9 = arg1; var9 < arg2; var9++) {
                if (var7 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].compareTo(var7)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var8;
            method2349(arg0, arg1, var6 - 1, arg3, 32228);
            method2349(arg0, var6 + 1, arg2, arg3, 32228);
        }
        if (arg4 != 32228) {
            field5507 = -0.5231102F;
        }
    }
}
