import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class261 {

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
    private int[] field4176 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public int field4174 = -1;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Z")
    public boolean field4192 = false;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field4173 = 0;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lck;")
    public static class119 field4189 = class298.method1987((byte) 47, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field4180 = 0;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Lvh;")
    public static class212 field4177 = new class212(4096);

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field4196 = 0;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Lwj;")
    public static class268 field4183;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Lva;")
    public static class36 field4195;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
    private int[] field4172;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[S")
    private short[] field4179;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "[S")
    private short[] field4181;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "[S")
    private short[] field4182;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "[S")
    private short[] field4186;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1674(int arg0) {
        field4191++;
        int var1 = class110.field1683.method1833(class152.field2429);
        for (int var2 = 0; var2 < class272.field4474; var2++) {
            int var3 = class110.field1683.method1833(class50.method388(arg0 ^ 0xFFFFFFDF, var2));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        if (arg0 != 32) {
            field4195 = (class36) null;
        }
        class257.field4128 = class272.field4474 * 15 + 22;
        class59.field949 = var1;
        int var4 = class272.field4474 * 15 + 21;
        class104.field1612 = true;
        int var5 = class245.field3975 - (var1 / 2);
        int var6 = class210.field3346;
        if (var1 + var5 > class269.field4437) {
            var5 = class269.field4437 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class131.field2000 < var4 + var6) {
            var6 = class131.field2000 - var4;
        }
        class104.field1599 = var5;
        if (var6 < 0) {
            var6 = 0;
        }
        class67.field1035 = var6;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLck;)Loc;", line = 63)
    public static final class217 method1675(byte arg0, class119 arg1) {
        field4178++;
        try {
            if (arg0 < 69) {
                method1683(82);
            }
            class119 var2 = arg1.method779(false);
            if (var2.method784(class283.field4677, 113)) {
                return new class217(class236.field3799, class245.field3966, class236.field3799, 1, false, (class119) null);
            }
            int var3;
            if ((var3 = var2.method788(1, class244.field3954)) < 0) {
                int var4;
                if ((var4 = var2.method788(1, class203.field3222)) < 0) {
                    int var5;
                    if ((var5 = var2.method788(1, class245.field3969)) < 0) {
                        if (var2.method788(1, class35.field492) >= 0 && var2.method788(1, class266.field4366) >= 0) {
                            return new class217(class157.field2503, class100.field1515, class156.field2478, 0, false, (class119) null);
                        }
                        int var6;
                        if ((var6 = var2.method788(1, class242.field3892)) >= 0) {
                            int var47 = var6 + 11;
                            int var7;
                            if ((var7 = var2.method763(var47, (byte) 27, 47)) > 0) {
                                var2 = var2.method762(var7, 0, 0);
                            }
                            class119 var8 = null;
                            class119 var10;
                            if (var2.method788(1, class117.field1769) >= 0) {
                                var10 = class297.field4970;
                            } else if (var2.method788(1, class214.field3420) < 0) {
                                int var9;
                                if ((var9 = var2.method788(1, class94.field1453)) < 0) {
                                    var10 = class236.field3799;
                                } else {
                                    var10 = class20.field287;
                                    int var48 = var9 + 6;
                                    if (var48 < var2.method776((byte) -47) && class156.method993(var2.method755((byte) -120, var48), (byte) -46)) {
                                        var8 = class140.method927((byte) -30, var48);
                                    }
                                }
                            } else {
                                var10 = class150.field2376;
                            }
                            return new class217(class157.field2503, var10, var8, 0, false, (class119) null);
                        }
                    } else {
                        int var46 = var5 + 5;
                        int var11 = -1;
                        class119 var12 = null;
                        boolean var13 = false;
                        class119 var14 = null;
                        int var15;
                        if ((var15 = var2.method763(var46, (byte) 25, 47)) > 0) {
                            var2 = var2.method762(var15, 0, 0);
                        }
                        class119 var16 = var2.method769(-75, var46 + 1).method787((byte) 25);
                        if (var16.method776((byte) -53) > 0) {
                            class119[] var17 = var16.method771(-256, 32);
                            int var18 = 0;
                            while (true) {
                                if (var17.length <= var18) {
                                    if (var14 == null) {
                                        int var20;
                                        if ((var20 = var16.method758(45, 13548)) >= 0) {
                                            var14 = var16.method762(var20, 0, 0);
                                            var12 = var16.method769(-88, var20 + 1);
                                        } else if (var16.method795(class256.field4115, (byte) -103)) {
                                            var14 = var16.method762(var16.method776((byte) -61) - 1, 0, 0);
                                            var12 = class256.field4115;
                                        } else if (var16.method795(class24.field366, (byte) -120)) {
                                            var14 = var16.method762(var16.method776((byte) -71) - 2, 0, 0);
                                            var12 = class24.field366;
                                        } else {
                                            var14 = var16;
                                        }
                                    }
                                    break;
                                }
                                class119 var19 = var17[var18];
                                if (var19.method776((byte) -104) >= 3 && class166.method1047(3, var19, (byte) -99)) {
                                    var14 = var19.method762(1, 0, 0);
                                    var11 = var19.method762(3, 0, 1).method783((byte) 65);
                                    if (var19.method776((byte) -68) > 3) {
                                        var12 = var19.method769(-57, 3);
                                    }
                                } else if (var19.method784(class256.field4115, 66) || var19.method784(class24.field366, 89)) {
                                    var12 = var19;
                                }
                                var18++;
                            }
                        }
                        if (var14 != null) {
                            if (var14.method784(class246.field3979, 116)) {
                                var14 = class73.field1139;
                            } else if (var14.method784(class110.field1676, 57)) {
                                var14 = class73.field1139;
                            } else if (var14.method784(client.field1403, 59)) {
                                var14 = class73.field1139;
                            } else if (var14.method784(class88.field1352, 74)) {
                                var14 = class70.field1101;
                            } else if (var14.method784(class2.field23, 105)) {
                                var14 = class70.field1101;
                            } else if (var14.method784(class24.field370, 82)) {
                                var14 = class57.field927;
                            }
                            return new class217(class146.field2346, class146.field2346, var14, var11, var12 != null && var12.method784(class24.field366, 82), var12);
                        }
                    }
                } else {
                    int var45 = var4 + 6;
                    boolean var21 = false;
                    class119 var22 = null;
                    boolean var23 = var2.method788(1, class119.field1828) >= 0;
                    class119 var24 = null;
                    int var25 = -1;
                    int var26;
                    if ((var26 = var2.method763(var45, (byte) 48, 47)) > 0) {
                        var2 = var2.method762(var26, 0, 0);
                    }
                    class119 var27 = var2.method769(-101, var45 + 1).method787((byte) 25);
                    if (var27.method776((byte) -38) > 0) {
                        class119[] var28 = var27.method771(-256, 32);
                        for (int var29 = 0; var29 < var28.length; var29++) {
                            class119 var30 = var28[var29];
                            if (var22 == null) {
                                if (var30.method784(class39.field569, 104)) {
                                    var22 = class39.field569;
                                    continue;
                                }
                                if (var30.method784(class86.field1308, 69)) {
                                    var22 = class86.field1308;
                                    continue;
                                }
                                if (var30.method761(0, class39.field569)) {
                                    var22 = class39.field569;
                                    var30 = var30.method769(-117, 2);
                                }
                                if (var30.method761(0, class197.field3154)) {
                                    var22 = class197.field3154;
                                    var30 = var30.method769(-107, 1);
                                }
                                if (var30.method776((byte) -107) >= 4 && class166.method1047(4, var30, (byte) 101)) {
                                    if (var22 == null) {
                                        var22 = var30.method762(1, 0, 0);
                                        var25 = var30.method762(3, 0, 1).method783((byte) 65);
                                    } else {
                                        var25 = var30.method762(3, 0, 0).method783((byte) 65);
                                    }
                                    if (var30.method776((byte) -107) > 4) {
                                        var24 = var30.method769(-82, 4);
                                    }
                                    continue;
                                }
                            }
                            if (var25 < 0 && class158.method1012(117, var30)) {
                                var25 = var30.method783((byte) 65);
                            }
                        }
                    }
                    if (var22 != null) {
                        if (var25 < 100) {
                            var25 *= 10;
                        }
                        if (var25 > 1000) {
                            var25 /= 10;
                        }
                        return new class217(class19.field247, class211.field3368, var22, var25, var23, var24);
                    }
                }
            } else {
                int var44 = var3 + 7;
                int var31 = -1;
                class119 var32 = null;
                boolean var33 = false;
                class119 var34 = null;
                int var35 = var2.method755((byte) -103, var44);
                if (class156.method993(var35, (byte) -46)) {
                    var32 = class140.method927((byte) -30, var35);
                }
                boolean var36 = false;
                int var37;
                if ((var37 = var2.method763(var44, (byte) -85, 47)) > 0) {
                    var2 = var2.method762(var37, 0, 0);
                }
                class119 var38 = var2.method769(-111, var44 + 1).method787((byte) 25);
                if (var38.method776((byte) -63) > 0) {
                    class119[] var39 = var38.method771(-256, 32);
                    for (int var40 = 0; var40 < var39.length; var40++) {
                        class119 var41 = var39[var40];
                        if (var41.method784(class252.field4050, 64)) {
                            var33 = true;
                        } else {
                            if (var41.method761(0, class226.field3614)) {
                                var33 = true;
                                if (var41.method776((byte) -109) <= 2) {
                                    continue;
                                }
                                var41 = var41.method769(-87, 2);
                            }
                            if (var32 == null) {
                                if (var41.method784(class179.field2853, 122)) {
                                    var32 = class232.field3752;
                                    var31 = 256;
                                    continue;
                                }
                                if (var41.method776((byte) -54) == 4) {
                                    if (class158.method1012(-107, var41)) {
                                        var32 = var41.method762(1, 0, 0);
                                        var31 = var41.method769(-124, 1).method783((byte) 65);
                                        continue;
                                    }
                                    if (class166.method1047(2, var41, (byte) 104) && var41.method795(class229.field3710, (byte) -62)) {
                                        var32 = var41.method762(1, 0, 0);
                                        var31 = var41.method762(2, 0, 1).method783((byte) 65) * 100;
                                        continue;
                                    }
                                } else if (var41.method776((byte) -58) > 4 && class166.method1047(4, var41, (byte) 103)) {
                                    var32 = var41.method762(1, 0, 0);
                                    var31 = var41.method762(4, 0, 1).method783((byte) 65);
                                    var34 = var41.method769(-63, 4);
                                    if (var34.method784(class252.field4050, 89) || var34.method784(class226.field3614, 45)) {
                                        var33 = true;
                                        var34 = null;
                                    }
                                    continue;
                                }
                            }
                            if (var31 < 0 && class158.method1012(105, var41)) {
                                var31 = var41.method783((byte) 65);
                            } else if (var34 == null && (var41.method784(class29.field418, 82) || var41.method784(class139.field2232, 94) || var41.method784(class100.field1514, 71) || var41.method784(class26.field387, 63) || var41.method784(class240.field3838, 91) || var41.method784(class3.field67, 125) || var41.method784(class244.field3941, 75) || var41.method784(class216.field3468, 61))) {
                                var34 = var41;
                            }
                        }
                    }
                }
                if (var32 != null) {
                    if (var31 < 100) {
                        var31 *= 10;
                    }
                    if (var31 > 1000) {
                        var31 /= 10;
                    }
                    return new class217(class227.field3638, class106.field1623, var32, var31, var33, var34);
                }
            }
        } catch (Exception var43) {
        }
        return new class217(class236.field3799, class236.field3799, class236.field3799, 1, false, (class119) null);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lfj;IB)V", line = 484)
    private final void method1676(class3 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field4174 = arg0.method64((byte) 13);
        } else if (arg1 == 2) {
            int var4 = arg0.method64((byte) 39);
            this.field4172 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4172[var5] = arg0.method63((byte) 1);
            }
        } else if (arg1 == 3) {
            this.field4192 = true;
        } else if (arg1 == 40) {
            int var8 = arg0.method64((byte) 35);
            this.field4186 = new short[var8];
            this.field4181 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4181[var9] = (short) arg0.method63((byte) 1);
                this.field4186[var9] = (short) arg0.method63((byte) 1);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method64((byte) 90);
            this.field4182 = new short[var6];
            this.field4179 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4182[var7] = (short) arg0.method63((byte) 1);
                this.field4179[var7] = (short) arg0.method63((byte) 1);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field4176[arg1 - 60] = arg0.method63((byte) 1);
        }
        int var10 = -122 % ((arg2 - 45) / 46);
        field4188++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)Z", line = 564)
    public final boolean method1677(boolean arg0) {
        field4175++;
        if (this.field4172 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field4172.length; var3++) {
            if (!class29.field416.method265(this.field4172[var3], 0, (byte) -116)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Lqf;", line = 595)
    public final class267 method1678(int arg0) {
        class267[] var2 = new class267[5];
        int var3 = -85 % ((arg0 - 68) / 56);
        field4190++;
        int var4 = 0;
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field4176[var5] != -1) {
                var2[var4++] = class267.method1773(class29.field416, this.field4176[var5], 0);
            }
        }
        class267 var6 = new class267(var2, var4);
        if (this.field4181 != null) {
            for (int var7 = 0; var7 < this.field4181.length; var7++) {
                var6.method1777(this.field4181[var7], this.field4186[var7]);
            }
        }
        if (this.field4182 != null) {
            for (int var8 = 0; var8 < this.field4182.length; var8++) {
                var6.method1771(this.field4182[var8], this.field4179[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)Lqf;", line = 651)
    public final class267 method1679(boolean arg0) {
        field4187++;
        if (this.field4172 == null) {
            return null;
        }
        if (arg0) {
            method1683(28);
        }
        class267[] var2 = new class267[this.field4172.length];
        for (int var3 = 0; var3 < this.field4172.length; var3++) {
            var2[var3] = class267.method1773(class29.field416, this.field4172[var3], 0);
        }
        class267 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class267(var2, var2.length);
        }
        if (this.field4181 != null) {
            for (int var5 = 0; var5 < this.field4181.length; var5++) {
                var4.method1777(this.field4181[var5], this.field4186[var5]);
            }
        }
        if (this.field4182 != null) {
            for (int var6 = 0; var6 < this.field4182.length; var6++) {
                var4.method1771(this.field4182[var6], this.field4179[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(JB)V", line = 713)
    public static final void method1680(long arg0, byte arg1) {
        field4194++;
        if (arg0 == 0L) {
            return;
        }
        class6.field149.method966(0, 33);
        class6.field149.method29(arg1 ^ 0x847, arg0);
        if (arg1 == 82) {
            class57.field922++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLfj;)V", line = 734)
    public final void method1681(byte arg0, class3 arg1) {
        if (arg0 > -124) {
            return;
        }
        while (true) {
            int var3 = arg1.method64((byte) -84);
            if (var3 == 0) {
                field4184++;
                return;
            }
            this.method1676(arg1, var3, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)Z", line = 757)
    public final boolean method1682(byte arg0) {
        if (arg0 != 19) {
            this.method1677(false);
        }
        field4185++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field4176[var3] != -1 && !class29.field416.method265(this.field4176[var3], 0, (byte) -116)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)[Lea;", line = 781)
    public static final class72[] method1683(int arg0) {
        field4193++;
        if (class140.field2238 == null) {
            int var1 = 0;
            class72[] var2 = class1.method2((byte) -126, class220.field3533);
            class72[] var3 = new class72[var2.length];
            label57: for (int var4 = 0; var4 < var2.length; var4++) {
                class72 var5 = var2[var4];
                if ((var5.field1122 <= 0 || var5.field1122 >= 24) && var5.field1119 >= 800 && var5.field1117 >= 600) {
                    for (int var6 = 0; var6 < var1; var6++) {
                        class72 var7 = var3[var6];
                        if (var5.field1119 == var7.field1119 && var5.field1117 == var7.field1117) {
                            if (var5.field1122 > var7.field1122) {
                                var3[var6] = var5;
                            }
                            continue label57;
                        }
                    }
                    var3[var1] = var5;
                    var1++;
                }
            }
            class140.field2238 = new class72[var1];
            class213.method1342(var3, 0, class140.field2238, 0, var1);
            int[] var8 = new int[class140.field2238.length];
            for (int var9 = 0; var9 < class140.field2238.length; var9++) {
                class72 var10 = class140.field2238[var9];
                var8[var9] = var10.field1119 * var10.field1117;
            }
            class39.method303(var8, class140.field2238, (byte) -71);
        }
        return arg0 > -71 ? (class72[]) null : class140.field2238;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 869)
    public static void method1684(byte arg0) {
        field4189 = null;
        field4195 = null;
        field4183 = null;
        if (arg0 != -87) {
            method1680(71L, (byte) 47);
        }
        field4177 = null;
    }
}
