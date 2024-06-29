import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class285 {

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "Lvp;")
    private class123 field4094;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "Luc;")
    public static class23 field4093 = new class23(128);

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Lkp;")
    private class337 field4097;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "Lic;")
    public static class491 field4098;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4101;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field4100;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)Lkp;", line = 4)
    public final class337 method1842(byte arg0) {
        field4096++;
        class337 var2 = this.field4094.field1879.field4737;
        if (this.field4094.field1879 == var2) {
            this.field4097 = null;
            return null;
        }
        if (arg0 >= -112) {
            field4100 = null;
        }
        this.field4097 = var2.field4737;
        return var2;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)Lkp;", line = 24)
    public final class337 method1843(int arg0) {
        if (arg0 <= 121) {
            return null;
        }
        field4099++;
        class337 var2 = this.field4097;
        if (this.field4094.field1879 == var2) {
            this.field4097 = null;
            return null;
        } else {
            this.field4097 = var2.field4737;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V", line = 47)
    public static void method1844(int arg0) {
        field4098 = null;
        field4093 = null;
        field4100 = null;
        field4101 = null;
        if (arg0 != 128) {
            field4098 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILvp;)V", line = 67)
    public final void method1845(int arg0, class123 arg1) {
        this.field4094 = arg1;
        if (arg0 != -10156) {
            this.field4094 = null;
        }
        field4095++;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 83)
    public class285() {
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lvp;)V", line = 86)
    public class285(class123 arg0) {
        this.field4094 = arg0;
    }
}
