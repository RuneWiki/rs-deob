import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class47 extends class217 {

    @OriginalMember(owner = "client!d", name = "wb", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!d", name = "pb", descriptor = "Lsb;")
    private static class98 field782 = method368("Members object", 0);

    @OriginalMember(owner = "client!d", name = "zb", descriptor = "Lsb;")
    public static class98 field792 = field782;

    @OriginalMember(owner = "client!d", name = "ob", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!d", name = "qb", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!d", name = "sb", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!d", name = "tb", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!d", name = "vb", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!d", name = "xb", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!d", name = "yb", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!d", name = "ub", descriptor = "Lac;")
    public static class188 field787;

    @OriginalMember(owner = "client!d", name = "rb", descriptor = "[I")
    public static int[] field784;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(B)V")
    public static void method366(byte arg0) {
        field784 = null;
        field782 = null;
        if (arg0 != -2) {
            field792 = null;
        }
        field787 = null;
        field792 = null;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(III)V")
    public static final void method367(int arg0, int arg1, int arg2) {
        class237.field4084.method490(53, -54);
        if (arg1 > 65) {
            ++class224.field3863;
            ++field781;
            class237.field4084.method1474(arg2, 255);
            class237.field4084.method1460(arg0, 16851);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;I)Lsb;")
    public static final class98 method368(String arg0, int arg1) {
        ++field783;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class98 var4 = new class98();
        int var5 = arg1;
        var4.field1733 = new byte[var3];
        while (var5 < var3) {
            int var6 = var2[var5++] & 255;
            if (var6 <= 45 && var6 >= 40) {
                if (~var3 >= ~var5) {
                    break;
                }
                int var7 = var2[var5++] & 255;
                var4.field1733[var4.field1694++] = (byte) ((var6 + -40) * 43 + var7 + -48);
            } else if (var6 != 0) {
                var4.field1733[var4.field1694++] = (byte) var6;
            }
        }
        var4.method718((byte) 93);
        return var4.method706((byte) -110);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        } else {
            int[][] var3 = super.field3834.method627(4103, arg0);
            ++field788;
            if (super.field3834.field1486 && this.method1499(-28)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg0 % super.field3743 * super.field3743;
                for (int var8 = 0; ~class13.field253 < ~var8; ++var8) {
                    int var9 = super.field3749[var7 - -(var8 % super.field3736)];
                    var6[var8] = class214.method1427(4080, var9 << 4);
                    var5[var8] = class214.method1427(var9 >> 4, 4080);
                    var4[var8] = class214.method1427(var9, 16711680) >> 12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)I")
    public static final int method369(int arg0, int arg1, int arg2, int arg3) {
        ++field785;
        if (arg0 != 2) {
            return -124;
        } else if (~arg1 > ~arg2) {
            return arg2;
        } else {
            return arg1 <= arg3 ? arg1 : arg3;
        }
    }
}
