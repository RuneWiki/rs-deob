import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class class165 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Lmh;")
    public static class128 field2830 = class22.method156(123, "<img=0>");

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field2836 = 0;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lmh;")
    private static class128 field2831 = class22.method156(126, " is already on your ignore list)3");

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Lmh;")
    public static class128 field2838 = class22.method156(127, "<col=00ffff>");

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "Z")
    public static boolean field2841 = false;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field2843 = -1;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "[B")
    public static byte[] field2844 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "Lmh;")
    public static class128 field2845 = class22.method156(125, "::gc");

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Lmh;")
    public static class128 field2829 = field2831;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Lem;")
    public static class10 field2839 = null;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Lmh;")
    public static class128 field2842 = class22.method156(123, "weiss:");

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "F")
    public static float field2835;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public int field2833;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public int field2834;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Ljava/awt/Image;")
    public Image field2840;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "[I")
    public int[] field2832;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljm;IIIII)V", line = 6)
    public static final void method1082(class226 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class130.field2271 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class297.field5067) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class155.field2670 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class150 var14 = class182.field3184[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class250.field4334[var11][var12 + 1][var13] + class250.field4334[var11][var12][var13] + class250.field4334[var11][var12][var13 + 1] + class250.field4334[var11][var12 + 1][var13 + 1]) / 4 - (class250.field4334[arg1][arg2 + 1][arg3] + class250.field4334[arg1][arg2][arg3] + class250.field4334[arg1][arg2][arg3 + 1] + class250.field4334[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class65 var16 = var14.field2571;
                                    if (var16 != null) {
                                        if (var16.field1252.method771()) {
                                            arg0.method779(var16.field1252, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1251 != null && var16.field1251.method771()) {
                                            arg0.method779(var16.field1251, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2576; var17++) {
                                        class5 var18 = var14.field2575[var17];
                                        if (var18 != null && var18.field105.method771() && (var18.field92 == var12 || var7 == var12) && (var18.field88 == var13 || var9 == var13)) {
                                            int var19 = var18.field96 + 1 - var18.field92;
                                            int var20 = var18.field86 + 1 - var18.field88;
                                            arg0.method779(var18.field105, (var18.field92 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field88 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 103)
    public final void method1083(int arg0) {
        class213.method1460(this.field2832, this.field2834, this.field2833);
        field2837++;
        if (arg0 != 128) {
            this.method1083(58);
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 153)
    protected class165() {
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 158)
    public static void method1084(int arg0) {
        field2831 = null;
        field2845 = null;
        field2839 = null;
        field2830 = null;
        field2842 = null;
        int var1 = -84 % ((68 - arg0) / 39);
        field2829 = null;
        field2838 = null;
        field2844 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method149(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method148(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    public abstract void method150(boolean arg0, int arg1, Component arg2, int arg3);
}
