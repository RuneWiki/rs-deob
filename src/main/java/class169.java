import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class169 {

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Luq;")
    private class172 field2218;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "Luq;")
    private class172 field2223;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "Lnw;")
    private class611 field2219;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)Lnw;", line = 5)
    private final class611 method1144(int arg0) {
        int var2 = -54 % ((5 - arg0) / 63);
        field2220++;
        if (this.field2219 == null) {
            this.field2219 = new class611();
        }
        return this.field2219;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILvq;)Lku;", line = 20)
    public final class396 method1145(int arg0, class486 arg1) {
        field2221++;
        if (arg1 == null) {
            return null;
        }
        class313 var3 = arg1.method576((byte) 41);
        if (class375.field5489 == var3) {
            return new class186((class593) arg1);
        } else if (class375.field5488 == var3) {
            return new class781(this.method1144(-73), (class536) arg1);
        } else if (class50.field576 == var3) {
            return new class555(this.field2223, (class379) arg1);
        } else if (class273.field3967 == var3) {
            return new class652(this.field2223, (class572) arg1);
        } else if (class33.field313 == var3) {
            return new class191(this.field2223, this.field2218, (class744) arg1);
        } else if (class374.field5471 == var3) {
            return new class259(this.field2223, this.field2218, (class215) arg1);
        } else if (class709.field9694 == var3) {
            return new class386(this.field2223, this.field2218, (class68) arg1);
        } else if (class289.field4118 == var3) {
            return new class36(this.field2223, this.field2218, (class684) arg1);
        } else {
            if (arg0 != -12631) {
                this.method1145(-111, null);
            }
            if (class601.field8185 == var3) {
                return new class404(this.field2223, (class196) arg1);
            } else if (class435.field6287 == var3) {
                return new class682(this.field2223, this.field2218, (class709) arg1);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Luq;Luq;)V", line = 75)
    public class169(class172 arg0, class172 arg1) {
        this.field2218 = arg1;
        this.field2223 = arg0;
    }
}
