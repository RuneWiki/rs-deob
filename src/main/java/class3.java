import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class3 extends class103 {

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "[I")
    public int[] field30 = new int[5];

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public int field40 = 0;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "[Ljg;")
    public class37[] field48 = new class37[5];

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public int field43;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public int field46;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Lda;")
    public static class275 field21 = class255.method1672(116, "");

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field28 = 0;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field27 = 0;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field31 = 0;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public int field42;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "Lfe;")
    public class111 field44;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "Ltf;")
    public class119 field41;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "Lh;")
    public class139 field50;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "Lhi;")
    public class147 field45;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "Lud;")
    public class214 field39;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Lda;")
    public static class275 field19;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "Lhb;")
    public class3 field32;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "Ljk;")
    public static class58 field24;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "Lci;")
    public class71 field37;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "Z")
    public boolean field35;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "Z")
    public boolean field38;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "Z")
    public boolean field47;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Lud;")
    public static final class214 method9(int arg0, int arg1, int arg2) {
        class3 var3 = class235.field4101[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class214 var4 = var3.field39;
            var3.field39 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lij;I)V")
    public static final void method10(class85 arg0, int arg1) {
        byte[] var2 = new byte[24];
        field25++;
        if (arg1 != 3) {
            method9(-10, -101, 78);
        }
        if (class150.field2612 != null) {
            try {
                class150.field2612.method1650((byte) 96, 0L);
                class150.field2612.method1651(0, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method563(24, (byte) 124, var2, 0);
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V")
    public static final void method11(int arg0) {
        field23++;
        if (class29.field434 == -1 || class44.field750 == -1) {
            return;
        }
        int var1 = ((class231.field4037 - class29.field440) * class60.field1016 >> 16) + class29.field440;
        class60.field1016 += var1;
        int var2 = class85.field1383 * 2;
        float[] var3 = new float[3];
        if (class60.field1016 < 65535) {
            class219.field3717 = false;
            class228.field3852 = false;
        } else {
            class60.field1016 = 65535;
            if (class228.field3852) {
                class219.field3717 = false;
            } else {
                class219.field3717 = true;
            }
            class228.field3852 = true;
        }
        float var4 = (float) class60.field1016 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class35.field575[class29.field434][var2 + 1][var5] * 3;
            int var22 = class35.field575[class29.field434][var2][var5] * 3;
            int var23 = (class35.field575[class29.field434][var2 + 2][var5] + class35.field575[class29.field434][var2 + 2][var5] - class35.field575[class29.field434][var2 + 3][var5]) * 3;
            int var24 = var21 - var22;
            int var25 = var22 + var23 - (var21 * 2);
            int var26 = class35.field575[class29.field434][var2][var5];
            int var27 = class35.field575[class29.field434][var2 + 2][var5] + var21 - var26 - var23;
            var3[var5] = (((float) var27 * var4 + (float) var25) * var4 + (float) var24) * var4 + (float) var26;
        }
        class195.field3335 = (int) var3[2] - (class234.field4083 * 128);
        class123.field2204 = (int) var3[0] - class16.field237 * 128;
        class83.field1349 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class134.field2381 * 2;
        if (arg0 != -1243) {
            method14((class118[]) null, 25, 65, true, (byte[]) null, -93);
        }
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class35.field575[class44.field750][var7][var8] * 3;
            int var15 = class35.field575[class44.field750][var7 + 1][var8] * 3;
            int var16 = class35.field575[class44.field750][var7][var8];
            int var17 = (class35.field575[class44.field750][var7 + 2][var8] + class35.field575[class44.field750][var7 + 2][var8] - class35.field575[class44.field750][var7 + 3][var8]) * 3;
            int var18 = var15 - var14;
            int var19 = class35.field575[class44.field750][var7 + 2][var8] + var15 - var16 - var17;
            int var20 = var17 + var14 - (var15 * 2);
            var6[var8] = (((float) var19 * var4 + (float) var20) * var4 + (float) var18) * var4 + (float) var16;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class270.field4696 = (float) Math.atan2((double) var10, var12);
        class208.field3519 = -((float) Math.atan2((double) var9, (double) var11));
        class251.field4454 = (int) ((double) class270.field4696 * 325.949D) & 0x7FF;
        class224.field3800 = (int) ((double) class208.field3519 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
    public static final void method12(int arg0) {
        if (arg0 >= -65) {
            method9(-39, 66, -115);
        }
        field22++;
        class113.field2002++;
    }

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)Lrk;")
    public static final class20 method13(int arg0) {
        field26++;
        class20 var1 = new class20(class267.field4646, class250.field4419, class114.field2010[0], class246.field4357[0], class152.field2662[0], class32.field480[arg0], class67.field1101[0], class270.field4695);
        class134.method978(-104);
        return var1;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([Lcg;IIZ[BI)V")
    public static final void method14(class118[] arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5) {
        class85 var6 = new class85(arg4);
        field20++;
        int var7 = -1;
        while (true) {
            int var8 = var6.method587(22277);
            if (var8 == 0) {
                if (arg2 != 2) {
                    field24 = null;
                    return;
                }
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method593((byte) -106);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 & 0x3F;
                int var13 = var6.method564((byte) 50);
                int var14 = var9 >> 12;
                int var15 = var13 >> 2;
                int var16 = arg5 + var11;
                int var17 = var13 & 0x3;
                int var18 = arg1 + var12;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class118 var19 = null;
                    if (!arg3) {
                        int var20 = var14;
                        if ((class72.field1168[1][var16][var18] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class46.method275(var14, var7, var14, var16, !arg3, var15, var18, arg3, var17, var19, arg2 - 235390932);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III)V")
    public class3(int arg0, int arg1, int arg2) {
        this.field43 = this.field34 = arg0;
        this.field46 = arg1;
        this.field36 = arg2;
    }

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "(I)V")
    public static void method15(int arg0) {
        field21 = null;
        int var1 = 90 % ((-arg0 - 13) / 42);
        field19 = null;
        field24 = null;
    }
}
