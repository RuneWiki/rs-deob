import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class265 {

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field3999 = 0;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ZZLjava/lang/String;)V", line = 7)
    public static final void method1707(boolean arg0, boolean arg1, String arg2) {
        field3996++;
        String var3 = arg2.toLowerCase();
        if (arg0) {
            field3999 = 27;
        }
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class363.field5277.field7673 : class363.field5277.field7672) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class268 var11 = class363.field5277.method3120(-49, var8);
            if (var11.field4024 && var11.method1728(-1).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class86.field1398 = null;
                    class27.field385 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class86.field1398 = var4;
        class98.field1542 = 0;
        class27.field385 = var5;
        String[] var9 = new String[class27.field385];
        for (int var10 = 0; var10 < class27.field385; var10++) {
            var9[var10] = class363.field5277.method3120(113, var4[var10]).method1728(-1);
        }
        class376.method2295(class86.field1398, 64, var9);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(III)I", line = 81)
    public static final int method1708(int arg0, int arg1, int arg2) {
        field3998++;
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg1 <= 30) {
            method1708(78, 34, -85);
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)I", line = 106)
    public static final int method1709(int arg0, int arg1) {
        if (arg0 != 127) {
            method1709(119, 20);
        }
        field3997++;
        return arg1 >> 11 & 0x7F;
    }
}
