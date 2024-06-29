import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class162 {

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lck;")
    private static class119 field2564 = class298.method1987((byte) 38, "Cancel");

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lck;")
    public static class119 field2563 = field2564;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "[Lck;")
    public static class119[] field2567 = new class119[100];

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B[B)Ltb;", line = 12)
    public static final class290 method1031(byte arg0, byte[] arg1) {
        field2566++;
        if (arg1 == null) {
            return null;
        } else if (arg0 > -1) {
            return (class290) null;
        } else {
            class290 var2 = new class290(arg1, class155.field2475, class7.field152, class232.field3741, class64.field1006, class247.field3989);
            method1035(-20432);
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIILrb;ZII)V", line = 32)
    public static final void method1032(int arg0, int arg1, int arg2, int arg3, int arg4, class291 arg5, boolean arg6, int arg7, int arg8) {
        field2565++;
        int var9 = arg2 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var11 = arg5.field4812;
            var10 = arg5.field4785;
        } else {
            var10 = arg5.field4812;
            var11 = arg5.field4785;
        }
        int var12;
        int var13;
        if ((arg8 + var10) <= 104) {
            var12 = arg8 + (var10 + 1 >> 1);
            var13 = (var10 >> 1) + arg8;
        } else {
            var13 = arg8;
            var12 = arg8 + 1;
        }
        int var14;
        int var15;
        if ((arg0 + var11) <= 104) {
            var14 = (var11 + 1 >> 1) + arg0;
            var15 = (var11 >> 1) + arg0;
        } else {
            var14 = arg0 + 1;
            var15 = arg0;
        }
        int var16 = (arg8 << 7) + (var10 << 6);
        int var17 = (arg0 << 7) + (var11 << 6);
        int[][] var18 = class57.field926[arg7];
        int var19 = var18[var12][var15] + var18[var13][var15] + var18[var13][var14] + var18[var12][var14] >> 2;
        int var20 = 0;
        if (arg7 != 0) {
            int[][] var21 = class57.field926[0];
            var20 = var19 - (var21[var12][var15] + var21[var13][var14] + var21[var13][var15] + var21[var12][var14] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg7 < 3) {
            var22 = class57.field926[arg7 + 1];
        }
        class29 var23 = arg5.method1932(4783, var22, var19, (class33) null, var16, var18, arg4, arg2, false, var17, arg6);
        class172.method1091(var23.field413, var16 - arg1, var20, var17 - arg3);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 109)
    public static void method1033(byte arg0) {
        field2563 = null;
        field2564 = null;
        int var1 = 42 / ((arg0 + 63) / 51);
        field2567 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lfg;I)V", line = 132)
    public static final void method1034(class77 arg0, int arg1) {
        field2558++;
        arg0.field1193 = false;
        if (arg0.field1192 != null) {
            arg0.field1192.field2375 = 0;
        }
        for (class77 var2 = arg0.method466(); var2 != null; var2 = arg0.method462()) {
            method1034(var2, 114);
        }
        if (arg1 <= 40) {
            method1034((class77) null, -17);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 157)
    public static final void method1035(int arg0) {
        class64.field1006 = null;
        class161.field2553 = null;
        field2559++;
        class7.field152 = null;
        class247.field3989 = (byte[][]) null;
        class155.field2475 = null;
        class232.field3741 = null;
        if (arg0 != -20432) {
            field2564 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)I")
    public abstract int method109(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public abstract void method110(int arg0);
}
