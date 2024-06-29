import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class42 extends class431 {

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
    public int field554;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public int field546;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "[I")
    public int[] field552;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "[Z")
    public boolean[] field555;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "[I")
    public int[] field551;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "[[I")
    public int[][] field547;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "[I")
    public static int[] field550 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZII)I")
    public static final int method396(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return 40;
        }
        field548++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)V")
    public static void method397(boolean arg0) {
        field550 = null;
        if (!arg0) {
            method396(false, -120, -52);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(CB)Z")
    public static final boolean method398(char arg0, byte arg1) {
        field549++;
        if (arg1 != 36) {
            field550 = null;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(I[B)V")
    public class42(int arg0, byte[] arg1) {
        this.field554 = arg0;
        class217 var3 = new class217(arg1);
        this.field546 = var3.method1515((byte) 121);
        this.field552 = new int[this.field546];
        this.field555 = new boolean[this.field546];
        this.field551 = new int[this.field546];
        this.field547 = new int[this.field546][];
        for (int var4 = 0; var4 < this.field546; var4++) {
            this.field551[var4] = var3.method1515((byte) 124);
        }
        for (int var5 = 0; var5 < this.field546; var5++) {
            this.field555[var5] = var3.method1515((byte) 126) == 1;
        }
        for (int var6 = 0; var6 < this.field546; var6++) {
            this.field552[var6] = var3.method1511(125);
        }
        for (int var7 = 0; var7 < this.field546; var7++) {
            this.field547[var7] = new int[var3.method1515((byte) 122)];
        }
        for (int var8 = 0; var8 < this.field546; var8++) {
            for (int var9 = 0; var9 < this.field547[var8].length; var9++) {
                this.field547[var8][var9] = var3.method1515((byte) 127);
            }
        }
    }
}
