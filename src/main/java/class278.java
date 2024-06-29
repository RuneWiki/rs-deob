import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class278 {

    @OriginalMember(owner = "client!j", name = "p", descriptor = "J")
    public long field4780 = 0L;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field4769 = -1;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Lok;")
    private static class146 field4770 = class235.method1724(-12908, "Attack");

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field4778 = 0;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lok;")
    public static class146 field4766 = field4770;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public int field4765;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public int field4773;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public int field4777;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public int field4782;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Lbf;")
    public class322 field4774;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lbf;")
    public class322 field4779;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lje;")
    public static class70 field4768;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "[[Lhi;")
    public static class286[][] field4781;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZII)V", line = 24)
    public static final void method2021(int arg0, boolean arg1, int arg2, int arg3) {
        field4776++;
        class158 var4 = class206.method1564(arg2, 9, -126);
        var4.method1236(-13730);
        if (!arg1) {
            method2022(104);
        }
        var4.field2663 = arg3;
        var4.field2672 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 40)
    public static void method2022(int arg0) {
        int var1 = -71 / ((arg0 + 52) / 40);
        field4781 = (class286[][]) null;
        field4770 = null;
        field4768 = null;
        field4766 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIII)V", line = 65)
    public static final void method2023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4771++;
        if (class272.method1992(2306, arg6)) {
            if (arg2 != -1412584499) {
                field4778 = -5;
            }
            class260.field4326 = null;
            class177.method1406(-1, arg7, arg4, arg3, arg5, arg1, 22, arg8, class92.field1459[arg6], arg0);
            if (class260.field4326 != null) {
                class177.method1406(-1412584499, class295.field5006, arg4, class107.field1736, arg5, arg1, 22, arg8, class260.field4326, arg0);
                class260.field4326 = null;
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class14.field264[var9] = true;
            }
        } else {
            class14.field264[arg0] = true;
        }
    }
}
