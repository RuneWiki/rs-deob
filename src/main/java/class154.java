import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class154 extends class28 {

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "[Z")
    public boolean[] field1915;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "[I")
    public int[] field1916;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "[[I")
    public int[][] field1917;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "[I")
    public int[] field1911;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lvi;")
    public static class560 field1910 = new class560(8);

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field1913 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static final void method1026(byte arg0) {
        class367.field5272.method3142(false);
        int var1 = -40 % ((arg0 + 34) / 62);
        field1914++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method1027(int arg0) {
        field1910 = null;
        if (arg0 != 10716) {
            field1910 = null;
        }
        field1913 = null;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I[B)V")
    public class154(int arg0, byte[] arg1) {
        this.field1912 = arg0;
        class138 var3 = new class138(arg1);
        this.field1918 = var3.method957((byte) -63);
        this.field1915 = new boolean[this.field1918];
        this.field1916 = new int[this.field1918];
        this.field1917 = new int[this.field1918][];
        this.field1911 = new int[this.field1918];
        for (int var4 = 0; var4 < this.field1918; var4++) {
            this.field1911[var4] = var3.method957((byte) -115);
            if (this.field1911[var4] == 6) {
                this.field1911[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field1918; var5++) {
            this.field1915[var5] = var3.method957((byte) -122) == 1;
        }
        for (int var6 = 0; var6 < this.field1918; var6++) {
            this.field1916[var6] = var3.method922((byte) -127);
        }
        for (int var7 = 0; var7 < this.field1918; var7++) {
            this.field1917[var7] = new int[var3.method957((byte) -74)];
        }
        for (int var8 = 0; var8 < this.field1918; var8++) {
            for (int var9 = 0; var9 < this.field1917[var8].length; var9++) {
                this.field1917[var8][var9] = var3.method957((byte) -121);
            }
        }
    }
}
