import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class222 {

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "Lju;")
    public static class102 field3115 = new class102(23, 3);

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "Z")
    public static boolean field3119 = false;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public static int field3125 = 50;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "[I")
    public static int[] field3121 = new int[field3125];

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "[I")
    public static int[] field3124 = new int[field3125];

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "[I")
    public static int[] field3117 = new int[field3125];

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3118 = new String[field3125];

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "[I")
    public static int[] field3126 = new int[field3125];

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "[I")
    public static int[] field3122 = new int[field3125];

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "[I")
    public static int[] field3120 = new int[field3125];

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "[B")
    public byte[] field3114;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "[S")
    public short[] field3111;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "[S")
    public short[] field3112;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "[S")
    public short[] field3123;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;II)V")
    public static final void method1446(String arg0, boolean arg1, String arg2, int arg3, int arg4) {
        field3113++;
        class120 var5 = class510.method3041(arg3 ^ 0x26);
        var5.field1653.method184(class241.field3363.field2237, -37);
        var5.field1653.method147((byte) 53, 0);
        int var6 = var5.field1653.field330;
        var5.field1653.method147((byte) 53, 631);
        int[] var7 = class336.method1948(0, var5);
        int var8 = var5.field1653.field330;
        var5.field1653.method187(arg0, (byte) -75);
        var5.field1653.method147((byte) 53, class711.field9915);
        var5.field1653.method187(arg2, (byte) -77);
        var5.field1653.method156(arg3 ^ 0xFFFFFFF5, class471.field6468);
        var5.field1653.method184(class369.field4721, arg3 - 153);
        var5.field1653.method184(class210.field2984.field1662, -58);
        class569.method3403(114, var5.field1653);
        String var9 = class485.field6554;
        var5.field1653.method184(var9 == null ? 0 : 1, -75);
        if (var9 != null) {
            var5.field1653.method187(var9, (byte) -80);
        }
        var5.field1653.method184(arg4, arg3 - 138);
        var5.field1653.method184(arg1 ? 1 : 0, -126);
        var5.field1653.field330 += 7;
        var5.field1653.method197(var7, var5.field1653.field330, var8, -75);
        var5.field1653.method164((byte) -91, var5.field1653.field330 - var6);
        class471.method2805(91, var5);
        class282.field3741 = 0;
        class95.field1393 = 1;
        class530.field7420 = -3;
        class369.field4720 = 0;
        if (arg4 < 13) {
            class624.field8919 = true;
            class608.method3557(-8092);
        }
        if (arg3 != 99) {
            field3115 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
    public static void method1447(byte arg0) {
        field3122 = null;
        if (arg0 >= -119) {
            method1448(76, null);
        }
        field3124 = null;
        field3117 = null;
        field3118 = null;
        field3121 = null;
        field3120 = null;
        field3115 = null;
        field3126 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILha;)V")
    public static final void method1448(int arg0, class545 arg1) {
        field3116++;
        if (class701.field9767 == class473.field6483.field9501 || class352.field4549 == null) {
            return;
        }
        if (class451.method2715(class473.field6483.field9501, arg1, 1)) {
            class701.field9767 = class473.field6483.field9501;
        }
        if (arg0 != 23) {
            field3120 = null;
        }
    }
}
