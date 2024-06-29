import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class486 extends class271 {

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "Ljava/lang/String;")
    public String field7187;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "[C")
    public char[] field7186;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "[C")
    public char[] field7188;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "[I")
    public int[] field7189;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "[I")
    public int[] field7190;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ldh;IB)V", line = 7)
    private final void method2882(class209 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field7187 = arg0.method1449(51);
        } else if (arg1 == 2) {
            int var4 = arg0.method1428(32122);
            this.field7188 = new char[var4];
            this.field7189 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7189[var5] = arg0.method1450((byte) 68);
                byte var6 = arg0.method1417(false);
                this.field7188[var5] = var6 == 0 ? 0 : class417.method2501(var6, (byte) -118);
            }
        } else if (arg1 == 3) {
            int var7 = arg0.method1428(arg2 + 32143);
            this.field7186 = new char[var7];
            this.field7190 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field7190[var8] = arg0.method1450((byte) 86);
                byte var9 = arg0.method1417(false);
                this.field7186[var8] = var9 == 0 ? 0 : class417.method2501(var9, (byte) -125);
            }
        }
        if (arg2 != -21) {
            this.method2882(null, -27, (byte) 94);
        }
        field7192++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BC)I", line = 72)
    public final int method2883(byte arg0, char arg1) {
        field7185++;
        if (this.field7189 == null) {
            return -1;
        }
        if (arg0 >= -41) {
            this.method2883((byte) 78, (char) 65452);
        }
        for (int var3 = 0; var3 < this.field7189.length; var3++) {
            if (this.field7188[var3] == arg1) {
                return this.field7189[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V", line = 101)
    public static final void method2884(byte arg0) {
        if (arg0 != -115) {
            method2887((byte) 80);
        }
        field7183++;
        class11.method76(false, 25);
        class366.method2274((byte) -51);
        System.gc();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 114)
    public final void method2885(int arg0) {
        field7184++;
        if (this.field7190 != null) {
            for (int var2 = 0; var2 < this.field7190.length; var2++) {
                this.field7190[var2] = class18.method119(this.field7190[var2], 32768);
            }
        }
        if (this.field7189 != null) {
            for (int var3 = 0; var3 < this.field7189.length; var3++) {
                this.field7189[var3] = class18.method119(this.field7189[var3], 32768);
            }
        }
        if (arg0 != 0) {
            this.field7187 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(CI)I", line = 143)
    public final int method2886(char arg0, int arg1) {
        field7181++;
        if (this.field7190 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field7190.length; var3++) {
            if (this.field7186[var3] == arg0) {
                return this.field7190[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(B)V", line = 165)
    public static final void method2887(byte arg0) {
        int var1 = 103 / ((arg0 - 64) / 35);
        for (int var2 = 0; var2 < class183.field2684.length; var2++) {
            for (int var3 = 0; var3 < class183.field2684[0].length; var3++) {
                for (int var4 = 0; var4 < class183.field2684[0][0].length; var4++) {
                    class183.field2684[var2][var3][var4] = 0;
                }
            }
        }
        field7191++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ldh;I)V", line = 203)
    public final void method2888(class209 arg0, int arg1) {
        field7182++;
        if (arg1 != 10015) {
            this.method2885(1);
        }
        while (true) {
            int var3 = arg0.method1428(arg1 ^ 0x5A65);
            if (var3 == 0) {
                return;
            }
            this.method2882(arg0, var3, (byte) -21);
        }
    }
}
