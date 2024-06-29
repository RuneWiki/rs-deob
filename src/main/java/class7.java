import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class7 extends class249 {

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "[[I")
    public int[][] field137;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "[I")
    public int[] field134;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "[Z")
    public boolean[] field139;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "[J")
    public static long[] field132 = new long[100];

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Lmb;")
    private static class96 field135 = class243.method1708("Loading fonts )2 ", (byte) 115);

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Lmb;")
    public static class96 field136 = class243.method1708("Fertigkeit: ", (byte) 110);

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field133 = 0;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lmb;")
    public static class96 field131 = field135;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "Lmb;")
    public static class96 field141 = class243.method1708("Fallen lassen", (byte) 93);

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Lmb;")
    public static class96 field140 = class243.method1708("Clientscript error in: ", (byte) 125);

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static void method65(int arg0) {
        field132 = null;
        if (arg0 != 0) {
            method65(-100);
        }
        field136 = null;
        field135 = null;
        field141 = null;
        field131 = null;
        field140 = null;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(I[B)V")
    public class7(int arg0, byte[] arg1) {
        this.field138 = arg0;
        class239 var3 = new class239(arg1);
        this.field130 = var3.method1651(4139);
        this.field137 = new int[this.field130][];
        this.field134 = new int[this.field130];
        this.field139 = new boolean[this.field130];
        for (int var4 = 0; var4 < this.field130; var4++) {
            this.field134[var4] = var3.method1651(4139);
        }
        for (int var5 = 0; var5 < this.field130; var5++) {
            this.field139[var5] = var3.method1651(4139) == 1;
        }
        for (int var6 = 0; var6 < this.field130; var6++) {
            this.field137[var6] = new int[var3.method1651(4139)];
        }
        for (int var7 = 0; var7 < this.field130; var7++) {
            for (int var8 = 0; var8 < this.field137[var7].length; var8++) {
                this.field137[var7][var8] = var3.method1651(4139);
            }
        }
    }
}
