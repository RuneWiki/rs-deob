import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public abstract class class173 {

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "S")
    public static short field3295 = 320;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Ldc;")
    private static class37 field3292 = class185.method1233((byte) 86, "flash3:");

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[Lgb;")
    public static class68[] field3294 = new class68[26];

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Ldc;")
    public static class37 field3296 = class185.method1233((byte) 86, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field3301 = 0;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Ldc;")
    public static class37 field3305 = field3292;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Ldc;")
    public static class37 field3307 = field3292;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public int field3299;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field3298;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "[I")
    public int[] field3300;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method394(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIZI[Lp;II[B)V")
    public static final void method1167(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class163[] arg7, int arg8, int arg9, byte[] arg10) {
        if (arg9 != -1137131194) {
            field3301 = 8;
        }
        field3291++;
        int var11 = -1;
        class28 var12 = new class28(arg10);
        while (true) {
            int var13 = var12.method186((byte) 113);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method186((byte) 16);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var12.method215(-1797813752);
                int var19 = var18 & 0x3;
                int var20 = var18 >> 2;
                int var21 = var14 >> 12;
                if (arg6 == var21 && arg3 <= var17 && var17 < arg3 + 8 && var16 >= arg2 && arg2 + 8 > var16) {
                    class30 var22 = class73.method519(var11, -21035);
                    int var23 = class9.method63(var22.field562, true, var16 & 0x7, var17 & 0x7, arg1, var22.field560, var19) + arg4;
                    int var24 = arg8 + class140.method981(var17 & 0x7, var19, var16 & 0x7, var22.field560, var22.field562, arg1, (byte) -111);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class163 var25 = null;
                        if (!arg5) {
                            int var26 = arg0;
                            if ((class193.field3602[1][var23][var24] & 0x2) == 2) {
                                var26 = arg0 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg7[var26];
                            }
                        }
                        class82.method565(var24, var25, var19 + arg1 & 0x3, class16.field259, arg0, !arg5, var20, -115, arg0, var23, arg5, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ldc;Ldc;ILdc;I)V")
    public static final void method1168(class37 arg0, class37 arg1, int arg2, class37 arg3, int arg4) {
        field3303++;
        class203.method1334(arg2, arg4, arg1, arg0, arg3, (byte) -123);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
    public abstract void method393(int arg0, int arg1, byte arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method392(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public final void method1169(byte arg0) {
        if (arg0 > -65) {
            field3292 = null;
        }
        class48.method400(this.field3300, this.field3299, this.field3297);
        field3293++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
    public static final void method1170(int arg0, int arg1, int arg2) {
        class152 var3 = class229.method1487(arg1, false);
        field3306++;
        int var4 = var3.field2881;
        int var5 = var3.field2880;
        int var6 = var3.field2885;
        if (arg0 != 0) {
            method1171(-80);
        }
        int var7 = class113.field2024[var5 - var6];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var6;
        class159.field3011[var4] = class138.method960(class58.method449(~var8, class159.field3011[var4]), class58.method449(arg2 << var6, var8));
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method1171(int arg0) {
        field3307 = null;
        int var1 = 107 % ((arg0 + 40) / 35);
        field3296 = null;
        field3292 = null;
        field3305 = null;
        field3294 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lwa;Lwa;I)V")
    public static final void method1172(class238 arg0, class238 arg1, int arg2) {
        field3302++;
        class176.field3327 = arg0;
        class131.field2452 = arg1;
        if (arg2 != 1949) {
            field3301 = 39;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    protected class173() {
    }
}
