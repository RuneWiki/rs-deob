import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class236 extends class155 {

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "Lkf;")
    public class100 field3454;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3447 = "Starting 3d Library";

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3453 = null;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "Ljava/lang/String;")
    public static String field3456 = "flash1:";

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "J")
    public static long field3458 = 0L;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public int field3442;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    public int field3444;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public int field3445;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public int field3446;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public int field3449;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public int field3457;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "Llc;")
    public static class270 field3450;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)I")
    public static final int method1625(int arg0, int arg1, int arg2) {
        field3448++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg1 != 326386215) {
                method1629(-120);
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBI)V")
    public final void method1626(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -110) {
            method1628(24, (class270) null);
        }
        this.field3460 = arg1;
        this.field3445 = arg0;
        this.field3459 = arg3;
        field3452++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lrk;I)V")
    public static final void method1627(class15 arg0, int arg1) {
        field3451++;
        if (arg0.field165 != null) {
            arg0.field165.field4985 = 0;
        }
        arg0.field167 = false;
        class15 var2 = arg0.method101();
        int var3 = 126 % ((57 - arg1) / 56);
        while (var2 != null) {
            method1627(var2, 113);
            var2 = arg0.method106();
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(ILlc;)Z")
    public static final boolean method1628(int arg0, class270 arg1) {
        if (arg0 != 4) {
            field3456 = null;
        }
        field3455++;
        return arg1.method1885(2, class78.field1264);
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
    public static final void method1629(int arg0) {
        if (arg0 != 0) {
            method1631((byte) -124);
        }
        class181.field2724.method1420((byte) 116);
        field3443++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([IIIIII)V")
    public static final void method1630(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class313 var6 = class223.field3286[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class304 var7 = var6.field5014;
        if (var7 != null) {
            int var8 = var7.field4918;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class239 var10 = var6.field5016;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3507;
        int var12 = var10.field3502;
        int var13 = var10.field3496;
        int var14 = var10.field3491;
        int[] var15 = client.field1983[var11];
        int[] var16 = class270.field4344[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
    public static void method1631(byte arg0) {
        field3450 = null;
        field3453 = null;
        field3456 = null;
        if (arg0 != -42) {
            field3450 = null;
        }
        field3447 = null;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lkf;Lui;)V")
    public class236(class100 arg0, class88 arg1) {
        this.field3454 = arg0;
    }
}
