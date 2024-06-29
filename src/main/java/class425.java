import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class425 extends class45 {

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    private int field6339 = -1;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "Liv;")
    public static class64 field6338;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public int field6334;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public int field6337;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "[I")
    public int[] field6335;

    static {
        new class342("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field6338 = new class64(13, -2);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2555(boolean arg0) {
        if (arg0) {
            field6338 = null;
        }
        field6338 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)I", line = 15)
    public static final int method2556(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -113) {
            method2557(-25, 115, 50, -14, 101, (byte[]) null, -15);
        }
        ++field6328;
        if (~(8 & class260.field3784[arg1][arg3][arg0]) != -1) {
            return 0;
        } else {
            return arg1 > 0 && (2 & class260.field3784[1][arg3][arg0]) != 0 ? arg1 + -1 : arg1;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII[BI)Z", line = 33)
    public static final boolean method2557(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        ++field6340;
        int var7 = arg3 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg4 + -1 + arg0) / arg4);
        int var10 = -((arg3 + arg4 + -1) / arg4);
        if (arg6 != 6484) {
            field6338 = null;
        }
        for (int var11 = var9; var11 < 0; ++var11) {
            for (int var12 = var10; ~var12 > -1; ++var12) {
                if (~arg5[arg2] == -1) {
                    return true;
                }
                arg2 += arg4;
            }
            int var13 = arg2 - var8;
            if (arg5[var13 - 1] == 0) {
                return true;
            }
            arg2 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)[[I", line = 91)
    public int[][] method49(int arg0, int arg1) {
        ++field6329;
        if (arg0 != 8) {
            return null;
        } else {
            int[][] var3 = super.field833.method835(arg1, (byte) 23);
            if (super.field833.field1888 && this.method2559((byte) 98)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = (class457.field6849 == this.field6334 ? arg1 : this.field6334 * arg1 / class457.field6849) * this.field6337;
                if (~class259.field3768 != ~this.field6337) {
                    for (int var8 = 0; ~var8 > ~class259.field3768; ++var8) {
                        int var9 = this.field6337 * var8 / class259.field3768;
                        int var10 = this.field6335[var7 + var9];
                        var6[var8] = class207.method1405(4080, var10 << 4);
                        var5[var8] = class207.method1405(65280, var10) >> 4;
                        var4[var8] = class207.method1405(var10 >> 12, 4080);
                    }
                } else {
                    for (int var11 = 0; var11 < class259.field3768; ++var11) {
                        int var12 = this.field6335[var7++];
                        var6[var11] = class207.method1405(var12, 255) << 4;
                        var5[var11] = class207.method1405(4080, var12 >> 4);
                        var4[var11] = class207.method1405(16711680, var12) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V", line = 160)
    public final void method433(int arg0) {
        ++field6332;
        super.method433(arg0);
        this.field6335 = null;
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(B)V", line = 169)
    public static final void method2558(byte arg0) {
        if (arg0 != -77) {
            field6338 = null;
        }
        class195.field2867 = null;
        class214.field3089 = null;
        class480.field7140 = null;
        class5.field128 = null;
        ++field6333;
        class232.field3382 = null;
        class410.field6144 = null;
        class151.field2406 = null;
        class46.field856 = null;
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(B)Z", line = 187)
    public final boolean method2559(byte arg0) {
        ++field6330;
        int var2 = -118 / ((arg0 - 28) / 37);
        if (this.field6335 != null) {
            return true;
        } else if (~this.field6339 <= -1) {
            class279 var3 = class217.field3115 < 0 ? class279.method1787(class416.field6211, this.field6339) : class279.method1789(class416.field6211, class217.field3115, this.field6339);
            var3.method1792();
            this.field6335 = var3.method1785();
            this.field6337 = var3.field4005;
            this.field6334 = var3.field4003;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 214)
    public class425() {
        super(0, false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)V", line = 218)
    public static final void method2560(byte arg0, int arg1) {
        ++field6341;
        if (arg0 < 8) {
            field6338 = null;
        }
        class54 var2 = class442.method2651(arg1, 11, -13208);
        var2.method476((byte) -44);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lcu;II)V", line = 241)
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg1 != -26471) {
            field6338 = null;
        }
        if (arg2 == 0) {
            this.field6339 = arg0.method1069((byte) -95);
        }
        ++field6336;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)I", line = 258)
    public final int method438(byte arg0) {
        int var2 = -62 / ((26 - arg0) / 61);
        ++field6331;
        return this.field6339;
    }
}
