import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class426 extends class298 {

    @OriginalMember(owner = "client!o", name = "K", descriptor = "[[I")
    public static int[][] field6135 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!o", name = "N", descriptor = "Z")
    public static boolean field6138;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "Las;")
    public static class193 field6142;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[[I")
    public final int[][] method157(int arg0, int arg1) {
        ++field6140;
        int[][] var3 = super.field4454.method1638((byte) -125, arg1);
        if (arg0 != -24032) {
            return null;
        } else {
            if (super.field4454.field3886) {
                int[][] var4 = this.method1878(0, arg1, 85);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class158.field1877; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class426() {
        super(1, false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field6139;
        if (~arg1 == -1) {
            super.field4449 = ~arg2.method895((byte) -90) == -2;
        }
        if (arg0 > -44) {
            field6142 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
    public static final void method2539(int arg0) {
        ++field6137;
        if (class31.field389 < 1024.0F) {
            class31.field389 = 1024.0F;
        }
        while (class349.field5021 >= 16384.0F) {
            class349.field5021 -= 16384.0F;
        }
        if (class31.field389 > 3072.0F) {
            class31.field389 = 3072.0F;
        }
        while (class349.field5021 < 0.0F) {
            class349.field5021 += 16384.0F;
        }
        int var1 = class191.field2617 >> 7;
        int var2 = class186.field2445 >> 7;
        int var3 = class375.method2264(-1547, class186.field2445, class100.field1217, class191.field2617);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; ~(var1 + 4) <= ~var5; ++var5) {
                for (int var6 = var2 - 4; ~(var2 + 4) <= ~var6; ++var6) {
                    int var7 = class100.field1217;
                    if (~var7 > -4 && class292.method1840(var5, (byte) 22, var6)) {
                        ++var7;
                    }
                    int var8 = 0;
                    if (class422.field6097.field2698 != null && class422.field6097.field2698[var7] != null) {
                        var8 = (class422.field6097.field2698[var7][var5][var6] & 255) * 8;
                    }
                    int var9 = -class398.field5667[var7].method1861(var5, var6) + var3 + var8;
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (arg0 > -47) {
            method2541(59);
        }
        if (~var10 < -786433) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (~var10 >= ~class192.field2643) {
            if (~var10 > ~class192.field2643) {
                class192.field2643 += (-class192.field2643 + var10) / 80;
                return;
            }
        } else {
            class192.field2643 += (-class192.field2643 + var10) / 24;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)[I")
    public final int[] method13(int arg0, boolean arg1) {
        ++field6136;
        if (!arg1) {
            field6138 = true;
        }
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            int[] var4 = this.method1882(0, -2594, arg0);
            for (int var5 = 0; ~class158.field1877 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIILgn;)V")
    public static final void method2540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class187 arg6) {
        ++field6141;
        if (arg0 <= 51) {
            field6135 = null;
        }
        class192.method1049((byte) 116, 0, arg3, arg5, arg6.field994, arg1, arg6.field1005, arg4, arg2, arg6.field1008);
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
    public static void method2541(int arg0) {
        if (arg0 > -31) {
            field6142 = null;
        }
        field6142 = null;
        field6135 = null;
    }

    static {
        new class40("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field6138 = false;
        field6142 = new class193(0, 0);
    }
}
