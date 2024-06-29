import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class106 extends class361 {

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "Lkn;")
    public static class530 field1408 = new class530("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "F")
    public static float field1401;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "Lvo;")
    public class32 field1404;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "Lpe;")
    public static class441 field1400;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "Ljava/lang/String;")
    public String field1398;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "[I")
    public int[] field1405;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "[I")
    public int[] field1407;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "[Lqi;")
    public class406[] field1397;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "[Ljava/lang/String;")
    public String[] field1394;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)V")
    public static final void method719(int arg0, boolean arg1) {
        if (arg0 != 2) {
            method721(14, null, -43, 79);
        }
        field1402++;
        class183.method1151(class273.field4048, -1, class147.field1956, arg1, class472.field6578);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IFLsm;IIIFIF[BFIFI)V")
    public static final void method720(int arg0, float arg1, class190 arg2, int arg3, int arg4, int arg5, float arg6, int arg7, float arg8, byte[] arg9, float arg10, int arg11, float arg12, int arg13) {
        field1409++;
        int var14 = arg5 * arg7;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg13; var16++) {
            arg2.method1210(arg10 / (float) arg7, arg11, arg7, arg8 / (float) arg5, arg4, arg1 / (float) arg11, arg5, 0, 95, arg12 * 127.0F, var15);
            int var19 = arg3;
            arg8 *= 2.0F;
            arg12 = arg6 * arg12;
            arg1 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg9[var19] = (byte) ((int) ((float) arg9[var19] + var15[var20]));
                var19++;
            }
            arg10 *= 2.0F;
        }
        int var17 = arg3;
        for (int var18 = arg0; var18 < var14; var18++) {
            arg9[var17] = (byte) (arg9[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[BII)I")
    public static final int method721(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != 20458) {
            method722(true, -21, 27, 55, -122, 22, -74, 94);
        }
        field1396++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = class4.field68[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method722(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class392.field5514 <= arg2 && arg7 <= class518.field7624 && arg5 >= class303.field4422 && class353.field5062 >= arg1) {
            class247.method1571(arg3, arg2, false, arg4, arg1, arg7, arg5, arg6);
        } else {
            class346.method2053(arg1, arg7, arg4, 65532, arg2, arg3, arg5, arg6);
        }
        field1403++;
        if (arg0) {
            method723(false);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
    public static void method723(boolean arg0) {
        if (!arg0) {
            field1408 = null;
        }
        field1400 = null;
        field1408 = null;
    }
}
