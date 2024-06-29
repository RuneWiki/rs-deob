import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class104 {

    @OriginalMember(owner = "client!co", name = "a", descriptor = "Lgi;")
    public static class630 field1620 = new class630();

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)Z")
    public static final boolean method834(byte arg0, int arg1, int arg2) {
        field1622++;
        if (arg0 <= 34) {
            method834((byte) 98, -126, -16);
        }
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lr;IIILsp;Llt;)Z")
    public static final boolean method835(class166 arg0, int arg1, int arg2, int arg3, class588 arg4, class627 arg5) {
        field1624++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field8243 != null) {
            var8 = class25.field368 - ((arg5.field8777 + arg4.field8258 - class25.field354) * (class25.field368 - class25.field370) / (class25.field363 - class25.field354));
            var6 = (arg4.field8249 + arg5.field8782 - class25.field367) * (class25.field353 - class25.field357) / (class25.field371 - class25.field367) + class25.field357;
            var9 = class25.field368 - ((arg4.field8264 + arg5.field8777 - class25.field354) * (class25.field368 - class25.field370) / (class25.field363 - class25.field354));
            var7 = class25.field357 + ((class25.field353 - class25.field357) * (arg4.field8223 + arg5.field8782 - class25.field367) / (class25.field371 - class25.field367));
        }
        class702 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg4.field8237 != -1) {
            if (arg5.field8778 && arg4.field8219 != -1) {
                var10 = arg4.method3327(true, 123, arg0);
            } else {
                var10 = arg4.method3327(false, arg1 + 106, arg0);
            }
            if (var10 != null) {
                var11 = arg5.field8773 - (var10.method931() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg5.field8773 + (var10.method931() + 1 >> 1);
                var13 = arg5.field8779 - (var10.method936() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var14 = arg5.field8779 + (var10.method936() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class324 var15 = null;
        int var16 = 0;
        if (arg1 != 2) {
            method836(true);
        }
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg4.field8265 != null) {
            var15 = class373.method2251(0, arg4.field8252);
            if (var15 != null) {
                var16 = class597.field8436.method1042(false, null, null, arg4.field8265, class32.field508);
                int var23 = arg5.field8779;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method2040() / 2;
                } else {
                    var17 = var23 - ((var10.method936() >> 1) + var16 * var15.method2038());
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class32.field508[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2036(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg5.field8773 + arg3 - (var18 / 2);
                if (var19 < var6) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg3 + arg5.field8773;
                if (var7 < var20) {
                    var7 = var20;
                }
                var21 = arg2 + var17;
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = var17 + var15.method2038() * var16 + arg2;
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class25.field357 > var7 || var6 > class25.field353 || var9 < class25.field370 || var8 > class25.field368) {
            return true;
        }
        if (arg4.field8243 != null) {
            int[] var27 = new int[arg4.field8243.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg4.field8243[var28 * 2] + arg5.field8782;
                int var31 = arg4.field8243[var28 * 2 + 1] + arg5.field8777;
                var27[var28 * 2] = class25.field357 + ((var30 - class25.field367) * (class25.field353 - class25.field357) / (class25.field371 - class25.field367));
                var27[var28 * 2 + 1] = class25.field368 - (class25.field368 - class25.field370) * (var31 - class25.field354) / (class25.field363 - class25.field354);
            }
            class464.method2732(arg0, var27, arg4.field8224);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg0.method1151(var27[var29 * 2], var27[var29 * 2 + 3], arg4.field8231, var27[var29 * 2 + 1], (byte) -127, var27[(var29 + 1) * 2]);
            }
            arg0.method1151(var27[var27.length - 2], var27[1], arg4.field8231, var27[var27.length - 1], (byte) -122, var27[0]);
        }
        if (var10 != null) {
            if (class14.field132 > 0 && (class511.field7190 != -1 && class511.field7190 == arg5.field8781 || class444.field6469 != -1 && class444.field6469 == arg4.field8246)) {
                int var32;
                if (class394.field5835 <= 50) {
                    var32 = class394.field5835 * 2;
                } else {
                    var32 = 200 - (class394.field5835 * 2);
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg0.method1148(arg5.field8773, arg5.field8779, var33, var10.method927() / 2 + 7, false);
                arg0.method1148(arg5.field8773, arg5.field8779, var33, var10.method927() / 2 + 5, false);
                arg0.method1148(arg5.field8773, arg5.field8779, var33, var10.method927() / 2 + 3, false);
                arg0.method1148(arg5.field8773, arg5.field8779, var33, var10.method927() / 2 + 1, false);
                arg0.method1148(arg5.field8773, arg5.field8779, var33, var10.method927() / 2, false);
            }
            var10.method3916(arg5.field8773 - (var10.method931() >> 1), arg5.field8779 + -(var10.method936() >> 1));
        }
        if (arg4.field8265 != null && var15 != null) {
            class161.method1113(arg5, var17, (byte) 95, var15, var18, var16, arg0, arg4);
        }
        if (arg4.field8237 != -1 || arg4.field8265 != null) {
            class430 var34 = new class430(arg5);
            var34.field6305 = var13;
            var34.field6307 = var12;
            var34.field6297 = var21;
            var34.field6308 = var19;
            var34.field6299 = var20;
            var34.field6301 = var14;
            var34.field6304 = var22;
            var34.field6300 = var11;
            class569.field8030.method474(var34, 6);
        }
        return false;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
    public static void method836(boolean arg0) {
        field1620 = null;
        if (!arg0) {
            method835(null, -81, -59, -76, null, null);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static final void method837(int arg0) {
        field1623++;
        if (class287.field4270.method2746(0, class328.field4859) != 2) {
            return;
        }
        byte var1 = (byte) (class534.field7501 - 4 & 0xFF);
        int var2 = class534.field7501 % class199.field2812;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class232.field3611; var18++) {
                class262.field3977[var3][var2][var18] = var1;
            }
        }
        if (arg0 >= -14) {
            field1620 = null;
        }
        if (class58.field1112 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class166.field2387[var4] = -1000000;
            class539.field7552[var4] = 1000000;
            class158.field2274[var4] = 0;
            class117.field1784[var4] = 1000000;
            class692.field9728[var4] = 0;
        }
        int var5 = class648.field9106.field3024;
        int var6 = class648.field9106.field3029;
        if (class43.field700 != 1 && class563.field7927 == -1) {
            int var7 = class674.method3748(class131.field1928, class58.field1112, 74, class413.field6011);
            if (var7 - class568.field7998 < 3200 && (class672.field9500[class58.field1112][class131.field1928 >> 9][class413.field6011 >> 9] & 0x4) != 0) {
                class552.method3130(-1, false, class131.field1928 >> 9, class413.field6011 >> 9, 1, class153.field2210);
                return;
            }
            return;
        }
        if (class43.field700 != 1) {
            var5 = class563.field7927;
            var6 = class666.field9399;
        }
        if ((class672.field9500[class58.field1112][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class552.method3130(-1, false, var5 >> 9, var6 >> 9, 0, class153.field2210);
        }
        if (class544.field7662 >= 2560) {
            return;
        }
        int var8 = class131.field1928 >> 9;
        int var9 = class413.field6011 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var10 <= var8) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        int var13;
        if (var11 > var9) {
            var13 = var11 - var9;
        } else {
            var13 = var9 - var11;
        }
        if ((var12 != 0 || var13 != 0) && -class199.field2812 < var12 && var12 < class199.field2812 && var13 > -class232.field3611 && class232.field3611 > var13) {
            if (var13 >= var12) {
                int var14 = var12 * 65536 / var13;
                int var15 = 32768;
                while (var9 != var11) {
                    if (var11 > var9) {
                        var9++;
                    } else if (var11 < var9) {
                        var9--;
                    }
                    if ((class672.field9500[class58.field1112][var8][var9] & 0x4) != 0) {
                        class552.method3130(-1, false, var8, var9, 1, class153.field2210);
                        return;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        var15 -= 65536;
                        if (var10 > var8) {
                            var8++;
                        } else if (var8 > var10) {
                            var8--;
                        }
                        if ((class672.field9500[class58.field1112][var8][var9] & 0x4) != 0) {
                            class552.method3130(-1, false, var8, var9, 1, class153.field2210);
                            return;
                        }
                    }
                }
                return;
            }
            int var16 = var13 * 65536 / var12;
            int var17 = 32768;
            while (var8 != var10) {
                if (var10 > var8) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class672.field9500[class58.field1112][var8][var9] & 0x4) != 0) {
                    class552.method3130(-1, false, var8, var9, 1, class153.field2210);
                    return;
                }
                var17 += var16;
                if (var17 >= 65536) {
                    var17 -= 65536;
                    if (var11 > var9) {
                        var9++;
                    } else if (var9 > var11) {
                        var9--;
                    }
                    if ((class672.field9500[class58.field1112][var8][var9] & 0x4) != 0) {
                        class552.method3130(-1, false, var8, var9, 1, class153.field2210);
                        return;
                    }
                }
            }
            return;
        }
        class699.method3896(75, null, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class109.field1672 + "," + class203.field2874);
        return;
    }
}
