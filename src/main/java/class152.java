import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class152 {

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lid;")
    public static class60 field3403 = class11.method72("Bitte entfernen Sie ", (byte) 109);

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lid;")
    public static class60 field3405 = class11.method72("null", (byte) -104);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lid;")
    public static class60 field3402 = class11.method72("p12_full", (byte) 95);

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "[Lid;")
    public static class60[] field3406 = new class60[1000];

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Lid;")
    public static class60 field3412 = class11.method72("me", (byte) 124);

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Ljd;")
    public static class66 field3400 = new class66();

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "Lid;")
    private static class60 field3418 = class11.method72("Enter your username (V password)3", (byte) -128);

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "Lid;")
    public static class60 field3419 = class11.method72("Ung-Ultiges Anmelde)2Paket)3", (byte) -56);

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Lid;")
    public static class60 field3416 = field3418;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "J")
    public static long field3415;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Lwb;")
    public static class155 field3397;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field3399;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "[I")
    public int[] field3407;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "[[S")
    public static short[][] field3401;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "[[[B")
    public static byte[][][] field3417;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public final void method1156(int arg0) {
        if (arg0 > 70) {
            field3404++;
            class130.method1032(this.field3407, this.field3411, this.field3408);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public static void method1157(int arg0) {
        field3416 = null;
        field3400 = null;
        field3405 = null;
        field3406 = null;
        field3401 = null;
        field3402 = null;
        field3412 = null;
        field3397 = null;
        field3419 = null;
        if (arg0 != 1) {
            method1160(-76, null, null, -30, -60, null);
        }
        field3403 = null;
        field3418 = null;
        field3417 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method59(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[Lid;II)Lid;")
    public static final class60 method1158(int arg0, class60[] arg1, int arg2, int arg3) {
        if (arg3 != 25692) {
            return null;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg1[arg2 + var5] == null) {
                arg1[arg2 + var5] = class53.field1344;
            }
            var4 += arg1[arg2 + var5].field1474;
        }
        field3413++;
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg0; var8++) {
            class60 var10 = arg1[arg2 + var8];
            class149.method1136(var10.field1453, 0, var6, var7, var10.field1474);
            var7 += var10.field1474;
        }
        class60 var9 = new class60();
        var9.field1474 = var4;
        var9.field1453 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lfd;I)Z")
    public static final boolean method1159(class40 arg0, int arg1) {
        int var2 = arg0.field966;
        field3410++;
        if (var2 == 205) {
            class125.field2872 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = var2 & 0x1;
            int var4 = (var2 - 300) / 2;
            class69.field1646.method135(var3 == 1, var4, 0);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = var2 & 0x1;
            int var6 = (var2 - 314) / 2;
            class69.field1646.method133(var6, var5 == 1, true);
        }
        if (arg1 == var2) {
            class69.field1646.method144(false, -105);
        }
        if (var2 == 325) {
            class69.field1646.method144(true, -89);
        }
        if (var2 == 326) {
            class22.field519.method1214(174, 0);
            class69.field1646.method134(-3975, class22.field519);
            class105.field2565++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method63(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
    public abstract void method60(int arg0, Component arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILl;[BII[Lpb;)V")
    public static final void method1160(int arg0, class76 arg1, byte[] arg2, int arg3, int arg4, class106[] arg5) {
        field3398++;
        if (arg4 != 4054) {
            method1157(86);
        }
        class103 var6 = new class103(arg2);
        int var7 = -1;
        while (true) {
            int var8 = var6.method835(-24298);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method835(-24298);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method829((byte) 84);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg0 + var12;
                int var18 = arg3 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    int var19 = var13;
                    if ((class124.field2869[1][var17][var18] & 0x2) == 2) {
                        var19 = var13 - 1;
                    }
                    class106 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg5[var19];
                    }
                    class139.method1083(var7, arg1, var18, true, var15, var13, var16, var17, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    protected class152() {
    }
}
