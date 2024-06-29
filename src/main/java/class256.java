import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class256 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lmh;")
    private static class128 field4401 = class22.method156(123, "Loading sprites )2 ");

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lmh;")
    public static class128 field4400 = field4401;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Z")
    public static boolean field4405 = false;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lnm;")
    public static class176 field4398 = class210.method1446((byte) 58);

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[Z")
    public static boolean[] field4406 = new boolean[200];

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lmh;")
    public static class128 field4407 = class22.method156(126, ":allyreq:");

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Lmh;")
    public static class128 field4408 = class22.method156(125, "Okay");

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIILcf;)V", line = 9)
    public static final void method1803(byte arg0, int arg1, int arg2, class123 arg3) {
        if (arg0 < 26) {
            field4405 = false;
        }
        if ((arg1 & 0x200) != 0) {
            int var4 = class54.field1051.method1327(-128);
            int var5 = class54.field1051.method1318(-123);
            arg3.method129(class293.field5011, var5, var4, true);
        }
        if ((arg1 & 0x4) != 0) {
            arg3.field458 = class54.field1051.method1308(-113);
            if (arg3.field458 == 65535) {
                arg3.field458 = -1;
            }
        }
        field4403++;
        if ((arg1 & 0x20) != 0) {
            int var6 = class54.field1051.method1308(-101);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class54.field1051.method1325(7627);
            class159.method1055(var6, arg3, 17446, var7);
        }
        if ((arg1 & 0x80) != 0) {
            arg3.field462 = class54.field1051.method1319(1);
            if (arg3.field462.method828((byte) 48, 0) == 126) {
                arg3.field462 = arg3.field462.method829(1, (byte) 120);
                class212.method1456(arg3.field462, 1, arg3.method753(-68), 2);
            } else if (class163.field2796 == arg3) {
                class212.method1456(arg3.field462, 1, arg3.method753(-104), 2);
            }
            arg3.field465 = 0;
            arg3.field473 = 0;
            arg3.field471 = 150;
        }
        if ((arg1 & 0x10) != 0) {
            int var8 = class54.field1051.method1330(true);
            int var9 = class54.field1051.method1322(-31669);
            int var10 = class54.field1051.method1325(7627);
            boolean var11 = (var8 & 0x8000) != 0;
            int var12 = class54.field1051.field3380;
            if (arg3.field2079 != null && arg3.field2078 != null) {
                long var13 = arg3.field2079.method819((byte) 94);
                boolean var15 = false;
                if (var9 <= 1) {
                    if (!var11 && class191.field3311 == 1 || class208.field3681 == 1) {
                        var15 = true;
                    } else {
                        for (int var16 = 0; var16 < class218.field3847; var16++) {
                            if (class208.field3646[var16] == var13) {
                                var15 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var15 && class57.field1101 == 0) {
                    class30.field671.field3380 = 0;
                    class54.field1051.method1348((byte) -52, var10, class30.field671.field3417, 0);
                    class30.field671.field3380 = 0;
                    int var17 = -1;
                    class128 var18;
                    if (var11) {
                        var8 &= 0x7FFF;
                        class94 var19 = class145.method974(38, class30.field671);
                        var17 = var19.field1592;
                        var18 = var19.field1590.method324(true, class30.field671);
                    } else {
                        var18 = class305.method2066(class279.method1948((byte) 100, class30.field671).method856(64));
                    }
                    arg3.field462 = var18.method832(-1);
                    arg3.field471 = 150;
                    arg3.field473 = var8 & 0xFF;
                    arg3.field465 = var8 >> 8;
                    if (var9 == 2) {
                        class107.method657(false, var18, (class128) null, var17, var11 ? 17 : 1, class28.method177((byte) -93, new class128[] { class11.field381, arg3.method753(-52) }));
                    } else if (var9 == 1) {
                        class107.method657(false, var18, (class128) null, var17, var11 ? 17 : 1, class28.method177((byte) -109, new class128[] { class103.field1765, arg3.method753(-94) }));
                    } else {
                        class107.method657(false, var18, (class128) null, var17, var11 ? 17 : 2, arg3.method753(-124));
                    }
                }
            }
            class54.field1051.field3380 = var10 + var12;
        }
        if ((arg1 & 0x100) != 0) {
            arg3.field421 = class54.field1051.method1325(7627);
            arg3.field440 = class54.field1051.method1325(7627);
            arg3.field412 = class54.field1051.method1318(-121);
            arg3.field472 = class54.field1051.method1325(7627);
            arg3.field426 = class54.field1051.method1330(true) + class293.field5011;
            arg3.field447 = class54.field1051.method1330(true) + class293.field5011;
            arg3.field413 = class54.field1051.method1318(-85);
            arg3.field414 = 1;
            arg3.field442 = 0;
        }
        if ((arg1 & 0x8) != 0) {
            int var20 = class54.field1051.method1322(-31669);
            byte[] var21 = new byte[var20];
            class194 var22 = new class194(var21);
            class54.field1051.method1348((byte) -77, var20, var21, 0);
            class303.field5137[arg2] = var22;
            arg3.method754(var22, (byte) 101);
        }
        if ((arg1 & 0x40) != 0) {
            int var23 = class54.field1051.method1327(-77);
            int var24 = class54.field1051.method1318(-80);
            arg3.method129(class293.field5011, var24, var23, true);
            arg3.field437 = class293.field5011 + 300;
            arg3.field429 = class54.field1051.method1322(-31669);
        }
        if ((arg1 & 0x1) != 0) {
            arg3.field479 = class54.field1051.method1331(28057);
            arg3.field432 = class54.field1051.method1308(-118);
        }
        if ((arg1 & 0x400) == 0) {
            return;
        }
        arg3.field416 = class54.field1051.method1308(-68);
        int var25 = class54.field1051.method1323(4376);
        arg3.field475 = 0;
        arg3.field427 = 0;
        arg3.field456 = (var25 & 0xFFFF) + class293.field5011;
        arg3.field466 = var25 >> 16;
        if (class293.field5011 < arg3.field456) {
            arg3.field475 = -1;
        }
        if (arg3.field416 == 65535) {
            arg3.field416 = -1;
        }
        if (arg3.field416 == -1 || class293.field5011 != arg3.field456) {
            return;
        }
        int var26 = class169.method1134(2, arg3.field416).field2303;
        if (var26 != -1) {
            class1 var27 = class167.method1091(71, var26);
            if (var27 != null && var27.field8 != null) {
                class171.method1143(arg3.field418, 120, var27, class163.field2796 == arg3, 0, arg3.field478);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([Ljava/lang/Object;[IB)V", line = 247)
    public static final void method1804(Object[] arg0, int[] arg1, byte arg2) {
        class69.method462(arg1.length - 1, (byte) -118, arg1, arg0, 0);
        if (arg2 <= -69) {
            field4402++;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V", line = 275)
    public static final void method1805(boolean arg0) {
        field4404++;
        class22.field553 = (byte[][][]) null;
        class4.field80 = (int[][][]) null;
        class176.field3101 = null;
        class314.field5316 = null;
        class7.field145 = null;
        class252.field4355 = (byte[][][]) null;
        class183.field3205 = null;
        class159.field2727 = null;
        class121.field2048 = (byte[][][]) null;
        class157.field2694 = (byte[][][]) null;
        if (!arg0) {
            class9.field205 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 296)
    public static void method1806(int arg0) {
        field4406 = null;
        if (arg0 != 0) {
            method1804((Object[]) null, (int[]) null, (byte) -105);
        }
        field4400 = null;
        field4401 = null;
        field4407 = null;
        field4408 = null;
        field4398 = null;
    }
}
