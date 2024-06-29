import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class508 {

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "Z")
    public static boolean field7164 = false;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILsl;)Lufa;")
    public static final class682 method2962(int arg0, class461 arg1) {
        field7160++;
        if (arg0 != 16865) {
            method2964((byte) 93, -44);
        }
        class510 var2 = class103.method820(arg1, 512);
        int var3 = arg1.method2577(2);
        return new class682(var2.field5981, var2.field5979, var2.field5983, var2.field5985, var2.field5988, var2.field5978, var2.field5987, var2.field5980, var2.field5976, var2.field7183, var2.field7191, var2.field7184, var2.field7181, var2.field7188, var2.field7189, var3);
    }

    @OriginalMember(owner = "client!bda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7161++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILria;BIILjl;ILda;Ljava/lang/String;Laa;II)V")
    public static final void method2963(int arg0, class288 arg1, byte arg2, int arg3, int arg4, class274 arg5, int arg6, class61 arg7, String arg8, class489 arg9, int arg10, int arg11) {
        field7163++;
        int var12;
        if (class650.field9023 == 4) {
            var12 = (int) class521.field7309 & 0x3FFF;
        } else {
            var12 = (int) class521.field7309 + class683.field9519 & 0x3FFF;
        }
        int var13 = Math.max(arg1.field3617 / 2, arg1.field3714 / 2) + 10;
        int var14 = arg3 * arg3 + (arg11 * arg11);
        if (var14 > var13 * var13) {
            return;
        }
        int var15 = class16.field320[var12];
        int var16 = class16.field322[var12];
        if (class650.field9023 != 4) {
            var16 = var16 * 256 / (class127.field1815 + 256);
            var15 = var15 * 256 / (class127.field1815 + 256);
        }
        int var17 = arg11 * var15 + (arg3 * var16) >> 14;
        int var18 = arg11 * var16 - (arg3 * var15) >> 14;
        if (arg2 != -39) {
            method2963(-77, null, (byte) 44, 115, 108, null, -4, null, null, null, -82, 75);
        }
        int var19 = arg5.method1618(100, null, arg8, 46);
        int var20 = var17 - var19 / 2;
        int var21 = arg5.method1622(null, arg8, 100, 103, 0);
        if (-arg1.field3617 <= var20 && arg1.field3617 >= var20 && var18 >= (-arg1.field3714) && arg1.field3714 >= var18) {
            arg7.method566(1, arg1.field3714 / 2 + arg6 - arg10 - var18 - var21, arg0, arg1.field3617 / 2 + arg4 + var20, var19, arg6, 0, null, arg2 ^ 0xFFFFCB17, 50, 0, 0, arg4, arg9, arg8, null);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BI)Lau;")
    public static final class739 method2964(byte arg0, int arg1) {
        field7159++;
        if (arg0 != -78) {
            field7164 = true;
        }
        if (arg1 == 0) {
            return new class381();
        } else if (arg1 == 1) {
            return new class141();
        } else if (arg1 == 2) {
            return new class259();
        } else if (arg1 == 3) {
            return new class680();
        } else if (arg1 == 4) {
            return new class368();
        } else if (arg1 == 5) {
            return new class433();
        } else if (arg1 == 6) {
            return new class632();
        } else if (arg1 == 7) {
            return new class391();
        } else if (arg1 == 8) {
            return new class241();
        } else if (arg1 == 9) {
            return new class38();
        } else if (arg1 == 10) {
            return new class710();
        } else if (arg1 == 11) {
            return new class35();
        } else if (arg1 == 12) {
            return new class152();
        } else if (arg1 == 13) {
            return new class260();
        } else if (arg1 == 14) {
            return new class673();
        } else if (arg1 == 15) {
            return new class32();
        } else if (arg1 == 16) {
            return new class231();
        } else if (arg1 == 17) {
            return new class484();
        } else if (arg1 == 18) {
            return new class561();
        } else if (arg1 == 19) {
            return new class394();
        } else if (arg1 == 20) {
            return new class475();
        } else if (arg1 == 21) {
            return new class511();
        } else if (arg1 == 22) {
            return new class669();
        } else if (arg1 == 23) {
            return new class310();
        } else if (arg1 == 24) {
            return new class436();
        } else if (arg1 == 25) {
            return new class530();
        } else if (arg1 == 26) {
            return new class349();
        } else if (arg1 == 27) {
            return new class658();
        } else if (arg1 == 28) {
            return new class518();
        } else if (arg1 == 29) {
            return new class136();
        } else if (arg1 == 30) {
            return new class494();
        } else if (arg1 == 31) {
            return new class82();
        } else if (arg1 == 32) {
            return new class269();
        } else if (arg1 == 33) {
            return new class760();
        } else if (arg1 == 34) {
            return new class503();
        } else if (arg1 == 35) {
            return new class121();
        } else if (arg1 == 36) {
            return new class588();
        } else if (arg1 == 37) {
            return new class663();
        } else if (arg1 == 38) {
            return new class480();
        } else if (arg1 == 39) {
            return new class321();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIILrea;)V")
    public static final void method2965(int arg0, int arg1, int arg2, class210 arg3) {
        field7162++;
        if (arg0 == 6) {
            class203.field2718[arg1][arg2] = arg3;
        }
    }
}
