import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class191 extends class35 {

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
    public int field2931;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "[I")
    public int[] field2928;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "[I")
    public int[] field2923;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "[Z")
    public boolean[] field2926;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "[[I")
    public int[][] field2927;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "Lsh;")
    public static class472 field2925 = new class472(93, 8);

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)Z", line = 12)
    public static final boolean method1327(int arg0, int arg1) {
        class290.field4405 = true;
        field2930++;
        class81.field1138 = arg1 + 1 & 0xFFFF;
        return arg0 == 32255;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V", line = 31)
    public static void method1328(int arg0) {
        if (arg0 != 7832) {
            field2925 = null;
        }
        field2925 = null;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(I[B)V", line = 43)
    public class191(int arg0, byte[] arg1) {
        this.field2931 = arg0;
        class446 var3 = new class446(arg1);
        this.field2929 = var3.method2628(49152);
        this.field2928 = new int[this.field2929];
        this.field2923 = new int[this.field2929];
        this.field2926 = new boolean[this.field2929];
        this.field2927 = new int[this.field2929][];
        for (int var4 = 0; var4 < this.field2929; var4++) {
            this.field2928[var4] = var3.method2628(49152);
        }
        for (int var5 = 0; var5 < this.field2929; var5++) {
            this.field2926[var5] = var3.method2628(49152) == 1;
        }
        for (int var6 = 0; var6 < this.field2929; var6++) {
            this.field2923[var6] = var3.method2631(2530);
        }
        for (int var7 = 0; var7 < this.field2929; var7++) {
            this.field2927[var7] = new int[var3.method2628(49152)];
        }
        for (int var8 = 0; var8 < this.field2929; var8++) {
            for (int var9 = 0; var9 < this.field2927[var8].length; var9++) {
                this.field2927[var8][var9] = var3.method2628(49152);
            }
        }
    }
}
