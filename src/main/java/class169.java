import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class class169 extends class9 {

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "Lada;")
    public class142 field2066;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field2065 = 0;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lav;ZI)V")
    public static final void method947(class545 arg0, boolean arg1, int arg2) {
        if (arg2 > -86) {
            method949(124, (byte) -115, 91);
        }
        field2068++;
        if (class199.field2397 >= 400) {
            return;
        }
        if (class103.field1265 != arg0) {
            String var9;
            if (arg0.field8008 == 0) {
                boolean var3 = true;
                if (class103.field1265.field8009 != -1 && arg0.field8009 != -1) {
                    int var4 = arg0.field8000 >= class103.field1265.field8000 ? arg0.field8000 : class103.field1265.field8000;
                    int var5 = class103.field1265.field8009 >= arg0.field8009 ? arg0.field8009 : class103.field1265.field8009;
                    int var6 = var4 * 10 / 100 + var5 + 5;
                    int var7 = class103.field1265.field8000 - arg0.field8000;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var6 < var7) {
                        var3 = false;
                    }
                }
                String var8 = class341.field4399 == class320.field4082 ? class585.field8505.method987(class31.field247, 22) : class559.field8235.method987(class31.field247, 22);
                if (arg0.field8000 >= arg0.field8015) {
                    var9 = arg0.method3193(true, 122) + (var3 ? class218.method1258((byte) 126, class103.field1265.field8000, arg0.field8000) : "<col=ffffff>") + " (" + var8 + arg0.field8000 + ")";
                } else {
                    var9 = arg0.method3193(true, 104) + (var3 ? class218.method1258((byte) 107, class103.field1265.field8000, arg0.field8000) : "<col=ffffff>") + " (" + var8 + arg0.field8000 + "+" + (arg0.field8015 - arg0.field8000) + ")";
                }
            } else {
                var9 = arg0.method3193(true, 122) + " (" + class201.field2417.method987(class31.field247, 22) + arg0.field8008 + ")";
            }
            if (class449.field6225) {
                if (!arg1 && (class117.field1477 & 0x8) != 0) {
                    class468.field6546++;
                    class22.method139(10, true, 0, (byte) 65, class468.field6542, 0, class472.field6608 + " -> <col=ffffff>" + var9, class208.field2503, (long) arg0.field6399, false, -1);
                }
            } else if (arg1) {
                class22.method139(-1, false, 0, (byte) 65, -1, 0, "", "<col=cccccc>" + var9, 0L, true, 0);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class53.field445[var10] != null) {
                        short var11 = 0;
                        if (class486.field6795 == class341.field4399 && class53.field445[var10].equalsIgnoreCase(class524.field7342.method987(class31.field247, 22))) {
                            if (arg0.field8000 > class103.field1265.field8000) {
                                var11 = 2000;
                            }
                            if (class103.field1265.field7993 != 0 && arg0.field7993 != 0) {
                                if (class103.field1265.field7993 == arg0.field7993) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class4.field22[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class542.field7930[var10] + var11);
                        int var13 = class597.field8640[var10] == -1 ? class14.field112 : class597.field8640[var10];
                        class22.method139(var12, true, 0, (byte) 65, var13, 0, "<col=ffffff>" + var9, class53.field445[var10], (long) arg0.field6399, false, -1);
                        class306.field3894++;
                    }
                }
            }
            if (!arg1) {
                for (class99 var14 = (class99) class89.field1096.method1050((byte) 73); var14 != null; var14 = (class99) class89.field1096.method1047(-7962)) {
                    if (var14.field1227 == 11) {
                        var14.field1229 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class449.field6225 && (class117.field1477 & 0x10) != 0) {
            class50.field423++;
            class22.method139(58, true, 0, (byte) 65, class468.field6542, 0, class472.field6608 + " -> <col=ffffff>" + class588.field8536.method987(class31.field247, 22), class208.field2503, 0L, false, -1);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILqa;Lwt;Ldi;I)Z")
    public static final boolean method948(int arg0, int arg1, class206 arg2, class258 arg3, class107 arg4, int arg5) {
        field2063++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field1309 != null) {
            var9 = class353.field4626 - ((class353.field4626 - class353.field4622) * (arg3.field3317 + arg4.field1328 - class353.field4606) / (class353.field4611 - class353.field4606));
            var8 = class353.field4626 - ((arg3.field3317 + arg4.field1313 - class353.field4606) * (class353.field4626 - class353.field4622) / (class353.field4611 - class353.field4606));
            var6 = (class353.field4614 - class353.field4625) * (arg3.field3320 + arg4.field1302 - class353.field4617) / (class353.field4618 - class353.field4617) + class353.field4625;
            var7 = (class353.field4614 - class353.field4625) * (arg3.field3320 + arg4.field1312 - class353.field4617) / (class353.field4618 - class353.field4617) + class353.field4625;
        }
        class52 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg4.field1317 != -1) {
            if (arg3.field3316 && arg4.field1342 != -1) {
                var10 = arg4.method626(arg2, true, 1);
            } else {
                var10 = arg4.method626(arg2, false, 1);
            }
            if (var10 != null) {
                var11 = arg3.field3314 - (var10.method292() + 1 >> 1);
                var12 = arg3.field3314 + (var10.method292() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg3.field3319 - (var10.method286() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg3.field3319 + (var10.method286() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class287 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = arg0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg4.field1335 != null) {
            var15 = class226.method1292(-127, arg4.field1340);
            if (var15 != null) {
                var16 = class330.field4307.method1242(arg4.field1335, class308.field3919, null, (byte) 19, null);
                int var23 = arg3.field3319;
                if (var10 == null) {
                    var17 = var23 - var15.method1612() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method286() >> 1) + (var15.method1610() * var16));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class308.field3919[var24];
                    if (var24 < var16 - 1) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method1616(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg3.field3314 + arg1 - (var18 / 2);
                var20 = var18 / 2 + arg3.field3314 + arg1;
                if (var19 < var6) {
                    var6 = var19;
                }
                if (var20 > var7) {
                    var7 = var20;
                }
                var21 = var17 + arg5;
                var22 = arg5 + var17 + (var15.method1610() * var16);
                if (var8 > var21) {
                    var8 = var21;
                }
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (class353.field4625 > var7 || var6 > class353.field4614 || var9 < class353.field4622 || var8 > class353.field4626) {
            return true;
        }
        if (arg4.field1309 != null) {
            int[] var27 = new int[arg4.field1309.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg4.field1309[var28 * 2] + arg3.field3320;
                int var31 = arg4.field1309[var28 * 2 + 1] + arg3.field3317;
                var27[var28 * 2] = class353.field4625 + ((class353.field4614 - class353.field4625) * (var30 - class353.field4617) / (class353.field4618 - class353.field4617));
                var27[var28 * 2 + 1] = class353.field4626 - ((var31 - class353.field4606) * (class353.field4626 - class353.field4622) / (class353.field4611 - class353.field4606));
            }
            class186.method1019(arg2, var27, arg4.field1324);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg2.method1154(var27[var29 * 2], arg4.field1307, var27[(var29 + 1) * 2], true, var27[(var29 + 1) * 2 + 1], var27[var29 * 2 + 1]);
            }
            arg2.method1154(var27[var27.length - 2], arg4.field1307, var27[0], true, var27[1], var27[var27.length - 1]);
        }
        if (var10 != null) {
            if (class289.field3752 > 0 && (class314.field4009 != -1 && class314.field4009 == arg3.field3313 || class45.field389 != -1 && class45.field389 == arg4.field1333)) {
                int var32;
                if (class382.field5054 > 50) {
                    var32 = 200 - (class382.field5054 * 2);
                } else {
                    var32 = class382.field5054 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg2.method1113(arg3.field3314, arg3.field3319, 70, var33, var10.method291() / 2 + 7);
                arg2.method1113(arg3.field3314, arg3.field3319, -123, var33, var10.method291() / 2 + 5);
                arg2.method1113(arg3.field3314, arg3.field3319, 60, var33, var10.method291() / 2 + 3);
                arg2.method1113(arg3.field3314, arg3.field3319, -100, var33, var10.method291() / 2 + 1);
                arg2.method1113(arg3.field3314, arg3.field3319, 83, var33, var10.method291() / 2);
            }
            var10.method299(arg3.field3314 - (var10.method292() >> 1), arg3.field3319 + -(var10.method286() >> 1));
        }
        if (arg4.field1335 != null && var15 != null) {
            class615.method3534(-4, arg4, arg2, var18, var16, var17, var15, arg3);
        }
        if (arg4.field1317 != -1 || arg4.field1335 != null) {
            class261 var34 = new class261(arg3);
            var34.field3375 = var21;
            var34.field3371 = var22;
            var34.field3379 = var20;
            var34.field3370 = var12;
            var34.field3374 = var14;
            var34.field3378 = var19;
            var34.field3377 = var13;
            var34.field3376 = var11;
            class22.field146.method1040(var34, arg0 - 119);
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBI)Z")
    public static final boolean method949(int arg0, byte arg1, int arg2) {
        field2067++;
        if (arg1 != 9) {
            field2065 = 83;
        }
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Z")
    public abstract boolean method44(int arg0);

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lada;I)V")
    public class169(class142 arg0, int arg1) {
        this.field2064 = arg1;
        this.field2066 = arg0;
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method43(int arg0);
}
