import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class590 extends class206 {

    @OriginalMember(owner = "client!il", name = "U", descriptor = "Ljava/lang/Object;")
    private Object field8009;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "[I")
    public static int[] field8004 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

    @OriginalMember(owner = "client!il", name = "N", descriptor = "[I")
    public static int[] field8002 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!il", name = "W", descriptor = "I")
    public static int field8011 = 1;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "[I")
    public static int[] field8008 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public static int field8003;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field8005;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public static int field8006;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!il", name = "X", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "Loca;")
    public static class573 field8007;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IBIIII)V", line = 7)
    public static final void method3218(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field8003++;
        int var6 = arg0 - arg5;
        int var7 = arg4 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class233.method1482(arg0, (byte) -116, arg2, arg3, arg5);
            }
        } else if (var6 == 0) {
            class31.method257(arg3, arg4, -1, arg2, arg5);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg2;
                int var10 = arg4;
                arg2 = arg5;
                arg5 = var9;
                arg4 = arg0;
                arg0 = var10;
            }
            if (arg1 != 53) {
                field8007 = null;
            }
            if (arg2 > arg4) {
                int var11 = arg2;
                int var12 = arg5;
                arg2 = arg4;
                arg4 = var11;
                arg5 = arg0;
                arg0 = var12;
            }
            int var13 = arg5;
            int var14 = arg4 - arg2;
            int var15 = arg0 - arg5;
            int var16 = -(var14 >> 1);
            int var17 = arg0 > arg5 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var18 = arg2; var18 <= arg4; var18++) {
                    var16 += var15;
                    class213.field2746[var18][var13] = arg3;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg2; var19 <= arg4; var19++) {
                    class213.field2746[var13][var19] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(B)Z", line = 124)
    public final boolean method1329(byte arg0) {
        if (arg0 > -63) {
            field8008 = null;
        }
        field8012++;
        return false;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lgj;Ljava/lang/Object;I)V", line = 135)
    public class590(class654 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field8009 = arg1;
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(B)V", line = 143)
    public static void method3219(byte arg0) {
        field8004 = null;
        field8008 = null;
        field8002 = null;
        if (arg0 < 19) {
            field8011 = 22;
        }
        field8007 = null;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 175)
    public final Object method1326(int arg0) {
        if (arg0 < 121) {
            return null;
        } else {
            field8005++;
            return this.field8009;
        }
    }
}
