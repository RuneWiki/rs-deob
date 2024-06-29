import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class247 extends class278 {

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    private int field3435 = 4096;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "Luf;")
    public static class310 field3440 = new class310(75, -1);

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    public static int field3442 = -1;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "[I")
    public static int[] field3443 = new int[50];

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3445;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "Luf;")
    public static class310 field3444;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    public static int field3441;

    static {
        new class83("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field3445 = "";
        field3444 = new class310(26, 15);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method208(int arg0, int arg1) {
        if (arg0 != -9) {
            field3442 = -50;
        }
        ++field3439;
        int[] var3 = super.field3750.method256(arg1, arg0 + -30350);
        if (super.field3750.field554) {
            int[] var4 = this.method1570(0, 0, class40.field549 & arg1 + -1);
            int[] var5 = this.method1570(0, 0, arg1);
            int[] var6 = this.method1570(0, 0, arg1 + 1 & class40.field549);
            for (int var7 = 0; ~var7 > ~class507.field7456; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field3435;
                int var9 = (var5[var7 + 1 & class412.field6045] + -var5[var7 - 1 & class412.field6045]) * this.field3435;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - -var13 + 4096) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "(I)V", line = 55)
    public static void method1455(int arg0) {
        field3444 = null;
        if (arg0 >= -14) {
            field3440 = null;
        }
        field3445 = null;
        field3440 = null;
        field3443 = null;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V", line = 69)
    public class247() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZZ)Z", line = 72)
    public static boolean method1456(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Llh;II)V", line = 80)
    public final void method210(class365 arg0, int arg1, int arg2) {
        ++field3438;
        if (arg1 == -30446) {
            if (~arg2 == -1) {
                this.field3435 = arg0.method2062((byte) 14);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILss;IB)V", line = 95)
    public static final void method1457(int arg0, class295 arg1, int arg2, byte arg3) {
        class127.field1739 = arg0;
        class164.field2335 = arg1;
        class167.field2360 = arg2;
        int var4 = -109 % ((87 - arg3) / 35);
        ++field3436;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILuo;)V", line = 113)
    public static final void method1458(int arg0, class405 arg1) {
        if (arg0 > 63) {
            ++field3441;
            for (class129 var2 = (class129) class20.field217.method3072((byte) 56); var2 != null; var2 = (class129) class20.field217.method3066(2)) {
                if (var2.field1777 == arg1) {
                    if (var2.field1766 != null) {
                        class189.field2623.method942(var2.field1766);
                        var2.field1766 = null;
                    }
                    var2.method2946(-100);
                    return;
                }
            }
        }
    }
}
