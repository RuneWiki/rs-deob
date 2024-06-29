import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class447 extends class217 {

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "[I")
    public static int[] field6173 = new int[16];

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "Lgga;")
    public static class513 field6172;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "Ldl;")
    public static class78 field6170;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "[Lmq;")
    public static class85[] field6168;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IF)V")
    public final void method1195(int arg0, float arg1) {
        if (arg0 != 2857) {
            field6168 = null;
        }
        ++field6169;
        super.field3161 = arg1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIII)V")
    public final void method1198(int arg0, int arg1, int arg2, int arg3) {
        ++field6171;
        super.field3157 = arg1;
        if (arg3 >= -73) {
            this.method1198(97, -4, -101, -105);
        }
        super.field3159 = arg0;
        super.field3172 = arg2;
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(B)Z")
    public static final boolean method2647(byte arg0) {
        ++field6167;
        boolean var1 = true;
        if (class86.field1289 == null) {
            if (class176.field2648.method3005(class552.field7658, (byte) -69)) {
                class86.field1289 = class418.method2464(class176.field2648, class552.field7658);
            } else {
                var1 = false;
            }
        }
        int var2 = -104 % ((arg0 - -59) / 48);
        if (class396.field5469 == null) {
            if (!class176.field2648.method3005(class223.field3272, (byte) -69)) {
                var1 = false;
            } else {
                class396.field5469 = class418.method2464(class176.field2648, class223.field3272);
            }
        }
        if (class105.field1520 == null) {
            if (!class176.field2648.method3005(class197.field2959, (byte) -69)) {
                var1 = false;
            } else {
                class105.field1520 = class418.method2464(class176.field2648, class197.field2959);
            }
        }
        if (class353.field5017 == null) {
            if (class77.field1161.method3005(class236.field3423, (byte) -69)) {
                class353.field5017 = class478.method2833(58, class77.field1161, class236.field3423);
            } else {
                var1 = false;
            }
        }
        if (class280.field4034 == null) {
            if (class176.field2648.method3005(class236.field3423, (byte) -69)) {
                class280.field4034 = class418.method2474(class176.field2648, class236.field3423);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "(I)V")
    public static void method2648(int arg0) {
        field6173 = null;
        field6172 = null;
        field6170 = null;
        if (arg0 != 16) {
            method2647((byte) 18);
        }
        field6168 = null;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(IIIIIF)V")
    public class447(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
