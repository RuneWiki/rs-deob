import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class240 {

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lce;")
    public class270 field3921 = new class270();

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field3917 = 0;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Llg;")
    public static class137 field3920 = null;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lce;")
    private class270 field3923;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)Lce;", line = 4)
    public final class270 method1685(byte arg0) {
        field3919++;
        class270 var2 = this.field3921.field4310;
        if (this.field3921 == var2) {
            this.field3923 = null;
            return null;
        }
        if (arg0 < 60) {
            this.method1688(106);
        }
        this.field3923 = var2.field4310;
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I", line = 30)
    public final int method1686(int arg0) {
        field3916++;
        int var2 = arg0;
        for (class270 var3 = this.field3921.field4310; var3 != this.field3921; var3 = var3.field4310) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 67)
    public static void method1687(byte arg0) {
        if (arg0 != 107) {
            field3920 = (class137) null;
        }
        field3920 = null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Lce;", line = 77)
    public final class270 method1688(int arg0) {
        field3918++;
        if (arg0 != 0) {
            return (class270) null;
        }
        class270 var2 = this.field3923;
        if (this.field3921 == var2) {
            this.field3923 = null;
            return null;
        } else {
            this.field3923 = var2.field4310;
            return var2;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lce;I)V", line = 98)
    public final void method1689(class270 arg0, int arg1) {
        if (arg0.field4313 != null) {
            arg0.method1849((byte) -64);
        }
        arg0.field4313 = this.field3921.field4313;
        field3922++;
        if (arg1 != 9893) {
            this.method1685((byte) 8);
        }
        arg0.field4310 = this.field3921;
        arg0.field4313.field4310 = arg0;
        arg0.field4310.field4313 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 128)
    public class240() {
        this.field3921.field4310 = this.field3921;
        this.field3921.field4313 = this.field3921;
    }
}
