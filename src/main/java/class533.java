import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class533 extends class482 {

    @OriginalMember(owner = "client!vw", name = "E", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!vw", name = "P", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!vw", name = "R", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!vw", name = "T", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!vw", name = "V", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!vw", name = "S", descriptor = "Lbp;")
    public static class88 field7493;

    @OriginalMember(owner = "client!vw", name = "U", descriptor = "Ljava/lang/Object;")
    public static Object field7495;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIIII)V")
    public static final void method2990(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -71) {
            return;
        }
        for (class273 var5 = (class273) class139.field1529.method3434((byte) 2); var5 != null; var5 = (class273) class139.field1529.method3430(true)) {
            class99.method539(arg1, arg3, arg4, false, arg2, var5);
        }
        field7490++;
        for (class273 var6 = (class273) class689.field9697.method3434((byte) 2); var6 != null; var6 = (class273) class689.field9697.method3430(true)) {
            byte var11 = 1;
            class543 var12 = var6.field3394.method3737((byte) 48);
            if (var6.field3394.field9473) {
                var11 = 0;
            } else if (var6.field3394.field9487 == var12.field7662 || var6.field3394.field9487 == var12.field7641 || var6.field3394.field9487 == var12.field7647 || var6.field3394.field9487 == var12.field7680) {
                var11 = 2;
            } else if (var6.field3394.field9487 == var12.field7663 || var6.field3394.field9487 == var12.field7644 || var6.field3394.field9487 == var12.field7642 || var6.field3394.field9487 == var12.field7643) {
                var11 = 3;
            }
            if (var6.field3402 != var11) {
                int var13 = class213.method1262(-39, var6.field3394);
                class210 var14 = var6.field3394.field8461;
                if (var14.field2492 != null) {
                    var14 = var14.method1247((byte) 110, class628.field8859);
                }
                if (var14 == null || var13 == -1) {
                    var6.field3418 = -1;
                    var6.field3393 = false;
                } else if (var6.field3418 != var13 || var6.field3393 != var14.field2475) {
                    if (var6.field3406 != null) {
                        class209.field2471.method3885(var6.field3406);
                        var6.field3406 = null;
                    }
                    var6.field3390 = null;
                    var6.field3393 = var14.field2475;
                    var6.field3398 = null;
                    var6.field3418 = var13;
                }
                var6.field3402 = var11;
            }
            var6.field3416 = var6.field3394.field5179;
            var6.field3391 = var6.field3394.field5179 + (var6.field3394.method1414(-31789) << 8);
            var6.field3396 = var6.field3394.field5176;
            var6.field3417 = var6.field3394.field5176 + (var6.field3394.method1414(-31789) << 8);
            class99.method539(arg1, arg3, arg4, false, arg2, var6);
        }
        for (class273 var7 = (class273) class79.field800.method3674(125); var7 != null; var7 = (class273) class79.field800.method3672(-1)) {
            byte var8 = 1;
            class543 var9 = var7.field3413.method3737((byte) 100);
            if (var7.field3413.field9473) {
                var8 = 0;
            } else if (var7.field3413.field9487 == var9.field7662 || var7.field3413.field9487 == var9.field7641 || var7.field3413.field9487 == var9.field7647 || var7.field3413.field9487 == var9.field7680) {
                var8 = 2;
            } else if (var7.field3413.field9487 == var9.field7663 || var7.field3413.field9487 == var9.field7644 || var7.field3413.field9487 == var9.field7642 || var7.field3413.field9487 == var9.field7643) {
                var8 = 3;
            }
            if (var7.field3402 != var8) {
                int var10 = class68.method364(-9184, var7.field3413);
                if (var7.field3418 != var10 || var7.field3393 != var7.field3413.field2898) {
                    if (var7.field3406 != null) {
                        class209.field2471.method3885(var7.field3406);
                        var7.field3406 = null;
                    }
                    var7.field3398 = null;
                    var7.field3390 = null;
                    var7.field3418 = var10;
                    var7.field3393 = var7.field3413.field2898;
                }
                var7.field3402 = var8;
            }
            var7.field3416 = var7.field3413.field5179;
            var7.field3391 = var7.field3413.field5179 + (var7.field3413.method1414(-31789) << 8);
            var7.field3396 = var7.field3413.field5176;
            var7.field3417 = var7.field3413.field5176 + (var7.field3413.method1414(-31789) << 8);
            class99.method539(arg1, arg3, arg4, false, arg2, var7);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V")
    public static final void method2991(byte arg0) {
        field7492++;
        if (class140.field1552 == null) {
            class140.field1552 = class27.method151((byte) -89);
            class512.field7343 = class140.field1552[0];
            class494.field7152 = class557.method3157(-128);
        }
        if (class203.field2404 == null) {
            class133.method750((byte) -119);
        }
        class27 var1 = class512.field7343;
        int var2 = class679.method3764(1);
        if (class512.field7343 == var1) {
            class327.field4009 = class512.field7343.field258.method1195((byte) 62, class504.field7267);
            if (class512.field7343.field259) {
                class349.field4711 = (class512.field7343.field257 - class512.field7343.field254) * var2 / 100 + class512.field7343.field254;
            }
            if (class512.field7343.field261) {
                class327.field4009 = class327.field4009 + class349.field4711 + "%";
            }
        } else if (class512.field7343 == class27.field282) {
            class203.field2404 = null;
            class585.method3308(3, 22731);
        } else {
            class327.field4009 = var1.field253.method1195((byte) 62, class504.field7267);
            if (class512.field7343.field261) {
                class327.field4009 = class327.field4009 + var1.field257 + "%";
            }
            class349.field4711 = var1.field257;
            if (class512.field7343.field259 || var1.field259) {
                class494.field7152 = class557.method3157(-93);
            }
        }
        if (class203.field2404 != null) {
            class203.field2404.method3095(class327.field4009, class494.field7152, (byte) 101, class349.field4711, class512.field7343);
            if (class56.field560 != null) {
                for (int var3 = class77.field792 + 1; var3 < class56.field560.length; var3++) {
                    if (class56.field560[var3].method2455(true) >= 100 && (var3 - 1) == class77.field792 && class421.field5601 >= 1 && class203.field2404.method3087(67)) {
                        try {
                            class56.field560[var3].method2458(77);
                        } catch (Exception var5) {
                            class56.field560 = null;
                            break;
                        }
                        class203.field2404.method3098(class56.field560[var3], true);
                        class77.field792++;
                        if (class56.field560.length - 1 <= class77.field792 && class56.field560.length > 1) {
                            class77.field792 = class378.field5124.method3177(11690) ? 0 : -1;
                        }
                    }
                }
            }
        }
        int var4 = -51 % ((-arg0 - 15) / 37);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IZI)I")
    public static final int method2992(int arg0, boolean arg1, int arg2) {
        field7496++;
        if (arg2 == 1 || arg2 == 3) {
            return class248.field3082[arg0 & 0x3];
        } else {
            if (arg1) {
                field7491 = 85;
            }
            return class224.field2777[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(I)V")
    public static void method2993(int arg0) {
        field7493 = null;
        if (arg0 != -19693) {
            field7495 = null;
        }
        field7495 = null;
    }
}
