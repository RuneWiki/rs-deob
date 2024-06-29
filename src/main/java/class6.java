import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class6 {

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "Lna;")
    public static class26 field66 = class33.method219("Prev page", 127);

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "Lu;")
    public static class39 field64 = new class39();

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "Lna;")
    public static class26 field67 = class33.method219("Prev page", 78);

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "Lna;")
    public static class26 field69 = class33.method219("Find", 94);

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "Lna;")
    public static class26 field68 = class33.method219("Please wait)3)3)3 Rendering Map", 98);

    @OriginalMember(owner = "mapview!d", name = "h", descriptor = "Lna;")
    public static class26 field70 = class33.method219("Find", 119);

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I)V", line = 9)
    public static final void method34(int arg0) {
        class2.field27 = null;
        class29.field446 = null;
        if (arg0 != -14485) {
            method36(null, 67);
        }
        class10.field92 = null;
        class25.field379 = null;
        class39.field520 = null;
        class10.field100 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)V", line = 32)
    public static void method35(byte arg0) {
        field66 = null;
        field67 = null;
        field70 = null;
        field69 = null;
        field68 = null;
        if (arg0 < 110) {
            field69 = null;
        }
        field64 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([BI)Lt;", line = 58)
    public static final class37 method36(byte[] arg0, int arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg1 <= 120) {
            method34(-126);
        }
        class37 var2 = new class37(arg0, class25.field379, class10.field100, class10.field92, class39.field520, class29.field446, class2.field27);
        method34(-14485);
        return var2;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ZI)[B", line = 84)
    public static final synchronized byte[] method37(boolean arg0, int arg1) {
        if (arg1 == 100 && class21.field229 > 0) {
            byte[] var2 = class23.field241[--class21.field229];
            class23.field241[class21.field229] = null;
            return var2;
        } else if (arg1 == 5000 && class20.field217 > 0) {
            byte[] var3 = class2.field13[--class20.field217];
            class2.field13[class20.field217] = null;
            return var3;
        } else {
            if (!arg0) {
                field69 = null;
            }
            if (arg1 == 30000 && class32.field464 > 0) {
                byte[] var4 = class21.field224[--class32.field464];
                class21.field224[class32.field464] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }
}
