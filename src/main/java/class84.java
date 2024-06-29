import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class84 {

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field1446 = 0;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Lhb;")
    public static class164 field1445 = new class164(new byte[5000]);

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Lph;")
    public static class229 field1449 = class266.method1858("Poser", 0);

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Ljl;")
    public static class61 field1441;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "[[[B")
    public static byte[][][] field1451;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILoi;IIIII)V", line = 8)
    public static final void method621(int arg0, class108 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1443++;
        long var7 = 0L;
        boolean var9 = true;
        if (arg5 == 0) {
            var7 = class321.method2178(arg4, arg2, arg6);
        } else if (arg5 == 1) {
            var7 = class287.method1971(arg4, arg2, arg6);
        } else if (arg5 == 2) {
            var7 = class281.method1937(arg4, arg2, arg6);
        } else if (arg5 == 3) {
            var7 = class146.method1072(arg4, arg2, arg6);
        }
        int var10 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        boolean var11 = false;
        int var12 = (int) var7 >> 14 & 0x1F;
        class83 var13 = class260.method1807(false, var10);
        boolean var14 = false;
        int var15 = (int) var7 >> 20 & 0x3;
        if (var13.method606((byte) -122)) {
            class43.method327(1, var13, arg4, arg6, arg2);
        }
        if (var7 != 0L) {
            class216 var16 = null;
            class216 var17 = null;
            if (arg5 == 0) {
                class207 var21 = class296.method2005(arg4, arg2, arg6);
                if (var21 != null) {
                    var16 = var21.field3403;
                    var17 = var21.field3416;
                }
                if (var13.field1378 != 0) {
                    arg1.method831(var15, arg6, var12, arg2, var13.field1430, true);
                }
            } else if (arg5 == 1) {
                class88 var20 = class75.method574(arg4, arg2, arg6);
                if (var20 != null) {
                    var16 = var20.field1489;
                    var17 = var20.field1494;
                }
            } else if (arg5 == 2) {
                class152 var18 = class245.method1704(arg4, arg2, arg6);
                if (var18 != null) {
                    var17 = var18.field2461;
                }
                if (var13.field1378 != 0 && (arg2 + var13.field1434) < 104 && arg6 + var13.field1434 < 104 && (var13.field1424 + arg2) < 104 && var13.field1424 + arg6 < 104) {
                    arg1.method811(arg2, var13.field1424, arg6, var13.field1434, var15, (byte) -44, var13.field1430);
                }
            } else if (arg5 == 3) {
                class162 var19 = class187.method1314(arg4, arg2, arg6);
                if (var19 != null) {
                    var17 = var19.field2607;
                }
                if (var13.field1378 == 1) {
                    arg1.method822(arg6, arg2, (byte) 127);
                }
            }
            if (class99.field1675 && var13.field1388) {
                if (var12 == 2) {
                    if ((var17 instanceof class27)) {
                        ((class27) var17).method180((byte) 102);
                    } else {
                        class105.method802(var15 + 4, 0, 1548233894, var12, arg2, arg6, arg3, var13, 0);
                    }
                    if (var16 instanceof class27) {
                        ((class27) var16).method180((byte) 126);
                    } else {
                        class105.method802(var15 + 1 & 0x3, 0, 1548233894, var12, arg2, arg6, arg3, var13, 0);
                    }
                } else if (var12 == 5) {
                    if (var17 instanceof class27) {
                        ((class27) var17).method180((byte) 120);
                    } else {
                        class105.method802(var15, class113.field1926[var15] * 8, 1548233894, 4, arg2, arg6, arg3, var13, class266.field4488[var15] * 8);
                    }
                } else if (var12 == 6) {
                    if ((var17 instanceof class27)) {
                        ((class27) var17).method180((byte) 71);
                    } else {
                        class105.method802(var15 + 4, class323.field5508[var15] * 8, 1548233894, 4, arg2, arg6, arg3, var13, class259.field4314[var15] * 8);
                    }
                } else if (var12 == 7) {
                    if (var17 instanceof class27) {
                        ((class27) var17).method180((byte) 75);
                    } else {
                        class105.method802((var15 + 2 & 0x3) + 4, 0, 1548233894, 4, arg2, arg6, arg3, var13, 0);
                    }
                } else if (var12 == 8) {
                    if (var17 instanceof class27) {
                        ((class27) var17).method180((byte) 116);
                    } else {
                        class105.method802(var15 + 4, class323.field5508[var15] * 8, 1548233894, 4, arg2, arg6, arg3, var13, class259.field4314[var15] * 8);
                    }
                    if ((var16 instanceof class27)) {
                        ((class27) var16).method180((byte) 80);
                    } else {
                        class105.method802((var15 + 2 & 0x3) + 4, class323.field5508[var15] * 8, 1548233894, 4, arg2, arg6, arg3, var13, class259.field4314[var15] * 8);
                    }
                } else if (var12 == 11) {
                    if (var17 instanceof class27) {
                        ((class27) var17).method180((byte) 68);
                    } else {
                        class105.method802(var15 + 4, 0, 1548233894, 10, arg2, arg6, arg3, var13, 0);
                    }
                } else if ((var17 instanceof class27)) {
                    ((class27) var17).method180((byte) 118);
                } else {
                    class105.method802(var15, 0, 1548233894, var12, arg2, arg6, arg3, var13, 0);
                }
            }
        }
        if (arg0 < 40) {
            method624(true, -33, 38);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V", line = 203)
    public static void method622(boolean arg0) {
        field1451 = (byte[][][]) null;
        field1441 = null;
        field1445 = null;
        field1449 = null;
        if (!arg0) {
            method624(true, -49, -48);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLhb;)Lph;", line = 218)
    public static final class229 method623(byte arg0, class164 arg1) {
        field1444++;
        if (arg0 != 47) {
            field1451 = (byte[][][]) ((byte[][][]) null);
        }
        return class164.method1185(arg1, 32767, false);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZII)Z", line = 244)
    public static final boolean method624(boolean arg0, int arg1, int arg2) {
        field1442++;
        if (arg0) {
            field1446 = -113;
        }
        return (arg1 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V", line = 259)
    public static final void method625(int arg0, int arg1, int arg2) {
        field1448++;
        class281 var3 = class135.method957(0, arg0, 1);
        var3.method1932(arg2 ^ arg2);
        var3.field4660 = arg1;
    }
}
