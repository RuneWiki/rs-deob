import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class168 extends class215 {

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Lqb;")
    public static class117 field2574 = new class117(16);

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field2579 = -1;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field2581 = 0;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "[[[B")
    public static byte[][][] field2578;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1191(byte arg0) {
        field2573++;
        int var1 = class192.method1308((byte) -39);
        if (var1 == 0) {
            class349.field5569 = (byte[][][]) null;
            class247.method1754(0, true);
        } else if (var1 == 1) {
            class312.method2205(-7935, (byte) 0);
            class247.method1754(512, true);
            if (class225.field3398 != null) {
                class282.method2040((byte) 51);
            }
        } else {
            class312.method2205(-7935, (byte) (class182.field2745 - 4 & 0xFF));
            class247.method1754(2, true);
        }
        if (arg0 == -101) {
            class190.field2854 = class219.field3290;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILnk;)V", line = 44)
    public static final void method1192(int arg0, class16 arg1) {
        class6.field74 = arg1;
        if (arg0 != 512) {
            field2578 = (byte[][][]) ((byte[][][]) null);
        }
        field2575++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIBIIIII)V", line = 63)
    public static final void method1193(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2577++;
        int var8 = arg6 + arg0;
        int var9 = arg1 - arg0;
        for (int var10 = arg6; var10 < var8; var10++) {
            class278.method1986(arg3, class347.field5501[var10], arg4, arg7, (byte) -97);
        }
        int var11 = arg7 - arg0;
        int var12 = arg0 + arg3;
        for (int var13 = arg1; var13 > var9; var13--) {
            class278.method1986(arg3, class347.field5501[var13], arg4, arg7, (byte) -120);
        }
        if (arg2 >= -39) {
            method1192(39, (class16) null);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class347.field5501[var14];
            class278.method1986(arg3, var15, arg4, var12, (byte) -109);
            class278.method1986(var12, var15, arg5, var11, (byte) 83);
            class278.method1986(var11, var15, arg4, arg7, (byte) 33);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V", line = 108)
    public static void method1194(byte arg0) {
        field2574 = null;
        int var1 = 102 % ((arg0) / 61);
        field2578 = (byte[][][]) null;
    }
}
