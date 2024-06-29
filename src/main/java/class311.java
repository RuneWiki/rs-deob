import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class311 extends class240 {

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "[B")
    public byte[] field4894;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "[J")
    public static long[] field4888 = new long[500];

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "J")
    public static long field4887 = 0L;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "Lja;")
    public static class64 field4895;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "[Lhe;")
    public static class94[] field4891;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V", line = 5)
    public static void method2149(int arg0) {
        field4891 = null;
        field4888 = null;
        if (arg0 != 0) {
            field4888 = (long[]) null;
        }
        field4895 = null;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "([B)V", line = 29)
    public class311(byte[] arg0) {
        this.field4894 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 38)
    public static final void method2150(int arg0, Component arg1) {
        arg1.removeKeyListener(class302.field4752);
        field4889++;
        arg1.removeFocusListener(class302.field4752);
        class206.field3263 = -1;
        if (arg0 != 13134) {
            field4888 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V", line = 55)
    public static final void method2151(int arg0) {
        class152.field2447.method1837(-128);
        if (arg0 != -1) {
            field4888 = (long[]) null;
        }
        field4893++;
        class13.field242.method1837(-128);
    }
}
