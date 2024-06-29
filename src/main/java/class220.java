import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class220 extends class159 {

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "[I")
    public int[] field3375 = new int[] { 0 };

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "[I")
    public int[] field3377 = new int[] { -1 };

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "J")
    public static long field3379 = 0L;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Lle;")
    public static class137 field3374;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(ZI)V", line = 7)
    public static final void method1482(boolean arg0, int arg1) {
        field3378++;
        if (arg1 != 22115) {
            return;
        }
        byte var2;
        byte[][] var3;
        if (class245.field3886 && arg0) {
            var2 = 1;
            var3 = class23.field352;
        } else {
            var2 = 4;
            var3 = class202.field3107;
        }
        int[] var4 = null;
        for (int var5 = 0; var5 < var2; var5++) {
            class190.method1316(-122);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class276.field4549[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x3D62D4D) >> 24;
                        if (!arg0 || var10 == 0) {
                            int var11 = (var9 & 0x3FFD) >> 3;
                            int var12 = (var9 & 0x7) >> 1;
                            int var13 = (var9 & 0xFFDDAD) >> 14;
                            int var14 = (var13 / 8 << 8) + (var11 / 8);
                            for (int var15 = 0; var15 < class150.field2404.length; var15++) {
                                if (class150.field2404[var15] == var14 && var3[var15] != null) {
                                    var8 = true;
                                    int[] var16 = class4.method26(var11, var10, var13, var7 * 8, class124.field1860, var3[var15], var6 * 8, var12, var5, (byte) -109, arg0);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class52.method377(var6 * 8, 8, 8, true, var7 * 8, var5);
                    }
                }
            }
        }
        if (var4 == null) {
            class238.field3763 = -1;
            return;
        }
        class238.field3763 = var4[0];
        class70.field1080 = var4[3];
        class51.field762 = var4[4];
        class198.field3041 = var4[2];
        class13.field171 = var4[1];
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V", line = 124)
    public static final void method1483(int arg0, int arg1) {
        field3376++;
        class220 var2 = (class220) class294.field4888.method29((long) arg0, 103);
        if (var2 != null) {
            if (arg1 != 0) {
                method1483(80, 20);
            }
            var2.method1131(8);
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V", line = 145)
    public static void method1484(int arg0) {
        if (arg0 != -29284) {
            field3379 = -54L;
        }
        field3374 = null;
    }
}
