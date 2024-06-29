import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class463 {

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Ljo;")
    public static class351 field6609 = new class351(4, 1);

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Lke;")
    public static class622 field6614 = new class622(88, -2);

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Ljo;")
    public static class351 field6615 = new class351(79, -1);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "Lhaa;")
    public static class89 field6616;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field6617;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "[B")
    public byte[] field6604;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "[I")
    public static int[] field6608;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[S")
    public short[] field6605;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "[S")
    public short[] field6610;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "[S")
    public short[] field6613;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method2746(String arg0, boolean arg1) {
        field6607++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + (class483.method2829((byte) -83, arg0.charAt(var4)) - var3);
        }
        if (arg1) {
            field6612 = 43;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static final void method2747(int arg0) {
        field6603++;
        if (arg0 != -10405) {
            method2746(null, true);
        }
        for (int var1 = 0; var1 < class747.field10380; var1++) {
            int var2 = class70.field960[var1];
            class645 var3 = ((class14) class543.field7606.method380((byte) -3, (long) var2)).field262;
            int var4 = class26.field371.method842(2384);
            if ((var4 & 0x80) != 0) {
                var4 += class26.field371.method842(2384) << 8;
            }
            if ((var4 & 0x400) != 0) {
                var4 += class26.field371.method842(2384) << 16;
            }
            if ((var4 & 0x4000) != 0) {
                int var5 = class26.field371.method846(15319);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                for (int var8 = 0; var8 < var5; var8++) {
                    int var9 = class26.field371.method898((byte) -123);
                    if ((var9 & 0xC000) == 49152) {
                        int var10 = class26.field371.method883((byte) 115);
                        var6[var8] = class281.method1904(var10, var9 << 16);
                    } else {
                        var6[var8] = var9;
                    }
                    var7[var8] = class26.field371.method883((byte) 119);
                }
                var3.method2702(var6, var7, (byte) -60);
            }
            if ((var4 & 0x2) != 0) {
                var3.field6343 = class26.field371.method898((byte) -127);
                if (var3.field6343 == 65535) {
                    var3.field6343 = -1;
                }
            }
            if ((var4 & 0x8000) != 0) {
                int var11 = class26.field371.method898((byte) -98);
                var3.field6394 = class26.field371.method842(2384);
                var3.field6398 = class26.field371.method867(true);
                var3.field6428 = (var11 & 0x8000) != 0;
                var3.field6413 = var11 & 0x7FFF;
                var3.field6349 = class673.field9441 + var3.field6413 + var3.field6394;
            }
            if ((var4 & 0x200) != 0) {
                int var12 = class26.field371.method867(true);
                int[] var13 = new int[var12];
                int[] var14 = new int[var12];
                int[] var15 = new int[var12];
                for (int var16 = 0; var16 < var12; var16++) {
                    int var17 = class26.field371.method883((byte) 103);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    var13[var16] = var17;
                    var14[var16] = class26.field371.method867(true);
                    var15[var16] = class26.field371.method862(-25118);
                }
                class165.method1290(8482, var14, var3, var15, var13);
            }
            if ((var4 & 0x10000) != 0) {
                var3.field9095 = class26.field371.method861(true);
                if ("".equals(var3.field9095) || var3.field9095.equals(var3.field9071.field3877)) {
                    var3.field9095 = var3.field9071.field3877;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var18 = class26.field371.method837(29806);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class26.field371.method835(arg0 ^ 0x28D7);
                int var20 = class26.field371.method867(true);
                int var21 = var20 & 0x7;
                int var22 = var20 >> 3 & 0xF;
                if (var22 == 15) {
                    var22 = -1;
                }
                var3.method2705(0, var22, var18, var19, var21, -113);
            }
            if ((var4 & 0x10) != 0) {
                int[] var23 = new int[4];
                for (int var24 = 0; var24 < 4; var24++) {
                    var23[var24] = class26.field371.method883((byte) 106);
                    if (var23[var24] == 65535) {
                        var23[var24] = -1;
                    }
                }
                int var25 = class26.field371.method842(2384);
                class627.method3591(var3, arg0 ^ 0xFFFFD75B, var25, var23);
            }
            if ((var4 & 0x4) != 0) {
                var3.field9076 = class26.field371.method898((byte) -99);
                var3.field9072 = class26.field371.method837(arg0 + 40211);
            }
            if ((var4 & 0x40) != 0) {
                int var26 = class26.field371.method867(true);
                if (var26 > 0) {
                    for (int var27 = 0; var27 < var26; var27++) {
                        int var28 = -1;
                        int var29 = -1;
                        int var30 = class26.field371.method890((byte) -59);
                        int var31 = -1;
                        if (var30 == 32767) {
                            var30 = class26.field371.method890((byte) -59);
                            var29 = class26.field371.method890((byte) -59);
                            var28 = class26.field371.method890((byte) -59);
                            var31 = class26.field371.method890((byte) -59);
                        } else if (var30 == 32766) {
                            var30 = -1;
                        } else {
                            var29 = class26.field371.method890((byte) -59);
                        }
                        int var32 = class26.field371.method890((byte) -59);
                        int var33 = class26.field371.method867(true);
                        var3.method2691(var29, var32, var31, var33, false, var28, var30, class673.field9441);
                    }
                }
            }
            if ((var4 & 0x100) != 0) {
                int var34 = var3.field9071.field3889.length;
                int var35 = 0;
                if (var3.field9071.field3883 != null) {
                    var35 = var3.field9071.field3883.length;
                }
                int var36 = 0;
                if (var3.field9071.field3909 != null) {
                    var36 = var3.field9071.field3909.length;
                }
                int var37 = class26.field371.method855(0);
                if ((var37 & 0x1) == 1) {
                    var3.field9070 = null;
                } else {
                    int[] var38 = null;
                    if ((var37 & 0x2) == 2) {
                        var38 = new int[var34];
                        for (int var39 = 0; var39 < var34; var39++) {
                            var38[var39] = class26.field371.method883((byte) 104);
                        }
                    }
                    short[] var40 = null;
                    if ((var37 & 0x4) == 4) {
                        var40 = new short[var35];
                        for (int var41 = 0; var41 < var35; var41++) {
                            var40[var41] = (short) class26.field371.method883((byte) 113);
                        }
                    }
                    short[] var42 = null;
                    if ((var37 & 0x8) == 8) {
                        var42 = new short[var36];
                        for (int var43 = 0; var43 < var36; var43++) {
                            var42[var43] = (short) class26.field371.method862(-25118);
                        }
                    }
                    long var44 = (long) var2 | (long) (var3.field9096++) << 32;
                    var3.field9070 = new class304(var44, var38, var40, var42);
                }
            }
            if ((var4 & 0x2000) != 0) {
                var3.field6423 = class26.field371.method859(arg0 + 29965);
                var3.field6385 = class26.field371.method858(52);
                var3.field6373 = class26.field371.method877(arg0 ^ 0x285F);
                var3.field6366 = (byte) class26.field371.method855(0);
                var3.field6368 = class673.field9441 + class26.field371.method898((byte) -123);
                var3.field6375 = class673.field9441 + class26.field371.method898((byte) -113);
            }
            if ((var4 & 0x20000) != 0) {
                var3.field9097 = class26.field371.method862(-25118);
                if (var3.field9097 == 65535) {
                    var3.field9097 = var3.field9071.field3945;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field6362 = class26.field371.method861(true);
                var3.field6359 = 100;
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field9071.method1807((byte) -121)) {
                    class179.method1355(false, var3);
                }
                var3.method3686(class21.field322.method1466((byte) -124, class26.field371.method862(-25118)), (byte) -52);
                var3.method2703(var3.field9071.field3878, -1);
                var3.field6370 = var3.field9071.field3944 << 3;
                if (var3.field9071.method1807((byte) -121)) {
                    class653.method3743(var3.field6445[0], 35, 0, null, var3, var3.field7710, var3.field6448[0], null);
                }
            }
            if ((var4 & 0x80000) != 0) {
                int var46 = var3.field9071.field3917.length;
                int var47 = 0;
                if (var3.field9071.field3883 != null) {
                    var47 = var3.field9071.field3883.length;
                }
                byte var48 = 0;
                if (var3.field9071.field3909 != null) {
                    var47 = var3.field9071.field3909.length;
                }
                int var49 = class26.field371.method842(2384);
                if ((var49 & 0x1) != 1) {
                    int[] var50 = null;
                    if ((var49 & 0x2) == 2) {
                        var50 = new int[var46];
                        for (int var51 = 0; var51 < var46; var51++) {
                            var50[var51] = class26.field371.method837(29806);
                        }
                    }
                    short[] var52 = null;
                    if ((var49 & 0x4) == 4) {
                        var52 = new short[var47];
                        for (int var53 = 0; var53 < var47; var53++) {
                            var52[var53] = (short) class26.field371.method862(-25118);
                        }
                    }
                    short[] var54 = null;
                    if ((var49 & 0x8) == 8) {
                        var54 = new short[var48];
                        for (int var55 = 0; var55 < var48; var55++) {
                            var54[var55] = (short) class26.field371.method883((byte) 124);
                        }
                    }
                    long var56 = (long) (var3.field9091++) << 32 | (long) var2;
                    new class304(var56, var50, var52, var54);
                }
            }
            if ((var4 & 0x1000) != 0) {
                int var58 = class26.field371.method898((byte) -98);
                int var59 = class26.field371.method893((byte) -126);
                if (var58 == 65535) {
                    var58 = -1;
                }
                int var60 = class26.field371.method867(true);
                int var61 = var60 & 0x7;
                int var62 = var60 >> 3 & 0xF;
                if (var62 == 15) {
                    var62 = -1;
                }
                var3.method2705(1, var62, var58, var59, var61, arg0 + 10350);
            }
            if ((var4 & 0x40000) != 0) {
                int var63 = class26.field371.method898((byte) -80);
                int var64 = class26.field371.method893((byte) -109);
                if (var63 == 65535) {
                    var63 = -1;
                }
                int var65 = class26.field371.method842(2384);
                int var66 = var65 & 0x7;
                int var67 = (var65 & 0x7B) >> 3;
                if (var67 == 15) {
                    var67 = -1;
                }
                var3.method2705(2, var67, var63, var64, var66, -64);
            }
            if ((var4 & 0x800) != 0) {
                var3.field6360 = class26.field371.method877(arg0 + 10153);
                var3.field6406 = class26.field371.method859(19560);
                var3.field6390 = class26.field371.method882((byte) 81);
                var3.field6389 = class26.field371.method858(arg0 ^ 0xFFFFD70C);
                var3.field6391 = class26.field371.method898((byte) -89) + class673.field9441;
                var3.field6346 = class26.field371.method837(29806) + class673.field9441;
                var3.field6422 = class26.field371.method846(15319);
                var3.field6390 += var3.field6448[0];
                var3.field6442 = 0;
                var3.field6406 += var3.field6445[0];
                var3.field6360 += var3.field6448[0];
                var3.field6389 += var3.field6445[0];
                var3.field6443 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
    public static final void method2748(int arg0, int arg1, int arg2) {
        if (class553.field7875 == 1) {
            class416.method2496(arg2, (byte) -128, arg1, class359.field5223);
        } else if (class553.field7875 == 2) {
            if (class607.field8578) {
                class90.method641(1, arg2 + class17.method143(-128), arg1 + class638.method3629(19728));
            } else {
                class90.method641(1, arg2, arg1);
            }
        }
        field6611++;
        int var3 = 32 / ((arg0 + 44) / 59);
        class359.field5223 = null;
        class553.field7875 = 0;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static void method2749(int arg0) {
        field6617 = null;
        field6616 = null;
        if (arg0 <= 23) {
            method2747(-73);
        }
        field6609 = null;
        field6608 = null;
        field6615 = null;
        field6614 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([[[Lrr;Z)V")
    public static final void method2750(class379[][][] arg0, boolean arg1) {
        if (arg1) {
            method2748(-75, 87, 95);
        }
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class379[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class379 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field5446 instanceof class362) {
                            ((class362) var6.field5446).method647(32653);
                        }
                        if (var6.field5432 instanceof class362) {
                            ((class362) var6.field5432).method647(32653);
                        }
                        if (var6.field5444 instanceof class362) {
                            ((class362) var6.field5444).method647(32653);
                        }
                        if (var6.field5439 instanceof class362) {
                            ((class362) var6.field5439).method647(32653);
                        }
                        if (var6.field5430 instanceof class362) {
                            ((class362) var6.field5430).method647(32653);
                        }
                        for (class393 var7 = var6.field5437; var7 != null; var7 = var7.field5574) {
                            class778 var8 = var7.field5578;
                            if (var8 instanceof class362) {
                                ((class362) var8).method647(32653);
                            }
                        }
                    }
                }
            }
        }
        field6606++;
    }
}
