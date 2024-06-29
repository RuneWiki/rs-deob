import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class349 extends class212 {

    @OriginalMember(owner = "client!wq", name = "v", descriptor = "J")
    public static long field4803 = 0L;

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!wq", name = "w", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!wq", name = "y", descriptor = "I")
    public int field4806;

    @OriginalMember(owner = "client!wq", name = "A", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!wq", name = "x", descriptor = "Lkm;")
    public class120 field4805;

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "[B")
    public byte[] field4807;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)[B")
    public final byte[] method712(byte arg0) {
        ++field4808;
        if (super.field2732) {
            throw new RuntimeException();
        } else {
            if (arg0 <= 44) {
                this.field4806 = -7;
            }
            return this.field4807;
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)I")
    public final int method709(byte arg0) {
        ++field4802;
        if (arg0 != -2) {
            return -9;
        } else {
            return super.field2732 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)Z")
    public static final boolean method2176(int arg0, int arg1, int arg2) {
        ++field4804;
        if (!class264.field3373) {
            return false;
        } else {
            if (arg2 < 113) {
                method2176(-77, -70, -60);
            }
            int var3 = arg0 >> 16;
            int var4 = 65535 & arg0;
            if (class508.field7087[var3] != null && class508.field7087[var3][var4] != null) {
                class447 var5 = class508.field7087[var3][var4];
                if (arg1 == -1 && var5.field6336 == 0) {
                    for (class245 var6 = (class245) class57.field760.method3188((byte) -100); var6 != null; var6 = (class245) class57.field760.method3182((byte) -76)) {
                        if (~var6.field3094 == -3 || ~var6.field3094 == -1010 || ~var6.field3094 == -5 || var6.field3094 == 18 || var6.field3094 == 3) {
                            for (class447 var7 = class609.method3486(var6.field3097, 983030160); var7 != null; var7 = class356.method2218(var7, (byte) 85)) {
                                if (~var5.field6229 == ~var7.field6229) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class245 var8 = (class245) class57.field760.method3188((byte) -100); var8 != null; var8 = (class245) class57.field760.method3182((byte) -125)) {
                        if (var8.field3096 == arg1 && ~var5.field6229 == ~var8.field3097 && (~var8.field3094 == -3 || var8.field3094 == 1009 || ~var8.field3094 == -5 || var8.field3094 == 18 || ~var8.field3094 == -4)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }
}
