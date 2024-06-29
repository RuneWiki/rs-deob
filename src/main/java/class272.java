import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class272 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field4579 = 0;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lhi;")
    public static class82 field4583 = class95.method664((byte) -91, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field4582 = 1;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "Lhi;")
    public static class82 field4589 = class95.method664((byte) -90, " x ");

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "J")
    public static volatile long field4586 = 0L;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Z")
    public static boolean field4585 = false;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Lhi;")
    public static class82 field4588 = class95.method664((byte) -41, "comp-Btence ");

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "[Lti;")
    public static class186[] field4584;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 4)
    public static void method1901(int arg0) {
        field4589 = null;
        field4588 = null;
        if (arg0 < 84) {
            method1905(-116, 53);
        }
        field4583 = null;
        field4584 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V", line = 23)
    public static final void method1902(boolean arg0) {
        field4581++;
        if (class28.field369 == -1 || class224.field3895 == -1) {
            return;
        }
        int var1 = ((class289.field4850 - class294.field4930) * class164.field2876 >> 16) + class294.field4930;
        class164.field2876 += var1;
        if (class164.field2876 < 65535) {
            class131.field2277 = false;
            class288.field4841 = false;
        } else {
            class164.field2876 = 65535;
            if (class131.field2277) {
                class288.field4841 = false;
            } else {
                class288.field4841 = true;
            }
            class131.field2277 = true;
        }
        float var2 = (float) class164.field2876 / 65535.0F;
        int var3 = class22.field308 * 2;
        float[] var4 = new float[3];
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class61.field962[class28.field369][var3][var5] * 3;
            int var7 = (class61.field962[class28.field369][var3 + 2][var5] + class61.field962[class28.field369][var3 + 2][var5] - class61.field962[class28.field369][var3 + 3][var5]) * 3;
            int var8 = class61.field962[class28.field369][var3][var5];
            int var9 = class61.field962[class28.field369][var3 + 1][var5] * 3;
            int var10 = var9 - var6;
            int var11 = var9 + class61.field962[class28.field369][var3 + 2][var5] - var8 - var7;
            int var12 = var6 + var7 - var9 * 2;
            var4[var5] = (((float) var11 * var2 + (float) var12) * var2 + (float) var10) * var2 + (float) var8;
        }
        class134.field2322 = (int) var4[1] * -1;
        class219.field3792 = (int) var4[0] - (class230.field3976 * 128);
        float[] var13 = new float[3];
        int var14 = class146.field2473 * 2;
        class4.field32 = (int) var4[2] - class226.field3916 * 128;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class61.field962[class224.field3895][var14][var15] * 3;
            int var17 = class61.field962[class224.field3895][var14 + 1][var15] * 3;
            int var18 = class61.field962[class224.field3895][var14][var15];
            int var19 = (class61.field962[class224.field3895][var14 + 2][var15] + class61.field962[class224.field3895][var14 + 2][var15] - class61.field962[class224.field3895][var14 - -3][var15]) * 3;
            int var20 = var16 + var19 - (var17 * 2);
            int var21 = var17 - var16;
            int var22 = class61.field962[class224.field3895][var14 + 2][var15] + var17 - var19 - var18;
            var13[var15] = (((float) var22 * var2 + (float) var20) * var2 + (float) var21) * var2 + (float) var18;
        }
        if (arg0) {
            method1903(false);
        }
        float var23 = var13[0] - var4[0];
        float var24 = (var13[1] - var4[1]) * -1.0F;
        float var25 = var13[2] - var4[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class35.field567 = (float) Math.atan2((double) var24, var26);
        class71.field1096 = -((float) Math.atan2((double) var23, (double) var25));
        class197.field3380 = (int) ((double) class35.field567 * 325.949D) & 0x7FF;
        class224.field3887 = (int) ((double) class71.field1096 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)V", line = 131)
    public static final void method1903(boolean arg0) {
        for (int var1 = 0; var1 < class106.field1877; var1++) {
            int var2 = class44.field760[var1];
            class275 var3 = class99.field1777[var2];
            int var4 = class35.field545.method1082(-82);
            if ((var4 & 0x40) != 0) {
                var3.field1683 = class35.field545.method1078(arg0);
                if (var3.field1683 == 65535) {
                    var3.field1683 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1725 = class35.field545.method1092((byte) 118);
                var3.field1698 = 100;
            }
            if ((var4 & 0x8) != 0) {
                int var5 = class35.field545.method1076(-119);
                int var6 = class35.field545.method1105((byte) -20);
                if (var5 == 65535) {
                    var5 = -1;
                }
                class84.method586(var3, var6, (byte) -17, var5);
            }
            if ((var4 & 0x20) != 0) {
                var3.field1715 = class35.field545.method1090(false);
                int var7 = class35.field545.method1101(255);
                var3.field1721 = var7 >> 16;
                var3.field1688 = (var7 & 0xFFFF) + class212.field3708;
                var3.field1662 = 0;
                var3.field1678 = 0;
                if (var3.field1715 == 65535) {
                    var3.field1715 = -1;
                }
                if (class212.field3708 < var3.field1688) {
                    var3.field1678 = -1;
                }
                if (var3.field1715 != -1 && class212.field3708 == var3.field1688) {
                    int var8 = class187.method1289(var3.field1715, (byte) -109).field999;
                    if (var8 != -1) {
                        class35 var9 = class284.method1973(var8, false);
                        if (var9 != null && var9.field547 != null) {
                            class205.method1474(var9, false, 0, var3.field1685, var3.field1689, (byte) -89);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1681 = class35.field545.method1100(-32768);
                var3.field1726 = class35.field545.method1076(-67);
            }
            if ((var4 & 0x80) != 0) {
                int var10 = class35.field545.method1068(-13190);
                int var11 = class35.field545.method1068(-13190);
                var3.method651(arg0, class212.field3708, var11, var10);
                var3.field1666 = class212.field3708 + 300;
                var3.field1712 = class35.field545.method1105((byte) -20);
            }
            if ((var4 & 0x4) != 0) {
                int var12 = class35.field545.method1082(-44);
                int var13 = class35.field545.method1068(-13190);
                var3.method651(false, class212.field3708, var13, var12);
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field4628.method1656(-16)) {
                    class183.method1271((byte) -128, var3);
                }
                var3.method1918(84, class222.method1574(!arg0, class35.field545.method1100(-32768)));
                var3.method656(-115, var3.field4628.field4052);
                var3.field1717 = var3.field4628.field4072;
                var3.field1702 = var3.field4628.field4035;
                var3.field1654 = var3.field4628.field4059;
                var3.field1675 = var3.field4628.field4067;
                var3.field1703 = var3.field4628.field4038;
                var3.field1710 = var3.field4628.field4054;
                var3.field1663 = var3.field4628.field4018;
                var3.field1694 = var3.field4628.field4037;
                if (var3.field4628.method1656(-16)) {
                    class81.method519(class297.field5058, var3.field1723[0], 0, var3.field1720[0], (byte) -83, (class81) null, var3, (class157) null);
                }
            }
        }
        field4591++;
        if (arg0) {
            field4589 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIZIFIII)[[I", line = 281)
    public static final int[][] method1904(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5, int arg6, int arg7, int arg8) {
        field4590++;
        class323 var9 = new class323();
        var9.field5554 = (int) (arg5 * 4096.0F);
        var9.field5542 = arg3;
        int[][] var10 = new int[arg4][arg6];
        var9.field5559 = arg7;
        var9.field5551 = arg2;
        var9.field5543 = arg8;
        var9.method144(114);
        class219.method1553(arg4, arg6, (byte) 64);
        for (int var11 = 0; var11 < arg4; var11++) {
            var9.method2233(var10[var11], true, var11);
        }
        int var12 = 11 % ((-arg0 - 43) / 60);
        return var10;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I", line = 314)
    public static final int method1905(int arg0, int arg1) {
        field4580++;
        return arg0 == 27961 ? arg1 & 0x3FF : 127;
    }
}
