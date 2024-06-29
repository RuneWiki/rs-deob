import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class500 {

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "Lbu;")
    public static class21 field7108 = new class21(69, 1);

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field7110 = 0;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "Lqja;")
    public static class326 field7104;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "[B")
    public byte[] field7103;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "[S")
    public short[] field7105;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "[S")
    public short[] field7106;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "[S")
    public short[] field7109;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
    public static void method3031(byte arg0) {
        field7104 = null;
        field7108 = null;
        int var1 = -117 % ((-arg0 - 51) / 61);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method3032(byte arg0, String arg1) {
        field7107++;
        if (!class691.field9660 || (class197.field3008 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = 14 / ((-arg0 - 49) / 61);
        int var4 = class514.field7278;
        int[] var5 = class522.field7381;
        for (int var6 = 0; var6 < var4; var6++) {
            class702 var7 = class767.field10560[var5[var6]];
            if (var7.field9768 != null && var7.field9768.equalsIgnoreCase(arg1) && (class210.field3250 == var7 && (class197.field3008 & 0x10) != 0 || var7 != null && (class197.field3008 & 0x8) != 0)) {
                class182.field2819++;
                class312 var8 = class353.method2245(class87.field971, class432.field5845, (byte) 70);
                var8.field4445.method2969(class629.field8818, -414819352);
                var8.field4445.method2992((byte) 127, class714.field9898);
                var8.field4445.method2969(var5[var6], -414819352);
                var8.field4445.method2947(-107, class497.field7084);
                var8.field4445.method2994(0, (byte) -72);
                class208.method1440(var8, 37);
                var2 = true;
                class394.method2436(var7.method2102(true), -2, var7.method2102(true), var7.field4670[0], true, var7.field4672[0], 0, 0, 0);
                break;
            }
        }
        if (!var2) {
            class227.method1550((byte) -67, 4, class620.field8682.method3580(class140.field2081, 12) + arg1);
        }
        if (class691.field9660) {
            class337.method2136(-161);
        }
    }
}
