import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class201 {

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "J")
    public long field3325 = 0L;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "[I")
    public static int[] field3321 = new int[5];

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "[Z")
    public static boolean[] field3327 = new boolean[8];

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "[B")
    public static byte[] field3334 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "Ltl;")
    public static class59 field3337 = class85.method639("Zugewiesener Speicher)3", 9588);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public int field3331;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Lfg;")
    public class176 field3323;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Lfg;")
    public class176 field3326;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Lnk;")
    public static class195 field3332;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 11)
    public static final void method1440(Component arg0, byte arg1) {
        field3322++;
        arg0.removeKeyListener(class236.field3916);
        int var2 = 6 % ((arg1 - 53) / 53);
        arg0.removeFocusListener(class236.field3916);
        class160.field2608 = -1;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIZ[Ldl;I[BI)V", line = 34)
    public static final void method1441(int arg0, int arg1, int arg2, boolean arg3, class30[] arg4, int arg5, byte[] arg6, int arg7) {
        field3330++;
        if (!arg3) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg0 + var9) > 0 && arg0 + var9 < 103 && (arg2 + var10) > 0 && arg2 + var10 < 103) {
                            arg4[var8].field409[arg0 + var9][arg2 + var10] = class93.method680(arg4[var8].field409[arg0 + var9][arg2 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg3) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class170 var12 = new class170(arg6);
        for (int var13 = arg5; var13 < var11; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class174.method1284(var12, arg7, var13, arg0 + var14, arg3, arg1, arg2 + var15, 0, arg5 ^ 0xFFFF9DC2);
                }
            }
        }
        if (!class55.field815 || arg3) {
            return;
        }
        class150 var16 = null;
        while (true) {
            while (var12.field2758.length > var12.field2787) {
                int var17 = var12.method1221(arg5 + 99);
                if (var17 == 0) {
                    var16 = new class150(var12);
                } else if (var17 == 1) {
                    int var18 = var12.method1221(81);
                    if (var18 > 0) {
                        for (int var19 = 0; var19 < var18; var19++) {
                            class211 var20 = new class211(var12);
                            var20.field3441 += arg2 << 7;
                            int var21 = var20.field3441 >> 7;
                            var20.field3443 += arg0 << 7;
                            int var22 = var20.field3443 >> 7;
                            if (var22 >= 0 && var21 >= 0 && var22 < 104 && var21 < 104) {
                                var20.field3461 = class97.field1558[var20.field3447][var22][var21] - var20.field3461;
                                class135.method986(var20);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            if (var16 == null) {
                var16 = new class150();
            }
            for (int var23 = 0; var23 < 8; var23++) {
                for (int var24 = 0; var24 < 8; var24++) {
                    int var25 = (arg0 >> 3) + var23;
                    int var26 = (arg2 >> 3) + var24;
                    if (var25 >= 0 && var25 < 13 && var26 >= 0 && var26 < 13) {
                        class167.field2711[var25][var26] = var16;
                    }
                }
            }
            break;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 226)
    public static final void method1442(int arg0) {
        field3338++;
        if (arg0 == 13781) {
            class245.method1733(0);
            System.gc();
            class286.method1996(30143, 25);
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V", line = 242)
    public static void method1443(int arg0) {
        field3337 = null;
        if (arg0 != -26804) {
            method1440((Component) null, (byte) -26);
        }
        field3327 = null;
        field3334 = null;
        field3321 = null;
        field3332 = null;
    }
}
