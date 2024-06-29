import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class46 {

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Lnf;")
    public static class162 field769 = new class162(64);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static final void method388(int arg0) {
        field767++;
        class176.field2716++;
        int var1 = -100 % ((27 - arg0) / 51);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public static void method389(int arg0) {
        if (arg0 != -104) {
            method391(-87, (class92) null, (class92) null, true, (class12) null);
        }
        field769 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[Lai;Z[BIIIIII)V")
    public static final void method390(int arg0, int arg1, class89[] arg2, boolean arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field768++;
        if (arg10 >= -87) {
            field769 = null;
        }
        int var11 = -1;
        class31 var12 = new class31(arg4);
        while (true) {
            int var13 = var12.method298(85);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method276((byte) 33);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var12.method265(-104);
                int var17 = var16 >> 2;
                int var18 = var14 >> 12;
                int var19 = var14 & 0x3F;
                int var20 = var16 & 0x3;
                int var21 = (var14 & 0xFDB) >> 6;
                if (arg0 == var18 && arg6 <= var21 && var21 < (arg6 + 8) && arg5 <= var19 && (arg5 + 8) > var19) {
                    class295 var22 = class166.method1209(-28, var11);
                    int var23 = arg1 + class47.method397(var22.field4592, var21 & 0x7, var20, arg7, var22.field4620, 90, var19 & 0x7);
                    int var24 = class115.method850(var22.field4620, var21 & 0x7, var22.field4592, (byte) 115, var19 & 0x7, arg7, var20) + arg8;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class89 var25 = null;
                        if (!arg3) {
                            int var26 = arg9;
                            if ((client.field2390[1][var23][var24] & 0x2) == 2) {
                                var26 = arg9 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg2[var26];
                            }
                        }
                        class219.method1505(var25, var11, var23, arg3, var24, var17, (byte) 101, arg9, arg7 + var20 & 0x3, arg9, !arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILub;Lub;ZLfg;)V")
    public static final void method391(int arg0, class92 arg1, class92 arg2, boolean arg3, class12 arg4) {
        class237.field3745 = arg3;
        class114.field1757 = arg1;
        field765++;
        class265.field4191 = arg2;
        int var5 = class114.field1757.method704(0) - 1;
        class159.field2373 = var5 * 256 + class114.field1757.method700((byte) -105, var5);
        class106.field1661 = arg4;
        class128.field1915 = new String[] { null, null, null, null, class63.field995 };
        if (arg0 < 125) {
            field769 = null;
        }
        class278.field4414 = new String[] { null, null, class174.field2678, null, null };
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([I[I[IILfh;)V")
    public static final void method392(int[] arg0, int[] arg1, int[] arg2, int arg3, class136 arg4) {
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            int var9 = arg0[var5];
            for (int var10 = 0; var9 != 0 && arg4.field4710.length > var10; var10++) {
                if ((var9 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg4.field4710[var10] = null;
                    } else {
                        class103 var11 = class250.method1700(var7, -103);
                        class234 var12 = arg4.field4710[var10];
                        int var13 = var11.field1604;
                        if (var12 != null) {
                            if (var12.field3696 == var7) {
                                if (var13 == 0) {
                                    var12 = arg4.field4710[var10] = null;
                                } else if (var13 == 1) {
                                    var12.field3698 = var8;
                                    var12.field3702 = 0;
                                    var12.field3699 = 0;
                                    var12.field3695 = 1;
                                    var12.field3701 = 0;
                                    class136.method1004(arg4.field4725, 0, arg4.field4709, var11, 255, class263.field4168 == arg4);
                                } else if (var13 == 2) {
                                    var12.field3702 = 0;
                                }
                            } else if (var11.field1589 >= class250.method1700(var12.field3696, -83).field1589) {
                                var12 = arg4.field4710[var10] = null;
                            }
                        }
                        if (var12 == null) {
                            class234 var14 = arg4.field4710[var10] = new class234();
                            var14.field3702 = 0;
                            var14.field3699 = 0;
                            var14.field3701 = 0;
                            var14.field3696 = var7;
                            var14.field3698 = var8;
                            var14.field3695 = 1;
                            class136.method1004(arg4.field4725, 0, arg4.field4709, var11, 255, class263.field4168 == arg4);
                        }
                    }
                }
                var9 >>>= 0x1;
            }
        }
        field772++;
        int var6 = 103 / ((-arg3 - 52) / 60);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
    public static final void method393(int arg0, int arg1, int arg2) {
        class254.field4062++;
        field771++;
        if (arg0 != 9255) {
            field766 = -21;
        }
        class240.field3826.method1762(127, true);
        class240.field3826.method257(770601592, arg2);
        class240.field3826.method264(-122, arg1);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZILub;)Lr;")
    public static final class42 method394(boolean arg0, int arg1, class92 arg2) {
        field770++;
        if (!arg0) {
            method388(20);
        }
        byte[] var3 = arg2.method722(10560, arg1);
        return var3 == null ? null : new class42(var3);
    }
}
