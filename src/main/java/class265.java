import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class265 {

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Z")
    public boolean field4600 = true;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public int field4598;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public int field4611;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public int field4601;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public int field4597;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lha;")
    public static class46 field4599 = class271.method1828("gleiten:", -46);

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lha;")
    public static class46 field4602 = class271.method1828("Loaded titlescreen)3", -46);

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field4607 = 0;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Lha;")
    public static class46 field4609 = class271.method1828("; Max)2Age=", -46);

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method1783(int arg0) {
        class58.field967.method285((byte) -90, 96);
        class58.field967.method570(class221.method1533(24454), 15619);
        if (arg0 >= -48) {
            field4607 = -23;
        }
        class58.field967.method546((byte) 102, class50.field876);
        field4604++;
        class73.field1296++;
        class58.field967.method546((byte) 117, class163.field2895);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lmd;")
    public static final class112 method1784(Component arg0, int arg1, byte arg2, int arg3) {
        field4603++;
        try {
            Class var4 = Class.forName("oa");
            class112 var5 = (class112) var4.getDeclaredConstructor().newInstance();
            if (arg2 >= -83) {
                return null;
            } else {
                var5.method684((byte) -104, arg3, arg0, arg1);
                return var5;
            }
        } catch (Throwable var7) {
            class234 var6 = new class234();
            var6.method684((byte) 108, arg3, arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static void method1785(int arg0) {
        field4602 = null;
        if (arg0 != 0) {
            method1784((Component) null, -48, (byte) -11, -34);
        }
        field4599 = null;
        field4609 = null;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4600 = arg6;
        this.field4598 = arg0;
        this.field4605 = arg4;
        this.field4611 = arg2;
        this.field4610 = arg5;
        this.field4601 = arg3;
        this.field4597 = arg1;
    }
}
