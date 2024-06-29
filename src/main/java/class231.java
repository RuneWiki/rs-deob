import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class231 extends class695 {

    @OriginalMember(owner = "client!pd", name = "Gb", descriptor = "I")
    public static int field3602 = -1;

    @OriginalMember(owner = "client!pd", name = "Hb", descriptor = "[Lvr;")
    public static class121[] field3603 = new class121[128];

    @OriginalMember(owner = "client!pd", name = "Fb", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!pd", name = "Ib", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!pd", name = "Jb", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!pd", name = "Kb", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!pd", name = "Eb", descriptor = "Lpu;")
    public static class522 field3600;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "(II)V")
    public static final void method1590(int arg0, int arg1) {
        ++field3604;
        int var2 = class564.field7962 - class515.field7281;
        if (~var2 <= -101) {
            class43.field700 = 1;
            class666.field9399 = -1;
            class563.field7927 = -1;
        } else {
            int var3 = (int) class105.field1635;
            if (var3 < class287.field4274 >> 8) {
                var3 = class287.field4274 >> 8;
            }
            if (class598.field8449[arg0] && ~var3 > ~(class316.field4676[4] + 128)) {
                var3 = class316.field4676[4] + 128;
            }
            int var4 = (int) class630.field8811 + class433.field6338 & 16383;
            class217.method1430(-1651000018, class674.method3748(class648.field9106.field3024, class58.field1112, 63, class648.field9106.field3029) + -200, arg1, var4, 600 - -((var3 >> 3) * 3) << 2, class564.field7963, class391.field5796, var3);
            float var5 = 1.0F - (float) ((100 - var2) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F;
            class568.field7998 = (int) ((float) (class568.field7998 - class21.field294) * var5 + (float) class21.field294);
            class544.field7662 = (int) ((float) (class544.field7662 - class575.field8090) * var5 + (float) class575.field8090);
            class413.field6011 = (int) ((float) (class413.field6011 - class394.field5844) * var5 + (float) class394.field5844);
            class131.field1928 = (int) ((float) (-class328.field4854 + class131.field1928) * var5 + (float) class328.field4854);
            int var6 = -class682.field9621 + class637.field9001;
            if (var6 > 8192) {
                var6 -= 16384;
            } else if (~var6 > 8191) {
                var6 += 16384;
            }
            class637.field9001 = (int) ((float) var6 * var5 + (float) class682.field9621);
            class637.field9001 &= 16383;
        }
    }

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "(B)V")
    public static void method1591(byte arg0) {
        field3603 = null;
        if (arg0 != 110) {
            method1590(123, 8);
        }
        field3600 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZF)V")
    public final void method1592(boolean arg0, float arg1) {
        if (arg0) {
            field3605 = -13;
        }
        ++field3601;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field9796[super.field9761++] = (byte) (var3 >> 24);
        super.field9796[super.field9761++] = (byte) (var3 >> 16);
        super.field9796[super.field9761++] = (byte) (var3 >> 8);
        super.field9796[super.field9761++] = (byte) var3;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
    public class231(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BF)V")
    public final void method1593(byte arg0, float arg1) {
        if (arg0 < 18) {
            field3600 = null;
        }
        ++field3606;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field9796[super.field9761++] = (byte) var3;
        super.field9796[super.field9761++] = (byte) (var3 >> 8);
        super.field9796[super.field9761++] = (byte) (var3 >> 16);
        super.field9796[super.field9761++] = (byte) (var3 >> 24);
    }
}
