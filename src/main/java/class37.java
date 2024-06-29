import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class37 extends class583 {

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "Z")
    public boolean field464;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "Z")
    public boolean field471;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Z")
    public boolean field460;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "J")
    public long field474;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "J")
    public long field466;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "Ljava/lang/String;")
    public String field470;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Ljava/lang/String;")
    public String field459;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Ljava/lang/String;")
    public String field467;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "[[Ljb;")
    public static class493[][] field475;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static void method208(boolean arg0) {
        field475 = null;
        if (!arg0) {
            method210(-126);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILha;I)V")
    public static final void method209(int arg0, int arg1, class58 arg2, int arg3) {
        field476++;
        if (arg1 < 0 || arg3 < 0 || class130.field1567 == 0 || class244.field3262 == 0) {
            return;
        }
        int var4;
        int var5;
        int var6;
        int var7;
        class513 var8;
        int var9;
        int var10;
        if (class589.field8295) {
            class254.method1684(2, false);
            var8 = arg2.method436();
            int[] var11 = arg2.method395();
            var7 = var11[2];
            var6 = var11[0];
            var4 = var11[3];
            var5 = var11[1];
            var10 = arg1 + class556.method3210((byte) 41, false);
            var9 = arg3 + class391.method2462(false, 0);
        } else {
            arg2.method391(class155.field2167, class184.field2493, class130.field1567, class244.field3262);
            var4 = class244.field3262;
            var5 = class184.field2493;
            var6 = class155.field2167;
            var7 = class130.field1567;
            arg2.method469(class124.field1500, class405.field5736, class130.field1567, class244.field3262);
            var8 = arg2.method427();
            var8.method340(class299.field4209, class443.field6306, class9.field134, class157.field2188, class368.field5208, class534.field7516);
            var9 = arg3;
            arg2.method483(var8);
            var10 = arg1;
        }
        if (var7 == 0) {
            var7 = 1;
        }
        if (var4 == 0) {
            var4 = 1;
        }
        int var12 = 104 % ((12 - arg0) / 52);
        class136.method966(true, (byte) -99);
        if (class588.field8292 != null && (!class124.field1491 || (class351.field4969 & 0x40) != 0)) {
            int var13 = -1;
            int var14 = -1;
            int var15 = arg2.method387();
            int var16 = arg2.method434();
            int var17;
            int var18;
            int var19;
            int var20;
            if (class180.field2409) {
                var18 = var17 = (var10 - var6) * class516.field7361 / var7;
                var20 = var19 = (var9 - var5) * class516.field7361 / var4;
            } else {
                var19 = (var9 - var5) * var16 / var4;
                var20 = (var9 - var5) * var15 / var4;
                var18 = (var10 - var6) * var15 / var7;
                var17 = (var10 - var6) * var16 / var7;
            }
            int[] var21 = new int[] { var18, var20, var15 };
            int[] var22 = new int[] { var17, var19, var16 };
            var8.method348(var21);
            var8.method348(var22);
            float var23 = class36.method204((float) var21[2], (float) var22[1], (float) var21[1], (float) var21[0], (float) var22[2], 94, (float) var22[0], 4);
            if (var23 > 0.0F) {
                int var24 = var22[0] - var21[0];
                int var25 = var22[2] - var21[2];
                int var26 = (int) ((float) var24 * var23 + (float) var21[0]);
                int var27 = (int) ((float) var25 * var23 + (float) var21[2]);
                var13 = (class660.field9039.method1835((byte) 127) - 1 << 8) + var26 >> 9;
                var14 = (class660.field9039.method1835((byte) 127) - 1 << 8) + var27 >> 9;
                byte var28 = class660.field9039.field1266;
                if (var28 < 3 && (class651.field8948[1][var26 >> 9][var27 >> 9] & 0x2) != 0) {
                    int var88 = var28 + 1;
                }
            }
            if (var13 != -1 && var14 != -1) {
                if (class124.field1491 && (class351.field4969 & 0x40) != 0) {
                    class493 var29 = class323.method2083(class58.field710, (byte) 102, class114.field1379);
                    if (var29 == null) {
                        method210(-1);
                    } else {
                        class635.method3531(false, var14, -1, class291.field4101, true, class580.field8185, true, 5, (long) (var14 | var13 << 0), 0L, " ->", var13, 0);
                    }
                } else {
                    if (class112.field1370) {
                        class635.method3531(false, var14, -1, class71.field923.method588((byte) 122, class549.field7669), true, -1, true, 11, (long) (var14 | var13 << 0), 0L, "", var13, 0);
                    }
                    class635.method3531(false, var14, -1, class218.field2845, true, class758.field10538, true, 21, (long) (var14 | var13 << 0), 0L, "", var13, 0);
                    class86.field1059++;
                }
            }
        }
        if (class589.field8295) {
            class25.method159((byte) 84);
        }
        for (int var30 = 0; var30 < (class589.field8295 ? 2 : 1); var30++) {
            boolean var31 = var30 == 0;
            class466 var32 = var31 ? class471.field6690 : class556.field7796;
            int var33 = arg1;
            int var34 = arg3;
            if (class589.field8295) {
                class254.method1684(2, var31);
                var33 = arg1 + class556.method3210((byte) 41, var31);
                var34 = arg3 + class391.method2462(var31, 0);
            }
            class360 var35 = var32.field6595;
            for (class387 var36 = (class387) var35.method2301(-31182); var36 != null; var36 = (class387) var35.method2310(33)) {
                if ((class416.field5869 || class660.field9039.field1266 == var36.field5483.field1266) && var36.method2439(var34, arg2, (byte) -122, var33)) {
                    boolean var37 = false;
                    boolean var38 = false;
                    int var39;
                    int var40;
                    if ((var36.field5483 instanceof class524)) {
                        var40 = ((class524) var36.field5483).field7418;
                        var39 = ((class524) var36.field5483).field7415;
                    } else {
                        var39 = var36.field5483.field1264 >> 9;
                        var40 = var36.field5483.field1250 >> 9;
                    }
                    if (var36.field5483 instanceof class280) {
                        class280 var41 = (class280) var36.field5483;
                        int var42 = var41.method1835((byte) 127);
                        if ((var42 & 0x1) == 0 && (var41.field1264 & 0x1FF) == 0 && (var41.field1250 & 0x1FF) == 0 || (var42 & 0x1) == 1 && (var41.field1264 & 0x1FF) == 256 && (var41.field1250 & 0x1FF) == 256) {
                            int var43 = var41.field1264 - (var41.method1835((byte) 127) - 1 << 8);
                            int var44 = var41.field1250 - (var41.method1835((byte) 127) - 1 << 8);
                            for (int var45 = 0; var45 < class344.field4849; var45++) {
                                class740 var52 = (class740) class373.field5230.method1180((byte) 26, (long) class100.field1196[var45]);
                                if (var52 != null) {
                                    class468 var53 = var52.field10289;
                                    if (class740.field10285 != var53.field7939 && var53.field7970) {
                                        int var54 = var53.field1264 - (var53.field6632.field5051 - 1 << 8);
                                        int var55 = var53.field1250 - (var53.field6632.field5051 - 1 << 8);
                                        if (var43 <= var54 && var53.field6632.field5051 <= (var41.method1835((byte) 127) - (var54 - var43 >> 9)) && var55 >= var44 && var53.field6632.field5051 <= var41.method1835((byte) 127) - (var55 - var44 >> 9)) {
                                            class378.method2371(var53, class660.field9039.field1266 != var36.field5483.field1266, 3415);
                                            var53.field7939 = class740.field10285;
                                        }
                                    }
                                }
                            }
                            int var46 = class578.field8168;
                            int[] var47 = class240.field3201;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class280 var49 = class309.field4311[var47[var48]];
                                if (var49 != null && class740.field10285 != var49.field7939 && var41 != var49 && var49.field7970) {
                                    int var50 = var49.field1264 - (var49.method1835((byte) 127) - 1 << 8);
                                    int var51 = var49.field1250 - (var49.method1835((byte) 127) - 1 << 8);
                                    if (var43 <= var50 && var49.method1835((byte) 127) <= (var41.method1835((byte) 127) - (var50 - var43 >> 9)) && var51 >= var44 && var49.method1835((byte) 127) <= (var41.method1835((byte) 127) - (var51 - var44 >> 9))) {
                                        class456.method2712(class660.field9039.field1266 != var36.field5483.field1266, (byte) 107, var49);
                                        var49.field7939 = class740.field10285;
                                    }
                                }
                            }
                        }
                        if (class740.field10285 == var41.field7939) {
                            continue;
                        }
                        class456.method2712(class660.field9039.field1266 != var36.field5483.field1266, (byte) 119, var41);
                        var41.field7939 = class740.field10285;
                    }
                    if (var36.field5483 instanceof class468) {
                        class468 var56 = (class468) var36.field5483;
                        if (var56.field6632 != null) {
                            if ((var56.field6632.field5051 & 0x1) == 0 && (var56.field1264 & 0x1FF) == 0 && (var56.field1250 & 0x1FF) == 0 || (var56.field6632.field5051 & 0x1) == 1 && (var56.field1264 & 0x1FF) == 256 && (var56.field1250 & 0x1FF) == 256) {
                                int var57 = var56.field1264 - (var56.field6632.field5051 - 1 << 8);
                                int var58 = var56.field1250 - (var56.field6632.field5051 - 1 << 8);
                                for (int var59 = 0; var59 < class344.field4849; var59++) {
                                    class740 var66 = (class740) class373.field5230.method1180((byte) 26, (long) class100.field1196[var59]);
                                    if (var66 != null) {
                                        class468 var67 = var66.field10289;
                                        if (class740.field10285 != var67.field7939 && var56 != var67 && var67.field7970) {
                                            int var68 = var67.field1264 - (var67.field6632.field5051 - 1 << 8);
                                            int var69 = var67.field1250 - (var67.field6632.field5051 - 1 << 8);
                                            if (var57 <= var68 && (var56.field6632.field5051 - (var68 - var57 >> 9)) >= var67.field6632.field5051 && var69 >= var58 && var67.field6632.field5051 <= var56.field6632.field5051 - (var69 - var58 >> 9)) {
                                                class378.method2371(var67, class660.field9039.field1266 != var36.field5483.field1266, 3415);
                                                var67.field7939 = class740.field10285;
                                            }
                                        }
                                    }
                                }
                                int var60 = class578.field8168;
                                int[] var61 = class240.field3201;
                                for (int var62 = 0; var62 < var60; var62++) {
                                    class280 var63 = class309.field4311[var61[var62]];
                                    if (var63 != null && class740.field10285 != var63.field7939 && var63.field7970) {
                                        int var64 = var63.field1264 - (var63.method1835((byte) 127) - 1 << 8);
                                        int var65 = var63.field1250 - (var63.method1835((byte) 127) - 1 << 8);
                                        if (var57 <= var64 && var63.method1835((byte) 127) <= var56.field6632.field5051 - (var64 - var57 >> 9) && var58 <= var65 && var63.method1835((byte) 127) <= (var56.field6632.field5051 - (var65 - var58 >> 9))) {
                                            class456.method2712(class660.field9039.field1266 != var36.field5483.field1266, (byte) 119, var63);
                                            var63.field7939 = class740.field10285;
                                        }
                                    }
                                }
                            }
                            if (class740.field10285 == var56.field7939) {
                                continue;
                            }
                            class378.method2371(var56, class660.field9039.field1266 != var36.field5483.field1266, 3415);
                            var56.field7939 = class740.field10285;
                        }
                    }
                    if (var36.field5483 instanceof class716) {
                        int var70 = class228.field3063 + var39;
                        int var71 = class3.field30 + var40;
                        class338 var72 = (class338) class178.field2391.method1180((byte) 26, (long) (var36.field5483.field1266 << 28 | var71 << 14 | var70));
                        if (var72 != null) {
                            int var73 = 0;
                            class446 var74 = (class446) var72.field4698.method2763(127);
                            while (var74 != null) {
                                class551 var75 = class682.field9361.method3424(var74.field6325, false);
                                if (class124.field1491 && class660.field9039.field1266 == var36.field5483.field1266) {
                                    class82 var76 = class273.field3902 == -1 ? null : class605.field8497.method154(class273.field3902, (byte) -81);
                                    if ((class351.field4969 & 0x1) != 0 && (var76 == null || var75.method3198(var76.field1025, class273.field3902, 91) != var76.field1025)) {
                                        class8.field112++;
                                        class635.method3531(false, var40, -1, class291.field4101, false, class580.field8185, true, 9, (long) var73, (long) var74.field6325, class701.field9774 + " -> <col=ff9040>" + var75.field7677, var39, 0);
                                    }
                                }
                                if (class660.field9039.field1266 == var36.field5483.field1266) {
                                    String[] var77 = var75.field7678;
                                    for (int var78 = 4; var78 >= 0; var78--) {
                                        if (var77 != null && var77[var78] != null) {
                                            byte var79 = 0;
                                            if (var78 == 0) {
                                                var79 = 45;
                                            }
                                            int var80 = class405.field5738;
                                            if (var78 == 1) {
                                                var79 = 17;
                                            }
                                            if (var78 == 2) {
                                                var79 = 47;
                                            }
                                            if (var78 == 3) {
                                                var79 = 10;
                                            }
                                            if (var75.field7721 == var78) {
                                                var80 = var75.field7743;
                                            }
                                            if (var78 == 4) {
                                                var79 = 57;
                                            }
                                            if (var75.field7709 == var78) {
                                                var80 = var75.field7693;
                                            }
                                            class635.method3531(false, var40, -1, var77[var78], false, var80, true, var79, (long) var73, (long) var74.field6325, "<col=ff9040>" + var75.field7677, var39, 0);
                                            class606.field8528++;
                                        }
                                    }
                                }
                                class635.method3531(class660.field9039.field1266 != var36.field5483.field1266, var40, -1, class71.field918.method588((byte) 110, class549.field7669), false, class621.field8643, true, 1006, (long) var73, (long) var74.field6325, "<col=ff9040>" + var75.field7677, var39, 0);
                                class719.field9983++;
                                var74 = (class446) var72.field4698.method2760(true);
                                var73++;
                            }
                        }
                    }
                    if (var36.field5483 instanceof class706) {
                        class706 var81 = (class706) var36.field5483;
                        class10 var82 = class612.field8588.method558((byte) 113, var81.method861((byte) -17));
                        if (var82.field226 != null) {
                            var82 = var82.method67(class101.field1201, 0);
                        }
                        if (var82 != null) {
                            if (class124.field1491 && class660.field9039.field1266 == var36.field5483.field1266) {
                                class82 var83 = class273.field3902 == -1 ? null : class605.field8497.method154(class273.field3902, (byte) -124);
                                if ((class351.field4969 & 0x4) != 0 && (var83 == null || var82.method61(class273.field3902, 102, var83.field1025) != var83.field1025)) {
                                    class635.method3531(false, var40, -1, class291.field4101, false, class580.field8185, true, 51, (long) var81.hashCode(), class688.method3845(-110, var39, var81, var40), class701.field9774 + " -> <col=00ffff>" + var82.field149, var39, 0);
                                    class200.field2629++;
                                }
                            }
                            if (class660.field9039.field1266 == var36.field5483.field1266) {
                                String[] var84 = var82.field142;
                                if (var84 != null) {
                                    for (int var85 = 4; var85 >= 0; var85--) {
                                        if (var84[var85] != null) {
                                            short var86 = 0;
                                            if (var85 == 0) {
                                                var86 = 3;
                                            }
                                            int var87 = class405.field5738;
                                            if (var85 == 1) {
                                                var86 = 13;
                                            }
                                            if (var85 == 2) {
                                                var86 = 58;
                                            }
                                            if (var85 == 3) {
                                                var86 = 8;
                                            }
                                            if (var85 == 4) {
                                                var86 = 1001;
                                            }
                                            if (var82.field148 == var85) {
                                                var87 = var82.field209;
                                            }
                                            if (var82.field204 == var85) {
                                                var87 = var82.field190;
                                            }
                                            class566.field8044++;
                                            class635.method3531(false, var40, -1, var84[var85], false, var87, true, var86, (long) var81.hashCode(), class688.method3845(-77, var39, var81, var40), "<col=00ffff>" + var82.field149, var39, 0);
                                        }
                                    }
                                }
                                class326.field4516++;
                                class635.method3531(class660.field9039.field1266 != var36.field5483.field1266, var40, -1, class71.field918.method588((byte) 86, class549.field7669), false, class621.field8643, true, 1004, (long) var81.hashCode(), (long) var82.field236, "<col=00ffff>" + var82.field149, var39, 0);
                            }
                        }
                    }
                }
            }
            if (class589.field8295) {
                class25.method159((byte) 113);
            }
        }
        class136.method966(false, (byte) 106);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static final void method210(int arg0) {
        field473++;
        if (!class124.field1491) {
            return;
        }
        class493 var1 = class323.method2083(class58.field710, (byte) -102, class114.field1379);
        if (var1 != null && var1.field7012 != null) {
            class357 var2 = new class357();
            var2.field5076 = var1.field7012;
            var2.field5082 = var1;
            class241.method1543(var2);
        }
        class86.field1057 = arg0;
        class504.field7234 = -1;
        class124.field1491 = false;
        if (var1 != null) {
            class543.method3149(var1, arg0 + 2);
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
    public class37(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field463 = arg3;
        this.field464 = arg11;
        this.field461 = arg6;
        this.field471 = arg9;
        this.field462 = arg4;
        this.field472 = arg2;
        this.field460 = arg8;
        this.field474 = arg5;
        this.field466 = arg10;
        this.field465 = arg7;
        this.field470 = arg1;
        this.field459 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BII)Z")
    public static final boolean method211(byte arg0, int arg1, int arg2) {
        if (arg0 != 33) {
            method212(123);
        }
        field469++;
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
    public static final void method212(int arg0) {
        if (arg0 != -1) {
            method211((byte) 110, 97, -102);
        }
        field468++;
        class636.field8756.method4024(0);
    }
}
