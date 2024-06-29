import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class132 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public int field1786;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public int field1792;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "[Lup;")
    public static class275[] field1788 = new class275[30];

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field1791;

    static {
        new class169("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BIII[FII)V", line = 12)
    public static final void method930(byte arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        field1791++;
        if (arg1 > 0 && !class158.method1064(arg1, (byte) -69)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class158.method1064(arg3, (byte) -84)) {
            int var7 = class163.method1083(arg2, (byte) -92);
            int var8 = 0;
            int var9 = arg3 > arg1 ? arg1 : arg3;
            int var10 = arg1 >> 1;
            int var11 = arg3 >> 1;
            float[] var12 = arg4;
            int var13 = -89 / ((arg0 + 5) / 56);
            float[] var14 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg5, var8, arg6, arg1, arg3, 0, arg2, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = arg1 * var7;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var18 = var16;
                    int var19 = var16;
                    int var20 = var15 + var16;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var10; var22++) {
                            float var23 = var12[var19];
                            int var24 = var7 + var19;
                            float var25 = var12[var24] + var23;
                            float var26 = var12[var20] + var25;
                            var19 = var7 + var24;
                            int var27 = var7 + var20;
                            float var28 = var12[var27] + var26;
                            var14[var18] = var28 * 0.25F;
                            var20 = var7 + var27;
                            var18 += var7;
                        }
                        var19 += var15;
                        var20 += var15;
                    }
                }
                float[] var17 = var14;
                var14 = var12;
                arg1 = var10;
                arg3 = var11;
                var12 = var17;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V", line = 108)
    public static final void method931(boolean arg0) {
        field1790++;
        if (class222.field2867 == class114.field1562) {
            return;
        }
        try {
            class425.method2515(class396.field5266, "tbrefresh", -27401);
            if (!arg0) {
                field1788 = null;
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Leo;IIIZ)V", line = 133)
    public static final void method932(class423 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1789++;
        int var5 = arg0.field5735;
        if (arg0.field5747 == 0) {
            arg0.field5735 = arg0.field5700;
        } else if (arg0.field5747 == 1) {
            arg0.field5735 = arg1 - arg0.field5700;
        } else if (arg0.field5747 == 2) {
            arg0.field5735 = arg0.field5700 * arg1 >> 14;
        }
        int var6 = arg0.field5726;
        if (arg2 != -190) {
            method931(false);
        }
        if (arg0.field5789 == 0) {
            arg0.field5726 = arg0.field5776;
        } else if (arg0.field5789 == 1) {
            arg0.field5726 = arg3 - arg0.field5776;
        } else if (arg0.field5789 == 2) {
            arg0.field5726 = arg0.field5776 * arg3 >> 14;
        }
        if (arg0.field5747 == 4) {
            arg0.field5735 = arg0.field5785 * arg0.field5726 / arg0.field5774;
        }
        if (arg0.field5789 == 4) {
            arg0.field5726 = arg0.field5774 * arg0.field5735 / arg0.field5785;
        }
        if (class285.field3633 && (client.method3037(arg0).field3305 != 0 || arg0.field5741 == 0)) {
            if (arg0.field5726 < 5 && arg0.field5735 < 5) {
                arg0.field5726 = 5;
                arg0.field5735 = 5;
            } else {
                if (arg0.field5735 <= 0) {
                    arg0.field5735 = 5;
                }
                if (arg0.field5726 <= 0) {
                    arg0.field5726 = 5;
                }
            }
        }
        if (class181.field2364 == arg0.field5800) {
            class495.field7238 = arg0;
        }
        if (arg4 && arg0.field5719 != null && arg0.field5735 != var5 || arg0.field5726 != var6) {
            class195 var7 = new class195();
            var7.field2523 = arg0.field5719;
            var7.field2516 = arg0;
            class243.field3114.method42(var7, 0);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 210)
    public static void method933(int arg0) {
        if (arg0 != -13322) {
            method932(null, 89, 94, 104, true);
        }
        field1788 = null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(III)V", line = 225)
    public class132(int arg0, int arg1, int arg2) {
        this.field1786 = arg2;
        this.field1787 = arg0;
        this.field1792 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIB)V")
    public abstract void method927(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
    public abstract void method928(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZI)V")
    public abstract void method929(int arg0, boolean arg1, int arg2);
}
