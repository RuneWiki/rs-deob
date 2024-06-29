import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class153 {

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public static final void method1030(int arg0, int arg1) {
        field2153++;
        class322.field4447 = 100;
        class236.field3170 = 3;
        class106.field1270 = arg1;
        class515.field7342 = -1;
        if (arg0 != 1) {
            field2152 = -48;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Z")
    public static final boolean method1031(int arg0, int arg1, int arg2) {
        field2155++;
        if (arg2 == 20858) {
            return (arg1 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILwm;Lwm;IIIBII)V")
    public static final void method1032(int arg0, int arg1, class564 arg2, class564 arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field2154++;
        int var10 = arg2.method1837((byte) 72);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class88 var12 = (class88) class378.field5300.method4022((long) var10, (byte) -45);
        if (var12 == null) {
            class204[] var13 = class204.method1235(class374.field5245, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class268.field3831.method484(var13[0], true);
            class378.field5300.method4018((byte) 127, var12, (long) var10);
        }
        class712.method4006(0, (byte) -59, arg3.field1266, arg5 >> 1, arg0, arg6, arg3.field1264, arg3.method1835((byte) 127) * 256, arg1 >> 1, arg3.field1250);
        int var14 = class278.field3936[0] + arg9 - 18;
        int var15 = arg8 + class278.field3936[1] - 70;
        int var16 = arg4 / 4 * 18 + var14;
        if (arg7 != -39) {
            method1032(70, 30, null, null, -40, -4, 14, (byte) 102, 116, 106);
        }
        int var17 = arg4 % 4 * 18 + var15;
        var12.method658(var16, var17);
        if (arg2 == arg3) {
            class268.field3831.method393(var17 - 1, -256, 18, 18, arg7 + 82, var16 - 1);
        }
        class189.method1186(var17 + 18, var16 + 18, (byte) -104, var16 - 1, var17 + -1);
        class9 var18 = class337.method2187(1);
        var18.field138 = var17 + 16;
        var18.field136 = var16 + 16;
        var18.field130 = var17;
        var18.field132 = var16;
        var18.field129 = arg2;
        class230.field3099.method2307(0, var18);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1033(int arg0, String arg1, String arg2, int arg3) {
        class549.field7670 = 2;
        class343.field4791 = arg3;
        field2151++;
        if (arg0 != 15341) {
            method1032(-22, 62, null, null, -41, -18, -70, (byte) 61, -83, -116);
        }
        class579.method3301(arg1, false, 0, arg2);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([Lkba;II)V")
    public static final void method1034(class105[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class105 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field1260;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field1260 < (var7 & 0x1) + var6) {
                class105 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1034(arg0, arg1, var4 - 1);
        method1034(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!g", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2150++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(II)V")
    public class153(int arg0, int arg1) {
        this.field2158 = arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLvaa;)I")
    public static final int method1035(byte arg0, class468 arg1) {
        field2157++;
        class353 var2 = arg1.field6632;
        if (var2.field5026 != null) {
            var2 = var2.method2273((byte) 29, class101.field1201);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field5013;
        class224 var4 = arg1.method3247(21816);
        if (arg1.field7930 == -1 || arg1.field7968) {
            var3 = var2.field5014;
        } else if (arg1.field7930 == var4.field2977 || arg1.field7930 == var4.field3025 || arg1.field7930 == var4.field3007 || arg1.field7930 == var4.field3021) {
            var3 = var2.field5041;
        } else if (arg1.field7930 == var4.field2992 || arg1.field7930 == var4.field3020 || arg1.field7930 == var4.field2998 || arg1.field7930 == var4.field3003) {
            var3 = var2.field5029;
        }
        if (arg0 >= -52) {
            field2152 = 39;
        }
        return var3;
    }
}
