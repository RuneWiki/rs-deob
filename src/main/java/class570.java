import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class570 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lvj;")
    public static class373 field8369 = new class373(99, 3);

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field8370 = 0;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Z")
    public static boolean field8372 = false;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lcea;")
    public static class180 field8371 = new class180(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method3322(int arg0) {
        field8369 = null;
        field8371 = null;
        if (arg0 != 0) {
            field8371 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([[BILvk;)V")
    public static final void method3323(byte[][] arg0, int arg1, class308 arg2) {
        field8368++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field6670; var4++) {
            class93.method560(true);
            for (int var5 = 0; var5 < (class106.field1289 >> 3); var5++) {
                for (int var6 = 0; var6 < (class422.field5452 >> 3); var6++) {
                    int var7 = class415.field5397[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x393CB64) >> 24;
                        if (!arg2.field6677 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class633.field9116.length; var13++) {
                                if (class633.field9116[var13] == var12 && arg0[var13] != null) {
                                    class374 var14 = new class374(arg0[var13]);
                                    arg2.method2770(false, var6 * 8, class309.field3939, var8, var5 * 8, var10, var14, var4, var11, var9);
                                    arg2.method1710(var5 * 8, class210.field2560, var8, var9, var6 * 8, var3[0] == -1 ? var3 : null, var11, var10, var4, 1, var14);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 >= 13 && var3[0] != -1) {
            class259.field3340 = class562.field8276.method2983(class643.field9362, var3[0], var3[3], var3[2], var3[1], -20980);
            class53.field452 = var3[4];
        }
    }
}
