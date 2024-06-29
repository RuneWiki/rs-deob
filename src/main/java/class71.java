import java.awt.Font;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class71 extends class82 {

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    private int field1355 = 4096;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    private int field1349 = 0;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "Ldj;")
    private static class44 field1350 = class89.method650(255, "Please enter your username)3");

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "[I")
    public static int[] field1348 = new int[100];

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "Ldj;")
    public static class44 field1358 = class89.method650(255, "T");

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "Ldj;")
    public static class44 field1362 = field1350;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "Ldj;")
    private static class44 field1363 = class89.method650(255, "Loaded sprites");

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "Ldj;")
    public static class44 field1353 = field1363;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "Lle;")
    public static class125 field1351;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "Ljava/awt/Font;")
    public static Font field1357;

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class71() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        if (arg0 != 25238) {
            method561((byte) -7);
        }
        int[] var3 = super.field1595.method603(true, arg1);
        ++field1352;
        if (super.field1595.field1538) {
            int[] var4 = this.method620(2652, arg1, 0);
            for (int var5 = 0; class129.field2287 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field1349 <= var6 && ~this.field1355 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
    public static final void method558(int arg0) {
        if (arg0 != 4096) {
            field1351 = null;
        }
        if (class153.field2674 == null || class214.field3863 == null) {
            class214.field3863 = new int[256];
            class153.field2674 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class153.field2674[var1] = (int) (Math.sin(var2) * 4096.0D);
                class214.field3863[var1] = (int) (4096.0D * Math.cos(var2));
            }
        }
        ++field1354;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lvc;BLdj;)Ldj;")
    public static final class44 method559(class223 arg0, byte arg1, class44 arg2) {
        ++field1347;
        if (arg2.method297(arg1 + -31, class84.field1630) != -1) {
            label62: while (true) {
                int var3 = arg2.method297(120, class189.field3269);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method297(-40, class211.field3768);
                        if (~var4 == 0) {
                            while (true) {
                                int var5 = arg2.method297(54, class114.field2036);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method297(-64, class58.field1095);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method297(105, class212.field3806);
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg2.method297(54, class15.field268);
                                                        if (~var8 == 0) {
                                                            break label62;
                                                        }
                                                        class44 var9 = class94.field1752;
                                                        if (class220.field3980 != null) {
                                                            var9 = class63.method472(class220.field3980.field3041, 104);
                                                            try {
                                                                if (class220.field3980.field3040 != null) {
                                                                    byte[] var10 = ((String) class220.field3980.field3040).getBytes("ISO-8859-1");
                                                                    var9 = class93.method664(var10.length, 98, var10, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class70.method555(new class44[] { arg2.method318(arg1 + 211, var8, 0), var9, arg2.method332(var8 + 4, (byte) 124) }, -3);
                                                    }
                                                }
                                                arg2 = class70.method555(new class44[] { arg2.method318(127, var7, 0), class84.method632(999999999, class172.method1092(4, arg1 ^ -30409, arg0)), arg2.method332(var7 + 2, (byte) 22) }, arg1 ^ 86);
                                            }
                                        }
                                        arg2 = class70.method555(new class44[] { arg2.method318(125, var6, 0), class84.method632(999999999, class172.method1092(3, 30364, arg0)), arg2.method332(var6 + 2, (byte) 112) }, arg1 + 82);
                                    }
                                }
                                arg2 = class70.method555(new class44[] { arg2.method318(126, var5, 0), class84.method632(arg1 + 1000000084, class172.method1092(2, 30364, arg0)), arg2.method332(var5 - -2, (byte) 76) }, -3);
                            }
                        }
                        arg2 = class70.method555(new class44[] { arg2.method318(126, var4, 0), class84.method632(999999999, class172.method1092(1, 30364, arg0)), arg2.method332(var4 + 2, (byte) 28) }, -3);
                    }
                }
                arg2 = class70.method555(new class44[] { arg2.method318(125, var3, 0), class84.method632(999999999, class172.method1092(0, 30364, arg0)), arg2.method332(var3 + 2, (byte) 67) }, -3);
            }
        }
        if (arg1 != -85) {
            method561((byte) -128);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JI)V")
    public static final void method560(long arg0, int arg1) {
        ++field1356;
        if (arg0 != 0L) {
            if (arg1 == -1) {
                for (int var3 = 0; class37.field664 > var3; ++var3) {
                    if (class154.field2686[var3] == arg0) {
                        ++class236.field4380;
                        --class37.field664;
                        for (int var4 = var3; ~class37.field664 < ~var4; ++var4) {
                            class154.field2686[var4] = class154.field2686[var4 + 1];
                            class157.field2733[var4] = class157.field2733[var4 + 1];
                        }
                        class143.field2531 = class66.field1251;
                        class200.field3542.method1170(79, (byte) -84);
                        class200.field3542.method536(arg0, 23);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
    public static void method561(byte arg0) {
        field1357 = null;
        int var1 = -60 % ((arg0 - -50) / 37);
        field1348 = null;
        field1353 = null;
        field1350 = null;
        field1358 = null;
        field1362 = null;
        field1351 = null;
        field1363 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field1360;
        class168.method1069(arg3, 71);
        int var7 = 0;
        int var8 = -arg1 + arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = -arg3;
        if (arg6 < 19) {
            method558(-16);
        }
        int var10 = arg3;
        int var11 = -var8;
        int var12 = -1;
        int var13 = -1;
        if (class14.field267 <= arg0 && ~class57.field1068 <= ~arg0) {
            int[] var14 = class108.field1979[arg0];
            int var15 = class201.method1296(class70.field1337, -127, -arg3 + arg5, class70.field1321);
            int var16 = class201.method1296(class70.field1337, -128, arg5 - -arg3, class70.field1321);
            int var17 = class201.method1296(class70.field1337, -127, arg5 - var8, class70.field1321);
            int var18 = class201.method1296(class70.field1337, -126, arg5 + var8, class70.field1321);
            class42.method290(var14, -7, var15, var17, arg4);
            class42.method290(var14, -7, var17, var18, arg2);
            class42.method290(var14, -7, var18, var16, arg4);
        }
        int var19 = var8;
        while (var10 > var7) {
            var13 += 2;
            var12 += 2;
            var9 += var12;
            var11 += var13;
            if (var11 >= 0 && var19 >= 1) {
                --var19;
                var11 -= var19 << 1;
                class219.field3970[var19] = var7;
            }
            ++var7;
            if (~var9 <= -1) {
                --var10;
                var9 -= var10 << 1;
                int var20 = -var10 + arg0;
                int var21 = arg0 + var10;
                if (class14.field267 <= var21 && ~var20 >= ~class57.field1068) {
                    if (var8 <= var10) {
                        int var22 = class201.method1296(class70.field1337, -128, arg5 + var7, class70.field1321);
                        int var23 = class201.method1296(class70.field1337, -128, -var7 + arg5, class70.field1321);
                        if (~class57.field1068 <= ~var21) {
                            class42.method290(class108.field1979[var21], -7, var23, var22, arg4);
                        }
                        if (class14.field267 <= var20) {
                            class42.method290(class108.field1979[var20], -7, var23, var22, arg4);
                        }
                    } else {
                        int var24 = class219.field3970[var10];
                        int var25 = class201.method1296(class70.field1337, -126, arg5 + var7, class70.field1321);
                        int var26 = class201.method1296(class70.field1337, -127, -var7 + arg5, class70.field1321);
                        int var27 = class201.method1296(class70.field1337, -126, arg5 + var24, class70.field1321);
                        int var28 = class201.method1296(class70.field1337, -126, -var24 + arg5, class70.field1321);
                        if (class57.field1068 >= var21) {
                            int[] var29 = class108.field1979[var21];
                            class42.method290(var29, -7, var26, var28, arg4);
                            class42.method290(var29, -7, var28, var27, arg2);
                            class42.method290(var29, -7, var27, var25, arg4);
                        }
                        if (class14.field267 <= var20) {
                            int[] var30 = class108.field1979[var20];
                            class42.method290(var30, -7, var26, var28, arg4);
                            class42.method290(var30, -7, var28, var27, arg2);
                            class42.method290(var30, -7, var27, var25, arg4);
                        }
                    }
                }
            }
            int var31 = -var7 + arg0;
            int var32 = arg0 + var7;
            if (~var32 <= ~class14.field267 && ~var31 >= ~class57.field1068) {
                int var33 = arg5 + var10;
                int var34 = -var10 + arg5;
                if (class70.field1337 <= var33 && var34 <= class70.field1321) {
                    int var35 = class201.method1296(class70.field1337, -126, var33, class70.field1321);
                    int var36 = class201.method1296(class70.field1337, -128, var34, class70.field1321);
                    if (var7 >= var8) {
                        if (class57.field1068 >= var32) {
                            class42.method290(class108.field1979[var32], -7, var36, var35, arg4);
                        }
                        if (var31 >= class14.field267) {
                            class42.method290(class108.field1979[var31], -7, var36, var35, arg4);
                        }
                    } else {
                        int var37 = ~var19 > ~var7 ? class219.field3970[var7] : var19;
                        int var38 = class201.method1296(class70.field1337, -126, arg5 - -var37, class70.field1321);
                        int var39 = class201.method1296(class70.field1337, -128, -var37 + arg5, class70.field1321);
                        if (var32 <= class57.field1068) {
                            int[] var40 = class108.field1979[var32];
                            class42.method290(var40, -7, var36, var39, arg4);
                            class42.method290(var40, -7, var39, var38, arg2);
                            class42.method290(var40, -7, var38, var35, arg4);
                        }
                        if (var31 >= class14.field267) {
                            int[] var41 = class108.field1979[var31];
                            class42.method290(var41, -7, var36, var39, arg4);
                            class42.method290(var41, -7, var39, var38, arg2);
                            class42.method290(var41, -7, var38, var35, arg4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg2 == 68) {
            if (arg1 != 0) {
                if (~arg1 == -2) {
                    this.field1355 = arg0.method500(118);
                }
            } else {
                this.field1349 = arg0.method500(56);
            }
            ++field1361;
        }
    }
}
