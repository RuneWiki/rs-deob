import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class229 extends class17 {

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "Lrc;")
    public static class330 field3987 = new class330();

    @OriginalMember(owner = "client!nj", name = "gb", descriptor = "[J")
    public static long[] field3993 = new long[32];

    @OriginalMember(owner = "client!nj", name = "hb", descriptor = "I")
    public static int field3994 = 0;

    @OriginalMember(owner = "client!nj", name = "fb", descriptor = "Lhe;")
    public static class94 field3992 = new class94(50);

    @OriginalMember(owner = "client!nj", name = "kb", descriptor = "Lsf;")
    public static class108 field3997 = class140.method973(255, "Cabbage");

    @OriginalMember(owner = "client!nj", name = "bb", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!nj", name = "cb", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!nj", name = "db", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!nj", name = "eb", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!nj", name = "ib", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!nj", name = "jb", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(II)[I", line = 12)
    public final int[] method120(int arg0, int arg1) {
        int[] var3 = this.field217.method1698(126, arg1);
        if (this.field217.field4295) {
            int[][] var4 = this.method111(3, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class116.field2008; var8++) {
                var3[var8] = (var5[var8] - (-var6[var8] - var7[var8])) / 3;
            }
        }
        field3990++;
        if (arg0 >= -95) {
            field3993 = (long[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(III)V", line = 55)
    public static final void method1533(int arg0, int arg1, int arg2) {
        field3989++;
        class206 var3 = client.method1819(-20727, arg1);
        int var4 = 25 / ((arg2 - 19) / 53);
        int var5 = var3.field3698;
        int var6 = var3.field3704;
        int var7 = var3.field3699;
        int var8 = class152.field2759[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        class93.method633(var5, var9 & arg0 << var6 | class261.field4594[var5] & ~var9, (byte) -97);
    }

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "(I)V", line = 79)
    public static void method1534(int arg0) {
        field3987 = null;
        field3997 = null;
        if (arg0 <= 122) {
            field3993 = (long[]) null;
        }
        field3992 = null;
        field3993 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIBI)V", line = 94)
    public static final void method1535(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3991++;
        if (arg1 >= arg2) {
            for (int var5 = arg2; var5 < arg1; var5++) {
                class106.field1839[var5][arg0] = arg4;
            }
        } else {
            for (int var6 = arg1; var6 < arg2; var6++) {
                class106.field1839[var6][arg0] = arg4;
            }
        }
        if (arg3 > -102) {
            method1533(-79, 43, 28);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILik;)V", line = 129)
    public static final void method1536(int arg0, class262 arg1) {
        class78.field1168 = arg1;
        field3988++;
        int var2 = 74 / ((arg0 + 25) / 50);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lrm;I)Lj;", line = 143)
    public static final class288 method1537(class249 arg0, int arg1) {
        int var2 = -73 / ((30 - arg1) / 57);
        field3996++;
        return new class288(arg0.method1728(true), arg0.method1728(true), arg0.method1728(true), arg0.method1728(true), arg0.method1749(false), arg0.method1749(false), arg0.method1731(true));
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 177)
    public class229() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZIIIIII)V", line = 184)
    public static final void method1538(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3995++;
        if (class45.field653 == arg1 && class324.field5526 == arg3 && class90.field1416 == arg6 || class251.method1774(903)) {
            return;
        }
        class45.field653 = arg1;
        class90.field1416 = arg6;
        class324.field5526 = arg3;
        if (class251.method1774(903)) {
            class90.field1416 = 0;
        }
        if (arg0) {
            class312.method2177(28, (byte) -106);
        } else {
            class312.method2177(25, (byte) -113);
        }
        class271.method1958((byte) 102, class286.field5012, true);
        int var7 = class137.field2421;
        int var8 = class305.field5295;
        class137.field2421 = (arg3 - 6) * 8;
        class305.field5295 = (arg1 - 6) * 8;
        class289.field5060 = class290.method2077(class45.field653 * 8, false, class324.field5526 * 8);
        int var9 = class305.field5295 - var8;
        if (arg2 != 28353) {
            method1537((class249) null, 99);
        }
        class297.field5180 = null;
        int var10 = class137.field2421 - var7;
        int var11 = class137.field2421;
        int var12 = class305.field5295;
        if (arg0) {
            class61.field969 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class45 var17 = class159.field2863[var16];
                if (var17 != null) {
                    var17.field4457 -= var10 * 128;
                    var17.field4452 -= var9 * 128;
                    if (var17.field4452 >= 0 && var17.field4452 <= 13184 && var17.field4457 >= 0 && var17.field4457 <= 13184) {
                        for (int var18 = 0; var18 < 10; var18++) {
                            var17.field4498[var18] -= var9;
                            var17.field4482[var18] -= var10;
                        }
                        class168.field3020[class61.field969++] = var16;
                    } else {
                        class159.field2863[var16].field646 = null;
                        class159.field2863[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class45 var14 = class159.field2863[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field4498[var15] -= var9;
                        var14.field4482[var15] -= var10;
                    }
                    var14.field4457 -= var10 * 128;
                    var14.field4452 -= var9 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class51 var20 = class96.field1558[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field4498[var21] -= var9;
                    var20.field4482[var21] -= var10;
                }
                var20.field4457 -= var10 * 128;
                var20.field4452 -= var9 * 128;
            }
        }
        class295.field5159 = arg6;
        class95.field1513.method362(-17550, false, arg4, arg5);
        byte var22 = 104;
        byte var23 = 1;
        byte var24 = 0;
        if (var9 < 0) {
            var22 = -1;
            var24 = 103;
            var23 = -1;
        }
        byte var25 = 0;
        byte var26 = 104;
        byte var27 = 1;
        if (var10 < 0) {
            var25 = 103;
            var26 = -1;
            var27 = -1;
        }
        for (int var28 = var24; var28 != var22; var28 += var23) {
            for (int var29 = var25; var29 != var26; var29 += var27) {
                int var30 = var9 + var28;
                int var31 = var10 + var29;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class182.field3333[var32][var28][var29] = class182.field3333[var32][var30][var31];
                    } else {
                        class182.field3333[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class163 var33 = (class163) class326.field5565.method13(0); var33 != null; var33 = (class163) class326.field5565.method15((byte) 47)) {
            var33.field2929 -= var9;
            var33.field2908 -= var10;
            if (var33.field2929 < 0 || var33.field2908 < 0 || var33.field2929 >= 104 || var33.field2908 >= 104) {
                var33.method1325(0);
            }
        }
        if (arg0) {
            class15.field197 -= var10;
            class284.field4967 -= var9;
            class70.field1084 -= var10;
            class255.field4443 -= var10 * 128;
            class15.field193 -= var9 * 128;
            class117.field2026 -= var9;
        } else {
            class63.field1021 = 1;
        }
        if (client.field4538 != 0) {
            client.field4538 -= var9;
            class269.field4723 -= var10;
        }
        class315.field5419 = 0;
        if (class231.field4051 && arg0 && (Math.abs(var9) > 104 || Math.abs(var10) > 104)) {
            class122.method852(arg2 ^ 0xFFFF9111);
        }
        class220.field3919 = -1;
        class94.field1502.method9((byte) -112);
        class306.field5327.method9((byte) -109);
        class165.method1143();
    }
}
