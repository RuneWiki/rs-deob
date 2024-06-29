import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class62 extends class217 {

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "Ljb;")
    public class24 field1170;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "J")
    public static long field1175 = 0L;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "Llc;")
    private static class143 field1180 = class66.method374("glow1:", -1);

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "Llc;")
    public static class143 field1177 = field1180;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "Llc;")
    public static class143 field1178 = class66.method374("unzap", -1);

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "Llc;")
    public static class143 field1168 = field1180;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BZ)V")
    public static final void method350(byte arg0, boolean arg1) {
        field1174++;
        if (arg0 > -109) {
            method357(false, 20, (class106[]) null, 27, 0, -76, (byte[]) null, -31, -47, -43, 72);
        }
        for (int var2 = 0; var2 < class212.field3945; var2++) {
            class187 var3 = class259.field4648[class56.field1093[var2]];
            long var4 = (long) class56.field1093[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method217(false) && var3.field3384.field1569 == arg1 && var3.field3384.method490(74)) {
                int var6 = var3.field4108 >> 7;
                int var7 = var3.field4178 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.method218((byte) 126) == 1 && (var3.field4178 & 0x7F) == 64 && (var3.field4108 & 0x7F) == 64) {
                        if (class68.field1306[var7][var6] == class141.field2460) {
                            continue;
                        }
                        class68.field1306[var7][var6] = class141.field2460;
                    }
                    if (!var3.field3384.field1518) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field4127 = class20.method140(var3.field4178, 125, var3.field4108, class170.field3044);
                    class185.method1208(class170.field3044, var3.field4178, var3.field4108, var3.field4127, (var3.method218((byte) -128) - 1) * 64 + 60, var3, var3.field4183, var4, var3.field4123);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V")
    public static void method351(int arg0) {
        field1180 = null;
        field1168 = null;
        field1178 = null;
        if (arg0 <= 116) {
            field1180 = null;
        }
        field1177 = null;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljb;)V")
    public class62(class24 arg0) {
        this.field1170 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)I")
    public static final int method352(int arg0, int arg1) {
        if (arg1 != 31635) {
            field1177 = null;
        }
        field1169++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILgf;ZZLgf;)Lik;")
    public static final class225 method353(int arg0, class7 arg1, boolean arg2, boolean arg3, class7 arg4) {
        field1179++;
        int[] var5 = arg4.method43(arg0, (byte) -124);
        boolean var6 = arg2;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg4.method44(arg0, -1, var5[var7]);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg1.method44(0, -1, var9);
                } else {
                    var10 = arg1.method44(var9, -1, 0);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class225(arg4, arg1, arg0, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILh;)V")
    public static final void method354(int arg0, class190 arg1) {
        if (class29.field460 != null) {
            try {
                class29.field460.method1924(true, 0L);
                class29.field460.method1934(-1, 24, arg1.field3487, arg1.field3465);
            } catch (Exception var2) {
            }
        }
        arg1.field3487 += 24;
        field1172++;
        if (arg0 > -41) {
            field1167 = 96;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Llc;IZ)V")
    public static final void method355(class143 arg0, int arg1, boolean arg2) {
        field1173++;
        if (arg1 != -65) {
            return;
        }
        if (arg2) {
            try {
                class47.field921.getAppletContext().showDocument(arg0.method882(class47.field921.getCodeBase(), 0), "_blank");
            } catch (Exception var3) {
            }
        } else {
            try {
                class47.field921.getAppletContext().showDocument(arg0.method882(class47.field921.getCodeBase(), arg1 + 65), "_top");
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lgf;ILgf;)V")
    public static final void method356(class7 arg0, int arg1, class7 arg2) {
        if (arg1 != -23090) {
            method351(92);
        }
        class256.field4608 = class235.method1587(arg2, class149.field2744, (byte) 94, 0, arg0);
        class116.field2068 = (class213) class256.field4608;
        class134.field2341 = class235.method1587(arg2, class247.field4443, (byte) 65, 0, arg0);
        field1165++;
        class239.field4326 = class235.method1587(arg2, class155.field2799, (byte) 81, 0, arg0);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI[Llf;III[BIIII)V")
    public static final void method357(boolean arg0, int arg1, class106[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg8 != 63) {
            method354(123, (class190) null);
        }
        field1181++;
        class190 var11 = new class190(arg6);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1230(false);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1257((byte) 125);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFC4) >> 6;
                int var18 = var14 >> 12;
                int var19 = var11.method1265(127);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg10 == var18 && arg3 <= var17 && var17 < arg3 + 8 && var16 >= arg1 && arg1 + 8 > var16) {
                    class209 var22 = class34.method232(arg8 ^ 0x98, var12);
                    int var23 = class99.method587(1, var16 & 0x7, var21, var22.field3877, arg7, var17 & 0x7, var22.field3836) + arg5;
                    int var24 = class9.method73(var22.field3877, var22.field3836, Integer.MAX_VALUE, var16 & 0x7, var21, arg7, var17 & 0x7) + arg9;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class106 var25 = null;
                        if (!arg0) {
                            int var26 = arg4;
                            if ((class231.field4225[1][var23][var24] & 0x2) == 2) {
                                var26 = arg4 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg2[var26];
                            }
                        }
                        class129.method781(arg0, var24, arg4, var25, -29969, var23, var12, var20, var21 + arg7 & 0x3, arg4, !arg0);
                    }
                }
            }
        }
    }
}
