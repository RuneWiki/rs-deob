import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class326 extends class375 {

    @OriginalMember(owner = "client!oq", name = "I", descriptor = "I")
    public int field4825 = 12800;

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "I")
    public int field4818 = -1;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "I")
    public int field4811 = 0;

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "I")
    public int field4816 = -1;

    @OriginalMember(owner = "client!oq", name = "C", descriptor = "I")
    public int field4819 = 12800;

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "I")
    public int field4820 = 0;

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "Z")
    public boolean field4821 = true;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "Ljava/lang/String;")
    public String field4813;

    @OriginalMember(owner = "client!oq", name = "N", descriptor = "I")
    public int field4830;

    @OriginalMember(owner = "client!oq", name = "Q", descriptor = "Ljava/lang/String;")
    public String field4833;

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!oq", name = "O", descriptor = "Lwba;")
    public class46 field4831;

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "[I")
    public static int[] field4817 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!oq", name = "y", descriptor = "[I")
    public static int[] field4815 = new int[3];

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "[I")
    public static int[] field4810 = new int[1];

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!oq", name = "F", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!oq", name = "G", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!oq", name = "H", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!oq", name = "J", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!oq", name = "K", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!oq", name = "L", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!oq", name = "M", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!oq", name = "P", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLua;ILvg;IIILf;)V", line = 5)
    public static final void method2049(byte arg0, class617 arg1, int arg2, class49 arg3, int arg4, int arg5, int arg6, class702 arg7) {
        field4826++;
        if (arg7 == null) {
            return;
        }
        if (arg0 < 32) {
            field4817 = null;
        }
        int var8;
        if (class43.field700 == 4) {
            var8 = (int) class630.field8811 & 0x3FFF;
        } else {
            var8 = (int) class630.field8811 + class252.field3880 & 0x3FFF;
        }
        int var9 = Math.max(arg3.field967 / 2, arg3.field877 / 2) + 10;
        int var10 = arg2 * arg2 + arg6 * arg6;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class189.field2719[var8];
        int var12 = class189.field2721[var8];
        if (class43.field700 != 4) {
            var11 = var11 * 256 / (class287.field4280 + 256);
            var12 = var12 * 256 / (class287.field4280 + 256);
        }
        int var13 = arg2 * var12 + arg6 * var11 >> 14;
        int var14 = arg6 * var12 - arg2 * var11 >> 14;
        arg7.method933(arg5 + var13 + (arg3.field967 / 2) - arg7.method931() / 2, -var14 + arg4 - -(arg3.field877 / 2) + -(arg7.method936() / 2), arg1, arg5, arg4);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V", line = 48)
    public static void method2050(int arg0) {
        field4815 = null;
        field4810 = null;
        if (arg0 != 0) {
            field4817 = null;
        }
        field4817 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(III[I)Z", line = 65)
    public final boolean method2051(int arg0, int arg1, int arg2, int[] arg3) {
        field4832++;
        for (class394 var5 = (class394) this.field4831.method472((byte) -46); var5 != null; var5 = (class394) this.field4831.method482(arg1 + 128)) {
            if (var5.method2428(false, arg2, arg0)) {
                var5.method2430(arg3, arg0, arg2, -87);
                return true;
            }
        }
        if (arg1 != -1) {
            this.field4814 = 85;
        }
        return false;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lvq;I)V", line = 102)
    public static final void method2052(class425 arg0, int arg1) {
        if (arg0.field6226 != arg1) {
            class30 var2 = class188.field2708.method2140(arg0.field6226, arg1 ^ 0xFFFFFF84);
            if (var2 == null || var2.field456 == null) {
                arg0.field6230 = false;
                arg0.field6226 = -1;
            } else {
                label394: {
                    arg0.field6223++;
                    if (arg0.field6191 < var2.field456.length && var2.field450[arg0.field6191] < arg0.field6223) {
                        arg0.field6191++;
                        arg0.field6223 = 1;
                        arg0.field6207++;
                        class603.method3399(var2, arg0.field3024, arg0.field6191, class648.field9106 == arg0, arg1 - 96, arg0.field3029, arg0.field3019);
                    }
                    if (arg0.field6191 >= var2.field456.length) {
                        arg0.field6223 = 0;
                        arg0.field6191 = 0;
                        if (arg0.field6230) {
                            arg0.field6226 = arg0.method2544(2).method754(-1);
                            if (arg0.field6226 == -1) {
                                arg0.field6230 = false;
                                break label394;
                            }
                            var2 = class188.field2708.method2140(arg0.field6226, 126);
                        }
                        class603.method3399(var2, arg0.field3024, arg0.field6191, class648.field9106 == arg0, -67, arg0.field3029, arg0.field3019);
                    }
                    arg0.field6207 = arg0.field6191 + 1;
                    if (var2.field456.length <= arg0.field6207) {
                        arg0.field6207 = 0;
                    }
                }
            }
        }
        field4829++;
        if (arg0.field6227 != -1 && arg0.field6188 <= class564.field7962) {
            class309 var3 = class86.field1411.method1475((byte) -74, arg0.field6227);
            int var4 = var3.field4566;
            if (var4 == -1) {
                arg0.field6227 = -1;
            } else {
                label396: {
                    class30 var5 = class188.field2708.method2140(var4, 123);
                    if (var3.field4584) {
                        if (var5.field465 == 3) {
                            if (arg0.field6268 > 0 && arg0.field6169 <= class564.field7962 && arg0.field6203 < class564.field7962) {
                                arg0.field6227 = -1;
                                break label396;
                            }
                        } else if (var5.field465 == 1 && arg0.field6268 > 0 && class564.field7962 >= arg0.field6169 && arg0.field6203 < class564.field7962) {
                            arg0.field6188 = class564.field7962 + 1;
                            break label396;
                        }
                    }
                    if (var5 == null || var5.field456 == null) {
                        arg0.field6227 = -1;
                    } else {
                        if (arg0.field6192 < 0) {
                            arg0.field6192 = 0;
                            class603.method3399(var5, arg0.field3024, 0, class648.field9106 == arg0, -58, arg0.field3029, arg0.field3019);
                        }
                        arg0.field6193++;
                        if (arg0.field6192 < var5.field456.length && var5.field450[arg0.field6192] < arg0.field6193) {
                            arg0.field6193 = 1;
                            arg0.field6192++;
                            class603.method3399(var5, arg0.field3024, arg0.field6192, class648.field9106 == arg0, -101, arg0.field3029, arg0.field3019);
                        }
                        if (var5.field456.length <= arg0.field6192) {
                            if (var3.field4584) {
                                arg0.field6219++;
                                arg0.field6192 -= var5.field466;
                                if (arg0.field6219 >= var5.field460) {
                                    arg0.field6227 = -1;
                                } else if (arg0.field6192 >= 0 && arg0.field6192 < var5.field456.length) {
                                    class603.method3399(var5, arg0.field3024, arg0.field6192, class648.field9106 == arg0, arg1 - 104, arg0.field3029, arg0.field3019);
                                } else {
                                    arg0.field6227 = -1;
                                }
                            } else {
                                arg0.field6227 = -1;
                            }
                        }
                        arg0.field6164 = arg0.field6192 + 1;
                        if (var5.field456.length <= arg0.field6164) {
                            if (var3.field4584) {
                                arg0.field6164 -= var5.field466;
                                if (var5.field460 <= arg0.field6219 + 1) {
                                    arg0.field6164 = -1;
                                } else if (arg0.field6164 < 0 || arg0.field6164 >= var5.field456.length) {
                                    arg0.field6164 = -1;
                                }
                            } else {
                                arg0.field6164 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field6172 != -1 && class564.field7962 >= arg0.field6174) {
            class309 var6 = class86.field1411.method1475((byte) -74, arg0.field6172);
            int var7 = var6.field4566;
            if (var7 == -1) {
                arg0.field6172 = -1;
            } else {
                label400: {
                    class30 var8 = class188.field2708.method2140(var7, 125);
                    if (var6.field4584) {
                        if (var8.field465 == 3) {
                            if (arg0.field6268 > 0 && class564.field7962 >= arg0.field6169 && arg0.field6203 < class564.field7962) {
                                arg0.field6172 = -1;
                                break label400;
                            }
                        } else if (var8.field465 == 1 && arg0.field6268 > 0 && class564.field7962 >= arg0.field6169 && class564.field7962 > arg0.field6203) {
                            arg0.field6174 = class564.field7962 + 1;
                            break label400;
                        }
                    }
                    if (var8 == null || var8.field456 == null) {
                        arg0.field6172 = -1;
                    } else {
                        if (arg0.field6200 < 0) {
                            arg0.field6200 = 0;
                            class603.method3399(var8, arg0.field3024, 0, class648.field9106 == arg0, -65, arg0.field3029, arg0.field3019);
                        }
                        arg0.field6239++;
                        if (arg0.field6200 < var8.field456.length && var8.field450[arg0.field6200] < arg0.field6239) {
                            arg0.field6200++;
                            arg0.field6239 = 1;
                            class603.method3399(var8, arg0.field3024, arg0.field6200, class648.field9106 == arg0, arg1 ^ 0x6D, arg0.field3029, arg0.field3019);
                        }
                        if (var8.field456.length <= arg0.field6200) {
                            if (var6.field4584) {
                                arg0.field6200 -= var8.field466;
                                arg0.field6173++;
                                if (var8.field460 <= arg0.field6173) {
                                    arg0.field6172 = -1;
                                } else if (arg0.field6200 >= 0 && arg0.field6200 < var8.field456.length) {
                                    class603.method3399(var8, arg0.field3024, arg0.field6200, class648.field9106 == arg0, -82, arg0.field3029, arg0.field3019);
                                } else {
                                    arg0.field6172 = -1;
                                }
                            } else {
                                arg0.field6172 = -1;
                            }
                        }
                        arg0.field6250 = arg0.field6200 + 1;
                        if (arg0.field6250 >= var8.field456.length) {
                            if (var6.field4584) {
                                arg0.field6250 -= var8.field466;
                                if (var8.field460 <= arg0.field6173 + 1) {
                                    arg0.field6250 = -1;
                                } else if (arg0.field6250 < 0 || arg0.field6250 >= var8.field456.length) {
                                    arg0.field6250 = -1;
                                }
                            } else {
                                arg0.field6250 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field6218 != -1 && arg0.field6175 <= 1) {
            class30 var9 = class188.field2708.method2140(arg0.field6218, arg1 ^ 0xFFFFFF82);
            if (var9.field465 == 3) {
                if (arg0.field6268 > 0 && class564.field7962 >= arg0.field6169 && arg0.field6203 < class564.field7962) {
                    arg0.field6259 = null;
                    arg0.field6218 = -1;
                }
            } else if (var9.field465 == 1 && arg0.field6268 > 0 && class564.field7962 >= arg0.field6169 && arg0.field6203 < class564.field7962) {
                arg0.field6175 = 2;
            }
        }
        if (arg0.field6218 != -1 && arg0.field6175 == 0) {
            class30 var10 = class188.field2708.method2140(arg0.field6218, 127);
            if (var10 == null || var10.field456 == null) {
                arg0.field6218 = -1;
                arg0.field6259 = null;
            } else {
                arg0.field6251++;
                if (var10.field456.length > arg0.field6194 && arg0.field6251 > var10.field450[arg0.field6194]) {
                    arg0.field6194++;
                    arg0.field6251 = 1;
                    class603.method3399(var10, arg0.field3024, arg0.field6194, class648.field9106 == arg0, -99, arg0.field3029, arg0.field3019);
                }
                if (var10.field456.length <= arg0.field6194) {
                    arg0.field6194 -= var10.field466;
                    arg0.field6253++;
                    if (arg0.field6253 >= var10.field460) {
                        arg0.field6218 = -1;
                        arg0.field6259 = null;
                    } else if (arg0.field6194 >= 0 && var10.field456.length > arg0.field6194) {
                        class603.method3399(var10, arg0.field3024, arg0.field6194, class648.field9106 == arg0, arg1 ^ 0x3F, arg0.field3029, arg0.field3019);
                    } else {
                        arg0.field6218 = -1;
                        arg0.field6259 = null;
                    }
                }
                arg0.field6222 = arg0.field6194 + 1;
                if (arg0.field6222 >= var10.field456.length) {
                    arg0.field6222 -= var10.field466;
                    if (arg0.field6253 + 1 >= var10.field460) {
                        arg0.field6222 = -1;
                    } else if (arg0.field6222 < 0 || var10.field456.length <= arg0.field6222) {
                        arg0.field6222 = -1;
                    }
                }
            }
        }
        if (arg0.field6175 > 0) {
            arg0.field6175--;
        }
        for (int var11 = 0; var11 < arg0.field6229.length; var11++) {
            class300 var12 = arg0.field6229[var11];
            if (var12 != null) {
                if (var12.field4464 > 0) {
                    var12.field4464--;
                } else {
                    class30 var13 = class188.field2708.method2140(var12.field4466, 126);
                    if (var13 == null || var13.field456 == null) {
                        arg0.field6229[var11] = null;
                    } else {
                        var12.field4471++;
                        if (var13.field456.length > var12.field4465 && var12.field4471 > var13.field450[var12.field4465]) {
                            var12.field4465++;
                            var12.field4471 = 1;
                            class603.method3399(var13, arg0.field3024, var12.field4465, class648.field9106 == arg0, -127, arg0.field3029, arg0.field3019);
                        }
                        if (var13.field456.length <= var12.field4465) {
                            var12.field4474++;
                            var12.field4465 -= var13.field466;
                            if (var13.field460 <= var12.field4474) {
                                arg0.field6229[var11] = null;
                            } else if (var12.field4465 >= 0 && var13.field456.length > var12.field4465) {
                                class603.method3399(var13, arg0.field3024, var12.field4465, class648.field9106 == arg0, arg1 ^ 0x5E, arg0.field3029, arg0.field3019);
                            } else {
                                arg0.field6229[var11] = null;
                            }
                        }
                        var12.field4475 = var12.field4465 + 1;
                        if (var13.field456.length <= var12.field4475) {
                            var12.field4475 -= var13.field466;
                            if ((var12.field4474 + 1) >= var13.field460) {
                                var12.field4475 = -1;
                            } else if (var12.field4475 < 0 || var13.field456.length <= var12.field4475) {
                                var12.field4475 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B[III)Z", line = 532)
    public final boolean method2053(byte arg0, int[] arg1, int arg2, int arg3) {
        field4828++;
        if (arg0 != 79) {
            method2050(112);
        }
        for (class394 var5 = (class394) this.field4831.method472((byte) -38); var5 != null; var5 = (class394) this.field4831.method482(124)) {
            if (var5.method2431(arg2, arg3, false)) {
                var5.method2429(arg1, 1849648140, arg3, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIII[I)Z", line = 563)
    public final boolean method2054(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field4812++;
        if (arg2 != 0) {
            return false;
        }
        for (class394 var6 = (class394) this.field4831.method472((byte) -83); var6 != null; var6 = (class394) this.field4831.method482(-83)) {
            if (var6.method2432(-127, arg0, arg3, arg1)) {
                var6.method2429(arg4, arg2 + 1849648140, arg1, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 739)
    public class326(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field4818 = arg4;
        this.field4813 = arg1;
        this.field4830 = arg0;
        this.field4833 = arg2;
        this.field4814 = arg3;
        this.field4816 = arg6;
        this.field4821 = arg5;
        if (this.field4816 == 255) {
            this.field4816 = 0;
        }
        this.field4831 = new class46();
    }

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "(B)V", line = 596)
    public final void method2055(byte arg0) {
        field4823++;
        this.field4820 = 0;
        if (arg0 < 95) {
            this.field4819 = -7;
        }
        this.field4825 = 12800;
        this.field4811 = 0;
        this.field4819 = 12800;
        for (class394 var2 = (class394) this.field4831.method472((byte) -48); var2 != null; var2 = (class394) this.field4831.method482(21)) {
            if (this.field4811 < var2.field5852) {
                this.field4811 = var2.field5852;
            }
            if (this.field4820 < var2.field5847) {
                this.field4820 = var2.field5847;
            }
            if (var2.field5842 < this.field4825) {
                this.field4825 = var2.field5842;
            }
            if (var2.field5846 < this.field4819) {
                this.field4819 = var2.field5846;
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZI)Z", line = 636)
    public final boolean method2056(int arg0, boolean arg1, int arg2) {
        field4827++;
        if (!arg1) {
            return true;
        }
        for (class394 var4 = (class394) this.field4831.method472((byte) -114); var4 != null; var4 = (class394) this.field4831.method482(118)) {
            if (var4.method2431(arg0, arg2, false)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLvg;)V", line = 663)
    public static final void method2057(byte arg0, class49 arg1) {
        if (arg0 <= 62) {
            field4815 = null;
        }
        field4824++;
        if (class28.field405 != arg1.field963) {
            return;
        }
        if (class648.field9106.field6981 == null) {
            arg1.field902 = 0;
            arg1.field1004 = 0;
            return;
        }
        arg1.field913 = 150;
        arg1.field1011 = (int) (Math.sin((double) class564.field7962 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field927 = 5;
        arg1.field1004 = class99.field1551;
        arg1.field902 = class594.method3365(class648.field9106.field6981, 0);
        arg1.field942 = class648.field9106.field6207;
        arg1.field886 = class648.field9106.field6191;
        arg1.field895 = class648.field9106.field6226;
        arg1.field870 = 0;
        class30 var2 = arg1.field895 == -1 ? null : class188.field2708.method2140(arg1.field895, 123);
        if (var2 != null) {
            class207.method1372(var2, 5121, arg1.field886);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIIIIIII)V", line = 719)
    public static final void method2058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 > -74) {
            return;
        }
        field4822++;
        if (class15.field153 <= arg4 && class248.field3859 >= arg4 && class15.field153 <= arg0 && class248.field3859 >= arg0 && arg3 >= class15.field153 && arg3 <= class248.field3859 && arg8 >= class15.field153 && arg8 <= class248.field3859 && arg2 >= class520.field7329 && arg2 <= class239.field3747 && arg5 >= class520.field7329 && class239.field3747 >= arg5 && arg9 >= class520.field7329 && arg9 <= class239.field3747 && class520.field7329 <= arg7 && class239.field3747 >= arg7) {
            class640.method3565(15, arg4, arg5, arg8, arg0, arg7, arg9, arg2, arg3, arg6);
        } else {
            class316.method1989(arg9, arg2, arg8, arg5, arg6, arg7, arg4, arg0, 93, arg3);
        }
    }
}
