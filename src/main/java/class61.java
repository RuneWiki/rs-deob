import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class61 extends class202 {

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Loh;")
    public static class263 field1244 = class253.method1681(-128, "<col=ff9040>");

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method370(boolean arg0);

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)V")
    public static final void method371(byte arg0) {
        if (class93.field1843 != null) {
            class93.field1843.method1578(117);
        }
        if (arg0 != 77) {
            method371((byte) -51);
        }
        if (class30.field745 != null) {
            class30.field745.method1578(arg0 + 4);
        }
        field1247++;
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V")
    public static final void method372(byte arg0) {
        class249.field4351.method830(50);
        if (arg0 <= -64) {
            field1245++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBI)I")
    public static final int method373(int arg0, byte arg1, int arg2) {
        field1248++;
        class103 var3 = (class103) class184.field3327.method31(arg1 - 32719, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg1 != 54) {
                return 68;
            }
            for (int var5 = 0; var5 < var3.field1951.length; var5++) {
                if (var3.field1964[var5] == arg2) {
                    var4 += var3.field1951[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)V")
    public static final void method374(boolean arg0) {
        if (arg0) {
            field1244 = null;
        }
        class154.field2792.method1516(-109, 49);
        class214.field3801++;
        field1243++;
        class154.field2792.method1276(class44.field969, -51);
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public static void method375(int arg0) {
        field1244 = null;
        if (arg0 >= -71) {
            method379(-54, -55, -12, -8, true, 114, 39);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(ZI)Z")
    public static final boolean method376(boolean arg0, int arg1) {
        if (arg0) {
            field1244 = null;
        }
        field1250++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class202.field3645[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1007;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[[I)V")
    public static final void method377(int arg0, int[][] arg1) {
        if (arg0 != 0) {
            field1244 = null;
        }
        field1251++;
        class38.field870 = arg1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZ)V")
    public static final void method378(int arg0, int arg1, boolean arg2) {
        field1249++;
        class59 var3 = class6.method41((byte) 114, arg1);
        int var4 = var3.field1228;
        int var5 = var3.field1230;
        int var6 = var3.field1224;
        int var7 = class277.field4852[var6 - var4];
        if (!arg2) {
            return;
        }
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class244.method1653(37, var5, var8 & arg0 << var4 | ~var8 & class48.field1038[var5]);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIZII)V")
    public static final void method379(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1246++;
        if (class51.field1099 <= (arg0 - arg1) && (arg0 + arg1) <= class198.field3587 && arg2 - arg1 >= class11.field249 && (arg1 + arg2) <= class276.field4831) {
            class196.method1341(arg0, arg2, false, arg5, arg3, arg6, arg1);
        } else {
            class198.method1346(arg1, arg6, true, arg2, arg3, arg0, arg5);
        }
        if (arg4) {
            method371((byte) 0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)Z")
    public abstract boolean method380(int arg0);
}
