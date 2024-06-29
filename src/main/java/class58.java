import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class58 extends class287 {

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    private int field1105;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "[Z")
    public boolean[] field1102;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "[[I")
    public int[][] field1112;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "[I")
    public int[] field1107;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Lmh;")
    private static class128 field1104 = class22.method156(125, " from your friend list first)3");

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field1106 = 0;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Lmh;")
    public static class128 field1114 = class22.method156(126, "hitbar_default");

    @OriginalMember(owner = "client!de", name = "F", descriptor = "Lmh;")
    public static class128 field1116 = class22.method156(123, "k");

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Lmh;")
    public static class128 field1113 = class22.method156(125, " x ");

    @OriginalMember(owner = "client!de", name = "A", descriptor = "Lmh;")
    public static class128 field1111 = class22.method156(123, "Fallen lassen");

    @OriginalMember(owner = "client!de", name = "H", descriptor = "Lmh;")
    public static class128 field1118 = field1104;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "[I")
    public static int[] field1110;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)I", line = 19)
    public static final int method383(byte arg0, int arg1) {
        field1117++;
        if (arg0 >= -24) {
            return 18;
        }
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)Lqf;", line = 42)
    public static final class140 method384(byte arg0) {
        if (arg0 != 107) {
            method384((byte) 16);
        }
        class47.field953 = 0;
        field1108++;
        return class17.method130((byte) 111);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 58)
    public static void method385(int arg0) {
        field1113 = null;
        if (arg0 >= -77) {
            return;
        }
        field1114 = null;
        field1116 = null;
        field1111 = null;
        field1104 = null;
        field1110 = null;
        field1118 = null;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)Z", line = 79)
    public static final boolean method386(int arg0) {
        field1109++;
        if (arg0 < 41) {
            field1115 = 103;
        }
        if (class289.field4949) {
            try {
                return !(Boolean) class278.field4803.method843(true, class288.field4925.field4677);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(I[B)V", line = 122)
    public class58(int arg0, byte[] arg1) {
        this.field1103 = arg0;
        class194 var3 = new class194(arg1);
        this.field1105 = var3.method1325(7627);
        this.field1102 = new boolean[this.field1105];
        this.field1112 = new int[this.field1105][];
        this.field1107 = new int[this.field1105];
        for (int var4 = 0; var4 < this.field1105; var4++) {
            this.field1107[var4] = var3.method1325(7627);
        }
        for (int var5 = 0; var5 < this.field1105; var5++) {
            this.field1102[var5] = var3.method1325(7627) == 1;
        }
        for (int var6 = 0; var6 < this.field1105; var6++) {
            this.field1112[var6] = new int[var3.method1325(7627)];
        }
        for (int var7 = 0; var7 < this.field1105; var7++) {
            for (int var8 = 0; var8 < this.field1112[var7].length; var8++) {
                this.field1112[var7][var8] = var3.method1325(7627);
            }
        }
    }
}
