import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class309 {

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public int field4299;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "Lwt;")
    public static class309 field4301 = new class309(1);

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Lwt;")
    public static class309 field4303 = new class309(2);

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "Lwt;")
    public static class309 field4304 = new class309(4);

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "Lwt;")
    public static class309 field4305 = new class309(1);

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Lwt;")
    public static class309 field4306 = new class309(2);

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "Lwt;")
    public static class309 field4307 = new class309(4);

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "Lwt;")
    public static class309 field4308 = new class309(2);

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "Lwt;")
    public static class309 field4309 = new class309(4);

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "[F")
    public static float[] field4312 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "[Lkd;")
    public static class280[] field4311 = new class280[2048];

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!wt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4300++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(I)V")
    private class309(int arg0) {
        this.field4299 = arg0;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
    public static void method2011(byte arg0) {
        field4312 = null;
        field4308 = null;
        field4305 = null;
        field4309 = null;
        if (arg0 != -117) {
            method2012(-82, -78, -93, true);
        }
        field4307 = null;
        field4304 = null;
        field4306 = null;
        field4301 = null;
        field4311 = null;
        field4303 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIZ)V")
    public static final void method2012(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 == 1010) {
            class241.method1539(class140.field2018, arg1, arg0);
        } else if (arg2 == 1007) {
            class241.method1539(class726.field10132, arg1, arg0);
        } else if (arg2 == 1003) {
            class241.method1539(class376.field5272, arg1, arg0);
        } else if (arg2 == 1009) {
            class241.method1539(class617.field8626, arg1, arg0);
        } else if (arg2 == 1012) {
            class241.method1539(class105.field1265, arg1, arg0);
        }
        field4302++;
        if (arg3) {
            method2012(40, 112, 0, true);
        }
    }
}
