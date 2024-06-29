import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class203 {

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3165 = "Loaded config";

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lgb;")
    public static class149 field3164 = new class149();

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Lta;")
    public static class262 field3169 = new class262(20);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Luf;")
    public static class176 field3163;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3171;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "[I")
    public static int[] field3170;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "[Lqd;")
    public static class3[] field3168;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)Lbk;")
    public static final class21 method1360(int arg0, byte arg1) {
        if (arg1 != 56) {
            method1360(-14, (byte) -10);
        }
        field3162++;
        class21 var2 = (class21) class247.field3812.method1701(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class86.field1419.method1163(class148.method1006(-2, arg0), class151.method1024(255, arg0), 48);
        class21 var4 = new class21();
        if (var3 != null) {
            var4.method180(arg1 ^ 0x38, new class37(var3));
        }
        class247.field3812.method1704((long) arg0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= 0 && arg6 >= 0 && arg0 < 103 && arg6 < 103) {
            if (arg7 == 0) {
                class228 var8 = class62.method495(arg1, arg0, arg6);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field3564 >>> 32);
                    if (arg3 == 2) {
                        var8.field3565 = new class296(var9, 2, arg4 + 4, arg1, arg0, arg6, arg2, false, var8.field3565);
                        var8.field3570 = new class296(var9, 2, arg4 + 1 & 0x3, arg1, arg0, arg6, arg2, false, var8.field3570);
                    } else {
                        var8.field3565 = new class296(var9, arg3, arg4, arg1, arg0, arg6, arg2, false, var8.field3565);
                    }
                }
            }
            if (arg7 == 1) {
                class247 var10 = class195.method1311(arg1, arg0, arg6);
                if (var10 != null) {
                    int var11 = (int) (var10.field3820 >>> 32) & Integer.MAX_VALUE;
                    if (arg3 == 4 || arg3 == 5) {
                        var10.field3814 = new class296(var11, 4, arg4, arg1, arg0, arg6, arg2, false, var10.field3814);
                    } else if (arg3 == 6) {
                        var10.field3814 = new class296(var11, 4, arg4 + 4, arg1, arg0, arg6, arg2, false, var10.field3814);
                    } else if (arg3 == 7) {
                        var10.field3814 = new class296(var11, 4, (arg4 + 2 & 0x3) + 4, arg1, arg0, arg6, arg2, false, var10.field3814);
                    } else if (arg3 == 8) {
                        var10.field3814 = new class296(var11, 4, arg4 + 4, arg1, arg0, arg6, arg2, false, var10.field3814);
                        var10.field3816 = new class296(var11, 4, (arg4 + 2 & 0x3) + 4, arg1, arg0, arg6, arg2, false, var10.field3816);
                    }
                }
            }
            if (arg7 == 2) {
                if (arg3 == 11) {
                    arg3 = 10;
                }
                class172 var12 = class3.method46(arg1, arg0, arg6);
                if (var12 != null) {
                    var12.field2566 = new class296((int) (var12.field2569 >>> 32) & Integer.MAX_VALUE, arg3, arg4, arg1, arg0, arg6, arg2, false, var12.field2566);
                }
            }
            if (arg7 == 3) {
                class180 var13 = class261.method1760(arg1, arg0, arg6);
                if (var13 != null) {
                    var13.field2689 = new class296((int) (var13.field2686 >>> 32) & Integer.MAX_VALUE, 22, arg4, arg1, arg0, arg6, arg2, false, var13.field2689);
                }
            }
        }
        field3173++;
        if (arg5 != 0) {
            method1361(0, 84, -102, -69, 50, 99, -19, -34);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLjava/lang/String;I)I")
    public static final int method1362(boolean arg0, String arg1, int arg2) {
        if (arg0) {
            field3169 = null;
        }
        field3167++;
        return class6.method74(true, (byte) 67, arg1, arg2);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZLkd;ILkd;)I")
    public static final int method1363(int arg0, boolean arg1, class209 arg2, int arg3, class209 arg4) {
        field3172++;
        if (arg3 == 1) {
            int var5 = arg4.field1786;
            int var6 = arg2.field1786;
            if (!arg1) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 != 10) {
            return 9;
        } else if (arg3 == 2) {
            return class208.method1391(class226.field3542, arg2.method1400(arg0 - 9).field3677, arg4.method1400(1).field3677, -99);
        } else if (arg3 == 3) {
            if (arg4.field3240.equals("-")) {
                if (arg2.field3240.equals("-")) {
                    return 0;
                } else if (arg1) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field3240.equals("-")) {
                return arg1 ? 1 : -1;
            } else {
                return class208.method1391(class226.field3542, arg2.field3240, arg4.field3240, -93);
            }
        } else if (arg3 == 4) {
            if (arg4.method841(-18802)) {
                return arg2.method841(arg0 ^ 0xFFFFB684) ? 0 : 1;
            } else if (arg2.method841(arg0 - 18812)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg4.method839(false)) {
                return arg2.method839(false) ? 0 : 1;
            } else if (arg2.method839(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 6) {
            if (arg4.method842((byte) -115)) {
                return arg2.method842((byte) -126) ? 0 : 1;
            } else if (arg2.method842((byte) -113)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 != 7) {
            return arg4.field3245 - arg2.field3245;
        } else if (arg4.method838(false)) {
            return arg2.method838(false) ? 0 : 1;
        } else if (arg2.method838(false)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method1364(int arg0) {
        field3165 = null;
        field3163 = null;
        field3168 = null;
        field3164 = null;
        field3171 = null;
        field3169 = null;
        field3170 = null;
        if (arg0 != Integer.MAX_VALUE) {
            method1360(4, (byte) -57);
        }
    }
}
