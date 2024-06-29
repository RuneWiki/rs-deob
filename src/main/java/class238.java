import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class238 extends class456 {

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
    private int field3469 = 4096;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public static int field3466 = 0;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public static int field3470;

    static {
        new class332("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field3471 = 0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZIB)V", line = 5)
    public static final void method1545(boolean arg0, int arg1, byte arg2) {
        ++field3467;
        class341 var3 = class271.method1763(arg0, arg1, false);
        if (var3 != null) {
            for (int var4 = 0; ~var4 > ~var3.field5108.length; ++var4) {
                var3.field5108[var4] = -1;
                var3.field5110[var4] = 0;
            }
            int var5 = 94 / ((arg2 - 3) / 61);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 29)
    public class238() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBLre;)V", line = 36)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 == 55) {
            if (arg0 == 0) {
                this.field3469 = arg2.method2631(2530);
            }
            ++field3470;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[II[JI)V", line = 51)
    public static final void method1546(int arg0, int[] arg1, int arg2, long[] arg3, int arg4) {
        if (arg2 < arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var9;
            for (int var10 = arg2; arg0 > var10; ++var10) {
                if (~((long) (var10 & 1) + var7) < ~arg3[var10]) {
                    long var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var9;
            method1546(var6 + -1, arg1, arg2, arg3, arg4);
            method1546(arg0, arg1, var6 + 1, arg3, arg4);
        }
        if (arg4 == -5266) {
            ++field3468;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)[I", line = 107)
    public final int[] method33(int arg0, int arg1) {
        ++field3465;
        if (arg0 != -1) {
            field3466 = 93;
        }
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            int[] var4 = this.method2707(arg1 - 1 & class493.field6947, arg0 ^ 31796, 0);
            int[] var5 = this.method2707(arg1, -31797, 0);
            int[] var6 = this.method2707(class493.field6947 & arg1 + 1, -31797, 0);
            for (int var7 = 0; class156.field2169 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field3469;
                int var9 = (var5[class428.field6112 & var7 + 1] + -var5[class428.field6112 & var7 - 1]) * this.field3469;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }
}
