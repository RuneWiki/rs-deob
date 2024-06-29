import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class303 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field4837 = 0;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4838 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "[I")
    public static int[] field4840 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static final void method2011(int arg0) {
        field4839++;
        int var1 = class131.field2053.method831(8, true);
        if (class13.field145 > var1) {
            for (int var2 = var1; var2 < class13.field145; var2++) {
                class108.field1724[class244.field3873++] = class259.field4176[var2];
            }
        }
        if (class13.field145 < var1) {
            throw new RuntimeException("gppov1");
        }
        if (arg0 != 61440) {
            field4837 = -100;
        }
        class13.field145 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class259.field4176[var3];
            class299 var5 = class270.field4355[var4];
            int var6 = class131.field2053.method831(1, true);
            if (var6 == 0) {
                class259.field4176[class13.field145++] = var4;
                var5.field695 = class29.field360;
            } else {
                int var7 = class131.field2053.method831(2, true);
                if (var7 == 0) {
                    class259.field4176[class13.field145++] = var4;
                    var5.field695 = class29.field360;
                    class40.field584[class69.field1145++] = var4;
                } else if (var7 == 1) {
                    class259.field4176[class13.field145++] = var4;
                    var5.field695 = class29.field360;
                    int var8 = class131.field2053.method831(3, true);
                    var5.method288((byte) 33, 1, var8);
                    int var9 = class131.field2053.method831(1, true);
                    if (var9 == 1) {
                        class40.field584[class69.field1145++] = var4;
                    }
                } else if (var7 == 2) {
                    class259.field4176[class13.field145++] = var4;
                    var5.field695 = class29.field360;
                    if (class131.field2053.method831(1, true) == 1) {
                        int var10 = class131.field2053.method831(3, true);
                        var5.method288((byte) 33, 2, var10);
                        int var11 = class131.field2053.method831(3, true);
                        var5.method288((byte) 98, 2, var11);
                    } else {
                        int var12 = class131.field2053.method831(3, true);
                        var5.method288((byte) 35, 0, var12);
                    }
                    int var13 = class131.field2053.method831(1, true);
                    if (var13 == 1) {
                        class40.field584[class69.field1145++] = var4;
                    }
                } else if (var7 == 3) {
                    class108.field1724[class244.field3873++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)I")
    public static final int method2012(int arg0, int arg1) {
        if (arg0 != 24943) {
            field4840 = null;
        }
        field4841++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method2013(byte arg0) {
        field4840 = null;
        field4838 = null;
        if (arg0 > -27) {
            method2011(32);
        }
    }
}
