import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class305 extends class98 {

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "Liq;")
    public static class362 field4282 = new class362("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "Llg;")
    public static class237 field4284;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "Lva;")
    public static class288 field4286;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "Lae;")
    public static class134 field4288;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(II)Ldk;")
    public static final class298 method2006(int arg0, int arg1) {
        ++field4279;
        class237 var2 = class5.field84;
        class298 var3;
        synchronized (class5.field84) {
            var3 = (class298) class5.field84.method1625((long) arg1, 0);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class41.field498.method2431((byte) 76, 3, arg1);
            if (arg0 >= -51) {
                return null;
            } else {
                class298 var5 = new class298();
                if (var4 != null) {
                    var5.method1972(new class236(var4), (byte) -32);
                }
                class237 var6 = class5.field84;
                synchronized (class5.field84) {
                    class5.field84.method1622((byte) 13, var5, (long) arg1);
                    return var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)I")
    public static final int method2007(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4278;
        if (arg2 != 1392314049) {
            field4282 = null;
        }
        int var5 = -class158.field2059[arg1 * 8192 / arg0] + 65536 >> 1;
        return ((65536 - var5) * arg3 >> 16) - -(arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg2 != 0) {
            field4286 = null;
        }
        ++field4280;
        if (~arg0 == -1) {
            super.field1176 = arg1.method1574(-108) == 1;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIIII)V")
    public static final void method2008(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4283;
        class20 var5 = class369.method2351((byte) 80, arg4, arg3);
        var5.method146(84);
        var5.field255 = arg2;
        var5.field252 = arg0;
        var5.field258 = arg1;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class305() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field4281;
            int[] var3 = super.field1177.method820(arg1, true);
            if (super.field1177.field1610) {
                int[] var4 = this.method539(0, (byte) -93, arg1);
                int[] var5 = this.method539(1, (byte) -78, arg1);
                int[] var6 = this.method539(2, (byte) -126, arg1);
                for (int var7 = 0; ~var7 > ~class268.field3811; ++var7) {
                    int var8 = var6[var7];
                    if (var8 != 4096) {
                        if (~var8 != -1) {
                            var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                        } else {
                            var3[var7] = var5[var7];
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)[[I")
    public final int[][] method194(int arg0, int arg1) {
        int var3 = -48 % ((arg1 - 60) / 43);
        ++field4277;
        int[][] var4 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332) {
            int[] var5 = this.method539(2, (byte) -116, arg0);
            int[][] var6 = this.method546(arg0, (byte) 33, 0);
            int[][] var7 = this.method546(arg0, (byte) 33, 1);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; class268.field3811 > var17; ++var17) {
                int var18 = var5[var17];
                if (~var18 != -4097) {
                    if (var18 == 0) {
                        var8[var17] = var14[var17];
                        var9[var17] = var15[var17];
                        var10[var17] = var16[var17];
                    } else {
                        int var19 = -var18 + 4096;
                        var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                        var9[var17] = var12[var17] * var18 - -(var15[var17] * var19) >> 12;
                        var10[var17] = var13[var17] * var18 - -(var16[var17] * var19) >> 12;
                    }
                } else {
                    var8[var17] = var11[var17];
                    var9[var17] = var12[var17];
                    var10[var17] = var13[var17];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V")
    public static void method2009(int arg0) {
        field4286 = null;
        field4284 = null;
        field4282 = null;
        if (arg0 != 65536) {
            method2008(118, 38, 84, 62, 123);
        }
        field4288 = null;
    }

    static {
        new class362("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field4284 = new class237(30);
        field4285 = 0;
        field4287 = 0;
        field4286 = new class288(8);
    }
}
