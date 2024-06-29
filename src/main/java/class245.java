import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class245 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public int field3886;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Ljava/lang/String;")
    public String field3895;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "[I")
    public static int[] field3892;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 5)
    public static void method1732(int arg0) {
        field3892 = null;
        if (arg0 != 0) {
            method1738(38, (int[]) null, 31, -110, -50);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lkb;I)V", line = 24)
    public static final void method1733(class39 arg0, int arg1) {
        field3893++;
        class100.field1522 = arg0.method266(-53, "p11_full");
        class86.field1307 = arg0.method266(arg1 ^ 0x362F, "p12_full");
        class330.field5136 = arg0.method266(-126, "b12_full");
        class99.field1514 = arg0.method266(-48, "mapfunction");
        class92.field1423 = arg0.method266(-128, "hitmarks");
        class79.field1192 = arg0.method266(-83, "hitbar_default");
        if (arg1 != -13946) {
            return;
        }
        class179.field2891 = arg0.method266(-48, "headicons_pk");
        class99.field1519 = arg0.method266(-77, "headicons_prayer");
        class200.field3280 = arg0.method266(arg1 ^ 0x3643, "hint_headicons");
        class157.field2422 = arg0.method266(-45, "hint_mapmarkers");
        class300.field4698 = arg0.method266(arg1 + 13909, "mapflag");
        class308.field4817 = arg0.method266(-41, "cross");
        class342.field5331 = arg0.method266(arg1 + 13909, "mapdots");
        class168.field2696 = arg0.method266(arg1 + 13878, "scrollbar");
        class233.field3717 = arg0.method266(-78, "name_icons");
        class74.field991 = arg0.method266(arg1 + 13868, "floorshadows");
        class74.field1002 = arg0.method266(-119, "compass");
        class300.field4699 = arg0.method266(-91, "hint_mapedge");
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lhl;ILhl;)V", line = 52)
    public static final void method1734(class71 arg0, int arg1, class71 arg2) {
        field3891++;
        if (arg1 != 48) {
            field3887 = 48;
        }
        if (arg2.field908 != null) {
            arg2.method465((byte) -122);
        }
        arg2.field921 = arg0;
        arg2.field908 = arg0.field908;
        arg2.field908.field921 = arg2;
        arg2.field921.field908 = arg2;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 70)
    public static final String method1735(int arg0, String arg1) {
        field3888++;
        String var2 = class336.method2313((byte) -110, class232.method1669(37, arg1));
        if (arg0 == -1) {
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)I", line = 88)
    public static final int method1736(byte arg0, int arg1, int arg2) {
        int var3 = class5.method25(arg2 - 1, arg1 + -1, 0) + class5.method25(arg2 + 1, arg1 + -1, 0) + (class5.method25(arg2 + -1, arg1 + 1, arg0 ^ 0xFFFFFFB9) - -class5.method25(arg2 + 1, arg1 + 1, 0));
        field3897++;
        if (arg0 == -71) {
            int var4 = class5.method25(arg2 - 1, arg1, 0) + class5.method25(arg2 + 1, arg1, 0) - (-class5.method25(arg2, arg1 + -1, 0) + -class5.method25(arg2, arg1 + 1, 0));
            int var5 = class5.method25(arg2, arg1, arg0 ^ 0xFFFFFFB9);
            return var4 / 8 + var3 / 16 + var5 / 4;
        } else {
            return 21;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIBIIII)V", line = 106)
    public static final void method1737(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 >= -89) {
            field3892 = (int[]) null;
        }
        if (arg4 - arg3 >= class224.field3575 && class231.field3697 >= arg3 + arg4 && class233.field3721 <= arg5 - arg3 && class235.field3735 >= (arg5 + arg3)) {
            class59.method412(false, arg3, arg0, arg6, arg4, arg1, arg5);
        } else {
            class179.method1240((byte) -37, arg3, arg6, arg1, arg0, arg5, arg4);
        }
        field3898++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[IIII)V", line = 125)
    public static final void method1738(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field3896++;
        arg3--;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg1[var7] = arg4;
            int var8 = var7 + 1;
            arg1[var8] = arg4;
            int var9 = var8 + 1;
            arg1[var9] = arg4;
            int var10 = var9 + 1;
            arg1[var10] = arg4;
            int var11 = var10 + 1;
            arg1[var11] = arg4;
            int var12 = var11 + 1;
            arg1[var12] = arg4;
            int var13 = var12 + 1;
            arg1[var13] = arg4;
            arg3 = var13 + 1;
            arg1[arg3] = arg4;
        }
        if (arg0 != 48) {
            method1738(-31, (int[]) null, -91, 45, -125);
        }
        while (var6 > arg3) {
            arg3++;
            arg1[arg3] = arg4;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ltf;)V", line = 154)
    public static final void method1739(class271 arg0) {
        for (int var1 = arg0.field4285; var1 <= arg0.field4287; var1++) {
            for (int var2 = arg0.field4297; var2 <= arg0.field4289; var2++) {
                class230 var3 = class251.field3996[arg0.field4292][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3680; var4++) {
                        if (var3.field3687[var4] == arg0) {
                            var3.field3680--;
                            for (int var5 = var4; var5 < var3.field3680; var5++) {
                                var3.field3687[var5] = var3.field3687[var5 + 1];
                                var3.field3682[var5] = var3.field3682[var5 + 1];
                            }
                            var3.field3687[var3.field3680] = null;
                            break;
                        }
                    }
                    var3.field3681 = 0;
                    for (int var6 = 0; var6 < var3.field3680; var6++) {
                        var3.field3681 |= var3.field3682[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)V", line = 210)
    public static final void method1740(byte arg0, int arg1, String arg2, String arg3) {
        class192.method1405(arg3, arg1, (String) null, -1, arg2, 1637740768);
        field3890++;
        int var4 = 28 % ((-arg0 - 48) / 62);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIILch;IZI)Z", line = 220)
    public static final boolean method1741(int arg0, int arg1, int arg2, class149 arg3, int arg4, boolean arg5, int arg6) {
        field3889++;
        class208 var7 = class276.method1970(arg3.field2222, 86);
        if (var7.field3398 == -1) {
            return true;
        }
        int var9;
        if (arg3.field2274) {
            int var8 = arg3.field2277 + arg6;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class123 var10 = var7.method1523(23985, arg3.field2230, var9);
        if (var10 == null) {
            return false;
        } else if (arg5) {
            int var11 = arg3.field2253;
            int var12 = var10.field4027;
            int var13 = var10.field4028;
            int var14 = arg3.field2278;
            if ((var9 & 0x1) == 1) {
                var14 = arg3.field2253;
                var11 = arg3.field2278;
            }
            if (var7.field3397) {
                var12 = var11 * 4;
                var13 = var14 * 4;
            }
            if (var7.field3409 == 0) {
                var10.method857(arg4 * 4 + 48, (104 - arg2 - var14) * 4 + 48, var12, var13);
            } else {
                var10.method856((arg4 * 4) + 48, 48 - -((-arg2 + 104 + -var14) * 4), var12, var13, var7.field3409);
            }
            return true;
        } else {
            return false;
        }
    }
}
