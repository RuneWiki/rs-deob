import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class261 extends class83 {

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "J")
    public long field4261;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Z")
    public static boolean field4256 = true;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Z")
    public static boolean field4255 = false;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4259 = "Loaded title screen";

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "[S")
    public static short[] field4262 = new short[256];

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4257 = "Loading - please wait.";

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4264 = "glow2:";

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
    public static int field4265 = 0;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[I[Ljava/lang/Object;II)V")
    public static final void method1732(int arg0, int[] arg1, Object[] arg2, int arg3, int arg4) {
        if (arg0 > arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            Object var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg4; var9 < arg0; var9++) {
                if (((var9 & 0x1) + var7) > arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    Object var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method1732(var6 - 1, arg1, arg2, -105, arg4);
            method1732(arg0, arg1, arg2, 79, var6 + 1);
        }
        int var12 = -71 / ((arg3 - 31) / 47);
        field4258++;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class261() {
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(J)V")
    public class261(long arg0) {
        this.field4261 = arg0;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
    public static void method1733(int arg0) {
        field4259 = null;
        field4257 = null;
        if (arg0 != 12884) {
            method1734((byte) -123, true);
        }
        field4264 = null;
        field4262 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BZ)V")
    public static final void method1734(byte arg0, boolean arg1) {
        field4254++;
        int[] var2 = null;
        byte var3 = 4;
        byte[][] var4 = class61.field1059;
        int var5 = 0;
        if (arg0 <= 96) {
            return;
        }
        while (var5 < var3) {
            class97.method614(32067);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class290.field4634[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x345ED92) >> 24;
                        if (!arg1 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class276.field4405.length; var15++) {
                                if (class276.field4405[var15] == var14 && var4[var15] != null) {
                                    int[] var16 = class185.method1216(var5, var12, var13, var10, var11, var7 * 8, arg1, var4[var15], var6 * 8, class99.field1699, 0);
                                    var8 = true;
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class211.method1411(-31, var6 * 8, 8, var7 * 8, var5, 8);
                    }
                }
            }
            var5++;
        }
        if (var2 == null) {
            class33.field480 = -1;
            return;
        }
        class67.field1118 = var2[1];
        class33.field480 = var2[0];
        class69.field1129 = var2[3];
        class245.field4026 = var2[4];
        class255.field4166 = var2[2];
    }
}
