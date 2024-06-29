import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class15 extends class68 {

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field209 = 1;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Lce;")
    public static class126 field206 = class206.method1445(-7923, "blinken1:");

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Lce;")
    public static class126 field210 = class206.method1445(-7923, "(Y");

    @OriginalMember(owner = "client!o", name = "A", descriptor = "J")
    public static long field208 = 0L;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "[I")
    public static int[] field212 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field215 = -1;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "F")
    public static float field200;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "J")
    public long field202;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Lo;")
    public class15 field203;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "Lo;")
    public class15 field205;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "[Lvj;")
    public static class184[] field214;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "[Lha;")
    public static class26[] field211;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLcc;Lv;Lcc;)V", line = 5)
    public static final void method83(boolean arg0, class313 arg1, class248 arg2, class313 arg3) {
        field216++;
        class22.field313 = arg2;
        class18.field240 = arg3;
        class272.field4584 = arg1;
        if (class18.field240 != null) {
            class63.field1070 = class18.field240.method2165(0, 1);
        }
        if (class272.field4584 != null) {
            class254.field4269 = class272.field4584.method2165(0, 1);
        }
        if (!arg0) {
            method86(-102, false);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V", line = 27)
    public static final void method84(int arg0, int arg1, int arg2) {
        class245 var3 = class139.method1022(arg0, (byte) -112, arg1);
        var3.method1683(0);
        var3.field4154 = arg2;
        field213++;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V", line = 42)
    public final void method85(int arg0) {
        field207++;
        if (this.field203 == null) {
            return;
        }
        this.field203.field205 = this.field205;
        this.field205.field203 = this.field203;
        this.field205 = null;
        this.field203 = null;
        if (arg0 <= 48) {
            method86(-26, false);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)V", line = 60)
    public static final void method86(int arg0, boolean arg1) {
        class84.field1343.method1175(true, arg0);
        if (!arg1) {
            field199++;
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V", line = 126)
    public static void method87(byte arg0) {
        field214 = null;
        if (arg0 <= 18) {
            field208 = -52L;
        }
        field211 = null;
        field212 = null;
        field206 = null;
        field210 = null;
    }
}
