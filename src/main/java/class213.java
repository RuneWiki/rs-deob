import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class213 extends class212 {

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "Z")
    public boolean field3676 = false;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "I")
    private int field3679 = 128;

    @OriginalMember(owner = "client!sh", name = "eb", descriptor = "I")
    private int field3690 = 128;

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
    private int field3682 = 0;

    @OriginalMember(owner = "client!sh", name = "Z", descriptor = "I")
    private int field3685 = 0;

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "I")
    public int field3680 = -1;

    @OriginalMember(owner = "client!sh", name = "db", descriptor = "I")
    private int field3689 = 0;

    @OriginalMember(owner = "client!sh", name = "ab", descriptor = "I")
    public static int field3686 = 0;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "J")
    public static long field3678 = 0L;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field3673 = -1;

    @OriginalMember(owner = "client!sh", name = "ib", descriptor = "I")
    public static int field3694 = 0;

    @OriginalMember(owner = "client!sh", name = "Y", descriptor = "Lqe;")
    private static class168 field3684 = class66.method448("Location", -124);

    @OriginalMember(owner = "client!sh", name = "jb", descriptor = "Lqe;")
    public static class168 field3695 = field3684;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    private int field3672;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!sh", name = "cb", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!sh", name = "fb", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!sh", name = "hb", descriptor = "I")
    public int field3693;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "[S")
    private short[] field3674;

    @OriginalMember(owner = "client!sh", name = "bb", descriptor = "[S")
    private short[] field3687;

    @OriginalMember(owner = "client!sh", name = "gb", descriptor = "[S")
    private short[] field3692;

    @OriginalMember(owner = "client!sh", name = "kb", descriptor = "[S")
    private short[] field3696;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)Lc;")
    public static final class237 method1370(int arg0, int arg1) {
        field3688++;
        class237 var2 = (class237) class142.field2503.method1499(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class158.field2728.method1712(class146.method986(arg1, 127), method1373(-59, arg1), arg0);
        class237 var4 = new class237();
        if (var3 != null) {
            var4.method1537(true, new class112(var3));
        }
        var4.method1547(false);
        class142.field2503.method1502((byte) -18, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILoe;)V")
    public static final void method1371(int arg0, class256 arg1) {
        if (arg0 == -1) {
            class150.field2615 = arg1;
            field3683++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Lva;")
    public static final class199 method1372(int arg0, int arg1, int arg2) {
        class177 var3 = class254.field4395[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3103;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)I")
    private static final int method1373(int arg0, int arg1) {
        field3681++;
        if (arg0 >= -10) {
            field3678 = 54L;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILnh;)V")
    public final void method1374(int arg0, class112 arg1) {
        field3671++;
        if (arg0 != -9383) {
            return;
        }
        while (true) {
            int var3 = arg1.method758(true);
            if (var3 == 0) {
                return;
            }
            this.method1377(var3, (byte) -104, arg1);
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(II)Lqc;")
    public final class188 method1375(int arg0, int arg1) {
        class188 var3 = (class188) class93.field1465.method10(-22553, (long) this.field3693);
        field3675++;
        if (var3 == null) {
            class218 var4 = class218.method1446(class254.field4393, this.field3672, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3692 != null) {
                for (int var5 = 0; var5 < this.field3692.length; var5++) {
                    var4.method1433(this.field3692[var5], this.field3674[var5]);
                }
            }
            if (this.field3696 != null) {
                for (int var6 = 0; var6 < this.field3696.length; var6++) {
                    var4.method1430(this.field3696[var6], this.field3687[var6]);
                }
            }
            var3 = var4.method1434(this.field3689 + 64, this.field3682 + 850, -30, -50, -30);
            class93.field1465.method11(var3, (long) this.field3693, 25);
        }
        class188 var7;
        if (this.field3680 == -1 || arg1 == -1) {
            var7 = var3.method251(true, true);
        } else {
            var7 = method1370(-1, this.field3680).method1545(-633, var3, arg1);
        }
        if (this.field3679 != 128 || this.field3690 != 128) {
            var7.method252(this.field3679, this.field3690, this.field3679);
        }
        if (this.field3685 != 0) {
            if (this.field3685 == 90) {
                var7.method235();
            }
            if (this.field3685 == 180) {
                var7.method241();
            }
            if (this.field3685 == 270) {
                var7.method229();
            }
        }
        if (arg0 > -1) {
            this.field3696 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
    public static void method1376(byte arg0) {
        field3684 = null;
        field3695 = null;
        if (arg0 != -97) {
            method1371(125, null);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBLnh;)V")
    private final void method1377(int arg0, byte arg1, class112 arg2) {
        field3691++;
        if (arg1 >= -85) {
            return;
        }
        if (arg0 == 1) {
            this.field3672 = arg2.method731(false);
        } else if (arg0 == 2) {
            this.field3680 = arg2.method731(false);
        } else if (arg0 == 4) {
            this.field3679 = arg2.method731(false);
        } else if (arg0 == 5) {
            this.field3690 = arg2.method731(false);
        } else if (arg0 == 6) {
            this.field3685 = arg2.method731(false);
        } else if (arg0 == 7) {
            this.field3689 = arg2.method758(true);
        } else if (arg0 == 8) {
            this.field3682 = arg2.method758(true);
        } else if (arg0 == 9) {
            this.field3676 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method758(true);
            this.field3674 = new short[var6];
            this.field3692 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3692[var7] = (short) arg2.method731(false);
                this.field3674[var7] = (short) arg2.method731(false);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method758(true);
            this.field3687 = new short[var4];
            this.field3696 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3696[var5] = (short) arg2.method731(false);
                this.field3687[var5] = (short) arg2.method731(false);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1378(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field3670++;
        if (arg2 <= 11) {
            field3695 = null;
        }
        if (class190.field3311 == 0 && !class84.field1277) {
            class194.field3377++;
            int var7 = class254.field4401;
            int var8 = class18.field187;
            int var9 = class110.field1760;
            int var10 = class3.field32;
            int var11 = (arg0 - arg5) * (var9 - var7) / arg6 + var7;
            int var12 = (arg1 - arg4) * (var8 - var10) / arg3 + var10;
            class94.method624(var11, 0L, (short) 51, var12, class222.field3816, class121.field2015, (byte) 112);
        }
        long var13 = -1L;
        for (int var15 = 0; var15 < class166.field2834; var15++) {
            long var16 = class96.field1516[var15];
            int var18 = (int) var16 >> 7 & 0x7F;
            int var19 = (int) var16 >> 29 & 0x3;
            int var20 = (int) (var16 >>> 32) & Integer.MAX_VALUE;
            int var21 = (int) var16 & 0x7F;
            if (var13 != var16) {
                var13 = var16;
                if (var19 == 2 && class161.method1045(class196.field3401, var21, var18, var16)) {
                    class70 var22 = class190.method1232(var20, 13090);
                    if (var22.field1069 != null) {
                        var22 = var22.method471(true);
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (class190.field3311 == 1) {
                        class61.field835++;
                        class94.method624(var21, var16, (short) 6, var18, class50.method347(2, new class168[] { class117.field1911, class76.field1137, var22.field1009 }), class90.field1398, (byte) 120);
                    } else if (!class84.field1277) {
                        class168[] var23 = var22.field1034;
                        class1.field9++;
                        if (class249.field4321) {
                            var23 = class233.method1505((byte) -91, var23);
                        }
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
                                    class205.field3567++;
                                    short var25 = 0;
                                    if (var24 == 0) {
                                        var25 = 35;
                                    }
                                    if (var24 == 1) {
                                        var25 = 40;
                                    }
                                    if (var24 == 2) {
                                        var25 = 38;
                                    }
                                    if (var24 == 3) {
                                        var25 = 22;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1005;
                                    }
                                    class94.method624(var21, var16, var25, var18, class50.method347(2, new class168[] { class252.field4366, var22.field1009 }), var23[var24], (byte) 103);
                                }
                            }
                        }
                        class94.method624(var21, (long) var22.field1073, (short) 1004, var18, class50.method347(2, new class168[] { class252.field4366, var22.field1009 }), class147.field2554, (byte) 112);
                    } else if ((class172.field2985 & 0x4) == 4) {
                        class94.method624(var21, var16, (short) 21, var18, class50.method347(2, new class168[] { class128.field2118, class76.field1137, var22.field1009 }), class19.field236, (byte) 102);
                        class244.field4235++;
                    }
                }
                if (var19 == 1) {
                    class222 var26 = class229.field3898[var20];
                    if (var26.field3814.field3189 == 1 && (var26.field190 & 0x7F) == 64 && (var26.field166 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < class82.field1244; var27++) {
                            class222 var30 = class229.field3898[class51.field690[var27]];
                            if (var30 != null && var26 != var30 && var30.field3814.field3189 == 1 && var26.field190 == var30.field190 && var26.field166 == var30.field166) {
                                class25.method169((byte) -35, var18, var21, class51.field690[var27], var30.field3814);
                            }
                        }
                        for (int var28 = 0; var28 < class132.field2322; var28++) {
                            class121 var29 = class104.field1677[class115.field1868[var28]];
                            if (var29 != null && var26.field190 == var29.field190 && var26.field166 == var29.field166) {
                                class89.method592(var21, class115.field1868[var28], true, var29, var18);
                            }
                        }
                    }
                    class25.method169((byte) -35, var18, var21, var20, var26.field3814);
                }
                if (var19 == 0) {
                    class121 var31 = class104.field1677[var20];
                    if ((var31.field190 & 0x7F) == 64 && (var31.field166 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < class82.field1244; var32++) {
                            class222 var35 = class229.field3898[class51.field690[var32]];
                            if (var35 != null && var35.field3814.field3189 == 1 && var31.field190 == var35.field190 && var31.field166 == var35.field166) {
                                class25.method169((byte) -35, var18, var21, class51.field690[var32], var35.field3814);
                            }
                        }
                        for (int var33 = 0; var33 < class132.field2322; var33++) {
                            class121 var34 = class104.field1677[class115.field1868[var33]];
                            if (var34 != null && var31 != var34 && var31.field190 == var34.field190 && var31.field166 == var34.field166) {
                                class89.method592(var21, class115.field1868[var33], true, var34, var18);
                            }
                        }
                    }
                    class89.method592(var21, var20, true, var31, var18);
                }
                if (var19 == 3) {
                    class47 var36 = class77.field1158[class196.field3401][var21][var18];
                    if (var36 != null) {
                        for (class159 var37 = (class159) var36.method322((byte) 82); var37 != null; var37 = (class159) var36.method316(-109)) {
                            int var38 = var37.field2751.field2844;
                            class242 var39 = class151.method1005(520, var38);
                            if (class190.field3311 == 1) {
                                class4.field55++;
                                class94.method624(var21, (long) var38, (short) 3, var18, class50.method347(2, new class168[] { class117.field1911, class242.field4134, var39.field4167 }), class90.field1398, (byte) 118);
                            } else if (!class84.field1277) {
                                class46.field602++;
                                class168[] var40 = var39.field4196;
                                if (class249.field4321) {
                                    var40 = class233.method1505((byte) -103, var40);
                                }
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var40 != null && var40[var41] != null) {
                                        class249.field4308++;
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 2;
                                        }
                                        if (var41 == 1) {
                                            var42 = 33;
                                        }
                                        if (var41 == 2) {
                                            var42 = 29;
                                        }
                                        if (var41 == 3) {
                                            var42 = 37;
                                        }
                                        if (var41 == 4) {
                                            var42 = 31;
                                        }
                                        class94.method624(var21, (long) var38, var42, var18, class50.method347(2, new class168[] { class85.field1328, var39.field4167 }), var40[var41], (byte) 114);
                                    } else if (var41 == 2) {
                                        class187.field3290++;
                                        class94.method624(var21, (long) var38, (short) 29, var18, class50.method347(2, new class168[] { class85.field1328, var39.field4167 }), class212.field3664, (byte) 120);
                                    }
                                }
                                class94.method624(var21, (long) var38, (short) 1002, var18, class50.method347(2, new class168[] { class85.field1328, var39.field4167 }), class147.field2554, (byte) 123);
                            } else if ((class172.field2985 & 0x1) == 1) {
                                class153.field2652++;
                                class94.method624(var21, (long) var38, (short) 9, var18, class50.method347(2, new class168[] { class128.field2118, class242.field4134, var39.field4167 }), class19.field236, (byte) 118);
                            }
                        }
                    }
                }
            }
        }
    }
}
