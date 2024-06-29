import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    private int field52 = 0;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "[Lsa;")
    private class123[] field49;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Loa;")
    public static class98 field23 = class38.method349(255, "p11_full");

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Loa;")
    public static class98 field35 = class38.method349(255, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Loa;")
    private static class98 field33 = class38.method349(255, "glow3:");

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Loa;")
    public static class98 field42 = field33;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "Z")
    private static boolean field48 = false;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "Z")
    public static boolean field51 = false;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Loa;")
    public static class98 field28 = field33;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "Loa;")
    public static class98 field46 = class38.method349(255, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Loa;")
    private static class98 field38 = class38.method349(255, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "Loa;")
    private static class98 field53 = class38.method349(255, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Loa;")
    public static class98 field32 = field38;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Loa;")
    public static class98 field37 = field53;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "J")
    private long field47;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Lsa;")
    private class123 field24;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "Lsa;")
    private class123 field50;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Lkd;")
    public static class73 field29;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Lkd;")
    public static class73 field41;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lmd;")
    public static class87 field40;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Z")
    public static boolean field36;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lsa;")
    public final class123 method10(byte arg0) {
        this.field52 = 0;
        if (arg0 != 54) {
            method15(-70, 29, -87);
        }
        field45++;
        return this.method14((byte) -96);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIILtd;IIIB)V")
    public static final void method11(int arg0, int arg1, int arg2, int arg3, class132 arg4, int arg5, int arg6, int arg7, byte arg8) {
        field30++;
        if (field48) {
            class52.field1159 = 32;
        } else {
            class52.field1159 = 0;
        }
        field48 = false;
        if (arg2 <= arg5 && arg2 + 16 > arg5 && arg1 <= arg7 && arg1 + 16 > arg7) {
            if (arg6 == 1) {
                class137.field3332 = true;
            }
            if (arg6 == 2 || arg6 == 3) {
                class15.field306 = true;
            }
            arg4.field3114 -= class57.field1269 * 4;
        } else if (arg2 <= arg5 && arg5 < arg2 + 16 && arg7 >= arg1 + arg0 - 16 && arg0 + arg1 > arg7) {
            if (arg6 == 1) {
                class137.field3332 = true;
            }
            arg4.field3114 += class57.field1269 * 4;
            if (arg6 == 2 || arg6 == 3) {
                class15.field306 = true;
            }
        } else if (arg5 >= arg2 - class52.field1159 && arg2 + class52.field1159 + 16 > arg5 && arg1 + 16 <= arg7 && arg7 < arg0 + arg1 - 16 && class57.field1269 > 0) {
            if (arg6 == 2 || arg6 == 3) {
                class15.field306 = true;
            }
            if (arg6 == 1) {
                class137.field3332 = true;
            }
            field48 = true;
            int var9 = (arg0 - 32) * arg0 / arg3;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg0 - var9 - 32;
            int var11 = arg7 - arg1 - var9 / 2 - 16;
            arg4.field3114 = (arg3 - arg0) * var11 / var10;
        }
        if (class146.field3570 != 0) {
            int var12 = arg4.field3215;
            if (arg6 == -1) {
                var12 = 479;
            }
            if (arg5 >= arg2 - var12 && arg1 <= arg7 && arg5 < arg2 + 16 && arg7 <= arg0 + arg1) {
                if (arg6 == 2 || arg6 == 3) {
                    class15.field306 = true;
                }
                arg4.field3114 += class146.field3570 * 45;
                if (arg6 == 1) {
                    class137.field3332 = true;
                }
            }
        }
        if (arg8 != -62) {
            method16(121, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lsa;IJ)V")
    public final void method12(class123 arg0, int arg1, long arg2) {
        if (arg0.field2736 != null) {
            arg0.method975(-7);
        }
        field25++;
        class123 var5 = this.field49[(int) ((long) (this.field44 - 1) & arg2)];
        if (arg1 != -31636) {
            return;
        }
        arg0.field2729 = arg2;
        arg0.field2738 = var5;
        arg0.field2736 = var5.field2736;
        arg0.field2736.field2738 = arg0;
        arg0.field2738.field2736 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lsa;")
    public final class123 method13(int arg0) {
        field43++;
        if (arg0 != 45) {
            this.method13(91);
        }
        if (this.field24 == null) {
            return null;
        }
        class123 var2 = this.field49[(int) (this.field47 & (long) (this.field44 - 1))];
        while (this.field24 != var2) {
            if (this.field24.field2729 == this.field47) {
                class123 var3 = this.field24;
                this.field24 = this.field24.field2738;
                return var3;
            }
            this.field24 = this.field24.field2738;
        }
        this.field24 = null;
        return null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Lsa;")
    public final class123 method14(byte arg0) {
        field39++;
        if (this.field52 > 0 && this.field49[this.field52 - 1] != this.field50) {
            class123 var2 = this.field50;
            this.field50 = var2.field2738;
            return var2;
        }
        while (this.field44 > this.field52) {
            class123 var3 = this.field49[this.field52++].field2738;
            if (this.field49[this.field52 - 1] != var3) {
                this.field50 = var3.field2738;
                return var3;
            }
        }
        if (arg0 != -96) {
            this.field47 = -25L;
        }
        return null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Z")
    public static final boolean method15(int arg0, int arg1, int arg2) {
        field26++;
        if (arg2 == 0 && class62.field1320 == arg0) {
            return true;
        }
        if (arg1 != 3) {
            method15(-94, 66, 24);
        }
        if (arg2 == 1 && class15.field308 == arg0) {
            return true;
        } else {
            return (arg2 == 2 || arg2 == 3) && class96.field2201 == arg0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Lo;")
    public static final class97 method16(int arg0, byte arg1) {
        field34++;
        if (arg1 <= 16) {
            return null;
        }
        class97 var2 = (class97) class53.field1182.method730((byte) 35, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class96.field2202.method1058(1, -65, arg0);
        class97 var4 = new class97();
        if (var3 != null) {
            var4.method773(new class8(var3), arg0, 255);
        }
        var4.method776(true);
        class53.field1182.method732(-1, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IJ)Lsa;")
    public final class123 method17(int arg0, long arg1) {
        field31++;
        if (arg0 != -16) {
            return null;
        }
        this.field47 = arg1;
        class123 var4 = this.field49[(int) ((long) (this.field44 - 1) & arg1)];
        for (this.field24 = var4.field2738; this.field24 != var4; this.field24 = this.field24.field2738) {
            if (this.field24.field2729 == arg1) {
                class123 var5 = this.field24;
                this.field24 = this.field24.field2738;
                return var5;
            }
        }
        this.field24 = null;
        return null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public static void method18(boolean arg0) {
        field28 = null;
        field53 = null;
        field33 = null;
        field46 = null;
        field35 = null;
        field41 = null;
        field42 = null;
        field23 = null;
        field38 = null;
        field40 = null;
        field37 = null;
        if (!arg0) {
            method16(-76, (byte) -126);
        }
        field32 = null;
        field29 = null;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(I)V")
    public class3(int arg0) {
        this.field44 = arg0;
        this.field49 = new class123[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class123 var3 = this.field49[var2] = new class123();
            var3.field2736 = var3;
            var3.field2738 = var3;
        }
    }
}
