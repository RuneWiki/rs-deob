import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class328 extends class418 {

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public int field4845;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public int field4844;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "[I")
    public int[] field4838;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "[I")
    public int[] field4836;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "[Z")
    public boolean[] field4835;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "[[I")
    public int[][] field4841;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "Lbo;")
    public static class453 field4842 = new class453(8);

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4846 = "Loaded defaults";

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BII)Lao;", line = 6)
    public static final class280 method2151(byte arg0, int arg1, int arg2) {
        field4843++;
        class280 var3 = new class280();
        if (arg0 != -69) {
            return null;
        }
        var3.field4120 = arg2 + 1 + 5;
        var3.field4106 = -1;
        var3.field4112 = arg1 + 1 + 5;
        var3.field4110 = -1;
        var3.field4115 = new int[var3.field4112][var3.field4120];
        var3.method1850(false);
        return var3;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)V", line = 32)
    public static final void method2152(byte arg0, int arg1) {
        field4839++;
        if (arg0 == -38) {
            class222.field3067 = -1;
            class248.field3655 = -1;
            class297.field4487 = arg1;
            class338.method2198((byte) 97);
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V", line = 48)
    public static void method2153(int arg0) {
        field4842 = null;
        field4846 = null;
        int var1 = -103 % ((-arg0 - 11) / 54);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZI)I", line = 68)
    public static final int method2154(boolean arg0, int arg1) {
        if (!arg0) {
            field4842 = null;
        }
        field4837++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(I[B)V", line = 79)
    public class328(int arg0, byte[] arg1) {
        this.field4845 = arg0;
        class341 var3 = new class341(arg1);
        this.field4844 = var3.method2233((byte) 104);
        this.field4838 = new int[this.field4844];
        this.field4836 = new int[this.field4844];
        this.field4835 = new boolean[this.field4844];
        this.field4841 = new int[this.field4844][];
        for (int var4 = 0; var4 < this.field4844; var4++) {
            this.field4838[var4] = var3.method2233((byte) 104);
        }
        for (int var5 = 0; var5 < this.field4844; var5++) {
            this.field4835[var5] = var3.method2233((byte) 104) == 1;
        }
        for (int var6 = 0; var6 < this.field4844; var6++) {
            this.field4836[var6] = var3.method2239(-1076227960);
        }
        for (int var7 = 0; var7 < this.field4844; var7++) {
            this.field4841[var7] = new int[var3.method2233((byte) 104)];
        }
        for (int var8 = 0; var8 < this.field4844; var8++) {
            for (int var9 = 0; var9 < this.field4841[var8].length; var9++) {
                this.field4841[var8][var9] = var3.method2233((byte) 104);
            }
        }
    }
}
