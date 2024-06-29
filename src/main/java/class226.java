import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class226 extends class136 {

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
    public static int field4241 = 0;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4243 = new CRC32();

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field4249 = -1;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public static int field4246 = 0;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "Li;")
    private static class88 field4248 = class208.method1425(105, " from your ignore list first)3");

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "Li;")
    public static class88 field4247 = field4248;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "Li;")
    public static class88 field4251 = class208.method1425(105, "::fps ");

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public int field4239;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "Luf;")
    public static class224 field4250;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "Lbj;")
    public static class22 field4245;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIILdj;)V")
    public static final void method1517(byte arg0, int arg1, int arg2, class44 arg3) {
        if (arg0 != -31) {
            field4249 = 74;
        }
        field4244++;
        if (arg3.field4079 == arg1 && arg1 != -1) {
            class109 var4 = class15.method75(arg1, (byte) 101);
            int var5 = var4.field1968;
            if (var5 == 1) {
                arg3.field4100 = 0;
                arg3.field4134 = 0;
                arg3.field4103 = 0;
                arg3.field4142 = arg2;
                class60.method433(-116, class240.field4458 == arg3, arg3.field4123, arg3.field4103, arg3.field4138, var4);
            }
            if (var5 == 2) {
                arg3.field4134 = 0;
                return;
            }
        } else if (arg1 == -1 || arg3.field4079 == -1 || class15.method75(arg1, (byte) 104).field2001 >= class15.method75(arg3.field4079, (byte) -90).field2001) {
            arg3.field4103 = 0;
            arg3.field4142 = arg2;
            arg3.field4139 = arg3.field4137;
            arg3.field4079 = arg1;
            arg3.field4134 = 0;
            arg3.field4100 = 0;
            if (arg3.field4079 == -1) {
                return;
            }
            class60.method433(12, class240.field4458 == arg3, arg3.field4123, arg3.field4103, arg3.field4138, class15.method75(arg3.field4079, (byte) 48));
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lea;I)V")
    public final void method1518(class46 arg0, int arg1) {
        field4240++;
        while (true) {
            int var3 = arg0.method347(26119);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    field4246 = -24;
                    return;
                }
            }
            this.method1520(var3, -95, arg0);
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
    public static void method1519(int arg0) {
        field4248 = null;
        field4243 = null;
        field4251 = null;
        field4247 = null;
        field4250 = null;
        field4245 = null;
        if (arg0 != -32535) {
            field4248 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILea;)V")
    private final void method1520(int arg0, int arg1, class46 arg2) {
        field4237++;
        if (arg1 < -62 && arg0 == 1) {
            this.field4235 = arg2.method301(98);
            this.field4236 = arg2.method347(26119);
            this.field4239 = arg2.method347(26119);
        }
    }
}
