import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class295 {

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5121 = -1;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lke;")
    public static class256 field5119 = class316.method2202("brillant1:", 27626);

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Lwb;")
    public static class132 field5126;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Lng;")
    public static class138 field5123;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V", line = 33)
    public static void method2066(boolean arg0) {
        field5119 = null;
        if (arg0) {
            method2067((byte) 115, -115, 47, 97, (class256) null, 20, -48L);
        }
        field5126 = null;
        field5123 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIIILke;IJ)V", line = 45)
    public static final void method2067(byte arg0, int arg1, int arg2, int arg3, class256 arg4, int arg5, long arg6) {
        field5124++;
        class41 var8 = new class41(128);
        var8.method308(10, -2);
        var8.method366((int) (Math.random() * 99999.0D), -102);
        var8.method366(526, -118);
        var8.method330(255, arg6);
        if (arg0 > -111) {
            method2066(true);
        }
        var8.method365((byte) -32, (int) (Math.random() * 9.9999999E7D));
        var8.method361(arg4, 0);
        var8.method365((byte) -32, (int) (Math.random() * 9.9999999E7D));
        var8.method366(class7.field107, -127);
        var8.method308(arg1, -2);
        var8.method308(arg5, -2);
        var8.method365((byte) -32, (int) (Math.random() * 9.9999999E7D));
        var8.method366(arg3, -120);
        var8.method366(arg2, -114);
        var8.method365((byte) -32, (int) (Math.random() * 9.9999999E7D));
        var8.method324(class106.field1894, 2097244, class129.field2257);
        class308.field5322.field738 = 0;
        class308.field5322.method308(245, -2);
        class308.field5322.method308(var8.field738, -2);
        class308.field5322.method311(var8.field738, var8.field772, 255, 0);
        class54.field1000 = 1;
        class168.field2990 = -3;
        class42.field805 = 0;
        class114.field2010 = 0;
    }
}
