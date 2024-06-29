import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class165 extends class411 {

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "B")
    public byte field2183 = 5;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Luaa;")
    public static class391 field2182 = null;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Z")
    public static boolean field2184 = true;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public int field2186;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public int field2192;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Z")
    public boolean field2193;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILaia;)Z", line = 27)
    public static final boolean method1045(int arg0, class274 arg1) {
        field2194++;
        class773 var2 = class390.field4983.method4292(arg1.method1010(-6546), (byte) -94);
        if (var2.field10510 == -1) {
            return true;
        } else {
            class510 var3 = class702.field9289.method2694((byte) -127, var2.field10510);
            return ~var3.field6504 == arg0 ? true : var3.method2819((byte) -124);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILwm;I)Lne;", line = 45)
    public static final class166 method1046(int arg0, int arg1, class30 arg2, int arg3) {
        field2189++;
        if (arg0 >= -96) {
            field2182 = null;
        }
        byte[] var4 = arg2.method139(arg3, (byte) -94, arg1);
        return var4 == null ? null : new class166(var4);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V", line = 65)
    public static void method1047(int arg0) {
        field2182 = null;
        if (arg0 != -1) {
            method1046(-49, -24, null, 43);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Luaa;ILuaa;)V", line = 75)
    public static final void method1048(class391 arg0, int arg1, class391 arg2) {
        class693.field8899++;
        field2188++;
        class13 var3 = class659.method3587(class68.field909, 98, class600.field7625);
        var3.field130.method1496(arg2.field5151, (byte) 70);
        var3.field130.method1507(-531697592, arg2.field5039);
        var3.field130.method1507(-531697592, arg0.field5039);
        var3.field130.method1499((byte) -4, arg0.field5151);
        var3.field130.method1502(arg2.field5128, 65280);
        var3.field130.method1541(374, arg0.field5128);
        if (arg1 < 39) {
            field2182 = null;
        }
        class116.method679(var3, 0);
    }
}
