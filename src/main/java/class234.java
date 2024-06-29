import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class234 {

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Z")
    public boolean field3389 = false;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "Lwf;")
    private class117 field3395 = new class117(64);

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "Lwf;")
    public class117 field3404 = new class117(500);

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "Lwf;")
    public class117 field3406 = new class117(30);

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "Lwf;")
    public class117 field3407 = new class117(50);

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "Z")
    public boolean field3397;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "Lkda;")
    private class328 field3393;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Lkda;")
    public class328 field3391;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "Lada;")
    public static class144 field3399 = null;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "F")
    public static float field3385;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Lkda;")
    public static class328 field3390;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "()V", line = 4)
    public static final void method1494() {
        class466.field6568 = 0;
        label212: for (int var0 = 0; var0 < class441.field5889; var0++) {
            class521 var1 = class393.field5407[var0];
            if (class449.field6303 != null) {
                for (int var2 = 0; var2 < class449.field6303.length; var2++) {
                    if (class449.field6303[var2] != -1000000 && (var1.field7437 <= class449.field6303[var2] || var1.field7417 <= class449.field6303[var2]) && (var1.field7434 <= class358.field4871[var2] || var1.field7435 <= class358.field4871[var2]) && (var1.field7434 >= class638.field9314[var2] || var1.field7435 >= class638.field9314[var2]) && (var1.field7427 <= class584.field8591[var2] || var1.field7426 <= class584.field8591[var2]) && (var1.field7427 >= client.field3621[var2] || var1.field7426 >= client.field3621[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field7432 == 1) {
                int var3 = var1.field7431 + class504.field7141 - class297.field4092;
                if (var3 >= 0 && var3 <= class504.field7141 + class504.field7141) {
                    int var4 = var1.field7423 + class504.field7141 - class18.field169;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class504.field7141 + class504.field7141) {
                        continue;
                    }
                    int var5 = var1.field7418 + class504.field7141 - class18.field169;
                    if (var5 > class504.field7141 + class504.field7141) {
                        var5 = class504.field7141 + class504.field7141;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class222.field3230[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class103.field1488 - var1.field7434;
                        if (var7 > class536.field7978) {
                            var1.field7420 = 1;
                        } else {
                            if (var7 >= -class536.field7978) {
                                continue;
                            }
                            var1.field7420 = 2;
                            var7 = -var7;
                        }
                        var1.field7424 = (var1.field7427 - class311.field4288 << 8) / var7;
                        var1.field7429 = (var1.field7426 - class311.field4288 << 8) / var7;
                        var1.field7425 = (var1.field7437 - class85.field1215 << 8) / var7;
                        var1.field7428 = (var1.field7417 - class85.field1215 << 8) / var7;
                        class444.field6048[class466.field6568++] = var1;
                    }
                }
            } else if (var1.field7432 == 2) {
                int var8 = var1.field7423 + class504.field7141 - class18.field169;
                if (var8 >= 0 && var8 <= class504.field7141 + class504.field7141) {
                    int var9 = var1.field7431 + class504.field7141 - class297.field4092;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class504.field7141 + class504.field7141) {
                        continue;
                    }
                    int var10 = var1.field7430 + class504.field7141 - class297.field4092;
                    if (var10 > class504.field7141 + class504.field7141) {
                        var10 = class504.field7141 + class504.field7141;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class222.field3230[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class311.field4288 - var1.field7427;
                        if (var12 > class536.field7978) {
                            var1.field7420 = 3;
                        } else {
                            if (var12 >= -class536.field7978) {
                                continue;
                            }
                            var1.field7420 = 4;
                            var12 = -var12;
                        }
                        var1.field7421 = (var1.field7434 - class103.field1488 << 8) / var12;
                        var1.field7422 = (var1.field7435 - class103.field1488 << 8) / var12;
                        var1.field7425 = (var1.field7437 - class85.field1215 << 8) / var12;
                        var1.field7428 = (var1.field7417 - class85.field1215 << 8) / var12;
                        class444.field6048[class466.field6568++] = var1;
                    }
                }
            } else if (var1.field7432 == 4) {
                int var13 = var1.field7437 - class85.field1215;
                if (var13 > class595.field8800) {
                    int var14 = var1.field7423 + class504.field7141 - class18.field169;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class504.field7141 + class504.field7141) {
                        continue;
                    }
                    int var15 = var1.field7418 + class504.field7141 - class18.field169;
                    if (var15 > class504.field7141 + class504.field7141) {
                        var15 = class504.field7141 + class504.field7141;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field7431 + class504.field7141 - class297.field4092;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class504.field7141 + class504.field7141) {
                        continue;
                    }
                    int var17 = var1.field7430 + class504.field7141 - class297.field4092;
                    if (var17 > class504.field7141 + class504.field7141) {
                        var17 = class504.field7141 + class504.field7141;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class222.field3230[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field7420 = 5;
                        var1.field7421 = (var1.field7434 - class103.field1488 << 8) / var13;
                        var1.field7422 = (var1.field7435 - class103.field1488 << 8) / var13;
                        var1.field7424 = (var1.field7427 - class311.field4288 << 8) / var13;
                        var1.field7429 = (var1.field7426 - class311.field4288 << 8) / var13;
                        class444.field6048[class466.field6568++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BZ)V", line = 261)
    public final void method1495(byte arg0, boolean arg1) {
        field3392++;
        if (this.field3397 == arg1) {
            return;
        }
        this.field3397 = arg1;
        if (arg0 != 15) {
            this.method1498(false, -80);
        }
        this.method1497(64);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 279)
    public static void method1496(byte arg0) {
        if (arg0 != -1) {
            method1500(null, 65, null, null);
        }
        field3399 = null;
        field3390 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 292)
    public final void method1497(int arg0) {
        class117 var2 = this.field3395;
        synchronized (this.field3395) {
            this.field3395.method837(arg0 ^ 0x3D);
        }
        field3398++;
        class117 var3 = this.field3404;
        synchronized (this.field3404) {
            if (arg0 != 64) {
                method1502(18);
            }
            this.field3404.method837(127);
        }
        class117 var4 = this.field3406;
        synchronized (this.field3406) {
            this.field3406.method837(125);
        }
        class117 var5 = this.field3407;
        synchronized (this.field3407) {
            this.field3407.method837(127);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)V", line = 318)
    public final void method1498(boolean arg0, int arg1) {
        if (arg1 != 1536) {
            this.field3404 = null;
        }
        field3403++;
        if (arg0 != this.field3389) {
            this.field3389 = arg0;
            this.method1497(64);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILfaa;I)V", line = 336)
    public static final void method1499(int arg0, class136 arg1, int arg2) {
        field3388++;
        int var3 = -1;
        int var4 = arg0;
        if (class617.field9123 < arg1.field1874) {
            class435.method2536((byte) -114, arg1);
        } else if (class617.field9123 > arg1.field1857) {
            class423.method2485((byte) -116, false, arg1);
            var3 = class346.field4754;
            var4 = class511.field7277;
        } else {
            class25.method154(5564, arg1);
        }
        if (arg1.field8496 < 128 || arg1.field8500 < 128 || (class146.field2125 - 1) * 128 <= arg1.field8496 || arg1.field8500 >= class410.field5609 * 128 - 128) {
            arg1.field1912 = -1;
            arg1.field1857 = 0;
            var3 = -1;
            arg1.field1872 = -1;
            var4 = 0;
            arg1.field1935 = -1;
            arg1.field1874 = 0;
            arg1.field8496 = arg1.field1957[0] * 128 + arg1.method940(~arg0) * 64;
            arg1.field8500 = arg1.field1955[0] * 128 + arg1.method940(-1) * 64;
            arg1.method952(0);
        }
        if (class541.field8119 == arg1 && (arg1.field8496 < 1536 || arg1.field8500 < 1536 || arg1.field8496 >= class146.field2125 * 128 - 1536 || arg1.field8500 >= class410.field5609 * 128 - 1536)) {
            var4 = 0;
            arg1.field1874 = 0;
            arg1.field1935 = -1;
            var3 = -1;
            arg1.field1872 = -1;
            arg1.field1857 = 0;
            arg1.field1912 = -1;
            arg1.field8496 = arg1.field1957[0] * 128 + (arg1.method940(-1) * 64);
            arg1.field8500 = arg1.field1955[0] * 128 + arg1.method940(-1) * 64;
            arg1.method952(0);
        }
        int var5 = class175.method1229(-99, arg1);
        class99.method759((byte) -16, var4, arg1, var3, var5);
        class228.method1458((byte) -117, arg1);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lqa;ILkda;Lkda;)V", line = 400)
    public static final void method1500(class208 arg0, int arg1, class328 arg2, class328 arg3) {
        if (arg1 != -1) {
            return;
        }
        class335.field4642 = class26.method166(0, arg2, class210.field3105, 1499);
        field3400++;
        class519.field7407 = arg0.method492(class335.field4642, class126.method889(arg3, class210.field3105, 0), true);
        class643.field9365 = class26.method166(0, arg2, class38.field464, 1499);
        class465.field6539 = arg0.method492(class643.field9365, class126.method889(arg3, class38.field464, 0), true);
        class470.field6636 = class26.method166(0, arg2, class279.field3913, 1499);
        class114.field1608 = arg0.method492(class470.field6636, class126.method889(arg3, class279.field3913, 0), true);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 416)
    public final void method1501(int arg0, int arg1) {
        field3402++;
        this.field3408 = arg0;
        class117 var3 = this.field3404;
        synchronized (this.field3404) {
            this.field3404.method837(arg1 ^ 0xFF);
        }
        class117 var4 = this.field3406;
        synchronized (this.field3406) {
            this.field3406.method837(125);
            if (arg1 != 128) {
                method1496((byte) 82);
            }
        }
        class117 var5 = this.field3407;
        synchronized (this.field3407) {
            this.field3407.method837(127);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Ljava/lang/String;", line = 437)
    public static final String method1502(int arg0) {
        field3405++;
        if (class446.field6245 || class151.field2298 == null) {
            return "";
        } else if (arg0 == 6111) {
            return class151.field2298.field8556;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)V", line = 452)
    public final void method1503(byte arg0, int arg1) {
        this.field3395 = new class117(arg1);
        if (arg0 == -1) {
            field3386++;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V", line = 463)
    public final void method1504(int arg0) {
        field3401++;
        class117 var2 = this.field3395;
        synchronized (this.field3395) {
            this.field3395.method846(arg0);
        }
        class117 var3 = this.field3404;
        synchronized (this.field3404) {
            this.field3404.method846(arg0);
        }
        class117 var4 = this.field3406;
        synchronized (this.field3406) {
            this.field3406.method846(0);
        }
        class117 var5 = this.field3407;
        synchronized (this.field3407) {
            this.field3407.method846(0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)Luh;", line = 485)
    public final class145 method1505(int arg0, int arg1) {
        if (arg0 != -24044) {
            method1499(-81, null, -40);
        }
        field3394++;
        class117 var3 = this.field3395;
        class145 var4;
        synchronized (this.field3395) {
            var4 = (class145) this.field3395.method842(arg0 + 24044, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field3393;
        byte[] var6;
        synchronized (this.field3393) {
            var6 = this.field3393.method1966(class308.method1882(arg0 ^ 0x3184, arg1), class204.method1348(arg1, 2929), true);
        }
        class145 var7 = new class145();
        var7.field2047 = this;
        var7.field2049 = arg1;
        if (var6 != null) {
            var7.method983(24, new class148(var6));
        }
        var7.method989(5);
        if (!this.field3397 && var7.field2059) {
            var7.field2073 = null;
            var7.field2023 = null;
        }
        if (var7.field2095) {
            var7.field2078 = false;
            var7.field2100 = 0;
        }
        class117 var8 = this.field3395;
        synchronized (this.field3395) {
            this.field3395.method835((byte) 125, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lbt;IZLkda;Lkda;)V", line = 604)
    public class234(class39 arg0, int arg1, boolean arg2, class328 arg3, class328 arg4) {
        this.field3397 = arg2;
        this.field3393 = arg3;
        this.field3391 = arg4;
        if (this.field3393 != null) {
            int var6 = this.field3393.method1974(-8588) - 1;
            this.field3393.method1975(123, var6);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILbc;)Z", line = 535)
    public static final boolean method1506(int arg0, class308 arg1) {
        field3387++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field4257) {
            return false;
        } else if (!arg1.method1876(class339.field4663, (byte) -116)) {
            return false;
        } else if (class335.field4629.method2799((long) arg1.field4226, true) != null) {
            return false;
        } else if (arg0 == 8) {
            return class596.field8821.method2799((long) arg1.field4246, true) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(II)V", line = 578)
    public final void method1507(int arg0, int arg1) {
        class117 var3 = this.field3395;
        synchronized (this.field3395) {
            this.field3395.method834(arg0, 0);
        }
        field3384++;
        class117 var4 = this.field3404;
        synchronized (this.field3404) {
            if (arg1 != 8) {
                return;
            }
            this.field3404.method834(arg0, 0);
        }
        class117 var5 = this.field3406;
        synchronized (this.field3406) {
            this.field3406.method834(arg0, arg1 - 8);
        }
        class117 var6 = this.field3407;
        synchronized (this.field3407) {
            this.field3407.method834(arg0, arg1 - 8);
        }
    }
}
