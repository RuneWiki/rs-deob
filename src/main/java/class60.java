import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class60 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
    public static boolean field881 = true;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field890 = 1;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field883 = 0;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field884 = 0;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "J")
    public long field879;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lvb;")
    public class60 field880;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Lvb;")
    public class60 field891;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[Lwd;")
    public static class88[] field882;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Laj;I)V", line = 4)
    public static final void method487(class1 arg0, int arg1) {
        field889++;
        if (arg1 != -1) {
            return;
        }
        int var2 = class102.field1687 >> 2 << 10;
        int var3 = class173.field2770 >> 1;
        byte[][] var4 = new byte[class113.field1833][class286.field4473];
        while (arg0.field48 < arg0.field34.length) {
            int var5 = 0;
            int var6 = 0;
            boolean var7 = false;
            if (arg0.method15((byte) -37) == 1) {
                var5 = arg0.method15((byte) 72);
                var6 = arg0.method15((byte) 110);
                var7 = true;
            }
            int var8 = arg0.method15((byte) -126);
            int var9 = arg0.method15((byte) 97);
            int var10 = var8 * 64 - class227.field3512;
            int var11 = class286.field4473 - (var9 * 64 + -class188.field2953) - 1;
            if (var10 >= 0 && var11 - 63 >= 0 && (var10 + 63) < class113.field1833 && class286.field4473 > var11) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var7 || var5 * 8 <= var12 && var5 * 8 + 8 > var12 && var6 * 8 <= var14 && (var6 * 8 + 8) > var14) {
                            var13[var11 - var14] = arg0.method55(4);
                        }
                    }
                }
            } else if (var7) {
                arg0.field48 += 64;
            } else {
                arg0.field48 += 4096;
            }
        }
        int var15 = class113.field1833;
        int var16 = class286.field4473;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class141 var26 = class216.method1567((byte) -43, var25 - 1);
                        var17[var23] += var26.field2284;
                        var19[var23] += var26.field2286;
                        var21[var23] += var26.field2289;
                        var18[var23] += var26.field2287;
                        var10002 = var20[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class141 var29 = class216.method1567((byte) -43, var28 - 1);
                        var17[var23] -= var29.field2284;
                        var19[var23] -= var29.field2286;
                        var21[var23] -= var29.field2289;
                        var18[var23] -= var29.field2287;
                        var10002 = var20[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class52.field794[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 - 5;
                    int var38 = var36 + 5;
                    if (var38 < var16) {
                        var32 += var21[var38];
                        var31 += var17[var38];
                        var34 += var18[var38];
                        var35 += var20[var38];
                        var33 += var19[var38];
                    }
                    if (var37 >= 0) {
                        var33 -= var19[var37];
                        var34 -= var18[var37];
                        var32 -= var21[var37];
                        var35 -= var20[var37];
                        var31 -= var17[var37];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class99.method803(var33 / var35, var31 * 256 / var34, 217, var32 / var35);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class164.method1234(4032, var36 << 6) + class164.method1234(63, var22)] = class40.field606[class221.method1614(arg1 + 3, var42, 96)];
                        } else if (var39 != null) {
                            var39[(class164.method1234(var36, 63) << 6) + class164.method1234(63, var22)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z", line = 239)
    public final boolean method488(byte arg0) {
        if (arg0 > -41) {
            return false;
        } else {
            field886++;
            return this.field880 != null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V", line = 258)
    public final void method489(boolean arg0) {
        field888++;
        if (this.field880 == null) {
            return;
        }
        this.field880.field891 = this.field891;
        if (arg0) {
            field883 = 67;
        }
        this.field891.field880 = this.field880;
        this.field880 = null;
        this.field891 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZC)Z", line = 286)
    public static final boolean method490(boolean arg0, char arg1) {
        if (arg0) {
            return true;
        } else {
            field885++;
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)V", line = 310)
    public static void method491(boolean arg0) {
        if (arg0) {
            method491(false);
        }
        field882 = null;
    }
}
