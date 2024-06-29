import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class297 extends class240 {

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public int field4684 = 0;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public int field4690 = -1;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "[I")
    public static int[] field4688 = new int[4096];

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public int field4682;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public int field4683;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public int field4685;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public int field4687;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public int field4689;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public int field4691;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public int field4692;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public int field4693;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public int field4694;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public int field4696;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V", line = 26)
    public static final void method2078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4695++;
        int var6 = arg3;
        if (arg5 >= -123) {
            field4686 = -106;
        }
        while ((arg1 + arg3) >= var6) {
            for (int var7 = arg2; var7 <= arg2 + arg4; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class295.field4667[arg0][var7][var6] = 127;
                }
            }
            var6++;
        }
        for (int var8 = arg3; var8 < arg1 + arg3; var8++) {
            for (int var9 = arg2; var9 < (arg2 + arg4); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class29.field475[arg0][var9][var8] = arg0 > 0 ? class29.field475[arg0 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var10 = arg3 + 1; var10 < arg1 + arg3; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class29.field475[arg0][arg2][var10] = class29.field475[arg0][arg2 - 1][var10];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var11 = arg2 + 1; var11 < arg2 + arg4; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class29.field475[arg0][var11][arg3] = class29.field475[arg0][var11][arg3 - 1];
                }
            }
        }
        if (arg2 < 0 || arg3 < 0 || arg2 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 > 0 && class29.field475[arg0][arg2 - 1][arg3] != 0) {
                class29.field475[arg0][arg2][arg3] = class29.field475[arg0][arg2 - 1][arg3];
            } else if (arg3 > 0 && class29.field475[arg0][arg2][arg3 - 1] != 0) {
                class29.field475[arg0][arg2][arg3] = class29.field475[arg0][arg2][arg3 - 1];
            } else if (arg2 > 0 && arg3 > 0 && class29.field475[arg0][arg2 - 1][arg3 - 1] != 0) {
                class29.field475[arg0][arg2][arg3] = class29.field475[arg0][arg2 - 1][arg3 - 1];
            }
        } else if (arg2 > 0 && class29.field475[arg0 - 1][arg2 - 1][arg3] != class29.field475[arg0][arg2 - 1][arg3]) {
            class29.field475[arg0][arg2][arg3] = class29.field475[arg0][arg2 - 1][arg3];
        } else if (arg3 > 0 && class29.field475[arg0 - 1][arg2][arg3 - 1] != class29.field475[arg0][arg2][arg3 - 1]) {
            class29.field475[arg0][arg2][arg3] = class29.field475[arg0][arg2][arg3 - 1];
        } else if (arg2 > 0 && arg3 > 0 && class29.field475[arg0 - 1][arg2 - 1][arg3 - 1] != class29.field475[arg0][arg2 - 1][arg3 - 1]) {
            class29.field475[arg0][arg2][arg3] = class29.field475[arg0][arg2 - 1][arg3 - 1];
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 147)
    public static void method2079(int arg0) {
        field4688 = null;
        if (arg0 != -1) {
            field4688 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V", line = 162)
    public static final void method2080(int arg0) {
        field4697++;
        if (arg0 <= 118) {
            method2079(-48);
        }
        class16.field303.method1832((byte) -76);
    }
}
