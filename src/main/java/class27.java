import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class27 extends class476 {

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "[Laj;")
    public static class317[] field435 = new class317[8];

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Lro;")
    public static class2 field433 = new class2();

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Z")
    public static boolean field430;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Lmha;")
    public final class419 method112(byte arg0) {
        field429++;
        return arg0 == 62 ? class555.field7295 : null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Z")
    public static final boolean method250(byte arg0, int arg1) {
        if (arg0 != 63) {
            method252(null);
        }
        field432++;
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static final void method251(int arg0) {
        class96.method721((byte) 103);
        field434++;
        class513.field6809 = null;
        class397.field5539 = 0;
        class3.field63.field9419 = 0;
        class732.field10143 = arg0;
        class574.field7540 = 0;
        class42.field552 = null;
        class747.field10396 = null;
        class94.field1148 = null;
        class492.method2787((byte) -124);
        class739.method4121(104);
        for (int var1 = 0; var1 < 2048; var1++) {
            class248.field3438[var1] = null;
        }
        class472.field6475 = null;
        for (int var2 = 0; var2 < class243.field3403; var2++) {
            class556 var4 = class302.field4281[var2].field2154;
            if (var4 != null) {
                var4.field10287 = -1;
            }
        }
        class661.method3583((byte) 70);
        class278.field3898 = 1;
        class12.field193 = -1;
        class264.field3680 = -1;
        class66.method566(10, -21035);
        for (int var3 = 0; var3 < 100; var3++) {
            class12.field192[var3] = true;
        }
        class407.method2381((byte) -57);
        class281.field3982 = 0L;
        class66.field826 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lkf;)V")
    public static final void method252(class256 arg0) {
        class184.field2781.method494(arg0.field3505, arg0.field3510 + (arg0.method789(-32768) >> 1), arg0.field3502, class269.field3767);
        arg0.field3500 = class269.field3767[0];
        arg0.field3507 = class269.field3767[1];
        arg0.field3509 = class269.field3767[2];
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lle;Lqj;IIIIIIIIII)V")
    public class27(class311 arg0, class512 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field431 = arg10;
        this.field428 = arg11;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static void method253(int arg0) {
        if (arg0 == 100) {
            field433 = null;
            field435 = null;
        }
    }
}
