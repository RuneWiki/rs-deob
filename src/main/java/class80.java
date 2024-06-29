import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class80 extends class423 {

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "[I")
    public int[] field978;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "[I")
    public int[] field971;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field970 = 0;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Lwp;")
    public static class288 field974 = new class288();

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[[[B")
    public static byte[][][] field972;

    static {
        new class72("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field981 = 0;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 3)
    public static final void method504(int arg0) {
        class131.field1453++;
        if (arg0 < 8) {
            return;
        }
        class427.field5837.method2162(false, 5);
        field976++;
        class427.field5837.method1593(client.method2697(-128), -95);
        class427.field5837.method1573(-6266, class39.field457);
        class427.field5837.method1573(-6266, class28.field315);
        class427.field5837.method1593(class414.field5684, -102);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V", line = 24)
    public static final void method505(byte arg0, int arg1) {
        if (arg0 < 98) {
            method507(-21, 127);
        }
        class439.field6042 = arg1;
        field975++;
        class344.field4678.method2298(0);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V", line = 37)
    public static final void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 56) {
            field972 = null;
        }
        field973++;
        for (int var6 = arg0; var6 < (arg0 + arg1); var6++) {
            for (int var9 = arg4; var9 < (arg4 + arg5); var9++) {
                if (var9 >= 0 && var9 < class22.field232 && var6 >= 0 && var6 < class196.field2329) {
                    class226.field2868[arg3][var9][var6] = arg3 <= 0 ? 0 : class226.field2868[arg3 - 1][var9][var6] - 240;
                }
            }
        }
        if (arg4 > 0 && class22.field232 > arg4) {
            for (int var7 = arg0 + 1; var7 < arg0 + arg1; var7++) {
                if (var7 >= 0 && var7 < class196.field2329) {
                    class226.field2868[arg3][arg4][var7] = class226.field2868[arg3][arg4 - 1][var7];
                }
            }
        }
        if (arg0 > 0 && arg0 < class196.field2329) {
            for (int var8 = arg4 + 1; var8 < arg4 + arg5; var8++) {
                if (var8 >= 0 && var8 < class22.field232) {
                    class226.field2868[arg3][var8][arg0] = class226.field2868[arg3][var8][arg0 - 1];
                }
            }
        }
        if (arg4 < 0 || arg0 < 0 || class22.field232 <= arg4 || arg0 >= class196.field2329) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 <= 0 || class226.field2868[arg3][arg4 - 1][arg0] == 0) {
                if (arg0 > 0 && class226.field2868[arg3][arg4][arg0 - 1] != 0) {
                    class226.field2868[arg3][arg4][arg0] = class226.field2868[arg3][arg4][arg0 - 1];
                    return;
                }
                if (arg4 > 0 && arg0 > 0 && class226.field2868[arg3][arg4 - 1][arg0 - 1] != 0) {
                    class226.field2868[arg3][arg4][arg0] = class226.field2868[arg3][arg4 - 1][arg0 - 1];
                    return;
                }
                return;
            }
            class226.field2868[arg3][arg4][arg0] = class226.field2868[arg3][arg4 - 1][arg0];
        } else if (arg4 <= 0 || class226.field2868[arg3][arg4 - 1][arg0] == class226.field2868[arg3 - 1][arg4 - 1][arg0]) {
            if (arg0 > 0 && class226.field2868[arg3 - 1][arg4][arg0 - 1] != class226.field2868[arg3][arg4][arg0 - 1]) {
                class226.field2868[arg3][arg4][arg0] = class226.field2868[arg3][arg4][arg0 - 1];
                return;
            }
            if (arg4 > 0 && arg0 > 0 && class226.field2868[arg3][arg4 - 1][arg0 - 1] != class226.field2868[arg3 - 1][arg4 - 1][arg0 - 1]) {
                class226.field2868[arg3][arg4][arg0] = class226.field2868[arg3][arg4 - 1][arg0 - 1];
                return;
            }
        } else {
            class226.field2868[arg3][arg4][arg0] = class226.field2868[arg3][arg4 - 1][arg0];
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)S", line = 134)
    public static final short method507(int arg0, int arg1) {
        field977++;
        if (arg0 >= -5) {
            field979 = -36;
        }
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = arg1 >> 3 & 0x70;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V", line = 162)
    public static final void method508(int arg0) {
        field969++;
        if (arg0 != -16238) {
            method507(-103, -79);
        }
        if (!class28.method173(-1)) {
            return;
        }
        if (class431.field5878 == null) {
            class267.method1675(-5824);
        }
        class264.field3386 = 0;
        class228.field2883 = new int[100];
        class433.field5909 = new boolean[100];
        class310.field4202 = true;
        class175.field2032 = new int[100];
        class296.field3951 = new int[100];
        for (int var1 = 0; var1 < 100; var1++) {
            class228.field2883[var1] = (int) (Math.random() * (double) class39.field457);
            class175.field2032[var1] = (int) (Math.random() * 350.0D);
            class296.field3951[var1] = (int) (Math.random() * 102.0D);
            class433.field5909[var1] = Math.random() < 0.5D;
        }
        try {
            class354.field4809 = class346.field4701.getToolkit().getSystemClipboard();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V", line = 205)
    public static void method509(int arg0) {
        if (arg0 == 0) {
            field972 = null;
            field974 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II[I[I)V", line = 229)
    public class80(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field978 = arg2;
        this.field971 = arg3;
    }
}
