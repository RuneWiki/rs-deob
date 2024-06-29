import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class219 extends class273 {

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "Z")
    public static boolean field3484 = false;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "[I")
    public static int[] field3483 = new int[32];

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "I")
    public static int field3492 = 0;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "[Z")
    public static boolean[] field3488;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "[[Ljh;")
    public static class207[][] field3487;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method331(int arg0, int arg1) {
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            int[][] var4 = this.method1795(arg0, arg1 ^ 0x3944, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class27.field346; var8++) {
                var3[var8] = (var6[var8] + var5[var8] + var7[var8]) / 3;
            }
        }
        if (arg1 != -14650) {
            this.method331(12, -42);
        }
        field3490++;
        return var3;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3483[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 56)
    public class219() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V", line = 63)
    public static void method1464(int arg0) {
        field3488 = null;
        if (arg0 != -1) {
            field3492 = 43;
        }
        field3483 = null;
        field3487 = (class207[][]) null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIIIII)V", line = 82)
    public static final void method1465(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg3; var6 <= (arg2 + arg3); var6++) {
            for (int var7 = arg5; var7 <= arg5 + arg1; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class280.field4323[arg4][var7][var6] = 127;
                }
            }
        }
        if (!arg0) {
            field3489 = 121;
        }
        field3485++;
        for (int var8 = arg3; var8 < arg2 + arg3; var8++) {
            for (int var9 = arg5; var9 < arg1 + arg5; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    client.field2034[arg4][var9][var8] = arg4 <= 0 ? 0 : client.field2034[arg4 - 1][var9][var8];
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var10 = arg3 + 1; var10 < (arg2 + arg3); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    client.field2034[arg4][arg5][var10] = client.field2034[arg4][arg5 - 1][var10];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var11 = arg5 + 1; var11 < (arg1 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    client.field2034[arg4][var11][arg3] = client.field2034[arg4][var11][arg3 - 1];
                }
            }
        }
        if (arg5 < 0 || arg3 < 0 || arg5 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 > 0 && client.field2034[arg4][arg5 - 1][arg3] != 0) {
                client.field2034[arg4][arg5][arg3] = client.field2034[arg4][arg5 - 1][arg3];
            } else if (arg3 > 0 && client.field2034[arg4][arg5][arg3 - 1] != 0) {
                client.field2034[arg4][arg5][arg3] = client.field2034[arg4][arg5][arg3 - 1];
            } else if (arg5 > 0 && arg3 > 0 && client.field2034[arg4][arg5 - 1][arg3 - 1] != 0) {
                client.field2034[arg4][arg5][arg3] = client.field2034[arg4][arg5 - 1][arg3 - 1];
            }
        } else if (arg5 > 0 && client.field2034[arg4 - 1][arg5 - 1][arg3] != client.field2034[arg4][arg5 - 1][arg3]) {
            client.field2034[arg4][arg5][arg3] = client.field2034[arg4][arg5 - 1][arg3];
        } else if (arg3 > 0 && client.field2034[arg4][arg5][arg3 - 1] != client.field2034[arg4 - 1][arg5][arg3 - 1]) {
            client.field2034[arg4][arg5][arg3] = client.field2034[arg4][arg5][arg3 - 1];
        } else if (arg5 > 0 && arg3 > 0 && client.field2034[arg4][arg5 - 1][arg3 - 1] != client.field2034[arg4 - 1][arg5 - 1][arg3 - 1]) {
            client.field2034[arg4][arg5][arg3] = client.field2034[arg4][arg5 - 1][arg3 - 1];
        }
    }
}
