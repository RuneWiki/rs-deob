import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class206 extends class117 {

    @OriginalMember(owner = "client!da", name = "l", descriptor = "[I")
    public int[] field3008 = new int[] { -1 };

    @OriginalMember(owner = "client!da", name = "r", descriptor = "[I")
    public int[] field3014 = new int[] { 0 };

    @OriginalMember(owner = "client!da", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3020 = "flash2:";

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "[I")
    public static int[] field3015;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[[B")
    public static byte[][] field3017;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V", line = 9)
    public static final void method1504(boolean arg0, int arg1) {
        field3013++;
        if (arg1 != 16555) {
            method1507((byte) 88);
        }
        class222.method1630(class134.field1951, class68.field993, class323.field4858, class172.field2490);
        class222.method1621(class358.field5480, class177.field2551, arg0);
        class222.method1625((float) class73.field1073, (float) class261.field3940, (float) class203.field2995);
        class222.method1623();
        class13.field198 = class86.field1222;
        class201.field2955 = class126.field1825;
        class13.field196 = class259.field3863;
        class13.field195 = class72.field1060;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([BIII)I", line = 30)
    public static final int method1505(byte[] arg0, int arg1, int arg2, int arg3) {
        field3012++;
        if (arg2 != -6399) {
            field3015 = (int[]) null;
        }
        int var4 = -1;
        for (int var5 = arg3; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class332.field5057[(arg0[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Luo;", line = 60)
    public static final class316 method1506(int arg0, int arg1) {
        field3010++;
        if (arg1 >= -20) {
            field3017 = (byte[][]) ((byte[][]) null);
        }
        return class178.field2556 && class22.field338 <= arg0 && arg0 <= class232.field3504 ? class338.field5248[arg0 - class22.field338] : null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V", line = 84)
    public static void method1507(byte arg0) {
        field3020 = null;
        field3015 = null;
        field3017 = (byte[][]) null;
        if (arg0 > -107) {
            field3020 = (String) null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/lang/String;I[SIB)V", line = 99)
    public static final void method1508(String[] arg0, int arg1, short[] arg2, int arg3, byte arg4) {
        field3018++;
        if (arg4 != 76 || arg3 >= arg1) {
            return;
        }
        int var5 = arg3;
        int var6 = (arg1 + arg3) / 2;
        String var7 = arg0[var6];
        arg0[var6] = arg0[arg1];
        arg0[arg1] = var7;
        short var8 = arg2[var6];
        arg2[var6] = arg2[arg1];
        arg2[arg1] = var8;
        for (int var9 = arg3; var9 < arg1; var9++) {
            if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg0[var9];
                arg0[var9] = arg0[var5];
                arg0[var5] = var10;
                short var11 = arg2[var9];
                arg2[var9] = arg2[var5];
                arg2[var5++] = var11;
            }
        }
        arg0[arg1] = arg0[var5];
        arg0[var5] = var7;
        arg2[arg1] = arg2[var5];
        arg2[var5] = var8;
        method1508(arg0, var5 - 1, arg2, arg3, (byte) 76);
        method1508(arg0, arg1, arg2, var5 + 1, (byte) 76);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V", line = 153)
    public static final void method1509(int arg0, int arg1, int arg2, int arg3) {
        class95 var4 = class227.method1699(9, -1855723168, arg2);
        var4.method738((byte) 59);
        if (arg0 >= -56) {
            field3017 = (byte[][]) ((byte[][]) null);
        }
        var4.field1328 = arg3;
        var4.field1331 = arg1;
        field3011++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)I", line = 167)
    public static final int method1510(int arg0, boolean arg1) {
        if (arg1) {
            field3019++;
            return arg0 >> 11 & 0x7F;
        } else {
            return -37;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I", line = 179)
    public static final int method1511(int arg0, int arg1) {
        field3016++;
        if (arg0 != 255) {
            method1504(false, 97);
        }
        return arg1 & 0xFF;
    }
}
