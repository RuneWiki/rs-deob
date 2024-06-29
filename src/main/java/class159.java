import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class159 {

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "Lwb;")
    public class308 field1880;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "[Lku;")
    public static class350[] field1879;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Loa;B)V")
    public static final void method982(class650 arg0, byte arg1) {
        field1883++;
        if (arg1 >= -120) {
            field1879 = null;
        }
        arg0.method403(0, 0, class309.field3890, 350);
        arg0.method475(0, 0, class309.field3890, 350, class127.field1547 << 24 | 0x332277, 1);
        int var2 = 350 / class461.field5748;
        if (class209.field2475 > 0) {
            int var3 = 346 - class461.field5748 - 4;
            int var4 = var2 * var3 / (var2 + class209.field2475 - 1);
            int var5 = 4;
            if (class209.field2475 > 1) {
                var5 += (class209.field2475 - class15.field148 - 1) * (var3 - var4) / (class209.field2475 - 1);
            }
            arg0.method475(class309.field3890 - 16, var5, 12, var4, class127.field1547 << 24 | 0x332277, 2);
            for (int var6 = class15.field148; class15.field148 + var2 > var6 && class209.field2475 > var6; var6++) {
                String[] var7 = class112.method774('\b', 1, class350.field4526[var6]);
                int var8 = (class309.field3890 - 8 - 16) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method403(var10, 0, var10 + var8 - 8, 350);
                    class616.field8348.method1165((byte) -32, 350 - ((var6 - class15.field148) * class461.field5748) - (class126.field1543 - (-2 - class321.field3994.field225)), -1, var10, -16777216, var7[var9]);
                }
            }
        }
        arg0.method403(0, 0, class309.field3890, 350);
        arg0.method3634(-1, class309.field3890, 0, 350 - class126.field1543, 45365);
        class336.field4143.method1165((byte) -32, 350 - class36.field540.field225 - 1, -1, 10, -16777216, "--> " + class229.field2957);
        if (!class205.field2372) {
            return;
        }
        int var11 = -1;
        if ((class665.field9027 % 30) > 15) {
            var11 = 16777215;
        }
        arg0.method3626(0, 12, var11, class36.field540.method127("--> " + class229.field2957.substring(0, class608.field8289), (byte) -66) + 10, -class36.field540.field225 + 350 - 11);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
    public static final void method983(int arg0, int arg1) {
        if (arg1 == 37) {
            class604.field8111 = 3.0F;
        } else if (arg1 == 50) {
            class604.field8111 = 4.0F;
        } else if (arg1 == 75) {
            class604.field8111 = 6.0F;
        } else if (arg1 == 100) {
            class604.field8111 = 8.0F;
        } else if (arg1 == 200) {
            class604.field8111 = 16.0F;
        }
        field1882++;
        class80.field1043 = -1;
        class80.field1043 = -1;
        if (arg0 != -8) {
            field1879 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILoa;)V")
    public static final void method984(int arg0, class650 arg1) {
        field1881++;
        for (class18 var2 = (class18) class171.field2002.method1715((byte) 121); var2 != null; var2 = (class18) class171.field2002.method1712((byte) 126)) {
            if (var2.field192) {
                var2.method100(arg1);
            }
        }
        if (arg0 != 3351159) {
            field1879 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
    public static void method985(byte arg0) {
        if (arg0 != 12) {
            method985((byte) 57);
        }
        field1879 = null;
    }
}
