import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class70 extends class101 {

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "[Z")
    public boolean[] field924;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "[[I")
    public int[][] field919;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "[I")
    public int[] field930;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "[I")
    public int[] field929;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "Z")
    public static boolean field927 = false;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "Lhb;")
    public static class318 field921 = new class318(64);

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "Llm;")
    public static class210 field925;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V", line = 16)
    public static void method461(boolean arg0) {
        field921 = null;
        if (!arg0) {
            field926 = -94;
        }
        field925 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIB)I", line = 45)
    public static final int method462(int arg0, int arg1, byte arg2) {
        field922++;
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg2 == 86 ? arg0 : 97;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I[B)V", line = 75)
    public class70(int arg0, byte[] arg1) {
        this.field928 = arg0;
        class263 var3 = new class263(arg1);
        this.field920 = var3.method1787(false);
        this.field924 = new boolean[this.field920];
        this.field919 = new int[this.field920][];
        this.field930 = new int[this.field920];
        this.field929 = new int[this.field920];
        for (int var4 = 0; var4 < this.field920; var4++) {
            this.field930[var4] = var3.method1787(false);
        }
        for (int var5 = 0; var5 < this.field920; var5++) {
            this.field924[var5] = var3.method1787(false) == 1;
        }
        for (int var6 = 0; var6 < this.field920; var6++) {
            this.field929[var6] = var3.method1830((byte) -77);
        }
        for (int var7 = 0; var7 < this.field920; var7++) {
            this.field919[var7] = new int[var3.method1787(false)];
        }
        for (int var8 = 0; var8 < this.field920; var8++) {
            for (int var9 = 0; var9 < this.field919[var8].length; var9++) {
                this.field919[var8][var9] = var3.method1787(false);
            }
        }
    }
}
