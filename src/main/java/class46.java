import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 extends class32 {

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "[I")
    public int[] field1052;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "[[I")
    public int[][] field1056;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Lv;")
    private static class146 field1054 = class159.method1226((byte) -37, "Loading title screen )2 ");

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lv;")
    public static class146 field1050 = field1054;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field1059 = 0;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lua;")
    public static class140 field1055 = new class140(20);

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field1065 = 0;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "Lv;")
    public static class146 field1061 = class159.method1226((byte) -37, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "Lv;")
    private static class146 field1064 = class159.method1226((byte) -37, "flash2:");

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "Lv;")
    public static class146 field1067 = class159.method1226((byte) -37, "mn");

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "Lv;")
    public static class146 field1060 = field1064;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "Lv;")
    public static class146 field1062 = field1064;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "Lcf;")
    public static class21 field1068;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "[[B")
    public static byte[][] field1063;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)Lfa;")
    public static final class37 method316(boolean arg0, int arg1) {
        field1057++;
        class37 var2 = (class37) class90.field2140.method1045((long) arg1, 127);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class98.field2361.method585(16, 118, arg1);
        class37 var4 = new class37();
        if (!arg0) {
            method317((byte) -75);
        }
        if (var3 != null) {
            var4.method248(new class95(var3), -19402);
        }
        class90.field2140.method1047(-1, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method317(byte arg0) {
        field1063 = null;
        field1050 = null;
        field1061 = null;
        field1062 = null;
        field1060 = null;
        field1067 = null;
        field1055 = null;
        if (arg0 == 50) {
            field1054 = null;
            field1064 = null;
            field1068 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public static final void method318(int arg0) {
        if (arg0 >= 97) {
            class90.field2140.method1050(true);
            field1051++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Z")
    public static final boolean method319(int arg0, int arg1) {
        if (arg1 != -49) {
            method317((byte) -89);
        }
        field1053++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIII)I")
    public static final int method320(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 80 / ((-arg0 - 22) / 51);
        field1066++;
        if ((class74.field1772[arg2][arg1][arg3] & 0x8) == 0) {
            return arg2 <= 0 || (class74.field1772[1][arg1][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I[B)V")
    public class46(int arg0, byte[] arg1) {
        this.field1058 = arg0;
        class95 var3 = new class95(arg1);
        this.field1049 = var3.method790((byte) 73);
        this.field1052 = new int[this.field1049];
        this.field1056 = new int[this.field1049][];
        for (int var4 = 0; var4 < this.field1049; var4++) {
            this.field1052[var4] = var3.method790((byte) 73);
        }
        for (int var5 = 0; var5 < this.field1049; var5++) {
            this.field1056[var5] = new int[var3.method790((byte) 73)];
        }
        for (int var6 = 0; var6 < this.field1049; var6++) {
            for (int var7 = 0; var7 < this.field1056[var6].length; var7++) {
                this.field1056[var6][var7] = var3.method790((byte) 73);
            }
        }
    }
}
