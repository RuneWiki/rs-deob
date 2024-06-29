import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class269 {

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Luk;")
    public class86 field4533 = new class86();

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lbe;")
    public static class283 field4535 = class153.method941(125, "unzap");

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Z")
    public static boolean field4547 = true;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Z")
    public static boolean field4541 = false;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field4549 = 0;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Lbe;")
    private static class283 field4545 = class153.method941(126, " from your ignore list first)3");

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Lbe;")
    public static class283 field4536 = field4545;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Lbe;")
    public static class283 field4544 = class153.method941(-49, "Angreifen");

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field4551 = 0;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "[I")
    public static int[] field4548 = new int[25];

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field4537 = 0;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field4552 = 0;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lik;")
    public static class244 field4539;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "Luk;")
    private class86 field4553;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZZII)V", line = 11)
    public static final void method1808(boolean arg0, boolean arg1, int arg2, int arg3) {
        field4546++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        } else if (arg1) {
            class205.field3493 = arg2;
            class141.field2355 = arg0;
            class5.field43 = arg3;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Luk;B)V", line = 29)
    public final void method1809(class86 arg0, byte arg1) {
        field4542++;
        if (arg0.field1447 != null) {
            arg0.method557((byte) -89);
        }
        arg0.field1453 = this.field4533;
        arg0.field1447 = this.field4533.field1447;
        arg0.field1447.field1453 = arg0;
        if (arg1 > -118) {
            field4545 = (class283) null;
        }
        arg0.field1453.field1447 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 52)
    public final void method1810(int arg0) {
        int var2 = -120 % ((arg0 + 43) / 34);
        field4534++;
        while (true) {
            class86 var3 = this.field4533.field1453;
            if (this.field4533 == var3) {
                this.field4553 = null;
                return;
            }
            var3.method557((byte) -89);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)Luk;", line = 73)
    public final class86 method1811(int arg0) {
        field4540++;
        if (arg0 != 3) {
            this.method1810(-88);
        }
        class86 var2 = this.field4553;
        if (this.field4533 == var2) {
            this.field4553 = null;
            return null;
        } else {
            this.field4553 = var2.field1447;
            return var2;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)Luk;", line = 96)
    public final class86 method1812(byte arg0) {
        field4531++;
        class86 var2 = this.field4533.field1453;
        if (this.field4533 == var2) {
            this.field4553 = null;
            return null;
        } else {
            int var3 = 54 % ((-arg0 - 50) / 34);
            this.field4553 = var2.field1453;
            return var2;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)Luk;", line = 124)
    public final class86 method1813(byte arg0) {
        field4532++;
        class86 var2 = this.field4553;
        if (this.field4533 == var2) {
            this.field4553 = null;
            return null;
        }
        if (arg0 <= 43) {
            this.method1816(46);
        }
        this.field4553 = var2.field1453;
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 406)
    public class269() {
        this.field4533.field1447 = this.field4533;
        this.field4533.field1453 = this.field4533;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)Luk;", line = 148)
    public final class86 method1814(boolean arg0) {
        if (arg0) {
            this.method1816(42);
        }
        field4550++;
        class86 var2 = this.field4533.field1453;
        if (this.field4533 == var2) {
            return null;
        } else {
            var2.method557((byte) -89);
            return var2;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Luk;I)V", line = 203)
    public final void method1815(class86 arg0, int arg1) {
        if (arg0.field1447 != null) {
            arg0.method557((byte) -89);
        }
        arg0.field1447 = this.field4533;
        field4538++;
        arg0.field1453 = this.field4533.field1453;
        arg0.field1447.field1453 = arg0;
        arg0.field1453.field1447 = arg0;
        if (arg1 != 0) {
            field4552 = 119;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)Luk;", line = 228)
    public final class86 method1816(int arg0) {
        field4529++;
        if (arg0 != 128) {
            return (class86) null;
        }
        class86 var2 = this.field4533.field1447;
        if (this.field4533 == var2) {
            this.field4553 = null;
            return null;
        } else {
            this.field4553 = var2.field1447;
            return var2;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)I", line = 252)
    public static final int method1817(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 25694) {
            field4541 = false;
        }
        field4528++;
        if ((class252.field4282[arg2][arg3][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (class252.field4282[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V", line = 280)
    public static void method1818(byte arg0) {
        field4535 = null;
        field4548 = null;
        field4545 = null;
        int var1 = 37 / ((-arg0 - 84) / 41);
        field4544 = null;
        field4536 = null;
        field4539 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIIII)V", line = 297)
    public static final void method1819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4543++;
        if (arg1 == arg9 && arg0 == arg6 && arg3 == arg7 && arg5 == arg8) {
            class143.method901(arg4, arg3, arg5, arg0, arg1, (byte) 36);
        } else {
            int var10 = arg1;
            int var11 = arg0;
            int var12 = arg0 * 3;
            int var13 = arg1 * 3;
            int var14 = arg7 * 3;
            int var15 = arg9 * 3;
            int var16 = arg8 * 3;
            int var17 = arg3 + var15 - arg1 - var14;
            int var18 = var15 - var13;
            int var19 = arg6 * 3;
            int var20 = var14 + var13 - var15 - var15;
            int var21 = var19 + arg5 - arg0 - var16;
            int var22 = var19 - var12;
            int var23 = var16 + var12 - var19 - var19;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var17 * var26;
                int var28 = var21 * var26;
                int var29 = var20 * var25;
                int var30 = var23 * var25;
                int var31 = var18 * var24;
                int var32 = var22 * var24;
                int var33 = (var27 - (-var29 - var31) >> 12) + arg1;
                int var34 = (var30 + var32 + var28 >> 12) + arg0;
                class143.method901(arg4, var33, var34, var11, var10, (byte) 36);
                var10 = var33;
                var11 = var34;
            }
        }
        int var35 = 12 / ((-arg2 - 24) / 33);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lbe;B)Lbe;", line = 376)
    public static final class283 method1820(class283 arg0, byte arg1) {
        field4530++;
        int var2 = class216.method1425(arg1 - 147, arg0);
        if (var2 == -1) {
            return class104.field1802;
        } else if (arg1 == 30) {
            return class272.field4577.field5066[var2].method1923(class121.field2021, (byte) 42, class155.field2548);
        } else {
            return (class283) null;
        }
    }
}
