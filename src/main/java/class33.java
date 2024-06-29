import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class33 {

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "[F")
    public static float[] field514 = new float[4];

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
    public static int field517 = -1;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)[B")
    public static final byte[] method306(int arg0, int arg1) {
        field519++;
        if (arg0 != 11276) {
            method306(-20, 20);
        }
        class82 var2 = (class82) class656.field9046.method901((long) arg1, -50);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class93.method822(var4, -1, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class82(var3);
            class656.field9046.method897((long) arg1, var2, false);
        }
        return var2.field1116;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZI)Lmca;")
    public final class33 method307(boolean arg0, int arg1) {
        if (arg0) {
            this.field521 = 7;
        }
        field515++;
        return new class33(this.field521, arg1, this.field520, this.field512);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILes;)Lvn;")
    public static final class332 method308(int arg0, class403 arg1) {
        field518++;
        if (arg0 != 20118) {
            method308(-9, null);
        }
        int var2 = arg1.method2390((byte) 2);
        class105 var3 = class625.method3549((byte) 126)[arg1.method2396((byte) 101)];
        class4 var4 = class716.method4046((byte) 127)[arg1.method2396((byte) -110)];
        int var5 = arg1.method2365(true);
        int var6 = arg1.method2365(true);
        return new class332(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
    public static void method309(int arg0) {
        if (arg0 != 512) {
            method309(122);
        }
        field514 = null;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IJ)V")
    public static final void method310(int arg0, long arg1) {
        if (arg0 != 1175895560) {
            field514 = null;
        }
        field516++;
        if (class107.field1351 != null) {
            if (class7.field100 == 1 || class7.field100 == 5) {
                class96.method835(arg0 - 1175906983, arg1);
            } else if (class7.field100 == 4) {
                class95.method831(1, arg1);
            }
        }
        class591.method3388(0, (long) class228.field2707, class363.field4526);
        if (class131.field1615 != -1) {
            class250.method1496(class131.field1615, -1394622263);
        }
        for (int var3 = 0; var3 < class104.field1332; var3++) {
            if (class255.field2977[var3]) {
                class417.field5443[var3] = true;
            }
            class704.field9908[var3] = class255.field2977[var3];
            class255.field2977[var3] = false;
        }
        class287.field3446 = class228.field2707;
        class453.method2748(-1, -1, true, null);
        class23.method246(-1, (byte) 121, -1, null);
        if (class131.field1615 != -1) {
            class104.field1332 = 0;
            class455.method2754((byte) -29);
        }
        class363.field4526.method634();
        class95.method830(arg0 ^ 0xB9E9419D, class363.field4526);
        int var4 = class619.method3510(-126);
        if (var4 == -1) {
            var4 = class680.field9309;
        }
        if (var4 == -1) {
            var4 = class481.field6720;
        }
        class612.method3467(var4, (byte) 24);
        int var5 = class300.field3596.method1665(1720746760) << 8;
        class212.method1337(false, class300.field3596.field823 + var5, class300.field3596.field808, class190.field2279, class300.field3596.field813 + var5);
        class190.field2279 = 0;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(IIII)V")
    public class33(int arg0, int arg1, int arg2, int arg3) {
        this.field521 = arg0;
        this.field512 = arg3;
        this.field511 = arg1;
        this.field520 = arg2;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
    public static final void method311(byte arg0) {
        field513++;
        if (client.field3934 == -1 || class267.field3160 == -1) {
            return;
        }
        int var1 = ((class243.field2874 - class186.field2250) * class666.field9158 >> 16) + class186.field2250;
        class666.field9158 += var1;
        if (class666.field9158 >= 65535) {
            if (class346.field4332) {
                class62.field841 = false;
            } else {
                class62.field841 = true;
            }
            class666.field9158 = 65535;
            class346.field4332 = true;
        } else {
            class62.field841 = false;
            class346.field4332 = false;
        }
        float var2 = (float) class666.field9158 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class519.field7325 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class750.field10402[client.field3934][var4][var5] * 3;
            int var22 = class750.field10402[client.field3934][var4 + 1][var5] * 3;
            int var23 = (class750.field10402[client.field3934][var4 + 2][var5] + class750.field10402[client.field3934][var4 + 2][var5] - class750.field10402[client.field3934][var4 + 3][var5]) * 3;
            int var24 = class750.field10402[client.field3934][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 - (var22 * 2 - var23);
            int var27 = class750.field10402[client.field3934][var4 + 2][var5] - (var23 - var22) - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class350.field4366 = (int) var3[2] - (class620.field8435 * 512);
        class303.field3622 = (int) var3[1] * -1;
        class599.field8107 = (int) var3[0] - class632.field8626 * 512;
        float[] var6 = new float[3];
        if (arg0 < 24) {
            field514 = null;
        }
        int var7 = class633.field8641 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class750.field10402[class267.field3160][var7][var8] * 3;
            int var15 = class750.field10402[class267.field3160][var7 + 1][var8] * 3;
            int var16 = (-class750.field10402[class267.field3160][var7 + 3][var8] - (-class750.field10402[class267.field3160][var7 + 2][var8] - class750.field10402[class267.field3160][var7 + 2][var8])) * 3;
            int var17 = class750.field10402[class267.field3160][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = class750.field10402[class267.field3160][var7 + 2][var8] - (var16 - var15) - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class793.field10893 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class111.field1405 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class641.field8758 = ((class750.field10402[client.field3934][var4 + 2][3] - class750.field10402[client.field3934][var4][3]) * class666.field9158 >> 16) + class750.field10402[client.field3934][var4][3];
    }
}
