import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class64 {

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    private int field1097;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Lef;")
    public static class335 field1094 = new class335(2, 4, 4, 0);

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field1099 = 0;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "[Lnd;")
    public static class380[] field1103;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(III)Z")
    public static final boolean method541(int arg0, int arg1, int arg2) {
        field1100++;
        if (arg0 < 16) {
            method541(109, -63, 41);
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILea;IILmq;IILqa;)V")
    public static final void method542(int arg0, int arg1, class381 arg2, int arg3, int arg4, class350 arg5, int arg6, int arg7, class162 arg8) {
        if (arg7 != 1) {
            return;
        }
        field1096++;
        class447 var9 = class160.field2479.method1812((byte) 28, arg4);
        if (var9 == null || !var9.field6671 || !var9.method2668(arg7 + 111, class335.field5059)) {
            return;
        }
        if (var9.field6680 != null) {
            int[] var10 = new int[var9.field6680.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var13;
                if (class85.field1473 == 4) {
                    var13 = (int) class526.field7779 & 0x3FFF;
                } else {
                    var13 = (int) class526.field7779 + class255.field3674 & 0x3FFF;
                }
                int var14 = class528.field7783[var13];
                int var15 = class528.field7786[var13];
                if (class85.field1473 != 4) {
                    var15 = var15 * 256 / (class70.field1215 + 256);
                    var14 = var14 * 256 / (class70.field1215 + 256);
                }
                var10[var11 * 2] = ((var9.field6680[var11 * 2 + 1] * 4 + arg0) * var14 + ((arg6 + (var9.field6680[var11 * 2] * 4)) * var15) >> 15) + arg5.field5329 / 2 + arg1;
                var10[var11 * 2 + 1] = arg3 - (((var9.field6680[var11 * 2 + 1] * 4 + arg0) * var15 - ((arg6 + (var9.field6680[var11 * 2] * 4)) * var14) >> 15) - (arg5.field5269 / 2));
            }
            class235.method1551(arg8, var10, var9.field6717, arg5.field5318, arg5.field5310);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg8.method235(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[(var12 + 1) * 2 + 1], var9.field6684, 1, arg2, arg1, arg3);
            }
            arg8.method235(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field6684, 1, arg2, arg1, arg3);
        }
        class529 var16 = null;
        if (var9.field6679 != -1) {
            var16 = var9.method2667(arg8, false, -107);
            if (var16 != null) {
                class166.method1225(arg1, arg2, arg5, arg6, arg3, -127, var16, arg0);
            }
        }
        if (var9.field6674 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method109();
        }
        class489 var18 = class328.field4954;
        class332 var19 = class389.field5853;
        if (var9.field6677 == 1) {
            var18 = class464.field6944;
            var19 = class8.field140;
        }
        if (var9.field6677 == 2) {
            var19 = class501.field7392;
            var18 = class310.field4726;
        }
        class91.method708(var9.field6674, true, arg0, var9.field6699, arg5, var19, arg2, var18, arg3, arg1, var17, arg6);
        return;
    }

    @OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1095++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(III)I")
    public static final int method543(int arg0, int arg1, int arg2) {
        if (arg1 != 133704508) {
            return -20;
        }
        field1102++;
        int var3 = arg2 + (arg0 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7F82B3C) >> 19;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIII)V")
    public static final void method544(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1093++;
        if (arg1 < arg4) {
            class179.method1269(class21.field430[arg3], arg2, arg1, arg4, 26985);
        } else {
            class179.method1269(class21.field430[arg3], arg2, arg4, arg1, 26985);
        }
        if (arg0 != 0) {
            method542(-88, -23, null, -100, 85, null, -18, -46, null);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)I")
    public final int method545(int arg0) {
        if (arg0 == -12431) {
            field1092++;
            return this.field1097;
        } else {
            return -61;
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
    public static void method546(int arg0) {
        field1094 = null;
        field1103 = null;
        if (arg0 != 5067) {
            field1103 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(II)V")
    public class64(int arg0, int arg1) {
        this.field1098 = arg1;
        this.field1097 = arg0;
    }

    static {
        new class342("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field1103 = new class380[4];
    }
}
