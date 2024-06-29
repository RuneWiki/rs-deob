import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class765 extends class173 {

    @OriginalMember(owner = "client!vba", name = "s", descriptor = "I")
    public int field10399;

    @OriginalMember(owner = "client!vba", name = "G", descriptor = "I")
    public int field10413;

    @OriginalMember(owner = "client!vba", name = "x", descriptor = "J")
    public long field10404;

    @OriginalMember(owner = "client!vba", name = "B", descriptor = "Ljava/lang/String;")
    public String field10408;

    @OriginalMember(owner = "client!vba", name = "A", descriptor = "Z")
    public boolean field10407;

    @OriginalMember(owner = "client!vba", name = "w", descriptor = "Z")
    public boolean field10403;

    @OriginalMember(owner = "client!vba", name = "t", descriptor = "I")
    public int field10400;

    @OriginalMember(owner = "client!vba", name = "F", descriptor = "I")
    public int field10412;

    @OriginalMember(owner = "client!vba", name = "v", descriptor = "I")
    public int field10402;

    @OriginalMember(owner = "client!vba", name = "r", descriptor = "Z")
    public boolean field10398;

    @OriginalMember(owner = "client!vba", name = "C", descriptor = "J")
    public long field10409;

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "Ljava/lang/String;")
    public String field10406;

    @OriginalMember(owner = "client!vba", name = "E", descriptor = "[I")
    public static int[] field10411 = new int[2];

    @OriginalMember(owner = "client!vba", name = "u", descriptor = "I")
    public static int field10401;

    @OriginalMember(owner = "client!vba", name = "y", descriptor = "I")
    public static int field10405;

    @OriginalMember(owner = "client!vba", name = "H", descriptor = "I")
    public static int field10414;

    @OriginalMember(owner = "client!vba", name = "D", descriptor = "Ljava/lang/String;")
    public String field10410;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method4158(boolean arg0) {
        field10401++;
        for (int var1 = 0; var1 < class338.field4123; var1++) {
            int var2 = class752.field10246[var1];
            class727 var3 = ((class232) class444.field5811.method2616((long) var2, (byte) -89)).field3125;
            int var4 = class356.field4337.method1509(true);
            if ((var4 & 0x8) != 0) {
                var4 += class356.field4337.method1509(arg0) << 8;
            }
            if ((var4 & 0x100) != 0) {
                var4 += class356.field4337.method1509(true) << 16;
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field9545.method1580(!arg0)) {
                    class569.method3062(-10290, var3);
                }
                var3.method3887(class595.field7561.method765((byte) -53, class356.field4337.method1553((byte) -119)), 1);
                var3.method2174(0, var3.field9545.field3314);
                var3.field4750 = var3.field9545.field3270 << 3;
                if (var3.field9545.method1580(false)) {
                    class663.method3612(0, var3.field4758[0], var3.field4767[0], null, var3.field2895, var3, 1588241065, null);
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field9536 = class356.field4337.method1553((byte) -122);
                var3.field9549 = class356.field4337.method1531((byte) -2);
            }
            if ((var4 & 0x20) != 0) {
                int var5 = class356.field4337.method1489(2);
                int var6 = class356.field4337.method1527(1879355664);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var7 = class356.field4337.method1522(13763);
                int var8 = var7 & 0x7;
                int var9 = var7 >> 3 & 0xF;
                if (var9 == 15) {
                    var9 = -1;
                }
                var3.method2183(var6, -110, var9, 0, var5, var8);
            }
            if ((var4 & 0x400) != 0) {
                int var10 = class356.field4337.method1492(-58);
                int[] var11 = new int[var10];
                int[] var12 = new int[var10];
                int[] var13 = new int[var10];
                for (int var14 = 0; var14 < var10; var14++) {
                    int var15 = class356.field4337.method1531((byte) -2);
                    if (var15 == 65535) {
                        var15 = -1;
                    }
                    var11[var14] = var15;
                    var12[var14] = class356.field4337.method1511(128);
                    var13[var14] = class356.field4337.method1531((byte) -2);
                }
                class258.method1652(var3, var12, var11, var13, 10810);
            }
            if ((var4 & 0x4000) != 0) {
                int var16 = class356.field4337.method1492(-99);
                int[] var17 = new int[var16];
                int[] var18 = new int[var16];
                for (int var19 = 0; var19 < var16; var19++) {
                    int var20 = class356.field4337.method1531((byte) -2);
                    if ((var20 & 0xC000) == 49152) {
                        int var21 = class356.field4337.method1553((byte) -109);
                        var17[var19] = class77.method473(var21, var20 << 16);
                    } else {
                        var17[var19] = var20;
                    }
                    var18[var19] = class356.field4337.method1553((byte) -118);
                }
                var3.method2170(var17, var18, 256);
            }
            if ((var4 & 0x8000) != 0) {
                var3.field4713 = class356.field4337.method1504(-5434);
                var3.field4686 = class356.field4337.method1503(16711680);
                var3.field4699 = class356.field4337.method1503(16711680);
                var3.field4674 = (byte) class356.field4337.method1492(-100);
                var3.field4711 = class693.field8900 + class356.field4337.method1551(255);
                var3.field4718 = class693.field8900 + class356.field4337.method1531((byte) -2);
            }
            if ((var4 & 0x20000) != 0) {
                int var22 = class356.field4337.method1531((byte) -2);
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = class356.field4337.method1526((byte) 57);
                int var24 = class356.field4337.method1492(-109);
                int var25 = var24 & 0x7;
                int var26 = (var24 & 0x79) >> 3;
                if (var26 == 15) {
                    var26 = -1;
                }
                var3.method2183(var23, 9, var26, 2, var22, var25);
            }
            if ((var4 & 0x10000) != 0) {
                var3.field9551 = class356.field4337.method1540((byte) -122);
                if ("".equals(var3.field9551) || var3.field9551.equals(var3.field9545.field3274)) {
                    var3.field9551 = var3.field9545.field3274;
                }
            }
            if ((var4 & 0x200) != 0) {
                int var27 = var3.field9545.field3319.length;
                int var28 = 0;
                if (var3.field9545.field3309 != null) {
                    var28 = var3.field9545.field3309.length;
                }
                int var29 = 0;
                if (var3.field9545.field3250 != null) {
                    var29 = var3.field9545.field3250.length;
                }
                int var30 = class356.field4337.method1509(true);
                if ((var30 & 0x1) == 1) {
                    var3.field9544 = null;
                } else {
                    int[] var31 = null;
                    if ((var30 & 0x2) == 2) {
                        var31 = new int[var27];
                        for (int var32 = 0; var32 < var27; var32++) {
                            var31[var32] = class356.field4337.method1551(255);
                        }
                    }
                    short[] var33 = null;
                    if ((var30 & 0x4) == 4) {
                        var33 = new short[var28];
                        for (int var34 = 0; var34 < var28; var34++) {
                            var33[var34] = (short) class356.field4337.method1551(255);
                        }
                    }
                    short[] var35 = null;
                    if ((var30 & 0x8) == 8) {
                        var35 = new short[var29];
                        for (int var36 = 0; var36 < var29; var36++) {
                            var35[var36] = (short) class356.field4337.method1531((byte) -2);
                        }
                    }
                    long var37 = (long) var2 | (long) (var3.field9552++) << 32;
                    var3.field9544 = new class425(var37, var31, var33, var35);
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field4723 = class356.field4337.method1531((byte) -2);
                if (var3.field4723 == 65535) {
                    var3.field4723 = -1;
                }
            }
            if ((var4 & 0x80000) != 0) {
                var3.field9555 = class356.field4337.method1531((byte) -2);
                if (var3.field9555 == 65535) {
                    var3.field9555 = var3.field9545.field3263;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field4709 = class356.field4337.method1540((byte) -108);
                var3.field4664 = 100;
            }
            if ((var4 & 0x40000) != 0) {
                int var39 = var3.field9545.field3261.length;
                int var40 = 0;
                if (var3.field9545.field3309 != null) {
                    var40 = var3.field9545.field3309.length;
                }
                byte var41 = 0;
                if (var3.field9545.field3250 != null) {
                    var40 = var3.field9545.field3250.length;
                }
                int var42 = class356.field4337.method1492(-49);
                if ((var42 & 0x1) != 1) {
                    int[] var43 = null;
                    if ((var42 & 0x2) == 2) {
                        var43 = new int[var39];
                        for (int var44 = 0; var44 < var39; var44++) {
                            var43[var44] = class356.field4337.method1553((byte) 123);
                        }
                    }
                    short[] var45 = null;
                    if ((var42 & 0x4) == 4) {
                        var45 = new short[var40];
                        for (int var46 = 0; var46 < var40; var46++) {
                            var45[var46] = (short) class356.field4337.method1551(255);
                        }
                    }
                    short[] var47 = null;
                    if ((var42 & 0x8) == 8) {
                        var47 = new short[var41];
                        for (int var48 = 0; var48 < var41; var48++) {
                            var47[var48] = (short) class356.field4337.method1551(255);
                        }
                    }
                    long var49 = (long) (var3.field9546++) << 32 | (long) var2;
                    new class425(var49, var43, var45, var47);
                }
            }
            if ((var4 & 0x2000) != 0) {
                var3.field4736 = class356.field4337.method1554(27806);
                var3.field4745 = class356.field4337.method1554(27806);
                var3.field4727 = class356.field4337.method1512(23037);
                var3.field4680 = class356.field4337.method1503(16711680);
                var3.field4675 = class356.field4337.method1489(2) + class693.field8900;
                var3.field4690 = class356.field4337.method1551(255) + class693.field8900;
                var3.field4693 = class356.field4337.method1522(13763);
                var3.field4736 += var3.field4767[0];
                var3.field4727 += var3.field4767[0];
                var3.field4745 += var3.field4758[0];
                var3.field4680 += var3.field4758[0];
                var3.field4765 = 0;
                var3.field4764 = 1;
            }
            if ((var4 & 0x1000) != 0) {
                int var51 = class356.field4337.method1489(2);
                if (var51 == 65535) {
                    var51 = -1;
                }
                int var52 = class356.field4337.method1552((byte) 105);
                int var53 = class356.field4337.method1492(-37);
                int var54 = var53 & 0x7;
                int var55 = var53 >> 3 & 0xF;
                if (var55 == 15) {
                    var55 = -1;
                }
                var3.method2183(var52, -112, var55, 1, var51, var54);
            }
            if ((var4 & 0x1) != 0) {
                int var56 = class356.field4337.method1522(13763);
                if (var56 > 0) {
                    for (int var57 = 0; var57 < var56; var57++) {
                        int var58 = -1;
                        int var59 = -1;
                        int var60 = -1;
                        int var61 = class356.field4337.method1505((byte) -6);
                        if (var61 == 32767) {
                            var61 = class356.field4337.method1505((byte) -6);
                            var59 = class356.field4337.method1505((byte) -6);
                            var58 = class356.field4337.method1505((byte) -6);
                            var60 = class356.field4337.method1505((byte) -6);
                        } else if (var61 == 32766) {
                            var61 = -1;
                        } else {
                            var59 = class356.field4337.method1505((byte) -6);
                        }
                        int var62 = class356.field4337.method1505((byte) -6);
                        int var63 = class356.field4337.method1509(true);
                        var3.method2168(var63, class693.field8900, var59, var61, var62, -23, var58, var60);
                    }
                }
            }
            if ((var4 & 0x800) != 0) {
                int var64 = class356.field4337.method1531((byte) -2);
                var3.field4708 = class356.field4337.method1522(13763);
                var3.field4751 = class356.field4337.method1509(true);
                var3.field4689 = (var64 & 0x8000) != 0;
                var3.field4703 = var64 & 0x7FFF;
                var3.field4702 = class693.field8900 + var3.field4703 + var3.field4708;
            }
            if ((var4 & 0x80) != 0) {
                int[] var65 = new int[4];
                for (int var66 = 0; var66 < 4; var66++) {
                    var65[var66] = class356.field4337.method1551(255);
                    if (var65[var66] == 65535) {
                        var65[var66] = -1;
                    }
                }
                int var67 = class356.field4337.method1492(-39);
                class708.method3828(65535, var3, var67, var65);
            }
        }
        if (!arg0) {
            field10411 = null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V", line = 499)
    public static void method4159(int arg0) {
        field10411 = null;
        if (arg0 != 0) {
            method4159(-113);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIII)V", line = 514)
    public static final void method4160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10405++;
        float var5 = (float) class402.field5342 / (float) class402.field5356;
        int var6 = arg2;
        int var7 = arg3;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        if (arg0 <= 69) {
            return;
        }
        int var8 = arg4 - (arg3 - var7) / 2;
        int var9 = arg1 - (arg2 - var6) / 2;
        class774.field10556 = -1;
        class669.field8692 = class402.field5356 * var9 / var6;
        class238.field3238 = class402.field5342 - (class402.field5342 * var8 / var7);
        class490.field6304 = -1;
        class401.method2327(-1);
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V", line = 544)
    public class765(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field10399 = arg2;
        this.field10413 = arg6;
        this.field10404 = arg5;
        this.field10408 = arg1;
        this.field10407 = arg11;
        this.field10403 = arg8;
        this.field10400 = arg4;
        this.field10412 = arg3;
        this.field10402 = arg7;
        this.field10398 = arg9;
        this.field10409 = arg10;
        this.field10406 = arg0;
    }
}
