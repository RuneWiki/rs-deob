import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class273 {

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public int field4845 = 0;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "[J")
    public static long[] field4840 = new long[32];

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[I")
    public static int[] field4841 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Lli;")
    public static class185 field4847 = class245.method1649("(Y<)4col>", 122);

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Lli;")
    public static class185 field4850 = class245.method1649("<)4col>", -109);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "[I")
    public static int[] field4842;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLhi;)V")
    public static final void method1868(byte arg0, class250 arg1) {
        class201.field3679 = arg1.method1694(class38.field608, -2);
        class1.field16 = arg1.method1694(class210.field3832, -2);
        field4848++;
        if (arg0 != -76) {
            field4841 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljd;II)V")
    private final void method1869(class118 arg0, int arg1, int arg2) {
        field4837++;
        if (arg2 == 5) {
            this.field4845 = arg0.method827(255);
        }
        if (arg1 != -31220) {
            method1873((class118) null, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljd;I)V")
    public final void method1870(class118 arg0, int arg1) {
        field4838++;
        int var3 = 11 % ((20 - arg1) / 49);
        while (true) {
            int var4 = arg0.method867(false);
            if (var4 == 0) {
                return;
            }
            this.method1869(arg0, -31220, var4);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIBII)V")
    public static final void method1871(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (class113.field2040 >= arg2 && class216.field3964 <= arg1) {
            boolean var6;
            if (arg0 < class207.field3810) {
                arg0 = class207.field3810;
                var6 = false;
            } else if (class66.field1163 < arg0) {
                arg0 = class66.field1163;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg4 < class207.field3810) {
                arg4 = class207.field3810;
                var7 = false;
            } else if (arg4 > class66.field1163) {
                arg4 = class66.field1163;
                var7 = false;
            } else {
                var7 = true;
            }
            if (arg2 < class216.field3964) {
                arg2 = class216.field3964;
            } else {
                class157.method1116(arg5, arg0, arg4, class145.field2757[arg2++], -123);
            }
            if (class113.field2040 < arg1) {
                arg1 = class113.field2040;
            } else {
                class157.method1116(arg5, arg0, arg4, class145.field2757[arg1--], -78);
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg1; var8++) {
                    int[] var9 = class145.field2757[var8];
                    var9[arg0] = var9[arg4] = arg5;
                }
            } else if (var6) {
                for (int var11 = arg2; var11 <= arg1; var11++) {
                    class145.field2757[var11][arg0] = arg5;
                }
            } else if (var7) {
                for (int var10 = arg2; var10 <= arg1; var10++) {
                    class145.field2757[var10][arg4] = arg5;
                }
            }
        }
        if (arg3 <= 47) {
            field4847 = null;
        }
        field4846++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILca;IB)V")
    public static final void method1872(int arg0, int arg1, class81 arg2, int arg3, byte arg4) {
        int var5 = 10 / ((arg4 - 45) / 38);
        field4843++;
        if (class127.field2283 >= 400) {
            return;
        }
        if (arg2.field1411 != null) {
            arg2 = arg2.method525((byte) -88);
        }
        if (arg2 == null || !arg2.field1436) {
            return;
        }
        class185 var6 = arg2.field1448;
        if (arg2.field1450 != 0) {
            class185 var7 = class235.field4218 == 1 ? class201.field3691 : class136.field2558;
            var6 = class87.method567(-11039, new class185[] { var6, class79.method513(class241.field4310.field3497, 68, arg2.field1450), class193.field3565, var7, class90.method591(arg2.field1450, 0), class27.field456 });
        }
        if (class187.field3471 == 1) {
            class38.field602++;
            class105.method738((long) arg3, arg0, class87.method567(-11039, new class185[] { class264.field4689, class182.field3350, var6 }), (short) 46, class181.field3335, class32.field523, arg1, -120);
        } else if (!class254.field4504) {
            class185[] var8 = arg2.field1471;
            class90.field1746++;
            if (class47.field760) {
                var8 = class194.method1399(var8, -1);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class235.field4218 != 0 || !var8[var9].method1312(class107.field1924, -30055))) {
                        class203.field3713++;
                        int var10 = -1;
                        byte var11 = 0;
                        if (var9 == 0) {
                            var11 = 15;
                        }
                        if (arg2.field1465 == var9) {
                            var10 = arg2.field1459;
                        }
                        if (arg2.field1435 == var9) {
                            var10 = arg2.field1438;
                        }
                        if (var9 == 1) {
                            var11 = 28;
                        }
                        if (var9 == 2) {
                            var11 = 14;
                        }
                        if (var9 == 3) {
                            var11 = 17;
                        }
                        if (var9 == 4) {
                            var11 = 12;
                        }
                        class105.method738((long) arg3, arg0, class87.method567(-11039, new class185[] { class127.field2284, var6 }), var11, var10, var8[var9], arg1, -104);
                    }
                }
            }
            if (class235.field4218 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].method1312(class107.field1924, -30055)) {
                        class281.field4968++;
                        short var13 = 0;
                        if (arg2.field1450 > class241.field4310.field3497) {
                            var13 = 2000;
                        }
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 15;
                        }
                        if (var12 == 1) {
                            var14 = 28;
                        }
                        if (var12 == 2) {
                            var14 = 14;
                        }
                        if (var12 == 3) {
                            var14 = 17;
                        }
                        if (var12 == 4) {
                            var14 = 12;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class105.method738((long) arg3, arg0, class87.method567(-11039, new class185[] { class127.field2284, var6 }), var14, arg2.field1447, var8[var12], arg1, -115);
                    }
                }
            }
            class105.method738((long) arg3, arg0, class87.method567(-11039, new class185[] { class127.field2284, var6 }), (short) 1007, class248.field4405, class206.field3779, arg1, -118);
        } else if ((class214.field3908 & 0x2) == 2) {
            class105.method738((long) arg3, arg0, class87.method567(-11039, new class185[] { class110.field1980, class182.field3350, var6 }), (short) 47, -1, class102.field1856, arg1, -104);
            class220.field4012++;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljd;B)V")
    public static final void method1873(class118 arg0, byte arg1) {
        field4844++;
        if ((arg0.field2115.length - arg0.field2155) < 1) {
            return;
        }
        int var2 = arg0.method867(false);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field2115.length - arg0.field2155) < var3) {
            return;
        }
        class215.field3951 = arg0.method867(false);
        if (class215.field3951 < 1) {
            class215.field3951 = 1;
        } else if (class215.field3951 > 4) {
            class215.field3951 = 4;
        }
        class49.method308(true, arg0.method867(false) == 1);
        class163.field3055 = arg0.method867(false) == 1;
        class32.field533 = arg0.method867(false) == 1;
        class225.field4116 = arg0.method867(false) == 1;
        class1.field30 = arg0.method867(false) == 1;
        class7.field160 = arg0.method867(false) == 1;
        class152.field2884 = arg0.method867(false) == 1;
        if (arg1 > -59) {
            method1872(-116, 104, (class81) null, 11, (byte) 127);
        }
        class194.field3578 = arg0.method867(false) == 1;
        class84.field1666 = arg0.method867(false);
        if (class84.field1666 > 2) {
            class84.field1666 = 2;
        }
        if (var2 < 2) {
            class217.field3979 = arg0.method867(false) == 1;
            arg0.method867(false);
        } else {
            class217.field3979 = arg0.method867(false) == 1;
        }
        class14.field237 = arg0.method867(false) == 1;
        class178.field3262 = arg0.method867(false) == 1;
        class207.field3809 = arg0.method867(false);
        if (class207.field3809 > 2) {
            class207.field3809 = 2;
        }
        class155.field2937 = class207.field3809;
        class140.field2634 = arg0.method867(false) == 1;
        class250.field4461 = arg0.method867(false);
        if (class250.field4461 > 127) {
            class250.field4461 = 127;
        }
        class193.field3568 = arg0.method867(false);
        class280.field4965 = arg0.method867(false);
        if (class280.field4965 > 127) {
            class280.field4965 = 127;
        }
        if (var2 >= 1) {
            class236.field4222 = arg0.method827(255);
            class97.field1821 = arg0.method827(255);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method867(false);
        }
        if (var2 >= 4) {
            int var4 = arg0.method867(false);
            if (class94.field1794 < 96) {
                var4 = 0;
            }
            class16.method119(var4);
        }
        if (var2 >= 5) {
            class216.field3962 = arg0.method875((byte) 48);
        }
        if (var2 >= 6) {
            class56.field965 = arg0.method867(false);
        }
        if (var2 >= 7) {
            class72.field1264 = arg0.method867(false) == 1;
        }
        if (var2 >= 8) {
            class240.field4296 = arg0.method867(false) == 1;
        }
        if (var2 >= 9) {
            class128.field2296 = arg0.method867(false);
        }
        if (var2 >= 10) {
            class138.field2574 = arg0.method867(false) != 0;
        }
        if (var2 >= 11) {
            class73.field1277 = arg0.method867(false) != 0;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method1874(int arg0) {
        field4842 = null;
        field4840 = null;
        if (arg0 == -21410) {
            field4847 = null;
            field4841 = null;
            field4850 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1875(int arg0, int arg1, int arg2, int arg3) {
        if (!class248.method1667(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class201.field3694[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class6.field144) {
                    if (!class188.method1357(var4, var6, var5)) {
                        return false;
                    }
                    if (!class188.method1357(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class188.method1357(var4, var7, var5)) {
                        return false;
                    }
                    if (!class188.method1357(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class188.method1357(var4, var8, var5)) {
                    return false;
                }
                if (!class188.method1357(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class185.field3447) {
                    if (!class188.method1357(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class188.method1357(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class188.method1357(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class188.method1357(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class188.method1357(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class188.method1357(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class6.field144) {
                    if (!class188.method1357(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class188.method1357(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class188.method1357(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class188.method1357(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class188.method1357(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class188.method1357(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class185.field3447) {
                    if (!class188.method1357(var4, var6, var5)) {
                        return false;
                    }
                    if (!class188.method1357(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class188.method1357(var4, var7, var5)) {
                        return false;
                    }
                    if (!class188.method1357(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class188.method1357(var4, var8, var5)) {
                    return false;
                }
                if (!class188.method1357(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class188.method1357(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class188.method1357(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class188.method1357(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class188.method1357(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class188.method1357(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lti;I)V")
    public static final void method1876(class188 arg0, int arg1) {
        field4849++;
        class58 var2 = (class58) class262.field4641.method195(70, arg0.field3514.method1327((byte) 101));
        if (arg1 != 0) {
            field4841 = null;
        }
        if (var2 == null) {
            class117.method816(0, class265.field4703, (class71) null, arg0.field2651[0], arg0, 20807, (class135) null, arg0.field2720[0]);
        } else {
            var2.method397(127);
        }
    }
}
