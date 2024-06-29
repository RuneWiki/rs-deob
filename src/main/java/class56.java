import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class56 {

    @OriginalMember(owner = "client!df", name = "e", descriptor = "J")
    public long field880 = 0L;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "[I")
    public static int[] field885 = new int[25];

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field889 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Lnh;")
    public class55 field886;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Lnh;")
    public class55 field890;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)V")
    public static final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 11929) {
            field885 = null;
        }
        int var7 = arg4 + arg5;
        field883++;
        int var8 = arg6 - arg5;
        int var9 = arg2 + arg5;
        for (int var10 = arg4; var10 < var7; var10++) {
            class173.method1240((byte) -84, arg0, class55.field872[var10], arg1, arg2);
        }
        int var11 = arg0 - arg5;
        for (int var12 = arg6; var12 > var8; var12--) {
            class173.method1240((byte) -110, arg0, class55.field872[var12], arg1, arg2);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class55.field872[var13];
            class173.method1240((byte) -54, var9, var14, arg1, arg2);
            class173.method1240((byte) -63, arg0, var14, arg1, var11);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method468(int arg0) {
        if (arg0 > 11) {
            field885 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method469(byte arg0, boolean arg1, String arg2) {
        int var3 = class276.field4391.method1802(arg2, 250);
        field876++;
        byte var4 = 4;
        int var5 = class276.field4391.method1803(arg2, 250) * 13;
        if (arg0 >= -16) {
            method468(-6);
        }
        int var6 = var4 + 6;
        int var7 = var4 + 6;
        class66.method532(var6 - var4, -var4 + var7, var3 + var4 + var4, var4 + var5 - -var4, 0);
        class66.method533(var6 - var4, -var4 + var7, var3 + var4 + var4, var4 + var4 + var5, 16777215);
        class276.field4391.method1789(arg2, var6, var7, var3, var5, 16777215, -1, 1, 1, 0);
        class18.method137(var7 - var4, -122, var4 + var4 + var5, var4 + var4 + var3, -var4 + var6);
        if (!arg1) {
            class159.method1140(var5, var6, -26514, var3, var7);
            return;
        }
        try {
            Graphics var8 = class105.field1651.getGraphics();
            class143.field2140.method1457(0, var8, (byte) 102, 0);
        } catch (Exception var9) {
            class105.field1651.repaint();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILha;)Ljava/lang/String;")
    public static final String method470(int arg0, int arg1, class31 arg2) {
        field887++;
        int var3 = -41 % ((arg1 + 46) / 44);
        try {
            int var4 = arg2.method276((byte) 51);
            if (arg0 < var4) {
                var4 = arg0;
            }
            byte[] var5 = new byte[var4];
            arg2.field541 += class296.field4756.method451(0, -102, var5, arg2.field541, var4, arg2.field560);
            return class130.method967(var5, -42, var4, 0);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[BZIIIZ[Lai;)[I")
    public static final int[] method471(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, class89[] arg7) {
        field877++;
        byte var8;
        if (arg2) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg2) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg5 + var10 > 0 && (arg5 + var10) < 103 && arg4 + var11 > 0 && arg4 + var11 < 103) {
                            arg7[var9].field1396[arg5 + var10][arg4 + var11] = class118.method863(arg7[var9].field1396[arg5 + var10][arg4 + var11], -2097153);
                        }
                    }
                }
            }
        }
        int var12 = arg3 + arg4;
        class31 var13 = new class31(arg1);
        int var14 = arg0 + arg5;
        for (int var15 = 0; var15 < var8; var15++) {
            for (int var39 = 0; var39 < 64; var39++) {
                for (int var40 = 0; var40 < 64; var40++) {
                    class152.method1098(arg2, 0, var12 + var40, var39 - -arg5, var15, 0, false, 0, var13, var14 + var39, (byte) 104, arg4 + var40);
                }
            }
        }
        boolean var16 = arg6;
        boolean var17 = false;
        while (var13.field560.length > var13.field541) {
            int var18 = var13.method265(-128);
            if (var18 == 128) {
                var16 = true;
                class202.field3125[0] = var13.method260((byte) -67);
                class202.field3125[1] = var13.method308((byte) -122);
                class202.field3125[2] = var13.method308((byte) -127);
                class202.field3125[3] = var13.method308((byte) -125);
                class202.field3125[4] = var13.method260((byte) -67);
            } else {
                if (var18 != 129) {
                    var13.field541--;
                    break;
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    byte var25 = var13.method266(-129);
                    if (var25 == 0) {
                        int var26 = arg5;
                        if (arg5 < 0) {
                            var26 = 0;
                        } else if (arg5 >= 104) {
                            var26 = 104;
                        }
                        int var27 = arg4;
                        if (arg4 < 0) {
                            var27 = 0;
                        } else if (arg4 >= 104) {
                            var27 = 104;
                        }
                        int var28 = arg5 + 64;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 >= 104) {
                            var28 = 104;
                        }
                        int var29 = arg4 + 64;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        while (var26 < var28) {
                            while (var27 < var29) {
                                class107.field1671[var24][var26][var27] = 0;
                                var27++;
                            }
                            var26++;
                        }
                    } else if (var25 == 1) {
                        for (int var30 = 0; var30 < 64; var30 += 4) {
                            for (int var31 = 0; var31 < 64; var31 += 4) {
                                byte var32 = var13.method266(-129);
                                for (int var33 = arg5 + var30; var33 < arg5 + var30 + 4; var33++) {
                                    for (int var34 = arg4 + var31; var34 < (var31 + arg4 + 4); var34++) {
                                        if (var33 >= 0 && var33 < 104 && var34 >= 0 && var34 < 104) {
                                            class107.field1671[var24][var33][var34] = var32;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var25 == 2 && var24 > 0) {
                        int var35 = arg5;
                        int var36 = arg4;
                        if (arg4 < 0) {
                            var36 = 0;
                        } else if (arg4 >= 104) {
                            var36 = 104;
                        }
                        int var37 = arg5 + 64;
                        if (var37 < 0) {
                            var37 = 0;
                        } else if (var37 >= 104) {
                            var37 = 104;
                        }
                        int var38 = arg4 + 64;
                        if (arg5 < 0) {
                            var35 = 0;
                        } else if (arg5 >= 104) {
                            var35 = 104;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 >= 104) {
                            var38 = 104;
                        }
                        while (var35 < var37) {
                            while (var38 > var36) {
                                class107.field1671[var24][var35][var36] = class107.field1671[var24 - 1][var35][var36];
                                var36++;
                            }
                            var35++;
                        }
                    }
                }
                var17 = true;
            }
        }
        if (!var17) {
            for (int var19 = 0; var19 < 4; var19++) {
                for (int var20 = 0; var20 < 16; var20++) {
                    for (int var21 = 0; var21 < 16; var21++) {
                        int var22 = (arg5 >> 2) + var20;
                        int var23 = (arg4 >> 2) + var21;
                        if (var22 >= 0 && var22 < 26 && var23 >= 0 && var23 < 26) {
                            class107.field1671[var19][var22][var23] = 0;
                        }
                    }
                }
            }
        }
        if (var16) {
            return class202.field3125;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static final void method472(int arg0) {
        field878++;
        if (class240.field3815 || class110.field1709 == 2) {
            return;
        }
        try {
            class289.method1926(true, "tbrefresh", class214.field3283);
        } catch (Throwable var1) {
        }
        if (arg0 != -3) {
            method467(77, -13, -104, -56, 75, -35, 58);
        }
    }
}
