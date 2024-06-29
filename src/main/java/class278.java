import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class278 {

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Lqf;")
    public static class311 field4291 = new class311(16);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Lcf;")
    public static class275 field4290;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILql;I)V", line = 6)
    public static final void method1953(int arg0, int arg1, class337 arg2, int arg3) {
        field4289++;
        if ((arg3 & 0x200) != 0) {
            arg2.field4683 = class111.field1544.method42((byte) 62);
            arg2.field4652 = class111.field1544.method38(75);
            arg2.field4662 = class111.field1544.method58(-288140008);
            arg2.field4664 = class111.field1544.method58(-288140008);
            arg2.field4658 = class111.field1544.method68(-4325) + class229.field3595;
            arg2.field4722 = class111.field1544.method39((byte) 32) + class229.field3595;
            arg2.field4729 = class111.field1544.method58(-288140008);
            arg2.field4695 = 0;
            arg2.field4710 = 1;
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field4730 = class111.field1544.method89(67);
            arg2.field4681 = class111.field1544.method72((byte) -66);
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field4726 = class111.field1544.method68(-4325);
            if (arg2.field4726 == 65535) {
                arg2.field4726 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var4 = class111.field1544.method52(-32768);
            int var5 = class111.field1544.method85(1);
            arg2.method2093(class229.field3595, var5, var4, -24);
            arg2.field4734 = class229.field3595 + 300;
            arg2.field4721 = class111.field1544.method38(83);
        }
        if ((arg3 & 0x10) != 0) {
            int var6 = class111.field1544.method58(-288140008);
            byte[] var7 = new byte[var6];
            class6 var8 = new class6(var7);
            class111.field1544.method69(0, 111, var7, var6);
            class286.field4418[arg0] = var8;
            arg2.method2337(85, var8);
        }
        if ((arg3 & 0x100) != 0) {
            int var9 = class111.field1544.method72((byte) -66);
            int var10 = class111.field1544.method73((byte) 19);
            if (var9 == 65535) {
                var9 = -1;
            }
            boolean var11 = true;
            if (var9 != -1 && arg2.field4703 != -1 && class295.method2064(0, class9.method124(var9, 1431655765).field3647).field4338 < class295.method2064(0, class9.method124(arg2.field4703, 1431655765).field3647).field4338) {
                var11 = false;
            }
            if (var11) {
                arg2.field4704 = 0;
                arg2.field4732 = class229.field3595 + (var10 & 0xFFFF);
                arg2.field4712 = 1;
                arg2.field4679 = 0;
                if (arg2.field4732 > class229.field3595) {
                    arg2.field4679 = -1;
                }
                arg2.field4685 = var10 >> 16;
                arg2.field4703 = var9;
                if (arg2.field4703 != -1 && class229.field3595 == arg2.field4732) {
                    int var12 = class9.method124(arg2.field4703, 1431655765).field3647;
                    if (var12 != -1) {
                        class281 var13 = class295.method2064(0, var12);
                        if (var13 != null && var13.field4319 != null) {
                            class91.method658(var13, true, class146.field2310 == arg2, arg2.field4698, 0, arg2.field4731);
                        }
                    }
                }
            }
        }
        if ((arg3 & 0x800) != 0) {
            int var14 = class111.field1544.method58(-288140008);
            int[] var15 = new int[var14];
            int[] var16 = new int[var14];
            int[] var17 = new int[var14];
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = class111.field1544.method72((byte) -66);
                if (var19 == 65535) {
                    var19 = -1;
                }
                var15[var18] = var19;
                var16[var18] = class111.field1544.method85(1);
                var17[var18] = class111.field1544.method89(59);
            }
            class199.method1469(var15, var16, 21652, arg2, var17);
        }
        if ((arg3 & 0x400) != 0) {
            int var20 = class111.field1544.method52(-32768);
            int var21 = class111.field1544.method58(-288140008);
            arg2.method2093(class229.field3595, var21, var20, -78);
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field4706 = class111.field1544.method40(false);
            if (arg2.field4706.charAt(0) == '~') {
                arg2.field4706 = arg2.field4706.substring(1);
                class131.method971(arg2.method2335((byte) 98), (byte) -32, 2, arg2.field4706);
            } else if (class146.field2310 == arg2) {
                class131.method971(arg2.method2335((byte) 127), (byte) -32, 2, arg2.field4706);
            }
            arg2.field4672 = 150;
            arg2.field4660 = 0;
            arg2.field4667 = 0;
        }
        if ((arg3 & 0x80) != 0) {
            int var22 = class111.field1544.method89(71);
            if (var22 == 65535) {
                var22 = -1;
            }
            int var23 = class111.field1544.method38(97);
            class235.method1686(arg2, var23, (byte) -67, var22);
        }
        if (arg1 <= 82) {
            field4291 = (class311) null;
        }
        if ((arg3 & 0x20) == 0) {
            return;
        }
        int var24 = class111.field1544.method89(126);
        int var25 = class111.field1544.method58(-288140008);
        int var26 = class111.field1544.method42((byte) 46);
        int var27 = class111.field1544.field111;
        boolean var28 = (var24 & 0x8000) != 0;
        if (arg2.field5277 != null && arg2.field5264 != null) {
            long var29 = class83.method608(arg2.field5277, (byte) -99);
            boolean var31 = false;
            if (var25 <= 1) {
                if (var28 || (!class336.field5241 || class26.field392) && !class83.field1136) {
                    for (int var32 = 0; var32 < class162.field2640; var32++) {
                        if (class316.field4982[var32] == var29) {
                            var31 = true;
                            break;
                        }
                    }
                } else {
                    var31 = true;
                }
            }
            if (!var31 && class231.field3610 == 0) {
                class162.field2639.field111 = 0;
                class111.field1544.method70(0, var26, class162.field2639.field115, (byte) 85);
                class162.field2639.field111 = 0;
                int var33 = -1;
                String var34;
                if (var28) {
                    var24 &= 0x7FFF;
                    class214 var35 = class255.method1848(3, class162.field2639);
                    var33 = var35.field3381;
                    var34 = var35.field3375.method2231(class162.field2639, 80);
                } else {
                    var34 = class321.method2255(class237.method1700(class158.method1147(class162.field2639, -8748), 2));
                }
                arg2.field4706 = var34.trim();
                arg2.field4660 = var24 & 0xFF;
                arg2.field4672 = 150;
                arg2.field4667 = var24 >> 8;
                if (var25 == 2) {
                    class214.method1563(var28 ? 17 : 1, (String) null, (byte) -37, var34, "<img=1>" + arg2.method2335((byte) 121), var33);
                } else if (var25 == 1) {
                    class214.method1563(var28 ? 17 : 1, (String) null, (byte) -37, var34, "<img=0>" + arg2.method2335((byte) 107), var33);
                } else {
                    class214.method1563(var28 ? 17 : 2, (String) null, (byte) -37, var34, arg2.method2335((byte) 98), var33);
                }
            }
        }
        class111.field1544.field111 = var26 + var27;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 291)
    public static void method1954(byte arg0) {
        field4290 = null;
        int var1 = -128 % ((arg0 + 39) / 54);
        field4291 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IB)V", line = 306)
    public static final void method1955(int arg0, byte arg1) {
        int var2 = class295.field4572;
        int var3 = class43.field588;
        field4293++;
        int var4 = class317.field5018;
        int var5 = class293.field4536;
        if (arg1 <= 57) {
            field4291 = (class311) null;
        }
        int var6 = (int) class6.field114;
        if (var6 < (class121.field1704 / 256)) {
            var6 = class121.field1704 / 256;
        }
        if (class130.field1918[4] && class57.field790[4] + 128 > var6) {
            var6 = class57.field790[4] + 128;
        }
        int var7 = (int) class45.field604 + class232.field3613 & 0x7FF;
        int var8 = class185.field2999;
        class282.method1999(class320.method2245((byte) -49, class146.field2310.field4731, class154.field2392, class146.field2310.field4698) - 50, var6, var6 * 3 + 600, arg0, (byte) 102, var7, class225.field3561, class2.field19);
        if (class295.field4572 == var2 && class43.field588 == var3 && class317.field5018 == var4 && class293.field4536 == var5 && class185.field2999 == var8) {
            class166.field2715 = 1;
            return;
        }
        class319.field5044 = 10;
        class14.field236 = 10;
        class92.field1230 = 10;
        class132.field1950 = 10;
        int var9 = class185.field2999 - var8;
        if (class317.field5018 > var4) {
            var4 += (class317.field5018 - var4) * class92.field1230 / 1000 + class132.field1950;
            if (var4 < class317.field5018) {
                class317.field5018 = var4;
            }
        }
        if (var2 < class295.field4572) {
            var2 += (class295.field4572 - var2) * class92.field1230 / 1000 + class132.field1950;
            if (class295.field4572 > var2) {
                class295.field4572 = var2;
            }
        }
        if (class293.field4536 > var5) {
            var5 += (class293.field4536 - var5) * class14.field236 / 1000 + class319.field5044;
            if (class293.field4536 > var5) {
                class293.field4536 = var5;
            }
        }
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var5 > class293.field4536) {
            int var10 = var5 - ((var5 - class293.field4536) * class14.field236 / 1000 + class319.field5044);
            if (var10 > class293.field4536) {
                class293.field4536 = var10;
            }
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        if (var4 > class317.field5018) {
            int var11 = var4 - ((var4 - class317.field5018) * class92.field1230 / 1000 + class132.field1950);
            if (var11 > class317.field5018) {
                class317.field5018 = var11;
            }
        }
        if (var9 > 0) {
            int var12 = class14.field236 * var9 / 1000 + class319.field5044 + var8;
            var8 = var12 & 0x7FF;
        }
        if (var3 < class43.field588) {
            var3 += (class43.field588 - var3) * class92.field1230 / 1000 + class132.field1950;
            if (var3 < class43.field588) {
                class43.field588 = var3;
            }
        }
        if (var9 < 0) {
            int var13 = var8 - (class319.field5044 + (-var9 * class14.field236 / 1000));
            var8 = var13 & 0x7FF;
        }
        int var14 = class185.field2999 - var8;
        if (class43.field588 < var3) {
            int var15 = var3 - ((var3 - class43.field588) * class92.field1230 / 1000 + class132.field1950);
            if (class43.field588 < var15) {
                class43.field588 = var15;
            }
        }
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (class295.field4572 < var2) {
            int var16 = var2 - ((var2 - class295.field4572) * class92.field1230 / 1000 + class132.field1950);
            if (var16 > class295.field4572) {
                class295.field4572 = var16;
            }
        }
        if (var14 >= 0 || var9 <= 0 || var14 > 0 && var9 < 0) {
            class185.field2999 = var8;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lak;IIIIIIIZ)V", line = 457)
    public static final void method1956(class153 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class261.field4103;
        int var11;
        int var12 = var11 = (arg7 << 7) - class206.field3276;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class172.field2843[arg1][arg6][arg7] - class311.field4849;
        int var18 = class172.field2843[arg1][arg6 + 1][arg7] - class311.field4849;
        int var19 = class172.field2843[arg1][arg6 + 1][arg7 + 1] - class311.field4849;
        int var20 = class172.field2843[arg1][arg6][arg7 + 1] - class311.field4849;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class31.field457;
        int var46 = (var24 << 9) / var25 + class31.field455;
        int var47 = (var27 << 9) / var31 + class31.field457;
        int var48 = (var30 << 9) / var31 + class31.field455;
        int var49 = (var33 << 9) / var37 + class31.field457;
        int var50 = (var36 << 9) / var37 + class31.field455;
        int var51 = (var39 << 9) / var43 + class31.field457;
        int var52 = (var42 << 9) / var43 + class31.field455;
        class31.field460 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class181.field2938 && class48.method366(class31.field457 + class284.field4404, class32.field481 + class31.field455, var50, var52, var48, var49, var51, var47)) {
                class120.field1664 = arg6;
                class132.field1949 = arg7;
            }
            if (!class109.field1458 && !arg8) {
                class31.field456 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class31.field468 || var51 > class31.field468 || var47 > class31.field468) {
                    class31.field456 = true;
                }
                if (arg0.field2378 == -1) {
                    if (arg0.field2368 != 12345678) {
                        class31.method283(var50, var52, var48, var49, var51, var47, arg0.field2368, arg0.field2369, arg0.field2372);
                    }
                } else if (!class14.field240) {
                    int var53 = class31.field466.method458(17701, arg0.field2378);
                    class31.method283(var50, var52, var48, var49, var51, var47, class187.method1379(var53, arg0.field2368), class187.method1379(var53, arg0.field2369), class187.method1379(var53, arg0.field2372));
                } else if (arg0.field2376) {
                    class31.method289(var50, var52, var48, var49, var51, var47, arg0.field2368, arg0.field2369, arg0.field2372, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2378);
                } else {
                    class31.method289(var50, var52, var48, var49, var51, var47, arg0.field2368, arg0.field2369, arg0.field2372, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2378);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class181.field2938 && class48.method366(class31.field457 + class284.field4404, class32.field481 + class31.field455, var46, var48, var52, var45, var47, var51)) {
            class120.field1664 = arg6;
            class132.field1949 = arg7;
        }
        if (class109.field1458 || arg8) {
            return;
        }
        class31.field456 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class31.field468 || var47 > class31.field468 || var51 > class31.field468) {
            class31.field456 = true;
        }
        if (arg0.field2378 == -1) {
            if (arg0.field2364 != 12345678) {
                class31.method283(var46, var48, var52, var45, var47, var51, arg0.field2364, arg0.field2372, arg0.field2369);
            }
        } else if (class14.field240) {
            class31.method289(var46, var48, var52, var45, var47, var51, arg0.field2364, arg0.field2372, arg0.field2369, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2378);
        } else {
            int var54 = class31.field466.method458(17701, arg0.field2378);
            class31.method283(var46, var48, var52, var45, var47, var51, class187.method1379(var54, arg0.field2364), class187.method1379(var54, arg0.field2372), class187.method1379(var54, arg0.field2369));
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V", line = 617)
    public static final void method1957(boolean arg0) {
        field4292++;
        if (!class154.method1119((byte) 16) && class154.field2392 != class130.field1925) {
            class329.method2306(class146.field2310.field4675[0], class154.field2392, false, 70, class146.field2310.field4708[0], false, class78.field1052, class257.field4057);
            return;
        }
        if (arg0) {
            field4291 = (class311) null;
        }
        if (class33.field492 != class154.field2392 && class328.method2300(class154.field2392, true)) {
            class33.field492 = class154.field2392;
            class119.method856(false);
        }
    }
}
