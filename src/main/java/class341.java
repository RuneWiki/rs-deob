import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class341 extends class292 {

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field4841 = 0;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field4845 = 1;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Ldp;")
    public static class174 field4839;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V", line = 6)
    public static void method2201(int arg0) {
        field4839 = null;
        if (arg0 != 0) {
            field4839 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 22)
    public static final boolean method2202(byte arg0, String arg1) {
        field4844++;
        if (arg0 != 114) {
            field4839 = null;
        }
        return class107.method950((byte) 58, arg1, true, 10);
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V", line = 43)
    public static final void method2203(int arg0) {
        field4842++;
        if (class88.field1411) {
            return;
        }
        class88.field1411 = true;
        class206.field3020 = true;
        if (arg0 >= -10) {
            field4845 = 85;
        }
        if (class324.field4673) {
            class436.field6359 = (float) ((int) class436.field6359 - 17 & 0xFFFFFFF0);
        } else {
            class247.field3586 += (-12.0F - class247.field3586) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Ljava/lang/String;", line = 70)
    public static final String method2204(int arg0, int arg1) {
        field4840++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - arg1; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class361.field5152 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class22.field341 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}
