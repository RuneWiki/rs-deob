import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class653 {

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field9224 = new String[200];

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lpj;IIIZIB)V", line = 3)
    public static final void method3630(class132 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6) {
        class674.field9486 = arg1;
        if (arg6 <= 54) {
            return;
        }
        class222.field3213 = arg4;
        class7.field68 = arg0;
        class630.field8791 = arg3;
        class457.field6471 = arg2;
        field9223++;
        class599.field8326 = arg5;
        class268.field3802 = 1;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILql;)I", line = 23)
    public static final int method3631(int arg0, class674 arg1) {
        if (arg0 != 11) {
            return -78;
        }
        field9226++;
        int var2 = arg1.method3726(2, 8);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method3726(5, 8);
        } else if (var2 == 2) {
            var3 = arg1.method3726(8, 8);
        } else {
            var3 = arg1.method3726(11, 8);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V", line = 58)
    public static final void method3632(byte arg0) {
        field9225++;
        int var1 = class298.field4458.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class298.field4458[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class176.field2619; var4++) {
                    if (class403.field5675[var4] == class234.field3367[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class403.field5675[class176.field2619] = class234.field3367[var2];
                    var3 = class176.field2619++;
                }
                class96 var5 = new class96(class298.field4458[var2]);
                int var6 = 0;
                while (class298.field4458[var2].length > var5.field1301 && var6 < 511 && class602.field8365 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method743((byte) -108);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class234.field3367[var2] >> 8) * 64 + var10 - class511.field6989;
                    int var13 = (class234.field3367[var2] & 0xFF) * 64 + var11 - class124.field1726;
                    class161 var14 = class648.field9185.method1493(var5.method743((byte) -68), (byte) -71);
                    class178 var15 = (class178) class323.field4762.method2061(arg0 ^ 0x43F9, (long) var7);
                    if (var15 == null && (var14.field2466 & 0x1) > 0 && class122.field1683 == var9 && var12 >= 0 && (var14.field2463 + var12) < class86.field1185 && var13 >= 0 && (var14.field2463 + var13) < class526.field7212) {
                        class225 var16 = new class225();
                        var16.field6388 = var7;
                        class178 var17 = new class178(var16);
                        class323.field4762.method2063((long) var7, 1, var17);
                        class252.field3537[class679.field9578++] = var17;
                        class594.field8262[class602.field8365++] = var7;
                        var16.field6440 = class239.field3440;
                        var16.method1443(arg0 + 98, var14);
                        var16.method2638(arg0 ^ 0xFFFFB6F1, var16.field3245.field2463);
                        var16.field6394 = var16.field3245.field2407 << 3;
                        var16.method2644(-120, var16.field3245.field2415 + 4 << 11 & 0x3997, true);
                        var16.method1439(var16.method1722((byte) -119), var9, var12, 127, true, var13);
                    }
                }
            }
        }
        if (arg0 != -98) {
            method3632((byte) 62);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V", line = 156)
    public static void method3633(int arg0) {
        int var1 = -9 / ((-arg0 - 31) / 44);
        field9224 = null;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIII)I", line = 165)
    public static final int method3634(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 36) {
            return -2;
        } else {
            field9227++;
            int var4 = ((arg2 & 0xFF00FF) * arg3 & 0xFF00FF00 | (arg2 & 0xFF00) * arg3 & 0xFF0000) >>> 8;
            int var5 = 255 - arg3;
            return (((arg0 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg0 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        }
    }
}
