import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class413 extends class83 implements class116 {

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "Laf;")
    public class110 field5892;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "Z")
    private boolean field5868;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "[I")
    public static int[] field5887 = new int[4096];

    @OriginalMember(owner = "client!s", name = "X", descriptor = "[[I")
    public static int[][] field5885 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    public static int field5889 = 2;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "Lkh;")
    public static class75 field5876;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "[I")
    public static int[] field5879;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "[Lmt;")
    public static class83[] field5880;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILoj;II)Z", line = 5)
    public final boolean method28(int arg0, class280 arg1, int arg2, int arg3) {
        ++field5883;
        class352 var5 = this.field5892.method529(false, 65, arg1, super.field1005, super.field1008, 65536, false);
        if (var5 == null) {
            return false;
        } else {
            class327 var6 = arg1.method1456();
            var6.method553(super.field1008, super.field1001, super.field1005);
            if (arg3 != -6085) {
                this.field5892 = null;
            }
            return var5.method1695(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Loj;B)V", line = 27)
    public static final void method2445(class280 arg0, byte arg1) {
        if (!class385.field5517) {
            class482.method2844((byte) 52, arg0);
        } else {
            class464.method2729((byte) -22, arg0);
        }
        ++field5871;
        int var2 = -71 / ((60 - arg1) / 34);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)I", line = 43)
    public final int method31(byte arg0) {
        int var2 = -99 % ((arg0 - -23) / 35);
        ++field5870;
        return this.field5892.field1333;
    }

    @OriginalMember(owner = "client!s", name = "j", descriptor = "(I)V", line = 53)
    public static void method2446(int arg0) {
        field5879 = null;
        field5880 = null;
        field5887 = null;
        field5885 = null;
        field5876 = null;
        if (arg0 != 29822) {
            field5876 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lqo;B)V", line = 76)
    public static final void method2447(class137 arg0, byte arg1) {
        ++field5886;
        for (class399 var2 = (class399) class53.field689.method802((byte) 113); var2 != null; var2 = (class399) class53.field689.method806((byte) 104)) {
            if (var2.field5671 == arg0) {
                if (var2.field5688 != null) {
                    class226.field3136.method509(var2.field5688);
                    var2.field5688 = null;
                }
                var2.method702((byte) -114);
                return;
            }
        }
        if (arg1 >= -7) {
            method2448(94, -22, -48);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 108)
    public final void method24(int arg0) {
        if (arg0 <= 41) {
            method2447((class137) null, (byte) -43);
        }
        ++field5872;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lv;", line = 122)
    public static final class261 method2448(int arg0, int arg1, int arg2) {
        class263 var3 = class293.field4356[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3780;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(ILoj;)V", line = 131)
    public final void method27(int arg0, class280 arg1) {
        ++field5867;
        if (arg0 != 0) {
            this.method31((byte) -6);
        }
        class352 var3 = this.field5892.method529(true, 90, arg1, super.field1005, super.field1008, 131072, true);
        if (var3 != null) {
            this.field5892.method532((byte) -116, var3, false, super.field1004, super.field997, super.field999, super.field1011, arg1);
        }
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)I", line = 148)
    public final int method17(int arg0) {
        ++field5873;
        if (arg0 != -8960) {
            field5880 = null;
        }
        return this.field5892.method530(true);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILoj;B)Lqh;", line = 162)
    public final class352 method21(int arg0, class280 arg1, byte arg2) {
        ++field5881;
        if (arg2 != -98) {
            field5878 = 127;
        }
        return this.field5892.method529(false, 105, arg1, 0, 0, arg0, false);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)I", line = 173)
    public final int method16(boolean arg0) {
        if (arg0) {
            field5887 = null;
        }
        ++field5874;
        return this.field5892.field1346;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)I", line = 185)
    public final int method26(byte arg0) {
        if (arg0 != 73) {
            this.method24(111);
        }
        ++field5888;
        return this.field5892.field1341;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V", line = 197)
    public final void method32(int arg0) {
        ++field5882;
        if (arg0 != -2) {
            field5880 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Loj;Lcu;IIIIIZIIIIIII)V", line = 210)
    public class413(class280 arg0, class415 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field5937 == 1, class307.method1910(arg12, arg13, -89));
        this.field5892 = new class110(arg0, arg1, arg12, arg13, super.field994, arg3, arg4, arg6, arg7, arg14);
        this.field5868 = ~arg1.field5990 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Z", line = 222)
    public final boolean method22(int arg0) {
        ++field5884;
        if (arg0 >= -32) {
            this.method21(-67, (class280) null, (byte) -76);
        }
        return this.field5892.method524(10);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(ILoj;)Lmg;", line = 233)
    public final class451 method19(int arg0, class280 arg1) {
        ++field5869;
        class352 var3 = this.field5892.method529(true, 108, arg1, super.field1005, super.field1008, 1024, false);
        if (var3 == null) {
            return null;
        } else {
            class327 var4 = arg1.method1456();
            var4.method553(super.field1008, super.field1001, super.field1005);
            class451 var5 = null;
            if (this.field5868) {
                var5 = class134.method638(762096108, 1);
            }
            if (this.field5892.field1331 == null) {
                var3.method1716(var4, var5 == null ? null : var5.field6379[0], 0);
            } else {
                class46 var6 = this.field5892.field1331.method2272();
                arg1.method1463(var3, var6, var4, var5 != null ? var5.field6379[0] : null, 0);
            }
            this.field5892.method532((byte) -100, var3, true, super.field1004, super.field997, super.field999, super.field1011, arg1);
            if (arg0 < 95) {
                this.method26((byte) 26);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(ILoj;)V", line = 270)
    public final void method18(int arg0, class280 arg1) {
        ++field5891;
        int var3 = 70 % ((62 - arg0) / 63);
        this.field5892.method523(-27426, arg1);
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)Z", line = 281)
    public final boolean method33(int arg0) {
        if (arg0 != 1957) {
            field5889 = -82;
        }
        ++field5893;
        return false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZLa;IBLoj;)V", line = 293)
    public final void method23(int arg0, int arg1, boolean arg2, class78 arg3, int arg4, byte arg5, class280 arg6) {
        if (arg5 == -65) {
            ++field5877;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILoj;)V", line = 310)
    public final void method20(int arg0, class280 arg1) {
        ++field5875;
        this.field5892.method528(arg1, arg0 + 125328);
        if (arg0 != 5744) {
            field5885 = null;
        }
    }
}
