import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class447 {

    @OriginalMember(owner = "client!os", name = "c", descriptor = "Lkaa;")
    public static class47 field6129 = new class47(39, -1);

    @OriginalMember(owner = "client!os", name = "h", descriptor = "[Lla;")
    public static class456[] field6134 = new class456[14];

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "[[[I")
    public static int[][][] field6131;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIB)I")
    public static final int method2559(int arg0, int arg1, int arg2, byte arg3) {
        field6130++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 4095 - arg1;
        } else {
            if (arg3 < 122) {
                field6134 = null;
            }
            return 4095 - arg0;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lee;I)V")
    public static final void method2560(class677 arg0, int arg1) {
        if (arg1 != -19613) {
            method2562((char) 65438, 91);
        }
        field6136++;
        if (arg0.field9399.length - arg0.field9419 < 1) {
            return;
        }
        int var2 = arg0.method3821((byte) -95);
        if (var2 < 0 || var2 > 1 || arg0.field9399.length - arg0.field9419 < 2) {
            return;
        }
        int var3 = arg0.method3807(-1);
        if (arg0.field9399.length - arg0.field9419 < var3 * 6) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3807(-1);
            int var6 = arg0.method3799(false);
            if (class540.field7160.length > var5 && class763.field10629[var5] && (class202.field3032.method1580(var5, (byte) -118).field7682 != '1' || var6 >= -1 && var6 <= 1)) {
                class540.field7160[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Z")
    public static final boolean method2561(int arg0) {
        if (arg0 != -12062) {
            field6129 = null;
        }
        class172.field2632 = true;
        field6128++;
        class589.field7684++;
        return true;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(CI)Z")
    public static final boolean method2562(char arg0, int arg1) {
        field6133++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (~arg0 <= arg1 && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
    public static void method2563(int arg0) {
        if (arg0 != 4095) {
            method2563(-63);
        }
        field6131 = null;
        field6134 = null;
        field6129 = null;
    }
}
