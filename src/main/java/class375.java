import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class375 {

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "Lpd;")
    public static class259 field5682 = new class259(1);

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "[I")
    public static int[] field5687 = new int[2];

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "[[[Lffa;")
    public static class186[][][] field5686;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZZIZI)V", line = 4)
    public static final void method2427(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        class665.method3824(class124.field1669.length - 1, 0, arg3, 0, arg4, arg2, arg0);
        if (arg1) {
            method2427(true, false, 103, false, 23);
        }
        field5683++;
        class193.field2932 = 0;
        class60.field862 = null;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIILjava/lang/String;B[B)I", line = 23)
    public static final int method2428(int arg0, int arg1, int arg2, String arg3, byte arg4, byte[] arg5) {
        field5680++;
        int var6 = arg0 - arg2;
        int var7 = 0;
        int var8 = -88 / ((15 - arg4) / 51);
        while (var7 < var6) {
            char var9 = arg3.charAt(arg2 + var7);
            if (!(var9 <= '\u0000' || var9 >= '\u0080') || !(var9 < ' ' || var9 > 'ÿ')) {
                arg5[arg1 + var7] = (byte) var9;
            } else if (var9 == '€') {
                arg5[arg1 + var7] = -128;
            } else if (var9 == '‚') {
                arg5[arg1 + var7] = -126;
            } else if (var9 == 'ƒ') {
                arg5[arg1 + var7] = -125;
            } else if (var9 == '„') {
                arg5[arg1 + var7] = -124;
            } else if (var9 == '…') {
                arg5[arg1 + var7] = -123;
            } else if (var9 == '†') {
                arg5[arg1 + var7] = -122;
            } else if (var9 == '‡') {
                arg5[arg1 + var7] = -121;
            } else if (var9 == 'ˆ') {
                arg5[arg1 + var7] = -120;
            } else if (var9 == '‰') {
                arg5[arg1 + var7] = -119;
            } else if (var9 == 'Š') {
                arg5[arg1 + var7] = -118;
            } else if (var9 == '‹') {
                arg5[arg1 + var7] = -117;
            } else if (var9 == 'Œ') {
                arg5[arg1 + var7] = -116;
            } else if (var9 == 'Ž') {
                arg5[arg1 + var7] = -114;
            } else if (var9 == '‘') {
                arg5[arg1 + var7] = -111;
            } else if (var9 == '’') {
                arg5[arg1 + var7] = -110;
            } else if (var9 == '“') {
                arg5[arg1 + var7] = -109;
            } else if (var9 == '”') {
                arg5[arg1 + var7] = -108;
            } else if (var9 == '•') {
                arg5[arg1 + var7] = -107;
            } else if (var9 == '–') {
                arg5[arg1 + var7] = -106;
            } else if (var9 == '—') {
                arg5[arg1 + var7] = -105;
            } else if (var9 == '˜') {
                arg5[arg1 + var7] = -104;
            } else if (var9 == '™') {
                arg5[arg1 + var7] = -103;
            } else if (var9 == 'š') {
                arg5[arg1 + var7] = -102;
            } else if (var9 == '›') {
                arg5[arg1 + var7] = -101;
            } else if (var9 == 'œ') {
                arg5[arg1 + var7] = -100;
            } else if (var9 == 'ž') {
                arg5[arg1 + var7] = -98;
            } else if (var9 == 'Ÿ') {
                arg5[arg1 + var7] = -97;
            } else {
                arg5[arg1 + var7] = 63;
            }
            var7++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V", line = 158)
    public static void method2429(int arg0) {
        field5687 = null;
        int var1 = 100 / ((-arg0 - 40) / 48);
        field5682 = null;
        field5686 = null;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V", line = 177)
    public static final void method2430(byte arg0) {
        class184.field2813.method3((byte) -88);
        field5684++;
        for (int var1 = 0; var1 < 32; var1++) {
            class458.field6750[var1] = 0L;
        }
        if (arg0 <= -86) {
            for (int var2 = 0; var2 < 32; var2++) {
                class742.field10409[var2] = 0L;
            }
            class272.field3876 = 0;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II[BI)[B", line = 203)
    public static final byte[] method2431(int arg0, int arg1, byte[] arg2, int arg3) {
        field5685++;
        if (arg3 == 137) {
            byte[] var4 = new byte[arg1];
            class319.method2022(arg2, arg0, var4, 0, arg1);
            return var4;
        } else {
            return null;
        }
    }
}
