import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class41 {

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "Z")
    public static boolean field446 = false;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "Lao;")
    public static class191 field450 = new class191(82, -2);

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BCI)I")
    public static final int method239(byte arg0, char arg1, int arg2) {
        field449++;
        if (arg0 >= -9) {
            method239((byte) 81, (char) 65444, -106);
        }
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
    public static void method240(int arg0) {
        field450 = null;
        int var1 = 34 % ((arg0 + 8) / 54);
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
    public static final void method241(int arg0) {
        field447++;
        int var1 = class461.field6877;
        int[] var2 = class342.field4589;
        for (int var3 = 0; var3 < var1; var3++) {
            class531 var7 = class29.field272[var2[var3]];
            if (var7 != null && var7.field1221 > 0) {
                var7.field1221--;
                if (var7.field1221 == 0) {
                    var7.field1151 = null;
                }
            }
        }
        for (int var4 = arg0; var4 < class401.field5813; var4++) {
            int var5 = class337.field4465[var4];
            class22 var6 = class339.field4484[var5];
            if (var6 != null && var6.field1221 > 0) {
                var6.field1221--;
                if (var6.field1221 == 0) {
                    var6.field1151 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI)I")
    public static final int method242(byte arg0, int arg1) {
        field445++;
        return arg0 == -44 ? arg1 & 0xFF : -110;
    }
}
