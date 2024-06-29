import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class498 extends class703 {

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "[I")
    public static int[] field7226 = new int[25];

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public int field7214;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public int field7218;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public int field7222;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public int field7224;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "J")
    public long field7220;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)I", line = 4)
    public final int method3017(byte arg0) {
        if (arg0 != 61) {
            field7226 = null;
        }
        field7225++;
        return this.field7218;
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V", line = 15)
    public static final void method3018(int arg0) {
        class304.field4619 = (int) ((double) class191.field3229 * 34.46D);
        class710.field10000 = 200;
        field7221++;
        class304.field4619 <<= 0x2;
        int var1 = 90 / ((-arg0 - 60) / 32);
        if (class364.field5573.method268()) {
            class304.field4619 += 512;
        }
        class317.method2081(false, (byte) -94);
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V", line = 37)
    public static final void method3019(int arg0) {
        field7216++;
        if (class521.field7529 == arg0) {
            class694.method3874(false, 0);
        } else {
            class639.field8967 = class166.field2624;
            class166.field2624 = null;
            class658.method3704(-5697, 13);
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)I", line = 55)
    public final int method3020(int arg0) {
        if (arg0 != -4) {
            method3019(-86);
        }
        field7215++;
        return this.field7214;
    }

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "(I)V", line = 67)
    public static void method3021(int arg0) {
        field7226 = null;
        if (arg0 <= 121) {
            field7226 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I", line = 77)
    public final int method3022(int arg0) {
        if (arg0 <= 29) {
            method3018(107);
        }
        field7217++;
        return this.field7224;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)I", line = 89)
    public final int method3023(int arg0) {
        field7223++;
        if (arg0 >= -96) {
            this.field7214 = 35;
        }
        return this.field7222;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)J", line = 102)
    public final long method3024(boolean arg0) {
        if (arg0) {
            return -70L;
        } else {
            field7219++;
            return this.field7220;
        }
    }
}
