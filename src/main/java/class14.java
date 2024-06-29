import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 extends class665 {

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "Lnea;")
    public static class664 field116 = new class664(7, -2);

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "[I")
    public static int[] field131 = new int[1];

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "[I")
    public static int[] field128 = new int[16];

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "Lvg;")
    public class49 field127;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "Lvg;")
    public class49 field129;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "Ljava/lang/String;")
    public String field117;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Z")
    public boolean field119;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "[Ljava/lang/Object;")
    public Object[] field122;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 12)
    public static final void method76(int arg0) {
        if (arg0 == -1) {
            field120++;
            class229.field3594.method1409((byte) 119);
            class655.field9192.method846((byte) 109);
            class554.field7853.method846((byte) 96);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIZI)V", line = 27)
    public static final void method77(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field123++;
        int var6 = arg0 - arg1;
        int var7 = arg2 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class70.method682(arg5, arg1, arg3, false, arg0);
            }
        } else if (var6 == 0) {
            class55.method598(arg3, arg5, 17862, arg1, arg2);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg3;
                int var10 = arg2;
                arg3 = arg1;
                arg1 = var9;
                arg2 = arg0;
                arg0 = var10;
            }
            if (arg2 < arg3) {
                int var11 = arg3;
                arg3 = arg2;
                int var12 = arg1;
                arg1 = arg0;
                arg2 = var11;
                arg0 = var12;
            }
            int var13 = arg1;
            int var14 = arg2 - arg3;
            if (arg4) {
                int var15 = arg0 - arg1;
                int var16 = -(var14 >> 1);
                int var17 = arg0 > arg1 ? 1 : -1;
                if (var15 < 0) {
                    var15 = -var15;
                }
                if (var8) {
                    for (int var18 = arg3; var18 <= arg2; var18++) {
                        class651.field9125[var18][var13] = arg5;
                        var16 += var15;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                } else {
                    for (int var19 = arg3; var19 <= arg2; var19++) {
                        var16 += var15;
                        class651.field9125[var13][var19] = arg5;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V", line = 158)
    public static void method78(byte arg0) {
        field116 = null;
        if (arg0 >= -93) {
            method78((byte) -95);
        }
        field128 = null;
        field131 = null;
    }
}
