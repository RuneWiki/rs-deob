import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 extends class161 {

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Llj;")
    public static class25 field142 = new class25(new byte[5000]);

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "Ltg;")
    public static class180 field136;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    public static void method75(boolean arg0) {
        if (!arg0) {
            field142 = null;
        }
        field136 = null;
        field142 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLp;)Z")
    public static final boolean method76(byte arg0, class280 arg1) {
        field138++;
        if (arg0 <= 112) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class273.field4753; var2++) {
                if (arg1.method1887((byte) 32, class11.field237[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
    public static final void method77(boolean arg0) {
        class93.field1510.method1481(false);
        class264.field4653.method1481(false);
        field137++;
        class162.field2856.method1481(false);
        if (!arg0) {
            field142 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
    public static final void method78(int arg0) {
        field139++;
        if (class4.field118 != null) {
            class4.field118.method93(110);
        }
        if (class250.field4391 != null) {
            class250.field4391.method93(107);
        }
        class100.method712(2, class157.field2752, 22050, arg0 ^ 0xFFFFA9B1);
        class4.field118 = class21.method163(0, arg0, arg0 - 47922, class118.field2117, class41.field707);
        class4.field118.method87(class255.field4502, 28667);
        class250.field4391 = class21.method163(1, 2048, arg0 - 47922, class118.field2117, class41.field707);
        class250.field4391.method87(class234.field4082, 28667);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIII)V")
    public static final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field135++;
        if (arg0 == arg4) {
            class108.method751(arg1, arg3, arg5, false, arg4);
            return;
        }
        if (arg2 != 0) {
            method76((byte) 4, (class280) null);
        }
        if (arg1 - arg4 >= class89.field1440 && class12.field249 >= (arg1 + arg4) && class36.field654 <= (arg5 - arg0) && (arg0 + arg5) <= class249.field4360) {
            class21.method165(arg1, arg3, 0, arg4, arg0, arg5);
        } else {
            class37.method294(~arg2, arg0, arg5, arg4, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(II)V")
    public class7(int arg0, int arg1) {
        this.field140 = arg0;
        this.field141 = arg1;
    }
}
