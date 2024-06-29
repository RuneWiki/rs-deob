import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class487 {

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "Lfm;")
    public class669 field7074;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIII)I")
    public static final int method2817(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7075++;
        int var5 = arg0 & 0xF;
        int var6 = 64 / ((arg3 + 64) / 51);
        int var7 = var5 >= 8 ? arg1 : arg2;
        int var8 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg4) : arg1;
        return ((var5 & 0x2) == 0 ? var8 : -var8) + ((var5 & 0x1) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILml;)V")
    public static final void method2818(int arg0, class351 arg1) {
        field7072++;
        if (arg0 != 12) {
            method2817(16, -126, 0, 7, -99);
        }
        class272.field3444 = arg1;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2819(int arg0, String arg1) {
        field7073++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class247.method1428(arg1.charAt(var2), 160)) {
            var2++;
        }
        while (var2 < var3 && class247.method1428(arg1.charAt(var3 - 1), 160)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (arg0 != 2) {
            return null;
        } else if (var4 >= 1 && var4 <= 12) {
            StringBuffer var5 = new StringBuffer(var4);
            for (int var6 = var2; var6 < var3; var6++) {
                char var7 = arg1.charAt(var6);
                if (class70.method460(false, var7)) {
                    char var8 = class53.method269(var7, false);
                    if (var8 != '\u0000') {
                        var5.append(var8);
                    }
                }
            }
            if (var5.length() == 0) {
                return null;
            } else {
                return var5.toString();
            }
        } else {
            return null;
        }
    }
}
