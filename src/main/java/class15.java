import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class15 extends class109 {

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "[I")
    public static int[] field267 = new int[256];

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "[I")
    public static int[] field272 = new int[1000];

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Ldd;")
    public static class35 field271 = class180.method1196((byte) 126, "null");

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Z")
    public static boolean field277 = false;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lae;")
    public static class6 field270;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "[I")
    public static int[] field269;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "[S")
    public static short[] field275;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lgb;Z)V")
    public static final void method121(class63 arg0, boolean arg1) {
        class125.field2734 = arg0;
        field274++;
        if (arg1) {
            field275 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([IIIIIII)V")
    public static final void method122(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class115.field2583 = arg5;
        class168.field3387 = new boolean[8][32][class115.field2583 + class115.field2583 + 1][class115.field2583 + class115.field2583 + 1];
        class120.field2637 = 0;
        class39.field857 = 0;
        class30.field608 = arg3;
        class109.field2420 = arg4;
        class137.field2931 = arg3 / 2;
        class176.field3590 = arg4 / 2;
        boolean[][][][] var7 = new boolean[9][32][class115.field2583 + class115.field2583 + 3][class115.field2583 + class115.field2583 + 3];
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                class1.field13 = class11.field211[var8];
                class201.field4030 = class11.field201[var8];
                class40.field889 = class11.field211[var16];
                class137.field2922 = class11.field201[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -(class115.field2583 + 1); var19 <= class115.field2583 + 1; var19++) {
                    for (int var20 = -(class115.field2583 + 1); var20 <= class115.field2583 + 1; var20++) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg1; var24 <= arg2; var24 += 128) {
                            if (class17.method156(var21, arg0[var17] + var24, var22, arg6)) {
                                var23 = true;
                                break;
                            }
                        }
                        var7[var17][var18][class115.field2583 + var19 + 1][class115.field2583 + var20 + 1] = var23;
                    }
                }
            }
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 32; var10++) {
                for (int var11 = -class115.field2583; var11 < class115.field2583; var11++) {
                    for (int var12 = -class115.field2583; var12 < class115.field2583; var12++) {
                        boolean var13 = false;
                        label78: for (int var14 = -1; var14 <= 1; var14++) {
                            for (int var15 = -1; var15 <= 1; var15++) {
                                if (var7[var9][var10][var11 + var14 + class115.field2583 + 1][var12 + var15 + class115.field2583 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9][(var10 + 1) % 31][var11 + var14 + class115.field2583 + 1][var12 + var15 + class115.field2583 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][var10][var11 + var14 + class115.field2583 + 1][var12 + var15 + class115.field2583 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][(var10 + 1) % 31][var11 + var14 + class115.field2583 + 1][var12 + var15 + class115.field2583 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                            }
                        }
                        class168.field3387[var9][var10][class115.field2583 + var11][class115.field2583 + var12] = var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public static void method123(int arg0) {
        if (arg0 > -77) {
            return;
        }
        field271 = null;
        field272 = null;
        field275 = null;
        field269 = null;
        field267 = null;
        field270 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Lca;")
    public static final class22 method124(int arg0, int arg1, int arg2) {
        class54 var3 = class191.field3853[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1210;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILdd;ILdd;SIJ)V")
    public static final void method125(int arg0, class35 arg1, int arg2, class35 arg3, short arg4, int arg5, long arg6) {
        field273++;
        if (class52.field1166) {
            return;
        }
        if (class59.field1469 < 500) {
            class64.field1541[class59.field1469] = arg3;
            class183.field3756[class59.field1469] = arg1;
            class165.field3340[class59.field1469] = arg4;
            class143.field3001[class59.field1469] = arg6;
            class34.field701[class59.field1469] = arg5;
            class72.field1709[class59.field1469] = arg0;
            class59.field1469++;
        }
        if (arg2 != -21056) {
            field275 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class15() {
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I)V")
    public class15(int arg0) {
        this.field276 = arg0;
    }
}
