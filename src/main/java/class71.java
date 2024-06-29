import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class71 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lrg;")
    public static class84 field1155 = new class84();

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public int field1157;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "J")
    public long field1158;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Lak;")
    public class234 field1154;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Lak;")
    public class234 field1159;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Lak;")
    public class234 field1161;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Lsa;")
    public static class262 field1160;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)I")
    public static final int method465(byte arg0, int arg1) {
        if (arg0 <= 81) {
            method467(14);
        }
        field1153++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method466(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class247.field4359 * 128) {
            arg0 = class247.field4359 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class172.field2997 * 128) {
            arg2 = class172.field2997 * 128 - 1;
        }
        class157.field2758 = class223.field3769[arg3];
        class219.field3710 = class223.field3760[arg3];
        class40.field673 = class223.field3769[arg4];
        class173.field3000 = class223.field3760[arg4];
        class123.field2205 = arg0;
        class80.field1317 = arg1;
        class265.field4617 = arg2;
        class87.field1474 = arg0 / 128;
        class131.field2347 = arg2 / 128;
        class227.field3848 = class87.field1474 - class275.field4759;
        if (class227.field3848 < 0) {
            class227.field3848 = 0;
        }
        class143.field2506 = class131.field2347 - class275.field4759;
        if (class143.field2506 < 0) {
            class143.field2506 = 0;
        }
        class199.field3406 = class87.field1474 + class275.field4759;
        if (class199.field3406 > class247.field4359) {
            class199.field3406 = class247.field4359;
        }
        class204.field3461 = class275.field4759 + class131.field2347;
        if (class204.field3461 > class172.field2997) {
            class204.field3461 = class172.field2997;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class275.field4759 + class275.field4759 + 2; var16++) {
            for (int var19 = 0; var19 < class275.field4759 + class275.field4759 + 2; var19++) {
                int var20 = (var16 - class275.field4759 << 7) - (class123.field2205 & 0x7F);
                int var21 = (var19 - class275.field4759 << 7) - (class265.field4617 & 0x7F);
                int var22 = class87.field1474 + var16 - class275.field4759;
                int var23 = class131.field2347 + var19 - class275.field4759;
                if (var22 >= 0 && var23 >= 0 && var22 < class247.field4359 && var23 < class172.field2997) {
                    int var24;
                    if (class187.field3181 == null) {
                        var24 = class273.field4725[0][var22][var23] + 128 - class80.field1317;
                    } else {
                        var24 = class187.field3181[0][var22][var23] + 128 - class80.field1317;
                    }
                    int var25 = class273.field4725[3][var22][var23] - class80.field1317 - 1000;
                    class268.field4649[var16][var19] = class226.method1463(var20, var25, var24, var21, var15);
                } else {
                    class268.field4649[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class275.field4759 + class275.field4759 + 1; var17++) {
            for (int var18 = 0; var18 < class275.field4759 + class275.field4759 + 1; var18++) {
                class149.field2594[var17][var18] = class268.field4649[var17][var18] || class268.field4649[var17 + 1][var18] || class268.field4649[var17][var18 + 1] || class268.field4649[var17 + 1][var18 + 1];
            }
        }
        class6.field91 = arg6;
        class168.field2932 = arg7;
        class244.field4253 = arg8;
        class188.field3255 = arg9;
        class224.field3794 = arg10;
        class172.method1173();
        if (class235.field4094 != null) {
            class215.method1381(true);
            class65.method444(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class215.method1381(false);
        }
        class65.method444(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method467(int arg0) {
        field1160 = null;
        field1155 = null;
        if (arg0 != 0) {
            method467(83);
        }
    }
}
