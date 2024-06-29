import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class285 extends class192 {

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "Loh;")
    public static class258 field4901 = class153.method1046("::rect_debug", 119);

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
    public static volatile int field4914 = 0;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "Loh;")
    public class258 field4917;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "[I")
    public int[] field4907;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "[I")
    public int[] field4909;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "[I")
    public int[] field4912;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "[I")
    public int[] field4913;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 4)
    public static final int method1996(int arg0, Random arg1, int arg2) {
        field4916++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class210.method1384(true, arg2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            if (arg0 != 1) {
                method2004(68, (byte[]) null, -40, 80);
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class287.method2022(var4, 74, arg2);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(Z)V", line = 40)
    public static final void method1997(boolean arg0) {
        field4911++;
        if (class205.field3554 == -1 || class57.field897 == -1) {
            return;
        }
        int var1 = ((class310.field5251 - client.field624) * class47.field706 >> 16) + client.field624;
        class47.field706 += var1;
        if (class47.field706 < 65535) {
            class167.field2826 = false;
            class31.field371 = false;
        } else {
            if (class167.field2826) {
                class31.field371 = false;
            } else {
                class31.field371 = true;
            }
            class47.field706 = 65535;
            class167.field2826 = true;
        }
        float var2 = (float) class47.field706 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class85.field1435 * 2;
        if (!arg0) {
            method2007((byte) -99, 30, -81, -125, 125, 44);
        }
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class82.field1385[class205.field3554][var4][var5] * 3;
            int var7 = class82.field1385[class205.field3554][var4 + 1][var5] * 3;
            int var8 = (class82.field1385[class205.field3554][var4 + 2][var5] + class82.field1385[class205.field3554][var4 - -2][var5] - class82.field1385[class205.field3554][var4 + 3][var5]) * 3;
            int var9 = class82.field1385[class205.field3554][var4][var5];
            int var10 = var7 - var6;
            int var11 = var6 + var8 - (var7 * 2);
            int var12 = class82.field1385[class205.field3554][var4 + 2][var5] - (var9 - var7) - var8;
            var3[var5] = (((float) var12 * var2 + (float) var11) * var2 + (float) var10) * var2 + (float) var9;
        }
        float[] var13 = new float[3];
        class245.field4258 = (int) var3[1] * -1;
        class61.field1086 = (int) var3[2] - class311.field5271 * 128;
        field4906 = (int) var3[0] - (class229.field3955 * 128);
        int var14 = class39.field561 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class82.field1385[class57.field897][var14][var15] * 3;
            int var17 = class82.field1385[class57.field897][var14][var15];
            int var18 = class82.field1385[class57.field897][var14 + 1][var15] * 3;
            int var19 = var18 - var16;
            int var20 = (class82.field1385[class57.field897][var14 + 2][var15] + class82.field1385[class57.field897][var14 + 2][var15] - class82.field1385[class57.field897][var14 + 3][var15]) * 3;
            int var21 = var16 + var20 - (var18 * 2);
            int var22 = var18 + class82.field1385[class57.field897][var14 + 2][var15] - var20 - var17;
            var13[var15] = (((float) var22 * var2 + (float) var21) * var2 + (float) var19) * var2 + (float) var17;
        }
        float var23 = var13[0] - var3[0];
        float var24 = (var13[1] - var3[1]) * -1.0F;
        float var25 = var13[2] - var3[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class5.field74 = (float) Math.atan2((double) var24, var26);
        class258.field4457 = -((float) Math.atan2((double) var23, (double) var25));
        class90.field1576 = (int) ((double) class258.field4457 * 325.949D) & 0x7FF;
        class106.field1894 = (int) ((double) class5.field74 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V", line = 147)
    public final void method1998(int arg0) {
        if (this.field4912 != null) {
            for (int var2 = 0; var2 < this.field4912.length; var2++) {
                this.field4912[var2] = class307.method2139(this.field4912[var2], 32768);
            }
        }
        field4910++;
        if (arg0 == 31562 && this.field4907 != null) {
            for (int var3 = 0; var3 < this.field4907.length; var3++) {
                this.field4907[var3] = class307.method2139(this.field4907[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lva;II)V", line = 177)
    private final void method1999(class235 arg0, int arg1, int arg2) {
        if (arg2 != -4) {
            return;
        }
        field4908++;
        if (arg1 == 1) {
            this.field4917 = arg0.method1620(95);
        } else if (arg1 == 2) {
            int var7 = arg0.method1589(76);
            this.field4913 = new int[var7];
            this.field4907 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4907[var8] = arg0.method1615(arg2 - 114);
                int var9 = arg0.method1589(108);
                if (var9 == 0) {
                    this.field4913[var8] = -1;
                } else {
                    this.field4913[var8] = var9;
                }
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method1589(arg2 ^ 0xFFFFFFBE);
            this.field4909 = new int[var4];
            this.field4912 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4912[var5] = arg0.method1615(-126);
                int var6 = arg0.method1589(92);
                if (var6 == 0) {
                    this.field4909[var5] = -1;
                } else {
                    this.field4909[var5] = var6;
                }
            }
        } else if (arg1 == 4) {
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILoh;III)V", line = 261)
    public static final void method2000(int arg0, class258 arg1, int arg2, int arg3, int arg4) {
        field4921++;
        class171 var5 = class10.method65(arg0, false, arg3);
        if (var5 == null) {
            return;
        }
        if (var5.field2953 != null) {
            class42 var6 = new class42();
            var6.field598 = var5;
            var6.field600 = var5.field2953;
            var6.field575 = arg1;
            var6.field580 = arg2;
            class193.method1303(200000, var6);
        }
        boolean var7 = true;
        if (var5.field2924 > 0) {
            var7 = class26.method200((byte) -128, var5);
        }
        if (!var7 || !class202.method1344(client.method354(var5), true, arg2 - 1)) {
            return;
        }
        if (arg2 == 1) {
            class84.field1420++;
            class159.field2710.method885(243, -99);
            class159.field2710.method1577(true, arg0);
            class159.field2710.method1605(arg3, (byte) 117);
        }
        if (arg4 < 111) {
            method2006(91);
        }
        if (arg2 == 2) {
            class113.field1951++;
            class159.field2710.method885(64, -118);
            class159.field2710.method1577(true, arg0);
            class159.field2710.method1605(arg3, (byte) 93);
        }
        if (arg2 == 3) {
            class159.field2710.method885(127, -79);
            class159.field2710.method1577(true, arg0);
            class237.field4149++;
            class159.field2710.method1605(arg3, (byte) 76);
        }
        if (arg2 == 4) {
            class202.field3501++;
            class159.field2710.method885(117, -82);
            class159.field2710.method1577(true, arg0);
            class159.field2710.method1605(arg3, (byte) 95);
        }
        if (arg2 == 5) {
            class95.field1668++;
            class159.field2710.method885(201, -112);
            class159.field2710.method1577(true, arg0);
            class159.field2710.method1605(arg3, (byte) 67);
        }
        if (arg2 == 6) {
            class128.field2277++;
            class159.field2710.method885(134, -120);
            class159.field2710.method1577(true, arg0);
            class159.field2710.method1605(arg3, (byte) 100);
        }
        if (arg2 == 7) {
            class314.field5324++;
            class159.field2710.method885(132, -125);
            class159.field2710.method1577(true, arg0);
            class159.field2710.method1605(arg3, (byte) 85);
        }
        if (arg2 == 8) {
            class166.field2814++;
            class159.field2710.method885(244, -106);
            class159.field2710.method1577(true, arg0);
            class159.field2710.method1605(arg3, (byte) 118);
        }
        if (arg2 == 9) {
            class159.field2708++;
            class159.field2710.method885(233, -89);
            class159.field2710.method1577(true, arg0);
            class159.field2710.method1605(arg3, (byte) 124);
        }
        if (arg2 == 10) {
            class243.field4215++;
            class159.field2710.method885(240, -122);
            class159.field2710.method1577(true, arg0);
            class159.field2710.method1605(arg3, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)I", line = 391)
    public final int method2001(int arg0, int arg1) {
        field4918++;
        if (this.field4907 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field4907.length; var3++) {
            if (this.field4913[var3] == arg0) {
                return this.field4907[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)I", line = 412)
    public static final int method2002(int arg0, boolean arg1) {
        field4919++;
        if (!arg1) {
            method2000(-68, (class258) null, 114, 123, 64);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)I", line = 428)
    public final int method2003(int arg0, byte arg1) {
        field4905++;
        if (this.field4912 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4912.length; var3++) {
            if (this.field4909[var3] == arg0) {
                return this.field4912[var3];
            }
        }
        int var4 = 38 / ((arg1 + 65) / 33);
        return -1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[BII)Loh;", line = 456)
    public static final class258 method2004(int arg0, byte[] arg1, int arg2, int arg3) {
        field4902++;
        class258 var4 = new class258();
        var4.field4490 = new byte[arg0];
        var4.field4478 = arg3;
        for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
            if (arg1[var5] != 0) {
                var4.field4490[var4.field4478++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[B)[B", line = 487)
    public static final byte[] method2005(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (arg0 != 2) {
            field4914 = 7;
        }
        class275.method1932(arg1, 0, var3, 0, var2);
        field4915++;
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V", line = 502)
    public static final void method2006(int arg0) {
        class259.field4509.method1161(arg0 ^ 0x37);
        field4903++;
        if (arg0 != 0) {
            method2002(-35, true);
        }
        class253.field4357.method1161(116);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIIIII)V", line = 516)
    public static final void method2007(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4904++;
        if (arg5 >= class75.field1314 && arg2 <= class206.field3562 && class241.field4189 <= arg3 && arg1 <= class94.field1654) {
            class120.method877(arg3, arg4, arg1, arg2, -24, arg5);
        } else {
            class207.method1369(arg2, arg1, arg4, (byte) 27, arg3, arg5);
        }
        if (arg0 >= -37) {
            field4901 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(B)V", line = 535)
    public static void method2008(byte arg0) {
        if (arg0 > -102) {
            field4914 = 111;
        }
        field4901 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lva;I)V", line = 545)
    public final void method2009(class235 arg0, int arg1) {
        if (arg1 != 3) {
            return;
        }
        field4920++;
        while (true) {
            int var3 = arg0.method1589(90);
            if (var3 == 0) {
                return;
            }
            this.method1999(arg0, var3, arg1 - 7);
        }
    }
}
