import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class384 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "[I")
    public static int[] field5643 = new int[1];

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[Llh;")
    public static class364[] field5647 = new class364[2048];

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Lwf;")
    public static class89 field5645;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V", line = 10)
    public static void method2336(boolean arg0) {
        if (!arg0) {
            field5643 = null;
            field5647 = null;
            field5645 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLfd;)V", line = 24)
    public static final void method2337(byte arg0, class365 arg1) {
        if (class388.field5742 == null) {
            class380 var2 = new class380();
            byte[] var3 = var2.method2328(16, -201, 128, 128);
            class388.field5742 = class351.method2110((byte) 109, false, var3);
        }
        if (arg0 != -16) {
            field5647 = null;
        }
        field5646++;
        if (class92.field1267 == null) {
            class397 var4 = new class397();
            byte[] var5 = var4.method2430((byte) -49, 128, 128, 16);
            class92.field1267 = class351.method2110((byte) 109, false, var5);
        }
        class368 var6 = arg1.field5308;
        if (var6.method2276(-76) && class484.field7119 == null) {
            byte[] var7 = class253.method1638(0.6F, 4.0F, 16.0F, 0.5F, 8, new class50(419684), 16, (byte) 22, 4.0F, 128, 128);
            class484.field7119 = class351.method2110((byte) 109, false, var7);
        }
    }
}
