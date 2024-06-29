import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class152 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lrd;")
    public static class173 field2876 = class133.method843("auf einer freien Welt zu spielen)3", 109);

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lrd;")
    public static class173 field2882 = class133.method843("Lade Schrifts-=tze )2 ", 96);

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Laf;")
    public static class7 field2884 = new class7(30);

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lrd;")
    public static class173 field2885 = class133.method843("Mitglieder)2Welt", -127);

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "[Ldh;")
    public static class39[] field2875;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method997(byte arg0) {
        field2876 = null;
        field2885 = null;
        field2882 = null;
        field2884 = null;
        field2875 = null;
        if (arg0 != 0) {
            method1000(null, -35, 89, -39, -25, 118, -63);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)Z")
    public static final boolean method998(int arg0, byte arg1) {
        int var2 = -29 % ((-arg1 - 52) / 49);
        field2881++;
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method999(Component arg0, boolean arg1) {
        arg0.removeMouseListener(class205.field4011);
        field2878++;
        arg0.removeMouseMotionListener(class205.field4011);
        arg0.removeFocusListener(class205.field4011);
        if (arg1) {
            class93.field1745 = 0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([IIIIIII)V")
    public static final void method1000(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class182.field3583 = arg5;
        class149.field2844 = new boolean[8][32][class182.field3583 + class182.field3583 + 1][class182.field3583 + class182.field3583 + 1];
        class21.field466 = 0;
        class189.field3677 = 0;
        class214.field4155 = arg3;
        class66.field1288 = arg4;
        class36.field769 = arg3 / 2;
        class209.field4060 = arg4 / 2;
        boolean[][][][] var7 = new boolean[9][32][class182.field3583 + class182.field3583 + 3][class182.field3583 + class182.field3583 + 3];
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                class17.field365 = class72.field1396[var8];
                class24.field517 = class72.field1404[var8];
                class125.field2350 = class72.field1396[var16];
                class125.field2363 = class72.field1404[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -(class182.field3583 + 1); var19 <= class182.field3583 + 1; var19++) {
                    for (int var20 = -(class182.field3583 + 1); var20 <= class182.field3583 + 1; var20++) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg1; var24 <= arg2; var24 += 128) {
                            if (class66.method413(var21, arg0[var17] + var24, var22, arg6)) {
                                var23 = true;
                                break;
                            }
                        }
                        var7[var17][var18][class182.field3583 + var19 + 1][class182.field3583 + var20 + 1] = var23;
                    }
                }
            }
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 32; var10++) {
                for (int var11 = -class182.field3583; var11 < class182.field3583; var11++) {
                    for (int var12 = -class182.field3583; var12 < class182.field3583; var12++) {
                        boolean var13 = false;
                        label78: for (int var14 = -1; var14 <= 1; var14++) {
                            for (int var15 = -1; var15 <= 1; var15++) {
                                if (var7[var9][var10][var11 + var14 + class182.field3583 + 1][var12 + var15 + class182.field3583 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9][(var10 + 1) % 31][var11 + var14 + class182.field3583 + 1][var12 + var15 + class182.field3583 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][var10][var11 + var14 + class182.field3583 + 1][var12 + var15 + class182.field3583 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][(var10 + 1) % 31][var11 + var14 + class182.field3583 + 1][var12 + var15 + class182.field3583 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                            }
                        }
                        class149.field2844[var9][var10][class182.field3583 + var11][class182.field3583 + var12] = var13;
                    }
                }
            }
        }
    }
}
