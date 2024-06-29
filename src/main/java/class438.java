import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class438 extends class4 {

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field6108 = new String[100];

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "Ljava/lang/String;")
    public String field6120;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "[C")
    public char[] field6109;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "[C")
    public char[] field6111;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "[I")
    public int[] field6106;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "[I")
    public static int[] field6113;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "[I")
    public int[] field6118;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "[[B")
    public static byte[][] field6117;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(CI)I")
    public final int method2693(char arg0, int arg1) {
        field6115++;
        if (this.field6118 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field6118.length; var3++) {
            if (this.field6109[var3] == arg0) {
                return this.field6118[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Lmga;")
    public static final class30 method2694(int arg0, int arg1) {
        field6105++;
        class30[] var2 = class197.method1209(arg1 + arg1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class30 var4 = var2[var3];
            if (var4.field360 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILdc;I)V")
    private final void method2695(int arg0, class63 arg1, int arg2) {
        if (arg2 <= 32) {
            return;
        }
        field6114++;
        if (arg0 == 1) {
            this.field6120 = arg1.method479((byte) -87);
        } else if (arg0 == 2) {
            int var7 = arg1.method505((byte) -119);
            this.field6111 = new char[var7];
            this.field6106 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field6106[var8] = arg1.method482(-772591672);
                byte var9 = arg1.method491(false);
                this.field6111[var8] = var9 == 0 ? 0 : class211.method1253(64, var9);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method505((byte) -119);
            this.field6118 = new int[var4];
            this.field6109 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6118[var5] = arg1.method482(-772591672);
                byte var6 = arg1.method491(false);
                this.field6109[var5] = var6 == 0 ? 0 : class211.method1253(64, var6);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public final void method2696(int arg0) {
        field6116++;
        if (this.field6118 != null) {
            for (int var2 = 0; var2 < this.field6118.length; var2++) {
                this.field6118[var2] = class678.method3817(this.field6118[var2], 32768);
            }
        }
        if (this.field6106 != null) {
            for (int var3 = 0; var3 < this.field6106.length; var3++) {
                this.field6106[var3] = class678.method3817(this.field6106[var3], 32768);
            }
        }
        if (arg0 != 32768) {
            this.field6118 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method2697(byte arg0) {
        field6108 = null;
        field6117 = null;
        field6113 = null;
        if (arg0 != -28) {
            field6113 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)Z")
    public static final boolean method2698(int arg0, int arg1) {
        field6110++;
        if (arg0 > -44) {
            return true;
        } else {
            return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(CI)I")
    public final int method2699(char arg0, int arg1) {
        field6104++;
        if (this.field6106 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field6106.length; var3++) {
            if (this.field6111[var3] == arg0) {
                return this.field6106[var3];
            }
        }
        if (arg1 != -1) {
            this.field6120 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(ILdc;)V")
    public final void method2700(int arg0, class63 arg1) {
        if (arg0 != 4) {
            return;
        }
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                field6119++;
                return;
            }
            this.method2695(var3, arg1, 80);
        }
    }
}
