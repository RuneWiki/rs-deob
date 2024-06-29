import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class74 extends class184 {

    @OriginalMember(owner = "client!je", name = "B", descriptor = "[Lal;")
    public class326[] field1118 = new class326[5];

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "[I")
    public int[] field1133 = new int[5];

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
    public int field1142 = 0;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "[Lsf;")
    public static class108[] field1112 = new class108[100];

    @OriginalMember(owner = "client!je", name = "L", descriptor = "Lsf;")
    public static class108 field1128 = class140.method973(255, "titlebg");

    @OriginalMember(owner = "client!je", name = "N", descriptor = "Z")
    public static boolean field1130 = false;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "Lsf;")
    public static class108 field1125 = class140.method973(255, "showVideoAd");

    @OriginalMember(owner = "client!je", name = "S", descriptor = "J")
    public static long field1135 = 0L;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "Lsf;")
    public static class108 field1139 = class140.method973(255, "::qa_op_test");

    @OriginalMember(owner = "client!je", name = "eb", descriptor = "I")
    public static int field1146 = 0;

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "Lsf;")
    public static class108 field1143 = class140.method973(255, "Connexion perdue)3");

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Lhe;")
    public static class94 field1115 = new class94(50);

    @OriginalMember(owner = "client!je", name = "R", descriptor = "B")
    public byte field1134;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "Lch;")
    public class140 field1122;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "Lrd;")
    public class174 field1117;

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "Lrj;")
    public class18 field1144;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "Lwj;")
    public class220 field1124;

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "Lam;")
    public class258 field1141;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "Ltf;")
    public class260 field1129;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "Lhb;")
    public class36 field1140;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "Lje;")
    public class74 field1120;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Z")
    public boolean field1114;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "Z")
    public boolean field1138;

    @OriginalMember(owner = "client!je", name = "db", descriptor = "Z")
    public boolean field1145;

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(III)V", line = 10)
    public class74(int arg0, int arg1, int arg2) {
        this.field1126 = arg2;
        this.field1116 = arg1;
        this.field1121 = this.field1131 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII[Loj;I[BIZII)V", line = 38)
    public static final void method489(int arg0, int arg1, int arg2, int arg3, class328[] arg4, int arg5, byte[] arg6, int arg7, boolean arg8, int arg9, int arg10) {
        class249 var11 = new class249(arg6);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1710((byte) -127);
            if (var13 == 0) {
                if (arg0 != 8) {
                    return;
                }
                field1136++;
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1739((byte) -73);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFE2) >> 6;
                int var18 = var14 >> 12;
                int var19 = var11.method1731(true);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg9 == var18 && arg1 <= var17 && (arg1 + 8) > var17 && var16 >= arg7 && var16 < arg7 + 8) {
                    class60 var22 = class201.method1424(var12, (byte) 116);
                    int var23 = arg2 + class53.method374(var22.field899, arg5, var22.field939, 19326, var17 & 0x7, var20, var16 & 0x7);
                    int var24 = arg3 + class234.method1629(var17 & 0x7, arg0 - 10668, arg5, var22.field939, var22.field899, var20, var16 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class328 var25 = null;
                        if (!arg8) {
                            int var26 = arg10;
                            if ((class166.field2980[1][var23][var24] & 0x2) == 2) {
                                var26 = arg10 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg4[var26];
                            }
                        }
                        class312.method2173(var12, arg5 + var20 & 0x3, var25, arg10, arg10, var24, arg8, !arg8, var21, 0, var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V", line = 135)
    public static void method490(byte arg0) {
        if (arg0 != 89) {
            method489(-69, 61, 99, 126, (class328[]) null, -58, (byte[]) null, -39, false, 29, -26);
        }
        field1128 = null;
        field1125 = null;
        field1139 = null;
        field1112 = null;
        field1115 = null;
        field1143 = null;
    }
}
