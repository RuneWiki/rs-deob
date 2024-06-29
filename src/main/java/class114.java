import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class114 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Le;")
    public static class191 field1883 = class54.method368(")4", 2047);

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field1889 = -1;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field1886 = 0;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field1885 = -1;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Le;")
    public static class191 field1890 = class54.method368("welle2:", 2047);

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lng;")
    public static class121 field1891;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field1884;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B[B)V")
    public static final void method726(byte arg0, byte[] arg1) {
        field1892++;
        class225 var2 = new class225(arg1);
        var2.field3996 = arg1.length - 2;
        class232.field4145 = var2.method1593(true);
        class68.field1183 = new int[class232.field4145];
        class47.field842 = new int[class232.field4145];
        class240.field4273 = new boolean[class232.field4145];
        class161.field2731 = new byte[class232.field4145][];
        class245.field4360 = new int[class232.field4145];
        if (arg0 != 111) {
            field1884 = null;
        }
        class253.field4489 = new int[class232.field4145];
        class61.field1098 = new byte[class232.field4145][];
        var2.field3996 = arg1.length - (class232.field4145 * 8) - 7;
        class36.field661 = var2.method1593(true);
        class3.field22 = var2.method1593(true);
        int var3 = (var2.method1580(arg0 ^ 0xFFFFFFD7) & 0xFF) + 1;
        for (int var4 = 0; var4 < class232.field4145; var4++) {
            class253.field4489[var4] = var2.method1593(true);
        }
        for (int var5 = 0; var5 < class232.field4145; var5++) {
            class245.field4360[var5] = var2.method1593(true);
        }
        for (int var6 = 0; var6 < class232.field4145; var6++) {
            class68.field1183[var6] = var2.method1593(true);
        }
        for (int var7 = 0; var7 < class232.field4145; var7++) {
            class47.field842[var7] = var2.method1593(true);
        }
        var2.field3996 = (arg1.length - 7) + 3 - (class232.field4145 * 8) - var3 * 3;
        class19.field261 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class19.field261[var8] = var2.method1591(2);
            if (class19.field261[var8] == 0) {
                class19.field261[var8] = 1;
            }
        }
        var2.field3996 = 0;
        for (int var9 = 0; var9 < class232.field4145; var9++) {
            int var10 = class68.field1183[var9];
            int var11 = class47.field842[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class161.field2731[var9] = var13;
            byte[] var14 = new byte[var12];
            class61.field1098[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method1580(-43);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method1575(false);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method1575(false);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var10 <= var21) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var14[var10 * var22 + var21] = var2.method1575(false);
                                var15 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var13[var10 * var24 + var20] = var2.method1575(false);
                    }
                    var20++;
                }
            }
            class240.field4273[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIILbe;IJIIII)Z")
    public static final boolean method727(int arg0, int arg1, int arg2, int arg3, class16 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class183.method1232(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method728(int arg0) {
        field1884 = null;
        field1891 = null;
        field1890 = null;
        if (arg0 != 0) {
            method726((byte) -35, (byte[]) null);
        }
        field1883 = null;
    }
}
