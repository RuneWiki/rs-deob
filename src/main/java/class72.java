import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class72 extends class98 {

    @OriginalMember(owner = "client!haa", name = "O", descriptor = "Lws;")
    public static class328 field914 = new class328(9, 2);

    @OriginalMember(owner = "client!haa", name = "Q", descriptor = "[I")
    public static int[] field916 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!haa", name = "G", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!haa", name = "J", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!haa", name = "L", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!haa", name = "M", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!haa", name = "P", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!haa", name = "E", descriptor = "Ljava/lang/String;")
    public String field905;

    @OriginalMember(owner = "client!haa", name = "F", descriptor = "[C")
    public char[] field906;

    @OriginalMember(owner = "client!haa", name = "N", descriptor = "[C")
    public char[] field913;

    @OriginalMember(owner = "client!haa", name = "I", descriptor = "[I")
    public int[] field908;

    @OriginalMember(owner = "client!haa", name = "K", descriptor = "[I")
    public int[] field910;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(CI)I", line = 6)
    public final int method732(char arg0, int arg1) {
        field911++;
        if (this.field910 == null) {
            return -1;
        }
        if (arg1 != -1) {
            this.method734(null, (byte) 122, -115);
        }
        for (int var3 = 0; var3 < this.field910.length; var3++) {
            if (this.field906[var3] == arg0) {
                return this.field910[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BC)I", line = 31)
    public final int method733(byte arg0, char arg1) {
        int var3 = -52 % ((62 - arg0) / 56);
        field915++;
        if (this.field908 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field908.length; var4++) {
            if (this.field913[var4] == arg1) {
                return this.field908[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lie;BI)V", line = 54)
    private final void method734(class6 arg0, byte arg1, int arg2) {
        field907++;
        if (arg1 >= -8) {
            this.method732('e', 45);
        }
        if (arg2 == 1) {
            this.field905 = arg0.method42((byte) -98);
        } else if (arg2 == 2) {
            int var7 = arg0.method70(-9059);
            this.field906 = new char[var7];
            this.field910 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field910[var8] = arg0.method67(12021);
                byte var9 = arg0.method81(true);
                this.field906[var8] = var9 == 0 ? 0 : class457.method2868(57, var9);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method70(-9059);
            this.field908 = new int[var4];
            this.field913 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field908[var5] = arg0.method67(12021);
                byte var6 = arg0.method81(true);
                this.field913[var5] = var6 == 0 ? 0 : class457.method2868(105, var6);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V", line = 122)
    public final void method735(int arg0) {
        if (this.field908 != null) {
            for (int var2 = 0; var2 < this.field908.length; var2++) {
                this.field908[var2] = class81.method769(this.field908[var2], 32768);
            }
        }
        if (arg0 != -1) {
            return;
        }
        field909++;
        if (this.field910 != null) {
            for (int var3 = 0; var3 < this.field910.length; var3++) {
                this.field910[var3] = class81.method769(this.field910[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "(B)V", line = 152)
    public static void method736(byte arg0) {
        if (arg0 < -94) {
            field916 = null;
            field914 = null;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BLie;)V", line = 164)
    public final void method737(byte arg0, class6 arg1) {
        while (true) {
            int var3 = arg1.method70(-9059);
            if (var3 == 0) {
                field912++;
                if (arg0 != -114) {
                    this.method735(-85);
                    return;
                }
                return;
            }
            this.method734(arg1, (byte) -20, var3);
        }
    }
}
