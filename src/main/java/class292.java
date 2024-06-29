import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class292 {

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "[I")
    private int[] field4675;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "[F")
    public static float[] field4677 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Lul;")
    public static class51 field4672 = new class51(64);

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "Z")
    public static boolean field4679 = false;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "[I")
    public static int[] field4680 = new int[14];

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I", line = 7)
    public final int method1993(int arg0, int arg1) {
        field4673++;
        int var3 = (this.field4675.length >> 1) - 1;
        int var4 = var3 & arg1;
        if (arg0 != 1) {
            return 30;
        }
        while (true) {
            int var5 = this.field4675[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4675[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILcg;)V", line = 34)
    public static final void method1994(int arg0, class49 arg1) {
        class228.field3825 = arg1;
        field4674++;
        client.field4375 = class228.field3825.method455(arg0, true);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/String;B[BIII)I", line = 44)
    public static final int method1995(String arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field4671++;
        int var6 = arg5 - arg4;
        if (arg1 <= 34) {
            field4681 = -40;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg2[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg2[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg2[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg2[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg2[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg2[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg2[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg2[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg2[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg2[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg2[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg2[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg2[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg2[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg2[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg2[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg2[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg2[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg2[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg2[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg2[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg2[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg2[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg2[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg2[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg2[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg2[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg2[arg3 + var7] = -97;
            } else {
                arg2[arg3 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 182)
    public static void method1996(int arg0) {
        field4680 = null;
        if (arg0 > -6) {
            field4681 = -74;
        }
        field4677 = null;
        field4672 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ldj;Ltm;I)Lbl;", line = 195)
    public static final class337 method1997(class354 arg0, class79 arg1, int arg2) {
        if (arg2 != -1548176480) {
            field4681 = 116;
        }
        long var3 = ((long) arg0.field5603 << 56) + (long) (arg0.field5604 + (arg0.field5593 + 1 << 16)) + ((long) arg0.field5592 << 32);
        class337 var5 = (class337) arg1.method732(var3, true);
        field4669++;
        if (var5 == null) {
            var5 = new class337(arg0.field5593, (float) arg0.field5604, true, false, arg0.field5592);
            arg1.method725(var3, var5, arg2 + 1548176481);
        }
        return var5;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BLcg;)V", line = 215)
    public static final void method1998(byte arg0, class49 arg1) {
        class257.field4164 = arg1;
        if (arg0 <= -64) {
            field4670++;
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "([I)V", line = 236)
    public class292(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4675 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4675[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4675[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field4675[var5 + var5] = arg0[var4];
            this.field4675[var5 + var5 + 1] = var4++;
        }
    }
}
