import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class243 extends class251 {

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "Loe;")
    public static class127 field3650 = new class127(82, 10);

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "[[B")
    public static byte[][] field3654 = new byte[250][];

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field3656 = -1;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "Ljava/lang/String;")
    public String field3651;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "[C")
    public char[] field3645;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "[C")
    public char[] field3648;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "[I")
    public int[] field3644;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "[I")
    public int[] field3646;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lha;B)V", line = 10)
    public final void method1454(class40 arg0, byte arg1) {
        field3653++;
        if (arg1 != 108) {
            this.method1456(null, -27, -69);
        }
        while (true) {
            int var3 = arg0.method257((byte) 49);
            if (var3 == 0) {
                return;
            }
            this.method1456(arg0, var3, 0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(CZ)I", line = 38)
    public final int method1455(char arg0, boolean arg1) {
        field3643++;
        if (this.field3646 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3646.length; var3++) {
            if (this.field3645[var3] == arg0) {
                return this.field3646[var3];
            }
        }
        if (!arg1) {
            field3650 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lha;II)V", line = 62)
    private final void method1456(class40 arg0, int arg1, int arg2) {
        field3647++;
        if (arg2 != 0) {
            return;
        }
        if (arg1 == 1) {
            this.field3651 = arg0.method239(true);
        } else if (arg1 == 2) {
            int var7 = arg0.method257((byte) 80);
            this.field3646 = new int[var7];
            this.field3645 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3646[var8] = arg0.method254((byte) -102);
                byte var9 = arg0.method262(-2);
                this.field3645[var8] = var9 == 0 ? 0 : class349.method2126(-68, var9);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method257((byte) 35);
            this.field3648 = new char[var4];
            this.field3644 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3644[var5] = arg0.method254((byte) -31);
                byte var6 = arg0.method262(-2);
                this.field3648[var5] = var6 == 0 ? 0 : class349.method2126(-114, var6);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 126)
    public static void method1457(byte arg0) {
        field3650 = null;
        int var1 = -128 % ((-arg0 - 71) / 35);
        field3654 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(CI)I", line = 142)
    public final int method1458(char arg0, int arg1) {
        if (arg1 != 29849) {
            this.field3646 = null;
        }
        field3652++;
        if (this.field3644 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3644.length; var3++) {
            if (this.field3648[var3] == arg0) {
                return this.field3644[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V", line = 173)
    public final void method1459(int arg0) {
        if (arg0 > -28) {
            return;
        }
        if (this.field3644 != null) {
            for (int var2 = 0; var2 < this.field3644.length; var2++) {
                this.field3644[var2] = class318.method1973(this.field3644[var2], 32768);
            }
        }
        field3649++;
        if (this.field3646 != null) {
            for (int var3 = 0; var3 < this.field3646.length; var3++) {
                this.field3646[var3] = class318.method1973(this.field3646[var3], 32768);
            }
        }
    }
}
