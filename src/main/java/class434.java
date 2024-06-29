import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public abstract class class434 extends class98 {

    @OriginalMember(owner = "client!vaa", name = "H", descriptor = "I")
    public int field6596;

    @OriginalMember(owner = "client!vaa", name = "J", descriptor = "I")
    public static int field6598 = 1400;

    @OriginalMember(owner = "client!vaa", name = "I", descriptor = "Lhl;")
    public static class489 field6597 = new class489(14, 1);

    @OriginalMember(owner = "client!vaa", name = "L", descriptor = "Lhl;")
    public static class489 field6600 = new class489(15, 4);

    @OriginalMember(owner = "client!vaa", name = "M", descriptor = "Lhl;")
    public static class489 field6601 = new class489(16, -2);

    @OriginalMember(owner = "client!vaa", name = "N", descriptor = "Lhl;")
    public static class489 field6602 = new class489(17, 0);

    @OriginalMember(owner = "client!vaa", name = "O", descriptor = "Lhl;")
    public static class489 field6603 = new class489(18, -2);

    @OriginalMember(owner = "client!vaa", name = "P", descriptor = "Lhl;")
    public static class489 field6604 = new class489(19, -2);

    @OriginalMember(owner = "client!vaa", name = "Q", descriptor = "Lhl;")
    public static class489 field6605 = new class489(20, 6);

    @OriginalMember(owner = "client!vaa", name = "R", descriptor = "Lhl;")
    public static class489 field6606 = new class489(21, 9);

    @OriginalMember(owner = "client!vaa", name = "S", descriptor = "Lhl;")
    public static class489 field6607 = new class489(22, -2);

    @OriginalMember(owner = "client!vaa", name = "T", descriptor = "Lhl;")
    public static class489 field6608 = new class489(23, 4);

    @OriginalMember(owner = "client!vaa", name = "V", descriptor = "Lhl;")
    public static class489 field6609 = new class489(24, -1);

    @OriginalMember(owner = "client!vaa", name = "W", descriptor = "Lhl;")
    public static class489 field6610 = new class489(25, -2);

    @OriginalMember(owner = "client!vaa", name = "X", descriptor = "Lhl;")
    public static class489 field6611 = new class489(26, 0);

    @OriginalMember(owner = "client!vaa", name = "Y", descriptor = "Lhl;")
    public static class489 field6612 = new class489(27, 0);

    @OriginalMember(owner = "client!vaa", name = "Z", descriptor = "[Lhl;")
    private static class489[] field6613 = new class489[32];

    @OriginalMember(owner = "client!vaa", name = "E", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!vaa", name = "F", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!vaa", name = "G", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!vaa", name = "K", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)Z")
    public abstract boolean method1253(int arg0);

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)V")
    public static final void method2760(int arg0, int arg1) {
        field6599++;
        class413 var2 = class674.method3852(11, arg1, 123);
        if (arg0 > -107) {
            field6601 = null;
        }
        var2.method2634(1065768928);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "([BI)Luda;")
    public static final class417 method2761(byte[] arg0, int arg1) {
        if (arg1 != -22) {
            field6605 = null;
        }
        field6593++;
        class417 var2 = new class417();
        class6 var3 = new class6(arg0);
        var3.field57 = var3.field96.length - 2;
        int var4 = var3.method67(arg1 + 12043);
        int var5 = var3.field96.length - var4 - 14;
        var3.field57 = var5;
        int var6 = var3.method72(-82);
        var2.field6382 = var3.method67(arg1 + 12043);
        var2.field6380 = var3.method67(12021);
        var2.field6377 = var3.method67(12021);
        var2.field6378 = var3.method67(arg1 + 12043);
        int var7 = var3.method70(-9059);
        if (var7 > 0) {
            var2.field6383 = new class200[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method67(12021);
                class200 var10 = new class200(class413.method2636(var9, 127));
                var2.field6383[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method72(arg1 ^ 0x1);
                    int var12 = var3.method72(arg1 ^ 0x3C);
                    var10.method1564((long) var11, new class160(var12), (byte) 89);
                }
            }
        }
        var3.field57 = 0;
        var2.field6376 = var3.method44(-119);
        var2.field6375 = new int[var6];
        var2.field6385 = new int[var6];
        var2.field6379 = new String[var6];
        int var13 = 0;
        while (var5 > var3.field57) {
            int var14 = var3.method67(arg1 + 12043);
            if (var14 == 3) {
                var2.field6379[var13] = var3.method42((byte) -99).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field6385[var13] = var3.method70(-9059);
            } else {
                var2.field6385[var13] = var3.method72(arg1 - 21);
            }
            var2.field6375[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(I)V")
    public class434(int arg0) {
        this.field6596 = arg0;
    }

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1252(int arg0);

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "(B)V")
    public static void method2762(byte arg0) {
        field6601 = null;
        field6609 = null;
        field6608 = null;
        field6611 = null;
        field6603 = null;
        field6602 = null;
        field6597 = null;
        field6604 = null;
        field6607 = null;
        field6600 = null;
        field6606 = null;
        field6612 = null;
        if (arg0 != 55) {
            field6604 = null;
        }
        field6605 = null;
        field6610 = null;
        field6613 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIBI)V")
    public static final void method2763(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 63) {
            field6610 = null;
        }
        class690.field9676 = new byte[arg1][arg3][arg0];
        field6595++;
    }

    static {
        class489[] var0 = class51.method578(-115);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field6613[var0[var1].field7155] = var0[var1];
        }
    }
}
