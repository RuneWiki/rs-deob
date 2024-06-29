import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class53 extends class194 {

    @OriginalMember(owner = "client!mq", name = "N", descriptor = "Lcq;")
    public static class72 field622 = new class72("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!mq", name = "P", descriptor = "I")
    public static int field624 = 0;

    @OriginalMember(owner = "client!mq", name = "Q", descriptor = "Lbb;")
    public static class270 field625 = new class270();

    @OriginalMember(owner = "client!mq", name = "I", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!mq", name = "K", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!mq", name = "O", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!mq", name = "R", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!mq", name = "L", descriptor = "Ljava/awt/Frame;")
    public static Frame field620;

    @OriginalMember(owner = "client!mq", name = "M", descriptor = "[Lc;")
    public static class436[] field621;

    @OriginalMember(owner = "client!mq", name = "J", descriptor = "[Z")
    public static boolean[] field618;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field617;
        if (arg0 == 0) {
            super.field2278 = ~arg2.method1563(-128) == -2;
        }
        int var4 = 107 / ((52 - arg1) / 61);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field623;
        int var3 = -72 % ((57 - arg1) / 46);
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            int[] var5 = this.method1203(0, 90, arg0);
            int[] var6 = this.method1203(1, 66, arg0);
            int[] var7 = this.method1203(2, 126, arg0);
            for (int var8 = 0; class138.field1579 > var8; ++var8) {
                int var9 = var7[var8];
                if (~var9 == -4097) {
                    var4[var8] = var5[var8];
                } else if (var9 != 0) {
                    var4[var8] = var5[var8] * var9 - -((-var9 + 4096) * var6[var8]) >> 12;
                } else {
                    var4[var8] = var6[var8];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field619;
        int[][] var3 = super.field2283.method1667(arg1, -80);
        if (arg0 != -730) {
            this.method55(81, 39);
        }
        if (super.field2283.field3451) {
            int[] var4 = this.method1203(2, arg0 ^ -699, arg1);
            int[][] var5 = this.method1200(60, arg1, 0);
            int[][] var6 = this.method1200(60, arg1, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class138.field1579 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "(I)V")
    public static void method302(int arg0) {
        field620 = null;
        field618 = null;
        field622 = null;
        field621 = null;
        if (arg0 == 0) {
            field625 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
    public class53() {
        super(3, false);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZLnh;Ljava/awt/Frame;)V")
    public static final void method303(boolean arg0, class441 arg1, Frame arg2) {
        ++field626;
        while (true) {
            class315 var3 = arg1.method2727(arg0, arg2);
            while (var3.field4244 == 0) {
                class219.method1330(10L, true);
            }
            if (var3.field4244 == 1) {
                if (!arg0) {
                    method303(false, (class441) null, (Frame) null);
                }
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class219.method1330(100L, true);
        }
    }
}
