import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class245 {

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field3667 = 0;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field3665 = -1;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field3673 = 0;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[I")
    public static int[] field3669;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1600(int arg0) {
        if (arg0 >= 23) {
            field3669 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public static final void method1601(int arg0) {
        class19.field268 = new class267[class87.field1342.method1526((byte) 126)][];
        class47.field671 = new boolean[class87.field1342.method1526((byte) 127)];
        if (arg0 != 25598) {
            field3673 = 60;
        }
        field3671++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
    public static final int method1602(int arg0, int arg1) {
        if (arg0 != -8320) {
            method1608((byte) -60, 17);
        }
        field3670++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILj;IB)V")
    public static final void method1603(int arg0, int arg1, class250 arg2, int arg3, byte arg4) {
        field3674++;
        for (class30 var5 = (class30) class74.field1146.method656(112); var5 != null; var5 = (class30) class74.field1146.method650(127)) {
            if (var5.field421 == arg0 && arg1 * 128 == var5.field419 && arg3 * 128 == var5.field427 && var5.field434.field3783 == arg2.field3783) {
                if (var5.field438 != null) {
                    class152.field2201.method279(var5.field438);
                    var5.field438 = null;
                }
                if (var5.field437 != null) {
                    class152.field2201.method279(var5.field437);
                    var5.field437 = null;
                }
                var5.method1706(-119);
                return;
            }
        }
        if (arg4 != -54) {
            method1604(29, -32, 113, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III[I[I)V")
    public static final void method1604(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 > arg2) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg2; var9 < arg1; var9++) {
                if ((var9 & 0x1) + var7 < arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var8;
            method1604(20305, var6 - 1, arg2, arg3, arg4);
            method1604(20305, arg1, var6 + 1, arg3, arg4);
        }
        if (arg0 != 20305) {
            field3669 = null;
        }
        field3666++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIILtk;IJ)Z")
    public static final boolean method1605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class219 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class191.method1228(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZI)I")
    public static final int method1606(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1603(70, 19, (class250) null, -101, (byte) 51);
        }
        field3664++;
        int var3 = 0;
        while (arg0 > 0) {
            arg0--;
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1607(int arg0, String arg1) {
        field3668++;
        int var2 = class205.method1323(arg0 ^ 0x378F, arg1);
        if (var2 != -1) {
            class218.method1404(class168.field2440.field1201[var2], arg0 ^ 0xFFFFC80B, class168.field2440.field1200[var2]);
            if (arg0 != -14224) {
                field3673 = 9;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)V")
    public static final void method1608(byte arg0, int arg1) {
        field3672++;
        if (class192.field2754 == arg1 || arg0 != 84) {
            return;
        }
        if (class192.field2754 == 0) {
            class123.method834(28937);
        }
        if (arg1 == 40) {
            class42.method292(-19389);
        }
        if (arg1 != 40 && class211.field3037 != null) {
            class211.field3037.method362(false);
            class211.field3037 = null;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 25 || arg1 == 28) {
            class242.field3650 = 1;
            field3673 = 0;
            class264.field3973 = 0;
            class93.field1408 = 1;
            class35.field525 = 0;
            class146.method979(true, true);
        }
        if (arg1 == 25 || arg1 == 10) {
            class214.method1371(arg0 ^ 0xFFFFFFD4);
        }
        if (arg1 == 5) {
            class242.method1572(class45.field634, (byte) -121);
        } else {
            class9.method86((byte) 94);
        }
        boolean var3 = class192.field2754 == 5 || class192.field2754 == 10 || class192.field2754 == 28;
        if (var3 != var2) {
            if (var2) {
                class229.field3429 = class87.field1345;
                if (class209.field3015 == 0) {
                    class280.method1886(arg0 + 999916, 2);
                } else {
                    class28.method212(false, 2, class53.field777, 255, class87.field1345, 7970, 0);
                }
                class81.field1257.method1624(false, arg0 ^ 0xFFFFF83E);
            } else {
                class280.method1886(1000000, 2);
                class81.field1257.method1624(true, -1942);
            }
        }
        class192.field2754 = arg1;
    }
}
