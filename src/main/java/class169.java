import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class169 extends class400 {

    @OriginalMember(owner = "client!an", name = "q", descriptor = "B")
    public byte field2382 = 5;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "[I")
    public static int[] field2390 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!an", name = "w", descriptor = "Liba;")
    public static class211 field2388 = new class211(12, 8);

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "I")
    public int field2384;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!an", name = "B", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!an", name = "E", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!an", name = "F", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!an", name = "G", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!an", name = "C", descriptor = "Z")
    public boolean field2394;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IBILdj;)V")
    public static final void method1177(int arg0, byte arg1, int arg2, class453 arg3) {
        class20.field383[arg0][arg2] = arg3;
        field2385++;
        if (arg1 > -87) {
            method1181(127, null, 24, 61, -24, (byte) -39);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lrg;I)V")
    public static final void method1178(class523 arg0, int arg1) {
        if (arg1 != 89) {
            method1179('\n', 91, 121);
        }
        if (arg0 instanceof class53) {
            class53 var2 = (class53) arg0;
            if (var2.field805 != null) {
                class661.method3717(class321.field4681.field7905 != var2.field7905, var2, false);
            }
        } else if (arg0 instanceof class71) {
            class71 var3 = (class71) arg0;
            class203.method1315(class321.field4681.field7905 != var3.field7905, var3, (byte) 73);
        }
        field2396++;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(CII)C")
    public static final char method1179(char arg0, int arg1, int arg2) {
        field2397++;
        if (arg1 != 9790) {
            return '8';
        }
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BIIIIII)V")
    public static final void method1180(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2387++;
        int var7 = arg1 - arg5;
        int var8 = arg4 + arg5;
        for (int var9 = arg4; var9 < var8; var9++) {
            class41.method235(arg3, class565.field8253[var9], arg0 - 49, arg2, arg6);
        }
        int var10 = arg3 + arg5;
        if (arg0 != 49) {
            field2383 = 4;
        }
        for (int var11 = arg1; var11 > var7; var11--) {
            class41.method235(arg3, class565.field8253[var11], arg0 ^ 0x31, arg2, arg6);
        }
        int var12 = arg2 - arg5;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class565.field8253[var13];
            class41.method235(arg3, var14, 0, var10, arg6);
            class41.method235(var12, var14, arg0 ^ 0x31, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILew;IIIB)Ljava/awt/Frame;")
    public static final Frame method1181(int arg0, class226 arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2389++;
        if (!arg1.method1403((byte) 113)) {
            return null;
        }
        if (arg3 == 0) {
            class432[] var6 = class654.method3697(-2, arg1);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field6273 == arg2 && var6[var8].field6274 == arg4 && (arg0 == 0 || var6[var8].field6268 == arg0) && (!var7 || var6[var8].field6272 > arg3)) {
                    arg3 = var6[var8].field6272;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class254 var9 = arg1.method1401(arg2, arg3, arg0, arg4, 10762);
        if (arg5 > -55) {
            return null;
        }
        while (var9.field3311 == 0) {
            class687.method3846(10L, -18);
        }
        Frame var10 = (Frame) var9.field3307;
        if (var10 == null) {
            return null;
        } else if (var9.field3311 == 2) {
            class683.method3826(var10, 10, arg1);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        if (arg0 > -27) {
            field2388 = null;
        }
        field2388 = null;
        field2390 = null;
    }
}
