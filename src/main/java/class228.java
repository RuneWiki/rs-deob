import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class228 extends class137 {

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "[I")
    public static int[] field3670 = new int[25];

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field3671 = new String[1000];

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "I")
    public static int field3683 = 0;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "J")
    public static long field3674 = 0L;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
    public int field3678;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    public int field3680;

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!mk", name = "W", descriptor = "I")
    public int field3685;

    @OriginalMember(owner = "client!mk", name = "X", descriptor = "I")
    public int field3686;

    @OriginalMember(owner = "client!mk", name = "ab", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!mk", name = "V", descriptor = "Ldk;")
    public static class251 field3684;

    @OriginalMember(owner = "client!mk", name = "Z", descriptor = "Ljava/lang/String;")
    public String field3688;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "[I")
    public int[] field3673;

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "[I")
    public int[] field3682;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "[Lhb;")
    public class155[] field3672;

    @OriginalMember(owner = "client!mk", name = "Y", descriptor = "[Ljava/lang/String;")
    public String[] field3687;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([ILbm;I[I[I)V")
    public static final void method1543(int[] arg0, class131 arg1, int arg2, int[] arg3, int[] arg4) {
        for (int var5 = arg2; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && arg1.field662.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field662[var9] = null;
                    } else {
                        class307 var10 = class22.method121(var6, true);
                        class313 var11 = arg1.field662[var9];
                        int var12 = var10.field4893;
                        if (var11 != null) {
                            if (var11.field4993 == var6) {
                                if (var12 == 0) {
                                    var11 = arg1.field662[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field4984 = 0;
                                    var11.field4987 = 0;
                                    var11.field4983 = 1;
                                    var11.field4994 = var8;
                                    var11.field4988 = 0;
                                    class274.method1838(arg1.field710, false, var10, 0, (byte) -120, arg1.field637);
                                } else if (var12 == 2) {
                                    var11.field4988 = 0;
                                }
                            } else if (var10.field4898 >= class22.method121(var11.field4993, true).field4898) {
                                var11 = arg1.field662[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class313 var13 = arg1.field662[var9] = new class313();
                            var13.field4993 = var6;
                            var13.field4987 = 0;
                            var13.field4988 = 0;
                            var13.field4984 = 0;
                            var13.field4983 = 1;
                            var13.field4994 = var8;
                            class274.method1838(arg1.field710, false, var10, 0, (byte) -124, arg1.field637);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field3681++;
    }

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "(I)V")
    public static void method1544(int arg0) {
        field3670 = null;
        field3684 = null;
        field3671 = null;
        if (arg0 != 0) {
            field3670 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZILjava/lang/String;)I")
    public static final int method1545(boolean arg0, int arg1, String arg2) {
        if (!arg0) {
            field3670 = null;
        }
        field3677++;
        return class18.method91(arg2, (byte) -127, arg1, true);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method1546(int arg0, int arg1, int arg2) {
        field3675++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > arg0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lag;I)V")
    public static final void method1547(class211 arg0, int arg1) {
        field3689++;
        class211 var2 = class241.method1622((byte) -17, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class294.field4709;
            var4 = class310.field4964;
        } else {
            var4 = var2.field3394;
            var3 = var2.field3430;
        }
        class234.method1579(arg1 ^ 0xFFFFFF97, arg0, var3, var4, false);
        class64.method453(var3, arg0, arg1, var4);
    }
}
