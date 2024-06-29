import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class246 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Lve;")
    public static class255 field4125 = class87.method607(80, " x ");

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "[S")
    public static short[] field4132 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "Lve;")
    public static class255 field4136 = class87.method607(35, "www");

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field4137 = 0;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Z")
    public static boolean field4126 = false;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public int field4128;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public int field4131;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public int field4133;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIB)I", line = 8)
    public static final int method1696(int arg0, int arg1, byte arg2) {
        if (arg2 != 14) {
            method1700(-72);
        }
        int var3 = arg1 >>> 31;
        field4134++;
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILpb;I)V", line = 24)
    private final void method1697(int arg0, class70 arg1, int arg2) {
        if (arg0 == 1) {
            this.field4131 = arg1.method423(255);
            this.field4133 = arg1.method481(0);
            this.field4128 = arg1.method481(0);
        }
        if (arg2 != -15245) {
            field4132 = (short[]) null;
        }
        field4135++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 52)
    public static final void method1698(int arg0) {
        field4129++;
        if (arg0 != 32) {
            return;
        }
        for (int var1 = 0; var1 < class118.field1985; var1++) {
            int var2 = class10.field145[var1];
            class242 var3 = class151.field2555[var2];
            int var4 = class160.field2692.method481(0);
            if ((var4 & 0x20) != 0) {
                var4 += class160.field2692.method481(0) << 8;
            }
            class313.method2163(var4, var2, var3, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLpb;)V", line = 84)
    public final void method1699(byte arg0, class70 arg1) {
        while (true) {
            int var3 = arg1.method481(0);
            if (var3 == 0) {
                field4130++;
                if (arg0 >= -64) {
                    method1700(-86);
                }
                return;
            }
            this.method1697(var3, arg1, -15245);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 109)
    public static void method1700(int arg0) {
        field4132 = null;
        field4136 = null;
        int var1 = -71 / ((49 - arg0) / 63);
        field4125 = null;
    }
}
