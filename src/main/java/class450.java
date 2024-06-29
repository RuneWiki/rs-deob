import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class450 {

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "[I")
    private int[] field6493;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "S")
    public static short field6494 = 205;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "[I")
    public static int[] field6495 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "[I")
    public static int[] field6498 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)I")
    public final int method2652(int arg0, int arg1) {
        field6496++;
        if (arg1 <= 42) {
            method2653(null, 84, 75, 53, 73, -63);
        }
        int var3 = (this.field6493.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field6493[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field6493[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "([I)V")
    public class450(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field6493 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field6493[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field6493[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field6493[var5 + var5] = arg0[var4];
            this.field6493[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lpp;IIIII)V")
    public static final void method2653(class267 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3660 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field3665[var6] != null) {
                arg0.field3660++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field3660; var7++) {
            long var8 = class171.field2450[arg1][arg2][arg3];
            while (var8 != 0L) {
                class340 var14 = class461.field6699[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field3665[var7] == var14.field4681) {
                    continue label50;
                }
            }
            long var10 = class171.field2450[arg1][arg4][arg5];
            while (var10 != 0L) {
                class340 var13 = class461.field6699[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field3665[var7] == var13.field4681) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field3660 - 1; var12++) {
                arg0.field3665[var12] = arg0.field3665[var12 + 1];
            }
            arg0.field3660--;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public static void method2654(int arg0) {
        field6498 = null;
        int var1 = 22 % ((-arg0 - 7) / 35);
        field6495 = null;
    }

    static {
        new class83("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }
}
