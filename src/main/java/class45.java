import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class45 extends class87 {

    @OriginalMember(owner = "client!g", name = "V", descriptor = "Lpb;")
    public class105 field1040 = new class105();

    @OriginalMember(owner = "client!g", name = "W", descriptor = "Ld;")
    public class25 field1041 = new class25();

    @OriginalMember(owner = "client!g", name = "L", descriptor = "Lad;")
    private class5 field1030;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "[I")
    public static int[] field1035 = new int[25];

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    public static int field1024 = 0;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "[I")
    public static int[] field1021 = new int[32];

    @OriginalMember(owner = "client!g", name = "H", descriptor = "Lja;")
    private static class62 field1026 = class30.method243(43, "Loaded fonts");

    @OriginalMember(owner = "client!g", name = "B", descriptor = "Lja;")
    public static class62 field1020 = class30.method243(43, "mapscene");

    @OriginalMember(owner = "client!g", name = "D", descriptor = "Lja;")
    public static class62 field1022 = field1026;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "Lja;")
    public static class62 field1032 = class30.method243(43, ")2");

    @OriginalMember(owner = "client!g", name = "U", descriptor = "Lja;")
    public static class62 field1039 = class30.method243(43, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!g", name = "I", descriptor = "Lja;")
    private static class62 field1027 = class30.method243(43, "New User");

    @OriginalMember(owner = "client!g", name = "O", descriptor = "Lja;")
    public static class62 field1033 = field1027;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
    public static void method325(byte arg0) {
        field1021 = null;
        field1035 = null;
        field1039 = null;
        if (arg0 != 21) {
            return;
        }
        field1026 = null;
        field1022 = null;
        field1020 = null;
        field1033 = null;
        field1027 = null;
        field1032 = null;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "()Lmd;")
    public final class87 method35() {
        field1029++;
        class134 var1;
        do {
            var1 = (class134) this.field1040.method841((byte) 18);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3093 == null);
        return var1.field3093;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILtc;I[II)V")
    private final void method326(int arg0, int arg1, class134 arg2, int arg3, int[] arg4, int arg5) {
        field1031++;
        if ((this.field1030.field117[arg2.field3060] & 0x4) != 0 && arg2.field3081 < 0) {
            int var7 = this.field1030.field81[arg2.field3060] / class144.field3371;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field3090) / var7;
                if (arg1 < var8) {
                    arg2.field3090 += arg1 * var7;
                    break;
                }
                arg1 -= var8;
                arg2.field3093.method44(arg4, arg0, var8);
                arg2.field3090 += var7 * var8 - 1048576;
                arg0 += var8;
                int var9 = class144.field3371 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class99 var11 = arg2.field3093;
                if (this.field1030.field77[arg2.field3060] == 0) {
                    arg2.field3093 = class99.method769(arg2.field3080, var11.method774(), var11.method792(), var11.method766());
                } else {
                    arg2.field3093 = class99.method769(arg2.field3080, var11.method774(), 0, var11.method766());
                    this.field1030.method33(arg2, -432961658, arg2.field3086.field2194[arg2.field3068] < 0);
                    arg2.field3093.method772(var9, var11.method792());
                }
                if (arg2.field3086.field2194[arg2.field3068] < 0) {
                    arg2.field3093.method781(-1);
                }
                var11.method762(var9);
                var11.method44(arg4, arg0, arg3 - arg0);
                if (var11.method801()) {
                    this.field1041.method198(var11);
                }
            }
        }
        arg2.field3093.method44(arg4, arg0, arg1);
        int var12 = -51 % ((8 - arg5) / 60);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([III)V")
    public final void method44(int[] arg0, int arg1, int arg2) {
        this.field1041.method44(arg0, arg1, arg2);
        for (class134 var4 = (class134) this.field1040.method840(true); var4 != null; var4 = (class134) this.field1040.method841((byte) 18)) {
            if (!this.field1030.method38((byte) 71, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3085) {
                        this.method326(var5, var6, var4, var5 + var6, arg0, 121);
                        var4.field3085 -= var6;
                        break;
                    }
                    this.method326(var5, var4.field3085, var4, var5 + var6, arg0, 107);
                    var6 -= var4.field3085;
                    var5 += var4.field3085;
                } while (!this.field1030.method24((byte) -87, var6, var5, arg0, var4));
            }
        }
        field1023++;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
    public static final void method327(byte arg0) {
        int var1 = 118 % ((-arg0 - 27) / 40);
        class16.field378.method127((byte) -114);
        field1025++;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "()I")
    public final int method42() {
        field1038++;
        return 0;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public final void method41(int arg0) {
        field1036++;
        this.field1041.method41(arg0);
        for (class134 var2 = (class134) this.field1040.method840(true); var2 != null; var2 = (class134) this.field1040.method841((byte) 18)) {
            if (!this.field1030.method38((byte) 110, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3085) {
                        this.method328(var3, var2, 11055);
                        var2.field3085 -= var3;
                        break;
                    }
                    this.method328(var2.field3085, var2, 11055);
                    var3 -= var2.field3085;
                } while (!this.field1030.method24((byte) -118, var3, 0, null, var2));
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()Lmd;")
    public final class87 method30() {
        class134 var1 = (class134) this.field1040.method840(true);
        field1028++;
        if (var1 == null) {
            return null;
        } else if (var1.field3093 == null) {
            return this.method35();
        } else {
            return var1.field3093;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILtc;I)V")
    private final void method328(int arg0, class134 arg1, int arg2) {
        if ((this.field1030.field117[arg1.field3060] & 0x4) != 0 && arg1.field3081 < 0) {
            int var4 = this.field1030.field81[arg1.field3060] / class144.field3371;
            int var5 = (var4 + 1048575 - arg1.field3090) / var4;
            arg1.field3090 = arg0 * var4 + arg1.field3090 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field1030.field77[arg1.field3060] == 0) {
                    arg1.field3093 = class99.method769(arg1.field3080, arg1.field3093.method774(), arg1.field3093.method792(), arg1.field3093.method766());
                } else {
                    arg1.field3093 = class99.method769(arg1.field3080, arg1.field3093.method774(), 0, arg1.field3093.method766());
                    this.field1030.method33(arg1, -432961658, ~arg1.field3086.field2194[arg1.field3068] > -1);
                }
                if (arg1.field3086.field2194[arg1.field3068] < 0) {
                    arg1.field3093.method781(-1);
                }
                arg0 = arg1.field3090 / var4;
            }
        }
        field1037++;
        arg1.field3093.method41(arg0);
        if (arg2 != 11055) {
            this.method42();
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lad;)V")
    public class45(class5 arg0) {
        this.field1030 = arg0;
    }
}
