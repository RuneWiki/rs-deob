import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class class530 {

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "[I")
    public static int[] field7816 = new int[5];

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public int field7819;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public int field7823;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public int field7824;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V", line = 4)
    public static void method3139(int arg0) {
        field7816 = null;
        int var1 = -14 % ((arg0 + 36) / 45);
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)Z", line = 14)
    public final boolean method3140(int arg0) {
        if (arg0 != -24517) {
            this.method3145(24);
        }
        field7822++;
        return (this.field7824 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)Z", line = 25)
    public final boolean method3141(boolean arg0) {
        if (arg0) {
            this.field7819 = 66;
        }
        field7817++;
        return (this.field7824 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lqa;Lha;III)V", line = 37)
    public static final void method3142(class162 arg0, class41 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class246.field3560) {
            class165 var5 = class36.field545[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field2487 != null && var5.field2487.method121(26923)) {
                arg1.method111(0, class427.field6246, arg0, 93, true, var5.field2487, 0);
            }
        }
        if (arg4 < class246.field3560) {
            class165 var6 = class36.field545[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field2487 != null && var6.field2487.method121(26923)) {
                arg1.method111(0, 0, arg0, 50, true, var6.field2487, class427.field6246);
            }
        }
        if (arg3 < class246.field3560 && arg4 < class254.field3675) {
            class165 var7 = class36.field545[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field2487 != null && var7.field2487.method121(26923)) {
                arg1.method111(0, class427.field6246, arg0, 16, true, var7.field2487, class427.field6246);
            }
        }
        if (arg3 < class246.field3560 && arg4 > 0) {
            class165 var8 = class36.field545[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field2487 != null && var8.field2487.method121(26923)) {
                arg1.method111(0, class427.field6246, arg0, 29, true, var8.field2487, -class427.field6246);
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lon;Lqa;I)I", line = 85)
    public static final int method3143(class220 arg0, class162 arg1, int arg2) {
        if (arg2 != -20806) {
            field7825 = -25;
        }
        field7821++;
        if (arg0.field3177 != -1) {
            return arg0.field3177;
        }
        if (arg0.field3172 != -1) {
            class216 var3 = arg1.field2449.method935(arg1.method473() ? arg0.field3172 : arg0.field3182, -8037);
            if (!var3.field3114) {
                return var3.field3119;
            }
        }
        return arg0.field3165;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIILps;Lqf;)V", line = 120)
    public static final void method3144(int arg0, int arg1, int arg2, class62 arg3, class477 arg4) {
        field7814++;
        byte var5 = -1;
        if ((arg2 & 0x20) != 0) {
            int var6 = arg4.method1894(255);
            byte[] var7 = new byte[var6];
            class303 var8 = new class303(var7);
            arg4.method1896(0, var6, var7, 962464904);
            class253.field3640[arg0] = var8;
            arg3.method558(false, var8);
        }
        if ((arg2 & 0x800) != 0) {
            int var9 = class180.field2734;
            int var10 = arg4.method1891(false);
            int var11 = arg4.method1918((byte) 75);
            arg3.method181(106, var9, var10, var11);
        }
        if ((arg2 & 0x10) != 0) {
            int var12 = arg4.method1868(0);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = arg4.method1918((byte) -39);
            class379.method2404(var12, arg3, var13, -117);
        }
        if ((arg2 & 0x4000) != 0) {
            var5 = arg4.method1883((byte) -29);
        }
        if (arg1 > -49) {
            return;
        }
        if ((arg2 & 0x400) != 0) {
            arg3.field374 = arg4.method1899((byte) -105);
            arg3.field312 = arg4.method1899((byte) 117);
            arg3.field386 = arg4.method1884((byte) -128);
            arg3.field399 = arg4.method1884((byte) -127);
            arg3.field314 = arg4.method1868(0) + class180.field2734;
            arg3.field358 = arg4.method1888((byte) 99) + class180.field2734;
            arg3.field328 = arg4.method1864(16698);
            arg3.field411 = 0;
            if (arg3.field1066) {
                arg3.field374 += arg3.field1070;
                arg3.field312 += arg3.field1080;
                arg3.field386 += arg3.field1070;
                arg3.field412 = 0;
                arg3.field399 += arg3.field1080;
            } else {
                arg3.field412 = 1;
                arg3.field312 += arg3.field416[0];
                arg3.field386 += arg3.field409[0];
                arg3.field374 += arg3.field409[0];
                arg3.field399 += arg3.field416[0];
            }
        }
        if ((arg2 & 0x8) != 0) {
            int var14 = arg4.method1868(0);
            if (var14 == 65535) {
                var14 = -1;
            }
            arg3.field355 = var14;
        }
        if ((arg2 & 0x8000) != 0) {
            int var15 = arg4.method1903((byte) 98);
            arg3.field403 = arg4.method1894(255);
            arg3.field382 = arg4.method1918((byte) -74);
            arg3.field341 = var15 & 0x7FFF;
            arg3.field384 = (var15 & 0x8000) != 0;
            arg3.field325 = class180.field2734 + arg3.field403 + arg3.field341;
        }
        if ((arg2 & 0x100) != 0) {
            arg3.field350 = arg4.method1879(30669);
            if (arg3.field350.charAt(0) == '~') {
                arg3.field350 = arg3.field350.substring(1);
                class64.method569(2, 2, arg3.field350, 0, arg3.method561(13762, true), arg3.method555(false, (byte) -120));
            } else if (class95.field1558 == arg3) {
                class64.method569(2, 2, arg3.field350, 0, arg3.method561(13762, true), arg3.method555(false, (byte) -84));
            }
            arg3.field362 = 0;
            arg3.field326 = 0;
            arg3.field344 = 150;
        }
        if ((arg2 & 0x4) != 0) {
            class133.field2063[arg0] = arg4.method1899((byte) -88);
        }
        if ((arg2 & 0x40) != 0) {
            int var16 = arg4.method1891(false);
            int var17 = arg4.method1918((byte) -124);
            arg3.method181(126, class180.field2734, var16, var17);
            arg3.field336 = class180.field2734 + 300;
            arg3.field354 = arg4.method1861((byte) 111);
        }
        if ((arg2 & 0x10000) != 0) {
            arg3.field356 = arg4.method1899((byte) 53);
            arg3.field315 = arg4.method1922((byte) 125);
            arg3.field368 = arg4.method1884((byte) -128);
            arg3.field397 = (byte) arg4.method1864(16698);
            arg3.field309 = class180.field2734 + arg4.method1888((byte) 103);
            arg3.field364 = class180.field2734 + arg4.method1868(0);
        }
        if ((arg2 & 0x1) != 0) {
            int var18 = arg4.method1903((byte) -127);
            int var19 = arg4.method1894(255);
            int var20 = arg4.method1861((byte) 111);
            int var21 = arg4.field4333;
            boolean var22 = (var18 & 0x8000) != 0;
            if (arg3.field1094 != null && arg3.field1060 != null) {
                boolean var23 = false;
                if (var19 <= 1) {
                    if (!var22 && !(!class170.field2554 || class101.field1622) || class72.field1209) {
                        var23 = true;
                    } else if (class13.method109(true, arg3.field1094)) {
                        var23 = true;
                    }
                }
                if (!var23 && class524.field7704 == 0) {
                    class192.field2814.field4333 = 0;
                    arg4.method1871(0, var20, class192.field2814.field4326, true);
                    class192.field2814.field4333 = 0;
                    int var24 = -1;
                    String var25;
                    if (var22) {
                        var18 &= 0x7FFF;
                        class274 var26 = class210.method1396(class192.field2814, (byte) 64);
                        var24 = var26.field3959;
                        var25 = var26.field3953.method3010(class192.field2814, false);
                    } else {
                        var25 = class342.method2234(true, class105.method794(-106, class192.field2814));
                    }
                    arg3.field350 = var25.trim();
                    arg3.field326 = var18 & 0xFF;
                    arg3.field344 = 150;
                    arg3.field362 = var18 >> 8;
                    int var27;
                    if (var19 == 1 || var19 == 2) {
                        var27 = var22 ? 17 : 1;
                    } else {
                        var27 = var22 ? 17 : 2;
                    }
                    if (var19 == 2) {
                        class160.method1154(-10444, "<img=1>" + arg3.method561(13762, true), var24, "<img=1>" + arg3.method555(false, (byte) -89), 0, null, var25, var27);
                    } else if (var19 == 1) {
                        class160.method1154(-10444, "<img=0>" + arg3.method561(13762, true), var24, "<img=0>" + arg3.method555(false, (byte) -83), 0, null, var25, var27);
                    } else {
                        class160.method1154(-10444, arg3.method561(13762, true), var24, arg3.method555(false, (byte) -70), 0, null, var25, var27);
                    }
                }
            }
            arg4.field4333 = var20 + var21;
        }
        if ((arg2 & 0x40000) != 0) {
            int var28 = arg4.method1864(16698);
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = arg4.method1868(0);
                if (var33 == 65535) {
                    var33 = -1;
                }
                var29[var32] = var33;
                var30[var32] = arg4.method1864(16698);
                var31[var32] = arg4.method1869((byte) -113);
            }
            class211.method1409(var30, var29, var31, arg3, (byte) 69);
        }
        if ((arg2 & 0x1000) != 0) {
            arg3.field1102 = arg4.method1864(16698) == 1;
        }
        if ((arg2 & 0x200) != 0) {
            int var34 = arg4.method1903((byte) 119);
            int var35 = arg4.method1870(-1945262512);
            if (var34 == 65535) {
                var34 = -1;
            }
            int var36 = arg4.method1864(16698);
            arg3.method185(var34, var35, var36, false, false);
        }
        if ((arg2 & 0x80) != 0) {
            arg3.field1084 = arg4.method1869((byte) -115);
            if (arg3.field412 == 0) {
                arg3.method187(arg3.field1084, 0);
                arg3.field1084 = -1;
            }
        }
        if ((arg2 & 0x20000) != 0) {
            int var37 = arg4.method1903((byte) -124);
            int var38 = arg4.method1898(113);
            if (var37 == 65535) {
                var37 = -1;
            }
            int var39 = arg4.method1864(16698);
            arg3.method185(var37, var38, var39, true, false);
        }
        if (!arg3.field1066) {
            return;
        }
        if (var5 == 127) {
            arg3.method552(0, arg3.field1070, arg3.field1080);
            return;
        }
        byte var40;
        if (var5 == -1) {
            var40 = class133.field2063[arg0];
        } else {
            var40 = var5;
        }
        arg3.method550(arg3.field1080, -5039, arg3.field1070, var40);
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)Z", line = 456)
    public final boolean method3145(int arg0) {
        field7818++;
        if (arg0 != -2) {
            method3139(50);
        }
        return (this.field7824 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILbo;III)V", line = 469)
    public static final void method3146(int arg0, class510 arg1, int arg2, int arg3, int arg4) {
        field7820++;
        if (arg2 < 87) {
            field7825 = 67;
        }
        for (class81 var5 = (class81) class278.field4007.method2257((byte) 112); var5 != null; var5 = (class81) class278.field4007.method2256(-121)) {
            if (var5.field1340 == arg0 && (arg3 << 7) == var5.field1332 && arg4 << 7 == var5.field1342 && var5.field1331.field7483 == arg1.field7483) {
                if (var5.field1337 != null) {
                    class124.field1920.method232(var5.field1337);
                    var5.field1337 = null;
                }
                if (var5.field1329 != null) {
                    class124.field1920.method232(var5.field1329);
                    var5.field1329 = null;
                }
                var5.method2663(-108);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)Z", line = 517)
    public final boolean method3147(byte arg0) {
        field7815++;
        if (arg0 > -97) {
            return false;
        } else {
            return (this.field7824 & 0x4) != 0;
        }
    }
}
