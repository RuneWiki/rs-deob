import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class532 extends class362 {

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    private int field7196;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "F")
    public static float field7198;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "[[B")
    public static byte[][] field7197;

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(I)V")
    public class532(int arg0) {
        super(0, true);
        this.field7196 = 4096;
        this.field7196 = arg0;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
    public class532() {
        this(4096);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field7194;
        if (arg1 == 0) {
            this.field7196 = (arg0.method793((byte) 63) << 12) / 255;
        }
        if (arg2 != -1) {
            method3016((byte) 42);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lkka;BIILfl;)V")
    public static final void method3015(class329 arg0, byte arg1, int arg2, int arg3, class771 arg4) {
        ++field7193;
        if (~(2 & arg3) != -1) {
            int var5 = arg0.method789(-8);
            int var6 = arg0.method796(72);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var7 = arg0.method779((byte) 118);
            int var8 = var7 & 7;
            int var9 = (var7 & 126) >> 3;
            if (~var9 == -16) {
                var9 = -1;
            }
            arg4.method2341(0, var6, var5, var8, -127, var9);
        }
        byte var10 = -1;
        if ((arg3 & 131072) != 0) {
            arg4.field10635 = ~arg0.method749((byte) -122) == -2;
        }
        if (~(arg3 & 8) != -1) {
            int[] var11 = new int[4];
            for (int var12 = 0; ~var12 > -5; ++var12) {
                var11[var12] = arg0.method789(-8);
                if (var11[var12] == 65535) {
                    var11[var12] = -1;
                }
            }
            int var13 = arg0.method755(true);
            class486.method2777(arg4, var13, var11, (byte) -81);
        }
        if (~(arg3 & 4096) != -1) {
            int var14 = arg0.method763(106);
            arg4.field5261 = arg0.method755(true);
            arg4.field5244 = arg0.method793((byte) 110);
            arg4.field5240 = 32767 & var14;
            arg4.field5224 = (32768 & var14) != 0;
            arg4.field5281 = arg4.field5261 + arg4.field5240 + class440.field5977;
        }
        if ((524288 & arg3) != 0) {
            arg4.field5290 = arg0.method766((byte) 122);
            arg4.field5211 = arg0.method771(102);
            arg4.field5279 = arg0.method785((byte) 101);
            arg4.field5268 = (byte) arg0.method793((byte) 53);
            arg4.field5284 = class440.field5977 + arg0.method763(-86);
            arg4.field5255 = class440.field5977 - -arg0.method777((byte) 115);
        }
        if (arg1 > -73) {
            method3017(119);
        }
        if (~(arg3 & 32768) != -1) {
            arg4.field5228 = arg0.method752(0);
            if (arg4.field5228.charAt(0) == '~') {
                arg4.field5228 = arg4.field5228.substring(1);
                class648.method3634(2, arg4.field5228, (byte) -13, arg4.method4235(true, true), arg4.method4234(false, true), 0, arg4.field10625);
            } else if (class235.field3379 == arg4) {
                class648.method3634(2, arg4.field5228, (byte) -13, arg4.method4235(true, true), arg4.method4234(false, true), 0, arg4.field10625);
            }
            arg4.field5265 = 0;
            arg4.field5257 = 0;
            arg4.field5223 = 150;
        }
        if (~(arg3 & 65536) != -1) {
            int var15 = arg0.method789(-8);
            int var16 = arg0.method772(113);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var17 = arg0.method749((byte) -57);
            int var18 = 7 & var17;
            int var19 = 15 & var17 >> 3;
            if (var19 == 15) {
                var19 = -1;
            }
            arg4.method2341(2, var16, var15, var18, -101, var19);
        }
        if (~(4 & arg3) != -1) {
            class104.field1679[arg2] = arg0.method785((byte) 118);
        }
        if (~(256 & arg3) != -1) {
            int var20 = arg0.method793((byte) 48);
            int[] var21 = new int[var20];
            int[] var22 = new int[var20];
            int[] var23 = new int[var20];
            for (int var24 = 0; ~var24 > ~var20; ++var24) {
                int var25 = arg0.method763(-28);
                if (~var25 == -65536) {
                    var25 = -1;
                }
                var21[var24] = var25;
                var22[var24] = arg0.method755(true);
                var23[var24] = arg0.method763(-23);
            }
            class210.method1482(var22, var21, var23, (byte) 97, arg4);
        }
        if ((arg3 & 262144) != 0) {
            int var26 = arg0.method755(true);
            int[] var27 = new int[var26];
            int[] var28 = new int[var26];
            for (int var29 = 0; ~var26 < ~var29; ++var29) {
                int var30 = arg0.method763(121);
                if (~(49152 & var30) == -49153) {
                    int var31 = arg0.method789(-8);
                    var27[var29] = class530.method3011(var30 << 16, var31);
                } else {
                    var27[var29] = var30;
                }
                var28[var29] = arg0.method777((byte) -47);
            }
            arg4.method2336(var27, (byte) -8, var28);
        }
        if ((512 & arg3) != 0) {
            int var32 = arg0.method789(-8);
            if (~var32 == -65536) {
                var32 = -1;
            }
            int var33 = arg0.method796(34);
            int var34 = arg0.method749((byte) -67);
            int var35 = 7 & var34;
            int var36 = var34 >> 3 & 15;
            if (~var36 == -16) {
                var36 = -1;
            }
            arg4.method2341(1, var33, var32, var35, -117, var36);
        }
        if ((arg3 & 8192) != 0) {
            arg4.field5218 = arg0.method744(3);
            arg4.field5226 = arg0.method785((byte) 100);
            arg4.field5219 = arg0.method785((byte) 105);
            arg4.field5264 = arg0.method744(3);
            arg4.field5254 = arg0.method789(-8) + class440.field5977;
            arg4.field5269 = arg0.method784((byte) -127) + class440.field5977;
            arg4.field5235 = arg0.method793((byte) 54);
            arg4.field5305 = 0;
            if (arg4.field10618) {
                arg4.field5219 += arg4.field10656;
                arg4.field5218 += arg4.field10656;
                arg4.field5226 += arg4.field10624;
                arg4.field5264 += arg4.field10624;
                arg4.field5307 = 0;
            } else {
                arg4.field5219 += arg4.field5304[0];
                arg4.field5264 += arg4.field5308[0];
                arg4.field5307 = 1;
                arg4.field5218 += arg4.field5304[0];
                arg4.field5226 += arg4.field5308[0];
            }
        }
        if ((2048 & arg3) != 0) {
            var10 = arg0.method771(98);
        }
        if (~(arg3 & 32) != -1) {
            arg4.field10633 = arg0.method784((byte) -116);
            if (~arg4.field5307 == -1) {
                arg4.method2332(arg4.field10633, 7416);
                arg4.field10633 = -1;
            }
        }
        if (~(64 & arg3) != -1) {
            int var37 = arg0.method779((byte) 118);
            byte[] var38 = new byte[var37];
            class93 var39 = new class93(var38);
            arg0.method737(-32768, var38, 0, var37);
            class341.field4601[arg2] = var39;
            arg4.method4245(-65536, var39);
        }
        if ((arg3 & 16) != 0) {
            int var40 = arg0.method789(-8);
            if (~var40 == -65536) {
                var40 = -1;
            }
            arg4.field5286 = var40;
        }
        if (~(1024 & arg3) != -1) {
            arg4.field10639 = arg0.method755(true) == 1;
        }
        if (~(arg3 & 1) != -1) {
            int var41 = arg0.method749((byte) -84);
            if (~var41 < -1) {
                for (int var42 = 0; ~var42 > ~var41; ++var42) {
                    int var43 = -1;
                    int var44 = -1;
                    int var45 = arg0.method746(false);
                    int var46 = -1;
                    if (var45 == 32767) {
                        var45 = arg0.method746(false);
                        var44 = arg0.method746(false);
                        var43 = arg0.method746(false);
                        var46 = arg0.method746(false);
                    } else if (~var45 == -32767) {
                        var45 = -1;
                    } else {
                        var44 = arg0.method746(false);
                    }
                    int var47 = arg0.method746(false);
                    int var48 = arg0.method793((byte) 23);
                    arg4.method2337(var46, -72, var47, var44, var48, var43, class440.field5977, var45);
                }
            }
        }
        if (arg4.field10618) {
            if (~var10 != -128) {
                byte var49;
                if (var10 == -1) {
                    var49 = class104.field1679[arg2];
                } else {
                    var49 = var10;
                }
                class579.method3335(arg4, var49, 118);
                arg4.method4240(false, arg4.field10656, var49, arg4.field10624);
            } else {
                arg4.method4237(arg4.field10624, arg4.field10656, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)Laba;")
    public static final class189 method3016(byte arg0) {
        if (arg0 > -96) {
            method3017(117);
        }
        ++field7195;
        return class527.method2998(1, true);
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
    public static void method3017(int arg0) {
        field7197 = null;
        if (arg0 >= -75) {
            field7197 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field7192;
        int[] var3 = super.field4927.method808(-127, arg1);
        if (arg0 != -2026769311) {
            return null;
        } else {
            if (super.field4927.field1471) {
                class275.method1772(var3, 0, class769.field10597, this.field7196);
            }
            return var3;
        }
    }
}
