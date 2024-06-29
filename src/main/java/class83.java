import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class83 extends class159 {

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "[Z")
    public boolean[] field1194;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
    public int[] field1195;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "[I")
    public int[] field1197;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "[[I")
    public int[][] field1192;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "[I")
    public static int[] field1196 = new int[64];

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lmi;")
    public static class227 field1190 = new class227(64);

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field1199 = -1;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1202 = "Loaded update list";

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field1200 = 0;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "[I")
    public static int[] field1203 = new int[128];

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "[I")
    public static int[] field1201 = new int[32];

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "[S")
    public static short[] field1198;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 21)
    public static void method549(byte arg0) {
        int var1 = -42 / ((arg0 - 6) / 60);
        field1202 = null;
        field1201 = null;
        field1203 = null;
        field1190 = null;
        field1196 = null;
        field1198 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I[B)V", line = 45)
    public class83(int arg0, byte[] arg1) {
        this.field1191 = arg0;
        class313 var3 = new class313(arg1);
        this.field1193 = var3.method2224(-123);
        this.field1194 = new boolean[this.field1193];
        this.field1195 = new int[this.field1193];
        this.field1197 = new int[this.field1193];
        this.field1192 = new int[this.field1193][];
        for (int var4 = 0; var4 < this.field1193; var4++) {
            this.field1197[var4] = var3.method2224(-123);
        }
        for (int var5 = 0; var5 < this.field1193; var5++) {
            this.field1194[var5] = var3.method2224(-119) == 1;
        }
        for (int var6 = 0; var6 < this.field1193; var6++) {
            this.field1195[var6] = var3.method2250(-1613178296);
        }
        for (int var7 = 0; var7 < this.field1193; var7++) {
            this.field1192[var7] = new int[var3.method2224(-126)];
        }
        for (int var8 = 0; var8 < this.field1193; var8++) {
            for (int var9 = 0; var9 < this.field1192[var8].length; var9++) {
                this.field1192[var8][var9] = var3.method2224(-128);
            }
        }
    }
}
