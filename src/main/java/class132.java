import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class132 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Leh;")
    public static class47 field2601 = class195.method1282((byte) -4, "(U5");

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field2605 = 0;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field2606 = 0;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Leh;")
    public static class47 field2607 = class195.method1282((byte) -4, "titlebutton");

    @OriginalMember(owner = "client!of", name = "h", descriptor = "[I")
    public static int[] field2608 = new int[200];

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method971(byte arg0) {
        field2608 = null;
        if (arg0 == 126) {
            field2601 = null;
            field2607 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public static final void method972(byte arg0) {
        field2602++;
        int var1 = 0;
        int[] var2 = new int[class32.field608];
        for (int var3 = 0; var3 < class32.field608; var3++) {
            class73 var5 = class87.method713(-104, var3);
            if (var5.field1570 >= 0 || var5.field1605 >= 0) {
                var2[var1++] = var3;
            }
        }
        if (arg0 < 94) {
            method971((byte) 126);
        }
        class110.field2278 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            class110.field2278[var4] = var2[var4];
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IBII)V")
    public static final void method973(int arg0, byte arg1, int arg2, int arg3) {
        field2603++;
        int var4 = 0;
        if (arg1 != 31) {
            method971((byte) -84);
        }
        while (var4 < 8) {
            for (int var7 = 0; var7 < 8; var7++) {
                class103.field2171[arg0][arg3 + var4][arg2 + var7] = 0;
            }
            var4++;
        }
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class103.field2171[arg0][arg3][arg2 + var5] = class103.field2171[arg0][arg3 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class103.field2171[arg0][arg3 + var6][arg2] = class103.field2171[arg0][arg3 + var6][arg2 - 1];
            }
        }
        if (arg3 > 0 && class103.field2171[arg0][arg3 - 1][arg2] != 0) {
            class103.field2171[arg0][arg3][arg2] = class103.field2171[arg0][arg3 - 1][arg2];
        } else if (arg2 > 0 && class103.field2171[arg0][arg3][arg2 - 1] != 0) {
            class103.field2171[arg0][arg3][arg2] = class103.field2171[arg0][arg3][arg2 - 1];
        } else if (arg3 > 0 && arg2 > 0 && class103.field2171[arg0][arg3 - 1][arg2 - 1] != 0) {
            class103.field2171[arg0][arg3][arg2] = class103.field2171[arg0][arg3 - 1][arg2 - 1];
        }
    }
}
