import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class81 extends class59 {

    @OriginalMember(owner = "client!j", name = "U", descriptor = "Lsd;")
    public static class166 field1647 = class135.method935("", 0);

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "[I")
    public static int[] field1653 = new int[4000];

    @OriginalMember(owner = "client!j", name = "db", descriptor = "I")
    public static int field1656 = 0;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "Lf;")
    public static class47 field1655;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B[Lvd;I)V")
    public static final void method661(byte arg0, class193[] arg1, int arg2) {
        ++field1650;
        if (arg0 >= 15) {
            for (int var3 = 0; var3 < arg1.length; ++var3) {
                class193 var4 = arg1[var3];
                if (var4 != null) {
                    if (~var4.field3797 == -1) {
                        if (var4.field3829 != null) {
                            method661((byte) 23, var4.field3829, arg2);
                        }
                        class54 var5 = (class54) class103.field2017.method224(-1, (long) var4.field3715);
                        if (var5 != null) {
                            class166.method1120(-65, arg2, var5.field1023);
                        }
                    }
                    if (~arg2 == -1 && var4.field3698 != null) {
                        class137 var6 = new class137();
                        var6.field2673 = var4;
                        var6.field2668 = var4.field3698;
                        class166.method1126((byte) -113, var6);
                    }
                    if (~arg2 == -2 && var4.field3796 != null) {
                        if (~var4.field3716 <= -1) {
                            class193 var7 = class90.method701(-31355, var4.field3715);
                            if (var7 == null || var7.field3829 == null || ~var4.field3716 <= ~var7.field3829.length || var7.field3829[var4.field3716] != var4) {
                                continue;
                            }
                        }
                        class137 var8 = new class137();
                        var8.field2673 = var4;
                        var8.field2668 = var4.field3796;
                        class166.method1126((byte) -113, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        if (arg1 > -124) {
            field1655 = null;
        }
        ++field1649;
        int[] var3 = super.field1219.method721(arg0, -126);
        if (super.field1219.field1816) {
            for (int var4 = 0; ~class98.field1879 < ~var4; ++var4) {
                this.method665(-97, var4, arg0);
                int[] var5 = this.method499(0, class151.field2932, 0);
                var3[var4] = var5[class5.field108];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method662(int arg0, String arg1) throws ClassNotFoundException {
        ++field1654;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg0 != 0) {
            return null;
        } else {
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        ++field1645;
        int[][] var3 = super.field1207.method528(111, arg1);
        int[] var4 = var3[0];
        int[] var5 = var3[2];
        if (!arg0) {
            method664(6, (class47) null, (class47) null, (class47) null, (class47) null);
        }
        int[] var6 = var3[1];
        if (super.field1207.field1320) {
            for (int var7 = 0; ~class98.field1879 < ~var7; ++var7) {
                this.method665(-79, var7, arg1);
                int[][] var8 = this.method498(class151.field2932, 0, 0);
                var4[var7] = var8[0][class5.field108];
                var6[var7] = var8[1][class5.field108];
                var5[var7] = var8[2][class5.field108];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
    public static void method663(byte arg0) {
        field1653 = null;
        field1647 = null;
        if (arg0 < 101) {
            field1647 = null;
        }
        field1655 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class81() {
        super(1, false);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILf;Lf;Lf;Lf;)V")
    public static final void method664(int arg0, class47 arg1, class47 arg2, class47 arg3, class47 arg4) {
        class178.field3371 = arg1;
        if (arg0 != 27216) {
            method663((byte) -95);
        }
        class72.field1431 = arg4;
        class187.field3576 = arg2;
        class82.field1670 = arg3;
        class63.field1309 = new class193[class72.field1431.method357((byte) -105)][];
        ++field1648;
        class199.field3943 = new boolean[class72.field1431.method357((byte) -105)];
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg1 <= 18) {
            field1653 = null;
        }
        if (~arg2 == -1) {
            super.field1216 = ~arg0.method400(255) == -2;
        }
        ++field1658;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(III)V")
    private final void method665(int arg0, int arg1, int arg2) {
        int var4 = class187.field3569[arg1];
        ++field1651;
        int var5 = class136.field2657[arg2];
        if (arg0 < -60) {
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class5.field108 = arg1;
                class151.field2932 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class151.field2932 = arg1;
                class5.field108 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class151.field2932 = arg1;
                class5.field108 = class98.field1879 - arg2;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class5.field108 = arg1;
                class151.field2932 = -arg2 + class171.field3285;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class151.field2932 = -arg2 + class171.field3285;
                class5.field108 = class98.field1879 - arg1;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class151.field2932 = -arg1 + class171.field3285;
                class5.field108 = class98.field1879 - arg2;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class5.field108 = arg2;
                class151.field2932 = -arg1 + class171.field3285;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class5.field108 = -arg1 + class98.field1879;
                class151.field2932 = arg2;
            }
            class5.field108 &= class187.field3571;
            class151.field2932 &= class137.field2679;
        }
    }
}
