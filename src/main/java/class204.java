import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class204 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Lik;")
    public static class267 field3067 = new class267(64);

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[I")
    public static int[] field3069 = new int[4];

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3070 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Lpf;")
    public static class294 field3071;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZIIII)V")
    public static final void method1294(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3066++;
        if (arg4 != 64) {
            method1294(true, 119, 120, 75, 22);
        }
        if (class294.method1943((byte) 124, arg3)) {
            class39.method230(class234.field3532[arg3], arg2, arg0, 0, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1295(int arg0) {
        if (arg0 == 1610612736) {
            field3069 = null;
            field3071 = null;
            field3067 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIZ)V")
    public static final void method1296(int arg0, int arg1, boolean arg2) {
        field3068++;
        class159 var3 = class251.field3816[class99.field1557][arg1][arg0];
        if (var3 == null) {
            class120.method760(class99.field1557, arg1, arg0);
        } else if (arg2) {
            class146 var4 = null;
            class146 var5 = (class146) var3.method983(7);
            int var6 = -99999999;
            while (var5 != null) {
                class43 var13 = class160.method999(var5.field2128.field3577, 0);
                int var14 = var13.field668;
                if (var13.field648 == 1) {
                    var14 = (var5.field2128.field3574 + 1) * var14;
                }
                if (var14 > var6) {
                    var6 = var14;
                    var4 = var5;
                }
                var5 = (class146) var3.method985((byte) 119);
            }
            if (var4 == null) {
                class120.method760(class99.field1557, arg1, arg0);
            } else {
                var3.method982((byte) 114, var4);
                class146 var7 = (class146) var3.method983(7);
                class237 var8 = null;
                class237 var9 = null;
                while (var7 != null) {
                    class237 var12 = var7.field2128;
                    if (var4.field2128.field3577 != var12.field3577) {
                        if (var8 == null) {
                            var8 = var12;
                        }
                        if (var8.field3577 != var12.field3577 && var9 == null) {
                            var9 = var12;
                        }
                    }
                    var7 = (class146) var3.method985((byte) 122);
                }
                long var10 = (long) ((arg0 << 7) + arg1 + 1610612736);
                class237.method1505(class99.field1557, arg1, arg0, class183.method1139(class99.field1557, arg0 * 128 + 64, arg1 * 128 + 64, (byte) 117), var4.field2128, var10, var8, var9);
            }
        }
    }
}
