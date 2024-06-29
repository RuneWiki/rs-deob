import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class258 extends class271 {

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "Lwa;")
    public static class75 field4321 = class66.method560("(U(Y", false);

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "Lwa;")
    public static class75 field4332 = class66.method560(": ", false);

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field4333 = 0;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "Lwa;")
    public static class75 field4334 = class66.method560("<col=ffb000>", false);

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public int field4318;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 4)
    public static void method1835(byte arg0) {
        field4334 = null;
        field4332 = null;
        field4321 = null;
        if (arg0 != -62) {
            method1842(-116, false, -117, -83, 116, -49, -18);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 17)
    public static final void method1836(int arg0, int arg1) {
        if (arg0 != -17970) {
            field4334 = (class75) null;
        }
        class156 var2 = class206.method1525(2, -32701, arg1);
        field4331++;
        var2.method1184((byte) 87);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)I", line = 30)
    public static final int method1837(int arg0, int arg1) {
        if (arg1 != -2) {
            method1839(-39, -71, 91);
        }
        field4327++;
        int var2 = arg0 >> 6 & 0x3;
        int var3 = arg0 & 0x3F;
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)I", line = 88)
    public static final int method1838(int arg0, byte arg1, int arg2) {
        int var3 = 107 / ((arg1 + 16) / 53);
        int var4 = arg0 >>> 31;
        field4329++;
        return (arg0 + var4) / arg2 - var4;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(III)V", line = 99)
    public static final void method1839(int arg0, int arg1, int arg2) {
        field4319++;
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        var3[0] = arg1;
        var4[arg0] = arg2;
        int var5 = 1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class216.field3703[var6] != arg1) {
                var3[var5] = class216.field3703[var6];
                var4[var5] = class288.field4948[var6];
                var5++;
            }
        }
        class216.field3703 = var3;
        class288.field4948 = var4;
        class178.method1316(0, ~arg0, class115.field1946.length - 1, class115.field1946);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V", line = 139)
    public static final void method1840(byte arg0) {
        field4330++;
        for (int var1 = 0; var1 < 100; var1++) {
            class226.field3815[var1] = true;
        }
        if (arg0 != -63) {
            method1840((byte) 36);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIIII)V", line = 156)
    public final void method1841(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -30524) {
            this.method156(-72, -25);
        }
        field4328++;
        int var6 = this.field4325 << 3;
        int var7 = (arg0 << 4) + (var6 & 0xF);
        int var8 = this.field4335 << 3;
        int var9 = (arg4 << 4) + (var8 & 0xF);
        this.method151(var6, var8, var7, var9, arg2, arg3);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZIIIII)V", line = 177)
    public static final void method1842(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class13.method67(0, arg4);
        int var7 = 0;
        field4322++;
        int var8 = arg4;
        int var9 = -arg4;
        int var10 = -1;
        int[] var11 = class63.field1096[arg3];
        int var12 = -1;
        int var13 = arg4 - arg5;
        if (var13 < 0) {
            var13 = 0;
        }
        int var14 = -var13;
        int var15 = var13;
        if (arg1) {
            field4334 = (class75) null;
        }
        int var16 = arg2 - var13;
        class150.method1151(7, var11, arg2 - arg4, arg6, var16);
        int var17 = arg2 + var13;
        class150.method1151(7, var11, var16, arg0, var17);
        class150.method1151(7, var11, var17, arg6, arg2 + arg4);
        while (var7 < var8) {
            var10 += 2;
            var12 += 2;
            var9 += var12;
            var14 += var10;
            if (var14 >= 0 && var15 >= 1) {
                class113.field1918[var15] = var7;
                var15--;
                var14 -= var15 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var8--;
                if (var8 < var13) {
                    int[] var18 = class63.field1096[arg3 + var8];
                    int var19 = arg2 + var7;
                    int var20 = arg2 - var7;
                    int[] var21 = class63.field1096[arg3 - var8];
                    int var22 = class113.field1918[var8];
                    int var23 = arg2 - var22;
                    class150.method1151(7, var18, var20, arg6, var23);
                    int var24 = arg2 + var22;
                    class150.method1151(7, var18, var23, arg0, var24);
                    class150.method1151(7, var18, var24, arg6, var19);
                    class150.method1151(7, var21, var20, arg6, var23);
                    class150.method1151(7, var21, var23, arg0, var24);
                    class150.method1151(7, var21, var24, arg6, var19);
                } else {
                    int[] var25 = class63.field1096[arg3 + var8];
                    int[] var26 = class63.field1096[arg3 - var8];
                    int var27 = arg2 + var7;
                    int var28 = arg2 - var7;
                    class150.method1151(7, var25, var28, arg6, var27);
                    class150.method1151(7, var26, var28, arg6, var27);
                }
                var9 -= var8 << 1;
            }
            int[] var29 = class63.field1096[arg3 + var7];
            int var30 = arg2 + var8;
            int[] var31 = class63.field1096[arg3 - var7];
            int var32 = arg2 - var8;
            if (var13 > var7) {
                int var33 = var7 > var15 ? class113.field1918[var7] : var15;
                int var34 = arg2 - var33;
                int var35 = arg2 + var33;
                class150.method1151(7, var29, var32, arg6, var34);
                class150.method1151(7, var29, var34, arg0, var35);
                class150.method1151(7, var29, var35, arg6, var30);
                class150.method1151(7, var31, var32, arg6, var34);
                class150.method1151(7, var31, var34, arg0, var35);
                class150.method1151(7, var31, var35, arg6, var30);
            } else {
                class150.method1151(7, var29, var32, arg6, var30);
                class150.method1151(7, var31, var32, arg6, var30);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)I", line = 311)
    public static final int method1843(int arg0, byte arg1) {
        field4324++;
        if (class151.field2592 == 1) {
            return 7;
        } else if (class151.field2592 == 2) {
            return 20;
        } else {
            if (arg1 != -109) {
                field4321 = (class75) null;
            }
            if (arg0 == 15) {
                return 13;
            } else if (arg0 == 16) {
                return 3;
            } else if (arg0 == 22) {
                return 8;
            } else if (arg0 == 31) {
                return 14;
            } else if (arg0 == 38) {
                return 2;
            } else if (arg0 == 43) {
                return 15;
            } else if (arg0 == 48) {
                return 17;
            } else if (arg0 == 58) {
                return 11;
            } else if (arg0 == 69) {
                return 6;
            } else if (arg0 == 74) {
                return 20;
            } else if (arg0 == 77) {
                return 1;
            } else if (arg0 == 101) {
                return 12;
            } else if (arg0 == 103) {
                return 19;
            } else if (arg0 == 152) {
                return 16;
            } else if (arg0 == 161) {
                return 4;
            } else if (arg0 == 162) {
                return 9;
            } else if (arg0 == 166) {
                return 10;
            } else if (arg0 == 179) {
                return 18;
            } else if (arg0 == 191) {
                return 5;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V", line = 498)
    public static final void method1844(boolean arg0) {
        if (arg0) {
            class53.field879 = class156.field2669;
            class271.field4681 = class91.field1501;
            class215.field3672 = class267.field4612;
        } else {
            class53.field879 = class60.field1058;
            class271.field4681 = class85.field1409;
            class215.field3672 = class170.field2856;
        }
        class28.field366 = class271.field4681.length;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
    public abstract void method153(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)V")
    public abstract void method156(int arg0, int arg1);

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(II)V")
    public abstract void method157(int arg0, int arg1);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIII)V")
    public abstract void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)V")
    public abstract void method1340(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIII)V")
    public abstract void method1330(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(III)V")
    public abstract void method154(int arg0, int arg1, int arg2);
}
