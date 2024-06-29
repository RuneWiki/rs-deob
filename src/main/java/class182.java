import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class182 extends class82 {

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "Z")
    private boolean field3162 = true;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    private int field3169 = 4096;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "Ldj;")
    public static class44 field3174 = class89.method650(255, "");

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "Ldj;")
    public static class44 field3170 = field3174;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "Ldj;")
    public static class44 field3177 = field3174;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "Ldj;")
    public static class44 field3164 = field3174;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "Ldj;")
    public static class44 field3167 = field3174;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "Ldj;")
    public static class44 field3172 = field3174;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "Ldj;")
    public static class44 field3178 = class89.method650(255, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "Ldj;")
    private static class44 field3179 = class89.method650(255, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "Ldj;")
    public static class44 field3163 = field3174;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "Ldj;")
    public static class44 field3168 = field3179;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLfj;)V")
    public static final void method1144(byte arg0, class66 arg1) {
        ++field3165;
        if (arg0 != -114) {
            field3167 = null;
        }
        byte[] var2 = new byte[24];
        if (class237.field4400 != null) {
            try {
                class237.field4400.method130(0L, (byte) 89);
                class237.field4400.method134(126, var2);
                int var3;
                for (var3 = 0; ~var3 > -25 && var2[var3] == 0; ++var3) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method498(0, var2, -2, 24);
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
    public static void method1145(int arg0) {
        field3167 = null;
        field3164 = null;
        field3172 = null;
        field3174 = null;
        int var1 = -108 % ((-77 - arg0) / 33);
        field3170 = null;
        field3163 = null;
        field3179 = null;
        field3178 = null;
        field3168 = null;
        field3177 = null;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class182() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        ++field3173;
        int[][] var3 = super.field1601.method548(arg1, true);
        if (super.field1601.field1343) {
            int[] var4 = this.method620(2652, arg1 + -1 & class101.field1850, 0);
            int[] var5 = this.method620(2652, arg1, 0);
            int[] var6 = this.method620(2652, arg1 - -1 & class101.field1850, 0);
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            for (int var10 = 0; class129.field2287 > var10; ++var10) {
                int var11 = (var5[var10 + 1 & class53.field943] - var5[var10 + -1 & class53.field943]) * this.field3169;
                int var12 = (var6[var10] + -var4[var10]) * this.field3169;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - -var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = 16777216 / var17;
                    var19 = var12 / var17;
                    var18 = var11 / var17;
                }
                if (this.field3162) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var9[var10] = var18;
                var7[var10] = var19;
                var8[var10] = var20;
            }
        }
        if (arg0 >= -59) {
            this.method6(-71, 10);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg2 != 68) {
            field3178 = null;
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field3162 = arg0.method506(arg2 ^ 187) == 1;
            }
        } else {
            this.field3169 = arg0.method500(arg2 ^ 45);
        }
        ++field3175;
    }
}
