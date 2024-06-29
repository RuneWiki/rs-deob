import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class289 implements Runnable {

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "[Lck;")
    public volatile class351[] field3933 = new class351[2];

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Z")
    public volatile boolean field3929 = false;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Z")
    public volatile boolean field3927 = false;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field3931 = 0;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "[I")
    public static int[] field3935 = new int[50];

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Llg;")
    public static class20 field3932;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Llh;")
    public class450 field3928;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "[Z")
    public static boolean[] field3940;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static final void method1710(int arg0) {
        field3938++;
        if (class141.field1804 == -1 || class61.field622 == -1) {
            return;
        }
        int var1 = ((class438.field6400 - class379.field5358) * class294.field3995 >> 16) + class379.field5358;
        class294.field3995 += var1;
        if (class294.field3995 >= 65535) {
            class294.field3995 = 65535;
            if (class236.field3257) {
                class438.field6398 = false;
            } else {
                class438.field6398 = true;
            }
            class236.field3257 = true;
        } else {
            class438.field6398 = false;
            class236.field3257 = false;
        }
        float var2 = (float) class294.field3995 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class53.field521 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class351.field4903[class141.field1804][var4][var5] * 3;
            int var22 = class351.field4903[class141.field1804][var4 + 1][var5] * 3;
            int var23 = (class351.field4903[class141.field1804][var4 + 2][var5] + class351.field4903[class141.field1804][var4 - -2][var5] - class351.field4903[class141.field1804][var4 + 3][var5]) * 3;
            int var24 = class351.field4903[class141.field1804][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class351.field4903[class141.field1804][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class180.field2272 = (int) var3[2] - class291.field3961 * 128;
        class127.field1633 = (int) var3[0] - (class70.field767 * 128);
        class175.field2197 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class398.field5728 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class351.field4903[class61.field622][var7][var8] * 3;
            int var15 = class351.field4903[class61.field622][var7 + 1][var8] * 3;
            int var16 = (class351.field4903[class61.field622][var7 + 2][var8] + class351.field4903[class61.field622][var7 + 2][var8] - class351.field4903[class61.field622][var7 + 3][var8]) * 3;
            int var17 = class351.field4903[class61.field622][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = class351.field4903[class61.field622][var7 + 2][var8] - (var17 - var15) - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        if (arg0 != 4602) {
            field3935 = null;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class67.field700 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class308.field4177 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class92.field1054 = class351.field4903[class141.field1804][var4][3] + ((class351.field4903[class141.field1804][var4 + 2][3] - class351.field4903[class141.field1804][var4][3]) * class294.field3995 >> 16);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static final void method1711(byte arg0) {
        field3937++;
        if (class216.field2897) {
            return;
        }
        int var1 = -81 / ((-arg0 - 79) / 39);
        class216.field2897 = true;
        class69.field726 = true;
        if (class165.field2104) {
            class425.field6241 = (float) ((int) class425.field6241 - 65 & 0xFFFFFF80);
        } else {
            class335.field4460 += (-24.0F - class335.field4460) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public static void method1712(int arg0) {
        field3935 = null;
        field3932 = null;
        field3940 = null;
        if (arg0 >= -81) {
            method1710(7);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)V")
    public static final void method1713(int arg0, byte arg1) {
        class98.field1165 = arg0;
        field3930++;
        class428.field6284 = -1;
        class68.field715 = -1;
        if (arg1 > -79) {
            field3940 = null;
        }
        class176.method925(true);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLc;)V")
    public static final void method1714(byte arg0, class158 arg1) {
        if (arg0 != -17) {
            return;
        }
        field3934++;
        class319 var2 = (class319) class420.field6128.method308((long) arg1.field6095, (byte) -125);
        if (var2 == null) {
            class222.method1203(arg0 ^ 0x10, 0, arg1.field6109[0], arg1.field6119[0], (class91) null, arg1, class263.field3592, (class225) null);
        } else {
            var2.method1843(arg0 + 17);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1715(int arg0, int arg1) {
        if (arg1 != 3272) {
            method1713(-44, (byte) -116);
        }
        field3939++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class448.field6517 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class65.field677 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!hg", name = "run", descriptor = "()V")
    public final void run() {
        this.field3927 = true;
        field3936++;
        try {
            while (!this.field3929) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class351 var2 = this.field3933[var1];
                    if (var2 != null) {
                        var2.method2156(255);
                    }
                }
                class370.method2235(10L, 10);
                class411.method2559(this.field3928, 107, (Object) null);
            }
        } catch (Exception var9) {
            class254.method1439(22292, var9, (String) null);
        } finally {
            Object var6 = null;
            this.field3927 = false;
        }
    }
}
