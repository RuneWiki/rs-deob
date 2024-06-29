import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class118 extends class440 {

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
    public int field1437 = -1;

    @OriginalMember(owner = "client!ik", name = "Z", descriptor = "I")
    public int field1441 = 0;

    @OriginalMember(owner = "client!ik", name = "fb", descriptor = "Z")
    private boolean field1447 = false;

    @OriginalMember(owner = "client!ik", name = "gb", descriptor = "I")
    public int field1448 = -1;

    @OriginalMember(owner = "client!ik", name = "bb", descriptor = "I")
    private int field1443 = 0;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "Lqia;")
    public static class547 field1431 = new class547();

    @OriginalMember(owner = "client!ik", name = "cb", descriptor = "Lus;")
    public static class328 field1444 = new class328(34, 3);

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ik", name = "ab", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ik", name = "db", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!ik", name = "eb", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ik", name = "hb", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Lha;B)Lufa;", line = 4)
    public final class152 method520(class454 arg0, byte arg1) {
        ++field1440;
        if (arg1 < 114) {
            method791(false);
        }
        return null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLha;)V", line = 18)
    public final void method522(boolean arg0, class454 arg1) {
        ++field1435;
        if (arg0) {
            field1444 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIBLha;)Z", line = 29)
    public final boolean method512(int arg0, int arg1, byte arg2, class454 arg3) {
        ++field1442;
        class376 var5 = arg3.method114();
        var5.method1963(super.field5790, super.field5791 + -10, super.field5784);
        class167 var6 = class190.field2488.method3944(arg2 ^ -260, this.field1445);
        class219 var7 = var6.method1044(this.field1434, (class326) null, (byte) 90, (class747) null, 0, arg3, -1, 131072, 0);
        if (var7 != null && (!class306.field3936 ? var7.method1378(arg0, arg1, var5, true, var6.field2198) : var7.method1357(arg0, arg1, var5, true, var6.field2198, class468.field6738))) {
            return true;
        } else {
            if (this.field1437 != -1) {
                class167 var8 = class190.field2488.method3944(256, this.field1437);
                class219 var9 = var8.method1044(this.field1438, (class326) null, (byte) 108, (class747) null, 0, arg3, -1, 131072, 0);
                if (var9 != null && (!class306.field3936 ? var9.method1378(arg0, arg1, var5, true, var8.field2198) : var9.method1357(arg0, arg1, var5, true, var8.field2198, class468.field6738))) {
                    return true;
                }
            }
            if (arg2 != -4) {
                this.field1448 = -2;
            }
            if (~this.field1448 != 0) {
                class167 var10 = class190.field2488.method3944(256, this.field1448);
                class219 var11 = var10.method1044(this.field1436, (class326) null, (byte) 91, (class747) null, 0, arg3, -1, 131072, 0);
                if (var11 != null && (!class306.field3936 ? var11.method1378(arg0, arg1, var5, true, var10.field2198) : var11.method1357(arg0, arg1, var5, true, var10.field2198, class468.field6738))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)I", line = 79)
    public final int method247(int arg0) {
        if (arg0 != 0) {
            method790(86, (byte) -113);
        }
        ++field1433;
        return -10;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(B)I", line = 99)
    public final int method269(byte arg0) {
        ++field1432;
        if (arg0 != 30) {
            this.method269((byte) -100);
        }
        return this.field1443;
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)I", line = 111)
    public final int method789(int arg0) {
        ++field1446;
        class167 var2 = class190.field2488.method3944(256, this.field1445);
        int var3 = var2.field2198;
        if (arg0 < 86) {
            this.method520((class454) null, (byte) 101);
        }
        if (~this.field1437 != 0) {
            class167 var4 = class190.field2488.method3944(256, this.field1437);
            if (var3 < var4.field2198) {
                var3 = var4.field2198;
            }
        }
        if (~this.field1448 != 0) {
            class167 var5 = class190.field2488.method3944(256, this.field1448);
            if (~var3 > ~var5.field2198) {
                var3 = var5.field2198;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lha;I)Lie;", line = 146)
    public final class607 method509(class454 arg0, int arg1) {
        ++field1430;
        class456 var3 = class761.method4234(super.field5779, super.field5790 >> class455.field6383, super.field5784 >> class455.field6383);
        if (var3 != null && var3.field6384.field6329) {
            int var4 = var3.field6384.method247(arg1 + 8964);
            if (~this.field1441 != ~var4) {
                super.field5791 -= this.field1441;
                super.field5791 += var4;
                this.field1441 = var4;
            }
        }
        class376 var5 = arg0.method114();
        var5.method1962();
        if (var3 == null || !var3.field6384.field6329) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class402 var9 = class517.field7282[super.field5792];
            int var10 = this.field1443 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method2382((byte) 19, super.field5784 + var13, super.field5790 - -var12);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method2382((byte) 19, super.field5784 + var16, super.field5790 + var15);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method2382((byte) 19, super.field5784 + var19, super.field5790 - -var18);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method2382((byte) 19, super.field5784 + var22, super.field5790 + var21);
            int var24 = var17 > var14 ? var14 : var17;
            int var25 = var23 <= var20 ? var23 : var20;
            int var26 = ~var23 >= ~var17 ? var23 : var17;
            int var27 = ~var14 > ~var20 ? var14 : var20;
            if (~var10 != -1) {
                int var28 = 16383 & (int) (Math.atan2((double) (var24 - var25), (double) var10) * 2607.5945876176133D);
                if (var28 != 0) {
                    var5.method1975(var28);
                }
            }
            int var29 = var14 + var23;
            if (var10 != 0) {
                int var30 = 16383 & (int) (Math.atan2((double) (-var26 + var27), (double) var10) * 2607.5945876176133D);
                if (var30 != 0) {
                    var5.method1972(-var30);
                }
            }
            if (~(var17 - -var20) > ~var29) {
                var29 = var17 + var20;
            }
            int var31 = (var29 >> 1) - super.field5791;
            if (var31 != 0) {
                var5.method1973(0, var31, 0);
            }
        }
        if (arg1 != -8964) {
            this.field1448 = -41;
        }
        var5.method1973(super.field5790, super.field5791 + -10, super.field5784);
        class607 var32 = class311.method1814(arg1 + 9064, 3, true);
        this.field1443 = 0;
        this.field1447 = false;
        if (~this.field1448 != 0) {
            class219 var33 = class190.field2488.method3944(arg1 + 9220, this.field1448).method1044(this.field1436, (class326) null, (byte) 113, (class747) null, 0, arg0, -1, 2048, 0);
            if (var33 != null) {
                if (class306.field3936) {
                    var33.method1375(var5, var32.field8425[2], class468.field6738, 0);
                } else {
                    var33.method1351(var5, var32.field8425[2], 0);
                }
                this.field1447 |= var33.method1338();
                this.field1443 = var33.method1333();
            }
        }
        if (this.field1437 != -1) {
            class219 var34 = class190.field2488.method3944(256, this.field1437).method1044(this.field1438, (class326) null, (byte) 113, (class747) null, 0, arg0, -1, 2048, 0);
            if (var34 != null) {
                if (class306.field3936) {
                    var34.method1375(var5, var32.field8425[1], class468.field6738, 0);
                } else {
                    var34.method1351(var5, var32.field8425[1], 0);
                }
                this.field1447 |= var34.method1338();
                if (~var34.method1333() < ~this.field1443) {
                    this.field1443 = var34.method1333();
                }
            }
        }
        class219 var35 = class190.field2488.method3944(256, this.field1445).method1044(this.field1434, (class326) null, (byte) 120, (class747) null, 0, arg0, -1, 2048, 0);
        if (var35 != null) {
            if (!class306.field3936) {
                var35.method1351(var5, var32.field8425[0], 0);
            } else {
                var35.method1375(var5, var32.field8425[0], class468.field6738, 0);
            }
            this.field1447 |= var35.method1338();
            if (var35.method1333() > this.field1443) {
                this.field1443 = var35.method1333();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIII)V", line = 371)
    public class118(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(B)Z", line = 313)
    public final boolean method256(byte arg0) {
        ++field1429;
        int var2 = 123 / ((-1 - arg0) / 36);
        return this.field1447;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)I", line = 328)
    public static final int method790(int arg0, byte arg1) {
        int var2 = -78 % ((1 - arg1) / 58);
        ++field1449;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(Z)V", line = 340)
    public static void method791(boolean arg0) {
        if (!arg0) {
            field1431 = null;
            field1444 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(B)Z", line = 351)
    public final boolean method265(byte arg0) {
        int var2 = 97 % ((arg0 - 61) / 45);
        ++field1439;
        return false;
    }
}
