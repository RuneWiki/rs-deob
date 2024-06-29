import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class199 extends class117 {

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    private int field3193 = -1;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "[I")
    public static int[] field3196 = new int[100];

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field3204 = 0;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "[I")
    public static int[] field3203 = new int[50];

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "Ldk;")
    public static class251 field3199;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "[I")
    public int[] field3202;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/Object;Lrm;Z)V")
    public static final void method1385(Object arg0, class45 arg1, boolean arg2) {
        ++field3194;
        if (arg1.field746 != null) {
            int var3 = 0;
            if (arg2) {
                while (var3 < 50 && arg1.field746.peekEvent() != null) {
                    class262.method1758(1L, 29552);
                    ++var3;
                }
                if (arg0 != null) {
                    arg1.field746.postEvent(new ActionEvent(arg0, 1001, "dummy"));
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "(I)Z")
    public final boolean method1386(int arg0) {
        int var2 = 31 % ((-36 - arg0) / 62);
        ++field3198;
        if (this.field3202 != null) {
            return true;
        } else if (~this.field3193 <= -1) {
            class232 var3 = class227.field3669 >= 0 ? class30.method162(class304.field4869, 50, class227.field3669, this.field3193) : class26.method148(class304.field4869, this.field3193, 122);
            var3.method1564();
            this.field3202 = var3.field3733;
            this.field3208 = var3.field2303;
            this.field3206 = var3.field2297;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZILjava/lang/String;I)Z")
    public static final boolean method1387(boolean arg0, int arg1, String arg2, int arg3) {
        ++field3195;
        if (arg1 >= 2 && ~arg1 >= -37) {
            boolean var4 = false;
            if (arg3 != 1) {
                return false;
            } else {
                boolean var5 = false;
                int var6 = arg2.length();
                int var7 = 0;
                for (int var8 = 0; ~var6 < ~var8; ++var8) {
                    char var9 = arg2.charAt(var8);
                    if (~var8 == -1) {
                        if (~var9 == -46) {
                            var4 = true;
                            continue;
                        }
                        if (~var9 == -44 && arg0) {
                            continue;
                        }
                    }
                    int var11;
                    if (~var9 <= -49 && ~var9 >= -58) {
                        var11 = var9 - '0';
                    } else if (~var9 <= -66 && ~var9 >= -91) {
                        var11 = var9 - '7';
                    } else {
                        if (~var9 > -98 || var9 > 'z') {
                            return false;
                        }
                        var11 = var9 - 'W';
                    }
                    if (~arg1 >= ~var11) {
                        return false;
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg1 * var7 + var11;
                    if (var10 / arg1 != var7) {
                        return false;
                    }
                    var5 = true;
                    var7 = var10;
                }
                return var5;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class199() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ldk;ZLdk;I)V")
    public static final void method1388(class251 arg0, boolean arg1, class251 arg2, int arg3) {
        class83.field1382 = arg0;
        class294.field4708 = arg1;
        if (arg3 == 16711680) {
            ++field3192;
            class247.field3932 = arg2;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public final void method655(byte arg0) {
        ++field3207;
        if (arg0 > -54) {
            field3203 = null;
        }
        super.method655((byte) -103);
        this.field3202 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)I")
    public final int method832(byte arg0) {
        ++field3197;
        if (arg0 >= -106) {
            field3199 = null;
        }
        return this.field3193;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1389(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 <= 115) {
            method1385((Object) null, (class45) null, false);
        }
        ++field3200;
        if (~arg1 == ~arg7) {
            class163.method1170(arg0, (byte) -115, arg3, arg7, arg2, arg5, arg6);
        } else if (class82.field1374 <= arg2 - arg7 && ~class259.field4188 <= ~(arg2 + arg7) && -arg1 + arg0 >= class85.field1409 && ~class234.field3774 <= ~(arg0 + arg1)) {
            class187.method1337(arg3, arg1, 116, arg5, arg7, arg6, arg0, arg2);
        } else {
            class33.method222(2000, arg3, arg5, arg6, arg2, arg0, arg7, arg1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[[I")
    public int[][] method47(int arg0, int arg1) {
        int[][] var3 = super.field1886.method419(arg0, (byte) 101);
        ++field3209;
        if (super.field1886.field1022 && this.method1386(-114)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = (~class149.field2335 == ~this.field3206 ? arg0 : this.field3206 * arg0 / class149.field2335) * this.field3208;
            int[] var7 = var3[1];
            if (class168.field2737 != this.field3208) {
                for (int var8 = 0; class168.field2737 > var8; ++var8) {
                    int var9 = this.field3208 * var8 / class168.field2737;
                    int var10 = this.field3202[var6 + var9];
                    var5[var8] = class51.method359(var10, 255) << 4;
                    var7[var8] = class51.method359(65280, var10) >> 4;
                    var4[var8] = class51.method359(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~class168.field2737 < ~var11; ++var11) {
                    int var12 = this.field3202[var6++];
                    var5[var11] = class51.method359(255, var12) << 4;
                    var7[var11] = class51.method359(65280, var12) >> 4;
                    var4[var11] = class51.method359(var12, 16711680) >> 12;
                }
            }
        }
        int var13 = 83 % ((arg1 - 37) / 38);
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1390(int arg0, int arg1, int arg2, int arg3) {
        if (!class287.method1913(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class161.method1106(var4 + 1, class267.field4304[arg0][arg1][arg2] + arg3, var5 + 1) && class161.method1106(var4 + 128 - 1, class267.field4304[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class161.method1106(var4 + 128 - 1, class267.field4304[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class161.method1106(var4 + 1, class267.field4304[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLaa;)V")
    public static final void method1391(byte arg0, class43 arg1) {
        ++field3205;
        if (~class29.field360 == ~arg1.field639 || arg1.field699 == -1 || arg1.field717 != 0 || ~(arg1.field619 + 1) < ~class22.method121(arg1.field699, true).field4891[arg1.field686]) {
            int var2 = -arg1.field657 + arg1.field639;
            int var3 = class29.field360 - arg1.field657;
            int var4 = arg1.field665 * 128 - -(arg1.method279(23397) * 64);
            int var5 = arg1.field632 * 128 - -(arg1.method279(23397) * 64);
            int var6 = arg1.field647 * 128 - -(arg1.method279(23397) * 64);
            int var7 = arg1.field714 * 128 + 64 * arg1.method279(23397);
            arg1.field710 = ((-var3 + var2) * var5 + var3 * var7) / var2;
            arg1.field637 = ((var2 - var3) * var4 - -(var3 * var6)) / var2;
        }
        arg1.field697 = 0;
        if (arg1.field649 == 0) {
            arg1.field702 = 1024;
        }
        if (~arg1.field649 == -2) {
            arg1.field702 = 1536;
        }
        if (~arg1.field649 == -3) {
            arg1.field702 = 0;
        }
        if (arg1.field649 == 3) {
            arg1.field702 = 512;
        }
        arg1.field652 = arg1.field702;
        if (arg0 <= 117) {
            field3204 = 105;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field3201;
        if (arg2 == 0) {
            this.field3193 = arg0.method1142(-18970);
        }
        if (arg1 != 255) {
            this.field3193 = 20;
        }
    }

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "(I)V")
    public static void method1392(int arg0) {
        if (arg0 > 114) {
            field3196 = null;
            field3199 = null;
            field3203 = null;
        }
    }
}
