import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class285 extends class276 {

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "Llo;")
    public static class306 field4652 = new class306("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!bv", name = "F", descriptor = "Z")
    public static boolean field4669 = false;

    @OriginalMember(owner = "client!bv", name = "M", descriptor = "[I")
    public static int[] field4675 = new int[13];

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public int field4651;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
    public int field4653;

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "I")
    public int field4654;

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
    public int field4656;

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
    public int field4658;

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "I")
    public int field4659;

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "I")
    public int field4662;

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "I")
    public int field4663;

    @OriginalMember(owner = "client!bv", name = "A", descriptor = "I")
    public int field4664;

    @OriginalMember(owner = "client!bv", name = "B", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!bv", name = "C", descriptor = "I")
    public int field4666;

    @OriginalMember(owner = "client!bv", name = "D", descriptor = "I")
    public int field4667;

    @OriginalMember(owner = "client!bv", name = "E", descriptor = "I")
    public int field4668;

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "I")
    public int field4670;

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
    public int field4671;

    @OriginalMember(owner = "client!bv", name = "K", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!bv", name = "N", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!bv", name = "O", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!bv", name = "P", descriptor = "I")
    public int field4678;

    @OriginalMember(owner = "client!bv", name = "R", descriptor = "I")
    public int field4680;

    @OriginalMember(owner = "client!bv", name = "Q", descriptor = "Lmg;")
    public class168 field4679;

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "Lhi;")
    public class315 field4661;

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "Lvq;")
    public class341 field4672;

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "Lvc;")
    public class99 field4655;

    @OriginalMember(owner = "client!bv", name = "L", descriptor = "[I")
    public static int[] field4674;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(III)I")
    public static final int method1855(int arg0, int arg1, int arg2) {
        field4676++;
        if (arg2 != 936463231) {
            method1855(-30, -120, -95);
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZII[BI[BIII)V")
    public static final void method1856(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field4665++;
        if (!arg0) {
            return;
        }
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        for (int var11 = -arg2; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg5[var10001] = (byte) (arg5[var10001] - arg3[arg8++]);
                int var14 = arg7++;
                arg5[var14] = (byte) (arg5[var14] - arg3[arg8++]);
                int var15 = arg7++;
                arg5[var15] = (byte) (arg5[var15] - arg3[arg8++]);
                int var16 = arg7++;
                arg5[var16] = (byte) (arg5[var16] - arg3[arg8++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg5[var10001] = (byte) (arg5[var10001] - arg3[arg8++]);
            }
            arg8 += arg6;
            arg7 += arg4;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(JILjava/lang/String;Z)V")
    public static final void method1857(long arg0, int arg1, String arg2, boolean arg3) {
        field4673++;
        if (arg3) {
            class49.method351(118);
            if (class139.field2321.equals("")) {
                class23.field311 = 39;
                return;
            }
        }
        class23 var5 = new class23(128);
        var5.method163(10, (byte) 49);
        var5.method182((int) (Math.random() * 65535.0D), 14);
        var5.method135(16056, arg0);
        var5.method182(class57.field899, 77);
        var5.method152((int) (Math.random() * 9.9999999E7D), (byte) -38);
        var5.method145(arg2, (byte) 0);
        var5.method152((int) (Math.random() * 9.9999999E7D), (byte) -38);
        if (arg3) {
            var5.method135(16056, class509.method2991(class139.field2321, (byte) -127));
            try {
                var5.method135(16056, Long.parseLong(class201.field3192));
            } catch (Exception var6) {
                class23.field311 = 39;
                return;
            }
        } else {
            var5.method152((int) (Math.random() * 9.9999999E7D), (byte) -38);
            var5.method152((int) (Math.random() * 9.9999999E7D), (byte) -38);
            var5.method152((int) (Math.random() * 9.9999999E7D), (byte) -38);
            var5.method152((int) (Math.random() * 9.9999999E7D), (byte) -38);
        }
        var5.method152((int) (Math.random() * 9.9999999E7D), (byte) -38);
        var5.method138(class533.field7840, class477.field7044, -128);
        class261.field4357.field301 = 0;
        class261.field4357.method163(arg3 ? class23.field326.field955 : class23.field323.field955, (byte) 49);
        class261.field4357.method182(var5.field301 + 28, -119);
        class261.field4357.method182(598, arg1 ^ 0x4AF2);
        class261.field4357.method163(class300.field4813, (byte) 49);
        class261.field4357.method163(class271.field4501.field7866, (byte) 49);
        class348.method2244(class261.field4357, (byte) -69);
        class261.field4357.method136(var5.field302, 866900624, 0, var5.field301);
        class23.field311 = -3;
        class266.field4460 = 1;
        class156.field2529 = 0;
        class398.field6086 = 0;
        if (arg1 != -19084) {
            method1858((byte) 94);
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)V")
    public static void method1858(byte arg0) {
        field4675 = null;
        field4652 = null;
        field4674 = null;
        if (arg0 != -89) {
            method1858((byte) 88);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IC)C")
    public static final char method1859(int arg0, char arg1) {
        field4657++;
        if (arg0 != 234) {
            field4675 = null;
        }
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
    public final void method1860(int arg0) {
        this.field4672 = null;
        this.field4655 = null;
        if (arg0 < 125) {
            method1859(-118, '\u000b');
        }
        this.field4679 = null;
        field4677++;
        this.field4661 = null;
    }
}
