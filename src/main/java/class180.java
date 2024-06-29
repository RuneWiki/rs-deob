import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class180 extends class68 {

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    private int field3132;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "[[I")
    public int[][] field3133;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "[I")
    public int[] field3137;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "[Z")
    public boolean[] field3139;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "[I")
    public static int[] field3135 = new int[32];

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field3134 = 0;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "Lwd;")
    public static class112 field3138;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(B)V", line = 32)
    public static void method1290(byte arg0) {
        field3138 = null;
        if (arg0 < 45) {
            field3138 = (class112) null;
        }
        field3135 = null;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 44)
    public static final void method1291(int arg0) {
        if (arg0 != 4064) {
            method1290((byte) -2);
        }
        field3140++;
        class174.field3082 = true;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I[B)V", line = 56)
    public class180(int arg0, byte[] arg1) {
        this.field3136 = arg0;
        class134 var3 = new class134(arg1);
        this.field3132 = var3.method948(-126);
        this.field3133 = new int[this.field3132][];
        this.field3137 = new int[this.field3132];
        this.field3139 = new boolean[this.field3132];
        for (int var4 = 0; var4 < this.field3132; var4++) {
            this.field3137[var4] = var3.method948(-128);
        }
        for (int var5 = 0; var5 < this.field3132; var5++) {
            this.field3139[var5] = var3.method948(-124) == 1;
        }
        for (int var6 = 0; var6 < this.field3132; var6++) {
            this.field3133[var6] = new int[var3.method948(-125)];
        }
        for (int var7 = 0; var7 < this.field3132; var7++) {
            for (int var8 = 0; var8 < this.field3133[var7].length; var8++) {
                this.field3133[var7][var8] = var3.method948(-121);
            }
        }
    }
}
