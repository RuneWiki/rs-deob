import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class592 extends class508 {

    @OriginalMember(owner = "client!qba", name = "C", descriptor = "[Leg;")
    public static class47[] field8321 = new class47[4];

    @OriginalMember(owner = "client!qba", name = "y", descriptor = "Z")
    public static boolean field8317 = true;

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
    public int field8312;

    @OriginalMember(owner = "client!qba", name = "u", descriptor = "I")
    public static int field8313;

    @OriginalMember(owner = "client!qba", name = "v", descriptor = "I")
    public int field8314;

    @OriginalMember(owner = "client!qba", name = "w", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!qba", name = "A", descriptor = "I")
    public int field8319;

    @OriginalMember(owner = "client!qba", name = "B", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!qba", name = "D", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!qba", name = "E", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!qba", name = "x", descriptor = "Ljava/lang/String;")
    public String field8316;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)V")
    public static final void method3251(int arg0, int arg1) {
        if (arg0 > 48) {
            ++field8320;
            if (~class637.field8934 != ~arg1) {
                class431.field5395 = class452.field5802 = class138.field1793[arg1];
                class227.method1359((byte) -110);
                class453.field5805 = new int[class431.field5395][class452.field5802];
                class74.field1018 = new int[4][class431.field5395 >> 3][class452.field5802 >> 3];
                class644.field9052 = new int[class431.field5395][class452.field5802];
                for (int var2 = 0; ~var2 > -5; ++var2) {
                    class154.field1991[var2] = class109.method614(class452.field5802, class431.field5395, (byte) -94);
                }
                class569.field7970 = new byte[4][class431.field5395][class452.field5802];
                class507.method2727(4, class452.field5802, class431.field5395, 0);
                class464.method2464(class32.field452, class452.field5802 >> 3, class431.field5395 >> 3, (byte) -10);
                class637.field8934 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)I")
    public final int method3252(int arg0) {
        ++field8318;
        if (arg0 != 255) {
            this.field8316 = null;
        }
        return (int) (super.field4199 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "(I)V")
    public final void method3253(int arg0) {
        ++field8323;
        super.field6874 = super.field6874 & Long.MIN_VALUE | class571.method3150(arg0 ^ 106) + 500L;
        class169.field2209.method1541(75, this);
        if (arg0 != 0) {
            this.method3257(-100);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)V")
    public static void method3254(boolean arg0) {
        if (arg0) {
            field8317 = false;
        }
        field8321 = null;
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)J")
    public final long method3255(byte arg0) {
        ++field8311;
        if (arg0 != -108) {
            method3251(125, -32);
        }
        return Long.MAX_VALUE & super.field6874;
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(B)V")
    public final void method3256(byte arg0) {
        ++field8313;
        super.field6874 |= Long.MIN_VALUE;
        if (arg0 == 11) {
            if (this.method3255((byte) -108) == 0L) {
                class670.field9432.method1541(75, this);
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "(I)I")
    public final int method3257(int arg0) {
        if (arg0 != 4) {
            method3254(false);
        }
        ++field8322;
        return (int) super.field4199;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILkp;)Ljava/lang/String;")
    public static final String method3258(int arg0, int arg1, class507 arg2) {
        ++field8315;
        if (arg0 != 15648) {
            field8321 = null;
        }
        if (!client.method3819(arg2).method2021(arg1, (byte) 91) && arg2.field6868 == null) {
            return null;
        } else if (arg2.field6830 != null && arg1 < arg2.field6830.length && arg2.field6830[arg1] != null && ~arg2.field6830[arg1].trim().length() != -1) {
            return arg2.field6830[arg1];
        } else {
            return class253.field3101 ? "Hidden-" + arg1 : null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(II)V")
    public class592(int arg0, int arg1) {
        super.field4199 = (long) arg1 | (long) arg0 << 32;
    }
}
