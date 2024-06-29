import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class96 {

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "[Lxa;")
    public static class511[] field1259;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 5)
    public static void method727(int arg0) {
        field1259 = null;
        if (arg0 != 1138) {
            method728(-27, -26, null);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILfd;)Ljava/lang/String;", line = 18)
    public static final String method728(int arg0, int arg1, class418 arg2) {
        field1256++;
        try {
            int var3 = arg2.method2400((byte) 36);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field5367 += class416.field5353.method2739(var3, var4, -127, arg2.field5393, arg2.field5367, 0);
            return class638.method3522(var4, var3, 113, arg0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)I", line = 46)
    public static final int method729(int arg0, int arg1) {
        if (arg0 != 0) {
            method727(70);
        }
        field1258++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 57)
    public static final void method730(int arg0) throws IOException {
        if (class2.field15 != null && class211.field2722 > 0) {
            int var1 = 0;
            while (true) {
                class11 var2 = (class11) class384.field4912.method2090(true);
                if (var2 == null) {
                    class28.field436 += var1;
                    class659.field9191 = 0;
                    break;
                }
                class2.field15.method280(0, var2.field120, var2.field114.field5393, 122);
                var1 += var2.field120;
                class211.field2722 -= var2.field120;
                var2.method2438((byte) -27);
                var2.field114.method2401((byte) 97);
                var2.method56((byte) 84);
            }
        }
        field1257++;
        if (arg0 != 0) {
            method728(-64, -79, null);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/lang/String;)V", line = 94)
    public static final void method731(byte arg0, String arg1) {
        if (arg0 < 85) {
            field1259 = null;
        }
        class495.method2696(-1, 0, "", 0, "", arg1, "");
        field1260++;
    }
}
