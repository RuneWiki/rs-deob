import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class143 extends class103 {

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Lda;")
    public static class275 field2509 = class255.method1672(99, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!me", name = "z", descriptor = "Lda;")
    public static class275 field2515 = class255.method1672(100, "welle:");

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Lda;")
    public static class275 field2512 = class255.method1672(102, "overlay");

    @OriginalMember(owner = "client!me", name = "A", descriptor = "Lda;")
    public static class275 field2516 = class255.method1672(92, "Sprites geladen)3");

    @OriginalMember(owner = "client!me", name = "B", descriptor = "Lda;")
    public static class275 field2517 = class255.method1672(108, "(U (X");

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Lne;")
    public static class137 field2511 = new class137(64);

    @OriginalMember(owner = "client!me", name = "C", descriptor = "Z")
    public static boolean field2518 = false;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public int field2505;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public int field2508;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "[I")
    public static int[] field2519;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIILcg;IIB)V")
    public static final void method1025(int arg0, int arg1, int arg2, class118 arg3, int arg4, int arg5, byte arg6) {
        field2514++;
        long var7 = 0L;
        if (arg5 == 0) {
            var7 = class181.method1216(arg0, arg1, arg4);
        } else if (arg5 == 1) {
            var7 = class115.method839(arg0, arg1, arg4);
        } else if (arg5 == 2) {
            var7 = class110.method814(arg0, arg1, arg4);
        } else if (arg5 == 3) {
            var7 = class35.method208(arg0, arg1, arg4);
        }
        boolean var9 = false;
        int var10 = ((int) var7 & 0x7CE6F) >> 14;
        if (arg6 != -85) {
            field2509 = null;
        }
        boolean var11 = true;
        boolean var12 = false;
        int var13 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        class34 var14 = class146.method1040(-103, var13);
        if (var14.method201(13)) {
            class92.method662(arg0, arg4, (byte) -3, var14, arg1);
        }
        int var15 = ((int) var7 & 0x361826) >> 20;
        if (var7 == 0L) {
            return;
        }
        if (arg5 == 0) {
            class73.method478(arg0, arg1, arg4);
            if (var14.field551 != 0) {
                arg3.method858(arg4, var14.field553, 1, var15, arg1, var10);
                return;
            }
            return;
        }
        if (arg5 == 1) {
            class107.method789(arg0, arg1, arg4);
            return;
        }
        if (arg5 != 2) {
            if (arg5 == 3) {
                class3.method9(arg0, arg1, arg4);
                if (var14.field551 == 1) {
                    arg3.method864(arg1, (byte) -37, arg4);
                    return;
                }
            }
            return;
        }
        class70.method464(arg0, arg1, arg4);
        if (var14.field551 != 0 && var14.field559 + arg1 < 104 && (var14.field559 + arg4) < 104 && (arg1 + var14.field526) < 104 && (arg4 + var14.field526) < 104) {
            arg3.method865(arg4, var14.field526, var14.field559, var15, var14.field553, (byte) 28, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lda;I)Z")
    public static final boolean method1026(class275 arg0, int arg1) {
        field2510++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class16.field240; var2++) {
            if (arg0.method1844(90, class165.field2875[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method1027(byte arg0) {
        field2511 = null;
        field2516 = null;
        if (arg0 != -27) {
            return;
        }
        field2519 = null;
        field2515 = null;
        field2509 = null;
        field2512 = null;
        field2517 = null;
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public static final void method1028(int arg0) {
        int var1 = 62 % ((arg0 + 62) / 58);
        field2507++;
        class220.field3744.method993(113);
    }
}
