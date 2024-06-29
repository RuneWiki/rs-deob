import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class class314 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public int field4912;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public int field4913;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public int field4919;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "J")
    public static long field4915;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IJ)V", line = 6)
    public static final void method2157(int arg0, long arg1) {
        field4921++;
        if ((long) arg0 == arg1) {
            return;
        }
        if (class169.field2631 >= 100) {
            class252.method1782(class305.field4779, 0, "", false);
            return;
        }
        String var3 = class259.method1835((byte) 127, arg1);
        for (int var4 = 0; var4 < class169.field2631; var4++) {
            if (class298.field4712[var4] == arg1) {
                class252.method1782(var3 + class102.field1724, 0, "", false);
                return;
            }
        }
        for (int var5 = 0; var5 < class319.field4971; var5++) {
            if (class110.field1824[var5] == arg1) {
                class252.method1782(class77.field1180 + var3 + class280.field4328, 0, "", false);
                return;
            }
        }
        if (var3.equals(class19.field356.field494)) {
            class252.method1782(class210.field3351, 0, "", false);
            return;
        }
        class298.field4712[class169.field2631] = arg1;
        class305.field4777++;
        class71.field1121[class169.field2631++] = class327.method2242((byte) 92, arg1);
        class169.field2625 = class200.field3157;
        class269.field4191.method246(false, 73);
        class269.field4191.method760(arg1, true);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIIB)V", line = 67)
    public static final void method2158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 != 37) {
            return;
        }
        field4924++;
        if (arg2 == arg6) {
            class242.method1717(arg2, arg4, (byte) -128, arg5, arg0, arg1, arg3);
        } else if (class319.field4965 <= arg1 - arg2 && class116.field1888 >= (arg1 + arg2) && (arg3 - arg6) >= class188.field2995 && class195.field3108 >= arg3 + arg6) {
            class151.method1156(arg4, arg1, true, arg0, arg3, arg6, arg2, arg5);
        } else {
            class108.method826((byte) -7, arg2, arg6, arg0, arg1, arg5, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)Z", line = 92)
    public final boolean method2159(boolean arg0) {
        if (!arg0) {
            method2162(true, false, (class292) null);
        }
        field4923++;
        return (this.field4919 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)Z", line = 104)
    public final boolean method2160(boolean arg0) {
        if (arg0) {
            field4915 = -49L;
        }
        field4922++;
        return (this.field4919 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Z", line = 125)
    public final boolean method2161(int arg0) {
        if (arg0 > -127) {
            return false;
        } else {
            field4916++;
            return (this.field4919 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZZLob;)V", line = 138)
    public static final void method2162(boolean arg0, boolean arg1, class292 arg2) {
        field4920++;
        int var3 = arg2.field4533 == 0 ? arg2.field4608 : arg2.field4533;
        int var4 = arg2.field4465 == 0 ? arg2.field4499 : arg2.field4465;
        class323.method2205(arg2.field4531, arg0, class207.field3269[arg2.field4531 >> 16], var4, 8596, var3);
        if (arg2.field4553 != null) {
            class323.method2205(arg2.field4531, arg0, arg2.field4553, var4, 8596, var3);
        }
        if (!arg1) {
            class224 var5 = (class224) class268.field4148.method833(arg1, (long) arg2.field4531);
            if (var5 != null) {
                class162.method1201(var4, var5.field3596, arg0, -1, var3);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)Z", line = 162)
    public final boolean method2163(int arg0) {
        if (arg0 > -27) {
            return false;
        } else {
            field4917++;
            return (this.field4919 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILsj;IIIII)V", line = 176)
    public static final void method2164(int arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4918++;
        long var7 = 0L;
        if (arg6 == 0) {
            var7 = class70.method540(arg3, arg4, arg0);
        } else if (arg6 == 1) {
            var7 = class191.method1415(arg3, arg4, arg0);
        } else if (arg6 == 2) {
            var7 = class103.method799(arg3, arg4, arg0);
        } else if (arg6 == 3) {
            var7 = class34.method239(arg3, arg4, arg0);
        }
        int var10 = ((int) var7 & 0x3816A2) >> 20;
        boolean var11 = true;
        int var12 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class6 var13 = class28.method190(6, var12);
        if (var13.method35(81)) {
            class175.method1308(arg3, arg0, var13, 100, arg4);
        }
        boolean var14 = false;
        int var15 = ((int) var7 & 0x7D6E9) >> 14;
        if (var7 == 0L) {
            return;
        }
        class320 var16 = null;
        class320 var17 = null;
        if (arg6 == 0) {
            class189 var21 = class310.method2144(arg3, arg4, arg0);
            if (var21 != null) {
                var16 = var21.field2996;
                var17 = var21.field2998;
            }
            if (var13.field86 != 0) {
                arg1.method420(var15, arg0, var10, var13.field105, arg5 ^ 0x76, arg4);
            }
        } else if (arg6 == 1) {
            class114 var20 = class324.method2213(arg3, arg4, arg0);
            if (var20 != null) {
                var16 = var20.field1863;
                var17 = var20.field1860;
            }
        } else if (arg6 == 2) {
            class45 var18 = class43.method351(arg3, arg4, arg0);
            if (var18 != null) {
                var16 = var18.field782;
            }
            if (var13.field86 != 0 && arg4 + var13.field63 < 104 && (var13.field63 + arg0) < 104 && (var13.field90 + arg4) < 104 && (arg0 + var13.field90) < 104) {
                arg1.method418(var13.field63, var10, var13.field105, arg4, -117, arg0, var13.field90);
            }
        } else if (arg6 == 3) {
            class87 var19 = class300.method2090(arg3, arg4, arg0);
            if (var19 != null) {
                var16 = var19.field1325;
            }
            if (var13.field86 == 1) {
                arg1.method421(arg4, arg0, 108);
            }
        }
        if (!class265.field4126 || !var13.field51) {
            return;
        }
        if (var15 == 2) {
            if (var16 instanceof class258) {
                ((class258) var16).method1821(2028636436);
            } else {
                class213.method1546(arg2, var13, var15, var10 + 4, arg4, 0, 0, true, arg0);
            }
            if ((var17 instanceof class258)) {
                ((class258) var17).method1821(arg5 ^ 0x78EA8914);
            } else {
                class213.method1546(arg2, var13, var15, var10 + 1 & 0x3, arg4, 0, 0, true, arg0);
            }
        } else if (var15 == 5) {
            if (var16 instanceof class258) {
                ((class258) var16).method1821(2028636436);
            } else {
                class213.method1546(arg2, var13, 4, var10, arg4, class99.field1639[var10] * 8, class292.field4558[var10] * 8, true, arg0);
            }
        } else if (var15 == 6) {
            if ((var16 instanceof class258)) {
                ((class258) var16).method1821(2028636436);
            } else {
                class213.method1546(arg2, var13, 4, var10 + 4, arg4, class65.field1066[var10] * 8, class260.field4040[var10] * 8, true, arg0);
            }
        } else if (var15 == 7) {
            if ((var16 instanceof class258)) {
                ((class258) var16).method1821(2028636436);
            } else {
                class213.method1546(arg2, var13, 4, (var10 + 2 & 0x3) + 4, arg4, 0, 0, true, arg0);
            }
        } else if (var15 == 8) {
            if ((var16 instanceof class258)) {
                ((class258) var16).method1821(2028636436);
            } else {
                class213.method1546(arg2, var13, 4, var10 + 4, arg4, class65.field1066[var10] * 8, class260.field4040[var10] * 8, true, arg0);
            }
            if (var17 instanceof class258) {
                ((class258) var17).method1821(arg5 ^ 0x78EA8914);
            } else {
                class213.method1546(arg2, var13, 4, (var10 + 2 & 0x3) + 4, arg4, class65.field1066[var10] * 8, class260.field4040[var10] * 8, true, arg0);
            }
        } else if (var15 == 11) {
            if (var16 instanceof class258) {
                ((class258) var16).method1821(2028636436);
            } else {
                class213.method1546(arg2, var13, 10, var10 + 4, arg4, 0, 0, true, arg0);
            }
        } else if ((var16 instanceof class258)) {
            ((class258) var16).method1821(2028636436);
        } else {
            class213.method1546(arg2, var13, var15, var10, arg4, 0, 0, true, arg0);
        }
    }
}
