import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public abstract class class17 extends class184 {

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "Z")
    public boolean field225;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "[Lql;")
    public class17[] field211;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "Lsf;")
    private static class108 field210 = class140.method973(255, "Choose Option");

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "Lsf;")
    public static class108 field209 = field210;

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
    public static int field230 = 0;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "[I")
    public static int[] field213 = new int[128];

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "Lsf;")
    public static class108 field233 = class140.method973(255, "Fallen lassen");

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ql", name = "W", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ql", name = "Y", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ql", name = "Z", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "Lfd;")
    public class247 field217;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "Lik;")
    public static class262 field214;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "Lik;")
    public static class262 field221;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "Loa;")
    public class291 field224;

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "[I")
    public static int[] field235;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V", line = 5)
    public void method107(int arg0) {
        if (this.field225) {
            this.field217.method1701(arg0 - 25598);
            this.field217 = null;
        } else {
            this.field224.method2080(arg0 - 25599);
            this.field224 = null;
        }
        field236++;
        if (arg0 != 25600) {
            method110(-99, 119, 43);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BII)V", line = 31)
    public final void method108(byte arg0, int arg1, int arg2) {
        field226++;
        int var4 = this.field218 == 255 ? arg2 : this.field218;
        if (this.field225) {
            this.field217 = new class247(var4, arg2, arg1);
        } else {
            this.field224 = new class291(var4, arg2, arg1);
        }
        int var5 = -75 % ((arg0 + 43) / 54);
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)Lvk;", line = 62)
    public static final class173 method109(int arg0) {
        field222++;
        return arg0 == 3 ? class132.field2261 : (class173) null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)V", line = 74)
    public static final void method110(int arg0, int arg1, int arg2) {
        class120 var3 = class248.method1704(1, 79, arg2);
        if (arg0 == 0) {
            var3.method844((byte) -28);
            var3.field2066 = arg1;
            field215++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(III)[[I", line = 88)
    public final int[][] method111(int arg0, int arg1, int arg2) {
        field232++;
        if (arg0 != 3) {
            this.field224 = (class291) null;
        }
        if (this.field211[arg2].field225) {
            int[] var4 = this.field211[arg2].method120(-96, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field211[arg2].method122(false, arg1);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lik;Lol;Lik;B)V", line = 135)
    public static final void method112(class262 arg0, class235 arg1, class262 arg2, byte arg3) {
        class254.field4419 = arg1;
        field219++;
        class315.field5423 = arg2;
        if (arg3 != 47) {
            field213 = (int[]) null;
        }
        class215.field3810 = arg0;
        if (class315.field5423 != null) {
            class272.field4747 = class315.field5423.method1876(1, (byte) -107);
        }
        if (class215.field3810 != null) {
            class96.field1540 = class215.field3810.method1876(1, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZJIIB)Lsf;", line = 156)
    public static final class108 method113(boolean arg0, long arg1, int arg2, int arg3, byte arg4) {
        class108 var6 = class219.method1510(0, true);
        field227++;
        if (arg1 < 0L) {
            var6.method759(class232.field4103, false);
            arg1 = -arg1;
        }
        class108 var7 = class240.field4194;
        class108 var8 = class73.field1107;
        if (arg3 == 1) {
            var7 = class73.field1107;
            var8 = class240.field4194;
        }
        if (arg3 == 2) {
            var7 = class45.field655;
            var8 = class240.field4194;
        }
        if (arg4 <= 33) {
            method113(false, 104L, 50, 8, (byte) 70);
        }
        if (arg3 == 3) {
            var7 = class73.field1107;
            var8 = class240.field4194;
        }
        class108 var9 = class219.method1510(0, true);
        class108 var10 = class219.method1510(0, true);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method759(class79.method518(false, (int) (arg1 % 10L)), false);
            arg1 /= 10L;
        }
        if (arg1 == 0L) {
            var9 = class78.field1180;
        }
        int var12 = 0;
        while (arg1 > 0L) {
            if (arg0 && var12 != 0 && var12 % 3 == 0) {
                var9.method759(var7, false);
            }
            var9.method759(class79.method518(false, (int) (arg1 % 10L)), false);
            var12++;
            arg1 /= 10L;
        }
        if (var10.method776(0) > 0) {
            var10.method759(var8, false);
        }
        return class117.method833(new class108[] { var6, var9.method772(-33), var10.method772(-82) }, false);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLrm;I)V", line = 233)
    public void method114(byte arg0, class249 arg1, int arg2) {
        field228++;
        if (arg0 != -114) {
            this.method107(100);
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(II)V", line = 246)
    public static final void method115(int arg0, int arg1) {
        field231++;
        if (arg1 != 3) {
            method123(61);
        }
        class13.field145.method637(arg0, 119);
        class74.field1115.method637(arg0, 119);
        class272.field4753.method637(arg0, arg1 + 117);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)V", line = 262)
    public void method116(boolean arg0) {
        field220++;
        if (!arg0) {
            method110(26, 66, 90);
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)I", line = 290)
    public int method117(byte arg0) {
        field216++;
        if (arg0 > -81) {
            field209 = (class108) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V", line = 302)
    public static final void method118(int arg0) {
        field237++;
        if (class98.field1637 == -1 || class10.field128 == -1) {
            return;
        }
        int var1 = ((class109.field1915 - class45.field656) * class313.field5412 >> 16) + class45.field656;
        int var2 = 119 / ((-arg0 - 8) / 40);
        class313.field5412 += var1;
        if (class313.field5412 >= 65535) {
            class313.field5412 = 65535;
            if (class119.field2046) {
                class310.field5363 = false;
            } else {
                class310.field5363 = true;
            }
            class119.field2046 = true;
        } else {
            class119.field2046 = false;
            class310.field5363 = false;
        }
        float var3 = (float) class313.field5412 / 65535.0F;
        float[] var4 = new float[3];
        int var5 = class251.field4384 * 2;
        for (int var6 = 0; var6 < 3; var6++) {
            int var7 = class178.field3234[class98.field1637][var5][var6] * 3;
            int var8 = class178.field3234[class98.field1637][var5 + 1][var6] * 3;
            int var9 = (-class178.field3234[class98.field1637][var5 + 3][var6] - (-class178.field3234[class98.field1637][var5 + 2][var6] - class178.field3234[class98.field1637][var5 + 2][var6])) * 3;
            int var10 = var7 + var9 - (var8 * 2);
            int var11 = class178.field3234[class98.field1637][var5][var6];
            int var12 = var8 - var7;
            int var13 = class178.field3234[class98.field1637][var5 + 2][var6] - var11 - (-var8 - -var9);
            var4[var6] = (((float) var13 * var3 + (float) var10) * var3 + (float) var12) * var3 + (float) var11;
        }
        float[] var14 = new float[3];
        class42.field560 = (int) var4[1] * -1;
        class255.field4443 = (int) var4[2] - (class137.field2421 * 128);
        class15.field193 = (int) var4[0] - class305.field5295 * 128;
        int var15 = class325.field5536 * 2;
        for (int var16 = 0; var16 < 3; var16++) {
            int var17 = class178.field3234[class10.field128][var15][var16] * 3;
            int var18 = class178.field3234[class10.field128][var15 + 1][var16] * 3;
            int var19 = (class178.field3234[class10.field128][var15 + 2][var16] + class178.field3234[class10.field128][var15 + 2][var16] - class178.field3234[class10.field128][var15 + 3][var16]) * 3;
            int var20 = class178.field3234[class10.field128][var15][var16];
            int var21 = var18 - var17;
            int var22 = var17 + var19 - (var18 * 2);
            int var23 = var18 + class178.field3234[class10.field128][var15 + 2][var16] - var20 - var19;
            var14[var16] = (((float) var23 * var3 + (float) var22) * var3 + (float) var21) * var3 + (float) var20;
        }
        float var24 = var14[0] - var4[0];
        float var25 = var14[2] - var4[2];
        float var26 = (var14[1] - var4[1]) * -1.0F;
        double var27 = Math.sqrt((double) (var24 * var24 + var25 * var25));
        class35.field479 = (float) Math.atan2((double) var26, var27);
        class222.field3943 = -((float) Math.atan2((double) var24, (double) var25));
        class135.field2346 = (int) ((double) class35.field479 * 325.949D) & 0x7FF;
        class330.field5640 = (int) ((double) class222.field3943 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)I", line = 408)
    public int method119(int arg0) {
        field234++;
        int var2 = -2 / ((arg0 + 46) / 56);
        return -1;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(II)[I", line = 419)
    public int[] method120(int arg0, int arg1) {
        if (arg0 > -95) {
            return (int[]) null;
        } else {
            field223++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V", line = 443)
    public static void method121(int arg0) {
        field214 = null;
        field221 = null;
        field233 = null;
        field213 = null;
        field210 = null;
        field235 = null;
        if (arg0 != -27746) {
            field214 = (class262) null;
        }
        field209 = null;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(IZ)V", line = 457)
    public class17(int arg0, boolean arg1) {
        this.field225 = arg1;
        this.field211 = new class17[arg0];
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)[[I", line = 469)
    public int[][] method122(boolean arg0, int arg1) {
        if (arg0) {
            return (int[][]) ((int[][]) null);
        } else {
            field239++;
            throw new IllegalStateException("This operation does not have a colour output");
        }
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)V", line = 480)
    public static final void method123(int arg0) {
        field229++;
        class272.field4751.method138((byte) -82);
        for (int var1 = arg0; var1 < 32; var1++) {
            class52.field775[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class229.field3993[var2] = 0L;
        }
        class91.field1438 = 0;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(III)[I", line = 522)
    public final int[] method124(int arg0, int arg1, int arg2) {
        field238++;
        if (arg0 < 48) {
            this.field225 = true;
        }
        return this.field211[arg1].field225 ? this.field211[arg1].method120(-113, arg2) : this.field211[arg1].method122(false, arg2)[0];
    }
}
