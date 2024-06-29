import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class382 {

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "[B")
    public byte[] field5358 = new byte[18002];

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "[B")
    public byte[] field5372 = new byte[4096];

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "[I")
    public int[] field5361 = new int[256];

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "[B")
    public byte[] field5368 = new byte[18002];

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "[I")
    public int[] field5376 = new int[16];

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "[I")
    public int[] field5369 = new int[257];

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "[Z")
    public boolean[] field5370 = new boolean[16];

    @OriginalMember(owner = "client!sp", name = "H", descriptor = "[Z")
    public boolean[] field5384 = new boolean[256];

    @OriginalMember(owner = "client!sp", name = "A", descriptor = "[[I")
    public int[][] field5378 = new int[6][258];

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "[I")
    public int[] field5371 = new int[6];

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "[[B")
    public byte[][] field5367 = new byte[6][258];

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "I")
    public int field5386 = 0;

    @OriginalMember(owner = "client!sp", name = "L", descriptor = "I")
    public int field5388 = 0;

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "[[I")
    public int[][] field5385 = new int[6][258];

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "[[I")
    public int[][] field5382 = new int[6][258];

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "[B")
    public byte[] field5352 = new byte[256];

    @OriginalMember(owner = "client!sp", name = "C", descriptor = "[[[I")
    public static int[][][] field5380 = new int[2][][];

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "B")
    public byte field5387;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public int field5354;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public int field5355;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public int field5356;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public int field5357;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
    public int field5360;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    public int field5363;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    public int field5375;

    @OriginalMember(owner = "client!sp", name = "B", descriptor = "I")
    public int field5379;

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
    public int field5383;

    @OriginalMember(owner = "client!sp", name = "M", descriptor = "I")
    public int field5389;

    @OriginalMember(owner = "client!sp", name = "N", descriptor = "I")
    public int field5390;

    @OriginalMember(owner = "client!sp", name = "O", descriptor = "I")
    public int field5391;

    @OriginalMember(owner = "client!sp", name = "P", descriptor = "I")
    public int field5392;

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "Lnc;")
    public static class18 field5377;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Lbm;")
    public static class59 field5353;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "Ljj;")
    public static class60 field5364;

    @OriginalMember(owner = "client!sp", name = "D", descriptor = "Lclient;")
    public static client field5381;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "[B")
    public byte[] field5359;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "[B")
    public byte[] field5366;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lah;")
    public static final class215 method2453(Throwable arg0, String arg1) {
        field5362++;
        class215 var2;
        if (arg0 instanceof class215) {
            var2 = (class215) arg0;
            var2.field3037 = var2.field3037 + ' ' + arg1;
        } else {
            var2 = new class215(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIII)V")
    public static final void method2454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5373++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg3 * arg3;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - arg2) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg1 >= class388.field5464 && class219.field3080 >= arg1) {
            int var20 = class130.method805(true, class235.field3295, arg3 + arg5, class81.field946);
            int var21 = class130.method805(true, class235.field3295, arg5 - arg3, class81.field946);
            class296.method1954(arg0, var20, class291.field4067[arg1], var21, -1);
        }
        int var22 = (arg4 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var18 -= var15;
            var22 -= var15;
            var7--;
            int var23 = arg1 - var7;
            int var24 = arg1 + var7;
            if (class388.field5464 <= var24 && class219.field3080 >= var23) {
                int var25 = class130.method805(true, class235.field3295, arg5 + var6, class81.field946);
                int var26 = class130.method805(true, class235.field3295, arg5 - var6, class81.field946);
                if (class388.field5464 <= var23) {
                    class296.method1954(arg0, var25, class291.field4067[var23], var26, -1);
                }
                if (class219.field3080 >= var24) {
                    class296.method1954(arg0, var25, class291.field4067[var24], var26, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
    public static void method2455(int arg0) {
        field5377 = null;
        if (arg0 != 2) {
            method2457(-126);
        }
        field5364 = null;
        field5353 = null;
        field5380 = null;
        field5381 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2456(int arg0, int arg1) {
        field5365++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        int var4 = -94 % ((arg1 + 67) / 44);
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class255.field3681.method2331(25, class271.field3836) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class177.field2407.method2331(25, class271.field3836) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
    public static final void method2457(int arg0) {
        field5374++;
        if (class218.field3074 == -1 || class434.field6241 == -1) {
            return;
        }
        int var1 = ((class122.field1501 - class229.field3245) * class254.field3670 >> 16) + class229.field3245;
        class254.field3670 += var1;
        if (class254.field3670 < 65535) {
            class278.field3940 = false;
            class229.field3240 = false;
        } else {
            if (class278.field3940) {
                class229.field3240 = false;
            } else {
                class229.field3240 = true;
            }
            class254.field3670 = 65535;
            class278.field3940 = true;
        }
        float var2 = (float) class254.field3670 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class5.field85 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var22 = field5380[class218.field3074][var4][var5] * 3;
            int var23 = field5380[class218.field3074][var4 + 1][var5] * 3;
            int var24 = (field5380[class218.field3074][var4 + 2][var5] + field5380[class218.field3074][var4 + 2][var5] - field5380[class218.field3074][var4 + 3][var5]) * 3;
            int var25 = field5380[class218.field3074][var4][var5];
            int var26 = var23 - var22;
            int var27 = var22 + var24 - var23 * 2;
            int var28 = var23 + field5380[class218.field3074][var4 + 2][var5] - var25 - var24;
            var3[var5] = (((float) var28 * var2 + (float) var27) * var2 + (float) var26) * var2 + (float) var25;
        }
        class276.field3925 = (int) var3[1] * -1;
        class265.field3774 = (int) var3[2] - class41.field496 * 128;
        class334.field4730 = (int) var3[0] - class114.field1403 * 128;
        float[] var6 = new float[3];
        int var7 = class48.field572 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var15 = field5380[class434.field6241][var7][var8] * 3;
            int var16 = field5380[class434.field6241][var7 + 1][var8] * 3;
            int var17 = (field5380[class434.field6241][var7 + 2][var8] + field5380[class434.field6241][var7 + 2][var8] - field5380[class434.field6241][var7 + 3][var8]) * 3;
            int var18 = field5380[class434.field6241][var7][var8];
            int var19 = var16 - var15;
            int var20 = var15 + var17 - (var16 * 2);
            int var21 = field5380[class434.field6241][var7 + 2][var8] + var16 - var18 - var17;
            var6[var8] = (((float) var21 * var2 + (float) var20) * var2 + (float) var19) * var2 + (float) var18;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        int var14 = 75 % ((82 - arg0) / 36);
        class138.field1722 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class377.field5324 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class232.field3265 = field5380[class218.field3074][var4][3] + ((field5380[class218.field3074][var4 + 2][3] - field5380[class218.field3074][var4][3]) * class254.field3670 >> 16);
    }
}
