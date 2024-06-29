import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class302 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Lan;")
    public static class182 field3887 = new class182(9, 19);

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 4)
    public static final void method1780(int arg0, boolean arg1, String arg2) {
        field3888++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = -102 / ((arg0 - 13) / 38);
        int var6 = 0;
        int var7 = arg1 ? 32768 : 0;
        int var8 = var7 + (arg1 ? class674.field9178.field2720 : class674.field9178.field2721);
        for (int var9 = var7; var9 < var8; var9++) {
            class277 var12 = class674.field9178.method1302(var9, 1);
            if (var12.field3502 && var12.method1663((byte) -115).toLowerCase().indexOf(var3) != -1) {
                if (var6 >= 50) {
                    class721.field10154 = -1;
                    class114.field1405 = null;
                    return;
                }
                if (var6 >= var4.length) {
                    short[] var13 = new short[var4.length * 2];
                    for (int var14 = 0; var14 < var6; var14++) {
                        var13[var14] = var4[var14];
                    }
                    var4 = var13;
                }
                var4[var6++] = (short) var9;
            }
        }
        class627.field8739 = 0;
        class721.field10154 = var6;
        class114.field1405 = var4;
        String[] var10 = new String[class721.field10154];
        for (int var11 = 0; var11 < class721.field10154; var11++) {
            var10[var11] = class674.field9178.method1302(var4[var11], 1).method1663((byte) -115);
        }
        class680.method3656(var10, 79, class114.field1405);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ldt;)V", line = 80)
    public static final void method1781(class616 arg0) {
        class469.field6740 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 83)
    public static void method1782(int arg0) {
        field3887 = null;
        if (arg0 < 77) {
            field3889 = -107;
        }
    }
}
