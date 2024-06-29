import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class298 extends class320 {

    @OriginalMember(owner = "client!o", name = "F", descriptor = "[B")
    public byte[] field4626;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "[Lbg;")
    public static class93[] field4621 = new class93[14];

    @OriginalMember(owner = "client!o", name = "G", descriptor = "Ljava/lang/String;")
    public static String field4627 = "cyan:";

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "Lho;")
    public static class215 field4625;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Lie;")
    public static class330 field4623;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "Lwm;")
    public static class96 field4624;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V", line = 4)
    public static void method2141(byte arg0) {
        field4624 = null;
        field4621 = null;
        field4627 = null;
        int var1 = 74 % ((57 - arg0) / 35);
        field4625 = null;
        field4623 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)V", line = 20)
    public static final void method2142(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4622++;
        class36.field544 = -1;
        class191.field3006 = -1;
        float var5 = (float) class351.field5593 / (float) class351.field5596;
        int var6 = arg1;
        int var7 = arg4;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg2 - (arg4 - var7) / 2;
        int var9 = 59 % ((-arg3 - 67) / 49);
        int var10 = arg0 - (arg1 - var6) / 2;
        class348.field5530 = class351.field5593 * var8 / var7;
        class335.field5120 = class351.field5596 * var10 / var6;
        class71.method679((byte) -34);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "([B)V", line = 55)
    public class298(byte[] arg0) {
        this.field4626 = arg0;
    }
}
