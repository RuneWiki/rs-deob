import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class239 extends class29 {

    @OriginalMember(owner = "client!td", name = "D", descriptor = "Lbn;")
    private final class194 field3945;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "Lik;")
    public final class330 field3962;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "Lph;")
    public static class229 field3947 = null;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field3950 = -1;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "Lph;")
    private static class229 field3955 = class266.method1858("Starting 3d Library", 0);

    @OriginalMember(owner = "client!td", name = "A", descriptor = "Lph;")
    public static class229 field3942 = field3955;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "[Lhi;")
    public static class28[] field3960 = new class28[4];

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public int field3944;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public int field3951;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public int field3953;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public int field3957;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public int field3961;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Lka;")
    public static class293 field3954;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "Lc;")
    public static class318 field3949;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "Z")
    public static boolean field3958;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 10)
    public static void method1684(byte arg0) {
        field3960 = null;
        field3942 = null;
        field3955 = null;
        field3949 = null;
        field3954 = null;
        field3947 = null;
        int var1 = -10 % ((arg0 - 70) / 38);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(IZ)V", line = 40)
    public static final void method1685(int arg0, boolean arg1) {
        field3956++;
        class53.method364(14874);
        if (~class169.field2786 != arg0 && class169.field2786 != 25) {
            return;
        }
        class232.field3842++;
        if (class232.field3842 < 50 && !arg1) {
            return;
        }
        class232.field3842 = 0;
        if (!class39.field629 && class121.field2031 != null) {
            class121.field2033.method37(55, 164);
            try {
                class121.field2031.method527(class121.field2033.field2668, 20737, class121.field2033.field2670, 0);
                class121.field2033.field2670 = 0;
            } catch (IOException var3) {
                class39.field629 = true;
            }
            class329.field5597++;
        }
        class53.method364(14874);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZLph;)V", line = 74)
    public static final void method1686(int arg0, boolean arg1, class229 arg2) {
        field3952++;
        if (!arg1) {
            class281 var3 = class135.method957(0, arg0, 2);
            var3.method1932(0);
            var3.field4658 = arg2;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIZ)V", line = 89)
    public final void method1687(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            field3960 = (class28[]) null;
        }
        this.field3943 = arg0;
        field3946++;
        this.field3959 = arg2;
        this.field3944 = arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 122)
    public static final void method1688(int arg0, int arg1) {
        field3963++;
        class281 var2 = class135.method957(0, arg1, arg0);
        var2.method1933(arg0 - 3);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lik;Lbn;)V", line = 130)
    public class239(class330 arg0, class194 arg1) {
        this.field3945 = arg1;
        this.field3962 = arg0;
    }
}
